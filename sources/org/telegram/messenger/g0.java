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
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l71;
import org.telegram.ui.qv0;
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
    public static Typeface f22580a;
    public static final int[] f22581a0;
    public static final int[] f22583b0;
    public static final f f22585c0;
    public static CallReceiver f22586d0;
    public static float f22587e;
    public static Pattern f22588e0;
    public static SimpleDateFormat f22590f0;
    public static final String[] f22592g0;
    public static final float[] f22593h0;
    public static WeakReference f22594i;
    public static final float[] f22595i0;
    public static final char[] f22597j0;
    public static HashSet f22599k0;
    public static HashMap f22601l0;
    public static boolean m0;
    public static Pattern f22604n0;
    public static boolean f22605o;
    public static final Paint f22606o0;
    public static int f22612u;
    public static int v;
    public static int f22613w;
    public static int f22614x;
    public static boolean f22615y;
    public static final ThreadLocal f22582b = new ThreadLocal();
    public static final ThreadLocal f22584c = new ThreadLocal();
    public static final Hashtable d = new Hashtable();
    public static int f22589f = -10;
    public static int f22591g = -10;
    public static int h = -10;
    public static boolean f22596j = false;
    public static final Object f22598k = new Object();
    public static final Object f22600l = new Object();
    public static int f22602m = 0;
    public static int f22603n = 0;
    public static float f22607p = 1.0f;
    public static final Point f22608q = new Point();
    public static float f22609r = 60.0f;
    public static float f22610s = 60.0f;
    public static float f22611t = 16.666666f;
    public static Integer f22616z = null;
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
        int i3;
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
            i3 = 80;
        } else {
            i3 = 72;
        }
        C = i3;
        v(t0.f25457b, null);
        f22581a0 = new int[]{2131231730, 2131231732, 2131231734, 2131231736};
        f22583b0 = new int[]{2131231731, 2131231733, 2131231735, 2131231737};
        f22585c0 = new Object();
        f22592g0 = new String[]{"", "K", "M", "B", "T", "P"};
        f22593h0 = new float[9];
        f22595i0 = new float[9];
        f22597j0 = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        f22606o0 = new Paint(1);
    }

    public static int A(int i3, int i10) {
        if (i3 == i10) {
            return 0;
        }
        if (i3 > i10) {
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
            for (int i3 = 0; i3 < str.length() && str2.length() + i3 <= str.length(); i3++) {
                int i10 = 0;
                for (int i11 = i3; i11 < str.length() && i10 < str2.length() && Character.toLowerCase(str.charAt(i11)) == Character.toLowerCase(str2.charAt(i10)); i11++) {
                    i10++;
                }
                if (i10 == str2.length()) {
                    return i3;
                }
            }
            return -1;
        }
        return str.indexOf(str2);
    }

    public static void A2(List list) {
        if (Build.VERSION.SDK_INT > 23 && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                Bitmap bitmap = (Bitmap) list.get(i3);
                if (bitmap != null && !bitmap.isRecycled()) {
                    arrayList.add(new WeakReference(bitmap));
                }
            }
            i3(new k(1, arrayList), 36L);
        }
    }

    public static void A3(org.telegram.ui.s2 s2Var, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            s2Var.setEdgeEffectColor(i3);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(s2Var);
            if (edgeEffect != null) {
                edgeEffect.setColor(i3);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(s2Var);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i3);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static float B(int i3) {
        float green = Color.green(i3) * 0.7152f;
        return com.google.android.recaptcha.internal.a.x(Color.blue(i3), 0.0722f, green + (Color.red(i3) * 0.2126f), 255.0f);
    }

    public static Bitmap B0(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i3) {
                    boolean z10;
                    boolean[] zArr2 = zArr;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (i3 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zArr2[0] = z10;
                    countDownLatch2.countDown();
                }
            }, Utilities.f21389g.b());
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

    public static boolean B1(int i3, int i10, int i11, int i12) {
        if (Math.max(i3, i10) > Math.min(i11, i12) && Math.max(i11, i12) > Math.min(i3, i10)) {
            return true;
        }
        return false;
    }

    public static void B2(Activity activity, int i3) {
        if (activity != null && !Q1() && N == i3) {
            activity.getWindow().setSoftInputMode(32);
        }
    }

    public static void B3(View view, int i3, int i10, int i11, int i12) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin != i3 || marginLayoutParams.topMargin != i10 || marginLayoutParams.rightMargin != i11 || marginLayoutParams.bottomMargin != i12) {
                    marginLayoutParams.leftMargin = i3;
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
        int i3 = 0;
        if (charSequenceArr.length == 1) {
            return charSequenceArr[0];
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = charSequenceArr.length;
                while (i3 < length) {
                    CharSequence charSequence2 = charSequenceArr[i3];
                    if (charSequence2 == null) {
                        charSequence2 = "null";
                    }
                    spannableStringBuilder.append(charSequence2);
                    i3++;
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = charSequenceArr.length;
        while (i3 < length2) {
            sb2.append(charSequenceArr[i3]);
            i3++;
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
            Context context = t0.f25457b;
            t0.d();
            Uri d10 = FileProvider.d(context, "org.telegram.messenger.beta.provider", file);
            fileOutputStream.close();
            return d10;
        } catch (Exception e11) {
            a8.g(e11, true);
            return null;
        }
    }

    public static boolean C1() {
        if (I == null) {
            I = (AccessibilityManager) t0.f25457b.getSystemService("accessibility");
        }
        if (I.isEnabled() && I.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public static void C2(Activity activity, int i3) {
        if (activity != null && O == i3) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static void C3(b5.l lVar, int i3) {
        try {
            Field declaredField = b5.l.class.getDeclaredField("g0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(lVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i3);
            }
            Field declaredField2 = b5.l.class.getDeclaredField("h0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(lVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i3);
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
            PackageInfo packageInfo = t0.f25457b.getPackageManager().getPackageInfo(t0.f25457b.getPackageName(), 0);
            int i3 = packageInfo.versionCode;
            int i10 = i3 / 10;
            int i11 = i3 % 10;
            if (i11 != 1 && i11 != 2) {
                t0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            return bd.a0("TelegramVersion", null, 2131744220, "v" + packageInfo.versionName + " (" + i10 + ") " + str);
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

    public static void D3(boolean z10) {
        synchronized (f22600l) {
            try {
                try {
                    if (z10) {
                        if (f22586d0 == null) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context = t0.f25457b;
                                CallReceiver callReceiver = new CallReceiver();
                                f22586d0 = callReceiver;
                                context.registerReceiver(callReceiver, intentFilter, 4);
                            } else {
                                Context context2 = t0.f25457b;
                                CallReceiver callReceiver2 = new CallReceiver();
                                f22586d0 = callReceiver2;
                                context2.registerReceiver(callReceiver2, intentFilter);
                            }
                        }
                    } else if (f22586d0 != null) {
                        t0.f25457b.unregisterReceiver(f22586d0);
                        f22586d0 = null;
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
                File[] externalCacheDirs = t0.f25457b.getExternalCacheDirs();
                int i3 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(az.f21632h0)) {
                    while (true) {
                        if (i3 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i3];
                            if (file2 != null && file2.getAbsolutePath().startsWith(az.f21632h0)) {
                                file = externalCacheDirs[i3];
                                break;
                            }
                            i3++;
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
            File cacheDir = t0.f25457b.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            File filesDir = t0.f25457b.getFilesDir();
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

    public static void E3(boolean z10) {
        synchronized (f22598k) {
            try {
                f22596j = z10;
                if (z10) {
                    com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(t0.f25457b, a6.a.f136l, com.google.android.gms.common.api.b.f6584j, com.google.android.gms.common.api.i.f6594c);
                    com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                    b10.f6737c = new kb.a(jVar, 14);
                    b10.d = new m6.c[]{l7.b.f18092a};
                    b10.f6735a = 1567;
                    jVar.e(1, b10.a()).addOnSuccessListener(new o4.v0(8));
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

    public static int F0(int i3, int i10) {
        int red = Color.red(i3);
        int green = Color.green(i3);
        int blue = Color.blue(i3);
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
        ofFloat.addListener(new ei.p2(2, view));
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
            ((q1.g) view.getTag(2131296663)).d();
        }
        Float f11 = (Float) view.getTag(2131296664);
        if (f11 != null) {
            view.setTranslationX(f11.floatValue());
        }
        view.setTag(2131296664, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        q1.g gVar = new q1.g(view, q1.g.f53636o, translationX);
        q1.h hVar = new q1.h(translationX);
        hVar.b(600.0f);
        gVar.f53653m = hVar;
        gVar.f53643a = (-L2) * 100;
        gVar.a(new gi.f3(translationX, view, runnable));
        view.setTag(2131296663, gVar);
        gVar.h();
    }

    public static byte[] H(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        while (i3 < bArr.length) {
            byte b10 = bArr[i3];
            if (b10 == 61) {
                try {
                    int digit = Character.digit((char) bArr[i3 + 1], 16);
                    i3 += 2;
                    byteArrayOutputStream.write((char) ((digit << 4) + Character.digit((char) bArr[i3], 16)));
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return null;
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i3++;
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

    public static SpannableStringBuilder H2(CharSequence charSequence, boolean z10) {
        return J2(charSequence, z10, L(2.6666667f), 0.0f, 1.0f, 2131232241);
    }

    public static void H3(View view) {
        G3(10.0f, view, null);
    }

    public static float I(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public static i0.b I0(r0.k1 k1Var, boolean z10) {
        i0.b g7 = k1Var.f54026a.g(647);
        r0.h1 h1Var = k1Var.f54026a;
        i0.b a10 = i0.b.a(g7, h1Var.f(647));
        if (z10) {
            return i0.b.a(a10, h1Var.f(8));
        }
        return a10;
    }

    public static boolean I1(Uri uri, int i3) {
        String str;
        if (uri != null) {
            str = uri.getPath();
            if (str == null) {
                return false;
            }
            if (str.matches(Pattern.quote(new File(t0.f25457b.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
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
                String readlinkFd = Utilities.readlinkFd(i3);
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
        return str.toLowerCase().contains("/data/data/" + t0.f25457b.getPackageName());
    }

    public static SpannableStringBuilder I2(CharSequence charSequence, boolean z10, float f10, float f11) {
        return J2(charSequence, z10, f10, f11, 1.0f, 2131232241);
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
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 10; i13++) {
            for (int i14 = 0; i14 < 10; i14++) {
                int pixel = bitmap.getPixel((int) (i13 * width), (int) (i14 * height));
                if (Color.alpha(pixel) > 200) {
                    int red = Color.red(pixel) + i10;
                    int green = Color.green(pixel) + i11;
                    i3++;
                    i12 = Color.blue(pixel) + i12;
                    i11 = green;
                    i10 = red;
                }
            }
        }
        if (i3 == 0) {
            return 0;
        }
        return Color.argb(255, i10 / i3, i11 / i3, i12 / i3);
    }

    public static boolean J1(org.telegram.ui.ActionBar.d2 d2Var) {
        ((mb.b) t0.k()).getClass();
        try {
            t0.f25457b.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (d2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
            ((mb.b) t0.k()).getClass();
            alertDialog$Builder.f27343a.U = bd.M0(2131749204, null);
            alertDialog$Builder.k(bd.M0(2131747839, null), new o(0, "com.google.android.apps.maps", d2Var));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            d2Var.showDialog(alertDialog$Builder.f27343a);
            return false;
        }
    }

    public static SpannableStringBuilder J2(CharSequence charSequence, boolean z10, float f10, float f11, float f12, int i3) {
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i3, 0);
        float f13 = f12 * 0.88f;
        wpVar.I = f13;
        wpVar.J = f13;
        wpVar.f40045r = -f10;
        wpVar.f40046s = f11;
        wpVar.H = 0.8f;
        if (z10) {
            wpVar.f40043f = z10;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(wpVar, spannableString.length() - 1, spannableString.length(), 33);
        SpannableStringBuilder M2 = M2(charSequence, spannableString, " >");
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(wpVar, 0, 1, 33);
        SpannableStringBuilder M22 = M2(M2, spannableString2, ">");
        org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(i3, 0);
        wpVar2.I = f13;
        wpVar2.J = f13;
        wpVar2.f40045r = f10;
        wpVar2.f40046s = f11;
        wpVar2.f40047w = 180.0f;
        wpVar2.H = 0.8f;
        if (z10) {
            wpVar2.f40043f = z10;
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

    public static String K0(String str, boolean z10) {
        if (str != null) {
            if (f22604n0 == null) {
                f22604n0 = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
            }
            Matcher matcher = f22604n0.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(4);
                if (group != null) {
                    group = group.toLowerCase();
                }
                if (z10 && group != null && group.startsWith("www.")) {
                    return group.substring(4);
                }
                return group;
            }
            return null;
        }
        return null;
    }

    public static boolean K1(char c2) {
        if (f22599k0 == null) {
            f22599k0 = new HashSet();
            int i3 = 0;
            while (true) {
                char[] cArr = f22597j0;
                if (i3 >= cArr.length) {
                    break;
                }
                f22599k0.add(Character.valueOf(cArr[i3]));
                i3++;
            }
        }
        return f22599k0.contains(Character.valueOf(c2));
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
        return (int) Math.ceil(f22607p * f10);
    }

    public static Pair L0(File file) {
        try {
            return O0(new t1.g(file));
        } catch (Exception e10) {
            a8.g(e10, true);
            return new Pair(0, 0);
        }
    }

    public static boolean L1(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            for (int i3 = 0; i3 < charSequence.length(); i3++) {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 1424 && charAt <= 1791) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder L2(String str, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.qr qrVar) {
        if (f22588e0 == null) {
            f22588e0 = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f22588e0.matcher(str);
        int i3 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i3, matcher.start());
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new v(qrVar, group2, e6Var, 0), spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i3 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i3, str.length());
        return spannableStringBuilder;
    }

    public static void L3(final LaunchActivity launchActivity, final ui.a aVar) {
        if (!aVar.g()) {
            return;
        }
        String str = aVar.f56372b;
        int i3 = aVar.f56373c;
        String str2 = aVar.d;
        String str3 = aVar.f56374e;
        String str4 = aVar.f56375f;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) launchActivity, (org.telegram.ui.ActionBar.e6) null, false);
        t2Var.N();
        t2Var.f28619v0 = false;
        t2Var.f28621w0 = false;
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        linearLayout.setOrientation(1);
        t2Var.O = linearLayout;
        TextView b10 = b8.rf.b(launchActivity, 20.0f, org.telegram.ui.ActionBar.k6.f27988j5, true, null);
        b10.setText(bd.M0(2131743785, null));
        linearLayout.addView(b10, b8.mf.t(-1, -2, 55, 22, 18, 22, 0));
        rx0 rx0Var = new rx0(launchActivity, null);
        linearLayout.addView(rx0Var, b8.mf.t(-1, -2, 55, 14, 18, 14, 0));
        if (!TextUtils.isEmpty(str)) {
            rx0Var.c(bd.M0(2131743801, null), str, null, null);
        }
        if (i3 != 0) {
            rx0Var.c(bd.M0(2131743796, null), Integer.toString(i3), null, null);
        }
        if (!TextUtils.isEmpty(str4)) {
            rx0Var.c(bd.M0(2131743794, null), str4, null, null);
        }
        if (!TextUtils.isEmpty(str2)) {
            rx0Var.c(bd.M0(2131743784, null), str2, null, null);
        }
        if (!TextUtils.isEmpty(str3)) {
            rx0Var.c(bd.M0(2131743797, null), str3, null, null);
        }
        org.telegram.ui.Components.hc[] hcVarArr = new org.telegram.ui.Components.hc[1];
        rx0Var.c(bd.M0(2131746608, null), "", null, hcVarArr);
        ((View) hcVarArr[0].getParent()).setPadding(0, 0, 0, 0);
        hcVarArr[0].setDisablePaddingsOffsetY(true);
        hcVarArr[0].setPadding(L(12.66f), L(9.33f), L(12.66f), L(9.33f));
        hcVarArr[0].setText(O2(bd.M0(2131746617, null), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false), new ul(new boolean[1], hcVarArr, aVar, launchActivity, 5)));
        if (!TextUtils.isEmpty(str4)) {
            px0 a10 = rx0Var.a(bd.M0(2131743786, null));
            a10.setFilled(true);
            yh.l lVar = (yh.l) a10.getChildAt(0);
            lVar.setTextSize(1, 11.0f);
            lVar.setGravity(17);
        }
        gi.d dVar = new gi.d(launchActivity, null, true);
        dVar.setRoundRadius(24);
        dVar.setText(bd.M0(2131751808, null));
        final org.telegram.ui.ActionBar.e2 e2Var = t2Var.f28625y0;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.putBoolean("proxy_enabled", true);
                ui.a aVar2 = ui.a.this;
                aVar2.i(edit);
                edit.commit();
                az.B1 = az.a(new zy(aVar2));
                ConnectionsManager.setProxySettings(true, aVar2);
                hs.e().k(hs.A4, new Object[0]);
                org.telegram.ui.ActionBar.d2 lastFragment = launchActivity.M().getLastFragment();
                if (lastFragment instanceof org.telegram.ui.wm) {
                    org.telegram.ui.wm wmVar = (org.telegram.ui.wm) lastFragment;
                    wmVar.f8();
                    UndoView undoView = wmVar.N3;
                    if (undoView != null) {
                        undoView.j(87, 0L, null);
                        e2Var.run();
                    }
                }
                hs.e().k(hs.P4, 6, bd.M0(2131746618, null));
                e2Var.run();
            }
        });
        linearLayout.addView(dVar, b8.mf.t(-1, 48, 55, 14, 18, 14, 14));
        t2Var.show();
    }

    public static int M(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(f22607p * f10);
    }

    public static Pair M0(InputStream inputStream) {
        try {
            return O0(new t1.g(inputStream));
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

    public static void M3(int i3, int i10, int[] iArr, Canvas canvas, View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            textureView.getLocationInWindow(iArr);
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.drawBitmap(bitmap, iArr[0] - i3, iArr[1] - i10, (Paint) null);
                canvas.restore();
                bitmap.recycle();
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                M3(i3, i10, iArr, canvas, viewGroup.getChildAt(i11));
            }
        }
    }

    public static float N(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return f22607p * f10;
    }

    public static Pair N0(String str) {
        try {
            return O0(new t1.g(str));
        } catch (Exception unused) {
            return new Pair(0, 0);
        }
    }

    public static boolean N1() {
        TelephonyManager telephonyManager = (TelephonyManager) t0.f25457b.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        if (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || Settings.Global.getInt(t0.f25457b.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return false;
        }
        return true;
    }

    public static CharSequence N2(CharSequence charSequence) {
        int i3 = 0;
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            while (i3 < length) {
                if (sb2.charAt(i3) == '\n') {
                    sb2.setCharAt(i3, ' ');
                }
                i3++;
            }
            return charSequence;
        } else if (charSequence instanceof SpannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            int length2 = charSequence.length();
            while (i3 < length2) {
                if (charSequence.charAt(i3) == '\n') {
                    spannableStringBuilder.replace(i3, i3 + 1, (CharSequence) " ");
                }
                i3++;
            }
            return spannableStringBuilder;
        } else if (charSequence instanceof SpannableString) {
            if (TextUtils.indexOf(charSequence, '\n') < 0) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
            int length3 = charSequence.length();
            while (i3 < length3) {
                if (charSequence.charAt(i3) == '\n') {
                    spannableStringBuilder2.replace(i3, i3 + 1, (CharSequence) " ");
                }
                i3++;
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

    public static void O(Canvas canvas, FrameLayout frameLayout, int i3, int i10, float f10) {
        int r12 = org.telegram.ui.ActionBar.k6.r1(T1(0.0f, 0.75f, R0(i10)) * f10, i3);
        Paint paint = f22606o0;
        paint.setColor(r12);
        canvas.drawRect(0.0f, (frameLayout.getY() + frameLayout.getMeasuredHeight()) - i10, frameLayout.getMeasuredWidth(), frameLayout.getY() + frameLayout.getMeasuredHeight(), paint);
    }

    public static Pair O0(t1.g gVar) {
        int i3;
        int i10 = 0;
        try {
            int i11 = 2;
            switch (gVar.c()) {
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i3 = 180;
                    i11 = 0;
                    i10 = i3;
                    break;
                case 4:
                    break;
                case 5:
                    i10 = 270;
                    break;
                case 6:
                    i3 = 90;
                    i11 = 0;
                    i10 = i3;
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
        boolean z10;
        if (M == null) {
            Point point = f22608q;
            if (((Math.max(point.x, point.y) - f22602m) - f22603n) / f22607p <= 650.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            M = Boolean.valueOf(z10);
        }
        return M.booleanValue();
    }

    public static SpannableStringBuilder O2(String str, int i3, Runnable runnable) {
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
                spannableStringBuilder.setSpan(new z(i3, runnable), indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new t(i3, 1), indexOf, i10 + indexOf, 0);
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
        String S0 = bd.E0().S0(str, true, false);
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
        if (canvas.clipRect(rectF.left - f11, f12, rectF.right + f11, b8.be.a(f12 + max, f12, rectF.bottom))) {
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
        if (canvas.clipRect(rectF.left - f13, b8.be.a(f14 - max2, rectF.top, f14), rectF.right + f13, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f13, rectF.right, rectF.bottom - f13, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static File P0() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = t0.f25457b.getExternalFilesDir(null);
                File file = new File(externalFilesDir.getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(t0.f25457b.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(t0.f25457b.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            t0.a(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static boolean P1() {
        Point point = f22608q;
        if (Math.min(point.x, point.y) / f22607p <= 690.0f) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder P2(int i3, String str) {
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
            spannableStringBuilder.setSpan(new t(i3, 0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static CharSequence P3(CharSequence charSequence, int[] iArr) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) <= ' ') {
            i3++;
        }
        while (i3 < length && charSequence.charAt(length - 1) <= ' ') {
            length--;
        }
        if (iArr != null) {
            iArr[0] = i3;
        }
        if (i3 <= 0 && length >= charSequence.length()) {
            return charSequence;
        }
        return charSequence.subSequence(i3, length);
    }

    public static CharSequence Q(CharSequence charSequence, String str, int i3, TextPaint textPaint) {
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
            float f10 = i3;
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
        Point point = f22608q;
        if (!P1) {
            int min = Math.min(point.x, point.y);
            return min - l1(min, 0, 0);
        }
        int min2 = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        return Math.min(min2, max - l1(max, 0, 0));
    }

    public static boolean Q1() {
        if (R1() && !az.W) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder Q2(String str, int i3, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, boolean z10) {
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
                spannableStringBuilder.setSpan(new a0(z10, i3, e6Var, runnable), indexOf, i10 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new b0(z10, i3, e6Var), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void Q3(Activity activity) {
        boolean z10;
        if (activity != null) {
            try {
                if (f22589f != -10) {
                    int requestedOrientation = activity.getRequestedOrientation();
                    activity.setRequestedOrientation(f22589f);
                    if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        f22591g = f22589f;
                        h = requestedOrientation;
                        f22594i = new WeakReference(activity);
                    }
                    f22589f = -10;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static MotionEvent R() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static float R0(int i3) {
        return Utilities.l((i3 - L(32.0f)) / L(16.0f));
    }

    public static boolean R1() {
        boolean z10;
        if (K == null) {
            if (t0.f25457b != null && t0.f25457b.getResources().getBoolean(2131034114)) {
                z10 = true;
            } else {
                z10 = false;
            }
            K = Boolean.valueOf(z10);
        }
        return K.booleanValue();
    }

    public static SpannableStringBuilder R2(String str, int i3, org.telegram.ui.ActionBar.e6 e6Var, qv0 qv0Var) {
        return Q2(str, i3, e6Var, qv0Var, false);
    }

    public static void R3(ImageView imageView, int i3) {
        S3(imageView, imageView.getContext().getDrawable(i3));
    }

    public static void S(Window window) {
        int i3;
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
                i3 = 3;
            } else {
                i3 = 1;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i3) {
                o4.v0.j(attributes, i3);
                window.setAttributes(attributes);
            }
        }
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static int S0(float f10, float f11, int i3, int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        int red2 = Color.red(i3);
        int green2 = Color.green(i3);
        int blue2 = Color.blue(i3);
        int alpha2 = Color.alpha(i3);
        return Color.argb((int) com.google.android.recaptcha.internal.a.A(alpha - alpha2, f10, alpha2, f11), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2));
    }

    public static boolean S1(char c2) {
        if (c2 != '-' && c2 != '~') {
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder S2(String str, int i3, int i10, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
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
                spannableStringBuilder.setSpan(new mi.x5(e6Var, 1), indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new y(i10, i3, e6Var, runnable), indexOf, i11 + indexOf, 0);
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
            TelephonyManager telephonyManager = (TelephonyManager) t0.f25457b.getSystemService("phone");
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
            if (DocumentsContract.isDocumentUri(t0.f25457b, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    if ("primary".equalsIgnoreCase(DocumentsContract.getDocumentId(uri).split(":")[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    return H0(t0.f25457b, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    int hashCode = str.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875 && str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                return H0(t0.f25457b, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return H0(t0.f25457b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (str.equals("image")) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            return H0(t0.f25457b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        uri2 = null;
                        return H0(t0.f25457b, uri2, "_id=?", new String[]{split2[1]});
                    }
                    if (str.equals("audio")) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        return H0(t0.f25457b, uri2, "_id=?", new String[]{split2[1]});
                    }
                    uri2 = null;
                    return H0(t0.f25457b, uri2, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return H0(t0.f25457b, uri, null, null);
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
        return com.google.android.recaptcha.internal.a.y(f11, f10, f12, f10);
    }

    public static SpannableStringBuilder T2(String str, int i3, org.telegram.ui.xe xeVar) {
        return S2(str, i3, 0, xeVar, null);
    }

    public static void T3(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (windowManager != null && view != null && view.getParent() != null) {
            windowManager.updateViewLayout(view, layoutParams);
        }
    }

    public static String U(String str) {
        return F2(D2(str));
    }

    public static int U0(int i3) {
        return V0(i3, false);
    }

    public static float U1(float f10, float[] fArr) {
        return T1(fArr[0], fArr[1], f10);
    }

    public static SpannableStringBuilder U2(String str, Runnable runnable) {
        return S2(str, -1, 0, runnable, null);
    }

    public static void U3(float f10, View view, boolean z10, boolean z11) {
        boolean z12;
        float f11;
        float f12;
        float f13;
        if (view != null) {
            int i3 = 0;
            if (view.getParent() == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            Integer num = null;
            view.animate().setListener(null).cancel();
            float f14 = 0.5f;
            float f15 = 0.0f;
            if (!z12) {
                if (!z10) {
                    i3 = 8;
                }
                view.setVisibility(i3);
                if (z10) {
                    num = 1;
                }
                view.setTag(num);
                view.setAlpha(1.0f);
                if (z11 && !z10) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                view.setScaleX(f13);
                if (!z11 || z10) {
                    f14 = 1.0f;
                }
                view.setScaleY(f14);
                if (f10 != 0.0f) {
                    if (!z10) {
                        f15 = L(-16.0f) * f10;
                    }
                    view.setTranslationY(f15);
                }
            } else if (z10) {
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    if (z11) {
                        f12 = 0.5f;
                    } else {
                        f12 = 1.0f;
                    }
                    view.setScaleX(f12);
                    if (!z11) {
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
                if (z11) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = alpha.scaleY(f11);
                if (!z11) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator withEndAction2 = scaleY.scaleX(f14).setListener(new org.telegram.ui.Components.s9(view)).setInterpolator(org.telegram.ui.Components.xq.h).setDuration(340L).withEndAction(null);
                if (f10 != 0.0f) {
                    withEndAction2.translationY(L(-16.0f) * f10);
                }
                withEndAction2.start();
            }
        }
    }

    public static Object V(Class cls, List list) {
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                Object obj = list.get(i3);
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

    public static float V1(boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        float f13 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z11) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (z10) {
            f13 = 1.0f;
        }
        return com.google.android.recaptcha.internal.a.y(f12, f13, f10, f11);
    }

    public static SpannableStringBuilder V2(SpannableStringBuilder spannableStringBuilder) {
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                int t10 = t(spannableStringBuilder, "**");
                if (t10 == -1) {
                    break;
                }
                spannableStringBuilder.replace(t10, t10 + 2, "");
                int t11 = t(spannableStringBuilder, "**");
                if (t11 >= 0) {
                    spannableStringBuilder.replace(t11, t11 + 2, "");
                    arrayList.add(Integer.valueOf(t10));
                    arrayList.add(Integer.valueOf(t11));
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            for (int i3 = 0; i3 < arrayList.size() / 2; i3++) {
                int i10 = i3 * 2;
                spannableStringBuilder2.setSpan(new o31(o()), ((Integer) arrayList.get(i10)).intValue(), ((Integer) arrayList.get(i10 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e10) {
            a8.g(e10, true);
            return spannableStringBuilder;
        }
    }

    public static void V3(View view, boolean z10, boolean z11) {
        U3(0.0f, view, z10, z11);
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

    public static int W0(int i3) {
        float[] b10 = b(Color.red(i3), Color.green(i3), Color.blue(i3));
        b10[1] = Math.min(1.0f, b10[1] + 0.05f);
        float f10 = b10[2];
        if (f10 > 0.5f) {
            b10[2] = Math.max(0.0f, f10 * 0.9f);
        } else {
            b10[2] = Math.max(0.0f, f10 * 0.9f);
        }
        return a(b10[0], b10[1], b10[2]) | (-16777216);
    }

    public static int W1(float f10, int i3, int i10) {
        return (int) ((f10 * (i10 - i3)) + i3);
    }

    public static SpannableStringBuilder W2(CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return V2((SpannableStringBuilder) charSequence);
        }
        return V2(new SpannableStringBuilder(charSequence));
    }

    public static void W3(float f10, View view, boolean z10, boolean z11) {
        Z3(view, z10, f10, true, z11);
    }

    public static View X(ViewGroup viewGroup, float f10, float f11) {
        if (viewGroup.getVisibility() == 0) {
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
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

    public static int X0(int i3) {
        return Math.max(73, (i3 >> 16) & 65535);
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
            for (int i3 = 0; i3 < arrayList.size() / 2; i3++) {
                int i10 = i3 * 2;
                spannableStringBuilder.setSpan(new o31(o()), ((Integer) arrayList.get(i10)).intValue(), ((Integer) arrayList.get(i10 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e10) {
            a8.g(e10, true);
            return new SpannableStringBuilder(str);
        }
    }

    public static void X3(View view, boolean z10) {
        Z3(view, z10, 1.0f, true, true);
    }

    public static boolean Y(ViewGroup viewGroup, float f10, float f11, View view) {
        int i3;
        Rect rect;
        if (viewGroup == null) {
            return false;
        }
        int i10 = 0;
        while (i10 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof ei.j4) || childAt == view)) {
                if (childAt instanceof ei.r8) {
                    ei.t8 t8Var = (ei.t8) viewGroup;
                    if (t8Var.f11056b == null || (f10 >= L(60.0f) && f10 <= viewGroup.getWidth() - L(60.0f))) {
                        int i11 = 0;
                        while (i11 < t8Var.getChildCount()) {
                            View childAt2 = t8Var.getChildAt(i11);
                            if (childAt2 instanceof ei.w8) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d10 = f10 - translationX;
                                i3 = i10;
                                double d11 = f11 - translationY;
                                float cos = (float) ((Math.cos(radians) * d10) - (Math.sin(radians) * d11));
                                float c2 = (float) k2.p1.c(radians, d11, Math.sin(radians) * d10);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && c2 >= (-measuredHeight) / 2.0f && c2 <= measuredHeight / 2.0f) {
                                    rect = Q;
                                    childAt.getHitRect(rect);
                                    if (rect.contains((int) f10, (int) f11) || !childAt.isClickable()) {
                                        if ((childAt instanceof ViewGroup) && Y((ViewGroup) childAt, f10 - childAt.getX(), f11 - childAt.getY(), view)) {
                                            return true;
                                        }
                                        i10 = i3 + 1;
                                    } else {
                                        return true;
                                    }
                                }
                            } else {
                                i3 = i10;
                            }
                            i11++;
                            i10 = i3;
                        }
                    }
                }
                i3 = i10;
                rect = Q;
                childAt.getHitRect(rect);
                if (rect.contains((int) f10, (int) f11)) {
                }
                if (childAt instanceof ViewGroup) {
                    return true;
                }
                continue;
                i10 = i3 + 1;
            }
            i3 = i10;
            i10 = i3 + 1;
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
            int i3 = 0;
            while (i3 < length - 2) {
                int i10 = i3 + 2;
                sb2.getChars(i3, i10, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb2 = sb2.replace(i3, i10, "\n");
                    i3--;
                    length--;
                }
                i3++;
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

    public static void Y3(View view, boolean z10, float f10, boolean z11, float f11, boolean z12, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Integer num = 1;
        if (view != null) {
            int i3 = 0;
            if (view.getParent() == null) {
                z12 = false;
            }
            if (!z12) {
                view.animate().setListener(null).cancel();
                if (!z10) {
                    if (z11) {
                        i3 = 8;
                    } else {
                        i3 = 4;
                    }
                }
                view.setVisibility(i3);
                if (!z10) {
                    num = null;
                }
                view.setTag(num);
                view.setAlpha(f11);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            } else if (z10 && view.getTag() == null) {
                view.animate().setListener(null).cancel();
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                }
                view.animate().alpha(f11).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(num);
            } else if (!z10 && view.getTag() != null) {
                view.animate().setListener(null).cancel();
                view.animate().alpha(0.0f).scaleY(f10).scaleX(f10).setListener(new org.telegram.ui.Components.s9(view, z11)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(null);
            }
        }
    }

    public static TLRPC.Document Z(long j10, List list) {
        if (list == null) {
            return null;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            TLRPC.Document document = (TLRPC.Document) list.get(i3);
            if (document != null && document.f27007id == j10) {
                return document;
            }
        }
        return null;
    }

    public static int Z0(boolean z10) {
        if (z10) {
            if (A == null) {
                A = 2560;
            }
            return A.intValue();
        }
        if (f22616z == null) {
            f22616z = 1280;
        }
        return f22616z.intValue();
    }

    public static void Z1(RectF rectF, RectF rectF2, float f10, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(T1(rectF.left, rectF2.left, f10), T1(rectF.top, rectF2.top, f10), T1(rectF.right, rectF2.right, f10), T1(rectF.bottom, rectF2.bottom, f10));
        }
    }

    public static void Z2(Activity activity, int i3) {
        if (activity != null && !Q1()) {
            activity.getWindow().setSoftInputMode(48);
            N = i3;
        }
    }

    public static void Z3(View view, boolean z10, float f10, boolean z11, boolean z12) {
        Y3(view, z10, f10, z11, 1.0f, z12, null);
    }

    public static int a(float f10, float f11, float f12) {
        int i3;
        int i10;
        int i11;
        if (f11 == 0.0f) {
            i3 = (int) ((f12 * 255.0f) + 0.5f);
        } else {
            float floor = (f10 - ((float) Math.floor(f10))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f13 = (1.0f - f11) * f12;
            float B2 = com.google.android.recaptcha.internal.a.B(f11, floor2, 1.0f, f12);
            float f14 = (1.0f - ((1.0f - floor2) * f11)) * f12;
            int i12 = (int) floor;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    i3 = 0;
                                } else {
                                    i3 = (int) ((f12 * 255.0f) + 0.5f);
                                    i10 = (int) ((f13 * 255.0f) + 0.5f);
                                    i11 = (int) ((B2 * 255.0f) + 0.5f);
                                }
                            } else {
                                i3 = (int) ((f14 * 255.0f) + 0.5f);
                                i10 = (int) ((f13 * 255.0f) + 0.5f);
                            }
                        } else {
                            i3 = (int) ((f13 * 255.0f) + 0.5f);
                            i10 = (int) ((B2 * 255.0f) + 0.5f);
                        }
                        i11 = (int) ((f12 * 255.0f) + 0.5f);
                    } else {
                        i3 = (int) ((f13 * 255.0f) + 0.5f);
                        i10 = (int) ((f12 * 255.0f) + 0.5f);
                        i11 = (int) ((f14 * 255.0f) + 0.5f);
                    }
                    return ((i3 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255);
                }
                i3 = (int) ((B2 * 255.0f) + 0.5f);
                i10 = (int) ((f12 * 255.0f) + 0.5f);
            } else {
                i3 = (int) ((f12 * 255.0f) + 0.5f);
                i10 = (int) ((f14 * 255.0f) + 0.5f);
            }
            i11 = (int) ((f13 * 255.0f) + 0.5f);
            return ((i3 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255);
        }
        i10 = i3;
        i11 = i10;
        return ((i3 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255);
    }

    public static void a0() {
        SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("google_bug_154855417", 0);
        if (!sharedPreferences.contains("fixed")) {
            new File(t0.h(), "ZoomTables.data").delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        }
    }

    public static float a1(boolean z10, float f10) {
        float f11;
        float f12 = f10 / 2.54f;
        DisplayMetrics displayMetrics = B;
        if (z10) {
            f11 = displayMetrics.xdpi;
        } else {
            f11 = displayMetrics.ydpi;
        }
        return f12 * f11;
    }

    public static void a2(float[] fArr, float[] fArr2, float f10, float[] fArr3) {
        float f11;
        if (fArr3 != null) {
            for (int i3 = 0; i3 < fArr3.length; i3++) {
                float f12 = 0.0f;
                if (fArr != null && i3 < fArr.length) {
                    f11 = fArr[i3];
                } else {
                    f11 = 0.0f;
                }
                if (fArr2 != null && i3 < fArr2.length) {
                    f12 = fArr2[i3];
                }
                fArr3[i3] = T1(f11, f12, f10);
            }
        }
    }

    public static void a3(Activity activity, int i3) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null && !Q1()) {
            window.setSoftInputMode(16);
            N = i3;
        }
    }

    public static void a4(int i3, tj0 tj0Var) {
        u4.h0 adapter;
        u4.d1 T2;
        if (tj0Var != null && (adapter = tj0Var.getAdapter()) != null) {
            for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
                View childAt = tj0Var.getChildAt(i10);
                int R2 = RecyclerView.R(childAt);
                if (R2 >= 0 && (T2 = tj0Var.T(childAt)) != null && !T2.r() && T2.b() == i3) {
                    adapter.t(T2, R2);
                }
            }
        }
    }

    public static float[] b(int i3, int i10, int i11) {
        float f10;
        float f11;
        int max = Math.max(i3, i10);
        if (i11 > max) {
            max = i11;
        }
        int min = Math.min(i3, i10);
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
            float f16 = (max - i3) / f15;
            float f17 = (max - i10) / f15;
            float f18 = (max - i11) / f15;
            if (i3 == max) {
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

    public static double b0(double d10) {
        return ((long) (d10 * 1000000.0d)) / 1000000.0d;
    }

    public static long b1(SharedPreferences sharedPreferences, String str, long j10) {
        try {
            return sharedPreferences.getLong(str, j10);
        } catch (Exception unused) {
            return sharedPreferences.getInt(str, (int) j10);
        }
    }

    public static float b2(float f10, float f11, float f12) {
        return ((((((((f11 - f10) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f12) + f10) + 360.0f) % 360.0f;
    }

    public static void b3(Activity activity, int i3) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        O = i3;
    }

    public static void b4(tj0 tj0Var) {
        u4.h0 adapter;
        u4.d1 T2;
        if (tj0Var != null && (adapter = tj0Var.getAdapter()) != null) {
            for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                View childAt = tj0Var.getChildAt(i3);
                int R2 = RecyclerView.R(childAt);
                if (R2 >= 0 && (T2 = tj0Var.T(childAt)) != null && !T2.r()) {
                    adapter.t(T2, R2);
                }
            }
        }
    }

    public static void c(android.text.Spannable r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.c(android.text.Spannable, int, boolean, boolean):void");
    }

    public static void c0(View view, u10 u10Var) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                u10Var.a(view);
                c0(viewGroup.getChildAt(i3), u10Var);
            }
            return;
        }
        u10Var.a(view);
    }

    public static Point c1() {
        Point point = new Point();
        try {
            ((WindowManager) t0.f25457b.getSystemService("window")).getDefaultDisplay().getRealSize(point);
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
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setSourceRectHint(null);
            builder.setAspectRatio(null);
            if (i3 >= 31) {
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
            t0.f25457b.sendBroadcast(intent);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void d0(RecyclerView recyclerView, u10 u10Var) {
        if (recyclerView != null) {
            for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
                u10Var.a(recyclerView.getChildAt(i3));
            }
            for (int i10 = 0; i10 < recyclerView.getCachedChildCount(); i10++) {
                u10Var.a(recyclerView.P(i10));
            }
            for (int i11 = 0; i11 < recyclerView.getHiddenChildCount(); i11++) {
                u10Var.a(recyclerView.V(i11));
            }
            for (int i12 = 0; i12 < recyclerView.getAttachedScrapChildCount(); i12++) {
                u10Var.a(recyclerView.O(i12));
            }
        }
    }

    public static ArrayList d1() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        File[] externalFilesDirs = t0.f25457b.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((File) arrayList.get(i3)).getPath().equals(file2.getPath());
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

    public static int d2(float f10, int i3, int i10) {
        return Color.argb(W1(f10, Color.alpha(i3), Color.alpha(i10)), W1(f10, Color.red(i3), Color.red(i10)), W1(f10, Color.green(i3), Color.green(i10)), W1(f10, Color.blue(i3), Color.blue(i10)));
    }

    public static void d3() {
        int i3;
        if (L == null) {
            L = Boolean.valueOf(R1());
        }
        K = null;
        if (az.X0) {
            SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("mainconfig", 0);
            if (Q1() && (t0.f25457b == null || !t0.f25457b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) {
                i3 = 18;
            } else {
                i3 = 16;
            }
            int i10 = sharedPreferences.getInt("fons_size", i3);
            az.W0 = i10;
            az.Z0 = sharedPreferences.getInt("iv_font_size", i10);
        }
    }

    public static SpannableStringBuilder d4(CharSequence charSequence, Runnable runnable) {
        SpannableString spannableString = new SpannableString(bd.M0(2131749017, null));
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

    public static String e0(int i3, double d10, double d11, int i10, int i11, boolean z10, int i12, int i13) {
        int i14;
        int i15 = 2;
        int min = Math.min(2, (int) Math.ceil(f22607p));
        if (i13 == -1) {
            i14 = hp.s1(i3).f23072n3;
        } else {
            i14 = i13;
        }
        if (i14 != 1 && i14 != 3) {
            String str = hp.s1(i3).f23125t3;
            if (!TextUtils.isEmpty(str)) {
                if (z10) {
                    return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d10), Double.valueOf(d11), str);
                }
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), str);
            } else if (z10) {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min), Double.valueOf(d10), Double.valueOf(d11));
            } else {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(min));
            }
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        yc ycVar = bd.E0().B;
        String str2 = null;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = i15;
            if (strArr[i16].toLowerCase().contains(ycVar.f26563c)) {
                str2 = strArr[i16];
            }
            i16++;
            i15 = i17;
        }
        int i18 = i15;
        if (str2 == null) {
            str2 = "en_US";
        }
        if (z10) {
            Locale locale = Locale.US;
            Double valueOf = Double.valueOf(d11);
            Double valueOf2 = Double.valueOf(d10);
            Integer valueOf3 = Integer.valueOf(i12);
            Integer valueOf4 = Integer.valueOf(i10 * min);
            Integer valueOf5 = Integer.valueOf(i11 * min);
            Integer valueOf6 = Integer.valueOf(min);
            Double valueOf7 = Double.valueOf(d11);
            Double valueOf8 = Double.valueOf(d10);
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
        Double valueOf9 = Double.valueOf(d11);
        Double valueOf10 = Double.valueOf(d10);
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

    public static Bitmap e1(float f10, float f11, String str, String str2, int i3) {
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
                        fileInputStream.getChannel().position(i3);
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
                fileInputStream.getChannel().position(i3);
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

    public static double[] e3(int i3, int i10, int i11) {
        double max;
        double min;
        double d10;
        double d11;
        double d12;
        double d13;
        int i12;
        double d14 = i3 / 255.0d;
        double d15 = i10 / 255.0d;
        double d16 = i11 / 255.0d;
        int i13 = (d14 > d15 ? 1 : (d14 == d15 ? 0 : -1));
        if (i13 > 0 && d14 > d16) {
            max = d14;
        } else {
            max = Math.max(d15, d16);
        }
        if (d14 < d15 && d14 < d16) {
            min = d14;
        } else {
            min = Math.min(d15, d16);
        }
        double d17 = max - min;
        double d18 = 0.0d;
        if (max == 0.0d) {
            d10 = 0.0d;
        } else {
            d10 = d17 / max;
        }
        if (max != min) {
            if (i13 > 0 && d14 > d16) {
                d11 = (d15 - d16) / d17;
                if (d15 < d16) {
                    i12 = 6;
                } else {
                    i12 = 0;
                }
                d12 = i12;
            } else if (d15 > d16) {
                d13 = 2.0d + ((d16 - d14) / d17);
                d18 = d13 / 6.0d;
            } else {
                d11 = (d14 - d15) / d17;
                d12 = 4.0d;
            }
            d13 = d11 + d12;
            d18 = d13 / 6.0d;
        }
        return new double[]{d18, d10, max};
    }

    public static void f(CharSequence charSequence, String str) {
        if (str == null) {
            g(charSequence);
            return;
        }
        try {
            ((ClipboardManager) t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static String f0(int i3) {
        if (i3 < 1000) {
            return Integer.toString(i3);
        }
        ArrayList arrayList = new ArrayList();
        while (i3 != 0) {
            int i10 = i3 % 1000;
            i3 /= 1000;
            if (i3 > 0) {
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
        float f10 = f22607p;
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
        if (activity != null && f22589f == -10 && !R1()) {
            try {
                if (f22591g != -10 && (weakReference = f22594i) != null && weakReference.get() == activity) {
                    requestedOrientation = f22591g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f22589f = requestedOrientation;
                f22591g = -10;
                h = -10;
                f22594i = null;
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (windowManager != null && windowManager.getDefaultDisplay() != null) {
                    int rotation = windowManager.getDefaultDisplay().getRotation();
                    int i3 = activity.getResources().getConfiguration().orientation;
                    if (rotation == 3) {
                        if (i3 == 1) {
                            activity.setRequestedOrientation(1);
                        } else {
                            activity.setRequestedOrientation(8);
                        }
                    } else if (rotation == 1) {
                        if (i3 == 1) {
                            activity.setRequestedOrientation(9);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    } else if (rotation == 0) {
                        if (i3 == 2) {
                            activity.setRequestedOrientation(0);
                        } else {
                            activity.setRequestedOrientation(1);
                        }
                    } else if (i3 == 2) {
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
                int i3 = 0;
                for (int i10 = 0; i10 < fArr.length; i10++) {
                    int floor = (int) Math.floor((fArr[i10] / f10) * 100.0f);
                    iArr[i10] = floor;
                    i3 += floor;
                }
                while (i3 < 100) {
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
                        i3++;
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
            ClipboardManager clipboardManager = (ClipboardManager) t0.f25457b.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, cg.q.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public static String g0(int i3, boolean z10, boolean z11) {
        int i10 = i3 / 3600;
        int i11 = (i3 / 60) % 60;
        int i12 = i3 % 60;
        if (i10 == 0) {
            if (z10) {
                return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            return String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
        } else if (z11) {
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
                if (f22591g != -10 && (weakReference = f22594i) != null && weakReference.get() == activity) {
                    requestedOrientation = f22591g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f22589f = requestedOrientation;
                f22591g = -10;
                h = -10;
                f22594i = null;
                activity.setRequestedOrientation(1);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static int g3(boolean z10, boolean z11) {
        if (z10) {
            return f22613w;
        }
        int i3 = v;
        if (z11) {
            return i3 - L(42.0f);
        }
        return i3;
    }

    public static void h(ColorMatrix colorMatrix, float f10) {
        float f11 = f10 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f11, 0.0f, 1.0f, 0.0f, 0.0f, f11, 0.0f, 0.0f, 1.0f, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String h0(int i3, boolean z10) {
        int i10 = i3 / 60;
        int i11 = i3 % 60;
        if (z10) {
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

    public static String i0(long j10, boolean z10, boolean z11) {
        if (j10 == 0) {
            return String.format("%d KB", 0);
        }
        if (j10 < 1024) {
            return String.format("%d B", Long.valueOf(j10));
        }
        if (j10 < 1048576) {
            float f10 = ((float) j10) / 1024.0f;
            if (z10) {
                int i3 = (int) f10;
                if ((f10 - i3) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i3));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f10));
        } else if (j10 < 1048576000) {
            float f11 = (((float) j10) / 1024.0f) / 1024.0f;
            if (z10) {
                int i10 = (int) f11;
                if ((f11 - i10) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f11));
        } else {
            float f12 = ((int) ((j10 / 1024) / 1024)) / 1000.0f;
            if (z10) {
                int i11 = (int) f12;
                if ((f12 - i11) * 10.0f == 0.0f) {
                    return String.format("%d GB", Integer.valueOf(i11));
                }
            }
            if (z11) {
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
            AccessibilityManager accessibilityManager = (AccessibilityManager) t0.f25457b.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public static void i3(Runnable runnable, long j10) {
        if (t0.d == null) {
            return;
        }
        if (j10 == 0) {
            t0.d.post(runnable);
        } else {
            t0.d.postDelayed(runnable, j10);
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
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add((View) method2.invoke(invoke, strArr[i3]));
            }
            return arrayList;
        } catch (Exception e10) {
            a8.e("allGlobalViews()", e10);
            return null;
        }
    }

    public static String j0(int i3) {
        int i10 = i3 / 3600;
        int i11 = (i3 / 60) % 60;
        int i12 = i3 % 60;
        if (i3 < 0) {
            return String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i10)), Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12)));
        }
        return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static java.lang.String j1(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.j1(java.lang.String):java.lang.String");
    }

    public static Bitmap j2(float f10, int i3, View view) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f10);
        int height = (int) (view.getHeight() / f10);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i3, Math.max(width, height) / 180));
        return createBitmap;
    }

    public static void j3(RectF rectF, float f10, float f11, float f12) {
        rectF.set(f11 - ((f11 - rectF.left) * f10), f12 - ((f12 - rectF.top) * f10), ((rectF.right - f11) * f10) + f11, ((rectF.bottom - f12) * f10) + f12);
    }

    public static int k(int i3, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i3);
        int red = Color.red(i3);
        int green = Color.green(i3);
        float f10 = red;
        float f11 = green;
        float blue = Color.blue(i3);
        float f12 = alpha;
        float f13 = (array[3] * f12) + (array[2] * blue) + (array[1] * f11) + (array[0] * f10) + array[4];
        float f14 = (array[8] * f12) + (array[7] * blue) + (array[6] * f11) + (array[5] * f10) + array[9];
        float f15 = (array[13] * f12) + (array[12] * blue) + (array[11] * f11) + (array[10] * f10) + array[14];
        float f16 = array[15] * f10;
        return Color.argb(b8.be.b(Math.round((array[18] * f12) + (array[17] * blue) + (array[16] * f11) + f16 + array[19]), 0, 255), b8.be.b(Math.round(f13), 0, 255), b8.be.b(Math.round(f14), 0, 255), b8.be.b(Math.round(f15), 0, 255));
    }

    public static String k0(int i3, int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        int i14 = i3 / 3600;
        int i15 = (i3 / 60) % 60;
        int i16 = i3 % 60;
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
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) q4Var.getFragmentStack().get(q4Var.getFragmentStack().size() - 1);
            try {
                Field declaredField = d2Var.getClass().getDeclaredField("listView");
                declaredField.setAccessible(true);
                tj0 tj0Var = (tj0) declaredField.get(d2Var);
                tj0Var.e1(new i(d2Var, str, tj0Var), 700, true);
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

    public static SpannableStringBuilder l0(CharSequence charSequence, e9 e9Var, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i3 = 0; i3 < charSequenceArr.length; i3++) {
            String str = (String) e9Var.k(Integer.valueOf(i3));
            int indexOf = charSequence2.indexOf(str);
            if (indexOf != -1) {
                valueOf.replace(indexOf, str.length() + indexOf, charSequenceArr[i3]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i3].toString() + charSequence2.substring(str.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static int l1(int i3, int i10, int i11) {
        return Math.max(L(320.0f), (((i3 - i10) - i11) * 35) / 100) + i10;
    }

    public static void l2(u10 u10Var, float f10) {
        m2(u10Var, f10, (int) f10, null);
    }

    public static void l3(Activity activity, int i3) {
        if (activity != null && !Q1()) {
            int i10 = N;
            if (i10 == 0 || i10 == i3) {
                activity.getWindow().setSoftInputMode(48);
            }
        }
    }

    public static void m(WindowManager.LayoutParams layoutParams) {
        int i3;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if (i10 >= 30) {
                i3 = 3;
            } else {
                i3 = 1;
            }
            o4.v0.j(layoutParams, i3);
        }
    }

    public static SpannableStringBuilder m0(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (charSequence.toString().contains("%s")) {
            return l0(charSequence, new o4.v0(7), charSequenceArr);
        }
        return l0(charSequence, new o4.v0(9), charSequenceArr);
    }

    public static int m1(String str, boolean z10) {
        int i3;
        String substring;
        int[] iArr = f22583b0;
        int[] iArr2 = f22581a0;
        if (str != null && str.length() != 0) {
            if (!str.contains(".doc") && !str.contains(".txt") && !str.contains(".psd")) {
                if (!str.contains(".xls") && !str.contains(".csv")) {
                    if (!str.contains(".pdf") && !str.contains(".ppt") && !str.contains(".key")) {
                        if (!str.contains(".zip") && !str.contains(".rar") && !str.contains(".ai") && !str.contains(".mp3") && !str.contains(".mov") && !str.contains(".avi")) {
                            i3 = -1;
                        } else {
                            i3 = 3;
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 0;
            }
            if (i3 == -1) {
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    substring = "";
                } else {
                    substring = str.substring(lastIndexOf + 1);
                }
                if (substring.length() != 0) {
                    i3 = substring.charAt(0) % iArr2.length;
                } else {
                    i3 = str.charAt(0) % iArr2.length;
                }
            }
            if (z10) {
                return iArr[i3];
            }
            return iArr2[i3];
        } else if (z10) {
            return iArr[0];
        } else {
            return iArr2[0];
        }
    }

    public static void m2(u10 u10Var, float f10, int i3, ArrayList arrayList) {
        List j10 = j();
        if (j10 == null) {
            u10Var.a(null);
            return;
        }
        m0 = true;
        try {
            try {
                Point point = f22608q;
                int i10 = (int) (point.x / f10);
                int i11 = (int) (((point.y + f22602m) + f22603n) / f10);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f11 = 1.0f / f10;
                canvas.scale(f11, f11);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
                for (int i12 = 0; i12 < j10.size(); i12++) {
                    View view = (View) j10.get(i12);
                    if (!(view instanceof yd0) && (arrayList == null || !arrayList.contains(view))) {
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
                Utilities.stackBlurBitmap(createBitmap, Math.max(i3, Math.max(i10, i11) / 180));
                u10Var.a(createBitmap);
            } catch (Exception e11) {
                a8.g(e11, true);
                u10Var.a(null);
            }
            m0 = false;
        } catch (Throwable th2) {
            m0 = false;
            throw th2;
        }
    }

    public static void m3(Activity activity, boolean z10) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            o3(window.getDecorView(), z10);
        }
    }

    public static void n(Animator animator, double d10, double d11) {
        double d12;
        double d13;
        double sqrt = Math.sqrt(d10 / 1.0d);
        double sqrt2 = d11 / (Math.sqrt(d10 * 1.0d) * 2.0d);
        if (sqrt2 < 1.0d) {
            d13 = Math.sqrt(1.0d - (sqrt2 * sqrt2)) * sqrt;
            d12 = ((sqrt2 * sqrt) + (-0.0d)) / d13;
        } else {
            d12 = (-0.0d) + sqrt;
            d13 = 0.0d;
        }
        double d14 = d13;
        double d15 = d12;
        animator.setDuration((long) ((Math.log(0.0025d) / ((-sqrt2) * sqrt)) * 1000.0d));
        animator.setInterpolator(new x(sqrt2, sqrt, d14, d15));
    }

    public static String n0(int i3) {
        String str;
        String str2;
        String str3;
        int i10 = i3 / 3600;
        int i11 = (i3 / 60) % 60;
        int i12 = i3 % 60;
        if (i10 > 0) {
            Locale locale = Locale.US;
            str = com.google.android.recaptcha.internal.a.h(i10, "h");
        } else {
            str = "";
        }
        if (i11 > 0) {
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
            Locale locale2 = Locale.US;
            if (i10 > 0) {
                str3 = "%02dm";
            } else {
                str3 = "%dm";
            }
            l10.append(String.format(locale2, str3, Integer.valueOf(i11)));
            str = l10.toString();
        }
        StringBuilder l11 = com.google.android.recaptcha.internal.a.l(str);
        Locale locale3 = Locale.US;
        if (i10 <= 0 && i11 <= 0) {
            str2 = "%ds";
        } else {
            str2 = "%02ds";
        }
        l11.append(String.format(locale3, str2, Integer.valueOf(i12)));
        return l11.toString();
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

    public static void n3(Dialog dialog, boolean z10) {
        Window window;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            o3(window.getDecorView(), z10);
        }
    }

    public static Typeface o() {
        if (f22580a == null) {
            if (az.V0 && Build.VERSION.SDK_INT >= 28) {
                f22580a = Typeface.create(null, 500, false);
            } else {
                f22580a = o1("fonts/rmedium.ttf");
            }
        }
        return f22580a;
    }

    public static String o0(int i3, int i10) {
        String[] strArr;
        if (i3 != 0) {
            float f10 = i3;
            if (i10 == 0) {
                i10 = i3;
            }
            if (i10 < 1000) {
                return f0(i3);
            }
            int i11 = 0;
            while (true) {
                strArr = f22592g0;
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
                return t4.c.q(f0((int) f10), strArr[i11]);
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
                            Typeface.Builder builder = new Typeface.Builder(t0.f25457b.getAssets(), str);
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
                            createFromAsset = Typeface.createFromAsset(t0.f25457b.getAssets(), str);
                        }
                        hashtable.put(str, createFromAsset);
                    } catch (Exception e10) {
                        if (r2.f25040a) {
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

    public static void o3(View view, boolean z10) {
        int systemUiVisibility;
        int b10;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b10 = x7.u.b((systemUiVisibility = view.getSystemUiVisibility()), 16, z10))) {
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

    public static String p0(int i3, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.f21385b.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i3 == 0) {
            StringBuilder u10 = a1.g.u("IMG_", format, ".");
            if (TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            u10.append(str);
            return u10.toString();
        }
        return a1.g.q("VID_", format, ".mp4");
    }

    public static Vibrator p1() {
        if (J == null) {
            J = (Vibrator) t0.f25457b.getSystemService("vibrator");
        }
        return J;
    }

    public static boolean p2(boolean z10) {
        r0 r0Var = r0.f25016f;
        if (z10) {
            r0Var.getClass();
            if (SystemClock.elapsedRealtime() - r0Var.f25019c < 200) {
                r0Var.f25018b = false;
            }
        }
        boolean z11 = r0Var.f25018b;
        if (z10) {
            r0.f25016f.f25018b = false;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (r2.f25040a && z10 && az.f21661s.length() > 0) {
            a8.b("wasInBackground = " + z11 + " appLocked = " + az.f21675x + " autoLockIn = " + az.f21678y + " lastPauseTime = " + az.B + " uptime = " + elapsedRealtime);
        }
        if (az.f21661s.length() > 0 && z11) {
            if (!az.f21675x) {
                if ((az.f21678y != 0 && az.B != 0 && !az.f21675x && az.B + az.f21678y <= elapsedRealtime) || elapsedRealtime + 5 < az.B) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void p3(Activity activity, boolean z10) {
        if (activity != null) {
            s3(activity.getWindow(), z10);
        }
    }

    public static int[] q(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.zm) {
            return q(((org.telegram.ui.zm) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i3 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i3 = p(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i3 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.j9) {
                int[] iArr2 = ((org.telegram.ui.Components.j9) drawable).f34998a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i3 = w0(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i3 = iArr2[0];
                    }
                }
            } else if (drawable instanceof la0) {
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
        double[] e32 = e3((i3 >> 16) & 255, (i3 >> 8) & 255, i3 & 255);
        double d10 = e32[1];
        e32[1] = Math.min(1.0d, ((1.0d - d10) * 0.1d) + 0.05d + d10);
        int[] y12 = y1(e32[0], e32[1], Math.max(0.0d, e32[2] * 0.65d));
        iArr[0] = Color.argb(102, y12[0], y12[1], y12[2]);
        iArr[1] = Color.argb(136, y12[0], y12[1], y12[2]);
        int[] y13 = y1(e32[0], e32[1], Math.max(0.0d, e32[2] * 0.72d));
        iArr[2] = Color.argb(102, y13[0], y13[1], y13[2]);
        iArr[3] = Color.argb(136, y13[0], y13[1], y13[2]);
        return iArr;
    }

    public static File q0(String str, boolean z10) {
        try {
            File z11 = w7.z(100);
            if (!z10 && z11 != null) {
                return new File(z11, p0(0, str));
            }
            return new File(t0.f25457b.getExternalFilesDir(Environment.DIRECTORY_PICTURES), p0(0, str));
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int q1(View view) {
        if (view != null) {
            int height = view.getHeight();
            Point point = f22608q;
            if (height != point.y && view.getHeight() != point.y - f22602m) {
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

    public static void q2(long j10, StringBuilder sb2) {
        if (j10 < 10) {
            sb2.append("0");
            sb2.append(j10);
            return;
        }
        sb2.append(j10);
    }

    public static void q3(Dialog dialog, boolean z10) {
        if (dialog != null) {
            s3(dialog.getWindow(), z10);
        }
    }

    public static void r(Runnable runnable) {
        if (t0.d == null) {
            return;
        }
        t0.d.removeCallbacks(runnable);
    }

    public static CharSequence r0(String str, String str2, String str3) {
        int i3;
        if ((str == null && str2 == null) || TextUtils.isEmpty(str3)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                str = a1.g.C(str, " ", str2);
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
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i12 = indexOf - i3;
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
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28121q6, null), length2, trim2.length() + length2, 33);
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
                if (!(view.getParent() instanceof b5.l)) {
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

    public static void r3(View view, boolean z10) {
        int systemUiVisibility;
        int b10;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b10 = x7.u.b((systemUiVisibility = view.getSystemUiVisibility()), 8192, z10))) {
            view.setSystemUiVisibility(b10);
        }
    }

    public static float s(float f10, float f11, float f12, float f13) {
        if (f12 <= 0.0f) {
            return f10;
        }
        float min = Math.min(f13, f12) * (1.0f / f12);
        return b8.be.a((f10 - ((1.0f - min) * (f11 / f12))) / min, 0.0f, 1.0f);
    }

    public static File s0(boolean z10) {
        try {
            File v02 = v0(z10);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.f21385b.nextInt(1000) + 1);
            if (f22590f0 == null) {
                f22590f0 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            String format = f22590f0.format(date);
            return new File(v02, "VID_" + format + ".mp4");
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static int s1(int i3, boolean z10) {
        int i10;
        if (z10) {
            i10 = i3 + 180;
        } else {
            i10 = i3 - 180;
        }
        while (i10 >= 360) {
            i10 -= 360;
        }
        while (i10 < 0) {
            i10 += 360;
        }
        return i10;
    }

    public static void s2(zi ziVar, Activity activity, org.telegram.ui.ActionBar.d2 d2Var) {
        TLRPC.Document F0;
        String str;
        File file;
        char c2;
        String str2;
        String str3;
        String str4;
        if (ziVar != null && (F0 = ziVar.F0()) != null) {
            if (ziVar.f26868k.media != null) {
                str = w7.r(null, F0);
            } else {
                str = "";
            }
            String str5 = ziVar.f26868k.attachPath;
            if (str5 != null && str5.length() != 0) {
                file = new File(ziVar.f26868k.attachPath);
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                w7.G(h10.f22829t0);
                file = w7.N(ziVar.f26868k, false, true);
            }
            if (file != null && file.exists()) {
                if (d2Var != null && file.getName().toLowerCase().endsWith("attheme")) {
                    org.telegram.ui.ActionBar.j6 v10 = org.telegram.ui.ActionBar.k6.v(file, ziVar.I0(), null, true);
                    if (v10 != null) {
                        d2Var.presentFragment(new l71(v10));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    HashMap hashMap = new HashMap();
                    int i3 = org.telegram.ui.ActionBar.k6.L5;
                    hashMap.put("info1", Integer.valueOf(d2Var.getThemedColor(i3)));
                    hashMap.put("info2", Integer.valueOf(d2Var.getThemedColor(i3)));
                    alertDialog$Builder.m(2131624107, 52, d2Var.getThemedColor(i3), hashMap);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.X = true;
                    s1Var.U = bd.M0(2131749208, null);
                    alertDialog$Builder.k(bd.M0(2131747839, null), null);
                    d2Var.showDialog(s1Var);
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
                            t0.d();
                            Uri d10 = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                            if (str2 == null) {
                                str4 = "text/plain";
                            } else {
                                str4 = str2;
                            }
                            intent.setDataAndType(d10, str4);
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
                            hashMap2.put("info1", Integer.valueOf(d2Var.getThemedColor(i10)));
                            hashMap2.put("info2", Integer.valueOf(d2Var.getThemedColor(i10)));
                            alertDialog$Builder2.m(2131624107, 52, d2Var.getThemedColor(i10), hashMap2);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                            s1Var2.X = true;
                            alertDialog$Builder2.k(bd.M0(2131747839, null), null);
                            Object[] objArr = new Object[1];
                            objArr[c2] = ziVar.F0().mime_type;
                            s1Var2.U = bd.a0("NoHandleAppInstalled", null, 2131748213, objArr);
                            d2Var.showDialog(s1Var2);
                        }
                    }
                } catch (Exception unused3) {
                    c2 = 0;
                }
            }
        }
    }

    public static void s3(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int b10 = x7.u.b(systemUiVisibility, 8192, z10);
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
        if (h10.i(h10.f22829t0).p() && !ConnectionsManager.getInstance(h10.f22829t0).isTestBackend()) {
            return h10.f22829t0;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            if (h10.i(i3).p() && !ConnectionsManager.getInstance(i3).isTestBackend()) {
                return i3;
            }
        }
        return h10.f22829t0;
    }

    public static boolean t1(LaunchActivity launchActivity, Intent intent) {
        Uri data;
        ui.a d10;
        if (intent != null) {
            try {
                if ((intent.getFlags() & 1048576) == 0 && (data = intent.getData()) != null && (d10 = ui.a.d(data)) != null && d10.g()) {
                    L3(launchActivity, d10);
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean t2(java.io.File r6, java.lang.String r7, java.lang.String r8, android.app.Activity r9, org.telegram.ui.ActionBar.e6 r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.g0.t2(java.io.File, java.lang.String, java.lang.String, android.app.Activity, org.telegram.ui.ActionBar.e6, boolean):boolean");
    }

    public static void t3(Activity activity, int i3, boolean z10) {
        if (activity != null) {
            v3(activity.getWindow(), i3, z10, null);
        }
    }

    public static void u(Context context, boolean z10) {
        int i3;
        if (context == null) {
            return;
        }
        if (org.telegram.ui.ActionBar.k6.I.q() && z10) {
            i3 = 2131755328;
        } else {
            i3 = 2131755318;
        }
        context.setTheme(i3);
    }

    public static Activity u0() {
        Activity W2 = W(null);
        if (W2 == null || W2.isFinishing()) {
            W2 = LaunchActivity.K1;
        }
        if (W2 != null && !W2.isFinishing()) {
            return W2;
        }
        return W(t0.f25457b);
    }

    public static boolean u1(org.telegram.ui.ActionBar.d2 d2Var) {
        List j10;
        if (d2Var != null) {
            Dialog dialog = d2Var.visibleDialog;
            if (dialog == null || (dialog instanceof org.telegram.ui.ActionBar.s1) || ((dialog instanceof org.telegram.ui.ActionBar.t2) && ((org.telegram.ui.ActionBar.t2) dialog).f28601g1 != null)) {
                if (d2Var.getParentLayout() != null && (j10 = j()) != null && !j10.isEmpty()) {
                    View view = null;
                    for (int size = j10.size() - 1; size >= 0; size--) {
                        view = (View) j10.get(size);
                        Dialog dialog2 = d2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.s1) {
                            View view2 = ((org.telegram.ui.ActionBar.s1) dialog2).f28533d1;
                            while (view2 != null && (view2.getParent() instanceof View)) {
                                view2 = (View) view2.getParent();
                            }
                            if (view == view2) {
                                continue;
                            }
                        }
                        if (!(view instanceof org.telegram.ui.ActionBar.o1) && !(view instanceof yd0)) {
                            break;
                        }
                    }
                    View view3 = d2Var.getParentLayout().getView();
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

    public static boolean u2(zi ziVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        File file;
        String str = ziVar.f26868k.attachPath;
        String str2 = null;
        if (str != null && str.length() != 0) {
            file = new File(ziVar.f26868k.attachPath);
        } else {
            file = null;
        }
        if (file == null || !file.exists()) {
            w7.G(ziVar.I1);
            file = w7.N(ziVar.f26868k, false, true);
        }
        File file2 = file;
        int i3 = ziVar.D;
        if (i3 == 9 || i3 == 0) {
            str2 = ziVar.u1();
        }
        return t2(file2, ziVar.S0(), str2, activity, e6Var, z10);
    }

    public static void u3(Dialog dialog, int i3, boolean z10, org.telegram.ui.Components.kg kgVar) {
        if (dialog != null) {
            v3(dialog.getWindow(), i3, z10, kgVar);
        }
    }

    public static void v(Context context, Configuration configuration) {
        float f10;
        boolean z10;
        int i3;
        int i10;
        Display defaultDisplay;
        try {
            float f11 = f22607p;
            f22607p = context.getResources().getDisplayMetrics().density;
            if (f22605o && Math.abs(f11 - f10) > 0.001d) {
                if (org.telegram.ui.ActionBar.k6.f28040m3 != null) {
                    org.telegram.ui.ActionBar.k6.f28040m3 = null;
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
            f22605o = true;
            if (configuration == null) {
                configuration = context.getResources().getConfiguration();
            }
            if (configuration.keyboard != 1 && configuration.hardKeyboardHidden == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            D = z10;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = B;
            Point point = f22608q;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(point);
                float refreshRate = defaultDisplay.getRefreshRate();
                f22609r = refreshRate;
                f22610s = refreshRate;
                float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
                if (supportedRefreshRates != null) {
                    for (float f12 : supportedRefreshRates) {
                        if (f12 > f22610s) {
                            f22610s = f12;
                        }
                    }
                }
                f22611t = 1000.0f / f22609r;
            }
            if (configuration.screenWidthDp != 0) {
                int ceil = (int) Math.ceil(i3 * f22607p);
                if (Math.abs(point.x - ceil) > 3) {
                    point.x = ceil;
                }
            }
            if (configuration.screenHeightDp != 0) {
                int ceil2 = (int) Math.ceil(i10 * f22607p);
                if (Math.abs(point.y - ceil2) > 3) {
                    point.y = ceil2;
                }
            }
            if (f22612u == 0) {
                if (Q1()) {
                    f22612u = (int) (Q0() * 0.6f);
                    v = Q0() - L(28.0f);
                    f22613w = Q0() - L(92.0f);
                } else {
                    f22612u = (int) (Math.min(point.x, point.y) * 0.6f);
                    v = Math.min(point.x, point.y) - L(28.0f);
                    f22613w = Math.min(point.x - L(64.0f), point.y) - L(28.0f);
                }
                f22614x = L(2.0f);
            }
            if (r2.f25040a) {
                a8.d("density = " + f22607p + " display size = " + point.x + " " + point.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + f22602m + ", navbar height: " + f22603n);
            }
            f22587e = ViewConfiguration.get(context).getScaledTouchSlop();
            M = null;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static File v0(boolean z10) {
        int i3;
        if (!z10 && r2.f25041b && (((i3 = Build.VERSION.SDK_INT) < 33 || t0.f25457b.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) && (i3 > 33 || t0.f25457b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0))) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                if (!file.mkdirs() && !file.exists()) {
                    if (r2.f25040a) {
                        a8.b("failed to create directory");
                        return null;
                    }
                } else {
                    return file;
                }
            } else if (r2.f25040a) {
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

    public static void v3(Window window, int i3, boolean z10, org.telegram.ui.Components.kg kgVar) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap hashMap = f22601l0;
        if (hashMap != null && (valueAnimator = (ValueAnimator) hashMap.get(window)) != null) {
            valueAnimator.cancel();
            f22601l0.remove(window);
        }
        if (!z10) {
            if (kgVar != null) {
                org.telegram.ui.Components.bi biVar = kgVar.f35396b;
                biVar.G0 = -1;
                biVar.H0 = i3;
                biVar.f28586b.invalidate();
            }
            try {
                window.setNavigationBarColor(i3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i3);
        ofArgb.addUpdateListener(new q(0, kgVar, window));
        ofArgb.addListener(new ii.v3(window, 5));
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        ofArgb.start();
        if (f22601l0 == null) {
            f22601l0 = new HashMap();
        }
        f22601l0.put(window, ofArgb);
    }

    public static boolean w(String str) {
        boolean z10;
        boolean z11;
        if (str == null) {
            return false;
        }
        try {
            int length = str.length();
            z10 = false;
            z11 = false;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    char charAt = str.charAt(i3);
                    if (charAt != '.' && charAt != '-' && charAt != '/' && charAt != '+' && (charAt < '0' || charAt > '9')) {
                        if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                            z10 = true;
                        } else {
                            z11 = true;
                        }
                        if (z10 && z11) {
                            break;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    a8.g(e, true);
                    return !z10 ? false : false;
                }
            }
        } catch (Exception e11) {
            e = e11;
            z10 = false;
            z11 = false;
        }
        if (!z10 && z11) {
            return true;
        }
    }

    public static int w0(int i3, int i10) {
        int red = Color.red(i3);
        int red2 = Color.red(i10);
        int green = Color.green(i3);
        int green2 = Color.green(i10);
        int blue = Color.blue(i3);
        return Color.argb(255, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i10) / 2) + (blue / 2));
    }

    public static SpannableStringBuilder w1(CharSequence charSequence, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(charSequence)) {
            String lowerCase = charSequence.toString().toLowerCase();
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            int indexOf = lowerCase.indexOf(str);
            while (indexOf >= 0) {
                try {
                    valueOf.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28121q6, e6Var), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                indexOf = lowerCase.indexOf(str, indexOf + 1);
            }
            return valueOf;
        }
        return null;
    }

    public static long w2(int i3, int i10) {
        return (i10 & 4294967295L) | (i3 << 32);
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
            String d10 = mf.b.d(str2, false);
            int i3 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = d10.indexOf(str3, i3);
                    if (indexOf == -1) {
                        return false;
                    }
                    i3 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static Bitmap x0() {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
            inputStream = t0.f25457b.getResources().openRawResource(2131624179);
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

    public static CharSequence x1(CharSequence charSequence, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        if (arrayList != null) {
            int i3 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                SpannableStringBuilder w12 = w1(charSequence, (String) arrayList.get(i10), e6Var);
                if (w12 != null) {
                    charSequence = w12;
                } else {
                    i3++;
                }
            }
            if (i3 != arrayList.size()) {
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
        float f10 = f22610s;
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
        PixelCopy.request(surface, bitmap, new p(countDownLatch, 0), Utilities.f21389g.b());
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    public static int[] y1(double d10, double d11, double d12) {
        double d13;
        double d14 = d10 * 6.0d;
        double floor = (int) Math.floor(d14);
        double d15 = d14 - floor;
        double d16 = (1.0d - d11) * d12;
        double d17 = (1.0d - (d15 * d11)) * d12;
        double d18 = (1.0d - ((1.0d - d15) * d11)) * d12;
        int i3 = ((int) floor) % 6;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                d12 = 0.0d;
                                d18 = 0.0d;
                                d16 = 0.0d;
                            } else {
                                d18 = d17;
                            }
                        } else {
                            d13 = d18;
                            d18 = d12;
                        }
                    } else {
                        d18 = d12;
                        d12 = d16;
                        d16 = d17;
                    }
                } else {
                    d13 = d16;
                    d16 = d12;
                }
                d12 = d13;
            } else {
                d18 = d16;
                d16 = d12;
                d12 = d17;
            }
        } else {
            d16 = d18;
            d18 = d16;
        }
        return new int[]{(int) (d12 * 255.0d), (int) (d16 * 255.0d), (int) (d18 * 255.0d)};
    }

    public static String y2(File file, int i3) {
        InputStream inputStream;
        ThreadLocal threadLocal = f22582b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStream = new FileInputStream(file);
            } else {
                inputStream = t0.f25457b.getResources().openRawResource(i3);
            }
            try {
                ThreadLocal threadLocal2 = f22584c;
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
                            f22582b.set(bArr3);
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
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - f22610s) > 0.2d) {
            layoutParams.preferredRefreshRate = f22610s;
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
            PixelCopy.request(surfaceView, bitmap, new p(countDownLatch, 1), Utilities.f21389g.b());
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

    public static void z3(ScrollView scrollView, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            scrollView.setTopEdgeEffectColor(i3);
            scrollView.setBottomEdgeEffectColor(i3);
            return;
        }
        try {
            Field declaredField = ScrollView.class.getDeclaredField("mEdgeGlowTop");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(scrollView);
            if (edgeEffect != null) {
                edgeEffect.setColor(i3);
            }
            Field declaredField2 = ScrollView.class.getDeclaredField("mEdgeGlowBottom");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(scrollView);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i3);
            }
        } catch (Exception unused) {
        }
    }
}
