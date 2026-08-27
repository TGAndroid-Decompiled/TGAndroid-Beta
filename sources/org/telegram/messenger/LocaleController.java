package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.SparseArray;
import android.util.Xml;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.k41;
import org.telegram.ui.a31;
import org.xmlpull.v1.XmlPullParser;

public class LocaleController {
    static final int QUANTITY_FEW = 8;
    static final int QUANTITY_MANY = 16;
    static final int QUANTITY_ONE = 2;
    static final int QUANTITY_OTHER = 0;
    static final int QUANTITY_TWO = 4;
    static final int QUANTITY_ZERO = 1;
    public static boolean is24HourFormat = false;
    public static boolean isRTL = false;
    public static int nameDisplayOrder = 1;
    private static Boolean useImperialSystemType;
    private volatile FastDateFormat chatDate;
    private volatile FastDateFormat chatDateShort;
    private volatile FastDateFormat chatFullDate;
    private boolean checkingUpdateForCurrentRemoteLocale;
    private HashMap<String, String> currencyValues;
    private Locale currentLocale;
    private LocaleInfo currentLocaleInfo;
    private PluralRules currentPluralRules;
    private String currentSystemLocale;
    private volatile FastDateFormat formatterBannedUntil;
    private volatile FastDateFormat formatterBannedUntilThisYear;
    private volatile FastDateFormat formatterBoostExpired;
    private volatile FastDateFormat formatterConstDay;
    private volatile FastDateFormat formatterDay;
    private volatile FastDateFormat formatterDayMonth;
    private volatile FastDateFormat formatterDayWithSeconds;
    private volatile FastDateFormat formatterGiveawayCard;
    private volatile FastDateFormat formatterGiveawayMonthDay;
    private volatile FastDateFormat formatterGiveawayMonthDayYear;
    private volatile FastDateFormat formatterMonthOnly;
    private volatile FastDateFormat formatterMonthYear;
    private volatile FastDateFormat formatterScheduleDay;
    private volatile FastDateFormat formatterScheduleYear;
    private volatile FastDateFormat formatterStats;
    private volatile FastDateFormat formatterWeek;
    private volatile FastDateFormat formatterWeekLong;
    private volatile FastDateFormat formatterYear;
    private volatile FastDateFormat formatterYearMax;
    private String languageOverride;
    private boolean loadingRemoteLanguages;
    private re.a localizationExternal;
    private int localizationExternalSize;
    private volatile re.a localizationInternal;
    private re.a localizationInternalDefault;
    private volatile Locale localizationInternalLastLocale;
    private volatile boolean localizationInternalPending;
    private boolean reloadLastFile;
    private HashMap<String, String> ruTranslitChars;
    private Locale systemDefaultLocale;
    private HashMap<String, String> translitChars;
    private static HashMap<Integer, String> resourcesCacheMap = new HashMap<>();
    private static volatile LocaleController Instance = null;
    private static char[] defaultNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static char[][] otherNumbers = {new char[]{1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641}, new char[]{1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785}, new char[]{2406, 2407, 2408, 2409, 2410, 2411, 2412, 2413, 2414, 2415}, new char[]{2790, 2791, 2792, 2793, 2794, 2795, 2796, 2797, 2798, 2799}, new char[]{2662, 2663, 2664, 2665, 2666, 2667, 2668, 2669, 2670, 2671}, new char[]{2534, 2535, 2536, 2537, 2538, 2539, 2540, 2541, 2542, 2543}, new char[]{3302, 3303, 3304, 3305, 3306, 3307, 3308, 3309, 3310, 3311}, new char[]{2918, 2919, 2920, 2921, 2922, 2923, 2924, 2925, 2926, 2927}, new char[]{3430, 3431, 3432, 3433, 3434, 3435, 3436, 3437, 3438, 3439}, new char[]{3046, 3047, 3048, 3049, 3050, 3051, 3052, 3053, 3054, 3055}, new char[]{3174, 3175, 3176, 3177, 3178, 3179, 3180, 3181, 3182, 3183}, new char[]{4160, 4161, 4162, 4163, 4164, 4165, 4166, 4167, 4168, 4169}, new char[]{3872, 3873, 3874, 3875, 3876, 3877, 3878, 3879, 3880, 3881}, new char[]{6160, 6161, 6162, 6163, 6164, 6165, 6166, 6167, 6168, 6169}, new char[]{6112, 6113, 6114, 6115, 6116, 6117, 6118, 6119, 6120, 6121}, new char[]{3664, 3665, 3666, 3667, 3668, 3669, 3670, 3671, 3672, 3673}, new char[]{3792, 3793, 3794, 3795, 3796, 3797, 3798, 3799, 3800, 3801}, new char[]{43472, 43473, 43474, 43475, 43476, 43477, 43478, 43479, 43480, 43481}};
    private final FastDateFormat[] formatterScheduleSend = new FastDateFormat[18];
    private HashMap<String, PluralRules> allRules = new HashMap<>();
    private boolean changingConfiguration = false;
    public ArrayList<LocaleInfo> languages = new ArrayList<>();
    public ArrayList<LocaleInfo> unofficialLanguages = new ArrayList<>();
    public ArrayList<LocaleInfo> remoteLanguages = new ArrayList<>();
    public HashMap<String, LocaleInfo> remoteLanguagesDict = new HashMap<>();
    public HashMap<String, LocaleInfo> languagesDict = new HashMap<>();
    private ArrayList<LocaleInfo> otherLanguages = new ArrayList<>();
    private boolean patching = false;

    public static class LocaleInfo {
        public String baseLangCode;
        public int baseVersion;
        public boolean builtIn;
        public boolean isRtl;
        public String name;
        public String nameEnglish;
        public String pathToFile;
        public String pluralLangCode;
        public int serverIndex;
        public String shortName;
        public int version;

        public static LocaleInfo createWithString(String str) {
            LocaleInfo localeInfo = null;
            if (str != null && str.length() != 0) {
                String[] strArrSplit = str.split("\\|");
                if (strArrSplit.length >= 4) {
                    localeInfo = new LocaleInfo();
                    localeInfo.name = strArrSplit[0];
                    localeInfo.nameEnglish = strArrSplit[1];
                    localeInfo.shortName = strArrSplit[2].toLowerCase();
                    localeInfo.pathToFile = strArrSplit[3];
                    if (strArrSplit.length >= 5) {
                        localeInfo.version = Utilities.parseInt((CharSequence) strArrSplit[4]).intValue();
                    }
                    localeInfo.baseLangCode = strArrSplit.length >= 6 ? strArrSplit[5] : "";
                    localeInfo.pluralLangCode = strArrSplit.length >= 7 ? strArrSplit[6] : localeInfo.shortName;
                    if (strArrSplit.length >= 8) {
                        localeInfo.isRtl = Utilities.parseInt((CharSequence) strArrSplit[7]).intValue() == 1;
                    }
                    if (strArrSplit.length >= 9) {
                        localeInfo.baseVersion = Utilities.parseInt((CharSequence) strArrSplit[8]).intValue();
                    }
                    if (strArrSplit.length >= 10) {
                        localeInfo.serverIndex = Utilities.parseInt((CharSequence) strArrSplit[9]).intValue();
                    } else {
                        localeInfo.serverIndex = Integer.MAX_VALUE;
                    }
                    if (!TextUtils.isEmpty(localeInfo.baseLangCode)) {
                        localeInfo.baseLangCode = localeInfo.baseLangCode.replace("-", "_");
                    }
                }
            }
            return localeInfo;
        }

        public String getBaseLangCode() {
            String str = this.baseLangCode;
            return str == null ? "" : str.replace("_", "-");
        }

        public String getKey() {
            if (this.pathToFile != null && !isRemote() && !isUnofficial()) {
                return "local_" + this.shortName;
            }
            if (!isUnofficial()) {
                return this.shortName;
            }
            return "unofficial_" + this.shortName;
        }

        public String getLangCode() {
            return this.shortName.replace("_", "-");
        }

        public File getPathToBaseFile() {
            if (isUnofficial()) {
                return new File(ApplicationLoader.getFilesDirFixed(), a9.p.p(new StringBuilder("unofficial_base_"), this.shortName, ".xml"));
            }
            return null;
        }

        public File getPathToFile() {
            if (isRemote()) {
                return new File(ApplicationLoader.getFilesDirFixed(), a9.p.p(new StringBuilder("remote_"), this.shortName, ".xml"));
            }
            if (isUnofficial()) {
                return new File(ApplicationLoader.getFilesDirFixed(), a9.p.p(new StringBuilder("unofficial_"), this.shortName, ".xml"));
            }
            if (TextUtils.isEmpty(this.pathToFile)) {
                return null;
            }
            return new File(this.pathToFile);
        }

        public String getSaveString() {
            String str = this.baseLangCode;
            if (str == null) {
                str = "";
            }
            TextUtils.isEmpty(this.pluralLangCode);
            return this.name + "|" + this.nameEnglish + "|" + this.shortName + "|" + this.pathToFile + "|" + this.version + "|" + str + "|" + this.pluralLangCode + "|" + (this.isRtl ? 1 : 0) + "|" + this.baseVersion + "|" + this.serverIndex;
        }

        public boolean hasBaseLang() {
            return (!isUnofficial() || TextUtils.isEmpty(this.baseLangCode) || this.baseLangCode.equals(this.shortName)) ? false : true;
        }

        public boolean isBuiltIn() {
            return this.builtIn;
        }

        public boolean isLocal() {
            return (TextUtils.isEmpty(this.pathToFile) || isRemote() || isUnofficial()) ? false : true;
        }

        public boolean isRemote() {
            return "remote".equals(this.pathToFile);
        }

        public boolean isUnofficial() {
            return "unofficial".equals(this.pathToFile);
        }
    }

    public static abstract class PluralRules {
        public abstract int quantityForNumber(int i10);
    }

