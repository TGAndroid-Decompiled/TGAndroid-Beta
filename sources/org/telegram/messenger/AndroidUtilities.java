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
import android.view.ViewParent;
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
import android.view.inspector.WindowInspector;
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
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ao;
import org.telegram.ui.mi1;
import org.telegram.ui.xn;
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
                boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return onTouchEvent;
                }
                Selection.removeSelection(spannable);
                return onTouchEvent;
            } catch (Exception e) {
                FileLog.e(e);
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

        public String getRawType(boolean z4) {
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return "";
            }
            String substring = this.fullData.substring(0, indexOf);
            if (this.type == 20) {
                String[] split = substring.substring(2).split(";");
                if (z4) {
                    return split[0];
                }
                if (split.length <= 1) {
                    return "";
                }
                return split[split.length - 1];
            }
            String[] split2 = substring.split(";");
            for (int i10 = 0; i10 < split2.length; i10++) {
                if (split2[i10].indexOf(61) < 0) {
                    substring = split2[i10];
                }
            }
            return substring;
        }

        public String[] getRawValue() {
            byte[] decodeQuotedPrintable;
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return new String[0];
            }
            String substring = this.fullData.substring(0, indexOf);
            String substring2 = this.fullData.substring(indexOf + 1);
            String str = null;
            String str2 = "UTF-8";
            for (String str3 : substring.split(";")) {
                String[] split = str3.split("=");
                if (split.length == 2) {
                    if (split[0].equals("CHARSET")) {
                        str2 = split[1];
                    } else if (split[0].equals("ENCODING")) {
                        str = split[1];
                    }
                }
            }
            String[] split2 = substring2.split(";");
            for (int i10 = 0; i10 < split2.length; i10++) {
                if (!TextUtils.isEmpty(split2[i10]) && str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(split2[i10]))) != null && decodeQuotedPrintable.length != 0) {
                    try {
                        split2[i10] = new String(decodeQuotedPrintable, str2);
                    } catch (Exception unused) {
                    }
                }
            }
            return split2;
        }

        public java.lang.String getType() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.VcardItem.getType():java.lang.String");
        }

        public String getValue(boolean z4) {
            byte[] decodeQuotedPrintable;
            StringBuilder sb = new StringBuilder();
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return "";
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            String substring = this.fullData.substring(0, indexOf);
            String substring2 = this.fullData.substring(indexOf + 1);
            String str = null;
            String str2 = "UTF-8";
            for (String str3 : substring.split(";")) {
                String[] split = str3.split("=");
                if (split.length == 2) {
                    if (split[0].equals("CHARSET")) {
                        str2 = split[1];
                    } else if (split[0].equals("ENCODING")) {
                        str = split[1];
                    }
                }
            }
            String[] split2 = substring2.split(";");
            boolean z10 = false;
            for (int i10 = 0; i10 < split2.length; i10++) {
                if (!TextUtils.isEmpty(split2[i10])) {
                    if (str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(split2[i10]))) != null && decodeQuotedPrintable.length != 0) {
                        try {
                            split2[i10] = new String(decodeQuotedPrintable, str2);
                        } catch (Exception unused) {
                        }
                    }
                    if (z10 && sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(split2[i10]);
                    if (!z10) {
                        if (split2[i10].length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                }
            }
            if (z4) {
                int i11 = this.type;
                if (i11 == 0) {
                    return se.b.c().b(sb.toString());
                }
                if (i11 == 5) {
                    String[] split3 = sb.toString().split("T");
                    if (split3.length > 0) {
                        String[] split4 = split3[0].split("-");
                        if (split4.length == 3) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, Utilities.parseInt((CharSequence) split4[0]).intValue());
                            calendar.set(2, Utilities.parseInt((CharSequence) split4[1]).intValue() - 1);
                            calendar.set(5, Utilities.parseInt((CharSequence) split4[2]).intValue());
                            return LocaleController.getInstance().getFormatterYearMax().format(calendar.getTime());
                        }
                    }
                }
            }
            return sb.toString();
        }
    }

    static {
        int i10;
        boolean z4 = false;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (isTablet()) {
            i10 = 80;
        } else {
            i10 = 72;
        }
        leftBaseline = i10;
        checkDisplaySize(ApplicationLoader.applicationContext, null);
        documentIcons = new int[]{R.drawable.media_doc_blue, R.drawable.media_doc_green, R.drawable.media_doc_red, R.drawable.media_doc_yellow};
        documentMediaIcons = new int[]{R.drawable.media_doc_blue_b, R.drawable.media_doc_green_b, R.drawable.media_doc_red_b, R.drawable.media_doc_yellow_b};
        sUrlMatchFilter = new Object();
        if (Build.VERSION.SDK_INT >= 23) {
            z4 = true;
        }
        hasCallPermissions = z4;
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
            float floor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f13 = (1.0f - f11) * f12;
            float f14 = (1.0f - (f11 * floor2)) * f12;
            float f15 = (1.0f - ((1.0f - floor2) * f11)) * f12;
            int i13 = (int) floor;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 != 5) {
                                    i10 = 0;
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    i10 = (int) ((f12 * 255.0f) + 0.5f);
                                    i11 = (int) ((f13 * 255.0f) + 0.5f);
                                    i12 = (int) ((f14 * 255.0f) + 0.5f);
                                }
                            } else {
                                i10 = (int) ((f15 * 255.0f) + 0.5f);
                                i11 = (int) ((f13 * 255.0f) + 0.5f);
                            }
                        } else {
                            i10 = (int) ((f13 * 255.0f) + 0.5f);
                            i11 = (int) ((f14 * 255.0f) + 0.5f);
                        }
                        i12 = (int) ((f12 * 255.0f) + 0.5f);
                    } else {
                        i10 = (int) ((f13 * 255.0f) + 0.5f);
                        i11 = (int) ((f12 * 255.0f) + 0.5f);
                        i12 = (int) ((f15 * 255.0f) + 0.5f);
                    }
                } else {
                    i10 = (int) ((f14 * 255.0f) + 0.5f);
                    i11 = (int) ((f12 * 255.0f) + 0.5f);
                }
            } else {
                i10 = (int) ((f12 * 255.0f) + 0.5f);
                i11 = (int) ((f15 * 255.0f) + 0.5f);
            }
            i12 = (int) ((f13 * 255.0f) + 0.5f);
        }
        return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
    }

    public static float[] RGBtoHSB(int i10, int i11, int i12) {
        float f10;
        float f11;
        int max = Math.max(i10, i11);
        if (i12 > max) {
            max = i12;
        }
        int min = Math.min(i10, i11);
        if (i12 < min) {
            min = i12;
        }
        float f12 = max;
        float f13 = f12 / 255.0f;
        float f14 = 0.0f;
        if (max != 0) {
            f10 = (max - min) / f12;
        } else {
            f10 = 0.0f;
        }
        if (f10 != 0.0f) {
            float f15 = max - min;
            float f16 = (max - i10) / f15;
            float f17 = (max - i11) / f15;
            float f18 = (max - i12) / f15;
            if (i10 == max) {
                f11 = f18 - f17;
            } else if (i11 == max) {
                f11 = (f16 + 2.0f) - f18;
            } else {
                f11 = (f17 + 4.0f) - f16;
            }
            float f19 = f11 / 6.0f;
            if (f19 < 0.0f) {
                f14 = f19 + 1.0f;
            } else {
                f14 = f19;
            }
        }
        return new float[]{f14, f10, f13};
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i10) {
        return addLinks(spannable, i10, false);
    }

    public static boolean addLinksSafe(Spannable spannable, final int i10, final boolean z4, final boolean z10) {
        if (spannable == null) {
            return false;
        }
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        boolean doSafe = doSafe(new Utilities.Callback0Return() {
            @Override
            public final Object run() {
                Boolean lambda$addLinksSafe$8;
                lambda$addLinksSafe$8 = AndroidUtilities.lambda$addLinksSafe$8(spannableStringBuilder, i10, z4, z10);
                return lambda$addLinksSafe$8;
            }
        });
        if (doSafe) {
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                spannable.removeSpan(uRLSpan);
            }
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            for (int i11 = 0; i11 < uRLSpanArr.length; i11++) {
                URLSpan uRLSpan2 = uRLSpanArr[i11];
                spannable.setSpan(uRLSpan2, spannableStringBuilder.getSpanStart(uRLSpan2), spannableStringBuilder.getSpanEnd(uRLSpanArr[i11]), 33);
            }
        }
        return doSafe;
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
        } catch (Exception e) {
            FileLog.e(e);
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
        float cleanValue = (cleanValue(f10, 180.0f) / 180.0f) * 3.1415927f;
        if (cleanValue == 0.0f) {
            return;
        }
        double d = cleanValue;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f11 = (cos * (-0.715f)) + 0.715f;
        float f12 = ((-0.072f) * cos) + 0.072f;
        float f13 = ((-0.213f) * cos) + 0.213f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{(sin * (-0.213f)) + (0.787f * cos) + 0.213f, ((-0.715f) * sin) + f11, (sin * 0.928f) + f12, 0.0f, 0.0f, (0.143f * sin) + f13, (0.14f * sin) + (0.28500003f * cos) + 0.715f, ((-0.283f) * sin) + f12, 0.0f, 0.0f, ((-0.787f) * sin) + f13, (0.715f * sin) + f11, (sin * 0.072f) + (cos * 0.928f) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
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
            Object invoke = cls.getMethod("getInstance", null).invoke(null, null);
            Method method = cls.getMethod("getViewRootNames", null);
            Method method2 = cls.getMethod("getRootView", String.class);
            String[] strArr = (String[]) method.invoke(invoke, null);
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add((View) method2.invoke(invoke, strArr[i10]));
            }
            return arrayList;
        } catch (Exception e) {
            FileLog.e("allGlobalViews()", e);
            return null;
        }
    }

    public static boolean allowScreenCapture() {
        if (SharedConfig.passcodeHash.length() != 0 && !SharedConfig.allowScreenCapture) {
            return false;
        }
        return true;
    }

    public static void appCenterLog(Throwable th2) {
        ApplicationLoader.appCenterLog(th2);
    }

    public static Bitmap applyColorMatrix(Bitmap bitmap, ColorMatrix colorMatrix) {
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void applyEdgeToEdgeLayoutParams(WindowManager.LayoutParams layoutParams) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if (i11 >= 30) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            layoutParams.layoutInDisplayCutoutMode = i10;
        }
    }

    public static void applySpring(Animator animator, double d, double d10) {
        applySpring(animator, d, d10, 1.0d, 0.0d);
    }

    public static Typeface bold() {
        if (mediumTypeface == null) {
            if (SharedConfig.useSystemBoldFont && Build.VERSION.SDK_INT >= 28) {
                mediumTypeface = Typeface.create(null, 500, false);
            } else {
                mediumTypeface = getTypeface("fonts/rmedium.ttf");
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
            Bitmap createScaledBitmap = Bitmaps.createScaledBitmap(bitmap, 1, 1, true);
            if (createScaledBitmap != null) {
                int pixel = createScaledBitmap.getPixel(0, 0);
                if (bitmap != createScaledBitmap) {
                    createScaledBitmap.recycle();
                    return pixel;
                }
                return pixel;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return 0;
    }

    public static int[] calcDrawableColor(Drawable drawable) {
        if (drawable instanceof ao) {
            return calcDrawableColor(((ao) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i10 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i10 = calcBitmapColor(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i10 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.o9) {
                int[] iArr2 = ((org.telegram.ui.Components.o9) drawable).f27519a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i10 = getAverageColor(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i10 = iArr2[0];
                    }
                }
            } else if (drawable instanceof dc0) {
                int argb = Color.argb(45, 0, 0, 0);
                iArr[2] = argb;
                iArr[0] = argb;
                int argb2 = Color.argb(61, 0, 0, 0);
                iArr[3] = argb2;
                iArr[1] = argb2;
                return iArr;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        double[] rgbToHsv = rgbToHsv((i10 >> 16) & 255, (i10 >> 8) & 255, i10 & 255);
        double d = rgbToHsv[1];
        rgbToHsv[1] = Math.min(1.0d, ((1.0d - d) * 0.1d) + 0.05d + d);
        int[] hsvToRgb = hsvToRgb(rgbToHsv[0], rgbToHsv[1], Math.max(0.0d, rgbToHsv[2] * 0.65d));
        iArr[0] = Color.argb(102, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
        iArr[1] = Color.argb(136, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
        int[] hsvToRgb2 = hsvToRgb(rgbToHsv[0], rgbToHsv[1], Math.max(0.0d, rgbToHsv[2] * 0.72d));
        iArr[2] = Color.argb(102, hsvToRgb2[0], hsvToRgb2[1], hsvToRgb2[2]);
        iArr[3] = Color.argb(136, hsvToRgb2[0], hsvToRgb2[1], hsvToRgb2[2]);
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
        float min = Math.min(f13, f12) * (1.0f / f12);
        return k7.n.a((f10 - ((1.0f - min) * (f11 / f12))) / min, 0.0f, 1.0f);
    }

    private static void changeSetSystemUiVisibility(View view, int i10, boolean z4) {
        int systemUiVisibility = view.getSystemUiVisibility();
        int b10 = k7.w8.b(systemUiVisibility, i10, z4);
        if (systemUiVisibility != b10) {
            view.setSystemUiVisibility(b10);
        }
    }

    public static boolean charSequenceContains(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequenceIndexOf(charSequence, charSequence2) != -1) {
            return true;
        }
        return false;
    }

    public static int charSequenceIndexOf(java.lang.CharSequence r4, java.lang.CharSequence r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.charSequenceIndexOf(java.lang.CharSequence, java.lang.CharSequence, int):int");
    }

    public static void checkAndroidTheme(Context context, boolean z4) {
        int i10;
        if (context == null) {
            return;
        }
        if (org.telegram.ui.ActionBar.j6.I.q() && z4) {
            i10 = R.style.Theme_TMessages_Dark;
        } else {
            i10 = R.style.Theme_TMessages;
        }
        context.setTheme(i10);
    }

    public static void checkDisplaySize(Context context, Configuration configuration) {
        float f10;
        boolean z4;
        int i10;
        int i11;
        Display defaultDisplay;
        try {
            float f11 = density;
            density = context.getResources().getDisplayMetrics().density;
            if (firstConfigurationWas && Math.abs(f11 - f10) > 0.001d) {
                if (org.telegram.ui.ActionBar.j6.f20064m3 != null) {
                    org.telegram.ui.ActionBar.j6.f20064m3 = null;
                    org.telegram.ui.ActionBar.j6.J(context, false);
                }
                if (org.telegram.ui.ActionBar.j6.B0 != null) {
                    org.telegram.ui.ActionBar.j6.B0 = null;
                    org.telegram.ui.ActionBar.j6.R(context);
                }
                if (org.telegram.ui.ActionBar.j6.Q1 != null) {
                    org.telegram.ui.ActionBar.j6.Q1 = null;
                    org.telegram.ui.ActionBar.j6.X(context);
                }
            }
            firstConfigurationWas = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            if (configuration.keyboard != 1 && configuration.hardKeyboardHidden == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            usingHardwareInput = z4;
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
            if (configuration.screenWidthDp != 0) {
                int ceil = (int) Math.ceil(i10 * density);
                if (Math.abs(displaySize.x - ceil) > 3) {
                    displaySize.x = ceil;
                }
            }
            if (configuration.screenHeightDp != 0) {
                int ceil2 = (int) Math.ceil(i11 * density);
                if (Math.abs(displaySize.y - ceil2) > 3) {
                    displaySize.y = ceil2;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static boolean checkHostForPunycode(String str) {
        boolean z4;
        boolean z10;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z4 = false;
            z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    char charAt = str.charAt(i10);
                    if (charAt != '.' && charAt != '-' && charAt != '/' && charAt != '+' && (charAt < '0' || charAt > '9')) {
                        if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                            z4 = true;
                        } else {
                            z10 = true;
                        }
                        if (z4 && z10) {
                            break;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    return !z4 ? false : false;
                }
            }
        } catch (Exception e6) {
            e = e6;
            z4 = false;
            z10 = false;
        }
        if (!z4 && z10) {
            return true;
        }
    }

    public static boolean checkInlinePermissions(Context context) {
        if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            return false;
        }
        return true;
    }

    public static boolean checkPhonePattern(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String d = se.b.d(str2, false);
            int i10 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = d.indexOf(str3, i10);
                    if (indexOf == -1) {
                        return false;
                    }
                    i10 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static boolean checkPipPermissions(Context context) {
        if (!context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") || ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    public static float cleanValue(float f10, float f11) {
        return Math.min(f11, Math.max(-f11, f10));
    }

    public static void clearDrawableAnimation(View view) {
        if (view != null) {
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
    }

    public static ByteBuffer cloneByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        try {
            allocate = ByteBuffer.allocate(byteBuffer.capacity());
        } catch (OutOfMemoryError unused) {
            System.gc();
            allocate = ByteBuffer.allocate(byteBuffer.capacity());
        }
        int position = byteBuffer.position();
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        allocate.position(position);
        return allocate;
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
        float green = Color.green(i10) * 0.7152f;
        return e2.c.v(Color.blue(i10), 0.0722f, green + (Color.red(i10) * 0.2126f), 255.0f);
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
        StringBuilder sb = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i10 < length2) {
            sb.append(charSequenceArr[i10]);
            i10++;
        }
        return sb.toString();
    }

    private static boolean containsUnsupportedCharacters(String str) {
        if (str.contains("\u202c") || str.contains("\u202d") || str.contains("\u202e")) {
            return true;
        }
        try {
            if (BAD_CHARS_PATTERN.matcher(str).find()) {
                return true;
            }
            return false;
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
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static void createCalendarEvent(Activity activity, long j10, String str, String str2, boolean z4) {
        long millis;
        if (z4) {
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
        Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("beginTime", j10).putExtra("endTime", millis + j10).putExtra("allDay", z4);
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("title", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            putExtra.putExtra("description", str2);
        }
        try {
            activity.startActivity(putExtra);
        } catch (Throwable th2) {
            FileLog.e(th2);
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
        } catch (Throwable th2) {
            FileLog.e(th2, false);
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
                    int digit = Character.digit((char) bArr[i10 + 1], 16);
                    i10 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i10], 16)));
                } catch (Exception e) {
                    FileLog.e(e);
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
        } catch (Exception e6) {
            FileLog.e(e6);
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
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public final boolean onPreDraw() {
                boolean lambda$doOnPreDraw$27;
                lambda$doOnPreDraw$27 = AndroidUtilities.lambda$doOnPreDraw$27(viewTreeObserver, r2, zArr, runnable);
                return lambda$doOnPreDraw$27;
            }
        };
        final ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = {onPreDrawListener};
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
        int indexOf;
        CharSequence charSequence2;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > i11) {
                charSequence = charSequence.subSequence(Math.max(0, indexOf - (i11 / 2)), Math.min(length, (i11 / 2) + indexOf));
                indexOf -= Math.max(0, indexOf - (i11 / 2));
                charSequence.length();
            }
            charSequence2 = charSequence;
        } catch (Exception e) {
            exc = e;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f10 = i10;
            if (textPaint.measureText("...") + lineWidth >= f10) {
                int i12 = indexOf + 1;
                int i13 = i12;
                while (i13 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i13))) {
                    i13++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i13);
                if (staticLayout.isRtlCharAt(i13)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f10) {
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f10);
                    float f11 = 0.1f * f10;
                    float f12 = measureText + f11;
                    if (charSequence2.length() - i13 > 20) {
                        f12 += f11;
                    }
                    if (f12 > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f12);
                        if (offsetForHorizontal > charSequence2.length() - 1) {
                            offsetForHorizontal = charSequence2.length() - 1;
                        }
                        int i14 = 0;
                        while (true) {
                            if (Character.isWhitespace(charSequence2.charAt(offsetForHorizontal)) || i14 >= 10) {
                                break;
                            }
                            i14++;
                            offsetForHorizontal++;
                            if (offsetForHorizontal > charSequence2.length() - 1) {
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f12);
                                break;
                            }
                        }
                        if (i14 >= 10) {
                            subSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i12) - (f10 * 0.3f)), charSequence2.length());
                        } else {
                            if (offsetForHorizontal > 0 && offsetForHorizontal < charSequence2.length() - 2 && Character.isWhitespace(charSequence2.charAt(offsetForHorizontal))) {
                                offsetForHorizontal++;
                            }
                            subSequence = charSequence2.subSequence(offsetForHorizontal, charSequence2.length());
                        }
                        return SpannableStringBuilder.valueOf("...").append(subSequence);
                    }
                }
            }
            return charSequence2;
        } catch (Exception e6) {
            exc = e6;
            charSequence = charSequence2;
            FileLog.e(exc);
            return charSequence;
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
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public static void endIncomingCall() {
        if (!hasCallPermissions) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            if (declaredMethod.invoke(telephonyManager, null) == null) {
                if (declaredMethod.invoke(telephonyManager, null) == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            throw new ClassCastException();
        } catch (Throwable th2) {
            FileLog.e(th2);
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
                    View findChildViewUnder = findChildViewUnder((ViewGroup) childAt, f10 - childAt.getLeft(), f11 - childAt.getTop());
                    if (findChildViewUnder != null) {
                        return findChildViewUnder;
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
            if (document != null && document.f19190id == j10) {
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
            if (photo != null && photo.f19208id == j10) {
                return photo;
            }
        }
        return null;
    }

    public static void fixGoogleMapsBug() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("google_bug_154855417", 0);
        if (!sharedPreferences.contains("fixed")) {
            new File(ApplicationLoader.getFilesDirFixed(), "ZoomTables.data").delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        }
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

    public static void forEachViews(View view, h5.d dVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                dVar.accept(view);
                forEachViews(viewGroup.getChildAt(i10), dVar);
            }
            return;
        }
        dVar.accept(view);
    }

    public static String formapMapUrl(int i10, double d, double d10, int i11, int i12, boolean z4, int i13, int i14) {
        int i15;
        int min = Math.min(2, (int) Math.ceil(density));
        if (i14 == -1) {
            i15 = MessagesController.getInstance(i10).mapProvider;
        } else {
            i15 = i14;
        }
        if (i15 != 1 && i15 != 3) {
            String str = MessagesController.getInstance(i10).mapKey;
            if (!TextUtils.isEmpty(str)) {
                if (z4) {
                    return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), Double.valueOf(d), Double.valueOf(d10), str);
                }
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), str);
            } else if (z4) {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), Double.valueOf(d), Double.valueOf(d10));
            } else {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d), Double.valueOf(d10), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min));
            }
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
        if (z4) {
            return String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", Double.valueOf(d10), Double.valueOf(d), Integer.valueOf(i13), Integer.valueOf(i11 * min), Integer.valueOf(i12 * min), Integer.valueOf(min), Double.valueOf(d10), Double.valueOf(d), str2);
        }
        return String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", Double.valueOf(d10), Double.valueOf(d), Integer.valueOf(i13), Integer.valueOf(i11 * min), Integer.valueOf(i12 * min), Integer.valueOf(min), str2);
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
        StringBuilder sb = new StringBuilder();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sb.append((String) arrayList.get(size));
            if (size != 0) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static String formatDuration(int i10, boolean z4) {
        return formatDuration(i10, z4, false);
    }

    public static String formatDurationNoHours(int i10, boolean z4) {
        int i11 = i10 / 60;
        int i12 = i10 % 60;
        if (z4) {
            return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String formatFileSize(long j10) {
        return formatFileSize(j10, false, false);
    }

    public static String formatFullDuration(int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i10 < 0) {
            return String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12)), Integer.valueOf(Math.abs(i13)));
        }
        return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String formatLongDuration(int i10) {
        return formatDuration(i10, true);
    }

    public static String formatShortDuration(int i10) {
        return formatDuration(i10, false);
    }

    public static SpannableStringBuilder formatSpannable(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (charSequence.toString().contains("%s")) {
            return formatSpannableSimple(charSequence, charSequenceArr);
        }
        return formatSpannable(charSequence, new b(4), charSequenceArr);
    }

    public static SpannableStringBuilder formatSpannableSimple(CharSequence charSequence, CharSequence... charSequenceArr) {
        return formatSpannable(charSequence, new b(3), charSequenceArr);
    }

    public static String formatTimerDurationFast(long j10, int i10) {
        StringBuilder sb = new StringBuilder();
        long j11 = j10 / 60;
        if (j11 >= 60) {
            sb.append(j11 / 60);
            sb.append(":");
            normalizeTimePart(sb, j11 % 60);
            sb.append(":");
            normalizeTimePart(sb, j10 % 60);
            sb.append(",");
            sb.append(i10 / 10);
        } else {
            sb.append(j11);
            sb.append(":");
            normalizeTimePart(sb, j10 % 60);
            sb.append(",");
            sb.append(i10 / 10);
        }
        return sb.toString();
    }

    public static String formatTimestamp(int i10) {
        String str;
        String str2;
        String str3;
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i11 > 0) {
            Locale locale = Locale.US;
            str = android.support.v4.media.a.l(i11, "h");
        } else {
            str = "";
        }
        if (i12 > 0) {
            StringBuilder l10 = e2.c.l(str);
            Locale locale2 = Locale.US;
            if (i11 > 0) {
                str3 = "%02dm";
            } else {
                str3 = "%dm";
            }
            l10.append(String.format(locale2, str3, Integer.valueOf(i12)));
            str = l10.toString();
        }
        StringBuilder l11 = e2.c.l(str);
        Locale locale3 = Locale.US;
        if (i11 <= 0 && i12 <= 0) {
            str2 = "%ds";
        } else {
            str2 = "%02ds";
        }
        l11.append(String.format(locale3, str2, Integer.valueOf(i13)));
        return l11.toString();
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
        if (i15 == 0) {
            return String.format(Locale.US, "%02d:%02d / %d:%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        return String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String formatVideoDurationFast(int i10, int i11) {
        StringBuilder sb = new StringBuilder();
        if (i10 >= 60) {
            normalizeTimePart(sb, i10 / 60);
            sb.append(":");
            normalizeTimePart(sb, i10 % 60);
            sb.append(":");
            normalizeTimePart(sb, i11);
        } else {
            normalizeTimePart(sb, i10);
            sb.append(":");
            normalizeTimePart(sb, i11);
        }
        return sb.toString();
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
        if (f11 == f12) {
            Locale locale = Locale.ENGLISH;
            return vh.v2.k(formatCount((int) f10), numbersSignatureArray[i12]);
        }
        return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 / 10.0f), numbersSignatureArray[i12]);
    }

    private static void gatherLinks(ArrayList<LinkSpec> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, boolean z4) {
        if (TextUtils.indexOf((CharSequence) spannable, (char) 9472) >= 0) {
            spannable = new SpannableStringBuilder(spannable.toString().replace((char) 9472, ' '));
        }
        if (!TextUtils.isEmpty(spannable) && TextUtils.lastIndexOf(spannable, '_') == spannable.length() - 1) {
            spannable = new SpannableStringBuilder(spannable.toString()).replace(spannable.length() - 1, spannable.length(), (CharSequence) "a");
        }
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                LinkSpec linkSpec = new LinkSpec();
                String makeUrl = makeUrl(matcher.group(0), strArr, matcher);
                if (!z4 || af.g.f(Uri.parse(makeUrl), true, null)) {
                    linkSpec.url = makeUrl;
                    linkSpec.start = start;
                    linkSpec.end = end;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    public static String generateFileName(int i10, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.random.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i10 == 0) {
            StringBuilder t6 = android.support.v4.media.a.t("IMG_", format, ".");
            if (TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            t6.append(str);
            return t6.toString();
        }
        return android.support.v4.media.a.o("VID_", format, ".mp4");
    }

    public static File generatePicturePath() {
        return generatePicturePath(false, null);
    }

    public static CharSequence generateSearchName(String str, String str2, String str3) {
        int i10;
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                str = android.support.v4.media.a.z(str, " ", str2);
            }
        } else {
            str = str2;
        }
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i11 = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i11);
            if (indexOf == -1) {
                break;
            }
            int i12 = 1;
            if (indexOf == 0) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            int i13 = indexOf - i10;
            int length = str3.length();
            if (indexOf == 0) {
                i12 = 0;
            }
            int i14 = length + i12 + i13;
            if (i11 != 0 && i11 != i13 + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i11, i13));
            } else if (i11 == 0 && i13 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i13));
            }
            String substring = trim.substring(i13, Math.min(trim.length(), i14));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new e10(org.telegram.ui.ActionBar.j6.f20140q6, null), length2, trim2.length() + length2, 33);
            i11 = i14;
        }
        if (i11 != -1 && i11 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i11));
        }
        return spannableStringBuilder;
    }

    public static File generateVideoPath() {
        return generateVideoPath(false);
    }

    public static Activity getActivity() {
        return getActivity(null);
    }

    private static File getAlbumDir(boolean z4) {
        int i10;
        if (!z4 && BuildVars.NO_SCOPED_STORAGE && (((i10 = Build.VERSION.SDK_INT) < 33 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) && (i10 < 23 || i10 > 33 || ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0))) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                if (!file.mkdirs() && !file.exists()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("failed to create directory");
                    }
                    return null;
                }
                return file;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("External storage is not mounted READ/WRITE.");
            }
            return null;
        }
        return FileLoader.getDirectory(0);
    }

    public static float getAnimatorDurationScale() {
        try {
            return Settings.Global.getFloat(ApplicationLoader.applicationContext.getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    public static int getAverageColor(int i10, int i11) {
        int red = Color.red(i10);
        int red2 = Color.red(i11);
        int green = Color.green(i10);
        int green2 = Color.green(i11);
        int blue = Color.blue(i10);
        return Color.argb(255, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i11) / 2) + (blue / 2));
    }

    public static Bitmap getBitmapFromRaw(int i10) {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getResources().openRawResource(i10);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    FileLog.e(th);
                } finally {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        try {
        } catch (IOException unused2) {
            return bitmap;
        }
    }

    public static void getBitmapFromSurface(SurfaceView surfaceView, Bitmap bitmap) {
        if (surfaceView == null || !surfaceView.getHolder().getSurface().isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surfaceView, bitmap, new j(countDownLatch, 0), Utilities.searchQueue.getHandler());
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Bitmap getBitmapFromWindow(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i10) {
                    AndroidUtilities.lambda$getBitmapFromWindow$6(zArr, countDownLatch, i10);
                }
            }, Utilities.searchQueue.getHandler());
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (zArr[0]) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public static Uri getBitmapShareUri(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File cacheDir = getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        File file = new File(cacheDir, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            Context context = ApplicationLoader.applicationContext;
            Uri d = FileProvider.d(context, ApplicationLoader.getApplicationId() + ".provider", file);
            fileOutputStream.close();
            return d;
        } catch (Exception e6) {
            FileLog.e(e6);
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
            if (i12 != 1 && i12 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            int i13 = R.string.TelegramVersion;
            Locale locale = Locale.US;
            return LocaleController.formatString("TelegramVersion", i13, "v" + packageInfo.versionName + " (" + i11 + ") " + str);
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static File getCacheDir() {
        String str;
        String str2 = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e) {
            FileLog.e(e);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            FileLog.d("external dir mounted");
            try {
                File[] externalCacheDirs = ApplicationLoader.applicationContext.getExternalCacheDirs();
                int i10 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    while (true) {
                        if (i10 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i10];
                            if (file2 != null && file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                file = externalCacheDirs[i10];
                                break;
                            }
                            i10++;
                        } else {
                            break;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("check dir ");
                if (file != null) {
                    str2 = file.getPath();
                }
                sb.append(str2);
                sb.append(" ");
                FileLog.d(sb.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    FileLog.d("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        try {
            File cacheDir = ApplicationLoader.applicationContext.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
            if (filesDir != null) {
                File file3 = new File(filesDir, "cache/");
                file3.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file3;
                    }
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
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int red2 = Color.red(i11);
        int i12 = (red + red2) / 2;
        int i13 = red - red2;
        int green2 = green - Color.green(i11);
        int blue2 = blue - Color.blue(i11);
        return (green2 * 4 * green2) + ((((i12 + 512) * i13) * i13) >> 8) + ((((767 - i12) * blue2) * blue2) >> 8);
    }

    public static float[] getCoordinateInParent(ViewGroup viewGroup, View view) {
        float f10;
        float f11 = 0.0f;
        if (view != null && viewGroup != null) {
            f10 = 0.0f;
            float f12 = 0.0f;
            while (view != viewGroup) {
                if (view != null) {
                    float y10 = view.getY() + f10;
                    float x10 = view.getX() + f12;
                    if (view instanceof NestedScrollView) {
                        y10 -= view.getScrollY();
                        x10 -= view.getScrollX();
                    }
                    f12 = x10;
                    f10 = y10;
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            f11 = f12;
            return new float[]{f11, f10};
        }
        f10 = 0.0f;
        return new float[]{f11, f10};
    }

    public static java.lang.String[] getCurrentKeyboardLanguage() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getCurrentKeyboardLanguage():java.lang.String[]");
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Cursor query;
        try {
            query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        } catch (Exception unused) {
        }
        if (query != null && query.moveToFirst()) {
            String string = query.getString(query.getColumnIndexOrThrow("_data"));
            if (!string.startsWith("content://") && (string.startsWith("/") || string.startsWith("file://"))) {
                query.close();
                return string;
            }
            query.close();
            return null;
        }
        if (query != null) {
            query.close();
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

    public static i0.b getDefaultWindowInsets(r0.m1 m1Var, boolean z4) {
        i0.b g10 = m1Var.f43130a.g(647);
        if (z4) {
            return i0.b.a(g10, m1Var.f43130a.f(8));
        }
        return g10;
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
        int i13 = 0;
        for (int i14 = 0; i14 < 10; i14++) {
            for (int i15 = 0; i15 < 10; i15++) {
                int pixel = bitmap.getPixel((int) (i14 * width), (int) (i15 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i11;
                    int green = Color.green(pixel) + i12;
                    i10++;
                    i13 = Color.blue(pixel) + i13;
                    i12 = green;
                    i11 = red;
                }
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Color.argb(255, i11 / i10, i12 / i10, i13 / i10);
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
        } catch (Exception e) {
            FileLog.e(e);
            return new Pair<>(0, 0);
        }
    }

    public static boolean getLightNavigationBar(Window window) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k7.w8.a(window.getDecorView().getSystemUiVisibility(), 16);
        }
        return false;
    }

    public static File getLogsDir() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = ApplicationLoader.applicationContext.getExternalFilesDir(null);
                File file = new File(externalFilesDir.getAbsolutePath() + "/logs");
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
            int min = Math.min(point.x, point.y);
            return min - getTabletLeftFragmentSize(min, 0, 0);
        }
        Point point2 = displaySize;
        int min2 = Math.min(point2.x, point2.y);
        Point point3 = displaySize;
        int max = Math.max(point3.x, point3.y);
        return Math.min(min2, max - getTabletLeftFragmentSize(max, 0, 0));
    }

    public static int getMyLayerVersion(int i10) {
        return i10 & 65535;
    }

    public static float getNavigationBarThirdButtonsFactor(int i10) {
        return Utilities.clamp01((i10 - dp(32.0f)) / dp(16.0f));
    }

    public static int getOffsetColor(int i10, int i11, float f10, float f11) {
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int alpha = Color.alpha(i11);
        int red2 = Color.red(i10);
        int green2 = Color.green(i10);
        int blue2 = Color.blue(i10);
        int alpha2 = Color.alpha(i10);
        return Color.argb((int) e2.c.y(alpha - alpha2, f10, alpha2, f11), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2));
    }

    public static String getPath(Uri uri) {
        Uri uri2;
        String[] split;
        try {
            if (DocumentsContract.isDocumentUri(ApplicationLoader.applicationContext, uri)) {
                if (isExternalStorageDocument(uri)) {
                    if ("primary".equalsIgnoreCase(DocumentsContract.getDocumentId(uri).split(":")[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if (isDownloadsDocument(uri)) {
                    return getDataColumn(ApplicationLoader.applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                } else if (isMediaDocument(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    int hashCode = str.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875 && str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (str.equals("image")) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                        }
                        uri2 = null;
                        return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                    }
                    if (str.equals("audio")) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                    }
                    uri2 = null;
                    return getDataColumn(ApplicationLoader.applicationContext, uri2, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return getDataColumn(ApplicationLoader.applicationContext, uri, null, null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return null;
    }

    public static int getPatternColor(int i10) {
        return getPatternColor(i10, false);
    }

    public static int getPatternSideColor(int i10) {
        float[] RGBtoHSB = RGBtoHSB(Color.red(i10), Color.green(i10), Color.blue(i10));
        RGBtoHSB[1] = Math.min(1.0f, RGBtoHSB[1] + 0.05f);
        float f10 = RGBtoHSB[2];
        if (f10 > 0.5f) {
            RGBtoHSB[2] = Math.max(0.0f, f10 * 0.9f);
        } else {
            RGBtoHSB[2] = Math.max(0.0f, f10 * 0.9f);
        }
        return HSBtoRGB(RGBtoHSB[0], RGBtoHSB[1], RGBtoHSB[2]) | (-16777216);
    }

    public static int getPeerLayerVersion(int i10) {
        return Math.max(73, (i10 >> 16) & 65535);
    }

    public static int getPhotoSize() {
        return getPhotoSize(false);
    }

    public static float getPixelsInCM(float f10, boolean z4) {
        float f11;
        float f12 = f10 / 2.54f;
        if (z4) {
            f11 = displayMetrics.xdpi;
        } else {
            f11 = displayMetrics.ydpi;
        }
        return f12 * f11;
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
        } catch (Exception e) {
            FileLog.e(e);
            return point;
        }
    }

    public static ArrayList<File> getRootDirs() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList<File> arrayList = null;
        File[] externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
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

    public static android.graphics.Bitmap getScaledBitmap(float r7, float r8, java.lang.String r9, java.lang.String r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getScaledBitmap(float, float, java.lang.String, java.lang.String, int):android.graphics.Bitmap");
    }

    public static int getShadowHeight() {
        float f10 = density;
        if (f10 >= 4.0f) {
            return 3;
        }
        if (f10 >= 2.0f) {
            return 2;
        }
        return 1;
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

    public static Long getSysInfoLong(String str) {
        String sysInfoString = getSysInfoString(str);
        if (sysInfoString != null) {
            try {
                return Utilities.parseLong(sysInfoString);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static java.lang.String getSysInfoString(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getSysInfoString(java.lang.String):java.lang.String");
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

    public static int getThumbForNameOrMime(String str, String str2, boolean z4) {
        int i10;
        String substring;
        if (str != null && str.length() != 0) {
            if (!str.contains(".doc") && !str.contains(".txt") && !str.contains(".psd")) {
                if (!str.contains(".xls") && !str.contains(".csv")) {
                    if (!str.contains(".pdf") && !str.contains(".ppt") && !str.contains(".key")) {
                        if (!str.contains(".zip") && !str.contains(".rar") && !str.contains(".ai") && !str.contains(".mp3") && !str.contains(".mov") && !str.contains(".avi")) {
                            i10 = -1;
                        } else {
                            i10 = 3;
                        }
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
            } else {
                i10 = 0;
            }
            if (i10 == -1) {
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    substring = "";
                } else {
                    substring = str.substring(lastIndexOf + 1);
                }
                if (substring.length() != 0) {
                    i10 = substring.charAt(0) % documentIcons.length;
                } else {
                    i10 = str.charAt(0) % documentIcons.length;
                }
            }
            if (z4) {
                return documentMediaIcons[i10];
            }
            return documentIcons[i10];
        } else if (z4) {
            return documentMediaIcons[0];
        } else {
            return documentIcons[0];
        }
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
        Typeface createFromAsset;
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
                            createFromAsset = builder.build();
                        } else {
                            createFromAsset = Typeface.createFromAsset(ApplicationLoader.applicationContext.getAssets(), str);
                        }
                        hashtable.put(str, createFromAsset);
                    } catch (Exception e) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("Could not get typeface '" + str + "' because " + e.getMessage());
                        }
                        return null;
                    }
                }
                typeface = hashtable.get(str);
            } catch (Throwable th2) {
                throw th2;
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
                    if (rootWindowInsets == null) {
                        return 0;
                    }
                    return rootWindowInsets.getStableInsetBottom();
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public static void getViewPositionInParent(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view != null && viewGroup != null) {
            while (view != viewGroup) {
                if (!(view.getParent() instanceof m2.h)) {
                    fArr[0] = view.getX() + fArr[0];
                    fArr[1] = view.getY() + fArr[1];
                }
                view = (View) view.getParent();
            }
        }
    }

    public static String getWallPaperUrl(Object obj) {
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + tL_wallPaper.slug;
            StringBuilder sb = new StringBuilder();
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings != null) {
                if (wallPaperSettings.blur) {
                    sb.append("blur");
                }
                if (tL_wallPaper.settings.motion) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
            }
            if (sb.length() > 0) {
                StringBuilder f10 = vh.v2.f(str, "?mode=");
                f10.append(sb.toString());
                return f10.toString();
            }
            return str;
        } else if (obj instanceof mi1) {
            return ((mi1) obj).b();
        } else {
            return null;
        }
    }

    public static int getWallpaperRotation(int i10, boolean z4) {
        int i11;
        if (z4) {
            i11 = i10 + 180;
        } else {
            i11 = i10 - 180;
        }
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

    public static void googleVoiceClientService_performAction(Intent intent, boolean z4, Bundle bundle) {
        if (!z4) {
            return;
        }
        runOnUIThread(new k(intent, 0));
    }

    public static boolean gzip(File file, File file2) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.close();
                        bufferedInputStream.close();
                        return true;
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException e) {
            FileLog.e(e);
            return false;
        } catch (IOException e6) {
            FileLog.e(e6);
            return false;
        }
    }

    public static boolean handleProxyIntent(android.app.Activity r24, android.content.Intent r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.handleProxyIntent(android.app.Activity, android.content.Intent, boolean):boolean");
    }

    public static boolean hasDialogOnTop(org.telegram.ui.ActionBar.p2 p2Var) {
        List<View> allGlobalViews;
        if (p2Var == null) {
            return false;
        }
        Dialog dialog = p2Var.visibleDialog;
        if (dialog != null && !(dialog instanceof org.telegram.ui.ActionBar.d2) && (!(dialog instanceof org.telegram.ui.ActionBar.g3) || ((org.telegram.ui.ActionBar.g3) dialog).attachedFragment == null)) {
            return true;
        }
        if (p2Var.getParentLayout() != null && (allGlobalViews = allGlobalViews()) != null && !allGlobalViews.isEmpty()) {
            View view = null;
            for (int size = allGlobalViews.size() - 1; size >= 0; size--) {
                view = allGlobalViews.get(size);
                Dialog dialog2 = p2Var.visibleDialog;
                if ((!(dialog2 instanceof org.telegram.ui.ActionBar.d2) || view != getRootView(((org.telegram.ui.ActionBar.d2) dialog2).X0)) && !(view instanceof org.telegram.ui.ActionBar.b2) && !(view instanceof bg0)) {
                    break;
                }
            }
            if (view != getRootView(p2Var.getParentLayout().getView())) {
                return true;
            }
        }
        return false;
    }

    public static void hideKeyboard(View view) {
        if (view != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (!inputMethodManager.isActive()) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static CharSequence highlightText(CharSequence charSequence, ArrayList<String> arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        if (arrayList == null) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            CharSequence highlightText = highlightText(charSequence, arrayList.get(i11), f6Var);
            if (highlightText != null) {
                charSequence = highlightText;
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
        int[] hsvToRgb = hsvToRgb(d, d10, d11);
        return Color.argb(255, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
    }

    public static int[] hsvToRgb(double d, double d10, double d11) {
        double d12;
        double d13 = d * 6.0d;
        double floor = (int) Math.floor(d13);
        double d14 = d13 - floor;
        double d15 = (1.0d - d10) * d11;
        double d16 = (1.0d - (d14 * d10)) * d11;
        double d17 = (1.0d - ((1.0d - d14) * d10)) * d11;
        int i10 = ((int) floor) % 6;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                d11 = 0.0d;
                                d17 = 0.0d;
                                d15 = 0.0d;
                            } else {
                                d17 = d16;
                            }
                        } else {
                            d12 = d17;
                            d17 = d11;
                        }
                    } else {
                        d17 = d11;
                        d11 = d15;
                        d15 = d16;
                    }
                } else {
                    d12 = d15;
                    d15 = d11;
                }
                d11 = d12;
            } else {
                d17 = d15;
                d15 = d11;
                d11 = d16;
            }
        } else {
            d15 = d17;
            d17 = d15;
        }
        return new int[]{(int) (d11 * 255.0d), (int) (d15 * 255.0d), (int) (d17 * 255.0d)};
    }

    public static float ilerp(float f10, float f11, float f12) {
        return (f10 - f11) / (f12 - f11);
    }

    public static int indexOfIgnoreCase(String str, String str2) {
        if (!str2.isEmpty() && !str.isEmpty()) {
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
        return str.indexOf(str2);
    }

    public static boolean intersect1d(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i11) > Math.min(i12, i13) && Math.max(i12, i13) > Math.min(i10, i11);
    }

    public static boolean intersect1dInclusive(int i10, int i11, int i12, int i13) {
        if (Math.max(i10, i11) >= Math.min(i12, i13) && Math.max(i12, i13) >= Math.min(i10, i11)) {
            return true;
        }
        return false;
    }

    public static boolean isAccessibilityScreenReaderEnabled() {
        return isAccessibilityTouchExplorationEnabled();
    }

    public static boolean isAccessibilityTouchExplorationEnabled() {
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
        }
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public static boolean isActivityRunning(Activity activity) {
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public static boolean isAirplaneModeOn() {
        if (Settings.Global.getInt(ApplicationLoader.applicationContext.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    public static boolean isBannedForever(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (tL_chatBannedRights != null && Math.abs(tL_chatBannedRights.until_date - (System.currentTimeMillis() / 1000)) <= 157680000) {
            return false;
        }
        return true;
    }

    public static boolean isContextSafe(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return false;
            }
            return true;
        } else if (!(context instanceof ContextWrapper)) {
            return true;
        } else {
            return isContextSafe(((ContextWrapper) context).getBaseContext());
        }
    }

    public static boolean isDarkColor(int i10) {
        if (computePerceivedBrightness(i10) < 0.721f) {
            return true;
        }
        return false;
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isENOSPC(Exception exc) {
        if (!(exc instanceof IOException) || !(exc.getCause() instanceof ErrnoException) || ((ErrnoException) exc.getCause()).errno != OsConstants.ENOSPC) {
            if (exc.getMessage() != null && exc.getMessage().equalsIgnoreCase("no space left on device")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean isEROFS(Exception exc) {
        if (!(exc instanceof IOException) || !(exc.getCause() instanceof ErrnoException) || ((ErrnoException) exc.getCause()).errno != OsConstants.EROFS) {
            if (exc.getMessage() != null && exc.getMessage().toLowerCase().contains("read-only file system")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isFilNotFoundException(Throwable th2) {
        if (!(th2 instanceof FileNotFoundException) && !(th2 instanceof EOFException)) {
            return false;
        }
        return true;
    }

    public static boolean isFold() {
        if (ApplicationLoader.applicationContext != null && ApplicationLoader.applicationContext.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
            return true;
        }
        return false;
    }

    public static boolean isHonor() {
        boolean z4;
        if (isHonor == null) {
            try {
                String lowerCase = Build.BRAND.toLowerCase();
                if (!lowerCase.contains("huawei") && !lowerCase.contains("honor")) {
                    z4 = false;
                    isHonor = Boolean.valueOf(z4);
                }
                z4 = true;
                isHonor = Boolean.valueOf(z4);
            } catch (Exception e) {
                FileLog.e(e);
                isHonor = Boolean.FALSE;
            }
        }
        return isHonor.booleanValue();
    }

    public static boolean isInAirplaneMode(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    public static boolean isInPictureInPictureMode(Activity activity) {
        if (Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode()) {
            return true;
        }
        return false;
    }

    public static boolean isInternalUri(Uri uri) {
        return isInternalUri(uri, 0);
    }

    public static boolean isKeyguardSecure() {
        return ((KeyguardManager) ApplicationLoader.applicationContext.getSystemService("keyguard")).isKeyguardSecure();
    }

    public static boolean isMapsInstalled(org.telegram.ui.ActionBar.p2 p2Var) {
        String mapsAppPackageName = ApplicationLoader.getMapsProvider().getMapsAppPackageName();
        try {
            ApplicationLoader.applicationContext.getPackageManager().getApplicationInfo(mapsAppPackageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (p2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
            alertDialog$Builder.f19503a.Q = LocaleController.getString(ApplicationLoader.getMapsProvider().getInstallMapsString());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new c(1, mapsAppPackageName, p2Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            p2Var.showDialog(alertDialog$Builder.f19503a);
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

    public static boolean isPunctuationCharacter(char c3) {
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
        return charactersMap.contains(Character.valueOf(c3));
    }

    public static boolean isRTL(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafeToShow(Context context) {
        Activity findActivity = findActivity(context);
        if (findActivity == null) {
            return true;
        }
        return isActivityRunning(findActivity);
    }

    public static boolean isSimAvailable() {
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        if (simState != 1 && simState != 0 && telephonyManager.getPhoneType() != 0 && !isAirplaneModeOn()) {
            return true;
        }
        return false;
    }

    public static boolean isSmallScreen() {
        boolean z4;
        if (isSmallScreen == null) {
            Point point = displaySize;
            if (((Math.max(point.x, point.y) - statusBarHeight) - navigationBarHeight) / density <= 650.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            isSmallScreen = Boolean.valueOf(z4);
        }
        return isSmallScreen.booleanValue();
    }

    public static boolean isSmallTablet() {
        Point point = displaySize;
        if (Math.min(point.x, point.y) / density <= 690.0f) {
            return true;
        }
        return false;
    }

    public static boolean isTablet() {
        if (isTabletInternal() && !SharedConfig.forceDisableTabletMode) {
            return true;
        }
        return false;
    }

    public static boolean isTabletForce() {
        if (ApplicationLoader.applicationContext != null && ApplicationLoader.applicationContext.getResources().getBoolean(R.bool.isTablet)) {
            return true;
        }
        return false;
    }

    public static boolean isTabletInternal() {
        if (isTablet == null) {
            isTablet = Boolean.valueOf(isTabletForce());
        }
        return isTablet.booleanValue();
    }

    public static boolean isValidWallChar(char c3) {
        if (c3 != '-' && c3 != '~') {
            return false;
        }
        return true;
    }

    public static boolean isWaitingForCall() {
        boolean z4;
        synchronized (callLock) {
            z4 = waitingForCall;
        }
        return z4;
    }

    public static boolean isWaitingForSms() {
        boolean z4;
        synchronized (smsLock) {
            z4 = waitingForSms;
        }
        return z4;
    }

    public static boolean isWhitespace(char c3) {
        if (!Character.isWhitespace(c3) && c3 != 10240 && c3 != 12644 && c3 != 65440) {
            return false;
        }
        return true;
    }

    public static boolean isWifiEnabled(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static Boolean lambda$addLinksSafe$8(SpannableStringBuilder spannableStringBuilder, int i10, boolean z4, boolean z10) {
        return Boolean.valueOf(addLinks(spannableStringBuilder, i10, z4, z10));
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
        } catch (Exception e) {
            FileLog.e(e);
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
        boolean z4;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        zArr[0] = z4;
        countDownLatch.countDown();
    }

    public static void lambda$googleVoiceClientService_performAction$2(Intent intent) {
        try {
            int i10 = UserConfig.selectedAccount;
            ApplicationLoader.postInitApplication();
            if (!needShowPasscode() && !SharedConfig.isWaitingForPasscodeEnter) {
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                if (!TextUtils.isEmpty(stringExtra)) {
                    String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                    long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(parseLong));
                    if (user == null && (user = MessagesStorage.getInstance(i10).getUserSync(parseLong)) != null) {
                        MessagesController.getInstance(i10).putUser(user, true);
                    }
                    if (user != null) {
                        ContactsController.getInstance(i10).markAsContacted(stringExtra2);
                        SendMessagesHelper.getInstance(i10).sendMessage(SendMessagesHelper.SendMessageParams.of(stringExtra, user.f19331id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$isMapsInstalled$11(String str, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        try {
            p2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
        } catch (Exception e) {
            FileLog.e(e);
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
        if (i12 > i13 || (i10 = linkSpec.end) < (i11 = linkSpec2.end)) {
            return 1;
        }
        if (i10 > i11) {
            return -1;
        }
        return 0;
    }

    public static void lambda$recycleBitmaps$0(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i10)).get();
            ((WeakReference) arrayList.get(i10)).clear();
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    bitmap.recycle();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static void lambda$recycleBitmaps$1(ArrayList arrayList) {
        Utilities.globalQueue.postRunnable(new e(arrayList, 1));
    }

    public static int lambda$scrollToFragmentRow$24(org.telegram.ui.ActionBar.p2 p2Var, String str, sl0 sl0Var) {
        int i10 = -1;
        try {
            Field declaredField = p2Var.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i10 = declaredField.getInt(p2Var);
            ((f2.i0) sl0Var.getLayoutManager()).h1(i10, dp(60.0f));
            declaredField.setAccessible(false);
            return i10;
        } catch (Throwable unused) {
            return i10;
        }
    }

    public static void lambda$setNavigationBarColor$23(IntColorCallback intColorCallback, Window window, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intColorCallback != null) {
            intColorCallback.run(intValue);
        }
        try {
            window.setNavigationBarColor(intValue);
        } catch (Exception unused) {
        }
    }

    public static void lambda$setWaitingForSms$12(Void r02) {
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sms listener registered");
        }
    }

    public static void lambda$shakeView$13(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
        view.setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * dp(4.0f)));
    }

    public static void lambda$shakeViewSpring$14(Runnable runnable, View view, float f10, o1.h hVar, boolean z4, float f11, float f12) {
        if (runnable != null) {
            runnable.run();
        }
        view.setTranslationX(f10);
        view.setTag(R.id.spring_tag, null);
        view.setTag(R.id.spring_was_translation_x_tag, null);
    }

    public static void lambda$showProxyAlert$17(long j10, org.telegram.ui.Components.sc[] scVarArr) {
        if (j10 == -1) {
            scVarArr[0].setText(LocaleController.getString(R.string.Unavailable));
            scVarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
            return;
        }
        scVarArr[0].setText(LocaleController.formatString(R.string.Ping2, Long.valueOf(j10)));
        scVarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20244w6, false));
    }

    public static void lambda$showProxyAlert$18(org.telegram.ui.Components.sc[] scVarArr, long j10) {
        runOnUIThread(new gg.y1(j10, scVarArr));
    }

    public static void lambda$showProxyAlert$19(boolean[] zArr, org.telegram.ui.Components.sc[] scVarArr, String str, String str2, String str3, String str4, String str5) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.Components.sc scVar = scVarArr[0];
        scVar.setText(LocaleController.getString(R.string.ProxyBottomSheetChecking) + "...");
        scVarArr[0].f24500b.d(false);
        try {
            ConnectionsManager.getInstance(UserConfig.selectedAccount).checkProxy(str, Integer.parseInt(str2), str3, str4, str5, new d(scVarArr, 0));
        } catch (NumberFormatException unused) {
            scVarArr[0].setText(LocaleController.getString(R.string.Unavailable));
            scVarArr[0].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
        }
    }

    public static void lambda$showProxyAlert$20(SharedPreferences sharedPreferences, Runnable runnable, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        sharedPreferences.edit().putBoolean("proxycheckstatusip", true).apply();
        runnable.run();
    }

    public static void lambda$showProxyAlert$21(boolean[] zArr, org.telegram.ui.Components.sc[] scVarArr, String str, String str2, String str3, String str4, String str5, Activity activity) {
        if (zArr[0]) {
            return;
        }
        pl plVar = new pl(zArr, scVarArr, str, str2, str3, str4, str5, 1);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("proxycheckstatusip", false)) {
            plVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ProxyBottomSheetCheckWarning);
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ProxyBottomSheetCheckWarningText);
        alertDialog$Builder.k(LocaleController.getString(R.string.Proceed), new c(0, globalMainSettings, plVar));
        kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void lambda$showProxyAlert$22(String str, String str2, String str3, String str4, String str5, Activity activity, Runnable runnable, View view) {
        SharedConfig.ProxyInfo proxyInfo;
        String str6;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("proxy_enabled", true);
        edit.putString("proxy_ip", str);
        int intValue = Utilities.parseInt((CharSequence) str2).intValue();
        edit.putInt("proxy_port", intValue);
        if (TextUtils.isEmpty(str3)) {
            edit.putInt("proxy_type", 0);
            edit.remove("proxy_secret");
            if (TextUtils.isEmpty(str4)) {
                edit.remove("proxy_pass");
            } else {
                edit.putString("proxy_pass", str4);
            }
            if (TextUtils.isEmpty(str5)) {
                edit.remove("proxy_user");
                str6 = str5;
            } else {
                str6 = str5;
                edit.putString("proxy_user", str6);
            }
            proxyInfo = new SharedConfig.ProxyInfo(str, intValue, str6, str4, "");
        } else {
            edit.putInt("proxy_type", 1);
            edit.remove("proxy_pass");
            edit.remove("proxy_user");
            edit.putString("proxy_secret", str3);
            proxyInfo = new SharedConfig.ProxyInfo(str, intValue, "", "", str3);
        }
        edit.commit();
        SharedConfig.currentProxy = SharedConfig.addProxy(proxyInfo);
        ConnectionsManager.setProxySettings(true, str, intValue, str5, str4, str3);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        if (activity instanceof LaunchActivity) {
            org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
            if (lastFragment instanceof xn) {
                xn xnVar = (xn) lastFragment;
                xnVar.Q7();
                UndoView undoView = xnVar.f40209v3;
                if (undoView != null) {
                    undoView.j(87, 0L, null);
                }
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 6, LocaleController.getString(R.string.ProxyAddedSuccess));
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 6, LocaleController.getString(R.string.ProxyAddedSuccess));
        }
        runnable.run();
    }

    public static boolean lambda$static$7(CharSequence charSequence, int i10, int i11) {
        if (i10 == 0 || charSequence.charAt(i10 - 1) != '@') {
            return true;
        }
        return false;
    }

    public static void lambda$updateImageViewImageAnimated$25(ImageView imageView, AtomicBoolean atomicBoolean, Drawable drawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float abs = Math.abs(floatValue - 0.5f) + 0.5f;
        imageView.setScaleX(abs);
        imageView.setScaleY(abs);
        if (floatValue >= 0.5f && !atomicBoolean.get()) {
            atomicBoolean.set(true);
            imageView.setImageDrawable(drawable);
        }
    }

    public static double lerp(double d, double d10, float f10) {
        return ((d10 - d) * f10) + d;
    }

    public static float lerp3(float f10, float f11, float f12, float f13) {
        if (f13 < 0.0f) {
            return lerp(f11, f10, -f13);
        }
        return lerp(f11, f12, f13);
    }

    public static float lerpAngle(float f10, float f11, float f12) {
        return ((((((((f11 - f10) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f12) + f10) + 360.0f) % 360.0f;
    }

    public static void lerpCentered(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float lerp = lerp(rectF.centerX(), rectF2.centerX(), f10);
        float lerp2 = lerp(rectF.centerY(), rectF2.centerY(), f10);
        float lerp3 = lerp(rectF.width(), rectF2.width(), Math.min(1.0f, f10)) / 2.0f;
        float lerp4 = lerp(rectF.height(), rectF2.height(), Math.min(1.0f, f10)) / 2.0f;
        rectF3.set(lerp - lerp3, lerp2 - lerp4, lerp + lerp3, lerp2 + lerp4);
    }

    public static int lerpColor(int i10, int i11, float f10) {
        return Color.argb(lerp(Color.alpha(i10), Color.alpha(i11), f10), lerp(Color.red(i10), Color.red(i11), f10), lerp(Color.green(i10), Color.green(i11), f10), lerp(Color.blue(i10), Color.blue(i11), f10));
    }

    public static int lerpColor3(int i10, int i11, int i12, float f10) {
        if (f10 < 0.0f) {
            return lerpColor(i11, i10, -f10);
        }
        return lerpColor(i11, i12, f10);
    }

    public static ArrayList<TLRPC.User> loadVCardFromStream(Uri uri, int i10, boolean z4, ArrayList<VcardItem> arrayList, String str) {
        InputStream createInputStream;
        InputStream inputStream;
        String[] strArr;
        byte[] decodeQuotedPrintable;
        VcardItem vcardItem;
        ArrayList<VcardItem> arrayList2 = arrayList;
        ArrayList<TLRPC.User> arrayList3 = null;
        AnonymousClass1 anonymousClass1 = 0;
        if (z4) {
            try {
                createInputStream = ApplicationLoader.applicationContext.getContentResolver().openAssetFileDescriptor(uri, "r").createInputStream();
            } catch (Throwable th2) {
                th = th2;
                FileLog.e(th);
                return arrayList3;
            }
        } else {
            try {
                createInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
            } catch (Throwable th3) {
                th = th3;
                arrayList3 = null;
                FileLog.e(th);
                return arrayList3;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(createInputStream, "UTF-8"));
        int i11 = 0;
        VcardData vcardData = null;
        String str2 = null;
        VcardItem vcardItem2 = null;
        boolean z10 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            } else if (readLine.startsWith("PHOTO")) {
                z10 = true;
            } else {
                if (readLine.indexOf(58) >= 0) {
                    if (readLine.startsWith("BEGIN:VCARD")) {
                        vcardData = new VcardData();
                        arrayList4.add(vcardData);
                        vcardData.name = str;
                    } else if (!readLine.startsWith("END:VCARD") && arrayList2 != null) {
                        if (readLine.startsWith("TEL")) {
                            vcardItem = new VcardItem();
                            vcardItem.type = i11;
                        } else if (readLine.startsWith("EMAIL")) {
                            vcardItem = new VcardItem();
                            vcardItem.type = 1;
                        } else {
                            if (!readLine.startsWith("ADR") && !readLine.startsWith("LABEL") && !readLine.startsWith("GEO")) {
                                if (readLine.startsWith("URL")) {
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 3;
                                } else if (readLine.startsWith("NOTE")) {
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 4;
                                } else if (readLine.startsWith("BDAY")) {
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 5;
                                } else {
                                    if (!readLine.startsWith("ORG") && !readLine.startsWith("TITLE") && !readLine.startsWith("ROLE")) {
                                        if (readLine.startsWith("X-ANDROID")) {
                                            vcardItem = new VcardItem();
                                            vcardItem.type = -1;
                                        } else if (readLine.startsWith("X-PHONETIC") || !readLine.startsWith("X-")) {
                                            vcardItem = anonymousClass1;
                                        } else {
                                            vcardItem = new VcardItem();
                                            vcardItem.type = 20;
                                        }
                                    }
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 6;
                                }
                            }
                            vcardItem = new VcardItem();
                            vcardItem.type = 2;
                        }
                        if (vcardItem != null && vcardItem.type >= 0) {
                            arrayList2.add(vcardItem);
                        }
                        vcardItem2 = vcardItem;
                        z10 = false;
                    }
                    vcardItem2 = anonymousClass1;
                    z10 = false;
                }
                if (!z10 && vcardData != null) {
                    if (vcardItem2 == null) {
                        if (vcardData.vcard.length() > 0) {
                            vcardData.vcard.append('\n');
                        }
                        vcardData.vcard.append(readLine);
                    } else {
                        vcardItem2.vcardData.add(readLine);
                    }
                }
                if (str2 != null) {
                    readLine = str2 + readLine;
                    str2 = null;
                }
                if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                    str2 = readLine.substring(i11, readLine.length() - 1);
                    anonymousClass1 = 0;
                } else {
                    if (!z10 && vcardData != null && vcardItem2 != null) {
                        vcardItem2.fullData = readLine;
                    }
                    int indexOf = readLine.indexOf(":");
                    if (indexOf >= 0) {
                        inputStream = createInputStream;
                        strArr = new String[]{readLine.substring(i11, indexOf), readLine.substring(indexOf + 1).trim()};
                    } else {
                        inputStream = createInputStream;
                        strArr = new String[]{readLine.trim()};
                    }
                    if (strArr.length >= 2 && vcardData != null) {
                        if (!strArr[i11].startsWith("FN") && !strArr[i11].startsWith("N") && (!strArr[i11].startsWith("ORG") || !TextUtils.isEmpty(vcardData.name))) {
                            if (strArr[i11].startsWith("TEL")) {
                                vcardData.phones.add(strArr[1]);
                            }
                        }
                        String[] split = strArr[i11].split(";");
                        int length = split.length;
                        String[] strArr2 = strArr;
                        String str3 = null;
                        String str4 = null;
                        int i12 = 0;
                        while (i12 < length) {
                            String[] split2 = split[i12].split("=");
                            String[] strArr3 = split;
                            if (split2.length == 2) {
                                if (split2[0].equals("CHARSET")) {
                                    str3 = split2[1];
                                } else if (split2[0].equals("ENCODING")) {
                                    str4 = split2[1];
                                }
                            }
                            i12++;
                            split = strArr3;
                        }
                        if (strArr2[0].startsWith("N")) {
                            vcardData.name = strArr2[1].replace(';', ' ').trim();
                        } else {
                            vcardData.name = strArr2[1];
                        }
                        if (str4 != null && str4.equalsIgnoreCase("QUOTED-PRINTABLE") && (decodeQuotedPrintable = decodeQuotedPrintable(getStringBytes(vcardData.name))) != null && decodeQuotedPrintable.length != 0) {
                            vcardData.name = new String(decodeQuotedPrintable, str3);
                        }
                        arrayList2 = arrayList;
                        createInputStream = inputStream;
                        anonymousClass1 = 0;
                        i11 = 0;
                    }
                    arrayList2 = arrayList;
                    createInputStream = inputStream;
                    anonymousClass1 = 0;
                    i11 = 0;
                }
            }
        }
        InputStream inputStream2 = createInputStream;
        try {
            bufferedReader.close();
            inputStream2.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        arrayList3 = null;
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            VcardData vcardData2 = (VcardData) arrayList4.get(i13);
            if (vcardData2.name != null && !vcardData2.phones.isEmpty()) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                String str5 = vcardData2.phones.get(0);
                int i14 = 0;
                while (true) {
                    if (i14 >= vcardData2.phones.size()) {
                        break;
                    }
                    String str6 = vcardData2.phones.get(i14);
                    if (ContactsController.getInstance(i10).contactsByShortPhone.get(str6.substring(Math.max(0, str6.length() - 7))) != null) {
                        str5 = str6;
                        break;
                    }
                    i14++;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                tL_userContact_old2.phone = str5;
                tL_userContact_old2.first_name = vcardData2.name;
                tL_userContact_old2.last_name = "";
                tL_userContact_old2.f19331id = 0L;
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
                } else {
                    activity.setRequestedOrientation(8);
                }
            } else if (rotation == 1) {
                if (i10 == 1) {
                    activity.setRequestedOrientation(9);
                } else {
                    activity.setRequestedOrientation(0);
                }
            } else if (rotation == 0) {
                if (i10 == 2) {
                    activity.setRequestedOrientation(0);
                } else {
                    activity.setRequestedOrientation(1);
                }
            } else if (i10 == 2) {
                activity.setRequestedOrientation(8);
            } else {
                activity.setRequestedOrientation(9);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void logFlagSecure() {
        FileLog.d("[FLAG_SECURE]");
        printStackTrace("FLAG_SECURE");
    }

    public static void makeAccessibilityAnnouncement(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            AccessibilityManager accessibilityManager2 = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
            if (accessibilityManager2.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(charSequence);
                accessibilityManager2.sendAccessibilityEvent(obtain);
            }
        }
    }

    public static Bitmap makeBlurBitmap(View view) {
        return makeBlurBitmap(view, 6.0f, 7);
    }

    public static SpannableStringBuilder makeClickable(CharSequence charSequence, final int i10, final Runnable runnable, final org.telegram.ui.ActionBar.f6 f6Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (i10 != 0 && i10 != 3 && i10 != 2 && i10 != 4) {
            spannableStringBuilder.setSpan(new CharacterStyle() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setTypeface(AndroidUtilities.bold());
                    int alpha = textPaint.getAlpha();
                    textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var));
                    textPaint.setAlpha(alpha);
                }
            }, 0, spannableStringBuilder.length(), 0);
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
                boolean z4;
                super.updateDrawState(textPaint);
                if (i10 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                textPaint.setUnderlineText(z4);
                if (i10 == 2) {
                    textPaint.setTypeface(AndroidUtilities.bold());
                }
            }
        }, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void makeGlobalBlurBitmap(Utilities.Callback<Bitmap> callback, float f10) {
        makeGlobalBlurBitmap(callback, f10, (int) f10, null, null);
    }

    private static String makeUrl(String str, String[] strArr, Matcher matcher) {
        boolean z4;
        int i10 = 0;
        while (true) {
            if (i10 < strArr.length) {
                String str2 = strArr[i10];
                String str3 = str;
                if (str3.regionMatches(true, 0, str2, 0, str2.length())) {
                    String str4 = strArr[i10];
                    boolean regionMatches = str3.regionMatches(false, 0, str4, 0, str4.length());
                    z4 = true;
                    if (!regionMatches) {
                        str = strArr[i10] + str3.substring(strArr[i10].length());
                    } else {
                        str = str3;
                    }
                } else {
                    i10++;
                    str = str3;
                }
            } else {
                z4 = false;
                break;
            }
        }
        if (!z4 && strArr.length > 0) {
            return android.support.v4.media.a.r(new StringBuilder(), strArr[0], str);
        }
        return str;
    }

    public static int multiplyAlphaComponent(int i10, float f10) {
        return i0.a.k(i10, (int) (Color.alpha(i10) * f10));
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

    public static void normalizeTimePart(StringBuilder sb, int i10) {
        if (i10 < 10) {
            sb.append("0");
            sb.append(i10);
            return;
        }
        sb.append(i10);
    }

    public static void notifyDataSetChanged(RecyclerView recyclerView) {
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        if (recyclerView.b0()) {
            recyclerView.post(new e1(recyclerView, 12));
        } else {
            recyclerView.getAdapter().l();
        }
    }

    public static String obtainLoginPhoneCall(String str) {
        String str2;
        if (!hasCallPermissions) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            str2 = "date DESC";
        } else {
            str2 = "date DESC LIMIT 5";
        }
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, str2);
            while (query.moveToNext()) {
                String string = query.getString(0);
                long j10 = query.getLong(1);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("number = " + string);
                }
                if (Math.abs(System.currentTimeMillis() - j10) < 3600000 && checkPhonePattern(str, string)) {
                    query.close();
                    return string;
                }
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return null;
    }

    public static void openDocument(org.telegram.messenger.MessageObject r13, android.app.Activity r14, org.telegram.ui.ActionBar.p2 r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.openDocument(org.telegram.messenger.MessageObject, android.app.Activity, org.telegram.ui.ActionBar.p2):void");
    }

    public static boolean openForView(java.io.File r6, java.lang.String r7, java.lang.String r8, android.app.Activity r9, org.telegram.ui.ActionBar.f6 r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.openForView(java.io.File, java.lang.String, java.lang.String, android.app.Activity, org.telegram.ui.ActionBar.f6, boolean):boolean");
    }

    public static void openSharing(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        if (p2Var != null && p2Var.getParentActivity() != null) {
            p2Var.showDialog(new lq0(p2Var.getParentActivity(), null, str, false, str, false, null));
        }
    }

    public static long pack(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
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
        while (true) {
            if (view == null) {
                break;
            }
            ViewParent parent = view.getParent();
            StringBuilder m9 = kh.a2.m(i10, "LayoutCheck level=", ", view=");
            m9.append(view.getClass().getSimpleName());
            m9.append("@");
            m9.append(Integer.toHexString(System.identityHashCode(view)));
            m9.append(", isLayoutRequested=");
            m9.append(view.isLayoutRequested());
            FileLog.d(m9.toString());
            if (!(parent instanceof View)) {
                if (parent != null) {
                    StringBuilder sb = new StringBuilder("LayoutCheck level=");
                    sb.append(i10 + 1);
                    sb.append(", parent=");
                    sb.append(parent.getClass().getSimpleName());
                    org.telegram.ui.yh.w(" (not a View)", sb);
                }
            } else {
                view = (View) parent;
                i10++;
            }
        }
        FileLog.d("LayoutCheck");
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> arrayList) {
        int i10;
        int i11;
        int i12 = 0;
        Collections.sort(arrayList, new s(0));
        int size = arrayList.size();
        while (i12 < size - 1) {
            LinkSpec linkSpec = arrayList.get(i12);
            int i13 = i12 + 1;
            LinkSpec linkSpec2 = arrayList.get(i13);
            int i14 = linkSpec.start;
            int i15 = linkSpec2.start;
            if (i14 <= i15 && (i10 = linkSpec.end) > i15) {
                int i16 = linkSpec2.end;
                if (i16 <= i10 || i10 - i14 > i16 - i15) {
                    i11 = i13;
                } else if (i10 - i14 < i16 - i15) {
                    i11 = i12;
                } else {
                    i11 = -1;
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
        if (Build.VERSION.SDK_INT > 23 && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Bitmap bitmap = list.get(i10);
                if (bitmap != null && !bitmap.isRecycled()) {
                    arrayList.add(new WeakReference(bitmap));
                }
            }
            runOnUIThread(new e(arrayList, 0), 36L);
        }
    }

    public static void removeAdjustResize(Activity activity, int i10) {
        if (activity != null && !isTablet() && adjustOwnerClassGuid == i10) {
            activity.getWindow().setSoftInputMode(32);
        }
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
        if (pattern == null || (matcher = pattern.matcher(str)) == null) {
            return str;
        }
        return matcher.replaceAll("$1");
    }

    public static void removeFromParent(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static String removeRTL(String str) {
        if (str == null) {
            return null;
        }
        if (REMOVE_RTL == null) {
            REMOVE_RTL = Pattern.compile("[\\u200E\\u200F\\u202A-\\u202E]");
        }
        Matcher matcher = REMOVE_RTL.matcher(str);
        if (matcher == null) {
            return str;
        }
        return matcher.replaceAll("");
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

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z4) {
        return replaceArrows(charSequence, z4, dp(2.6666667f), 0.0f, 1.0f);
    }

    public static SpannableStringBuilder replaceCharSequence(String str, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceLinks(String str, org.telegram.ui.ActionBar.f6 f6Var) {
        return replaceLinks(str, f6Var, null);
    }

    public static CharSequence replaceMultipleCharSequence(String str, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        int indexOf = TextUtils.indexOf(charSequence, str, 0);
        while (indexOf >= 0) {
            spannableStringBuilder.replace(indexOf, str.length() + indexOf, charSequence2);
            indexOf = TextUtils.indexOf(spannableStringBuilder, str, indexOf + 1);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceMultipleTags(String str, Runnable... runnableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (final Runnable runnable : runnableArr) {
            int charSequenceIndexOf = charSequenceIndexOf(spannableStringBuilder, "**");
            int i10 = charSequenceIndexOf + 2;
            int charSequenceIndexOf2 = charSequenceIndexOf(spannableStringBuilder, "**", i10);
            if (charSequenceIndexOf < 0 || charSequenceIndexOf2 < 0) {
                break;
            }
            spannableStringBuilder.delete(charSequenceIndexOf, i10);
            int i11 = charSequenceIndexOf2 - 2;
            spannableStringBuilder.delete(i11, charSequenceIndexOf2);
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
            }, charSequenceIndexOf, i11, 33);
        }
        return spannableStringBuilder;
    }

    public static CharSequence replaceNewLines(CharSequence charSequence) {
        int i10 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            int length = sb.length();
            while (i10 < length) {
                if (sb.charAt(i10) == '\n') {
                    sb.setCharAt(i10, ' ');
                }
                i10++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i10 < length2) {
                if (charSequence.charAt(i10) == '\n') {
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) " ");
                }
                i10++;
            }
            return spannableStringBuilder;
        } else if (charSequence instanceof SpannableString) {
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
        } else if (charSequence == null) {
            return null;
        } else {
            return charSequence.toString().replace('\n', ' ');
        }
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
            StringBuilder sb = (StringBuilder) charSequence;
            int length = sb.length();
            int i10 = 0;
            while (i10 < length - 2) {
                int i11 = i10 + 2;
                sb.getChars(i10, i11, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb = sb.replace(i10, i11, "\n");
                    i10--;
                    length--;
                }
                i10++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i12 = 0;
            while (i12 < length2 - 2) {
                int i13 = i12 + 2;
                spannableStringBuilder.getChars(i12, i13, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder = spannableStringBuilder.replace(i12, i13, (CharSequence) "\n");
                    i12--;
                    length2--;
                }
                i12++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableString) {
            if (TextUtils.indexOf(charSequence, "\n\n") < 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            int length3 = charSequence.length();
            int i14 = 0;
            while (i14 < length3 - 2) {
                int i15 = i14 + 2;
                spannableStringBuilder2.getChars(i14, i15, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder2 = spannableStringBuilder2.replace(i14, i15, (CharSequence) "\n");
                    i14--;
                    length3--;
                }
                i14++;
            }
            return spannableStringBuilder2;
        } else {
            return charSequence.toString().replace("\n\n", "\n");
        }
    }

    public static void requestAdjustNothing(Activity activity, int i10) {
        if (activity != null && !isTablet()) {
            activity.getWindow().setSoftInputMode(48);
            adjustOwnerClassGuid = i10;
        }
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
        if (fArr != null) {
            if (iArr == null) {
                iArr = new int[fArr.length];
            }
            if (fArr.length == iArr.length) {
                float f10 = 0.0f;
                for (float f11 : fArr) {
                    f10 += f11;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < fArr.length; i11++) {
                    int floor = (int) Math.floor((fArr[i11] / f10) * 100.0f);
                    iArr[i11] = floor;
                    i10 += floor;
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
            throw new IndexOutOfBoundsException("percents.length != output.length");
        }
        throw new NullPointerException("percents or output is null");
    }

    public static int roundPlayingMessageSize(boolean z4) {
        if (z4) {
            return roundSidePlayingMessageSize;
        }
        return roundPlayingMessageSize;
    }

    public static void runOnUIThread(Runnable runnable) {
        runOnUIThread(runnable, 0L);
    }

    public static void scaleRect(RectF rectF, float f10) {
        scaleRect(rectF, f10, rectF.centerX(), rectF.centerY());
    }

    public static void scrollToFragmentRow(org.telegram.ui.ActionBar.e5 e5Var, String str) {
        if (e5Var != null && str != null) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) e5Var.getFragmentStack().get(e5Var.getFragmentStack().size() - 1);
            try {
                Field declaredField = p2Var.getClass().getDeclaredField("listView");
                declaredField.setAccessible(true);
                sl0 sl0Var = (sl0) declaredField.get(p2Var);
                sl0Var.e1(new f(p2Var, str, sl0Var), 700, true);
                declaredField.setAccessible(false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void setAdjustResizeToNothing(Activity activity, int i10) {
        if (activity != null && !isTablet()) {
            int i11 = adjustOwnerClassGuid;
            if (i11 == 0 || i11 == i10) {
                activity.getWindow().setSoftInputMode(48);
            }
        }
    }

    public static void setEnabled(View view, boolean z4) {
        if (view != null) {
            view.setEnabled(z4);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    setEnabled(viewGroup.getChildAt(i10), z4);
                }
            }
        }
    }

    public static void setLightNavigationBar(Dialog dialog, boolean z4) {
        if (dialog != null) {
            setLightNavigationBar(dialog.getWindow(), z4);
        }
    }

    public static void setLightStatusBar(Activity activity, boolean z4) {
        if (activity != null) {
            setLightStatusBar(activity.getWindow(), z4);
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
        if (activity != null && !activity.isDestroyed()) {
            if (pictureInPictureParams == null) {
                resetPictureInPictureParams(activity);
                return;
            }
            try {
                activity.setPictureInPictureParams(pictureInPictureParams);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
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

    public static void setRectToRect(Matrix matrix, RectF rectF, RectF rectF2, int i10, int i11, boolean z4) {
        float height;
        float width;
        float height2;
        boolean z10;
        float f10;
        float f11;
        float height3;
        float height4;
        if (i10 != 90 && i10 != 270) {
            height = rectF2.width() / rectF.width();
            width = rectF2.height();
            height2 = rectF.height();
        } else {
            height = rectF2.height() / rectF.width();
            width = rectF2.width();
            height2 = rectF.height();
        }
        float f12 = width / height2;
        if (height < f12) {
            height = f12;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4) {
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
        if (z4) {
            f10 = (-rectF.left) * height;
            f11 = (-rectF.top) * height;
        } else {
            f10 = rectF2.left - (rectF.left * height);
            f11 = rectF2.top - (rectF.top * height);
        }
        if (z10) {
            height3 = rectF2.width();
            height4 = rectF.width();
        } else {
            height3 = rectF2.height();
            height4 = rectF.height();
        }
        float f13 = (height3 - (height4 * height)) / 2.0f;
        if (z10) {
            f10 += f13;
        } else {
            f11 += f13;
        }
        matrix.preScale(height, height);
        if (z4) {
            matrix.preTranslate(f10, f11);
        }
    }

    public static void setScrollViewEdgeEffectColor(HorizontalScrollView horizontalScrollView, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
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
                    return;
                }
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        horizontalScrollView.setEdgeEffectColor(i10);
    }

    public static void setViewLayoutMargins(View view, int i10, int i11, int i12, int i13) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin != i10 || marginLayoutParams.topMargin != i11 || marginLayoutParams.rightMargin != i12 || marginLayoutParams.bottomMargin != i13) {
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    marginLayoutParams.bottomMargin = i13;
                    view.requestLayout();
                }
            }
        }
    }

    public static void setViewPagerEdgeEffectColor(m2.h hVar, int i10) {
        try {
            Field declaredField = m2.h.class.getDeclaredField("c0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(hVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = m2.h.class.getDeclaredField("d0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(hVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception unused) {
        }
    }

    public static void setWaitingForCall(boolean z4) {
        synchronized (callLock) {
            try {
                try {
                    if (z4) {
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
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused) {
            }
            waitingForCall = z4;
        }
    }

    public static void setWaitingForSms(boolean z4) {
        synchronized (smsLock) {
            try {
                waitingForSms = z4;
                if (z4) {
                    ?? jVar = new com.google.android.gms.common.api.j(ApplicationLoader.applicationContext, m5.a.f13754k, com.google.android.gms.common.api.b.f2721i, com.google.android.gms.common.api.i.f2730c);
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f2885c = new ab.a((x6.a) jVar);
                    e.d = new y5.c[]{x6.b.f46827a};
                    e.f2883a = 1567;
                    jVar.e(1, e.e()).addOnSuccessListener(new b(2));
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new o(view, 0));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(0.0f);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(R.id.shake_animation, ofFloat);
    }

    public static void shakeViewSpring(View view) {
        shakeViewSpring(view, 10.0f, null);
    }

    public static boolean shouldEnableAnimation() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || i10 >= 28 || (!((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).isPowerSaveMode() && getAnimatorDurationScale() > 0.0f)) {
            return true;
        }
        return false;
    }

    public static boolean shouldShowClipboardToast() {
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 < 31 || !OneUIUtilities.hasBuiltInClipboardToasts()) && i10 < 32) {
            return true;
        }
        return false;
    }

    public static boolean shouldShowUrlInAlert(String str) {
        try {
            return checkHostForPunycode(Uri.parse(str).getHost());
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean showKeyboard(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static void showProxyAlert(final Activity activity, final String str, final String str2, final String str3, final String str4, final String str5) {
        final Runnable runnable;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z4;
        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(activity, null, false, false);
        g3Var.fixNavigationBar();
        g3Var.applyTopPadding = false;
        g3Var.applyBottomPadding = false;
        runnable = g3Var.dismissRunnable;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        g3Var.customView = linearLayout;
        TextView b10 = k7.f6.b(activity, 20.0f, org.telegram.ui.ActionBar.j6.f20012j5, true, null);
        b10.setText(LocaleController.getString(R.string.UseProxyTitle));
        linearLayout.addView(b10, k7.b6.t(-1, -2, 55, 22, 18, 22, 0));
        sz0 sz0Var = new sz0(activity, null);
        linearLayout.addView(sz0Var, k7.b6.t(-1, -2, 55, 14, 18, 14, 0));
        if (!TextUtils.isEmpty(str)) {
            str6 = str;
            sz0Var.c(LocaleController.getString(R.string.UseProxyAddress), str6, null, null);
        } else {
            str6 = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            sz0Var.c(LocaleController.getString(R.string.UseProxyPort), str2, null, null);
        }
        if (!TextUtils.isEmpty(str5)) {
            str7 = str5;
            sz0Var.c(LocaleController.getString(R.string.UseProxySecret), str7, null, null);
        } else {
            str7 = str5;
        }
        if (!TextUtils.isEmpty(str3)) {
            str8 = str3;
            sz0Var.c(LocaleController.getString(R.string.UseProxyUsername), str8, null, null);
        } else {
            str8 = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            str9 = str4;
            sz0Var.c(LocaleController.getString(R.string.UseProxyPassword), str9, null, null);
        } else {
            str9 = str4;
        }
        org.telegram.ui.Components.sc[] scVarArr = new org.telegram.ui.Components.sc[1];
        sz0Var.c(LocaleController.getString(R.string.ProxyStatus), "", null, scVarArr);
        ((View) scVarArr[0].getParent()).setPadding(0, 0, 0, 0);
        scVarArr[0].setDisablePaddingsOffsetY(true);
        scVarArr[0].setPadding(dp(12.66f), dp(9.33f), dp(12.66f), dp(9.33f));
        scVarArr[0].setText(replaceSingleLink(LocaleController.getString(R.string.ProxyBottomSheetCheckStatus), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19966gc, false), new gg.k0(new boolean[1], scVarArr, str6, str2, str8, str9, str7, activity, 4)));
        if (!TextUtils.isEmpty(str5)) {
            qz0 a2 = sz0Var.a(LocaleController.getString(R.string.UseProxyTelegramInfo2));
            z4 = true;
            a2.setFilled(true);
            ih.s sVar = (ih.s) a2.getChildAt(0);
            sVar.setTextSize(1, 11.0f);
            sVar.setGravity(17);
        } else {
            z4 = true;
        }
        ph.d dVar = new ph.d(activity, null, z4);
        dVar.setRoundRadius(24);
        dVar.setText(LocaleController.getString(R.string.ConnectingConnectProxy));
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AndroidUtilities.lambda$showProxyAlert$22(str, str2, str5, str4, str3, activity, runnable, view);
            }
        });
        linearLayout.addView(dVar, k7.b6.t(-1, 48, 55, 14, 18, 14, 14));
        g3Var.show();
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
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        snapshotTextureViews(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
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
        if (i10 <= 0 && length >= charSequence.length()) {
            return charSequence;
        }
        return charSequence.subSequence(i10, length);
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
        if (translitString == null) {
            return "";
        }
        return translitString;
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
        if (i10 <= 0 && length >= charSequence.length()) {
            return charSequence;
        }
        return charSequence.subSequence(i10, length);
    }

    public static void unlockOrientation(Activity activity) {
        if (activity != null) {
            try {
                int i10 = prevOrientation;
                if (i10 != -10) {
                    activity.setRequestedOrientation(i10);
                    prevOrientation = -10;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
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
        if (windowManager != null && view != null && view.getParent() != null) {
            windowManager.updateViewLayout(view, layoutParams);
        }
    }

    public static void updateViewShow(View view, boolean z4) {
        updateViewShow(view, z4, true, true);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z4) {
        updateViewVisibilityAnimated(view, z4, 1.0f, true, true);
    }

    public static void updateVisibleRow(sl0 sl0Var, int i10) {
        f2.o0 adapter;
        f2.l1 T;
        if (sl0Var != null && (adapter = sl0Var.getAdapter()) != null) {
            for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                View childAt = sl0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && (T = sl0Var.T(childAt)) != null && !T.r() && T.b() == i10) {
                    adapter.v(T, R);
                }
            }
        }
    }

    public static void updateVisibleRows(sl0 sl0Var) {
        f2.o0 adapter;
        f2.l1 T;
        if (sl0Var != null && (adapter = sl0Var.getAdapter()) != null) {
            for (int i10 = 0; i10 < sl0Var.getChildCount(); i10++) {
                View childAt = sl0Var.getChildAt(i10);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && (T = sl0Var.T(childAt)) != null && !T.r()) {
                    adapter.v(T, R);
                }
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
    public static boolean addLinks(Spannable spannable, int i10, boolean z4) {
        return addLinks(spannable, i10, z4, true);
    }

    public static void applySpring(Animator animator, double d, double d10, double d11) {
        applySpring(animator, d, d10, d11, 0.0d);
    }

    public static int compare(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        return i10 > 0 ? 1 : -1;
    }

    public static boolean copyFile(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                Thread.yield();
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.close();
                return true;
            }
        }
    }

    public static boolean doSafe(final Utilities.Callback0Return<Boolean> callback0Return, int i10) {
        Future future;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            try {
                try {
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
                try {
                    return ((Boolean) newSingleThreadExecutor.submit(new Callable() {
                        @Override
                        public final Object call() {
                            Boolean lambda$doSafe$9;
                            lambda$doSafe$9 = AndroidUtilities.lambda$doSafe$9(Utilities.Callback0Return.this);
                            return lambda$doSafe$9;
                        }
                    }).get(i10, TimeUnit.MILLISECONDS)).booleanValue();
                } catch (TimeoutException unused) {
                    if (0 != 0) {
                        future.cancel(true);
                    }
                    return false;
                }
            } finally {
                newSingleThreadExecutor.shutdownNow();
            }
        } catch (TimeoutException unused2) {
            future = null;
        }
    }

    public static void drawNavigationBarProtection(Canvas canvas, View view, int i10, int i11, float f10) {
        Paint paint = navbarProtactionPaint;
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(getNavigationBarThirdButtonsFactor(0.0f, 0.75f, i11) * f10, i10));
        canvas.drawRect(0.0f, (view.getY() + view.getMeasuredHeight()) - i11, view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight(), paint);
    }

    public static void drawStroke(Canvas canvas, RectF rectF, float f10, float f11) {
        if (f11 <= 0.0f) {
            return;
        }
        float min = Math.min(f10, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float dpf2 = dpf2(1.0f);
        float f12 = dpf2 / 2.0f;
        float max = Math.max(0.0f, min - dpf2);
        Paint paint = strokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(dpf2);
        paint.setColor(org.telegram.ui.ActionBar.j6.l1(f11, 570425343));
        canvas.save();
        float f13 = rectF.top;
        if (canvas.clipRect(rectF.left - f12, f13, rectF.right + f12, k7.n.a(f13 + max, f13, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f12, rectF.right, f12 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float dpf22 = dpf2(0.6666667f);
        float f14 = dpf22 / 2.0f;
        float max2 = Math.max(0.0f, min - dpf22);
        Paint paint2 = strokeBottom;
        paint2.setStyle(style);
        paint2.setStrokeWidth(dpf22);
        paint2.setColor(org.telegram.ui.ActionBar.j6.l1(f11, 385875967));
        canvas.save();
        float f15 = rectF.bottom;
        if (canvas.clipRect(rectF.left - f14, k7.n.a(f15 - max2, rectF.top, f15), rectF.right + f14, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f14, rectF.right, rectF.bottom - f14, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static boolean findClickableView(ViewGroup viewGroup, float f10, float f11, View view) {
        int i10;
        Rect rect;
        if (viewGroup == null) {
            return false;
        }
        int i11 = 0;
        while (i11 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof nh.d4) || childAt == view)) {
                if (childAt instanceof nh.k8) {
                    nh.m8 m8Var = (nh.m8) viewGroup;
                    if (m8Var.f15639b == null || (f10 >= dp(60.0f) && f10 <= viewGroup.getWidth() - dp(60.0f))) {
                        int i12 = 0;
                        while (i12 < m8Var.getChildCount()) {
                            View childAt2 = m8Var.getChildAt(i12);
                            if (childAt2 instanceof nh.p8) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d = f10 - translationX;
                                i10 = i11;
                                double d10 = f11 - translationY;
                                float cos = (float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10));
                                float a2 = (float) kh.a2.a(radians, d10, Math.sin(radians) * d);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && a2 >= (-measuredHeight) / 2.0f && a2 <= measuredHeight / 2.0f) {
                                    rect = rectTmp2;
                                    childAt.getHitRect(rect);
                                    if (!rect.contains((int) f10, (int) f11) && childAt.isClickable()) {
                                        return true;
                                    }
                                    if ((childAt instanceof ViewGroup) && findClickableView((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), view)) {
                                        return true;
                                    }
                                    i11 = i10 + 1;
                                }
                            } else {
                                i10 = i11;
                            }
                            i12++;
                            i11 = i10;
                        }
                    }
                }
                i10 = i11;
                rect = rectTmp2;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i11 = i10 + 1;
            }
            i10 = i11;
            i11 = i10 + 1;
        }
        return false;
    }

    public static String formatDuration(int i10, boolean z4, boolean z10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        return i11 == 0 ? z4 ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i12), Integer.valueOf(i13)) : z10 ? String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12)) : String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String formatFileSize(long j10, boolean z4, boolean z10) {
        if (j10 == 0) {
            return String.format("%d KB", 0);
        }
        if (j10 < 1024) {
            return String.format("%d B", Long.valueOf(j10));
        }
        if (j10 < 1048576) {
            float f10 = ((float) j10) / 1024.0f;
            if (z4) {
                int i10 = (int) f10;
                if ((f10 - i10) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f10));
        } else if (j10 < 1048576000) {
            float f11 = (((float) j10) / 1024.0f) / 1024.0f;
            if (z4) {
                int i11 = (int) f11;
                if ((f11 - i11) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i11));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f11));
        } else {
            float f12 = ((int) ((j10 / 1024) / 1024)) / 1000.0f;
            if (z4) {
                int i12 = (int) f12;
                if ((f12 - i12) * 10.0f == 0.0f) {
                    return String.format("%d GB", Integer.valueOf(i12));
                }
            }
            return z10 ? String.format("%.1f GB", Float.valueOf(f12)) : String.format("%.2f GB", Float.valueOf(f12));
        }
    }

    public static String formatLongDuration(int i10, int i11) {
        return formatDuration(i10, i11, true);
    }

    public static String formatShortDuration(int i10, int i11) {
        return formatDuration(i10, i11, false);
    }

    public static File generatePicturePath(boolean z4, String str) {
        try {
            File directory = FileLoader.getDirectory(100);
            if (!z4 && directory != null) {
                return new File(directory, generateFileName(0, str));
            }
            return new File(ApplicationLoader.applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES), generateFileName(0, str));
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static File generateVideoPath(boolean z4) {
        try {
            File albumDir = getAlbumDir(z4);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.random.nextInt(1000) + 1);
            if (generatingVideoPathFormat == null) {
                generatingVideoPathFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            String format = generatingVideoPathFormat.format(date);
            return new File(albumDir, "VID_" + format + ".mp4");
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Activity getActivity(Context context) {
        Activity findActivity = findActivity(context);
        if (findActivity == null || findActivity.isFinishing()) {
            findActivity = LaunchActivity.D1;
        }
        return (findActivity == null || findActivity.isFinishing()) ? findActivity(ApplicationLoader.applicationContext) : findActivity;
    }

    public static String getHostAuthority(String str, boolean z4) {
        if (str == null) {
            return null;
        }
        Matcher matcher = getURIParsePattern().matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(4);
            if (group != null) {
                group = group.toLowerCase();
            }
            return (z4 && group != null && group.startsWith("www.")) ? group.substring(4) : group;
        }
        return null;
    }

    public static float getNavigationBarThirdButtonsFactor(float f10, float f11, int i10) {
        return lerp(f10, f11, getNavigationBarThirdButtonsFactor(i10));
    }

    public static int getPatternColor(int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getPatternColor(int, boolean):int");
    }

    public static int getPhotoSize(boolean z4) {
        if (z4) {
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
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i10, Math.max(width, height) / 180));
        return createBitmap;
    }

    public static void makeGlobalBlurBitmap(Utilities.Callback<Bitmap> callback, float f10, int i10, View view, List<View> list) {
        int width;
        int height;
        if (callback == null) {
            return;
        }
        List<View> allGlobalViews = allGlobalViews();
        if (allGlobalViews == null) {
            callback.run(null);
            return;
        }
        makingGlobalBlurBitmap = true;
        try {
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
                Bitmap createBitmap = Bitmap.createBitmap(width, i11, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    canvas.translate((-iArr[0]) / f10, (-iArr[1]) / f10);
                }
                float f11 = 1.0f / f10;
                canvas.scale(f11, f11);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                for (int i12 = 0; i12 < allGlobalViews.size(); i12++) {
                    View view2 = allGlobalViews.get(i12);
                    if (!(view2 instanceof bg0) && (list == null || !list.contains(view2))) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(i0.a.k(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view2.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f10, iArr[1] / f10);
                        try {
                            view2.draw(canvas);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i10, Math.max(width, i11) / 180));
                callback.run(createBitmap);
            } catch (Throwable th2) {
                makingGlobalBlurBitmap = false;
                throw th2;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            callback.run(null);
        }
        makingGlobalBlurBitmap = false;
    }

    public static boolean needShowPasscode(boolean z4) {
        boolean isWasInBackground = g10.getInstance().isWasInBackground(z4);
        if (z4) {
            g10.getInstance().resetBackgroundVar();
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (BuildVars.LOGS_ENABLED && z4 && SharedConfig.passcodeHash.length() > 0) {
            FileLog.d("wasInBackground = " + isWasInBackground + " appLocked = " + SharedConfig.appLocked + " autoLockIn = " + SharedConfig.autoLockIn + " lastPauseTime = " + SharedConfig.lastPauseTime + " uptime = " + elapsedRealtime);
        }
        if (SharedConfig.passcodeHash.length() <= 0 || !isWasInBackground) {
            return false;
        }
        if (SharedConfig.appLocked) {
            return true;
        }
        return !(SharedConfig.autoLockIn == 0 || SharedConfig.lastPauseTime == 0 || SharedConfig.appLocked || SharedConfig.lastPauseTime + SharedConfig.autoLockIn > elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime;
    }

    public static String readRes(File file) {
        return readRes(file, 0);
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z4, float f10, float f11) {
        return replaceArrows(charSequence, z4, f10, f11, 1.0f);
    }

    public static SpannableStringBuilder replaceLinks(String str, final org.telegram.ui.ActionBar.f6 f6Var, final Runnable runnable) {
        if (linksPattern == null) {
            linksPattern = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = linksPattern.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i10, matcher.start());
            String group = matcher.group(1);
            final String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void onClick(View view) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    af.g.s(ApplicationLoader.applicationContext, group2);
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, f6Var));
                    textPaint.setUnderlineText(false);
                }
            }, spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i10 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i10, str.length());
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleLink(String str, final int i10, final Runnable runnable) {
        int i11;
        int i12;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i12 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i11 = 0;
        } else {
            i11 = i12 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
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
                }, indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new CharacterStyle() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(i10);
                }
            }, indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleLinkBold(String str, final int i10, final Runnable runnable) {
        int i11;
        int i12;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i12 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i11 = 0;
        } else {
            i11 = i12 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
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
                }, indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new CharacterStyle() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setTypeface(AndroidUtilities.bold());
                    textPaint.setColor(i10);
                }
            }, indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder replaceSingleTag(String str, int i10, int i11, Runnable runnable) {
        return replaceSingleTag(str, i10, i11, runnable, null);
    }

    public static SpannableStringBuilder replaceTags(String str, int i10, Object... objArr) {
        try {
            StringBuilder sb = new StringBuilder(str);
            if ((i10 & 1) != 0) {
                while (true) {
                    int indexOf = sb.indexOf("<br>");
                    if (indexOf == -1) {
                        break;
                    }
                    sb.replace(indexOf, indexOf + 4, "\n");
                }
                while (true) {
                    int indexOf2 = sb.indexOf("<br/>");
                    if (indexOf2 == -1) {
                        break;
                    }
                    sb.replace(indexOf2, indexOf2 + 5, "\n");
                }
            }
            ArrayList arrayList = new ArrayList();
            if ((i10 & 2) != 0) {
                while (true) {
                    int indexOf3 = sb.indexOf("<b>");
                    if (indexOf3 == -1) {
                        break;
                    }
                    sb.replace(indexOf3, indexOf3 + 3, "");
                    int indexOf4 = sb.indexOf("</b>");
                    if (indexOf4 == -1) {
                        indexOf4 = sb.indexOf("<b>");
                    }
                    sb.replace(indexOf4, indexOf4 + 4, "");
                    arrayList.add(Integer.valueOf(indexOf3));
                    arrayList.add(Integer.valueOf(indexOf4));
                }
                while (true) {
                    int indexOf5 = sb.indexOf("**");
                    if (indexOf5 == -1) {
                        break;
                    }
                    sb.replace(indexOf5, indexOf5 + 2, "");
                    int indexOf6 = sb.indexOf("**");
                    if (indexOf6 >= 0) {
                        sb.replace(indexOf6, indexOf6 + 2, "");
                        arrayList.add(Integer.valueOf(indexOf5));
                        arrayList.add(Integer.valueOf(indexOf6));
                    }
                }
            }
            if ((i10 & 8) != 0) {
                while (true) {
                    int indexOf7 = sb.indexOf("**");
                    if (indexOf7 == -1) {
                        break;
                    }
                    sb.replace(indexOf7, indexOf7 + 2, "");
                    int indexOf8 = sb.indexOf("**");
                    if (indexOf8 >= 0) {
                        sb.replace(indexOf8, indexOf8 + 2, "");
                        arrayList.add(Integer.valueOf(indexOf7));
                        arrayList.add(Integer.valueOf(indexOf8));
                    }
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            for (int i11 = 0; i11 < arrayList.size() / 2; i11++) {
                int i12 = i11 * 2;
                spannableStringBuilder.setSpan(new f51(bold()), ((Integer) arrayList.get(i12)).intValue(), ((Integer) arrayList.get(i12 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            FileLog.e(e);
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
        double d12 = i10 / 255.0d;
        double d13 = i11 / 255.0d;
        double d14 = i12 / 255.0d;
        int i13 = (d12 > d13 ? 1 : (d12 == d13 ? 0 : -1));
        double max = (i13 <= 0 || d12 <= d14) ? Math.max(d13, d14) : d12;
        double min = (d12 >= d13 || d12 >= d14) ? Math.min(d13, d14) : d12;
        double d15 = max - min;
        double d16 = 0.0d;
        double d17 = max == 0.0d ? 0.0d : d15 / max;
        if (max != min) {
            if (i13 > 0 && d12 > d14) {
                d = (d13 - d14) / d15;
                d10 = d13 < d14 ? 6 : 0;
            } else if (d13 > d14) {
                d11 = 2.0d + ((d14 - d12) / d15);
                d16 = d11 / 6.0d;
            } else {
                d = (d12 - d13) / d15;
                d10 = 4.0d;
            }
            d11 = d + d10;
            d16 = d11 / 6.0d;
        }
        return new double[]{d16, d17, max};
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
        rectF.set(f11 - ((f11 - rectF.left) * f10), f12 - ((f12 - rectF.top) * f10), ((rectF.right - f11) * f10) + f11, ((rectF.bottom - f12) * f10) + f12);
    }

    public static void setLightNavigationBar(Activity activity, boolean z4) {
        if (activity != null) {
            setLightNavigationBar(activity.getWindow(), z4);
        }
    }

    public static void setLightStatusBar(Dialog dialog, boolean z4) {
        if (dialog != null) {
            setLightStatusBar(dialog.getWindow(), z4);
        }
    }

    public static void setNavigationBarColor(Dialog dialog, int i10, boolean z4) {
        setNavigationBarColor(dialog, i10, z4, (IntColorCallback) null);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void shakeViewSpring(View view, float f10) {
        shakeViewSpring(view, f10, null);
    }

    public static void updateViewShow(View view, boolean z4, boolean z10, boolean z11) {
        updateViewShow(view, z4, z10, 0.0f, z11, null);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z4, float f10, boolean z10) {
        updateViewVisibilityAnimated(view, z4, f10, true, z10);
    }

    @Deprecated
    public static boolean addLinks(Spannable spannable, int i10, boolean z4, boolean z10) {
        Spannable spannable2;
        if (spannable == null || containsUnsupportedCharacters(spannable.toString()) || i10 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            URLSpan uRLSpan = uRLSpanArr[length];
            if (!(uRLSpan instanceof o51) || z10) {
                spannable.removeSpan(uRLSpan);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!z4 && (i10 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        if ((i10 & 1) != 0) {
            spannable2 = spannable;
            gatherLinks(arrayList, spannable2, LinkifyPort.WEB_URL, new String[]{"http://", "https://", "tg://", "tonsite://"}, sUrlMatchFilter, z4);
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
                    if (!(uRLSpan2 instanceof o51) || z10) {
                        spannable2.removeSpan(uRLSpan2);
                    }
                }
            }
            String str = linkSpec.url;
            if (str != null) {
                str = str.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
            }
            if (!af.g.j(str)) {
                spannable2.setSpan(new URLSpan(str), linkSpec.start, linkSpec.end, 33);
            }
        }
        return true;
    }

    public static void addMediaToGallery(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            ApplicationLoader.applicationContext.sendBroadcast(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void applySpring(Animator animator, double d, double d10, double d11, double d12) {
        double d13;
        double d14;
        final double sqrt = Math.sqrt(d / d11);
        final double sqrt2 = d10 / (Math.sqrt(d * d11) * 2.0d);
        if (sqrt2 < 1.0d) {
            d14 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d13 = ((sqrt2 * sqrt) + (-d12)) / d14;
        } else {
            d13 = (-d12) + sqrt;
            d14 = 0.0d;
        }
        final double d15 = d14;
        final double d16 = d13;
        animator.setDuration((long) ((Math.log(0.0025d) / ((-sqrt2) * sqrt)) * 1000.0d));
        animator.setInterpolator(new Interpolator() {
            @Override
            public float getInterpolation(float f10) {
                double exp;
                double d17 = sqrt2;
                if (d17 < 1.0d) {
                    double d18 = f10;
                    exp = 1.0d - (((Math.sin(d15 * d18) * d16) + (Math.cos(d15 * d18) * r5)) * Math.exp(((-f10) * d17) * sqrt));
                } else {
                    exp = 1.0d - (Math.exp((-f10) * sqrt) * ((d16 * f10) + r5));
                }
                return (float) exp;
            }
        });
    }

    private static boolean isInternalUri(Uri uri, int i10) {
        String str;
        if (uri != null) {
            str = uri.getPath();
            if (str == null) {
                return false;
            }
            if (str.matches(Pattern.quote(new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
                return false;
            }
            int i11 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlink = Utilities.readlink(str);
                    if (readlink != null && !readlink.equals(str)) {
                        i11++;
                        if (i11 >= 10) {
                            return true;
                        }
                        str = readlink;
                    }
                } catch (Throwable unused) {
                    return true;
                }
            }
            return true;
        }
        str = "";
        int i12 = 0;
        while (str.length() <= 4096) {
            try {
                String readlinkFd = Utilities.readlinkFd(i10);
                if (readlinkFd != null && !readlinkFd.equals(str)) {
                    i12++;
                    if (i12 >= 10) {
                        return true;
                    }
                    str = readlinkFd;
                }
            } catch (Throwable unused2) {
                return true;
            }
        }
        return true;
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            if (canonicalPath != null) {
                str = canonicalPath;
            }
        } catch (Exception unused3) {
            str.replace("/./", "/");
        }
        if (str.endsWith(".attheme")) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("/data/data/" + ApplicationLoader.applicationContext.getPackageName());
    }

    public static float lerp(float f10, float f11, float f12) {
        return e2.c.w(f11, f10, f12, f10);
    }

    public static String readRes(File file, int i10) {
        InputStream inputStream;
        byte[] bArr = readBufferLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            readBufferLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStream = new FileInputStream(file);
            } else {
                inputStream = ApplicationLoader.applicationContext.getResources().openRawResource(i10);
            }
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            byte[] bArr2 = bufferLocal.get();
            if (bArr2 == null) {
                bArr2 = new byte[4096];
                bufferLocal.set(bArr2);
            }
            int i11 = 0;
            while (true) {
                int read = inputStream.read(bArr2, 0, bArr2.length);
                if (read >= 0) {
                    int i12 = i11 + read;
                    if (bArr.length < i12) {
                        byte[] bArr3 = new byte[bArr.length * 2];
                        System.arraycopy(bArr, 0, bArr3, 0, i11);
                        readBufferLocal.set(bArr3);
                        bArr = bArr3;
                    }
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, i11, read);
                        i11 = i12;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable unused2) {
                    }
                }
            }
            inputStream.close();
            return new String(bArr, 0, i11);
        } catch (Throwable unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return null;
        }
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z4, float f10, float f11, float f12) {
        return replaceArrows(charSequence, z4, f10, f11, f12, R.drawable.msg_mini_forumarrow);
    }

    public static SpannableStringBuilder replaceSingleTag(String str, final int i10, final int i11, final Runnable runnable, final org.telegram.ui.ActionBar.f6 f6Var) {
        int i12;
        int i13;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i13 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i12 = 0;
        } else {
            i12 = i13 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (i11 == 3) {
                int i14 = indexOf + i12;
                spannableStringBuilder.replace(indexOf, i14, replaceMultipleCharSequence(" ", spannableStringBuilder.subSequence(indexOf, i14), " "));
            }
            if (i11 != 0 && i11 != 3 && i11 != 2 && i11 != 4) {
                spannableStringBuilder.setSpan(new CharacterStyle() {
                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                        int alpha = textPaint.getAlpha();
                        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20085n6, f6Var));
                        textPaint.setAlpha(alpha);
                    }
                }, indexOf, i12 + indexOf, 0);
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
                    boolean z4;
                    super.updateDrawState(textPaint);
                    if (i11 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    textPaint.setUnderlineText(z4);
                    int i15 = i10;
                    if (i15 >= 0) {
                        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
                    }
                    if (i11 == 2) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                    }
                }
            }, indexOf, i12 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    private static void setLightNavigationBar(Window window, boolean z4) {
        if (window != null) {
            setLightNavigationBar(window.getDecorView(), z4);
        }
    }

    public static void setLightStatusBar(Window window, boolean z4) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            changeSetSystemUiVisibility(window.getDecorView(), 8192, z4);
            if (i10 >= 35 || window.getStatusBarColor() == 0) {
                return;
            }
            window.setStatusBarColor(0);
        }
    }

    public static void setNavigationBarColor(Dialog dialog, int i10, boolean z4, IntColorCallback intColorCallback) {
        if (dialog != null) {
            setNavigationBarColor(dialog.getWindow(), i10, z4, intColorCallback);
        }
    }

    public static void shakeViewSpring(View view, Runnable runnable) {
        shakeViewSpring(view, 10.0f, runnable);
    }

    public static void updateViewShow(View view, boolean z4, boolean z10, boolean z11, Runnable runnable) {
        updateViewShow(view, z4, z10, 0.0f, z11, runnable);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z4, float f10, boolean z10, boolean z11) {
        updateViewVisibilityAnimated(view, z4, f10, z10, 1.0f, z11, null);
    }

    public static SpannableStringBuilder formatSpannable(CharSequence charSequence, GenericProvider<Integer, String> genericProvider, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            String provide = genericProvider.provide(Integer.valueOf(i10));
            int indexOf = charSequence2.indexOf(provide);
            if (indexOf != -1) {
                valueOf.replace(indexOf, provide.length() + indexOf, charSequenceArr[i10]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i10].toString() + charSequence2.substring(provide.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static CharSequence highlightText(CharSequence charSequence, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        int indexOf = lowerCase.indexOf(str);
        while (indexOf >= 0) {
            try {
                valueOf.setSpan(new e10(org.telegram.ui.ActionBar.j6.f20140q6, f6Var), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
            indexOf = lowerCase.indexOf(str, indexOf + 1);
        }
        return valueOf;
    }

    public static float lerp(float f10, float f11, float f12, float f13) {
        return lerp(f10, f11, f12, 0.5f, f13);
    }

    public static CharSequence replaceArrows(CharSequence charSequence, boolean z4, float f10, float f11, float f12, int i10) {
        mq mqVar = new mq(i10, 0);
        float f13 = f12 * 0.88f;
        mqVar.setScale(f13, f13);
        mqVar.translate(-f10, f11);
        mqVar.spaceScaleX = 0.8f;
        if (z4) {
            mqVar.useLinkPaintColor = z4;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(mqVar, spannableString.length() - 1, spannableString.length(), 33);
        CharSequence replaceMultipleCharSequence = replaceMultipleCharSequence(" >", charSequence, spannableString);
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(mqVar, 0, 1, 33);
        CharSequence replaceMultipleCharSequence2 = replaceMultipleCharSequence(">", replaceMultipleCharSequence, spannableString2);
        mq mqVar2 = new mq(i10, 0);
        mqVar2.setScale(f13, f13);
        mqVar2.translate(f10, f11);
        mqVar2.rotate(180.0f);
        mqVar2.spaceScaleX = 0.8f;
        if (z4) {
            mqVar2.useLinkPaintColor = z4;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(mqVar2, 0, 1, 33);
        return replaceMultipleCharSequence("<", replaceMultipleCharSequence2, spannableString3);
    }

    public static void setLightNavigationBar(View view, boolean z4) {
        if (view == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        changeSetSystemUiVisibility(view, 16, z4);
    }

    @Deprecated
    public static void setNavigationBarColor(Activity activity, int i10) {
        setNavigationBarColor(activity, i10, true);
    }

    public static void shakeViewSpring(View view, float f10, Runnable runnable) {
        if (view == null) {
            return;
        }
        int dp = dp(f10);
        if (view.getTag(R.id.spring_tag) != null) {
            ((o1.j) view.getTag(R.id.spring_tag)).c();
        }
        Float f11 = (Float) view.getTag(R.id.spring_was_translation_x_tag);
        if (f11 != null) {
            view.setTranslationX(f11.floatValue());
        }
        view.setTag(R.id.spring_was_translation_x_tag, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        o1.j jVar = new o1.j(view, o1.h.f16181m, translationX);
        o1.k kVar = new o1.k(translationX);
        kVar.b(600.0f);
        jVar.f16198u = kVar;
        jVar.f16189a = (-dp) * 100;
        jVar.a(new q(view, translationX, runnable));
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

    public static void updateViewShow(View view, boolean z4, boolean z10, float f10, boolean z11, Runnable runnable) {
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            z11 = false;
        }
        view.animate().setListener(null).cancel();
        if (!z11) {
            view.setVisibility(z4 ? 0 : 8);
            view.setTag(z4 ? 1 : null);
            view.setAlpha(1.0f);
            view.setScaleX((!z10 || z4) ? 1.0f : 0.5f);
            view.setScaleY((!z10 || z4) ? 1.0f : 1.0f);
            if (f10 != 0.0f) {
                view.setTranslationY(z4 ? 0.0f : dp(-16.0f) * f10);
            }
            if (runnable != null) {
                runnable.run();
            }
        } else if (z4) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(z10 ? 0.5f : 1.0f);
                view.setScaleY(z10 ? 0.5f : 1.0f);
                if (f10 != 0.0f) {
                    view.setTranslationY(dp(-16.0f) * f10);
                }
            }
            ViewPropertyAnimator withEndAction = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(nr.h).setDuration(340L).withEndAction(runnable);
            if (f10 != 0.0f) {
                withEndAction.translationY(0.0f);
            }
            withEndAction.start();
        } else {
            ViewPropertyAnimator withEndAction2 = view.animate().alpha(0.0f).scaleY(z10 ? 0.5f : 1.0f).scaleX(z10 ? 0.5f : 1.0f).setListener(new l00(view)).setInterpolator(nr.h).setDuration(340L).withEndAction(runnable);
            if (f10 != 0.0f) {
                withEndAction2.translationY(dp(-16.0f) * f10);
            }
            withEndAction2.start();
        }
    }

    public static void updateViewVisibilityAnimated(View view, boolean z4, float f10, boolean z10, float f11, boolean z11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            z11 = false;
        }
        if (!z11) {
            view.animate().setListener(null).cancel();
            view.setVisibility(z4 ? 0 : z10 ? 8 : 4);
            view.setTag(z4 ? 1 : null);
            view.setAlpha(f11);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (z4 && view.getTag() == null) {
            view.animate().setListener(null).cancel();
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(f10);
                view.setScaleY(f10);
            }
            view.animate().alpha(f11).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
            view.setTag(r0);
        } else if (z4 || view.getTag() == null) {
        } else {
            view.animate().setListener(null).cancel();
            view.animate().alpha(0.0f).scaleY(f10).scaleX(f10).setListener(new l00(view, z10)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
            view.setTag(null);
        }
    }

    public static int charSequenceIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        return charSequenceIndexOf(charSequence, charSequence2, 0);
    }

    public static Pair<Integer, Integer> getImageOrientation(File file) {
        try {
            return getImageOrientation(new r1.g(file));
        } catch (Exception e) {
            FileLog.e(e);
            return new Pair<>(0, 0);
        }
    }

    public static float lerp(float f10, float f11, float f12, float f13, float f14) {
        if (f14 < f13) {
            return lerp(f10, f11, f14 / f13);
        }
        return lerp(f11, f12, (f14 - f13) / (1.0f - f13));
    }

    public static void normalizeTimePart(StringBuilder sb, long j10) {
        if (j10 < 10) {
            sb.append("0");
            sb.append(j10);
            return;
        }
        sb.append(j10);
    }

    @Deprecated
    public static void setNavigationBarColor(Activity activity, int i10, boolean z4) {
        if (activity != null) {
            setNavigationBarColor(activity.getWindow(), i10, z4, (IntColorCallback) null);
        }
    }

    public static boolean addToClipboard(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, lf.q.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e) {
            FileLog.e(e);
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
        float lerp = lerp(rect.centerX(), rect2.centerX(), f10);
        float lerp2 = lerp(rect.centerY(), rect2.centerY(), f10);
        float lerp3 = lerp(rect.width(), rect2.width(), Math.min(1.0f, f10)) / 2.0f;
        float lerp4 = lerp(rect.height(), rect2.height(), Math.min(1.0f, f10)) / 2.0f;
        rect3.set((int) (lerp - lerp3), (int) (lerp2 - lerp4), (int) (lerp + lerp3), (int) (lerp2 + lerp4));
    }

    private static void setNavigationBarColor(final Window window, int i10, boolean z4, IntColorCallback intColorCallback) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap<Window, ValueAnimator> hashMap = navigationBarColorAnimators;
        if (hashMap != null && (valueAnimator = hashMap.get(window)) != null) {
            valueAnimator.cancel();
            navigationBarColorAnimators.remove(window);
        }
        if (!z4) {
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
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i10);
        ofArgb.addUpdateListener(new yh(1, intColorCallback, window));
        ofArgb.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (AndroidUtilities.navigationBarColorAnimators != null) {
                    AndroidUtilities.navigationBarColorAnimators.remove(window);
                }
            }
        });
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(nr.f27346f);
        ofArgb.start();
        if (navigationBarColorAnimators == null) {
            navigationBarColorAnimators = new HashMap<>();
        }
        navigationBarColorAnimators.put(window, ofArgb);
    }

    public static int applyColorMatrix(int i10, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i10);
        int red = Color.red(i10);
        int green = Color.green(i10);
        float f10 = red;
        float f11 = green;
        float blue = Color.blue(i10);
        float f12 = alpha;
        float f13 = (array[3] * f12) + (array[2] * blue) + (array[1] * f11) + (array[0] * f10) + array[4];
        float f14 = (array[8] * f12) + (array[7] * blue) + (array[6] * f11) + (array[5] * f10) + array[9];
        float f15 = (array[13] * f12) + (array[12] * blue) + (array[11] * f11) + (array[10] * f10) + array[14];
        float f16 = array[15] * f10;
        return Color.argb(k7.n.b(Math.round((array[18] * f12) + (array[17] * blue) + (array[16] * f11) + f16 + array[19]), 0, 255), k7.n.b(Math.round(f13), 0, 255), k7.n.b(Math.round(f14), 0, 255), k7.n.b(Math.round(f15), 0, 255));
    }

    public static boolean copyFile(File file, File file2) {
        if (file.equals(file2)) {
            return true;
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.getChannel().transferFrom(fileInputStream.getChannel(), 0L, fileInputStream.getChannel().size());
                fileOutputStream.close();
                fileInputStream.close();
                return true;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static void forEachViews(RecyclerView recyclerView, h5.d dVar) {
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

    public static float lerp(boolean z4, boolean z10, float f10) {
        return e2.c.w(z10 ? 1.0f : 0.0f, z4 ? 1.0f : 0.0f, f10, z4 ? 1.0f : 0.0f);
    }

    public static void setPreferredMaxRefreshRate(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - screenMaxRefreshRate) > 0.2d) {
            layoutParams.preferredRefreshRate = screenMaxRefreshRate;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e) {
                    FileLog.e(e);
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

    public static void setLightStatusBar(View view, boolean z4) {
        if (view == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        changeSetSystemUiVisibility(view, 8192, z4);
    }

    public static void applySpring(Animator animator, float f10, float f11, float f12, long j10) {
        final double sqrt = f11 / (Math.sqrt(f10 * f12) * 2.0d);
        final double sqrt2 = Math.sqrt(f10 / f12);
        animator.setDuration(j10);
        animator.setInterpolator(new Interpolator() {
            @Override
            public float getInterpolation(float f13) {
                double d;
                double exp;
                double d10 = sqrt;
                if (d10 < 1.0d) {
                    double sqrt3 = Math.sqrt(1.0d - (d10 * d10)) * sqrt2;
                    double d11 = f13;
                    d = Math.exp((-sqrt) * sqrt2 * d11);
                    double d12 = d11 * sqrt3;
                    exp = (Math.sin(d12) * ((sqrt * sqrt2) / sqrt3)) + Math.cos(d12);
                } else {
                    double d13 = (-d10) * sqrt2 * f13;
                    d = d13 + 1.0d;
                    exp = Math.exp(d13);
                }
                return (float) (1.0d - (exp * d));
            }
        });
    }

    public static String getHostAuthority(Uri uri, boolean z4) {
        if (uri == null) {
            return null;
        }
        return getHostAuthority(uri.toString(), z4);
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

    public static String formatDuration(int i10, int i11, boolean z4) {
        int i12 = i11 / 3600;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 % 60;
        int i15 = i10 / 3600;
        int i16 = (i10 / 60) % 60;
        int i17 = i10 % 60;
        return i11 == 0 ? i15 == 0 ? z4 ? String.format(Locale.US, "%02d:%02d / -:--", Integer.valueOf(i16), Integer.valueOf(i17)) : String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i16), Integer.valueOf(i17)) : String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)) : (i15 == 0 && i12 == 0) ? z4 ? String.format(Locale.US, "%02d:%02d / %02d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static void getBitmapFromSurface(Surface surface, Bitmap bitmap) {
        if (surface == null || !surface.isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surface, bitmap, new j(countDownLatch, 1), Utilities.searchQueue.getHandler());
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getImageOrientation(r1.g r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getImageOrientation(r1.g):android.util.Pair");
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
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lerp(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(lerp(rectF.left, rectF2.left, f10), lerp(rectF.top, rectF2.top, f10), lerp(rectF.right, rectF2.right, f10), lerp(rectF.bottom, rectF2.bottom, f10));
        }
    }

    public static boolean openForView(MessageObject messageObject, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        String str = messageObject.messageOwner.attachPath;
        String str2 = null;
        File file = (str == null || str.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner);
        }
        File file2 = file;
        int i10 = messageObject.type;
        if (i10 == 9 || i10 == 0) {
            str2 = messageObject.getMimeType();
        }
        return openForView(file2, messageObject.getFileName(), str2, activity, f6Var, z4);
    }

    public static void lerp(Rect rect, Rect rect2, float f10, Rect rect3) {
        if (rect3 != null) {
            rect3.set(lerp(rect.left, rect2.left, f10), lerp(rect.top, rect2.top, f10), lerp(rect.right, rect2.right, f10), lerp(rect.bottom, rect2.bottom, f10));
        }
    }

    public static boolean openForView(TLRPC.Document document, boolean z4, Activity activity) {
        return openForView(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), FileLoader.getAttachFileName(document), document.mime_type, activity, null, false);
    }

    public static void dumpCanvas(View view) {
    }

    public static void printStackTrace(String str) {
    }

    public static boolean openForView(org.telegram.tgnet.TLObject r8, android.app.Activity r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.openForView(org.telegram.tgnet.TLObject, android.app.Activity):boolean");
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
                int charSequenceIndexOf = charSequenceIndexOf(spannableStringBuilder, "**");
                if (charSequenceIndexOf == -1) {
                    break;
                }
                spannableStringBuilder.replace(charSequenceIndexOf, charSequenceIndexOf + 2, "");
                int charSequenceIndexOf2 = charSequenceIndexOf(spannableStringBuilder, "**");
                if (charSequenceIndexOf2 >= 0) {
                    spannableStringBuilder.replace(charSequenceIndexOf2, charSequenceIndexOf2 + 2, "");
                    arrayList.add(Integer.valueOf(charSequenceIndexOf));
                    arrayList.add(Integer.valueOf(charSequenceIndexOf2));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i10 = 0; i10 < arrayList.size() / 2; i10++) {
                int i11 = i10 * 2;
                spannableStringBuilder2.setSpan(new f51(bold()), ((Integer) arrayList.get(i11)).intValue(), ((Integer) arrayList.get(i11 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e) {
            FileLog.e(e);
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

    public static void fillStatusBarHeight(Context context, boolean z4) {
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
