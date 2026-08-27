package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.CalendarContract;
import android.provider.CallLog;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.StateSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.view.inspector.WindowInspector;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import gf.r;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.nio.ByteBuffer;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.go;
import org.telegram.ui.nc1;
import org.telegram.ui.rn;
import org.telegram.ui.un;
import org.telegram.ui.wh1;

public class AndroidUtilities {
    public static Pattern BAD_CHARS_MESSAGE_LONG_PATTERN = null;
    public static Pattern BAD_CHARS_MESSAGE_PATTERN = null;
    public static Pattern BAD_CHARS_PATTERN = null;
    public static final int FLAG_TAG_ALL = 11;
    public static final int FLAG_TAG_BOLD = 2;
    public static final int FLAG_TAG_BR = 1;
    public static final int FLAG_TAG_COLOR = 4;
    public static final int FLAG_TAG_URL = 8;
    public static Pattern LONG_BAD_CHARS_PATTERN = null;
    public static Pattern REMOVE_MULTIPLE_DIACRITICS = null;
    public static final int REPLACING_TAG_TYPE_BOLD = 1;
    public static final int REPLACING_TAG_TYPE_LINK = 0;
    public static final int REPLACING_TAG_TYPE_LINKBOLD = 2;
    public static final int REPLACING_TAG_TYPE_LINK_NBSP = 3;
    public static final int REPLACING_TAG_TYPE_UNDERLINE = 4;
    public static final String STICKERS_PLACEHOLDER_PACK_NAME = "tg_placeholders_android";
    public static final String STICKERS_PLACEHOLDER_PACK_NAME_2 = "tg_superplaceholders_android_2";
    public static final String TYPEFACE_MERRIWEATHER_BOLD = "fonts/mw_bold.ttf";
    public static final String TYPEFACE_ROBOTO_EXTRA_BOLD = "fonts/rextrabold.ttf";
    public static final String TYPEFACE_ROBOTO_MEDIUM = "fonts/rmedium.ttf";
    public static final String TYPEFACE_ROBOTO_MEDIUM_ITALIC = "fonts/rmediumitalic.ttf";
    public static final String TYPEFACE_ROBOTO_MONO = "fonts/rmono.ttf";
    public static Pattern WEB_URL;
    private static AccessibilityManager accessibilityManager;
    private static CallReceiver callReceiver;
    private static char[] characters;
    private static HashSet<Character> charactersMap;
    private static int[] documentIcons;
    private static int[] documentMediaIcons;
    public static boolean firstConfigurationWas;
    private static SimpleDateFormat generatingVideoPathFormat;
    private static boolean hasCallPermissions;
    public static boolean incorrectDisplaySizeFix;
    private static Boolean isHonor;
    public static boolean isInMultiwindow;
    public static int leftBaseline;
    private static Pattern linksPattern;
    private static Field mAttachInfoField;
    private static Field mStableInsetsField;
    public static boolean makingGlobalBlurBitmap;
    public static Typeface mediumTypeface;
    private static final Paint navbarProtactionPaint;
    private static HashMap<Window, ValueAnimator> navigationBarColorAnimators;
    public static final String[] numbersSignatureArray;
    public static int roundMessageInset;
    public static int roundMessageSize;
    public static int roundPlayingMessageSize;
    public static int roundSidePlayingMessageSize;
    public static final Linkify.MatchFilter sUrlMatchFilter;
    private static final float[] tempFloats;
    private static final float[] tempFloats2;
    public static float touchSlop;
    private static Runnable unregisterRunnable;
    private static Pattern uriParse;
    public static boolean usingHardwareInput;
    private static Vibrator vibrator;
    public static ThreadLocal<byte[]> readBufferLocal = new ThreadLocal<>();
    public static ThreadLocal<byte[]> bufferLocal = new ThreadLocal<>();
    private static final Hashtable<String, Typeface> typefaceCache = new Hashtable<>();
    private static int prevOrientation = -10;
    private static boolean waitingForSms = false;
    private static boolean waitingForCall = false;
    private static final Object smsLock = new Object();
    private static final Object callLock = new Object();

    @Deprecated
    public static int statusBarHeight = 0;

    @Deprecated
    public static int navigationBarHeight = 0;
    public static float density = 1.0f;
    public static Point displaySize = new Point();
    public static float screenRefreshRate = 60.0f;
    public static float screenMaxRefreshRate = 60.0f;
    public static float screenRefreshTime = 16.666666f;
    public static Integer photoSize = null;
    public static Integer highQualityPhotoSize = null;
    public static DisplayMetrics displayMetrics = new DisplayMetrics();
    public static DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    public static AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
    public static OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
    private static Boolean isTablet = null;
    private static Boolean wasTablet = null;
    private static Boolean isSmallScreen = null;
    private static int adjustOwnerClassGuid = 0;
    private static int altFocusableClassGuid = 0;
    public static final RectF rectTmp = new RectF();
    public static final Rect rectTmp2 = new Rect();
    public static final int[] pointTmp2 = new int[2];
    public static Pattern REMOVE_RTL = null;
    private static Pattern singleTagPatter = null;
    public static final Paint strokeTop = new Paint(1);
    public static final Paint strokeBottom = new Paint(1);

    public interface IntColorCallback {
        void run(int i10);
    }

