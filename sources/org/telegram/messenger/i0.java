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
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y41;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hr0;
import org.telegram.ui.k91;
public abstract class i0 {
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
    public static Typeface f16145a;
    public static final int[] f16146a0;
    public static final int[] f16148b0;
    public static final f f16150c0;
    public static CallReceiver f16151d0;
    public static float e;
    public static Pattern f16152e0;
    public static SimpleDateFormat f16154f0;
    public static final String[] f16156g0;
    public static final float[] f16157h0;
    public static WeakReference f16158i;
    public static final float[] f16159i0;
    public static final char[] f16161j0;
    public static HashSet f16163k0;
    public static HashMap f16165l0;
    public static boolean m0;
    public static Pattern f16168n0;
    public static boolean f16169o;
    public static final Paint f16170o0;
    public static int f16176u;
    public static int v;
    public static int f16177w;
    public static int f16178x;
    public static boolean f16179y;
    public static final ThreadLocal f16147b = new ThreadLocal();
    public static final ThreadLocal f16149c = new ThreadLocal();
    public static final Hashtable d = new Hashtable();
    public static int f16153f = -10;
    public static int f16155g = -10;
    public static int h = -10;
    public static boolean f16160j = false;
    public static final Object f16162k = new Object();
    public static final Object f16164l = new Object();
    public static int f16166m = 0;
    public static int f16167n = 0;
    public static float f16171p = 1.0f;
    public static final Point f16172q = new Point();
    public static float f16173r = 60.0f;
    public static float f16174s = 60.0f;
    public static float f16175t = 16.666666f;
    public static Integer f16180z = null;
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
        int i10;
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
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        if (Q1()) {
            i10 = 80;
        } else {
            i10 = 72;
        }
        C = i10;
        v(w0.f18945b, null);
        f16146a0 = new int[]{2131231729, 2131231731, 2131231733, 2131231735};
        f16148b0 = new int[]{2131231730, 2131231732, 2131231734, 2131231736};
        f16150c0 = new Object();
        f16156g0 = new String[]{"", "K", "M", "B", "T", "P"};
        f16157h0 = new float[9];
        f16159i0 = new float[9];
        f16161j0 = new char[]{160, ' ', '!', '\"', '#', '%', '&', '\'', '(', ')', '*', ',', '-', '.', '/', ':', ';', '?', '@', '[', '\\', ']', '_', '{', '}', 161, 167, 171, 182, 183, 187, 191, 894, 903, 1370, 1371, 1372, 1373, 1374, 1375, 1417, 1418, 1470, 1472, 1475, 1478, 1523, 1524, 1545, 1546, 1548, 1549, 1563, 1566, 1567, 1642, 1643, 1644, 1645, 1748, 1792, 1793, 1794, 1795, 1796, 1797, 1798, 1799, 1800, 1801, 1802, 1803, 1804, 1805, 2039, 2040, 2041, 2096, 2097, 2098, 2099, 2100, 2101, 2102, 2103, 2104, 2105, 2106, 2107, 2108, 2109, 2110, 2142, 2404, 2405, 2416, 2557, 2678, 2800, 3191, 3204, 3572, 3663, 3674, 3675, 3844, 3845, 3846, 3847, 3848, 3849, 3850, 3851, 3852, 3853, 3854, 3855, 3856, 3857, 3858, 3860, 3898, 3899, 3900, 3901, 3973, 4048, 4049, 4050, 4051, 4052, 4057, 4058, 4170, 4171, 4172, 4173, 4174, 4175, 4347, 4960, 4961, 4962, 4963, 4964, 4965, 4966, 4967, 4968, 5120, 5742, 5787, 5788, 5867, 5868, 5869, 5941, 5942, 6100, 6101, 6102, 6104, 6105, 6106, 6144, 6145, 6146, 6147, 6148, 6149, 6150, 6151, 6152, 6153, 6154, 6468, 6469, 6686, 6687, 6816, 6817, 6818, 6819, 6820, 6821, 6822, 6824, 6825, 6826, 6827, 6828, 6829, 7002, 7003, 7004, 7005, 7006, 7007, 7008, 7164, 7165, 7166, 7167, 7227, 7228, 7229, 7230, 7231, 7294, 7295, 7360, 7361, 7362, 7363, 7364, 7365, 7366, 7367, 7379, 8208, 8209, 8210, 8211, 8212, 8213, 8214, 8215, 8216, 8217, 8218, 8219, 8220, 8221, 8222, 8223, 8224, 8225, 8226, 8227, 8228, 8229, 8230, 8231, 8240, 8241, 8242, 8243, 8244, 8245, 8246, 8247, 8248, 8249, 8250, 8251, 8252, 8253, 8254, 8255, 8256, 8257, 8258, 8259, 8261, 8262, 8263, 8264, 8265, 8266, 8267, 8268, 8269, 8270, 8271, 8272, 8273, 8275, 8276, 8277, 8278, 8279, 8280, 8281, 8282, 8283, 8284, 8285, 8286, 8317, 8318, 8333, 8334, 8968, 8969, 8970, 8971, 9001, 9002, 10088, 10089, 10090, 10091, 10092, 10093, 10094, 10095, 10096, 10097, 10098, 10099, 10100, 10101, 10181, 10182, 10214, 10215, 10216, 10217, 10218, 10219, 10220, 10221, 10222, 10223, 10627, 10628, 10629, 10630, 10631, 10632, 10633, 10634, 10635, 10636, 10637, 10638, 10639, 10640, 10641, 10642, 10643, 10644, 10645, 10646, 10647, 10648, 10712, 10713, 10714, 10715, 10748, 10749, 11513, 11514, 11515, 11516, 11518, 11519, 11632, 11776, 11777, 11778, 11779, 11780, 11781, 11782, 11783, 11784, 11785, 11786, 11787, 11788, 11789, 11790, 11791, 11792, 11793, 11794, 11795, 11796, 11797, 11798, 11799, 11800, 11801, 11802, 11803, 11804, 11805, 11806, 11807, 11808, 11809, 11810, 11811, 11812, 11813, 11814, 11815, 11816, 11817, 11818, 11819, 11820, 11821, 11822, 11824, 11825, 11826, 11827, 11828, 11829, 11830, 11831, 11832, 11833, 11834, 11835, 11836, 11837, 11838, 11839, 11840, 11841, 11842, 11843, 11844, 11845, 11846, 11847, 11848, 11849, 11850, 11851, 11852, 11853, 11854, 11855, 12289, 12290, 12291, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12308, 12309, 12310, 12311, 12312, 12313, 12314, 12315, 12316, 12317, 12318, 12319, 12336, 12349, 12448, 12539, 42238, 42239, 42509, 42510, 42511, 42611, 42622, 42738, 42739, 42740, 42741, 42742, 42743, 43124, 43125, 43126, 43127, 43214, 43215, 43256, 43257, 43258, 43260, 43310, 43311, 43359, 43457, 43458, 43459, 43460, 43461, 43462, 43463, 43464, 43465, 43466, 43467, 43468, 43469, 43486, 43487, 43612, 43613, 43614, 43615, 43742, 43743, 43760, 43761, 44011, 64830, 64831, 65040, 65041, 65042, 65043, 65044, 65045, 65046, 65047, 65048, 65049, 65072, 65073, 65074, 65075, 65076, 65077, 65078, 65079, 65080, 65081, 65082, 65083, 65084, 65085, 65086, 65087, 65088, 65089, 65090, 65091, 65092, 65093, 65094, 65095, 65096, 65097, 65098, 65099, 65100, 65101, 65102, 65103, 65104, 65105, 65106, 65108, 65109, 65110, 65111, 65112, 65113, 65114, 65115, 65116, 65117, 65118, 65119, 65120, 65121, 65123, 65128, 65130, 65131, 65281, 65282, 65283, 65285, 65286, 65287, 65288, 65289, 65290, 65292, 65293, 65294, 65295, 65306, 65307, 65311, 65312, 65339, 65340, 65341, 65343, 65371, 65373, 65375, 65376, 65377, 65378, 65379, 65380, 65381};
        f16170o0 = new Paint(1);
    }

    public static int A(int i10, int i11) {
        if (i10 == i11) {
            return 0;
        }
        if (i10 > i11) {
            return 1;
        }
        return -1;
    }

    public static void A0(SurfaceView surfaceView, Bitmap bitmap, Runnable runnable) {
        if (surfaceView != null && w0.d != null && surfaceView.getHolder().getSurface().isValid()) {
            PixelCopy.request(surfaceView, bitmap, new q(runnable, 2), w0.d);
        }
    }

    public static int A1(String str, String str2) {
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

    public static void A2(List list) {
        if (Build.VERSION.SDK_INT > 23 && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Bitmap bitmap = (Bitmap) list.get(i10);
                if (bitmap != null && !bitmap.isRecycled()) {
                    arrayList.add(new WeakReference(bitmap));
                }
            }
            h3(new l(1, arrayList), 36L);
        }
    }

    public static void A3(View view, int i10, int i11, int i12, int i13) {
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

    public static float B(int i10) {
        float green = Color.green(i10) * 0.7152f;
        return c3.i0.x(Color.blue(i10), 0.0722f, green + (Color.red(i10) * 0.2126f), 255.0f);
    }

    public static Bitmap B0(Window window) {
        if (window != null && window.getDecorView() != null) {
            Bitmap createBitmap = Bitmap.createBitmap(window.getDecorView().getWidth(), window.getDecorView().getHeight(), Bitmap.Config.ARGB_8888);
            final boolean[] zArr = {false};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PixelCopy.request(window, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i10) {
                    boolean z10;
                    boolean[] zArr2 = zArr;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zArr2[0] = z10;
                    countDownLatch2.countDown();
                }
            }, Utilities.f14523g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
            if (zArr[0]) {
                return createBitmap;
            }
            createBitmap.recycle();
        }
        return null;
    }

    public static boolean B1(int i10, int i11, int i12, int i13) {
        if (Math.max(i10, i11) > Math.min(i12, i13) && Math.max(i12, i13) > Math.min(i10, i11)) {
            return true;
        }
        return false;
    }

    public static void B2(Activity activity, int i10) {
        if (activity != null && !Q1() && N == i10) {
            activity.getWindow().setSoftInputMode(32);
        }
    }

    public static void B3(z4.g gVar, int i10) {
        try {
            Field declaredField = z4.g.class.getDeclaredField("f0");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(gVar);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = z4.g.class.getDeclaredField("g0");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(gVar);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception unused) {
        }
    }

    public static CharSequence C(CharSequence... charSequenceArr) {
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

    public static Uri C0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File E0 = E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e7) {
                f8.g(e7, true);
                return null;
            }
        }
        File file = new File(E0, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            Context context = w0.f18945b;
            w0.d();
            Uri d10 = FileProvider.d(context, "org.telegram.messenger.beta.provider", file);
            fileOutputStream.close();
            return d10;
        } catch (Exception e10) {
            f8.g(e10, true);
            return null;
        }
    }

    public static boolean C1() {
        if (I == null) {
            I = (AccessibilityManager) w0.f18945b.getSystemService("accessibility");
        }
        if (I.isEnabled() && I.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public static void C2(Activity activity, int i10) {
        if (activity != null && O == i10) {
            activity.getWindow().clearFlags(131072);
        }
    }

    public static void C3(boolean z10) {
        synchronized (f16164l) {
            try {
                try {
                    if (z10) {
                        if (f16151d0 == null) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
                            if (Build.VERSION.SDK_INT >= 33) {
                                Context context = w0.f18945b;
                                CallReceiver callReceiver = new CallReceiver();
                                f16151d0 = callReceiver;
                                context.registerReceiver(callReceiver, intentFilter, 4);
                            } else {
                                Context context2 = w0.f18945b;
                                CallReceiver callReceiver2 = new CallReceiver();
                                f16151d0 = callReceiver2;
                                context2.registerReceiver(callReceiver2, intentFilter);
                            }
                        }
                    } else if (f16151d0 != null) {
                        w0.f18945b.unregisterReceiver(f16151d0);
                        f16151d0 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused) {
            }
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
            PackageInfo packageInfo = w0.f18945b.getPackageManager().getPackageInfo(w0.f18945b.getPackageName(), 0);
            int i10 = packageInfo.versionCode;
            int i11 = i10 / 10;
            int i12 = i10 % 10;
            if (i12 != 1 && i12 != 2) {
                w0.u();
                str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            } else {
                str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            Locale locale = Locale.US;
            return dd.a0("TelegramVersion", null, 2131744235, "v" + packageInfo.versionName + " (" + i11 + ") " + str);
        } catch (Exception e7) {
            f8.g(e7, true);
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
        synchronized (f16162k) {
            try {
                f16160j = z10;
                if (z10) {
                    ?? jVar = new com.google.android.gms.common.api.j(w0.f18945b, y5.a.f54208k, com.google.android.gms.common.api.b.f4337k, com.google.android.gms.common.api.i.f4346c);
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f4496c = new hb.a((j7.a) jVar);
                    b10.d = new k6.c[]{j7.b.f9703a};
                    b10.f4494a = 1567;
                    jVar.e(1, b10.a()).addOnSuccessListener(new m4.v0(25));
                }
            } catch (Throwable th2) {
                throw th2;
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
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static File E0() {
        String str;
        String str2 = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e7) {
            f8.g(e7, true);
            str = null;
        }
        if (str == null || str.startsWith("mounted")) {
            f8.b("external dir mounted");
            try {
                File[] externalCacheDirs = w0.f18945b.getExternalCacheDirs();
                int i10 = 0;
                File file = externalCacheDirs[0];
                if (!TextUtils.isEmpty(uz.f18519h0)) {
                    while (true) {
                        if (i10 < externalCacheDirs.length) {
                            File file2 = externalCacheDirs[i10];
                            if (file2 != null && file2.getAbsolutePath().startsWith(uz.f18519h0)) {
                                file = externalCacheDirs[i10];
                                break;
                            }
                            i10++;
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
                f8.b(sb2.toString());
                if (file != null && ((file.exists() || file.mkdirs()) && file.canWrite())) {
                    return file;
                }
                if (file != null) {
                    f8.b("check dir file exist " + file.exists() + " can write " + file.canWrite());
                }
            } catch (Exception e10) {
                f8.g(e10, true);
            }
        }
        try {
            File cacheDir = w0.f18945b.getCacheDir();
            if (cacheDir != null) {
                return cacheDir;
            }
        } catch (Exception e11) {
            f8.g(e11, true);
        }
        try {
            File filesDir = w0.f18945b.getFilesDir();
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

    public static void E3(View view) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(2131296646);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(view, 0));
        ofFloat.addListener(new x(0, view));
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(2131296646, ofFloat);
    }

    public static void F(File file, File file2) {
        try {
            E(file, file2);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static int F0(int i10, int i11) {
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

    public static void F3(float f7, View view, Runnable runnable) {
        if (view == null) {
            return;
        }
        int L2 = L(f7);
        if (view.getTag(2131296663) != null) {
            ((o1.j) view.getTag(2131296663)).d();
        }
        Float f10 = (Float) view.getTag(2131296664);
        if (f10 != null) {
            view.setTranslationX(f10.floatValue());
        }
        view.setTag(2131296664, Float.valueOf(view.getTranslationX()));
        float translationX = view.getTranslationX();
        o1.j jVar = new o1.j(view, o1.j.f13942o, translationX);
        o1.k kVar = new o1.k(translationX);
        kVar.b(600.0f);
        jVar.f13958m = kVar;
        jVar.f13949a = (-L2) * 100;
        jVar.a(new i(translationX, view, runnable));
        view.setTag(2131296663, jVar);
        jVar.h();
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
            f8.g(th2, false);
        }
    }

    public static java.lang.String[] G0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.G0():java.lang.String[]");
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

    public static SpannableStringBuilder G2(CharSequence charSequence, boolean z10) {
        return I2(charSequence, z10, L(2.6666667f), 0.0f, 1.0f, 2131232240);
    }

    public static void G3(View view) {
        F3(10.0f, view, null);
    }

    public static byte[] H(byte[] bArr) {
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
                } catch (Exception e7) {
                    f8.g(e7, true);
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
            f8.g(e10, true);
            return byteArray;
        }
    }

    public static java.lang.String H0(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.H0(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean H1(Activity activity) {
        if (Build.VERSION.SDK_INT >= 24 && activity.isInPictureInPictureMode()) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder H2(CharSequence charSequence, boolean z10, float f7, float f10) {
        return I2(charSequence, z10, f7, f10, 1.0f, 2131232240);
    }

    public static boolean H3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.H3():boolean");
    }

    public static float I(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    public static i0.c I0(r0.j1 j1Var, boolean z10) {
        i0.c g10 = j1Var.f46143a.g(647);
        r0.g1 g1Var = j1Var.f46143a;
        i0.c a2 = i0.c.a(g10, g1Var.f(647));
        if (z10) {
            return i0.c.a(a2, g1Var.f(8));
        }
        return a2;
    }

    public static boolean I1(Uri uri, int i10) {
        String str;
        if (uri != null) {
            str = uri.getPath();
            if (str == null) {
                return false;
            }
            if (str.matches(Pattern.quote(new File(w0.f18945b.getCacheDir(), "voip_logs").getAbsolutePath()) + "/\\d+\\.log")) {
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
        return str.toLowerCase().contains("/data/data/" + w0.f18945b.getPackageName());
    }

    public static SpannableStringBuilder I2(CharSequence charSequence, boolean z10, float f7, float f10, float f11, int i10) {
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(i10, 0);
        float f12 = f11 * 0.88f;
        dqVar.H = f12;
        dqVar.I = f12;
        dqVar.f25568r = -f7;
        dqVar.f25569s = f10;
        dqVar.G = 0.8f;
        if (z10) {
            dqVar.f25566f = z10;
        }
        SpannableString spannableString = new SpannableString(" >");
        spannableString.setSpan(dqVar, spannableString.length() - 1, spannableString.length(), 33);
        SpannableStringBuilder L2 = L2(charSequence, spannableString, " >");
        SpannableString spannableString2 = new SpannableString(">");
        spannableString2.setSpan(dqVar, 0, 1, 33);
        SpannableStringBuilder L22 = L2(L2, spannableString2, ">");
        org.telegram.ui.Components.dq dqVar2 = new org.telegram.ui.Components.dq(i10, 0);
        dqVar2.H = f12;
        dqVar2.I = f12;
        dqVar2.f25568r = f7;
        dqVar2.f25569s = f10;
        dqVar2.f25570w = 180.0f;
        dqVar2.G = 0.8f;
        if (z10) {
            dqVar2.f25566f = z10;
        }
        SpannableString spannableString3 = new SpannableString("<");
        spannableString3.setSpan(dqVar2, 0, 1, 33);
        return L2(L22, spannableString3, "<");
    }

    public static boolean I3(String str) {
        try {
            return w(Uri.parse(str).getHost());
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static void J(View view, Runnable runnable) {
        if (view == null) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new v(view, runnable));
        }
    }

    public static int J0(Bitmap bitmap) {
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

    public static boolean J1(org.telegram.ui.ActionBar.k2 k2Var) {
        ((t7.u) w0.k()).getClass();
        try {
            w0.f18945b.getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (k2Var.getParentActivity() == null) {
                return false;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
            ((t7.u) w0.k()).getClass();
            alertDialog$Builder.f20135a.T = dd.L0(2131749205, null);
            alertDialog$Builder.k(dd.L0(2131747847, null), new p(0, "com.google.android.apps.maps", k2Var));
            alertDialog$Builder.h(dd.L0(2131752589, null), null);
            k2Var.showDialog(alertDialog$Builder.f20135a);
            return false;
        }
    }

    public static SpannableStringBuilder J2(CharSequence charSequence, CharSequence charSequence2, String str) {
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

    public static boolean J3(View view) {
        if (view == null) {
            return false;
        }
        try {
            return ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        } catch (Exception e7) {
            f8.g(e7, true);
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
            if (f16168n0 == null) {
                f16168n0 = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
            }
            Matcher matcher = f16168n0.matcher(str);
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

    public static boolean K1(char c10) {
        if (f16163k0 == null) {
            f16163k0 = new HashSet();
            int i10 = 0;
            while (true) {
                char[] cArr = f16161j0;
                if (i10 >= cArr.length) {
                    break;
                }
                f16163k0.add(Character.valueOf(cArr[i10]));
                i10++;
            }
        }
        return f16163k0.contains(Character.valueOf(c10));
    }

    public static SpannableStringBuilder K2(String str, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.as asVar) {
        if (f16152e0 == null) {
            f16152e0 = Pattern.compile("\\[(.+?)\\]\\((.+?)\\)");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f16152e0.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str, i10, matcher.start());
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            spannableStringBuilder.append((CharSequence) group);
            spannableStringBuilder.setSpan(new w(asVar, group2, p6Var, 0), spannableStringBuilder.length() - group.length(), spannableStringBuilder.length(), 33);
            i10 = matcher.end();
        }
        spannableStringBuilder.append((CharSequence) str, i10, str.length());
        return spannableStringBuilder;
    }

    public static void K3(final LaunchActivity launchActivity, final ji.b bVar) {
        if (!bVar.f()) {
            return;
        }
        String str = bVar.f10429b;
        int i10 = bVar.f10430c;
        String str2 = bVar.d;
        String str3 = bVar.e;
        String str4 = bVar.f10431f;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) launchActivity, (org.telegram.ui.ActionBar.p6) null, false);
        z2Var.O();
        z2Var.f21617u0 = false;
        z2Var.f21618v0 = false;
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        linearLayout.setOrientation(1);
        z2Var.N = linearLayout;
        TextView b10 = w7.g6.b(launchActivity, 20.0f, org.telegram.ui.ActionBar.t6.f21038j5, true, null);
        b10.setText(dd.L0(2131743801, null));
        linearLayout.addView(b10, w7.b6.t(-1, -2, 55, 22, 18, 22, 0));
        xy0 xy0Var = new xy0(launchActivity, null);
        linearLayout.addView(xy0Var, w7.b6.t(-1, -2, 55, 14, 18, 14, 0));
        if (!TextUtils.isEmpty(str)) {
            xy0Var.c(dd.L0(2131743817, null), str, null, null);
        }
        if (i10 != 0) {
            xy0Var.c(dd.L0(2131743812, null), Integer.toString(i10), null, null);
        }
        if (!TextUtils.isEmpty(str4)) {
            xy0Var.c(dd.L0(2131743810, null), str4, null, null);
        }
        if (!TextUtils.isEmpty(str2)) {
            xy0Var.c(dd.L0(2131743800, null), str2, null, null);
        }
        if (!TextUtils.isEmpty(str3)) {
            xy0Var.c(dd.L0(2131743813, null), str3, null, null);
        }
        org.telegram.ui.Components.ec[] ecVarArr = new org.telegram.ui.Components.ec[1];
        xy0Var.c(dd.L0(2131746615, null), "", null, ecVarArr);
        ((View) ecVarArr[0].getParent()).setPadding(0, 0, 0, 0);
        ecVarArr[0].setDisablePaddingsOffsetY(true);
        ecVarArr[0].setPadding(L(12.66f), L(9.33f), L(12.66f), L(9.33f));
        ecVarArr[0].setText(N2(dd.L0(2131746624, null), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false), new vl(new boolean[1], ecVarArr, bVar, launchActivity, 5)));
        if (!TextUtils.isEmpty(str4)) {
            vy0 a2 = xy0Var.a(dd.L0(2131743802, null));
            a2.setFilled(true);
            nh.p pVar = (nh.p) a2.getChildAt(0);
            pVar.setTextSize(1, 11.0f);
            pVar.setGravity(17);
        }
        vh.d dVar = new vh.d(launchActivity, null, true);
        dVar.setRoundRadius(24);
        dVar.setText(dd.L0(2131751808, null));
        final mg.l1 l1Var = z2Var.f21622x0;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SharedPreferences.Editor edit = wp.d1().edit();
                edit.putBoolean("proxy_enabled", true);
                ji.b bVar2 = ji.b.this;
                bVar2.h(edit);
                edit.commit();
                uz.B1 = uz.a(new tz(bVar2));
                ConnectionsManager.setProxySettings(true, bVar2);
                at.e().k(at.A4, new Object[0]);
                org.telegram.ui.ActionBar.k2 lastFragment = launchActivity.M().getLastFragment();
                if (lastFragment instanceof org.telegram.ui.un) {
                    org.telegram.ui.un unVar = (org.telegram.ui.un) lastFragment;
                    unVar.c8();
                    UndoView undoView = unVar.M3;
                    if (undoView != null) {
                        undoView.j(87, 0L, null);
                        l1Var.run();
                    }
                }
                at.e().k(at.P4, 6, dd.L0(2131746625, null));
                l1Var.run();
            }
        });
        linearLayout.addView(dVar, w7.b6.t(-1, 48, 55, 14, 18, 14, 14));
        z2Var.show();
    }

    public static int L(float f7) {
        if (f7 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(f16171p * f7);
    }

    public static Pair L0(File file) {
        try {
            return O0(new r1.g(file));
        } catch (Exception e7) {
            f8.g(e7, true);
            return new Pair(0, 0);
        }
    }

    public static boolean L1(CharSequence charSequence) {
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

    public static SpannableStringBuilder L2(CharSequence charSequence, CharSequence charSequence2, String str) {
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

    public static void L3(int i10, int i11, int[] iArr, Canvas canvas, View view) {
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
                L3(i10, i11, iArr, canvas, viewGroup.getChildAt(i12));
            }
        }
    }

    public static int M(float f7) {
        if (f7 == 0.0f) {
            return 0;
        }
        return (int) Math.floor(f16171p * f7);
    }

    public static Pair M0(InputStream inputStream) {
        try {
            return O0(new r1.g(inputStream));
        } catch (Exception e7) {
            f8.g(e7, true);
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

    public static CharSequence M2(CharSequence charSequence) {
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

    public static Bitmap M3(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.draw(canvas);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        L3(iArr[0], iArr[1], iArr, canvas, view);
        return createBitmap;
    }

    public static float N(float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        return f16171p * f7;
    }

    public static Pair N0(String str) {
        try {
            return O0(new r1.g(str));
        } catch (Exception unused) {
            return new Pair(0, 0);
        }
    }

    public static boolean N1() {
        TelephonyManager telephonyManager = (TelephonyManager) w0.f18945b.getSystemService("phone");
        int simState = telephonyManager.getSimState();
        if (simState == 1 || simState == 0 || telephonyManager.getPhoneType() == 0 || Settings.Global.getInt(w0.f18945b.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder N2(String str, int i10, Runnable runnable) {
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
            if (runnable != null) {
                spannableStringBuilder.setSpan(new b0(i10, runnable), indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new u(i10, 1), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static String N3(String str) {
        if (str != null) {
            try {
                str = str.toLowerCase();
            } catch (Exception unused) {
                return "";
            }
        }
        String R0 = dd.D0().R0(str, true, false);
        if (R0 == null) {
            return "";
        }
        return R0;
    }

    public static void O(Canvas canvas, FrameLayout frameLayout, int i10, int i11, float f7) {
        int r12 = org.telegram.ui.ActionBar.t6.r1(T1(0.0f, 0.75f, R0(i11)) * f7, i10);
        Paint paint = f16170o0;
        paint.setColor(r12);
        canvas.drawRect(0.0f, (frameLayout.getY() + frameLayout.getMeasuredHeight()) - i11, frameLayout.getMeasuredWidth(), frameLayout.getY() + frameLayout.getMeasuredHeight(), paint);
    }

    public static Pair O0(r1.g gVar) {
        int i10;
        int i11 = 0;
        try {
            int i12 = 2;
            switch (gVar.c()) {
                case 2:
                    i12 = 1;
                    break;
                case 3:
                    i10 = 180;
                    i12 = 0;
                    i11 = i10;
                    break;
                case 4:
                    break;
                case 5:
                    i11 = 270;
                    break;
                case 6:
                    i10 = 90;
                    i12 = 0;
                    i11 = i10;
                    break;
                case 7:
                    i12 = 1;
                    i11 = 270;
                    break;
                case 8:
                    i12 = 0;
                    i11 = 270;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
        } catch (Exception e7) {
            f8.g(e7, true);
            return new Pair(0, 0);
        }
    }

    public static boolean O1() {
        boolean z10;
        if (M == null) {
            Point point = f16172q;
            if (((Math.max(point.x, point.y) - f16166m) - f16167n) / f16171p <= 650.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            M = Boolean.valueOf(z10);
        }
        return M.booleanValue();
    }

    public static SpannableStringBuilder O2(int i10, String str) {
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
            spannableStringBuilder.setSpan(new u(i10, 0), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static CharSequence O3(CharSequence charSequence, int[] iArr) {
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

    public static void P(Canvas canvas, RectF rectF, float f7) {
        float min = Math.min(f7, Math.min(rectF.width(), rectF.height()) / 2.0f);
        float N2 = N(1.0f);
        float f10 = N2 / 2.0f;
        float max = Math.max(0.0f, min - N2);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = Y;
        paint.setStyle(style);
        paint.setStrokeWidth(N2);
        paint.setColor(org.telegram.ui.ActionBar.t6.r1(1.0f, 570425343));
        canvas.save();
        float f11 = rectF.top;
        if (canvas.clipRect(rectF.left - f10, f11, rectF.right + f10, w7.u.a(f11 + max, f11, rectF.bottom))) {
            canvas.drawRoundRect(rectF.left, rectF.top + f10, rectF.right, f10 + rectF.bottom, max, max, paint);
        }
        canvas.restore();
        float N3 = N(0.6666667f);
        float f12 = N3 / 2.0f;
        float max2 = Math.max(0.0f, min - N3);
        Paint paint2 = Z;
        paint2.setStyle(style);
        paint2.setStrokeWidth(N3);
        paint2.setColor(org.telegram.ui.ActionBar.t6.r1(1.0f, 385875967));
        canvas.save();
        float f13 = rectF.bottom;
        if (canvas.clipRect(rectF.left - f12, w7.u.a(f13 - max2, rectF.top, f13), rectF.right + f12, rectF.bottom)) {
            canvas.drawRoundRect(rectF.left, rectF.top - f12, rectF.right, rectF.bottom - f12, max2, max2, paint2);
        }
        canvas.restore();
    }

    public static File P0() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalFilesDir = w0.f18945b.getExternalFilesDir(null);
                File file = new File(externalFilesDir.getAbsolutePath() + "/logs");
                file.mkdirs();
                return file;
            }
        } catch (Exception unused) {
        }
        try {
            try {
                File file2 = new File(w0.f18945b.getCacheDir() + "/logs");
                file2.mkdirs();
                return file2;
            } catch (Exception unused2) {
                File file3 = new File(w0.f18945b.getFilesDir() + "/logs");
                file3.mkdirs();
                return file3;
            }
        } catch (Exception unused3) {
            w0.a(new RuntimeException("can't create logs directory"));
            return null;
        }
    }

    public static boolean P1() {
        Point point = f16172q;
        if (Math.min(point.x, point.y) / f16171p <= 690.0f) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder P2(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable, boolean z10) {
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
            if (runnable != null) {
                spannableStringBuilder.setSpan(new c0(z10, i10, p6Var, runnable), indexOf, i11 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new d0(z10, i10, p6Var), indexOf, i11 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void P3(Activity activity) {
        boolean z10;
        if (activity != null) {
            try {
                if (f16153f != -10) {
                    int requestedOrientation = activity.getRequestedOrientation();
                    activity.setRequestedOrientation(f16153f);
                    if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        f16155g = f16153f;
                        h = requestedOrientation;
                        f16158i = new WeakReference(activity);
                    }
                    f16153f = -10;
                }
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
    }

    public static CharSequence Q(CharSequence charSequence, String str, int i10, TextPaint textPaint) {
        CharSequence charSequence2;
        int i11;
        CharSequence subSequence;
        try {
            int length = charSequence.length();
            int indexOf = charSequence.toString().toLowerCase().indexOf(str);
            if (length > 130) {
                CharSequence subSequence2 = charSequence.subSequence(Math.max(0, indexOf - 65), Math.min(length, indexOf + 65));
                try {
                    int max = indexOf - Math.max(0, indexOf - 65);
                    subSequence2.length();
                    i11 = max;
                    charSequence2 = subSequence2;
                } catch (Exception e7) {
                    e = e7;
                    charSequence2 = subSequence2;
                    f8.g(e, true);
                    return charSequence2;
                }
            } else {
                i11 = indexOf;
                charSequence2 = charSequence;
            }
        } catch (Exception e10) {
            e = e10;
            charSequence2 = charSequence;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            float lineWidth = staticLayout.getLineWidth(0);
            float f7 = i10;
            if (textPaint.measureText("...") + lineWidth >= f7) {
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < charSequence2.length() - 1 && !Character.isWhitespace(charSequence2.charAt(i13))) {
                    i13++;
                }
                float primaryHorizontal = staticLayout.getPrimaryHorizontal(i13);
                if (staticLayout.isRtlCharAt(i13)) {
                    primaryHorizontal = lineWidth - primaryHorizontal;
                }
                if (primaryHorizontal >= f7) {
                    float f10 = 0.1f * f7;
                    float measureText = (textPaint.measureText("...") * 2.0f) + (primaryHorizontal - f7) + f10;
                    if (charSequence2.length() - i13 > 20) {
                        measureText += f10;
                    }
                    if (measureText > 0.0f) {
                        int offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
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
                                offsetForHorizontal = staticLayout.getOffsetForHorizontal(0, measureText);
                                break;
                            }
                        }
                        if (i14 >= 10) {
                            subSequence = charSequence2.subSequence(staticLayout.getOffsetForHorizontal(0, staticLayout.getPrimaryHorizontal(i12) - (f7 * 0.3f)), charSequence2.length());
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
        } catch (Exception e11) {
            e = e11;
            f8.g(e, true);
            return charSequence2;
        }
    }

    public static int Q0() {
        boolean P1 = P1();
        Point point = f16172q;
        if (!P1) {
            int min = Math.min(point.x, point.y);
            return min - l1(min, 0, 0);
        }
        int min2 = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        return Math.min(min2, max - l1(max, 0, 0));
    }

    public static boolean Q1() {
        if (R1() && !uz.W) {
            return true;
        }
        return false;
    }

    public static SpannableStringBuilder Q2(String str, int i10, org.telegram.ui.ActionBar.p6 p6Var, hr0 hr0Var) {
        return P2(str, i10, p6Var, hr0Var, false);
    }

    public static void Q3(ImageView imageView, int i10) {
        R3(imageView, imageView.getContext().getDrawable(i10));
    }

    public static MotionEvent R() {
        return MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
    }

    public static float R0(int i10) {
        return Utilities.l((i10 - L(32.0f)) / L(16.0f));
    }

    public static boolean R1() {
        boolean z10;
        if (K == null) {
            if (w0.f18945b != null && w0.f18945b.getResources().getBoolean(2131034114)) {
                z10 = true;
            } else {
                z10 = false;
            }
            K = Boolean.valueOf(z10);
        }
        return K.booleanValue();
    }

    public static SpannableStringBuilder R2(String str, int i10, int i11, Runnable runnable, org.telegram.ui.ActionBar.p6 p6Var) {
        int i12;
        int i13;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i13 = indexOf2 - indexOf) > 2) {
            i12 = i13 - 2;
        } else {
            indexOf = -1;
            i12 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            if (i11 == 3) {
                int i14 = indexOf + i12;
                spannableStringBuilder.replace(indexOf, i14, (CharSequence) L2(spannableStringBuilder.subSequence(indexOf, i14), " ", " "));
            }
            if (i11 != 0 && i11 != 3 && i11 != 2 && i11 != 4) {
                spannableStringBuilder.setSpan(new bi.m6(p6Var, 1), indexOf, i12 + indexOf, 0);
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new a0(i11, i10, p6Var, runnable), indexOf, i12 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void R3(final ImageView imageView, final Drawable drawable) {
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

    public static void S(Window window) {
        int i10;
        Objects.requireNonNull(window);
        window.getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            g0.f.t(window);
        } else if (i11 >= 30) {
            g0.f.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (i11 >= 28) {
            if (i11 >= 30) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i10) {
                m4.v0.c(attributes, i10);
                window.setAttributes(attributes);
            }
        }
        if (i11 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static int S0(float f7, float f10, int i10, int i11) {
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int alpha = Color.alpha(i11);
        int red2 = Color.red(i10);
        int green2 = Color.green(i10);
        int blue2 = Color.blue(i10);
        int alpha2 = Color.alpha(i10);
        return Color.argb((int) c3.i0.C(alpha - alpha2, f7, alpha2, f10), (int) (((red - red2) * f7) + red2), (int) (((green - green2) * f7) + green2), (int) (((blue - blue2) * f7) + blue2));
    }

    public static boolean S1(char c10) {
        if (c10 != '-' && c10 != '~') {
            return false;
        }
        return true;
    }

    public static SpannableStringBuilder S2(String str, int i10, org.telegram.ui.nf nfVar) {
        return R2(str, i10, 0, nfVar, null);
    }

    public static void S3(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        if (windowManager != null && view != null && view.getParent() != null) {
            windowManager.updateViewLayout(view, layoutParams);
        }
    }

    public static void T() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) w0.f18945b.getSystemService("phone");
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
            f8.g(th2, true);
        }
    }

    public static String T0(Uri uri) {
        Uri uri2;
        String[] split;
        try {
            if (DocumentsContract.isDocumentUri(w0.f18945b, uri)) {
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    if ("primary".equalsIgnoreCase(DocumentsContract.getDocumentId(uri).split(":")[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + split[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    return H0(w0.f18945b, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str = split2[0];
                    int hashCode = str.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875 && str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                return H0(w0.f18945b, uri2, "_id=?", new String[]{split2[1]});
                            }
                            uri2 = null;
                            return H0(w0.f18945b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        if (str.equals("image")) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            return H0(w0.f18945b, uri2, "_id=?", new String[]{split2[1]});
                        }
                        uri2 = null;
                        return H0(w0.f18945b, uri2, "_id=?", new String[]{split2[1]});
                    }
                    if (str.equals("audio")) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        return H0(w0.f18945b, uri2, "_id=?", new String[]{split2[1]});
                    }
                    uri2 = null;
                    return H0(w0.f18945b, uri2, "_id=?", new String[]{split2[1]});
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return H0(w0.f18945b, uri, null, null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            return null;
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static float T1(float f7, float f10, float f11) {
        return c3.i0.z(f10, f7, f11, f7);
    }

    public static SpannableStringBuilder T2(String str, Runnable runnable) {
        return R2(str, -1, 0, runnable, null);
    }

    public static void T3(float f7, View view, boolean z10, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        float f12;
        if (view != null) {
            int i10 = 0;
            if (view.getParent() == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            Integer num = null;
            view.animate().setListener(null).cancel();
            float f13 = 0.5f;
            float f14 = 0.0f;
            if (!z12) {
                if (!z10) {
                    i10 = 8;
                }
                view.setVisibility(i10);
                if (z10) {
                    num = 1;
                }
                view.setTag(num);
                view.setAlpha(1.0f);
                if (z11 && !z10) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                view.setScaleX(f12);
                if (!z11 || z10) {
                    f13 = 1.0f;
                }
                view.setScaleY(f13);
                if (f7 != 0.0f) {
                    if (!z10) {
                        f14 = L(-16.0f) * f7;
                    }
                    view.setTranslationY(f14);
                }
            } else if (z10) {
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    if (z11) {
                        f11 = 0.5f;
                    } else {
                        f11 = 1.0f;
                    }
                    view.setScaleX(f11);
                    if (!z11) {
                        f13 = 1.0f;
                    }
                    view.setScaleY(f13);
                    if (f7 != 0.0f) {
                        view.setTranslationY(L(-16.0f) * f7);
                    }
                }
                ViewPropertyAnimator withEndAction = view.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).withEndAction(null);
                if (f7 != 0.0f) {
                    withEndAction.translationY(0.0f);
                }
                withEndAction.start();
            } else {
                ViewPropertyAnimator alpha = view.animate().alpha(0.0f);
                if (z11) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = alpha.scaleY(f10);
                if (!z11) {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator withEndAction2 = scaleY.scaleX(f13).setListener(new eg.m(view)).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).withEndAction(null);
                if (f7 != 0.0f) {
                    withEndAction2.translationY(L(-16.0f) * f7);
                }
                withEndAction2.start();
            }
        }
    }

    public static String U(String str) {
        return F2(D2(str));
    }

    public static int U0(int i10) {
        return V0(i10, false);
    }

    public static float U1(float f7, float[] fArr) {
        return T1(fArr[0], fArr[1], f7);
    }

    public static SpannableStringBuilder U2(SpannableStringBuilder spannableStringBuilder) {
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
            for (int i10 = 0; i10 < arrayList.size() / 2; i10++) {
                int i11 = i10 * 2;
                spannableStringBuilder2.setSpan(new y41(o()), ((Integer) arrayList.get(i11)).intValue(), ((Integer) arrayList.get(i11 + 1)).intValue(), 33);
            }
            return spannableStringBuilder2;
        } catch (Exception e7) {
            f8.g(e7, true);
            return spannableStringBuilder;
        }
    }

    public static void U3(View view, boolean z10, boolean z11) {
        T3(0.0f, view, z10, z11);
    }

    public static Object V(Class cls, List list) {
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
        return null;
    }

    public static int V0(int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.V0(int, boolean):int");
    }

    public static float V1(boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        float f12 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z10) {
            f12 = 1.0f;
        }
        return c3.i0.z(f11, f12, f7, f10);
    }

    public static SpannableStringBuilder V2(CharSequence charSequence) {
        if (charSequence instanceof SpannableStringBuilder) {
            return U2((SpannableStringBuilder) charSequence);
        }
        return U2(new SpannableStringBuilder(charSequence));
    }

    public static void V3(float f7, View view, boolean z10, boolean z11) {
        Y3(view, z10, f7, true, z11);
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

    public static int W0(int i10) {
        float[] b10 = b(Color.red(i10), Color.green(i10), Color.blue(i10));
        b10[1] = Math.min(1.0f, b10[1] + 0.05f);
        float f7 = b10[2];
        if (f7 > 0.5f) {
            b10[2] = Math.max(0.0f, f7 * 0.9f);
        } else {
            b10[2] = Math.max(0.0f, f7 * 0.9f);
        }
        return a(b10[0], b10[1], b10[2]) | (-16777216);
    }

    public static int W1(float f7, int i10, int i11) {
        return (int) ((f7 * (i11 - i10)) + i10);
    }

    public static SpannableStringBuilder W2(String str) {
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
            for (int i10 = 0; i10 < arrayList.size() / 2; i10++) {
                int i11 = i10 * 2;
                spannableStringBuilder.setSpan(new y41(o()), ((Integer) arrayList.get(i11)).intValue(), ((Integer) arrayList.get(i11 + 1)).intValue(), 33);
            }
            return spannableStringBuilder;
        } catch (Exception e7) {
            f8.g(e7, true);
            return new SpannableStringBuilder(str);
        }
    }

    public static void W3(View view, boolean z10) {
        Y3(view, z10, 1.0f, true, true);
    }

    public static View X(ViewGroup viewGroup, float f7, float f10) {
        if (viewGroup.getVisibility() == 0) {
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null && childAt.getVisibility() == 0) {
                    if (childAt instanceof ViewGroup) {
                        View X2 = X((ViewGroup) childAt, f7 - childAt.getLeft(), f10 - childAt.getTop());
                        if (X2 != null) {
                            return X2;
                        }
                    } else if (f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getY() && f7 <= childAt.getY() + childAt.getHeight()) {
                        return childAt;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int X0(int i10) {
        return Math.max(73, (i10 >> 16) & 65535);
    }

    public static void X1(Rect rect, Rect rect2, float f7, Rect rect3) {
        if (rect3 != null) {
            rect3.set(W1(f7, rect.left, rect2.left), W1(f7, rect.top, rect2.top), W1(f7, rect.right, rect2.right), W1(f7, rect.bottom, rect2.bottom));
        }
    }

    public static CharSequence X2(CharSequence charSequence) {
        char[] cArr = new char[2];
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb2 = (StringBuilder) charSequence;
            int length = sb2.length();
            int i10 = 0;
            while (i10 < length - 2) {
                int i11 = i10 + 2;
                sb2.getChars(i10, i11, cArr, 0);
                if (cArr[0] == '\n' && cArr[1] == '\n') {
                    sb2 = sb2.replace(i10, i11, "\n");
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

    public static void X3(View view, boolean z10, float f7, boolean z11, float f10, boolean z12, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        Integer num = 1;
        if (view != null) {
            int i10 = 0;
            if (view.getParent() == null) {
                z12 = false;
            }
            if (!z12) {
                view.animate().setListener(null).cancel();
                if (!z10) {
                    if (z11) {
                        i10 = 8;
                    } else {
                        i10 = 4;
                    }
                }
                view.setVisibility(i10);
                if (!z10) {
                    num = null;
                }
                view.setTag(num);
                view.setAlpha(f10);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            } else if (z10 && view.getTag() == null) {
                view.animate().setListener(null).cancel();
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setScaleX(f7);
                    view.setScaleY(f7);
                }
                view.animate().alpha(f10).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(num);
            } else if (!z10 && view.getTag() != null) {
                view.animate().setListener(null).cancel();
                view.animate().alpha(0.0f).scaleY(f7).scaleX(f7).setListener(new eg.m(view, z11)).setDuration(150L).setUpdateListener(animatorUpdateListener).start();
                view.setTag(null);
            }
        }
    }

    public static boolean Y(ViewGroup viewGroup, float f7, float f10, View view) {
        int i10;
        Rect rect;
        if (viewGroup == null) {
            return false;
        }
        int i11 = 0;
        while (i11 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0 && (!(childAt instanceof th.z2) || childAt == view)) {
                if (childAt instanceof th.q6) {
                    th.s6 s6Var = (th.s6) viewGroup;
                    if (s6Var.f49453b == null || (f7 >= L(60.0f) && f7 <= viewGroup.getWidth() - L(60.0f))) {
                        int i12 = 0;
                        while (i12 < s6Var.getChildCount()) {
                            View childAt2 = s6Var.getChildAt(i12);
                            if (childAt2 instanceof th.v6) {
                                float translationX = childAt2.getTranslationX();
                                float translationY = childAt2.getTranslationY();
                                float measuredWidth = childAt2.getMeasuredWidth();
                                float measuredHeight = childAt2.getMeasuredHeight();
                                double radians = Math.toRadians(-childAt2.getRotation());
                                double d10 = f7 - translationX;
                                i10 = i11;
                                double d11 = f10 - translationY;
                                float cos = (float) ((Math.cos(radians) * d10) - (Math.sin(radians) * d11));
                                float c10 = (float) i0.a.c(radians, d11, Math.sin(radians) * d10);
                                if (cos >= (-measuredWidth) / 2.0f && cos <= measuredWidth / 2.0f && c10 >= (-measuredHeight) / 2.0f && c10 <= measuredHeight / 2.0f) {
                                    rect = Q;
                                    childAt.getHitRect(rect);
                                    if (rect.contains((int) f7, (int) f10) || !childAt.isClickable()) {
                                        if ((childAt instanceof ViewGroup) && Y((ViewGroup) childAt, f7 - childAt.getX(), f10 - childAt.getY(), view)) {
                                            return true;
                                        }
                                        i11 = i10 + 1;
                                    } else {
                                        return true;
                                    }
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
                rect = Q;
                childAt.getHitRect(rect);
                if (rect.contains((int) f7, (int) f10)) {
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

    public static int Y0() {
        return Z0(false);
    }

    public static void Y1(Rect rect, RectF rectF, float f7, RectF rectF2) {
        if (rectF2 != null) {
            rectF2.set(T1(rect.left, rectF.left, f7), T1(rect.top, rectF.top, f7), T1(rect.right, rectF.right, f7), T1(rect.bottom, rectF.bottom, f7));
        }
    }

    public static void Y2(Activity activity, int i10) {
        if (activity != null && !Q1()) {
            activity.getWindow().setSoftInputMode(48);
            N = i10;
        }
    }

    public static void Y3(View view, boolean z10, float f7, boolean z11, boolean z12) {
        X3(view, z10, f7, z11, 1.0f, z12, null);
    }

    public static TLRPC.Document Z(long j10, List list) {
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            TLRPC.Document document = (TLRPC.Document) list.get(i10);
            if (document != null && document.f19800id == j10) {
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
        if (f16180z == null) {
            f16180z = 1280;
        }
        return f16180z.intValue();
    }

    public static void Z1(RectF rectF, RectF rectF2, float f7, RectF rectF3) {
        if (rectF3 != null) {
            rectF3.set(T1(rectF.left, rectF2.left, f7), T1(rectF.top, rectF2.top, f7), T1(rectF.right, rectF2.right, f7), T1(rectF.bottom, rectF2.bottom, f7));
        }
    }

    public static void Z2(Activity activity, int i10) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null && !Q1()) {
            window.setSoftInputMode(16);
            N = i10;
        }
    }

    public static void Z3(int i10, uk0 uk0Var) {
        s4.g0 adapter;
        s4.c1 T2;
        if (uk0Var != null && (adapter = uk0Var.getAdapter()) != null) {
            for (int i11 = 0; i11 < uk0Var.getChildCount(); i11++) {
                View childAt = uk0Var.getChildAt(i11);
                int R2 = RecyclerView.R(childAt);
                if (R2 >= 0 && (T2 = uk0Var.T(childAt)) != null && !T2.r() && T2.b() == i10) {
                    adapter.t(T2, R2);
                }
            }
        }
    }

    public static int a(float f7, float f10, float f11) {
        int i10;
        int i11;
        int i12;
        if (f10 == 0.0f) {
            i10 = (int) ((f11 * 255.0f) + 0.5f);
        } else {
            float floor = (f7 - ((float) Math.floor(f7))) * 6.0f;
            float floor2 = floor - ((float) Math.floor(floor));
            float f12 = (1.0f - f10) * f11;
            float D2 = c3.i0.D(f10, floor2, 1.0f, f11);
            float f13 = (1.0f - ((1.0f - floor2) * f10)) * f11;
            int i13 = (int) floor;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 != 5) {
                                    i10 = 0;
                                } else {
                                    i10 = (int) ((f11 * 255.0f) + 0.5f);
                                    i11 = (int) ((f12 * 255.0f) + 0.5f);
                                    i12 = (int) ((D2 * 255.0f) + 0.5f);
                                }
                            } else {
                                i10 = (int) ((f13 * 255.0f) + 0.5f);
                                i11 = (int) ((f12 * 255.0f) + 0.5f);
                            }
                        } else {
                            i10 = (int) ((f12 * 255.0f) + 0.5f);
                            i11 = (int) ((D2 * 255.0f) + 0.5f);
                        }
                        i12 = (int) ((f11 * 255.0f) + 0.5f);
                    } else {
                        i10 = (int) ((f12 * 255.0f) + 0.5f);
                        i11 = (int) ((f11 * 255.0f) + 0.5f);
                        i12 = (int) ((f13 * 255.0f) + 0.5f);
                    }
                    return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
                }
                i10 = (int) ((D2 * 255.0f) + 0.5f);
                i11 = (int) ((f11 * 255.0f) + 0.5f);
            } else {
                i10 = (int) ((f11 * 255.0f) + 0.5f);
                i11 = (int) ((f13 * 255.0f) + 0.5f);
            }
            i12 = (int) ((f12 * 255.0f) + 0.5f);
            return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
        }
        i11 = i10;
        i12 = i11;
        return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
    }

    public static void a0() {
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("google_bug_154855417", 0);
        if (!sharedPreferences.contains("fixed")) {
            new File(w0.h(), "ZoomTables.data").delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        }
    }

    public static float a1(boolean z10, float f7) {
        float f10;
        float f11 = f7 / 2.54f;
        DisplayMetrics displayMetrics = B;
        if (z10) {
            f10 = displayMetrics.xdpi;
        } else {
            f10 = displayMetrics.ydpi;
        }
        return f11 * f10;
    }

    public static void a2(float[] fArr, float[] fArr2, float f7, float[] fArr3) {
        float f10;
        if (fArr3 != null) {
            for (int i10 = 0; i10 < fArr3.length; i10++) {
                float f11 = 0.0f;
                if (fArr != null && i10 < fArr.length) {
                    f10 = fArr[i10];
                } else {
                    f10 = 0.0f;
                }
                if (fArr2 != null && i10 < fArr2.length) {
                    f11 = fArr2[i10];
                }
                fArr3[i10] = T1(f10, f11, f7);
            }
        }
    }

    public static void a3(Activity activity, int i10) {
        if (activity == null) {
            return;
        }
        activity.getWindow().setFlags(131072, 131072);
        O = i10;
    }

    public static void a4(uk0 uk0Var) {
        s4.g0 adapter;
        s4.c1 T2;
        if (uk0Var != null && (adapter = uk0Var.getAdapter()) != null) {
            for (int i10 = 0; i10 < uk0Var.getChildCount(); i10++) {
                View childAt = uk0Var.getChildAt(i10);
                int R2 = RecyclerView.R(childAt);
                if (R2 >= 0 && (T2 = uk0Var.T(childAt)) != null && !T2.r()) {
                    adapter.t(T2, R2);
                }
            }
        }
    }

    public static float[] b(int i10, int i11, int i12) {
        float f7;
        float f10;
        int max = Math.max(i10, i11);
        if (i12 > max) {
            max = i12;
        }
        int min = Math.min(i10, i11);
        if (i12 < min) {
            min = i12;
        }
        float f11 = max;
        float f12 = f11 / 255.0f;
        float f13 = 0.0f;
        if (max != 0) {
            f7 = (max - min) / f11;
        } else {
            f7 = 0.0f;
        }
        if (f7 != 0.0f) {
            float f14 = max - min;
            float f15 = (max - i10) / f14;
            float f16 = (max - i11) / f14;
            float f17 = (max - i12) / f14;
            if (i10 == max) {
                f10 = f17 - f16;
            } else if (i11 == max) {
                f10 = (f15 + 2.0f) - f17;
            } else {
                f10 = (f16 + 4.0f) - f15;
            }
            float f18 = f10 / 6.0f;
            if (f18 < 0.0f) {
                f13 = f18 + 1.0f;
            } else {
                f13 = f18;
            }
        }
        return new float[]{f13, f7, f12};
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

    public static float b2(float f7, float f10, float f11) {
        return ((((((((f10 - f7) + 360.0f) + 180.0f) % 360.0f) - 180.0f) * f11) + f7) + 360.0f) % 360.0f;
    }

    public static void b3(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setSourceRectHint(null);
            builder.setAspectRatio(null);
            if (i10 >= 31) {
                builder.setAutoEnterEnabled(false);
            }
            v3(activity, builder.build());
        }
    }

    public static void b4(View view) {
        if (view != null) {
            try {
                if (view.getContext() != null && Build.VERSION.SDK_INT >= 26 && ((Vibrator) view.getContext().getSystemService("vibrator")).hasAmplitudeControl()) {
                    view.performHapticFeedback(9, 1);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void c(android.text.Spannable r5, int r6, boolean r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.c(android.text.Spannable, int, boolean, boolean):void");
    }

    public static void c0(View view, r20 r20Var) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                r20Var.a(view);
                c0(viewGroup.getChildAt(i10), r20Var);
            }
            return;
        }
        r20Var.a(view);
    }

    public static Point c1() {
        Point point = new Point();
        try {
            ((WindowManager) w0.f18945b.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Exception e7) {
            f8.g(e7, true);
            return point;
        }
    }

    public static void c2(RectF rectF, RectF rectF2, float f7, RectF rectF3) {
        if (rectF3 == null) {
            return;
        }
        float T1 = T1(rectF.centerX(), rectF2.centerX(), f7);
        float T12 = T1(rectF.centerY(), rectF2.centerY(), f7);
        float T13 = T1(rectF.width(), rectF2.width(), Math.min(1.0f, f7)) / 2.0f;
        float T14 = T1(rectF.height(), rectF2.height(), Math.min(1.0f, f7)) / 2.0f;
        rectF3.set(T1 - T13, T12 - T14, T1 + T13, T12 + T14);
    }

    public static void c3() {
        int i10;
        if (L == null) {
            L = Boolean.valueOf(R1());
        }
        K = null;
        if (uz.X0) {
            SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("mainconfig", 0);
            if (Q1() && (w0.f18945b == null || !w0.f18945b.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) {
                i10 = 18;
            } else {
                i10 = 16;
            }
            int i11 = sharedPreferences.getInt("fons_size", i10);
            uz.W0 = i11;
            uz.Z0 = sharedPreferences.getInt("iv_font_size", i11);
        }
    }

    public static SpannableStringBuilder c4(CharSequence charSequence, Runnable runnable) {
        SpannableString spannableString = new SpannableString(dd.L0(2131749019, null));
        spannableString.setSpan(new y(0, runnable), 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        return G2(spannableStringBuilder, true);
    }

    public static void d(File file) {
        Uri fromFile = Uri.fromFile(file);
        if (fromFile == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(fromFile);
            w0.f18945b.sendBroadcast(intent);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static void d0(RecyclerView recyclerView, r20 r20Var) {
        if (recyclerView != null) {
            for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
                r20Var.a(recyclerView.getChildAt(i10));
            }
            for (int i11 = 0; i11 < recyclerView.getCachedChildCount(); i11++) {
                r20Var.a(recyclerView.P(i11));
            }
            for (int i12 = 0; i12 < recyclerView.getHiddenChildCount(); i12++) {
                r20Var.a(recyclerView.V(i12));
            }
            for (int i13 = 0; i13 < recyclerView.getAttachedScrapChildCount(); i13++) {
                r20Var.a(recyclerView.O(i13));
            }
        }
    }

    public static ArrayList d1() {
        File externalStorageDirectory;
        String absolutePath;
        int indexOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        File[] externalFilesDirs = w0.f18945b.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file : externalFilesDirs) {
                if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf("/Android")) >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    File file2 = new File(absolutePath.substring(0, indexOf));
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((File) arrayList.get(i10)).getPath().equals(file2.getPath());
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

    public static int d2(float f7, int i10, int i11) {
        return Color.argb(W1(f7, Color.alpha(i10), Color.alpha(i11)), W1(f7, Color.red(i10), Color.red(i11)), W1(f7, Color.green(i10), Color.green(i11)), W1(f7, Color.blue(i10), Color.blue(i11)));
    }

    public static double[] d3(int i10, int i11, int i12) {
        double max;
        double min;
        double d10;
        double d11;
        double d12;
        double d13;
        int i13;
        double d14 = i10 / 255.0d;
        double d15 = i11 / 255.0d;
        double d16 = i12 / 255.0d;
        int i14 = (d14 > d15 ? 1 : (d14 == d15 ? 0 : -1));
        if (i14 > 0 && d14 > d16) {
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
            if (i14 > 0 && d14 > d16) {
                d11 = (d15 - d16) / d17;
                if (d15 < d16) {
                    i13 = 6;
                } else {
                    i13 = 0;
                }
                d12 = i13;
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

    public static void e(String str) {
        if (str == null) {
            return;
        }
        d(new File(str));
    }

    public static String e0(int i10, double d10, double d11, int i11, int i12, boolean z10, int i13, int i14) {
        int i15;
        int i16 = 2;
        int min = Math.min(2, (int) Math.ceil(f16171p));
        if (i14 == -1) {
            i15 = wp.r1(i10).f19185m3;
        } else {
            i15 = i14;
        }
        if (i15 != 1 && i15 != 3) {
            String str = wp.r1(i10).f19240s3;
            if (!TextUtils.isEmpty(str)) {
                if (z10) {
                    return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false&key=%s", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), Double.valueOf(d10), Double.valueOf(d11), str);
                }
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&key=%s", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), str);
            } else if (z10) {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d&markers=color:red%%7Csize:mid%%7C%.6f,%.6f&sensor=false", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min), Double.valueOf(d10), Double.valueOf(d11));
            } else {
                return String.format(Locale.US, "https://maps.googleapis.com/maps/api/staticmap?center=%.6f,%.6f&zoom=%d&size=%dx%d&maptype=roadmap&scale=%d", Double.valueOf(d10), Double.valueOf(d11), Integer.valueOf(i13), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(min));
            }
        }
        String[] strArr = {"ru_RU", "tr_TR"};
        ad adVar = dd.D0().B;
        String str2 = null;
        int i17 = 0;
        while (i17 < i16) {
            int i18 = i16;
            if (strArr[i17].toLowerCase().contains(adVar.f14593c)) {
                str2 = strArr[i17];
            }
            i17++;
            i16 = i18;
        }
        int i19 = i16;
        if (str2 == null) {
            str2 = "en_US";
        }
        if (z10) {
            Locale locale = Locale.US;
            Double valueOf = Double.valueOf(d11);
            Double valueOf2 = Double.valueOf(d10);
            Integer valueOf3 = Integer.valueOf(i13);
            Integer valueOf4 = Integer.valueOf(i11 * min);
            Integer valueOf5 = Integer.valueOf(i12 * min);
            Integer valueOf6 = Integer.valueOf(min);
            Double valueOf7 = Double.valueOf(d11);
            Double valueOf8 = Double.valueOf(d10);
            Object[] objArr = new Object[9];
            objArr[0] = valueOf;
            objArr[1] = valueOf2;
            objArr[i19] = valueOf3;
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
        Integer valueOf11 = Integer.valueOf(i13);
        Integer valueOf12 = Integer.valueOf(i11 * min);
        Integer valueOf13 = Integer.valueOf(i12 * min);
        Integer valueOf14 = Integer.valueOf(min);
        Object[] objArr2 = new Object[7];
        objArr2[0] = valueOf9;
        objArr2[1] = valueOf10;
        objArr2[i19] = valueOf11;
        objArr2[3] = valueOf12;
        objArr2[4] = valueOf13;
        objArr2[5] = valueOf14;
        objArr2[6] = str2;
        return String.format(locale2, "https://static-maps.yandex.ru/1.x/?ll=%.6f,%.6f&z=%d&size=%d,%d&l=map&scale=%d&lang=%s", objArr2);
    }

    public static Bitmap e1(float f7, float f10, String str, String str2, int i10) {
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        int i11;
        int i12;
        Bitmap decodeStream;
        int i13;
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
                        fileInputStream.getChannel().position(i10);
                        BitmapFactory.decodeStream(fileInputStream, null, options);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            f8.g(th, true);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } finally {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e7) {
                                    f8.g(e7, true);
                                }
                            }
                        }
                    }
                }
                i11 = options.outWidth;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        if (i11 > 0 && (i12 = options.outHeight) > 0) {
            if (f7 > f10 && i11 < i12) {
                f10 = f7;
                f7 = f10;
            }
            float min = Math.min(i11 / f7, i12 / f10);
            options.inSampleSize = 1;
            if (min > 1.0f) {
                do {
                    i13 = options.inSampleSize * 2;
                    options.inSampleSize = i13;
                } while (i13 < min);
            }
            options.inJustDecodeBounds = false;
            if (str != null) {
                decodeStream = BitmapFactory.decodeFile(str, options);
            } else {
                fileInputStream.getChannel().position(i10);
                decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            }
            if (fileInputStream != null) {
                try {
                    return decodeStream;
                } catch (Exception e72) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.e2(android.net.Uri, int, boolean, java.util.ArrayList, java.lang.String):java.util.ArrayList");
    }

    public static void e3(float[] fArr, int[] iArr) {
        if (fArr != null) {
            if (iArr == null) {
                iArr = new int[fArr.length];
            }
            if (fArr.length == iArr.length) {
                float f7 = 0.0f;
                for (float f10 : fArr) {
                    f7 += f10;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < fArr.length; i11++) {
                    int floor = (int) Math.floor((fArr[i11] / f7) * 100.0f);
                    iArr[i11] = floor;
                    i10 += floor;
                }
                while (i10 < 100) {
                    int i12 = -1;
                    float f11 = 0.0f;
                    for (int i13 = 0; i13 < fArr.length; i13++) {
                        float f12 = fArr[i13];
                        float f13 = (f12 / f7) - (iArr[i13] / 100.0f);
                        if (f12 > 0.0f && f13 >= f11) {
                            i12 = i13;
                            f11 = f13;
                        }
                    }
                    if (i12 >= 0) {
                        iArr[i12] = iArr[i12] + 1;
                        i10++;
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

    public static void f(CharSequence charSequence, String str) {
        if (str == null) {
            g(charSequence);
            return;
        }
        try {
            ((ClipboardManager) w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("label", charSequence, str));
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static String f0(int i10) {
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

    public static int f1() {
        float f7 = f16171p;
        if (f7 >= 4.0f) {
            return 3;
        }
        if (f7 >= 2.0f) {
            return 2;
        }
        return 1;
    }

    public static void f2(Activity activity) {
        int requestedOrientation;
        WeakReference weakReference;
        if (activity != null && f16153f == -10 && !R1()) {
            try {
                if (f16155g != -10 && (weakReference = f16158i) != null && weakReference.get() == activity) {
                    requestedOrientation = f16155g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f16153f = requestedOrientation;
                f16155g = -10;
                h = -10;
                f16158i = null;
                WindowManager windowManager = (WindowManager) activity.getSystemService("window");
                if (windowManager != null && windowManager.getDefaultDisplay() != null) {
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
                }
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
    }

    public static int f3(boolean z10, boolean z11) {
        if (z10) {
            return f16177w;
        }
        int i10 = v;
        if (z11) {
            return i10 - L(42.0f);
        }
        return i10;
    }

    public static boolean g(CharSequence charSequence) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) w0.f18945b.getSystemService("clipboard");
            if (charSequence instanceof Spanned) {
                clipboardManager.setPrimaryClip(ClipData.newHtmlText("label", charSequence, rf.n.c((Spanned) charSequence)));
                return true;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", charSequence));
            return true;
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static String g0(int i10, boolean z10, boolean z11) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i11 == 0) {
            if (z10) {
                return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
            }
            return String.format(Locale.US, "%d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
        } else if (z11) {
            return String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
        } else {
            return String.format(Locale.US, "%d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }

    public static File g1() {
        return new File(b8.z(4), "sharing/");
    }

    public static void g2(Activity activity) {
        int requestedOrientation;
        WeakReference weakReference;
        if (activity != null && !R1()) {
            try {
                if (f16155g != -10 && (weakReference = f16158i) != null && weakReference.get() == activity) {
                    requestedOrientation = f16155g;
                } else {
                    requestedOrientation = activity.getRequestedOrientation();
                }
                f16153f = requestedOrientation;
                f16155g = -10;
                h = -10;
                f16158i = null;
                activity.setRequestedOrientation(1);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
    }

    public static void g3(Runnable runnable) {
        h3(runnable, 0L);
    }

    public static void h(ColorMatrix colorMatrix, float f7) {
        float f10 = f7 * 255.0f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 1.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 1.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String h0(int i10, boolean z10) {
        int i11 = i10 / 60;
        int i12 = i10 % 60;
        if (z10) {
            return String.format(Locale.US, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%d:%02d", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static byte[] h1(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static void h2() {
        f8.b("[FLAG_SECURE]");
    }

    public static void h3(Runnable runnable, long j10) {
        if (w0.d == null) {
            return;
        }
        if (j10 == 0) {
            w0.d.post(runnable);
        } else {
            w0.d.postDelayed(runnable, j10);
        }
    }

    public static void i(ColorMatrix colorMatrix, float f7) {
        float f10 = f7 + 1.0f;
        float f11 = 1.0f - f10;
        float f12 = 0.3086f * f11;
        float f13 = 0.6094f * f11;
        float f14 = f11 * 0.082f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f12 + f10, f13, f14, 0.0f, 0.0f, f12, f13 + f10, f14, 0.0f, 0.0f, f12, f13, f10 + f14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String i0(long j10, boolean z10, boolean z11) {
        if (j10 == 0) {
            return String.format("%d KB", 0);
        }
        if (j10 < 1024) {
            return String.format("%d B", Long.valueOf(j10));
        }
        if (j10 < 1048576) {
            float f7 = ((float) j10) / 1024.0f;
            if (z10) {
                int i10 = (int) f7;
                if ((f7 - i10) * 10.0f == 0.0f) {
                    return String.format("%d KB", Integer.valueOf(i10));
                }
            }
            return String.format("%.1f KB", Float.valueOf(f7));
        } else if (j10 < 1048576000) {
            float f10 = (((float) j10) / 1024.0f) / 1024.0f;
            if (z10) {
                int i11 = (int) f10;
                if ((f10 - i11) * 10.0f == 0.0f) {
                    return String.format("%d MB", Integer.valueOf(i11));
                }
            }
            return String.format("%.1f MB", Float.valueOf(f10));
        } else {
            float f11 = ((int) ((j10 / 1024) / 1024)) / 1000.0f;
            if (z10) {
                int i12 = (int) f11;
                if ((f11 - i12) * 10.0f == 0.0f) {
                    return String.format("%d GB", Integer.valueOf(i12));
                }
            }
            if (z11) {
                return String.format("%.1f GB", Float.valueOf(f11));
            }
            return String.format("%.2f GB", Float.valueOf(f11));
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
            AccessibilityManager accessibilityManager = (AccessibilityManager) w0.f18945b.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16384);
                obtain.getText().add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    public static void i3(RectF rectF, float f7, float f10, float f11) {
        rectF.set(f10 - ((f10 - rectF.left) * f7), f11 - ((f11 - rectF.top) * f7), ((rectF.right - f10) * f7) + f10, ((rectF.bottom - f11) * f7) + f11);
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
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add((View) method2.invoke(invoke, strArr[i10]));
            }
            return arrayList;
        } catch (Exception e7) {
            f8.e("allGlobalViews()", e7);
            return null;
        }
    }

    public static String j0(int i10) {
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i10 < 0) {
            return String.format(Locale.US, "-%02d:%02d:%02d", Integer.valueOf(Math.abs(i11)), Integer.valueOf(Math.abs(i12)), Integer.valueOf(Math.abs(i13)));
        }
        return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static java.lang.String j1(java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.j1(java.lang.String):java.lang.String");
    }

    public static Bitmap j2(float f7, int i10, View view) {
        if (view == null) {
            return null;
        }
        int width = (int) (view.getWidth() / f7);
        int height = (int) (view.getHeight() / f7);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = 1.0f / f7;
        canvas.scale(f10, f10);
        canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
        view.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(i10, Math.max(width, height) / 180));
        return createBitmap;
    }

    public static void j3(org.telegram.ui.ActionBar.z4 z4Var, String str) {
        if (z4Var != null && str != null) {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) z4Var.getFragmentStack().get(z4Var.getFragmentStack().size() - 1);
            try {
                Field declaredField = k2Var.getClass().getDeclaredField("listView");
                declaredField.setAccessible(true);
                uk0 uk0Var = (uk0) declaredField.get(k2Var);
                uk0Var.e1(new j(k2Var, str, uk0Var), 700, true);
                declaredField.setAccessible(false);
            } catch (Throwable unused) {
            }
        }
    }

    public static int k(int i10, ColorMatrix colorMatrix) {
        float[] array = colorMatrix.getArray();
        int alpha = Color.alpha(i10);
        int red = Color.red(i10);
        int green = Color.green(i10);
        float f7 = red;
        float f10 = green;
        float blue = Color.blue(i10);
        float f11 = alpha;
        float f12 = (array[3] * f11) + (array[2] * blue) + (array[1] * f10) + (array[0] * f7) + array[4];
        float f13 = (array[8] * f11) + (array[7] * blue) + (array[6] * f10) + (array[5] * f7) + array[9];
        float f14 = (array[13] * f11) + (array[12] * blue) + (array[11] * f10) + (array[10] * f7) + array[14];
        float f15 = array[15] * f7;
        return Color.argb(w7.u.b(Math.round((array[18] * f11) + (array[17] * blue) + (array[16] * f10) + f15 + array[19]), 0, 255), w7.u.b(Math.round(f12), 0, 255), w7.u.b(Math.round(f13), 0, 255), w7.u.b(Math.round(f14), 0, 255));
    }

    public static String k0(int i10, int i11) {
        int i12 = i11 / 3600;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 % 60;
        int i15 = i10 / 3600;
        int i16 = (i10 / 60) % 60;
        int i17 = i10 % 60;
        if (i11 == 0) {
            if (i15 == 0) {
                return String.format(Locale.US, "%d:%02d / -:--", Integer.valueOf(i16), Integer.valueOf(i17));
            }
            return String.format(Locale.US, "%d:%02d:%02d / -:--", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17));
        } else if (i15 == 0 && i12 == 0) {
            return String.format(Locale.US, "%d:%02d / %d:%02d", Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i13), Integer.valueOf(i14));
        } else {
            return String.format(Locale.US, "%d:%02d:%02d / %d:%02d:%02d", Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
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
        spannableStringBuilder.setSpan(new y(1, runnable), 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static void k3(Activity activity, int i10) {
        if (activity != null && !Q1()) {
            int i11 = N;
            if (i11 == 0 || i11 == i10) {
                activity.getWindow().setSoftInputMode(48);
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

    public static SpannableStringBuilder l0(CharSequence charSequence, m9 m9Var, CharSequence... charSequenceArr) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            String str = (String) m9Var.l(Integer.valueOf(i10));
            int indexOf = charSequence2.indexOf(str);
            if (indexOf != -1) {
                valueOf.replace(indexOf, str.length() + indexOf, charSequenceArr[i10]);
                charSequence2 = charSequence2.substring(0, indexOf) + charSequenceArr[i10].toString() + charSequence2.substring(str.length() + indexOf);
            }
        }
        return valueOf;
    }

    public static int l1(int i10, int i11, int i12) {
        return Math.max(L(320.0f), (((i10 - i11) - i12) * 35) / 100) + i11;
    }

    public static void l2(r20 r20Var, float f7) {
        m2(r20Var, f7, (int) f7, null);
    }

    public static void l3(Activity activity, boolean z10) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            n3(window.getDecorView(), z10);
        }
    }

    public static void m(WindowManager.LayoutParams layoutParams) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if (i11 >= 30) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            m4.v0.c(layoutParams, i10);
        }
    }

    public static SpannableStringBuilder m0(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (charSequence.toString().contains("%s")) {
            return l0(charSequence, new m4.v0(24), charSequenceArr);
        }
        return l0(charSequence, new m4.v0(26), charSequenceArr);
    }

    public static int m1(String str, boolean z10) {
        int i10;
        String substring;
        int[] iArr = f16148b0;
        int[] iArr2 = f16146a0;
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
                    i10 = substring.charAt(0) % iArr2.length;
                } else {
                    i10 = str.charAt(0) % iArr2.length;
                }
            }
            if (z10) {
                return iArr[i10];
            }
            return iArr2[i10];
        } else if (z10) {
            return iArr[0];
        } else {
            return iArr2[0];
        }
    }

    public static void m2(r20 r20Var, float f7, int i10, ArrayList arrayList) {
        List j10 = j();
        if (j10 == null) {
            r20Var.a(null);
            return;
        }
        m0 = true;
        try {
            try {
                Point point = f16172q;
                int i11 = (int) (point.x / f7);
                int i12 = (int) (((point.y + f16166m) + f16167n) / f7);
                int[] iArr = new int[2];
                Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                float f10 = 1.0f / f7;
                canvas.scale(f10, f10);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                for (int i13 = 0; i13 < j10.size(); i13++) {
                    View view = (View) j10.get(i13);
                    if (!(view instanceof ze0) && (arrayList == null || !arrayList.contains(view))) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof WindowManager.LayoutParams) {
                            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                            if ((layoutParams2.flags & 2) != 0) {
                                canvas.drawColor(i0.b.o(-16777216, (int) (layoutParams2.dimAmount * 255.0f)));
                            }
                        }
                        canvas.save();
                        view.getLocationOnScreen(iArr);
                        canvas.translate(iArr[0] / f7, iArr[1] / f7);
                        try {
                            view.draw(canvas);
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                        canvas.restore();
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, Math.max(i10, Math.max(i11, i12) / 180));
                r20Var.a(createBitmap);
            } catch (Exception e10) {
                f8.g(e10, true);
                r20Var.a(null);
            }
            m0 = false;
        } catch (Throwable th2) {
            m0 = false;
            throw th2;
        }
    }

    public static void m3(Dialog dialog, boolean z10) {
        Window window;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            n3(window.getDecorView(), z10);
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
        animator.setInterpolator(new z(sqrt2, sqrt, d14, d15));
    }

    public static String n0(int i10) {
        String str;
        String str2;
        String str3;
        int i11 = i10 / 3600;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 % 60;
        if (i11 > 0) {
            Locale locale = Locale.US;
            str = a1.g.k(i11, "h");
        } else {
            str = "";
        }
        if (i12 > 0) {
            StringBuilder t10 = a1.g.t(str);
            Locale locale2 = Locale.US;
            if (i11 > 0) {
                str3 = "%02dm";
            } else {
                str3 = "%dm";
            }
            t10.append(String.format(locale2, str3, Integer.valueOf(i12)));
            str = t10.toString();
        }
        StringBuilder t11 = a1.g.t(str);
        Locale locale3 = Locale.US;
        if (i11 <= 0 && i12 <= 0) {
            str2 = "%ds";
        } else {
            str2 = "%02ds";
        }
        t11.append(String.format(locale3, str2, Integer.valueOf(i13)));
        return t11.toString();
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

    public static void n2(ColorMatrix colorMatrix, float f7) {
        colorMatrix.postConcat(new ColorMatrix(new float[]{f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static void n3(View view, boolean z10) {
        int systemUiVisibility;
        int b10;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b10 = v7.u7.b((systemUiVisibility = view.getSystemUiVisibility()), 16, z10))) {
            view.setSystemUiVisibility(b10);
        }
    }

    public static Typeface o() {
        if (f16145a == null) {
            if (uz.V0 && Build.VERSION.SDK_INT >= 28) {
                f16145a = Typeface.create(null, 500, false);
            } else {
                f16145a = o1("fonts/rmedium.ttf");
            }
        }
        return f16145a;
    }

    public static String o0(int i10, int i11) {
        String[] strArr;
        if (i10 != 0) {
            float f7 = i10;
            if (i11 == 0) {
                i11 = i10;
            }
            if (i11 < 1000) {
                return f0(i10);
            }
            int i12 = 0;
            while (true) {
                strArr = f16156g0;
                if (i11 < 1000 || i12 >= strArr.length - 1) {
                    break;
                }
                i11 /= 1000;
                f7 /= 1000.0f;
                i12++;
            }
            if (f7 < 0.1d) {
                return "0";
            }
            float f10 = f7 * 10.0f;
            float f11 = (int) f10;
            if (f10 == f11) {
                Locale locale = Locale.ENGLISH;
                return sc.e.A(f0((int) f7), strArr[i12]);
            }
            return String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f11 / 10.0f), strArr[i12]);
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
                            Typeface.Builder builder = new Typeface.Builder(w0.f18945b.getAssets(), str);
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
                            createFromAsset = Typeface.createFromAsset(w0.f18945b.getAssets(), str);
                        }
                        hashtable.put(str, createFromAsset);
                    } catch (Exception e7) {
                        if (v2.f18578a) {
                            f8.d("Could not get typeface '" + str + "' because " + e7.getMessage());
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

    public static void o3(Activity activity, boolean z10) {
        if (activity != null) {
            r3(activity.getWindow(), z10);
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
            } catch (Exception e7) {
                f8.g(e7, true);
                return 0;
            }
        }
        return 0;
    }

    public static String p0(int i10, String str) {
        Date date = new Date();
        date.setTime(System.currentTimeMillis() + Utilities.f14520b.nextInt(1000) + 1);
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(date);
        if (i10 == 0) {
            StringBuilder u10 = a1.g.u("IMG_", format, ".");
            if (TextUtils.isEmpty(str)) {
                str = "jpg";
            }
            u10.append(str);
            return u10.toString();
        }
        return a1.g.n("VID_", format, ".mp4");
    }

    public static Vibrator p1() {
        if (J == null) {
            J = (Vibrator) w0.f18945b.getSystemService("vibrator");
        }
        return J;
    }

    public static boolean p2(boolean z10) {
        u0 u0Var = u0.f18330f;
        if (z10) {
            u0Var.getClass();
            if (SystemClock.elapsedRealtime() - u0Var.f18333c < 200) {
                u0Var.f18332b = false;
            }
        }
        boolean z11 = u0Var.f18332b;
        if (z10) {
            u0.f18330f.f18332b = false;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (v2.f18578a && z10 && uz.f18549s.length() > 0) {
            f8.b("wasInBackground = " + z11 + " appLocked = " + uz.f18563x + " autoLockIn = " + uz.f18566y + " lastPauseTime = " + uz.B + " uptime = " + elapsedRealtime);
        }
        if (uz.f18549s.length() > 0 && z11) {
            if (!uz.f18563x) {
                if ((uz.f18566y != 0 && uz.B != 0 && !uz.f18563x && uz.B + uz.f18566y <= elapsedRealtime) || elapsedRealtime + 5 < uz.B) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void p3(Dialog dialog, boolean z10) {
        if (dialog != null) {
            r3(dialog.getWindow(), z10);
        }
    }

    public static int[] q(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.xn) {
            return q(((org.telegram.ui.xn) drawable).c(true));
        }
        int[] iArr = new int[4];
        int i10 = -16777216;
        try {
            if (drawable instanceof BitmapDrawable) {
                i10 = p(((BitmapDrawable) drawable).getBitmap());
            } else if (drawable instanceof ColorDrawable) {
                i10 = ((ColorDrawable) drawable).getColor();
            } else if (drawable instanceof org.telegram.ui.Components.f9) {
                int[] iArr2 = ((org.telegram.ui.Components.f9) drawable).f26113a;
                if (iArr2 != null) {
                    if (iArr2.length > 1) {
                        i10 = w0(iArr2[0], iArr2[1]);
                    } else if (iArr2.length > 0) {
                        i10 = iArr2[0];
                    }
                }
            } else if (drawable instanceof jb0) {
                int argb = Color.argb(45, 0, 0, 0);
                iArr[2] = argb;
                iArr[0] = argb;
                int argb2 = Color.argb(61, 0, 0, 0);
                iArr[3] = argb2;
                iArr[1] = argb2;
                return iArr;
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        double[] d32 = d3((i10 >> 16) & 255, (i10 >> 8) & 255, i10 & 255);
        double d10 = d32[1];
        d32[1] = Math.min(1.0d, ((1.0d - d10) * 0.1d) + 0.05d + d10);
        int[] y12 = y1(d32[0], d32[1], Math.max(0.0d, d32[2] * 0.65d));
        iArr[0] = Color.argb(102, y12[0], y12[1], y12[2]);
        iArr[1] = Color.argb(136, y12[0], y12[1], y12[2]);
        int[] y13 = y1(d32[0], d32[1], Math.max(0.0d, d32[2] * 0.72d));
        iArr[2] = Color.argb(102, y13[0], y13[1], y13[2]);
        iArr[3] = Color.argb(136, y13[0], y13[1], y13[2]);
        return iArr;
    }

    public static File q0(String str, boolean z10) {
        try {
            File z11 = b8.z(100);
            if (!z10 && z11 != null) {
                return new File(z11, p0(0, str));
            }
            return new File(w0.f18945b.getExternalFilesDir(Environment.DIRECTORY_PICTURES), p0(0, str));
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static int q1(View view) {
        if (view != null) {
            int height = view.getHeight();
            Point point = f16172q;
            if (height != point.y && view.getHeight() != point.y - f16166m) {
                try {
                    WindowInsets rootWindowInsets = view.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        return rootWindowInsets.getStableInsetBottom();
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
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

    public static void q3(View view, boolean z10) {
        int systemUiVisibility;
        int b10;
        if (view != null && Build.VERSION.SDK_INT >= 26 && systemUiVisibility != (b10 = v7.u7.b((systemUiVisibility = view.getSystemUiVisibility()), 8192, z10))) {
            view.setSystemUiVisibility(b10);
        }
    }

    public static void r(Runnable runnable) {
        if (w0.d == null) {
            return;
        }
        w0.d.removeCallbacks(runnable);
    }

    public static CharSequence r0(String str, String str2, String str3) {
        int i10;
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
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, null), length2, trim2.length() + length2, 33);
            i11 = i14;
        }
        if (i11 != -1 && i11 < trim.length()) {
            spannableStringBuilder.append((CharSequence) trim.substring(i11));
        }
        return spannableStringBuilder;
    }

    public static void r1(View view, ViewGroup viewGroup, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        if (view != null && viewGroup != null) {
            while (view != viewGroup) {
                if (!(view.getParent() instanceof z4.g)) {
                    fArr[0] = view.getX() + fArr[0];
                    fArr[1] = view.getY() + fArr[1];
                }
                view = (View) view.getParent();
            }
        }
    }

    public static void r2(er0 er0Var) {
        if (er0Var == null || er0Var.getAdapter() == null) {
            return;
        }
        if (er0Var.c0()) {
            er0Var.post(new a(er0Var, 1));
        } else {
            er0Var.getAdapter().f();
        }
    }

    public static void r3(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int b10 = v7.u7.b(systemUiVisibility, 8192, z10);
        if (systemUiVisibility != b10) {
            decorView.setSystemUiVisibility(b10);
        }
        if (Build.VERSION.SDK_INT < 35 && window.getStatusBarColor() != 0) {
            window.setStatusBarColor(0);
        }
    }

    public static float s(float f7, float f10, float f11, float f12) {
        if (f11 <= 0.0f) {
            return f7;
        }
        float min = Math.min(f12, f11) * (1.0f / f11);
        return w7.u.a((f7 - ((1.0f - min) * (f10 / f11))) / min, 0.0f, 1.0f);
    }

    public static File s0(boolean z10) {
        try {
            File v02 = v0(z10);
            Date date = new Date();
            date.setTime(System.currentTimeMillis() + Utilities.f14520b.nextInt(1000) + 1);
            if (f16154f0 == null) {
                f16154f0 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
            }
            String format = f16154f0.format(date);
            return new File(v02, "VID_" + format + ".mp4");
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public static int s1(int i10, boolean z10) {
        int i11;
        if (z10) {
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

    public static void s2(kj kjVar, Activity activity, org.telegram.ui.ActionBar.k2 k2Var) {
        TLRPC.Document F0;
        String str;
        File file;
        char c10;
        String str2;
        String str3;
        String str4;
        if (kjVar != null && (F0 = kjVar.F0()) != null) {
            if (kjVar.f16690k.media != null) {
                str = b8.r(null, F0);
            } else {
                str = "";
            }
            String str5 = kjVar.f16690k.attachPath;
            if (str5 != null && str5.length() != 0) {
                file = new File(kjVar.f16690k.attachPath);
            } else {
                file = null;
            }
            if (file == null || !file.exists()) {
                b8.G(e20.f15506s0);
                file = b8.N(kjVar.f16690k, false, true);
            }
            if (file != null && file.exists()) {
                if (k2Var != null && file.getName().toLowerCase().endsWith("attheme")) {
                    org.telegram.ui.ActionBar.s6 v10 = org.telegram.ui.ActionBar.t6.v(file, kjVar.I0(), null, true);
                    if (v10 != null) {
                        k2Var.presentFragment(new k91(v10));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    HashMap hashMap = new HashMap();
                    int i10 = org.telegram.ui.ActionBar.t6.L5;
                    hashMap.put("info1", Integer.valueOf(k2Var.getThemedColor(i10)));
                    hashMap.put("info2", Integer.valueOf(k2Var.getThemedColor(i10)));
                    alertDialog$Builder.m(2131624105, 52, k2Var.getThemedColor(i10), hashMap);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.W = true;
                    x1Var.T = dd.L0(2131749209, null);
                    alertDialog$Builder.k(dd.L0(2131747847, null), null);
                    k2Var.showDialog(x1Var);
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
                            w0.d();
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
                                    w0.d();
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
                            int i11 = org.telegram.ui.ActionBar.t6.L5;
                            hashMap2.put("info1", Integer.valueOf(k2Var.getThemedColor(i11)));
                            hashMap2.put("info2", Integer.valueOf(k2Var.getThemedColor(i11)));
                            alertDialog$Builder2.m(2131624105, 52, k2Var.getThemedColor(i11), hashMap2);
                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                            x1Var2.W = true;
                            alertDialog$Builder2.k(dd.L0(2131747847, null), null);
                            Object[] objArr = new Object[1];
                            objArr[c10] = kjVar.F0().mime_type;
                            x1Var2.T = dd.a0("NoHandleAppInstalled", null, 2131748222, objArr);
                            k2Var.showDialog(x1Var2);
                        }
                    }
                } catch (Exception unused3) {
                    c10 = 0;
                }
            }
        }
    }

    public static void s3(Activity activity, int i10, boolean z10) {
        if (activity != null) {
            u3(activity.getWindow(), i10, z10, null);
        }
    }

    public static int t(java.lang.CharSequence r5, java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.t(java.lang.CharSequence, java.lang.CharSequence):int");
    }

    public static int t0() {
        if (e20.i(e20.f15506s0).p() && !ConnectionsManager.getInstance(e20.f15506s0).isTestBackend()) {
            return e20.f15506s0;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (e20.i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                return i10;
            }
        }
        return e20.f15506s0;
    }

    public static boolean t1(LaunchActivity launchActivity, Intent intent) {
        Uri data;
        ji.b d10;
        if (intent != null) {
            try {
                if ((intent.getFlags() & 1048576) == 0 && (data = intent.getData()) != null && (d10 = ji.b.d(data)) != null && d10.f()) {
                    K3(launchActivity, d10);
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean t2(java.io.File r6, java.lang.String r7, java.lang.String r8, android.app.Activity r9, org.telegram.ui.ActionBar.p6 r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.t2(java.io.File, java.lang.String, java.lang.String, android.app.Activity, org.telegram.ui.ActionBar.p6, boolean):boolean");
    }

    public static void t3(Dialog dialog, int i10, boolean z10, org.telegram.ui.Components.ig igVar) {
        if (dialog != null) {
            u3(dialog.getWindow(), i10, z10, igVar);
        }
    }

    public static void u(Context context, boolean z10) {
        int i10;
        if (context == null) {
            return;
        }
        if (org.telegram.ui.ActionBar.t6.I.q() && z10) {
            i10 = 2131755328;
        } else {
            i10 = 2131755318;
        }
        context.setTheme(i10);
    }

    public static Activity u0() {
        Activity W2 = W(null);
        if (W2 == null || W2.isFinishing()) {
            W2 = LaunchActivity.I1;
        }
        if (W2 != null && !W2.isFinishing()) {
            return W2;
        }
        return W(w0.f18945b);
    }

    public static boolean u1(org.telegram.ui.ActionBar.k2 k2Var) {
        List j10;
        if (k2Var != null) {
            Dialog dialog = k2Var.visibleDialog;
            if (dialog == null || (dialog instanceof org.telegram.ui.ActionBar.x1) || ((dialog instanceof org.telegram.ui.ActionBar.z2) && ((org.telegram.ui.ActionBar.z2) dialog).f21599f1 != null)) {
                if (k2Var.getParentLayout() != null && (j10 = j()) != null && !j10.isEmpty()) {
                    View view = null;
                    for (int size = j10.size() - 1; size >= 0; size--) {
                        view = (View) j10.get(size);
                        Dialog dialog2 = k2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.x1) {
                            View view2 = ((org.telegram.ui.ActionBar.x1) dialog2).f21477c1;
                            while (view2 != null && (view2.getParent() instanceof View)) {
                                view2 = (View) view2.getParent();
                            }
                            if (view == view2) {
                                continue;
                            }
                        }
                        if (!(view instanceof org.telegram.ui.ActionBar.t1) && !(view instanceof ze0)) {
                            break;
                        }
                    }
                    View view3 = k2Var.getParentLayout().getView();
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

    public static boolean u2(kj kjVar, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        File file;
        String str = kjVar.f16690k.attachPath;
        String str2 = null;
        if (str != null && str.length() != 0) {
            file = new File(kjVar.f16690k.attachPath);
        } else {
            file = null;
        }
        if (file == null || !file.exists()) {
            b8.G(kjVar.I1);
            file = b8.N(kjVar.f16690k, false, true);
        }
        File file2 = file;
        int i10 = kjVar.D;
        if (i10 == 9 || i10 == 0) {
            str2 = kjVar.u1();
        }
        return t2(file2, kjVar.S0(), str2, activity, p6Var, z10);
    }

    public static void u3(Window window, int i10, boolean z10, org.telegram.ui.Components.ig igVar) {
        ValueAnimator valueAnimator;
        if (window == null) {
            return;
        }
        HashMap hashMap = f16165l0;
        if (hashMap != null && (valueAnimator = (ValueAnimator) hashMap.get(window)) != null) {
            valueAnimator.cancel();
            f16165l0.remove(window);
        }
        if (!z10) {
            if (igVar != null) {
                org.telegram.ui.Components.bi biVar = igVar.f27091b;
                biVar.F0 = -1;
                biVar.G0 = i10;
                biVar.f21587b.invalidate();
            }
            try {
                window.setNavigationBarColor(i10);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(window.getNavigationBarColor(), i10);
        ofArgb.addUpdateListener(new r(0, igVar, window));
        ofArgb.addListener(new bg.e(window, 15));
        ofArgb.setDuration(200L);
        ofArgb.setInterpolator(org.telegram.ui.Components.gr.f26523f);
        ofArgb.start();
        if (f16165l0 == null) {
            f16165l0 = new HashMap();
        }
        f16165l0.put(window, ofArgb);
    }

    public static void v(Context context, Configuration configuration) {
        float f7;
        boolean z10;
        int i10;
        int i11;
        Display defaultDisplay;
        try {
            float f10 = f16171p;
            f16171p = context.getResources().getDisplayMetrics().density;
            if (f16169o && Math.abs(f10 - f7) > 0.001d) {
                if (org.telegram.ui.ActionBar.t6.f21093m3 != null) {
                    org.telegram.ui.ActionBar.t6.f21093m3 = null;
                    org.telegram.ui.ActionBar.t6.K(context, false);
                }
                if (org.telegram.ui.ActionBar.t6.B0 != null) {
                    org.telegram.ui.ActionBar.t6.B0 = null;
                    org.telegram.ui.ActionBar.t6.T(context);
                }
                if (org.telegram.ui.ActionBar.t6.Q1 != null) {
                    org.telegram.ui.ActionBar.t6.Q1 = null;
                    org.telegram.ui.ActionBar.t6.Z(context);
                }
            }
            f16169o = true;
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
            Point point = f16172q;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
                defaultDisplay.getSize(point);
                float refreshRate = defaultDisplay.getRefreshRate();
                f16173r = refreshRate;
                f16174s = refreshRate;
                float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
                if (supportedRefreshRates != null) {
                    for (float f11 : supportedRefreshRates) {
                        if (f11 > f16174s) {
                            f16174s = f11;
                        }
                    }
                }
                f16175t = 1000.0f / f16173r;
            }
            if (configuration.screenWidthDp != 0) {
                int ceil = (int) Math.ceil(i10 * f16171p);
                if (Math.abs(point.x - ceil) > 3) {
                    point.x = ceil;
                }
            }
            if (configuration.screenHeightDp != 0) {
                int ceil2 = (int) Math.ceil(i11 * f16171p);
                if (Math.abs(point.y - ceil2) > 3) {
                    point.y = ceil2;
                }
            }
            if (f16176u == 0) {
                if (Q1()) {
                    f16176u = (int) (Q0() * 0.6f);
                    v = Q0() - L(28.0f);
                    f16177w = Q0() - L(92.0f);
                } else {
                    f16176u = (int) (Math.min(point.x, point.y) * 0.6f);
                    v = Math.min(point.x, point.y) - L(28.0f);
                    f16177w = Math.min(point.x - L(64.0f), point.y) - L(28.0f);
                }
                f16178x = L(2.0f);
            }
            if (v2.f18578a) {
                f8.d("density = " + f16171p + " display size = " + point.x + " " + point.y + " " + displayMetrics.xdpi + "x" + displayMetrics.ydpi + ", screen layout: " + configuration.screenLayout + ", statusbar height: " + f16166m + ", navbar height: " + f16167n);
            }
            e = ViewConfiguration.get(context).getScaledTouchSlop();
            M = null;
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static File v0(boolean z10) {
        int i10;
        if (!z10 && v2.f18579b && (((i10 = Build.VERSION.SDK_INT) < 33 || w0.f18945b.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) && (i10 > 33 || w0.f18945b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0))) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                if (!file.mkdirs() && !file.exists()) {
                    if (v2.f18578a) {
                        f8.b("failed to create directory");
                        return null;
                    }
                } else {
                    return file;
                }
            } else if (v2.f18578a) {
                f8.b("External storage is not mounted READ/WRITE.");
            }
            return null;
        }
        return b8.z(0);
    }

    public static void v1(View view) {
        if (view != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (!inputMethodManager.isActive()) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
    }

    public static boolean v2(org.telegram.tgnet.TLObject r8, android.app.Activity r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.i0.v2(org.telegram.tgnet.TLObject, android.app.Activity):boolean");
    }

    public static void v3(Activity activity, PictureInPictureParams pictureInPictureParams) {
        if (activity != null && !activity.isDestroyed()) {
            if (pictureInPictureParams == null) {
                b3(activity);
                return;
            }
            try {
                activity.setPictureInPictureParams(pictureInPictureParams);
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
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
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    char charAt = str.charAt(i10);
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
                } catch (Exception e7) {
                    e = e7;
                    f8.g(e, true);
                    return !z10 ? false : false;
                }
            }
        } catch (Exception e10) {
            e = e10;
            z10 = false;
            z11 = false;
        }
        if (!z10 && z11) {
            return true;
        }
    }

    public static int w0(int i10, int i11) {
        int red = Color.red(i10);
        int red2 = Color.red(i11);
        int green = Color.green(i10);
        int green2 = Color.green(i11);
        int blue = Color.blue(i10);
        return Color.argb(255, (red2 / 2) + (red / 2), (green2 / 2) + (green / 2), (Color.blue(i11) / 2) + (blue / 2));
    }

    public static SpannableStringBuilder w1(CharSequence charSequence, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(charSequence)) {
            String lowerCase = charSequence.toString().toLowerCase();
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            int indexOf = lowerCase.indexOf(str);
            while (indexOf >= 0) {
                try {
                    valueOf.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, p6Var), indexOf, Math.min(str.length() + indexOf, charSequence.length()), 0);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                indexOf = lowerCase.indexOf(str, indexOf + 1);
            }
            return valueOf;
        }
        return null;
    }

    public static long w2(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static void w3(Window window) {
        WindowManager windowManager;
        float f7 = f16174s;
        if (window == null || (windowManager = window.getWindowManager()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.preferredRefreshRate = f7;
        try {
            windowManager.updateViewLayout(window.getDecorView(), attributes);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public static boolean x(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !str.equals("*")) {
            String[] split = str.split("\\*");
            String d10 = af.b.d(str2, false);
            int i10 = 0;
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = d10.indexOf(str3, i10);
                    if (indexOf == -1) {
                        return false;
                    }
                    i10 = indexOf + str3.length();
                }
            }
        }
        return true;
    }

    public static Bitmap x0() {
        InputStream inputStream;
        Bitmap bitmap = null;
        try {
            inputStream = w0.f18945b.getResources().openRawResource(2131624177);
            try {
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Throwable th2) {
                th = th2;
                try {
                    f8.g(th, true);
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

    public static CharSequence x1(CharSequence charSequence, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var) {
        if (arrayList != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                SpannableStringBuilder w12 = w1(charSequence, (String) arrayList.get(i11), p6Var);
                if (w12 != null) {
                    charSequence = w12;
                } else {
                    i10++;
                }
            }
            if (i10 != arrayList.size()) {
                return charSequence;
            }
        }
        return null;
    }

    public static SpannableStringBuilder x2(String str, Runnable runnable) {
        return R2(str, -1, 2, runnable, null);
    }

    public static void x3(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        if (windowManager != null && Math.abs(layoutParams.preferredRefreshRate - f16174s) > 0.2d) {
            layoutParams.preferredRefreshRate = f16174s;
            if (view.isAttachedToWindow()) {
                try {
                    windowManager.updateViewLayout(view, layoutParams);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
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

    public static void y0(Surface surface, Bitmap bitmap) {
        if (!surface.isValid()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        PixelCopy.request(surface, bitmap, new q(countDownLatch, 0), Utilities.f14523g.b());
        try {
            countDownLatch.await();
        } catch (InterruptedException e7) {
            e7.printStackTrace();
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
        int i10 = ((int) floor) % 6;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
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

    public static String y2(File file, int i10) {
        InputStream inputStream;
        ThreadLocal threadLocal = f16147b;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            if (file != null) {
                inputStream = new FileInputStream(file);
            } else {
                inputStream = w0.f18945b.getResources().openRawResource(i10);
            }
            try {
                ThreadLocal threadLocal2 = f16149c;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                    threadLocal2.set(bArr2);
                }
                int i11 = 0;
                while (true) {
                    int read = inputStream.read(bArr2, 0, bArr2.length);
                    if (read >= 0) {
                        int i12 = i11 + read;
                        if (bArr.length < i12) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i11);
                            f16147b.set(bArr3);
                            bArr = bArr3;
                        }
                        if (read > 0) {
                            System.arraycopy(bArr2, 0, bArr, i11, read);
                            i11 = i12;
                        }
                    } else {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                inputStream.close();
                return new String(bArr, 0, i11);
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

    public static void y3(ScrollView scrollView, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            scrollView.setTopEdgeEffectColor(i10);
            scrollView.setBottomEdgeEffectColor(i10);
            return;
        }
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
            }
        } catch (Exception unused) {
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
            PixelCopy.request(surfaceView, bitmap, new q(countDownLatch, 1), Utilities.f14523g.b());
            try {
                countDownLatch.await();
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
    }

    public static float z1(float f7, float f10, float f11) {
        return (f7 - f10) / (f11 - f10);
    }

    public static void z2(Bitmap bitmap) {
        A2(Collections.singletonList(bitmap));
    }

    public static void z3(org.telegram.ui.r2 r2Var, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            r2Var.setEdgeEffectColor(i10);
            return;
        }
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            declaredField.setAccessible(true);
            EdgeEffect edgeEffect = (EdgeEffect) declaredField.get(r2Var);
            if (edgeEffect != null) {
                edgeEffect.setColor(i10);
            }
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            declaredField2.setAccessible(true);
            EdgeEffect edgeEffect2 = (EdgeEffect) declaredField2.get(r2Var);
            if (edgeEffect2 != null) {
                edgeEffect2.setColor(i10);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }
}
