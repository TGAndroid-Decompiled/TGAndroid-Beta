package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.Xml;
import j$.util.DesugarTimeZone;
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
import org.telegram.ui.Components.s51;
import org.telegram.ui.k41;
import org.xmlpull.v1.XmlPullParser;
public class LocaleController {
    private static volatile LocaleController Instance = null;
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
    private ji.b localizationExternal;
    private int localizationExternalSize;
    private volatile ji.b localizationInternal;
    private ji.b localizationInternalDefault;
    private volatile Locale localizationInternalLastLocale;
    private volatile boolean localizationInternalPending;
    private boolean reloadLastFile;
    private HashMap<String, String> ruTranslitChars;
    private Locale systemDefaultLocale;
    private HashMap<String, String> translitChars;
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
            String str2;
            String str3;
            LocaleInfo localeInfo = null;
            if (str != null && str.length() != 0) {
                String[] split = str.split("\\|");
                if (split.length >= 4) {
                    localeInfo = new LocaleInfo();
                    boolean z10 = false;
                    localeInfo.name = split[0];
                    localeInfo.nameEnglish = split[1];
                    localeInfo.shortName = split[2].toLowerCase();
                    localeInfo.pathToFile = split[3];
                    if (split.length >= 5) {
                        localeInfo.version = Utilities.parseInt((CharSequence) split[4]).intValue();
                    }
                    if (split.length >= 6) {
                        str2 = split[5];
                    } else {
                        str2 = "";
                    }
                    localeInfo.baseLangCode = str2;
                    if (split.length >= 7) {
                        str3 = split[6];
                    } else {
                        str3 = localeInfo.shortName;
                    }
                    localeInfo.pluralLangCode = str3;
                    if (split.length >= 8) {
                        if (Utilities.parseInt((CharSequence) split[7]).intValue() == 1) {
                            z10 = true;
                        }
                        localeInfo.isRtl = z10;
                    }
                    if (split.length >= 9) {
                        localeInfo.baseVersion = Utilities.parseInt((CharSequence) split[8]).intValue();
                    }
                    if (split.length >= 10) {
                        localeInfo.serverIndex = Utilities.parseInt((CharSequence) split[9]).intValue();
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
            if (str == null) {
                return "";
            }
            return str.replace("_", "-");
        }

        public String getKey() {
            if (this.pathToFile != null && !isRemote() && !isUnofficial()) {
                return "local_" + this.shortName;
            } else if (isUnofficial()) {
                return "unofficial_" + this.shortName;
            } else {
                return this.shortName;
            }
        }

        public String getLangCode() {
            return this.shortName.replace("_", "-");
        }

        public File getPathToBaseFile() {
            if (isUnofficial()) {
                return new File(ApplicationLoader.getFilesDirFixed(), a4.a.s(new StringBuilder("unofficial_base_"), this.shortName, ".xml"));
            }
            return null;
        }

        public File getPathToFile() {
            if (isRemote()) {
                return new File(ApplicationLoader.getFilesDirFixed(), a4.a.s(new StringBuilder("remote_"), this.shortName, ".xml"));
            }
            if (isUnofficial()) {
                return new File(ApplicationLoader.getFilesDirFixed(), a4.a.s(new StringBuilder("unofficial_"), this.shortName, ".xml"));
            }
            if (!TextUtils.isEmpty(this.pathToFile)) {
                return new File(this.pathToFile);
            }
            return null;
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
            if (isUnofficial() && !TextUtils.isEmpty(this.baseLangCode) && !this.baseLangCode.equals(this.shortName)) {
                return true;
            }
            return false;
        }

        public boolean isBuiltIn() {
            return this.builtIn;
        }

        public boolean isLocal() {
            if (!TextUtils.isEmpty(this.pathToFile) && !isRemote() && !isUnofficial()) {
                return true;
            }
            return false;
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
            if (i11 >= 3 && i11 <= 10) {
                return 8;
            }
            if (i11 >= 11 && i11 <= 99) {
                return 16;
            }
            return 0;
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
            if (i12 != 0) {
                if (i12 < 5 || i12 > 9) {
                    if (i11 < 11 || i11 > 14) {
                        return 0;
                    }
                    return 16;
                }
                return 16;
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
            if (i10 == 6) {
                return 16;
            }
            return 0;
        }
    }

    public static class PluralRules_Czech extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 >= 2 && i10 <= 4) {
                return 8;
            }
            return 0;
        }
    }

    public static class PluralRules_French extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 >= 0 && i10 < 2) {
                return 2;
            }
            return 0;
        }
    }

    public static class PluralRules_Langi extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 == 1) {
                return 2;
            }
            return 0;
        }
    }

    public static class PluralRules_Latvian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 0) {
                return 1;
            }
            if (i10 % 10 == 1 && i10 % 100 != 11) {
                return 2;
            }
            return 0;
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
            if (i12 >= 2 && i12 <= 9) {
                if (i11 < 11 || i11 > 19) {
                    return 8;
                }
                return 0;
            }
            return 0;
        }
    }

    public static class PluralRules_Macedonian extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 % 10 == 1 && i10 != 11) {
                return 2;
            }
            return 0;
        }
    }

    public static class PluralRules_Maltese extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            int i11 = i10 % 100;
            if (i10 == 1) {
                return 2;
            }
            if (i10 != 0) {
                if (i11 < 2 || i11 > 10) {
                    if (i11 >= 11 && i11 <= 19) {
                        return 16;
                    }
                    return 0;
                }
                return 8;
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
            if (i10 == 1) {
                return 2;
            }
            return 0;
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
            if (i12 < 0 || i12 > 1) {
                if (i12 < 5 || i12 > 9) {
                    if (i11 >= 12 && i11 <= 14) {
                        return 16;
                    }
                    return 0;
                }
                return 16;
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
                if (i11 < 1 || i11 > 19) {
                    return 0;
                }
                return 8;
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
            if (i12 >= 2 && i12 <= 4) {
                if (i11 < 12 || i11 > 14) {
                    return 8;
                }
                return 0;
            }
            return 0;
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
            if (i11 >= 3 && i11 <= 4) {
                return 8;
            }
            return 0;
        }
    }

    public static class PluralRules_Tachelhit extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 >= 0 && i10 <= 1) {
                return 2;
            }
            if (i10 >= 2 && i10 <= 10) {
                return 8;
            }
            return 0;
        }
    }

    public static class PluralRules_Two extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 4;
            }
            return 0;
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
            if (i10 == 6) {
                return 16;
            }
            return 0;
        }
    }

    public static class PluralRules_Zero extends PluralRules {
        @Override
        public int quantityForNumber(int i10) {
            if (i10 != 0 && i10 != 1) {
                return 0;
            }
            return 2;
        }
    }

    public static final class RelativeIcu {
        private RelativeIcu() {
        }

        public static String format(long j3, Locale locale) {
            boolean z10;
            RelativeDateTimeFormatter.RelativeUnit relativeUnit;
            RelativeDateTimeFormatter.Direction direction;
            RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(locale);
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long max = Math.max(1L, Math.round(Math.abs(j3) / 1000.0d));
            if (max < 60) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
            } else if (max < 3600) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MINUTES;
                max = Math.round(max / 60.0d);
            } else if (max < 86400) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.HOURS;
                max = Math.round(max / 3600.0d);
            } else if (max < 2592000) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.DAYS;
                max = Math.round(max / 86400.0d);
            } else if (max < 31536000) {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
                max = Math.round(max / 2592000.0d);
            } else {
                relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
                max = Math.round(max / 3.1536E7d);
            }
            if (z10) {
                direction = RelativeDateTimeFormatter.Direction.NEXT;
            } else {
                direction = RelativeDateTimeFormatter.Direction.LAST;
            }
            return relativeDateTimeFormatter.format(max, direction, relativeUnit);
        }
    }

    public class TimeZoneChangedReceiver extends BroadcastReceiver {
        private TimeZoneChangedReceiver() {
            LocaleController.this = r1;
        }

        public void lambda$onReceive$0() {
            if (!LocaleController.this.getFormatterDayMonth().getTimeZone().equals(TimeZone.getDefault())) {
                LocaleController.getInstance().recreateFormatters();
            }
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            ApplicationLoader.applicationHandler.post(new g1(this, 4));
        }
    }

    public LocaleController() {
        LocaleInfo localeInfo;
        boolean z10 = false;
        ji.b bVar = ji.b.f11947c;
        this.localizationInternal = bVar;
        this.localizationExternal = bVar;
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
        LocaleInfo localeInfo2 = new LocaleInfo();
        localeInfo2.name = "English";
        localeInfo2.nameEnglish = "English";
        localeInfo2.pluralLangCode = "en";
        localeInfo2.shortName = "en";
        localeInfo2.pathToFile = null;
        localeInfo2.builtIn = true;
        this.languages.add(localeInfo2);
        this.languagesDict.put(localeInfo2.shortName, localeInfo2);
        LocaleInfo localeInfo3 = new LocaleInfo();
        localeInfo3.name = "Italiano";
        localeInfo3.nameEnglish = "Italian";
        localeInfo3.pluralLangCode = "it";
        localeInfo3.shortName = "it";
        localeInfo3.pathToFile = null;
        localeInfo3.builtIn = true;
        this.languages.add(localeInfo3);
        this.languagesDict.put(localeInfo3.shortName, localeInfo3);
        LocaleInfo localeInfo4 = new LocaleInfo();
        localeInfo4.name = "Español";
        localeInfo4.nameEnglish = "Spanish";
        localeInfo4.pluralLangCode = "es";
        localeInfo4.shortName = "es";
        localeInfo4.builtIn = true;
        this.languages.add(localeInfo4);
        this.languagesDict.put(localeInfo4.shortName, localeInfo4);
        LocaleInfo localeInfo5 = new LocaleInfo();
        localeInfo5.name = "Deutsch";
        localeInfo5.nameEnglish = "German";
        localeInfo5.pluralLangCode = "de";
        localeInfo5.shortName = "de";
        localeInfo5.pathToFile = null;
        localeInfo5.builtIn = true;
        this.languages.add(localeInfo5);
        this.languagesDict.put(localeInfo5.shortName, localeInfo5);
        LocaleInfo localeInfo6 = new LocaleInfo();
        localeInfo6.name = "Nederlands";
        localeInfo6.nameEnglish = "Dutch";
        localeInfo6.pluralLangCode = "nl";
        localeInfo6.shortName = "nl";
        localeInfo6.pathToFile = null;
        localeInfo6.builtIn = true;
        this.languages.add(localeInfo6);
        this.languagesDict.put(localeInfo6.shortName, localeInfo6);
        LocaleInfo localeInfo7 = new LocaleInfo();
        localeInfo7.name = "العربية";
        localeInfo7.nameEnglish = "Arabic";
        localeInfo7.pluralLangCode = "ar";
        localeInfo7.shortName = "ar";
        localeInfo7.pathToFile = null;
        localeInfo7.builtIn = true;
        localeInfo7.isRtl = true;
        this.languages.add(localeInfo7);
        this.languagesDict.put(localeInfo7.shortName, localeInfo7);
        LocaleInfo localeInfo8 = new LocaleInfo();
        localeInfo8.name = "Português (Brasil)";
        localeInfo8.nameEnglish = "Portuguese (Brazil)";
        localeInfo8.pluralLangCode = "pt_br";
        localeInfo8.shortName = "pt_br";
        localeInfo8.pathToFile = null;
        localeInfo8.builtIn = true;
        this.languages.add(localeInfo8);
        this.languagesDict.put(localeInfo8.shortName, localeInfo8);
        LocaleInfo localeInfo9 = new LocaleInfo();
        localeInfo9.name = "한국어";
        localeInfo9.nameEnglish = "Korean";
        localeInfo9.pluralLangCode = "ko";
        localeInfo9.shortName = "ko";
        localeInfo9.pathToFile = null;
        localeInfo9.builtIn = true;
        this.languages.add(localeInfo9);
        this.languagesDict.put(localeInfo9.shortName, localeInfo9);
        LocaleInfo localeInfo10 = new LocaleInfo();
        localeInfo10.name = "Українська";
        localeInfo10.nameEnglish = "Ukrainian";
        localeInfo10.pluralLangCode = "uk";
        localeInfo10.shortName = "uk";
        localeInfo10.pathToFile = null;
        localeInfo10.builtIn = true;
        this.languages.add(localeInfo10);
        this.languagesDict.put(localeInfo10.shortName, localeInfo10);
        LocaleInfo localeInfo11 = new LocaleInfo();
        localeInfo11.name = "Русский";
        localeInfo11.nameEnglish = "Russian";
        localeInfo11.pluralLangCode = "ru";
        localeInfo11.shortName = "ru";
        localeInfo11.pathToFile = null;
        localeInfo11.builtIn = true;
        this.languages.add(localeInfo11);
        this.languagesDict.put(localeInfo11.shortName, localeInfo11);
        loadOtherLanguages();
        if (this.remoteLanguages.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable(this) {
                public final LocaleController f16283b;

                {
                    this.f16283b = this;
                }

                @Override
                public final void run() {
                    switch (r2) {
                        case 0:
                            this.f16283b.lambda$new$0();
                            return;
                        default:
                            this.f16283b.lambda$new$1();
                            return;
                    }
                }
            });
        }
        for (int i10 = 0; i10 < this.otherLanguages.size(); i10++) {
            LocaleInfo localeInfo12 = this.otherLanguages.get(i10);
            this.languages.add(localeInfo12);
            this.languagesDict.put(localeInfo12.getKey(), localeInfo12);
        }
        for (int i11 = 0; i11 < this.remoteLanguages.size(); i11++) {
            LocaleInfo localeInfo13 = this.remoteLanguages.get(i11);
            LocaleInfo languageFromDict = getLanguageFromDict(localeInfo13.getKey());
            if (languageFromDict != null) {
                languageFromDict.pathToFile = localeInfo13.pathToFile;
                languageFromDict.version = localeInfo13.version;
                languageFromDict.baseVersion = localeInfo13.baseVersion;
                languageFromDict.serverIndex = localeInfo13.serverIndex;
                this.remoteLanguages.set(i11, languageFromDict);
            } else {
                this.languages.add(localeInfo13);
                this.languagesDict.put(localeInfo13.getKey(), localeInfo13);
            }
        }
        for (int i12 = 0; i12 < this.unofficialLanguages.size(); i12++) {
            LocaleInfo localeInfo14 = this.unofficialLanguages.get(i12);
            LocaleInfo languageFromDict2 = getLanguageFromDict(localeInfo14.getKey());
            if (languageFromDict2 != null) {
                languageFromDict2.pathToFile = localeInfo14.pathToFile;
                languageFromDict2.version = localeInfo14.version;
                languageFromDict2.baseVersion = localeInfo14.baseVersion;
                languageFromDict2.serverIndex = localeInfo14.serverIndex;
                this.unofficialLanguages.set(i12, languageFromDict2);
            } else {
                this.languagesDict.put(localeInfo14.getKey(), localeInfo14);
            }
        }
        this.systemDefaultLocale = Locale.getDefault();
        is24HourFormat = DateFormat.is24HourFormat(ApplicationLoader.applicationContext);
        try {
            String string = MessagesController.getGlobalMainSettings().getString("language", null);
            if (string != null) {
                localeInfo = getLanguageFromDict(string);
                if (localeInfo != null) {
                    z10 = true;
                }
            } else {
                localeInfo = null;
            }
            if (localeInfo == null && this.systemDefaultLocale.getLanguage() != null) {
                localeInfo = getLanguageFromDict(this.systemDefaultLocale.getLanguage());
            }
            if (localeInfo == null && (localeInfo = getLanguageFromDict(getLocaleString(this.systemDefaultLocale))) == null) {
                localeInfo = getLanguageFromDict("en");
            }
            applyLanguage(localeInfo, z10, true, UserConfig.selectedAccount);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationLoader.applicationContext.registerReceiver(new TimeZoneChangedReceiver(), intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(new TimeZoneChangedReceiver(), intentFilter);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        AndroidUtilities.runOnUIThread(new Runnable(this) {
            public final LocaleController f16283b;

            {
                this.f16283b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16283b.lambda$new$0();
                        return;
                    default:
                        this.f16283b.lambda$new$1();
                        return;
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
            hc.b.q(i10, sb2);
            int[] iArr = {0};
            final f0 f0Var = new f0(new int[]{0}, iArr, runnable, 25);
            if (z10) {
                patched(localeInfo2.shortName);
            }
            if (localeInfo2.hasBaseLang() && (str == null || str.equals(localeInfo2.baseLangCode))) {
                if (localeInfo2.baseVersion != 0 && !z10) {
                    if (localeInfo2.hasBaseLang()) {
                        FileLog.d("applyRemoteLanguage getDifference of base");
                        TLRPC.TL_langpack_getDifference tL_langpack_getDifference = new TLRPC.TL_langpack_getDifference();
                        tL_langpack_getDifference.from_version = localeInfo2.baseVersion;
                        tL_langpack_getDifference.lang_code = localeInfo2.getBaseLangCode();
                        tL_langpack_getDifference.lang_pack = "";
                        iArr[0] = iArr[0] + 1;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference, new RequestDelegate(this) {
                            public final LocaleController f16198b;

                            {
                                this.f16198b = this;
                            }

                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                switch (r5) {
                                    case 0:
                                        this.f16198b.lambda$applyRemoteLanguage$15(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        return;
                                    case 1:
                                        this.f16198b.lambda$applyRemoteLanguage$17(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        return;
                                    case 2:
                                        this.f16198b.lambda$applyRemoteLanguage$19(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        return;
                                    default:
                                        this.f16198b.lambda$applyRemoteLanguage$21(localeInfo2, i10, f0Var, tLObject, tL_error);
                                        return;
                                }
                            }
                        }, 8);
                    }
                    localeInfo2 = localeInfo;
                } else {
                    FileLog.d("applyRemoteLanguage getLangPack of base");
                    TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack = new TLRPC.TL_langpack_getLangPack();
                    tL_langpack_getLangPack.lang_code = localeInfo.getBaseLangCode();
                    iArr[0] = iArr[0] + 1;
                    localeInfo2 = localeInfo;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack, new RequestDelegate(this) {
                        public final LocaleController f16198b;

                        {
                            this.f16198b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    this.f16198b.lambda$applyRemoteLanguage$15(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f16198b.lambda$applyRemoteLanguage$17(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f16198b.lambda$applyRemoteLanguage$19(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                                default:
                                    this.f16198b.lambda$applyRemoteLanguage$21(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                            }
                        }
                    }, 8);
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
                    return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getDifference2, new RequestDelegate(this) {
                        public final LocaleController f16198b;

                        {
                            this.f16198b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    this.f16198b.lambda$applyRemoteLanguage$15(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                                case 1:
                                    this.f16198b.lambda$applyRemoteLanguage$17(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                                case 2:
                                    this.f16198b.lambda$applyRemoteLanguage$19(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                                default:
                                    this.f16198b.lambda$applyRemoteLanguage$21(localeInfo2, i10, f0Var, tLObject, tL_error);
                                    return;
                            }
                        }
                    }, 8);
                }
                for (int i11 = 0; i11 < 4; i11++) {
                    ConnectionsManager.setLangCode(localeInfo.getLangCode());
                }
                FileLog.d("applyRemoteLanguage getLangPack");
                TLRPC.TL_langpack_getLangPack tL_langpack_getLangPack2 = new TLRPC.TL_langpack_getLangPack();
                tL_langpack_getLangPack2.lang_code = localeInfo.getLangCode();
                iArr[0] = iArr[0] + 1;
                return ConnectionsManager.getInstance(i10).sendRequest(tL_langpack_getLangPack2, new RequestDelegate(this) {
                    public final LocaleController f16198b;

                    {
                        this.f16198b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                this.f16198b.lambda$applyRemoteLanguage$15(localeInfo, i10, f0Var, tLObject, tL_error);
                                return;
                            case 1:
                                this.f16198b.lambda$applyRemoteLanguage$17(localeInfo, i10, f0Var, tLObject, tL_error);
                                return;
                            case 2:
                                this.f16198b.lambda$applyRemoteLanguage$19(localeInfo, i10, f0Var, tLObject, tL_error);
                                return;
                            default:
                                this.f16198b.lambda$applyRemoteLanguage$21(localeInfo, i10, f0Var, tLObject, tL_error);
                                return;
                        }
                    }
                }, 8);
            }
        }
        return 0;
    }

    public static CharSequence bold(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            ((Spannable) charSequence).setSpan(new s51(AndroidUtilities.bold()), 0, charSequence.length(), 33);
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, charSequence.length(), 33);
        return spannableStringBuilder;
    }

    private void checkLocalizationInternal() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.LocaleController.checkLocalizationInternal():void");
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
        if (useImperialSystemType == null) {
            int i10 = SharedConfig.distanceSystemType;
            boolean z10 = true;
            if (i10 == 0) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                    if (telephonyManager != null) {
                        String upperCase = telephonyManager.getSimCountryIso().toUpperCase();
                        if (!"US".equals(upperCase) && !"GB".equals(upperCase) && !"MM".equals(upperCase) && !"LR".equals(upperCase)) {
                            z10 = false;
                        }
                        useImperialSystemType = Boolean.valueOf(z10);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    useImperialSystemType = Boolean.FALSE;
                    FileLog.e(e);
                    return;
                }
            }
            if (i10 != 2) {
                z10 = false;
            }
            useImperialSystemType = Boolean.valueOf(z10);
        }
    }

    private String escapeString(String str) {
        if (str.contains("[CDATA")) {
            return str;
        }
        return str.replace("<", "&lt;").replace(">", "&gt;").replace("& ", "&amp; ");
    }

    public static String fixNumbers(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence);
        int length = sb2.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = sb2.charAt(i10);
            if ((charAt < '0' || charAt > '9') && charAt != '.' && charAt != ',') {
                int i11 = 0;
                while (i11 < otherNumbers.length) {
                    int i12 = 0;
                    while (true) {
                        char[] cArr = otherNumbers[i11];
                        if (i12 >= cArr.length) {
                            break;
                        } else if (charAt == cArr[i12]) {
                            sb2.setCharAt(i10, defaultNumbers[i12]);
                            i11 = otherNumbers.length;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
            }
        }
        return sb2.toString();
    }

    public static String formatCallDuration(int i10) {
        if (i10 > 3600) {
            String formatPluralString = formatPluralString("Hours", i10 / 3600, new Object[0]);
            int i11 = (i10 % 3600) / 60;
            if (i11 > 0) {
                StringBuilder g10 = w.f.g(formatPluralString, ", ");
                g10.append(formatPluralString("Minutes", i11, new Object[0]));
                return g10.toString();
            }
            return formatPluralString;
        } else if (i10 > 60) {
            return formatPluralString("Minutes", i10 / 60, new Object[0]);
        } else {
            return formatPluralString("Seconds", i10, new Object[0]);
        }
    }

    public static String formatDate(long j3) {
        return formatDate(j3, false);
    }

    public static String formatDateAudio(long j3, boolean z10) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                if (z10) {
                    return formatString(R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
                }
                return formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j10)));
            } else if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
                }
                return formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatDateCallLog(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return getInstance().getFormatterDay().format(new Date(j10));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.formatDateAtTime, getInstance().getChatDateShort().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.formatDateAtTime, getInstance().getChatFullDate().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatDateChat(long j3) {
        return formatDateChat(j3, false);
    }

    public static String formatDateForBan(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            if (i10 == calendar.get(1)) {
                return getInstance().getFormatterBannedUntilThisYear().format(new Date(j10));
            }
            return getInstance().getFormatterBannedUntil().format(new Date(j10));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatDateOnline(long j3, boolean[] zArr) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            int i12 = calendar.get(11);
            calendar.setTimeInMillis(j10);
            int i13 = calendar.get(6);
            int i14 = calendar.get(1);
            int i15 = calendar.get(11);
            if (i13 == i10 && i11 == i14) {
                return formatString(R.string.LastSeenFormatted, formatString("TodayAtFormatted", R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j10))));
            }
            if (i13 + 1 == i10 && i11 == i14) {
                if (zArr != null) {
                    zArr[0] = true;
                    if (i12 <= 6 && i15 > 18 && is24HourFormat) {
                        return formatString(R.string.LastSeenFormatted, getInstance().getFormatterDay().format(new Date(j10)));
                    }
                    return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
                }
                return formatString(R.string.LastSeenFormatted, formatString("YesterdayAtFormatted", R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10))));
            } else if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString("LastSeenDateFormatted", R.string.LastSeenDateFormatted, formatString("formatDateAtTime", R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10))));
            } else {
                return formatString("LastSeenDateFormatted", R.string.LastSeenDateFormatted, formatString("formatDateAtTime", R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10))));
            }
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatDateTime(long j3, boolean z10) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13 && z10) {
                return formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (i12 + 1 == i10 && i11 == i13 && z10) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.formatDateAtTime, getInstance().getChatDate().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.formatDateAtTime, getInstance().getChatFullDate().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatDistance(float f7, int i10) {
        return formatDistance(f7, i10, null);
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

    private static String formatEntityFormattedDateRelative(long j3, long j10, Locale locale) {
        long j11 = j3 - j10;
        if (Build.VERSION.SDK_INT >= 24) {
            return RelativeIcu.format(j11, locale);
        }
        return DateUtils.getRelativeTimeSpanString(j3, j10, 1000L, 262144).toString();
    }

    public static String formatImportedDate(long j3) {
        try {
            Date date = new Date(j3 * 1000);
            return String.format("%1$s, %2$s", getInstance().getFormatterYear().format(date), getInstance().getFormatterDay().format(date));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatJoined(long j3) {
        String formatString;
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                formatString = formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            } else {
                formatString = formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.ChannelOtherSubscriberJoined, formatString);
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatLocationLeftTime(int i10) {
        int i11;
        int i12;
        int i13 = (i10 / 60) / 60;
        int i14 = i10 - (i13 * 3600);
        int i15 = i14 / 60;
        int i16 = i14 - (i15 * 60);
        if (i13 != 0) {
            if (i15 > 30) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            return String.format("%dh", Integer.valueOf(i13 + i12));
        } else if (i15 != 0) {
            if (i16 > 30) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            return String.format("%d", Integer.valueOf(i15 + i11));
        } else {
            return String.format("%d", Integer.valueOf(i16));
        }
    }

    public static String formatLocationUpdateDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                int currentTime = ((int) (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - (j10 / 1000))) / 60;
                if (currentTime < 1) {
                    return getString(R.string.LocationUpdatedJustNow);
                }
                if (currentTime < 60) {
                    return formatPluralString("UpdatedMinutes", currentTime, new Object[0]);
                }
                return formatString(R.string.LocationUpdatedFormatted, formatString("TodayAtFormatted", R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j10))));
            } else if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.LocationUpdatedFormatted, formatString("YesterdayAtFormatted", R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10))));
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return formatString(R.string.LocationUpdatedFormatted, formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10))));
                }
                return formatString(R.string.LocationUpdatedFormatted, formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10))));
            }
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatNumber(long j3, char c10) {
        if (j3 < 0) {
            return hc.b.l(-j3, c10, new StringBuilder("-"));
        }
        StringBuilder sb2 = new StringBuilder(String.format("%d", Long.valueOf(j3)));
        for (int length = sb2.length() - 3; length > 0; length -= 3) {
            sb2.insert(length, c10);
        }
        return sb2.toString();
    }

    public static String formatNumberWithMillion(long j3, char c10) {
        if (j3 < 1000000) {
            return formatNumber(j3, c10);
        }
        return AndroidUtilities.formatWholeNumber((int) j3, 1000000);
    }

    public static CharSequence formatPluralSpannable(String str, int i10, CharSequence... charSequenceArr) {
        if (str != null && str.length() != 0 && getInstance().currentPluralRules != null) {
            String C = a4.a.C(str, "_", getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10)));
            int localizedStringByName = getLocalizedStringByName(C);
            int localizedStringByName2 = getLocalizedStringByName(str.concat("_other"));
            Object[] objArr = new Object[charSequenceArr.length + 1];
            objArr[0] = Integer.valueOf(i10);
            System.arraycopy(charSequenceArr, 0, objArr, 1, charSequenceArr.length);
            return formatSpannable(C, str.concat("_other"), localizedStringByName, localizedStringByName2, objArr);
        }
        return org.telegram.ui.Cells.r6.i("LOC_ERR:", str);
    }

    public static String formatPluralString(String str, int i10, Object... objArr) {
        if (str != null && str.length() != 0 && getInstance().currentPluralRules != null) {
            String C = a4.a.C(str, "_", getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10)));
            int localizedStringByName = getLocalizedStringByName(C);
            int localizedStringByName2 = getLocalizedStringByName(str.concat("_other"));
            Object[] objArr2 = new Object[objArr.length + 1];
            objArr2[0] = Integer.valueOf(i10);
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
            return formatString(C, str.concat("_other"), localizedStringByName, localizedStringByName2, objArr2);
        }
        return org.telegram.ui.Cells.r6.i("LOC_ERR:", str);
    }

    public static String formatPluralStringComma(String str, int i10) {
        return formatPluralStringComma(str, i10, ',');
    }

    public static String formatPluralStringSpaced(String str, int i10) {
        return formatPluralStringComma(str, i10, ' ');
    }

    public static String formatPmEditedDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmEditedTodayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmEditedYesterdayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.PmEditedDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.PmEditedDateTimeAt, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatPmFwdDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmFwdOriginalTodayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmFwdOriginalYesterdayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.PmFwdOriginalDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.PmFwdOriginalDateTimeAt, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatPmSeenDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmReadTodayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmReadYesterdayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.PmReadDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.PmReadDateTimeAt, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatPmSentDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.PmSentTodayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.PmSentYesterdayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.PmSentDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.PmSentDateTimeAt, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatPollEndTime(int i10, boolean z10) {
        String formatPluralString;
        int i11;
        if (i10 < 86400) {
            formatPluralString = formatShortDuration(i10);
        } else {
            formatPluralString = formatPluralString("Days", i10 / 86400, new Object[0]);
        }
        if (z10) {
            i11 = R.string.PollResultsIn;
        } else {
            i11 = R.string.PollEndsIn;
        }
        return formatString(i11, formatPluralString);
    }

    public static String formatRelativeDate(long j3) {
        try {
            long j10 = j3 / 60;
            long j11 = j10 / 60;
            long j12 = j11 / 24;
            long j13 = j12 / 30;
            long j14 = j12 / 365;
            int i10 = (j14 > 1L ? 1 : (j14 == 1L ? 0 : -1));
            if (i10 >= 0) {
                if (i10 == 0) {
                    return getString(R.string.YearAgo);
                }
                return formatPluralStringComma("YearsAgo", (int) j14);
            }
            int i11 = (j13 > 1L ? 1 : (j13 == 1L ? 0 : -1));
            if (i11 >= 0) {
                if (i11 == 0) {
                    return getString(R.string.MonthAgo);
                }
                return formatPluralStringComma("MonthsAgo", (int) j13);
            }
            int i12 = (j12 > 1L ? 1 : (j12 == 1L ? 0 : -1));
            if (i12 >= 0) {
                if (i12 == 0) {
                    return getString(R.string.DayAgo);
                }
                return formatPluralStringComma("DaysAgo", (int) j12);
            }
            int i13 = (j11 > 1L ? 1 : (j11 == 1L ? 0 : -1));
            if (i13 >= 0) {
                if (i13 == 0) {
                    return getString(R.string.HourAgo);
                }
                return formatPluralStringComma("HoursAgo", (int) j11);
            }
            int i14 = (j10 > 1L ? 1 : (j10 == 1L ? 0 : -1));
            if (i14 >= 0) {
                if (i14 == 0) {
                    return getString(R.string.MinuteAgo);
                }
                return formatPluralStringComma("MinutesAgo", (int) j10);
            }
            return getString(R.string.LessMinuteAgo);
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatSectionDate(long j3) {
        return formatYearMont(j3, false);
    }

    public static String formatSeenDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatShortDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j11 = timeInMillis - j10;
            if (j11 < 60000) {
                return getString(R.string.ShortNow);
            }
            if (j11 < 3600000) {
                return formatPluralString("ShortMinutesAgo", (int) (j11 / 60000), new Object[0]);
            }
            if (i12 == i10 && i11 == i13) {
                if (j11 < 43200000) {
                    return formatPluralString("ShortHoursAgo", (int) (j11 / 3600000), new Object[0]);
                }
                return getString(R.string.ShortToday);
            } else if (i12 + 1 == i10 && i11 == i13) {
                return getString(R.string.ShortYesterday);
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return getInstance().getFormatterDayMonth().format(new Date(j10));
                }
                return formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatShortDateTime(long j3) {
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return getInstance().getFormatterScheduleDay().format(new Date(j10)) + ", " + getInstance().getFormatterDay().format(new Date(j10));
            }
            return getInstance().getFormatterScheduleYear().format(new Date(j10)) + ", " + getInstance().getFormatterDay().format(new Date(j10));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatShortDuration(int i10) {
        String str;
        String str2;
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        StringBuilder sb2 = new StringBuilder();
        String str3 = "0";
        if (i11 > 0) {
            if (sb2.length() > 0) {
                sb2.append(":");
            }
            if (i11 < 10) {
                str2 = "0";
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(i11);
        }
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        if (i12 < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(i12);
        if (sb2.length() > 0) {
            sb2.append(":");
        }
        if (i13 >= 10) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(i13);
        return sb2.toString();
    }

    public static String formatShortDuration2(int i10) {
        int i11 = i10 / 60;
        int i12 = i10 / 3600;
        if (i12 > 0) {
            return formatPluralString("ShortHoursAgo", i12, new Object[0]) + " " + formatPluralString("ShortMinutesAgo", i11 % 60, new Object[0]);
        }
        return formatPluralString("ShortMinutesAgo", i11, new Object[0]);
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
            double d = (i11 / 10.0d) + i10;
            for (int i13 = 0; i13 < sb2.length(); i13++) {
                d *= 1000.0d;
            }
            iArr[0] = (int) d;
        }
        if (i11 != 0 && sb2.length() > 0) {
            if (sb2.length() == 2) {
                Locale locale = Locale.US;
                return i10 + "." + i11 + "M";
            }
            Locale locale2 = Locale.US;
            String sb3 = sb2.toString();
            return i10 + "." + i11 + sb3;
        } else if (sb2.length() == 2) {
            Locale locale3 = Locale.US;
            return a4.a.m(i10, "M");
        } else {
            Locale locale4 = Locale.US;
            return a4.a.m(i10, sb2.toString());
        }
    }

    public static String formatSmallDateChat(long j3) {
        return formatSmallDateChat(j3, false);
    }

    public static CharSequence formatSpannable(int i10, Object... objArr) {
        return formatSpannable(null, i10, objArr);
    }

    public static String formatStartsTime(long j3, int i10) {
        return formatStartsTime(j3, i10, true);
    }

    public static String formatStatusExpireDateTime(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return getInstance().getFormatterScheduleDay().format(new Date(j10));
            }
            return getInstance().getChatFullDate().format(new Date(j10));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatStoryDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            long j11 = timeInMillis - j10;
            if (j11 < 60000) {
                return getString(R.string.RightNow);
            }
            if (j11 < 3600000) {
                int i14 = (int) (j11 / 60000);
                return formatPluralString("MinutesAgo", i14, Integer.valueOf(i14));
            } else if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodayAtFormattedWithToday, getInstance().getFormatterDay().format(new Date(j10)));
            } else {
                if (i12 + 1 == i10 && i11 == i13) {
                    return formatString(R.string.YesterdayAtFormatted, getInstance().getFormatterDay().format(new Date(j10)));
                }
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return formatString(R.string.formatDateAtTime, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
                }
                return formatString(R.string.formatDateAtTime, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatString(int i10, Object... objArr) {
        return formatString(null, i10, objArr);
    }

    public static String formatStringSimple(String str, Object... objArr) {
        try {
            if (getInstance().currentLocale != null) {
                return String.format(getInstance().currentLocale, str, objArr);
            }
            return String.format(str, objArr);
        } catch (Exception e) {
            FileLog.e(e);
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
        if (i10 < 2678400) {
            int i11 = ((i10 / 60) / 60) / 24;
            if (i10 % 7 == 0) {
                return formatPluralString("Weeks", i11 / 7, new Object[0]);
            }
            return a4.a.C(formatPluralString("Weeks", i11 / 7, new Object[0]), " ", formatPluralString("Days", i11 % 7, new Object[0]));
        }
        return formatPluralString("Months", (((i10 / 60) / 60) / 24) / 30, new Object[0]);
    }

    public static String formatTodoCompletedDate(long j3) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                return formatString(R.string.TodoCompletedTodayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (i12 + 1 == i10 && i11 == i13) {
                return formatString(R.string.TodoCompletedYesterdayAt, getInstance().getFormatterDay().format(new Date(j10)));
            }
            if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                return formatString(R.string.TodoCompletedDateTimeAt, getInstance().getFormatterDayMonth().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
            }
            return formatString(R.string.TodoCompletedDateTimeAt, getInstance().getFormatterYear().format(new Date(j10)), getInstance().getFormatterDay().format(new Date(j10)));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatUserStatus(int i10, TLRPC.User user) {
        return formatUserStatus(i10, user, null);
    }

    public static String formatYearMont(long j3, boolean z10) {
        long j10 = 1000 * j3;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(1);
            int i12 = calendar.get(2);
            String[] strArr = {getString(R.string.January), getString(R.string.February), getString(R.string.March), getString(R.string.April), getString(R.string.May), getString(R.string.June), getString(R.string.July), getString(R.string.August), getString(R.string.September), getString(R.string.October), getString(R.string.November), getString(R.string.December)};
            if (i10 == i11 && !z10) {
                return strArr[i12];
            }
            return strArr[i12] + " " + i11;
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    public static String formatYearMonthDay(long j3, boolean z10) {
        long j10 = 1000 * j3;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(1);
            int i12 = calendar.get(2);
            int i13 = calendar.get(5);
            String[] strArr = {getString(R.string.January), getString(R.string.February), getString(R.string.March), getString(R.string.April), getString(R.string.May), getString(R.string.June), getString(R.string.July), getString(R.string.August), getString(R.string.September), getString(R.string.October), getString(R.string.November), getString(R.string.December)};
            if (i10 == i11 && !z10) {
                return strArr[i12] + " " + i13;
            }
            return strArr[i12] + " " + i13 + ", " + i11;
        } catch (Exception e) {
            FileLog.e(e);
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
        char c10 = 65535;
        switch (str.hashCode()) {
            case 65726:
                if (str.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (str.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (str.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (str.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (str.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (str.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (str.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (str.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (str.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72801:
                if (str.equals("ISK")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 73631:
                if (str.equals("JOD")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73683:
                if (str.equals("JPY")) {
                    c10 = 11;
                    break;
                }
                break;
            case 74532:
                if (str.equals("KMF")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74704:
                if (str.equals("KRW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74840:
                if (str.equals("KWD")) {
                    c10 = 14;
                    break;
                }
                break;
            case 75863:
                if (str.equals("LYD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 76263:
                if (str.equals("MGA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76618:
                if (str.equals("MRO")) {
                    c10 = 17;
                    break;
                }
                break;
            case 78388:
                if (str.equals("OMR")) {
                    c10 = 18;
                    break;
                }
                break;
            case 79710:
                if (str.equals("PYG")) {
                    c10 = 19;
                    break;
                }
                break;
            case 81569:
                if (str.equals("RWF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 83210:
                if (str.equals("TND")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83974:
                if (str.equals("UGX")) {
                    c10 = 22;
                    break;
                }
                break;
            case 84517:
                if (str.equals("UYI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 85132:
                if (str.equals("VND")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85367:
                if (str.equals("VUV")) {
                    c10 = 25;
                    break;
                }
                break;
            case 86653:
                if (str.equals("XAF")) {
                    c10 = 26;
                    break;
                }
                break;
            case 87087:
                if (str.equals("XOF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87118:
                if (str.equals("XPF")) {
                    c10 = 28;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case '\b':
            case '\n':
            case 14:
            case 15:
            case 18:
            case 21:
                return 1000;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\t':
            case 11:
            case '\f':
            case '\r':
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return 1;
            case 3:
                return 10000;
            case 17:
                return 10;
            default:
                return 100;
        }
    }

    public static String getCurrentLanguageName() {
        LocaleInfo localeInfo = getInstance().currentLocaleInfo;
        if (localeInfo != null && !TextUtils.isEmpty(localeInfo.name)) {
            return localeInfo.name;
        }
        return getString("LanguageName", R.string.LanguageName);
    }

    public static LocaleController getInstance() {
        LocaleController localeController;
        LocaleController localeController2 = Instance;
        if (localeController2 == null) {
            synchronized (LocaleController.class) {
                try {
                    localeController = Instance;
                    if (localeController == null) {
                        localeController = new LocaleController();
                        Instance = localeController;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return localeController;
        }
        return localeController2;
    }

    public static String getLanguageFlag(String str) {
        if (str.length() == 2 && !str.equals("YL")) {
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
        return null;
    }

    public static String getLocaleAlias(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3325:
                if (str.equals("he")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3365:
                if (str.equals("in")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374:
                if (str.equals("iw")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3391:
                if (str.equals("ji")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3404:
                if (str.equals("jv")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3405:
                if (str.equals("jw")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3508:
                if (str.equals("nb")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3521:
                if (str.equals("no")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3704:
                if (str.equals("tl")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 3856:
                if (str.equals("yi")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 101385:
                if (str.equals("fil")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "iw";
            case 1:
                return "in";
            case 2:
                return "id";
            case 3:
                return "he";
            case 4:
                return "yi";
            case 5:
                return "jw";
            case 6:
                return "jv";
            case 7:
                return "no";
            case '\b':
                return "nb";
            case '\t':
                return "fil";
            case '\n':
                return "ji";
            case 11:
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
        return this.localizationInternal.b(ApplicationLoader.applicationContext, i10);
    }

    private static int getLocalizedStringByName(String str) {
        return ApplicationLoader.applicationContext.getResources().getIdentifier(str, "string", ApplicationLoader.applicationContext.getPackageName());
    }

    public static String getPluralString(String str, int i10) {
        if (str != null && str.length() != 0 && getInstance().currentPluralRules != null) {
            String C = a4.a.C(str, "_", getInstance().stringForQuantity(getInstance().currentPluralRules.quantityForNumber(i10)));
            int localizedStringByName = getLocalizedStringByName(C);
            return getInstance().getStringInternal(C, str.concat("_other"), getLocalizedStringByName(str.concat("_other")), localizedStringByName);
        }
        return org.telegram.ui.Cells.r6.i("LOC_ERR:", str);
    }

    public static String getServerString(String str) {
        String str2;
        int localizedStringByName;
        ji.b bVar = getInstance().localizationExternal;
        bVar.getClass();
        if (str != null) {
            str2 = (String) bVar.f11948a.get(str.hashCode());
        } else {
            str2 = null;
        }
        if (str2 == null && (localizedStringByName = getLocalizedStringByName(str)) != 0) {
            return getInstance().getLocalizedString(localizedStringByName);
        }
        return str2;
    }

    public static String getString(int i10) {
        return getString(null, i10);
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
                return a4.a.C(displayName2, ", ", displayName);
            }
        }
        return displayName;
    }

    public static boolean getUseImperialSystemType() {
        ensureImperialSystemInit();
        return useImperialSystemType.booleanValue();
    }

    public static boolean isRTLCharacter(char c10) {
        if (Character.getDirectionality(c10) == 1 || Character.getDirectionality(c10) == 2 || Character.getDirectionality(c10) == 16 || Character.getDirectionality(c10) == 17) {
            return true;
        }
        return false;
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
        if (i10 >= iArr2[0] && runnable != null) {
            runnable.run();
        }
    }

    public void lambda$applyRemoteLanguage$15(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new n5(this, localeInfo, tLObject, i10, runnable, 3));
        }
    }

    public void lambda$applyRemoteLanguage$17(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new n5(this, localeInfo, tLObject, i10, runnable, 0));
        }
    }

    public void lambda$applyRemoteLanguage$19(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new n5(this, localeInfo, tLObject, i10, runnable, 2));
        }
    }

    public void lambda$applyRemoteLanguage$21(LocaleInfo localeInfo, int i10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new n5(this, localeInfo, tLObject, i10, runnable, 1));
        }
    }

    public void lambda$checkForcePatchLangpack$5(String str, Runnable runnable) {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("langpack_patched" + str, true).apply();
        if (runnable != null) {
            runnable.run();
        }
        this.patching = false;
    }

    public void lambda$checkForcePatchLangpack$6(String str, Runnable runnable) {
        AndroidUtilities.runOnUIThread(new q5(this, str, runnable, 1));
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
                hc.b.v(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
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
            AndroidUtilities.runOnUIThread(new z4(i10, 1, this, (Vector) tLObject, z10));
        }
    }

    public void lambda$new$0() {
        loadRemoteLanguages(UserConfig.selectedAccount);
    }

    public void lambda$new$1() {
        this.currentSystemLocale = getSystemLocaleStringIso639();
    }

    public void lambda$saveRemoteLocaleStrings$10(int i10, LocaleInfo localeInfo, TLRPC.TL_langPackDifference tL_langPackDifference, HashMap hashMap, Runnable runnable) {
        String[] split;
        Locale locale;
        if (i10 == 0) {
            localeInfo.version = tL_langPackDifference.version;
        } else {
            localeInfo.baseVersion = tL_langPackDifference.version;
        }
        saveOtherLanguages();
        try {
            if (this.currentLocaleInfo == localeInfo) {
                if (!TextUtils.isEmpty(localeInfo.pluralLangCode)) {
                    split = localeInfo.pluralLangCode.split("_");
                } else if (!TextUtils.isEmpty(localeInfo.baseLangCode)) {
                    split = localeInfo.baseLangCode.split("_");
                } else {
                    split = localeInfo.shortName.split("_");
                }
                if (split.length == 1) {
                    locale = new Locale(split[0]);
                } else {
                    locale = new Locale(split[0], split[1]);
                }
                this.languageOverride = localeInfo.shortName;
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putString("language", localeInfo.getKey());
                edit.commit();
                ?? obj = new Object();
                obj.a(hashMap);
                this.localizationExternal = new ji.b(obj);
                this.localizationExternalSize = calculateTranslatedCount(hashMap);
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
                k41.f34220s = false;
            } else {
                FileLog.d("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
            }
        } catch (Exception e) {
            FileLog.e(e);
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
                LocaleInfo createWithString = LocaleInfo.createWithString(str);
                if (createWithString != null) {
                    this.otherLanguages.add(createWithString);
                }
            }
        }
        String string2 = sharedPreferences.getString("remote", null);
        if (!TextUtils.isEmpty(string2)) {
            for (String str2 : string2.split("&")) {
                LocaleInfo createWithString2 = LocaleInfo.createWithString(str2);
                createWithString2.shortName = createWithString2.shortName.replace("-", "_");
                if (!this.remoteLanguagesDict.containsKey(createWithString2.getKey())) {
                    this.remoteLanguages.add(createWithString2);
                    this.remoteLanguagesDict.put(createWithString2.getKey(), createWithString2);
                }
            }
        }
        String string3 = sharedPreferences.getString("unofficial", null);
        if (!TextUtils.isEmpty(string3)) {
            for (String str3 : string3.split("&")) {
                LocaleInfo createWithString3 = LocaleInfo.createWithString(str3);
                if (createWithString3 != null) {
                    createWithString3.shortName = createWithString3.shortName.replace("-", "_");
                    this.unofficialLanguages.add(createWithString3);
                }
            }
        }
    }

    public static String nullable(String str) {
        if (str != null && !str.startsWith("LOC_ERR")) {
            return str;
        }
        return null;
    }

    private void patched(String str) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set as patched " + str + " langpack");
        }
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("lngpack_patched_" + str, true).apply();
    }

    public static void resetImperialSystemType() {
        useImperialSystemType = null;
    }

    private void saveOtherLanguages() {
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("langconfig", 0).edit();
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
        edit.putString("locales", sb2.toString());
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
        edit.putString("remote", sb2.toString());
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
        edit.putString("unofficial", sb2.toString());
        edit.commit();
    }

    private boolean shouldReinstallLangpack(String str) {
        int i10;
        int i11 = MessagesController.getInstance(UserConfig.selectedAccount).checkResetLangpack;
        if (i11 <= 0) {
            return false;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("lngpack_patched_" + str, false) || (i10 = this.localizationExternalSize) >= i11) {
            return false;
        }
        FileLog.e("reinstalling " + str + " langpack because of patch (" + i10 + " keys, must be at least " + i11 + ")");
        patched(str);
        return true;
    }

    public static String stringForMessageListDate(long j3) {
        long j10 = j3 * 1000;
        try {
            if (Math.abs(System.currentTimeMillis() - j10) >= 31536000000L) {
                return getInstance().getFormatterYear().format(new Date(j10));
            }
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            calendar.setTimeInMillis(j10);
            int i11 = calendar.get(6) - i10;
            if (i11 != 0 && (i11 != -1 || System.currentTimeMillis() - j10 >= 28800000)) {
                if (i11 > -7 && i11 <= -1) {
                    return getInstance().getFormatterWeek().format(new Date(j10));
                }
                return getInstance().getFormatterDayMonth().format(new Date(j10));
            }
            return getInstance().getFormatterDay().format(new Date(j10));
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR";
        }
    }

    private String stringForQuantity(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        if (i10 != 16) {
                            return "other";
                        }
                        return "many";
                    }
                    return "few";
                }
                return "two";
            }
            return "one";
        }
        return "zero";
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
                    ?? obj = new Object();
                    obj.a(localeFileStrings);
                    this.localizationExternal = new ji.b(obj);
                    this.localizationExternalSize = calculateTranslatedCount(localeFileStrings);
                    applyLanguage(localeInfo, true, false, true, false, i10, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public int calculateTranslatedCount(HashMap<String, String> hashMap) {
        String h;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (String str : hashMap.keySet()) {
            if (str != null) {
                if (str.endsWith("_other")) {
                    h = com.google.android.gms.internal.vision.e2.h(6, 0, str);
                } else if (!str.endsWith("_zero") && !str.endsWith("_many")) {
                    if (!str.endsWith("_one") && !str.endsWith("_two") && !str.endsWith("_few")) {
                        h = null;
                    } else {
                        h = com.google.android.gms.internal.vision.e2.h(4, 0, str);
                    }
                } else {
                    h = com.google.android.gms.internal.vision.e2.h(5, 0, str);
                }
                if (h != null) {
                    if (!hashSet.contains(h)) {
                        hashSet.add(h);
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
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("langpack_patched" + currentLanguageName, false) && !this.patching) {
                this.patching = true;
                reloadCurrentRemoteLocale(i10, null, true, new q5(this, currentLanguageName, runnable, 0));
            }
        }
    }

    public void checkPatchLangpack(int i10) {
        LocaleInfo localeInfo = this.currentLocaleInfo;
        if (localeInfo != null && !this.checkingUpdateForCurrentRemoteLocale && shouldReinstallLangpack(localeInfo.shortName)) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reload locale because locale file is not enough");
            }
            AndroidUtilities.runOnUIThread(new o5(this, i10, 1));
        }
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
                        applyRemoteLanguage(localeInfo2, localeInfo2.baseLangCode, false, i10, new o5(this, i10, 2));
                    } else {
                        FileLog.d("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + this.currentLocaleInfo.baseVersion + ", remote is " + i12 + ")");
                    }
                }
                if (this.currentLocaleInfo.version < i11) {
                    FileLog.d("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + this.currentLocaleInfo.version + ", remote is " + i11 + ")");
                    this.checkingUpdateForCurrentRemoteLocale = true;
                    LocaleInfo localeInfo3 = this.currentLocaleInfo;
                    applyRemoteLanguage(localeInfo3, localeInfo3.shortName, false, i10, new o5(this, i10, 3));
                    return;
                }
                FileLog.d("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + this.currentLocaleInfo.version + ", remote is " + i11 + ")");
            }
        }
    }

    public boolean deleteLanguage(LocaleInfo localeInfo, int i10) {
        LocaleInfo localeInfo2;
        if (localeInfo.pathToFile == null || (localeInfo.isRemote() && localeInfo.serverIndex != Integer.MAX_VALUE)) {
            return false;
        }
        if (this.currentLocaleInfo == localeInfo) {
            if (this.systemDefaultLocale.getLanguage() != null) {
                localeInfo2 = getLanguageFromDict(this.systemDefaultLocale.getLanguage());
            } else {
                localeInfo2 = null;
            }
            if (localeInfo2 == null) {
                localeInfo2 = getLanguageFromDict(getLocaleString(this.systemDefaultLocale));
            }
            if (localeInfo2 == null) {
                localeInfo2 = getLanguageFromDict("en");
            }
            applyLanguage(localeInfo2, true, false, i10);
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

    public String formatCurrencyDecimalString(long j3, String str, boolean z10) {
        double d;
        String upperCase = str.toUpperCase();
        long abs = Math.abs(j3);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
        }
        String str2 = " %.0f";
        switch (c10) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str2 = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
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
                d = abs;
                break;
            case 3:
                d = abs / 10000.0d;
                str2 = " %.4f";
                break;
            case '\t':
                double d10 = ((float) abs) / 100.0f;
                if (abs % 100 != 0) {
                    str2 = " %.2f";
                }
                d = d10;
                break;
            case 18:
                d = abs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = abs / 100.0d;
                str2 = " %.2f";
                break;
        }
        Locale locale = Locale.US;
        if (!z10) {
            upperCase = str2;
        }
        return String.format(locale, upperCase, Double.valueOf(d)).trim();
    }

    public String formatCurrencyString(long j3, String str) {
        return formatCurrencyString(j3, true, true, false, str);
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
                } finally {
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
                } finally {
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
                } finally {
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
        String str2;
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
                        String stringInternal = getStringInternal(str, i10);
                        if (is24HourFormat) {
                            str2 = "MMM dd yyyy, HH:mm";
                        } else {
                            str2 = "MMM dd yyyy, h:mm a";
                        }
                        this.formatterBannedUntil = createFormatter(locale, stringInternal, str2);
                    }
                } finally {
                }
            }
        }
        return this.formatterBannedUntil;
    }

    public FastDateFormat getFormatterBannedUntilThisYear() {
        String str;
        int i10;
        String str2;
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
                        String stringInternal = getStringInternal(str, i10);
                        if (is24HourFormat) {
                            str2 = "MMM dd, HH:mm";
                        } else {
                            str2 = "MMM dd, h:mm a";
                        }
                        this.formatterBannedUntilThisYear = createFormatter(locale, stringInternal, str2);
                    }
                } finally {
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
                } finally {
                }
            }
        }
        return this.formatterBoostExpired;
    }

    public FastDateFormat getFormatterConstDay() {
        String str;
        String str2;
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
                        if (z10) {
                            str = "HH:mm";
                        } else {
                            str = "h:mm a";
                        }
                        if (z10) {
                            str2 = "HH:mm";
                        } else {
                            str2 = "h:mm a";
                        }
                        this.formatterConstDay = createFormatter(locale, str, str2);
                    }
                } finally {
                }
            }
        }
        return this.formatterConstDay;
    }

    public FastDateFormat getFormatterDay() {
        String str;
        int i10;
        String str2;
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
                        String stringInternal = getStringInternal(str, i10);
                        if (is24HourFormat) {
                            str2 = "HH:mm";
                        } else {
                            str2 = "h:mm a";
                        }
                        this.formatterDay = createFormatter(locale, stringInternal, str2);
                    }
                } finally {
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
                } finally {
                }
            }
        }
        return this.formatterDayMonth;
    }

    public FastDateFormat getFormatterDayWithSeconds() {
        String str;
        int i10;
        String str2;
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
                        String stringInternal = getStringInternal(str, i10);
                        if (is24HourFormat) {
                            str2 = "HH:mm:ss";
                        } else {
                            str2 = "h:mm:ss a";
                        }
                        this.formatterDayWithSeconds = createFormatter(locale, stringInternal, str2);
                    }
                } finally {
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
                } finally {
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
                } finally {
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
                } finally {
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
                } finally {
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
                } finally {
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
                } finally {
                }
            }
        }
        return this.formatterScheduleDay;
    }

    public FastDateFormat getFormatterScheduleSend(int i10) {
        if (i10 >= 0) {
            FastDateFormat[] fastDateFormatArr = this.formatterScheduleSend;
            if (i10 < fastDateFormatArr.length) {
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
            return null;
        }
        return null;
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
                } finally {
                }
            }
        }
        return this.formatterScheduleYear;
    }

    public FastDateFormat getFormatterStats() {
        String str;
        int i10;
        String str2;
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
                        String stringInternal = getStringInternal(str, i10);
                        if (is24HourFormat) {
                            str2 = "MMM dd yyyy, HH:mm";
                        } else {
                            str2 = "MMM dd yyyy, h:mm a";
                        }
                        this.formatterStats = createFormatter(locale, stringInternal, str2);
                    }
                } finally {
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
                } finally {
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
                } finally {
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
                } finally {
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
                } finally {
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
        boolean z10;
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
        int i11 = 2;
        if ((lowerCase.length() != 2 || (!lowerCase.equals("ar") && !lowerCase.equals("fa") && !lowerCase.equals("he") && !lowerCase.equals("iw"))) && !lowerCase.startsWith("ar_") && !lowerCase.startsWith("fa_") && !lowerCase.startsWith("he_") && !lowerCase.startsWith("iw_") && ((localeInfo = this.currentLocaleInfo) == null || !localeInfo.isRtl)) {
            z10 = false;
        } else {
            z10 = true;
        }
        isRTL = z10;
        if (!lowerCase.equals("ko")) {
            i11 = 1;
        }
        nameDisplayOrder = i11;
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
            if (i10 < fastDateFormatArr.length) {
                fastDateFormatArr[i10] = null;
                i10++;
            } else {
                return;
            }
        }
    }

    public void reloadCurrentRemoteLocale(int i10, String str, boolean z10, Runnable runnable) {
        if (str != null) {
            str = str.replace("-", "_");
        }
        String str2 = str;
        if (str2 != null) {
            LocaleInfo localeInfo = this.currentLocaleInfo;
            if (localeInfo != null) {
                if (!str2.equals(localeInfo.shortName) && !str2.equals(this.currentLocaleInfo.baseLangCode)) {
                    return;
                }
            } else {
                return;
            }
        }
        applyRemoteLanguage(this.currentLocaleInfo, str2, z10, i10, runnable);
    }

    public void lambda$applyRemoteLanguage$20(LocaleInfo localeInfo, TLRPC.TL_langPackDifference tL_langPackDifference, int i10, Runnable runnable) {
        boolean z10;
        int i11;
        File pathToBaseFile;
        HashMap<String, String> localeFileStrings;
        File pathToFile;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z11 = true;
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty() && localeInfo != null && !localeInfo.isLocal()) {
            String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
            if (lowerCase.equals(localeInfo.shortName)) {
                i11 = 0;
            } else if (lowerCase.equals(localeInfo.baseLangCode)) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            if (i11 == -1) {
                StringBuilder v = a4.a.v("saveRemoteLocaleStrings: unknown language ", lowerCase, " (locale short=");
                v.append(localeInfo.shortName);
                v.append(", base=");
                v.append(localeInfo.baseLangCode);
                v.append(")");
                FileLog.d(v.toString());
                return;
            }
            if (i11 == 0) {
                pathToBaseFile = localeInfo.getPathToFile();
            } else {
                pathToBaseFile = localeInfo.getPathToBaseFile();
            }
            try {
                if (tL_langPackDifference.from_version == 0) {
                    FileLog.d("saveRemoteLocaleStrings: difference is straight from the beginning");
                    localeFileStrings = new HashMap<>();
                } else {
                    FileLog.d("saveRemoteLocaleStrings: difference is from version " + tL_langPackDifference.from_version + " ours " + localeInfo.version + " (base version " + localeInfo.baseLangCode + ")");
                    localeFileStrings = getLocaleFileStrings(pathToBaseFile, true);
                }
                for (int i12 = 0; i12 < tL_langPackDifference.strings.size(); i12++) {
                    TLRPC.LangPackString langPackString = tL_langPackDifference.strings.get(i12);
                    if (langPackString instanceof TLRPC.TL_langPackString) {
                        localeFileStrings.put(langPackString.key, escapeString(langPackString.value));
                    } else if (langPackString instanceof TLRPC.TL_langPackStringPluralized) {
                        String str6 = langPackString.key + "_zero";
                        String str7 = langPackString.zero_value;
                        String str8 = "";
                        if (str7 == null) {
                            str = "";
                        } else {
                            str = escapeString(str7);
                        }
                        localeFileStrings.put(str6, str);
                        String str9 = langPackString.key + "_one";
                        String str10 = langPackString.one_value;
                        if (str10 == null) {
                            str2 = "";
                        } else {
                            str2 = escapeString(str10);
                        }
                        localeFileStrings.put(str9, str2);
                        String str11 = langPackString.key + "_two";
                        String str12 = langPackString.two_value;
                        if (str12 == null) {
                            str3 = "";
                        } else {
                            str3 = escapeString(str12);
                        }
                        localeFileStrings.put(str11, str3);
                        String str13 = langPackString.key + "_few";
                        String str14 = langPackString.few_value;
                        if (str14 == null) {
                            str4 = "";
                        } else {
                            str4 = escapeString(str14);
                        }
                        localeFileStrings.put(str13, str4);
                        String str15 = langPackString.key + "_many";
                        String str16 = langPackString.many_value;
                        if (str16 == null) {
                            str5 = "";
                        } else {
                            str5 = escapeString(str16);
                        }
                        localeFileStrings.put(str15, str5);
                        String str17 = langPackString.key + "_other";
                        String str18 = langPackString.other_value;
                        if (str18 != null) {
                            str8 = escapeString(str18);
                        }
                        localeFileStrings.put(str17, str8);
                    } else if (langPackString instanceof TLRPC.TL_langPackStringDeleted) {
                        localeFileStrings.remove(langPackString.key);
                    }
                }
                FileLog.d("save locale file to " + pathToBaseFile);
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathToBaseFile));
                bufferedWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
                bufferedWriter.write("<resources>\n");
                for (Map.Entry<String, String> entry : localeFileStrings.entrySet()) {
                    bufferedWriter.write(String.format("<string name=\"%1$s\">%2$s</string>\n", entry.getKey(), entry.getValue()));
                }
                bufferedWriter.write("</resources>");
                bufferedWriter.close();
                boolean hasBaseLang = localeInfo.hasBaseLang();
                if (hasBaseLang) {
                    pathToFile = localeInfo.getPathToBaseFile();
                } else {
                    pathToFile = localeInfo.getPathToFile();
                }
                HashMap<String, String> localeFileStrings2 = getLocaleFileStrings(pathToFile);
                if (hasBaseLang) {
                    localeFileStrings2.putAll(getLocaleFileStrings(localeInfo.getPathToFile()));
                }
                FileLog.d("saved locale file to " + pathToBaseFile);
                AndroidUtilities.runOnUIThread(new w0(this, i11, localeInfo, tL_langPackDifference, localeFileStrings2, runnable, 1));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("saveRemoteLocaleStrings: empty difference=");
        if (tL_langPackDifference != null && !tL_langPackDifference.strings.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        sb2.append(z10);
        sb2.append("; locale is local or null=");
        if (localeInfo != null && !localeInfo.isLocal()) {
            z11 = false;
        }
        sb2.append(z11);
        FileLog.d(sb2.toString());
        recreateFormatters();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadInterface, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void saveRemoteLocaleStringsForCurrentLocale(TLRPC.TL_langPackDifference tL_langPackDifference, int i10) {
        if (this.currentLocaleInfo != null) {
            String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
            if (!lowerCase.equals(this.currentLocaleInfo.shortName) && !lowerCase.equals(this.currentLocaleInfo.baseLangCode)) {
                return;
            }
            lambda$applyRemoteLanguage$20(this.currentLocaleInfo, tL_langPackDifference, i10, null);
        }
    }

    public static String formatDate(long j3, boolean z10) {
        long j10 = j3 * 1000;
        try {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(6);
            int i11 = calendar.get(1);
            calendar.setTimeInMillis(j10);
            int i12 = calendar.get(6);
            int i13 = calendar.get(1);
            if (i12 == i10 && i11 == i13) {
                if (z10) {
                    return getString(R.string.ShortToday);
                }
                return getInstance().getFormatterDay().format(new Date(j10));
            } else if (i12 + 1 == i10 && i11 == i13) {
                return getString("Yesterday", R.string.Yesterday);
            } else {
                if (Math.abs(System.currentTimeMillis() - j10) < 31536000000L) {
                    return getInstance().getFormatterDayMonth().format(new Date(j10));
                }
                return getInstance().getFormatterYear().format(new Date(j10));
            }
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR: formatDate";
        }
    }

    public static String formatDateChat(long j3, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(j10);
            if ((z10 && i10 == calendar.get(1)) || (!z10 && Math.abs(System.currentTimeMillis() - j10) < 31536000000L)) {
                return getInstance().getChatDate().format(j10);
            }
            return getInstance().getChatFullDate().format(j10);
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static String formatDistance(float f7, int i10, Boolean bool) {
        ensureImperialSystemInit();
        if ((bool == null || !bool.booleanValue()) && !(bool == null && useImperialSystemType.booleanValue())) {
            if (f7 < 1000.0f) {
                return i10 != 0 ? i10 != 1 ? formatString("MetersShort", R.string.MetersShort, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7)))) : formatString("MetersFromYou2", R.string.MetersFromYou2, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7)))) : formatString("MetersAway2", R.string.MetersAway2, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f7))));
            }
            String format = f7 % 1000.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f7 / 1000.0f))) : String.format("%.2f", Float.valueOf(f7 / 1000.0f));
            return i10 != 0 ? i10 != 1 ? formatString("KMetersShort", R.string.KMetersShort, format) : formatString("KMetersFromYou2", R.string.KMetersFromYou2, format) : formatString("KMetersAway2", R.string.KMetersAway2, format);
        }
        float f10 = f7 * 3.28084f;
        if (f10 < 1000.0f) {
            return i10 != 0 ? i10 != 1 ? formatString("FootsShort", R.string.FootsShort, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : formatString("FootsFromYou", R.string.FootsFromYou, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10)))) : formatString("FootsAway", R.string.FootsAway, String.format("%d", Integer.valueOf((int) Math.max(1.0f, f10))));
        }
        String format2 = f10 % 5280.0f == 0.0f ? String.format("%d", Integer.valueOf((int) (f10 / 5280.0f))) : String.format("%.2f", Float.valueOf(f10 / 5280.0f));
        return i10 != 0 ? i10 != 1 ? formatString("MilesShort", R.string.MilesShort, format2) : formatString("MilesFromYou", R.string.MilesFromYou, format2) : formatString("MilesAway", R.string.MilesAway, format2);
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

    public static String formatSmallDateChat(long j3, boolean z10) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = calendar.get(1);
            long j10 = j3 * 1000;
            calendar.setTimeInMillis(j10);
            if (!z10 && i10 == calendar.get(1)) {
                return getInstance().getFormatterDayMonth().format(j10);
            }
            return getInstance().getFormatterDayMonth().format(j10) + ", " + calendar.get(1);
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR: formatDateChat";
        }
    }

    public static CharSequence formatSpannable(String str, int i10, Object... objArr) {
        return formatSpannable(str, null, i10, 0, objArr);
    }

    public static String formatStartsTime(long j3, int i10, boolean z10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i11 = calendar.get(1);
        int i12 = calendar.get(6);
        calendar.setTimeInMillis(j3 * 1000);
        int i13 = i11 == calendar.get(1) ? (z10 && calendar.get(6) == i12) ? 0 : 1 : 2;
        if (i10 == 1) {
            i13 += 3;
        } else if (i10 == 2) {
            i13 += 6;
        } else if (i10 == 3) {
            i13 += 9;
        } else if (i10 == 4) {
            i13 += 12;
        }
        return getInstance().getFormatterScheduleSend(i13).format(calendar.getTimeInMillis());
    }

    @Deprecated
    public static String formatString(String str, int i10, Object... objArr) {
        return formatString(str, null, i10, 0, objArr);
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
        } catch (Exception e) {
            FileLog.e(e);
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
        if (!TextUtils.isEmpty(countryName)) {
            spannableStringBuilder.append((CharSequence) countryName);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(i10));
        return Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), true);
    }

    private HashMap<String, String> getLocaleFileStrings(File file, boolean z10) {
        this.reloadLastFile = false;
        FileLog.d("getLocaleFileStrings: reloadLastFile = false");
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!file.exists()) {
                    return new HashMap<>();
                }
                HashMap<String, String> hashMap = new HashMap<>(10000);
                XmlPullParser newPullParser = Xml.newPullParser();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    newPullParser.setInput(fileInputStream2, "UTF-8");
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                        if (eventType == 2) {
                            str2 = newPullParser.getName();
                            if (newPullParser.getAttributeCount() > 0) {
                                str = newPullParser.getAttributeValue(0);
                            }
                        } else if (eventType == 4) {
                            if (str != null && (str3 = newPullParser.getText()) != null) {
                                String trim = str3.trim();
                                if (z10) {
                                    str3 = trim.replace("<", "&lt;").replace(">", "&gt;").replace("'", "\\'").replace("& ", "&amp; ");
                                } else {
                                    String replace = trim.replace("\\n", "\n").replace("\\", "");
                                    str3 = replace.replace("&lt;", "<");
                                    if (!this.reloadLastFile && !str3.equals(replace)) {
                                        this.reloadLastFile = true;
                                        FileLog.d("getLocaleFileStrings: value != old, reloadLastFile = true;");
                                    }
                                }
                            }
                        } else if (eventType == 3) {
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                        if (str2 != null && str2.equals("string") && str3 != null && str != null && str3.length() != 0 && str.length() != 0) {
                            hashMap.put(str, str3);
                            str = null;
                            str2 = null;
                            str3 = null;
                        }
                    }
                    try {
                        fileInputStream2.close();
                        return hashMap;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return hashMap;
                    }
                } catch (Exception e7) {
                    e = e7;
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    return new HashMap<>();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Deprecated
    public static String getString(String str, int i10) {
        return getInstance().getStringInternal(str, i10);
    }

    private String getStringInternal(String str, String str2, int i10, int i11) {
        String c10 = BuildVars.USE_CLOUD_STRINGS ? this.localizationExternal.c(ApplicationLoader.applicationContext, str, i11) : null;
        if (c10 == null) {
            if (BuildVars.USE_CLOUD_STRINGS && str2 != null) {
                c10 = this.localizationExternal.c(ApplicationLoader.applicationContext, str2, i10);
            }
            if (c10 == null) {
                try {
                    c10 = getLocalizedString(i11);
                } catch (Exception e) {
                    if (i10 != 0) {
                        try {
                            c10 = getLocalizedString(i10);
                        } catch (Exception unused) {
                        }
                    }
                    FileLog.e(e);
                }
            }
        }
        return c10 == null ? org.telegram.ui.Cells.r6.i("LOC_ERR:", str) : c10;
    }

    public int applyLanguage(org.telegram.messenger.LocaleController.LocaleInfo r22, boolean r23, boolean r24, boolean r25, boolean r26, int r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.LocaleController.applyLanguage(org.telegram.messenger.LocaleController$LocaleInfo, boolean, boolean, boolean, boolean, int, java.lang.Runnable):int");
    }

    public String formatCurrencyString(long j3, boolean z10, boolean z11, boolean z12, String str) {
        double d;
        int length;
        String upperCase = str.toUpperCase();
        boolean z13 = j3 < 0;
        long abs = Math.abs(j3);
        Currency currency = Currency.getInstance(upperCase);
        upperCase.getClass();
        char c10 = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c10 = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c10 = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c10 = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c10 = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c10 = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c10 = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c10 = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c10 = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c10 = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c10 = 29;
                    break;
                }
                break;
            case 87254:
                if (upperCase.equals("XTR")) {
                    c10 = 30;
                    break;
                }
                break;
        }
        String str2 = " %.2f";
        switch (c10) {
            case 0:
            case '\b':
            case 11:
            case 15:
            case 16:
            case 19:
            case 22:
                d = abs / 1000.0d;
                str2 = " %.3f";
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\n':
            case '\f':
            case '\r':
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
                d = abs;
                str2 = " %.0f";
                break;
            case 3:
                d = abs / 10000.0d;
                str2 = " %.4f";
                break;
            case '\t':
                double d10 = ((float) abs) / 100.0f;
                if (z10 && abs % 100 == 0) {
                    str2 = " %.0f";
                }
                d = d10;
                break;
            case 18:
                d = abs / 10.0d;
                str2 = " %.1f";
                break;
            default:
                d = abs / 100.0d;
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
        String sb3 = sb2.toString();
        int indexOf = sb3.indexOf(upperCase);
        if (indexOf < 0 || (length = upperCase.length() + indexOf) >= sb3.length() || sb3.charAt(length) == ' ') {
            return sb3;
        }
        return sb3.substring(0, length) + " " + sb3.substring(length);
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
                LocaleController.this.lambda$loadRemoteLanguages$12(z10, i10, tLObject, tL_error);
            }
        }, 8);
    }

    private static String formatEntityFormattedDate(TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate, long j3, Locale locale, boolean z10) {
        String format;
        String str;
        String format2;
        long j10 = tL_messageEntityFormattedDate.date * 1000;
        if (tL_messageEntityFormattedDate.relative && !z10) {
            return formatEntityFormattedDateRelative(j10, j3, locale);
        }
        boolean z11 = (tL_messageEntityFormattedDate.flags == 0) | z10;
        String str2 = "";
        String format3 = tL_messageEntityFormattedDate.day_of_week ? getInstance().getFormatterWeekLong().format(j10) : "";
        if (z11) {
            format = getInstance().getFormatterGiveawayCard().format(j10);
        } else if (tL_messageEntityFormattedDate.long_date) {
            format = getInstance().getChatFullDate().format(j10);
        } else {
            format = tL_messageEntityFormattedDate.short_date ? getInstance().getFormatterYear().format(j10) : "";
        }
        if (z11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            if (calendar.get(13) != 0) {
                format2 = getInstance().getFormatterDayWithSeconds().format(j10);
            } else {
                format2 = getInstance().getFormatterDay().format(j10);
            }
            str2 = format2;
        } else if (tL_messageEntityFormattedDate.long_time) {
            str2 = getInstance().getFormatterDayWithSeconds().format(j10);
        } else if (tL_messageEntityFormattedDate.short_time) {
            str2 = getInstance().getFormatterDay().format(j10);
        }
        boolean isEmpty = TextUtils.isEmpty(format3);
        boolean isEmpty2 = TextUtils.isEmpty(format);
        boolean isEmpty3 = TextUtils.isEmpty(str2);
        if (isEmpty2 && isEmpty3) {
            return format3;
        }
        if (isEmpty2 || isEmpty3) {
            if (isEmpty2) {
                format = str2;
            }
            str = format;
        } else {
            str = formatString(R.string.formatDateAtTime, format, str2);
        }
        return !isEmpty ? formatString(R.string.RelativeDateFormatterWeek2, format3, str) : str;
    }

    public static String formatPluralStringComma(String str, int i10, char c10) {
        return formatPluralStringComma(str, i10, c10, new Object[0]);
    }

    private static CharSequence formatSpannable(String str, String str2, int i10, int i11, Object... objArr) {
        String str3;
        try {
            String c10 = BuildVars.USE_CLOUD_STRINGS ? getInstance().localizationExternal.c(ApplicationLoader.applicationContext, str, i10) : null;
            if (c10 == null) {
                if (BuildVars.USE_CLOUD_STRINGS && str2 != null) {
                    c10 = getInstance().localizationExternal.c(ApplicationLoader.applicationContext, str2, i11);
                }
                if (c10 == null) {
                    try {
                        if (i10 != 0) {
                            try {
                                c10 = getInstance().getLocalizedString(i10);
                            } catch (Exception unused) {
                                if (i11 != 0) {
                                    c10 = getInstance().getLocalizedString(i11);
                                }
                            }
                        } else if (i11 != 0) {
                            c10 = getInstance().getLocalizedString(i11);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c10);
            int i12 = 0;
            while (i12 < objArr.length) {
                String str4 = "s";
                Object obj = objArr[i12];
                if (obj instanceof CharSequence) {
                    str3 = (CharSequence) obj;
                } else {
                    if (obj instanceof Integer) {
                        str3 = "" + ((Integer) objArr[i12]);
                    } else if (obj instanceof Long) {
                        str3 = "" + ((Long) objArr[i12]);
                    } else {
                        str3 = obj == null ? "null" : "";
                    }
                    str4 = "d";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("%");
                i12++;
                sb2.append(i12);
                sb2.append("$");
                sb2.append(str4);
                String sb3 = sb2.toString();
                int indexOf = spannableStringBuilder.toString().indexOf(sb3);
                if (indexOf != -1) {
                    spannableStringBuilder.replace(indexOf, sb3.length() + indexOf, str3);
                } else {
                    String str5 = "%" + str4;
                    int indexOf2 = spannableStringBuilder.toString().indexOf(str5);
                    if (indexOf2 != -1) {
                        spannableStringBuilder.replace(indexOf2, str5.length() + indexOf2, str3);
                    }
                }
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR: " + str;
        }
    }

    private static String formatString(String str, String str2, int i10, int i11, Object... objArr) {
        try {
            String c10 = BuildVars.USE_CLOUD_STRINGS ? getInstance().localizationExternal.c(ApplicationLoader.applicationContext, str, i10) : null;
            if (c10 == null) {
                if (BuildVars.USE_CLOUD_STRINGS && str2 != null) {
                    c10 = getInstance().localizationExternal.c(ApplicationLoader.applicationContext, str2, i11);
                }
                if (c10 == null) {
                    try {
                        if (i10 != 0) {
                            try {
                                c10 = getInstance().getLocalizedString(i10);
                            } catch (Exception unused) {
                                if (i11 != 0) {
                                    c10 = getInstance().getLocalizedString(i11);
                                }
                            }
                        } else if (i11 != 0) {
                            c10 = getInstance().getLocalizedString(i11);
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            if (getInstance().currentLocale != null) {
                return String.format(getInstance().currentLocale, c10, objArr);
            }
            return String.format(c10, objArr);
        } catch (Exception e) {
            FileLog.e(e);
            return "LOC_ERR: " + str;
        }
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
        if (user != null && (userStatus2 = user.status) != null && userStatus2.expires <= 0 && MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(user.f17342id))) {
            if (zArr != null) {
                zArr[0] = true;
            }
            return getString("Online", R.string.Online);
        } else if (user != null && (userStatus = user.status) != null && userStatus.expires != 0 && !UserObject.isDeleted(user) && !(user instanceof TLRPC.TL_userEmpty)) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            int i11 = user.status.expires;
            if (i11 > currentTime) {
                if (zArr != null) {
                    zArr[0] = true;
                }
                return getString("Online", R.string.Online);
            } else if (i11 == -1) {
                return getString("Invisible", R.string.Invisible);
            } else {
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
        } else {
            return getString("ALongTimeAgo", R.string.ALongTimeAgo);
        }
    }

    @Deprecated
    public static String getString(String str) {
        if (TextUtils.isEmpty(str)) {
            return org.telegram.ui.Cells.r6.i("LOC_ERR:", str);
        }
        int stringResId = getStringResId(str);
        if (stringResId != 0) {
            return getString(str, stringResId);
        }
        return getServerString(str);
    }

    public String getTranslitString(String str, boolean z10, boolean z11) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (str == null) {
            return null;
        }
        if (this.ruTranslitChars == null) {
            HashMap<String, String> hashMap = new HashMap<>(33);
            this.ruTranslitChars = hashMap;
            hashMap.put("а", "a");
            this.ruTranslitChars.put("б", "b");
            this.ruTranslitChars.put("в", "v");
            this.ruTranslitChars.put("г", "g");
            this.ruTranslitChars.put("д", "d");
            this.ruTranslitChars.put("е", "e");
            str7 = "g";
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
            str5 = "m";
            str9 = "r";
            this.ruTranslitChars.put("р", str9);
            str6 = "z";
            this.ruTranslitChars.put("с", "s");
            str2 = "v";
            this.ruTranslitChars.put("т", "t");
            str3 = "u";
            this.ruTranslitChars.put("у", str3);
            str4 = "s";
            this.ruTranslitChars.put("ф", "f");
            str8 = "h";
            this.ruTranslitChars.put("х", str8);
            str10 = "p";
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
            str2 = "v";
            str3 = "u";
            str4 = "s";
            str5 = "m";
            str6 = "z";
            str7 = "g";
            str8 = "h";
            str9 = "r";
            str10 = "p";
        }
        if (this.translitChars == null) {
            HashMap<String, String> hashMap2 = new HashMap<>(488);
            this.translitChars = hashMap2;
            hashMap2.put("ȼ", "c");
            this.translitChars.put("ᶇ", "n");
            this.translitChars.put("ɖ", "d");
            this.translitChars.put("ỿ", "y");
            this.translitChars.put("ᴓ", "o");
            this.translitChars.put("ø", "o");
            this.translitChars.put("ḁ", "a");
            this.translitChars.put("ʯ", str8);
            this.translitChars.put("ŷ", "y");
            this.translitChars.put("ʞ", "k");
            this.translitChars.put("ừ", str3);
            String str11 = str3;
            this.translitChars.put("ꜳ", "aa");
            this.translitChars.put("ĳ", "ij");
            this.translitChars.put("ḽ", "l");
            this.translitChars.put("ɪ", "i");
            this.translitChars.put("ḇ", "b");
            this.translitChars.put("ʀ", str9);
            this.translitChars.put("ě", "e");
            this.translitChars.put("ﬃ", "ffi");
            this.translitChars.put("ơ", "o");
            this.translitChars.put("ⱹ", str9);
            this.translitChars.put("ồ", "o");
            this.translitChars.put("ǐ", "i");
            String str12 = str10;
            this.translitChars.put("ꝕ", str12);
            this.translitChars.put("ý", "y");
            this.translitChars.put("ḝ", "e");
            this.translitChars.put("ₒ", "o");
            this.translitChars.put("ⱥ", "a");
            this.translitChars.put("ʙ", "b");
            this.translitChars.put("ḛ", "e");
            this.translitChars.put("ƈ", "c");
            this.translitChars.put("ɦ", str8);
            this.translitChars.put("ᵬ", "b");
            String str13 = str8;
            String str14 = str4;
            this.translitChars.put("ṣ", str14);
            this.translitChars.put("đ", "d");
            this.translitChars.put("ỗ", "o");
            this.translitChars.put("ɟ", "j");
            this.translitChars.put("ẚ", "a");
            this.translitChars.put("ɏ", "y");
            this.translitChars.put("ʌ", str2);
            this.translitChars.put("ꝓ", str12);
            this.translitChars.put("ﬁ", "fi");
            this.translitChars.put("ᶄ", "k");
            this.translitChars.put("ḏ", "d");
            this.translitChars.put("ᴌ", "l");
            this.translitChars.put("ė", "e");
            this.translitChars.put("ᴋ", "k");
            this.translitChars.put("ċ", "c");
            this.translitChars.put("ʁ", str9);
            this.translitChars.put("ƕ", "hv");
            this.translitChars.put("ƀ", "b");
            this.translitChars.put("ṍ", "o");
            this.translitChars.put("ȣ", "ou");
            this.translitChars.put("ǰ", "j");
            String str15 = str7;
            this.translitChars.put("ᶃ", str15);
            this.translitChars.put("ṋ", "n");
            this.translitChars.put("ɉ", "j");
            this.translitChars.put("ǧ", str15);
            this.translitChars.put("ǳ", "dz");
            String str16 = str6;
            this.translitChars.put("ź", str16);
            this.translitChars.put("ꜷ", "au");
            this.translitChars.put("ǖ", str11);
            this.translitChars.put("ᵹ", str15);
            this.translitChars.put("ȯ", "o");
            this.translitChars.put("ɐ", "a");
            this.translitChars.put("ą", "a");
            this.translitChars.put("õ", "o");
            this.translitChars.put("ɻ", str9);
            this.translitChars.put("ꝍ", "o");
            this.translitChars.put("ǟ", "a");
            this.translitChars.put("ȴ", "l");
            this.translitChars.put("ʂ", str14);
            this.translitChars.put("ﬂ", "fl");
            this.translitChars.put("ȉ", "i");
            this.translitChars.put("ⱻ", "e");
            this.translitChars.put("ṉ", "n");
            this.translitChars.put("ï", "i");
            this.translitChars.put("ñ", "n");
            this.translitChars.put("ᴉ", "i");
            this.translitChars.put("ʇ", "t");
            this.translitChars.put("ẓ", str16);
            this.translitChars.put("ỷ", "y");
            this.translitChars.put("ȳ", "y");
            this.translitChars.put("ṩ", str14);
            this.translitChars.put("ɽ", str9);
            this.translitChars.put("ĝ", str15);
            this.translitChars.put("ᴝ", str11);
            this.translitChars.put("ḳ", "k");
            this.translitChars.put("ꝫ", "et");
            this.translitChars.put("ī", "i");
            this.translitChars.put("ť", "t");
            this.translitChars.put("ꜿ", "c");
            this.translitChars.put("ʟ", "l");
            this.translitChars.put("ꜹ", "av");
            this.translitChars.put("û", str11);
            this.translitChars.put("æ", "ae");
            this.translitChars.put("ă", "a");
            this.translitChars.put("ǘ", str11);
            this.translitChars.put("ꞅ", str14);
            this.translitChars.put("ᵣ", str9);
            this.translitChars.put("ᴀ", "a");
            this.translitChars.put("ƃ", "b");
            this.translitChars.put("ḩ", str13);
            this.translitChars.put("ṧ", str14);
            this.translitChars.put("ₑ", "e");
            this.translitChars.put("ʜ", str13);
            this.translitChars.put("ẋ", "x");
            this.translitChars.put("ꝅ", "k");
            this.translitChars.put("ḋ", "d");
            this.translitChars.put("ƣ", "oi");
            this.translitChars.put("ꝑ", str12);
            this.translitChars.put("ħ", str13);
            String str17 = str2;
            this.translitChars.put("ⱴ", str17);
            this.translitChars.put("ẇ", "w");
            this.translitChars.put("ǹ", "n");
            String str18 = str5;
            this.translitChars.put("ɯ", str18);
            this.translitChars.put("ɡ", str15);
            this.translitChars.put("ɴ", "n");
            this.translitChars.put("ᴘ", str12);
            this.translitChars.put("ᵥ", str17);
            this.translitChars.put("ū", str11);
            this.translitChars.put("ḃ", "b");
            this.translitChars.put("ṗ", str12);
            this.translitChars.put("å", "a");
            this.translitChars.put("ɕ", "c");
            this.translitChars.put("ọ", "o");
            this.translitChars.put("ắ", "a");
            this.translitChars.put("ƒ", "f");
            this.translitChars.put("ǣ", "ae");
            this.translitChars.put("ꝡ", "vy");
            this.translitChars.put("ﬀ", "ff");
            this.translitChars.put("ᶉ", str9);
            this.translitChars.put("ô", "o");
            this.translitChars.put("ǿ", "o");
            this.translitChars.put("ṳ", str11);
            this.translitChars.put("ȥ", str16);
            this.translitChars.put("ḟ", "f");
            this.translitChars.put("ḓ", "d");
            this.translitChars.put("ȇ", "e");
            this.translitChars.put("ȕ", str11);
            this.translitChars.put("ȵ", "n");
            this.translitChars.put("ʠ", "q");
            this.translitChars.put("ấ", "a");
            this.translitChars.put("ǩ", "k");
            this.translitChars.put("ĩ", "i");
            this.translitChars.put("ṵ", str11);
            this.translitChars.put("ŧ", "t");
            this.translitChars.put("ɾ", str9);
            this.translitChars.put("ƙ", "k");
            this.translitChars.put("ṫ", "t");
            this.translitChars.put("ꝗ", "q");
            this.translitChars.put("ậ", "a");
            this.translitChars.put("ʄ", "j");
            this.translitChars.put("ƚ", "l");
            this.translitChars.put("ᶂ", "f");
            this.translitChars.put("ᵴ", str14);
            this.translitChars.put("ꞃ", str9);
            this.translitChars.put("ᶌ", str17);
            this.translitChars.put("ɵ", "o");
            this.translitChars.put("ḉ", "c");
            this.translitChars.put("ᵤ", str11);
            this.translitChars.put("ẑ", str16);
            this.translitChars.put("ṹ", str11);
            this.translitChars.put("ň", "n");
            this.translitChars.put("ʍ", "w");
            this.translitChars.put("ầ", "a");
            this.translitChars.put("ǉ", "lj");
            this.translitChars.put("ɓ", "b");
            this.translitChars.put("ɼ", str9);
            this.translitChars.put("ò", "o");
            this.translitChars.put("ẘ", "w");
            this.translitChars.put("ɗ", "d");
            this.translitChars.put("ꜽ", "ay");
            this.translitChars.put("ư", str11);
            this.translitChars.put("ᶀ", "b");
            this.translitChars.put("ǜ", str11);
            this.translitChars.put("ẹ", "e");
            this.translitChars.put("ǡ", "a");
            this.translitChars.put("ɥ", str13);
            this.translitChars.put("ṏ", "o");
            this.translitChars.put("ǔ", str11);
            this.translitChars.put("ʎ", "y");
            this.translitChars.put("ȱ", "o");
            this.translitChars.put("ệ", "e");
            this.translitChars.put("ế", "e");
            this.translitChars.put("ĭ", "i");
            this.translitChars.put("ⱸ", "e");
            this.translitChars.put("ṯ", "t");
            this.translitChars.put("ᶑ", "d");
            this.translitChars.put("ḧ", str13);
            this.translitChars.put("ṥ", str14);
            this.translitChars.put("ë", "e");
            this.translitChars.put("ᴍ", str18);
            this.translitChars.put("ö", "o");
            this.translitChars.put("é", "e");
            this.translitChars.put("ı", "i");
            this.translitChars.put("ď", "d");
            this.translitChars.put("ᵯ", str18);
            this.translitChars.put("ỵ", "y");
            this.translitChars.put("ŵ", "w");
            this.translitChars.put("ề", "e");
            this.translitChars.put("ứ", str11);
            this.translitChars.put("ƶ", str16);
            this.translitChars.put("ĵ", "j");
            this.translitChars.put("ḍ", "d");
            this.translitChars.put("ŭ", str11);
            this.translitChars.put("ʝ", "j");
            this.translitChars.put("ê", "e");
            this.translitChars.put("ǚ", str11);
            this.translitChars.put("ġ", str15);
            this.translitChars.put("ṙ", str9);
            this.translitChars.put("ƞ", "n");
            this.translitChars.put("ḗ", "e");
            this.translitChars.put("ẝ", str14);
            this.translitChars.put("ᶁ", "d");
            this.translitChars.put("ķ", "k");
            this.translitChars.put("ᴂ", "ae");
            this.translitChars.put("ɘ", "e");
            this.translitChars.put("ợ", "o");
            this.translitChars.put("ḿ", str18);
            this.translitChars.put("ꜰ", "f");
            this.translitChars.put("ẵ", "a");
            this.translitChars.put("ꝏ", "oo");
            this.translitChars.put("ᶆ", str18);
            this.translitChars.put("ᵽ", str12);
            this.translitChars.put("ữ", str11);
            this.translitChars.put("ⱪ", "k");
            this.translitChars.put("ḥ", str13);
            this.translitChars.put("ţ", "t");
            this.translitChars.put("ᵱ", str12);
            this.translitChars.put("ṁ", str18);
            this.translitChars.put("á", "a");
            this.translitChars.put("ᴎ", "n");
            this.translitChars.put("ꝟ", str17);
            this.translitChars.put("è", "e");
            this.translitChars.put("ᶎ", str16);
            this.translitChars.put("ꝺ", "d");
            this.translitChars.put("ᶈ", str12);
            this.translitChars.put("ɫ", "l");
            this.translitChars.put("ᴢ", str16);
            this.translitChars.put("ɱ", str18);
            this.translitChars.put("ṝ", str9);
            this.translitChars.put("ṽ", str17);
            this.translitChars.put("ũ", str11);
            this.translitChars.put("ß", "ss");
            this.translitChars.put("ĥ", str13);
            this.translitChars.put("ᵵ", "t");
            this.translitChars.put("ʐ", str16);
            this.translitChars.put("ṟ", str9);
            this.translitChars.put("ɲ", "n");
            this.translitChars.put("à", "a");
            this.translitChars.put("ẙ", "y");
            this.translitChars.put("ỳ", "y");
            this.translitChars.put("ᴔ", "oe");
            this.translitChars.put("ₓ", "x");
            this.translitChars.put("ȗ", str11);
            this.translitChars.put("ⱼ", "j");
            this.translitChars.put("ẫ", "a");
            this.translitChars.put("ʑ", str16);
            this.translitChars.put("ẛ", str14);
            this.translitChars.put("ḭ", "i");
            this.translitChars.put("ꜵ", "ao");
            this.translitChars.put("ɀ", str16);
            this.translitChars.put("ÿ", "y");
            this.translitChars.put("ǝ", "e");
            this.translitChars.put("ǭ", "o");
            this.translitChars.put("ᴅ", "d");
            this.translitChars.put("ᶅ", "l");
            this.translitChars.put("ù", str11);
            this.translitChars.put("ạ", "a");
            this.translitChars.put("ḅ", "b");
            this.translitChars.put("ụ", str11);
            this.translitChars.put("ằ", "a");
            this.translitChars.put("ᴛ", "t");
            this.translitChars.put("ƴ", "y");
            this.translitChars.put("ⱦ", "t");
            this.translitChars.put("ⱡ", "l");
            this.translitChars.put("ȷ", "j");
            this.translitChars.put("ᵶ", str16);
            this.translitChars.put("ḫ", str13);
            this.translitChars.put("ⱳ", "w");
            this.translitChars.put("ḵ", "k");
            this.translitChars.put("ờ", "o");
            this.translitChars.put("î", "i");
            this.translitChars.put("ģ", str15);
            this.translitChars.put("ȅ", "e");
            this.translitChars.put("ȧ", "a");
            this.translitChars.put("ẳ", "a");
            this.translitChars.put("ɋ", "q");
            this.translitChars.put("ṭ", "t");
            this.translitChars.put("ꝸ", "um");
            this.translitChars.put("ᴄ", "c");
            this.translitChars.put("ẍ", "x");
            this.translitChars.put("ủ", str11);
            this.translitChars.put("ỉ", "i");
            this.translitChars.put("ᴚ", str9);
            this.translitChars.put("ś", str14);
            this.translitChars.put("ꝋ", "o");
            this.translitChars.put("ỹ", "y");
            this.translitChars.put("ṡ", str14);
            this.translitChars.put("ǌ", "nj");
            this.translitChars.put("ȁ", "a");
            this.translitChars.put("ẗ", "t");
            this.translitChars.put("ĺ", "l");
            this.translitChars.put("ž", str16);
            this.translitChars.put("ᵺ", "th");
            this.translitChars.put("ƌ", "d");
            this.translitChars.put("ș", str14);
            this.translitChars.put("š", str14);
            this.translitChars.put("ᶙ", str11);
            this.translitChars.put("ẽ", "e");
            this.translitChars.put("ẜ", str14);
            this.translitChars.put("ɇ", "e");
            this.translitChars.put("ṷ", str11);
            this.translitChars.put("ố", "o");
            this.translitChars.put("ȿ", str14);
            this.translitChars.put("ᴠ", str17);
            this.translitChars.put("ꝭ", "is");
            this.translitChars.put("ᴏ", "o");
            this.translitChars.put("ɛ", "e");
            this.translitChars.put("ǻ", "a");
            this.translitChars.put("ﬄ", "ffl");
            this.translitChars.put("ⱺ", "o");
            this.translitChars.put("ȋ", "i");
            this.translitChars.put("ᵫ", "ue");
            this.translitChars.put("ȡ", "d");
            this.translitChars.put("ⱬ", str16);
            this.translitChars.put("ẁ", "w");
            this.translitChars.put("ᶏ", "a");
            this.translitChars.put("ꞇ", "t");
            this.translitChars.put("ğ", str15);
            this.translitChars.put("ɳ", "n");
            this.translitChars.put("ʛ", str15);
            this.translitChars.put("ᴜ", str11);
            this.translitChars.put("ẩ", "a");
            this.translitChars.put("ṅ", "n");
            this.translitChars.put("ɨ", "i");
            this.translitChars.put("ᴙ", str9);
            this.translitChars.put("ǎ", "a");
            this.translitChars.put("ſ", str14);
            this.translitChars.put("ȫ", "o");
            this.translitChars.put("ɿ", str9);
            this.translitChars.put("ƭ", "t");
            this.translitChars.put("ḯ", "i");
            this.translitChars.put("ǽ", "ae");
            this.translitChars.put("ⱱ", str17);
            this.translitChars.put("ɶ", "oe");
            this.translitChars.put("ṃ", str18);
            this.translitChars.put("ż", str16);
            this.translitChars.put("ĕ", "e");
            this.translitChars.put("ꜻ", "av");
            this.translitChars.put("ở", "o");
            this.translitChars.put("ễ", "e");
            this.translitChars.put("ɬ", "l");
            this.translitChars.put("ị", "i");
            this.translitChars.put("ᵭ", "d");
            this.translitChars.put("ﬆ", "st");
            this.translitChars.put("ḷ", "l");
            this.translitChars.put("ŕ", str9);
            this.translitChars.put("ᴕ", "ou");
            this.translitChars.put("ʈ", "t");
            this.translitChars.put("ā", "a");
            this.translitChars.put("ḙ", "e");
            this.translitChars.put("ᴑ", "o");
            this.translitChars.put("ç", "c");
            this.translitChars.put("ᶊ", str14);
            this.translitChars.put("ặ", "a");
            this.translitChars.put("ų", str11);
            this.translitChars.put("ả", "a");
            this.translitChars.put("ǥ", str15);
            this.translitChars.put("ꝁ", "k");
            this.translitChars.put("ẕ", str16);
            this.translitChars.put("ŝ", str14);
            this.translitChars.put("ḕ", "e");
            this.translitChars.put("ɠ", str15);
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
            this.translitChars.put("ᵷ", str15);
            this.translitChars.put("ẅ", "w");
            this.translitChars.put("ḑ", "d");
            this.translitChars.put("ḹ", "l");
            this.translitChars.put("œ", "oe");
            this.translitChars.put("ᵳ", str9);
            this.translitChars.put("ļ", "l");
            this.translitChars.put("ȑ", str9);
            this.translitChars.put("ȭ", "o");
            this.translitChars.put("ᵰ", "n");
            this.translitChars.put("ᴁ", "ae");
            this.translitChars.put("ŀ", "l");
            this.translitChars.put("ä", "a");
            this.translitChars.put("ƥ", str12);
            this.translitChars.put("ỏ", "o");
            this.translitChars.put("į", "i");
            this.translitChars.put("ȓ", str9);
            this.translitChars.put("ǆ", "dz");
            this.translitChars.put("ḡ", str15);
            this.translitChars.put("ṻ", str11);
            this.translitChars.put("ō", "o");
            this.translitChars.put("ľ", "l");
            this.translitChars.put("ẃ", "w");
            this.translitChars.put("ț", "t");
            this.translitChars.put("ń", "n");
            this.translitChars.put("ɍ", str9);
            this.translitChars.put("ȃ", "a");
            this.translitChars.put("ü", str11);
            this.translitChars.put("ꞁ", "l");
            this.translitChars.put("ᴐ", "o");
            this.translitChars.put("ớ", "o");
            this.translitChars.put("ᴃ", "b");
            this.translitChars.put("ɹ", str9);
            this.translitChars.put("ᵲ", str9);
            this.translitChars.put("ʏ", "y");
            this.translitChars.put("ᵮ", "f");
            this.translitChars.put("ⱨ", str13);
            this.translitChars.put("ŏ", "o");
            this.translitChars.put("ú", str11);
            this.translitChars.put("ṛ", str9);
            this.translitChars.put("ʮ", str13);
            this.translitChars.put("ó", "o");
            this.translitChars.put("ů", str11);
            this.translitChars.put("ỡ", "o");
            this.translitChars.put("ṕ", str12);
            this.translitChars.put("ᶖ", "i");
            this.translitChars.put("ự", str11);
            this.translitChars.put("ã", "a");
            this.translitChars.put("ᵢ", "i");
            this.translitChars.put("ṱ", "t");
            this.translitChars.put("ể", "e");
            this.translitChars.put("ử", str11);
            this.translitChars.put("í", "i");
            this.translitChars.put("ɔ", "o");
            this.translitChars.put("ɺ", str9);
            this.translitChars.put("ɢ", str15);
            this.translitChars.put("ř", str9);
            this.translitChars.put("ẖ", str13);
            this.translitChars.put("ű", str11);
            this.translitChars.put("ȍ", "o");
            this.translitChars.put("ḻ", "l");
            this.translitChars.put("ḣ", str13);
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
            this.translitChars.put("ṿ", str17);
            this.translitChars.put("ȩ", "e");
            this.translitChars.put("â", "a");
            this.translitChars.put("ş", str14);
            this.translitChars.put("ŗ", str9);
            this.translitChars.put("ʋ", str17);
            this.translitChars.put("ₐ", "a");
            this.translitChars.put("ↄ", "c");
            this.translitChars.put("ᶓ", "e");
            this.translitChars.put("ɰ", str18);
            this.translitChars.put("ᴡ", "w");
            this.translitChars.put("ȏ", "o");
            this.translitChars.put("č", "c");
            this.translitChars.put("ǵ", str15);
            this.translitChars.put("ĉ", "c");
            this.translitChars.put("ᶗ", "o");
            this.translitChars.put("ꝃ", "k");
            this.translitChars.put("ꝙ", "q");
            this.translitChars.put("ṑ", "o");
            this.translitChars.put("ꜱ", str14);
            this.translitChars.put("ṓ", "o");
            this.translitChars.put("ȟ", str13);
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
            String substring = str.substring(i10, i11);
            if (z11) {
                String lowerCase = substring.toLowerCase();
                boolean z13 = !substring.equals(lowerCase);
                substring = lowerCase;
                z12 = z13;
            }
            String str19 = this.translitChars.get(substring);
            if (str19 == null && z10) {
                str19 = this.ruTranslitChars.get(substring);
            }
            if (str19 != null) {
                if (z11 && z12) {
                    if (str19.length() > 1) {
                        str19 = str19.substring(0, 1).toUpperCase() + str19.substring(1);
                    } else {
                        str19 = str19.toUpperCase();
                    }
                }
                sb2.append(str19);
            } else {
                if (z11) {
                    char charAt = substring.charAt(0);
                    if ((charAt < 'a' || charAt > 'z' || charAt < '0' || charAt > '9') && charAt != ' ' && charAt != '\'' && charAt != ',' && charAt != '.' && charAt != '&' && charAt != '-' && charAt != '/') {
                        return null;
                    }
                    if (z12) {
                        substring = substring.toUpperCase();
                    }
                }
                sb2.append(substring);
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public static java.lang.String formatPluralStringComma(java.lang.String r8, int r9, char r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.LocaleController.formatPluralStringComma(java.lang.String, int, char, java.lang.Object[]):java.lang.String");
    }
}
