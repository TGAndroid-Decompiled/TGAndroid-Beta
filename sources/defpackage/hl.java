package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
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
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.view.inspector.WindowInspector;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class hl {
    public static final byte C;
    public static boolean D;
    public static boolean E;
    public static AccessibilityManager I;
    public static Vibrator J;
    public static final Pattern S;
    public static final Pattern T;
    public static final Pattern U;
    public static final Pattern V;
    public static final Pattern W;
    public static Typeface a;
    public static final int[] a0;
    public static final int[] b0;
    public static final ik c0;
    public static CallReceiver d0;
    public static float e;
    public static Pattern e0;
    public static SimpleDateFormat f0;
    public static final String[] g0;
    public static final float[] h0;
    public static WeakReference i;
    public static final float[] i0;
    public static final char[] j0;
    public static HashSet k0;
    public static HashMap l0;
    public static boolean m0;
    public static Pattern n0;
    public static boolean o;
    public static final Paint o0;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static boolean y;
    public static final ThreadLocal b = new ThreadLocal();
    public static final ThreadLocal c = new ThreadLocal();
    public static final Hashtable d = new Hashtable();
    public static int f = -10;
    public static int g = -10;
    public static int h = -10;
    public static boolean j = false;
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static int m = 0;
    public static int n = 0;
    public static float p = 1.0f;
    public static final Point q = new Point();
    public static float r = 60.0f;
    public static float s = 60.0f;
    public static float t = 16.666666f;
    public static Integer z = null;
    public static Integer A = null;
    public static final DisplayMetrics B = new DisplayMetrics();
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public static final AccelerateInterpolator G = new AccelerateInterpolator();
    public static final OvershootInterpolator H = new OvershootInterpolator();
    public static Boolean K = null;
    public static Boolean L = null;
    public static Boolean M = null;
    public static int N = 0;
    public static int O = 0;
    public static final RectF P = new RectF();
    public static final Rect Q = new Rect();
    public static final int[] R = new int[2];
    public static Pattern X = null;
    public static final Paint Y = new Paint(1);
    public static final Paint Z = new Paint(1);

    static {
        byte b2;
        S = null;
        T = null;
        U = null;
        V = null;
        W = null;
        try {
            T = Pattern.compile("[─-◿]");
            Pattern.compile("[一-鿿]");
            V = Pattern.compile("[̀-ͯ\u2066-\u2067]");
            U = Pattern.compile("[\u2066-\u2067]+");
            W = Pattern.compile("([\\u0300-\\u036f]{1,2})[\\u0300-\\u036f]+");
            S = Pattern.compile("((?:(http|https|Http|Https|ton|tg|tonsite):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|" + Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))") + ")") + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        if (O1()) {
            b2 = 80;
        } else {
            b2 = 72;
        }
        C = b2;
        v(a.b, null);
        a0 = new int[]{2131231734, 2131231736, 2131231738, 2131231740};
        b0 = new int[]{2131231735, 2131231737, 2131231739, 2131231741};
        c0 = new Object();
        g0 = new String[]{"", "K", "M", "B", "T", "P"};
        h0 = new float[9];
        i0 = new float[9];
        j0 = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        o0 = new Paint(1);
    }

    public static int A(int i2, int i3) {
        if (i2 == i3) {
            return 0;
        }
        if (i2 > i3) {
            return 1;
        }
        return -1;
    }

    public static Bitmap A0(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            boolean[] zArr = {false};
            CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new pk(zArr, countDownLatch, (byte) 0), Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            if (zArr[0]) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public static boolean A1() {
        AccessibilityManager accessibilityManager = I;
        if (accessibilityManager == null) {
            accessibilityManager = (AccessibilityManager) a.b.getSystemService("accessibility");
            I = accessibilityManager;
        }
        if (accessibilityManager.isEnabled() && I.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public static String A2(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        Pattern pattern = W;
        if (pattern == null || (matcher = pattern.matcher(str)) == null) {
            return str;
        }
        return matcher.replaceAll("$1");
    }

    public static void A3(float f2, View view, Runnable runnable) {
        if (view == null) {
            return;
        }
        int L2 = L(f2);
        if (view.getTag(2131296665) != null) {
            ((vpa) view.getTag(2131296665)).d();
        }
        Float f3 = (Float) view.getTag(2131296666);
        if (f3 != null) {
            view.setTranslationX(f3.floatValue());
        }
        view.setTag(2131296666, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        vpa vpaVar = new vpa(view, vpa.o, translationX);
        wpa wpaVar = new wpa(translationX);
        wpaVar.b(600.0f);
        vpaVar.m = wpaVar;
        vpaVar.a = (-L2) * 100;
        vpaVar.a(new kk(translationX, view, runnable));
        view.setTag(2131296665, vpaVar);
        vpaVar.h();
    }

    public static float B(int i2) {
        float green = Color.green(i2) * 0.7152f;
        return c00.z(Color.blue(i2), 0.0722f, green + (Color.red(i2) * 0.2126f), 255.0f);
    }

    public static Uri B0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File D0 = D0();
        if (!D0.isDirectory()) {
            try {
                D0.mkdirs();
            } catch (Exception e2) {
                cc4.g(e2, true);
                return null;
            }
        }
        File file = new File(D0, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            Context context = a.b;
            a.d();
            Uri c2 = FileProvider.c(context, "org.telegram.messenger.beta.provider", file);
            fileOutputStream.close();
            return c2;
        } catch (Exception e3) {
            cc4.g(e3, true);
            return null;
        }
    }

    public static boolean B1(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (tL_chatBannedRights != null && Math.abs(tL_chatBannedRights.until_date - (System.currentTimeMillis() / 1000)) <= 157680000) {
            return false;
        }
        return true;
    }

    public static void B2(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void B3(View view) {
        A3(10.0f, view, null);
    }

    public static CharSequence C(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i2 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i2 < length) {
                    CharSequence charSequence2 = charSequenceArr[i2];
                    if (charSequence2 == null) {
                        charSequence2 = "null";
                    }
                    spannableStringBuilder.append(charSequence2);
                    i2++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i2 < length2) {
            sb.append(charSequenceArr[i2]);
            i2++;
        }
        return sb.toString();
    }

    public static String C0() {
        String str;
        try {
            PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
            int i2 = packageInfo.versionCode;
            int i3 = i2 / 10;
            int i4 = i2 % 10;
            if (i4 != 1 && i4 != 2) {
                a.t();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            return ob6.a0("TelegramVersion", null, 2131743863, "v" + packageInfo.versionName + " (" + i3 + ") " + str);
        } catch (Exception e2) {
            cc4.g(e2, true);
            return null;
        }
    }

    public static boolean C1(Context context) {
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
            return C1(((ContextWrapper) context).getBaseContext());
        }
    }

    public static String C2(String str) {
        if (str == null) {
            return null;
        }
        Pattern pattern = X;
        if (pattern == null) {
            pattern = Pattern.compile("[\\u200E\\u200F\\u202A-\\u202E]");
            X = pattern;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher == null) {
            return str;
        }
        return matcher.replaceAll("");
    }

    public static boolean C3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.C3():boolean");
    }

    public static void D(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                Thread.yield();
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.close();
                return;
            }
        }
    }

    public static File D0() {
        String str;
        String str2 = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e2) {
            cc4.g(e2, true);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            cc4.b("external dir mounted");
            try {
                File[] externalCacheDirs = a.b.getExternalCacheDirs();
                int i2 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(xea.e0)) {
                    while (true) {
                        if (i2 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i2];
                            if (file2 != null && file2.getAbsolutePath().startsWith(xea.e0)) {
                                file = externalCacheDirs[i2];
                                break;
                            }
                            i2++;
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
                cc4.b(sb.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    cc4.b("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
        }
        try {
            File cacheDir = a.b.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
        try {
            File filesDir = a.b.getFilesDir();
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

    public static boolean D1(Exception exc) {
        if (!(exc instanceof IOException) || !(exc.getCause() instanceof ErrnoException) || ((ErrnoException) exc.getCause()).errno != OsConstants.ENOSPC) {
            if (exc.getMessage() != null && exc.getMessage().equalsIgnoreCase("no space left on device")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder D2(CharSequence charSequence, boolean z2) {
        return F2(charSequence, z2, L(2.6666667f), 0.0f, 1.0f, 2131232246);
    }

    public static boolean D3(String str) {
        try {
            return w(Uri.parse(str).getHost());
        } catch (Exception e2) {
            cc4.g(e2, true);
            return false;
        }
    }

    public static boolean E(File file, File file2) {
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
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            return false;
        }
    }

    public static int E0(int i2, int i3) {
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        int red2 = Color.red(i3);
        int i4 = (red + red2) / 2;
        int i5 = red - red2;
        int green2 = green - Color.green(i3);
        int blue2 = blue - Color.blue(i3);
        return ((green2 << 2) * green2) + ((((i4 + 512) * i5) * i5) >> 8) + ((((767 - i4) * blue2) * blue2) >> 8);
    }

    public static boolean E1(Exception exc) {
        if (!(exc instanceof IOException) || !(exc.getCause() instanceof ErrnoException) || ((ErrnoException) exc.getCause()).errno != OsConstants.EROFS) {
            if (exc.getMessage() != null && exc.getMessage().toLowerCase().contains("read-only file system")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder E2(CharSequence charSequence, boolean z2, float f2, float f3) {
        return F2(charSequence, z2, f2, f3, 1.0f, 2131232246);
    }

    public static boolean E3(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e2) {
            cc4.g(e2, true);
            return false;
        }
    }

    public static void F(File file, File file2) {
        try {
            E(file, file2);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public static String[] F0() {
        String str;
        String str2;
        String replace;
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
            InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
            String str3 = null;
            if (currentInputMethodSubtype != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    str = currentInputMethodSubtype.getLanguageTag();
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = currentInputMethodSubtype.getLocale();
                }
            } else {
                InputMethodSubtype lastInputMethodSubtype = inputMethodManager.getLastInputMethodSubtype();
                if (lastInputMethodSubtype != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        str2 = lastInputMethodSubtype.getLanguageTag();
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str = lastInputMethodSubtype.getLocale();
                    } else {
                        str = str2;
                    }
                } else {
                    str = null;
                }
            }
            if (TextUtils.isEmpty(str)) {
                String Q0 = ob6.Q0();
                mb6 mb6Var = ob6.D0().B;
                String str4 = mb6Var.e;
                if (str4 == null) {
                    replace = "";
                } else {
                    replace = str4.replace("_", "-");
                }
                if (TextUtils.isEmpty(replace)) {
                    replace = mb6Var.c();
                }
                if (!Q0.contains(replace) && !replace.contains(Q0)) {
                    str3 = replace;
                } else if (!Q0.contains("en")) {
                    str3 = "en";
                }
                if (!TextUtils.isEmpty(str3)) {
                    return new String[]{Q0.replace('_', '-'), str3};
                }
                return new String[]{Q0.replace('_', '-')};
            }
            return new String[]{str.replace('_', '-')};
        } catch (Exception unused) {
            return new String[]{"en"};
        }
    }

    public static boolean F1(Activity activity) {
        if (Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode()) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder F2(CharSequence charSequence, boolean z2, float f2, float f3, float f4, int i2) {
        wm2 wm2Var = new wm2(i2, 0);
        float f5 = f4 * 0.88f;
        wm2Var.I = f5;
        wm2Var.J = f5;
        wm2Var.r = -f2;
        wm2Var.s = f3;
        wm2Var.H = 0.8f;
        if (z2) {
            wm2Var.f = z2;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(wm2Var, spannableString.length() - 1, spannableString.length(), 33);
        SpannableStringBuilder I2 = I2(charSequence, spannableString, " >");
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(wm2Var, 0, 1, 33);
        SpannableStringBuilder I22 = I2(I2, spannableString2, ">");
        wm2 wm2Var2 = new wm2(i2, 0);
        wm2Var2.I = f5;
        wm2Var2.J = f5;
        wm2Var2.r = f2;
        wm2Var2.s = f3;
        wm2Var2.w = 180.0f;
        wm2Var2.H = 0.8f;
        if (z2) {
            wm2Var2.f = z2;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(wm2Var2, 0, 1, 33);
        return I2(I22, spannableString3, "<");
    }

    public static void F3(LaunchActivity launchActivity, jx8 jx8Var) {
        if (!jx8Var.g()) {
            return;
        }
        String str = jx8Var.b;
        int i2 = jx8Var.c;
        String str2 = jx8Var.d;
        String str3 = jx8Var.e;
        String str4 = jx8Var.f;
        nx0 nx0Var = new nx0(1, (vnb) null, (Context) launchActivity, false);
        nx0Var.J();
        nx0Var.v0 = false;
        nx0Var.w0 = false;
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        linearLayout.setOrientation(1);
        nx0Var.O = linearLayout;
        TextView b2 = zze.b(launchActivity, 20.0f, aob.j5, true, null);
        b2.setText(ob6.M0(2131743430, null));
        linearLayout.addView(b2, tre.t(-1, -2, 55, 22, 18, 22, 0));
        hjb hjbVar = new hjb(launchActivity, null);
        linearLayout.addView(hjbVar, tre.t(-1, -2, 55, 14, 18, 14, 0));
        if (!TextUtils.isEmpty(str)) {
            hjbVar.f(ob6.M0(2131743446, null), str, null, null);
        }
        if (i2 != 0) {
            hjbVar.f(ob6.M0(2131743441, null), Integer.toString(i2), null, null);
        }
        if (!TextUtils.isEmpty(str4)) {
            hjbVar.f(ob6.M0(2131743439, null), str4, null, null);
        }
        if (!TextUtils.isEmpty(str2)) {
            hjbVar.f(ob6.M0(2131743429, null), str2, null, null);
        }
        if (!TextUtils.isEmpty(str3)) {
            hjbVar.f(ob6.M0(2131743442, null), str3, null, null);
        }
        y41[] y41VarArr = new y41[1];
        hjbVar.f(ob6.M0(2131746327, null), "", null, y41VarArr);
        ((View) y41VarArr[0].getParent()).setPadding(0, 0, 0, 0);
        y41VarArr[0].setDisablePaddingsOffsetY(true);
        y41VarArr[0].setPadding(L(12.66f), L(9.33f), L(12.66f), L(9.33f));
        y41VarArr[0].setText(K2(ob6.M0(2131746336, null), aob.w0(null, aob.Xc, false), new o97(new boolean[1], y41VarArr, jx8Var, launchActivity, (byte) 8)));
        if (!TextUtils.isEmpty(str4)) {
            fjb a2 = hjbVar.a(ob6.M0(2131743431, null));
            a2.setFilled(true);
            tpa tpaVar = (tpa) a2.getChildAt(0);
            tpaVar.setTextSize(1, 11.0f);
            tpaVar.setGravity(17);
        }
        c51 c51Var = new c51(null, launchActivity, true);
        c51Var.setRoundRadius(24);
        c51Var.setText(ob6.M0(2131751773, null));
        c51Var.setOnClickListener(new c0(jx8Var, launchActivity, nx0Var.y0, (byte) 5));
        linearLayout.addView(c51Var, tre.t(-1, 48, 55, 14, 18, 14, 14));
        nx0Var.show();
    }

    public static void G(File file) {
        try {
            if (file.exists()) {
                return;
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.flush();
            fileWriter.close();
        } catch (Throwable th) {
            cc4.g(th, false);
        }
    }

    public static String G0(Context context, Uri uri, String str, String[] strArr) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!string.startsWith("content://") && (string.startsWith("/") || string.startsWith("file://"))) {
                        query.close();
                        return string;
                    }
                }
                query.close();
                return null;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean G1(Uri uri, int i2) {
        String str;
        if (uri != null) {
            str = uri.getPath();
            if (str == null) {
                return false;
            }
            if (str.matches(Pattern.quote(new File(a.b.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
                return false;
            }
            int i3 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlink = Utilities.readlink(str);
                    if (readlink != null && !readlink.equals(str)) {
                        i3++;
                        if (i3 >= 10) {
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
        int i4 = 0;
        while (str.length() <= 4096) {
            try {
                String readlinkFd = Utilities.readlinkFd(i2);
                if (readlinkFd != null && !readlinkFd.equals(str)) {
                    i4++;
                    if (i4 >= 10) {
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
        return str.toLowerCase().contains("/data/data/" + a.b.getPackageName());
    }

    public static SpannableStringBuilder G2(CharSequence charSequence, CharSequence charSequence2, String str) {
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

    public static void G3(int i2, int i3, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i2, iArr[1] - i3, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                G3(i2, i3, iArr, canvas, viewGroup.getChildAt(i4));
            }
        }
    }

    public static byte[] H(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < bArr.length) {
            byte b2 = bArr[i2];
            if (b2 == 61) {
                try {
                    int digit = Character.digit((char) bArr[i2 + 1], 16);
                    i2 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i2], 16)));
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b2);
            }
            i2++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e3) {
            cc4.g(e3, true);
            return byteArray;
        }
    }

    public static mq5 H0(l2d l2dVar, boolean z2) {
        mq5 g2 = l2dVar.a.g(647);
        i2d i2dVar = l2dVar.a;
        mq5 a2 = mq5.a(g2, i2dVar.f(647));
        if (z2) {
            return mq5.a(a2, i2dVar.f(8));
        }
        return a2;
    }

    public static boolean H1(e eVar) {
        a.j();
        try {
            a.b.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (eVar.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
            a.j();
            alertDialog$Builder.a.U = ob6.M0(2131748950, null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), new ze((byte) 1, "com.google.android.apps.maps", eVar));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            eVar.showDialog(alertDialog$Builder.a);
            return false;
        }
    }

    public static SpannableStringBuilder H2(String str, vnb vnbVar, xh0 xh0Var) {
        if (e0 == null) {
            e0 = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = e0.matcher(str);
        int i2 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i2, matcher.start());
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new uk(xh0Var, group2, vnbVar, (byte) 0), spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i2 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i2, str.length());
        return spannableStringBuilder;
    }

    public static Bitmap H3(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        G3(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
    }

    public static float I(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public static int I0(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 10; i6++) {
            for (int i7 = 0; i7 < 10; i7++) {
                int pixel = bitmap.getPixel((int) (i6 * width), (int) (i7 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i3;
                    int green = Color.green(pixel) + i4;
                    i2++;
                    i5 = Color.blue(pixel) + i5;
                    i4 = green;
                    i3 = red;
                }
            }
        }
        if (i2 == 0) {
            return 0;
        }
        return Color.argb(255, i3 / i2, i4 / i2, i5 / i2);
    }

    public static boolean I1(char c2) {
        if (k0 == null) {
            k0 = new HashSet();
            int i2 = 0;
            while (true) {
                char[] cArr = j0;
                if (i2 >= cArr.length) {
                    break;
                }
                k0.add(Character.valueOf(cArr[i2]));
                i2++;
            }
        }
        return k0.contains(Character.valueOf(c2));
    }

    public static SpannableStringBuilder I2(CharSequence charSequence, CharSequence charSequence2, String str) {
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

    public static String I3(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String S0 = ob6.D0().S0(str, true, false);
        if (S0 == null) {
            return "";
        }
        return S0;
    }

    public static void J(d79 d79Var, Runnable runnable) {
        if (d79Var == null) {
            runnable.run();
        } else {
            d79Var.addOnLayoutChangeListener(new tk(d79Var, runnable));
        }
    }

    public static String J0(String str, boolean z2) {
        if (str != null) {
            Pattern pattern = n0;
            if (pattern == null) {
                pattern = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
                n0 = pattern;
            }
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(4);
                if (group != null) {
                    group = group.toLowerCase();
                }
                if (z2 && group != null && group.startsWith("www.")) {
                    return group.substring(4);
                }
                return group;
            }
            return null;
        }
        return null;
    }

    public static boolean J1(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence J2(CharSequence charSequence) {
        int i2 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            int length = sb.length();
            while (i2 < length) {
                if (sb.charAt(i2) == '\n') {
                    sb.setCharAt(i2, ' ');
                }
                i2++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i2 < length2) {
                if (charSequence.charAt(i2) == '\n') {
                    spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) " ");
                }
                i2++;
            }
            return spannableStringBuilder;
        } else if (charSequence instanceof SpannableString) {
            if (TextUtils.indexOf(charSequence, '\n') < 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            int length3 = charSequence.length();
            while (i2 < length3) {
                if (charSequence.charAt(i2) == '\n') {
                    spannableStringBuilder2.replace(i2, i2 + 1, (CharSequence) " ");
                }
                i2++;
            }
            return spannableStringBuilder2;
        } else if (charSequence == null) {
            return null;
        } else {
            return charSequence.toString().replace('\n', ' ');
        }
    }

    public static CharSequence J3(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) <= ' ') {
            i2++;
        }
        while (i2 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i2;
        }
        if (i2 <= 0 && length >= charSequence.length()) {
            return charSequence;
        }
        return charSequence.subSequence(i2, length);
    }

    public static void K(View view, final Runnable runnable) {
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final boolean[] zArr = new boolean[1];
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public final boolean onPreDraw() {
                ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(r2[0]);
                }
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                }
                return true;
            }
        };
        final ViewTreeObserver.OnPreDrawListener[] onPreDrawListenerArr = {onPreDrawListener};
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    public static Pair K0(y54 y54Var) {
        int i2;
        int i3 = 0;
        try {
            int i4 = 2;
            switch (y54Var.c()) {
                case 2:
                    i4 = 1;
                    break;
                case 3:
                    i2 = 180;
                    i4 = 0;
                    i3 = i2;
                    break;
                case 4:
                    break;
                case 5:
                    i3 = 270;
                    break;
                case 6:
                    i2 = 90;
                    i4 = 0;
                    i3 = i2;
                    break;
                case 7:
                    i4 = 1;
                    i3 = 270;
                    break;
                case 8:
                    i4 = 0;
                    i3 = 270;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            return new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        } catch (Exception e2) {
            cc4.g(e2, true);
            return new Pair(0, 0);
        }
    }

    public static boolean K1(Context context) {
        Activity W2 = W(context);
        if (W2 == null) {
            return true;
        }
        if (!W2.isDestroyed() && !W2.isFinishing()) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder K2(String str, int i2, Runnable runnable) {
        int i3;
        int i4;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i4 = indexOf2 - indexOf) > 2) {
            i3 = i4 - 2;
        } else {
            indexOf = -1;
            i3 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new al(i2, runnable), indexOf, i3 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new sk(i2, (byte) 1), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void K3(Activity activity) {
        boolean z2;
        if (activity != null) {
            try {
                if (f != -10) {
                    int requestedOrientation = activity.getRequestedOrientation();
                    activity.setRequestedOrientation(f);
                    if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        g = f;
                        h = requestedOrientation;
                        i = new WeakReference(activity);
                    }
                    f = -10;
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public static int L(float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(p * f2);
    }

    public static Pair L0(File file) {
        try {
            return K0(new y54(file));
        } catch (Exception e2) {
            cc4.g(e2, true);
            return new Pair(0, 0);
        }
    }

    public static boolean L1() {
        TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        if (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || Settings.Global.getInt(a.b.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder L2(int i2, String str) {
        int i3;
        int i4;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i4 = indexOf2 - indexOf) > 2) {
            i3 = i4 - 2;
        } else {
            indexOf = -1;
            i3 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new sk(i2, (byte) 0), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void L3(ImageView imageView, int i2) {
        M3(imageView, imageView.getContext().getDrawable(i2));
    }

    public static int M(float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(p * f2);
    }

    public static Pair M0(InputStream inputStream) {
        try {
            return K0(new y54(inputStream));
        } catch (Exception e2) {
            cc4.g(e2, true);
            return new Pair(0, 0);
        }
    }

    public static boolean M1() {
        boolean z2;
        Boolean bool = M;
        if (bool == null) {
            Point point = q;
            if (((Math.max(point.x, point.y) - m) - n) / p <= 650.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
            M = bool;
        }
        return bool.booleanValue();
    }

    public static SpannableStringBuilder M2(String str, int i2, vnb vnbVar, Runnable runnable, boolean z2) {
        int i3;
        int i4;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i4 = indexOf2 - indexOf) > 2) {
            i3 = i4 - 2;
        } else {
            indexOf = -1;
            i3 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new bl(z2, i2, vnbVar, runnable), indexOf, i3 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new cl(z2, i2, vnbVar), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void M3(ImageView imageView, Drawable drawable) {
        if (imageView.getDrawable() == drawable) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new nk(imageView, new AtomicBoolean(), drawable, (byte) 0));
        duration.start();
    }

    public static float N(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return p * f2;
    }

    public static Pair N0(String str) {
        try {
            return K0(new y54(str));
        } catch (Exception unused) {
            return new Pair(0, 0);
        }
    }

    public static boolean N1() {
        Point point = q;
        if (Math.min(point.x, point.y) / p <= 690.0f) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder N2(String str, int i2, int i3, Runnable runnable, vnb vnbVar) {
        int i4;
        int i5;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i5 = indexOf2 - indexOf) > 2) {
            i4 = i5 - 2;
        } else {
            indexOf = -1;
            i4 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (i3 == 3) {
                int i6 = indexOf + i4;
                spannableStringBuilder.replace(indexOf, i6, (CharSequence) I2(spannableStringBuilder.subSequence(indexOf, i6), " ", " "));
            }
            if (i3 != 0 && i3 != 3 && i3 != 2 && i3 != 4) {
                spannableStringBuilder.setSpan(new zk(vnbVar, (byte) 0), indexOf, i4 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new yk(i3, i2, vnbVar, runnable), indexOf, i4 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void N3(WindowManager windowManager, iy9 iy9Var, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && iy9Var != null && iy9Var.getParent() != null) {
            windowManager.updateViewLayout(iy9Var, layoutParams);
        }
    }

    public static void O(Canvas canvas, FrameLayout frameLayout, int i2, int i3, float f2) {
        int p1 = aob.p1(R1(0.0f, 0.75f, Q0(i3)) * f2, i2);
        Paint paint = o0;
        paint.setColor(p1);
        canvas.drawRect(0.0f, (frameLayout.getY() + frameLayout.getMeasuredHeight()) - i3, frameLayout.getMeasuredWidth(), frameLayout.getY() + frameLayout.getMeasuredHeight(), paint);
    }

    public static File O0() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = a.b.getExternalFilesDir(null);
                File file = new File(externalFilesDir.getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(a.b.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(a.b.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            a.a(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static boolean O1() {
        if (P1() && !xea.V) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder O2(String str, int i2, gn1 gn1Var) {
        return N2(str, i2, 0, gn1Var, null);
    }

    public static void O3(float f2, View view, boolean z2, boolean z3) {
        boolean z4;
        float f3;
        float f4;
        float f5;
        if (view != null) {
            int i2 = 0;
            if (view.getParent() == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            Integer num = null;
            view.animate().setListener(null).cancel();
            float f6 = 0.5f;
            float f7 = 0.0f;
            if (!z4) {
                if (!z2) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                if (z2) {
                    num = 1;
                }
                view.setTag(num);
                view.setAlpha(1.0f);
                if (z3 && !z2) {
                    f5 = 0.5f;
                } else {
                    f5 = 1.0f;
                }
                view.setScaleX(f5);
                if (!z3 || z2) {
                    f6 = 1.0f;
                }
                view.setScaleY(f6);
                if (f2 != 0.0f) {
                    if (!z2) {
                        f7 = L(-16.0f) * f2;
                    }
                    view.setTranslationY(f7);
                }
            } else if (z2) {
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    if (z3) {
                        f4 = 0.5f;
                    } else {
                        f4 = 1.0f;
                    }
                    view.setScaleX(f4);
                    if (!z3) {
                        f6 = 1.0f;
                    }
                    view.setScaleY(f6);
                    if (f2 != 0.0f) {
                        view.setTranslationY(L(-16.0f) * f2);
                    }
                }
                ViewPropertyAnimator withEndAction = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(k43.h).setDuration(340L).withEndAction(null);
                if (f2 != 0.0f) {
                    withEndAction.translationY(0.0f);
                }
                withEndAction.start();
            } else {
                ViewPropertyAnimator alpha = view.animate().alpha(0.0f);
                if (z3) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                ViewPropertyAnimator scaleY = alpha.scaleY(f3);
                if (!z3) {
                    f6 = 1.0f;
                }
                ViewPropertyAnimator withEndAction2 = scaleY.scaleX(f6).setListener(new gf4(view)).setInterpolator(k43.h).setDuration(340L).withEndAction(null);
                if (f2 != 0.0f) {
                    withEndAction2.translationY(L(-16.0f) * f2);
                }
                withEndAction2.start();
            }
        }
    }

    public static void P(Canvas canvas, RectF rectF, float f2) {
        float min = Math.min(f2, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float N2 = N(1.0f);
        float f3 = N2 / 2.0f;
        float max = Math.max(0.0f, min - N2);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = Y;
        paint.setStyle(style);
        paint.setStrokeWidth(N2);
        paint.setColor(aob.p1(1.0f, 570425343));
        canvas.save();
        float f4 = rectF.top;
        if (canvas.clipRect(rectF.left - f3, f4, rectF.right + f3, ete.a(f4 + max, f4, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f3, rectF.right, f3 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float N3 = N(0.6666667f);
        float f5 = N3 / 2.0f;
        float max2 = Math.max(0.0f, min - N3);
        Paint paint2 = Z;
        paint2.setStyle(style);
        paint2.setStrokeWidth(N3);
        paint2.setColor(aob.p1(1.0f, 385875967));
        canvas.save();
        float f6 = rectF.bottom;
        if (canvas.clipRect(rectF.left - f5, ete.a(f6 - max2, rectF.top, f6), rectF.right + f5, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f5, rectF.right, rectF.bottom - f5, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static int P0() {
        boolean N1 = N1();
        Point point = q;
        if (!N1) {
            int min = Math.min(point.x, point.y);
            return min - k1(min, 0, 0);
        }
        int min2 = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        return Math.min(min2, max - k1(max, 0, 0));
    }

    public static boolean P1() {
        boolean z2;
        Boolean bool = K;
        if (bool == null) {
            if (a.b != null && a.b.getResources().getBoolean(2131034114)) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
            K = bool;
        }
        return bool.booleanValue();
    }

    public static SpannableStringBuilder P2(String str, Runnable runnable) {
        return N2(str, -1, 0, runnable, null);
    }

    public static void P3(View view, boolean z2, boolean z3) {
        O3(0.0f, view, z2, z3);
    }

    public static CharSequence Q(CharSequence charSequence, String str, int i2, TextPaint textPaint) {
        CharSequence charSequence2;
        int i3;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            int indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > 130) {
                CharSequence subSequence2 = charSequence.subSequence(Math.max(0, indexOf - 65), Math.min(length, indexOf + 65));
                try {
                    int max = indexOf - Math.max(0, indexOf - 65);
                    subSequence2.length();
                    i3 = max;
                    charSequence2 = subSequence2;
                } catch (Exception e2) {
                    e = e2;
                    charSequence2 = subSequence2;
                    cc4.g(e, true);
                    return charSequence2;
                }
            } else {
                i3 = indexOf;
                charSequence2 = charSequence;
            }
        } catch (Exception e3) {
            e = e3;
            charSequence2 = charSequence;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f2 = i2;
            if (textPaint.measureText("...") + lineWidth >= f2) {
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i5))) {
                    i5++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i5);
                if (staticLayout.isRtlCharAt(i5)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f2) {
                    float f3 = 0.1f * f2;
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f2) + f3;
                    if (charSequence2.length() - i5 > 20) {
                        measureText += f3;
                    }
                    if (measureText > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                        if (offsetForHorizontal > charSequence2.length() - 1) {
                            offsetForHorizontal = charSequence2.length() - 1;
                        }
                        int i6 = 0;
                        while (true) {
                            if (Character.isWhitespace(charSequence2.charAt(offsetForHorizontal)) || i6 >= 10) {
                                break;
                            }
                            i6++;
                            offsetForHorizontal++;
                            if (offsetForHorizontal > charSequence2.length() - 1) {
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                                break;
                            }
                        }
                        if (i6 >= 10) {
                            subSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i4) - (f2 * 0.3f)), charSequence2.length());
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
        } catch (Exception e4) {
            e = e4;
            cc4.g(e, true);
            return charSequence2;
        }
    }

    public static float Q0(int i2) {
        return Utilities.l((i2 - L(32.0f)) / L(16.0f));
    }

    public static boolean Q1(char c2) {
        if (c2 != '-' && c2 != '~') {
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder Q2(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int t2 = t(spannableStringBuilder, "**");
                if (t2 == -1) {
                    break;
                }
                spannableStringBuilder.replace(t2, t2 + 2, "");
                int t3 = t(spannableStringBuilder, "**");
                if (t3 >= 0) {
                    spannableStringBuilder.replace(t3, t3 + 2, "");
                    arrayList.add(Integer.valueOf(t2));
                    arrayList.add(Integer.valueOf(t3));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i2 = 0; i2 < arrayList.size() / 2; i2++) {
                int i3 = i2 << 1;
                spannableStringBuilder2.setSpan(new y7c(o()), ((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList.get(i3 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e2) {
            cc4.g(e2, true);
            return spannableStringBuilder;
        }
    }

    public static void Q3(float f2, View view, boolean z2, boolean z3) {
        T3(view, z2, f2, true, z3);
    }

    public static MotionEvent R() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static int R0(float f2, float f3, int i2, int i3) {
        int red = Color.red(i3);
        int green = Color.green(i3);
        int blue = Color.blue(i3);
        int alpha = Color.alpha(i3);
        int red2 = Color.red(i2);
        int green2 = Color.green(i2);
        int blue2 = Color.blue(i2);
        int alpha2 = Color.alpha(i2);
        return Color.argb((int) xnb.z(alpha - alpha2, f2, alpha2, f3), (int) (((red - red2) * f2) + red2), (int) (((green - green2) * f2) + green2), (int) (((blue - blue2) * f2) + blue2));
    }

    public static float R1(float f2, float f3, float f4) {
        return qd4.A(f3, f2, f4, f2);
    }

    public static SpannableStringBuilder R2(CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return Q2((SpannableStringBuilder) charSequence);
        }
        return Q2(new SpannableStringBuilder(charSequence));
    }

    public static void R3(View view, boolean z2) {
        T3(view, z2, 1.0f, true, true);
    }

    public static void S(Window window) {
        int i2;
        Objects.requireNonNull(window);
        window.getDecorView();
        y2f.a(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            if (i3 >= 30) {
                i2 = 3;
            } else {
                i2 = 1;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i2) {
                bg.d(attributes, i2);
                window.setAttributes(attributes);
            }
        }
        if (i3 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static String S0(Uri uri) {
        Uri uri2;
        String[] split;
        try {
            if (DocumentsContract.isDocumentUri(a.b, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    if ("primary".equalsIgnoreCase(DocumentsContract.getDocumentId(uri).split(":")[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    return G0(a.b, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    int hashCode = str.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875 && str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            }
                            uri2 = null;
                        } else {
                            if (str.equals("image")) {
                                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            }
                            uri2 = null;
                        }
                    } else {
                        if (str.equals("audio")) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        uri2 = null;
                    }
                    return G0(a.b, uri2, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return G0(a.b, uri, null, null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            return null;
        } catch (Exception e2) {
            cc4.g(e2, true);
            return null;
        }
    }

    public static float S1(float f2, float[] fArr) {
        return R1(fArr[0], fArr[1], f2);
    }

    public static SpannableStringBuilder S2(String str) {
        try {
            StringBuilder sb = new StringBuilder(str);
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
            ArrayList arrayList = new ArrayList();
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
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            for (int i2 = 0; i2 < arrayList.size() / 2; i2++) {
                int i3 = i2 << 1;
                spannableStringBuilder.setSpan(new y7c(o()), ((Integer) arrayList.get(i3)).intValue(), ((Integer) arrayList.get(i3 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e2) {
            cc4.g(e2, true);
            return new SpannableStringBuilder(str);
        }
    }

    public static void S3(View view, boolean z2, float f2, boolean z3, float f3, boolean z4, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Integer num = 1;
        if (view != null) {
            int i2 = 0;
            if (view.getParent() == null) {
                z4 = false;
            }
            if (!z4) {
                view.animate().setListener(null).cancel();
                if (!z2) {
                    if (z3) {
                        i2 = 8;
                    } else {
                        i2 = 4;
                    }
                }
                view.setVisibility(i2);
                if (!z2) {
                    num = null;
                }
                view.setTag(num);
                view.setAlpha(f3);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            } else if (z2) {
                if (view.getTag() == null) {
                    view.animate().setListener(null).cancel();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                        view.setAlpha(0.0f);
                        view.setScaleX(f2);
                        view.setScaleY(f2);
                    }
                    view.animate().alpha(f3).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                    view.setTag(num);
                }
            } else if (view.getTag() != null) {
                view.animate().setListener(null).cancel();
                view.animate().alpha(0.0f).scaleY(f2).scaleX(f2).setListener(new gf4(view, z3)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(null);
            }
        }
    }

    public static void T() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
            Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            if (declaredMethod.invoke(telephonyManager, null) == null) {
                if (declaredMethod.invoke(telephonyManager, null) == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            throw new ClassCastException();
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    public static int T0(int i2) {
        return U0(i2, false);
    }

    public static float T1(boolean z2, boolean z3, float f2) {
        float f3;
        float f4;
        float f5 = 0.0f;
        if (z2) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        if (z2) {
            f5 = 1.0f;
        }
        return qd4.A(f4, f5, f2, f3);
    }

    public static CharSequence T2(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            int length = sb.length();
            int i2 = 0;
            while (i2 < length - 2) {
                int i3 = i2 + 2;
                sb.getChars(i2, i3, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb = sb.replace(i2, i3, "\n");
                    i2--;
                    length--;
                }
                i2++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i4 = 0;
            while (i4 < length2 - 2) {
                int i5 = i4 + 2;
                spannableStringBuilder.getChars(i4, i5, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder = spannableStringBuilder.replace(i4, i5, (CharSequence) "\n");
                    i4--;
                    length2--;
                }
                i4++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableString) {
            if (TextUtils.indexOf(charSequence, "\n\n") < 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            int length3 = charSequence.length();
            int i6 = 0;
            while (i6 < length3 - 2) {
                int i7 = i6 + 2;
                spannableStringBuilder2.getChars(i6, i7, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder2 = spannableStringBuilder2.replace(i6, i7, (CharSequence) "\n");
                    i6--;
                    length3--;
                }
                i6++;
            }
            return spannableStringBuilder2;
        } else {
            return charSequence.toString().replace("\n\n", "\n");
        }
    }

    public static void T3(View view, boolean z2, float f2, boolean z3, boolean z4) {
        S3(view, z2, f2, z3, 1.0f, z4, null);
    }

    public static String U(String str) {
        return C2(A2(str));
    }

    public static int U0(int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.U0(int, boolean):int");
    }

    public static int U1(float f2, int i2, int i3) {
        return (int) ((f2 * (i3 - i2)) + i2);
    }

    public static void U2(Activity activity, int i2) {
        if (activity != null && !O1()) {
            activity.getWindow().setSoftInputMode(48);
            N = i2;
        }
    }

    public static void U3(int i2, d79 d79Var) {
        j79 adapter;
        f89 U2;
        if (d79Var != null && (adapter = d79Var.getAdapter()) != null) {
            for (int i3 = 0; i3 < d79Var.getChildCount(); i3++) {
                View childAt = d79Var.getChildAt(i3);
                int S2 = RecyclerView.S(childAt);
                if (S2 >= 0 && (U2 = d79Var.U(childAt)) != null && !U2.r() && U2.b() == i2) {
                    adapter.t(U2, S2);
                }
            }
        }
    }

    public static Object V(Class cls, List list) {
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                Object obj = list.get(i2);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
        return null;
    }

    public static int V0(int i2) {
        float[] b2 = b(Color.red(i2), Color.green(i2), Color.blue(i2));
        b2[1] = Math.min(1.0f, b2[1] + 0.05f);
        float f2 = b2[2];
        int i3 = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
        float f3 = f2 * 0.9f;
        if (i3 > 0) {
            b2[2] = Math.max(0.0f, f3);
        } else {
            b2[2] = Math.max(0.0f, f3);
        }
        return a(b2[0], b2[1], b2[2]) | (-16777216);
    }

    public static void V1(Rect rect, Rect rect2, float f2, Rect rect3) {
        if (rect3 != null) {
            rect3.set(U1(f2, rect.left, rect2.left), U1(f2, rect.top, rect2.top), U1(f2, rect.right, rect2.right), U1(f2, rect.bottom, rect2.bottom));
        }
    }

    public static void V2(Activity activity, int i2) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null && !O1()) {
            window.setSoftInputMode(16);
            N = i2;
        }
    }

    public static void V3(d79 d79Var) {
        j79 adapter;
        f89 U2;
        if (d79Var != null && (adapter = d79Var.getAdapter()) != null) {
            for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
                View childAt = d79Var.getChildAt(i2);
                int S2 = RecyclerView.S(childAt);
                if (S2 >= 0 && (U2 = d79Var.U(childAt)) != null && !U2.r()) {
                    adapter.t(U2, S2);
                }
            }
        }
    }

    public static Activity W(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return W(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int W0(int i2) {
        return Math.max(73, (i2 >> 16) & 65535);
    }

    public static void W1(Rect rect, RectF rectF, float f2, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(R1(rect.left, rectF.left, f2), R1(rect.top, rectF.top, f2), R1(rect.right, rectF.right, f2), R1(rect.bottom, rectF.bottom, f2));
        }
    }

    public static void W2(Activity activity, int i2) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        O = i2;
    }

    public static void W3(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(9, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static View X(ViewGroup viewGroup, float f2, float f3) {
        if (viewGroup.getVisibility() == 0) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null && childAt.getVisibility() == 0) {
                    if (childAt instanceof ViewGroup) {
                        View X2 = X((ViewGroup) childAt, f2 - childAt.getLeft(), f3 - childAt.getTop());
                        if (X2 != null) {
                            return X2;
                        }
                    } else if (f2 >= childAt.getX() && f2 <= childAt.getX() + childAt.getWidth() && f3 >= childAt.getY() && f2 <= childAt.getY() + childAt.getHeight()) {
                        return childAt;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int X0() {
        return Y0(false);
    }

    public static void X1(RectF rectF, RectF rectF2, float f2, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(R1(rectF.left, rectF2.left, f2), R1(rectF.top, rectF2.top, f2), R1(rectF.right, rectF2.right, f2), R1(rectF.bottom, rectF2.bottom, f2));
        }
    }

    public static void X2(LaunchActivity launchActivity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            PictureInPictureParams.Builder c2 = gk.c();
            c2.setSourceRectHint(null);
            c2.setAspectRatio(null);
            if (i2 >= 31) {
                c2.setAutoEnterEnabled(false);
            }
            q3(launchActivity, c2.build());
        }
    }

    public static SpannableStringBuilder X3(CharSequence charSequence, Runnable runnable) {
        SpannableString spannableString = new SpannableString(ob6.M0(2131748763, null));
        spannableString.setSpan(new wk(runnable, (byte) 0), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return D2(spannableStringBuilder, true);
    }

    public static boolean Y(ViewGroup viewGroup, float f2, float f3, o68 o68Var) {
        int i2;
        Rect rect;
        int i3 = 0;
        while (i3 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof o68) || childAt == o68Var)) {
                if (childAt instanceof t8b) {
                    v8b v8bVar = (v8b) viewGroup;
                    if (v8bVar.b == null || (f2 >= L(60.0f) && f2 <= viewGroup.getWidth() - L(60.0f))) {
                        int i4 = 0;
                        while (i4 < v8bVar.getChildCount()) {
                            View childAt2 = v8bVar.getChildAt(i4);
                            if (childAt2 instanceof aab) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d2 = f2 - translationX;
                                i2 = i3;
                                double d3 = f3 - translationY;
                                float cos = (float) ((Math.cos(radians) * d2) - (Math.sin(radians) * d3));
                                float d4 = (float) ik8.d(radians, d3, Math.sin(radians) * d2);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && d4 >= (-measuredHeight) / 2.0f && d4 <= measuredHeight / 2.0f) {
                                    rect = Q;
                                    childAt.getHitRect(rect);
                                    if (rect.contains((int) f2, (int) f3) || !childAt.isClickable()) {
                                        if ((childAt instanceof ViewGroup) && Y((ViewGroup) childAt, f2 - childAt.getX(), f3 - childAt.getY(), o68Var)) {
                                            return true;
                                        }
                                        i3 = i2 + 1;
                                    } else {
                                        return true;
                                    }
                                }
                            } else {
                                i2 = i3;
                            }
                            i4++;
                            i3 = i2;
                        }
                    }
                }
                i2 = i3;
                rect = Q;
                childAt.getHitRect(rect);
                if (rect.contains((int) f2, (int) f3)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i3 = i2 + 1;
            }
            i2 = i3;
            i3 = i2 + 1;
        }
        return false;
    }

    public static int Y0(boolean z2) {
        if (z2) {
            Integer num = A;
            if (num == null) {
                num = 2560;
                A = num;
            }
            return num.intValue();
        }
        Integer num2 = z;
        if (num2 == null) {
            num2 = 1280;
            z = num2;
        }
        return num2.intValue();
    }

    public static void Y1(float[] fArr, float[] fArr2, float f2, float[] fArr3) {
        float f3;
        if (fArr3 != null) {
            for (int i2 = 0; i2 < fArr3.length; i2++) {
                float f4 = 0.0f;
                if (fArr != null && i2 < fArr.length) {
                    f3 = fArr[i2];
                } else {
                    f3 = 0.0f;
                }
                if (fArr2 != null && i2 < fArr2.length) {
                    f4 = fArr2[i2];
                }
                fArr3[i2] = R1(f3, f4, f2);
            }
        }
    }

    public static void Y2() {
        int i2;
        if (L == null) {
            L = Boolean.valueOf(P1());
        }
        K = null;
        if (xea.T0) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
            if (O1() && (a.b == null || !a.b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) {
                i2 = 18;
            } else {
                i2 = 16;
            }
            int i3 = sharedPreferences.getInt("fons_size", i2);
            xea.S0 = i3;
            xea.V0 = sharedPreferences.getInt("iv_font_size", i3);
        }
    }

    public static TLRPC.Document Z(long j2, List list) {
        if (list == null) {
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            TLRPC.Document document = (TLRPC.Document) list.get(i2);
            if (document != null && document.id == j2) {
                return document;
            }
        }
        return null;
    }

    public static float Z0(boolean z2, float f2) {
        float f3;
        float f4 = f2 / 2.54f;
        DisplayMetrics displayMetrics = B;
        if (z2) {
            f3 = displayMetrics.xdpi;
        } else {
            f3 = displayMetrics.ydpi;
        }
        return f4 * f3;
    }

    public static float Z1(float f2, float f3, float f4) {
        return ((((((((f3 - f2) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f4) + f2) + 360.0f) % 360.0f;
    }

    public static double[] Z2(int i2, int i3, int i4) {
        double max;
        double min;
        double d2;
        double d3;
        double d4;
        double d5;
        int i5;
        double d6 = i2 / 255.0d;
        double d7 = i3 / 255.0d;
        double d8 = i4 / 255.0d;
        int i6 = (d6 > d7 ? 1 : (d6 == d7 ? 0 : -1));
        if (i6 > 0 && d6 > d8) {
            max = d6;
        } else {
            max = Math.max(d7, d8);
        }
        if (d6 < d7 && d6 < d8) {
            min = d6;
        } else {
            min = Math.min(d7, d8);
        }
        double d9 = max - min;
        double d10 = 0.0d;
        if (max == 0.0d) {
            d2 = 0.0d;
        } else {
            d2 = d9 / max;
        }
        if (max != min) {
            if (i6 > 0 && d6 > d8) {
                d3 = (d7 - d8) / d9;
                if (d7 < d8) {
                    i5 = 6;
                } else {
                    i5 = 0;
                }
                d4 = i5;
            } else if (d7 > d8) {
                d5 = 2.0d + ((d8 - d6) / d9);
                d10 = d5 / 6.0d;
            } else {
                d3 = (d6 - d7) / d9;
                d4 = 4.0d;
            }
            d5 = d3 + d4;
            d10 = d5 / 6.0d;
        }
        return new double[]{d10, d2, max};
    }

    public static int a(float f2, float f3, float f4) {
        int i2;
        int i3;
        int i4;
        if (f3 == 0.0f) {
            i2 = (int) ((f4 * 255.0f) + 0.5f);
        } else {
            float floor = (f2 - ((float) Math.floor(f2))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f5 = (1.0f - f3) * f4;
            float B2 = xnb.B(f3, floor2, 1.0f, f4);
            float f6 = (1.0f - ((1.0f - floor2) * f3)) * f4;
            int i5 = (int) floor;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                if (i5 != 5) {
                                    i2 = 0;
                                } else {
                                    i2 = (int) ((f4 * 255.0f) + 0.5f);
                                    i3 = (int) ((f5 * 255.0f) + 0.5f);
                                    i4 = (int) ((B2 * 255.0f) + 0.5f);
                                }
                            } else {
                                i2 = (int) ((f6 * 255.0f) + 0.5f);
                                i3 = (int) ((f5 * 255.0f) + 0.5f);
                            }
                        } else {
                            i2 = (int) ((f5 * 255.0f) + 0.5f);
                            i3 = (int) ((B2 * 255.0f) + 0.5f);
                        }
                        i4 = (int) ((f4 * 255.0f) + 0.5f);
                    } else {
                        i2 = (int) ((f5 * 255.0f) + 0.5f);
                        i3 = (int) ((f4 * 255.0f) + 0.5f);
                        i4 = (int) ((f6 * 255.0f) + 0.5f);
                    }
                    return ((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255);
                }
                i2 = (int) ((B2 * 255.0f) + 0.5f);
                i3 = (int) ((f4 * 255.0f) + 0.5f);
            } else {
                i2 = (int) ((f4 * 255.0f) + 0.5f);
                i3 = (int) ((f6 * 255.0f) + 0.5f);
            }
            i4 = (int) ((f5 * 255.0f) + 0.5f);
            return ((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255);
        }
        i3 = i2;
        i4 = i3;
        return ((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255);
    }

    public static void a0() {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("google_bug_154855417", 0);
        if (!sharedPreferences.contains("fixed")) {
            new File(a.h(), "ZoomTables.data").delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        }
    }

    public static long a1(SharedPreferences sharedPreferences, String str, long j2) {
        try {
            return sharedPreferences.getLong(str, j2);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j2);
        }
    }

    public static void a2(RectF rectF, RectF rectF2, float f2, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float R1 = R1(rectF.centerX(), rectF2.centerX(), f2);
        float R12 = R1(rectF.centerY(), rectF2.centerY(), f2);
        float R13 = R1(rectF.width(), rectF2.width(), Math.min(1.0f, f2)) / 2.0f;
        float R14 = R1(rectF.height(), rectF2.height(), Math.min(1.0f, f2)) / 2.0f;
        rectF3.set(R1 - R13, R12 - R14, R1 + R13, R12 + R14);
    }

    public static void a3(float[] fArr, int[] iArr) {
        if (fArr != null) {
            if (iArr == null) {
                iArr = new int[fArr.length];
            }
            if (fArr.length == iArr.length) {
                float f2 = 0.0f;
                for (float f3 : fArr) {
                    f2 += f3;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < fArr.length; i3++) {
                    int floor = (int) Math.floor((fArr[i3] / f2) * 100.0f);
                    iArr[i3] = floor;
                    i2 += floor;
                }
                while (i2 < 100) {
                    int i4 = -1;
                    float f4 = 0.0f;
                    for (int i5 = 0; i5 < fArr.length; i5++) {
                        float f5 = fArr[i5];
                        float f6 = (f5 / f2) - (iArr[i5] / 100.0f);
                        if (f5 > 0.0f && f6 >= f4) {
                            i4 = i5;
                            f4 = f6;
                        }
                    }
                    if (i4 >= 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i2++;
                    } else {
                        return;
                    }
                }
                return;
            }
            su3.g("percents.length != output.length");
            return;
        }
        p3d.h("percents or output is null");
    }

    public static float[] b(int i2, int i3, int i4) {
        float f2;
        float f3;
        int max = Math.max(i2, i3);
        if (i4 > max) {
            max = i4;
        }
        int min = Math.min(i2, i3);
        if (i4 < min) {
            min = i4;
        }
        float f4 = max;
        float f5 = f4 / 255.0f;
        float f6 = 0.0f;
        if (max != 0) {
            f2 = (max - min) / f4;
        } else {
            f2 = 0.0f;
        }
        if (f2 != 0.0f) {
            float f7 = max - min;
            float f8 = (max - i2) / f7;
            float f9 = (max - i3) / f7;
            float f10 = (max - i4) / f7;
            if (i2 == max) {
                f3 = f10 - f9;
            } else if (i3 == max) {
                f3 = (f8 + 2.0f) - f10;
            } else {
                f3 = (f9 + 4.0f) - f8;
            }
            float f11 = f3 / 6.0f;
            if (f11 < 0.0f) {
                f6 = f11 + 1.0f;
            } else {
                f6 = f11;
            }
        }
        return new float[]{f6, f2, f5};
    }

    public static double b0(double d2) {
        return ((long) (d2 * 1000000.0d)) / 1000000.0d;
    }

    public static Point b1() {
        Point point = new Point();
        try {
            ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e2) {
            cc4.g(e2, true);
            return point;
        }
    }

    public static int b2(float f2, int i2, int i3) {
        return Color.argb(U1(f2, Color.alpha(i2), Color.alpha(i3)), U1(f2, Color.red(i2), Color.red(i3)), U1(f2, Color.green(i2), Color.green(i3)), U1(f2, Color.blue(i2), Color.blue(i3)));
    }

    public static int b3(boolean z2, boolean z3) {
        if (z2) {
            return w;
        }
        int i2 = v;
        if (z3) {
            return i2 - L(42.0f);
        }
        return i2;
    }

    public static void c(android.text.Spannable r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.c(android.text.Spannable, int, boolean, boolean):void");
    }

    public static void c0(View view, pcc pccVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                pccVar.a(view);
                c0(viewGroup.getChildAt(i2), pccVar);
            }
            return;
        }
        pccVar.a(view);
    }

    public static ArrayList c1() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        File[] externalFilesDirs = a.b.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((File) arrayList.get(i2)).getPath().equals(file2.getPath());
                    }
                    if (!hashSet.contains(file2.getAbsolutePath())) {
                        hashSet.add(file2.getAbsolutePath());
                        arrayList.add(file2);
                    }
                }
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !hashSet.contains(externalStorageDirectory.getAbsolutePath())) {
            arrayList.add(externalStorageDirectory);
        }
        return arrayList;
    }

    public static java.util.ArrayList c2(android.net.Uri r21, int r22, boolean r23, java.util.ArrayList r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.c2(android.net.Uri, int, boolean, java.util.ArrayList, java.lang.String):java.util.ArrayList");
    }

    public static void c3(Runnable runnable) {
        d3(runnable, 0L);
    }

    public static void d(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            a.b.sendBroadcast(intent);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public static void d0(RecyclerView recyclerView, pcc pccVar) {
        if (recyclerView != null) {
            for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                pccVar.a(recyclerView.getChildAt(i2));
            }
            for (int i3 = 0; i3 < recyclerView.getCachedChildCount(); i3++) {
                pccVar.a(recyclerView.Q(i3));
            }
            for (int i4 = 0; i4 < recyclerView.getHiddenChildCount(); i4++) {
                pccVar.a(recyclerView.X(i4));
            }
            for (int i5 = 0; i5 < recyclerView.getAttachedScrapChildCount(); i5++) {
                pccVar.a(recyclerView.P(i5));
            }
        }
    }

    public static android.graphics.Bitmap d1(float r7, float r8, java.lang.String r9, java.lang.String r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.d1(float, float, java.lang.String, java.lang.String, int):android.graphics.Bitmap");
    }

    public static void d2(Activity activity) {
        int requestedOrientation;
        WeakReference weakReference;
        if (activity != null && f == -10 && !P1()) {
            try {
                if (g != -10 && (weakReference = i) != null && weakReference.get() == activity) {
                    requestedOrientation = g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f = requestedOrientation;
                g = -10;
                h = -10;
                i = null;
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (windowManager != null && windowManager.getDefaultDisplay() != null) {
                    int rotation = windowManager.getDefaultDisplay().getRotation();
                    int i2 = activity.getResources().getConfiguration().orientation;
                    if (rotation == 3) {
                        if (i2 == 1) {
                            activity.setRequestedOrientation(1);
                        } else {
                            activity.setRequestedOrientation(8);
                        }
                    } else if (rotation == 1) {
                        if (i2 == 1) {
                            activity.setRequestedOrientation(9);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    } else if (rotation == 0) {
                        if (i2 == 2) {
                            activity.setRequestedOrientation(0);
                        } else {
                            activity.setRequestedOrientation(1);
                        }
                    } else if (i2 == 2) {
                        activity.setRequestedOrientation(8);
                    } else {
                        activity.setRequestedOrientation(9);
                    }
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public static void d3(Runnable runnable, long j2) {
        if (a.d == null) {
            return;
        }
        if (j2 == 0) {
            a.d.post(runnable);
        } else {
            a.d.postDelayed(runnable, j2);
        }
    }

    public static void e(String str) {
        if (str == null) {
            return;
        }
        d(new File(str));
    }

    public static String e0(int i2, double d2, double d3, int i3, int i4, boolean z2, int i5, int i6) {
        int i7;
        int i8 = 2;
        int min = Math.min(2, (int) Math.ceil(p));
        if (i6 == -1) {
            i7 = uc7.s1(i2).f3;
        } else {
            i7 = i6;
        }
        if (i7 != 1 && i7 != 3) {
            String str = uc7.s1(i2).i3;
            if (!TextUtils.isEmpty(str)) {
                if (z2) {
                    return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d3), str);
                }
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min), str);
            } else if (z2) {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d3));
            } else {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d2), Double.valueOf(d3), Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(min));
            }
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        mb6 mb6Var = ob6.D0().B;
        String str2 = null;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i8;
            if (strArr[i9].toLowerCase().contains(mb6Var.c)) {
                str2 = strArr[i9];
            }
            i9++;
            i8 = i10;
        }
        int i11 = i8;
        if (str2 == null) {
            str2 = "en_US";
        }
        if (z2) {
            Locale locale = Locale.US;
            Double valueOf = Double.valueOf(d3);
            Double valueOf2 = Double.valueOf(d2);
            Integer valueOf3 = Integer.valueOf(i5);
            Integer valueOf4 = Integer.valueOf(i3 * min);
            Integer valueOf5 = Integer.valueOf(i4 * min);
            Integer valueOf6 = Integer.valueOf(min);
            Double valueOf7 = Double.valueOf(d3);
            Double valueOf8 = Double.valueOf(d2);
            Object[] objArr = new Object[9];
            objArr[0] = valueOf;
            objArr[1] = valueOf2;
            objArr[i11] = valueOf3;
            objArr[3] = valueOf4;
            objArr[4] = valueOf5;
            objArr[5] = valueOf6;
            objArr[6] = valueOf7;
            objArr[7] = valueOf8;
            objArr[8] = str2;
            return String.format(locale, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", objArr);
        }
        Locale locale2 = Locale.US;
        Double valueOf9 = Double.valueOf(d3);
        Double valueOf10 = Double.valueOf(d2);
        Integer valueOf11 = Integer.valueOf(i5);
        Integer valueOf12 = Integer.valueOf(i3 * min);
        Integer valueOf13 = Integer.valueOf(i4 * min);
        Integer valueOf14 = Integer.valueOf(min);
        Object[] objArr2 = new Object[7];
        objArr2[0] = valueOf9;
        objArr2[1] = valueOf10;
        objArr2[i11] = valueOf11;
        objArr2[3] = valueOf12;
        objArr2[4] = valueOf13;
        objArr2[5] = valueOf14;
        objArr2[6] = str2;
        return String.format(locale2, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", objArr2);
    }

    public static int e1() {
        float f2 = p;
        if (f2 >= 4.0f) {
            return 3;
        }
        if (f2 >= 2.0f) {
            return 2;
        }
        return 1;
    }

    public static void e2(Activity activity) {
        int requestedOrientation;
        WeakReference weakReference;
        if (activity != null && !P1()) {
            try {
                if (g != -10 && (weakReference = i) != null && weakReference.get() == activity) {
                    requestedOrientation = g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f = requestedOrientation;
                g = -10;
                h = -10;
                i = null;
                activity.setRequestedOrientation(1);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public static void e3(RectF rectF, float f2, float f3, float f4) {
        rectF.set(f3 - ((f3 - rectF.left) * f2), f4 - ((f4 - rectF.top) * f2), ((rectF.right - f3) * f2) + f3, ((rectF.bottom - f4) * f2) + f4);
    }

    public static void f(CharSequence charSequence, String str) {
        if (str == null) {
            g(charSequence);
            return;
        }
        try {
            ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public static String f0(int i2) {
        if (i2 < 1000) {
            return Integer.toString(i2);
        }
        ArrayList arrayList = new ArrayList();
        while (i2 != 0) {
            int i3 = i2 % 1000;
            i2 /= 1000;
            if (i2 > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i3)));
            } else {
                arrayList.add(Integer.toString(i3));
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

    public static File f1() {
        return new File(xb4.z(4), "sharing/");
    }

    public static void f2() {
        cc4.b("[FLAG_SECURE]");
    }

    public static void f3(wk5 wk5Var, String str) {
        if (wk5Var != null && str != null) {
            e eVar = (e) wk5Var.getFragmentStack().get(wk5Var.getFragmentStack().size() - 1);
            try {
                Field declaredField = eVar.getClass().getDeclaredField("listView");
                declaredField.setAccessible(true);
                d79 d79Var = (d79) declaredField.get(eVar);
                d79Var.g1(new ie(eVar, str, d79Var, (byte) 3), 700, true);
                declaredField.setAccessible(false);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean g(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) a.b.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, f53.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e2) {
            cc4.g(e2, true);
            return false;
        }
    }

    public static String g0(int i2, boolean z2, boolean z3) {
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        if (i3 == 0) {
            if (z2) {
                return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i5));
            }
            return String.format(Locale.US, "%d:%02d", Integer.valueOf(i4), Integer.valueOf(i5));
        } else if (z3) {
            return String.format(Locale.US, "%d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
        } else {
            return String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    public static byte[] g1(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static void g2(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) a.b.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public static void g3(Activity activity, int i2) {
        if (activity != null && !O1()) {
            int i3 = N;
            if (i3 == 0 || i3 == i2) {
                activity.getWindow().setSoftInputMode(48);
            }
        }
    }

    public static void h(ColorMatrix colorMatrix, float f2) {
        float f3 = f2 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 1.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, 1.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String h0(int i2, boolean z2) {
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (z2) {
            return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static Long h1(String str) {
        String i1 = i1(str);
        if (i1 != null) {
            try {
                return Utilities.A(i1);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static Bitmap h2(float f2, int i2, View view) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f2);
        int height = (int) (view.getHeight() / f2);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f3 = 1.0f / f2;
        canvas.scale(f3, f3);
        canvas.drawColor(aob.w0(null, aob.d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i2, Math.max(width, height) / 180));
        return createBitmap;
    }

    public static void h3(Activity activity, boolean z2) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            j3(window.getDecorView(), z2);
        }
    }

    public static void i(ColorMatrix colorMatrix, float f2) {
        float f3 = f2 + 1.0f;
        float f4 = 1.0f - f3;
        float f5 = 0.3086f * f4;
        float f6 = 0.6094f * f4;
        float f7 = f4 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f5 + f3, f6, f7, 0.0f, 0.0f, f5, f6 + f3, f7, 0.0f, 0.0f, f5, f6, f3 + f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String i0(long j2, boolean z2, boolean z3) {
        if (j2 == 0) {
            return String.format("%d KB", 0);
        }
        if (j2 < 1024) {
            return String.format("%d B", Long.valueOf(j2));
        }
        if (j2 < 1048576) {
            float f2 = ((float) j2) / 1024.0f;
            if (z2) {
                int i2 = (int) f2;
                if ((f2 - i2) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i2));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f2));
        } else if (j2 < 1048576000) {
            float f3 = (((float) j2) / 1024.0f) / 1024.0f;
            if (z2) {
                int i3 = (int) f3;
                if ((f3 - i3) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i3));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f3));
        } else {
            float f4 = ((int) ((j2 / 1024) / 1024)) / 1000.0f;
            if (z2) {
                int i4 = (int) f4;
                if ((f4 - i4) * 10.0f == 0.0f) {
                    return String.format("%d GB", Integer.valueOf(i4));
                }
            }
            if (z3) {
                return String.format("%.1f GB", Float.valueOf(f4));
            }
            return String.format("%.2f GB", Float.valueOf(f4));
        }
    }

    public static String i1(String str) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, "r");
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = randomAccessFile.readLine();
            if (readLine != null) {
                try {
                    randomAccessFile.close();
                } catch (Exception unused3) {
                }
                return readLine;
            }
            randomAccessFile.close();
            return null;
        } catch (Exception unused4) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    public static SpannableStringBuilder i2(CharSequence charSequence, Runnable runnable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new wk(runnable, (byte) 1), 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void i3(Dialog dialog, boolean z2) {
        Window window;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            j3(window.getDecorView(), z2);
        }
    }

    public static List j() {
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
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add((View) method2.invoke(invoke, strArr[i2]));
            }
            return arrayList;
        } catch (Exception e2) {
            cc4.e("allGlobalViews()", e2);
            return null;
        }
    }

    public static String j0(int i2) {
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        if (i2 < 0) {
            return String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i3)), Integer.valueOf(Math.abs(i4)), Integer.valueOf(Math.abs(i5)));
        }
        return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String j1(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void j2(pcc pccVar, float f2) {
        k2(pccVar, f2, (int) f2, null);
    }

    public static void j3(View view, boolean z2) {
        int systemUiVisibility;
        int b2;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b2 = vsd.b((systemUiVisibility = view.getSystemUiVisibility()), 16, z2))) {
            view.setSystemUiVisibility(b2);
        }
    }

    public static int k(int i2, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i2);
        int red = Color.red(i2);
        int green = Color.green(i2);
        float f2 = red;
        float f3 = green;
        float blue = Color.blue(i2);
        float f4 = alpha;
        float f5 = (array[3] * f4) + (array[2] * blue) + (array[1] * f3) + (array[0] * f2) + array[4];
        float f6 = (array[8] * f4) + (array[7] * blue) + (array[6] * f3) + (array[5] * f2) + array[9];
        float f7 = (array[13] * f4) + (array[12] * blue) + (array[11] * f3) + (array[10] * f2) + array[14];
        float f8 = array[15] * f2;
        return Color.argb(ete.b(Math.round((array[18] * f4) + (array[17] * blue) + (array[16] * f3) + f8 + array[19]), 0, 255), ete.b(Math.round(f5), 0, 255), ete.b(Math.round(f6), 0, 255), ete.b(Math.round(f7), 0, 255));
    }

    public static String k0(int i2, int i3) {
        int i4 = i3 / 3600;
        int i5 = (i3 / 60) % 60;
        int i6 = i3 % 60;
        int i7 = i2 / 3600;
        int i8 = (i2 / 60) % 60;
        int i9 = i2 % 60;
        if (i3 == 0) {
            if (i7 == 0) {
                return String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i8), Integer.valueOf(i9));
            }
            return String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
        } else if (i7 == 0 && i4 == 0) {
            return String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i5), Integer.valueOf(i6));
        } else {
            return String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        }
    }

    public static int k1(int i2, int i3, int i4) {
        return Math.max(L(320.0f), (((i2 - i3) - i4) * 35) / 100) + i3;
    }

    public static void k2(pcc pccVar, float f2, int i2, ArrayList arrayList) {
        List j2 = j();
        if (j2 == null) {
            pccVar.a(null);
            return;
        }
        m0 = true;
        try {
            try {
                Point point = q;
                int i3 = (int) (point.x / f2);
                int i4 = (int) (((point.y + m) + n) / f2);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f3 = 1.0f / f2;
                canvas.scale(f3, f3);
                canvas.drawColor(aob.w0(null, aob.d6, false));
                for (int i5 = 0; i5 < j2.size(); i5++) {
                    View view = (View) j2.get(i5);
                    if (!(view instanceof wl4) && (arrayList == null || !arrayList.contains(view))) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(vm2.o(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f2, iArr[1] / f2);
                        try {
                            view.draw(canvas);
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i2, Math.max(i3, i4) / 180));
                pccVar.a(createBitmap);
            } catch (Exception e3) {
                cc4.g(e3, true);
                pccVar.a(null);
            }
        } finally {
            m0 = false;
        }
    }

    public static void k3(Activity activity, boolean z2) {
        if (activity != null) {
            n3(activity.getWindow(), z2);
        }
    }

    public static Bitmap l(Bitmap bitmap, ColorMatrix colorMatrix) {
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static SpannableStringBuilder l0(CharSequence charSequence, nu4 nu4Var, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i2 = 0; i2 < charSequenceArr.length; i2++) {
            String str = (String) nu4Var.h(Integer.valueOf(i2));
            int indexOf = charSequence2.indexOf(str);
            if (indexOf != -1) {
                valueOf.replace(indexOf, str.length() + indexOf, charSequenceArr[i2]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i2].toString() + charSequence2.substring(str.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static int l1(String str, boolean z2) {
        int i2;
        String substring;
        int[] iArr = b0;
        int[] iArr2 = a0;
        if (str != null && str.length() != 0) {
            if (!str.contains(".doc") && !str.contains(".txt") && !str.contains(".psd")) {
                if (!str.contains(".xls") && !str.contains(".csv")) {
                    if (!str.contains(".pdf") && !str.contains(".ppt") && !str.contains(".key")) {
                        if (!str.contains(".zip") && !str.contains(".rar") && !str.contains(".ai") && !str.contains(".mp3") && !str.contains(".mov") && !str.contains(".avi")) {
                            i2 = -1;
                        } else {
                            i2 = 3;
                        }
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            if (i2 == -1) {
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    substring = "";
                } else {
                    substring = str.substring(lastIndexOf + 1);
                }
                if (substring.length() != 0) {
                    i2 = substring.charAt(0) % iArr2.length;
                } else {
                    i2 = str.charAt(0) % iArr2.length;
                }
            }
            if (z2) {
                return iArr[i2];
            }
            return iArr2[i2];
        } else if (z2) {
            return iArr[0];
        } else {
            return iArr2[0];
        }
    }

    public static void l2(ColorMatrix colorMatrix, float f2) {
        colorMatrix.postConcat(new ColorMatrix(new float[]{f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void l3(Dialog dialog, boolean z2) {
        if (dialog != null) {
            n3(dialog.getWindow(), z2);
        }
    }

    public static void m(WindowManager.LayoutParams layoutParams) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            if (i3 >= 30) {
                i2 = 3;
            } else {
                i2 = 1;
            }
            bg.d(layoutParams, i2);
        }
    }

    public static SpannableStringBuilder m0(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (charSequence.toString().contains("%s")) {
            return l0(charSequence, new bg((byte) 22), charSequenceArr);
        }
        return l0(charSequence, new bg((byte) 24), charSequenceArr);
    }

    public static CharSequence m1(CharSequence charSequence) {
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

    public static boolean m2() {
        return n2(false);
    }

    public static void m3(View view, boolean z2) {
        int systemUiVisibility;
        int b2;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b2 = vsd.b((systemUiVisibility = view.getSystemUiVisibility()), 8192, z2))) {
            view.setSystemUiVisibility(b2);
        }
    }

    public static void n(Animator animator, double d2, double d3) {
        double d4;
        double d5;
        double sqrt = Math.sqrt(d2 / 1.0d);
        double sqrt2 = d3 / (Math.sqrt(d2 * 1.0d) * 2.0d);
        if (sqrt2 < 1.0d) {
            d5 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d4 = ((sqrt2 * sqrt) + (-0.0d)) / d5;
        } else {
            d4 = (-0.0d) + sqrt;
            d5 = 0.0d;
        }
        double d6 = d5;
        double d7 = d4;
        animator.setDuration((long) (((-5.991464547107982d) / ((-sqrt2) * sqrt)) * 1000.0d));
        animator.setInterpolator(new xk(sqrt2, sqrt, d6, d7));
    }

    public static String n0(int i2) {
        String str;
        String str2;
        String str3;
        int i3 = i2 / 3600;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 % 60;
        if (i3 > 0) {
            Locale locale = Locale.US;
            str = bp1.n(i3, "h");
        } else {
            str = "";
        }
        if (i4 > 0) {
            Locale locale2 = Locale.US;
            if (i3 > 0) {
                str3 = "%02dm";
            } else {
                str3 = "%dm";
            }
            str = str.concat(String.format(locale2, str3, Integer.valueOf(i4)));
        }
        Locale locale3 = Locale.US;
        if (i3 <= 0 && i4 <= 0) {
            str2 = "%ds";
        } else {
            str2 = "%02ds";
        }
        return str.concat(String.format(locale3, str2, Integer.valueOf(i5)));
    }

    public static Typeface n1(String str) {
        Typeface createFromAsset;
        Typeface typeface;
        Hashtable hashtable = d;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        gk.e();
                        Typeface.Builder builder = new Typeface.Builder(a.b.getAssets(), str);
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
                        createFromAsset = Typeface.createFromAsset(a.b.getAssets(), str);
                    }
                    hashtable.put(str, createFromAsset);
                } catch (Exception e2) {
                    if (f11.a) {
                        cc4.d("Could not get typeface '" + str + "' because " + e2.getMessage());
                    }
                    return null;
                }
            }
            typeface = (Typeface) hashtable.get(str);
        }
        return typeface;
    }

    public static boolean n2(boolean z2) {
        vr vrVar = vr.f;
        if (z2) {
            vrVar.getClass();
            if (SystemClock.elapsedRealtime() - vrVar.c < 200) {
                vrVar.b = false;
            }
        }
        boolean z3 = vrVar.b;
        if (z2) {
            vr.f.b = false;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (f11.a && z2 && xea.r.length() > 0) {
            cc4.b("wasInBackground = " + z3 + " appLocked = " + xea.w + " autoLockIn = " + xea.x + " lastPauseTime = " + xea.A + " uptime = " + elapsedRealtime);
        }
        if (xea.r.length() > 0 && z3) {
            if (!xea.w) {
                if ((xea.x != 0 && xea.A != 0 && !xea.w && xea.A + xea.x <= elapsedRealtime) || elapsedRealtime + 5 < xea.A) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void n3(Window window, boolean z2) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int b2 = vsd.b(systemUiVisibility, 8192, z2);
        if (systemUiVisibility != b2) {
            decorView.setSystemUiVisibility(b2);
        }
        if (Build.VERSION.SDK_INT < 35 && window.getStatusBarColor() != 0) {
            window.setStatusBarColor(0);
        }
    }

    public static Typeface o() {
        Typeface typeface = a;
        if (typeface == null) {
            if (xea.R0 && Build.VERSION.SDK_INT >= 28) {
                Typeface create = Typeface.create(null, 500, false);
                a = create;
                return create;
            }
            Typeface n1 = n1("fonts/rmedium.ttf");
            a = n1;
            return n1;
        }
        return typeface;
    }

    public static String o0(int i2, int i3) {
        String[] strArr;
        if (i2 != 0) {
            float f2 = i2;
            if (i3 == 0) {
                i3 = i2;
            }
            if (i3 < 1000) {
                return f0(i2);
            }
            int i4 = 0;
            while (true) {
                strArr = g0;
                if (i3 < 1000 || i4 >= strArr.length - 1) {
                    break;
                }
                i3 /= 1000;
                f2 /= 1000.0f;
                i4++;
            }
            if (f2 < 0.1d) {
                return "0";
            }
            float f3 = f2 * 10.0f;
            float f4 = (int) f3;
            if (f3 == f4) {
                Locale locale = Locale.ENGLISH;
                return qd4.o(f0((int) f2), strArr[i4]);
            }
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f4 / 10.0f), strArr[i4]);
        }
        return "0";
    }

    public static int o1(View view) {
        if (view != null) {
            int height = view.getHeight();
            Point point = q;
            if (height != point.y && view.getHeight() != point.y - m) {
                try {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        return rootWindowInsets.getStableInsetBottom();
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
        }
        return 0;
    }

    public static void o2(long j2, StringBuilder sb) {
        if (j2 < 10) {
            sb.append("0");
            sb.append(j2);
            return;
        }
        sb.append(j2);
    }

    public static void o3(Dialog dialog, int i2, boolean z2, xz1 xz1Var) {
        if (dialog != null) {
            p3(dialog.getWindow(), i2, z2, xz1Var);
        }
    }

    public static int p(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
                if (createScaledBitmap != null) {
                    int pixel = createScaledBitmap.getPixel(0, 0);
                    if (bitmap != createScaledBitmap) {
                        createScaledBitmap.recycle();
                    }
                    return pixel;
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
                return 0;
            }
        }
        return 0;
    }

    public static String p0(int i2, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i2 == 0) {
            StringBuilder p2 = ik8.p("IMG_", format, ".");
            if (TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            p2.append(str);
            return p2.toString();
        }
        return qd4.y("VID_", format, ".mp4");
    }

    public static void p1(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view != null && viewGroup != null) {
            while (view != viewGroup) {
                if (!(view.getParent() instanceof fic)) {
                    fArr[0] = view.getX() + fArr[0];
                    fArr[1] = view.getY() + fArr[1];
                }
                view = (View) view.getParent();
            }
        }
    }

    public static void p2(jga jgaVar) {
        if (jgaVar == null || jgaVar.getAdapter() == null) {
            return;
        }
        if (jgaVar.e0()) {
            jgaVar.post(new c1(jgaVar, (byte) 12));
        } else {
            jgaVar.getAdapter().f();
        }
    }

    public static void p3(Window window, int i2, boolean z2, xz1 xz1Var) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap hashMap = l0;
        if (hashMap != null && (valueAnimator = (ValueAnimator) hashMap.get(window)) != null) {
            valueAnimator.cancel();
            l0.remove(window);
        }
        if (!z2) {
            if (xz1Var != null) {
                n12 n12Var = xz1Var.b;
                n12Var.G0 = -1;
                n12Var.H0 = i2;
                n12Var.b.invalidate();
            }
            try {
                window.setNavigationBarColor(i2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i2);
        ofArgb.addUpdateListener(new lk(xz1Var, window, (byte) 0));
        ofArgb.addListener(new h0(window, (byte) 6));
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(k43.f);
        ofArgb.start();
        HashMap hashMap2 = l0;
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
            l0 = hashMap2;
        }
        hashMap2.put(window, ofArgb);
    }

    public static int[] q(Drawable drawable) {
        if (drawable instanceof g82) {
            return q(((g82) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i2 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i2 = p(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i2 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof yd0) {
                int[] iArr2 = ((yd0) drawable).a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i2 = w0(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i2 = iArr2[0];
                    }
                }
            } else if (drawable instanceof ih7) {
                iArr[2] = 754974720;
                iArr[0] = 754974720;
                iArr[3] = 1023410176;
                iArr[1] = 1023410176;
                return iArr;
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        double[] Z2 = Z2((i2 >> 16) & 255, (i2 >> 8) & 255, i2 & 255);
        double d2 = Z2[1];
        Z2[1] = Math.min(1.0d, ((1.0d - d2) * 0.1d) + 0.05d + d2);
        int[] w1 = w1(Z2[0], Z2[1], Math.max(0.0d, Z2[2] * 0.65d));
        iArr[0] = Color.argb(102, w1[0], w1[1], w1[2]);
        iArr[1] = Color.argb(136, w1[0], w1[1], w1[2]);
        int[] w12 = w1(Z2[0], Z2[1], Math.max(0.0d, Z2[2] * 0.72d));
        iArr[2] = Color.argb(102, w12[0], w12[1], w12[2]);
        iArr[3] = Color.argb(136, w12[0], w12[1], w12[2]);
        return iArr;
    }

    public static File q0(String str, boolean z2) {
        try {
            File z3 = xb4.z(100);
            if (!z2 && z3 != null) {
                return new File(z3, p0(0, str));
            }
            return new File(a.b.getExternalFilesDir(Environment.DIRECTORY_PICTURES), p0(0, str));
        } catch (Exception e2) {
            cc4.g(e2, true);
            return null;
        }
    }

    public static int q1(int i2, boolean z2) {
        int i3;
        if (z2) {
            i3 = i2 + 180;
        } else {
            i3 = i2 - 180;
        }
        while (i3 >= 360) {
            i3 -= 360;
        }
        while (i3 < 0) {
            i3 += 360;
        }
        return i3;
    }

    public static void q2(r47 r47Var, Activity activity, e eVar) {
        TLRPC.Document F0;
        String str;
        File file;
        char c2;
        String str2;
        String str3;
        String str4;
        if (r47Var != null && (F0 = r47Var.F0()) != null) {
            if (r47Var.k.media != null) {
                str = xb4.r(null, F0);
            } else {
                str = "";
            }
            String str5 = r47Var.k.attachPath;
            if (str5 != null && str5.length() != 0) {
                file = new File(r47Var.k.attachPath);
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                xb4.G(yac.t0);
                file = xb4.M(r47Var.k, false, true);
            }
            if (file != null && file.exists()) {
                if (eVar != null && file.getName().toLowerCase().endsWith("attheme")) {
                    znb u2 = aob.u(file, r47Var.I0(), null, true);
                    if (u2 != null) {
                        eVar.presentFragment(new pqb(u2));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    HashMap hashMap = new HashMap();
                    int i2 = aob.L5;
                    hashMap.put("info1", Integer.valueOf(eVar.getThemedColor(i2)));
                    hashMap.put("info2", Integer.valueOf(eVar.getThemedColor(i2)));
                    alertDialog$Builder.l(2131624108, 52, eVar.getThemedColor(i2), hashMap);
                    id idVar = alertDialog$Builder.a;
                    idVar.X = true;
                    idVar.U = ob6.M0(2131748954, null);
                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    eVar.showDialog(idVar);
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(1);
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    c2 = 0;
                    try {
                        int lastIndexOf = str.lastIndexOf(46);
                        if (lastIndexOf == -1 || ((str2 = singleton.getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase())) == null && ((str2 = F0.mime_type) == null || str2.length() == 0))) {
                            str2 = null;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            a.d();
                            Uri c3 = FileProvider.c(activity, "org.telegram.messenger.beta.provider", file);
                            if (str2 == null) {
                                str4 = "text/plain";
                            } else {
                                str4 = str2;
                            }
                            intent.setDataAndType(c3, str4);
                        } else {
                            Uri fromFile = Uri.fromFile(file);
                            if (str2 == null) {
                                str3 = "text/plain";
                            } else {
                                str3 = str2;
                            }
                            intent.setDataAndType(fromFile, str3);
                        }
                        if (str2 != null) {
                            try {
                                activity.startActivityForResult(intent, 500);
                                return;
                            } catch (Exception unused) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    a.d();
                                    intent.setDataAndType(FileProvider.c(activity, "org.telegram.messenger.beta.provider", file), "text/plain");
                                } else {
                                    intent.setDataAndType(Uri.fromFile(file), "text/plain");
                                }
                                activity.startActivityForResult(intent, 500);
                                return;
                            }
                        }
                        activity.startActivityForResult(intent, 500);
                    } catch (Exception unused2) {
                        if (activity != null) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                            HashMap hashMap2 = new HashMap();
                            int i3 = aob.L5;
                            hashMap2.put("info1", Integer.valueOf(eVar.getThemedColor(i3)));
                            hashMap2.put("info2", Integer.valueOf(eVar.getThemedColor(i3)));
                            alertDialog$Builder2.l(2131624108, 52, eVar.getThemedColor(i3), hashMap2);
                            id idVar2 = alertDialog$Builder2.a;
                            idVar2.X = true;
                            alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                            Object[] objArr = new Object[1];
                            objArr[c2] = r47Var.F0().mime_type;
                            idVar2.U = ob6.a0("NoHandleAppInstalled", null, 2131747936, objArr);
                            eVar.showDialog(idVar2);
                        }
                    }
                } catch (Exception unused3) {
                    c2 = 0;
                }
            }
        }
    }

    public static void q3(LaunchActivity launchActivity, PictureInPictureParams pictureInPictureParams) {
        if (launchActivity != null && !launchActivity.isDestroyed()) {
            if (pictureInPictureParams == null) {
                X2(launchActivity);
                return;
            }
            try {
                launchActivity.setPictureInPictureParams(pictureInPictureParams);
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
    }

    public static void r(Runnable runnable) {
        if (a.d == null) {
            return;
        }
        a.d.removeCallbacks(runnable);
    }

    public static CharSequence r0(String str, String str2, String str3) {
        int i2;
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                str = qd4.y(str, " ", str2);
            }
        } else {
            str = str2;
        }
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i3 = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i3);
            if (indexOf == -1) {
                break;
            }
            int i4 = 1;
            if (indexOf == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i5 = indexOf - i2;
            int length = str3.length();
            if (indexOf == 0) {
                i4 = 0;
            }
            int i6 = length + i4 + i5;
            if (i3 != 0) {
                if (i3 != i5 + 1) {
                    spannableStringBuilder.append((CharSequence) trim.substring(i3, i5));
                }
            } else if (i5 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i5));
            }
            String substring = trim.substring(i5, Math.min(trim.length(), i6));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new ho4(aob.q6, null), length2, trim2.length() + length2, 33);
            i3 = i6;
        }
        if (i3 != -1 && i3 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i3));
        }
        return spannableStringBuilder;
    }

    public static boolean r1(LaunchActivity launchActivity, Intent intent) {
        Uri data;
        jx8 d2;
        if (intent != null) {
            try {
                if ((intent.getFlags() & 1048576) == 0 && (data = intent.getData()) != null && (d2 = jx8.d(data)) != null && d2.g()) {
                    F3(launchActivity, d2);
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean r2(r47 r47Var, Activity activity, vnb vnbVar, boolean z2) {
        File file;
        String str = r47Var.k.attachPath;
        String str2 = null;
        if (str != null && str.length() != 0) {
            file = new File(r47Var.k.attachPath);
        } else {
            file = null;
        }
        if (file == null || !file.exists()) {
            xb4.G(r47Var.K1);
            file = xb4.M(r47Var.k, false, true);
        }
        File file2 = file;
        int i2 = r47Var.D;
        if (i2 == 9 || i2 == 0) {
            str2 = r47Var.t1();
        }
        return s2(file2, r47Var.S0(), str2, activity, vnbVar, z2);
    }

    public static void r3(Window window) {
        WindowManager windowManager;
        float f2 = s;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f2;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public static float s(float f2, float f3, float f4, float f5) {
        if (f4 <= 0.0f) {
            return f2;
        }
        float min = Math.min(f5, f4) * (1.0f / f4);
        return ete.a((f2 - ((1.0f - min) * (f3 / f4))) / min, 0.0f, 1.0f);
    }

    public static File s0(boolean z2) {
        try {
            File v0 = v0(z2);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.b.nextInt(1000) + 1);
            SimpleDateFormat simpleDateFormat = f0;
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
                f0 = simpleDateFormat;
            }
            String format = simpleDateFormat.format(date);
            return new File(v0, "VID_" + format + ".mp4");
        } catch (Exception e2) {
            cc4.g(e2, true);
            return null;
        }
    }

    public static boolean s1(e eVar) {
        List j2;
        if (eVar != null) {
            Dialog dialog = eVar.visibleDialog;
            if (dialog == null || (dialog instanceof id) || ((dialog instanceof nx0) && ((nx0) dialog).i1 != null)) {
                if (eVar.getParentLayout() != null && (j2 = j()) != null && !j2.isEmpty()) {
                    View view = null;
                    for (int size = j2.size() - 1; size >= 0; size--) {
                        view = (View) j2.get(size);
                        Dialog dialog2 = eVar.visibleDialog;
                        if (dialog2 instanceof id) {
                            View view2 = ((id) dialog2).b1;
                            while (view2 != null && (view2.getParent() instanceof View)) {
                                view2 = (View) view2.getParent();
                            }
                            if (view == view2) {
                                continue;
                            }
                        }
                        if (!(view instanceof dd) && !(view instanceof wl4)) {
                            break;
                        }
                    }
                    View view3 = eVar.getParentLayout().getView();
                    while (view3 != null && (view3.getParent() instanceof View)) {
                        view3 = (View) view3.getParent();
                    }
                    if (view == view3) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean s2(java.io.File r6, java.lang.String r7, java.lang.String r8, android.app.Activity r9, defpackage.vnb r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.s2(java.io.File, java.lang.String, java.lang.String, android.app.Activity, vnb, boolean):boolean");
    }

    public static void s3(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - s) > 0.2d) {
            layoutParams.preferredRefreshRate = s;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
        }
    }

    public static int t(java.lang.CharSequence r5, java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.t(java.lang.CharSequence, java.lang.CharSequence):int");
    }

    public static int t0() {
        if (yac.h(yac.t0).o() && !ConnectionsManager.getInstance(yac.t0).isTestBackend()) {
            return yac.t0;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (yac.h(i2).o() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                return i2;
            }
        }
        return yac.t0;
    }

    public static void t1(View view) {
        if (view != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (!inputMethodManager.isActive()) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public static boolean t2(org.telegram.tgnet.TLObject r8, android.app.Activity r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl.t2(org.telegram.tgnet.TLObject, android.app.Activity):boolean");
    }

    public static void t3(uv uvVar, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            uvVar.setEdgeEffectColor(i2);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(uvVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i2);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(uvVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i2);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public static void u(Context context, boolean z2) {
        int i2;
        if (context == null) {
            return;
        }
        if (aob.I.o() && z2) {
            i2 = 2131755328;
        } else {
            i2 = 2131755318;
        }
        context.setTheme(i2);
    }

    public static Activity u0() {
        Activity W2 = W(null);
        if (W2 == null || W2.isFinishing()) {
            W2 = LaunchActivity.H1;
        }
        if (W2 != null && !W2.isFinishing()) {
            return W2;
        }
        return W(a.b);
    }

    public static SpannableStringBuilder u1(CharSequence charSequence, String str, vnb vnbVar) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(charSequence)) {
            String lowerCase = charSequence.toString().toLowerCase();
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            int indexOf = lowerCase.indexOf(str);
            while (indexOf >= 0) {
                try {
                    valueOf.setSpan(new ho4(aob.q6, vnbVar), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                indexOf = lowerCase.indexOf(str, indexOf + 1);
            }
            return valueOf;
        }
        return null;
    }

    public static long u2(int i2, int i3) {
        return (i2 << 32) | (i3 & 4294967295L);
    }

    public static void u3(ScrollView scrollView, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            scrollView.setTopEdgeEffectColor(i2);
            scrollView.setBottomEdgeEffectColor(i2);
            return;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i2);
            }
            Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i2);
            }
        } catch (Exception unused) {
        }
    }

    public static void v(Context context, Configuration configuration) {
        float f2;
        boolean z2;
        int i2;
        int i3;
        Display defaultDisplay;
        try {
            float f3 = p;
            p = context.getResources().getDisplayMetrics().density;
            if (o && Math.abs(f3 - f2) > 0.001d) {
                if (aob.m3 != null) {
                    aob.m3 = null;
                    aob.J(context, false);
                }
                if (aob.A0 != null) {
                    aob.A0 = null;
                    aob.S(context);
                }
                if (aob.Q1 != null) {
                    aob.Q1 = null;
                    aob.X(context);
                }
            }
            o = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            if (configuration.keyboard != 1 && configuration.hardKeyboardHidden == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            D = z2;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = B;
            Point point = q;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(point);
                float refreshRate = defaultDisplay.getRefreshRate();
                r = refreshRate;
                s = refreshRate;
                float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
                if (supportedRefreshRates != null) {
                    for (float f4 : supportedRefreshRates) {
                        if (f4 > s) {
                            s = f4;
                        }
                    }
                }
                t = 1000.0f / r;
            }
            if (configuration.screenWidthDp != 0) {
                int ceil = (int) Math.ceil(i2 * p);
                if (Math.abs(point.x - ceil) > 3) {
                    point.x = ceil;
                }
            }
            if (configuration.screenHeightDp != 0) {
                int ceil2 = (int) Math.ceil(i3 * p);
                if (Math.abs(point.y - ceil2) > 3) {
                    point.y = ceil2;
                }
            }
            if (u == 0) {
                if (O1()) {
                    u = (int) (P0() * 0.6f);
                    v = P0() - L(28.0f);
                    w = P0() - L(92.0f);
                } else {
                    u = (int) (Math.min(point.x, point.y) * 0.6f);
                    v = Math.min(point.x, point.y) - L(28.0f);
                    w = Math.min(point.x - L(64.0f), point.y) - L(28.0f);
                }
                x = L(2.0f);
            }
            if (f11.a) {
                cc4.d("density = " + p + " display size = " + point.x + " " + point.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + m + ", navbar height: " + n);
            }
            e = ViewConfiguration.get(context).getScaledTouchSlop();
            M = null;
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public static File v0(boolean z2) {
        int i2;
        if (!z2 && f11.b && (((i2 = Build.VERSION.SDK_INT) < 33 || a.b.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) && (i2 > 33 || a.b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0))) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                if (!file.mkdirs() && !file.exists()) {
                    if (f11.a) {
                        cc4.b("failed to create directory");
                        return null;
                    }
                } else {
                    return file;
                }
            } else if (f11.a) {
                cc4.b("External storage is not mounted READ/WRITE.");
            }
            return null;
        }
        return xb4.z(0);
    }

    public static CharSequence v1(CharSequence charSequence, ArrayList arrayList, vnb vnbVar) {
        if (arrayList != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                SpannableStringBuilder u1 = u1(charSequence, (String) arrayList.get(i3), vnbVar);
                if (u1 != null) {
                    charSequence = u1;
                } else {
                    i2++;
                }
            }
            if (i2 != arrayList.size()) {
                return charSequence;
            }
        }
        return null;
    }

    public static String v2(File file, int i2) {
        InputStream inputStream;
        ThreadLocal threadLocal = b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStream = new FileInputStream(file);
            } else {
                inputStream = a.b.getResources().openRawResource(i2);
            }
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            ThreadLocal threadLocal2 = c;
            byte[] bArr2 = (byte[]) threadLocal2.get();
            if (bArr2 == null) {
                bArr2 = new byte[4096];
                threadLocal2.set(bArr2);
            }
            int i3 = 0;
            while (true) {
                int read = inputStream.read(bArr2, 0, bArr2.length);
                if (read >= 0) {
                    int i4 = i3 + read;
                    if (bArr.length < i4) {
                        byte[] bArr3 = new byte[bArr.length << 1];
                        System.arraycopy(bArr, 0, bArr3, 0, i3);
                        b.set(bArr3);
                        bArr = bArr3;
                    }
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, i3, read);
                        i3 = i4;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable unused2) {
                    }
                }
            }
            inputStream.close();
            return new String(bArr, 0, i3);
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

    public static void v3(View view, int i2, int i3, int i4, int i5) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin != i2 || marginLayoutParams.topMargin != i3 || marginLayoutParams.rightMargin != i4 || marginLayoutParams.bottomMargin != i5) {
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    marginLayoutParams.bottomMargin = i5;
                    view.requestLayout();
                }
            }
        }
    }

    public static boolean w(String str) {
        boolean z2;
        boolean z3;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z2 = false;
            z3 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    char charAt = str.charAt(i2);
                    if (charAt != '.' && charAt != '-' && charAt != '/' && charAt != '+' && (charAt < '0' || charAt > '9')) {
                        if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        if (z2 && z3) {
                            break;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    cc4.g(e, true);
                    return !z2 ? false : false;
                }
            }
        } catch (Exception e3) {
            e = e3;
            z2 = false;
            z3 = false;
        }
        if (!z2 && z3) {
            return true;
        }
    }

    public static int w0(int i2, int i3) {
        int red = Color.red(i2);
        int red2 = Color.red(i3);
        int green = Color.green(i2);
        int green2 = Color.green(i3);
        int blue = Color.blue(i2);
        return Color.argb(255, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i3) / 2) + (blue / 2));
    }

    public static int[] w1(double d2, double d3, double d4) {
        double d5;
        double d6 = d2 * 6.0d;
        double floor = (int) Math.floor(d6);
        double d7 = d6 - floor;
        double d8 = (1.0d - d3) * d4;
        double d9 = (1.0d - (d7 * d3)) * d4;
        double d10 = (1.0d - ((1.0d - d7) * d3)) * d4;
        int i2 = ((int) floor) % 6;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                d4 = 0.0d;
                                d10 = 0.0d;
                                d8 = 0.0d;
                            } else {
                                d10 = d9;
                            }
                        } else {
                            d5 = d10;
                            d10 = d4;
                        }
                    } else {
                        d10 = d4;
                        d4 = d8;
                        d8 = d9;
                    }
                } else {
                    d5 = d8;
                    d8 = d4;
                }
                d4 = d5;
            } else {
                d10 = d8;
                d8 = d4;
                d4 = d9;
            }
        } else {
            d8 = d10;
            d10 = d8;
        }
        return new int[]{(int) (d4 * 255.0d), (int) (d8 * 255.0d), (int) (d10 * 255.0d)};
    }

    public static void w2(Bitmap bitmap) {
        x2(Collections.singletonList(bitmap));
    }

    public static void w3(fic ficVar, int i2) {
        try {
            Field declaredField = fic.class.getDeclaredField("g0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(ficVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i2);
            }
            Field declaredField2 = fic.class.getDeclaredField("h0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(ficVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i2);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean x(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String h2 = f78.h(str2, false);
            int i2 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = h2.indexOf(str3, i2);
                    if (indexOf == -1) {
                        return false;
                    }
                    i2 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static void x0(Surface surface, Bitmap bitmap) {
        if (!surface.isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surface, bitmap, new qk(countDownLatch, (byte) 0), Utilities.g.b());
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public static float x1(float f2, float f3, float f4) {
        return (f2 - f3) / (f4 - f3);
    }

    public static void x2(List list) {
        if (Build.VERSION.SDK_INT > 23 && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bitmap bitmap = (Bitmap) list.get(i2);
                if (bitmap != null && !bitmap.isRecycled()) {
                    arrayList.add(new WeakReference(bitmap));
                }
            }
            d3(new se(arrayList, (byte) 2), 36L);
        }
    }

    public static void x3(boolean z2) {
        synchronized (l) {
            try {
                CallReceiver callReceiver = d0;
                if (z2) {
                    if (callReceiver == null) {
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                        if (Build.VERSION.SDK_INT >= 33) {
                            Context context = a.b;
                            CallReceiver callReceiver2 = new CallReceiver();
                            d0 = callReceiver2;
                            context.registerReceiver(callReceiver2, intentFilter, 4);
                        } else {
                            Context context2 = a.b;
                            CallReceiver callReceiver3 = new CallReceiver();
                            d0 = callReceiver3;
                            context2.registerReceiver(callReceiver3, intentFilter);
                        }
                    }
                } else if (callReceiver != null) {
                    a.b.unregisterReceiver(d0);
                    d0 = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void y(View view) {
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

    public static void y0(SurfaceView surfaceView, Bitmap bitmap) {
        if (surfaceView != null && surfaceView.getHolder().getSurface().isValid()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(surfaceView, bitmap, new qk(countDownLatch, (byte) 1), Utilities.g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static int y1(String str, String str2) {
        if (!str2.isEmpty() && !str.isEmpty()) {
            for (int i2 = 0; i2 < str.length() && str2.length() + i2 <= str.length(); i2++) {
                int i3 = 0;
                for (int i4 = i2; i4 < str.length() && i3 < str2.length() && Character.toLowerCase(str.charAt(i4)) == Character.toLowerCase(str2.charAt(i3)); i4++) {
                    i3++;
                }
                if (i3 == str2.length()) {
                    return i2;
                }
            }
            return -1;
        }
        return str.indexOf(str2);
    }

    public static void y2(Activity activity, int i2) {
        if (activity != null && !O1() && N == i2) {
            activity.getWindow().setSoftInputMode(32);
        }
    }

    public static void y3(boolean z2) {
        synchronized (k) {
            j = z2;
            if (z2) {
                h05 h05Var = new h05(a.b, qa4.q, wn.g, g05.c);
                wjb b2 = xjb.b();
                b2.a = new Object();
                b2.c = new a94[]{vid.a};
                b2.d = (char) 1567;
                h05Var.e(1, b2.a()).addOnSuccessListener(new bg((byte) 23));
            }
        }
    }

    public static ByteBuffer z(ByteBuffer byteBuffer) {
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

    public static void z0(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView != null && a.d != null && surfaceView.getHolder().getSurface().isValid()) {
            PixelCopy.request(surfaceView, bitmap, new qk(runnable, (byte) 2), a.d);
        }
    }

    public static boolean z1(int i2, int i3, int i4, int i5) {
        if (Math.max(i2, i3) > Math.min(i4, i5) && Math.max(i4, i5) > Math.min(i2, i3)) {
            return true;
        }
        return false;
    }

    public static void z2(Activity activity, int i2) {
        if (activity != null && O == i2) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static void z3(View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(2131296648);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ok(view, (byte) 0));
        ofFloat.addListener(new vk(view, (byte) 0));
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(2131296648, ofFloat);
    }
}
