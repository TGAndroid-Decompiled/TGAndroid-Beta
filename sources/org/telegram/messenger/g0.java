package org.telegram.messenger;

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
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cq0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn0;
import org.telegram.ui.v71;
public abstract class g0 {
    public static final int C;
    public static boolean D;
    public static boolean E;
    public static AccessibilityManager I;
    public static Vibrator J;
    public static final Pattern S;
    public static final Pattern T;
    public static final Pattern U;
    public static final Pattern V;
    public static final Pattern W;
    public static Typeface f22535a;
    public static final int[] f22536a0;
    public static final int[] f22538b0;
    public static final f f22540c0;
    public static CallReceiver f22541d0;
    public static float f22542e;
    public static Pattern f22543e0;
    public static SimpleDateFormat f22545f0;
    public static final String[] f22547g0;
    public static final float[] f22548h0;
    public static WeakReference f22549i;
    public static final float[] f22550i0;
    public static final char[] f22552j0;
    public static HashSet f22554k0;
    public static HashMap f22556l0;
    public static boolean m0;
    public static Pattern f22559n0;
    public static boolean f22560o;
    public static final Paint f22561o0;
    public static int f22567u;
    public static int v;
    public static int f22568w;
    public static int f22569x;
    public static boolean f22570y;
    public static final ThreadLocal f22537b = new ThreadLocal();
    public static final ThreadLocal f22539c = new ThreadLocal();
    public static final Hashtable d = new Hashtable();
    public static int f22544f = -10;
    public static int f22546g = -10;
    public static int h = -10;
    public static boolean f22551j = false;
    public static final Object f22553k = new Object();
    public static final Object f22555l = new Object();
    public static int f22557m = 0;
    public static int f22558n = 0;
    public static float f22562p = 1.0f;
    public static final Point f22563q = new Point();
    public static float f22564r = 60.0f;
    public static float f22565s = 60.0f;
    public static float f22566t = 16.666666f;
    public static Integer f22571z = null;
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
        int i7;
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
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (Q1()) {
            i7 = 80;
        } else {
            i7 = 72;
        }
        C = i7;
        v(t0.f25566b, null);
        f22536a0 = new int[]{2131231730, 2131231732, 2131231734, 2131231736};
        f22538b0 = new int[]{2131231731, 2131231733, 2131231735, 2131231737};
        f22540c0 = new Object();
        f22547g0 = new String[]{"", "K", "M", "B", "T", "P"};
        f22548h0 = new float[9];
        f22550i0 = new float[9];
        f22552j0 = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        f22561o0 = new Paint(1);
    }

    public static int A(int i7, int i10) {
        if (i7 == i10) {
            return 0;
        }
        if (i7 > i10) {
            return 1;
        }
        return -1;
    }

    public static void A0(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView != null && t0.d != null && surfaceView.getHolder().getSurface().isValid()) {
            PixelCopy.request(surfaceView, bitmap, new p(runnable, 2), t0.d);
        }
    }

    public static int A1(String str, String str2) {
        if (!str2.isEmpty() && !str.isEmpty()) {
            for (int i7 = 0; i7 < str.length() && str2.length() + i7 <= str.length(); i7++) {
                int i10 = 0;
                for (int i11 = i7; i11 < str.length() && i10 < str2.length() && Character.toLowerCase(str.charAt(i11)) == Character.toLowerCase(str2.charAt(i10)); i11++) {
                    i10++;
                }
                if (i10 == str2.length()) {
                    return i7;
                }
            }
            return -1;
        }
        return str.indexOf(str2);
    }

    public static void A2(List list) {
        if (Build.VERSION.SDK_INT > 23 && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                Bitmap bitmap = (Bitmap) list.get(i7);
                if (bitmap != null && !bitmap.isRecycled()) {
                    arrayList.add(new WeakReference(bitmap));
                }
            }
            i3(new k(1, arrayList), 36L);
        }
    }

    public static void A3(org.telegram.ui.r2 r2Var, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            r2Var.setEdgeEffectColor(i7);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(r2Var);
            if (edgeEffect != null) {
                edgeEffect.setColor(i7);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(r2Var);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i7);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static float B(int i7) {
        float green = Color.green(i7) * 0.7152f;
        return com.google.android.recaptcha.internal.a.y(Color.blue(i7), 0.0722f, green + (Color.red(i7) * 0.2126f), 255.0f);
    }

    public static Bitmap B0(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i7) {
                    boolean z9;
                    boolean[] zArr2 = zArr;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (i7 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zArr2[0] = z9;
                    countDownLatch2.countDown();
                }
            }, Utilities.f21338g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (zArr[0]) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public static boolean B1(int i7, int i10, int i11, int i12) {
        if (Math.max(i7, i10) > Math.min(i11, i12) && Math.max(i11, i12) > Math.min(i7, i10)) {
            return true;
        }
        return false;
    }

    public static void B2(Activity activity, int i7) {
        if (activity != null && !Q1() && N == i7) {
            activity.getWindow().setSoftInputMode(32);
        }
    }

    public static void B3(View view, int i7, int i10, int i11, int i12) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin != i7 || marginLayoutParams.topMargin != i10 || marginLayoutParams.rightMargin != i11 || marginLayoutParams.bottomMargin != i12) {
                    marginLayoutParams.leftMargin = i7;
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    marginLayoutParams.bottomMargin = i12;
                    view.requestLayout();
                }
            }
        }
    }

    public static CharSequence C(CharSequence... charSequenceArr) {
        if (charSequenceArr.length == 0) {
            return "";
        }
        int i7 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i7 < length) {
                    CharSequence charSequence2 = charSequenceArr[i7];
                    if (charSequence2 == null) {
                        charSequence2 = "null";
                    }
                    spannableStringBuilder.append(charSequence2);
                    i7++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i7 < length2) {
            sb2.append(charSequenceArr[i7]);
            i7++;
        }
        return sb2.toString();
    }

    public static Uri C0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File E0 = E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        File file = new File(E0, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            Context context = t0.f25566b;
            t0.d();
            Uri d2 = FileProvider.d(context, "org.telegram.messenger.beta.provider", file);
            fileOutputStream.close();
            return d2;
        } catch (Exception e11) {
            a8.g(e11, true);
            return null;
        }
    }

    public static boolean C1() {
        if (I == null) {
            I = (AccessibilityManager) t0.f25566b.getSystemService("accessibility");
        }
        if (I.isEnabled() && I.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public static void C2(Activity activity, int i7) {
        if (activity != null && O == i7) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static void C3(c5.k kVar, int i7) {
        try {
            Field declaredField = c5.k.class.getDeclaredField("f0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(kVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i7);
            }
            Field declaredField2 = c5.k.class.getDeclaredField("g0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(kVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i7);
            }
        } catch (Exception unused) {
        }
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

    public static String D0() {
        String str;
        try {
            PackageInfo packageInfo = t0.f25566b.getPackageManager().getPackageInfo(t0.f25566b.getPackageName(), 0);
            int i7 = packageInfo.versionCode;
            int i10 = i7 / 10;
            int i11 = i7 % 10;
            if (i11 != 1 && i11 != 2) {
                t0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            return id.a0("TelegramVersion", null, 2131744213, "v" + packageInfo.versionName + " (" + i10 + ") " + str);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static boolean D1(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (tL_chatBannedRights != null && Math.abs(tL_chatBannedRights.until_date - (System.currentTimeMillis() / 1000)) <= 157680000) {
            return false;
        }
        return true;
    }

    public static String D2(String str) {
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

    public static void D3(boolean z9) {
        synchronized (f22555l) {
            try {
                try {
                    if (z9) {
                        if (f22541d0 == null) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context = t0.f25566b;
                                CallReceiver callReceiver = new CallReceiver();
                                f22541d0 = callReceiver;
                                context.registerReceiver(callReceiver, intentFilter, 4);
                            } else {
                                Context context2 = t0.f25566b;
                                CallReceiver callReceiver2 = new CallReceiver();
                                f22541d0 = callReceiver2;
                                context2.registerReceiver(callReceiver2, intentFilter);
                            }
                        }
                    } else if (f22541d0 != null) {
                        t0.f25566b.unregisterReceiver(f22541d0);
                        f22541d0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused) {
            }
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
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static File E0() {
        String str;
        String str2 = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e10) {
            a8.g(e10, true);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            a8.b("external dir mounted");
            try {
                File[] externalCacheDirs = t0.f25566b.getExternalCacheDirs();
                int i7 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(iz.f23405h0)) {
                    while (true) {
                        if (i7 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i7];
                            if (file2 != null && file2.getAbsolutePath().startsWith(iz.f23405h0)) {
                                file = externalCacheDirs[i7];
                                break;
                            }
                            i7++;
                        } else {
                            break;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("check dir ");
                if (file != null) {
                    str2 = file.getPath();
                }
                sb2.append(str2);
                sb2.append(" ");
                a8.b(sb2.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    a8.b("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        try {
            File cacheDir = t0.f25566b.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            File filesDir = t0.f25566b.getFilesDir();
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

    public static boolean E1(Context context) {
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
            return E1(((ContextWrapper) context).getBaseContext());
        }
    }

    public static void E2(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public static void E3(boolean z9) {
        synchronized (f22553k) {
            try {
                f22551j = z9;
                if (z9) {
                    com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(t0.f25566b, b6.a.f2990l, com.google.android.gms.common.api.b.f6532j, com.google.android.gms.common.api.i.f6542c);
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.f6682c = new sa.d(jVar, 14);
                    b10.d = new n6.c[]{m7.b.f19924a};
                    b10.f6680a = 1567;
                    jVar.e(1, b10.a()).addOnSuccessListener(new ni.a(11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void F(File file, File file2) {
        try {
            E(file, file2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static int F0(int i7, int i10) {
        int red = Color.red(i7);
        int green = Color.green(i7);
        int blue = Color.blue(i7);
        int red2 = Color.red(i10);
        int i11 = (red + red2) / 2;
        int i12 = red - red2;
        int green2 = green - Color.green(i10);
        int blue2 = blue - Color.blue(i10);
        return (green2 * 4 * green2) + ((((i11 + 512) * i12) * i12) >> 8) + ((((767 - i11) * blue2) * blue2) >> 8);
    }

    public static boolean F1(Exception exc) {
        if (!(exc instanceof IOException) || !(exc.getCause() instanceof ErrnoException) || ((ErrnoException) exc.getCause()).errno != OsConstants.ENOSPC) {
            if (exc.getMessage() != null && exc.getMessage().equalsIgnoreCase("no space left on device")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static String F2(String str) {
        if (str == null) {
            return null;
        }
        if (X == null) {
            X = Pattern.compile("[\\u200E\\u200F\\u202A-\\u202E]");
        }
        Matcher matcher = X.matcher(str);
        if (matcher == null) {
            return str;
        }
        return matcher.replaceAll("");
    }

    public static void F3(View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(2131296646);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(view, 0));
        ofFloat.addListener(new di.l2(2, view));
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(2131296646, ofFloat);
    }

    public static void G(File file) {
        try {
            if (file.exists()) {
                return;
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.flush();
            fileWriter.close();
        } catch (Throwable th2) {
            a8.g(th2, false);
        }
    }

    public static java.lang.String[] G0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.G0():java.lang.String[]");
    }

    public static boolean G1(Exception exc) {
        if (!(exc instanceof IOException) || !(exc.getCause() instanceof ErrnoException) || ((ErrnoException) exc.getCause()).errno != OsConstants.EROFS) {
            if (exc.getMessage() != null && exc.getMessage().toLowerCase().contains("read-only file system")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder G2(SpannableStringBuilder spannableStringBuilder, float f10, float f11) {
        return J2(spannableStringBuilder, true, f10, f11, 1.0f, 2131232241);
    }

    public static void G3(float f10, View view, Runnable runnable) {
        if (view == null) {
            return;
        }
        int L2 = L(f10);
        if (view.getTag(2131296663) != null) {
            ((r1.g) view.getTag(2131296663)).d();
        }
        Float f11 = (Float) view.getTag(2131296664);
        if (f11 != null) {
            view.setTranslationX(f11.floatValue());
        }
        view.setTag(2131296664, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        r1.g gVar = new r1.g(view, r1.g.f54251o, translationX);
        r1.h hVar = new r1.h(translationX);
        hVar.b(600.0f);
        gVar.f54268m = hVar;
        gVar.f54258a = (-L2) * 100;
        gVar.a(new fi.h3(translationX, view, runnable));
        view.setTag(2131296663, gVar);
        gVar.h();
    }

    public static byte[] H(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        while (i7 < bArr.length) {
            byte b10 = bArr[i7];
            if (b10 == 61) {
                try {
                    int digit = Character.digit((char) bArr[i7 + 1], 16);
                    i7 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i7], 16)));
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i7++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e11) {
            a8.g(e11, true);
            return byteArray;
        }
    }

    public static java.lang.String H0(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.H0(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean H1(Activity activity) {
        if (Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode()) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder H2(CharSequence charSequence, boolean z9) {
        return J2(charSequence, z9, L(2.6666667f), 0.0f, 1.0f, 2131232241);
    }

    public static void H3(View view) {
        G3(10.0f, view, null);
    }

    public static float I(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public static i0.b I0(r0.k1 k1Var, boolean z9) {
        i0.b g10 = k1Var.f54202a.g(647);
        r0.h1 h1Var = k1Var.f54202a;
        i0.b a10 = i0.b.a(g10, h1Var.f(647));
        if (z9) {
            return i0.b.a(a10, h1Var.f(8));
        }
        return a10;
    }

    public static boolean I1(Uri uri, int i7) {
        String str;
        if (uri != null) {
            str = uri.getPath();
            if (str == null) {
                return false;
            }
            if (str.matches(Pattern.quote(new File(t0.f25566b.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
                return false;
            }
            int i10 = 0;
            while (str.length() <= 4096) {
                try {
                    String readlink = Utilities.readlink(str);
                    if (readlink != null && !readlink.equals(str)) {
                        i10++;
                        if (i10 >= 10) {
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
        int i11 = 0;
        while (str.length() <= 4096) {
            try {
                String readlinkFd = Utilities.readlinkFd(i7);
                if (readlinkFd != null && !readlinkFd.equals(str)) {
                    i11++;
                    if (i11 >= 10) {
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
        return str.toLowerCase().contains("/data/data/" + t0.f25566b.getPackageName());
    }

    public static SpannableStringBuilder I2(CharSequence charSequence, boolean z9, float f10, float f11) {
        return J2(charSequence, z9, f10, f11, 1.0f, 2131232241);
    }

    public static boolean I3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.I3():boolean");
    }

    public static void J(View view, Runnable runnable) {
        if (view == null) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new u(view, runnable));
        }
    }

    public static int J0(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        float height = (bitmap.getHeight() - 1) / 10.0f;
        float width = (bitmap.getWidth() - 1) / 10.0f;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 10; i13++) {
            for (int i14 = 0; i14 < 10; i14++) {
                int pixel = bitmap.getPixel((int) (i13 * width), (int) (i14 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i10;
                    int green = Color.green(pixel) + i11;
                    i7++;
                    i12 = Color.blue(pixel) + i12;
                    i11 = green;
                    i10 = red;
                }
            }
        }
        if (i7 == 0) {
            return 0;
        }
        return Color.argb(255, i10 / i7, i11 / i7, i12 / i7);
    }

    public static boolean J1(org.telegram.ui.ActionBar.f2 f2Var) {
        ((nb.a) t0.k()).getClass();
        try {
            t0.f25566b.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
            ((nb.a) t0.k()).getClass();
            alertDialog$Builder.f27296a.T = id.M0(2131749197, null);
            alertDialog$Builder.k(id.M0(2131747832, null), new o(0, "com.google.android.apps.maps", f2Var));
            alertDialog$Builder.h(id.M0(2131752589, null), null);
            f2Var.showDialog(alertDialog$Builder.f27296a);
            return false;
        }
    }

    public static SpannableStringBuilder J2(CharSequence charSequence, boolean z9, float f10, float f11, float f12, int i7) {
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i7, 0);
        float f13 = f12 * 0.88f;
        wpVar.H = f13;
        wpVar.I = f13;
        wpVar.f40020r = -f10;
        wpVar.f40021s = f11;
        wpVar.G = 0.8f;
        if (z9) {
            wpVar.f40018f = z9;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
        SpannableStringBuilder M2 = M2(charSequence, spannableString, " >");
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(wpVar, 0, 1, 33);
        SpannableStringBuilder M22 = M2(M2, spannableString2, ">");
        org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(i7, 0);
        wpVar2.H = f13;
        wpVar2.I = f13;
        wpVar2.f40020r = f10;
        wpVar2.f40021s = f11;
        wpVar2.f40022w = 180.0f;
        wpVar2.G = 0.8f;
        if (z9) {
            wpVar2.f40018f = z9;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(wpVar2, 0, 1, 33);
        return M2(M22, spannableString3, "<");
    }

    public static boolean J3(String str) {
        try {
            return w(Uri.parse(str).getHost());
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
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

    public static String K0(String str, boolean z9) {
        if (str != null) {
            if (f22559n0 == null) {
                f22559n0 = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
            }
            Matcher matcher = f22559n0.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(4);
                if (group != null) {
                    group = group.toLowerCase();
                }
                if (z9 && group != null && group.startsWith("www.")) {
                    return group.substring(4);
                }
                return group;
            }
            return null;
        }
        return null;
    }

    public static boolean K1(char c10) {
        if (f22554k0 == null) {
            f22554k0 = new HashSet();
            int i7 = 0;
            while (true) {
                char[] cArr = f22552j0;
                if (i7 >= cArr.length) {
                    break;
                }
                f22554k0.add(Character.valueOf(cArr[i7]));
                i7++;
            }
        }
        return f22554k0.contains(Character.valueOf(c10));
    }

    public static SpannableStringBuilder K2(CharSequence charSequence, CharSequence charSequence2, String str) {
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

    public static boolean K3(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static int L(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(f22562p * f10);
    }

    public static Pair L0(File file) {
        try {
            return O0(new u1.g(file));
        } catch (Exception e10) {
            a8.g(e10, true);
            return new Pair(0, 0);
        }
    }

    public static boolean L1(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i7 = 0; i7 < charSequence.length(); i7++) {
                char charAt = charSequence.charAt(i7);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder L2(String str, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.qr qrVar) {
        if (f22543e0 == null) {
            f22543e0 = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f22543e0.matcher(str);
        int i7 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i7, matcher.start());
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new v(qrVar, group2, f6Var, 0), spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i7 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i7, str.length());
        return spannableStringBuilder;
    }

    public static void L3(final LaunchActivity launchActivity, final ui.a aVar) {
        if (!aVar.g()) {
            return;
        }
        String str = aVar.f56917b;
        int i7 = aVar.f56918c;
        String str2 = aVar.d;
        String str3 = aVar.f56919e;
        String str4 = aVar.f56920f;
        org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(1, (Context) launchActivity, (org.telegram.ui.ActionBar.f6) null, false);
        v2Var.N();
        v2Var.f28650u0 = false;
        v2Var.f28651v0 = false;
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        linearLayout.setOrientation(1);
        v2Var.N = linearLayout;
        TextView b10 = c8.qa.b(launchActivity, 20.0f, org.telegram.ui.ActionBar.k6.f27960j5, true, null);
        b10.setText(id.M0(2131743778, null));
        linearLayout.addView(b10, c8.ha.t(-1, -2, 55, 22, 18, 22, 0));
        tx0 tx0Var = new tx0(launchActivity, null);
        linearLayout.addView(tx0Var, c8.ha.t(-1, -2, 55, 14, 18, 14, 0));
        if (!TextUtils.isEmpty(str)) {
            tx0Var.c(id.M0(2131743794, null), str, null, null);
        }
        if (i7 != 0) {
            tx0Var.c(id.M0(2131743789, null), Integer.toString(i7), null, null);
        }
        if (!TextUtils.isEmpty(str4)) {
            tx0Var.c(id.M0(2131743787, null), str4, null, null);
        }
        if (!TextUtils.isEmpty(str2)) {
            tx0Var.c(id.M0(2131743777, null), str2, null, null);
        }
        if (!TextUtils.isEmpty(str3)) {
            tx0Var.c(id.M0(2131743790, null), str3, null, null);
        }
        org.telegram.ui.Components.jc[] jcVarArr = new org.telegram.ui.Components.jc[1];
        tx0Var.c(id.M0(2131746601, null), "", null, jcVarArr);
        ((View) jcVarArr[0].getParent()).setPadding(0, 0, 0, 0);
        jcVarArr[0].setDisablePaddingsOffsetY(true);
        jcVarArr[0].setPadding(L(12.66f), L(9.33f), L(12.66f), L(9.33f));
        jcVarArr[0].setText(O2(id.M0(2131746610, null), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false), new em(new boolean[1], jcVarArr, aVar, launchActivity, 5)));
        if (!TextUtils.isEmpty(str4)) {
            rx0 a10 = tx0Var.a(id.M0(2131743779, null));
            a10.setFilled(true);
            xh.l lVar = (xh.l) a10.getChildAt(0);
            lVar.setTextSize(1, 11.0f);
            lVar.setGravity(17);
        }
        fi.d dVar = new fi.d(launchActivity, null, true);
        dVar.setRoundRadius(24);
        dVar.setText(id.M0(2131751808, null));
        final org.telegram.ui.ActionBar.g2 g2Var = v2Var.f28655x0;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putBoolean("proxy_enabled", true);
                ui.a aVar2 = ui.a.this;
                aVar2.i(edit);
                edit.commit();
                iz.B1 = iz.a(new hz(aVar2));
                ConnectionsManager.setProxySettings(true, aVar2);
                qs.e().k(qs.A4, new Object[0]);
                org.telegram.ui.ActionBar.f2 lastFragment = launchActivity.M().getLastFragment();
                if (lastFragment instanceof org.telegram.ui.an) {
                    org.telegram.ui.an anVar = (org.telegram.ui.an) lastFragment;
                    anVar.f8();
                    UndoView undoView = anVar.M3;
                    if (undoView != null) {
                        undoView.j(87, 0L, null);
                        g2Var.run();
                    }
                }
                qs.e().k(qs.P4, 6, id.M0(2131746611, null));
                g2Var.run();
            }
        });
        linearLayout.addView(dVar, c8.ha.t(-1, 48, 55, 14, 18, 14, 14));
        v2Var.show();
    }

    public static int M(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(f22562p * f10);
    }

    public static Pair M0(InputStream inputStream) {
        try {
            return O0(new u1.g(inputStream));
        } catch (Exception e10) {
            a8.g(e10, true);
            return new Pair(0, 0);
        }
    }

    public static boolean M1(Context context) {
        Activity W2 = W(context);
        if (W2 == null) {
            return true;
        }
        if (!W2.isDestroyed() && !W2.isFinishing()) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder M2(CharSequence charSequence, CharSequence charSequence2, String str) {
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

    public static void M3(int i7, int i10, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i7, iArr[1] - i10, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                M3(i7, i10, iArr, canvas, viewGroup.getChildAt(i11));
            }
        }
    }

    public static float N(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f22562p * f10;
    }

    public static Pair N0(String str) {
        try {
            return O0(new u1.g(str));
        } catch (Exception unused) {
            return new Pair(0, 0);
        }
    }

    public static boolean N1() {
        TelephonyManager telephonyManager = (TelephonyManager) t0.f25566b.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        if (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || Settings.Global.getInt(t0.f25566b.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return false;
        }
        return true;
    }

    public static CharSequence N2(CharSequence charSequence) {
        int i7 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            while (i7 < length) {
                if (sb2.charAt(i7) == '\n') {
                    sb2.setCharAt(i7, ' ');
                }
                i7++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i7 < length2) {
                if (charSequence.charAt(i7) == '\n') {
                    spannableStringBuilder.replace(i7, i7 + 1, (CharSequence) " ");
                }
                i7++;
            }
            return spannableStringBuilder;
        } else if (charSequence instanceof SpannableString) {
            if (TextUtils.indexOf(charSequence, '\n') < 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            int length3 = charSequence.length();
            while (i7 < length3) {
                if (charSequence.charAt(i7) == '\n') {
                    spannableStringBuilder2.replace(i7, i7 + 1, (CharSequence) " ");
                }
                i7++;
            }
            return spannableStringBuilder2;
        } else if (charSequence == null) {
            return null;
        } else {
            return charSequence.toString().replace('\n', ' ');
        }
    }

    public static Bitmap N3(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        M3(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
    }

    public static void O(Canvas canvas, FrameLayout frameLayout, int i7, int i10, float f10) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(T1(0.0f, 0.75f, R0(i10)) * f10, i7);
        Paint paint = f22561o0;
        paint.setColor(r12);
        canvas.drawRect(0.0f, (frameLayout.getY() + frameLayout.getMeasuredHeight()) - i10, frameLayout.getMeasuredWidth(), frameLayout.getY() + frameLayout.getMeasuredHeight(), paint);
    }

    public static Pair O0(u1.g gVar) {
        int i7;
        int i10 = 0;
        try {
            int i11 = 2;
            switch (gVar.c()) {
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i7 = 180;
                    i11 = 0;
                    i10 = i7;
                    break;
                case 4:
                    break;
                case 5:
                    i10 = 270;
                    break;
                case 6:
                    i7 = 90;
                    i11 = 0;
                    i10 = i7;
                    break;
                case 7:
                    i11 = 1;
                    i10 = 270;
                    break;
                case 8:
                    i11 = 0;
                    i10 = 270;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            return new Pair(Integer.valueOf(i10), Integer.valueOf(i11));
        } catch (Exception e10) {
            a8.g(e10, true);
            return new Pair(0, 0);
        }
    }

    public static boolean O1() {
        boolean z9;
        if (M == null) {
            Point point = f22563q;
            if (((Math.max(point.x, point.y) - f22557m) - f22558n) / f22562p <= 650.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            M = Boolean.valueOf(z9);
        }
        return M.booleanValue();
    }

    public static SpannableStringBuilder O2(String str, int i7, Runnable runnable) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i11 = indexOf2 - indexOf) > 2) {
            i10 = i11 - 2;
        } else {
            indexOf = -1;
            i10 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new z(i7, runnable), indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new t(i7, 1), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static String O3(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String S0 = id.E0().S0(str, true, false);
        if (S0 == null) {
            return "";
        }
        return S0;
    }

    public static void P(Canvas canvas, RectF rectF, float f10) {
        float min = Math.min(f10, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float N2 = N(1.0f);
        float f11 = N2 / 2.0f;
        float max = Math.max(0.0f, min - N2);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = Y;
        paint.setStyle(style);
        paint.setStrokeWidth(N2);
        paint.setColor(org.telegram.ui.ActionBar.k6.r1(1.0f, 570425343));
        canvas.save();
        float f12 = rectF.top;
        if (canvas.clipRect(rectF.left - f11, f12, rectF.right + f11, c8.j9.a(f12 + max, f12, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f11, rectF.right, f11 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float N3 = N(0.6666667f);
        float f13 = N3 / 2.0f;
        float max2 = Math.max(0.0f, min - N3);
        Paint paint2 = Z;
        paint2.setStyle(style);
        paint2.setStrokeWidth(N3);
        paint2.setColor(org.telegram.ui.ActionBar.k6.r1(1.0f, 385875967));
        canvas.save();
        float f14 = rectF.bottom;
        if (canvas.clipRect(rectF.left - f13, c8.j9.a(f14 - max2, rectF.top, f14), rectF.right + f13, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f13, rectF.right, rectF.bottom - f13, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static File P0() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = t0.f25566b.getExternalFilesDir(null);
                File file = new File(externalFilesDir.getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(t0.f25566b.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(t0.f25566b.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            t0.a(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static boolean P1() {
        Point point = f22563q;
        if (Math.min(point.x, point.y) / f22562p <= 690.0f) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder P2(int i7, String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i11 = indexOf2 - indexOf) > 2) {
            i10 = i11 - 2;
        } else {
            indexOf = -1;
            i10 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new t(i7, 0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static CharSequence P3(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) <= ' ') {
            i7++;
        }
        while (i7 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i7;
        }
        if (i7 <= 0 && length >= charSequence.length()) {
            return charSequence;
        }
        return charSequence.subSequence(i7, length);
    }

    public static CharSequence Q(CharSequence charSequence, String str, int i7, TextPaint textPaint) {
        CharSequence charSequence2;
        int i10;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            int indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > 130) {
                CharSequence subSequence2 = charSequence.subSequence(Math.max(0, indexOf - 65), Math.min(length, indexOf + 65));
                try {
                    int max = indexOf - Math.max(0, indexOf - 65);
                    subSequence2.length();
                    i10 = max;
                    charSequence2 = subSequence2;
                } catch (Exception e10) {
                    e = e10;
                    charSequence2 = subSequence2;
                    a8.g(e, true);
                    return charSequence2;
                }
            } else {
                i10 = indexOf;
                charSequence2 = charSequence;
            }
        } catch (Exception e11) {
            e = e11;
            charSequence2 = charSequence;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f10 = i7;
            if (textPaint.measureText("...") + lineWidth >= f10) {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i12))) {
                    i12++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i12);
                if (staticLayout.isRtlCharAt(i12)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f10) {
                    float f11 = 0.1f * f10;
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f10) + f11;
                    if (charSequence2.length() - i12 > 20) {
                        measureText += f11;
                    }
                    if (measureText > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                        if (offsetForHorizontal > charSequence2.length() - 1) {
                            offsetForHorizontal = charSequence2.length() - 1;
                        }
                        int i13 = 0;
                        while (true) {
                            if (Character.isWhitespace(charSequence2.charAt(offsetForHorizontal)) || i13 >= 10) {
                                break;
                            }
                            i13++;
                            offsetForHorizontal++;
                            if (offsetForHorizontal > charSequence2.length() - 1) {
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                                break;
                            }
                        }
                        if (i13 >= 10) {
                            subSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i11) - (f10 * 0.3f)), charSequence2.length());
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
        } catch (Exception e12) {
            e = e12;
            a8.g(e, true);
            return charSequence2;
        }
    }

    public static int Q0() {
        boolean P1 = P1();
        Point point = f22563q;
        if (!P1) {
            int min = Math.min(point.x, point.y);
            return min - l1(min, 0, 0);
        }
        int min2 = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        return Math.min(min2, max - l1(max, 0, 0));
    }

    public static boolean Q1() {
        if (R1() && !iz.W) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder Q2(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, boolean z9) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i11 = indexOf2 - indexOf) > 2) {
            i10 = i11 - 2;
        } else {
            indexOf = -1;
            i10 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (runnable != null) {
                spannableStringBuilder.setSpan(new a0(z9, i7, f6Var, runnable), indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new b0(z9, i7, f6Var), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Q3(Activity activity) {
        boolean z9;
        if (activity != null) {
            try {
                if (f22544f != -10) {
                    int requestedOrientation = activity.getRequestedOrientation();
                    activity.setRequestedOrientation(f22544f);
                    if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        f22546g = f22544f;
                        h = requestedOrientation;
                        f22549i = new WeakReference(activity);
                    }
                    f22544f = -10;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static MotionEvent R() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static float R0(int i7) {
        return Utilities.l((i7 - L(32.0f)) / L(16.0f));
    }

    public static boolean R1() {
        boolean z9;
        if (K == null) {
            if (t0.f25566b != null && t0.f25566b.getResources().getBoolean(2131034114)) {
                z9 = true;
            } else {
                z9 = false;
            }
            K = Boolean.valueOf(z9);
        }
        return K.booleanValue();
    }

    public static SpannableStringBuilder R2(String str, int i7, org.telegram.ui.ActionBar.f6 f6Var, qn0 qn0Var) {
        return Q2(str, i7, f6Var, qn0Var, false);
    }

    public static void R3(ImageView imageView, int i7) {
        S3(imageView, imageView.getContext().getDrawable(i7));
    }

    public static void S(Window window) {
        int i7;
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
            if (i10 >= 30) {
                i7 = 3;
            } else {
                i7 = 1;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i7) {
                ni.a.k(attributes, i7);
                window.setAttributes(attributes);
            }
        }
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static int S0(float f10, float f11, int i7, int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        int red2 = Color.red(i7);
        int green2 = Color.green(i7);
        int blue2 = Color.blue(i7);
        int alpha2 = Color.alpha(i7);
        return Color.argb((int) com.google.android.recaptcha.internal.a.B(alpha - alpha2, f10, alpha2, f11), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2));
    }

    public static boolean S1(char c10) {
        if (c10 != '-' && c10 != '~') {
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder S2(String str, int i7, int i10, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        int i12;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i12 = indexOf2 - indexOf) > 2) {
            i11 = i12 - 2;
        } else {
            indexOf = -1;
            i11 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (i10 == 3) {
                int i13 = indexOf + i11;
                spannableStringBuilder.replace(indexOf, i13, (CharSequence) M2(spannableStringBuilder.subSequence(indexOf, i13), " ", " "));
            }
            if (i10 != 0 && i10 != 3 && i10 != 2 && i10 != 4) {
                spannableStringBuilder.setSpan(new li.w5(f6Var, 1), indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new y(i10, i7, f6Var, runnable), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void S3(final ImageView imageView, final Drawable drawable) {
        if (imageView.getDrawable() == drawable) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float abs = Math.abs(floatValue - 0.5f) + 0.5f;
                ImageView imageView2 = imageView;
                imageView2.setScaleX(abs);
                imageView2.setScaleY(abs);
                if (floatValue >= 0.5f) {
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if (!atomicBoolean2.get()) {
                        atomicBoolean2.set(true);
                        imageView2.setImageDrawable(drawable);
                    }
                }
            }
        });
        duration.start();
    }

    public static void T() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) t0.f25566b.getSystemService("phone");
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
            a8.g(th2, true);
        }
    }

    public static String T0(Uri uri) {
        Uri uri2;
        String[] split;
        try {
            if (DocumentsContract.isDocumentUri(t0.f25566b, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    if ("primary".equalsIgnoreCase(DocumentsContract.getDocumentId(uri).split(":")[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    return H0(t0.f25566b, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    int hashCode = str.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875 && str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                return H0(t0.f25566b, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return H0(t0.f25566b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (str.equals("image")) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            return H0(t0.f25566b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        uri2 = null;
                        return H0(t0.f25566b, uri2, "_id=?", new String[]{split2[1]});
                    }
                    if (str.equals("audio")) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        return H0(t0.f25566b, uri2, "_id=?", new String[]{split2[1]});
                    }
                    uri2 = null;
                    return H0(t0.f25566b, uri2, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return H0(t0.f25566b, uri, null, null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            return null;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static float T1(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, f12, f10);
    }

    public static SpannableStringBuilder T2(String str, int i7, org.telegram.ui.af afVar) {
        return S2(str, i7, 0, afVar, null);
    }

    public static void T3(WindowManager windowManager, bi.x5 x5Var, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && x5Var != null && x5Var.getParent() != null) {
            windowManager.updateViewLayout(x5Var, layoutParams);
        }
    }

    public static String U(String str) {
        return F2(D2(str));
    }

    public static int U0(int i7) {
        return V0(i7, false);
    }

    public static float U1(float f10, float[] fArr) {
        return T1(fArr[0], fArr[1], f10);
    }

    public static SpannableStringBuilder U2(String str, Runnable runnable) {
        return S2(str, -1, 0, runnable, null);
    }

    public static void U3(float f10, View view, boolean z9, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        float f13;
        if (view != null) {
            int i7 = 0;
            if (view.getParent() == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            Integer num = null;
            view.animate().setListener(null).cancel();
            float f14 = 0.5f;
            float f15 = 0.0f;
            if (!z11) {
                if (!z9) {
                    i7 = 8;
                }
                view.setVisibility(i7);
                if (z9) {
                    num = 1;
                }
                view.setTag(num);
                view.setAlpha(1.0f);
                if (z10 && !z9) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                view.setScaleX(f13);
                if (!z10 || z9) {
                    f14 = 1.0f;
                }
                view.setScaleY(f14);
                if (f10 != 0.0f) {
                    if (!z9) {
                        f15 = L(-16.0f) * f10;
                    }
                    view.setTranslationY(f15);
                }
            } else if (z9) {
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    if (z10) {
                        f12 = 0.5f;
                    } else {
                        f12 = 1.0f;
                    }
                    view.setScaleX(f12);
                    if (!z10) {
                        f14 = 1.0f;
                    }
                    view.setScaleY(f14);
                    if (f10 != 0.0f) {
                        view.setTranslationY(L(-16.0f) * f10);
                    }
                }
                ViewPropertyAnimator withEndAction = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).withEndAction(null);
                if (f10 != 0.0f) {
                    withEndAction.translationY(0.0f);
                }
                withEndAction.start();
            } else {
                ViewPropertyAnimator alpha = view.animate().alpha(0.0f);
                if (z10) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = alpha.scaleY(f11);
                if (!z10) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator withEndAction2 = scaleY.scaleX(f14).setListener(new org.telegram.ui.Components.t9(view)).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).withEndAction(null);
                if (f10 != 0.0f) {
                    withEndAction2.translationY(L(-16.0f) * f10);
                }
                withEndAction2.start();
            }
        }
    }

    public static Object V(Class cls, List list) {
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                Object obj = list.get(i7);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
        return null;
    }

    public static int V0(int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.V0(int, boolean):int");
    }

    public static float V1(boolean z9, boolean z10, float f10) {
        float f11;
        float f12;
        float f13 = 0.0f;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (z9) {
            f13 = 1.0f;
        }
        return com.google.android.recaptcha.internal.a.z(f12, f13, f10, f11);
    }

    public static SpannableStringBuilder V2(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int t6 = t(spannableStringBuilder, "**");
                if (t6 == -1) {
                    break;
                }
                spannableStringBuilder.replace(t6, t6 + 2, "");
                int t10 = t(spannableStringBuilder, "**");
                if (t10 >= 0) {
                    spannableStringBuilder.replace(t10, t10 + 2, "");
                    arrayList.add(Integer.valueOf(t6));
                    arrayList.add(Integer.valueOf(t10));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i7 = 0; i7 < arrayList.size() / 2; i7++) {
                int i10 = i7 * 2;
                spannableStringBuilder2.setSpan(new u31(o()), ((Integer) arrayList.get(i10)).intValue(), ((Integer) arrayList.get(i10 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return spannableStringBuilder;
        }
    }

    public static void V3(View view, boolean z9, boolean z10) {
        U3(0.0f, view, z9, z10);
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

    public static int W0(int i7) {
        float[] b10 = b(Color.red(i7), Color.green(i7), Color.blue(i7));
        b10[1] = Math.min(1.0f, b10[1] + 0.05f);
        float f10 = b10[2];
        if (f10 > 0.5f) {
            b10[2] = Math.max(0.0f, f10 * 0.9f);
        } else {
            b10[2] = Math.max(0.0f, f10 * 0.9f);
        }
        return a(b10[0], b10[1], b10[2]) | (-16777216);
    }

    public static int W1(float f10, int i7, int i10) {
        return (int) ((f10 * (i10 - i7)) + i7);
    }

    public static SpannableStringBuilder W2(CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return V2((SpannableStringBuilder) charSequence);
        }
        return V2(new SpannableStringBuilder(charSequence));
    }

    public static void W3(float f10, View view, boolean z9, boolean z10) {
        Z3(view, z9, f10, true, z10);
    }

    public static View X(ViewGroup viewGroup, float f10, float f11) {
        if (viewGroup.getVisibility() == 0) {
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != null && childAt.getVisibility() == 0) {
                    if (childAt instanceof ViewGroup) {
                        View X2 = X((ViewGroup) childAt, f10 - childAt.getLeft(), f11 - childAt.getTop());
                        if (X2 != null) {
                            return X2;
                        }
                    } else if (f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getY() && f10 <= childAt.getY() + childAt.getHeight()) {
                        return childAt;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int X0(int i7) {
        return Math.max(73, (i7 >> 16) & 65535);
    }

    public static void X1(Rect rect, Rect rect2, float f10, Rect rect3) {
        if (rect3 != null) {
            rect3.set(W1(f10, rect.left, rect2.left), W1(f10, rect.top, rect2.top), W1(f10, rect.right, rect2.right), W1(f10, rect.bottom, rect2.bottom));
        }
    }

    public static SpannableStringBuilder X2(String str) {
        try {
            StringBuilder sb2 = new StringBuilder(str);
            while (true) {
                int indexOf = sb2.indexOf("<br>");
                if (indexOf == -1) {
                    break;
                }
                sb2.replace(indexOf, indexOf + 4, "\n");
            }
            while (true) {
                int indexOf2 = sb2.indexOf("<br/>");
                if (indexOf2 == -1) {
                    break;
                }
                sb2.replace(indexOf2, indexOf2 + 5, "\n");
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                int indexOf3 = sb2.indexOf("<b>");
                if (indexOf3 == -1) {
                    break;
                }
                sb2.replace(indexOf3, indexOf3 + 3, "");
                int indexOf4 = sb2.indexOf("</b>");
                if (indexOf4 == -1) {
                    indexOf4 = sb2.indexOf("<b>");
                }
                sb2.replace(indexOf4, indexOf4 + 4, "");
                arrayList.add(Integer.valueOf(indexOf3));
                arrayList.add(Integer.valueOf(indexOf4));
            }
            while (true) {
                int indexOf5 = sb2.indexOf("**");
                if (indexOf5 == -1) {
                    break;
                }
                sb2.replace(indexOf5, indexOf5 + 2, "");
                int indexOf6 = sb2.indexOf("**");
                if (indexOf6 >= 0) {
                    sb2.replace(indexOf6, indexOf6 + 2, "");
                    arrayList.add(Integer.valueOf(indexOf5));
                    arrayList.add(Integer.valueOf(indexOf6));
                }
            }
            while (true) {
                int indexOf7 = sb2.indexOf("**");
                if (indexOf7 == -1) {
                    break;
                }
                sb2.replace(indexOf7, indexOf7 + 2, "");
                int indexOf8 = sb2.indexOf("**");
                if (indexOf8 >= 0) {
                    sb2.replace(indexOf8, indexOf8 + 2, "");
                    arrayList.add(Integer.valueOf(indexOf7));
                    arrayList.add(Integer.valueOf(indexOf8));
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
            for (int i7 = 0; i7 < arrayList.size() / 2; i7++) {
                int i10 = i7 * 2;
                spannableStringBuilder.setSpan(new u31(o()), ((Integer) arrayList.get(i10)).intValue(), ((Integer) arrayList.get(i10 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e10) {
            a8.g(e10, true);
            return new SpannableStringBuilder(str);
        }
    }

    public static void X3(View view, boolean z9) {
        Z3(view, z9, 1.0f, true, true);
    }

    public static boolean Y(ViewGroup viewGroup, float f10, float f11, View view) {
        int i7;
        Rect rect;
        if (viewGroup == null) {
            return false;
        }
        int i10 = 0;
        while (i10 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof di.i4) || childAt == view)) {
                if (childAt instanceof di.r8) {
                    di.t8 t8Var = (di.t8) viewGroup;
                    if (t8Var.f9795b == null || (f10 >= L(60.0f) && f10 <= viewGroup.getWidth() - L(60.0f))) {
                        int i11 = 0;
                        while (i11 < t8Var.getChildCount()) {
                            View childAt2 = t8Var.getChildAt(i11);
                            if (childAt2 instanceof di.w8) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d2 = f10 - translationX;
                                i7 = i10;
                                double d10 = f11 - translationY;
                                float cos = (float) ((Math.cos(radians) * d2) - (Math.sin(radians) * d10));
                                float d11 = (float) jg.g.d(radians, d10, Math.sin(radians) * d2);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && d11 >= (-measuredHeight) / 2.0f && d11 <= measuredHeight / 2.0f) {
                                    rect = Q;
                                    childAt.getHitRect(rect);
                                    if (rect.contains((int) f10, (int) f11) || !childAt.isClickable()) {
                                        if ((childAt instanceof ViewGroup) && Y((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), view)) {
                                            return true;
                                        }
                                        i10 = i7 + 1;
                                    } else {
                                        return true;
                                    }
                                }
                            } else {
                                i7 = i10;
                            }
                            i11++;
                            i10 = i7;
                        }
                    }
                }
                i7 = i10;
                rect = Q;
                childAt.getHitRect(rect);
                if (rect.contains((int) f10, (int) f11)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i10 = i7 + 1;
            }
            i7 = i10;
            i10 = i7 + 1;
        }
        return false;
    }

    public static int Y0() {
        return Z0(false);
    }

    public static void Y1(Rect rect, RectF rectF, float f10, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(T1(rect.left, rectF.left, f10), T1(rect.top, rectF.top, f10), T1(rect.right, rectF.right, f10), T1(rect.bottom, rectF.bottom, f10));
        }
    }

    public static CharSequence Y2(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            int i7 = 0;
            while (i7 < length - 2) {
                int i10 = i7 + 2;
                sb2.getChars(i7, i10, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb2 = sb2.replace(i7, i10, "\n");
                    i7--;
                    length--;
                }
                i7++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            int i11 = 0;
            while (i11 < length2 - 2) {
                int i12 = i11 + 2;
                spannableStringBuilder.getChars(i11, i12, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder = spannableStringBuilder.replace(i11, i12, (CharSequence) "\n");
                    i11--;
                    length2--;
                }
                i11++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableString) {
            if (TextUtils.indexOf(charSequence, "\n\n") < 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            int length3 = charSequence.length();
            int i13 = 0;
            while (i13 < length3 - 2) {
                int i14 = i13 + 2;
                spannableStringBuilder2.getChars(i13, i14, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    spannableStringBuilder2 = spannableStringBuilder2.replace(i13, i14, (CharSequence) "\n");
                    i13--;
                    length3--;
                }
                i13++;
            }
            return spannableStringBuilder2;
        } else {
            return charSequence.toString().replace("\n\n", "\n");
        }
    }

    public static void Y3(View view, boolean z9, float f10, boolean z10, float f11, boolean z11, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Integer num = 1;
        if (view != null) {
            int i7 = 0;
            if (view.getParent() == null) {
                z11 = false;
            }
            if (!z11) {
                view.animate().setListener(null).cancel();
                if (!z9) {
                    if (z10) {
                        i7 = 8;
                    } else {
                        i7 = 4;
                    }
                }
                view.setVisibility(i7);
                if (!z9) {
                    num = null;
                }
                view.setTag(num);
                view.setAlpha(f11);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            } else if (z9 && view.getTag() == null) {
                view.animate().setListener(null).cancel();
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                }
                view.animate().alpha(f11).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(num);
            } else if (!z9 && view.getTag() != null) {
                view.animate().setListener(null).cancel();
                view.animate().alpha(0.0f).scaleY(f10).scaleX(f10).setListener(new org.telegram.ui.Components.t9(view, z10)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(null);
            }
        }
    }

    public static TLRPC.Document Z(long j3, List list) {
        if (list == null) {
            return null;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            TLRPC.Document document = (TLRPC.Document) list.get(i7);
            if (document != null && document.f26962id == j3) {
                return document;
            }
        }
        return null;
    }

    public static int Z0(boolean z9) {
        if (z9) {
            if (A == null) {
                A = 2560;
            }
            return A.intValue();
        }
        if (f22571z == null) {
            f22571z = 1280;
        }
        return f22571z.intValue();
    }

    public static void Z1(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(T1(rectF.left, rectF2.left, f10), T1(rectF.top, rectF2.top, f10), T1(rectF.right, rectF2.right, f10), T1(rectF.bottom, rectF2.bottom, f10));
        }
    }

    public static void Z2(Activity activity, int i7) {
        if (activity != null && !Q1()) {
            activity.getWindow().setSoftInputMode(48);
            N = i7;
        }
    }

    public static void Z3(View view, boolean z9, float f10, boolean z10, boolean z11) {
        Y3(view, z9, f10, z10, 1.0f, z11, null);
    }

    public static int a(float f10, float f11, float f12) {
        int i7;
        int i10;
        int i11;
        if (f11 == 0.0f) {
            i7 = (int) ((f12 * 255.0f) + 0.5f);
        } else {
            float floor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f13 = (1.0f - f11) * f12;
            float C2 = com.google.android.recaptcha.internal.a.C(f11, floor2, 1.0f, f12);
            float f14 = (1.0f - ((1.0f - floor2) * f11)) * f12;
            int i12 = (int) floor;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    i7 = 0;
                                } else {
                                    i7 = (int) ((f12 * 255.0f) + 0.5f);
                                    i10 = (int) ((f13 * 255.0f) + 0.5f);
                                    i11 = (int) ((C2 * 255.0f) + 0.5f);
                                }
                            } else {
                                i7 = (int) ((f14 * 255.0f) + 0.5f);
                                i10 = (int) ((f13 * 255.0f) + 0.5f);
                            }
                        } else {
                            i7 = (int) ((f13 * 255.0f) + 0.5f);
                            i10 = (int) ((C2 * 255.0f) + 0.5f);
                        }
                        i11 = (int) ((f12 * 255.0f) + 0.5f);
                    } else {
                        i7 = (int) ((f13 * 255.0f) + 0.5f);
                        i10 = (int) ((f12 * 255.0f) + 0.5f);
                        i11 = (int) ((f14 * 255.0f) + 0.5f);
                    }
                    return ((i7 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255);
                }
                i7 = (int) ((C2 * 255.0f) + 0.5f);
                i10 = (int) ((f12 * 255.0f) + 0.5f);
            } else {
                i7 = (int) ((f12 * 255.0f) + 0.5f);
                i10 = (int) ((f14 * 255.0f) + 0.5f);
            }
            i11 = (int) ((f13 * 255.0f) + 0.5f);
            return ((i7 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255);
        }
        i10 = i7;
        i11 = i10;
        return ((i7 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255);
    }

    public static void a0() {
        SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("google_bug_154855417", 0);
        if (!sharedPreferences.contains("fixed")) {
            new File(t0.h(), "ZoomTables.data").delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        }
    }

    public static float a1(boolean z9, float f10) {
        float f11;
        float f12 = f10 / 2.54f;
        DisplayMetrics displayMetrics = B;
        if (z9) {
            f11 = displayMetrics.xdpi;
        } else {
            f11 = displayMetrics.ydpi;
        }
        return f12 * f11;
    }

    public static void a2(float[] fArr, float[] fArr2, float f10, float[] fArr3) {
        float f11;
        if (fArr3 != null) {
            for (int i7 = 0; i7 < fArr3.length; i7++) {
                float f12 = 0.0f;
                if (fArr != null && i7 < fArr.length) {
                    f11 = fArr[i7];
                } else {
                    f11 = 0.0f;
                }
                if (fArr2 != null && i7 < fArr2.length) {
                    f12 = fArr2[i7];
                }
                fArr3[i7] = T1(f11, f12, f10);
            }
        }
    }

    public static void a3(Activity activity, int i7) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null && !Q1()) {
            window.setSoftInputMode(16);
            N = i7;
        }
    }

    public static void a4(int i7, pj0 pj0Var) {
        v4.g0 adapter;
        v4.d1 T2;
        if (pj0Var != null && (adapter = pj0Var.getAdapter()) != null) {
            for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                View childAt = pj0Var.getChildAt(i10);
                int R2 = RecyclerView.R(childAt);
                if (R2 >= 0 && (T2 = pj0Var.T(childAt)) != null && !T2.r() && T2.b() == i7) {
                    adapter.t(T2, R2);
                }
            }
        }
    }

    public static float[] b(int i7, int i10, int i11) {
        float f10;
        float f11;
        int max = Math.max(i7, i10);
        if (i11 > max) {
            max = i11;
        }
        int min = Math.min(i7, i10);
        if (i11 < min) {
            min = i11;
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
            float f16 = (max - i7) / f15;
            float f17 = (max - i10) / f15;
            float f18 = (max - i11) / f15;
            if (i7 == max) {
                f11 = f18 - f17;
            } else if (i10 == max) {
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

    public static double b0(double d2) {
        return ((long) (d2 * 1000000.0d)) / 1000000.0d;
    }

    public static long b1(SharedPreferences sharedPreferences, String str, long j3) {
        try {
            return sharedPreferences.getLong(str, j3);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j3);
        }
    }

    public static float b2(float f10, float f11, float f12) {
        return ((((((((f11 - f10) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f12) + f10) + 360.0f) % 360.0f;
    }

    public static void b3(Activity activity, int i7) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        O = i7;
    }

    public static void b4(pj0 pj0Var) {
        v4.g0 adapter;
        v4.d1 T2;
        if (pj0Var != null && (adapter = pj0Var.getAdapter()) != null) {
            for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
                View childAt = pj0Var.getChildAt(i7);
                int R2 = RecyclerView.R(childAt);
                if (R2 >= 0 && (T2 = pj0Var.T(childAt)) != null && !T2.r()) {
                    adapter.t(T2, R2);
                }
            }
        }
    }

    public static void c(android.text.Spannable r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.c(android.text.Spannable, int, boolean, boolean):void");
    }

    public static void c0(View view, c20 c20Var) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                c20Var.a(view);
                c0(viewGroup.getChildAt(i7), c20Var);
            }
            return;
        }
        c20Var.a(view);
    }

    public static Point c1() {
        Point point = new Point();
        try {
            ((WindowManager) t0.f25566b.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e10) {
            a8.g(e10, true);
            return point;
        }
    }

    public static void c2(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float T1 = T1(rectF.centerX(), rectF2.centerX(), f10);
        float T12 = T1(rectF.centerY(), rectF2.centerY(), f10);
        float T13 = T1(rectF.width(), rectF2.width(), Math.min(1.0f, f10)) / 2.0f;
        float T14 = T1(rectF.height(), rectF2.height(), Math.min(1.0f, f10)) / 2.0f;
        rectF3.set(T1 - T13, T12 - T14, T1 + T13, T12 + T14);
    }

    public static void c3(Activity activity) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setSourceRectHint(null);
            builder.setAspectRatio(null);
            if (i7 >= 31) {
                builder.setAutoEnterEnabled(false);
            }
            w3(activity, builder.build());
        }
    }

    public static void c4(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(9, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void d(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            t0.f25566b.sendBroadcast(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void d0(RecyclerView recyclerView, c20 c20Var) {
        if (recyclerView != null) {
            for (int i7 = 0; i7 < recyclerView.getChildCount(); i7++) {
                c20Var.a(recyclerView.getChildAt(i7));
            }
            for (int i10 = 0; i10 < recyclerView.getCachedChildCount(); i10++) {
                c20Var.a(recyclerView.P(i10));
            }
            for (int i11 = 0; i11 < recyclerView.getHiddenChildCount(); i11++) {
                c20Var.a(recyclerView.V(i11));
            }
            for (int i12 = 0; i12 < recyclerView.getAttachedScrapChildCount(); i12++) {
                c20Var.a(recyclerView.O(i12));
            }
        }
    }

    public static ArrayList d1() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        File[] externalFilesDirs = t0.f25566b.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((File) arrayList.get(i7)).getPath().equals(file2.getPath());
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

    public static int d2(float f10, int i7, int i10) {
        return Color.argb(W1(f10, Color.alpha(i7), Color.alpha(i10)), W1(f10, Color.red(i7), Color.red(i10)), W1(f10, Color.green(i7), Color.green(i10)), W1(f10, Color.blue(i7), Color.blue(i10)));
    }

    public static void d3() {
        int i7;
        if (L == null) {
            L = Boolean.valueOf(R1());
        }
        K = null;
        if (iz.X0) {
            SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("mainconfig", 0);
            if (Q1() && (t0.f25566b == null || !t0.f25566b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) {
                i7 = 18;
            } else {
                i7 = 16;
            }
            int i10 = sharedPreferences.getInt("fons_size", i7);
            iz.W0 = i10;
            iz.Z0 = sharedPreferences.getInt("iv_font_size", i10);
        }
    }

    public static SpannableStringBuilder d4(CharSequence charSequence, Runnable runnable) {
        SpannableString spannableString = new SpannableString(id.M0(2131749010, null));
        spannableString.setSpan(new w(0, runnable), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return H2(spannableStringBuilder, true);
    }

    public static void e(String str) {
        if (str == null) {
            return;
        }
        d(new File(str));
    }

    public static String e0(int i7, double d2, double d10, int i10, int i11, boolean z9, int i12, int i13) {
        int i14;
        int i15 = 2;
        int min = Math.min(2, (int) Math.ceil(f22562p));
        if (i13 == -1) {
            i14 = qp.s1(i7).f24838m3;
        } else {
            i14 = i13;
        }
        if (i14 != 1 && i14 != 3) {
            String str = qp.s1(i7).f24893s3;
            if (!TextUtils.isEmpty(str)) {
                if (z9) {
                    return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d10), str);
                }
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), str);
            } else if (z9) {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d2), Double.valueOf(d10));
            } else {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d2), Double.valueOf(d10), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min));
            }
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        fd fdVar = id.E0().B;
        String str2 = null;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = i15;
            if (strArr[i16].toLowerCase().contains(fdVar.f22398c)) {
                str2 = strArr[i16];
            }
            i16++;
            i15 = i17;
        }
        int i18 = i15;
        if (str2 == null) {
            str2 = "en_US";
        }
        if (z9) {
            Locale locale = Locale.US;
            Double valueOf = Double.valueOf(d10);
            Double valueOf2 = Double.valueOf(d2);
            Integer valueOf3 = Integer.valueOf(i12);
            Integer valueOf4 = Integer.valueOf(i10 * min);
            Integer valueOf5 = Integer.valueOf(i11 * min);
            Integer valueOf6 = Integer.valueOf(min);
            Double valueOf7 = Double.valueOf(d10);
            Double valueOf8 = Double.valueOf(d2);
            Object[] objArr = new Object[9];
            objArr[0] = valueOf;
            objArr[1] = valueOf2;
            objArr[i18] = valueOf3;
            objArr[3] = valueOf4;
            objArr[4] = valueOf5;
            objArr[5] = valueOf6;
            objArr[6] = valueOf7;
            objArr[7] = valueOf8;
            objArr[8] = str2;
            return String.format(locale, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&pt=%.6f,%.6f,vkbkm&lang=%s", objArr);
        }
        Locale locale2 = Locale.US;
        Double valueOf9 = Double.valueOf(d10);
        Double valueOf10 = Double.valueOf(d2);
        Integer valueOf11 = Integer.valueOf(i12);
        Integer valueOf12 = Integer.valueOf(i10 * min);
        Integer valueOf13 = Integer.valueOf(i11 * min);
        Integer valueOf14 = Integer.valueOf(min);
        Object[] objArr2 = new Object[7];
        objArr2[0] = valueOf9;
        objArr2[1] = valueOf10;
        objArr2[i18] = valueOf11;
        objArr2[3] = valueOf12;
        objArr2[4] = valueOf13;
        objArr2[5] = valueOf14;
        objArr2[6] = str2;
        return String.format(locale2, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", objArr2);
    }

    public static Bitmap e1(float f10, float f11, String str, String str2, int i7) {
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        int i10;
        int i11;
        Bitmap decodeStream;
        int i12;
        try {
            try {
                options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (str != null) {
                    BitmapFactory.decodeFile(str, options);
                    fileInputStream = null;
                } else {
                    fileInputStream = new FileInputStream(str2);
                    try {
                        fileInputStream.getChannel().position(i7);
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            a8.g(th, true);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } finally {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                            }
                        }
                    }
                }
                i10 = options.outWidth;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        if (i10 > 0 && (i11 = options.outHeight) > 0) {
            if (f10 > f11 && i10 < i11) {
                f11 = f10;
                f10 = f11;
            }
            float min = Math.min(i10 / f10, i11 / f11);
            options.inSampleSize = 1;
            if (min > 1.0f) {
                do {
                    i12 = options.inSampleSize * 2;
                    options.inSampleSize = i12;
                } while (i12 < min);
            }
            options.inJustDecodeBounds = false;
            if (str != null) {
                decodeStream = BitmapFactory.decodeFile(str, options);
            } else {
                fileInputStream.getChannel().position(i7);
                decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            }
            if (fileInputStream != null) {
                try {
                    return decodeStream;
                } catch (Exception e102) {
                }
            }
            return decodeStream;
        }
        if (fileInputStream != null) {
            fileInputStream.close();
            return null;
        }
        return null;
    }

    public static java.util.ArrayList e2(android.net.Uri r21, int r22, boolean r23, java.util.ArrayList r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.e2(android.net.Uri, int, boolean, java.util.ArrayList, java.lang.String):java.util.ArrayList");
    }

    public static double[] e3(int i7, int i10, int i11) {
        double max;
        double min;
        double d2;
        double d10;
        double d11;
        double d12;
        int i12;
        double d13 = i7 / 255.0d;
        double d14 = i10 / 255.0d;
        double d15 = i11 / 255.0d;
        int i13 = (d13 > d14 ? 1 : (d13 == d14 ? 0 : -1));
        if (i13 > 0 && d13 > d15) {
            max = d13;
        } else {
            max = Math.max(d14, d15);
        }
        if (d13 < d14 && d13 < d15) {
            min = d13;
        } else {
            min = Math.min(d14, d15);
        }
        double d16 = max - min;
        double d17 = 0.0d;
        if (max == 0.0d) {
            d2 = 0.0d;
        } else {
            d2 = d16 / max;
        }
        if (max != min) {
            if (i13 > 0 && d13 > d15) {
                d10 = (d14 - d15) / d16;
                if (d14 < d15) {
                    i12 = 6;
                } else {
                    i12 = 0;
                }
                d11 = i12;
            } else if (d14 > d15) {
                d12 = 2.0d + ((d15 - d13) / d16);
                d17 = d12 / 6.0d;
            } else {
                d10 = (d13 - d14) / d16;
                d11 = 4.0d;
            }
            d12 = d10 + d11;
            d17 = d12 / 6.0d;
        }
        return new double[]{d17, d2, max};
    }

    public static void f(CharSequence charSequence, String str) {
        if (str == null) {
            g(charSequence);
            return;
        }
        try {
            ((ClipboardManager) t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static String f0(int i7) {
        if (i7 < 1000) {
            return Integer.toString(i7);
        }
        ArrayList arrayList = new ArrayList();
        while (i7 != 0) {
            int i10 = i7 % 1000;
            i7 /= 1000;
            if (i7 > 0) {
                arrayList.add(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i10)));
            } else {
                arrayList.add(Integer.toString(i10));
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

    public static int f1() {
        float f10 = f22562p;
        if (f10 >= 4.0f) {
            return 3;
        }
        if (f10 >= 2.0f) {
            return 2;
        }
        return 1;
    }

    public static void f2(Activity activity) {
        int requestedOrientation;
        WeakReference weakReference;
        if (activity != null && f22544f == -10 && !R1()) {
            try {
                if (f22546g != -10 && (weakReference = f22549i) != null && weakReference.get() == activity) {
                    requestedOrientation = f22546g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f22544f = requestedOrientation;
                f22546g = -10;
                h = -10;
                f22549i = null;
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (windowManager != null && windowManager.getDefaultDisplay() != null) {
                    int rotation = windowManager.getDefaultDisplay().getRotation();
                    int i7 = activity.getResources().getConfiguration().orientation;
                    if (rotation == 3) {
                        if (i7 == 1) {
                            activity.setRequestedOrientation(1);
                        } else {
                            activity.setRequestedOrientation(8);
                        }
                    } else if (rotation == 1) {
                        if (i7 == 1) {
                            activity.setRequestedOrientation(9);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    } else if (rotation == 0) {
                        if (i7 == 2) {
                            activity.setRequestedOrientation(0);
                        } else {
                            activity.setRequestedOrientation(1);
                        }
                    } else if (i7 == 2) {
                        activity.setRequestedOrientation(8);
                    } else {
                        activity.setRequestedOrientation(9);
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static void f3(float[] fArr, int[] iArr) {
        if (fArr != null) {
            if (iArr == null) {
                iArr = new int[fArr.length];
            }
            if (fArr.length == iArr.length) {
                float f10 = 0.0f;
                for (float f11 : fArr) {
                    f10 += f11;
                }
                int i7 = 0;
                for (int i10 = 0; i10 < fArr.length; i10++) {
                    int floor = (int) Math.floor((fArr[i10] / f10) * 100.0f);
                    iArr[i10] = floor;
                    i7 += floor;
                }
                while (i7 < 100) {
                    int i11 = -1;
                    float f12 = 0.0f;
                    for (int i12 = 0; i12 < fArr.length; i12++) {
                        float f13 = fArr[i12];
                        float f14 = (f13 / f10) - (iArr[i12] / 100.0f);
                        if (f13 > 0.0f && f14 >= f12) {
                            i11 = i12;
                            f12 = f14;
                        }
                    }
                    if (i11 >= 0) {
                        iArr[i11] = iArr[i11] + 1;
                        i7++;
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new IndexOutOfBoundsException("percents.length != output.length");
        }
        throw new NullPointerException("percents or output is null");
    }

    public static boolean g(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) t0.f25566b.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, bg.r.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static String g0(int i7, boolean z9, boolean z10) {
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        if (i10 == 0) {
            if (z9) {
                return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            return String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
        } else if (z10) {
            return String.format(Locale.US, "%d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            return String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public static File g1() {
        return new File(w7.z(4), "sharing/");
    }

    public static void g2(Activity activity) {
        int requestedOrientation;
        WeakReference weakReference;
        if (activity != null && !R1()) {
            try {
                if (f22546g != -10 && (weakReference = f22549i) != null && weakReference.get() == activity) {
                    requestedOrientation = f22546g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f22544f = requestedOrientation;
                f22546g = -10;
                h = -10;
                f22549i = null;
                activity.setRequestedOrientation(1);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static int g3(boolean z9, boolean z10) {
        if (z9) {
            return f22568w;
        }
        int i7 = v;
        if (z10) {
            return i7 - L(42.0f);
        }
        return i7;
    }

    public static void h(ColorMatrix colorMatrix, float f10) {
        float f11 = f10 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f11, 0.0f, 1.0f, 0.0f, 0.0f, f11, 0.0f, 0.0f, 1.0f, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String h0(int i7, boolean z9) {
        int i10 = i7 / 60;
        int i11 = i7 % 60;
        if (z9) {
            return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        return String.format(Locale.US, "%d:%02d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static byte[] h1(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static void h2() {
        a8.b("[FLAG_SECURE]");
    }

    public static void h3(Runnable runnable) {
        i3(runnable, 0L);
    }

    public static void i(ColorMatrix colorMatrix, float f10) {
        float f11 = f10 + 1.0f;
        float f12 = 1.0f - f11;
        float f13 = 0.3086f * f12;
        float f14 = 0.6094f * f12;
        float f15 = f12 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f13 + f11, f14, f15, 0.0f, 0.0f, f13, f14 + f11, f15, 0.0f, 0.0f, f13, f14, f11 + f15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String i0(long j3, boolean z9, boolean z10) {
        if (j3 == 0) {
            return String.format("%d KB", 0);
        }
        if (j3 < 1024) {
            return String.format("%d B", Long.valueOf(j3));
        }
        if (j3 < 1048576) {
            float f10 = ((float) j3) / 1024.0f;
            if (z9) {
                int i7 = (int) f10;
                if ((f10 - i7) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i7));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f10));
        } else if (j3 < 1048576000) {
            float f11 = (((float) j3) / 1024.0f) / 1024.0f;
            if (z9) {
                int i10 = (int) f11;
                if ((f11 - i10) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f11));
        } else {
            float f12 = ((int) ((j3 / 1024) / 1024)) / 1000.0f;
            if (z9) {
                int i11 = (int) f12;
                if ((f12 - i11) * 10.0f == 0.0f) {
                    return String.format("%d GB", Integer.valueOf(i11));
                }
            }
            if (z10) {
                return String.format("%.1f GB", Float.valueOf(f12));
            }
            return String.format("%.2f GB", Float.valueOf(f12));
        }
    }

    public static Long i1(String str) {
        String j12 = j1(str);
        if (j12 != null) {
            try {
                return Utilities.A(j12);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static void i2(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) t0.f25566b.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public static void i3(Runnable runnable, long j3) {
        if (t0.d == null) {
            return;
        }
        if (j3 == 0) {
            t0.d.post(runnable);
        } else {
            t0.d.postDelayed(runnable, j3);
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
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add((View) method2.invoke(invoke, strArr[i7]));
            }
            return arrayList;
        } catch (Exception e10) {
            a8.e("allGlobalViews()", e10);
            return null;
        }
    }

    public static String j0(int i7) {
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        if (i7 < 0) {
            return String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i10)), Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12)));
        }
        return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static java.lang.String j1(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.j1(java.lang.String):java.lang.String");
    }

    public static Bitmap j2(float f10, int i7, View view) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f10);
        int height = (int) (view.getHeight() / f10);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i7, Math.max(width, height) / 180));
        return createBitmap;
    }

    public static void j3(RectF rectF, float f10, float f11, float f12) {
        rectF.set(f11 - ((f11 - rectF.left) * f10), f12 - ((f12 - rectF.top) * f10), ((rectF.right - f11) * f10) + f11, ((rectF.bottom - f12) * f10) + f12);
    }

    public static int k(int i7, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i7);
        int red = Color.red(i7);
        int green = Color.green(i7);
        float f10 = red;
        float f11 = green;
        float blue = Color.blue(i7);
        float f12 = alpha;
        float f13 = (array[3] * f12) + (array[2] * blue) + (array[1] * f11) + (array[0] * f10) + array[4];
        float f14 = (array[8] * f12) + (array[7] * blue) + (array[6] * f11) + (array[5] * f10) + array[9];
        float f15 = (array[13] * f12) + (array[12] * blue) + (array[11] * f11) + (array[10] * f10) + array[14];
        float f16 = array[15] * f10;
        return Color.argb(c8.j9.b(Math.round((array[18] * f12) + (array[17] * blue) + (array[16] * f11) + f16 + array[19]), 0, 255), c8.j9.b(Math.round(f13), 0, 255), c8.j9.b(Math.round(f14), 0, 255), c8.j9.b(Math.round(f15), 0, 255));
    }

    public static String k0(int i7, int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        int i14 = i7 / 3600;
        int i15 = (i7 / 60) % 60;
        int i16 = i7 % 60;
        if (i10 == 0) {
            if (i14 == 0) {
                return String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16));
            }
            return String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16));
        } else if (i14 == 0 && i11 == 0) {
            return String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i12), Integer.valueOf(i13));
        } else {
            return String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }

    public static String k1(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SpannableStringBuilder k2(CharSequence charSequence, Runnable runnable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new w(1, runnable), 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void k3(org.telegram.ui.ActionBar.q4 q4Var, String str) {
        if (q4Var != null && str != null) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) q4Var.getFragmentStack().get(q4Var.getFragmentStack().size() - 1);
            try {
                Field declaredField = f2Var.getClass().getDeclaredField("listView");
                declaredField.setAccessible(true);
                pj0 pj0Var = (pj0) declaredField.get(f2Var);
                pj0Var.e1(new i(f2Var, str, pj0Var), 700, true);
                declaredField.setAccessible(false);
            } catch (Throwable unused) {
            }
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

    public static SpannableStringBuilder l0(CharSequence charSequence, k9 k9Var, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i7 = 0; i7 < charSequenceArr.length; i7++) {
            String str = (String) k9Var.j(Integer.valueOf(i7));
            int indexOf = charSequence2.indexOf(str);
            if (indexOf != -1) {
                valueOf.replace(indexOf, str.length() + indexOf, charSequenceArr[i7]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i7].toString() + charSequence2.substring(str.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static int l1(int i7, int i10, int i11) {
        return Math.max(L(320.0f), (((i7 - i10) - i11) * 35) / 100) + i10;
    }

    public static void l2(c20 c20Var, float f10) {
        m2(c20Var, f10, (int) f10, null);
    }

    public static void l3(Activity activity, int i7) {
        if (activity != null && !Q1()) {
            int i10 = N;
            if (i10 == 0 || i10 == i7) {
                activity.getWindow().setSoftInputMode(48);
            }
        }
    }

    public static void m(WindowManager.LayoutParams layoutParams) {
        int i7;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if (i10 >= 30) {
                i7 = 3;
            } else {
                i7 = 1;
            }
            ni.a.k(layoutParams, i7);
        }
    }

    public static SpannableStringBuilder m0(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (charSequence.toString().contains("%s")) {
            return l0(charSequence, new ni.a(10), charSequenceArr);
        }
        return l0(charSequence, new ni.a(12), charSequenceArr);
    }

    public static int m1(String str, boolean z9) {
        int i7;
        String substring;
        int[] iArr = f22538b0;
        int[] iArr2 = f22536a0;
        if (str != null && str.length() != 0) {
            if (!str.contains(".doc") && !str.contains(".txt") && !str.contains(".psd")) {
                if (!str.contains(".xls") && !str.contains(".csv")) {
                    if (!str.contains(".pdf") && !str.contains(".ppt") && !str.contains(".key")) {
                        if (!str.contains(".zip") && !str.contains(".rar") && !str.contains(".ai") && !str.contains(".mp3") && !str.contains(".mov") && !str.contains(".avi")) {
                            i7 = -1;
                        } else {
                            i7 = 3;
                        }
                    } else {
                        i7 = 2;
                    }
                } else {
                    i7 = 1;
                }
            } else {
                i7 = 0;
            }
            if (i7 == -1) {
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    substring = "";
                } else {
                    substring = str.substring(lastIndexOf + 1);
                }
                if (substring.length() != 0) {
                    i7 = substring.charAt(0) % iArr2.length;
                } else {
                    i7 = str.charAt(0) % iArr2.length;
                }
            }
            if (z9) {
                return iArr[i7];
            }
            return iArr2[i7];
        } else if (z9) {
            return iArr[0];
        } else {
            return iArr2[0];
        }
    }

    public static void m2(c20 c20Var, float f10, int i7, ArrayList arrayList) {
        List j3 = j();
        if (j3 == null) {
            c20Var.a(null);
            return;
        }
        m0 = true;
        try {
            try {
                Point point = f22563q;
                int i10 = (int) (point.x / f10);
                int i11 = (int) (((point.y + f22557m) + f22558n) / f10);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f11 = 1.0f / f10;
                canvas.scale(f11, f11);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
                for (int i12 = 0; i12 < j3.size(); i12++) {
                    View view = (View) j3.get(i12);
                    if (!(view instanceof ee0) && (arrayList == null || !arrayList.contains(view))) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(i0.a.o(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f10, iArr[1] / f10);
                        try {
                            view.draw(canvas);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i7, Math.max(i10, i11) / 180));
                c20Var.a(createBitmap);
            } catch (Exception e11) {
                a8.g(e11, true);
                c20Var.a(null);
            }
            m0 = false;
        } catch (Throwable th2) {
            m0 = false;
            throw th2;
        }
    }

    public static void m3(Activity activity, boolean z9) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            o3(window.getDecorView(), z9);
        }
    }

    public static void n(Animator animator, double d2, double d10) {
        double d11;
        double d12;
        double sqrt = Math.sqrt(d2 / 1.0d);
        double sqrt2 = d10 / (Math.sqrt(d2 * 1.0d) * 2.0d);
        if (sqrt2 < 1.0d) {
            d12 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d11 = ((sqrt2 * sqrt) + (-0.0d)) / d12;
        } else {
            d11 = (-0.0d) + sqrt;
            d12 = 0.0d;
        }
        double d13 = d12;
        double d14 = d11;
        animator.setDuration((long) ((Math.log(0.0025d) / ((-sqrt2) * sqrt)) * 1000.0d));
        animator.setInterpolator(new x(sqrt2, sqrt, d13, d14));
    }

    public static String n0(int i7) {
        String str;
        String str2;
        String str3;
        int i10 = i7 / 3600;
        int i11 = (i7 / 60) % 60;
        int i12 = i7 % 60;
        if (i10 > 0) {
            Locale locale = Locale.US;
            str = com.google.android.recaptcha.internal.a.i(i10, "h");
        } else {
            str = "";
        }
        if (i11 > 0) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
            Locale locale2 = Locale.US;
            if (i10 > 0) {
                str3 = "%02dm";
            } else {
                str3 = "%dm";
            }
            m10.append(String.format(locale2, str3, Integer.valueOf(i11)));
            str = m10.toString();
        }
        StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str);
        Locale locale3 = Locale.US;
        if (i10 <= 0 && i11 <= 0) {
            str2 = "%ds";
        } else {
            str2 = "%02ds";
        }
        m11.append(String.format(locale3, str2, Integer.valueOf(i12)));
        return m11.toString();
    }

    public static CharSequence n1(CharSequence charSequence) {
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

    public static void n2(ColorMatrix colorMatrix, float f10) {
        colorMatrix.postConcat(new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void n3(Dialog dialog, boolean z9) {
        Window window;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            o3(window.getDecorView(), z9);
        }
    }

    public static Typeface o() {
        if (f22535a == null) {
            if (iz.V0 && Build.VERSION.SDK_INT >= 28) {
                f22535a = Typeface.create(null, 500, false);
            } else {
                f22535a = o1("fonts/rmedium.ttf");
            }
        }
        return f22535a;
    }

    public static String o0(int i7, int i10) {
        String[] strArr;
        if (i7 != 0) {
            float f10 = i7;
            if (i10 == 0) {
                i10 = i7;
            }
            if (i10 < 1000) {
                return f0(i7);
            }
            int i11 = 0;
            while (true) {
                strArr = f22547g0;
                if (i10 < 1000 || i11 >= strArr.length - 1) {
                    break;
                }
                i10 /= 1000;
                f10 /= 1000.0f;
                i11++;
            }
            if (f10 < 0.1d) {
                return "0";
            }
            float f11 = f10 * 10.0f;
            float f12 = (int) f11;
            if (f11 == f12) {
                Locale locale = Locale.ENGLISH;
                return rf.b.r(f0((int) f10), strArr[i11]);
            }
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 / 10.0f), strArr[i11]);
        }
        return "0";
    }

    public static Typeface o1(String str) {
        Typeface createFromAsset;
        Typeface typeface;
        Hashtable hashtable = d;
        synchronized (hashtable) {
            try {
                if (!hashtable.containsKey(str)) {
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            Typeface.Builder builder = new Typeface.Builder(t0.f25566b.getAssets(), str);
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
                            createFromAsset = Typeface.createFromAsset(t0.f25566b.getAssets(), str);
                        }
                        hashtable.put(str, createFromAsset);
                    } catch (Exception e10) {
                        if (r2.f25212a) {
                            a8.d("Could not get typeface '" + str + "' because " + e10.getMessage());
                        }
                        return null;
                    }
                }
                typeface = (Typeface) hashtable.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typeface;
    }

    public static boolean o2() {
        return p2(false);
    }

    public static void o3(View view, boolean z9) {
        int systemUiVisibility;
        int b10;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b10 = c8.zc.b((systemUiVisibility = view.getSystemUiVisibility()), 16, z9))) {
            view.setSystemUiVisibility(b10);
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
                        return pixel;
                    }
                    return pixel;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return 0;
            }
        }
        return 0;
    }

    public static String p0(int i7, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.f21334b.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i7 == 0) {
            StringBuilder u10 = a8.p0.u("IMG_", format, ".");
            if (TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            u10.append(str);
            return u10.toString();
        }
        return a8.p0.p("VID_", format, ".mp4");
    }

    public static Vibrator p1() {
        if (J == null) {
            J = (Vibrator) t0.f25566b.getSystemService("vibrator");
        }
        return J;
    }

    public static boolean p2(boolean z9) {
        r0 r0Var = r0.f25186f;
        if (z9) {
            r0Var.getClass();
            if (SystemClock.elapsedRealtime() - r0Var.f25189c < 200) {
                r0Var.f25188b = false;
            }
        }
        boolean z10 = r0Var.f25188b;
        if (z9) {
            r0.f25186f.f25188b = false;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (r2.f25212a && z9 && iz.f23434s.length() > 0) {
            a8.b("wasInBackground = " + z10 + " appLocked = " + iz.f23448x + " autoLockIn = " + iz.f23451y + " lastPauseTime = " + iz.B + " uptime = " + elapsedRealtime);
        }
        if (iz.f23434s.length() > 0 && z10) {
            if (!iz.f23448x) {
                if ((iz.f23451y != 0 && iz.B != 0 && !iz.f23448x && iz.B + iz.f23451y <= elapsedRealtime) || elapsedRealtime + 5 < iz.B) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void p3(Activity activity, boolean z9) {
        if (activity != null) {
            s3(activity.getWindow(), z9);
        }
    }

    public static int[] q(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.dn) {
            return q(((org.telegram.ui.dn) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i7 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i7 = p(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i7 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.k9) {
                int[] iArr2 = ((org.telegram.ui.Components.k9) drawable).f35256a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i7 = w0(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i7 = iArr2[0];
                    }
                }
            } else if (drawable instanceof qa0) {
                int argb = Color.argb(45, 0, 0, 0);
                iArr[2] = argb;
                iArr[0] = argb;
                int argb2 = Color.argb(61, 0, 0, 0);
                iArr[3] = argb2;
                iArr[1] = argb2;
                return iArr;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        double[] e32 = e3((i7 >> 16) & 255, (i7 >> 8) & 255, i7 & 255);
        double d2 = e32[1];
        e32[1] = Math.min(1.0d, ((1.0d - d2) * 0.1d) + 0.05d + d2);
        int[] y12 = y1(e32[0], e32[1], Math.max(0.0d, e32[2] * 0.65d));
        iArr[0] = Color.argb(102, y12[0], y12[1], y12[2]);
        iArr[1] = Color.argb(136, y12[0], y12[1], y12[2]);
        int[] y13 = y1(e32[0], e32[1], Math.max(0.0d, e32[2] * 0.72d));
        iArr[2] = Color.argb(102, y13[0], y13[1], y13[2]);
        iArr[3] = Color.argb(136, y13[0], y13[1], y13[2]);
        return iArr;
    }

    public static File q0(String str, boolean z9) {
        try {
            File z10 = w7.z(100);
            if (!z9 && z10 != null) {
                return new File(z10, p0(0, str));
            }
            return new File(t0.f25566b.getExternalFilesDir(Environment.DIRECTORY_PICTURES), p0(0, str));
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int q1(View view) {
        if (view != null) {
            int height = view.getHeight();
            Point point = f22563q;
            if (height != point.y && view.getHeight() != point.y - f22557m) {
                try {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        return rootWindowInsets.getStableInsetBottom();
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
        return 0;
    }

    public static void q2(long j3, StringBuilder sb2) {
        if (j3 < 10) {
            sb2.append("0");
            sb2.append(j3);
            return;
        }
        sb2.append(j3);
    }

    public static void q3(Dialog dialog, boolean z9) {
        if (dialog != null) {
            s3(dialog.getWindow(), z9);
        }
    }

    public static void r(Runnable runnable) {
        if (t0.d == null) {
            return;
        }
        t0.d.removeCallbacks(runnable);
    }

    public static CharSequence r0(String str, String str2, String str3) {
        int i7;
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                str = a8.p0.D(str, " ", str2);
            }
        } else {
            str = str2;
        }
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        String str4 = " " + trim.toLowerCase();
        int i10 = 0;
        while (true) {
            int indexOf = str4.indexOf(" " + str3, i10);
            if (indexOf == -1) {
                break;
            }
            int i11 = 1;
            if (indexOf == 0) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            int i12 = indexOf - i7;
            int length = str3.length();
            if (indexOf == 0) {
                i11 = 0;
            }
            int i13 = length + i11 + i12;
            if (i10 != 0 && i10 != i12 + 1) {
                spannableStringBuilder.append((CharSequence) trim.substring(i10, i12));
            } else if (i10 == 0 && i12 != 0) {
                spannableStringBuilder.append((CharSequence) trim.substring(0, i12));
            }
            String substring = trim.substring(i12, Math.min(trim.length(), i13));
            if (substring.startsWith(" ")) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            String trim2 = substring.trim();
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) trim2);
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.f28092q6, null), length2, trim2.length() + length2, 33);
            i10 = i13;
        }
        if (i10 != -1 && i10 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i10));
        }
        return spannableStringBuilder;
    }

    public static void r1(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view != null && viewGroup != null) {
            while (view != viewGroup) {
                if (!(view.getParent() instanceof c5.k)) {
                    fArr[0] = view.getX() + fArr[0];
                    fArr[1] = view.getY() + fArr[1];
                }
                view = (View) view.getParent();
            }
        }
    }

    public static void r2(cq0 cq0Var) {
        if (cq0Var == null || cq0Var.getAdapter() == null) {
            return;
        }
        if (cq0Var.c0()) {
            cq0Var.post(new a(cq0Var, 1));
        } else {
            cq0Var.getAdapter().f();
        }
    }

    public static void r3(View view, boolean z9) {
        int systemUiVisibility;
        int b10;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b10 = c8.zc.b((systemUiVisibility = view.getSystemUiVisibility()), 8192, z9))) {
            view.setSystemUiVisibility(b10);
        }
    }

    public static float s(float f10, float f11, float f12, float f13) {
        if (f12 <= 0.0f) {
            return f10;
        }
        float min = Math.min(f13, f12) * (1.0f / f12);
        return c8.j9.a((f10 - ((1.0f - min) * (f11 / f12))) / min, 0.0f, 1.0f);
    }

    public static File s0(boolean z9) {
        try {
            File v02 = v0(z9);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.f21334b.nextInt(1000) + 1);
            if (f22545f0 == null) {
                f22545f0 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            String format = f22545f0.format(date);
            return new File(v02, "VID_" + format + ".mp4");
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int s1(int i7, boolean z9) {
        int i10;
        if (z9) {
            i10 = i7 + 180;
        } else {
            i10 = i7 - 180;
        }
        while (i10 >= 360) {
            i10 -= 360;
        }
        while (i10 < 0) {
            i10 += 360;
        }
        return i10;
    }

    public static void s2(ij ijVar, Activity activity, org.telegram.ui.ActionBar.f2 f2Var) {
        TLRPC.Document F0;
        String str;
        File file;
        char c10;
        String str2;
        String str3;
        String str4;
        if (ijVar != null && (F0 = ijVar.F0()) != null) {
            if (ijVar.f23262k.media != null) {
                str = w7.r(null, F0);
            } else {
                str = "";
            }
            String str5 = ijVar.f23262k.attachPath;
            if (str5 != null && str5.length() != 0) {
                file = new File(ijVar.f23262k.attachPath);
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                w7.G(p10.f24470s0);
                file = w7.M(ijVar.f23262k, false, true);
            }
            if (file != null && file.exists()) {
                if (f2Var != null && file.getName().toLowerCase().endsWith("attheme")) {
                    org.telegram.ui.ActionBar.j6 v10 = org.telegram.ui.ActionBar.k6.v(file, ijVar.I0(), null, true);
                    if (v10 != null) {
                        f2Var.presentFragment(new v71(v10));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    HashMap hashMap = new HashMap();
                    int i7 = org.telegram.ui.ActionBar.k6.L5;
                    hashMap.put("info1", Integer.valueOf(f2Var.getThemedColor(i7)));
                    hashMap.put("info2", Integer.valueOf(f2Var.getThemedColor(i7)));
                    alertDialog$Builder.m(2131624107, 52, f2Var.getThemedColor(i7), hashMap);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.W = true;
                    u1Var.T = id.M0(2131749201, null);
                    alertDialog$Builder.k(id.M0(2131747832, null), null);
                    f2Var.showDialog(u1Var);
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(1);
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    c10 = 0;
                    try {
                        int lastIndexOf = str.lastIndexOf(46);
                        if (lastIndexOf == -1 || ((str2 = singleton.getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase())) == null && ((str2 = F0.mime_type) == null || str2.length() == 0))) {
                            str2 = null;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            t0.d();
                            Uri d2 = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                            if (str2 == null) {
                                str4 = "text/plain";
                            } else {
                                str4 = str2;
                            }
                            intent.setDataAndType(d2, str4);
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
                                    t0.d();
                                    intent.setDataAndType(FileProvider.d(activity, "org.telegram.messenger.beta.provider", file), "text/plain");
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
                            int i10 = org.telegram.ui.ActionBar.k6.L5;
                            hashMap2.put("info1", Integer.valueOf(f2Var.getThemedColor(i10)));
                            hashMap2.put("info2", Integer.valueOf(f2Var.getThemedColor(i10)));
                            alertDialog$Builder2.m(2131624107, 52, f2Var.getThemedColor(i10), hashMap2);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                            u1Var2.W = true;
                            alertDialog$Builder2.k(id.M0(2131747832, null), null);
                            Object[] objArr = new Object[1];
                            objArr[c10] = ijVar.F0().mime_type;
                            u1Var2.T = id.a0("NoHandleAppInstalled", null, 2131748206, objArr);
                            f2Var.showDialog(u1Var2);
                        }
                    }
                } catch (Exception unused3) {
                    c10 = 0;
                }
            }
        }
    }

    public static void s3(Window window, boolean z9) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int b10 = c8.zc.b(systemUiVisibility, 8192, z9);
        if (systemUiVisibility != b10) {
            decorView.setSystemUiVisibility(b10);
        }
        if (Build.VERSION.SDK_INT < 35 && window.getStatusBarColor() != 0) {
            window.setStatusBarColor(0);
        }
    }

    public static int t(java.lang.CharSequence r5, java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.t(java.lang.CharSequence, java.lang.CharSequence):int");
    }

    public static int t0() {
        if (p10.i(p10.f24470s0).p() && !ConnectionsManager.getInstance(p10.f24470s0).isTestBackend()) {
            return p10.f24470s0;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (p10.i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                return i7;
            }
        }
        return p10.f24470s0;
    }

    public static boolean t1(LaunchActivity launchActivity, Intent intent) {
        Uri data;
        ui.a d2;
        if (intent != null) {
            try {
                if ((intent.getFlags() & 1048576) == 0 && (data = intent.getData()) != null && (d2 = ui.a.d(data)) != null && d2.g()) {
                    L3(launchActivity, d2);
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean t2(java.io.File r6, java.lang.String r7, java.lang.String r8, android.app.Activity r9, org.telegram.ui.ActionBar.f6 r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.t2(java.io.File, java.lang.String, java.lang.String, android.app.Activity, org.telegram.ui.ActionBar.f6, boolean):boolean");
    }

    public static void t3(Activity activity, int i7, boolean z9) {
        if (activity != null) {
            v3(activity.getWindow(), i7, z9, null);
        }
    }

    public static void u(Context context, boolean z9) {
        int i7;
        if (context == null) {
            return;
        }
        if (org.telegram.ui.ActionBar.k6.I.q() && z9) {
            i7 = 2131755328;
        } else {
            i7 = 2131755318;
        }
        context.setTheme(i7);
    }

    public static Activity u0() {
        Activity W2 = W(null);
        if (W2 == null || W2.isFinishing()) {
            W2 = LaunchActivity.G1;
        }
        if (W2 != null && !W2.isFinishing()) {
            return W2;
        }
        return W(t0.f25566b);
    }

    public static boolean u1(org.telegram.ui.ActionBar.f2 f2Var) {
        List j3;
        if (f2Var != null) {
            Dialog dialog = f2Var.visibleDialog;
            if (dialog == null || (dialog instanceof org.telegram.ui.ActionBar.u1) || ((dialog instanceof org.telegram.ui.ActionBar.v2) && ((org.telegram.ui.ActionBar.v2) dialog).f28632f1 != null)) {
                if (f2Var.getParentLayout() != null && (j3 = j()) != null && !j3.isEmpty()) {
                    View view = null;
                    for (int size = j3.size() - 1; size >= 0; size--) {
                        view = (View) j3.get(size);
                        Dialog dialog2 = f2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.u1) {
                            View view2 = ((org.telegram.ui.ActionBar.u1) dialog2).f28553a1;
                            while (view2 != null && (view2.getParent() instanceof View)) {
                                view2 = (View) view2.getParent();
                            }
                            if (view == view2) {
                                continue;
                            }
                        }
                        if (!(view instanceof org.telegram.ui.ActionBar.q1) && !(view instanceof ee0)) {
                            break;
                        }
                    }
                    View view3 = f2Var.getParentLayout().getView();
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

    public static boolean u2(ij ijVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        File file;
        String str = ijVar.f23262k.attachPath;
        String str2 = null;
        if (str != null && str.length() != 0) {
            file = new File(ijVar.f23262k.attachPath);
        } else {
            file = null;
        }
        if (file == null || !file.exists()) {
            w7.G(ijVar.I1);
            file = w7.M(ijVar.f23262k, false, true);
        }
        File file2 = file;
        int i7 = ijVar.D;
        if (i7 == 9 || i7 == 0) {
            str2 = ijVar.u1();
        }
        return t2(file2, ijVar.S0(), str2, activity, f6Var, z9);
    }

    public static void u3(Dialog dialog, int i7, boolean z9, org.telegram.ui.Components.mg mgVar) {
        if (dialog != null) {
            v3(dialog.getWindow(), i7, z9, mgVar);
        }
    }

    public static void v(Context context, Configuration configuration) {
        float f10;
        boolean z9;
        int i7;
        int i10;
        Display defaultDisplay;
        try {
            float f11 = f22562p;
            f22562p = context.getResources().getDisplayMetrics().density;
            if (f22560o && Math.abs(f11 - f10) > 0.001d) {
                if (org.telegram.ui.ActionBar.k6.f28014m3 != null) {
                    org.telegram.ui.ActionBar.k6.f28014m3 = null;
                    org.telegram.ui.ActionBar.k6.K(context, false);
                }
                if (org.telegram.ui.ActionBar.k6.B0 != null) {
                    org.telegram.ui.ActionBar.k6.B0 = null;
                    org.telegram.ui.ActionBar.k6.T(context);
                }
                if (org.telegram.ui.ActionBar.k6.Q1 != null) {
                    org.telegram.ui.ActionBar.k6.Q1 = null;
                    org.telegram.ui.ActionBar.k6.Z(context);
                }
            }
            f22560o = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            if (configuration.keyboard != 1 && configuration.hardKeyboardHidden == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            D = z9;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = B;
            Point point = f22563q;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(point);
                float refreshRate = defaultDisplay.getRefreshRate();
                f22564r = refreshRate;
                f22565s = refreshRate;
                float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
                if (supportedRefreshRates != null) {
                    for (float f12 : supportedRefreshRates) {
                        if (f12 > f22565s) {
                            f22565s = f12;
                        }
                    }
                }
                f22566t = 1000.0f / f22564r;
            }
            if (configuration.screenWidthDp != 0) {
                int ceil = (int) Math.ceil(i7 * f22562p);
                if (Math.abs(point.x - ceil) > 3) {
                    point.x = ceil;
                }
            }
            if (configuration.screenHeightDp != 0) {
                int ceil2 = (int) Math.ceil(i10 * f22562p);
                if (Math.abs(point.y - ceil2) > 3) {
                    point.y = ceil2;
                }
            }
            if (f22567u == 0) {
                if (Q1()) {
                    f22567u = (int) (Q0() * 0.6f);
                    v = Q0() - L(28.0f);
                    f22568w = Q0() - L(92.0f);
                } else {
                    f22567u = (int) (Math.min(point.x, point.y) * 0.6f);
                    v = Math.min(point.x, point.y) - L(28.0f);
                    f22568w = Math.min(point.x - L(64.0f), point.y) - L(28.0f);
                }
                f22569x = L(2.0f);
            }
            if (r2.f25212a) {
                a8.d("density = " + f22562p + " display size = " + point.x + " " + point.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + f22557m + ", navbar height: " + f22558n);
            }
            f22542e = ViewConfiguration.get(context).getScaledTouchSlop();
            M = null;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static File v0(boolean z9) {
        int i7;
        if (!z9 && r2.f25213b && (((i7 = Build.VERSION.SDK_INT) < 33 || t0.f25566b.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) && (i7 > 33 || t0.f25566b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0))) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                if (!file.mkdirs() && !file.exists()) {
                    if (r2.f25212a) {
                        a8.b("failed to create directory");
                        return null;
                    }
                } else {
                    return file;
                }
            } else if (r2.f25212a) {
                a8.b("External storage is not mounted READ/WRITE.");
            }
            return null;
        }
        return w7.z(0);
    }

    public static void v1(View view) {
        if (view != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (!inputMethodManager.isActive()) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static boolean v2(org.telegram.tgnet.TLObject r8, android.app.Activity r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.v2(org.telegram.tgnet.TLObject, android.app.Activity):boolean");
    }

    public static void v3(Window window, int i7, boolean z9, org.telegram.ui.Components.mg mgVar) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap hashMap = f22556l0;
        if (hashMap != null && (valueAnimator = (ValueAnimator) hashMap.get(window)) != null) {
            valueAnimator.cancel();
            f22556l0.remove(window);
        }
        if (!z9) {
            if (mgVar != null) {
                org.telegram.ui.Components.di diVar = mgVar.f35980b;
                diVar.F0 = -1;
                diVar.G0 = i7;
                diVar.f28619b.invalidate();
            }
            try {
                window.setNavigationBarColor(i7);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i7);
        ofArgb.addUpdateListener(new q(0, mgVar, window));
        ofArgb.addListener(new m.a(window, 4));
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(org.telegram.ui.Components.xq.f40366f);
        ofArgb.start();
        if (f22556l0 == null) {
            f22556l0 = new HashMap();
        }
        f22556l0.put(window, ofArgb);
    }

    public static boolean w(String str) {
        boolean z9;
        boolean z10;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z9 = false;
            z10 = false;
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    char charAt = str.charAt(i7);
                    if (charAt != '.' && charAt != '-' && charAt != '/' && charAt != '+' && (charAt < '0' || charAt > '9')) {
                        if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                            z9 = true;
                        } else {
                            z10 = true;
                        }
                        if (z9 && z10) {
                            break;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    a8.g(e, true);
                    return !z9 ? false : false;
                }
            }
        } catch (Exception e11) {
            e = e11;
            z9 = false;
            z10 = false;
        }
        if (!z9 && z10) {
            return true;
        }
    }

    public static int w0(int i7, int i10) {
        int red = Color.red(i7);
        int red2 = Color.red(i10);
        int green = Color.green(i7);
        int green2 = Color.green(i10);
        int blue = Color.blue(i7);
        return Color.argb(255, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i10) / 2) + (blue / 2));
    }

    public static SpannableStringBuilder w1(CharSequence charSequence, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(charSequence)) {
            String lowerCase = charSequence.toString().toLowerCase();
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            int indexOf = lowerCase.indexOf(str);
            while (indexOf >= 0) {
                try {
                    valueOf.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.k6.f28092q6, f6Var), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                indexOf = lowerCase.indexOf(str, indexOf + 1);
            }
            return valueOf;
        }
        return null;
    }

    public static long w2(int i7, int i10) {
        return (i10 & 4294967295L) | (i7 << 32);
    }

    public static void w3(Activity activity, PictureInPictureParams pictureInPictureParams) {
        if (activity != null && !activity.isDestroyed()) {
            if (pictureInPictureParams == null) {
                c3(activity);
                return;
            }
            try {
                activity.setPictureInPictureParams(pictureInPictureParams);
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    public static boolean x(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String d2 = pf.b.d(str2, false);
            int i7 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = d2.indexOf(str3, i7);
                    if (indexOf == -1) {
                        return false;
                    }
                    i7 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static Bitmap x0() {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
            inputStream = t0.f25566b.getResources().openRawResource(2131624179);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    a8.g(th, true);
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

    public static CharSequence x1(CharSequence charSequence, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        if (arrayList != null) {
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                SpannableStringBuilder w12 = w1(charSequence, (String) arrayList.get(i10), f6Var);
                if (w12 != null) {
                    charSequence = w12;
                } else {
                    i7++;
                }
            }
            if (i7 != arrayList.size()) {
                return charSequence;
            }
        }
        return null;
    }

    public static SpannableStringBuilder x2(String str, Runnable runnable) {
        return S2(str, -1, 2, runnable, null);
    }

    public static void x3(Window window) {
        WindowManager windowManager;
        float f10 = f22565s;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f10;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e10) {
            a8.g(e10, true);
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

    public static void y0(Surface surface, Bitmap bitmap) {
        if (!surface.isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surface, bitmap, new p(countDownLatch, 0), Utilities.f21338g.b());
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    public static int[] y1(double d2, double d10, double d11) {
        double d12;
        double d13 = d2 * 6.0d;
        double floor = (int) Math.floor(d13);
        double d14 = d13 - floor;
        double d15 = (1.0d - d10) * d11;
        double d16 = (1.0d - (d14 * d10)) * d11;
        double d17 = (1.0d - ((1.0d - d14) * d10)) * d11;
        int i7 = ((int) floor) % 6;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
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

    public static String y2(File file, int i7) {
        InputStream inputStream;
        ThreadLocal threadLocal = f22537b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStream = new FileInputStream(file);
            } else {
                inputStream = t0.f25566b.getResources().openRawResource(i7);
            }
            try {
                ThreadLocal threadLocal2 = f22539c;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                    threadLocal2.set(bArr2);
                }
                int i10 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, bArr2.length);
                    if (read >= 0) {
                        int i11 = i10 + read;
                        if (bArr.length < i11) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i10);
                            f22537b.set(bArr3);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i10, read);
                            i10 = i11;
                        }
                    } else {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                inputStream.close();
                return new String(bArr, 0, i10);
            } catch (Throwable unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            inputStream = null;
        }
    }

    public static void y3(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - f22565s) > 0.2d) {
            layoutParams.preferredRefreshRate = f22565s;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
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

    public static void z0(SurfaceView surfaceView, Bitmap bitmap) {
        if (surfaceView != null && surfaceView.getHolder().getSurface().isValid()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(surfaceView, bitmap, new p(countDownLatch, 1), Utilities.f21338g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static float z1(float f10, float f11, float f12) {
        return (f10 - f11) / (f12 - f11);
    }

    public static void z2(Bitmap bitmap) {
        A2(Collections.singletonList(bitmap));
    }

    public static void z3(ScrollView scrollView, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            scrollView.setTopEdgeEffectColor(i7);
            scrollView.setBottomEdgeEffectColor(i7);
            return;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i7);
            }
            Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i7);
            }
        } catch (Exception unused) {
        }
    }
}