    public static class PluralRules_Arabic extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 4;
            }
            if (i11 < 3 || i11 > 10) {
                return (i11 < 11 || i11 > 99) ? 0 : 16;
            }
            return 8;
        }
    }

    public static class PluralRules_Balkan extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            int i12 = i10 % 10;
            if (i12 == 1 && i11 != 11) {
                return 2;
            }
            if (i12 >= 2 && i12 <= 4 && (i11 < 12 || i11 > 14)) {
                return 8;
            }
            if (i12 == 0) {
                return 16;
            }
            if (i12 < 5 || i12 > 9) {
                return (i11 < 11 || i11 > 14) ? 0 : 16;
            }
            return 16;
        }
    }

    public static class PluralRules_Breton extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 4;
            }
            if (i10 == 3) {
                return 8;
            }
            return i10 == 6 ? 16 : 0;
        }
    }

    public static class PluralRules_Czech extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 1) {
                return 2;
            }
            return (i10 < 2 || i10 > 4) ? 0 : 8;
        }
    }

    public static class PluralRules_French extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            return (i10 < 0 || i10 >= 2) ? 0 : 2;
        }
    }

    public static class PluralRules_Langi extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 0) {
                return 1;
            }
            return i10 == 1 ? 2 : 0;
        }
    }

    public static class PluralRules_Latvian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 0) {
                return 1;
            }
            return (i10 % 10 != 1 || i10 % 100 == 11) ? 0 : 2;
        }
    }

    public static class PluralRules_Lithuanian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            int i12 = i10 % 10;
            if (i12 == 1 && (i11 < 11 || i11 > 19)) {
                return 2;
            }
            if (i12 < 2 || i12 > 9) {
                return 0;
            }
            return (i11 < 11 || i11 > 19) ? 8 : 0;
        }
    }

    public static class PluralRules_Macedonian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            return (i10 % 10 != 1 || i10 == 11) ? 0 : 2;
        }
    }

    public static class PluralRules_Maltese extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 0) {
                return 8;
            }
            if (i11 < 2 || i11 > 10) {
                return (i11 < 11 || i11 > 19) ? 0 : 16;
            }
            return 8;
        }
    }

    public static class PluralRules_None extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            return 0;
        }
    }

    public static class PluralRules_One extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            return i10 == 1 ? 2 : 0;
        }
    }

    public static class PluralRules_Polish extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            int i12 = i10 % 10;
            if (i10 == 1) {
                return 2;
            }
            if (i12 >= 2 && i12 <= 4 && (i11 < 12 || i11 > 14)) {
                return 8;
            }
            if (i12 >= 0 && i12 <= 1) {
                return 16;
            }
            if (i12 < 5 || i12 > 9) {
                return (i11 < 12 || i11 > 14) ? 0 : 16;
            }
            return 16;
        }
    }

    public static class PluralRules_Romanian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            if (i10 == 1) {
                return 2;
            }
            if (i10 != 0) {
                return (i11 < 1 || i11 > 19) ? 0 : 8;
            }
            return 8;
        }
    }

    public static class PluralRules_Serbian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            int i12 = i10 % 10;
            if (i12 == 1 && i11 != 11) {
                return 2;
            }
            if (i12 < 2 || i12 > 4) {
                return 0;
            }
            return (i11 < 12 || i11 > 14) ? 8 : 0;
        }
    }

    public static class PluralRules_Slovenian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            if (i11 == 1) {
                return 2;
            }
            if (i11 == 2) {
                return 4;
            }
            return (i11 < 3 || i11 > 4) ? 0 : 8;
        }
    }

    public static class PluralRules_Tachelhit extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 < 0 || i10 > 1) {
                return (i10 < 2 || i10 > 10) ? 0 : 8;
            }
            return 2;
        }
    }

    public static class PluralRules_Two extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 1) {
                return 2;
            }
            return i10 == 2 ? 4 : 0;
        }
    }

    public static class PluralRules_Welsh extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 4;
            }
            if (i10 == 3) {
                return 8;
            }
            return i10 == 6 ? 16 : 0;
        }
    }

    public static class PluralRules_Zero extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            return (i10 == 0 || i10 == 1) ? 2 : 0;
        }
    }

    public static final class RelativeIcu {
        private RelativeIcu() {
        }

        public static String format(long j10, Locale locale) {
            RelativeDateTimeFormatter.RelativeUnit relativeUnit;
            RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(locale);
            boolean z10 = j10 > 0;
            long jMax = Math.max(1L, Math.round(Math.abs(j10) / 1000.0d));
            if (jMax < 60) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
            } else if (jMax < 3600) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MINUTES;
                jMax = Math.round(jMax / 60.0d);
            } else if (jMax < 86400) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.HOURS;
                jMax = Math.round(jMax / 3600.0d);
            } else if (jMax < 2592000) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.DAYS;
                jMax = Math.round(jMax / 86400.0d);
            } else if (jMax < 31536000) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
                jMax = Math.round(jMax / 2592000.0d);
            } else {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
                jMax = Math.round(jMax / 3.1536E7d);
            }
            return relativeDateTimeFormatter.format(jMax, z10 ? RelativeDateTimeFormatter.Direction.NEXT : RelativeDateTimeFormatter.Direction.LAST, relativeUnit);
        }
    }

    public class TimeZoneChangedReceiver extends BroadcastReceiver {
        private TimeZoneChangedReceiver() {
        }

        public void lambda$onReceive$0() {
            if (LocaleController.this.getFormatterDayMonth().getTimeZone().equals(TimeZone.getDefault())) {
                return;
            }
            LocaleController.getInstance().recreateFormatters();
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            ApplicationLoader.applicationHandler.post(new d1(this, 4));
        }
    }

    public LocaleController() {
        LocaleInfo languageFromDict;
        boolean z10 = false;
        re.a aVar = re.a.f46919b;
        this.localizationInternal = aVar;
        this.localizationExternal = aVar;
        addRules(new String[]{"bem", "brx", "da", "de", "el", "en", "eo", "es", "et", "fi", "fo", "gl", "he", "iw", "it", "nb", "nl", "nn", "no", "sv", "af", "bg", "bn", "ca", "eu", "fur", "fy", "gu", "ha", "is", "ku", "lb", "ml", "mr", "nah", "ne", "om", "or", "pa", "pap", "ps", "so", "sq", "sw", "ta", "te", "tk", "ur", "zu", "mn", "gsw", "chr", "rm", "pt", "an", "ast"}, new PluralRules_One());
        addRules(new String[]{"cs", "sk"}, new PluralRules_Czech());
        addRules(new String[]{"ff", "fr", "kab"}, new PluralRules_French());
        addRules(new String[]{"ru", "uk", "be"}, new PluralRules_Balkan());
        addRules(new String[]{"sr", "hr", "bs", "sh"}, new PluralRules_Serbian());
        addRules(new String[]{"lv"}, new PluralRules_Latvian());
        addRules(new String[]{"lt"}, new PluralRules_Lithuanian());
        addRules(new String[]{"pl"}, new PluralRules_Polish());
        addRules(new String[]{"ro", "mo"}, new PluralRules_Romanian());
        addRules(new String[]{"sl"}, new PluralRules_Slovenian());
        addRules(new String[]{"ar"}, new PluralRules_Arabic());
        addRules(new String[]{"mk"}, new PluralRules_Macedonian());
        addRules(new String[]{"cy"}, new PluralRules_Welsh());
        addRules(new String[]{"br"}, new PluralRules_Breton());
        addRules(new String[]{"lag"}, new PluralRules_Langi());
        addRules(new String[]{"shi"}, new PluralRules_Tachelhit());
        addRules(new String[]{"mt"}, new PluralRules_Maltese());
        addRules(new String[]{"ga", "se", "sma", "smi", "smj", "smn", "sms"}, new PluralRules_Two());
        addRules(new String[]{"ak", "am", "bh", "fil", "tl", "guw", "hi", "ln", "mg", "nso", "ti", "wa"}, new PluralRules_Zero());
        addRules(new String[]{"az", "bm", "fa", "ig", "hu", "ja", "kde", "kea", "ko", "my", "ses", "sg", "to", "tr", "vi", "wo", "yo", "zh", "bo", "dz", "id", "jv", "jw", "ka", "km", "kn", "ms", "th", "in"}, new PluralRules_None());
        LocaleInfo localeInfo = new LocaleInfo();
        localeInfo.name = "English";
        localeInfo.nameEnglish = "English";
        localeInfo.pluralLangCode = "en";
        localeInfo.shortName = "en";
        localeInfo.pathToFile = null;
        localeInfo.builtIn = true;
        this.languages.add(localeInfo);
        this.languagesDict.put(localeInfo.shortName, localeInfo);
        LocaleInfo localeInfo2 = new LocaleInfo();
        localeInfo2.name = "Italiano";
        localeInfo2.nameEnglish = "Italian";
        localeInfo2.pluralLangCode = "it";
        localeInfo2.shortName = "it";
        localeInfo2.pathToFile = null;
        localeInfo2.builtIn = true;
        this.languages.add(localeInfo2);
        this.languagesDict.put(localeInfo2.shortName, localeInfo2);
        LocaleInfo localeInfo3 = new LocaleInfo();
        localeInfo3.name = "Español";
        localeInfo3.nameEnglish = "Spanish";
        localeInfo3.pluralLangCode = "es";
        localeInfo3.shortName = "es";
        localeInfo3.builtIn = true;
        this.languages.add(localeInfo3);
        this.languagesDict.put(localeInfo3.shortName, localeInfo3);
        LocaleInfo localeInfo4 = new LocaleInfo();
        localeInfo4.name = "Deutsch";
        localeInfo4.nameEnglish = "German";
        localeInfo4.pluralLangCode = "de";
        localeInfo4.shortName = "de";
        localeInfo4.pathToFile = null;
        localeInfo4.builtIn = true;
        this.languages.add(localeInfo4);
        this.languagesDict.put(localeInfo4.shortName, localeInfo4);
        LocaleInfo localeInfo5 = new LocaleInfo();
        localeInfo5.name = "Nederlands";
        localeInfo5.nameEnglish = "Dutch";
        localeInfo5.pluralLangCode = "nl";
        localeInfo5.shortName = "nl";
        localeInfo5.pathToFile = null;
        localeInfo5.builtIn = true;
        this.languages.add(localeInfo5);
        this.languagesDict.put(localeInfo5.shortName, localeInfo5);
        LocaleInfo localeInfo6 = new LocaleInfo();
        localeInfo6.name = "العربية";
        localeInfo6.nameEnglish = "Arabic";
        localeInfo6.pluralLangCode = "ar";
        localeInfo6.shortName = "ar";
        localeInfo6.pathToFile = null;
        localeInfo6.builtIn = true;
        localeInfo6.isRtl = true;
        this.languages.add(localeInfo6);
        this.languagesDict.put(localeInfo6.shortName, localeInfo6);
        LocaleInfo localeInfo7 = new LocaleInfo();
        localeInfo7.name = "Português (Brasil)";
        localeInfo7.nameEnglish = "Portuguese (Brazil)";
        localeInfo7.pluralLangCode = "pt_br";
        localeInfo7.shortName = "pt_br";
        localeInfo7.pathToFile = null;
        localeInfo7.builtIn = true;
        this.languages.add(localeInfo7);
        this.languagesDict.put(localeInfo7.shortName, localeInfo7);
        LocaleInfo localeInfo8 = new LocaleInfo();
        localeInfo8.name = "한국어";
        localeInfo8.nameEnglish = "Korean";
        localeInfo8.pluralLangCode = "ko";
        localeInfo8.shortName = "ko";
        localeInfo8.pathToFile = null;
        localeInfo8.builtIn = true;
        this.languages.add(localeInfo8);
        this.languagesDict.put(localeInfo8.shortName, localeInfo8);
        LocaleInfo localeInfo9 = new LocaleInfo();
        localeInfo9.name = "Українська";
        localeInfo9.nameEnglish = "Ukrainian";
        localeInfo9.pluralLangCode = "uk";
        localeInfo9.shortName = "uk";
        localeInfo9.pathToFile = null;
        localeInfo9.builtIn = true;
        this.languages.add(localeInfo9);
        this.languagesDict.put(localeInfo9.shortName, localeInfo9);
        LocaleInfo localeInfo10 = new LocaleInfo();
        localeInfo10.name = "Русский";
        localeInfo10.nameEnglish = "Russian";
        localeInfo10.pluralLangCode = "ru";
        localeInfo10.shortName = "ru";
        localeInfo10.pathToFile = null;
        localeInfo10.builtIn = true;
        this.languages.add(localeInfo10);
        this.languagesDict.put(localeInfo10.shortName, localeInfo10);
        loadOtherLanguages();
        if (this.remoteLanguages.isEmpty()) {
            final int i10 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) {

                public final LocaleController f21127b;

                {
                    this.f21127b = this;
                }

                @Override
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.f21127b.lambda$new$0();
                            break;
                        default:
                            this.f21127b.lambda$new$1();
                            break;
                    }
                }
            });
        }
        for (int i11 = 0; i11 < this.otherLanguages.size(); i11++) {
            LocaleInfo localeInfo11 = this.otherLanguages.get(i11);
            this.languages.add(localeInfo11);
            this.languagesDict.put(localeInfo11.getKey(), localeInfo11);
        }
        for (int i12 = 0; i12 < this.remoteLanguages.size(); i12++) {
            LocaleInfo localeInfo12 = this.remoteLanguages.get(i12);
            LocaleInfo languageFromDict2 = getLanguageFromDict(localeInfo12.getKey());
            if (languageFromDict2 != null) {
                languageFromDict2.pathToFile = localeInfo12.pathToFile;
                languageFromDict2.version = localeInfo12.version;
                languageFromDict2.baseVersion = localeInfo12.baseVersion;
                languageFromDict2.serverIndex = localeInfo12.serverIndex;
                this.remoteLanguages.set(i12, languageFromDict2);
            } else {
                this.languages.add(localeInfo12);
                this.languagesDict.put(localeInfo12.getKey(), localeInfo12);
            }
        }
        for (int i13 = 0; i13 < this.unofficialLanguages.size(); i13++) {
            LocaleInfo localeInfo13 = this.unofficialLanguages.get(i13);
            LocaleInfo languageFromDict3 = getLanguageFromDict(localeInfo13.getKey());
            if (languageFromDict3 != null) {
                languageFromDict3.pathToFile = localeInfo13.pathToFile;
                languageFromDict3.version = localeInfo13.version;
                languageFromDict3.baseVersion = localeInfo13.baseVersion;
                languageFromDict3.serverIndex = localeInfo13.serverIndex;
                this.unofficialLanguages.set(i13, languageFromDict3);
            } else {
                this.languagesDict.put(localeInfo13.getKey(), localeInfo13);
            }
        }
        this.systemDefaultLocale = Locale.getDefault();
        is24HourFormat = DateFormat.is24HourFormat(ApplicationLoader.applicationContext);
        try {
            String string = MessagesController.getGlobalMainSettings().getString("language", null);
            if (string != null) {
                languageFromDict = getLanguageFromDict(string);
                if (languageFromDict != null) {
                    z10 = true;
                }
            } else {
                languageFromDict = null;
            }
            if (languageFromDict == null && this.systemDefaultLocale.getLanguage() != null) {
                languageFromDict = getLanguageFromDict(this.systemDefaultLocale.getLanguage());
            }
            if (languageFromDict == null && (languageFromDict = getLanguageFromDict(getLocaleString(this.systemDefaultLocale))) == null) {
                languageFromDict = getLanguageFromDict("en");
            }
            applyLanguage(languageFromDict, z10, true, UserConfig.selectedAccount);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationLoader.applicationContext.registerReceiver(new TimeZoneChangedReceiver(), intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(new TimeZoneChangedReceiver(), intentFilter);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        final int i14 = 1;
        AndroidUtilities.runOnUIThread(new Runnable(this) {

            public final LocaleController f21127b;

            {
                this.f21127b = this;
            }

            @Override
            public final void run() {
                switch (i14) {
                    case 0:
                        this.f21127b.lambda$new$0();
                        break;
                    default:
                        this.f21127b.lambda$new$1();
                        break;
                }
            }
        });
    }

    public static String addNbsp(String str) {
        return str.replace(' ', (char) 160);
    }

    private void addRules(String[] strArr, PluralRules pluralRules) {
        for (String str : strArr) {
            this.allRules.put(str, pluralRules);
        }
    }

    private int applyRemoteLanguage(final LocaleInfo localeInfo, String str, boolean z10, final int i10, Runnable runnable) {
        final LocaleInfo localeInfo2 = localeInfo;
        if (localeInfo2 != null && (localeInfo2.isRemote() || localeInfo2.isUnofficial())) {
            StringBuilder sb2 = new StringBuilder("applyRemoteLanguage ");
            sb2.append(str);
            sb2.append(" force=");
            sb2.append(z10);
            sb2.append(" currentAccount=");
            i0.a.v(i10, sb2);
            int[] iArr = {0};
            final f0 f0Var = new f0(new int[]{0}, iArr, runnable, 24);
            if (z10) {
                patched(localeInfo2.shortName);
            }
            if (localeInfo2.hasBaseLang() && (str == null || str.equals(localeInfo2.baseLangCode))) {
                if (localeInfo2.baseVersion == 0 || z10) {
                    FileLog.d("applyRemoteLanguage getLangPack of base");
                    TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack = new TLRPC.TL_langpack_getLangPack();
                    tL_langpack_getLangPack.lang_code = localeInfo.getBaseLangCode();
                    iArr[0] = iArr[0] + 1;
                    final int i11 = 1;
                    localeInfo2 = localeInfo;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack, new RequestDelegate(this) {

                        public final LocaleController f21038b;

                        {
                            this.f21038b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i11) {
                                case 0:
                                    this.f21038b.lambda$applyRemoteLanguage$15(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                                case 1:
                                    this.f21038b.lambda$applyRemoteLanguage$17(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                                case 2:
                                    this.f21038b.lambda$applyRemoteLanguage$19(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                                default:
                                    this.f21038b.lambda$applyRemoteLanguage$21(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                            }
                        }
                    }, 8);
                } else {
                    if (localeInfo2.hasBaseLang()) {
                        FileLog.d("applyRemoteLanguage getDifference of base");
                        TLRPC.TL_langpack_getDifference tL_langpack_getDifference = new TLRPC.TL_langpack_getDifference();
                        tL_langpack_getDifference.from_version = localeInfo2.baseVersion;
                        tL_langpack_getDifference.lang_code = localeInfo2.getBaseLangCode();
                        tL_langpack_getDifference.lang_pack = "";
                        iArr[0] = iArr[0] + 1;
                        final int i12 = 0;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference, new RequestDelegate(this) {

                            public final LocaleController f21038b;

                            {
                                this.f21038b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (i12) {
                                    case 0:
                                        this.f21038b.lambda$applyRemoteLanguage$15(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        break;
                                    case 1:
                                        this.f21038b.lambda$applyRemoteLanguage$17(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        break;
                                    case 2:
                                        this.f21038b.lambda$applyRemoteLanguage$19(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        break;
                                    default:
                                        this.f21038b.lambda$applyRemoteLanguage$21(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        break;
                                }
                            }
                        }, 8);
                    }
                    localeInfo2 = localeInfo;
                }
            }
            if (str == null || str.equals(localeInfo2.shortName)) {
                if (localeInfo2.version != 0 && !z10) {
                    FileLog.d("applyRemoteLanguage getDifference");
                    TLRPC.TL_langpack_getDifference tL_langpack_getDifference2 = new TLRPC.TL_langpack_getDifference();
                    tL_langpack_getDifference2.from_version = localeInfo2.version;
                    tL_langpack_getDifference2.lang_code = localeInfo2.getLangCode();
                    tL_langpack_getDifference2.lang_pack = "";
                    iArr[0] = iArr[0] + 1;
                    final int i13 = 2;
                    return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference2, new RequestDelegate(this) {

                        public final LocaleController f21038b;

                        {
                            this.f21038b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i13) {
                                case 0:
                                    this.f21038b.lambda$applyRemoteLanguage$15(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                                case 1:
                                    this.f21038b.lambda$applyRemoteLanguage$17(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                                case 2:
                                    this.f21038b.lambda$applyRemoteLanguage$19(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                                default:
                                    this.f21038b.lambda$applyRemoteLanguage$21(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    break;
                            }
                        }
                    }, 8);
                }
                for (int i14 = 0; i14 < 4; i14++) {
                    ConnectionsManager.setLangCode(localeInfo.getLangCode());
                }
                FileLog.d("applyRemoteLanguage getLangPack");
                TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack2 = new TLRPC.TL_langpack_getLangPack();
                tL_langpack_getLangPack2.lang_code = localeInfo.getLangCode();
                iArr[0] = iArr[0] + 1;
                final int i15 = 3;
                return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack2, new RequestDelegate(this) {

                    public final LocaleController f21038b;

                    {
                        this.f21038b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i15) {
                            case 0:
                                this.f21038b.lambda$applyRemoteLanguage$15(localeInfo, i10, f0Var, tLObject, tL_error);
                                break;
                            case 1:
                                this.f21038b.lambda$applyRemoteLanguage$17(localeInfo, i10, f0Var, tLObject, tL_error);
                                break;
                            case 2:
                                this.f21038b.lambda$applyRemoteLanguage$19(localeInfo, i10, f0Var, tLObject, tL_error);
                                break;
                            default:
                                this.f21038b.lambda$applyRemoteLanguage$21(localeInfo, i10, f0Var, tLObject, tL_error);
                                break;
                        }
                    }
                }, 8);
            }
        }
        return 0;
    }

    public static CharSequence bold(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            ((Spannable) charSequence).setSpan(new k41(AndroidUtilities.bold()), 0, charSequence.length(), 33);
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, charSequence.length(), 33);
        return spannableStringBuilder;
    }

    private void checkLocalizationInternal() {
        if (!Objects.equals(this.localizationInternalLastLocale, this.currentLocale) || this.localizationInternal == null || this.localizationInternalPending) {
            this.localizationInternalPending = true;
            synchronized (this) {
                try {
                    Locale locale = this.currentLocale;
                    if (!Objects.equals(this.localizationInternalLastLocale, locale) || this.localizationInternal == null) {
                        if (this.localizationInternalDefault == null) {
                            n2.b0 b0Var = new n2.b0(17);
                            Context context = ApplicationLoader.applicationContext;
                            int i10 = R.raw.localization_en;
                            try {
                                if (((SparseArray) b0Var.f18130b) == null) {
                                    b0Var.f18130b = new SparseArray();
                                }
                                re.a.a(context, i10, (SparseArray) b0Var.f18130b);
                            } catch (Exception unused) {
                            }
                            this.localizationInternalDefault = new re.a(b0Var);
                        }
                        int iA = qe.a.a(locale);
                        if (iA == 0 || iA == R.raw.localization_en) {
                            this.localizationInternal = this.localizationInternalDefault;
                        } else {
                            n2.b0 b0Var2 = new n2.b0(17);
                            re.a aVar = this.localizationInternalDefault;
                            if (((SparseArray) b0Var2.f18130b) == null) {
                                b0Var2.f18130b = aVar.f46920a.clone();
                            } else {
                                SparseArray sparseArray = aVar.f46920a;
                                int size = sparseArray.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    ((SparseArray) b0Var2.f18130b).put(sparseArray.keyAt(i11), (String) sparseArray.valueAt(i11));
                                }
                            }
                            Context context2 = ApplicationLoader.applicationContext;
                            try {
                                if (((SparseArray) b0Var2.f18130b) == null) {
                                    b0Var2.f18130b = new SparseArray();
                                }
                                re.a.a(context2, iA, (SparseArray) b0Var2.f18130b);
                            } catch (Exception unused2) {
                            }
                            this.localizationInternal = new re.a(b0Var2);
                        }
                        this.localizationInternalLastLocale = locale;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.localizationInternalPending = false;
        }
    }

    private FastDateFormat createFormatter(Locale locale, String str, String str2) {
        if (str == null || str.length() == 0) {
            str = str2;
        }
        try {
            return FastDateFormat.getInstance(str, locale);
        } catch (Exception unused) {
            return FastDateFormat.getInstance(str2, locale);
        }
    }

    public static void ensureImperialSystemInit() {
        if (useImperialSystemType != null) {
            return;
        }
        int i10 = SharedConfig.distanceSystemType;
        boolean z10 = true;
        if (i10 != 0) {
            useImperialSystemType = Boolean.valueOf(i10 == 2);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                if (!"US".equals(upperCase) && !"GB".equals(upperCase) && !"MM".equals(upperCase) && !"LR".equals(upperCase)) {
                    z10 = false;
                }
                useImperialSystemType = Boolean.valueOf(z10);
            }
        } catch (Exception e9) {
            useImperialSystemType = Boolean.FALSE;
            FileLog.e(e9);
        }
    }

    private String escapeString(String str) {
        return str.contains("[CDATA") ? str : str.replace("<", "&lt;").replace(">", "&gt;").replace("& ", "&amp; ");
    }

    public static String fixNumbers(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        int length = sb2.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = sb2.charAt(i10);
            if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.' && cCharAt != ',') {
                int length2 = 0;
                while (length2 < otherNumbers.length) {
                    int i11 = 0;
                    while (true) {
                        char[] cArr = otherNumbers[length2];
                        if (i11 >= cArr.length) {
                            break;
                        }
                        if (cCharAt == cArr[i11]) {
                            sb2.setCharAt(i10, defaultNumbers[i11]);
                            length2 = otherNumbers.length;
                            break;
                        }
                        i11++;
                    }
                    length2++;
                }
            }
        }
        return sb2.toString();
    }

    public static String formatCallDuration(int i10) {
        if (i10 <= 3600) {
            return i10 > 60 ? formatPluralString("Minutes", i10 / 60, new Object[0]) : formatPluralString("Seconds", i10, new Object[0]);
        }
        String pluralString = formatPluralString("Hours", i10 / 3600, new Object[0]);
        int i11 = (i10 % 3600) / 60;
        if (i11 <= 0) {
            return pluralString;
        }
        StringBuilder sbF = s3.c.f(pluralString, ", ");
        sbF.append(formatPluralString("Minutes", i11, new Object[0]));
        return sbF.toString();
    }

    public static String formatDate(long j10) {
        return formatDate(j10, false);
    }

    public static String formatDateAudio(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return z10 ? formatString(R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatDateCallLog(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return getInstance().getFormatterDay().format(new Date(j11));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.formatDateAtTime, getInstance().getChatDateShort().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.formatDateAtTime, getInstance().getChatFullDate().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatDateChat(long j10) {
        return formatDateChat(j10, false);
    }

    public static String formatDateForBan(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            return i10 == calendar.get(1) ? getInstance().getFormatterBannedUntilThisYear().format(new Date(j11)) : getInstance().getFormatterBannedUntil().format(new Date(j11));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatDateOnline(long j10, boolean[] zArr) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            int i12 = calendar.get(11);
            calendar.setTimeInMillis(j11);
            int i13 = calendar.get(6);
            int i14 = calendar.get(1);
            int i15 = calendar.get(11);
            if (i13 == i10 && i11 == i14) {
                return formatString(R.string.LastSeenFormatted, formatString("TodayAtFormatted", R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j11))));
            }
            if (i13 + 1 != i10 || i11 != i14) {
                if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                    return formatString("LastSeenDateFormatted", R.string.LastSeenDateFormatted, formatString("formatDateAtTime", R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))));
                }
                return formatString("LastSeenDateFormatted", R.string.LastSeenDateFormatted, formatString("formatDateAtTime", R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))));
            }
            if (zArr == null) {
                return formatString(R.string.LastSeenFormatted, formatString("YesterdayAtFormatted", R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11))));
            }
            zArr[0] = true;
            return (i12 > 6 || i15 <= 18 || !is24HourFormat) ? formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.LastSeenFormatted, getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatDateTime(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13 && z10) {
                return formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13 && z10) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.formatDateAtTime, getInstance().getChatDate().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.formatDateAtTime, getInstance().getChatFullDate().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatDistance(float f10, int i10) {
        return formatDistance(f10, i10, null);
    }

    public static String formatDuration(int i10) {
        if (i10 <= 0) {
            return formatPluralString("Seconds", 0, new Object[0]);
        }
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            sb2.append(formatPluralString("Hours", i11, new Object[0]));
        }
        if (i12 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(formatPluralString("Minutes", i12, new Object[0]));
        }
        if (i13 > 0) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(formatPluralString("Seconds", i13, new Object[0]));
        }
        return sb2.toString();
    }

    public static String formatEntityFormattedDate(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        return formatEntityFormattedDate(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), false);
    }

    private static String formatEntityFormattedDateRelative(long j10, long j11, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? RelativeIcu.format(j10 - j11, locale) : DateUtils.getRelativeTimeSpanString(j10, j11, 1000L, 262144).toString();
    }

    public static String formatImportedDate(long j10) {
        try {
            Date date = new Date(j10 * 1000);
            return String.format("%1$s, %2$s", getInstance().getFormatterYear().format(date), getInstance().getFormatterDay().format(date));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatJoined(long j10) {
        long j11 = j10 * 1000;
        try {
            return formatString(R.string.ChannelOtherSubscriberJoined, Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatLocationLeftTime(int i10) {
        int i11 = (i10 / 60) / 60;
        int i12 = i10 - (i11 * 3600);
        int i13 = i12 / 60;
        int i14 = i12 - (i13 * 60);
        if (i11 != 0) {
            return String.format("%dh", Integer.valueOf(i11 + (i13 > 30 ? 1 : 0)));
        }
        if (i13 != 0) {
            return String.format("%d", Integer.valueOf(i13 + (i14 > 30 ? 1 : 0)));
        }
        return String.format("%d", Integer.valueOf(i14));
    }

    public static String formatLocationUpdateDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                int currentTime = ((int) (((long) ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime()) - (j11 / 1000))) / 60;
                if (currentTime < 1) {
                    return getString(R.string.LocationUpdatedJustNow);
                }
                return currentTime < 60 ? formatPluralString("UpdatedMinutes", currentTime, new Object[0]) : formatString(R.string.LocationUpdatedFormatted, formatString("TodayAtFormatted", R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j11))));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.LocationUpdatedFormatted, formatString("YesterdayAtFormatted", R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11))));
            }
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return formatString(R.string.LocationUpdatedFormatted, formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))));
            }
            return formatString(R.string.LocationUpdatedFormatted, formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatNumber(long j10, char c10) {
        if (j10 < 0) {
            return i0.a.m(-j10, c10, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j10)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c10);
        }
        return sb2.toString();
    }

    public static String formatNumberWithMillion(long j10, char c10) {
        return j10 < 1000000 ? formatNumber(j10, c10) : AndroidUtilities.formatWholeNumber((int) j10, 1000000);
    }

    public static CharSequence formatPluralSpannable(String str, int i10, CharSequence... charSequenceArr) {
        if (str == null || str.length() == 0 || getInstance().currentPluralRules == null) {
            return s3.c.e("LOC_ERR:", str);
        }
        String strW = a9.p.w(str, "_", getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10)));
        int localizedStringByName = getLocalizedStringByName(strW);
        int localizedStringByName2 = getLocalizedStringByName(str.concat("_other"));
        Object[] objArr = new Object[charSequenceArr.length + 1];
        objArr[0] = Integer.valueOf(i10);
        System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
        return formatSpannable(strW, str.concat("_other"), localizedStringByName, localizedStringByName2, objArr);
    }

    public static String formatPluralString(String str, int i10, Object... objArr) {
        if (str == null || str.length() == 0 || getInstance().currentPluralRules == null) {
            return s3.c.e("LOC_ERR:", str);
        }
        String strW = a9.p.w(str, "_", getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10)));
        int localizedStringByName = getLocalizedStringByName(strW);
        int localizedStringByName2 = getLocalizedStringByName(str.concat("_other"));
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = Integer.valueOf(i10);
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return formatString(strW, str.concat("_other"), localizedStringByName, localizedStringByName2, objArr2);
    }

    public static String formatPluralStringComma(String str, int i10) {
        return formatPluralStringComma(str, i10, ',');
    }

    public static String formatPluralStringSpaced(String str, int i10) {
        return formatPluralStringComma(str, i10, ' ');
    }

    public static String formatPmEditedDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmEditedTodayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmEditedYesterdayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.PmEditedDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.PmEditedDateTimeAt, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatPmFwdDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmFwdOriginalTodayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmFwdOriginalYesterdayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.PmFwdOriginalDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.PmFwdOriginalDateTimeAt, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatPmSeenDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmReadTodayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmReadYesterdayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.PmReadDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.PmReadDateTimeAt, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatPmSentDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmSentTodayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmSentYesterdayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.PmSentDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.PmSentDateTimeAt, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatPollEndTime(int i10, boolean z10) {
        return formatString(z10 ? R.string.PollResultsIn : R.string.PollEndsIn, i10 < 86400 ? formatShortDuration(i10) : formatPluralString("Days", i10 / 86400, new Object[0]));
    }

    public static String formatRelativeDate(long j10) {
        try {
            long j11 = j10 / 60;
            long j12 = j11 / 60;
            long j13 = j12 / 24;
            long j14 = j13 / 30;
            long j15 = j13 / 365;
            if (j15 >= 1) {
                return j15 == 1 ? getString(R.string.YearAgo) : formatPluralStringComma("YearsAgo", (int) j15);
            }
            if (j14 >= 1) {
                return j14 == 1 ? getString(R.string.MonthAgo) : formatPluralStringComma("MonthsAgo", (int) j14);
            }
            if (j13 >= 1) {
                return j13 == 1 ? getString(R.string.DayAgo) : formatPluralStringComma("DaysAgo", (int) j13);
            }
            if (j12 >= 1) {
                return j12 == 1 ? getString(R.string.HourAgo) : formatPluralStringComma("HoursAgo", (int) j12);
            }
            if (j11 >= 1) {
                return j11 == 1 ? getString(R.string.MinuteAgo) : formatPluralStringComma("MinutesAgo", (int) j11);
            }
            return getString(R.string.LessMinuteAgo);
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatSectionDate(long j10) {
        return formatYearMont(j10, false);
    }

    public static String formatSeenDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatShortDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return getString(R.string.ShortNow);
            }
            if (j12 < 3600000) {
                return formatPluralString("ShortMinutesAgo", (int) (j12 / 60000), new Object[0]);
            }
            if (i12 == i10 && i11 == i13) {
                return j12 < 43200000 ? formatPluralString("ShortHoursAgo", (int) (j12 / 3600000), new Object[0]) : getString(R.string.ShortToday);
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return getString(R.string.ShortYesterday);
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? getInstance().getFormatterDayMonth().format(new Date(j11)) : formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatShortDateTime(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) < 31536000000L) {
                return getInstance().getFormatterScheduleDay().format(new Date(j11)) + ", " + getInstance().getFormatterDay().format(new Date(j11));
            }
            return getInstance().getFormatterScheduleYear().format(new Date(j11)) + ", " + getInstance().getFormatterDay().format(new Date(j11));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatShortDuration(int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(":");
            }
            sb2.append(i11 >= 10 ? "" : "0");
            sb2.append(i11);
        }
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        sb2.append(i12 >= 10 ? "" : "0");
        sb2.append(i12);
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        sb2.append(i13 >= 10 ? "" : "0");
        sb2.append(i13);
        return sb2.toString();
    }

    public static String formatShortDuration2(int i10) {
        int i11 = i10 / 60;
        int i12 = i10 / 3600;
        if (i12 <= 0) {
            return formatPluralString("ShortMinutesAgo", i11, new Object[0]);
        }
        return formatPluralString("ShortHoursAgo", i12, new Object[0]) + " " + formatPluralString("ShortMinutesAgo", i11 % 60, new Object[0]);
    }

    public static String formatShortNumber(int i10, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = i10 / 1000;
            if (i12 <= 0) {
                break;
            }
            sb2.append("K");
            i11 = (i10 % 1000) / 100;
            i10 = i12;
        }
        if (iArr != null) {
            double d = (((double) i11) / 10.0d) + ((double) i10);
            for (int i13 = 0; i13 < sb2.length(); i13++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i11 == 0 || sb2.length() <= 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return s3.c.d(i10, "M");
            }
            Locale locale2 = Locale.US;
            return s3.c.d(i10, sb2.toString());
        }
        if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return i10 + "." + i11 + "M";
        }
        Locale locale4 = Locale.US;
        return i10 + "." + i11 + sb2.toString();
    }

    public static String formatSmallDateChat(long j10) {
        return formatSmallDateChat(j10, false);
    }

    public static CharSequence formatSpannable(int i10, Object... objArr) {
        String str = resourcesCacheMap.get(Integer.valueOf(i10));
        if (str == null) {
            HashMap<Integer, String> map = resourcesCacheMap;
            Integer numValueOf = Integer.valueOf(i10);
            String resourceEntryName = ApplicationLoader.applicationContext.getResources().getResourceEntryName(i10);
            map.put(numValueOf, resourceEntryName);
            str = resourceEntryName;
        }
        return formatSpannable(str, i10, objArr);
    }

    public static String formatStartsTime(long j10, int i10) {
        return formatStartsTime(j10, i10, true);
    }

    public static String formatStatusExpireDateTime(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? getInstance().getFormatterScheduleDay().format(new Date(j11)) : getInstance().getChatFullDate().format(new Date(j11));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatStoryDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j12 = timeInMillis - j11;
            if (j12 < 60000) {
                return getString(R.string.RightNow);
            }
            if (j12 < 3600000) {
                int i14 = (int) (j12 / 60000);
                return formatPluralString("MinutesAgo", i14, Integer.valueOf(i14));
            }
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatString(int i10, Object... objArr) {
        String str = resourcesCacheMap.get(Integer.valueOf(i10));
        if (str == null) {
            HashMap<Integer, String> map = resourcesCacheMap;
            Integer numValueOf = Integer.valueOf(i10);
            String resourceEntryName = ApplicationLoader.applicationContext.getResources().getResourceEntryName(i10);
            map.put(numValueOf, resourceEntryName);
            str = resourceEntryName;
        }
        return formatString(str, i10, objArr);
    }

    public static String formatStringSimple(String str, Object... objArr) {
        try {
            return getInstance().currentLocale != null ? String.format(getInstance().currentLocale, str, objArr) : String.format(str, objArr);
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR: " + str;
        }
    }

    public static String formatTTLString(int i10) {
        if (i10 < 60) {
            return formatPluralString("Seconds", i10, new Object[0]);
        }
        if (i10 < 3600) {
            return formatPluralString("Minutes", i10 / 60, new Object[0]);
        }
        if (i10 < 86400) {
            return formatPluralString("Hours", (i10 / 60) / 60, new Object[0]);
        }
        if (i10 < 604800) {
            return formatPluralString("Days", ((i10 / 60) / 60) / 24, new Object[0]);
        }
        if (i10 >= 2678400) {
            return formatPluralString("Months", (((i10 / 60) / 60) / 24) / 30, new Object[0]);
        }
        int i11 = ((i10 / 60) / 60) / 24;
        return i10 % 7 == 0 ? formatPluralString("Weeks", i11 / 7, new Object[0]) : a9.p.w(formatPluralString("Weeks", i11 / 7, new Object[0]), " ", formatPluralString("Days", i11 % 7, new Object[0]));
    }

    public static String formatTodoCompletedDate(long j10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodoCompletedTodayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.TodoCompletedYesterdayAt, getInstance().getFormatterDay().format(new Date(j11)));
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? formatString(R.string.TodoCompletedDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11))) : formatString(R.string.TodoCompletedDateTimeAt, getInstance().getFormatterYear().format(new Date(j11)), getInstance().getFormatterDay().format(new Date(j11)));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatUserStatus(int i10, TLRPC.User user) {
        return formatUserStatus(i10, user, null);
    }

    public static String formatYearMont(long j10, boolean z10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(1);
            int i12 = calendar.get(2);
            String[] strArr = {getString(R.string.January), getString(R.string.February), getString(R.string.March), getString(R.string.April), getString(R.string.May), getString(R.string.June), getString(R.string.July), getString(R.string.August), getString(R.string.September), getString(R.string.October), getString(R.string.November), getString(R.string.December)};
            if (i10 == i11 && !z10) {
                return strArr[i12];
            }
            return strArr[i12] + " " + i11;
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String formatYearMonthDay(long j10, boolean z10) {
        long j11 = 1000 * j10;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(1);
            int i12 = calendar.get(2);
            int i13 = calendar.get(5);
            String[] strArr = {getString(R.string.January), getString(R.string.February), getString(R.string.March), getString(R.string.April), getString(R.string.May), getString(R.string.June), getString(R.string.July), getString(R.string.August), getString(R.string.September), getString(R.string.October), getString(R.string.November), getString(R.string.December)};
            if (i10 == i11 && !z10) {
                return strArr[i12] + " " + i13;
            }
            return strArr[i12] + " " + i13 + ", " + i11;
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    public static String getCountryName(String str) {
        return getCountryName(str, R.string.Fragment);
    }

    public static CharSequence getCountryWithFlag(String str, int i10) {
        return getCountryWithFlag(str, i10, R.string.Fragment);
    }

    public static int getCurrencyExpDivider(String str) {
        str.getClass();
        switch (str) {
            case "BHD":
            case "IQD":
            case "JOD":
            case "KWD":
            case "LYD":
            case "OMR":
            case "TND":
                return 1000;
            case "BIF":
            case "BYR":
            case "CLP":
            case "CVE":
            case "DJF":
            case "GNF":
            case "ISK":
            case "JPY":
            case "KMF":
            case "KRW":
            case "MGA":
            case "PYG":
            case "RWF":
            case "UGX":
            case "UYI":
            case "VND":
            case "VUV":
            case "XAF":
            case "XOF":
            case "XPF":
                return 1;
            case "CLF":
                return 10000;
            case "MRO":
                return 10;
            default:
                return 100;
        }
    }

    public static String getCurrentLanguageName() {
        LocaleInfo localeInfo = getInstance().currentLocaleInfo;
        return (localeInfo == null || TextUtils.isEmpty(localeInfo.name)) ? getString("LanguageName", R.string.LanguageName) : localeInfo.name;
    }

    public static LocaleController getInstance() {
        LocaleController localeController;
        LocaleController localeController2 = Instance;
        if (localeController2 != null) {
            return localeController2;
        }
        synchronized (LocaleController.class) {
            try {
                localeController = Instance;
                if (localeController == null) {
                    localeController = new LocaleController();
                    Instance = localeController;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return localeController;
    }

    public static String getLanguageFlag(String str) {
        if (str.length() != 2 || str.equals("YL")) {
            return null;
        }
        if (str.equals("FT")) {
            return "🏴\u200d☠️";
        }
        if (str.equals("XG")) {
            return "🛰";
        }
        if (str.equals("XV")) {
            return "🌍";
        }
        char[] charArray = str.toCharArray();
        return new String(new char[]{CharacterCompat.highSurrogate(127397), CharacterCompat.lowSurrogate(charArray[0] + 61861), CharacterCompat.highSurrogate(127397), CharacterCompat.lowSurrogate(charArray[1] + 61861)});
    }

    public static String getLocaleAlias(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "he":
                return "iw";
            case "id":
                return "in";
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "jv":
                return "jw";
            case "jw":
                return "jv";
            case "nb":
                return "no";
            case "no":
                return "nb";
            case "tl":
                return "fil";
            case "yi":
                return "ji";
            case "fil":
                return "tl";
            default:
                return null;
        }
    }

    private HashMap<String, String> getLocaleFileStrings(File file) {
        return getLocaleFileStrings(file, false);
    }

    private String getLocaleString(Locale locale) {
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    public static String getLocaleStringIso639() {
        LocaleInfo localeInfo = getInstance().currentLocaleInfo;
        if (localeInfo != null) {
            return localeInfo.getLangCode();
        }
        Locale locale = getInstance().currentLocale;
        if (locale == null) {
            return "en";
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('-');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    private String getLocalizedString(int i10) {
        checkLocalizationInternal();
        re.a aVar = this.localizationInternal;
        Context context = ApplicationLoader.applicationContext;
        aVar.getClass();
        if (context == null || i10 == 0) {
            return null;
        }
        try {
            return aVar.b(context.getResources().getResourceEntryName(i10));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static int getLocalizedStringByName(String str) {
        return ApplicationLoader.applicationContext.getResources().getIdentifier(str, "string", ApplicationLoader.applicationContext.getPackageName());
    }

    public static String getPluralString(String str, int i10) {
        if (str == null || str.length() == 0 || getInstance().currentPluralRules == null) {
            return s3.c.e("LOC_ERR:", str);
        }
        String strW = a9.p.w(str, "_", getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10)));
        int localizedStringByName = getLocalizedStringByName(strW);
        return getInstance().getStringInternal(strW, str.concat("_other"), getLocalizedStringByName(str.concat("_other")), localizedStringByName);
    }

    public static String getServerString(String str) {
        int localizedStringByName;
        String strB = getInstance().localizationExternal.b(str);
        return (strB != null || (localizedStringByName = getLocalizedStringByName(str)) == 0) ? strB : getInstance().getLocalizedString(localizedStringByName);
    }

    public static String getString(int i10) {
        String str = resourcesCacheMap.get(Integer.valueOf(i10));
        if (str == null) {
            HashMap<Integer, String> map = resourcesCacheMap;
            Integer numValueOf = Integer.valueOf(i10);
            String resourceEntryName = ApplicationLoader.applicationContext.getResources().getResourceEntryName(i10);
            map.put(numValueOf, resourceEntryName);
            str = resourceEntryName;
        }
        return getString(str, i10);
    }

    private String getStringInternal(String str, int i10) {
        return getStringInternal(str, null, 0, i10);
    }

    public static String getStringParamForNumber(int i10) {
        return getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10));
    }

    public static int getStringResId(String str) {
        return getLocalizedStringByName(str);
    }

    public static String getSystemLocaleStringIso639() {
        Locale systemDefaultLocale = getInstance().getSystemDefaultLocale();
        if (systemDefaultLocale == null) {
            return "en";
        }
        String language = systemDefaultLocale.getLanguage();
        String country = systemDefaultLocale.getCountry();
        String variant = systemDefaultLocale.getVariant();
        if (language.length() == 0 && country.length() == 0) {
            return "en";
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(language);
        if (country.length() > 0 || variant.length() > 0) {
            sb2.append('-');
        }
        sb2.append(country);
        if (variant.length() > 0) {
            sb2.append('_');
        }
        sb2.append(variant);
        return sb2.toString();
    }

    public static String getTimeZoneName(String str, boolean z10) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone(str);
        if (timeZone == null) {
            return "";
        }
        String displayName = timeZone.getDisplayName(true, 0, getInstance().getCurrentLocale());
        if (z10) {
            String displayName2 = timeZone.getDisplayName(true, 1, getInstance().getCurrentLocale());
            if (!TextUtils.equals(displayName2, displayName)) {
                return a9.p.w(displayName2, ", ", displayName);
            }
        }
        return displayName;
    }

    public static boolean getUseImperialSystemType() {
        ensureImperialSystemInit();
        return useImperialSystemType.booleanValue();
    }

    public static boolean isRTLCharacter(char c10) {
        return Character.getDirectionality(c10) == 1 || Character.getDirectionality(c10) == 2 || Character.getDirectionality(c10) == 16 || Character.getDirectionality(c10) == 17;
    }

    public void lambda$applyLanguage$7(LocaleInfo localeInfo, int i10, Runnable runnable) {
        applyRemoteLanguage(localeInfo, null, true, i10, runnable);
    }

    public void lambda$applyLanguage$8(int i10) {
        reloadCurrentRemoteLocale(i10, null, true, null);
    }

    public static void lambda$applyLanguage$9() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInterface, new Object[0]);
    }

    public static void lambda$applyRemoteLanguage$13(int[] iArr, int[] iArr2, Runnable runnable) {
        int i10 = iArr[0] + 1;
        iArr[0] = i10;
        if (i10 < iArr2[0] || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void lambda$applyRemoteLanguage$15(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new j5(this, localeInfo, tLObject, i10, runnable, 3));
        }
    }

    public void lambda$applyRemoteLanguage$17(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new j5(this, localeInfo, tLObject, i10, runnable, 0));
        }
    }

    public void lambda$applyRemoteLanguage$19(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new j5(this, localeInfo, tLObject, i10, runnable, 2));
        }
    }

    public void lambda$applyRemoteLanguage$21(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new j5(this, localeInfo, tLObject, i10, runnable, 1));
        }
    }

    public void lambda$checkForcePatchLangpack$5(String str, Runnable runnable) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("langpack_patched" + str, true).apply();
        if (runnable != null) {
            runnable.run();
        }
        this.patching = false;
    }

    public void lambda$checkForcePatchLangpack$6(String str, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new m5(this, str, runnable, 1));
    }

    public void lambda$checkPatchLangpack$4(int i10) {
        reloadCurrentRemoteLocale(i10, null, true, null);
    }

    public void lambda$checkUpdateForCurrentRemoteLocale$2(int i10) {
        this.checkingUpdateForCurrentRemoteLocale = false;
        checkPatchLangpack(i10);
    }

    public void lambda$checkUpdateForCurrentRemoteLocale$3(int i10) {
        this.checkingUpdateForCurrentRemoteLocale = false;
        checkPatchLangpack(i10);
    }

    public void lambda$loadRemoteLanguages$11(TLObject tLObject, boolean z10, int i10) {
        this.loadingRemoteLanguages = false;
        Vector vector = (Vector) tLObject;
        int size = this.remoteLanguages.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.remoteLanguages.get(i11).serverIndex = Integer.MAX_VALUE;
        }
        int size2 = vector.objects.size();
        for (int i12 = 0; i12 < size2; i12++) {
            TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) vector.objects.get(i12);
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.ui.Cells.pa.v(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
            }
            LocaleInfo localeInfo = new LocaleInfo();
            localeInfo.nameEnglish = tL_langPackLanguage.name;
            localeInfo.name = tL_langPackLanguage.native_name;
            localeInfo.shortName = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
            String str = tL_langPackLanguage.base_lang_code;
            if (str != null) {
                localeInfo.baseLangCode = str.replace('-', '_').toLowerCase();
            } else {
                localeInfo.baseLangCode = "";
            }
            localeInfo.pluralLangCode = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
            localeInfo.isRtl = tL_langPackLanguage.rtl;
            localeInfo.pathToFile = "remote";
            localeInfo.serverIndex = i12;
            LocaleInfo languageFromDict = getLanguageFromDict(localeInfo.getKey());
            if (languageFromDict == null) {
                this.languages.add(localeInfo);
                this.languagesDict.put(localeInfo.getKey(), localeInfo);
            } else {
                languageFromDict.nameEnglish = localeInfo.nameEnglish;
                languageFromDict.name = localeInfo.name;
                languageFromDict.baseLangCode = localeInfo.baseLangCode;
                languageFromDict.pluralLangCode = localeInfo.pluralLangCode;
                languageFromDict.pathToFile = localeInfo.pathToFile;
                languageFromDict.serverIndex = localeInfo.serverIndex;
                localeInfo = languageFromDict;
            }
            if (!this.remoteLanguagesDict.containsKey(localeInfo.getKey())) {
                this.remoteLanguages.add(localeInfo);
                this.remoteLanguagesDict.put(localeInfo.getKey(), localeInfo);
            }
        }
        int i13 = 0;
        while (i13 < this.remoteLanguages.size()) {
            LocaleInfo localeInfo2 = this.remoteLanguages.get(i13);
            if (localeInfo2.serverIndex == Integer.MAX_VALUE && localeInfo2 != this.currentLocaleInfo) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("remove lang " + localeInfo2.getKey());
                }
                this.remoteLanguages.remove(i13);
                this.remoteLanguagesDict.remove(localeInfo2.getKey());
                this.languages.remove(localeInfo2);
                this.languagesDict.remove(localeInfo2.getKey());
                i13--;
            }
            i13++;
        }
        saveOtherLanguages();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.suggestedLangpack, new Object[0]);
        if (z10) {
            applyLanguage(this.currentLocaleInfo, true, false, i10);
        }
    }

    public void lambda$loadRemoteLanguages$12(boolean z10, int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            AndroidUtilities.runOnUIThread(new v4(i10, 1, this, (Vector) tLObject, z10));
        }
    }

    public void lambda$new$0() {
        loadRemoteLanguages(UserConfig.selectedAccount);
    }

    public void lambda$new$1() {
        this.currentSystemLocale = getSystemLocaleStringIso639();
    }

    public void lambda$saveRemoteLocaleStrings$10(int i10, LocaleInfo localeInfo, TLRPC.TL_langPackDifference tL_langPackDifference, HashMap map, Runnable runnable) {
        String[] strArrSplit;
        if (i10 == 0) {
            localeInfo.version = tL_langPackDifference.version;
        } else {
            localeInfo.baseVersion = tL_langPackDifference.version;
        }
        saveOtherLanguages();
        try {
            if (this.currentLocaleInfo == localeInfo) {
                if (TextUtils.isEmpty(localeInfo.pluralLangCode)) {
                    strArrSplit = !TextUtils.isEmpty(localeInfo.baseLangCode) ? localeInfo.baseLangCode.split("_") : localeInfo.shortName.split("_");
                } else {
                    strArrSplit = localeInfo.pluralLangCode.split("_");
                }
                Locale locale = strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : new Locale(strArrSplit[0], strArrSplit[1]);
                this.languageOverride = localeInfo.shortName;
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                editorEdit.putString("language", localeInfo.getKey());
                editorEdit.commit();
                n2.b0 b0Var = new n2.b0(17);
                b0Var.c(map);
                this.localizationExternal = new re.a(b0Var);
                this.localizationExternalSize = calculateTranslatedCount(map);
                this.currentLocale = locale;
                this.currentLocaleInfo = localeInfo;
                if (!TextUtils.isEmpty(localeInfo.pluralLangCode)) {
                    this.currentPluralRules = this.allRules.get(this.currentLocaleInfo.pluralLangCode);
                }
                if (this.currentPluralRules == null) {
                    PluralRules pluralRules = this.allRules.get(this.currentLocale.getLanguage());
                    this.currentPluralRules = pluralRules;
                    if (pluralRules == null) {
                        this.currentPluralRules = this.allRules.get("en");
                    }
                }
                this.changingConfiguration = true;
                Locale.setDefault(this.currentLocale);
                Configuration configuration = new Configuration();
                configuration.locale = this.currentLocale;
                ApplicationLoader.applicationContext.getResources().updateConfiguration(configuration, ApplicationLoader.applicationContext.getResources().getDisplayMetrics());
                this.changingConfiguration = false;
                a31.f36361s = false;
            } else {
                FileLog.d("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            this.changingConfiguration = false;
        }
        recreateFormatters();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInterface, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }

    private void loadOtherLanguages() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("langconfig", 0);
        String string = sharedPreferences.getString("locales", null);
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("&")) {
                LocaleInfo localeInfoCreateWithString = LocaleInfo.createWithString(str);
                if (localeInfoCreateWithString != null) {
                    this.otherLanguages.add(localeInfoCreateWithString);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                LocaleInfo localeInfoCreateWithString2 = LocaleInfo.createWithString(str2);
                localeInfoCreateWithString2.shortName = localeInfoCreateWithString2.shortName.replace("-", "_");
                if (!this.remoteLanguagesDict.containsKey(localeInfoCreateWithString2.getKey())) {
                    this.remoteLanguages.add(localeInfoCreateWithString2);
                    this.remoteLanguagesDict.put(localeInfoCreateWithString2.getKey(), localeInfoCreateWithString2);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (TextUtils.isEmpty(string3)) {
            return;
        }
        for (String str3 : string3.split("&")) {
            LocaleInfo localeInfoCreateWithString3 = LocaleInfo.createWithString(str3);
            if (localeInfoCreateWithString3 != null) {
                localeInfoCreateWithString3.shortName = localeInfoCreateWithString3.shortName.replace("-", "_");
                this.unofficialLanguages.add(localeInfoCreateWithString3);
            }
        }
    }

    public static String nullable(String str) {
        if (str == null || str.startsWith("LOC_ERR")) {
            return null;
        }
        return str;
    }

    private void patched(String str) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set as patched " + str + " langpack");
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static void resetImperialSystemType() {
        useImperialSystemType = null;
    }

    private void saveOtherLanguages() {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("langconfig", 0).edit();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.otherLanguages.size(); i10++) {
            String saveString = this.otherLanguages.get(i10).getSaveString();
            if (saveString != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(saveString);
            }
        }
        editorEdit.putString("locales", sb2.toString());
        sb2.setLength(0);
        for (int i11 = 0; i11 < this.remoteLanguages.size(); i11++) {
            String saveString2 = this.remoteLanguages.get(i11).getSaveString();
            if (saveString2 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(saveString2);
            }
        }
        editorEdit.putString("remote", sb2.toString());
        sb2.setLength(0);
        for (int i12 = 0; i12 < this.unofficialLanguages.size(); i12++) {
            String saveString3 = this.unofficialLanguages.get(i12).getSaveString();
            if (saveString3 != null) {
                if (sb2.length() != 0) {
                    sb2.append("&");
                }
                sb2.append(saveString3);
            }
        }
        editorEdit.putString("unofficial", sb2.toString());
        editorEdit.commit();
    }

    private boolean shouldReinstallLangpack(String str) {
        int i10;
        int i11 = MessagesController.getInstance(UserConfig.selectedAccount).checkResetLangpack;
        if (i11 <= 0) {
            return false;
        }
        if (MessagesController.getGlobalMainSettings().getBoolean("lngpack_patched_" + str, false) || (i10 = this.localizationExternalSize) >= i11) {
            return false;
        }
        FileLog.e("reinstalling " + str + " langpack because of patch (" + i10 + " keys, must be at least " + i11 + ")");
        patched(str);
        return true;
    }

    public static String stringForMessageListDate(long j10) {
        long j11 = j10 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j11) >= 31536000000L) {
                return getInstance().getFormatterYear().format(new Date(j11));
            }
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(6) - i10;
            if (i11 != 0 && (i11 != -1 || System.currentTimeMillis() - j11 >= 28800000)) {
                return (i11 <= -7 || i11 > -1) ? getInstance().getFormatterDayMonth().format(new Date(j11)) : getInstance().getFormatterWeek().format(new Date(j11));
            }
            return getInstance().getFormatterDay().format(new Date(j11));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR";
        }
    }

    private String stringForQuantity(int i10) {
        if (i10 == 1) {
            return "zero";
        }
        if (i10 == 2) {
            return "one";
        }
        if (i10 == 4) {
            return "two";
        }
        if (i10 != 8) {
            return i10 != 16 ? "other" : "many";
        }
        return "few";
    }

    public int applyLanguage(LocaleInfo localeInfo, boolean z10, boolean z11, int i10) {
        return applyLanguage(localeInfo, z10, z11, false, false, i10, null);
    }

    public boolean applyLanguageFile(File file, int i10) {
        try {
            HashMap<String, String> localeFileStrings = getLocaleFileStrings(file);
            String str = localeFileStrings.get("LanguageName");
            String str2 = localeFileStrings.get("LanguageNameInEnglish");
            String str3 = localeFileStrings.get("LanguageCode");
            if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && str3 != null && str3.length() > 0 && !str.contains("&") && !str.contains("|") && !str2.contains("&") && !str2.contains("|") && !str3.contains("&") && !str3.contains("|") && !str3.contains("/") && !str3.contains("\\")) {
                File file2 = new File(ApplicationLoader.getFilesDirFixed(), str3.concat(".xml"));
                if (AndroidUtilities.copyFile(file, file2)) {
                    LocaleInfo languageFromDict = getLanguageFromDict("local_" + str3.toLowerCase());
                    if (languageFromDict == null) {
                        languageFromDict = new LocaleInfo();
                        languageFromDict.name = str;
                        languageFromDict.nameEnglish = str2;
                        String lowerCase = str3.toLowerCase();
                        languageFromDict.shortName = lowerCase;
                        languageFromDict.pluralLangCode = lowerCase;
                        languageFromDict.pathToFile = file2.getAbsolutePath();
                        this.languages.add(languageFromDict);
                        this.languagesDict.put(languageFromDict.getKey(), languageFromDict);
                        this.otherLanguages.add(languageFromDict);
                        saveOtherLanguages();
                    }
                    LocaleInfo localeInfo = languageFromDict;
                    n2.b0 b0Var = new n2.b0(17);
                    b0Var.c(localeFileStrings);
                    this.localizationExternal = new re.a(b0Var);
                    this.localizationExternalSize = calculateTranslatedCount(localeFileStrings);
                    applyLanguage(localeInfo, true, false, true, false, i10, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public int calculateTranslatedCount(HashMap<String, String> map) {
        String strN;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (String str : map.keySet()) {
            if (str != null) {
                if (str.endsWith("_other")) {
                    strN = com.google.android.recaptcha.internal.a.n(str, 6, 0);
                } else if (str.endsWith("_zero") || str.endsWith("_many")) {
                    strN = com.google.android.recaptcha.internal.a.n(str, 5, 0);
                } else {
                    strN = (str.endsWith("_one") || str.endsWith("_two") || str.endsWith("_few")) ? com.google.android.recaptcha.internal.a.n(str, 4, 0) : null;
                }
                if (strN != null) {
                    if (!hashSet.contains(strN)) {
                        hashSet.add(strN);
                    }
                }
                i10++;
            }
        }
        hashSet.clear();
        return i10;
    }

    public void checkForcePatchLangpack(int i10, Runnable runnable) {
        String currentLanguageName = getCurrentLanguageName();
        if (MessagesController.getInstance(i10).checkResetLangpack > 0) {
            if (MessagesController.getGlobalMainSettings().getBoolean("langpack_patched" + currentLanguageName, false) || this.patching) {
                return;
            }
            this.patching = true;
            reloadCurrentRemoteLocale(i10, null, true, new m5(this, currentLanguageName, runnable, 0));
        }
    }

    public void checkPatchLangpack(int i10) {
        LocaleInfo localeInfo = this.currentLocaleInfo;
        if (localeInfo == null || this.checkingUpdateForCurrentRemoteLocale || !shouldReinstallLangpack(localeInfo.shortName)) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("reload locale because locale file is not enough");
        }
        AndroidUtilities.runOnUIThread(new k5(this, i10, 1));
    }

    public void checkUpdateForCurrentRemoteLocale(int i10, int i11, int i12) {
        LocaleInfo localeInfo = this.currentLocaleInfo;
        if (localeInfo != null) {
            if (localeInfo.isRemote() || this.currentLocaleInfo.isUnofficial()) {
                if (this.currentLocaleInfo.hasBaseLang()) {
                    if (this.currentLocaleInfo.baseVersion < i12) {
                        FileLog.d("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + this.currentLocaleInfo.baseVersion + ", remote is " + i12 + ")");
                        this.checkingUpdateForCurrentRemoteLocale = true;
                        LocaleInfo localeInfo2 = this.currentLocaleInfo;
                        applyRemoteLanguage(localeInfo2, localeInfo2.baseLangCode, false, i10, new k5(this, i10, 2));
                    } else {
                        FileLog.d("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + this.currentLocaleInfo.baseVersion + ", remote is " + i12 + ")");
                    }
                }
                if (this.currentLocaleInfo.version >= i11) {
                    FileLog.d("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + this.currentLocaleInfo.version + ", remote is " + i11 + ")");
                    return;
                }
                FileLog.d("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + this.currentLocaleInfo.version + ", remote is " + i11 + ")");
                this.checkingUpdateForCurrentRemoteLocale = true;
                LocaleInfo localeInfo3 = this.currentLocaleInfo;
                applyRemoteLanguage(localeInfo3, localeInfo3.shortName, false, i10, new k5(this, i10, 3));
            }
        }
    }

    public boolean deleteLanguage(LocaleInfo localeInfo, int i10) {
        if (localeInfo.pathToFile == null || (localeInfo.isRemote() && localeInfo.serverIndex != Integer.MAX_VALUE)) {
            return false;
        }
        if (this.currentLocaleInfo == localeInfo) {
            LocaleInfo languageFromDict = this.systemDefaultLocale.getLanguage() != null ? getLanguageFromDict(this.systemDefaultLocale.getLanguage()) : null;
            if (languageFromDict == null) {
                languageFromDict = getLanguageFromDict(getLocaleString(this.systemDefaultLocale));
            }
            if (languageFromDict == null) {
                languageFromDict = getLanguageFromDict("en");
            }
            applyLanguage(languageFromDict, true, false, i10);
        }
        this.unofficialLanguages.remove(localeInfo);
        this.remoteLanguages.remove(localeInfo);
        this.remoteLanguagesDict.remove(localeInfo.getKey());
        this.otherLanguages.remove(localeInfo);
        this.languages.remove(localeInfo);
        this.languagesDict.remove(localeInfo.getKey());
        new File(localeInfo.pathToFile).delete();
        saveOtherLanguages();
        return true;
    }

    public String formatCurrencyDecimalString(long j10, String str, boolean z10) {
        double d;
        String upperCase = str.toUpperCase();
        long jAbs = Math.abs(j10);
        upperCase.getClass();
        byte b10 = -1;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    b10 = 0;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    b10 = 1;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    b10 = 2;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    b10 = 3;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    b10 = 4;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    b10 = 5;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    b10 = 6;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    b10 = 7;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    b10 = 8;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    b10 = 9;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    b10 = 10;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    b10 = 11;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    b10 = 12;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    b10 = 13;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    b10 = 14;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    b10 = 15;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    b10 = 16;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    b10 = 17;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    b10 = 18;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    b10 = 19;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    b10 = 20;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    b10 = 21;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    b10 = 22;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    b10 = 23;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    b10 = 24;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    b10 = 25;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    b10 = 26;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    b10 = 27;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    b10 = 28;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    b10 = 29;
                }
                break;
        }
        String str2 = " %.0f";
        switch (b10) {
            case 0:
            case 8:
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = jAbs / 1000.0d;
                str2 = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 13:
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                d = jAbs;
                break;
            case 3:
                d = jAbs / 10000.0d;
                str2 = " %.4f";
                break;
            case 9:
                double d10 = jAbs / 100.0f;
                str2 = jAbs % 100 != 0 ? " %.2f" : " %.0f";
                d = d10;
                break;
            case 18:
                d = jAbs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = jAbs / 100.0d;
                str2 = " %.2f";
                break;
        }
        Locale locale = Locale.US;
        if (!z10) {
            upperCase = str2;
        }
        return String.format(locale, upperCase, Double.valueOf(d)).trim();
    }

    public String formatCurrencyString(long j10, String str) {
        return formatCurrencyString(j10, true, true, false, str);
    }

    public LocaleInfo getBuiltinLanguageByPlural(String str) {
        String str2;
        for (LocaleInfo localeInfo : this.languagesDict.values()) {
            String str3 = localeInfo.pathToFile;
            if (str3 != null && str3.equals("remote") && ((str2 = localeInfo.shortName) == null || !str2.endsWith("_raw"))) {
                String str4 = localeInfo.pluralLangCode;
                if (str4 != null && str4.equals(str)) {
                    return localeInfo;
                }
            }
        }
        return null;
    }

    public FastDateFormat getChatDate() {
        if (this.chatDate == null) {
            synchronized (this) {
                try {
                    if (this.chatDate == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.chatDate = createFormatter(locale, getStringInternal("chatDate", R.string.chatDate), "d MMMM");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.chatDate;
    }

    public FastDateFormat getChatDateShort() {
        if (this.chatDateShort == null) {
            synchronized (this) {
                try {
                    if (this.chatDateShort == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.chatDateShort = createFormatter(locale, getStringInternal("chatDateShort", R.string.chatDateShort), "d MMM");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.chatDateShort;
    }

    public FastDateFormat getChatFullDate() {
        if (this.chatFullDate == null) {
            synchronized (this) {
                try {
                    if (this.chatFullDate == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.chatFullDate = createFormatter(locale, getStringInternal("chatFullDate", R.string.chatFullDate), "d MMMM yyyy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.chatFullDate;
    }

    public Locale getCurrentLocale() {
        return this.currentLocale;
    }

    public LocaleInfo getCurrentLocaleInfo() {
        return this.currentLocaleInfo;
    }

    public FastDateFormat getFormatterBannedUntil() {
        String str;
        int i10;
        if (this.formatterBannedUntil == null) {
            synchronized (this) {
                try {
                    if (this.formatterBannedUntil == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (is24HourFormat) {
                            str = "formatterBannedUntil24H";
                            i10 = R.string.formatterBannedUntil24H;
                        } else {
                            str = "formatterBannedUntil12H";
                            i10 = R.string.formatterBannedUntil12H;
                        }
                        this.formatterBannedUntil = createFormatter(locale, getStringInternal(str, i10), is24HourFormat ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterBannedUntil;
    }

    public FastDateFormat getFormatterBannedUntilThisYear() {
        String str;
        int i10;
        if (this.formatterBannedUntilThisYear == null) {
            synchronized (this) {
                try {
                    if (this.formatterBannedUntilThisYear == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (is24HourFormat) {
                            str = "formatterBannedUntilThisYear24H";
                            i10 = R.string.formatterBannedUntilThisYear24H;
                        } else {
                            str = "formatterBannedUntilThisYear12H";
                            i10 = R.string.formatterBannedUntilThisYear12H;
                        }
                        this.formatterBannedUntilThisYear = createFormatter(locale, getStringInternal(str, i10), is24HourFormat ? "MMM dd, HH:mm" : "MMM dd, h:mm a");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterBannedUntilThisYear;
    }

    public FastDateFormat getFormatterBoostExpired() {
        if (this.formatterBoostExpired == null) {
            synchronized (this) {
                try {
                    if (this.formatterBoostExpired == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterBoostExpired = createFormatter(locale, getStringInternal("formatterBoostExpired", R.string.formatterBoostExpired), "MMM dd, yyyy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterBoostExpired;
    }

    public FastDateFormat getFormatterConstDay() {
        if (this.formatterConstDay == null) {
            synchronized (this) {
                try {
                    if (this.formatterConstDay == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        String language = locale.getLanguage();
                        if (language == null) {
                            language = "en";
                        }
                        String lowerCase = language.toLowerCase();
                        if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                            locale = Locale.US;
                        }
                        boolean z10 = is24HourFormat;
                        this.formatterConstDay = createFormatter(locale, z10 ? "HH:mm" : "h:mm a", z10 ? "HH:mm" : "h:mm a");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterConstDay;
    }

    public FastDateFormat getFormatterDay() {
        String str;
        int i10;
        if (this.formatterDay == null) {
            synchronized (this) {
                try {
                    if (this.formatterDay == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        String language = locale.getLanguage();
                        if (language == null) {
                            language = "en";
                        }
                        String lowerCase = language.toLowerCase();
                        if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                            locale = Locale.US;
                        }
                        if (is24HourFormat) {
                            str = "formatterDay24H";
                            i10 = R.string.formatterDay24H;
                        } else {
                            str = "formatterDay12H";
                            i10 = R.string.formatterDay12H;
                        }
                        this.formatterDay = createFormatter(locale, getStringInternal(str, i10), is24HourFormat ? "HH:mm" : "h:mm a");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterDay;
    }

    public FastDateFormat getFormatterDayMonth() {
        if (this.formatterDayMonth == null) {
            synchronized (this) {
                try {
                    if (this.formatterDayMonth == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterDayMonth = createFormatter(locale, getStringInternal("formatterMonth", R.string.formatterMonth), "dd MMM");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterDayMonth;
    }

    public FastDateFormat getFormatterDayWithSeconds() {
        String str;
        int i10;
        if (this.formatterDayWithSeconds == null) {
            synchronized (this) {
                try {
                    if (this.formatterDayWithSeconds == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        String language = locale.getLanguage();
                        if (language == null) {
                            language = "en";
                        }
                        String lowerCase = language.toLowerCase();
                        if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                            locale = Locale.US;
                        }
                        if (is24HourFormat) {
                            str = "formatterDayWithSeconds24H";
                            i10 = R.string.formatterDayWithSeconds24H;
                        } else {
                            str = "formatterDayWithSeconds12H";
                            i10 = R.string.formatterDayWithSeconds12H;
                        }
                        this.formatterDayWithSeconds = createFormatter(locale, getStringInternal(str, i10), is24HourFormat ? "HH:mm:ss" : "h:mm:ss a");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterDayWithSeconds;
    }

    public FastDateFormat getFormatterGiveawayCard() {
        if (this.formatterGiveawayCard == null) {
            synchronized (this) {
                try {
                    if (this.formatterGiveawayCard == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterGiveawayCard = createFormatter(locale, getStringInternal("formatterGiveawayCard", R.string.formatterGiveawayCard), "dd MMM yyyy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterGiveawayCard;
    }

    public FastDateFormat getFormatterGiveawayMonthDay() {
        if (this.formatterGiveawayMonthDay == null) {
            synchronized (this) {
                try {
                    if (this.formatterGiveawayMonthDay == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterGiveawayMonthDay = createFormatter(locale, getStringInternal("formatterGiveawayMonthDay", R.string.formatterGiveawayMonthDay), "MMMM dd");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterGiveawayMonthDay;
    }

    public FastDateFormat getFormatterGiveawayMonthDayYear() {
        if (this.formatterGiveawayMonthDayYear == null) {
            synchronized (this) {
                try {
                    if (this.formatterGiveawayMonthDayYear == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterGiveawayMonthDayYear = createFormatter(locale, getStringInternal("formatterGiveawayMonthDayYear", R.string.formatterGiveawayMonthDayYear), "MMMM dd, yyyy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterGiveawayMonthDayYear;
    }

    public FastDateFormat getFormatterMonthOnly() {
        if (this.formatterMonthOnly == null) {
            synchronized (this) {
                try {
                    if (this.formatterMonthOnly == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterMonthOnly = createFormatter(locale, getStringInternal("formatterMonthOnly", R.string.formatterMonthOnly), "MMMM");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterMonthOnly;
    }

    public FastDateFormat getFormatterMonthYear() {
        if (this.formatterMonthYear == null) {
            synchronized (this) {
                try {
                    if (this.formatterMonthYear == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterMonthYear = createFormatter(locale, getStringInternal("formatterMonthYear", R.string.formatterMonthYear), "MMM yyyy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterMonthYear;
    }

    public FastDateFormat getFormatterScheduleDay() {
        if (this.formatterScheduleDay == null) {
            synchronized (this) {
                try {
                    if (this.formatterScheduleDay == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterScheduleDay = createFormatter(locale, getStringInternal("formatDateSchedule", R.string.formatDateSchedule), "MMM d");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterScheduleDay;
    }

    public FastDateFormat getFormatterScheduleSend(int i10) {
        if (i10 < 0) {
            return null;
        }
        FastDateFormat[] fastDateFormatArr = this.formatterScheduleSend;
        if (i10 >= fastDateFormatArr.length) {
            return null;
        }
        if (fastDateFormatArr[i10] == null) {
            Locale locale = this.currentLocale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            switch (i10) {
                case 0:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("SendTodayAt", R.string.SendTodayAt), "'Send today at' HH:mm");
                    break;
                case 1:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("SendDayAt", R.string.SendDayAt), "'Send on' MMM d 'at' HH:mm");
                    break;
                case 2:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("SendDayYearAt", R.string.SendDayYearAt), "'Send on' MMM d yyyy 'at' HH:mm");
                    break;
                case 3:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("RemindTodayAt", R.string.RemindTodayAt), "'Remind today at' HH:mm");
                    break;
                case 4:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("RemindDayAt", R.string.RemindDayAt), "'Remind on' MMM d 'at' HH:mm");
                    break;
                case 5:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("RemindDayYearAt", R.string.RemindDayYearAt), "'Remind on' MMM d yyyy 'at' HH:mm");
                    break;
                case 6:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartTodayAt", R.string.StartTodayAt), "'Start today at' HH:mm");
                    break;
                case 7:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartDayAt", R.string.StartDayAt), "'Start on' MMM d 'at' HH:mm");
                    break;
                case 8:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartDayYearAt", R.string.StartDayYearAt), "'Start on' MMM d yyyy 'at' HH:mm");
                    break;
                case 9:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartShortTodayAt", R.string.StartShortTodayAt), "'Today,' HH:mm");
                    break;
                case 10:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartShortDayAt", R.string.StartShortDayAt), "MMM d',' HH:mm");
                    break;
                case 11:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartShortDayYearAt", R.string.StartShortDayYearAt), "MMM d yyyy, HH:mm");
                    break;
                case 12:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartsTodayAt", R.string.StartsTodayAt), "'Starts today at' HH:mm");
                    break;
                case 13:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartsDayAt", R.string.StartsDayAt), "'Starts on' MMM d 'at' HH:mm");
                    break;
                case 14:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("StartsDayYearAt", R.string.StartsDayYearAt), "'Starts on' MMM d yyyy 'at' HH:mm");
                    break;
                case 15:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("PublishTodayAt", R.string.PublishTodayAt), "'Publish today at' HH:mm");
                    break;
                case 16:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("PublishDayAt", R.string.PublishDayAt), "'Publish on' MMM d 'at' HH:mm");
                    break;
                case 17:
                    this.formatterScheduleSend[i10] = createFormatter(locale, getStringInternal("PublishDayYearAt", R.string.PublishDayYearAt), "'Publish on' MMM d yyyy 'at' HH:mm");
                    break;
            }
        }
        return this.formatterScheduleSend[i10];
    }

    public FastDateFormat getFormatterScheduleYear() {
        if (this.formatterScheduleYear == null) {
            synchronized (this) {
                try {
                    if (this.formatterScheduleYear == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterScheduleYear = createFormatter(locale, getStringInternal("formatDateScheduleYear", R.string.formatDateScheduleYear), "MMM d yyyy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterScheduleYear;
    }

    public FastDateFormat getFormatterStats() {
        String str;
        int i10;
        if (this.formatterStats == null) {
            synchronized (this) {
                try {
                    if (this.formatterStats == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        if (is24HourFormat) {
                            str = "formatterStats24H";
                            i10 = R.string.formatterStats24H;
                        } else {
                            str = "formatterStats12H";
                            i10 = R.string.formatterStats12H;
                        }
                        this.formatterStats = createFormatter(locale, getStringInternal(str, i10), is24HourFormat ? "MMM dd yyyy, HH:mm" : "MMM dd yyyy, h:mm a");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterStats;
    }

    public FastDateFormat getFormatterWeek() {
        if (this.formatterWeek == null) {
            synchronized (this) {
                try {
                    if (this.formatterWeek == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterWeek = createFormatter(locale, getStringInternal("formatterWeek", R.string.formatterWeek), "EEE");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterWeek;
    }

    public FastDateFormat getFormatterWeekLong() {
        if (this.formatterWeekLong == null) {
            synchronized (this) {
                try {
                    if (this.formatterWeekLong == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterWeekLong = createFormatter(locale, getStringInternal("formatterWeekLong", R.string.formatterWeekLong), "EEEE");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterWeekLong;
    }

    public FastDateFormat getFormatterYear() {
        if (this.formatterYear == null) {
            synchronized (this) {
                try {
                    if (this.formatterYear == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterYear = createFormatter(locale, getStringInternal("formatterYear", R.string.formatterYear), "dd.MM.yy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterYear;
    }

    public FastDateFormat getFormatterYearMax() {
        if (this.formatterYearMax == null) {
            synchronized (this) {
                try {
                    if (this.formatterYearMax == null) {
                        Locale locale = this.currentLocale;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        this.formatterYearMax = createFormatter(locale, getStringInternal("formatterYearMax", R.string.formatterYearMax), "dd.MM.yyyy");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.formatterYearMax;
    }

    public LocaleInfo getLanguageFromDict(String str) {
        if (str == null) {
            return null;
        }
        return this.languagesDict.get(str.toLowerCase().replace("-", "_"));
    }

    public Locale getSystemDefaultLocale() {
        return this.systemDefaultLocale;
    }

    public String getTranslitString(String str) {
        return getTranslitString(str, true, false);
    }

    public boolean isCurrentLocalLocale() {
        return this.currentLocaleInfo.isLocal();
    }

    public void loadRemoteLanguages(int i10) {
        loadRemoteLanguages(i10, true);
    }

    public void onDeviceConfigurationChange(Configuration configuration) {
        if (this.changingConfiguration) {
            return;
        }
        is24HourFormat = DateFormat.is24HourFormat(ApplicationLoader.applicationContext);
        Locale locale = configuration.locale;
        this.systemDefaultLocale = locale;
        if (this.languageOverride != null) {
            LocaleInfo localeInfo = this.currentLocaleInfo;
            this.currentLocaleInfo = null;
            applyLanguage(localeInfo, false, false, UserConfig.selectedAccount);
        } else if (locale != null) {
            String displayName = locale.getDisplayName();
            String displayName2 = this.currentLocale.getDisplayName();
            if (displayName != null && displayName2 != null && !displayName.equals(displayName2)) {
                recreateFormatters();
            }
            this.currentLocale = locale;
            LocaleInfo localeInfo2 = this.currentLocaleInfo;
            if (localeInfo2 != null && !TextUtils.isEmpty(localeInfo2.pluralLangCode)) {
                this.currentPluralRules = this.allRules.get(this.currentLocaleInfo.pluralLangCode);
            }
            if (this.currentPluralRules == null) {
                PluralRules pluralRules = this.allRules.get(this.currentLocale.getLanguage());
                this.currentPluralRules = pluralRules;
                if (pluralRules == null) {
                    this.currentPluralRules = this.allRules.get("en");
                }
            }
        }
        String systemLocaleStringIso639 = getSystemLocaleStringIso639();
        String str = this.currentSystemLocale;
        if (str != null && !systemLocaleStringIso639.equals(str)) {
            this.currentSystemLocale = systemLocaleStringIso639;
            ConnectionsManager.setSystemLangCode(systemLocaleStringIso639);
        }
        checkLocalizationInternal();
    }

    public void recreateFormatters() {
        LocaleInfo localeInfo;
        Locale locale = this.currentLocale;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String language = locale.getLanguage();
        if (language == null) {
            language = "en";
        }
        String lowerCase = language.toLowerCase();
        int i10 = 0;
        isRTL = (lowerCase.length() == 2 && (lowerCase.equals("ar") || lowerCase.equals("fa") || lowerCase.equals("he") || lowerCase.equals("iw"))) || lowerCase.startsWith("ar_") || lowerCase.startsWith("fa_") || lowerCase.startsWith("he_") || lowerCase.startsWith("iw_") || ((localeInfo = this.currentLocaleInfo) != null && localeInfo.isRtl);
        nameDisplayOrder = lowerCase.equals("ko") ? 2 : 1;
        this.formatterBoostExpired = null;
        this.formatterGiveawayCard = null;
        this.formatterGiveawayMonthDay = null;
        this.formatterGiveawayMonthDayYear = null;
        this.formatterMonthYear = null;
        this.formatterMonthOnly = null;
        this.formatterDayMonth = null;
        this.formatterYear = null;
        this.formatterYearMax = null;
        this.chatDate = null;
        this.chatFullDate = null;
        this.formatterWeek = null;
        this.formatterWeekLong = null;
        this.formatterScheduleDay = null;
        this.formatterScheduleYear = null;
        this.formatterDay = null;
        this.formatterDayWithSeconds = null;
        this.formatterConstDay = null;
        this.formatterStats = null;
        this.formatterBannedUntil = null;
        this.formatterBannedUntilThisYear = null;
        while (true) {
            FastDateFormat[] fastDateFormatArr = this.formatterScheduleSend;
            if (i10 >= fastDateFormatArr.length) {
                return;
            }
            fastDateFormatArr[i10] = null;
            i10++;
        }
    }

    public void reloadCurrentRemoteLocale(int i10, String str, boolean z10, Runnable runnable) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            LocaleInfo localeInfo = this.currentLocaleInfo;
            if (localeInfo == null) {
                return;
            }
            if (!str2.equals(localeInfo.shortName) && !str2.equals(this.currentLocaleInfo.baseLangCode)) {
                return;
            }
        }
        applyRemoteLanguage(this.currentLocaleInfo, str2, z10, i10, runnable);
    }

    public void lambda$applyRemoteLanguage$20(LocaleInfo localeInfo, TLRPC.TL_langPackDifference tL_langPackDifference, int i10, Runnable runnable) throws Throwable {
        HashMap<String, String> localeFileStrings;
        boolean z10 = true;
        if (tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty() || localeInfo == null || localeInfo.isLocal()) {
            StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
            sb2.append(tL_langPackDifference == null || tL_langPackDifference.strings.isEmpty());
            sb2.append("; locale is local or null=");
            if (localeInfo != null && !localeInfo.isLocal()) {
                z10 = false;
            }
            sb2.append(z10);
            FileLog.d(sb2.toString());
            recreateFormatters();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInterface, new Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        int i11 = lowerCase.equals(localeInfo.shortName) ? 0 : lowerCase.equals(localeInfo.baseLangCode) ? 1 : -1;
        if (i11 == -1) {
            StringBuilder sbR = a9.p.r("saveRemoteLocaleStrings: unknown language ", lowerCase, " (locale short=");
            sbR.append(localeInfo.shortName);
            sbR.append(", base=");
            sbR.append(localeInfo.baseLangCode);
            sbR.append(")");
            FileLog.d(sbR.toString());
            return;
        }
        File pathToFile = i11 == 0 ? localeInfo.getPathToFile() : localeInfo.getPathToBaseFile();
        try {
            if (tL_langPackDifference.from_version == 0) {
                FileLog.d("saveRemoteLocaleStrings: difference is straight from the beginning");
                localeFileStrings = new HashMap<>();
            } else {
                FileLog.d("saveRemoteLocaleStrings: difference is from version " + tL_langPackDifference.from_version + " ours " + localeInfo.version + " (base version " + localeInfo.baseLangCode + ")");
                localeFileStrings = getLocaleFileStrings(pathToFile, true);
            }
            for (int i12 = 0; i12 < tL_langPackDifference.strings.size(); i12++) {
                TLRPC.LangPackString langPackString = tL_langPackDifference.strings.get(i12);
                if (langPackString instanceof TLRPC.TL_langPackString) {
                    localeFileStrings.put(langPackString.key, escapeString(langPackString.value));
                } else if (langPackString instanceof TLRPC.TL_langPackStringPluralized) {
                    String str = langPackString.key + "_zero";
                    String str2 = langPackString.zero_value;
                    localeFileStrings.put(str, str2 != null ? escapeString(str2) : "");
                    String str3 = langPackString.key + "_one";
                    String str4 = langPackString.one_value;
                    localeFileStrings.put(str3, str4 != null ? escapeString(str4) : "");
                    String str5 = langPackString.key + "_two";
                    String str6 = langPackString.two_value;
                    localeFileStrings.put(str5, str6 != null ? escapeString(str6) : "");
                    String str7 = langPackString.key + "_few";
                    String str8 = langPackString.few_value;
                    localeFileStrings.put(str7, str8 != null ? escapeString(str8) : "");
                    String str9 = langPackString.key + "_many";
                    String str10 = langPackString.many_value;
                    localeFileStrings.put(str9, str10 != null ? escapeString(str10) : "");
                    String str11 = langPackString.key + "_other";
                    String str12 = langPackString.other_value;
                    localeFileStrings.put(str11, str12 != null ? escapeString(str12) : "");
                } else if (langPackString instanceof TLRPC.TL_langPackStringDeleted) {
                    localeFileStrings.remove(langPackString.key);
                }
            }
            FileLog.d("save locale file to " + pathToFile);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToFile));
            bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
            bufferedWriter.write("<resources>\n");
            for (Map.Entry<String, String> entry : localeFileStrings.entrySet()) {
                bufferedWriter.write(String.format("<string name=\"%1$s\">%2$s</string>\n", entry.getKey(), entry.getValue()));
            }
            bufferedWriter.write("</resources>");
            bufferedWriter.close();
            boolean zHasBaseLang = localeInfo.hasBaseLang();
            HashMap<String, String> localeFileStrings2 = getLocaleFileStrings(zHasBaseLang ? localeInfo.getPathToBaseFile() : localeInfo.getPathToFile());
            if (zHasBaseLang) {
                localeFileStrings2.putAll(getLocaleFileStrings(localeInfo.getPathToFile()));
            }
            FileLog.d("saved locale file to " + pathToFile);
            AndroidUtilities.runOnUIThread(new gf.k0(this, i11, localeInfo, tL_langPackDifference, localeFileStrings2, runnable, 4));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void saveRemoteLocaleStringsForCurrentLocale(TLRPC.TL_langPackDifference tL_langPackDifference, int i10) {
        if (this.currentLocaleInfo == null) {
            return;
        }
        String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
        if (lowerCase.equals(this.currentLocaleInfo.shortName) || lowerCase.equals(this.currentLocaleInfo.baseLangCode)) {
            lambda$applyRemoteLanguage$20(this.currentLocaleInfo, tL_langPackDifference, i10, null);
        }
    }

    public static String formatDate(long j10, boolean z10) {
        long j11 = j10 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j11);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return z10 ? getString(R.string.ShortToday) : getInstance().getFormatterDay().format(new Date(j11));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return getString("Yesterday", R.string.Yesterday);
            }
            return Math.abs(System.currentTimeMillis() - j11) < 31536000000L ? getInstance().getFormatterDayMonth().format(new Date(j11)) : getInstance().getFormatterYear().format(new Date(j11));
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR: formatDate";
        }
    }

    public static String formatDateChat(long j10, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            return (!(z10 && i10 == calendar.get(1)) && (z10 || Math.abs(System.currentTimeMillis() - j11) >= 31536000000L)) ? getInstance().getChatFullDate().format(j11) : getInstance().getChatDate().format(j11);
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String formatDistance(float f10, int i10, Boolean bool) {
        ensureImperialSystemInit();
        if ((bool == null || !bool.booleanValue()) && !(bool == null && useImperialSystemType.booleanValue())) {
            if (f10 < 1000.0f) {
                if (i10 != 0) {
                    return i10 != 1 ? formatString("MetersShort", R.string.MetersShort, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : formatString("MetersFromYou2", R.string.MetersFromYou2, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
                }
                return formatString("MetersAway2", R.string.MetersAway2, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
            }
            String str = f10 % 1000.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f10 / 1000.0f))) : String.format("%.2f", Float.valueOf(f10 / 1000.0f));
            if (i10 != 0) {
                return i10 != 1 ? formatString("KMetersShort", R.string.KMetersShort, str) : formatString("KMetersFromYou2", R.string.KMetersFromYou2, str);
            }
            return formatString("KMetersAway2", R.string.KMetersAway2, str);
        }
        float f11 = f10 * 3.28084f;
        if (f11 < 1000.0f) {
            if (i10 != 0) {
                return i10 != 1 ? formatString("FootsShort", R.string.FootsShort, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11)))) : formatString("FootsFromYou", R.string.FootsFromYou, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11))));
            }
            return formatString("FootsAway", R.string.FootsAway, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f11))));
        }
        String str2 = f11 % 5280.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f11 / 5280.0f))) : String.format("%.2f", Float.valueOf(f11 / 5280.0f));
        if (i10 != 0) {
            return i10 != 1 ? formatString("MilesShort", R.string.MilesShort, str2) : formatString("MilesFromYou", R.string.MilesFromYou, str2);
        }
        return formatString("MilesAway", R.string.MilesAway, str2);
    }

    public static String formatEntityFormattedDate(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, boolean z10) {
        return formatEntityFormattedDate(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), z10);
    }

    public static String formatPluralStringComma(String str, int i10, Object... objArr) {
        return formatPluralStringComma(str, i10, ',', objArr);
    }

    public static String formatPluralStringSpaced(String str, int i10, Object... objArr) {
        return formatPluralStringComma(str, i10, ' ', objArr);
    }

    public static String formatSmallDateChat(long j10, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j11 = j10 * 1000;
            calendar.setTimeInMillis(j11);
            if (!z10 && i10 == calendar.get(1)) {
                return getInstance().getFormatterDayMonth().format(j11);
            }
            return getInstance().getFormatterDayMonth().format(j11) + ", " + calendar.get(1);
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String formatStartsTime(long j10, int i10, boolean z10) {
        int i11;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i12 = calendar.get(1);
        int i13 = calendar.get(6);
        calendar.setTimeInMillis(j10 * 1000);
        int i14 = calendar.get(1);
        int i15 = calendar.get(6);
        if (i12 == i14) {
            i11 = (z10 && i15 == i13) ? 0 : 1;
        } else {
            i11 = 2;
        }
        if (i10 == 1) {
            i11 += 3;
        } else if (i10 == 2) {
            i11 += 6;
        } else if (i10 == 3) {
            i11 += 9;
        } else if (i10 == 4) {
            i11 += 12;
        }
        return getInstance().getFormatterScheduleSend(i11).format(calendar.getTimeInMillis());
    }

    public static String formatUserStatus(int i10, TLRPC.User user, boolean[] zArr) {
        return formatUserStatus(i10, user, zArr, null);
    }

    public static String getCountryName(String str, int i10) {
        if (str != null && str.equalsIgnoreCase("ft")) {
            return getString(i10);
        }
        try {
            return new Locale("", str).getDisplayCountry(getInstance().getCurrentLocale());
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static CharSequence getCountryWithFlag(String str, int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = getLanguageFlag(str);
        if (!TextUtils.isEmpty(languageFlag)) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
        }
        String countryName = getCountryName(str, i11);
        if (TextUtils.isEmpty(countryName)) {
            spannableStringBuilder.append((CharSequence) str);
        } else {
            spannableStringBuilder.append((CharSequence) countryName);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(i10));
        return Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), true);
    }

    private HashMap<String, String> getLocaleFileStrings(File file, boolean z10) throws Throwable {
        this.reloadLastFile = false;
        FileLog.d("getLocaleFileStrings: reloadLastFile = false");
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!file.exists()) {
                    return new HashMap<>();
                }
                HashMap<String, String> map = new HashMap<>(10000);
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    xmlPullParserNewPullParser.setInput(fileInputStream2, "UTF-8");
                    String attributeValue = null;
                    String name = null;
                    String text = null;
                    for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                        if (eventType == 2) {
                            name = xmlPullParserNewPullParser.getName();
                            if (xmlPullParserNewPullParser.getAttributeCount() > 0) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(0);
                            }
                        } else if (eventType == 4) {
                            if (attributeValue != null && (text = xmlPullParserNewPullParser.getText()) != null) {
                                String strTrim = text.trim();
                                if (z10) {
                                    text = strTrim.replace("<", "&lt;").replace(">", "&gt;").replace("'", "\\'").replace("& ", "&amp; ");
                                } else {
                                    String strReplace = strTrim.replace("\\n", "\n").replace("\\", "");
                                    text = strReplace.replace("&lt;", "<");
                                    if (!this.reloadLastFile && !text.equals(strReplace)) {
                                        this.reloadLastFile = true;
                                        FileLog.d("getLocaleFileStrings: value != old, reloadLastFile = true;");
                                    }
                                }
                            }
                        } else if (eventType == 3) {
                            attributeValue = null;
                            name = null;
                            text = null;
                        }
                        if (name != null && name.equals("string") && text != null && attributeValue != null && text.length() != 0 && attributeValue.length() != 0) {
                            map.put(attributeValue, text);
                            attributeValue = null;
                            name = null;
                            text = null;
                        }
                    }
                    try {
                        fileInputStream2.close();
                        return map;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return map;
                    }
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    try {
                        File file2 = new File(ApplicationLoader.getFilesDirFixed(), "malformed_locales/");
                        file2.mkdirs();
                        AndroidUtilities.copyFile(file, new File(file2, file.getName()));
                    } catch (Exception unused) {
                    }
                    FileLog.e(e);
                    FileLog.d("getLocaleFileStrings: error, reloadLastFile = true;");
                    this.reloadLastFile = true;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    return new HashMap<>();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    private String getStringInternal(String str, String str2, int i10, int i11) {
        String strB = BuildVars.USE_CLOUD_STRINGS ? this.localizationExternal.b(str) : null;
        if (strB == null) {
            if (BuildVars.USE_CLOUD_STRINGS && str2 != null) {
                strB = this.localizationExternal.b(str2);
            }
            if (strB == null) {
                try {
                    strB = getLocalizedString(i11);
                } catch (Exception e9) {
                    if (i10 != 0) {
                        try {
                            strB = getLocalizedString(i10);
                        } catch (Exception unused) {
                        }
                    }
                    FileLog.e(e9);
                }
            }
        }
        return strB == null ? s3.c.e("LOC_ERR:", str) : strB;
    }

    public int applyLanguage(LocaleInfo localeInfo, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Runnable runnable) {
        char c10;
        int i11;
        int iApplyRemoteLanguage;
        boolean z14;
        int i12;
        boolean z15;
        String[] strArrSplit;
        Locale locale;
        String[] strArr;
        boolean z16;
        LocaleController localeController = this;
        LocaleInfo localeInfo2 = localeInfo;
        if (localeInfo2 == null) {
            return 0;
        }
        boolean zHasBaseLang = localeInfo2.hasBaseLang();
        File pathToFile = localeInfo2.getPathToFile();
        File pathToBaseFile = localeInfo2.getPathToBaseFile();
        if (!z11) {
            ConnectionsManager.setLangCode(localeInfo2.getLangCode());
        }
        if (localeController.getLanguageFromDict(localeInfo2.getKey()) == null) {
            if (localeInfo2.isRemote()) {
                localeController.remoteLanguages.add(localeInfo2);
                localeController.remoteLanguagesDict.put(localeInfo2.getKey(), localeInfo2);
                localeController.languages.add(localeInfo2);
                localeController.languagesDict.put(localeInfo2.getKey(), localeInfo2);
                localeController.saveOtherLanguages();
            } else if (localeInfo2.isUnofficial()) {
                localeController.unofficialLanguages.add(localeInfo2);
                localeController.languagesDict.put(localeInfo2.getKey(), localeInfo2);
                localeController.saveOtherLanguages();
            }
        }
        if ((localeInfo2.isRemote() || localeInfo2.isUnofficial()) && (z13 || !pathToFile.exists() || (zHasBaseLang && !pathToBaseFile.exists()))) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reload locale because one of file doesn't exist " + pathToFile + " " + pathToBaseFile);
            }
            if (z11) {
                c10 = 0;
                AndroidUtilities.runOnUIThread(new h0(localeController, localeInfo2, i10, runnable, 5));
                localeController = this;
                localeInfo2 = localeInfo;
                i11 = i10;
                z14 = true;
                iApplyRemoteLanguage = 0;
            } else {
                c10 = 0;
                localeController = this;
                localeInfo2 = localeInfo;
                i11 = i10;
                iApplyRemoteLanguage = localeController.applyRemoteLanguage(localeInfo2, null, true, i11, runnable);
                z14 = true;
            }
        } else {
            i11 = i10;
            z14 = false;
            iApplyRemoteLanguage = 0;
            c10 = 0;
        }
        try {
            if (TextUtils.isEmpty(localeInfo2.pluralLangCode)) {
                strArrSplit = !TextUtils.isEmpty(localeInfo2.baseLangCode) ? localeInfo2.baseLangCode.split("_") : localeInfo2.shortName.split("_");
            } else {
                strArrSplit = localeInfo2.pluralLangCode.split("_");
            }
            i12 = iApplyRemoteLanguage;
            try {
                if (strArrSplit.length == 1) {
                    locale = new Locale(strArrSplit[c10]);
                    strArr = strArrSplit;
                } else {
                    strArr = strArrSplit;
                    locale = new Locale(strArrSplit[c10], strArr[1]);
                }
                if (z10) {
                    localeController.languageOverride = localeInfo2.shortName;
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.putString("language", localeInfo2.getKey());
                    editorEdit.commit();
                }
                if (pathToFile == null) {
                    localeController.localizationExternal = re.a.f46919b;
                    localeController.localizationExternalSize = 0;
                } else if (!z12) {
                    HashMap<String, String> localeFileStrings = localeController.getLocaleFileStrings(zHasBaseLang != 0 ? localeInfo2.getPathToBaseFile() : localeInfo2.getPathToFile());
                    if (zHasBaseLang) {
                        localeFileStrings.putAll(localeController.getLocaleFileStrings(localeInfo2.getPathToFile()));
                    }
                    n2.b0 b0Var = new n2.b0(17);
                    b0Var.c(localeFileStrings);
                    localeController.localizationExternal = new re.a(b0Var);
                    localeController.localizationExternalSize = localeController.calculateTranslatedCount(localeFileStrings);
                }
                localeController.currentLocale = locale;
                localeController.currentLocaleInfo = localeInfo2;
                FileLog.d("applyLanguage: currentLocaleInfo is set");
                if (!TextUtils.isEmpty(localeController.currentLocaleInfo.pluralLangCode)) {
                    localeController.currentPluralRules = localeController.allRules.get(localeController.currentLocaleInfo.pluralLangCode);
                }
                if (localeController.currentPluralRules == null) {
                    localeController.currentPluralRules = localeController.allRules.get(strArr[0]);
                }
                if (localeController.currentPluralRules == null) {
                    localeController.currentPluralRules = localeController.allRules.get(localeController.currentLocale.getLanguage());
                }
                if (localeController.currentPluralRules == null) {
                    localeController.currentPluralRules = new PluralRules_None();
                }
                localeController.changingConfiguration = true;
                Locale.setDefault(localeController.currentLocale);
                Configuration configuration = new Configuration();
                configuration.locale = localeController.currentLocale;
                ApplicationLoader.applicationContext.getResources().updateConfiguration(configuration, ApplicationLoader.applicationContext.getResources().getDisplayMetrics());
                localeController.changingConfiguration = false;
                FileLog.d("applyLanguage: reloadLastFile=" + localeController.reloadLastFile + " force=" + z13 + " isLoadingRemote=" + z14);
                if (localeController.reloadLastFile || (!z14 && !z13 && localeController.shouldReinstallLangpack(localeInfo2.shortName))) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("reload locale because one of file is corrupted " + pathToFile + " " + pathToBaseFile + " reloadLastFile=" + localeController.reloadLastFile + " isLoadingRemote=" + z14 + " force=" + z13);
                    }
                    if (z11) {
                        AndroidUtilities.runOnUIThread(new k5(localeController, i11, 0));
                    } else {
                        localeController.reloadCurrentRemoteLocale(i11, null, true, null);
                    }
                    localeController.reloadLastFile = false;
                    FileLog.d("reloadLastFile=false");
                }
                if (!z14) {
                    if (z11) {
                        AndroidUtilities.runOnUIThread(new w1(11));
                        z16 = false;
                    } else {
                        z16 = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInterface, new Object[0]);
                    }
                    a31.f36361s = z16;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                z15 = false;
            } catch (Exception e9) {
                e = e9;
                FileLog.e(e);
                z15 = false;
                localeController.changingConfiguration = false;
            }
        } catch (Exception e10) {
            e = e10;
            i12 = iApplyRemoteLanguage;
        }
        localeController.recreateFormatters();
        if (z13) {
            MediaDataController.getInstance(i11).loadAttachMenuBots(z15, true);
        }
        return i12;
    }

    public String formatCurrencyString(long j10, boolean z10, boolean z11, boolean z12, String str) {
        double d;
        int length;
        String upperCase = str.toUpperCase();
        boolean z13 = j10 < 0;
        long jAbs = Math.abs(j10);
        Currency currency = Currency.getInstance(upperCase);
        upperCase.getClass();
        byte b10 = -1;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    b10 = 0;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    b10 = 1;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    b10 = 2;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    b10 = 3;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    b10 = 4;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    b10 = 5;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    b10 = 6;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    b10 = 7;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    b10 = 8;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    b10 = 9;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    b10 = 10;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    b10 = 11;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    b10 = 12;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    b10 = 13;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    b10 = 14;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    b10 = 15;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    b10 = 16;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    b10 = 17;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    b10 = 18;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    b10 = 19;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    b10 = 20;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    b10 = 21;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    b10 = 22;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    b10 = 23;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    b10 = 24;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    b10 = 25;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    b10 = 26;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    b10 = 27;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    b10 = 28;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    b10 = 29;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    b10 = 30;
                }
                break;
        }
        String str2 = " %.2f";
        switch (b10) {
            case 0:
            case 8:
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = jAbs / 1000.0d;
                str2 = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 13:
            case 14:
            case 17:
            case 20:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                d = jAbs;
                str2 = " %.0f";
                break;
            case 3:
                d = jAbs / 10000.0d;
                str2 = " %.4f";
                break;
            case 9:
                double d10 = jAbs / 100.0f;
                if (z10 && jAbs % 100 == 0) {
                    str2 = " %.0f";
                }
                d = d10;
                break;
            case 18:
                d = jAbs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = jAbs / 100.0d;
                break;
        }
        String str3 = z11 ? str2 : " %.0f";
        if (currency == null) {
            return (z13 ? "-" : "").concat(String.format(Locale.US, upperCase.concat(str3), Double.valueOf(d)));
        }
        Locale locale = this.currentLocale;
        if (locale == null) {
            locale = this.systemDefaultLocale;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        if (z12) {
            currencyInstance.setGroupingUsed(false);
        }
        if (!z11 || (z10 && upperCase.equals("IRR"))) {
            currencyInstance.setMaximumFractionDigits(0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z13 ? "-" : "");
        sb2.append(currencyInstance.format(d));
        String string = sb2.toString();
        int iIndexOf = string.indexOf(upperCase);
        if (iIndexOf < 0 || (length = upperCase.length() + iIndexOf) >= string.length() || string.charAt(length) == ' ') {
            return string;
        }
        return string.substring(0, length) + " " + string.substring(length);
    }

    public String getTranslitString(String str, boolean z10) {
        return getTranslitString(str, true, z10);
    }

    public void loadRemoteLanguages(final int i10, final boolean z10) {
        if (this.loadingRemoteLanguages) {
            return;
        }
        this.loadingRemoteLanguages = true;
        ConnectionsManager.getInstance(i10).sendRequest(new TLRPC.TL_langpack_getLanguages(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f20835a.lambda$loadRemoteLanguages$12(z10, i10, tLObject, tL_error);
            }
        }, 8);
    }

    private static String formatEntityFormattedDate(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j10, Locale locale, boolean z10) {
        String str;
        String string;
        String str2;
        long j11 = ((long) tL_messageEntityFormattedDate.date) * 1000;
        if (tL_messageEntityFormattedDate.relative && !z10) {
            return formatEntityFormattedDateRelative(j11, j10, locale);
        }
        boolean z11 = (tL_messageEntityFormattedDate.flags == 0) | z10;
        String str3 = "";
        String str4 = tL_messageEntityFormattedDate.day_of_week ? getInstance().getFormatterWeekLong().format(j11) : "";
        if (z11) {
            str = getInstance().getFormatterGiveawayCard().format(j11);
        } else if (tL_messageEntityFormattedDate.long_date) {
            str = getInstance().getChatFullDate().format(j11);
        } else {
            str = tL_messageEntityFormattedDate.short_date ? getInstance().getFormatterYear().format(j11) : "";
        }
        if (z11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            if (calendar.get(13) != 0) {
                str2 = getInstance().getFormatterDayWithSeconds().format(j11);
            } else {
                str2 = getInstance().getFormatterDay().format(j11);
            }
            str3 = str2;
        } else if (tL_messageEntityFormattedDate.long_time) {
            str3 = getInstance().getFormatterDayWithSeconds().format(j11);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str3 = getInstance().getFormatterDay().format(j11);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str4);
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        boolean zIsEmpty3 = TextUtils.isEmpty(str3);
        if (zIsEmpty2 && zIsEmpty3) {
            return str4;
        }
        if (zIsEmpty2 || zIsEmpty3) {
            if (zIsEmpty2) {
                str = str3;
            }
            string = str;
        } else {
            string = formatString(R.string.formatDateAtTime, str, str3);
        }
        return !zIsEmpty ? formatString(R.string.RelativeDateFormatterWeek2, str4, string) : string;
    }

    public static String formatPluralStringComma(String str, int i10, char c10) {
        return formatPluralStringComma(str, i10, c10, new Object[0]);
    }

    public static String formatUserStatus(int i10, TLRPC.User user, boolean[] zArr, boolean[] zArr2) {
        TLRPC.UserStatus userStatus;
        TLRPC.UserStatus userStatus2;
        TLRPC.UserStatus userStatus3;
        if (user != null && (userStatus3 = user.status) != null && userStatus3.expires == 0) {
            if (userStatus3 instanceof TLRPC.TL_userStatusRecently) {
                userStatus3.expires = userStatus3.by_me ? -1000 : -100;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastWeek) {
                userStatus3.expires = userStatus3.by_me ? -1001 : -101;
            } else if (userStatus3 instanceof TLRPC.TL_userStatusLastMonth) {
                userStatus3.expires = userStatus3.by_me ? -1002 : -102;
            }
        }
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f22527id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return getString("Online", R.string.Online);
        }
        if (user != null && (userStatus = user.status) != null && userStatus.expires != 0 && !UserObject.isDeleted(user) && !(user instanceof TLRPC.TL_userEmpty)) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            int i11 = user.status.expires;
            if (i11 > currentTime) {
                if (zArr != null) {
                    zArr[0] = true;
                }
                return getString("Online", R.string.Online);
            }
            if (i11 == -1) {
                return getString("Invisible", R.string.Invisible);
            }
            if (i11 == -100 || i11 == -1000) {
                return getString("Lately", R.string.Lately);
            }
            if (i11 == -101 || i11 == -1001) {
                return getString("WithinAWeek", R.string.WithinAWeek);
            }
            if (i11 != -102 && i11 != -1002) {
                return formatDateOnline(i11, zArr2);
            }
            return getString("WithinAMonth", R.string.WithinAMonth);
        }
        return getString("ALongTimeAgo", R.string.ALongTimeAgo);
    }

    public String getTranslitString(String str, boolean z10, boolean z11) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (str == null) {
            return null;
        }
        if (this.ruTranslitChars == null) {
            HashMap<String, String> map = new HashMap<>(33);
            this.ruTranslitChars = map;
            map.put("а", "a");
            this.ruTranslitChars.put("б", "b");
            this.ruTranslitChars.put("в", "v");
            this.ruTranslitChars.put("г", "g");
            this.ruTranslitChars.put("д", "d");
            this.ruTranslitChars.put("е", "e");
            this.ruTranslitChars.put("ё", "yo");
            this.ruTranslitChars.put("ж", "zh");
            this.ruTranslitChars.put("з", "z");
            this.ruTranslitChars.put("и", "i");
            this.ruTranslitChars.put("й", "i");
            this.ruTranslitChars.put("к", "k");
            this.ruTranslitChars.put("л", "l");
            this.ruTranslitChars.put("м", "m");
            this.ruTranslitChars.put("н", "n");
            this.ruTranslitChars.put("о", "o");
            this.ruTranslitChars.put("п", "p");
            str5 = "r";
            this.ruTranslitChars.put("р", str5);
            this.ruTranslitChars.put("с", "s");
            this.ruTranslitChars.put("т", "t");
            str2 = "u";
            this.ruTranslitChars.put("у", str2);
            str3 = "s";
            this.ruTranslitChars.put("ф", "f");
            str4 = "h";
            this.ruTranslitChars.put("х", str4);
            str6 = "p";
            this.ruTranslitChars.put("ц", "ts");
            this.ruTranslitChars.put("ч", "ch");
            this.ruTranslitChars.put("ш", "sh");
            this.ruTranslitChars.put("щ", "sch");
            this.ruTranslitChars.put("ы", "i");
            this.ruTranslitChars.put("ь", "");
            this.ruTranslitChars.put("ъ", "");
            this.ruTranslitChars.put("э", "e");
            this.ruTranslitChars.put("ю", "yu");
            this.ruTranslitChars.put("я", "ya");
        } else {
            str2 = "u";
            str3 = "s";
            str4 = "h";
            str5 = "r";
            str6 = "p";
        }
        if (this.translitChars == null) {
            HashMap<String, String> map2 = new HashMap<>(488);
            this.translitChars = map2;
            map2.put("ȼ", "c");
            this.translitChars.put("ᶇ", "n");
            this.translitChars.put("ɖ", "d");
            this.translitChars.put("ỿ", "y");
            this.translitChars.put("ᴓ", "o");
            this.translitChars.put("ø", "o");
            this.translitChars.put("ḁ", "a");
            this.translitChars.put("ʯ", str4);
            this.translitChars.put("ŷ", "y");
            this.translitChars.put("ʞ", "k");
            this.translitChars.put("ừ", str2);
            String str7 = str2;
            this.translitChars.put("ꜳ", "aa");
            this.translitChars.put("ĳ", "ij");
            this.translitChars.put("ḽ", "l");
            this.translitChars.put("ɪ", "i");
            this.translitChars.put("ḇ", "b");
            this.translitChars.put("ʀ", str5);
            this.translitChars.put("ě", "e");
            this.translitChars.put("ﬃ", "ffi");
            this.translitChars.put("ơ", "o");
            this.translitChars.put("ⱹ", str5);
            this.translitChars.put("ồ", "o");
            this.translitChars.put("ǐ", "i");
            String str8 = str6;
            this.translitChars.put("ꝕ", str8);
            this.translitChars.put("ý", "y");
            this.translitChars.put("ḝ", "e");
            this.translitChars.put("ₒ", "o");
            this.translitChars.put("ⱥ", "a");
            this.translitChars.put("ʙ", "b");
            this.translitChars.put("ḛ", "e");
            this.translitChars.put("ƈ", "c");
            this.translitChars.put("ɦ", str4);
            this.translitChars.put("ᵬ", "b");
            String str9 = str4;
            String str10 = str3;
            this.translitChars.put("ṣ", str10);
            this.translitChars.put("đ", "d");
            this.translitChars.put("ỗ", "o");
            this.translitChars.put("ɟ", "j");
            this.translitChars.put("ẚ", "a");
            this.translitChars.put("ɏ", "y");
            this.translitChars.put("ʌ", "v");
            this.translitChars.put("ꝓ", str8);
            this.translitChars.put("ﬁ", "fi");
            this.translitChars.put("ᶄ", "k");
            this.translitChars.put("ḏ", "d");
            this.translitChars.put("ᴌ", "l");
            this.translitChars.put("ė", "e");
            this.translitChars.put("ᴋ", "k");
            this.translitChars.put("ċ", "c");
            this.translitChars.put("ʁ", str5);
            this.translitChars.put("ƕ", "hv");
            this.translitChars.put("ƀ", "b");
            this.translitChars.put("ṍ", "o");
            this.translitChars.put("ȣ", "ou");
            this.translitChars.put("ǰ", "j");
            this.translitChars.put("ᶃ", "g");
            this.translitChars.put("ṋ", "n");
            this.translitChars.put("ɉ", "j");
            this.translitChars.put("ǧ", "g");
            this.translitChars.put("ǳ", "dz");
            this.translitChars.put("ź", "z");
            this.translitChars.put("ꜷ", "au");
            this.translitChars.put("ǖ", str7);
            this.translitChars.put("ᵹ", "g");
            this.translitChars.put("ȯ", "o");
            this.translitChars.put("ɐ", "a");
            this.translitChars.put("ą", "a");
            this.translitChars.put("õ", "o");
            this.translitChars.put("ɻ", str5);
            this.translitChars.put("ꝍ", "o");
            this.translitChars.put("ǟ", "a");
            this.translitChars.put("ȴ", "l");
            this.translitChars.put("ʂ", str10);
            this.translitChars.put("ﬂ", "fl");
            this.translitChars.put("ȉ", "i");
            this.translitChars.put("ⱻ", "e");
            this.translitChars.put("ṉ", "n");
            this.translitChars.put("ï", "i");
            this.translitChars.put("ñ", "n");
            this.translitChars.put("ᴉ", "i");
            this.translitChars.put("ʇ", "t");
            this.translitChars.put("ẓ", "z");
            this.translitChars.put("ỷ", "y");
            this.translitChars.put("ȳ", "y");
            this.translitChars.put("ṩ", str10);
            this.translitChars.put("ɽ", str5);
            this.translitChars.put("ĝ", "g");
            this.translitChars.put("ᴝ", str7);
            this.translitChars.put("ḳ", "k");
            this.translitChars.put("ꝫ", "et");
            this.translitChars.put("ī", "i");
            this.translitChars.put("ť", "t");
            this.translitChars.put("ꜿ", "c");
            this.translitChars.put("ʟ", "l");
            this.translitChars.put("ꜹ", "av");
            this.translitChars.put("û", str7);
            this.translitChars.put("æ", "ae");
            this.translitChars.put("ă", "a");
            this.translitChars.put("ǘ", str7);
            this.translitChars.put("ꞅ", str10);
            this.translitChars.put("ᵣ", str5);
            this.translitChars.put("ᴀ", "a");
            this.translitChars.put("ƃ", "b");
            this.translitChars.put("ḩ", str9);
            this.translitChars.put("ṧ", str10);
            this.translitChars.put("ₑ", "e");
            this.translitChars.put("ʜ", str9);
            this.translitChars.put("ẋ", "x");
            this.translitChars.put("ꝅ", "k");
            this.translitChars.put("ḋ", "d");
            this.translitChars.put("ƣ", "oi");
            this.translitChars.put("ꝑ", str8);
            this.translitChars.put("ħ", str9);
            this.translitChars.put("ⱴ", "v");
            this.translitChars.put("ẇ", "w");
            this.translitChars.put("ǹ", "n");
            this.translitChars.put("ɯ", "m");
            this.translitChars.put("ɡ", "g");
            this.translitChars.put("ɴ", "n");
            this.translitChars.put("ᴘ", str8);
            this.translitChars.put("ᵥ", "v");
            this.translitChars.put("ū", str7);
            this.translitChars.put("ḃ", "b");
            this.translitChars.put("ṗ", str8);
            this.translitChars.put("å", "a");
            this.translitChars.put("ɕ", "c");
            this.translitChars.put("ọ", "o");
            this.translitChars.put("ắ", "a");
            this.translitChars.put("ƒ", "f");
            this.translitChars.put("ǣ", "ae");
            this.translitChars.put("ꝡ", "vy");
            this.translitChars.put("ﬀ", "ff");
            this.translitChars.put("ᶉ", str5);
            this.translitChars.put("ô", "o");
            this.translitChars.put("ǿ", "o");
            this.translitChars.put("ṳ", str7);
            this.translitChars.put("ȥ", "z");
            this.translitChars.put("ḟ", "f");
            this.translitChars.put("ḓ", "d");
            this.translitChars.put("ȇ", "e");
            this.translitChars.put("ȕ", str7);
            this.translitChars.put("ȵ", "n");
            this.translitChars.put("ʠ", "q");
            this.translitChars.put("ấ", "a");
            this.translitChars.put("ǩ", "k");
            this.translitChars.put("ĩ", "i");
            this.translitChars.put("ṵ", str7);
            this.translitChars.put("ŧ", "t");
            this.translitChars.put("ɾ", str5);
            this.translitChars.put("ƙ", "k");
            this.translitChars.put("ṫ", "t");
            this.translitChars.put("ꝗ", "q");
            this.translitChars.put("ậ", "a");
            this.translitChars.put("ʄ", "j");
            this.translitChars.put("ƚ", "l");
            this.translitChars.put("ᶂ", "f");
            this.translitChars.put("ᵴ", str10);
            this.translitChars.put("ꞃ", str5);
            this.translitChars.put("ᶌ", "v");
            this.translitChars.put("ɵ", "o");
            this.translitChars.put("ḉ", "c");
            this.translitChars.put("ᵤ", str7);
            this.translitChars.put("ẑ", "z");
            this.translitChars.put("ṹ", str7);
            this.translitChars.put("ň", "n");
            this.translitChars.put("ʍ", "w");
            this.translitChars.put("ầ", "a");
            this.translitChars.put("ǉ", "lj");
            this.translitChars.put("ɓ", "b");
            this.translitChars.put("ɼ", str5);
            this.translitChars.put("ò", "o");
            this.translitChars.put("ẘ", "w");
            this.translitChars.put("ɗ", "d");
            this.translitChars.put("ꜽ", "ay");
            this.translitChars.put("ư", str7);
            this.translitChars.put("ᶀ", "b");
            this.translitChars.put("ǜ", str7);
            this.translitChars.put("ẹ", "e");
            this.translitChars.put("ǡ", "a");
            this.translitChars.put("ɥ", str9);
            this.translitChars.put("ṏ", "o");
            this.translitChars.put("ǔ", str7);
            this.translitChars.put("ʎ", "y");
            this.translitChars.put("ȱ", "o");
            this.translitChars.put("ệ", "e");
            this.translitChars.put("ế", "e");
            this.translitChars.put("ĭ", "i");
            this.translitChars.put("ⱸ", "e");
            this.translitChars.put("ṯ", "t");
            this.translitChars.put("ᶑ", "d");
            this.translitChars.put("ḧ", str9);
            this.translitChars.put("ṥ", str10);
            this.translitChars.put("ë", "e");
            this.translitChars.put("ᴍ", "m");
            this.translitChars.put("ö", "o");
            this.translitChars.put("é", "e");
            this.translitChars.put("ı", "i");
            this.translitChars.put("ď", "d");
            this.translitChars.put("ᵯ", "m");
            this.translitChars.put("ỵ", "y");
            this.translitChars.put("ŵ", "w");
            this.translitChars.put("ề", "e");
            this.translitChars.put("ứ", str7);
            this.translitChars.put("ƶ", "z");
            this.translitChars.put("ĵ", "j");
            this.translitChars.put("ḍ", "d");
            this.translitChars.put("ŭ", str7);
            this.translitChars.put("ʝ", "j");
            this.translitChars.put("ê", "e");
            this.translitChars.put("ǚ", str7);
            this.translitChars.put("ġ", "g");
            this.translitChars.put("ṙ", str5);
            this.translitChars.put("ƞ", "n");
            this.translitChars.put("ḗ", "e");
            this.translitChars.put("ẝ", str10);
            this.translitChars.put("ᶁ", "d");
            this.translitChars.put("ķ", "k");
            this.translitChars.put("ᴂ", "ae");
            this.translitChars.put("ɘ", "e");
            this.translitChars.put("ợ", "o");
            this.translitChars.put("ḿ", "m");
            this.translitChars.put("ꜰ", "f");
            this.translitChars.put("ẵ", "a");
            this.translitChars.put("ꝏ", "oo");
            this.translitChars.put("ᶆ", "m");
            this.translitChars.put("ᵽ", str8);
            this.translitChars.put("ữ", str7);
            this.translitChars.put("ⱪ", "k");
            this.translitChars.put("ḥ", str9);
            this.translitChars.put("ţ", "t");
            this.translitChars.put("ᵱ", str8);
            this.translitChars.put("ṁ", "m");
            this.translitChars.put("á", "a");
            this.translitChars.put("ᴎ", "n");
            this.translitChars.put("ꝟ", "v");
            this.translitChars.put("è", "e");
            this.translitChars.put("ᶎ", "z");
            this.translitChars.put("ꝺ", "d");
            this.translitChars.put("ᶈ", str8);
            this.translitChars.put("ɫ", "l");
            this.translitChars.put("ᴢ", "z");
            this.translitChars.put("ɱ", "m");
            this.translitChars.put("ṝ", str5);
            this.translitChars.put("ṽ", "v");
            this.translitChars.put("ũ", str7);
            this.translitChars.put("ß", "ss");
            this.translitChars.put("ĥ", str9);
            this.translitChars.put("ᵵ", "t");
            this.translitChars.put("ʐ", "z");
            this.translitChars.put("ṟ", str5);
            this.translitChars.put("ɲ", "n");
            this.translitChars.put("à", "a");
            this.translitChars.put("ẙ", "y");
            this.translitChars.put("ỳ", "y");
            this.translitChars.put("ᴔ", "oe");
            this.translitChars.put("ₓ", "x");
            this.translitChars.put("ȗ", str7);
            this.translitChars.put("ⱼ", "j");
            this.translitChars.put("ẫ", "a");
            this.translitChars.put("ʑ", "z");
            this.translitChars.put("ẛ", str10);
            this.translitChars.put("ḭ", "i");
            this.translitChars.put("ꜵ", "ao");
            this.translitChars.put("ɀ", "z");
            this.translitChars.put("ÿ", "y");
            this.translitChars.put("ǝ", "e");
            this.translitChars.put("ǭ", "o");
            this.translitChars.put("ᴅ", "d");
            this.translitChars.put("ᶅ", "l");
            this.translitChars.put("ù", str7);
            this.translitChars.put("ạ", "a");
            this.translitChars.put("ḅ", "b");
            this.translitChars.put("ụ", str7);
            this.translitChars.put("ằ", "a");
            this.translitChars.put("ᴛ", "t");
            this.translitChars.put("ƴ", "y");
            this.translitChars.put("ⱦ", "t");
            this.translitChars.put("ⱡ", "l");
            this.translitChars.put("ȷ", "j");
            this.translitChars.put("ᵶ", "z");
            this.translitChars.put("ḫ", str9);
            this.translitChars.put("ⱳ", "w");
            this.translitChars.put("ḵ", "k");
            this.translitChars.put("ờ", "o");
            this.translitChars.put("î", "i");
            this.translitChars.put("ģ", "g");
            this.translitChars.put("ȅ", "e");
            this.translitChars.put("ȧ", "a");
            this.translitChars.put("ẳ", "a");
            this.translitChars.put("ɋ", "q");
            this.translitChars.put("ṭ", "t");
            this.translitChars.put("ꝸ", "um");
            this.translitChars.put("ᴄ", "c");
            this.translitChars.put("ẍ", "x");
            this.translitChars.put("ủ", str7);
            this.translitChars.put("ỉ", "i");
            this.translitChars.put("ᴚ", str5);
            this.translitChars.put("ś", str10);
            this.translitChars.put("ꝋ", "o");
            this.translitChars.put("ỹ", "y");
            this.translitChars.put("ṡ", str10);
            this.translitChars.put("ǌ", "nj");
            this.translitChars.put("ȁ", "a");
            this.translitChars.put("ẗ", "t");
            this.translitChars.put("ĺ", "l");
            this.translitChars.put("ž", "z");
            this.translitChars.put("ᵺ", "th");
            this.translitChars.put("ƌ", "d");
            this.translitChars.put("ș", str10);
            this.translitChars.put("š", str10);
            this.translitChars.put("ᶙ", str7);
            this.translitChars.put("ẽ", "e");
            this.translitChars.put("ẜ", str10);
            this.translitChars.put("ɇ", "e");
            this.translitChars.put("ṷ", str7);
            this.translitChars.put("ố", "o");
            this.translitChars.put("ȿ", str10);
            this.translitChars.put("ᴠ", "v");
            this.translitChars.put("ꝭ", "is");
            this.translitChars.put("ᴏ", "o");
            this.translitChars.put("ɛ", "e");
            this.translitChars.put("ǻ", "a");
            this.translitChars.put("ﬄ", "ffl");
            this.translitChars.put("ⱺ", "o");
            this.translitChars.put("ȋ", "i");
            this.translitChars.put("ᵫ", "ue");
            this.translitChars.put("ȡ", "d");
            this.translitChars.put("ⱬ", "z");
            this.translitChars.put("ẁ", "w");
            this.translitChars.put("ᶏ", "a");
            this.translitChars.put("ꞇ", "t");
            this.translitChars.put("ğ", "g");
            this.translitChars.put("ɳ", "n");
            this.translitChars.put("ʛ", "g");
            this.translitChars.put("ᴜ", str7);
            this.translitChars.put("ẩ", "a");
            this.translitChars.put("ṅ", "n");
            this.translitChars.put("ɨ", "i");
            this.translitChars.put("ᴙ", str5);
            this.translitChars.put("ǎ", "a");
            this.translitChars.put("ſ", str10);
            this.translitChars.put("ȫ", "o");
            this.translitChars.put("ɿ", str5);
            this.translitChars.put("ƭ", "t");
            this.translitChars.put("ḯ", "i");
            this.translitChars.put("ǽ", "ae");
            this.translitChars.put("ⱱ", "v");
            this.translitChars.put("ɶ", "oe");
            this.translitChars.put("ṃ", "m");
            this.translitChars.put("ż", "z");
            this.translitChars.put("ĕ", "e");
            this.translitChars.put("ꜻ", "av");
            this.translitChars.put("ở", "o");
            this.translitChars.put("ễ", "e");
            this.translitChars.put("ɬ", "l");
            this.translitChars.put("ị", "i");
            this.translitChars.put("ᵭ", "d");
            this.translitChars.put("ﬆ", "st");
            this.translitChars.put("ḷ", "l");
            this.translitChars.put("ŕ", str5);
            this.translitChars.put("ᴕ", "ou");
            this.translitChars.put("ʈ", "t");
            this.translitChars.put("ā", "a");
            this.translitChars.put("ḙ", "e");
            this.translitChars.put("ᴑ", "o");
            this.translitChars.put("ç", "c");
            this.translitChars.put("ᶊ", str10);
            this.translitChars.put("ặ", "a");
            this.translitChars.put("ų", str7);
            this.translitChars.put("ả", "a");
            this.translitChars.put("ǥ", "g");
            this.translitChars.put("ꝁ", "k");
            this.translitChars.put("ẕ", "z");
            this.translitChars.put("ŝ", str10);
            this.translitChars.put("ḕ", "e");
            this.translitChars.put("ɠ", "g");
            this.translitChars.put("ꝉ", "l");
            this.translitChars.put("ꝼ", "f");
            this.translitChars.put("ᶍ", "x");
            this.translitChars.put("ǒ", "o");
            this.translitChars.put("ę", "e");
            this.translitChars.put("ổ", "o");
            this.translitChars.put("ƫ", "t");
            this.translitChars.put("ǫ", "o");
            this.translitChars.put("i̇", "i");
            this.translitChars.put("ṇ", "n");
            this.translitChars.put("ć", "c");
            this.translitChars.put("ᵷ", "g");
            this.translitChars.put("ẅ", "w");
            this.translitChars.put("ḑ", "d");
            this.translitChars.put("ḹ", "l");
            this.translitChars.put("œ", "oe");
            this.translitChars.put("ᵳ", str5);
            this.translitChars.put("ļ", "l");
            this.translitChars.put("ȑ", str5);
            this.translitChars.put("ȭ", "o");
            this.translitChars.put("ᵰ", "n");
            this.translitChars.put("ᴁ", "ae");
            this.translitChars.put("ŀ", "l");
            this.translitChars.put("ä", "a");
            this.translitChars.put("ƥ", str8);
            this.translitChars.put("ỏ", "o");
            this.translitChars.put("į", "i");
            this.translitChars.put("ȓ", str5);
            this.translitChars.put("ǆ", "dz");
            this.translitChars.put("ḡ", "g");
            this.translitChars.put("ṻ", str7);
            this.translitChars.put("ō", "o");
            this.translitChars.put("ľ", "l");
            this.translitChars.put("ẃ", "w");
            this.translitChars.put("ț", "t");
            this.translitChars.put("ń", "n");
            this.translitChars.put("ɍ", str5);
            this.translitChars.put("ȃ", "a");
            this.translitChars.put("ü", str7);
            this.translitChars.put("ꞁ", "l");
            this.translitChars.put("ᴐ", "o");
            this.translitChars.put("ớ", "o");
            this.translitChars.put("ᴃ", "b");
            this.translitChars.put("ɹ", str5);
            this.translitChars.put("ᵲ", str5);
            this.translitChars.put("ʏ", "y");
            this.translitChars.put("ᵮ", "f");
            this.translitChars.put("ⱨ", str9);
            this.translitChars.put("ŏ", "o");
            this.translitChars.put("ú", str7);
            this.translitChars.put("ṛ", str5);
            this.translitChars.put("ʮ", str9);
            this.translitChars.put("ó", "o");
            this.translitChars.put("ů", str7);
            this.translitChars.put("ỡ", "o");
            this.translitChars.put("ṕ", str8);
            this.translitChars.put("ᶖ", "i");
            this.translitChars.put("ự", str7);
            this.translitChars.put("ã", "a");
            this.translitChars.put("ᵢ", "i");
            this.translitChars.put("ṱ", "t");
            this.translitChars.put("ể", "e");
            this.translitChars.put("ử", str7);
            this.translitChars.put("í", "i");
            this.translitChars.put("ɔ", "o");
            this.translitChars.put("ɺ", str5);
            this.translitChars.put("ɢ", "g");
            this.translitChars.put("ř", str5);
            this.translitChars.put("ẖ", str9);
            this.translitChars.put("ű", str7);
            this.translitChars.put("ȍ", "o");
            this.translitChars.put("ḻ", "l");
            this.translitChars.put("ḣ", str9);
            this.translitChars.put("ȶ", "t");
            this.translitChars.put("ņ", "n");
            this.translitChars.put("ᶒ", "e");
            this.translitChars.put("ì", "i");
            this.translitChars.put("ẉ", "w");
            this.translitChars.put("ē", "e");
            this.translitChars.put("ᴇ", "e");
            this.translitChars.put("ł", "l");
            this.translitChars.put("ộ", "o");
            this.translitChars.put("ɭ", "l");
            this.translitChars.put("ẏ", "y");
            this.translitChars.put("ᴊ", "j");
            this.translitChars.put("ḱ", "k");
            this.translitChars.put("ṿ", "v");
            this.translitChars.put("ȩ", "e");
            this.translitChars.put("â", "a");
            this.translitChars.put("ş", str10);
            this.translitChars.put("ŗ", str5);
            this.translitChars.put("ʋ", "v");
            this.translitChars.put("ₐ", "a");
            this.translitChars.put("ↄ", "c");
            this.translitChars.put("ᶓ", "e");
            this.translitChars.put("ɰ", "m");
            this.translitChars.put("ᴡ", "w");
            this.translitChars.put("ȏ", "o");
            this.translitChars.put("č", "c");
            this.translitChars.put("ǵ", "g");
            this.translitChars.put("ĉ", "c");
            this.translitChars.put("ᶗ", "o");
            this.translitChars.put("ꝃ", "k");
            this.translitChars.put("ꝙ", "q");
            this.translitChars.put("ṑ", "o");
            this.translitChars.put("ꜱ", str10);
            this.translitChars.put("ṓ", "o");
            this.translitChars.put("ȟ", str9);
            this.translitChars.put("ő", "o");
            this.translitChars.put("ꜩ", "tz");
            this.translitChars.put("ẻ", "e");
            this.translitChars.put("і", "i");
            this.translitChars.put("ї", "i");
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        boolean z12 = false;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String strSubstring = str.substring(i10, i11);
            if (z11) {
                String lowerCase = strSubstring.toLowerCase();
                boolean z13 = !strSubstring.equals(lowerCase);
                strSubstring = lowerCase;
                z12 = z13;
            }
            String upperCase = this.translitChars.get(strSubstring);
            if (upperCase == null && z10) {
                upperCase = this.ruTranslitChars.get(strSubstring);
            }
            if (upperCase != null) {
                if (z11 && z12) {
                    if (upperCase.length() > 1) {
                        upperCase = upperCase.substring(0, 1).toUpperCase() + upperCase.substring(1);
                    } else {
                        upperCase = upperCase.toUpperCase();
                    }
                }
                sb2.append(upperCase);
            } else {
                if (z11) {
                    char cCharAt = strSubstring.charAt(0);
                    if ((cCharAt < 'a' || cCharAt > 'z' || cCharAt < '0' || cCharAt > '9') && cCharAt != ' ' && cCharAt != '\'' && cCharAt != ',' && cCharAt != '.' && cCharAt != '&' && cCharAt != '-' && cCharAt != '/') {
                        return null;
                    }
                    if (z12) {
                        strSubstring = strSubstring.toUpperCase();
                    }
                }
                sb2.append(strSubstring);
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public static String formatPluralStringComma(String str, int i10, char c10, Object... objArr) {
        if (str != null) {
            try {
                if (str.length() != 0 && getInstance().currentPluralRules != null) {
                    String str2 = str + "_" + getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10));
                    int i11 = 0;
                    StringBuilder sb2 = new StringBuilder(String.format("%d", Integer.valueOf(i10)));
                    for (int length = sb2.length() - 3; length > 0; length -= 3) {
                        sb2.insert(length, c10);
                    }
                    String strB = BuildVars.USE_CLOUD_STRINGS ? getInstance().localizationExternal.b(str2) : null;
                    if (strB == null) {
                        strB = BuildVars.USE_CLOUD_STRINGS ? getInstance().localizationExternal.b(str + "_other") : null;
                    }
                    if (strB == null) {
                        try {
                            strB = getInstance().getLocalizedString(getLocalizedStringByName(str2));
                        } catch (Exception unused) {
                        }
                    }
                    if (strB == null) {
                        strB = getInstance().getLocalizedString(getLocalizedStringByName(str + "_other"));
                    }
                    String strReplace = strB.replace("%d", "%1$s").replace("%1$d", "%1$s");
                    int length2 = (objArr == null ? 0 : objArr.length) + 1;
                    Object[] objArr2 = new Object[length2];
                    while (i11 < length2) {
                        objArr2[i11] = i11 == 0 ? sb2 : objArr[i11 - 1];
                        i11++;
                    }
                    if (getInstance().currentLocale != null) {
                        return String.format(getInstance().currentLocale, strReplace, objArr2);
                    }
                    return String.format(strReplace, objArr2);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return "LOC_ERR: " + str;
            }
        }
        return "LOC_ERR:" + str;
    }

    public static CharSequence formatSpannable(String str, int i10, Object... objArr) {
        return formatSpannable(str, null, i10, 0, objArr);
    }

    @Deprecated
    public static String formatString(String str, int i10, Object... objArr) {
        return formatString(str, null, i10, 0, objArr);
    }

    @Deprecated
    public static String getString(String str, int i10) {
        return getInstance().getStringInternal(str, i10);
    }

    private static CharSequence formatSpannable(String str, String str2, int i10, int i11, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        String str3;
        Object obj;
        CharSequence charSequence;
        String string;
        int iIndexOf;
        String str4;
        int iIndexOf2;
        try {
            String strB = BuildVars.USE_CLOUD_STRINGS ? getInstance().localizationExternal.b(str) : null;
            if (strB == null) {
                if (BuildVars.USE_CLOUD_STRINGS && str2 != null) {
                    strB = getInstance().localizationExternal.b(str2);
                }
                if (strB == null) {
                    try {
                        if (i10 != 0) {
                            try {
                                strB = getInstance().getLocalizedString(i10);
                            } catch (Exception unused) {
                                if (i11 != 0) {
                                    strB = getInstance().getLocalizedString(i11);
                                }
                                spannableStringBuilder = new SpannableStringBuilder(strB);
                                i12 = 0;
                                while (i12 < objArr.length) {
                                    str3 = "s";
                                    obj = objArr[i12];
                                    if (obj instanceof CharSequence) {
                                        charSequence = (CharSequence) obj;
                                    } else {
                                        if (obj instanceof Integer) {
                                            charSequence = "" + ((Integer) objArr[i12]);
                                        } else if (obj instanceof Long) {
                                            charSequence = "" + ((Long) objArr[i12]);
                                        } else if (obj == null) {
                                            charSequence = "null";
                                        } else {
                                            charSequence = "";
                                        }
                                        str3 = "d";
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("%");
                                    i12++;
                                    sb2.append(i12);
                                    sb2.append("$");
                                    sb2.append(str3);
                                    string = sb2.toString();
                                    iIndexOf = spannableStringBuilder.toString().indexOf(string);
                                    if (iIndexOf != -1) {
                                        spannableStringBuilder.replace(iIndexOf, string.length() + iIndexOf, charSequence);
                                    } else {
                                        str4 = "%" + str3;
                                        iIndexOf2 = spannableStringBuilder.toString().indexOf(str4);
                                        if (iIndexOf2 != -1) {
                                            spannableStringBuilder.replace(iIndexOf2, str4.length() + iIndexOf2, charSequence);
                                        }
                                    }
                                }
                                return spannableStringBuilder;
                            }
                        } else if (i11 != 0) {
                            strB = getInstance().getLocalizedString(i11);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            spannableStringBuilder = new SpannableStringBuilder(strB);
            i12 = 0;
            while (i12 < objArr.length) {
                str3 = "s";
                obj = objArr[i12];
                if (obj instanceof CharSequence) {
                    charSequence = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        charSequence = "" + ((Integer) objArr[i12]);
                    } else if (obj instanceof Long) {
                        charSequence = "" + ((Long) objArr[i12]);
                    } else if (obj == null) {
                        charSequence = "null";
                    } else {
                        charSequence = "";
                    }
                    str3 = "d";
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("%");
                i12++;
                sb3.append(i12);
                sb3.append("$");
                sb3.append(str3);
                string = sb3.toString();
                iIndexOf = spannableStringBuilder.toString().indexOf(string);
                if (iIndexOf != -1) {
                    spannableStringBuilder.replace(iIndexOf, string.length() + iIndexOf, charSequence);
                } else {
                    str4 = "%" + str3;
                    iIndexOf2 = spannableStringBuilder.toString().indexOf(str4);
                    if (iIndexOf2 != -1) {
                        spannableStringBuilder.replace(iIndexOf2, str4.length() + iIndexOf2, charSequence);
                    }
                }
            }
            return spannableStringBuilder;
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR: " + str;
        }
    }

    private static String formatString(String str, String str2, int i10, int i11, Object... objArr) {
        try {
            String strB = BuildVars.USE_CLOUD_STRINGS ? getInstance().localizationExternal.b(str) : null;
            if (strB == null) {
                if (BuildVars.USE_CLOUD_STRINGS && str2 != null) {
                    strB = getInstance().localizationExternal.b(str2);
                }
                if (strB == null) {
                    try {
                        if (i10 != 0) {
                            try {
                                strB = getInstance().getLocalizedString(i10);
                            } catch (Exception unused) {
                                if (i11 != 0) {
                                    strB = getInstance().getLocalizedString(i11);
                                }
                                if (getInstance().currentLocale != null) {
                                    return String.format(getInstance().currentLocale, strB, objArr);
                                }
                                return String.format(strB, objArr);
                            }
                        } else if (i11 != 0) {
                            strB = getInstance().getLocalizedString(i11);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            if (getInstance().currentLocale != null) {
                return String.format(getInstance().currentLocale, strB, objArr);
            }
            return String.format(strB, objArr);
        } catch (Exception e9) {
            FileLog.e(e9);
            return "LOC_ERR: " + str;
        }
    }

    @Deprecated
    public static String getString(String str) {
        if (TextUtils.isEmpty(str)) {
            return s3.c.e("LOC_ERR:", str);
        }
        int stringResId = getStringResId(str);
        if (stringResId != 0) {
            return getString(str, stringResId);
        }
        return getServerString(str);
    }
}