    public static class LinkMovementMethodMy extends LinkMovementMethod {
        @Override
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            try {
                boolean zOnTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return zOnTouchEvent;
                }
                Selection.removeSelection(spannable);
                return zOnTouchEvent;
            } catch (Exception e9) {
                FileLog.e(e9);
                return false;
            }
        }
    }

    public static class LinkSpec {
        int end;
        int start;
        String url;

        private LinkSpec() {
        }
    }

    public static class VcardData {
        String name;
        ArrayList<String> phones;
        StringBuilder vcard;

        private VcardData() {
            this.phones = new ArrayList<>();
            this.vcard = new StringBuilder();
        }
    }

    public static class VcardItem {
        public int type;
        public ArrayList<String> vcardData = new ArrayList<>();
        public String fullData = "";
        public boolean checked = true;

        public String getRawType(boolean z10) {
            int iIndexOf = this.fullData.indexOf(58);
            if (iIndexOf < 0) {
                return "";
            }
            String strSubstring = this.fullData.substring(0, iIndexOf);
            if (this.type == 20) {
                String[] strArrSplit = strSubstring.substring(2).split(";");
                if (z10) {
                    return strArrSplit[0];
                }
                return strArrSplit.length > 1 ? strArrSplit[strArrSplit.length - 1] : "";
            }
            String[] strArrSplit2 = strSubstring.split(";");
            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                if (strArrSplit2[i10].indexOf(61) < 0) {
                    strSubstring = strArrSplit2[i10];
                }
            }
            return strSubstring;
        }

        public String[] getRawValue() {
            byte[] bArrDecodeQuotedPrintable;
            int iIndexOf = this.fullData.indexOf(58);
            if (iIndexOf < 0) {
                return new String[0];
            }
            String strSubstring = this.fullData.substring(0, iIndexOf);
            String strSubstring2 = this.fullData.substring(iIndexOf + 1);
            String str = null;
            String str2 = "UTF-8";
            for (String str3 : strSubstring.split(";")) {
                String[] strArrSplit = str3.split("=");
                if (strArrSplit.length == 2) {
                    if (strArrSplit[0].equals("CHARSET")) {
                        str2 = strArrSplit[1];
                    } else if (strArrSplit[0].equals("ENCODING")) {
                        str = strArrSplit[1];
                    }
                }
            }
            String[] strArrSplit2 = strSubstring2.split(";");
            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                if (!TextUtils.isEmpty(strArrSplit2[i10]) && str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (bArrDecodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(strArrSplit2[i10]))) != null && bArrDecodeQuotedPrintable.length != 0) {
                    try {
                        strArrSplit2[i10] = new String(bArrDecodeQuotedPrintable, str2);
                    } catch (Exception unused) {
                    }
                }
            }
            return strArrSplit2;
        }

        public String getType() {
            int i10 = this.type;
            if (i10 == 4) {
                return LocaleController.getString(R.string.ContactNote);
            }
            if (i10 == 3) {
                return LocaleController.getString(R.string.ContactUrl);
            }
            if (i10 == 5) {
                return LocaleController.getString(R.string.ContactBirthday);
            }
            if (i10 == 6) {
                return "ORG".equalsIgnoreCase(getRawType(true)) ? LocaleController.getString(R.string.ContactJob) : LocaleController.getString(R.string.ContactJobTitle);
            }
            int iIndexOf = this.fullData.indexOf(58);
            if (iIndexOf < 0) {
                return "";
            }
            String strSubstring = this.fullData.substring(0, iIndexOf);
            if (this.type != 20) {
                String[] strArrSplit = strSubstring.split(";");
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    if (strArrSplit[i11].indexOf(61) < 0) {
                        strSubstring = strArrSplit[i11];
                    }
                }
                if (strSubstring.startsWith("X-")) {
                    strSubstring = strSubstring.substring(2);
                }
                strSubstring.getClass();
                switch (strSubstring) {
                    case "MOBILE":
                    case "CELL":
                        strSubstring = LocaleController.getString(R.string.PhoneMobile);
                        break;
                    case "HOME":
                        strSubstring = LocaleController.getString(R.string.PhoneHome);
                        break;
                    case "PREF":
                        strSubstring = LocaleController.getString(R.string.PhoneMain);
                        break;
                    case "WORK":
                        strSubstring = LocaleController.getString(R.string.PhoneWork);
                        break;
                    case "OTHER":
                        strSubstring = LocaleController.getString(R.string.PhoneOther);
                        break;
                }
            } else {
                strSubstring = strSubstring.substring(2).split(";")[0];
            }
            return strSubstring.substring(0, 1).toUpperCase() + strSubstring.substring(1).toLowerCase();
        }

        public String getValue(boolean z10) {
            byte[] bArrDecodeQuotedPrintable;
            StringBuilder sb2 = new StringBuilder();
            int iIndexOf = this.fullData.indexOf(58);
            if (iIndexOf < 0) {
                return "";
            }
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            String strSubstring = this.fullData.substring(0, iIndexOf);
            String strSubstring2 = this.fullData.substring(iIndexOf + 1);
            String str = null;
            String str2 = "UTF-8";
            for (String str3 : strSubstring.split(";")) {
                String[] strArrSplit = str3.split("=");
                if (strArrSplit.length == 2) {
                    if (strArrSplit[0].equals("CHARSET")) {
                        str2 = strArrSplit[1];
                    } else if (strArrSplit[0].equals("ENCODING")) {
                        str = strArrSplit[1];
                    }
                }
            }
            String[] strArrSplit2 = strSubstring2.split(";");
            boolean z11 = false;
            for (int i10 = 0; i10 < strArrSplit2.length; i10++) {
                if (!TextUtils.isEmpty(strArrSplit2[i10])) {
                    if (str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (bArrDecodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(strArrSplit2[i10]))) != null && bArrDecodeQuotedPrintable.length != 0) {
                        try {
                            strArrSplit2[i10] = new String(bArrDecodeQuotedPrintable, str2);
                        } catch (Exception unused) {
                        }
                    }
                    if (z11 && sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(strArrSplit2[i10]);
                    if (!z11) {
                        z11 = strArrSplit2[i10].length() > 0;
                    }
                }
            }
            if (z10) {
                int i11 = this.type;
                if (i11 == 0) {
                    return oe.b.c().b(sb2.toString());
                }
                if (i11 == 5) {
                    String[] strArrSplit3 = sb2.toString().split("T");
                    if (strArrSplit3.length > 0) {
                        String[] strArrSplit4 = strArrSplit3[0].split("-");
                        if (strArrSplit4.length == 3) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, Utilities.parseInt((CharSequence) strArrSplit4[0]).intValue());
                            calendar.set(2, Utilities.parseInt((CharSequence) strArrSplit4[1]).intValue() - 1);
                            calendar.set(5, Utilities.parseInt((CharSequence) strArrSplit4[2]).intValue());
                            return LocaleController.getInstance().getFormatterYearMax().format(calendar.getTime());
                        }
                    }
                }
            }
            return sb2.toString();
        }
    }

    static {
        WEB_URL = null;
        BAD_CHARS_PATTERN = null;
        LONG_BAD_CHARS_PATTERN = null;
        BAD_CHARS_MESSAGE_PATTERN = null;
        BAD_CHARS_MESSAGE_LONG_PATTERN = null;
        REMOVE_MULTIPLE_DIACRITICS = null;
        try {
            BAD_CHARS_PATTERN = Pattern.compile("[─-◿]");
            LONG_BAD_CHARS_PATTERN = Pattern.compile("[一-鿿]");
            BAD_CHARS_MESSAGE_LONG_PATTERN = Pattern.compile("[̀-ͯ\u2066-\u2067]");
            BAD_CHARS_MESSAGE_PATTERN = Pattern.compile("[\u2066-\u2067]+");
            REMOVE_MULTIPLE_DIACRITICS = Pattern.compile("([\\u0300-\\u036f]{1,2})[\\u0300-\\u036f]+");
            WEB_URL = Pattern.compile("((?:(http|https|Http|Https|ton|tg|tonsite):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|" + Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))") + ")") + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        leftBaseline = isTablet() ? 80 : 72;
        checkDisplaySize(ApplicationLoader.applicationContext, null);
        documentIcons = new int[]{R.drawable.media_doc_blue, R.drawable.media_doc_green, R.drawable.media_doc_red, R.drawable.media_doc_yellow};
        documentMediaIcons = new int[]{R.drawable.media_doc_blue_b, R.drawable.media_doc_green_b, R.drawable.media_doc_red_b, R.drawable.media_doc_yellow_b};
        sUrlMatchFilter = new l();
        hasCallPermissions = Build.VERSION.SDK_INT >= 23;
        numbersSignatureArray = new String[]{"", "K", "M", "B", "T", "P"};
        tempFloats = new float[9];
        tempFloats2 = new float[9];
        characters = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        navbarProtactionPaint = new Paint(1);
    }

    public static int HSBtoRGB(float f10, float f11, float f12) {
        int i10;
        int i11;
        int i12;
        if (f11 == 0.0f) {
            i10 = (int) ((f12 * 255.0f) + 0.5f);
            i11 = i10;
            i12 = i11;
        } else {
            float fFloor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float fFloor2 = fFloor - ((float) Math.floor(fFloor));
            float f13 = (1.0f - f11) * f12;
            float f14 = (1.0f - (f11 * fFloor2)) * f12;
            float f15 = (1.0f - ((1.0f - fFloor2) * f11)) * f12;
            int i13 = (int) fFloor;
            if (i13 == 0) {
                i10 = (int) ((f12 * 255.0f) + 0.5f);
                i11 = (int) ((f15 * 255.0f) + 0.5f);
            } else if (i13 == 1) {
                i10 = (int) ((f14 * 255.0f) + 0.5f);
                i11 = (int) ((f12 * 255.0f) + 0.5f);
            } else if (i13 != 2) {
                if (i13 == 3) {
                    i10 = (int) ((f13 * 255.0f) + 0.5f);
                    i11 = (int) ((f14 * 255.0f) + 0.5f);
                } else if (i13 == 4) {
                    i10 = (int) ((f15 * 255.0f) + 0.5f);
                    i11 = (int) ((f13 * 255.0f) + 0.5f);
                } else if (i13 != 5) {
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                } else {
                    i10 = (int) ((f12 * 255.0f) + 0.5f);
                    i11 = (int) ((f13 * 255.0f) + 0.5f);
                    i12 = (int) ((f14 * 255.0f) + 0.5f);
                }
                i12 = (int) ((f12 * 255.0f) + 0.5f);
            } else {
                i10 = (int) ((f13 * 255.0f) + 0.5f);
                i11 = (int) ((f12 * 255.0f) + 0.5f);
                i12 = (int) ((f15 * 255.0f) + 0.5f);
            }
            i12 = (int) ((f13 * 255.0f) + 0.5f);
        }
        return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
    }

    public static float[] RGBtoHSB(int i10, int i11, int i12) {
        float f10;
        int iMax = Math.max(i10, i11);
        if (i12 > iMax) {
            iMax = i12;
        }
        int iMin = Math.min(i10, i11);
        if (i12 < iMin) {
            iMin = i12;
        }
        float f11 = iMax;
        float f12 = f11 / 255.0f;
        float f13 = 0.0f;
        float f14 = iMax != 0 ? (iMax - iMin) / f11 : 0.0f;
        if (f14 != 0.0f) {
            float f15 = iMax - iMin;
            float f16 = (iMax - i10) / f15;
            float f17 = (iMax - i11) / f15;
            float f18 = (iMax - i12) / f15;
            if (i10 == iMax) {
                f10 = f18 - f17;
            } else {
                f10 = i11 == iMax ? (f16 + 2.0f) - f18 : (f17 + 4.0f) - f16;
            }
            float f19 = f10 / 6.0f;
            f13 = f19 < 0.0f ? f19 + 1.0f : f19;
        }
        return new float[]{f13, f14, f12};
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i10) {
        return addLinks(spannable, i10, false);
    }

    public static boolean addLinksSafe(Spannable spannable, final int i10, final boolean z10, final boolean z11) {
        if (spannable == null) {
            return false;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        boolean zDoSafe = doSafe(new Utilities.Callback0Return() {
            @Override
            public final Object run() {
                return AndroidUtilities.lambda$addLinksSafe$8(spannableStringBuilder, i10, z10, z11);
            }
        });
        if (zDoSafe) {
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                spannable.removeSpan(uRLSpan);
            }
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            for (int i11 = 0; i11 < uRLSpanArr.length; i11++) {
                URLSpan uRLSpan2 = uRLSpanArr[i11];
                spannable.setSpan(uRLSpan2, spannableStringBuilder.getSpanStart(uRLSpan2), spannableStringBuilder.getSpanEnd(uRLSpanArr[i11]), 33);
            }
        }
        return zDoSafe;
    }

    public static void addMediaToGallery(String str) {
        if (str == null) {
            return;
        }
        addMediaToGallery(new File(str));
    }

    public static boolean addToClipboard(CharSequence charSequence, String str) {
        if (str == null) {
            return addToClipboard(charSequence);
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static void adjustBrightnessColorMatrix(ColorMatrix colorMatrix, float f10) {
        if (colorMatrix == null) {
            return;
        }
        float f11 = f10 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f11, 0.0f, 1.0f, 0.0f, 0.0f, f11, 0.0f, 0.0f, 1.0f, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void adjustHueColorMatrix(ColorMatrix colorMatrix, float f10) {
        float fCleanValue = (cleanValue(f10, 180.0f) / 180.0f) * 3.1415927f;
        if (fCleanValue == 0.0f) {
            return;
        }
        double d = fCleanValue;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f11 = (fCos * (-0.715f)) + 0.715f;
        float f12 = ((-0.072f) * fCos) + 0.072f;
        float f13 = ((-0.213f) * fCos) + 0.213f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{(fSin * (-0.213f)) + (0.787f * fCos) + 0.213f, ((-0.715f) * fSin) + f11, (fSin * 0.928f) + f12, 0.0f, 0.0f, (0.143f * fSin) + f13, (0.14f * fSin) + (0.28500003f * fCos) + 0.715f, ((-0.283f) * fSin) + f12, 0.0f, 0.0f, ((-0.787f) * fSin) + f13, (0.715f * fSin) + f11, (fSin * 0.072f) + (fCos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
    }

    public static void adjustSaturationColorMatrix(ColorMatrix colorMatrix, float f10) {
        if (colorMatrix == null) {
            return;
        }
        float f11 = f10 + 1.0f;
        float f12 = 1.0f - f11;
        float f13 = 0.3086f * f12;
        float f14 = 0.6094f * f12;
        float f15 = f12 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f13 + f11, f14, f15, 0.0f, 0.0f, f13, f14 + f11, f15, 0.0f, 0.0f, f13, f14, f11 + f15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static List<View> allGlobalViews() {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return WindowInspector.getGlobalWindowViews();
            }
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object objInvoke = cls.getMethod("getInstance", null).invoke(null, null);
            Method method = cls.getMethod("getViewRootNames", null);
            Method method2 = cls.getMethod("getRootView", String.class);
            String[] strArr = (String[]) method.invoke(objInvoke, null);
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                arrayList.add((View) method2.invoke(objInvoke, str));
            }
            return arrayList;
        } catch (Exception e9) {
            FileLog.e("allGlobalViews()", e9);
            return null;
        }
    }

    public static boolean allowScreenCapture() {
        return SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture;
    }

    public static void appCenterLog(Throwable th) {
        ApplicationLoader.appCenterLog(th);
    }

    public static Bitmap applyColorMatrix(Bitmap bitmap, ColorMatrix colorMatrix) {
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static void applyEdgeToEdgeLayoutParams(WindowManager.LayoutParams layoutParams) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = i10 >= 30 ? 3 : 1;
        }
    }

    public static void applySpring(Animator animator, double d, double d10) {
        applySpring(animator, d, d10, 1.0d, 0.0d);
    }

    public static Typeface bold() {
        if (mediumTypeface == null) {
            if (!SharedConfig.useSystemBoldFont || Build.VERSION.SDK_INT < 28) {
                mediumTypeface = getTypeface("fonts/rmedium.ttf");
            } else {
                mediumTypeface = Typeface.create(null, 500, false);
            }
        }
        return mediumTypeface;
    }

    public static byte[] calcAuthKeyHash(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(Utilities.computeSHA1(bArr), 0, bArr2, 0, 16);
        return bArr2;
    }

    public static int calcBitmapColor(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmaps.createScaledBitmap(bitmap, 1, 1, true);
            if (bitmapCreateScaledBitmap != null) {
                int pixel = bitmapCreateScaledBitmap.getPixel(0, 0);
                if (bitmap == bitmapCreateScaledBitmap) {
                    return pixel;
                }
                bitmapCreateScaledBitmap.recycle();
                return pixel;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return 0;
    }

    public static int[] calcDrawableColor(Drawable drawable) {
        if (drawable instanceof un) {
            return calcDrawableColor(((un) drawable).c(true));
        }
        int[] iArr = new int[4];
        int averageColor = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                averageColor = calcBitmapColor(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                averageColor = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.m9) {
                int[] iArr2 = ((org.telegram.ui.Components.m9) drawable).f30623a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        averageColor = getAverageColor(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        averageColor = iArr2[0];
                    }
                }
            } else if (drawable instanceof nb0) {
                int iArgb = Color.argb(45, 0, 0, 0);
                iArr[2] = iArgb;
                iArr[0] = iArgb;
                int iArgb2 = Color.argb(61, 0, 0, 0);
                iArr[3] = iArgb2;
                iArr[1] = iArgb2;
                return iArr;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        double[] dArrRgbToHsv = rgbToHsv((averageColor >> 16) & 255, (averageColor >> 8) & 255, averageColor & 255);
        double d = dArrRgbToHsv[1];
        dArrRgbToHsv[1] = Math.min(1.0d, ((1.0d - d) * 0.1d) + 0.05d + d);
        int[] iArrHsvToRgb = hsvToRgb(dArrRgbToHsv[0], dArrRgbToHsv[1], Math.max(0.0d, dArrRgbToHsv[2] * 0.65d));
        iArr[0] = Color.argb(102, iArrHsvToRgb[0], iArrHsvToRgb[1], iArrHsvToRgb[2]);
        iArr[1] = Color.argb(136, iArrHsvToRgb[0], iArrHsvToRgb[1], iArrHsvToRgb[2]);
        int[] iArrHsvToRgb2 = hsvToRgb(dArrRgbToHsv[0], dArrRgbToHsv[1], Math.max(0.0d, dArrRgbToHsv[2] * 0.72d));
        iArr[2] = Color.argb(102, iArrHsvToRgb2[0], iArrHsvToRgb2[1], iArrHsvToRgb2[2]);
        iArr[3] = Color.argb(136, iArrHsvToRgb2[0], iArrHsvToRgb2[1], iArrHsvToRgb2[2]);
        return iArr;
    }

    public static void cancelRunOnUIThread(Runnable runnable) {
        if (ApplicationLoader.applicationHandler == null) {
            return;
        }
        ApplicationLoader.applicationHandler.removeCallbacks(runnable);
    }

    public static float cascade(float f10, float f11, float f12, float f13) {
        if (f12 <= 0.0f) {
            return f10;
        }
        float fMin = Math.min(f13, f12) * (1.0f / f12);
        return h7.n.a((f10 - ((1.0f - fMin) * (f11 / f12))) / fMin, 0.0f, 1.0f);
    }

    private static void changeSetSystemUiVisibility(View view, int i10, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        int iB = h7.a8.b(systemUiVisibility, i10, z10);
        if (systemUiVisibility != iB) {
            view.setSystemUiVisibility(iB);
        }
    }

    public static boolean charSequenceContains(CharSequence charSequence, CharSequence charSequence2) {
        return charSequenceIndexOf(charSequence, charSequence2) != -1;
    }

    public static int charSequenceIndexOf(CharSequence charSequence, CharSequence charSequence2, int i10) {
        if (charSequence2 != null && charSequence2.length() > 0) {
            while (i10 <= charSequence.length() - charSequence2.length()) {
                for (int i11 = 0; i11 < charSequence2.length(); i11++) {
                    if (charSequence2.charAt(i11) != charSequence.charAt(i10 + i11)) {
                        i10++;
                    }
                }
                return i10;
            }
        }
        return -1;
    }

    public static void checkAndroidTheme(Context context, boolean z10) {
        if (context == null) {
            return;
        }
        context.setTheme((org.telegram.ui.ActionBar.g6.I.q() && z10) ? R.style.Theme_TMessages_Dark : R.style.Theme_TMessages);
    }

    public static void checkDisplaySize(Context context, Configuration configuration) {
        Display defaultDisplay;
        try {
            float f10 = density;
            float f11 = context.getResources().getDisplayMetrics().density;
            density = f11;
            if (firstConfigurationWas && Math.abs(f10 - f11) > 0.001d) {
                if (org.telegram.ui.ActionBar.g6.f23212m3 != null) {
                    org.telegram.ui.ActionBar.g6.f23212m3 = null;
                    org.telegram.ui.ActionBar.g6.J(context, false);
                }
                if (org.telegram.ui.ActionBar.g6.B0 != null) {
                    org.telegram.ui.ActionBar.g6.B0 = null;
                    org.telegram.ui.ActionBar.g6.R(context);
                }
                if (org.telegram.ui.ActionBar.g6.Q1 != null) {
                    org.telegram.ui.ActionBar.g6.Q1 = null;
                    org.telegram.ui.ActionBar.g6.X(context);
                }
            }
            firstConfigurationWas = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            usingHardwareInput = configuration.keyboard != 1 && configuration.hardKeyboardHidden == 1;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(displaySize);
                float refreshRate = defaultDisplay.getRefreshRate();
                screenRefreshRate = refreshRate;
                screenMaxRefreshRate = refreshRate;
                float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
                if (supportedRefreshRates != null) {
                    for (float f12 : supportedRefreshRates) {
                        if (f12 > screenMaxRefreshRate) {
                            screenMaxRefreshRate = f12;
                        }
                    }
                }
                screenRefreshTime = 1000.0f / screenRefreshRate;
            }
            int i10 = configuration.screenWidthDp;
            if (i10 != 0) {
                int iCeil = (int) Math.ceil(i10 * density);
                if (Math.abs(displaySize.x - iCeil) > 3) {
                    displaySize.x = iCeil;
                }
            }
            int i11 = configuration.screenHeightDp;
            if (i11 != 0) {
                int iCeil2 = (int) Math.ceil(i11 * density);
                if (Math.abs(displaySize.y - iCeil2) > 3) {
                    displaySize.y = iCeil2;
                }
            }
            if (roundMessageSize == 0) {
                if (isTablet()) {
                    roundMessageSize = (int) (getMinTabletSide() * 0.6f);
                    roundPlayingMessageSize = getMinTabletSide() - dp(28.0f);
                    roundSidePlayingMessageSize = getMinTabletSide() - dp(92.0f);
                } else {
                    Point point = displaySize;
                    roundMessageSize = (int) (Math.min(point.x, point.y) * 0.6f);
                    Point point2 = displaySize;
                    roundPlayingMessageSize = Math.min(point2.x, point2.y) - dp(28.0f);
                    roundSidePlayingMessageSize = Math.min(displaySize.x - dp(64.0f), displaySize.y) - dp(28.0f);
                }
                roundMessageInset = dp(2.0f);
            }
            fillStatusBarHeight(context, true);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("density = " + density + " display size = " + displaySize.x + " " + displaySize.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + statusBarHeight + ", navbar height: " + navigationBarHeight);
            }
            touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            isSmallScreen = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static boolean checkHostForPunycode(String str) {
        boolean z10;
        boolean z11;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z10 = false;
            z11 = false;
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '.' && cCharAt != '-' && cCharAt != '/' && cCharAt != '+' && (cCharAt < '0' || cCharAt > '9')) {
                        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
                            z11 = true;
                        } else {
                            z10 = true;
                        }
                        if (z10 && z11) {
                            break;
                        }
                    }
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                }
            }
        } catch (Exception e10) {
            e = e10;
            z10 = false;
            z11 = false;
        }
        return z10 && z11;
    }

    public static boolean checkInlinePermissions(Context context) {
        return Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context);
    }

    public static boolean checkPhonePattern(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] strArrSplit = str.split("\\*");
            String strD = oe.b.d(str2, false);
            int length = 0;
            for (String str3 : strArrSplit) {
                if (!TextUtils.isEmpty(str3)) {
                    int iIndexOf = strD.indexOf(str3, length);
                    if (iIndexOf == -1) {
                        return false;
                    }
                    length = iIndexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static boolean checkPipPermissions(Context context) {
        return context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0;
    }

    public static float cleanValue(float f10, float f11) {
        return Math.min(f11, Math.max(-f11, f10));
    }

    public static void clearDrawableAnimation(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ListView) {
            Drawable selector = ((ListView) view).getSelector();
            if (selector != null) {
                selector.setState(StateSet.NOTHING);
                return;
            }
            return;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            background.setState(StateSet.NOTHING);
            background.jumpToCurrentState();
        }
    }

    public static ByteBuffer cloneByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate;
        try {
            byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
        } catch (OutOfMemoryError unused) {
            System.gc();
            byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
        }
        int iPosition = byteBuffer.position();
        byteBuffer.rewind();
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        byteBufferAllocate.flip();
        byteBufferAllocate.position(iPosition);
        return byteBufferAllocate;
    }

    public static int compare(int i10, int i11) {
        if (i10 == i11) {
            return 0;
        }
        return i10 > i11 ? 1 : -1;
    }

    public static float computeDampingRatio(float f10, float f11, float f12) {
        return f11 / (((float) Math.sqrt(f12 * f10)) * 2.0f);
    }

    public static float computePerceivedBrightness(int i10) {
        return com.google.android.recaptcha.internal.a.y(Color.blue(i10), 0.0722f, (Color.green(i10) * 0.7152f) + (Color.red(i10) * 0.2126f), 255.0f);
    }

    public static CharSequence concat(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i10 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i10 < length) {
                    CharSequence charSequence2 = charSequenceArr[i10];
                    if (charSequence2 == null) {
                        charSequence2 = "null";
                    }
                    spannableStringBuilder.append(charSequence2);
                    i10++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i10 < length2) {
            sb2.append(charSequenceArr[i10]);
            i10++;
        }
        return sb2.toString();
    }

    private static boolean containsUnsupportedCharacters(String str) {
        if (str.contains("\u202c") || str.contains("\u202d") || str.contains("\u202e")) {
            return true;
        }
        try {
            return BAD_CHARS_PATTERN.matcher(str).find();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean copyFile(InputStream inputStream, File file) {
        return copyFile(inputStream, new FileOutputStream(file));
    }

    public static boolean copyFileSafe(File file, File file2) {
        try {
            return copyFile(file, file2);
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static void createCalendarEvent(Activity activity, long j10, String str, String str2, boolean z10) {
        long millis;
        if (z10) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            j10 = calendar.getTimeInMillis();
            millis = TimeUnit.DAYS.toMillis(1L);
        } else {
            millis = TimeUnit.MINUTES.toMillis(10L);
        }
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j10).putExtra("endTime", millis + j10).putExtra("allDay", z10);
        if (!TextUtils.isEmpty(str)) {
            intentPutExtra.putExtra("title", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intentPutExtra.putExtra("description", str2);
        }
        try {
            activity.startActivity(intentPutExtra);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void createEmptyFile(File file) {
        try {
            if (file.exists()) {
                return;
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.flush();
            fileWriter.close();
        } catch (Throwable th) {
            FileLog.e(th, false);
        }
    }

    public static byte[] decodeQuotedPrintable(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < bArr.length) {
            byte b10 = bArr[i10];
            if (b10 == 61) {
                try {
                    int iDigit = Character.digit((char) bArr[i10 + 1], 16);
                    i10 += 2;
                    byteArrayOutputStream.write((char) ((iDigit << 4) + Character.digit((char) bArr[i10], 16)));
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i10++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e10) {
            FileLog.e(e10);
            return byteArray;
        }
    }

    public static float distance(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        return (float) Math.sqrt((f15 * f15) + (f14 * f14));
    }

    public static float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public static void doOnLayout(final View view, final Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (view == null) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    runnable.run();
                }
            });
        }
    }

    public static void doOnPreDraw(View view, final Runnable runnable) {
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final boolean[] zArr = new boolean[1];
        final ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = {onPreDrawListener};
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public final boolean onPreDraw() {
                return AndroidUtilities.lambda$doOnPreDraw$27(viewTreeObserver, onPreDrawListenerArr, zArr, runnable);
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    public static boolean doSafe(Utilities.Callback0Return<Boolean> callback0Return) {
        return doSafe(callback0Return, 200);
    }

    public static int dp(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(density * f10);
    }

    public static int dp2(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(density * f10);
    }

    public static float dpf2(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return density * f10;
    }

    public static int dpr(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Math.round(density * f10);
    }

    public static void drawNavigationBarProtection(Canvas canvas, View view, int i10, int i11) {
        drawNavigationBarProtection(canvas, view, i10, i11, 1.0f);
    }

    public static void drawStroke(Canvas canvas, RectF rectF, float f10) {
        drawStroke(canvas, rectF, f10, 1.0f);
    }

    public static CharSequence ellipsizeCenterEnd(CharSequence charSequence, String str, int i10, TextPaint textPaint, int i11) {
        Exception exc;
        CharSequence charSequenceSubSequence;
        try {
            int length = charSequence.length();
            int iIndexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > i11) {
                charSequence = charSequence.subSequence(Math.max(0, iIndexOf - (i11 / 2)), Math.min(length, (i11 / 2) + iIndexOf));
                iIndexOf -= Math.max(0, iIndexOf - (i11 / 2));
                charSequence.length();
            }
            CharSequence charSequence2 = charSequence;
            try {
                StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                float lineWidth = staticLayout.getLineWidth(0);
                float f10 = i10;
                if (textPaint.measureText("...") + lineWidth >= f10) {
                    int i12 = iIndexOf + 1;
                    int i13 = i12;
                    while (i13 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i13))) {
                        i13++;
                    }
                    float primaryHorizontal = staticLayout.getPrimaryHorizontal(i13);
                    if (staticLayout.isRtlCharAt(i13)) {
                        primaryHorizontal = lineWidth - primaryHorizontal;
                    }
                    if (primaryHorizontal >= f10) {
                        float fMeasureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f10);
                        float f11 = 0.1f * f10;
                        float f12 = fMeasureText + f11;
                        if (charSequence2.length() - i13 > 20) {
                            f12 += f11;
                        }
                        if (f12 > 0.0f) {
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f12);
                            if (offsetForHorizontal > charSequence2.length() - 1) {
                                offsetForHorizontal = charSequence2.length() - 1;
                            }
                            int i14 = 0;
                            while (!Character.isWhitespace(charSequence2.charAt(offsetForHorizontal)) && i14 < 10) {
                                i14++;
                                offsetForHorizontal++;
                                if (offsetForHorizontal > charSequence2.length() - 1) {
                                    offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f12);
                                    break;
                                }
                            }
                            if (i14 >= 10) {
                                charSequenceSubSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i12) - (f10 * 0.3f)), charSequence2.length());
                            } else {
                                if (offsetForHorizontal > 0 && offsetForHorizontal < charSequence2.length() - 2 && Character.isWhitespace(charSequence2.charAt(offsetForHorizontal))) {
                                    offsetForHorizontal++;
                                }
                                charSequenceSubSequence = charSequence2.subSequence(offsetForHorizontal, charSequence2.length());
                            }
                            return SpannableStringBuilder.valueOf("...").append(charSequenceSubSequence);
                        }
                    }
                }
                return charSequence2;
            } catch (Exception e9) {
                exc = e9;
                charSequence = charSequence2;
                FileLog.e(exc);
                return charSequence;
            }
        } catch (Exception e10) {
            exc = e10;
        }
    }

    public static MotionEvent emptyMotionEvent() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static void enableEdgeToEdge(Activity activity) {
        Window window = activity.getWindow();
        try {
            enableEdgeToEdge(window);
            if (Build.VERSION.SDK_INT >= 28) {
                window.setNavigationBarDividerColor(0);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void endIncomingCall() {
        if (hasCallPermissions) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", null);
                declaredMethod.setAccessible(true);
                if (declaredMethod.invoke(telephonyManager, null) != null) {
                    throw new ClassCastException();
                }
                if (declaredMethod.invoke(telephonyManager, null) != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public static String escape(String str) {
        return removeRTL(removeDiacritics(str));
    }

    public static void executeOnUIThread(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runOnUIThread(runnable);
        } else {
            runnable.run();
        }
    }

    public static <A, B> B find(List<A> list, Class<B> cls) {
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            A a2 = list.get(i10);
            if (cls.isInstance(a2)) {
                return cls.cast(a2);
            }
        }
        return null;
    }

    public static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static View findChildViewUnder(ViewGroup viewGroup, float f10, float f11) {
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    View viewFindChildViewUnder = findChildViewUnder((ViewGroup) childAt, f10 - childAt.getLeft(), f11 - childAt.getTop());
                    if (viewFindChildViewUnder != null) {
                        return viewFindChildViewUnder;
                    }
                } else if (f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getY() && f10 <= childAt.getY() + childAt.getHeight()) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public static boolean findClickableView(ViewGroup viewGroup, float f10, float f11) {
        return findClickableView(viewGroup, f10, f11, null);
    }

    public static TLRPC.Document findDocument(List<TLRPC.Document> list, long j10) {
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            TLRPC.Document document = list.get(i10);
            if (document != null && document.f22386id == j10) {
                return document;
            }
        }
        return null;
    }

    public static <A, B> B findLast(List<A> list, Class<B> cls) {
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            A a2 = list.get(size);
            if (cls.isInstance(a2)) {
                return cls.cast(a2);
            }
        }
        return null;
    }

    public static TLRPC.Photo findPhoto(List<TLRPC.Photo> list, long j10) {
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            TLRPC.Photo photo = list.get(i10);
            if (photo != null && photo.f22404id == j10) {
                return photo;
            }
        }
        return null;
    }

    public static void fixGoogleMapsBug() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("google_bug_154855417", 0);
        if (sharedPreferences.contains("fixed")) {
            return;
        }
        new File(ApplicationLoader.getFilesDirFixed(), "ZoomTables.data").delete();
        sharedPreferences.edit().putBoolean("fixed", true).apply();
    }

    public static double fixLocationCoord(double d) {
        return ((long) (d * 1000000.0d)) / 1000000.0d;
    }

    public static WindowInsets fixedDispatchApplyWindowInsets(WindowInsets windowInsets, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }

    public static void forEachViews(View view, d5.d dVar) {
        if (!(view instanceof ViewGroup)) {
            dVar.accept(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            dVar.accept(view);
            forEachViews(viewGroup.getChildAt(i10), dVar);
        }
    }

    public static String formapMapUrl(int i10, double d, double d10, int i11, int i12, boolean z10, int i13, int i14) {
        int iMin = Math.min(2, (int) Math.ceil(density));
        int i15 = i14 == -1 ? MessagesController.getInstance(i10).mapProvider : i14;
        if (i15 != 1 && i15 != 3) {
            String str = MessagesController.getInstance(i10).mapKey;
            if (TextUtils.isEmpty(str)) {
                return z10 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(iMin), Double.valueOf(d), Double.valueOf(d10)) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(iMin));
            }
            return z10 ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(iMin), Double.valueOf(d), Double.valueOf(d10), str) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(iMin), str);
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str2 = null;
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            if (strArr[i16].toLowerCase().contains(currentLocaleInfo.shortName)) {
                str2 = strArr[i16];
            }
            i16++;
        }
        if (str2 == null) {
            str2 = "en_US";
        }
        return z10 ? String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", Double.valueOf(d10), Double.valueOf(d), Integer.valueOf(i13), Integer.valueOf(i11 * iMin), Integer.valueOf(i12 * iMin), Integer.valueOf(iMin), Double.valueOf(d10), Double.valueOf(d), str2) : String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", Double.valueOf(d10), Double.valueOf(d), Integer.valueOf(i13), Integer.valueOf(i11 * iMin), Integer.valueOf(i12 * iMin), Integer.valueOf(iMin), str2);
    }

    public static String formatCount(int i10) {
        if (i10 < 1000) {
            return Integer.toString(i10);
        }
        ArrayList arrayList = new ArrayList();
        while (i10 != 0) {
            int i11 = i10 % 1000;
            i10 /= 1000;
            if (i10 > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i11)));
            } else {
                arrayList.add(Integer.toString(i11));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sb2.append((String) arrayList.get(size));
            if (size != 0) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    public static String formatDuration(int i10, boolean z10) {
        return formatDuration(i10, z10, false);
    }

    public static String formatDurationNoHours(int i10, boolean z10) {
        int i11 = i10 / 60;
        int i12 = i10 % 60;
        return z10 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String formatFileSize(long j10) {
        return formatFileSize(j10, false, false);
    }

    public static String formatFullDuration(int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        return i10 < 0 ? String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12)), Integer.valueOf(Math.abs(i13))) : String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String formatLongDuration(int i10) {
        return formatDuration(i10, true);
    }

    public static String formatShortDuration(int i10) {
        return formatDuration(i10, false);
    }

    public static SpannableStringBuilder formatSpannable(CharSequence charSequence, CharSequence... charSequenceArr) {
        return charSequence.toString().contains("%s") ? formatSpannableSimple(charSequence, charSequenceArr) : formatSpannable(charSequence, new b(4), charSequenceArr);
    }

    public static SpannableStringBuilder formatSpannableSimple(CharSequence charSequence, CharSequence... charSequenceArr) {
        return formatSpannable(charSequence, new b(3), charSequenceArr);
    }

    public static String formatTimerDurationFast(long j10, int i10) {
        StringBuilder sb2 = new StringBuilder();
        long j11 = j10 / 60;
        if (j11 >= 60) {
            sb2.append(j11 / 60);
            sb2.append(":");
            normalizeTimePart(sb2, j11 % 60);
            sb2.append(":");
            normalizeTimePart(sb2, j10 % 60);
            sb2.append(",");
            sb2.append(i10 / 10);
        } else {
            sb2.append(j11);
            sb2.append(":");
            normalizeTimePart(sb2, j10 % 60);
            sb2.append(",");
            sb2.append(i10 / 10);
        }
        return sb2.toString();
    }

    public static String formatTimestamp(int i10) {
        String string;
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i11 > 0) {
            Locale locale = Locale.US;
            string = s3.c.d(i11, "h");
        } else {
            string = "";
        }
        if (i12 > 0) {
            StringBuilder sbO = com.google.android.recaptcha.internal.a.o(string);
            sbO.append(String.format(Locale.US, i11 > 0 ? "%02dm" : "%dm", Integer.valueOf(i12)));
            string = sbO.toString();
        }
        StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(string);
        sbO2.append(String.format(Locale.US, (i11 > 0 || i12 > 0) ? "%02ds" : "%ds", Integer.valueOf(i13)));
        return sbO2.toString();
    }

    public static String formatVideoDuration(int i10, int i11) {
        int i12 = i11 / 3600;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 % 60;
        int i15 = i10 / 3600;
        int i16 = (i10 / 60) % 60;
        int i17 = i10 % 60;
        if (i15 == 0 && i12 == 0) {
            return String.format(Locale.US, "%02d:%02d / %02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        if (i12 == 0) {
            return String.format(Locale.US, "%d:%02d:%02d / %02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        return i15 == 0 ? String.format(Locale.US, "%02d:%02d / %d:%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String formatVideoDurationFast(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 >= 60) {
            normalizeTimePart(sb2, i10 / 60);
            sb2.append(":");
            normalizeTimePart(sb2, i10 % 60);
            sb2.append(":");
            normalizeTimePart(sb2, i11);
        } else {
            normalizeTimePart(sb2, i10);
            sb2.append(":");
            normalizeTimePart(sb2, i11);
        }
        return sb2.toString();
    }

    public static String formatWholeNumber(int i10, int i11) {
        if (i10 == 0) {
            return "0";
        }
        float f10 = i10;
        if (i11 == 0) {
            i11 = i10;
        }
        if (i11 < 1000) {
            return formatCount(i10);
        }
        int i12 = 0;
        while (i11 >= 1000 && i12 < numbersSignatureArray.length - 1) {
            i11 /= 1000;
            f10 /= 1000.0f;
            i12++;
        }
        if (f10 < 0.1d) {
            return "0";
        }
        float f11 = f10 * 10.0f;
        float f12 = (int) f11;
        if (f11 != f12) {
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 / 10.0f), numbersSignatureArray[i12]);
        }
        Locale locale = Locale.ENGLISH;
        return s3.c.l(formatCount((int) f10), numbersSignatureArray[i12]);
    }

    private static void gatherLinks(ArrayList<LinkSpec> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, boolean z10) {
        if (TextUtils.indexOf((CharSequence) spannable, (char) 9472) >= 0) {
            spannable = new SpannableStringBuilder(spannable.toString().replace((char) 9472, ' '));
        }
        if (!TextUtils.isEmpty(spannable) && TextUtils.lastIndexOf(spannable, '_') == spannable.length() - 1) {
            spannable = new SpannableStringBuilder(spannable.toString()).replace(spannable.length() - 1, spannable.length(), (CharSequence) "a");
        }
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                LinkSpec linkSpec = new LinkSpec();
                String strMakeUrl = makeUrl(matcher.group(0), strArr, matcher);
                if (!z10 || we.e.f(Uri.parse(strMakeUrl), true, null)) {
                    linkSpec.url = strMakeUrl;
                    linkSpec.start = iStart;
                    linkSpec.end = iEnd;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    public static String generateFileName(int i10, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + ((long) Utilities.random.nextInt(1000)) + 1);
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i10 != 0) {
            return a9.p.m("VID_", str2, ".mp4");
        }
        StringBuilder sbR = a9.p.r("IMG_", str2, ".");
        if (TextUtils.isEmpty(str)) {
            str = "jpg";
        }
        sbR.append(str);
        return sbR.toString();
    }

    public static File generatePicturePath() {
        return generatePicturePath(false, null);
    }

    public static CharSequence generateSearchName(String str, String str2, String str3) {
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null || str.length() == 0) {
            str = str2;
        } else if (str2 != null && str2.length() != 0) {
            str = a9.p.w(str, " ", str2);
        }
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        String str4 = " " + strTrim.toLowerCase();
        int i10 = 0;
        while (true) {
            int iIndexOf = str4.indexOf(" " + str3, i10);
            if (iIndexOf == -1) {
                break;
            }
            int i11 = iIndexOf - (iIndexOf == 0 ? 0 : 1);
            int length = str3.length() + (iIndexOf == 0 ? 0 : 1) + i11;
            if (i10 != 0 && i10 != i11 + 1) {
                spannableStringBuilder.append((CharSequence) strTrim.substring(i10, i11));
            } else if (i10 == 0 && i11 != 0) {
                spannableStringBuilder.append((CharSequence) strTrim.substring(0, i11));
            }
            String strSubstring = strTrim.substring(i11, Math.min(strTrim.length(), length));
            if (strSubstring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String strTrim2 = strSubstring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) strTrim2);
            spannableStringBuilder.setSpan(new s00(org.telegram.ui.ActionBar.g6.q6, null), length2, strTrim2.length() + length2, 33);
            i10 = length;
        }
        if (i10 != -1 && i10 < strTrim.length()) {
            spannableStringBuilder.append((CharSequence) strTrim.substring(i10));
        }
        return spannableStringBuilder;
    }

    public static File generateVideoPath() {
        return generateVideoPath(false);
    }

    public static Activity getActivity() {
        return getActivity(null);
    }

    private static File getAlbumDir(boolean z10) {
        int i10;
        if (z10 || !BuildVars.NO_SCOPED_STORAGE || (((i10 = Build.VERSION.SDK_INT) >= 33 && ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) || (i10 >= 23 && i10 <= 33 && ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0))) {
            return FileLoader.getDirectory(0);
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("External storage is not mounted READ/WRITE.");
            }
            return null;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
        if (file.mkdirs() || file.exists()) {
            return file;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("failed to create directory");
        }
        return null;
    }

    public static float getAnimatorDurationScale() {
        try {
            return Settings.Global.getFloat(ApplicationLoader.applicationContext.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    public static int getAverageColor(int i10, int i11) {
        int iRed = Color.red(i10);
        int iRed2 = Color.red(i11);
        int iGreen = Color.green(i10);
        int iGreen2 = Color.green(i11);
        int iBlue = Color.blue(i10);
        return Color.argb(255, (iRed2 / 2) + (iRed / 2), (iGreen2 / 2) + (iGreen / 2), (Color.blue(i11) / 2) + (iBlue / 2));
    }

    public static Bitmap getBitmapFromRaw(int i10) {
        InputStream inputStreamOpenRawResource;
        Bitmap bitmapDecodeStream = null;
        try {
            inputStreamOpenRawResource = ApplicationLoader.applicationContext.getResources().openRawResource(i10);
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource);
            } catch (Throwable th) {
                th = th;
                try {
                    FileLog.e(th);
                } finally {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
        return bitmapDecodeStream;
    }

    public static void getBitmapFromSurface(SurfaceView surfaceView, Bitmap bitmap) {
        if (surfaceView == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surfaceView, bitmap, new j(countDownLatch, 0), Utilities.searchQueue.getHandler());
        try {
            countDownLatch.await();
        } catch (InterruptedException e9) {
            e9.printStackTrace();
        }
    }

    public static Bitmap getBitmapFromWindow(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i10) {
                    AndroidUtilities.lambda$getBitmapFromWindow$6(zArr, countDownLatch, i10);
                }
            }, Utilities.searchQueue.getHandler());
            try {
                countDownLatch.await();
            } catch (InterruptedException e9) {
                e9.printStackTrace();
            }
            if (zArr[0]) {
                return bitmapCreateBitmap;
            }
            bitmapCreateBitmap.recycle();
        }
        return null;
    }

    public static Uri getBitmapShareUri(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File cacheDir = getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }
        File file = new File(cacheDir, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(compressFormat, 87, fileOutputStream);
                fileOutputStream.close();
                Uri uriD = FileProvider.d(ApplicationLoader.applicationContext, ApplicationLoader.getApplicationId() + ".provider", file);
                fileOutputStream.close();
                return uriD;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static String getBuildVersionInfo() {
        String str;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            int i10 = packageInfo.versionCode;
            int i11 = i10 / 10;
            int i12 = i10 % 10;
            if (i12 == 1 || i12 == 2) {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else if (ApplicationLoader.isStandaloneBuild()) {
                str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            int i13 = R.string.TelegramVersion;
            Locale locale = Locale.US;
            return LocaleController.formatString("TelegramVersion", i13, "v" + packageInfo.versionName + " (" + i11 + ") " + str);
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static File getCacheDir() {
        String externalStorageState;
        String path = null;
        try {
            externalStorageState = Environment.getExternalStorageState();
        } catch (Exception e9) {
            FileLog.e(e9);
            externalStorageState = null;
        }
        if (externalStorageState == null || externalStorageState.startsWith("mounted")) {
            FileLog.d("external dir mounted");
            try {
                File[] externalCacheDirs = ApplicationLoader.applicationContext.getExternalCacheDirs();
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    for (int i10 = 0; i10 < externalCacheDirs.length; i10++) {
                        File file2 = externalCacheDirs[i10];
                        if (file2 != null && file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                            file = externalCacheDirs[i10];
                            break;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("check dir ");
                if (file != null) {
                    path = file.getPath();
                }
                sb2.append(path);
                sb2.append(" ");
                FileLog.d(sb2.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    FileLog.d("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        try {
            File cacheDir = ApplicationLoader.applicationContext.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
            if (filesDir != null) {
                File file3 = new File(filesDir, "cache/");
                file3.mkdirs();
                if ((filesDir.exists() || filesDir.mkdirs()) && filesDir.canWrite()) {
                    return file3;
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static String getCertificateSHA1Fingerprint() {
        try {
            return Utilities.bytesToHex(Utilities.computeSHA1(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getCertificateSHA256Fingerprint() {
        try {
            return Utilities.bytesToHex(Utilities.computeSHA256(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int getColorDistance(int i10, int i11) {
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        int iRed2 = Color.red(i11);
        int i12 = (iRed + iRed2) / 2;
        int i13 = iRed - iRed2;
        int iGreen2 = iGreen - Color.green(i11);
        int iBlue2 = iBlue - Color.blue(i11);
        return (iGreen2 * 4 * iGreen2) + ((((i12 + 512) * i13) * i13) >> 8) + ((((767 - i12) * iBlue2) * iBlue2) >> 8);
    }

    public static float[] getCoordinateInParent(ViewGroup viewGroup, View view) {
        float f10;
        float f11 = 0.0f;
        if (view != null && viewGroup != null) {
            f10 = 0.0f;
            float f12 = 0.0f;
            while (true) {
                if (view == viewGroup) {
                    f11 = f12;
                    break;
                }
                if (view != null) {
                    float y10 = view.getY() + f10;
                    float x8 = view.getX() + f12;
                    if (view instanceof NestedScrollView) {
                        y10 -= view.getScrollY();
                        x8 -= view.getScrollX();
                    }
                    f12 = x8;
                    f10 = y10;
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
                f10 = 0.0f;
                break;
            }
        }
        f10 = 0.0f;
        break;
        return new float[]{f11, f10};
    }

    public static String[] getCurrentKeyboardLanguage() {
        String locale;
        String langCode;
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
            InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
            String str = null;
            if (currentInputMethodSubtype != null) {
                locale = Build.VERSION.SDK_INT >= 24 ? currentInputMethodSubtype.getLanguageTag() : null;
                if (TextUtils.isEmpty(locale)) {
                    locale = currentInputMethodSubtype.getLocale();
                }
            } else {
                InputMethodSubtype lastInputMethodSubtype = inputMethodManager.getLastInputMethodSubtype();
                if (lastInputMethodSubtype != null) {
                    String languageTag = Build.VERSION.SDK_INT >= 24 ? lastInputMethodSubtype.getLanguageTag() : null;
                    locale = TextUtils.isEmpty(languageTag) ? lastInputMethodSubtype.getLocale() : languageTag;
                } else {
                    locale = null;
                }
            }
            if (!TextUtils.isEmpty(locale)) {
                return new String[]{locale.replace('_', '-')};
            }
            String systemLocaleStringIso639 = LocaleController.getSystemLocaleStringIso639();
            LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
            String baseLangCode = currentLocaleInfo.getBaseLangCode();
            if (TextUtils.isEmpty(baseLangCode)) {
                langCode = baseLangCode;
                langCode = currentLocaleInfo.getLangCode();
            }
            langCode = baseLangCode;
            if (!systemLocaleStringIso639.contains(langCode) && !langCode.contains(systemLocaleStringIso639)) {
                str = langCode;
            } else if (!systemLocaleStringIso639.contains("en")) {
                str = "en";
            }
            return !TextUtils.isEmpty(str) ? new String[]{systemLocaleStringIso639.replace('_', '-'), str} : new String[]{systemLocaleStringIso639.replace('_', '-')};
        } catch (Exception unused) {
            return new String[]{"en"};
        }
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        if (string.startsWith("content://") || !(string.startsWith("/") || string.startsWith("file://"))) {
                            cursorQuery.close();
                            return null;
                        }
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static ArrayList<File> getDataDirs() {
        ArrayList<File> arrayList = null;
        File[] externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (int i10 = 0; i10 < externalFilesDirs.length; i10++) {
                File file = externalFilesDirs[i10];
                if (file != null) {
                    file.getAbsolutePath();
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(externalFilesDirs[i10]);
                }
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Environment.getExternalStorageDirectory());
        }
        return arrayList;
    }

    public static i0.c getDefaultWindowInsets(r0.m1 m1Var, boolean z10) {
        i0.c cVarG = m1Var.f46619a.g(647);
        return z10 ? i0.c.a(cVarG, m1Var.f46619a.f(8)) : cVarG;
    }

    public static int getDominantColor(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iBlue = 0;
        for (int i13 = 0; i13 < 10; i13++) {
            for (int i14 = 0; i14 < 10; i14++) {
                int pixel = bitmap.getPixel((int) (i13 * width), (int) (i14 * height));
                if (Color.alpha(pixel) > 200) {
                    int iRed = Color.red(pixel) + i11;
                    int iGreen = Color.green(pixel) + i12;
                    i10++;
                    iBlue = Color.blue(pixel) + iBlue;
                    i12 = iGreen;
                    i11 = iRed;
                }
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Color.argb(255, i11 / i10, i12 / i10, iBlue / i10);
    }

    public static String getHelloWorld() {
        return "Hello World!";
    }

    public static String getHostAuthority(String str) {
        return getHostAuthority(str, false);
    }

    public static Pair<Integer, Integer> getImageOrientation(InputStream inputStream) {
        try {
            return getImageOrientation(new r1.g(inputStream));
        } catch (Exception e9) {
            FileLog.e(e9);
            return new Pair<>(0, 0);
        }
    }

    public static boolean getLightNavigationBar(Window window) {
        if (Build.VERSION.SDK_INT >= 26) {
            return h7.a8.a(window.getDecorView().getSystemUiVisibility(), 16);
        }
        return false;
    }

    public static File getLogsDir() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null).getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(ApplicationLoader.applicationContext.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(ApplicationLoader.applicationContext.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            ApplicationLoader.appCenterLog(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static int getMinTabletSide() {
        if (!isSmallTablet()) {
            Point point = displaySize;
            int iMin = Math.min(point.x, point.y);
            return iMin - getTabletLeftFragmentSize(iMin, 0, 0);
        }
        Point point2 = displaySize;
        int iMin2 = Math.min(point2.x, point2.y);
        Point point3 = displaySize;
        int iMax = Math.max(point3.x, point3.y);
        return Math.min(iMin2, iMax - getTabletLeftFragmentSize(iMax, 0, 0));
    }

    public static int getMyLayerVersion(int i10) {
        return i10 & 65535;
    }

    public static float getNavigationBarThirdButtonsFactor(int i10) {
        return Utilities.clamp01((i10 - dp(32.0f)) / dp(16.0f));
    }

    public static int getOffsetColor(int i10, int i11, float f10, float f11) {
        int iRed = Color.red(i11);
        int iGreen = Color.green(i11);
        int iBlue = Color.blue(i11);
        int iAlpha = Color.alpha(i11);
        int iRed2 = Color.red(i10);
        int iGreen2 = Color.green(i10);
        int iBlue2 = Color.blue(i10);
        int iAlpha2 = Color.alpha(i10);
        return Color.argb((int) com.google.android.recaptcha.internal.a.B(iAlpha - iAlpha2, f10, iAlpha2, f11), (int) (((iRed - iRed2) * f10) + iRed2), (int) (((iGreen - iGreen2) * f10) + iGreen2), (int) (((iBlue - iBlue2) * f10) + iBlue2));
    }

    public static String getPath(Uri uri) {
        Uri uri2;
        try {
            if (DocumentsContract.isDocumentUri(ApplicationLoader.applicationContext, uri)) {
                if (isExternalStorageDocument(uri)) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                    }
                } else {
                    if (isDownloadsDocument(uri)) {
                        return getDataColumn(ApplicationLoader.applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if (isMediaDocument(uri)) {
                        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str = strArrSplit2[0];
                        int iHashCode = str.hashCode();
                        if (iHashCode != 93166550) {
                            if (iHashCode != 100313435) {
                                if (iHashCode == 112202875 && str.equals("video")) {
                                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                } else {
                                    uri2 = null;
                                }
                            } else if (str.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            } else {
                                uri2 = null;
                            }
                        } else if (str.equals("audio")) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        } else {
                            uri2 = null;
                        }
                        return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{strArrSplit2[1]});
                    }
                }
            } else {
                if ("content".equalsIgnoreCase(uri.getScheme())) {
                    return getDataColumn(ApplicationLoader.applicationContext, uri, null, null);
                }
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return null;
    }

    public static int getPatternColor(int i10) {
        return getPatternColor(i10, false);
    }

    public static int getPatternSideColor(int i10) {
        float[] fArrRGBtoHSB = RGBtoHSB(Color.red(i10), Color.green(i10), Color.blue(i10));
        fArrRGBtoHSB[1] = Math.min(1.0f, fArrRGBtoHSB[1] + 0.05f);
        float f10 = fArrRGBtoHSB[2];
        if (f10 > 0.5f) {
            fArrRGBtoHSB[2] = Math.max(0.0f, f10 * 0.9f);
        } else {
            fArrRGBtoHSB[2] = Math.max(0.0f, f10 * 0.9f);
        }
        return HSBtoRGB(fArrRGBtoHSB[0], fArrRGBtoHSB[1], fArrRGBtoHSB[2]) | (-16777216);
    }

    public static int getPeerLayerVersion(int i10) {
        return Math.max(73, (i10 >> 16) & 65535);
    }

    public static int getPhotoSize() {
        return getPhotoSize(false);
    }

    public static float getPixelsInCM(float f10, boolean z10) {
        return (f10 / 2.54f) * (z10 ? displayMetrics.xdpi : displayMetrics.ydpi);
    }

    public static long getPrefIntOrLong(SharedPreferences sharedPreferences, String str, long j10) {
        try {
            return sharedPreferences.getLong(str, j10);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j10);
        }
    }

    public static Point getRealScreenSize() {
        Point point = new Point();
        try {
            ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e9) {
            FileLog.e(e9);
            return point;
        }
    }

    public static ArrayList<File> getRootDirs() {
        File externalStorageDirectory;
        String absolutePath;
        int iIndexOf;
        HashSet hashSet = new HashSet();
        ArrayList<File> arrayList = null;
        File[] externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (iIndexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    File file2 = new File(absolutePath.substring(0, iIndexOf));
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).getPath().equals(file2.getPath());
                    }
                    if (!hashSet.contains(file2.getAbsolutePath())) {
                        hashSet.add(file2.getAbsolutePath());
                        arrayList.add(file2);
                    }
                }
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (arrayList.isEmpty() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !hashSet.contains(externalStorageDirectory.getAbsolutePath())) {
            arrayList.add(externalStorageDirectory);
        }
        return arrayList;
    }

    public static View getRootView(View view) {
        while (view != null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static String getSafeString(String str) {
        try {
            return BAD_CHARS_MESSAGE_PATTERN.matcher(str).replaceAll("\u200c");
        } catch (Throwable unused) {
            return str;
        }
    }

    public static Bitmap getScaledBitmap(float f10, float f11, String str, String str2, int i10) {
        FileInputStream fileInputStream;
        int i11;
        Bitmap bitmapDecodeStream;
        int i12;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            if (str != null) {
                BitmapFactory.decodeFile(str, options);
                fileInputStream = null;
            } else {
                fileInputStream = new FileInputStream(str2);
                try {
                    fileInputStream.getChannel().position(i10);
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                } catch (Throwable th) {
                    th = th;
                    try {
                        FileLog.e(th);
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                        }
                    }
                }
            }
            int i13 = options.outWidth;
            if (i13 <= 0 || (i11 = options.outHeight) <= 0) {
                if (fileInputStream != null) {
                }
                return null;
            }
            if (f10 > f11 && i13 < i11) {
                f11 = f10;
                f10 = f11;
            }
            float fMin = Math.min(i13 / f10, i11 / f11);
            options.inSampleSize = 1;
            if (fMin > 1.0f) {
                do {
                    i12 = options.inSampleSize * 2;
                    options.inSampleSize = i12;
                } while (i12 < fMin);
            }
            options.inJustDecodeBounds = false;
            if (str != null) {
                bitmapDecodeStream = BitmapFactory.decodeFile(str, options);
            } else {
                fileInputStream.getChannel().position(i10);
                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    return bitmapDecodeStream;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            return bitmapDecodeStream;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static int getShadowHeight() {
        float f10 = density;
        if (f10 >= 4.0f) {
            return 3;
        }
        return f10 >= 2.0f ? 2 : 1;
    }

    public static File getSharingDirectory() {
        return new File(FileLoader.getDirectory(4), "sharing/");
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static Long getSysInfoLong(String str) throws Throwable {
        String sysInfoString = getSysInfoString(str);
        if (sysInfoString == null) {
            return null;
        }
        try {
            return Utilities.parseLong(sysInfoString);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getSysInfoString(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    String line = randomAccessFile.readLine();
                    if (line != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused) {
                        }
                        return line;
                    }
                } catch (Exception unused2) {
                    if (randomAccessFile != null) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
                randomAccessFile = null;
            } catch (Throwable th2) {
                th = th2;
            }
            randomAccessFile.close();
        } catch (Exception unused5) {
        }
        return null;
    }

    public static String getSystemProperty(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getTabletLeftFragmentSize(int i10, int i11, int i12) {
        return Math.max(dp(320.0f), (((i10 - i11) - i12) * 35) / 100) + i11;
    }

    public static int getThumbForNameOrMime(String str, String str2, boolean z10) {
        int iCharAt;
        if (str == null || str.length() == 0) {
            return z10 ? documentMediaIcons[0] : documentIcons[0];
        }
        if (str.contains(".doc") || str.contains(".txt") || str.contains(".psd")) {
            iCharAt = 0;
        } else if (str.contains(".xls") || str.contains(".csv")) {
            iCharAt = 1;
        } else if (str.contains(".pdf") || str.contains(".ppt") || str.contains(".key")) {
            iCharAt = 2;
        } else {
            iCharAt = (str.contains(".zip") || str.contains(".rar") || str.contains(".ai") || str.contains(".mp3") || str.contains(".mov") || str.contains(".avi")) ? 3 : -1;
        }
        if (iCharAt == -1) {
            int iLastIndexOf = str.lastIndexOf(46);
            String strSubstring = iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
            iCharAt = strSubstring.length() != 0 ? strSubstring.charAt(0) % documentIcons.length : str.charAt(0) % documentIcons.length;
        }
        return z10 ? documentMediaIcons[iCharAt] : documentIcons[iCharAt];
    }

    public static CharSequence getTrimmedString(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            while (charSequence.length() > 0 && (charSequence.charAt(0) == '\n' || charSequence.charAt(0) == ' ')) {
                charSequence = charSequence.subSequence(1, charSequence.length());
            }
            while (charSequence.length() > 0 && (charSequence.charAt(charSequence.length() - 1) == '\n' || charSequence.charAt(charSequence.length() - 1) == ' ')) {
                charSequence = charSequence.subSequence(0, charSequence.length() - 1);
            }
        }
        return charSequence;
    }

    public static Typeface getTypeface(String str) {
        Typeface typefaceCreateFromAsset;
        Typeface typeface;
        Hashtable<String, Typeface> hashtable = typefaceCache;
        synchronized (hashtable) {
            try {
                if (!hashtable.containsKey(str)) {
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            Typeface.Builder builder = new Typeface.Builder(ApplicationLoader.applicationContext.getAssets(), str);
                            if (str.contains("rextrabold")) {
                                builder.setWeight(800);
                            }
                            if (str.contains("medium") || str.contains("rbold")) {
                                builder.setWeight(700);
                            }
                            if (str.contains("italic")) {
                                builder.setItalic(true);
                            }
                            typefaceCreateFromAsset = builder.build();
                        } else {
                            typefaceCreateFromAsset = Typeface.createFromAsset(ApplicationLoader.applicationContext.getAssets(), str);
                        }
                        hashtable.put(str, typefaceCreateFromAsset);
                    } catch (Exception e9) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Could not get typeface '" + str + "' because " + e9.getMessage());
                        }
                        return null;
                    }
                }
                typeface = hashtable.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return typeface;
    }

    public static Pattern getURIParsePattern() {
        if (uriParse == null) {
            uriParse = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
        }
        return uriParse;
    }

    public static Vibrator getVibrator() {
        if (vibrator == null) {
            vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
        }
        return vibrator;
    }

    public static int getViewInset(View view) {
        if (view != null && view.getHeight() != displaySize.y && view.getHeight() != displaySize.y - statusBarHeight) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        return rootWindowInsets.getStableInsetBottom();
                    }
                    return 0;
                }
                if (mAttachInfoField == null) {
                    Field declaredField = View.class.getDeclaredField("mAttachInfo");
                    mAttachInfoField = declaredField;
                    declaredField.setAccessible(true);
                }
                Object obj = mAttachInfoField.get(view);
                if (obj != null) {
                    if (mStableInsetsField == null) {
                        Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
                        mStableInsetsField = declaredField2;
                        declaredField2.setAccessible(true);
                    }
                    return ((Rect) mStableInsetsField.get(obj)).bottom;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return 0;
    }

    public static void getViewPositionInParent(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view == null || viewGroup == null) {
            return;
        }
        while (view != viewGroup) {
            if (!(view.getParent() instanceof m2.g)) {
                fArr[0] = view.getX() + fArr[0];
                fArr[1] = view.getY() + fArr[1];
            }
            view = (View) view.getParent();
        }
    }

    public static String getWallPaperUrl(Object obj) {
        if (!(obj instanceof TLRPC.TL_wallPaper)) {
            if (obj instanceof wh1) {
                return ((wh1) obj).b();
            }
            return null;
        }
        TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
        String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + tL_wallPaper.slug;
        StringBuilder sb2 = new StringBuilder();
        TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
        if (wallPaperSettings != null) {
            if (wallPaperSettings.blur) {
                sb2.append("blur");
            }
            if (tL_wallPaper.settings.motion) {
                if (sb2.length() > 0) {
                    sb2.append("+");
                }
                sb2.append("motion");
            }
        }
        if (sb2.length() <= 0) {
            return str;
        }
        StringBuilder sbF = s3.c.f(str, "?mode=");
        sbF.append(sb2.toString());
        return sbF.toString();
    }

    public static int getWallpaperRotation(int i10, boolean z10) {
        int i11 = z10 ? i10 + 180 : i10 - 180;
        while (i11 >= 360) {
            i11 -= 360;
        }
        while (i11 < 0) {
            i11 += 360;
        }
        return i11;
    }

    public static Boolean getWasTablet() {
        return wasTablet;
    }

    public static void googleVoiceClientService_performAction(Intent intent, boolean z10, Bundle bundle) {
        if (z10) {
            runOnUIThread(new k(intent, 0));
        }
    }

    public static boolean gzip(File file, File file2) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = bufferedInputStream.read(bArr);
                        if (i10 == -1) {
                            gZIPOutputStream.close();
                            bufferedInputStream.close();
                            return true;
                        }
                        gZIPOutputStream.write(bArr, 0, i10);
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                bufferedInputStream.close();
                throw th4;
            }
        } catch (FileNotFoundException e9) {
            FileLog.e(e9);
            return false;
        } catch (IOException e10) {
            FileLog.e(e10);
            return false;
        }
    }

    public static boolean handleProxyIntent(Activity activity, Intent intent, boolean z10) {
        Uri data;
        String queryParameter;
        String queryParameter2;
        String str;
        String str2;
        String path;
        String queryParameter3;
        String queryParameter4;
        String str3;
        if (intent == null) {
            return false;
        }
        try {
            if ((intent.getFlags() & 1048576) == 0 && (data = intent.getData()) != null) {
                String scheme = data.getScheme();
                String str4 = null;
                if (scheme == null) {
                    queryParameter = null;
                    queryParameter2 = null;
                    str = null;
                    str2 = null;
                } else if (scheme.equals("http") || scheme.equals("https")) {
                    String lowerCase = data.getHost().toLowerCase();
                    if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && (path.startsWith("/socks") || path.startsWith("/proxy"))) {
                        String queryParameter5 = data.getQueryParameter("server");
                        if (checkHostForPunycode(queryParameter5)) {
                            queryParameter5 = IDN.toASCII(queryParameter5, 1);
                        }
                        String str5 = queryParameter5;
                        queryParameter3 = data.getQueryParameter("port");
                        String queryParameter6 = data.getQueryParameter("user");
                        queryParameter2 = data.getQueryParameter("pass");
                        queryParameter4 = data.getQueryParameter("secret");
                        str4 = queryParameter6;
                        str3 = str5;
                    } else {
                        queryParameter3 = null;
                        str3 = null;
                        queryParameter4 = null;
                        queryParameter2 = null;
                    }
                    str2 = queryParameter3;
                    str = str3;
                    queryParameter = queryParameter4;
                } else if (scheme.equals("tg")) {
                    String string = data.toString();
                    if (string.startsWith("tg:proxy") || string.startsWith("tg://proxy") || string.startsWith("tg:socks") || string.startsWith("tg://socks")) {
                        Uri uri = Uri.parse(string.replace("tg:proxy", "tg://telegram.org").replace("tg://proxy", "tg://telegram.org").replace("tg://socks", "tg://telegram.org").replace("tg:socks", "tg://telegram.org"));
                        String queryParameter7 = uri.getQueryParameter("server");
                        if (checkHostForPunycode(queryParameter7)) {
                            queryParameter7 = IDN.toASCII(queryParameter7, 1);
                        }
                        String str6 = queryParameter7;
                        String queryParameter8 = uri.getQueryParameter("port");
                        String queryParameter9 = uri.getQueryParameter("user");
                        queryParameter2 = uri.getQueryParameter("pass");
                        queryParameter = uri.getQueryParameter("secret");
                        str2 = queryParameter8;
                        str = str6;
                        str4 = queryParameter9;
                    } else {
                        queryParameter = null;
                        queryParameter2 = null;
                        str = null;
                        str2 = null;
                    }
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    str = null;
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    String str7 = str4 == null ? "" : str4;
                    String str8 = queryParameter2 == null ? "" : queryParameter2;
                    String str9 = queryParameter == null ? "" : queryParameter;
                    if (z10) {
                        showProxyAlert(activity, str, str2, str7, str8, str9);
                    }
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean hasDialogOnTop(org.telegram.ui.ActionBar.n2 n2Var) {
        List<View> listAllGlobalViews;
        if (n2Var == null) {
            return false;
        }
        Dialog dialog = n2Var.visibleDialog;
        if (dialog != null && !(dialog instanceof org.telegram.ui.ActionBar.b2) && (!(dialog instanceof org.telegram.ui.ActionBar.e3) || ((org.telegram.ui.ActionBar.e3) dialog).attachedFragment == null)) {
            return true;
        }
        if (n2Var.getParentLayout() != null && (listAllGlobalViews = allGlobalViews()) != null && !listAllGlobalViews.isEmpty()) {
            View view = null;
            for (int size = listAllGlobalViews.size() - 1; size >= 0; size--) {
                view = listAllGlobalViews.get(size);
                Dialog dialog2 = n2Var.visibleDialog;
                if ((!(dialog2 instanceof org.telegram.ui.ActionBar.b2) || view != getRootView(((org.telegram.ui.ActionBar.b2) dialog2).W0)) && !(view instanceof org.telegram.ui.ActionBar.z1) && !(view instanceof jf0)) {
                    break;
                }
            }
            if (view != getRootView(n2Var.getParentLayout().getView())) {
                return true;
            }
        }
        return false;
    }

    public static void hideKeyboard(View view) {
        if (view == null) {
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static CharSequence highlightText(CharSequence charSequence, ArrayList<String> arrayList, org.telegram.ui.ActionBar.c6 c6Var) {
        if (arrayList == null) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            CharSequence charSequenceHighlightText = highlightText(charSequence, arrayList.get(i11), c6Var);
            if (charSequenceHighlightText != null) {
                charSequence = charSequenceHighlightText;
            } else {
                i10++;
            }
        }
        if (i10 == arrayList.size()) {
            return null;
        }
        return charSequence;
    }

    public static int hsvToColor(double d, double d10, double d11) {
        int[] iArrHsvToRgb = hsvToRgb(d, d10, d11);
        return Color.argb(255, iArrHsvToRgb[0], iArrHsvToRgb[1], iArrHsvToRgb[2]);
    }

    public static int[] hsvToRgb(double d, double d10, double d11) {
        double d12;
        double d13 = d * 6.0d;
        double dFloor = (int) Math.floor(d13);
        double d14 = d13 - dFloor;
        double d15 = (1.0d - d10) * d11;
        double d16 = (1.0d - (d14 * d10)) * d11;
        double d17 = (1.0d - ((1.0d - d14) * d10)) * d11;
        int i10 = ((int) dFloor) % 6;
        if (i10 == 0) {
            d15 = d17;
            d17 = d15;
        } else if (i10 != 1) {
            if (i10 == 2) {
                d12 = d15;
                d15 = d11;
            } else if (i10 == 3) {
                d17 = d11;
                d11 = d15;
                d15 = d16;
            } else if (i10 == 4) {
                d12 = d17;
                d17 = d11;
            } else if (i10 != 5) {
                d11 = 0.0d;
                d17 = 0.0d;
                d15 = 0.0d;
            } else {
                d17 = d16;
            }
            d11 = d12;
        } else {
            d17 = d15;
            d15 = d11;
            d11 = d16;
        }
        return new int[]{(int) (d11 * 255.0d), (int) (d15 * 255.0d), (int) (d17 * 255.0d)};
    }

    public static float ilerp(float f10, float f11, float f12) {
        return (f10 - f11) / (f12 - f11);
    }

    public static int indexOfIgnoreCase(String str, String str2) {
        if (str2.isEmpty() || str.isEmpty()) {
            return str.indexOf(str2);
        }
        for (int i10 = 0; i10 < str.length() && str2.length() + i10 <= str.length(); i10++) {
            int i11 = 0;
            for (int i12 = i10; i12 < str.length() && i11 < str2.length() && Character.toLowerCase(str.charAt(i12)) == Character.toLowerCase(str2.charAt(i11)); i12++) {
                i11++;
            }
            if (i11 == str2.length()) {
                return i10;
            }
        }
        return -1;
    }

    public static boolean intersect1d(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i11) > Math.min(i12, i13) && Math.max(i12, i13) > Math.min(i10, i11);
    }

    public static boolean intersect1dInclusive(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i11) >= Math.min(i12, i13) && Math.max(i12, i13) >= Math.min(i10, i11);
    }

    public static boolean isAccessibilityScreenReaderEnabled() {
        return isAccessibilityTouchExplorationEnabled();
    }

    public static boolean isAccessibilityTouchExplorationEnabled() {
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
        }
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean isActivityRunning(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean isAirplaneModeOn() {
        return Settings.Global.getInt(ApplicationLoader.applicationContext.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean isBannedForever(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        return tL_chatBannedRights == null || Math.abs(((long) tL_chatBannedRights.until_date) - (System.currentTimeMillis() / 1000)) > 157680000;
    }

    public static boolean isContextSafe(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return isContextSafe(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static boolean isDarkColor(int i10) {
        return computePerceivedBrightness(i10) < 0.721f;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isENOSPC(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.ENOSPC) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().equalsIgnoreCase("no space left on device");
    }

    public static boolean isEROFS(Exception exc) {
        if ((exc instanceof IOException) && (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.EROFS) {
            return true;
        }
        return exc.getMessage() != null && exc.getMessage().toLowerCase().contains("read-only file system");
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isFilNotFoundException(Throwable th) {
        return (th instanceof FileNotFoundException) || (th instanceof EOFException);
    }

    public static boolean isFold() {
        return ApplicationLoader.applicationContext != null && ApplicationLoader.applicationContext.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean isHonor() {
        if (isHonor == null) {
            try {
                String lowerCase = Build.BRAND.toLowerCase();
                isHonor = Boolean.valueOf(lowerCase.contains("huawei") || lowerCase.contains("honor"));
            } catch (Exception e9) {
                FileLog.e(e9);
                isHonor = Boolean.FALSE;
            }
        }
        return isHonor.booleanValue();
    }

    public static boolean isInAirplaneMode(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception unused) {
        }
    }

    public static boolean isInPictureInPictureMode(Activity activity) {
        return Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode();
    }

    public static boolean isInternalUri(Uri uri) {
        return isInternalUri(uri, 0);
    }

    public static boolean isKeyguardSecure() {
        return ((KeyguardManager) ApplicationLoader.applicationContext.getSystemService("keyguard")).isKeyguardSecure();
    }

    public static boolean isMapsInstalled(org.telegram.ui.ActionBar.n2 n2Var) {
        String mapsAppPackageName = ApplicationLoader.getMapsProvider().getMapsAppPackageName();
        try {
            ApplicationLoader.applicationContext.getPackageManager().getApplicationInfo(mapsAppPackageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (n2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity());
            alertDialog$Builder.f22702a.P = LocaleController.getString(ApplicationLoader.getMapsProvider().getInstallMapsString());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new c(1, mapsAppPackageName, n2Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            n2Var.showDialog(alertDialog$Builder.f22702a);
            return false;
        }
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isProxyLink(Uri uri) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        return handleProxyIntent(activity, new Intent("android.intent.action.VIEW", uri), false);
    }

    public static boolean isPunctuationCharacter(char c10) {
        if (charactersMap == null) {
            charactersMap = new HashSet<>();
            int i10 = 0;
            while (true) {
                char[] cArr = characters;
                if (i10 >= cArr.length) {
                    break;
                }
                charactersMap.add(Character.valueOf(cArr[i10]));
                i10++;
            }
        }
        return charactersMap.contains(Character.valueOf(c10));
    }

    public static boolean isRTL(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 1424 && cCharAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafeToShow(Context context) {
        Activity activityFindActivity = findActivity(context);
        if (activityFindActivity == null) {
            return true;
        }
        return isActivityRunning(activityFindActivity);
    }

    public static boolean isSimAvailable() {
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        return (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || isAirplaneModeOn()) ? false : true;
    }

    public static boolean isSmallScreen() {
        if (isSmallScreen == null) {
            Point point = displaySize;
            isSmallScreen = Boolean.valueOf(((float) ((Math.max(point.x, point.y) - statusBarHeight) - navigationBarHeight)) / density <= 650.0f);
        }
        return isSmallScreen.booleanValue();
    }

    public static boolean isSmallTablet() {
        Point point = displaySize;
        return ((float) Math.min(point.x, point.y)) / density <= 690.0f;
    }

    public static boolean isTablet() {
        return isTabletInternal() && !SharedConfig.forceDisableTabletMode;
    }

    public static boolean isTabletForce() {
        return ApplicationLoader.applicationContext != null && ApplicationLoader.applicationContext.getResources().getBoolean(R.bool.isTablet);
    }

    public static boolean isTabletInternal() {
        if (isTablet == null) {
            isTablet = Boolean.valueOf(isTabletForce());
        }
        return isTablet.booleanValue();
    }

    public static boolean isValidWallChar(char c10) {
        return c10 == '-' || c10 == '~';
    }

    public static boolean isWaitingForCall() {
        boolean z10;
        synchronized (callLock) {
            z10 = waitingForCall;
        }
        return z10;
    }

    public static boolean isWaitingForSms() {
        boolean z10;
        synchronized (smsLock) {
            z10 = waitingForSms;
        }
        return z10;
    }

    public static boolean isWhitespace(char c10) {
        return Character.isWhitespace(c10) || c10 == 10240 || c10 == 12644 || c10 == 65440;
    }

    public static boolean isWifiEnabled(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            return wifiManager != null && wifiManager.isWifiEnabled();
        } catch (Exception unused) {
        }
    }

    public static Boolean lambda$addLinksSafe$8(SpannableStringBuilder spannableStringBuilder, int i10, boolean z10, boolean z11) {
        return Boolean.valueOf(addLinks(spannableStringBuilder, i10, z10, z11));
    }

    public static boolean lambda$doOnPreDraw$27(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr, boolean[] zArr, Runnable runnable) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListenerArr[0]);
        }
        if (!zArr[0]) {
            zArr[0] = true;
            runnable.run();
        }
        return true;
    }

    public static Boolean lambda$doSafe$9(Utilities.Callback0Return callback0Return) {
        try {
            return (Boolean) callback0Return.run();
        } catch (Exception e9) {
            FileLog.e(e9);
            return Boolean.FALSE;
        }
    }

    public static String lambda$formatSpannable$16(Integer num) {
        return "%" + (num.intValue() + 1) + "$s";
    }

    public static String lambda$formatSpannableSimple$15(Integer num) {
        return "%s";
    }

    public static void lambda$getBitmapFromWindow$6(boolean[] zArr, CountDownLatch countDownLatch, int i10) {
        zArr[0] = i10 == 0;
        countDownLatch.countDown();
    }

    public static void lambda$googleVoiceClientService_performAction$2(Intent intent) {
        try {
            int i10 = UserConfig.selectedAccount;
            ApplicationLoader.postInitApplication();
            if (!needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                long j10 = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user == null && (user = MessagesStorage.getInstance(i10).getUserSync(j10)) != null) {
                    MessagesController.getInstance(i10).putUser(user, true);
                }
                if (user != null) {
                    ContactsController.getInstance(i10).markAsContacted(stringExtra2);
                    SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(stringExtra, user.f22527id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$isMapsInstalled$11(String str, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        try {
            n2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$notifyDataSetChanged$26(RecyclerView recyclerView) {
        if (recyclerView.getAdapter() != null) {
            recyclerView.getAdapter().l();
        }
    }

    public static int lambda$pruneOverlaps$10(LinkSpec linkSpec, LinkSpec linkSpec2) {
        int i10;
        int i11;
        int i12 = linkSpec.start;
        int i13 = linkSpec2.start;
        if (i12 < i13) {
            return -1;
        }
        if (i12 <= i13 && (i10 = linkSpec.end) >= (i11 = linkSpec2.end)) {
            return i10 > i11 ? -1 : 0;
        }
        return 1;
    }

    public static void lambda$recycleBitmaps$0(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i10)).get();
            ((WeakReference) arrayList.get(i10)).clear();
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    bitmap.recycle();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
    }

    public static void lambda$recycleBitmaps$1(ArrayList arrayList) {
        Utilities.globalQueue.postRunnable(new e(arrayList, 1));
    }

    public static int lambda$scrollToFragmentRow$24(org.telegram.ui.ActionBar.n2 n2Var, String str, zk0 zk0Var) {
        int i10 = -1;
        try {
            Field declaredField = n2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            f2.k0 k0Var = (f2.k0) zk0Var.getLayoutManager();
            i10 = declaredField.getInt(n2Var);
            k0Var.h1(i10, dp(60.0f));
            declaredField.setAccessible(false);
            return i10;
        } catch (Throwable unused) {
            return i10;
        }
    }

    public static void lambda$setNavigationBarColor$23(IntColorCallback intColorCallback, Window window, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intColorCallback != null) {
            intColorCallback.run(iIntValue);
        }
        try {
            window.setNavigationBarColor(iIntValue);
        } catch (Exception unused) {
        }
    }

    public static void lambda$setWaitingForSms$12(Void r10) {
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sms listener registered");
        }
    }

    public static void lambda$shakeView$13(View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        double dSin = Math.sin(((double) fFloatValue) * 3.141592653589793d * 4.0d);
        view.setTranslationX((float) (dSin * ((double) ((1.0f - fFloatValue) * fFloatValue * 4.0f)) * ((double) dp(4.0f))));
    }

    public static void lambda$shakeViewSpring$14(Runnable runnable, View view, float f10, o1.h hVar, boolean z10, float f11, float f12) {
        if (runnable != null) {
            runnable.run();
        }
        view.setTranslationX(f10);
        view.setTag(R.id.spring_tag, null);
        view.setTag(R.id.spring_was_translation_x_tag, null);
    }

    public static void lambda$showProxyAlert$17(long j10, org.telegram.ui.Components.oc[] ocVarArr) {
        if (j10 == -1) {
            ocVarArr[0].setText(LocaleController.getString(R.string.Unavailable));
            ocVarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
        } else {
            ocVarArr[0].setText(LocaleController.formatString(R.string.Ping2, Long.valueOf(j10)));
            ocVarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23391w6, false));
        }
    }

    public static void lambda$showProxyAlert$18(org.telegram.ui.Components.oc[] ocVarArr, long j10) {
        runOnUIThread(new cg.b2(j10, ocVarArr));
    }

    public static void lambda$showProxyAlert$19(boolean[] zArr, org.telegram.ui.Components.oc[] ocVarArr, String str, String str2, String str3, String str4, String str5) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        ocVarArr[0].setText(LocaleController.getString(R.string.ProxyBottomSheetChecking) + "...");
        ocVarArr[0].f31554b.d(false);
        try {
            ConnectionsManager.getInstance(UserConfig.selectedAccount).checkProxy(str, Integer.parseInt(str2), str3, str4, str5, new d(ocVarArr, 0));
        } catch (NumberFormatException unused) {
            ocVarArr[0].setText(LocaleController.getString(R.string.Unavailable));
            ocVarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
        }
    }

    public static void lambda$showProxyAlert$20(SharedPreferences sharedPreferences, Runnable runnable, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        sharedPreferences.edit().putBoolean("proxycheckstatusip", true).apply();
        runnable.run();
    }

    public static void lambda$showProxyAlert$21(boolean[] zArr, org.telegram.ui.Components.oc[] ocVarArr, String str, String str2, String str3, String str4, String str5, Activity activity) {
        if (zArr[0]) {
            return;
        }
        il ilVar = new il(zArr, ocVarArr, str, str2, str3, str4, str5, 1);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("proxycheckstatusip", false)) {
            ilVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ProxyBottomSheetCheckWarning);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ProxyBottomSheetCheckWarningText);
        alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new c(0, globalMainSettings, ilVar));
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void lambda$showProxyAlert$22(String str, String str2, String str3, String str4, String str5, Activity activity, Runnable runnable, View view) {
        SharedConfig.ProxyInfo proxyInfo;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("proxy_enabled", true);
        editorEdit.putString("proxy_ip", str);
        int iIntValue = Utilities.parseInt((CharSequence) str2).intValue();
        editorEdit.putInt("proxy_port", iIntValue);
        if (TextUtils.isEmpty(str3)) {
            editorEdit.remove("proxy_secret");
            if (TextUtils.isEmpty(str4)) {
                editorEdit.remove("proxy_pass");
            } else {
                editorEdit.putString("proxy_pass", str4);
            }
            if (TextUtils.isEmpty(str5)) {
                editorEdit.remove("proxy_user");
            } else {
                editorEdit.putString("proxy_user", str5);
            }
            proxyInfo = new SharedConfig.ProxyInfo(str, iIntValue, str5, str4, "");
        } else {
            editorEdit.remove("proxy_pass");
            editorEdit.remove("proxy_user");
            editorEdit.putString("proxy_secret", str3);
            proxyInfo = new SharedConfig.ProxyInfo(str, iIntValue, "", "", str3);
        }
        editorEdit.commit();
        SharedConfig.currentProxy = SharedConfig.addProxy(proxyInfo);
        ConnectionsManager.setProxySettings(true, str, iIntValue, str5, str4, str3);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        if (activity instanceof LaunchActivity) {
            org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
            if (lastFragment instanceof rn) {
                rn rnVar = (rn) lastFragment;
                rnVar.Q7();
                UndoView undoView = rnVar.f42229u3;
                if (undoView != null) {
                    undoView.j(87, 0L, null);
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 6, LocaleController.getString(R.string.ProxyAddedSuccess));
                }
            } else {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 6, LocaleController.getString(R.string.ProxyAddedSuccess));
            }
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 6, LocaleController.getString(R.string.ProxyAddedSuccess));
        }
        runnable.run();
    }

    public static boolean lambda$static$7(CharSequence charSequence, int i10, int i11) {
        return i10 == 0 || charSequence.charAt(i10 - 1) != '@';
    }

    public static void lambda$updateImageViewImageAnimated$25(ImageView imageView, AtomicBoolean atomicBoolean, Drawable drawable, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fAbs = Math.abs(fFloatValue - 0.5f) + 0.5f;
        imageView.setScaleX(fAbs);
        imageView.setScaleY(fAbs);
        if (fFloatValue < 0.5f || atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        imageView.setImageDrawable(drawable);
    }

    public static double lerp(double d, double d10, float f10) {
        return ((d10 - d) * ((double) f10)) + d;
    }

    public static float lerp3(float f10, float f11, float f12, float f13) {
        return f13 < 0.0f ? lerp(f11, f10, -f13) : lerp(f11, f12, f13);
    }

    public static float lerpAngle(float f10, float f11, float f12) {
        return ((((((((f11 - f10) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f12) + f10) + 360.0f) % 360.0f;
    }

    public static void lerpCentered(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float fLerp = lerp(rectF.centerX(), rectF2.centerX(), f10);
        float fLerp2 = lerp(rectF.centerY(), rectF2.centerY(), f10);
        float fLerp3 = lerp(rectF.width(), rectF2.width(), Math.min(1.0f, f10)) / 2.0f;
        float fLerp4 = lerp(rectF.height(), rectF2.height(), Math.min(1.0f, f10)) / 2.0f;
        rectF3.set(fLerp - fLerp3, fLerp2 - fLerp4, fLerp + fLerp3, fLerp2 + fLerp4);
    }

    public static int lerpColor(int i10, int i11, float f10) {
        return Color.argb(lerp(Color.alpha(i10), Color.alpha(i11), f10), lerp(Color.red(i10), Color.red(i11), f10), lerp(Color.green(i10), Color.green(i11), f10), lerp(Color.blue(i10), Color.blue(i11), f10));
    }

    public static int lerpColor3(int i10, int i11, int i12, float f10) {
        return f10 < 0.0f ? lerpColor(i11, i10, -f10) : lerpColor(i11, i12, f10);
    }

    public static ArrayList<TLRPC.User> loadVCardFromStream(Uri uri, int i10, boolean z10, ArrayList<VcardItem> arrayList, String str) {
        InputStream inputStreamCreateInputStream;
        byte[] bArrDecodeQuotedPrintable;
        VcardItem vcardItem;
        ?? r10;
        VcardItem vcardItem2;
        VcardItem vcardItem3;
        VcardItem vcardItem4;
        VcardItem vcardItem5;
        VcardItem vcardItem6;
        ?? r11;
        VcardItem vcardItem7;
        ArrayList arrayList2 = arrayList;
        ArrayList<TLRPC.User> arrayList3 = null;
        AnonymousClass1 anonymousClass1 = null;
        if (z10) {
            try {
                inputStreamCreateInputStream = ApplicationLoader.applicationContext.getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
            }
        } else {
            try {
                inputStreamCreateInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
            } catch (Throwable th2) {
                th = th2;
                arrayList3 = null;
                FileLog.e(th);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamCreateInputStream, "UTF-8"));
        int i11 = 0;
        VcardData vcardData = null;
        String strSubstring = null;
        ?? r12 = 0;
        boolean z11 = false;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("PHOTO")) {
                z11 = true;
            } else {
                if (line.indexOf(58) >= 0) {
                    if (line.startsWith("BEGIN:VCARD")) {
                        vcardData = new VcardData();
                        arrayList4.add(vcardData);
                        vcardData.name = str;
                    } else {
                        if (!line.startsWith("END:VCARD") && arrayList2 != null) {
                            if (line.startsWith("TEL")) {
                                vcardItem7 = new VcardItem();
                                vcardItem7.type = i11;
                            } else if (line.startsWith("EMAIL")) {
                                vcardItem6 = new VcardItem();
                                vcardItem6.type = 1;
                            } else if (line.startsWith("ADR") || line.startsWith("LABEL") || line.startsWith("GEO")) {
                                VcardItem vcardItem8 = new VcardItem();
                                vcardItem8.type = 2;
                                r10 = vcardItem8;
                            } else if (line.startsWith("URL")) {
                                vcardItem5 = new VcardItem();
                                vcardItem5.type = 3;
                            } else if (line.startsWith("NOTE")) {
                                vcardItem4 = new VcardItem();
                                vcardItem4.type = 4;
                            } else if (line.startsWith("BDAY")) {
                                vcardItem3 = new VcardItem();
                                vcardItem3.type = 5;
                            } else if (line.startsWith("ORG") || line.startsWith("TITLE") || line.startsWith("ROLE")) {
                                VcardItem vcardItem9 = new VcardItem();
                                vcardItem9.type = 6;
                                r10 = vcardItem9;
                            } else if (line.startsWith("X-ANDROID")) {
                                vcardItem2 = new VcardItem();
                                vcardItem2.type = -1;
                            } else if (!line.startsWith("X-PHONETIC") && line.startsWith("X-")) {
                                vcardItem = new VcardItem();
                                vcardItem.type = 20;
                            } else {
                                r10 = anonymousClass1;
                            }
                            if (r10 != 0) {
                                r10 = vcardItem;
                                r10 = vcardItem2;
                                r10 = vcardItem3;
                                r10 = vcardItem4;
                                r10 = vcardItem5;
                                r10 = vcardItem6;
                                if (r10.type >= 0) {
                                    r10 = vcardItem7;
                                    arrayList2.add(r10);
                                }
                            }
                            r10 = vcardItem;
                            r10 = vcardItem2;
                            r10 = vcardItem3;
                            r10 = vcardItem4;
                            r10 = vcardItem5;
                            r10 = vcardItem6;
                            r10 = vcardItem7;
                            r10 = vcardItem7;
                            r11 = r10;
                        }
                        z11 = false;
                        r12 = r11;
                    }
                    r11 = anonymousClass1;
                    z11 = false;
                    r12 = r11;
                }
                if (!z11 && vcardData != null) {
                    if (r12 == 0) {
                        if (vcardData.vcard.length() > 0) {
                            vcardData.vcard.append('\n');
                        }
                        vcardData.vcard.append(line);
                    } else {
                        r12.vcardData.add(line);
                    }
                }
                if (strSubstring != null) {
                    line = strSubstring + line;
                    strSubstring = null;
                }
                if (line.contains("=QUOTED-PRINTABLE") && line.endsWith("=")) {
                    strSubstring = line.substring(i11, line.length() - 1);
                    anonymousClass1 = null;
                } else {
                    if (!z11 && vcardData != null && r12 != 0) {
                        r12.fullData = line;
                    }
                    int iIndexOf = line.indexOf(":");
                    String[] strArr = iIndexOf >= 0 ? new String[]{line.substring(i11, iIndexOf), line.substring(iIndexOf + 1).trim()} : new String[]{line.trim()};
                    if (strArr.length >= 2 && vcardData != null) {
                        if (strArr[i11].startsWith("FN") || strArr[i11].startsWith("N") || (strArr[i11].startsWith("ORG") && TextUtils.isEmpty(vcardData.name))) {
                            String[] strArrSplit = strArr[i11].split(";");
                            int length = strArrSplit.length;
                            String[] strArr2 = strArr;
                            String str2 = null;
                            String str3 = null;
                            int i12 = 0;
                            while (i12 < length) {
                                String[] strArrSplit2 = strArrSplit[i12].split("=");
                                String[] strArr3 = strArrSplit;
                                if (strArrSplit2.length == 2) {
                                    if (strArrSplit2[0].equals("CHARSET")) {
                                        str2 = strArrSplit2[1];
                                    } else if (strArrSplit2[0].equals("ENCODING")) {
                                        str3 = strArrSplit2[1];
                                    }
                                }
                                i12++;
                                strArrSplit = strArr3;
                            }
                            if (strArr2[0].startsWith("N")) {
                                vcardData.name = strArr2[1].replace(';', ' ').trim();
                            } else {
                                vcardData.name = strArr2[1];
                            }
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (bArrDecodeQuotedPrintable = decodeQuotedPrintable(getStringBytes(vcardData.name))) != null && bArrDecodeQuotedPrintable.length != 0) {
                                vcardData.name = new String(bArrDecodeQuotedPrintable, str2);
                            }
                        } else if (strArr[i11].startsWith("TEL")) {
                            vcardData.phones.add(strArr[1]);
                        }
                    }
                    arrayList2 = arrayList;
                    inputStreamCreateInputStream = inputStreamCreateInputStream;
                    anonymousClass1 = null;
                    i11 = 0;
                }
            }
        }
        InputStream inputStream = inputStreamCreateInputStream;
        try {
            bufferedReader.close();
            inputStream.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        arrayList3 = null;
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            VcardData vcardData2 = (VcardData) arrayList4.get(i13);
            if (vcardData2.name != null && !vcardData2.phones.isEmpty()) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                String str4 = vcardData2.phones.get(0);
                for (int i14 = 0; i14 < vcardData2.phones.size(); i14++) {
                    String str5 = vcardData2.phones.get(i14);
                    if (ContactsController.getInstance(i10).contactsByShortPhone.get(str5.substring(Math.max(0, str5.length() - 7))) != null) {
                        str4 = str5;
                        break;
                    }
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                tL_userContact_old2.phone = str4;
                tL_userContact_old2.first_name = vcardData2.name;
                tL_userContact_old2.last_name = "";
                tL_userContact_old2.f22527id = 0L;
                TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
                restrictionReason.text = vcardData2.vcard.toString();
                restrictionReason.platform = "";
                restrictionReason.reason = "";
                tL_userContact_old2.restriction_reason.add(restrictionReason);
                arrayList3.add(tL_userContact_old2);
            }
        }
        return arrayList3;
    }

    public static void lockOrientation(Activity activity) {
        if (activity == null || prevOrientation != -10 || isTabletInternal()) {
            return;
        }
        try {
            prevOrientation = activity.getRequestedOrientation();
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            if (windowManager == null || windowManager.getDefaultDisplay() == null) {
                return;
            }
            int rotation = windowManager.getDefaultDisplay().getRotation();
            int i10 = activity.getResources().getConfiguration().orientation;
            if (rotation == 3) {
                if (i10 == 1) {
                    activity.setRequestedOrientation(1);
                    return;
                } else {
                    activity.setRequestedOrientation(8);
                    return;
                }
            }
            if (rotation == 1) {
                if (i10 == 1) {
                    activity.setRequestedOrientation(9);
                    return;
                } else {
                    activity.setRequestedOrientation(0);
                    return;
                }
            }
            if (rotation == 0) {
                if (i10 == 2) {
                    activity.setRequestedOrientation(0);
                    return;
                } else {
                    activity.setRequestedOrientation(1);
                    return;
                }
            }
            if (i10 == 2) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(9);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void logFlagSecure() {
        FileLog.d("[FLAG_SECURE]");
        printStackTrace("FLAG_SECURE");
    }

    public static void makeAccessibilityAnnouncement(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
        if (accessibilityManager2.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.getText().add(charSequence);
            accessibilityManager2.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    public static Bitmap makeBlurBitmap(View view) {
        return makeBlurBitmap(view, 6.0f, 7);
    }

    public static SpannableStringBuilder makeClickable(CharSequence charSequence, final int i10, final Runnable runnable, final org.telegram.ui.ActionBar.c6 c6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i10 == 0 || i10 == 3 || i10 == 2 || i10 == 4) {
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(i10 == 4);
                    if (i10 == 2) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                    }
                }
            }, 0, spannableStringBuilder.length(), 0);
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new CharacterStyle() {
            @Override
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
                textPaint.setAlpha(alpha);
            }
        }, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void makeGlobalBlurBitmap(Utilities.Callback<Bitmap> callback, float f10) {
        makeGlobalBlurBitmap(callback, f10, (int) f10, null, null);
    }

    private static String makeUrl(String str, String[] strArr, Matcher matcher) {
        boolean z10;
        int i10 = 0;
        while (true) {
            if (i10 >= strArr.length) {
                z10 = false;
                break;
            }
            String str2 = strArr[i10];
            String str3 = str;
            if (str3.regionMatches(true, 0, str2, 0, str2.length())) {
                String str4 = strArr[i10];
                boolean zRegionMatches = str3.regionMatches(false, 0, str4, 0, str4.length());
                z10 = true;
                if (!zRegionMatches) {
                    str = strArr[i10] + str3.substring(strArr[i10].length());
                    break;
                }
                str = str3;
                break;
            }
            i10++;
            str = str3;
        }
        return (z10 || strArr.length <= 0) ? str : a9.p.p(new StringBuilder(), strArr[0], str);
    }

    public static int multiplyAlphaComponent(int i10, float f10) {
        return i0.b.k(i10, (int) (Color.alpha(i10) * f10));
    }

    public static void multiplyBrightnessColorMatrix(ColorMatrix colorMatrix, float f10) {
        if (colorMatrix == null) {
            return;
        }
        colorMatrix.postConcat(new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static boolean needShowPasscode() {
        return needShowPasscode(false);
    }

    public static void normalizeTimePart(StringBuilder sb2, int i10) {
        if (i10 >= 10) {
            sb2.append(i10);
        } else {
            sb2.append("0");
            sb2.append(i10);
        }
    }

    public static void notifyDataSetChanged(RecyclerView recyclerView) {
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        if (recyclerView.b0()) {
            recyclerView.post(new d1(recyclerView, 12));
        } else {
            recyclerView.getAdapter().l();
        }
    }

    public static String obtainLoginPhoneCall(String str) {
        if (!hasCallPermissions) {
            return null;
        }
        try {
            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, Build.VERSION.SDK_INT >= 26 ? "date DESC" : "date DESC LIMIT 5");
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(0);
                    long j10 = cursorQuery.getLong(1);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("number = " + string);
                    }
                    if (Math.abs(System.currentTimeMillis() - j10) < 3600000 && checkPhonePattern(str, string)) {
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            cursorQuery.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return null;
    }

    public static void openDocument(MessageObject messageObject, Activity activity, org.telegram.ui.ActionBar.n2 n2Var) {
        TLRPC.Document document;
        String mimeTypeFromExtension;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        String attachFileName = messageObject.messageOwner.media != null ? FileLoader.getAttachFileName(document) : "";
        String str = messageObject.messageOwner.attachPath;
        File file = (str == null || str.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner);
        }
        if (file == null || !file.exists()) {
            return;
        }
        if (n2Var != null && file.getName().toLowerCase().endsWith("attheme")) {
            org.telegram.ui.ActionBar.f6 f6VarU = org.telegram.ui.ActionBar.g6.u(file, messageObject.getDocumentName(), null, true);
            if (f6VarU != null) {
                n2Var.presentFragment(new nc1(f6VarU));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            HashMap map = new HashMap();
            int i10 = org.telegram.ui.ActionBar.g6.L5;
            map.put("info1", Integer.valueOf(n2Var.getThemedColor(i10)));
            map.put("info2", Integer.valueOf(n2Var.getThemedColor(i10)));
            alertDialog$Builder.m(R.raw.not_available, 52, n2Var.getThemedColor(i10), map);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.S = true;
            b2Var.P = LocaleController.getString(R.string.IncorrectTheme);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            n2Var.showDialog(b2Var);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            int iLastIndexOf = attachFileName.lastIndexOf(46);
            if (iLastIndexOf == -1 || ((mimeTypeFromExtension = singleton.getMimeTypeFromExtension(attachFileName.substring(iLastIndexOf + 1).toLowerCase())) == null && ((mimeTypeFromExtension = document.mime_type) == null || mimeTypeFromExtension.length() == 0))) {
                mimeTypeFromExtension = null;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file), mimeTypeFromExtension != null ? mimeTypeFromExtension : "text/plain");
            } else {
                intent.setDataAndType(Uri.fromFile(file), mimeTypeFromExtension != null ? mimeTypeFromExtension : "text/plain");
            }
            if (mimeTypeFromExtension == null) {
                activity.startActivityForResult(intent, 500);
                return;
            }
            try {
                activity.startActivityForResult(intent, 500);
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file), "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(file), "text/plain");
                }
                activity.startActivityForResult(intent, 500);
            }
        } catch (Exception unused2) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            HashMap map2 = new HashMap();
            int i11 = org.telegram.ui.ActionBar.g6.L5;
            map2.put("info1", Integer.valueOf(n2Var.getThemedColor(i11)));
            map2.put("info2", Integer.valueOf(n2Var.getThemedColor(i11)));
            alertDialog$Builder2.m(R.raw.not_available, 52, n2Var.getThemedColor(i11), map2);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.S = true;
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
            b2Var2.P = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
            n2Var.showDialog(b2Var2);
        }
    }

    public static boolean openForView(File file, String str, String str2, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        String str3;
        String str4;
        if (file == null || !file.exists()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        int iLastIndexOf = str == null ? -1 : str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            str2 = null;
            if (str2 != null) {
                if (!z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.Components.y4.j(activity, c6Var).show();
                        return true;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Uri uriD = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                if (str2 != null) {
                    str4 = str2;
                } else {
                    str4 = "text/plain";
                }
                intent.setDataAndType(uriD, str4);
            } else {
                Uri uriFromFile = Uri.fromFile(file);
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "text/plain";
                }
                intent.setDataAndType(uriFromFile, str3);
            }
            if (str2 == null) {
                activity.startActivityForResult(intent, 500);
                return true;
            }
            activity.startActivityForResult(intent, 500);
            return true;
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (!z10 || !MessageObject.isV(strSubstring)) {
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(strSubstring.toLowerCase());
            if (mimeTypeFromExtension != null) {
                str2 = mimeTypeFromExtension;
            } else if (str2 == null || str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null && str2.equals("application/vnd.android.package-archive")) {
                if (!z10) {
                    if (Build.VERSION.SDK_INT >= 26 && !ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls()) {
                        org.telegram.ui.Components.y4.j(activity, c6Var).show();
                        return true;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Uri uriD2 = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                if (str2 != null) {
                    str4 = str2;
                } else {
                    str4 = "text/plain";
                }
                intent.setDataAndType(uriD2, str4);
            } else {
                Uri uriFromFile2 = Uri.fromFile(file);
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "text/plain";
                }
                intent.setDataAndType(uriFromFile2, str3);
            }
            if (str2 == null) {
                activity.startActivityForResult(intent, 500);
                return true;
            }
            try {
                activity.startActivityForResult(intent, 500);
                return true;
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file), "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(file), "text/plain");
                }
                activity.startActivityForResult(intent, 500);
                return true;
            }
        }
        return true;
    }

    public static void openSharing(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        n2Var.showDialog(new sp0(n2Var.getParentActivity(), null, str, false, str, false, null));
    }

    public static long pack(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static SpannableStringBuilder premiumText(String str, Runnable runnable) {
        return replaceSingleTag(str, -1, 2, runnable);
    }

    public static void printLayoutRequestedChain(View view) {
        if (view == null) {
            FileLog.d("LayoutCheck view == null");
            return;
        }
        int i10 = 0;
        while (view != null) {
            Object parent = view.getParent();
            StringBuilder sbO = i0.a.o(i10, "LayoutCheck level=", ", view=");
            sbO.append(view.getClass().getSimpleName());
            sbO.append("@");
            sbO.append(Integer.toHexString(System.identityHashCode(view)));
            sbO.append(", isLayoutRequested=");
            sbO.append(view.isLayoutRequested());
            FileLog.d(sbO.toString());
            if (!(parent instanceof View)) {
                if (parent == null) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder("LayoutCheck level=");
                sb2.append(i10 + 1);
                sb2.append(", parent=");
                sb2.append(parent.getClass().getSimpleName());
                org.telegram.ui.Cells.pa.v(" (not a View)", sb2);
                break;
            }
            view = (View) parent;
            i10++;
        }
        FileLog.d("LayoutCheck");
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> arrayList) {
        int i10;
        int i11;
        int i12 = 0;
        Collections.sort(arrayList, new q(i12));
        int size = arrayList.size();
        while (i12 < size - 1) {
            LinkSpec linkSpec = arrayList.get(i12);
            int i13 = i12 + 1;
            LinkSpec linkSpec2 = arrayList.get(i13);
            int i14 = linkSpec.start;
            int i15 = linkSpec2.start;
            if (i14 <= i15 && (i10 = linkSpec.end) > i15) {
                int i16 = linkSpec2.end;
                if (i16 > i10 && i10 - i14 <= i16 - i15) {
                    i11 = i10 - i14 < i16 - i15 ? i12 : -1;
                } else {
                    i11 = i13;
                }
                if (i11 != -1) {
                    arrayList.remove(i11);
                    size--;
                }
            }
            i12 = i13;
        }
    }

    public static void quietSleep(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    public static <T> T randomOf(ArrayList<T> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(Math.abs(Utilities.fastRandom.nextInt() % arrayList.size()));
    }

    public static String readRes(int i10) {
        return readRes(null, i10);
    }

    public static void recycleBitmap(Bitmap bitmap) {
        recycleBitmaps(Collections.singletonList(bitmap));
    }

    public static void recycleBitmaps(List<Bitmap> list) {
        if (Build.VERSION.SDK_INT <= 23 || list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Bitmap bitmap = list.get(i10);
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList.add(new WeakReference(bitmap));
            }
        }
        runOnUIThread(new e(arrayList, 0), 36L);
    }

    public static void removeAdjustResize(Activity activity, int i10) {
        if (activity == null || isTablet() || adjustOwnerClassGuid != i10) {
            return;
        }
        activity.getWindow().setSoftInputMode(32);
    }

    public static void removeAltFocusable(Activity activity, int i10) {
        if (activity != null && altFocusableClassGuid == i10) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static String removeDiacritics(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        Pattern pattern = REMOVE_MULTIPLE_DIACRITICS;
        return (pattern == null || (matcher = pattern.matcher(str)) == null) ? str : matcher.replaceAll("$1");
    }

    public static void removeFromParent(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static String removeRTL(String str) {
        if (str == null) {
            return null;
        }
        if (REMOVE_RTL == null) {
            REMOVE_RTL = Pattern.compile("[\\u200E\\u200F\\u202A-\\u202E]");
        }
        Matcher matcher = REMOVE_RTL.matcher(str);
        return matcher == null ? str : matcher.replaceAll("");
    }

    public static CharSequence removeSpans(CharSequence charSequence, Class cls) {
        if (!(charSequence instanceof Spannable)) {
            return charSequence;
        }
        Spannable spannable = (Spannable) charSequence;
        for (Object obj : spannable.getSpans(0, spannable.length(), cls)) {
            spannable.removeSpan(obj);
        }
        return spannable;
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10) {
        return replaceArrows(charSequence, z10, dp(2.6666667f), 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceCharSequence(String str, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int iIndexOf = TextUtils.indexOf(charSequence, str);
        if (iIndexOf >= 0) {
            spannableStringBuilder.replace(iIndexOf, str.length() + iIndexOf, charSequence2);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceLinks(String str, org.telegram.ui.ActionBar.c6 c6Var) {
        return replaceLinks(str, c6Var, null);
    }

    public static CharSequence replaceMultipleCharSequence(String str, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        int iIndexOf = TextUtils.indexOf(charSequence, str, 0);
        while (iIndexOf >= 0) {
            spannableStringBuilder.replace(iIndexOf, str.length() + iIndexOf, charSequence2);
            iIndexOf = TextUtils.indexOf(spannableStringBuilder, str, iIndexOf + 1);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceMultipleTags(String str, Runnable... runnableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (final Runnable runnable : runnableArr) {
            int iCharSequenceIndexOf = charSequenceIndexOf(spannableStringBuilder, "**");
            int i10 = iCharSequenceIndexOf + 2;
            int iCharSequenceIndexOf2 = charSequenceIndexOf(spannableStringBuilder, "**", i10);
            if (iCharSequenceIndexOf < 0 || iCharSequenceIndexOf2 < 0) {
                break;
            }
            spannableStringBuilder.delete(iCharSequenceIndexOf, i10);
            int i11 = iCharSequenceIndexOf2 - 2;
            spannableStringBuilder.delete(i11, iCharSequenceIndexOf2);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, iCharSequenceIndexOf, i11, 33);
        }
        return spannableStringBuilder;
    }

    public static CharSequence replaceNewLines(CharSequence charSequence) {
        int i10 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            while (i10 < length) {
                if (sb2.charAt(i10) == '\n') {
                    sb2.setCharAt(i10, ' ');
                }
                i10++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i10 < length2) {
                if (charSequence.charAt(i10) == '\n') {
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) " ");
                }
                i10++;
            }
            return spannableStringBuilder;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence == null) {
                return null;
            }
            return charSequence.toString().replace('\n', ' ');
        }
        if (TextUtils.indexOf(charSequence, '\n') < 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
        int length3 = charSequence.length();
        while (i10 < length3) {
            if (charSequence.charAt(i10) == '\n') {
                spannableStringBuilder2.replace(i10, i10 + 1, (CharSequence) " ");
            }
            i10++;
        }
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder replaceSingleLink(String str, int i10) {
        return replaceSingleLink(str, i10, null);
    }

    public static SpannableStringBuilder replaceSingleLinkBold(String str, int i10) {
        return replaceSingleLinkBold(str, i10, null);
    }

    public static SpannableStringBuilder replaceSingleTag(String str, Runnable runnable) {
        return replaceSingleTag(str, -1, 0, runnable);
    }

    public static SpannableStringBuilder replaceTags(String str) {
        return replaceTags(str, 11, new Object[0]);
    }

    public static CharSequence replaceTwoNewLinesToOne(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sbReplace = (StringBuilder) charSequence;
            int length = sbReplace.length();
            int i10 = 0;
            while (i10 < length - 2) {
                int i11 = i10 + 2;
                sbReplace.getChars(i10, i11, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sbReplace = sbReplace.replace(i10, i11, "\n");
                    i10--;
                    length--;
                }
                i10++;
            }
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilderReplace = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i12 = 0;
            while (i12 < length2 - 2) {
                int i13 = i12 + 2;
                spannableStringBuilderReplace.getChars(i12, i13, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilderReplace = spannableStringBuilderReplace.replace(i12, i13, (CharSequence) "\n");
                    i12--;
                    length2--;
                }
                i12++;
            }
            return charSequence;
        }
        if (!(charSequence instanceof SpannableString)) {
            return charSequence.toString().replace("\n\n", "\n");
        }
        if (TextUtils.indexOf(charSequence, "\n\n") < 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int length3 = charSequence.length();
        int i14 = 0;
        while (i14 < length3 - 2) {
            int i15 = i14 + 2;
            spannableStringBuilder.getChars(i14, i15, cArr, 0);
            if (cArr[0] == '\n' && cArr[1] == '\n') {
                spannableStringBuilder = spannableStringBuilder.replace(i14, i15, (CharSequence) "\n");
                i14--;
                length3--;
            }
            i14++;
        }
        return spannableStringBuilder;
    }

    public static void requestAdjustNothing(Activity activity, int i10) {
        if (activity == null || isTablet()) {
            return;
        }
        activity.getWindow().setSoftInputMode(48);
        adjustOwnerClassGuid = i10;
    }

    public static void requestAdjustResize(Activity activity, int i10) {
        if (activity == null) {
            return;
        }
        requestAdjustResize(activity.getWindow(), i10);
    }

    public static void requestAltFocusable(Activity activity, int i10) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        altFocusableClassGuid = i10;
    }

    public static void resetPictureInPictureParams(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setSourceRectHint(null);
            builder.setAspectRatio(null);
            if (i10 >= 31) {
                builder.setAutoEnterEnabled(false);
            }
            setPictureInPictureParams(activity, builder.build());
        }
    }

    public static void resetTabletFlag() {
        if (wasTablet == null) {
            wasTablet = Boolean.valueOf(isTabletInternal());
        }
        isTablet = null;
        SharedConfig.updateTabletConfig();
    }

    public static void resetWasTabletFlag() {
        wasTablet = null;
    }

    public static double[] rgbToHsv(int i10) {
        return rgbToHsv(Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static int[] roundPercents(float[] fArr, int[] iArr) {
        if (fArr == null) {
            throw new NullPointerException("percents or output is null");
        }
        if (iArr == null) {
            iArr = new int[fArr.length];
        }
        if (fArr.length != iArr.length) {
            throw new IndexOutOfBoundsException("percents.length != output.length");
        }
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < fArr.length; i11++) {
            int iFloor = (int) Math.floor((fArr[i11] / f10) * 100.0f);
            iArr[i11] = iFloor;
            i10 += iFloor;
        }
        while (i10 < 100) {
            int i12 = -1;
            float f12 = 0.0f;
            for (int i13 = 0; i13 < fArr.length; i13++) {
                float f13 = fArr[i13];
                float f14 = (f13 / f10) - (iArr[i13] / 100.0f);
                if (f13 > 0.0f && f14 >= f12) {
                    i12 = i13;
                    f12 = f14;
                }
            }
            if (i12 < 0) {
                break;
            }
            iArr[i12] = iArr[i12] + 1;
            i10++;
        }
        return iArr;
    }

    public static int roundPlayingMessageSize(boolean z10) {
        return z10 ? roundSidePlayingMessageSize : roundPlayingMessageSize;
    }

    public static void runOnUIThread(Runnable runnable) {
        runOnUIThread(runnable, 0L);
    }

    public static void scaleRect(RectF rectF, float f10) {
        scaleRect(rectF, f10, rectF.centerX(), rectF.centerY());
    }

    public static void scrollToFragmentRow(org.telegram.ui.ActionBar.b5 b5Var, String str) {
        if (b5Var == null || str == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) b5Var.getFragmentStack().get(b5Var.getFragmentStack().size() - 1);
        try {
            Field declaredField = n2Var.getClass().getDeclaredField("listView");
            declaredField.setAccessible(true);
            zk0 zk0Var = (zk0) declaredField.get(n2Var);
            zk0Var.e1(new f(n2Var, str, zk0Var), 700, true);
            declaredField.setAccessible(false);
        } catch (Throwable unused) {
        }
    }

    public static void setAdjustResizeToNothing(Activity activity, int i10) {
        if (activity == null || isTablet()) {
            return;
        }
        int i11 = adjustOwnerClassGuid;
        if (i11 == 0 || i11 == i10) {
            activity.getWindow().setSoftInputMode(48);
        }
    }

    public static void setEnabled(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                setEnabled(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public static void setLightNavigationBar(Dialog dialog, boolean z10) {
        if (dialog != null) {
            setLightNavigationBar(dialog.getWindow(), z10);
        }
    }

    public static void setLightStatusBar(Activity activity, boolean z10) {
        if (activity != null) {
            setLightStatusBar(activity.getWindow(), z10);
        }
    }

    public static int setMyLayerVersion(int i10, int i11) {
        return (i10 & (-65536)) | i11;
    }

    public static void setNavigationBarColor(Dialog dialog, int i10) {
        setNavigationBarColor(dialog, i10, true);
    }

    public static int setPeerLayerVersion(int i10, int i11) {
        return (i10 & 65535) | (i11 << 16);
    }

    public static void setPictureInPictureParams(Activity activity, PictureInPictureParams pictureInPictureParams) {
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        if (pictureInPictureParams == null) {
            resetPictureInPictureParams(activity);
            return;
        }
        try {
            activity.setPictureInPictureParams(pictureInPictureParams);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void setPreferredMaxRefreshRate(Window window) {
        setPreferredMaxRefreshRate(window, screenMaxRefreshRate);
    }

    public static void setRectD(RectF rectF, float f10, float f11, float f12) {
        float f13 = f12 / 2.0f;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
    }

    public static void setRectR(RectF rectF, float f10, float f11, float f12) {
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
    }

    public static void setRectToRect(Matrix matrix, RectF rectF, RectF rectF2, int i10, int i11, boolean z10) {
        float fHeight;
        float fWidth;
        float fHeight2;
        boolean z11;
        float f10;
        float f11;
        float fHeight3;
        float fHeight4;
        if (i10 == 90 || i10 == 270) {
            fHeight = rectF2.height() / rectF.width();
            fWidth = rectF2.width();
            fHeight2 = rectF.height();
        } else {
            fHeight = rectF2.width() / rectF.width();
            fWidth = rectF2.height();
            fHeight2 = rectF.height();
        }
        float f12 = fWidth / fHeight2;
        if (fHeight < f12) {
            fHeight = f12;
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            matrix.setTranslate(rectF2.left, rectF2.top);
        }
        if (i10 == 90) {
            matrix.preRotate(90.0f);
            if (i11 == 1) {
                matrix.preScale(-1.0f, 1.0f);
            } else if (i11 == 2) {
                matrix.preScale(1.0f, -1.0f);
            }
            matrix.preTranslate(0.0f, -rectF2.width());
        } else if (i10 == 180) {
            matrix.preRotate(180.0f);
            if (i11 == 1) {
                matrix.preScale(-1.0f, 1.0f);
            } else if (i11 == 2) {
                matrix.preScale(1.0f, -1.0f);
            }
            matrix.preTranslate(-rectF2.width(), -rectF2.height());
        } else if (i10 == 270) {
            matrix.preRotate(270.0f);
            if (i11 == 1) {
                matrix.preScale(-1.0f, 1.0f);
            } else if (i11 == 2) {
                matrix.preScale(1.0f, -1.0f);
            }
            matrix.preTranslate(-rectF2.height(), 0.0f);
        }
        if (z10) {
            f10 = (-rectF.left) * fHeight;
            f11 = (-rectF.top) * fHeight;
        } else {
            f10 = rectF2.left - (rectF.left * fHeight);
            f11 = rectF2.top - (rectF.top * fHeight);
        }
        if (z11) {
            fHeight3 = rectF2.width();
            fHeight4 = rectF.width();
        } else {
            fHeight3 = rectF2.height();
            fHeight4 = rectF.height();
        }
        float f13 = (fHeight3 - (fHeight4 * fHeight)) / 2.0f;
        if (z11) {
            f10 += f13;
        } else {
            f11 += f13;
        }
        matrix.preScale(fHeight, fHeight);
        if (z10) {
            matrix.preTranslate(f10, f11);
        }
    }

    public static void setScrollViewEdgeEffectColor(HorizontalScrollView horizontalScrollView, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            horizontalScrollView.setEdgeEffectColor(i10);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(horizontalScrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(horizontalScrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void setViewLayoutMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
                return;
            }
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.bottomMargin = i13;
            view.requestLayout();
        }
    }

    public static void setViewPagerEdgeEffectColor(m2.g gVar, int i10) {
        try {
            Field declaredField = m2.g.class.getDeclaredField("b0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(gVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = m2.g.class.getDeclaredField("c0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(gVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception unused) {
        }
    }

    public static void setWaitingForCall(boolean z10) {
        synchronized (callLock) {
            try {
                try {
                    if (z10) {
                        if (callReceiver == null) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context = ApplicationLoader.applicationContext;
                                CallReceiver callReceiver2 = new CallReceiver();
                                callReceiver = callReceiver2;
                                context.registerReceiver(callReceiver2, intentFilter, 4);
                            } else {
                                Context context2 = ApplicationLoader.applicationContext;
                                CallReceiver callReceiver3 = new CallReceiver();
                                callReceiver = callReceiver3;
                                context2.registerReceiver(callReceiver3, intentFilter);
                            }
                        }
                    } else if (callReceiver != null) {
                        ApplicationLoader.applicationContext.unregisterReceiver(callReceiver);
                        callReceiver = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
            waitingForCall = z10;
        }
    }

    public static void setWaitingForSms(boolean z10) {
        synchronized (smsLock) {
            try {
                waitingForSms = z10;
                if (z10) {
                    try {
                        u6.a aVar = new u6.a(ApplicationLoader.applicationContext, i5.a.f10566k, com.google.android.gms.common.api.b.f3189g, com.google.android.gms.common.api.i.f3198c);
                        com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
                        vVarB.f3359c = new w9.d(aVar);
                        vVarB.d = new v5.c[]{u6.b.f48425a};
                        vVarB.f3357a = 1567;
                        aVar.e(1, vVarB.b()).addOnSuccessListener(new b(2));
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void shakeView(final View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(R.id.shake_animation);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new o(view, 0));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        view.setTag(R.id.shake_animation, valueAnimatorOfFloat);
    }

    public static void shakeViewSpring(View view) {
        shakeViewSpring(view, 10.0f, null);
    }

    public static boolean shouldEnableAnimation() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 26 || i10 >= 28 || (!((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).isPowerSaveMode() && getAnimatorDurationScale() > 0.0f);
    }

    public static boolean shouldShowClipboardToast() {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 31 || !OneUIUtilities.hasBuiltInClipboardToasts()) && i10 < 32;
    }

    public static boolean shouldShowUrlInAlert(String str) {
        try {
            return checkHostForPunycode(Uri.parse(str).getHost());
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static boolean showKeyboard(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static void showProxyAlert(final Activity activity, final String str, final String str2, final String str3, final String str4, final String str5) {
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z10;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(activity, null, false, false);
        e3Var.fixNavigationBar();
        e3Var.applyTopPadding = false;
        e3Var.applyBottomPadding = false;
        final Runnable runnable = e3Var.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        e3Var.customView = linearLayout;
        TextView textViewB = h7.d6.b(activity, 20.0f, org.telegram.ui.ActionBar.g6.f23161j5, true, null);
        textViewB.setText(LocaleController.getString(R.string.UseProxyTitle));
        linearLayout.addView(textViewB, h7.z5.t(-1, -2, 55, 22, 18, 22, 0));
        yy0 yy0Var = new yy0(activity, null);
        linearLayout.addView(yy0Var, h7.z5.t(-1, -2, 55, 14, 18, 14, 0));
        if (TextUtils.isEmpty(str)) {
            str6 = str;
        } else {
            str6 = str;
            yy0Var.c(LocaleController.getString(R.string.UseProxyAddress), str6, null, null);
        }
        if (!TextUtils.isEmpty(str2)) {
            yy0Var.c(LocaleController.getString(R.string.UseProxyPort), str2, null, null);
        }
        if (TextUtils.isEmpty(str5)) {
            str7 = str5;
        } else {
            str7 = str5;
            yy0Var.c(LocaleController.getString(R.string.UseProxySecret), str7, null, null);
        }
        if (TextUtils.isEmpty(str3)) {
            str8 = str3;
        } else {
            str8 = str3;
            yy0Var.c(LocaleController.getString(R.string.UseProxyUsername), str8, null, null);
        }
        if (TextUtils.isEmpty(str4)) {
            str9 = str4;
        } else {
            str9 = str4;
            yy0Var.c(LocaleController.getString(R.string.UseProxyPassword), str9, null, null);
        }
        org.telegram.ui.Components.oc[] ocVarArr = new org.telegram.ui.Components.oc[1];
        yy0Var.c(LocaleController.getString(R.string.ProxyStatus), "", null, ocVarArr);
        ((View) ocVarArr[0].getParent()).setPadding(0, 0, 0, 0);
        ocVarArr[0].setDisablePaddingsOffsetY(true);
        ocVarArr[0].setPadding(dp(12.66f), dp(9.33f), dp(12.66f), dp(9.33f));
        ocVarArr[0].setText(replaceSingleLink(LocaleController.getString(R.string.ProxyBottomSheetCheckStatus), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false), new cg.l0(new boolean[1], ocVarArr, str6, str2, str8, str9, str7, activity, 4)));
        if (TextUtils.isEmpty(str5)) {
            z10 = true;
        } else {
            wy0 wy0VarA = yy0Var.a(LocaleController.getString(R.string.UseProxyTelegramInfo2));
            z10 = true;
            wy0VarA.setFilled(true);
            eh.s sVar = (eh.s) wy0VarA.getChildAt(0);
            sVar.setTextSize(1, 11.0f);
            sVar.setGravity(17);
        }
        lh.d dVar = new lh.d(activity, null, z10);
        dVar.setRoundRadius(24);
        dVar.setText(LocaleController.getString(R.string.ConnectingConnectProxy));
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AndroidUtilities.lambda$showProxyAlert$22(str, str2, str5, str4, str3, activity, runnable, view);
            }
        });
        linearLayout.addView(dVar, h7.z5.t(-1, 48, 55, 14, 18, 14, 14));
        e3Var.show();
    }

    private static void snapshotTextureViews(int i10, int i11, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i10, iArr[1] - i11, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                snapshotTextureViews(i10, i11, iArr, canvas, viewGroup.getChildAt(i12));
            }
        }
    }

    public static Bitmap snapshotView(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        snapshotTextureViews(iArr[0], iArr[1], iArr, canvas, view);
        return bitmapCreateBitmap;
    }

    public static CharSequence superTrim(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && isWhitespace(charSequence.charAt(i10))) {
            i10++;
        }
        while (i10 < length && isWhitespace(charSequence.charAt(length - 1))) {
            length--;
        }
        return (i10 > 0 || length < charSequence.length()) ? charSequence.subSequence(i10, length) : charSequence;
    }

    public static int[] toIntArray(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = list.get(i10).intValue();
        }
        return iArr;
    }

    public static String translitSafe(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String translitString = LocaleController.getInstance().getTranslitString(str, false);
        return translitString == null ? "" : translitString;
    }

    public static CharSequence trim(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && charSequence.charAt(i10) <= ' ') {
            i10++;
        }
        while (i10 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i10;
        }
        return (i10 > 0 || length < charSequence.length()) ? charSequence.subSequence(i10, length) : charSequence;
    }

    public static void unlockOrientation(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            int i10 = prevOrientation;
            if (i10 != -10) {
                activity.setRequestedOrientation(i10);
                prevOrientation = -10;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static int unpackA(long j10) {
        return (int) (j10 >> 32);
    }

    public static int unpackB(long j10) {
        return (int) j10;
    }

    public static void updateImageViewImageAnimated(ImageView imageView, int i10) {
        updateImageViewImageAnimated(imageView, imageView.getContext().getDrawable(i10));
    }

    public static void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (windowManager == null || view == null || view.getParent() == null) {
            return;
        }
        windowManager.updateViewLayout(view, layoutParams);
    }

    public static void updateViewShow(View view, boolean z10) {
        updateViewShow(view, z10, true, true);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10) {
        updateViewVisibilityAnimated(view, z10, 1.0f, true, true);
    }

    public static void updateVisibleRow(zk0 zk0Var, int i10) {
        f2.q0 adapter;
        f2.o1 o1VarT;
        if (zk0Var == null || (adapter = zk0Var.getAdapter()) == null) {
            return;
        }
        for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
            View childAt = zk0Var.getChildAt(i11);
            int iR = RecyclerView.R(childAt);
            if (iR >= 0 && (o1VarT = zk0Var.T(childAt)) != null && !o1VarT.r() && o1VarT.b() == i10) {
                adapter.v(o1VarT, iR);
            }
        }
    }

    public static void updateVisibleRows(zk0 zk0Var) {
        f2.q0 adapter;
        f2.o1 o1VarT;
        if (zk0Var == null || (adapter = zk0Var.getAdapter()) == null) {
            return;
        }
        for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
            View childAt = zk0Var.getChildAt(i10);
            int iR = RecyclerView.R(childAt);
            if (iR >= 0 && (o1VarT = zk0Var.T(childAt)) != null && !o1VarT.r()) {
                adapter.v(o1VarT, iR);
            }
        }
    }

    public static void vibrate(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(3, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void vibrateCursor(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(9, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static CharSequence withLearnMore(CharSequence charSequence, final Runnable runnable) {
        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.LearnMoreArrow));
        spannableString.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
            }
        }, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return replaceArrows(spannableStringBuilder, true);
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i10, boolean z10) {
        return addLinks(spannable, i10, z10, true);
    }

    public static void applySpring(Animator animator, double d, double d10, double d11) {
        applySpring(animator, d, d10, d11, 0.0d);
    }

    public static int compare(long j10, long j11) {
        if (j10 == j11) {
            return 0;
        }
        return j10 > j11 ? 1 : -1;
    }

    public static boolean copyFile(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                outputStream.close();
                return true;
            }
            Thread.yield();
            outputStream.write(bArr, 0, i10);
        }
    }

    public static boolean doSafe(final Utilities.Callback0Return<Boolean> callback0Return, int i10) {
        Future futureSubmit;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                try {
                    futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() {
                        @Override
                        public final Object call() {
                            return AndroidUtilities.lambda$doSafe$9(callback0Return);
                        }
                    });
                    try {
                        return ((Boolean) futureSubmit.get(i10, TimeUnit.MILLISECONDS)).booleanValue();
                    } catch (TimeoutException unused) {
                        if (futureSubmit != null) {
                            futureSubmit.cancel(true);
                        }
                        return false;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return false;
                }
            } finally {
                executorServiceNewSingleThreadExecutor.shutdownNow();
            }
        } catch (TimeoutException unused2) {
            futureSubmit = null;
        }
    }

    public static void drawNavigationBarProtection(Canvas canvas, View view, int i10, int i11, float f10) {
        Paint paint = navbarProtactionPaint;
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(getNavigationBarThirdButtonsFactor(0.0f, 0.75f, i11) * f10, i10));
        canvas.drawRect(0.0f, (view.getY() + view.getMeasuredHeight()) - i11, view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight(), paint);
    }

    public static void drawStroke(Canvas canvas, RectF rectF, float f10, float f11) {
        if (f11 <= 0.0f) {
            return;
        }
        float fMin = Math.min(f10, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float fDpf2 = dpf2(1.0f);
        float f12 = fDpf2 / 2.0f;
        float fMax = Math.max(0.0f, fMin - fDpf2);
        Paint paint = strokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(fDpf2);
        paint.setColor(org.telegram.ui.ActionBar.g6.l1(f11, 570425343));
        canvas.save();
        float f13 = rectF.left - f12;
        float f14 = rectF.top;
        if (canvas.clipRect(f13, f14, rectF.right + f12, h7.n.a(f14 + fMax, f14, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f12, rectF.right, f12 + rectF.bottom, fMax, fMax, paint);
        }
        canvas.restore();
        float fDpf3 = dpf2(0.6666667f);
        float f15 = fDpf3 / 2.0f;
        float fMax2 = Math.max(0.0f, fMin - fDpf3);
        Paint paint2 = strokeBottom;
        paint2.setStyle(style);
        paint2.setStrokeWidth(fDpf3);
        paint2.setColor(org.telegram.ui.ActionBar.g6.l1(f11, 385875967));
        canvas.save();
        float f16 = rectF.left - f15;
        float f17 = rectF.bottom;
        if (canvas.clipRect(f16, h7.n.a(f17 - fMax2, rectF.top, f17), rectF.right + f15, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f15, rectF.right, rectF.bottom - f15, fMax2, fMax2, paint2);
        }
        canvas.restore();
    }

    public static boolean findClickableView(ViewGroup viewGroup, float f10, float f11, View view) {
        int i10;
        if (viewGroup == null) {
            return false;
        }
        int i11 = 0;
        while (i11 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() != 0 || ((childAt instanceof jh.e4) && childAt != view)) {
                i10 = i11;
            } else {
                if (childAt instanceof jh.k8) {
                    jh.m8 m8Var = (jh.m8) viewGroup;
                    if (m8Var.f13659b == null || (f10 >= dp(60.0f) && f10 <= viewGroup.getWidth() - dp(60.0f))) {
                        int i12 = 0;
                        while (true) {
                            if (i12 < m8Var.getChildCount()) {
                                View childAt2 = m8Var.getChildAt(i12);
                                if (childAt2 instanceof jh.p8) {
                                    float translationX = childAt2.getTranslationX();
                                    float translationY = childAt2.getTranslationY();
                                    float measuredWidth = childAt2.getMeasuredWidth();
                                    float measuredHeight = childAt2.getMeasuredHeight();
                                    double radians = Math.toRadians(-childAt2.getRotation());
                                    double d = f10 - translationX;
                                    i10 = i11;
                                    double d10 = f11 - translationY;
                                    float fCos = (float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10));
                                    float fB = (float) i0.a.b(radians, d10, Math.sin(radians) * d);
                                    if (fCos < (-measuredWidth) / 2.0f || fCos > measuredWidth / 2.0f || fB < (-measuredHeight) / 2.0f || fB > measuredHeight / 2.0f) {
                                    }
                                } else {
                                    i10 = i11;
                                }
                                i12++;
                                i11 = i10;
                            } else {
                                i10 = i11;
                            }
                        }
                    } else {
                        i10 = i11;
                    }
                } else {
                    i10 = i11;
                }
                Rect rect = rectTmp2;
                childAt.getHitRect(rect);
                if (rect.contains((int) f10, (int) f11) && childAt.isClickable()) {
                    return true;
                }
                if ((childAt instanceof ViewGroup) && findClickableView((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), view)) {
                    return true;
                }
            }
            i11 = i10 + 1;
        }
        return false;
    }

    public static String formatDuration(int i10, boolean z10, boolean z11) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i11 == 0) {
            return z10 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return z11 ? String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String formatFileSize(long j10, boolean z10, boolean z11) {
        if (j10 == 0) {
            return String.format("%d KB", 0);
        }
        if (j10 < 1024) {
            return String.format("%d B", Long.valueOf(j10));
        }
        if (j10 < 1048576) {
            float f10 = j10 / 1024.0f;
            if (z10) {
                int i10 = (int) f10;
                if ((f10 - i10) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f10));
        }
        if (j10 < 1048576000) {
            float f11 = (j10 / 1024.0f) / 1024.0f;
            if (z10) {
                int i11 = (int) f11;
                if ((f11 - i11) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i11));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f11));
        }
        float f12 = ((int) ((j10 / 1024) / 1024)) / 1000.0f;
        if (z10) {
            int i12 = (int) f12;
            if ((f12 - i12) * 10.0f == 0.0f) {
                return String.format("%d GB", Integer.valueOf(i12));
            }
        }
        return z11 ? String.format("%.1f GB", Float.valueOf(f12)) : String.format("%.2f GB", Float.valueOf(f12));
    }

    public static String formatLongDuration(int i10, int i11) {
        return formatDuration(i10, i11, true);
    }

    public static String formatShortDuration(int i10, int i11) {
        return formatDuration(i10, i11, false);
    }

    public static File generatePicturePath(boolean z10, String str) {
        try {
            File directory = FileLoader.getDirectory(100);
            if (!z10 && directory != null) {
                return new File(directory, generateFileName(0, str));
            }
            return new File(ApplicationLoader.applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES), generateFileName(0, str));
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static File generateVideoPath(boolean z10) {
        try {
            File albumDir = getAlbumDir(z10);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + ((long) Utilities.random.nextInt(1000)) + 1);
            if (generatingVideoPathFormat == null) {
                generatingVideoPathFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            return new File(albumDir, "VID_" + generatingVideoPathFormat.format(date) + ".mp4");
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static Activity getActivity(Context context) {
        Activity activityFindActivity = findActivity(context);
        if (activityFindActivity == null || activityFindActivity.isFinishing()) {
            activityFindActivity = LaunchActivity.C1;
        }
        return (activityFindActivity == null || activityFindActivity.isFinishing()) ? findActivity(ApplicationLoader.applicationContext) : activityFindActivity;
    }

    public static String getHostAuthority(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        Matcher matcher = getURIParsePattern().matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(4);
        if (strGroup != null) {
            strGroup = strGroup.toLowerCase();
        }
        return (z10 && strGroup != null && strGroup.startsWith("www.")) ? strGroup.substring(4) : strGroup;
    }

    public static float getNavigationBarThirdButtonsFactor(float f10, float f11, int i10) {
        return lerp(f10, f11, getNavigationBarThirdButtonsFactor(i10));
    }

    public static int getPatternColor(int i10, boolean z10) {
        float f10;
        float[] fArrRGBtoHSB = RGBtoHSB(Color.red(i10), Color.green(i10), Color.blue(i10));
        float f11 = fArrRGBtoHSB[1];
        if (f11 <= 0.0f) {
            float f12 = fArrRGBtoHSB[2];
            if (f12 < 1.0f && f12 > 0.0f) {
                if (z10) {
                    f10 = 0.15f;
                } else {
                    f10 = 0.05f;
                }
                fArrRGBtoHSB[1] = Math.min(1.0f, ((1.0f - f11) * 0.1f) + f10 + f11);
            }
        } else {
            if (z10) {
                f10 = 0.15f;
            } else {
                f10 = 0.05f;
            }
            fArrRGBtoHSB[1] = Math.min(1.0f, ((1.0f - f11) * 0.1f) + f10 + f11);
        }
        if (z10) {
            fArrRGBtoHSB[2] = Math.max(0.0f, fArrRGBtoHSB[2] * 0.65f);
        } else {
            float f13 = fArrRGBtoHSB[2];
            if (f13 > 0.5f) {
                fArrRGBtoHSB[2] = Math.max(0.0f, fArrRGBtoHSB[2] * 0.65f);
            } else {
                fArrRGBtoHSB[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (f13 * 0.65f)));
            }
        }
        return HSBtoRGB(fArrRGBtoHSB[0], fArrRGBtoHSB[1], fArrRGBtoHSB[2]) & (z10 ? -1711276033 : 1728053247);
    }

    public static int getPhotoSize(boolean z10) {
        if (z10) {
            if (highQualityPhotoSize == null) {
                highQualityPhotoSize = 2560;
            }
            return highQualityPhotoSize.intValue();
        }
        if (photoSize == null) {
            photoSize = 1280;
        }
        return photoSize.intValue();
    }

    public static float ilerp(int i10, int i11, int i12) {
        return (i10 - i11) / (i12 - i11);
    }

    public static boolean intersect1d(float f10, float f11, float f12, float f13) {
        return Math.max(f10, f11) > Math.min(f12, f13) && Math.max(f12, f13) > Math.min(f10, f11);
    }

    public static boolean isInternalUri(int i10) {
        return isInternalUri(null, i10);
    }

    public static int lerp(int i10, int i11, float f10) {
        return (int) ((f10 * (i11 - i10)) + i10);
    }

    public static Bitmap makeBlurBitmap(View view, float f10, int i10) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f10);
        int height = (int) (view.getHeight() / f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(i10, Math.max(width, height) / 180));
        return bitmapCreateBitmap;
    }

    public static void makeGlobalBlurBitmap(Utilities.Callback<Bitmap> callback, float f10, int i10, View view, List<View> list) {
        int width;
        int height;
        if (callback == null) {
            return;
        }
        List<View> listAllGlobalViews = allGlobalViews();
        if (listAllGlobalViews == null) {
            callback.run(null);
            return;
        }
        makingGlobalBlurBitmap = true;
        try {
            if (view == null) {
                Point point = displaySize;
                width = (int) (point.x / f10);
                height = point.y + statusBarHeight + navigationBarHeight;
            } else {
                width = (int) (view.getWidth() / f10);
                height = view.getHeight();
            }
            int i11 = (int) (height / f10);
            int[] iArr = new int[2];
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (view != null) {
                view.getLocationOnScreen(iArr);
                canvas.translate((-iArr[0]) / f10, (-iArr[1]) / f10);
            }
            float f11 = 1.0f / f10;
            canvas.scale(f11, f11);
            canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            for (int i12 = 0; i12 < listAllGlobalViews.size(); i12++) {
                View view2 = listAllGlobalViews.get(i12);
                if (!(view2 instanceof jf0) && (list == null || !list.contains(view2))) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof WindowManager.LayoutParams) {
                        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                        if ((layoutParams2.flags & 2) != 0) {
                            canvas.drawColor(i0.b.k(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                        }
                    }
                    canvas.save();
                    view2.getLocationOnScreen(iArr);
                    canvas.translate(iArr[0] / f10, iArr[1] / f10);
                    try {
                        view2.draw(canvas);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    canvas.restore();
                }
            }
            Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(i10, Math.max(width, i11) / 180));
            callback.run(bitmapCreateBitmap);
        } catch (Exception e10) {
            FileLog.e(e10);
            callback.run(null);
        } finally {
            makingGlobalBlurBitmap = false;
        }
    }

    public static boolean needShowPasscode(boolean z10) {
        boolean zIsWasInBackground = u00.getInstance().isWasInBackground(z10);
        if (z10) {
            u00.getInstance().resetBackgroundVar();
        }
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (BuildVars.LOGS_ENABLED && z10 && SharedConfig.passcodeHash.length() > 0) {
            FileLog.d("wasInBackground = " + zIsWasInBackground + " appLocked = " + SharedConfig.appLocked + " autoLockIn = " + SharedConfig.autoLockIn + " lastPauseTime = " + SharedConfig.lastPauseTime + " uptime = " + iElapsedRealtime);
        }
        if (SharedConfig.passcodeHash.length() <= 0 || !zIsWasInBackground) {
            return false;
        }
        if (SharedConfig.appLocked) {
            return true;
        }
        return !(SharedConfig.autoLockIn == 0 || SharedConfig.lastPauseTime == 0 || SharedConfig.appLocked || SharedConfig.lastPauseTime + SharedConfig.autoLockIn > iElapsedRealtime) || iElapsedRealtime + 5 < SharedConfig.lastPauseTime;
    }

    public static String readRes(File file) {
        return readRes(file, 0);
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10, float f10, float f11) {
        return replaceArrows(charSequence, z10, f10, f11, 1.0f);
    }

    public static SpannableStringBuilder replaceLinks(String str, final org.telegram.ui.ActionBar.c6 c6Var, final Runnable runnable) {
        if (linksPattern == null) {
            linksPattern = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = linksPattern.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group(1);
            final String strGroup2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) strGroup);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    we.e.s(ApplicationLoader.applicationContext, strGroup2);
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                    textPaint.setUnderlineText(false);
                }
            }, spannableStringBuilder.length() - strGroup.length(), spannableStringBuilder.length(), 33);
            iEnd = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, iEnd, str.length());
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleLink(String str, final int i10, final Runnable runnable) {
        int i11;
        int i12;
        int iIndexOf = str.indexOf("**");
        int iIndexOf2 = str.indexOf("**", iIndexOf + 1);
        String strReplace = str.replace("**", "");
        if (iIndexOf < 0 || iIndexOf2 < 0 || (i12 = iIndexOf2 - iIndexOf) <= 2) {
            iIndexOf = -1;
            i11 = 0;
        } else {
            i11 = i12 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        if (iIndexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View view) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(i10);
                    }
                }, iIndexOf, i11 + iIndexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new CharacterStyle() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(i10);
                }
            }, iIndexOf, i11 + iIndexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleLinkBold(String str, final int i10, final Runnable runnable) {
        int i11;
        int i12;
        int iIndexOf = str.indexOf("**");
        int iIndexOf2 = str.indexOf("**", iIndexOf + 1);
        String strReplace = str.replace("**", "");
        if (iIndexOf < 0 || iIndexOf2 < 0 || (i12 = iIndexOf2 - iIndexOf) <= 2) {
            iIndexOf = -1;
            i11 = 0;
        } else {
            i11 = i12 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        if (iIndexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View view) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }

                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                        textPaint.setTypeface(AndroidUtilities.bold());
                        textPaint.setColor(i10);
                    }
                }, iIndexOf, i11 + iIndexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new CharacterStyle() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setTypeface(AndroidUtilities.bold());
                    textPaint.setColor(i10);
                }
            }, iIndexOf, i11 + iIndexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleTag(String str, int i10, int i11, Runnable runnable) {
        return replaceSingleTag(str, i10, i11, runnable, null);
    }

    public static SpannableStringBuilder replaceTags(String str, int i10, Object... objArr) {
        try {
            StringBuilder sb2 = new StringBuilder(str);
            if ((i10 & 1) != 0) {
                while (true) {
                    int iIndexOf = sb2.indexOf("<br>");
                    if (iIndexOf == -1) {
                        break;
                    }
                    sb2.replace(iIndexOf, iIndexOf + 4, "\n");
                }
                while (true) {
                    int iIndexOf2 = sb2.indexOf("<br/>");
                    if (iIndexOf2 == -1) {
                        break;
                    }
                    sb2.replace(iIndexOf2, iIndexOf2 + 5, "\n");
                }
            }
            ArrayList arrayList = new ArrayList();
            if ((i10 & 2) != 0) {
                while (true) {
                    int iIndexOf3 = sb2.indexOf("<b>");
                    if (iIndexOf3 == -1) {
                        break;
                    }
                    sb2.replace(iIndexOf3, iIndexOf3 + 3, "");
                    int iIndexOf4 = sb2.indexOf("</b>");
                    if (iIndexOf4 == -1) {
                        iIndexOf4 = sb2.indexOf("<b>");
                    }
                    sb2.replace(iIndexOf4, iIndexOf4 + 4, "");
                    arrayList.add(Integer.valueOf(iIndexOf3));
                    arrayList.add(Integer.valueOf(iIndexOf4));
                }
                while (true) {
                    int iIndexOf5 = sb2.indexOf("**");
                    if (iIndexOf5 == -1) {
                        break;
                    }
                    sb2.replace(iIndexOf5, iIndexOf5 + 2, "");
                    int iIndexOf6 = sb2.indexOf("**");
                    if (iIndexOf6 >= 0) {
                        sb2.replace(iIndexOf6, iIndexOf6 + 2, "");
                        arrayList.add(Integer.valueOf(iIndexOf5));
                        arrayList.add(Integer.valueOf(iIndexOf6));
                    }
                }
            }
            if ((i10 & 8) != 0) {
                while (true) {
                    int iIndexOf7 = sb2.indexOf("**");
                    if (iIndexOf7 == -1) {
                        break;
                    }
                    sb2.replace(iIndexOf7, iIndexOf7 + 2, "");
                    int iIndexOf8 = sb2.indexOf("**");
                    if (iIndexOf8 >= 0) {
                        sb2.replace(iIndexOf8, iIndexOf8 + 2, "");
                        arrayList.add(Integer.valueOf(iIndexOf7));
                        arrayList.add(Integer.valueOf(iIndexOf8));
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
            for (int i11 = 0; i11 < arrayList.size() / 2; i11++) {
                int i12 = i11 * 2;
                spannableStringBuilder.setSpan(new k41(bold()), ((Integer) arrayList.get(i12)).intValue(), ((Integer) arrayList.get(i12 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e9) {
            FileLog.e(e9);
            return new SpannableStringBuilder(str);
        }
    }

    public static void requestAdjustResize(Window window, int i10) {
        if (window == null || isTablet()) {
            return;
        }
        window.setSoftInputMode(16);
        adjustOwnerClassGuid = i10;
    }

    public static double[] rgbToHsv(int i10, int i11, int i12) {
        double d;
        double d10;
        double d11;
        double d12 = ((double) i10) / 255.0d;
        double d13 = ((double) i11) / 255.0d;
        double d14 = ((double) i12) / 255.0d;
        double dMax = (d12 <= d13 || d12 <= d14) ? Math.max(d13, d14) : d12;
        double dMin = (d12 >= d13 || d12 >= d14) ? Math.min(d13, d14) : d12;
        double d15 = dMax - dMin;
        double d16 = 0.0d;
        double d17 = dMax == 0.0d ? 0.0d : d15 / dMax;
        if (dMax != dMin) {
            if (d12 <= d13 || d12 <= d14) {
                if (d13 > d14) {
                    d11 = 2.0d + ((d14 - d12) / d15);
                } else {
                    d = (d12 - d13) / d15;
                    d10 = 4.0d;
                }
                d16 = d11 / 6.0d;
            } else {
                d = (d13 - d14) / d15;
                d10 = d13 < d14 ? 6 : 0;
            }
            d11 = d + d10;
            d16 = d11 / 6.0d;
        }
        return new double[]{d16, d17, dMax};
    }

    public static void runOnUIThread(Runnable runnable, long j10) {
        if (ApplicationLoader.applicationHandler == null) {
            return;
        }
        if (j10 == 0) {
            ApplicationLoader.applicationHandler.post(runnable);
        } else {
            ApplicationLoader.applicationHandler.postDelayed(runnable, j10);
        }
    }

    public static void scaleRect(RectF rectF, float f10, float f11, float f12) {
        float f13 = f11 - rectF.left;
        float f14 = rectF.right - f11;
        rectF.set(f11 - (f13 * f10), f12 - ((f12 - rectF.top) * f10), (f14 * f10) + f11, ((rectF.bottom - f12) * f10) + f12);
    }

    public static void setLightNavigationBar(Activity activity, boolean z10) {
        if (activity != null) {
            setLightNavigationBar(activity.getWindow(), z10);
        }
    }

    public static void setLightStatusBar(Dialog dialog, boolean z10) {
        if (dialog != null) {
            setLightStatusBar(dialog.getWindow(), z10);
        }
    }

    public static void setNavigationBarColor(Dialog dialog, int i10, boolean z10) {
        setNavigationBarColor(dialog, i10, z10, (IntColorCallback) null);
    }

    public static void setPreferredMaxRefreshRate(Window window, float f10) {
        WindowManager windowManager;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f10;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void shakeViewSpring(View view, float f10) {
        shakeViewSpring(view, f10, null);
    }

    public static void updateViewShow(View view, boolean z10, boolean z11, boolean z12) {
        updateViewShow(view, z10, z11, 0.0f, z12, null);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10, float f10, boolean z11) {
        updateViewVisibilityAnimated(view, z10, f10, true, z11);
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i10, boolean z10, boolean z11) {
        Spannable spannable2;
        if (spannable == null || containsUnsupportedCharacters(spannable.toString()) || i10 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            URLSpan uRLSpan = uRLSpanArr[length];
            if (!(uRLSpan instanceof t41) || z11) {
                spannable.removeSpan(uRLSpan);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!z10 && (i10 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        if ((i10 & 1) != 0) {
            spannable2 = spannable;
            gatherLinks(arrayList, spannable2, LinkifyPort.WEB_URL, new String[]{"http://", "https://", "tg://", "tonsite://"}, sUrlMatchFilter, z10);
        } else {
            spannable2 = spannable;
        }
        pruneOverlaps(arrayList);
        if (arrayList.size() == 0) {
            return false;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            LinkSpec linkSpec = (LinkSpec) arrayList.get(i11);
            URLSpan[] uRLSpanArr2 = (URLSpan[]) spannable2.getSpans(linkSpec.start, linkSpec.end, URLSpan.class);
            if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                for (URLSpan uRLSpan2 : uRLSpanArr2) {
                    spannable2.removeSpan(uRLSpan2);
                    if (!(uRLSpan2 instanceof t41) || z11) {
                        spannable2.removeSpan(uRLSpan2);
                    }
                }
            }
            String strReplaceAll = linkSpec.url;
            if (strReplaceAll != null) {
                strReplaceAll = strReplaceAll.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
            }
            if (!we.e.j(strReplaceAll)) {
                spannable2.setSpan(new URLSpan(strReplaceAll), linkSpec.start, linkSpec.end, 33);
            }
        }
        return true;
    }

    public static void addMediaToGallery(File file) {
        Uri uriFromFile = Uri.fromFile(file);
        if (uriFromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(uriFromFile);
            ApplicationLoader.applicationContext.sendBroadcast(intent);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void applySpring(Animator animator, double d, double d10, double d11, double d12) {
        double d13;
        double dSqrt;
        final double dSqrt2 = Math.sqrt(d / d11);
        final double dSqrt3 = d10 / (Math.sqrt(d * d11) * 2.0d);
        if (dSqrt3 < 1.0d) {
            dSqrt = Math.sqrt(1.0d - (dSqrt3 * dSqrt3)) * dSqrt2;
            d13 = ((dSqrt3 * dSqrt2) + (-d12)) / dSqrt;
        } else {
            d13 = (-d12) + dSqrt2;
            dSqrt = 0.0d;
        }
        final double d14 = dSqrt;
        final double d15 = d13;
        animator.setDuration((long) ((Math.log(0.0025d) / ((-dSqrt3) * dSqrt2)) * 1000.0d));
        final double d16 = 1.0d;
        animator.setInterpolator(new Interpolator() {
            @Override
            public float getInterpolation(float f10) {
                double dExp;
                double d17 = dSqrt3;
                if (d17 < 1.0d) {
                    double d18 = f10;
                    dExp = 1.0d - (((Math.sin(d14 * d18) * d15) + (Math.cos(d14 * d18) * d16)) * Math.exp((((double) (-f10)) * d17) * dSqrt2));
                } else {
                    dExp = 1.0d - (Math.exp(((double) (-f10)) * dSqrt2) * ((d15 * ((double) f10)) + d16));
                }
                return (float) dExp;
            }
        });
    }

    private static boolean isInternalUri(Uri uri, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            if (path.matches(Pattern.quote(new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
                return false;
            }
            int i11 = 0;
            str4 = path;
            while (str4.length() <= 4096) {
                try {
                    String str5 = Utilities.readlink(str4);
                    str2 = str4;
                    if (str5 != null && !str5.equals(str4)) {
                        i11++;
                        if (i11 >= 10) {
                            str2 = str4;
                            return true;
                        }
                        str2 = str4;
                        str4 = str5;
                    }
                } catch (Throwable unused) {
                    return true;
                }
            }
            return true;
        }
        int i12 = 0;
        str = "";
        while (str.length() <= 4096) {
            try {
                String str6 = Utilities.readlinkFd(i10);
                str2 = str;
                if (str6 != null && !str6.equals(str)) {
                    i12++;
                    if (i12 >= 10) {
                        str2 = str;
                        return true;
                    }
                    str2 = str;
                    str = str6;
                }
            } catch (Throwable unused2) {
                return true;
            }
        }
        return true;
        try {
            str2 = str;
            str2 = str4;
            String canonicalPath = new File(str2).getCanonicalPath();
            str3 = str2;
            if (canonicalPath != null) {
                str3 = canonicalPath;
            }
        } catch (Exception unused3) {
            str2.replace("/./", "/");
            str3 = str2;
        }
        if (str3.endsWith(".attheme")) {
            return false;
        }
        return str3.toLowerCase().contains("/data/data/" + ApplicationLoader.applicationContext.getPackageName());
    }

    public static float lerp(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, f12, f10);
    }

    public static String readRes(File file, int i10) {
        InputStream inputStreamOpenRawResource;
        byte[] bArr = readBufferLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            readBufferLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStreamOpenRawResource = new FileInputStream(file);
            } else {
                inputStreamOpenRawResource = ApplicationLoader.applicationContext.getResources().openRawResource(i10);
            }
            try {
                byte[] bArr2 = bufferLocal.get();
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                    bufferLocal.set(bArr2);
                }
                int i11 = 0;
                while (true) {
                    int i12 = inputStreamOpenRawResource.read(bArr2, 0, bArr2.length);
                    if (i12 >= 0) {
                        int i13 = i11 + i12;
                        if (bArr.length < i13) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i11);
                            readBufferLocal.set(bArr3);
                            bArr = bArr3;
                        }
                        if (i12 > 0) {
                            System.arraycopy(bArr2, 0, bArr, i11, i12);
                            i11 = i13;
                        }
                    } else {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                inputStreamOpenRawResource.close();
                return new String(bArr, 0, i11);
            } catch (Throwable unused2) {
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            inputStreamOpenRawResource = null;
        }
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10, float f10, float f11, float f12) {
        return replaceArrows(charSequence, z10, f10, f11, f12, R.drawable.msg_mini_forumarrow);
    }

    public static SpannableStringBuilder replaceSingleTag(String str, final int i10, final int i11, final Runnable runnable, final org.telegram.ui.ActionBar.c6 c6Var) {
        int i12;
        int i13;
        int iIndexOf = str.indexOf("**");
        int iIndexOf2 = str.indexOf("**", iIndexOf + 1);
        String strReplace = str.replace("**", "");
        if (iIndexOf < 0 || iIndexOf2 < 0 || (i13 = iIndexOf2 - iIndexOf) <= 2) {
            iIndexOf = -1;
            i12 = 0;
        } else {
            i12 = i13 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace);
        if (iIndexOf >= 0) {
            if (i11 == 3) {
                int i14 = iIndexOf + i12;
                spannableStringBuilder.replace(iIndexOf, i14, replaceMultipleCharSequence(" ", spannableStringBuilder.subSequence(iIndexOf, i14), " "));
            }
            if (i11 != 0 && i11 != 3 && i11 != 2 && i11 != 4) {
                spannableStringBuilder.setSpan(new CharacterStyle() {
                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                        int alpha = textPaint.getAlpha();
                        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var));
                        textPaint.setAlpha(alpha);
                    }
                }, iIndexOf, i12 + iIndexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(i11 == 4);
                    int i15 = i10;
                    if (i15 >= 0) {
                        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                    }
                    if (i11 == 2) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                    }
                }
            }, iIndexOf, i12 + iIndexOf, 0);
        }
        return spannableStringBuilder;
    }

    private static void setLightNavigationBar(Window window, boolean z10) {
        if (window != null) {
            setLightNavigationBar(window.getDecorView(), z10);
        }
    }

    public static void setLightStatusBar(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            changeSetSystemUiVisibility(window.getDecorView(), 8192, z10);
            if (i10 >= 35 || window.getStatusBarColor() == 0) {
                return;
            }
            window.setStatusBarColor(0);
        }
    }

    public static void setNavigationBarColor(Dialog dialog, int i10, boolean z10, IntColorCallback intColorCallback) {
        if (dialog != null) {
            setNavigationBarColor(dialog.getWindow(), i10, z10, intColorCallback);
        }
    }

    public static void shakeViewSpring(View view, Runnable runnable) {
        shakeViewSpring(view, 10.0f, runnable);
    }

    public static void updateViewShow(View view, boolean z10, boolean z11, boolean z12, Runnable runnable) {
        updateViewShow(view, z10, z11, 0.0f, z12, runnable);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10, float f10, boolean z11, boolean z12) {
        updateViewVisibilityAnimated(view, z10, f10, z11, 1.0f, z12, null);
    }

    public static SpannableStringBuilder formatSpannable(CharSequence charSequence, GenericProvider<Integer, String> genericProvider, CharSequence... charSequenceArr) {
        String string = charSequence.toString();
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            String strProvide = genericProvider.provide(Integer.valueOf(i10));
            int iIndexOf = string.indexOf(strProvide);
            if (iIndexOf != -1) {
                spannableStringBuilderValueOf.replace(iIndexOf, strProvide.length() + iIndexOf, charSequenceArr[i10]);
                string = string.substring(0, iIndexOf) + charSequenceArr[i10].toString() + string.substring(strProvide.length() + iIndexOf);
            }
        }
        return spannableStringBuilderValueOf;
    }

    public static CharSequence highlightText(CharSequence charSequence, String str, org.telegram.ui.ActionBar.c6 c6Var) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        int iIndexOf = lowerCase.indexOf(str);
        while (iIndexOf >= 0) {
            try {
                spannableStringBuilderValueOf.setSpan(new s00(org.telegram.ui.ActionBar.g6.q6, c6Var), iIndexOf, Math.min(str.length() + iIndexOf, charSequence.length()), 0);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            iIndexOf = lowerCase.indexOf(str, iIndexOf + 1);
        }
        return spannableStringBuilderValueOf;
    }

    public static float lerp(float f10, float f11, float f12, float f13) {
        return lerp(f10, f11, f12, 0.5f, f13);
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z10, float f10, float f11, float f12, int i10) {
        cq cqVar = new cq(i10, 0);
        float f13 = f12 * 0.88f;
        cqVar.setScale(f13, f13);
        cqVar.translate(-f10, f11);
        cqVar.spaceScaleX = 0.8f;
        if (z10) {
            cqVar.useLinkPaintColor = z10;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(cqVar, spannableString.length() - 1, spannableString.length(), 33);
        CharSequence charSequenceReplaceMultipleCharSequence = replaceMultipleCharSequence(" >", charSequence, spannableString);
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(cqVar, 0, 1, 33);
        CharSequence charSequenceReplaceMultipleCharSequence2 = replaceMultipleCharSequence(">", charSequenceReplaceMultipleCharSequence, spannableString2);
        cq cqVar2 = new cq(i10, 0);
        cqVar2.setScale(f13, f13);
        cqVar2.translate(f10, f11);
        cqVar2.rotate(180.0f);
        cqVar2.spaceScaleX = 0.8f;
        if (z10) {
            cqVar2.useLinkPaintColor = z10;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(cqVar2, 0, 1, 33);
        return replaceMultipleCharSequence("<", charSequenceReplaceMultipleCharSequence2, spannableString3);
    }

    public static void setLightNavigationBar(View view, boolean z10) {
        if (view == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        changeSetSystemUiVisibility(view, 16, z10);
    }

    @Deprecated
    public static void setNavigationBarColor(Activity activity, int i10) {
        setNavigationBarColor(activity, i10, true);
    }

    public static void shakeViewSpring(View view, float f10, Runnable runnable) {
        if (view == null) {
            return;
        }
        int iDp = dp(f10);
        if (view.getTag(R.id.spring_tag) != null) {
            ((o1.j) view.getTag(R.id.spring_tag)).c();
        }
        Float f11 = (Float) view.getTag(R.id.spring_was_translation_x_tag);
        if (f11 != null) {
            view.setTranslationX(f11.floatValue());
        }
        view.setTag(R.id.spring_was_translation_x_tag, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        o1.j jVar = new o1.j(view, o1.h.f19129m, translationX);
        o1.k kVar = new o1.k(translationX);
        kVar.b(600.0f);
        jVar.f19147u = kVar;
        jVar.f19137a = (-iDp) * 100;
        jVar.a(new lh.r3(view, translationX, runnable));
        view.setTag(R.id.spring_tag, jVar);
        jVar.f();
    }

    public static void updateImageViewImageAnimated(final ImageView imageView, final Drawable drawable) {
        if (imageView.getDrawable() == drawable) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AndroidUtilities.lambda$updateImageViewImageAnimated$25(imageView, atomicBoolean, drawable, valueAnimator);
            }
        });
        duration.start();
    }

    public static void updateViewShow(View view, boolean z10, boolean z11, float f10, boolean z12, Runnable runnable) {
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            z12 = false;
        }
        view.animate().setListener(null).cancel();
        if (!z12) {
            view.setVisibility(z10 ? 0 : 8);
            view.setTag(z10 ? 1 : null);
            view.setAlpha(1.0f);
            view.setScaleX((!z11 || z10) ? 1.0f : 0.5f);
            view.setScaleY((!z11 || z10) ? 1.0f : 0.5f);
            if (f10 != 0.0f) {
                view.setTranslationY(z10 ? 0.0f : dp(-16.0f) * f10);
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (z10) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(z11 ? 0.5f : 1.0f);
                view.setScaleY(z11 ? 0.5f : 1.0f);
                if (f10 != 0.0f) {
                    view.setTranslationY(dp(-16.0f) * f10);
                }
            }
            ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(er.h).setDuration(340L).withEndAction(runnable);
            if (f10 != 0.0f) {
                viewPropertyAnimatorWithEndAction.translationY(0.0f);
            }
            viewPropertyAnimatorWithEndAction.start();
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction2 = view.animate().alpha(0.0f).scaleY(z11 ? 0.5f : 1.0f).scaleX(z11 ? 0.5f : 1.0f).setListener(new go(view)).setInterpolator(er.h).setDuration(340L).withEndAction(runnable);
        if (f10 != 0.0f) {
            viewPropertyAnimatorWithEndAction2.translationY(dp(-16.0f) * f10);
        }
        viewPropertyAnimatorWithEndAction2.start();
    }

    public static void updateViewVisibilityAnimated(View view, boolean z10, float f10, boolean z11, float f11, boolean z12, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Integer num = 1;
        if (view == null) {
            return;
        }
        int i10 = 0;
        if (view.getParent() == null) {
            z12 = false;
        }
        if (!z12) {
            view.animate().setListener(null).cancel();
            if (!z10) {
                i10 = z11 ? 8 : 4;
            }
            view.setVisibility(i10);
            view.setTag(z10 ? 1 : null);
            view.setAlpha(f11);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        if (z10 && view.getTag() == null) {
            view.animate().setListener(null).cancel();
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(f10);
                view.setScaleY(f10);
            }
            view.animate().alpha(f11).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
            view.setTag(num);
            return;
        }
        if (z10 || view.getTag() == null) {
            return;
        }
        view.animate().setListener(null).cancel();
        view.animate().alpha(0.0f).scaleY(f10).scaleX(f10).setListener(new go(view, z11)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
        view.setTag(null);
    }

    public static int charSequenceIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        return charSequenceIndexOf(charSequence, charSequence2, 0);
    }

    public static Pair<Integer, Integer> getImageOrientation(File file) {
        try {
            return getImageOrientation(new r1.g(file));
        } catch (Exception e9) {
            FileLog.e(e9);
            return new Pair<>(0, 0);
        }
    }

    public static float lerp(float f10, float f11, float f12, float f13, float f14) {
        if (f14 < f13) {
            return lerp(f10, f11, f14 / f13);
        }
        return lerp(f11, f12, (f14 - f13) / (1.0f - f13));
    }

    public static void normalizeTimePart(StringBuilder sb2, long j10) {
        if (j10 < 10) {
            sb2.append("0");
            sb2.append(j10);
        } else {
            sb2.append(j10);
        }
    }

    @Deprecated
    public static void setNavigationBarColor(Activity activity, int i10, boolean z10) {
        if (activity != null) {
            setNavigationBarColor(activity.getWindow(), i10, z10, (IntColorCallback) null);
        }
    }

    public static boolean addToClipboard(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, r.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static void enableEdgeToEdge(Window window) {
        Objects.requireNonNull(window);
        window.getDecorView();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            g0.f.t(window);
        } else if (i10 >= 30) {
            g0.f.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i10 >= 28) {
            int i11 = i10 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i11) {
                attributes.layoutInDisplayCutoutMode = i11;
                window.setAttributes(attributes);
            }
        }
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static void lerpCentered(Rect rect, Rect rect2, float f10, Rect rect3) {
        if (rect3 == null) {
            return;
        }
        float fLerp = lerp(rect.centerX(), rect2.centerX(), f10);
        float fLerp2 = lerp(rect.centerY(), rect2.centerY(), f10);
        float fLerp3 = lerp(rect.width(), rect2.width(), Math.min(1.0f, f10)) / 2.0f;
        float fLerp4 = lerp(rect.height(), rect2.height(), Math.min(1.0f, f10)) / 2.0f;
        rect3.set((int) (fLerp - fLerp3), (int) (fLerp2 - fLerp4), (int) (fLerp + fLerp3), (int) (fLerp2 + fLerp4));
    }

    private static void setNavigationBarColor(final Window window, int i10, boolean z10, IntColorCallback intColorCallback) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap<Window, ValueAnimator> map = navigationBarColorAnimators;
        if (map != null && (valueAnimator = map.get(window)) != null) {
            valueAnimator.cancel();
            navigationBarColorAnimators.remove(window);
        }
        if (!z10) {
            if (intColorCallback != null) {
                intColorCallback.run(i10);
            }
            try {
                window.setNavigationBarColor(i10);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i10);
        valueAnimatorOfArgb.addUpdateListener(new sh(1, intColorCallback, window));
        valueAnimatorOfArgb.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (AndroidUtilities.navigationBarColorAnimators != null) {
                    AndroidUtilities.navigationBarColorAnimators.remove(window);
                }
            }
        });
        valueAnimatorOfArgb.setDuration(200L);
        valueAnimatorOfArgb.setInterpolator(er.f28122f);
        valueAnimatorOfArgb.start();
        if (navigationBarColorAnimators == null) {
            navigationBarColorAnimators = new HashMap<>();
        }
        navigationBarColorAnimators.put(window, valueAnimatorOfArgb);
    }

    public static int applyColorMatrix(int i10, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int iAlpha = Color.alpha(i10);
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        float f10 = iRed;
        float f11 = iGreen;
        float fBlue = Color.blue(i10);
        float f12 = iAlpha;
        float f13 = (array[3] * f12) + (array[2] * fBlue) + (array[1] * f11) + (array[0] * f10) + array[4];
        float f14 = (array[8] * f12) + (array[7] * fBlue) + (array[6] * f11) + (array[5] * f10) + array[9];
        float f15 = (array[13] * f12) + (array[12] * fBlue) + (array[11] * f11) + (array[10] * f10) + array[14];
        return Color.argb(h7.n.b(Math.round((array[18] * f12) + (array[17] * fBlue) + (array[16] * f11) + (array[15] * f10) + array[19]), 0, 255), h7.n.b(Math.round(f13), 0, 255), h7.n.b(Math.round(f14), 0, 255), h7.n.b(Math.round(f15), 0, 255));
    }

    public static boolean copyFile(File file, File file2) throws IOException {
        if (file.equals(file2)) {
            return true;
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream.getChannel().transferFrom(fileInputStream.getChannel(), 0L, fileInputStream.getChannel().size());
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    fileInputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    public static void forEachViews(RecyclerView recyclerView, d5.d dVar) {
        if (recyclerView == null) {
            return;
        }
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            dVar.accept(recyclerView.getChildAt(i10));
        }
        for (int i11 = 0; i11 < recyclerView.getCachedChildCount(); i11++) {
            dVar.accept(recyclerView.P(i11));
        }
        for (int i12 = 0; i12 < recyclerView.getHiddenChildCount(); i12++) {
            dVar.accept(recyclerView.V(i12));
        }
        for (int i13 = 0; i13 < recyclerView.getAttachedScrapChildCount(); i13++) {
            dVar.accept(recyclerView.O(i13));
        }
    }

    public static float lerp(boolean z10, boolean z11, float f10) {
        return com.google.android.recaptcha.internal.a.z(z11 ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f, f10, z10 ? 1.0f : 0.0f);
    }

    public static void setPreferredMaxRefreshRate(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - screenMaxRefreshRate) > 0.2d) {
            layoutParams.preferredRefreshRate = screenMaxRefreshRate;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
    }

    public static void getBitmapFromSurface(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView == null || ApplicationLoader.applicationHandler == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        PixelCopy.request(surfaceView, bitmap, new j(runnable, 2), ApplicationLoader.applicationHandler);
    }

    public static String getHostAuthority(Uri uri) {
        if (uri == null) {
            return null;
        }
        return getHostAuthority(uri.toString());
    }

    public static float lerp(float[] fArr, float f10) {
        return lerp(fArr[0], fArr[1], f10);
    }

    public static SpannableStringBuilder makeClickable(CharSequence charSequence, Runnable runnable) {
        return makeClickable(charSequence, 0, runnable, null);
    }

    public static void setLightStatusBar(View view, boolean z10) {
        if (view == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        changeSetSystemUiVisibility(view, 8192, z10);
    }

    public static void applySpring(Animator animator, float f10, float f11, float f12, long j10) {
        final double dSqrt = ((double) f11) / (Math.sqrt(f10 * f12) * 2.0d);
        final double dSqrt2 = Math.sqrt(f10 / f12);
        animator.setDuration(j10);
        animator.setInterpolator(new Interpolator() {
            @Override
            public float getInterpolation(float f13) {
                double dExp;
                double dExp2;
                double d = dSqrt;
                if (d < 1.0d) {
                    double dSqrt3 = Math.sqrt(1.0d - (d * d)) * dSqrt2;
                    double d10 = f13;
                    dExp = Math.exp((-dSqrt) * dSqrt2 * d10);
                    double d11 = d10 * dSqrt3;
                    dExp2 = (Math.sin(d11) * ((dSqrt * dSqrt2) / dSqrt3)) + Math.cos(d11);
                } else {
                    double d12 = (-d) * dSqrt2 * ((double) f13);
                    dExp = d12 + 1.0d;
                    dExp2 = Math.exp(d12);
                }
                return (float) (1.0d - (dExp2 * dExp));
            }
        });
    }

    public static String getHostAuthority(Uri uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        return getHostAuthority(uri.toString(), z10);
    }

    public static Pair<Integer, Integer> getImageOrientation(String str) {
        try {
            return getImageOrientation(new r1.g(str));
        } catch (Exception unused) {
            return new Pair<>(0, 0);
        }
    }

    public static void lerp(Rect rect, RectF rectF, float f10, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(lerp(rect.left, rectF.left, f10), lerp(rect.top, rectF.top, f10), lerp(rect.right, rectF.right, f10), lerp(rect.bottom, rectF.bottom, f10));
        }
    }

    public static String formatDuration(int i10, int i11, boolean z10) {
        int i12 = i11 / 3600;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 % 60;
        int i15 = i10 / 3600;
        int i16 = (i10 / 60) % 60;
        int i17 = i10 % 60;
        if (i11 == 0) {
            if (i15 == 0) {
                return z10 ? String.format(Locale.US, "%02d:%02d / -:--", Integer.valueOf(i16), Integer.valueOf(i17)) : String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i16), Integer.valueOf(i17));
            }
            return String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
        }
        if (i15 == 0 && i12 == 0) {
            return z10 ? String.format(Locale.US, "%02d:%02d / %02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        return String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static void getBitmapFromSurface(Surface surface, Bitmap bitmap) {
        if (surface == null || !surface.isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surface, bitmap, new j(countDownLatch, 1), Utilities.searchQueue.getHandler());
        try {
            countDownLatch.await();
        } catch (InterruptedException e9) {
            e9.printStackTrace();
        }
    }

    public static Pair<Integer, Integer> getImageOrientation(r1.g gVar) {
        int iE;
        int i10 = 0;
        try {
            r1.c cVarC = gVar.c("Orientation");
            if (cVarC == null) {
                iE = 1;
            } else {
                try {
                    iE = cVarC.e(gVar.f46690g);
                } catch (NumberFormatException unused) {
                    iE = 1;
                }
            }
            int i11 = 2;
            switch (iE) {
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i10 = 180;
                    i11 = 0;
                    break;
                case 4:
                    break;
                case 5:
                    i10 = 270;
                    break;
                case 6:
                    i10 = 90;
                    i11 = 0;
                    break;
                case 7:
                    i10 = 270;
                    i11 = 1;
                    break;
                case 8:
                    i10 = 270;
                    i11 = 0;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
        } catch (Exception e9) {
            FileLog.e(e9);
            return new Pair<>(0, 0);
        }
    }

    public static void setScrollViewEdgeEffectColor(ScrollView scrollView, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
                declaredField.setAccessible(true);
                EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
                if (edgeEffect != null) {
                    edgeEffect.setColor(i10);
                }
                Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
                declaredField2.setAccessible(true);
                EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
                if (edgeEffect2 != null) {
                    edgeEffect2.setColor(i10);
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        scrollView.setTopEdgeEffectColor(i10);
        scrollView.setBottomEdgeEffectColor(i10);
    }

    public static void lerp(RectF rectF, Rect rect, float f10, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(lerp(rectF.left, rect.left, f10), lerp(rectF.top, rect.top, f10), lerp(rectF.right, rect.right, f10), lerp(rectF.bottom, rect.bottom, f10));
        }
    }

    public static void lockOrientation(Activity activity, int i10) {
        if (activity == null || isTabletInternal()) {
            return;
        }
        try {
            prevOrientation = activity.getRequestedOrientation();
            activity.setRequestedOrientation(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lerp(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(lerp(rectF.left, rectF2.left, f10), lerp(rectF.top, rectF2.top, f10), lerp(rectF.right, rectF2.right, f10), lerp(rectF.bottom, rectF2.bottom, f10));
        }
    }

    public static boolean openForView(MessageObject messageObject, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        String str = messageObject.messageOwner.attachPath;
        File file = (str == null || str.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner);
        }
        File file2 = file;
        int i10 = messageObject.type;
        return openForView(file2, messageObject.getFileName(), (i10 == 9 || i10 == 0) ? messageObject.getMimeType() : null, activity, c6Var, z10);
    }

    public static void lerp(Rect rect, Rect rect2, float f10, Rect rect3) {
        if (rect3 != null) {
            rect3.set(lerp(rect.left, rect2.left, f10), lerp(rect.top, rect2.top, f10), lerp(rect.right, rect2.right, f10), lerp(rect.bottom, rect2.bottom, f10));
        }
    }

    public static boolean openForView(TLRPC.Document document, boolean z10, Activity activity) {
        return openForView(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), FileLoader.getAttachFileName(document), document.mime_type, activity, null, false);
    }

    public static void dumpCanvas(View view) {
    }

    public static void printStackTrace(String str) {
    }

    public static boolean openForView(TLObject tLObject, Activity activity) {
        if (tLObject != null && activity != null) {
            String attachFileName = FileLoader.getAttachFileName(tLObject);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLObject, true);
            if (pathToAttach != null && pathToAttach.exists()) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                int iLastIndexOf = attachFileName.lastIndexOf(46);
                String str = null;
                if (iLastIndexOf != -1) {
                    String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(attachFileName.substring(iLastIndexOf + 1).toLowerCase());
                    if (mimeTypeFromExtension != null) {
                        str = mimeTypeFromExtension;
                    } else {
                        if (tLObject instanceof TLRPC.TL_document) {
                            mimeTypeFromExtension = ((TLRPC.TL_document) tLObject).mime_type;
                        }
                        if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() != 0) {
                            str = mimeTypeFromExtension;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), str != null ? str : "text/plain");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), str != null ? str : "text/plain");
                }
                if (str != null) {
                    try {
                        activity.startActivityForResult(intent, 500);
                    } catch (Exception unused) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "text/plain");
                        } else {
                            intent.setDataAndType(Uri.fromFile(pathToAttach), "text/plain");
                        }
                        activity.startActivityForResult(intent, 500);
                    }
                } else {
                    activity.startActivityForResult(intent, 500);
                }
                return true;
            }
        }
        return false;
    }

    public static void lerp(int[] iArr, int[] iArr2, float f10, int[] iArr3) {
        if (iArr3 == null) {
            return;
        }
        int i10 = 0;
        while (i10 < iArr3.length) {
            iArr3[i10] = lerp((iArr == null || i10 >= iArr.length) ? 0 : iArr[i10], (iArr2 == null || i10 >= iArr2.length) ? 0 : iArr2[i10], f10);
            i10++;
        }
    }

    public static CharSequence replaceTags(CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return replaceTags((SpannableStringBuilder) charSequence);
        }
        return replaceTags(new SpannableStringBuilder(charSequence));
    }

    public static SpannableStringBuilder replaceTags(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int iCharSequenceIndexOf = charSequenceIndexOf(spannableStringBuilder, "**");
                if (iCharSequenceIndexOf == -1) {
                    break;
                }
                spannableStringBuilder.replace(iCharSequenceIndexOf, iCharSequenceIndexOf + 2, "");
                int iCharSequenceIndexOf2 = charSequenceIndexOf(spannableStringBuilder, "**");
                if (iCharSequenceIndexOf2 >= 0) {
                    spannableStringBuilder.replace(iCharSequenceIndexOf2, iCharSequenceIndexOf2 + 2, "");
                    arrayList.add(Integer.valueOf(iCharSequenceIndexOf));
                    arrayList.add(Integer.valueOf(iCharSequenceIndexOf2));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i10 = 0; i10 < arrayList.size() / 2; i10++) {
                int i11 = i10 * 2;
                spannableStringBuilder2.setSpan(new k41(bold()), ((Integer) arrayList.get(i11)).intValue(), ((Integer) arrayList.get(i11 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e9) {
            FileLog.e(e9);
            return spannableStringBuilder;
        }
    }

    public static void lerp(float[] fArr, float[] fArr2, float f10, float[] fArr3) {
        if (fArr3 == null) {
            return;
        }
        int i10 = 0;
        while (i10 < fArr3.length) {
            float f11 = 0.0f;
            float f12 = (fArr == null || i10 >= fArr.length) ? 0.0f : fArr[i10];
            if (fArr2 != null && i10 < fArr2.length) {
                f11 = fArr2[i10];
            }
            fArr3[i10] = lerp(f12, f11, f10);
            i10++;
        }
    }

    public static void fillStatusBarHeight(Context context, boolean z10) {
    }

    public static void lerp(Matrix matrix, Matrix matrix2, float f10, Matrix matrix3) {
        if (matrix == null || matrix2 == null) {
            return;
        }
        float[] fArr = tempFloats;
        matrix.getValues(fArr);
        float[] fArr2 = tempFloats2;
        matrix2.getValues(fArr2);
        lerp(fArr, fArr2, f10, fArr2);
        matrix3.setValues(fArr2);
    }
}
