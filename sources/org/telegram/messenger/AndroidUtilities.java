package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.CallLog;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.internal.telephony.ITelephony;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_restrictionReason;
import org.telegram.tgnet.TLRPC$TL_userContact_old2;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WallPaperSettings;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.ForegroundDetector;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.PickerBottomLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.WallpapersListActivity;

public class AndroidUtilities {
    public static Pattern BAD_CHARS_MESSAGE_LONG_PATTERN = null;
    public static Pattern BAD_CHARS_MESSAGE_PATTERN = null;
    public static Pattern BAD_CHARS_PATTERN = null;
    public static final int DARK_STATUS_BAR_OVERLAY = 855638016;
    public static final int FLAG_TAG_ALL = 11;
    public static final int FLAG_TAG_BOLD = 2;
    public static final int FLAG_TAG_BR = 1;
    public static final int FLAG_TAG_COLOR = 4;
    public static final int FLAG_TAG_URL = 8;
    public static final int LIGHT_STATUS_BAR_OVERLAY = 251658240;
    public static final String STICKERS_PLACEHOLDER_PACK_NAME = "tg_placeholders_android";
    public static Pattern WEB_URL;
    private static AccessibilityManager accessibilityManager;
    private static RectF bitmapRect;
    private static CallReceiver callReceiver;
    private static char[] characters;
    private static HashSet<Character> charactersMap;
    private static int[] documentIcons;
    private static int[] documentMediaIcons;
    public static boolean firstConfigurationWas;
    private static WeakReference<BaseFragment> flagSecureFragment;
    private static final HashMap<Window, ArrayList<Long>> flagSecureReasons;
    private static SimpleDateFormat generatingVideoPathFormat;
    private static boolean hasCallPermissions;
    public static boolean incorrectDisplaySizeFix;
    public static boolean isInMultiwindow;
    private static long lastUpdateCheckTime;
    public static int leftBaseline;
    private static Field mAttachInfoField;
    private static Field mStableInsetsField;
    private static HashMap<Window, ValueAnimator> navigationBarColorAnimators;
    public static final String[] numbersSignatureArray;
    public static int roundMessageInset;
    public static int roundMessageSize;
    private static Paint roundPaint;
    public static int roundPlayingMessageSize;
    public static final Linkify.MatchFilter sUrlMatchFilter;
    private static Runnable unregisterRunnable;
    public static boolean usingHardwareInput;
    private static final Hashtable<String, Typeface> typefaceCache = new Hashtable<>();
    private static int prevOrientation = -10;
    private static boolean waitingForSms = false;
    private static boolean waitingForCall = false;
    private static final Object smsLock = new Object();
    private static final Object callLock = new Object();
    public static int statusBarHeight = 0;
    public static int navigationBarHeight = 0;
    public static float density = 1.0f;
    public static Point displaySize = new Point();
    public static float screenRefreshRate = 60.0f;
    public static Integer photoSize = null;
    public static DisplayMetrics displayMetrics = new DisplayMetrics();
    public static DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    public static AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
    public static OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
    private static Boolean isTablet = null;
    private static Boolean isSmallScreen = null;
    private static int adjustOwnerClassGuid = 0;
    private static int altFocusableClassGuid = 0;
    public static final RectF rectTmp = new RectF();
    public static final Rect rectTmp2 = new Rect();
    private static Pattern singleTagPatter = null;

    public interface IntColorCallback {
        void run(int i);
    }

    public static int compare(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i > i2 ? 1 : -1;
    }

    public static int compare(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j > j2 ? 1 : -1;
    }

    public static int getMyLayerVersion(int i) {
        return i & 65535;
    }

    public static int getWallpaperRotation(int i, boolean z) {
        int i2 = z ? i + 180 : i - 180;
        while (i2 >= 360) {
            i2 -= 360;
        }
        while (i2 < 0) {
            i2 += 360;
        }
        return i2;
    }

    public static boolean isValidWallChar(char c) {
        return c == '-' || c == '~';
    }

    public static String lambda$formatSpannableSimple$7(Integer num) {
        return "%s";
    }

    public static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int lerp(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static int setMyLayerVersion(int i, int i2) {
        return (i & (-65536)) | i2;
    }

    public static int setPeerLayerVersion(int i, int i2) {
        return (i & 65535) | (i2 << 16);
    }

    static {
        WEB_URL = null;
        BAD_CHARS_PATTERN = null;
        BAD_CHARS_MESSAGE_PATTERN = null;
        BAD_CHARS_MESSAGE_LONG_PATTERN = null;
        try {
            BAD_CHARS_PATTERN = Pattern.compile("[─-◿]");
            BAD_CHARS_MESSAGE_LONG_PATTERN = Pattern.compile("[̀-ͯ\u2066-\u2067]+");
            BAD_CHARS_MESSAGE_PATTERN = Pattern.compile("[\u2066-\u2067]+");
            WEB_URL = Pattern.compile("((?:(http|https|Http|Https|ton|tg):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-\ufdcfﷰ-\uffef]{2,63}|" + Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))") + ")") + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        } catch (Exception e) {
            FileLog.e(e);
        }
        leftBaseline = isTablet() ? 80 : 72;
        checkDisplaySize(ApplicationLoader.applicationContext, null);
        documentIcons = new int[]{R.drawable.media_doc_blue, R.drawable.media_doc_green, R.drawable.media_doc_red, R.drawable.media_doc_yellow};
        documentMediaIcons = new int[]{R.drawable.media_doc_blue_b, R.drawable.media_doc_green_b, R.drawable.media_doc_red_b, R.drawable.media_doc_yellow_b};
        sUrlMatchFilter = AndroidUtilities$$ExternalSyntheticLambda2.INSTANCE;
        hasCallPermissions = Build.VERSION.SDK_INT >= 23;
        numbersSignatureArray = new String[]{"", "K", "M", "G", "T", "P"};
        flagSecureReasons = new HashMap<>();
        characters = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
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

    public static String getSafeString(String str) {
        try {
            return BAD_CHARS_MESSAGE_PATTERN.matcher(str).replaceAll("\u200c");
        } catch (Throwable unused) {
            return str;
        }
    }

    public static CharSequence ellipsizeCenterEnd(CharSequence charSequence, String str, int i, TextPaint textPaint, int i2) {
        int indexOf;
        StaticLayout staticLayout;
        float lineWidth;
        float f;
        CharSequence charSequence2;
        try {
            int length = charSequence.length();
            indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > i2) {
                charSequence = charSequence.subSequence(Math.max(0, indexOf - (i2 / 2)), Math.min(length, (i2 / 2) + indexOf));
                indexOf -= Math.max(0, indexOf - (i2 / 2));
                charSequence.length();
            }
            staticLayout = new StaticLayout(charSequence, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            lineWidth = staticLayout.getLineWidth(0);
            f = i;
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (textPaint.measureText("...") + lineWidth < f) {
            return charSequence;
        }
        int i3 = indexOf + 1;
        int i4 = i3;
        while (i4 < charSequence.length() - 1 && !Character.isWhitespace(charSequence.charAt(i4))) {
            i4++;
        }
        float primaryHorizontal = staticLayout.getPrimaryHorizontal(i4);
        if (staticLayout.isRtlCharAt(i4)) {
            primaryHorizontal = lineWidth - primaryHorizontal;
        }
        if (primaryHorizontal < f) {
            return charSequence;
        }
        float measureText = (primaryHorizontal - f) + (textPaint.measureText("...") * 2.0f);
        float f2 = 0.1f * f;
        float f3 = measureText + f2;
        if (charSequence.length() - i4 > 20) {
            f3 += f2;
        }
        if (f3 > 0.0f) {
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f3);
            if (offsetForHorizontal > charSequence.length() - 1) {
                offsetForHorizontal = charSequence.length() - 1;
            }
            int i5 = 0;
            while (true) {
                if (Character.isWhitespace(charSequence.charAt(offsetForHorizontal)) || i5 >= 10) {
                    break;
                }
                i5++;
                offsetForHorizontal++;
                if (offsetForHorizontal > charSequence.length() - 1) {
                    offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, f3);
                    break;
                }
            }
            if (i5 >= 10) {
                charSequence2 = charSequence.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i3) - (f * 0.3f)), charSequence.length());
            } else {
                if (offsetForHorizontal > 0 && offsetForHorizontal < charSequence.length() - 2 && Character.isWhitespace(charSequence.charAt(offsetForHorizontal))) {
                    offsetForHorizontal++;
                }
                charSequence2 = charSequence.subSequence(offsetForHorizontal, charSequence.length());
            }
            return SpannableStringBuilder.valueOf("...").append(charSequence2);
        }
        return charSequence;
    }

    public static CharSequence highlightText(CharSequence charSequence, ArrayList<String> arrayList, Theme.ResourcesProvider resourcesProvider) {
        if (arrayList == null) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            CharSequence highlightText = highlightText(charSequence, arrayList.get(i2), resourcesProvider);
            if (highlightText != null) {
                charSequence = highlightText;
            } else {
                i++;
            }
        }
        if (i == arrayList.size()) {
            return null;
        }
        return charSequence;
    }

    public static CharSequence highlightText(CharSequence charSequence, String str, Theme.ResourcesProvider resourcesProvider) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        int indexOf = lowerCase.indexOf(str);
        while (indexOf >= 0) {
            try {
                valueOf.setSpan(new ForegroundColorSpanThemable("windowBackgroundWhiteBlueText4", resourcesProvider), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
            indexOf = lowerCase.indexOf(str, indexOf + 1);
        }
        return valueOf;
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

    public static CharSequence replaceSingleTag(String str, final Runnable runnable) {
        int i;
        int i2;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i2 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i = 0;
        } else {
            i = i2 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new ClickableSpan() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }

                @Override
                public void onClick(View view) {
                    runnable.run();
                }
            }, indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void recycleBitmaps(final ArrayList<Bitmap> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.lambda$recycleBitmaps$1(arrayList);
                }
            }, 36L);
        }
    }

    public static void lambda$recycleBitmaps$1(final ArrayList arrayList) {
        NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.lambda$recycleBitmaps$0(arrayList);
            }
        });
    }

    public static void lambda$recycleBitmaps$0(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Bitmap bitmap = (Bitmap) arrayList.get(i);
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    bitmap.recycle();
                } catch (Exception e) {
                    FileLog.e(e);
                }
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

    private static String makeUrl(String str, String[] strArr, Matcher matcher) {
        boolean z;
        int i = 0;
        while (true) {
            z = true;
            if (i >= strArr.length) {
                z = false;
                break;
            } else if (!str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                i++;
            } else if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                str = strArr[i] + str.substring(strArr[i].length());
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    private static void gatherLinks(ArrayList<LinkSpec> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, boolean z) {
        if (TextUtils.indexOf((CharSequence) spannable, (char) 9472) >= 0) {
            spannable = new SpannableStringBuilder(spannable.toString().replace((char) 9472, ' '));
        }
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                LinkSpec linkSpec = new LinkSpec();
                String makeUrl = makeUrl(matcher.group(0), strArr, matcher);
                if (!z || Browser.isInternalUrl(makeUrl, true, null)) {
                    linkSpec.url = makeUrl;
                    linkSpec.start = start;
                    linkSpec.end = end;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    public static boolean lambda$static$2(CharSequence charSequence, int i, int i2) {
        return i == 0 || charSequence.charAt(i - 1) != '@';
    }

    public static boolean addLinks(Spannable spannable, int i) {
        return addLinks(spannable, i, false);
    }

    public static boolean addLinks(Spannable spannable, int i, boolean z) {
        if (spannable == null || containsUnsupportedCharacters(spannable.toString()) || i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        ArrayList arrayList = new ArrayList();
        if (!z && (i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        if ((i & 1) != 0) {
            gatherLinks(arrayList, spannable, LinkifyPort.WEB_URL, new String[]{"http://", "https://", "ton://", "tg://"}, sUrlMatchFilter, z);
        }
        pruneOverlaps(arrayList);
        if (arrayList.size() == 0) {
            return false;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LinkSpec linkSpec = (LinkSpec) arrayList.get(i2);
            URLSpan[] uRLSpanArr2 = (URLSpan[]) spannable.getSpans(linkSpec.start, linkSpec.end, URLSpan.class);
            if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                for (URLSpan uRLSpan : uRLSpanArr2) {
                    spannable.removeSpan(uRLSpan);
                }
            }
            spannable.setSpan(new URLSpan(linkSpec.url), linkSpec.start, linkSpec.end, 33);
        }
        return true;
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> arrayList) {
        int i;
        Collections.sort(arrayList, AndroidUtilities$$ExternalSyntheticLambda10.INSTANCE);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size - 1) {
            LinkSpec linkSpec = arrayList.get(i2);
            int i3 = i2 + 1;
            LinkSpec linkSpec2 = arrayList.get(i3);
            int i4 = linkSpec.start;
            int i5 = linkSpec2.start;
            if (i4 <= i5 && (i = linkSpec.end) > i5) {
                int i6 = linkSpec2.end;
                int i7 = (i6 > i && i - i4 <= i6 - i5) ? i - i4 < i6 - i5 ? i2 : -1 : i3;
                if (i7 != -1) {
                    arrayList.remove(i7);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    public static int lambda$pruneOverlaps$3(LinkSpec linkSpec, LinkSpec linkSpec2) {
        int i;
        int i2;
        int i3 = linkSpec.start;
        int i4 = linkSpec2.start;
        if (i3 < i4) {
            return -1;
        }
        if (i3 <= i4 && (i = linkSpec.end) >= (i2 = linkSpec2.end)) {
            return i > i2 ? -1 : 0;
        }
        return 1;
    }

    public static void fillStatusBarHeight(Context context) {
        if (context != null && statusBarHeight <= 0) {
            statusBarHeight = getStatusBarHeight(context);
            navigationBarHeight = getNavigationBarHeight(context);
        }
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static int getNavigationBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int getThumbForNameOrMime(String str, String str2, boolean z) {
        int i;
        if (str == null || str.length() == 0) {
            return z ? documentMediaIcons[0] : documentIcons[0];
        }
        if (str.contains(".doc") || str.contains(".txt") || str.contains(".psd")) {
            i = 0;
        } else if (str.contains(".xls") || str.contains(".csv")) {
            i = 1;
        } else if (str.contains(".pdf") || str.contains(".ppt") || str.contains(".key")) {
            i = 2;
        } else {
            i = (str.contains(".zip") || str.contains(".rar") || str.contains(".ai") || str.contains(".mp3") || str.contains(".mov") || str.contains(".avi")) ? 3 : -1;
        }
        if (i == -1) {
            int lastIndexOf = str.lastIndexOf(46);
            String substring = lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
            if (substring.length() != 0) {
                i = substring.charAt(0) % documentIcons.length;
            } else {
                i = str.charAt(0) % documentIcons.length;
            }
        }
        return z ? documentMediaIcons[i] : documentIcons[i];
    }

    public static int calcBitmapColor(Bitmap bitmap) {
        try {
            Bitmap createScaledBitmap = Bitmaps.createScaledBitmap(bitmap, 1, 1, true);
            if (createScaledBitmap != null) {
                int pixel = createScaledBitmap.getPixel(0, 0);
                if (bitmap != createScaledBitmap) {
                    createScaledBitmap.recycle();
                }
                return pixel;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return 0;
    }

    public static int[] calcDrawableColor(Drawable drawable) {
        int i;
        int[] iArr = new int[4];
        int i2 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i2 = calcBitmapColor(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i2 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof BackgroundGradientDrawable) {
                int[] colorsList = ((BackgroundGradientDrawable) drawable).getColorsList();
                if (colorsList != null) {
                    if (colorsList.length > 1) {
                        i = getAverageColor(colorsList[0], colorsList[1]);
                    } else if (colorsList.length > 0) {
                        i = colorsList[0];
                    }
                    i2 = i;
                }
            } else if (drawable instanceof MotionBackgroundDrawable) {
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
        double[] rgbToHsv = rgbToHsv((i2 >> 16) & 255, (i2 >> 8) & 255, i2 & 255);
        rgbToHsv[1] = Math.min(1.0d, rgbToHsv[1] + 0.05d + ((1.0d - rgbToHsv[1]) * 0.1d));
        int[] hsvToRgb = hsvToRgb(rgbToHsv[0], rgbToHsv[1], Math.max(0.0d, rgbToHsv[2] * 0.65d));
        iArr[0] = Color.argb(102, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
        iArr[1] = Color.argb(136, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
        int[] hsvToRgb2 = hsvToRgb(rgbToHsv[0], rgbToHsv[1], Math.max(0.0d, rgbToHsv[2] * 0.72d));
        iArr[2] = Color.argb(102, hsvToRgb2[0], hsvToRgb2[1], hsvToRgb2[2]);
        iArr[3] = Color.argb(136, hsvToRgb2[0], hsvToRgb2[1], hsvToRgb2[2]);
        return iArr;
    }

    public static double[] rgbToHsv(int i) {
        return rgbToHsv(Color.red(i), Color.green(i), Color.blue(i));
    }

    public static double[] rgbToHsv(int i, int i2, int i3) {
        double d;
        double d2;
        double d3;
        double d4 = i;
        Double.isNaN(d4);
        double d5 = d4 / 255.0d;
        double d6 = i2;
        Double.isNaN(d6);
        double d7 = d6 / 255.0d;
        double d8 = i3;
        Double.isNaN(d8);
        double d9 = d8 / 255.0d;
        double max = (d5 <= d7 || d5 <= d9) ? Math.max(d7, d9) : d5;
        double min = (d5 >= d7 || d5 >= d9) ? Math.min(d7, d9) : d5;
        double d10 = max - min;
        double d11 = 0.0d;
        double d12 = max == 0.0d ? 0.0d : d10 / max;
        if (max != min) {
            if (d5 > d7 && d5 > d9) {
                d3 = (d7 - d9) / d10;
                d2 = d7 < d9 ? 6 : 0;
                Double.isNaN(d2);
            } else if (d7 > d9) {
                d = 2.0d + ((d9 - d5) / d10);
                d11 = d / 6.0d;
            } else {
                d3 = (d5 - d7) / d10;
                d2 = 4.0d;
            }
            d = d3 + d2;
            d11 = d / 6.0d;
        }
        return new double[]{d11, d12, max};
    }

    public static int hsvToColor(double d, double d2, double d3) {
        int[] hsvToRgb = hsvToRgb(d, d2, d3);
        return Color.argb(255, hsvToRgb[0], hsvToRgb[1], hsvToRgb[2]);
    }

    public static int[] hsvToRgb(double d, double d2, double d3) {
        double d4 = 6.0d * d;
        double floor = (int) Math.floor(d4);
        Double.isNaN(floor);
        double d5 = d4 - floor;
        double d6 = (1.0d - d2) * d3;
        double d7 = (1.0d - (d5 * d2)) * d3;
        double d8 = d3 * (1.0d - ((1.0d - d5) * d2));
        int i = ((int) floor) % 6;
        double d9 = 0.0d;
        if (i != 0) {
            if (i == 1) {
                d9 = d3;
                d8 = d6;
                d6 = d7;
            } else if (i == 2) {
                d9 = d3;
            } else if (i == 3) {
                d8 = d3;
                d9 = d7;
            } else if (i == 4) {
                d9 = d6;
                d6 = d8;
                d8 = d3;
            } else if (i != 5) {
                d8 = 0.0d;
                d6 = 0.0d;
            } else {
                d9 = d6;
                d8 = d7;
            }
            return new int[]{(int) (d6 * 255.0d), (int) (d9 * 255.0d), (int) (d8 * 255.0d)};
        }
        d9 = d8;
        d8 = d6;
        d6 = d3;
        return new int[]{(int) (d6 * 255.0d), (int) (d9 * 255.0d), (int) (d8 * 255.0d)};
    }

    public static void adjustSaturationColorMatrix(ColorMatrix colorMatrix, float f) {
        if (colorMatrix != null) {
            float f2 = f + 1.0f;
            float f3 = 1.0f - f2;
            float f4 = 0.3086f * f3;
            float f5 = 0.6094f * f3;
            float f6 = f3 * 0.082f;
            colorMatrix.postConcat(new ColorMatrix(new float[]{f4 + f2, f5, f6, 0.0f, 0.0f, f4, f5 + f2, f6, 0.0f, 0.0f, f4, f5, f6 + f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    public static void adjustBrightnessColorMatrix(ColorMatrix colorMatrix, float f) {
        if (colorMatrix != null) {
            float f2 = f * 255.0f;
            colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 1.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 1.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    public static void multiplyBrightnessColorMatrix(ColorMatrix colorMatrix, float f) {
        if (colorMatrix != null) {
            colorMatrix.postConcat(new ColorMatrix(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
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

    private static void snapshotTextureViews(int i, int i2, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i, iArr[1] - i2, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                snapshotTextureViews(i, i2, iArr, canvas, viewGroup.getChildAt(i3));
            }
        }
    }

    public static void requestAltFocusable(Activity activity, int i) {
        if (activity != null) {
            activity.getWindow().setFlags(131072, 131072);
            altFocusableClassGuid = i;
        }
    }

    public static void removeAltFocusable(Activity activity, int i) {
        if (activity != null && altFocusableClassGuid == i) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static void requestAdjustResize(Activity activity, int i) {
        if (activity != null) {
            requestAdjustResize(activity.getWindow(), i);
        }
    }

    public static void requestAdjustResize(Window window, int i) {
        if (window != null && !isTablet()) {
            window.setSoftInputMode(16);
            adjustOwnerClassGuid = i;
        }
    }

    public static void requestAdjustNothing(Activity activity, int i) {
        if (activity != null && !isTablet()) {
            activity.getWindow().setSoftInputMode(48);
            adjustOwnerClassGuid = i;
        }
    }

    public static void setAdjustResizeToNothing(Activity activity, int i) {
        if (activity != null && !isTablet()) {
            int i2 = adjustOwnerClassGuid;
            if (i2 == 0 || i2 == i) {
                activity.getWindow().setSoftInputMode(48);
            }
        }
    }

    public static void removeAdjustResize(Activity activity, int i) {
        if (activity != null && !isTablet() && adjustOwnerClassGuid == i) {
            activity.getWindow().setSoftInputMode(32);
        }
    }

    public static void createEmptyFile(File file) {
        try {
            if (!file.exists()) {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Throwable th) {
            FileLog.e(th, false);
        }
    }

    public static boolean isGoogleMapsInstalled(final BaseFragment baseFragment) {
        try {
            ApplicationLoader.applicationContext.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (baseFragment.getParentActivity() == null) {
                return false;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
            builder.setMessage(LocaleController.getString("InstallGoogleMaps", R.string.InstallGoogleMaps));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AndroidUtilities.lambda$isGoogleMapsInstalled$4(BaseFragment.this, dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            baseFragment.showDialog(builder.create());
            return false;
        }
    }

    public static void lambda$isGoogleMapsInstalled$4(BaseFragment baseFragment, DialogInterface dialogInterface, int i) {
        try {
            baseFragment.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.maps")), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static int[] toIntArray(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public static boolean isInternalUri(Uri uri) {
        return isInternalUri(uri, 0);
    }

    public static boolean isInternalUri(int i) {
        return isInternalUri(null, i);
    }

    private static boolean isInternalUri(Uri uri, int i) {
        String str;
        if (uri != null) {
            str = uri.getPath();
            if (str == null) {
                return false;
            }
            if (str.matches(Pattern.quote(new File(ApplicationLoader.applicationContext.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
                return false;
            }
            int i2 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlink = Utilities.readlink(str);
                    if (readlink != null && !readlink.equals(str)) {
                        i2++;
                        if (i2 >= 10) {
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
        int i3 = 0;
        while (str.length() <= 4096) {
            try {
                String readlinkFd = Utilities.readlinkFd(i);
                if (readlinkFd != null && !readlinkFd.equals(str)) {
                    i3++;
                    if (i3 >= 10) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("/data/data/");
        sb.append(ApplicationLoader.applicationContext.getPackageName());
        return lowerCase.contains(sb.toString());
    }

    @SuppressLint({"WrongConstant"})
    public static void lockOrientation(Activity activity) {
        if (activity != null && prevOrientation == -10) {
            try {
                prevOrientation = activity.getRequestedOrientation();
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (!(windowManager == null || windowManager.getDefaultDisplay() == null)) {
                    int rotation = windowManager.getDefaultDisplay().getRotation();
                    int i = activity.getResources().getConfiguration().orientation;
                    if (rotation == 3) {
                        if (i == 1) {
                            activity.setRequestedOrientation(1);
                        } else {
                            activity.setRequestedOrientation(8);
                        }
                    } else if (rotation == 1) {
                        if (i == 1) {
                            activity.setRequestedOrientation(9);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    } else if (rotation == 0) {
                        if (i == 2) {
                            activity.setRequestedOrientation(0);
                        } else {
                            activity.setRequestedOrientation(1);
                        }
                    } else if (i == 2) {
                        activity.setRequestedOrientation(8);
                    } else {
                        activity.setRequestedOrientation(9);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public static void unlockOrientation(Activity activity) {
        if (activity != null) {
            try {
                int i = prevOrientation;
                if (i != -10) {
                    activity.setRequestedOrientation(i);
                    prevOrientation = -10;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private static class VcardData {
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
            for (int i = 0; i < split2.length; i++) {
                if (!(TextUtils.isEmpty(split2[i]) || str == null || !str.equalsIgnoreCase("QUOTED-PRINTABLE") || (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(split2[i]))) == null || decodeQuotedPrintable.length == 0)) {
                    try {
                        split2[i] = new String(decodeQuotedPrintable, str2);
                    } catch (Exception unused) {
                    }
                }
            }
            return split2;
        }

        public String getValue(boolean z) {
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
            boolean z2 = false;
            for (int i = 0; i < split2.length; i++) {
                if (!TextUtils.isEmpty(split2[i])) {
                    if (!(str == null || !str.equalsIgnoreCase("QUOTED-PRINTABLE") || (decodeQuotedPrintable = AndroidUtilities.decodeQuotedPrintable(AndroidUtilities.getStringBytes(split2[i]))) == null || decodeQuotedPrintable.length == 0)) {
                        try {
                            split2[i] = new String(decodeQuotedPrintable, str2);
                        } catch (Exception unused) {
                        }
                    }
                    if (z2 && sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(split2[i]);
                    if (!z2) {
                        z2 = split2[i].length() > 0;
                    }
                }
            }
            if (z) {
                int i2 = this.type;
                if (i2 == 0) {
                    return PhoneFormat.getInstance().format(sb.toString());
                }
                if (i2 == 5) {
                    String[] split3 = sb.toString().split("T");
                    if (split3.length > 0) {
                        String[] split4 = split3[0].split("-");
                        if (split4.length == 3) {
                            Calendar calendar = Calendar.getInstance();
                            calendar.set(1, Utilities.parseInt(split4[0]).intValue());
                            calendar.set(2, Utilities.parseInt(split4[1]).intValue() - 1);
                            calendar.set(5, Utilities.parseInt(split4[2]).intValue());
                            return LocaleController.getInstance().formatterYearMax.format(calendar.getTime());
                        }
                    }
                }
            }
            return sb.toString();
        }

        public String getRawType(boolean z) {
            int indexOf = this.fullData.indexOf(58);
            if (indexOf < 0) {
                return "";
            }
            String substring = this.fullData.substring(0, indexOf);
            if (this.type == 20) {
                String[] split = substring.substring(2).split(";");
                if (z) {
                    return split[0];
                }
                return split.length > 1 ? split[split.length - 1] : "";
            }
            String[] split2 = substring.split(";");
            for (int i = 0; i < split2.length; i++) {
                if (split2[i].indexOf(61) < 0) {
                    substring = split2[i];
                }
            }
            return substring;
        }

        public java.lang.String getType() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.VcardItem.getType():java.lang.String");
        }
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static ArrayList<TLRPC$User> loadVCardFromStream(Uri uri, int i, boolean z, ArrayList<VcardItem> arrayList, String str) {
        InputStream createInputStream;
        Throwable th;
        char c;
        String[] strArr;
        String str2;
        byte[] decodeQuotedPrintable;
        VcardItem vcardItem;
        ArrayList<VcardItem> arrayList2 = arrayList;
        ArrayList<TLRPC$User> arrayList3 = null;
        AnonymousClass1 r3 = 0;
        if (z) {
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
        int i2 = 0;
        VcardData vcardData = null;
        String str3 = null;
        VcardItem vcardItem2 = null;
        boolean z2 = false;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                try {
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (readLine.startsWith("PHOTO")) {
                z2 = true;
            } else {
                if (readLine.indexOf(58) >= 0) {
                    if (readLine.startsWith("BEGIN:VCARD")) {
                        vcardData = new VcardData();
                        arrayList4.add(vcardData);
                        vcardData.name = str;
                    } else if (!readLine.startsWith("END:VCARD") && arrayList2 != null) {
                        if (readLine.startsWith("TEL")) {
                            vcardItem = new VcardItem();
                            vcardItem.type = i2;
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
                                        } else {
                                            if (!readLine.startsWith("X-PHONETIC") && readLine.startsWith("X-")) {
                                                vcardItem = new VcardItem();
                                                vcardItem.type = 20;
                                            }
                                            vcardItem2 = r3;
                                            if (vcardItem2 != null && vcardItem2.type >= 0) {
                                                arrayList2.add(vcardItem2);
                                            }
                                            z2 = false;
                                        }
                                    }
                                    vcardItem = new VcardItem();
                                    vcardItem.type = 6;
                                }
                            }
                            vcardItem = new VcardItem();
                            vcardItem.type = 2;
                        }
                        vcardItem2 = vcardItem;
                        if (vcardItem2 != null) {
                            arrayList2.add(vcardItem2);
                        }
                        z2 = false;
                    }
                    vcardItem2 = r3;
                    z2 = false;
                }
                if (!z2 && vcardData != null) {
                    if (vcardItem2 == null) {
                        if (vcardData.vcard.length() > 0) {
                            vcardData.vcard.append('\n');
                        }
                        vcardData.vcard.append(readLine);
                    } else {
                        vcardItem2.vcardData.add(readLine);
                    }
                }
                if (str3 != null) {
                    readLine = str3 + readLine;
                    str3 = null;
                }
                String str4 = "=";
                if (!readLine.contains("=QUOTED-PRINTABLE") || !readLine.endsWith(str4)) {
                    if (!(z2 || vcardData == null || vcardItem2 == null)) {
                        vcardItem2.fullData = readLine;
                    }
                    int indexOf = readLine.indexOf(":");
                    if (indexOf >= 0) {
                        strArr = new String[]{readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()};
                        c = 0;
                    } else {
                        c = 0;
                        strArr = new String[]{readLine.trim()};
                    }
                    if (strArr.length >= 2 && vcardData != null) {
                        if (!strArr[c].startsWith("FN") && !strArr[c].startsWith("N") && (!strArr[c].startsWith("ORG") || !TextUtils.isEmpty(vcardData.name))) {
                            if (strArr[0].startsWith("TEL")) {
                                vcardData.phones.add(strArr[1]);
                            }
                        }
                        String[] split = strArr[0].split(";");
                        int length = split.length;
                        str2 = str3;
                        String str5 = null;
                        String str6 = null;
                        for (int i3 = 0; i3 < length; i3++) {
                            length = length;
                            String[] split2 = split[i3].split(str4);
                            split = split;
                            str4 = str4;
                            if (split2.length == 2) {
                                if (split2[0].equals("CHARSET")) {
                                    str5 = split2[1];
                                } else if (split2[0].equals("ENCODING")) {
                                    str6 = split2[1];
                                }
                            }
                        }
                        if (strArr[0].startsWith("N")) {
                            vcardData.name = strArr[1].replace(';', ' ').trim();
                        } else {
                            vcardData.name = strArr[1];
                        }
                        if (!(str6 == null || !str6.equalsIgnoreCase("QUOTED-PRINTABLE") || (decodeQuotedPrintable = decodeQuotedPrintable(getStringBytes(vcardData.name))) == null || decodeQuotedPrintable.length == 0)) {
                            vcardData.name = new String(decodeQuotedPrintable, str5);
                        }
                        arrayList2 = arrayList;
                        str3 = str2;
                        r3 = 0;
                        i2 = 0;
                    }
                    str2 = str3;
                    arrayList2 = arrayList;
                    str3 = str2;
                    r3 = 0;
                    i2 = 0;
                } else {
                    str3 = readLine.substring(i2, readLine.length() - 1);
                    r3 = 0;
                }
            }
        }
        bufferedReader.close();
        createInputStream.close();
        arrayList3 = null;
        for (int i4 = 0; i4 < arrayList4.size(); i4++) {
            VcardData vcardData2 = (VcardData) arrayList4.get(i4);
            if (vcardData2.name != null && !vcardData2.phones.isEmpty()) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                String str7 = vcardData2.phones.get(0);
                int i5 = 0;
                while (true) {
                    if (i5 >= vcardData2.phones.size()) {
                        break;
                    }
                    String str8 = vcardData2.phones.get(i5);
                    if (ContactsController.getInstance(i).contactsByShortPhone.get(str8.substring(Math.max(0, str8.length() - 7))) != null) {
                        str7 = str8;
                        break;
                    }
                    i5++;
                }
                TLRPC$TL_userContact_old2 tLRPC$TL_userContact_old2 = new TLRPC$TL_userContact_old2();
                tLRPC$TL_userContact_old2.phone = str7;
                tLRPC$TL_userContact_old2.first_name = vcardData2.name;
                tLRPC$TL_userContact_old2.last_name = "";
                tLRPC$TL_userContact_old2.id = 0L;
                TLRPC$TL_restrictionReason tLRPC$TL_restrictionReason = new TLRPC$TL_restrictionReason();
                tLRPC$TL_restrictionReason.text = vcardData2.vcard.toString();
                tLRPC$TL_restrictionReason.platform = "";
                tLRPC$TL_restrictionReason.reason = "";
                tLRPC$TL_userContact_old2.restriction_reason.add(tLRPC$TL_restrictionReason);
                arrayList3.add(tLRPC$TL_userContact_old2);
            }
        }
        return arrayList3;
    }

    public static Typeface getTypeface(String str) {
        Typeface typeface;
        Typeface typeface2;
        Hashtable<String, Typeface> hashtable = typefaceCache;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Typeface.Builder builder = new Typeface.Builder(ApplicationLoader.applicationContext.getAssets(), str);
                        if (str.contains("medium")) {
                            builder.setWeight(700);
                        }
                        if (str.contains("italic")) {
                            builder.setItalic(true);
                        }
                        typeface = builder.build();
                    } else {
                        typeface = Typeface.createFromAsset(ApplicationLoader.applicationContext.getAssets(), str);
                    }
                    hashtable.put(str, typeface);
                } catch (Exception e) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Could not get typeface '" + str + "' because " + e.getMessage());
                    }
                    return null;
                }
            }
            typeface2 = hashtable.get(str);
        }
        return typeface2;
    }

    public static boolean isWaitingForSms() {
        boolean z;
        synchronized (smsLock) {
            z = waitingForSms;
        }
        return z;
    }

    public static void setWaitingForSms(boolean z) {
        synchronized (smsLock) {
            waitingForSms = z;
            if (z) {
                SmsRetriever.getClient(ApplicationLoader.applicationContext).startSmsRetriever().addOnSuccessListener(AndroidUtilities$$ExternalSyntheticLambda6.INSTANCE);
            }
        }
    }

    public static void lambda$setWaitingForSms$5(Void r0) {
        if (BuildVars.DEBUG_VERSION) {
            FileLog.d("sms listener registered");
        }
    }

    public static int getShadowHeight() {
        float f = density;
        if (f >= 4.0f) {
            return 3;
        }
        return f >= 2.0f ? 2 : 1;
    }

    public static boolean isWaitingForCall() {
        boolean z;
        synchronized (callLock) {
            z = waitingForCall;
        }
        return z;
    }

    public static void setWaitingForCall(boolean z) {
        synchronized (callLock) {
            try {
                if (z) {
                    if (callReceiver == null) {
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                        Context context = ApplicationLoader.applicationContext;
                        CallReceiver callReceiver2 = new CallReceiver();
                        callReceiver = callReceiver2;
                        context.registerReceiver(callReceiver2, intentFilter);
                    }
                } else if (callReceiver != null) {
                    ApplicationLoader.applicationContext.unregisterReceiver(callReceiver);
                    callReceiver = null;
                }
            } catch (Exception unused) {
            }
            waitingForCall = z;
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

    public static java.lang.String[] getCurrentKeyboardLanguage() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getCurrentKeyboardLanguage():java.lang.String[]");
    }

    public static void hideKeyboard(View view) {
        if (view != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static ArrayList<File> getDataDirs() {
        File[] externalFilesDirs;
        ArrayList<File> arrayList = null;
        if (Build.VERSION.SDK_INT >= 19 && (externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null)) != null) {
            for (int i = 0; i < externalFilesDirs.length; i++) {
                if (externalFilesDirs[i] != null) {
                    externalFilesDirs[i].getAbsolutePath();
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(externalFilesDirs[i]);
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

    public static ArrayList<File> getRootDirs() {
        File[] externalFilesDirs;
        String absolutePath;
        int indexOf;
        ArrayList<File> arrayList = null;
        if (Build.VERSION.SDK_INT >= 19 && (externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null)) != null) {
            for (int i = 0; i < externalFilesDirs.length; i++) {
                if (externalFilesDirs[i] != null && (indexOf = (absolutePath = externalFilesDirs[i].getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(new File(absolutePath.substring(0, indexOf)));
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

    public static File getCacheDir() {
        String str;
        File file;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e) {
            FileLog.e(e);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    File[] externalCacheDirs = ApplicationLoader.applicationContext.getExternalCacheDirs();
                    int i = 0;
                    file = externalCacheDirs[0];
                    if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                        while (true) {
                            if (i < externalCacheDirs.length) {
                                if (externalCacheDirs[i] != null && externalCacheDirs[i].getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                    file = externalCacheDirs[i];
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                    }
                } else {
                    file = ApplicationLoader.applicationContext.getExternalCacheDir();
                }
                if (file != null) {
                    return file;
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        try {
            File cacheDir = ApplicationLoader.applicationContext.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        return new File("");
    }

    public static int dp(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(density * f);
    }

    public static int dpr(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return Math.round(density * f);
    }

    public static int dp2(float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.floor(density * f);
    }

    public static float dpf2(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return density * f;
    }

    public static void checkDisplaySize(Context context, Configuration configuration) {
        Display defaultDisplay;
        try {
            float f = density;
            float f2 = context.getResources().getDisplayMetrics().density;
            density = f2;
            if (firstConfigurationWas && Math.abs(f - f2) > 0.001d) {
                Theme.reloadAllResources(context);
            }
            boolean z = true;
            firstConfigurationWas = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            if (configuration.keyboard == 1 || configuration.hardKeyboardHidden != 1) {
                z = false;
            }
            usingHardwareInput = z;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(displaySize);
                screenRefreshRate = defaultDisplay.getRefreshRate();
            }
            int i = configuration.screenWidthDp;
            if (i != 0) {
                int ceil = (int) Math.ceil(i * density);
                if (Math.abs(displaySize.x - ceil) > 3) {
                    displaySize.x = ceil;
                }
            }
            int i2 = configuration.screenHeightDp;
            if (i2 != 0) {
                int ceil2 = (int) Math.ceil(i2 * density);
                if (Math.abs(displaySize.y - ceil2) > 3) {
                    displaySize.y = ceil2;
                }
            }
            if (roundMessageSize == 0) {
                if (isTablet()) {
                    roundMessageSize = (int) (getMinTabletSide() * 0.6f);
                    roundPlayingMessageSize = getMinTabletSide() - dp(28.0f);
                } else {
                    Point point = displaySize;
                    roundMessageSize = (int) (Math.min(point.x, point.y) * 0.6f);
                    Point point2 = displaySize;
                    roundPlayingMessageSize = Math.min(point2.x, point2.y) - dp(28.0f);
                }
                roundMessageInset = dp(2.0f);
            }
            if (BuildVars.LOGS_ENABLED) {
                if (statusBarHeight == 0) {
                    fillStatusBarHeight(context);
                }
                FileLog.e("density = " + density + " display size = " + displaySize.x + " " + displaySize.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + statusBarHeight + ", navbar height: " + navigationBarHeight);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static double fixLocationCoord(double d) {
        double d2 = (long) (d * 1000000.0d);
        Double.isNaN(d2);
        return d2 / 1000000.0d;
    }

    public static String formapMapUrl(int i, double d, double d2, int i2, int i3, boolean z, int i4, int i5) {
        int min = Math.min(2, (int) Math.ceil(density));
        int i6 = i5 == -1 ? MessagesController.getInstance(i).mapProvider : i5;
        if (i6 == 1 || i6 == 3) {
            String str = null;
            String[] strArr = {"ru_RU", "tr_TR"};
            LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
            for (int i7 = 0; i7 < 2; i7++) {
                if (strArr[i7].toLowerCase().contains(currentLocaleInfo.shortName)) {
                    str = strArr[i7];
                }
            }
            if (str == null) {
                str = "en_US";
            }
            return z ? String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", Double.valueOf(d2), Double.valueOf(d), Integer.valueOf(i4), Integer.valueOf(i2 * min), Integer.valueOf(i3 * min), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d), str) : String.format(Locale.US, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", Double.valueOf(d2), Double.valueOf(d), Integer.valueOf(i4), Integer.valueOf(i2 * min), Integer.valueOf(i3 * min), Integer.valueOf(min), str);
        }
        String str2 = MessagesController.getInstance(i).mapKey;
        return !TextUtils.isEmpty(str2) ? z ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(min), Double.valueOf(d), Double.valueOf(d2), str2) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(min), str2) : z ? String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(min), Double.valueOf(d), Double.valueOf(d2)) : String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(min));
    }

    public static float getPixelsInCM(float f, boolean z) {
        return (f / 2.54f) * (z ? displayMetrics.xdpi : displayMetrics.ydpi);
    }

    public static int getPeerLayerVersion(int i) {
        return Math.max(73, (i >> 16) & 65535);
    }

    public static void runOnUIThread(Runnable runnable) {
        runOnUIThread(runnable, 0L);
    }

    public static void runOnUIThread(Runnable runnable, long j) {
        if (ApplicationLoader.applicationHandler != null) {
            if (j == 0) {
                ApplicationLoader.applicationHandler.post(runnable);
            } else {
                ApplicationLoader.applicationHandler.postDelayed(runnable, j);
            }
        }
    }

    public static void cancelRunOnUIThread(Runnable runnable) {
        if (ApplicationLoader.applicationHandler != null) {
            ApplicationLoader.applicationHandler.removeCallbacks(runnable);
        }
    }

    public static boolean isTablet() {
        if (isTablet == null) {
            isTablet = Boolean.valueOf(ApplicationLoader.applicationContext != null && ApplicationLoader.applicationContext.getResources().getBoolean(R.bool.isTablet));
        }
        return isTablet.booleanValue();
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

    public static int getMinTabletSide() {
        if (!isSmallTablet()) {
            Point point = displaySize;
            int min = Math.min(point.x, point.y);
            int i = (min * 35) / 100;
            if (i < dp(320.0f)) {
                i = dp(320.0f);
            }
            return min - i;
        }
        Point point2 = displaySize;
        int min2 = Math.min(point2.x, point2.y);
        Point point3 = displaySize;
        int max = Math.max(point3.x, point3.y);
        int i2 = (max * 35) / 100;
        if (i2 < dp(320.0f)) {
            i2 = dp(320.0f);
        }
        return Math.min(min2, max - i2);
    }

    public static int getPhotoSize() {
        if (photoSize == null) {
            photoSize = 1280;
        }
        return photoSize.intValue();
    }

    public static void endIncomingCall() {
        if (hasCallPermissions) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", new Class[0]);
                declaredMethod.setAccessible(true);
                ITelephony iTelephony = (ITelephony) declaredMethod.invoke(telephonyManager, new Object[0]);
                ITelephony iTelephony2 = (ITelephony) declaredMethod.invoke(telephonyManager, new Object[0]);
                iTelephony2.silenceRinger();
                iTelephony2.endCall();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public static String obtainLoginPhoneCall(String str) {
        if (!hasCallPermissions) {
            return null;
        }
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "date"}, "type IN (3,1,5)", null, "date DESC LIMIT 5");
            while (query.moveToNext()) {
                String string = query.getString(0);
                long j = query.getLong(1);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("number = " + string);
                }
                if (Math.abs(System.currentTimeMillis() - j) < 3600000 && checkPhonePattern(str, string)) {
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

    public static boolean checkPhonePattern(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String stripExceptNumbers = PhoneFormat.stripExceptNumbers(str2);
            int i = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = stripExceptNumbers.indexOf(str3, i);
                    if (indexOf == -1) {
                        return false;
                    }
                    i = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static int getViewInset(View view) {
        int i;
        if (!(view == null || (i = Build.VERSION.SDK_INT) < 21 || view.getHeight() == displaySize.y || view.getHeight() == displaySize.y - statusBarHeight)) {
            try {
                if (i >= 23) {
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return 0;
    }

    public static Point getRealScreenSize() {
        Point point = new Point();
        try {
            WindowManager windowManager = (WindowManager) ApplicationLoader.applicationContext.getSystemService("window");
            if (Build.VERSION.SDK_INT >= 17) {
                windowManager.getDefaultDisplay().getRealSize(point);
            } else {
                try {
                    point.set(((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(windowManager.getDefaultDisplay(), new Object[0])).intValue(), ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(windowManager.getDefaultDisplay(), new Object[0])).intValue());
                } catch (Exception e) {
                    point.set(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight());
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return point;
    }

    public static void setEnabled(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    setEnabled(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static int charSequenceIndexOf(CharSequence charSequence, CharSequence charSequence2, int i) {
        while (i < charSequence.length() - charSequence2.length()) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= charSequence2.length()) {
                    z = true;
                    break;
                } else if (charSequence2.charAt(i2) != charSequence.charAt(i + i2)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int charSequenceIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        return charSequenceIndexOf(charSequence, charSequence2, 0);
    }

    public static boolean charSequenceContains(CharSequence charSequence, CharSequence charSequence2) {
        return charSequenceIndexOf(charSequence, charSequence2) != -1;
    }

    public static CharSequence getTrimmedString(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            while (charSequence.length() > 0 && (charSequence.charAt(0) == '\n' || charSequence.charAt(0) == ' ')) {
                charSequence = charSequence.subSequence(1, charSequence.length());
            }
            while (charSequence.length() > 0 && (charSequence.charAt(charSequence.length() - 1) == '\n' || charSequence.charAt(charSequence.length() - 1) == ' ')) {
                charSequence = charSequence.subSequence(0, charSequence.length() - 1);
            }
        }
        return charSequence;
    }

    public static void setViewPagerEdgeEffectColor(ViewPager viewPager, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Field declaredField = ViewPager.class.getDeclaredField("mLeftEdge");
                declaredField.setAccessible(true);
                EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(viewPager);
                if (edgeEffect != null) {
                    edgeEffect.setColor(i);
                }
                Field declaredField2 = ViewPager.class.getDeclaredField("mRightEdge");
                declaredField2.setAccessible(true);
                EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(viewPager);
                if (edgeEffect2 != null) {
                    edgeEffect2.setColor(i);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void setScrollViewEdgeEffectColor(HorizontalScrollView horizontalScrollView, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            horizontalScrollView.setEdgeEffectColor(i);
        } else if (i2 >= 21) {
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
                declaredField.setAccessible(true);
                EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(horizontalScrollView);
                if (edgeEffect != null) {
                    edgeEffect.setColor(i);
                }
                Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
                declaredField2.setAccessible(true);
                EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(horizontalScrollView);
                if (edgeEffect2 != null) {
                    edgeEffect2.setColor(i);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void setScrollViewEdgeEffectColor(ScrollView scrollView, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            scrollView.setTopEdgeEffectColor(i);
            scrollView.setBottomEdgeEffectColor(i);
        } else if (i2 >= 21) {
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
                declaredField.setAccessible(true);
                EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
                if (edgeEffect != null) {
                    edgeEffect.setColor(i);
                }
                Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
                declaredField2.setAccessible(true);
                EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
                if (edgeEffect2 != null) {
                    edgeEffect2.setColor(i);
                }
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void clearDrawableAnimation(View view) {
        if (Build.VERSION.SDK_INT >= 21 && view != null) {
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

    public static SpannableStringBuilder replaceTags(String str) {
        return replaceTags(str, 11, new Object[0]);
    }

    public static SpannableStringBuilder replaceTags(String str, int i, Object... objArr) {
        try {
            StringBuilder sb = new StringBuilder(str);
            if ((i & 1) != 0) {
                while (true) {
                    int indexOf = sb.indexOf("<br>");
                    if (indexOf != -1) {
                        sb.replace(indexOf, indexOf + 4, "\n");
                    }
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
            if ((i & 2) != 0) {
                while (true) {
                    int indexOf3 = sb.indexOf("<b>");
                    if (indexOf3 != -1) {
                        sb.replace(indexOf3, indexOf3 + 3, "");
                        int indexOf4 = sb.indexOf("</b>");
                        if (indexOf4 == -1) {
                            indexOf4 = sb.indexOf("<b>");
                        }
                        sb.replace(indexOf4, indexOf4 + 4, "");
                        arrayList.add(Integer.valueOf(indexOf3));
                        arrayList.add(Integer.valueOf(indexOf4));
                    }
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
            if ((i & 8) != 0) {
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
            for (int i2 = 0; i2 < arrayList.size() / 2; i2++) {
                int i3 = i2 * 2;
                spannableStringBuilder.setSpan(new TypefaceSpan(getTypeface("fonts/rmedium.ttf")), ((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList.get(i3 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            FileLog.e(e);
            return new SpannableStringBuilder(str);
        }
    }

    public static class LinkMovementMethodMy extends LinkMovementMethod {
        @Override
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            try {
                boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    Selection.removeSelection(spannable);
                }
                return onTouchEvent;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
    }

    public static boolean needShowPasscode() {
        return needShowPasscode(false);
    }

    public static boolean needShowPasscode(boolean z) {
        boolean isWasInBackground = ForegroundDetector.getInstance().isWasInBackground(z);
        if (z) {
            ForegroundDetector.getInstance().resetBackgroundVar();
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (BuildVars.LOGS_ENABLED && z && SharedConfig.passcodeHash.length() > 0) {
            FileLog.d("wasInBackground = " + isWasInBackground + " appLocked = " + SharedConfig.appLocked + " autoLockIn = " + SharedConfig.autoLockIn + " lastPauseTime = " + SharedConfig.lastPauseTime + " uptime = " + elapsedRealtime);
        }
        return SharedConfig.passcodeHash.length() > 0 && isWasInBackground && (SharedConfig.appLocked || ((SharedConfig.autoLockIn != 0 && SharedConfig.lastPauseTime != 0 && !SharedConfig.appLocked && SharedConfig.lastPauseTime + SharedConfig.autoLockIn <= elapsedRealtime) || elapsedRealtime + 5 < SharedConfig.lastPauseTime));
    }

    public static void shakeView(final View view, final float f, final int i) {
        if (view != null) {
            if (i == 6) {
                view.setTranslationX(0.0f);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationX", dp(f)));
            animatorSet.setDuration(50L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    int i2 = i;
                    AndroidUtilities.shakeView(view2, i2 == 5 ? 0.0f : -f, i2 + 1);
                }
            });
            animatorSet.start();
        }
    }

    public static void shakeViewSpring(View view) {
        shakeViewSpring(view, 10.0f, null);
    }

    public static void shakeViewSpring(View view, float f) {
        shakeViewSpring(view, f, null);
    }

    public static void shakeViewSpring(View view, Runnable runnable) {
        shakeViewSpring(view, 10.0f, runnable);
    }

    public static void shakeViewSpring(View view, float f, final Runnable runnable) {
        new SpringAnimation(view, DynamicAnimation.TRANSLATION_X, 0.0f).setSpring(new SpringForce(0.0f).setStiffness(600.0f)).setStartVelocity((-dp(f)) * 100).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
                AndroidUtilities.lambda$shakeViewSpring$6(runnable, dynamicAnimation, z, f2, f3);
            }
        }).start();
    }

    public static void lambda$shakeViewSpring$6(Runnable runnable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void startAppCenter(Activity activity) {
        try {
            if (BuildVars.DEBUG_VERSION) {
                Distribute.setEnabledForDebuggableBuild(true);
                AppCenter.start(activity.getApplication(), BuildVars.DEBUG_VERSION ? BuildVars.APPCENTER_HASH_DEBUG : BuildVars.APPCENTER_HASH, Distribute.class, Crashes.class);
                AppCenter.setUserId("uid=" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void checkForUpdates() {
        try {
            if (BuildVars.DEBUG_VERSION && SystemClock.elapsedRealtime() - lastUpdateCheckTime >= 3600000) {
                lastUpdateCheckTime = SystemClock.elapsedRealtime();
                Distribute.checkForUpdate();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void appCenterLog(Throwable th) {
        try {
            Crashes.trackError(th);
        } catch (Throwable unused) {
        }
    }

    public static boolean shouldShowClipboardToast() {
        return Build.VERSION.SDK_INT < 31 || !OneUIUtilities.hasBuiltInClipboardToasts();
    }

    public static void addToClipboard(CharSequence charSequence) {
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", charSequence));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void addMediaToGallery(String str) {
        if (str != null) {
            addMediaToGallery(new File(str));
        }
    }

    public static void addMediaToGallery(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile != null) {
            try {
                Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                intent.setData(fromFile);
                ApplicationLoader.applicationContext.sendBroadcast(intent);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private static File getAlbumDir(boolean z) {
        if (z || !BuildVars.NO_SCOPED_STORAGE || (Build.VERSION.SDK_INT >= 23 && ApplicationLoader.applicationContext.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0)) {
            return FileLoader.getDirectory(0);
        }
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
            if (file.mkdirs() || file.exists()) {
                return file;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("failed to create directory");
            }
            return null;
        } else if (!BuildVars.LOGS_ENABLED) {
            return null;
        } else {
            FileLog.d("External storage is not mounted READ/WRITE.");
            return null;
        }
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static java.lang.String getPath(android.net.Uri r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getPath(android.net.Uri):java.lang.String");
    }

    public static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Cursor query;
        try {
            query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
        } catch (Exception unused) {
        }
        if (query == null || !query.moveToFirst()) {
            if (query != null) {
                query.close();
            }
            return null;
        }
        String string = query.getString(query.getColumnIndexOrThrow("_data"));
        if (string.startsWith("content://") || (!string.startsWith("/") && !string.startsWith("file://"))) {
            query.close();
            return null;
        }
        query.close();
        return string;
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static File generatePicturePath() {
        return generatePicturePath(false, null);
    }

    public static File generatePicturePath(boolean z, String str) {
        try {
            return new File(ApplicationLoader.applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES), generateFileName(0, str));
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String generateFileName(int i, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.random.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("IMG_");
            sb.append(format);
            sb.append(".");
            if (TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            sb.append(str);
            return sb.toString();
        }
        return "VID_" + format + ".mp4";
    }

    public static CharSequence generateSearchName(String str, String str2, String str3) {
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str == null || str.length() == 0) {
            str = str2;
        } else if (!(str2 == null || str2.length() == 0)) {
            str = str + " " + str2;
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i);
            if (indexOf == -1) {
                break;
            }
            int i2 = 1;
            int i3 = indexOf - (indexOf == 0 ? 0 : 1);
            int length = str3.length();
            if (indexOf == 0) {
                i2 = 0;
            }
            int i4 = length + i2 + i3;
            if (i != 0 && i != i3 + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i, i3));
            } else if (i == 0 && i3 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i3));
            }
            String substring = trim.substring(i3, Math.min(trim.length(), i4));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable("windowBackgroundWhiteBlueText4"), length2, trim2.length() + length2, 33);
            i = i4;
        }
        if (i != -1 && i < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i));
        }
        return spannableStringBuilder;
    }

    public static boolean isKeyguardSecure() {
        return ((KeyguardManager) ApplicationLoader.applicationContext.getSystemService("keyguard")).isKeyguardSecure();
    }

    public static boolean isSimAvailable() {
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        return (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || isAirplaneModeOn()) ? false : true;
    }

    public static boolean isAirplaneModeOn() {
        return Build.VERSION.SDK_INT < 17 ? Settings.System.getInt(ApplicationLoader.applicationContext.getContentResolver(), "airplane_mode_on", 0) != 0 : Settings.Global.getInt(ApplicationLoader.applicationContext.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static File generateVideoPath() {
        return generateVideoPath(false);
    }

    public static File generateVideoPath(boolean z) {
        try {
            File albumDir = getAlbumDir(z);
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

    public static String formatFileSize(long j) {
        return formatFileSize(j, false);
    }

    public static String formatFileSize(long j, boolean z) {
        if (j < 1024) {
            return String.format("%d B", Long.valueOf(j));
        }
        if (j < 1048576) {
            float f = ((float) j) / 1024.0f;
            if (z) {
                int i = (int) f;
                if ((f - i) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f));
        } else if (j < 1073741824) {
            float f2 = (((float) j) / 1024.0f) / 1024.0f;
            if (z) {
                int i2 = (int) f2;
                if ((f2 - i2) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i2));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f2));
        } else {
            float f3 = ((((float) j) / 1024.0f) / 1024.0f) / 1024.0f;
            if (z) {
                int i3 = (int) f3;
                if ((f3 - i3) * 10.0f == 0.0f) {
                    return String.format("%d GB", Integer.valueOf(i3));
                }
            }
            return String.format("%.1f GB", Float.valueOf(f3));
        }
    }

    public static String formatShortDuration(int i) {
        return formatDuration(i, false);
    }

    public static String formatLongDuration(int i) {
        return formatDuration(i, true);
    }

    public static String formatDuration(int i, boolean z) {
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        return i2 == 0 ? z ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String formatFullDuration(int i) {
        int i2 = i / 3600;
        int i3 = (i / 60) % 60;
        int i4 = i % 60;
        return i < 0 ? String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i2)), Integer.valueOf(Math.abs(i3)), Integer.valueOf(Math.abs(i4))) : String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String formatDurationNoHours(int i, boolean z) {
        int i2 = i / 60;
        int i3 = i % 60;
        return z ? String.format(Locale.US, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3)) : String.format(Locale.US, "%d:%02d", Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String formatShortDuration(int i, int i2) {
        return formatDuration(i, i2, false);
    }

    public static String formatLongDuration(int i, int i2) {
        return formatDuration(i, i2, true);
    }

    public static String formatDuration(int i, int i2, boolean z) {
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        int i6 = i / 3600;
        int i7 = (i / 60) % 60;
        int i8 = i % 60;
        return i2 == 0 ? i6 == 0 ? z ? String.format(Locale.US, "%02d:%02d / -:--", Integer.valueOf(i7), Integer.valueOf(i8)) : String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i7), Integer.valueOf(i8)) : String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)) : (i6 == 0 && i3 == 0) ? z ? String.format(Locale.US, "%02d:%02d / %02d:%02d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String formatVideoDuration(int i, int i2) {
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        int i6 = i / 3600;
        int i7 = (i / 60) % 60;
        int i8 = i % 60;
        return (i6 == 0 && i3 == 0) ? String.format(Locale.US, "%02d:%02d / %02d:%02d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i5)) : i3 == 0 ? String.format(Locale.US, "%d:%02d:%02d / %02d:%02d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i5)) : i6 == 0 ? String.format(Locale.US, "%02d:%02d / %d:%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)) : String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String formatCount(int i) {
        if (i < 1000) {
            return Integer.toString(i);
        }
        ArrayList arrayList = new ArrayList();
        while (i != 0) {
            int i2 = i % 1000;
            i /= 1000;
            if (i > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i2)));
            } else {
                arrayList.add(Integer.toString(i2));
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

    public static String formatWholeNumber(int i, int i2) {
        if (i == 0) {
            return "0";
        }
        float f = i;
        if (i2 == 0) {
            i2 = i;
        }
        if (i2 < 1000) {
            return formatCount(i);
        }
        int i3 = 0;
        while (i2 >= 1000 && i3 < numbersSignatureArray.length - 1) {
            i2 /= 1000;
            f /= 1000.0f;
            i3++;
        }
        if (f < 0.1d) {
            return "0";
        }
        float f2 = f * 10.0f;
        float f3 = (int) f2;
        return f2 == f3 ? String.format(Locale.ENGLISH, "%s%s", formatCount((int) f), numbersSignatureArray[i3]) : String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f3 / 10.0f), numbersSignatureArray[i3]);
    }

    public static byte[] decodeQuotedPrintable(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                int i2 = i + 1;
                try {
                    int digit = Character.digit((char) bArr[i2], 16);
                    i = i2 + 1;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i], 16)));
                } catch (Exception e) {
                    FileLog.e(e);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return byteArray;
    }

    public static boolean copyFile(InputStream inputStream, File file) throws IOException {
        return copyFile(inputStream, new FileOutputStream(file));
    }

    public static boolean copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
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

    public static boolean copyFile(File file, File file2) throws IOException {
        if (file.equals(file2)) {
            return true;
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.getChannel().transferFrom(fileInputStream.getChannel(), 0L, fileInputStream.getChannel().size());
            fileOutputStream.close();
            fileInputStream.close();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static byte[] calcAuthKeyHash(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(Utilities.computeSHA1(bArr), 0, bArr2, 0, 16);
        return bArr2;
    }

    public static void openDocument(MessageObject messageObject, Activity activity, BaseFragment baseFragment) {
        TLRPC$Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            String attachFileName = messageObject.messageOwner.media != null ? FileLoader.getAttachFileName(document) : "";
            String str2 = messageObject.messageOwner.attachPath;
            File file = (str2 == null || str2.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(messageObject.messageOwner);
            }
            if (file != null && file.exists()) {
                if (baseFragment == null || !file.getName().toLowerCase().endsWith("attheme")) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(1);
                        MimeTypeMap singleton = MimeTypeMap.getSingleton();
                        int lastIndexOf = attachFileName.lastIndexOf(46);
                        if (lastIndexOf == -1 || ((str = singleton.getMimeTypeFromExtension(attachFileName.substring(lastIndexOf + 1).toLowerCase())) == null && ((str = document.mime_type) == null || str.length() == 0))) {
                            str = null;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.setDataAndType(FileProvider.getUriForFile(activity, "org.telegram.messenger.beta.provider", file), str != null ? str : "text/plain");
                        } else {
                            intent.setDataAndType(Uri.fromFile(file), str != null ? str : "text/plain");
                        }
                        if (str != null) {
                            try {
                                activity.startActivityForResult(intent, 500);
                            } catch (Exception unused) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent.setDataAndType(FileProvider.getUriForFile(activity, "org.telegram.messenger.beta.provider", file), "text/plain");
                                } else {
                                    intent.setDataAndType(Uri.fromFile(file), "text/plain");
                                }
                                activity.startActivityForResult(intent, 500);
                            }
                        } else {
                            activity.startActivityForResult(intent, 500);
                        }
                    } catch (Exception unused2) {
                        if (activity != null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                            builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
                            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
                            builder.setMessage(LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type));
                            if (baseFragment != null) {
                                baseFragment.showDialog(builder.create());
                            } else {
                                builder.show();
                            }
                        }
                    }
                } else {
                    Theme.ThemeInfo applyThemeFile = Theme.applyThemeFile(file, messageObject.getDocumentName(), null, true);
                    if (applyThemeFile != null) {
                        baseFragment.presentFragment(new ThemePreviewActivity(applyThemeFile));
                        return;
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(activity);
                    builder2.setTitle(LocaleController.getString("AppName", R.string.AppName));
                    builder2.setMessage(LocaleController.getString("IncorrectTheme", R.string.IncorrectTheme));
                    builder2.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
                    baseFragment.showDialog(builder2.create());
                }
            }
        }
    }

    public static boolean openForView(java.io.File r6, java.lang.String r7, java.lang.String r8, android.app.Activity r9, org.telegram.ui.ActionBar.Theme.ResourcesProvider r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.openForView(java.io.File, java.lang.String, java.lang.String, android.app.Activity, org.telegram.ui.ActionBar.Theme$ResourcesProvider):boolean");
    }

    public static boolean openForView(MessageObject messageObject, Activity activity, Theme.ResourcesProvider resourcesProvider) {
        String str = messageObject.messageOwner.attachPath;
        String str2 = null;
        File file = (str == null || str.length() == 0) ? null : new File(messageObject.messageOwner.attachPath);
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner);
        }
        int i = messageObject.type;
        if (i == 9 || i == 0) {
            str2 = messageObject.getMimeType();
        }
        return openForView(file, messageObject.getFileName(), str2, activity, resourcesProvider);
    }

    public static boolean openForView(TLRPC$Document tLRPC$Document, boolean z, Activity activity) {
        return openForView(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$Document, true), FileLoader.getAttachFileName(tLRPC$Document), tLRPC$Document.mime_type, activity, null);
    }

    public static SpannableStringBuilder formatSpannableSimple(String str, CharSequence... charSequenceArr) {
        return formatSpannable(str, AndroidUtilities$$ExternalSyntheticLambda12.INSTANCE, charSequenceArr);
    }

    public static SpannableStringBuilder formatSpannable(String str, CharSequence... charSequenceArr) {
        if (str.contains("%s")) {
            return formatSpannableSimple(str, charSequenceArr);
        }
        return formatSpannable(str, AndroidUtilities$$ExternalSyntheticLambda11.INSTANCE, charSequenceArr);
    }

    public static String lambda$formatSpannable$8(Integer num) {
        return "%" + (num.intValue() + 1) + "$s";
    }

    public static SpannableStringBuilder formatSpannable(String str, GenericProvider<Integer, String> genericProvider, CharSequence... charSequenceArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < charSequenceArr.length; i++) {
            String provide = genericProvider.provide(Integer.valueOf(i));
            int indexOf = str.indexOf(provide);
            if (indexOf != -1) {
                spannableStringBuilder.replace(indexOf, provide.length() + indexOf, charSequenceArr[i]);
                str = str.substring(0, indexOf) + charSequenceArr[i].toString() + str.substring(indexOf + provide.length());
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence replaceTwoNewLinesToOne(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            int length = charSequence.length();
            int i = 0;
            while (i < length - 2) {
                int i2 = i + 2;
                sb.getChars(i, i2, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb = sb.replace(i, i2, "\n");
                    i--;
                    length--;
                }
                i++;
            }
            return charSequence;
        } else if (!(charSequence instanceof SpannableStringBuilder)) {
            return charSequence.toString().replace("\n\n", "\n");
        } else {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i3 = 0;
            while (i3 < length2 - 2) {
                int i4 = i3 + 2;
                spannableStringBuilder.getChars(i3, i4, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder = spannableStringBuilder.replace(i3, i4, (CharSequence) "\n");
                    i3--;
                    length2--;
                }
                i3++;
            }
            return charSequence;
        }
    }

    public static CharSequence replaceNewLines(CharSequence charSequence) {
        int i = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            int length = charSequence.length();
            while (i < length) {
                if (charSequence.charAt(i) == '\n') {
                    sb.setCharAt(i, ' ');
                }
                i++;
            }
            return charSequence;
        } else if (!(charSequence instanceof SpannableStringBuilder)) {
            return charSequence.toString().replace('\n', ' ');
        } else {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i < length2) {
                if (charSequence.charAt(i) == '\n') {
                    spannableStringBuilder.replace(i, i + 1, (CharSequence) " ");
                }
                i++;
            }
            return charSequence;
        }
    }

    public static boolean openForView(org.telegram.tgnet.TLObject r8, android.app.Activity r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.openForView(org.telegram.tgnet.TLObject, android.app.Activity):boolean");
    }

    public static boolean isBannedForever(TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights) {
        return tLRPC$TL_chatBannedRights == null || Math.abs(((long) tLRPC$TL_chatBannedRights.until_date) - (System.currentTimeMillis() / 1000)) > 157680000;
    }

    public static void setRectToRect(Matrix matrix, RectF rectF, RectF rectF2, int i, boolean z) {
        float f;
        float f2;
        float f3;
        boolean z2;
        float f4;
        float f5;
        float f6;
        float f7;
        if (i == 90 || i == 270) {
            f3 = rectF2.height() / rectF.width();
            f2 = rectF2.width();
            f = rectF.height();
        } else {
            f3 = rectF2.width() / rectF.width();
            f2 = rectF2.height();
            f = rectF.height();
        }
        float f8 = f2 / f;
        if (f3 < f8) {
            f3 = f8;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            matrix.setTranslate(rectF2.left, rectF2.top);
        }
        if (i == 90) {
            matrix.preRotate(90.0f);
            matrix.preTranslate(0.0f, -rectF2.width());
        } else if (i == 180) {
            matrix.preRotate(180.0f);
            matrix.preTranslate(-rectF2.width(), -rectF2.height());
        } else if (i == 270) {
            matrix.preRotate(270.0f);
            matrix.preTranslate(-rectF2.height(), 0.0f);
        }
        if (z) {
            f4 = (-rectF.left) * f3;
            f5 = (-rectF.top) * f3;
        } else {
            f4 = rectF2.left - (rectF.left * f3);
            f5 = rectF2.top - (rectF.top * f3);
        }
        if (z2) {
            f6 = rectF2.width();
            f7 = rectF.width();
        } else {
            f6 = rectF2.height();
            f7 = rectF.height();
        }
        float f9 = (f6 - (f7 * f3)) / 2.0f;
        if (z2) {
            f4 += f9;
        } else {
            f5 += f9;
        }
        matrix.preScale(f3, f3);
        if (z) {
            matrix.preTranslate(f4, f5);
        }
    }

    public static boolean isAccessibilityTouchExplorationEnabled() {
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
        }
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean handleProxyIntent(android.app.Activity r16, android.content.Intent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.handleProxyIntent(android.app.Activity, android.content.Intent):boolean");
    }

    public static boolean shouldEnableAnimation() {
        int i = Build.VERSION.SDK_INT;
        return i < 26 || i >= 28 || (!((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).isPowerSaveMode() && Settings.Global.getFloat(ApplicationLoader.applicationContext.getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f);
    }

    public static void showProxyAlert(Activity activity, final String str, final String str2, final String str3, final String str4, final String str5) {
        String str6;
        BottomSheet.Builder builder = new BottomSheet.Builder(activity);
        final Runnable dismissRunnable = builder.getDismissRunnable();
        builder.setApplyTopPadding(false);
        builder.setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(activity);
        builder.setCustomView(linearLayout);
        linearLayout.setOrientation(1);
        if (!TextUtils.isEmpty(str5)) {
            TextView textView = new TextView(activity);
            textView.setText(LocaleController.getString("UseProxyTelegramInfo2", R.string.UseProxyTelegramInfo2));
            textView.setTextColor(Theme.getColor("dialogTextGray4"));
            textView.setTextSize(1, 14.0f);
            textView.setGravity(49);
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 17, 8, 17, 8));
            View view = new View(activity);
            view.setBackgroundColor(Theme.getColor("divider"));
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 1));
        }
        for (int i = 0; i < 5; i++) {
            String str7 = null;
            if (i == 0) {
                str6 = LocaleController.getString("UseProxyAddress", R.string.UseProxyAddress);
                str7 = str;
            } else if (i == 1) {
                str7 = "" + str2;
                str6 = LocaleController.getString("UseProxyPort", R.string.UseProxyPort);
            } else if (i == 2) {
                str6 = LocaleController.getString("UseProxySecret", R.string.UseProxySecret);
                str7 = str5;
            } else if (i == 3) {
                str6 = LocaleController.getString("UseProxyUsername", R.string.UseProxyUsername);
                str7 = str3;
            } else if (i == 4) {
                str6 = LocaleController.getString("UseProxyPassword", R.string.UseProxyPassword);
                str7 = str4;
            } else {
                str6 = null;
            }
            if (!TextUtils.isEmpty(str7)) {
                TextDetailSettingsCell textDetailSettingsCell = new TextDetailSettingsCell(activity);
                textDetailSettingsCell.setTextAndValue(str7, str6, true);
                textDetailSettingsCell.getTextView().setTextColor(Theme.getColor("dialogTextBlack"));
                textDetailSettingsCell.getValueTextView().setTextColor(Theme.getColor("dialogTextGray3"));
                linearLayout.addView(textDetailSettingsCell, LayoutHelper.createLinear(-1, -2));
                if (i == 2) {
                    break;
                }
            }
        }
        PickerBottomLayout pickerBottomLayout = new PickerBottomLayout(activity, false);
        pickerBottomLayout.setBackgroundColor(Theme.getColor("dialogBackground"));
        linearLayout.addView(pickerBottomLayout, LayoutHelper.createFrame(-1, 48, 83));
        pickerBottomLayout.cancelButton.setPadding(dp(18.0f), 0, dp(18.0f), 0);
        pickerBottomLayout.cancelButton.setTextColor(Theme.getColor("dialogTextBlue2"));
        pickerBottomLayout.cancelButton.setText(LocaleController.getString("Cancel", R.string.Cancel).toUpperCase());
        pickerBottomLayout.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                dismissRunnable.run();
            }
        });
        pickerBottomLayout.doneButtonTextView.setTextColor(Theme.getColor("dialogTextBlue2"));
        pickerBottomLayout.doneButton.setPadding(dp(18.0f), 0, dp(18.0f), 0);
        pickerBottomLayout.doneButtonBadgeTextView.setVisibility(8);
        pickerBottomLayout.doneButtonTextView.setText(LocaleController.getString("ConnectingConnectProxy", R.string.ConnectingConnectProxy).toUpperCase());
        pickerBottomLayout.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                AndroidUtilities.lambda$showProxyAlert$10(str, str2, str5, str4, str3, dismissRunnable, view2);
            }
        });
        builder.show();
    }

    public static void lambda$showProxyAlert$10(String str, String str2, String str3, String str4, String str5, Runnable runnable, View view) {
        SharedConfig.ProxyInfo proxyInfo;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("proxy_enabled", true);
        edit.putString("proxy_ip", str);
        int intValue = Utilities.parseInt(str2).intValue();
        edit.putInt("proxy_port", intValue);
        if (TextUtils.isEmpty(str3)) {
            edit.remove("proxy_secret");
            if (TextUtils.isEmpty(str4)) {
                edit.remove("proxy_pass");
            } else {
                edit.putString("proxy_pass", str4);
            }
            if (TextUtils.isEmpty(str5)) {
                edit.remove("proxy_user");
            } else {
                edit.putString("proxy_user", str5);
            }
            proxyInfo = new SharedConfig.ProxyInfo(str, intValue, str5, str4, "");
        } else {
            edit.remove("proxy_pass");
            edit.remove("proxy_user");
            edit.putString("proxy_secret", str3);
            proxyInfo = new SharedConfig.ProxyInfo(str, intValue, "", "", str3);
        }
        edit.commit();
        SharedConfig.currentProxy = SharedConfig.addProxy(proxyInfo);
        ConnectionsManager.setProxySettings(true, str, intValue, str5, str4, str3);
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.proxySettingsChanged, new Object[0]);
        runnable.run();
    }

    @SuppressLint({"PrivateApi"})
    public static String getSystemProperty(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void fixGoogleMapsBug() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("google_bug_154855417", 0);
        if (!sharedPreferences.contains("fixed")) {
            new File(ApplicationLoader.getFilesDirFixed(), "ZoomTables.data").delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        }
    }

    public static CharSequence concat(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i = 0;
        boolean z = true;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        int length = charSequenceArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (charSequenceArr[i2] instanceof Spanned) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int length2 = charSequenceArr.length;
            while (i < length2) {
                CharSequence charSequence = charSequenceArr[i];
                if (charSequence == null) {
                    charSequence = "null";
                }
                spannableStringBuilder.append(charSequence);
                i++;
            }
            return new SpannedString(spannableStringBuilder);
        }
        StringBuilder sb = new StringBuilder();
        int length3 = charSequenceArr.length;
        while (i < length3) {
            sb.append(charSequenceArr[i]);
            i++;
        }
        return sb.toString();
    }

    public static float[] RGBtoHSB(int i, int i2, int i3) {
        float[] fArr = new float[3];
        int max = Math.max(i, i2);
        if (i3 > max) {
            max = i3;
        }
        int min = Math.min(i, i2);
        if (i3 < min) {
            min = i3;
        }
        float f = max;
        float f2 = f / 255.0f;
        float f3 = 0.0f;
        float f4 = max != 0 ? (max - min) / f : 0.0f;
        if (f4 != 0.0f) {
            float f5 = max - min;
            float f6 = (max - i) / f5;
            float f7 = (max - i2) / f5;
            float f8 = (max - i3) / f5;
            float f9 = (i == max ? f8 - f7 : i2 == max ? (f6 + 2.0f) - f8 : (f7 + 4.0f) - f6) / 6.0f;
            f3 = f9 < 0.0f ? f9 + 1.0f : f9;
        }
        fArr[0] = f3;
        fArr[1] = f4;
        fArr[2] = f2;
        return fArr;
    }

    public static int HSBtoRGB(float f, float f2, float f3) {
        int i;
        int i2;
        int i3 = 0;
        if (f2 == 0.0f) {
            i3 = (int) ((f3 * 255.0f) + 0.5f);
            i2 = i3;
            i = i2;
        } else {
            float floor = (f - ((float) Math.floor(f))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f4 = (1.0f - f2) * f3;
            float f5 = (1.0f - (f2 * floor2)) * f3;
            float f6 = (1.0f - (f2 * (1.0f - floor2))) * f3;
            int i4 = (int) floor;
            if (i4 == 0) {
                i3 = (int) ((f3 * 255.0f) + 0.5f);
                i2 = (int) ((f6 * 255.0f) + 0.5f);
            } else if (i4 == 1) {
                i3 = (int) ((f5 * 255.0f) + 0.5f);
                i2 = (int) ((f3 * 255.0f) + 0.5f);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    i3 = (int) ((f4 * 255.0f) + 0.5f);
                    i2 = (int) ((f5 * 255.0f) + 0.5f);
                } else if (i4 == 4) {
                    i3 = (int) ((f6 * 255.0f) + 0.5f);
                    i2 = (int) ((f4 * 255.0f) + 0.5f);
                } else if (i4 != 5) {
                    i2 = 0;
                    i = 0;
                } else {
                    i3 = (int) ((f3 * 255.0f) + 0.5f);
                    i2 = (int) ((f4 * 255.0f) + 0.5f);
                    i = (int) ((f5 * 255.0f) + 0.5f);
                }
                i = (int) ((f3 * 255.0f) + 0.5f);
            } else {
                i3 = (int) ((f4 * 255.0f) + 0.5f);
                i2 = (int) ((f3 * 255.0f) + 0.5f);
                i = (int) ((f6 * 255.0f) + 0.5f);
            }
            i = (int) ((f4 * 255.0f) + 0.5f);
        }
        return ((i2 & 255) << 8) | (-16777216) | ((i3 & 255) << 16) | (i & 255);
    }

    public static float computePerceivedBrightness(int i) {
        return (((Color.red(i) * 0.2126f) + (Color.green(i) * 0.7152f)) + (Color.blue(i) * 0.0722f)) / 255.0f;
    }

    public static int getPatternColor(int i) {
        return getPatternColor(i, false);
    }

    public static int getPatternColor(int i, boolean z) {
        float[] RGBtoHSB = RGBtoHSB(Color.red(i), Color.green(i), Color.blue(i));
        if (RGBtoHSB[1] > 0.0f || (RGBtoHSB[2] < 1.0f && RGBtoHSB[2] > 0.0f)) {
            RGBtoHSB[1] = Math.min(1.0f, RGBtoHSB[1] + (z ? 0.15f : 0.05f) + ((1.0f - RGBtoHSB[1]) * 0.1f));
        }
        if (z || RGBtoHSB[2] > 0.5f) {
            RGBtoHSB[2] = Math.max(0.0f, RGBtoHSB[2] * 0.65f);
        } else {
            RGBtoHSB[2] = Math.max(0.0f, Math.min(1.0f, 1.0f - (RGBtoHSB[2] * 0.65f)));
        }
        return HSBtoRGB(RGBtoHSB[0], RGBtoHSB[1], RGBtoHSB[2]) & (z ? -1711276033 : 1728053247);
    }

    public static int getPatternSideColor(int i) {
        float[] RGBtoHSB = RGBtoHSB(Color.red(i), Color.green(i), Color.blue(i));
        RGBtoHSB[1] = Math.min(1.0f, RGBtoHSB[1] + 0.05f);
        if (RGBtoHSB[2] > 0.5f) {
            RGBtoHSB[2] = Math.max(0.0f, RGBtoHSB[2] * 0.9f);
        } else {
            RGBtoHSB[2] = Math.max(0.0f, RGBtoHSB[2] * 0.9f);
        }
        return HSBtoRGB(RGBtoHSB[0], RGBtoHSB[1], RGBtoHSB[2]) | (-16777216);
    }

    public static String getWallPaperUrl(Object obj) {
        if (obj instanceof TLRPC$TL_wallPaper) {
            TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) obj;
            String str = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + tLRPC$TL_wallPaper.slug;
            StringBuilder sb = new StringBuilder();
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings = tLRPC$TL_wallPaper.settings;
            if (tLRPC$WallPaperSettings != null) {
                if (tLRPC$WallPaperSettings.blur) {
                    sb.append("blur");
                }
                if (tLRPC$TL_wallPaper.settings.motion) {
                    if (sb.length() > 0) {
                        sb.append("+");
                    }
                    sb.append("motion");
                }
            }
            if (sb.length() <= 0) {
                return str;
            }
            return str + "?mode=" + sb.toString();
        } else if (obj instanceof WallpapersListActivity.ColorWallpaper) {
            return ((WallpapersListActivity.ColorWallpaper) obj).getUrl();
        } else {
            return null;
        }
    }

    public static float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public static void makeAccessibilityAnnouncement(CharSequence charSequence) {
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) ApplicationLoader.applicationContext.getSystemService("accessibility");
        if (accessibilityManager2.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(16384);
            obtain.getText().add(charSequence);
            accessibilityManager2.sendAccessibilityEvent(obtain);
        }
    }

    public static int getOffsetColor(int i, int i2, float f, float f2) {
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        int alpha = Color.alpha(i2);
        int red2 = Color.red(i);
        int green2 = Color.green(i);
        int blue2 = Color.blue(i);
        int alpha2 = Color.alpha(i);
        return Color.argb((int) ((alpha2 + ((alpha - alpha2) * f)) * f2), (int) (red2 + ((red - red2) * f)), (int) (green2 + ((green - green2) * f)), (int) (blue2 + ((blue - blue2) * f)));
    }

    public static int indexOfIgnoreCase(String str, String str2) {
        if (str2.isEmpty() || str.isEmpty()) {
            return str.indexOf(str2);
        }
        for (int i = 0; i < str.length() && str2.length() + i <= str.length(); i++) {
            int i2 = 0;
            for (int i3 = i; i3 < str.length() && i2 < str2.length() && Character.toLowerCase(str.charAt(i3)) == Character.toLowerCase(str2.charAt(i2)); i3++) {
                i2++;
            }
            if (i2 == str2.length()) {
                return i;
            }
        }
        return -1;
    }

    public static float lerp(float[] fArr, float f) {
        return lerp(fArr[0], fArr[1], f);
    }

    public static int lerpColor(int i, int i2, float f) {
        return Color.argb(lerp(Color.alpha(i), Color.alpha(i2), f), lerp(Color.red(i), Color.red(i2), f), lerp(Color.green(i), Color.green(i2), f), lerp(Color.blue(i), Color.blue(i2), f));
    }

    public static void lerp(RectF rectF, RectF rectF2, float f, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(lerp(rectF.left, rectF2.left, f), lerp(rectF.top, rectF2.top, f), lerp(rectF.right, rectF2.right, f), lerp(rectF.bottom, rectF2.bottom, f));
        }
    }

    public static void lerp(Rect rect, Rect rect2, float f, Rect rect3) {
        if (rect3 != null) {
            rect3.set(lerp(rect.left, rect2.left, f), lerp(rect.top, rect2.top, f), lerp(rect.right, rect2.right, f), lerp(rect.bottom, rect2.bottom, f));
        }
    }

    public static float computeDampingRatio(float f, float f2, float f3) {
        return f2 / (((float) Math.sqrt(f3 * f)) * 2.0f);
    }

    public static boolean hasFlagSecureFragment() {
        return flagSecureFragment != null;
    }

    public static void setFlagSecure(BaseFragment baseFragment, boolean z) {
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (z) {
                try {
                    baseFragment.getParentActivity().getWindow().setFlags(8192, 8192);
                    flagSecureFragment = new WeakReference<>(baseFragment);
                } catch (Exception unused) {
                }
            } else {
                WeakReference<BaseFragment> weakReference = flagSecureFragment;
                if (weakReference != null && weakReference.get() == baseFragment) {
                    try {
                        baseFragment.getParentActivity().getWindow().clearFlags(8192);
                    } catch (Exception unused2) {
                    }
                    flagSecureFragment = null;
                }
            }
        }
    }

    public static Runnable registerFlagSecure(final Window window) {
        final ArrayList<Long> arrayList;
        final long random = (long) (Math.random() * 9.99999999E8d);
        HashMap<Window, ArrayList<Long>> hashMap = flagSecureReasons;
        if (hashMap.containsKey(window)) {
            arrayList = hashMap.get(window);
        } else {
            ArrayList<Long> arrayList2 = new ArrayList<>();
            hashMap.put(window, arrayList2);
            arrayList = arrayList2;
        }
        arrayList.add(Long.valueOf(random));
        updateFlagSecure(window);
        return new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.lambda$registerFlagSecure$11(arrayList, random, window);
            }
        };
    }

    public static void lambda$registerFlagSecure$11(ArrayList arrayList, long j, Window window) {
        arrayList.remove(Long.valueOf(j));
        updateFlagSecure(window);
    }

    private static void updateFlagSecure(Window window) {
        if (Build.VERSION.SDK_INT >= 23 && window != null) {
            HashMap<Window, ArrayList<Long>> hashMap = flagSecureReasons;
            try {
                if (hashMap.containsKey(window) && hashMap.get(window).size() > 0) {
                    window.addFlags(8192);
                } else {
                    window.clearFlags(8192);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void openSharing(BaseFragment baseFragment, String str) {
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(new ShareAlert(baseFragment.getParentActivity(), null, str, false, str, false));
        }
    }

    public static boolean allowScreenCapture() {
        return SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture;
    }

    public static File getSharingDirectory() {
        return new File(FileLoader.getDirectory(4), "sharing/");
    }

    public static String getCertificateSHA256Fingerprint() {
        try {
            return Utilities.bytesToHex(Utilities.computeSHA256(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean isPunctuationCharacter(char c) {
        if (charactersMap == null) {
            charactersMap = new HashSet<>();
            int i = 0;
            while (true) {
                char[] cArr = characters;
                if (i >= cArr.length) {
                    break;
                }
                charactersMap.add(Character.valueOf(cArr[i]));
                i++;
            }
        }
        return charactersMap.contains(Character.valueOf(c));
    }

    public static int getColorDistance(int i, int i2) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int red2 = Color.red(i2);
        int i3 = (red + red2) / 2;
        int i4 = red - red2;
        int green2 = green - Color.green(i2);
        int blue2 = blue - Color.blue(i2);
        return ((((i3 + 512) * i4) * i4) >> 8) + (green2 * 4 * green2) + ((((767 - i3) * blue2) * blue2) >> 8);
    }

    public static int getAverageColor(int i, int i2) {
        return Color.argb(255, (Color.red(i) / 2) + (Color.red(i2) / 2), (Color.green(i) / 2) + (Color.green(i2) / 2), (Color.blue(i) / 2) + (Color.blue(i2) / 2));
    }

    public static void setLightStatusBar(Window window, boolean z) {
        setLightStatusBar(window, z, false);
    }

    public static void setLightStatusBar(Window window, boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                if ((systemUiVisibility & 8192) == 0) {
                    decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                }
                if (SharedConfig.noStatusBar || z2) {
                    window.setStatusBarColor(0);
                } else {
                    window.setStatusBarColor(LIGHT_STATUS_BAR_OVERLAY);
                }
            } else {
                if ((systemUiVisibility & 8192) != 0) {
                    decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                }
                if (SharedConfig.noStatusBar || z2) {
                    window.setStatusBarColor(0);
                } else {
                    window.setStatusBarColor(DARK_STATUS_BAR_OVERLAY);
                }
            }
        }
    }

    public static boolean getLightNavigationBar(Window window) {
        return Build.VERSION.SDK_INT >= 26 && (window.getDecorView().getSystemUiVisibility() & 16) > 0;
    }

    public static void setLightNavigationBar(View view, boolean z) {
        if (view != null && Build.VERSION.SDK_INT >= 26) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
        }
    }

    public static void setLightNavigationBar(Window window, boolean z) {
        if (window != null) {
            setLightNavigationBar(window.getDecorView(), z);
        }
    }

    public static void setNavigationBarColor(Window window, int i) {
        setNavigationBarColor(window, i, true);
    }

    public static void setNavigationBarColor(Window window, int i, boolean z) {
        setNavigationBarColor(window, i, z, null);
    }

    public static void setNavigationBarColor(final Window window, int i, boolean z, final IntColorCallback intColorCallback) {
        ValueAnimator valueAnimator;
        if (Build.VERSION.SDK_INT >= 21) {
            HashMap<Window, ValueAnimator> hashMap = navigationBarColorAnimators;
            if (!(hashMap == null || (valueAnimator = hashMap.get(window)) == null)) {
                valueAnimator.cancel();
                navigationBarColorAnimators.remove(window);
            }
            if (!z) {
                if (intColorCallback != null) {
                    intColorCallback.run(i);
                }
                try {
                    window.setNavigationBarColor(i);
                } catch (Exception unused) {
                }
            } else {
                ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i);
                ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        AndroidUtilities.lambda$setNavigationBarColor$12(AndroidUtilities.IntColorCallback.this, window, valueAnimator2);
                    }
                });
                ofArgb.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (AndroidUtilities.navigationBarColorAnimators != null) {
                            AndroidUtilities.navigationBarColorAnimators.remove(window);
                        }
                    }
                });
                ofArgb.setDuration(200L);
                ofArgb.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ofArgb.start();
                if (navigationBarColorAnimators == null) {
                    navigationBarColorAnimators = new HashMap<>();
                }
                navigationBarColorAnimators.put(window, ofArgb);
            }
        }
    }

    public static void lambda$setNavigationBarColor$12(IntColorCallback intColorCallback, Window window, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (intColorCallback != null) {
            intColorCallback.run(intValue);
        }
        try {
            window.setNavigationBarColor(intValue);
        } catch (Exception unused) {
        }
    }

    public static boolean checkHostForPunycode(String str) {
        boolean z;
        boolean z2;
        Exception e;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z2 = false;
            z = false;
            for (int i = 0; i < length; i++) {
                try {
                    char charAt = str.charAt(i);
                    if (!(charAt == '.' || charAt == '-' || charAt == '/' || charAt == '+' || (charAt >= '0' && charAt <= '9'))) {
                        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                            z = true;
                        } else {
                            z2 = true;
                        }
                        if (z2 && z) {
                            break;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                    return !z2 ? false : false;
                }
            }
        } catch (Exception e3) {
            e = e3;
            z2 = false;
            z = false;
        }
        if (!z2 && z) {
            return true;
        }
    }

    public static boolean shouldShowUrlInAlert(String str) {
        try {
            return checkHostForPunycode(Uri.parse(str).getHost());
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static void scrollToFragmentRow(ActionBarLayout actionBarLayout, final String str) {
        if (actionBarLayout != null && str != null) {
            ArrayList<BaseFragment> arrayList = actionBarLayout.fragmentsStack;
            final BaseFragment baseFragment = arrayList.get(arrayList.size() - 1);
            try {
                Field declaredField = baseFragment.getClass().getDeclaredField("listView");
                declaredField.setAccessible(true);
                final RecyclerListView recyclerListView = (RecyclerListView) declaredField.get(baseFragment);
                recyclerListView.highlightRow(new RecyclerListView.IntReturnCallback() {
                    @Override
                    public final int run() {
                        int lambda$scrollToFragmentRow$13;
                        lambda$scrollToFragmentRow$13 = AndroidUtilities.lambda$scrollToFragmentRow$13(BaseFragment.this, str, recyclerListView);
                        return lambda$scrollToFragmentRow$13;
                    }
                });
                declaredField.setAccessible(false);
            } catch (Throwable unused) {
            }
        }
    }

    public static int lambda$scrollToFragmentRow$13(BaseFragment baseFragment, String str, RecyclerListView recyclerListView) {
        int i = -1;
        try {
            Field declaredField = baseFragment.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            i = declaredField.getInt(baseFragment);
            ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(i, dp(60.0f));
            declaredField.setAccessible(false);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    public static boolean checkInlinePermissions(Context context) {
        return Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context);
    }

    public static void updateVisibleRows(RecyclerListView recyclerListView) {
        RecyclerView.Adapter adapter;
        RecyclerView.ViewHolder childViewHolder;
        if (!(recyclerListView == null || (adapter = recyclerListView.getAdapter()) == null)) {
            for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                View childAt = recyclerListView.getChildAt(i);
                int childAdapterPosition = recyclerListView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && (childViewHolder = recyclerListView.getChildViewHolder(childAt)) != null && !childViewHolder.shouldIgnore()) {
                    adapter.onBindViewHolder(childViewHolder, childAdapterPosition);
                }
            }
        }
    }

    public static void updateViewVisibilityAnimated(View view, boolean z) {
        updateViewVisibilityAnimated(view, z, 1.0f, true);
    }

    public static void updateViewVisibilityAnimated(View view, boolean z, float f, boolean z2) {
        if (view != null) {
            int i = 0;
            if (view.getParent() == null) {
                z2 = false;
            }
            Integer num = null;
            if (!z2) {
                view.animate().setListener(null).cancel();
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
                if (z) {
                    num = 1;
                }
                view.setTag(num);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            } else if (z && view.getTag() == null) {
                view.animate().setListener(null).cancel();
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setScaleX(f);
                    view.setScaleY(f);
                }
                view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                view.setTag(1);
            } else if (!z && view.getTag() != null) {
                view.animate().setListener(null).cancel();
                view.animate().alpha(0.0f).scaleY(f).scaleX(f).setListener(new HideViewAfterAnimation(view)).setDuration(150L).start();
                view.setTag(null);
            }
        }
    }

    public static long getPrefIntOrLong(SharedPreferences sharedPreferences, String str, long j) {
        try {
            return sharedPreferences.getLong(str, j);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j);
        }
    }

    public static android.graphics.Bitmap getScaledBitmap(float r7, float r8, java.lang.String r9, java.lang.String r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.AndroidUtilities.getScaledBitmap(float, float, java.lang.String, java.lang.String, int):android.graphics.Bitmap");
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
            bitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
            Uri uriForFile = FileProvider.getUriForFile(ApplicationLoader.applicationContext, "org.telegram.messenger.beta.provider", file);
            fileOutputStream.close();
            return uriForFile;
        } catch (Exception e2) {
            FileLog.e(e2);
            return null;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
