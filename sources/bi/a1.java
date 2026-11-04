package bi;

import ai.k3;
import ai.o1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.widget.OverScroller;
import ci.v8;
import ei.c3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.xq;
public final class a1 extends View {
    public static int[] E9;
    public static int[] F9;
    public static int[] G9;
    public static String K9;
    public static e L9;
    public static volatile byte[] O9;
    public static int P9;
    public static int Q9;
    public static int R9;
    public long A0;
    public final Paint A1;
    public String A2;
    public Bitmap A3;
    public final Paint A4;
    public final float[] A5;
    public boolean A6;
    public final RectF A7;
    public long A8;
    public final float[] A9;
    public boolean B0;
    public final Paint B1;
    public int B2;
    public int[] B3;
    public final float B4;
    public final boolean[] B5;
    public boolean B6;
    public final LinearGradient B7;
    public long B8;
    public final Rect[] B9;
    public float C0;
    public final Paint C1;
    public boolean C2;
    public final Paint C3;
    public final Paint C4;
    public int C5;
    public int C6;
    public final Paint C7;
    public float C8;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public final RectF D3;
    public final Paint D4;
    public final LinearGradient D5;
    public final SweepGradient[] D6;
    public final Matrix D7;
    public float D8;
    public final long E;
    public float E0;
    public final TextPaint E1;
    public float E2;
    public boolean E3;
    public final RectF E4;
    public final Paint E5;
    public float E6;
    public final RectF[] E7;
    public float E8;
    public final Matrix F;
    public long F0;
    public final Path F1;
    public float F2;
    public float F3;
    public final float[] F4;
    public final Path F5;
    public float F6;
    public float F7;
    public float F8;
    public x0 G;
    public boolean G0;
    public final RectF G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public final TextPaint G5;
    public float G6;
    public float G7;
    public float G8;
    public x0 H;
    public float H0;
    public Object H1;
    public long H2;
    public float H3;
    public final float[] H4;
    public Drawable H5;
    public float H6;
    public boolean H7;
    public float H8;
    public long I;
    public final TextPaint I0;
    public Object I1;
    public boolean I2;
    public float I3;
    public final float[] I4;
    public StaticLayout I5;
    public float I6;
    public int I7;
    public float I8;
    public final ArrayList J;
    public String J0;
    public int J1;
    public long J2;
    public float J3;
    public final float[] J4;
    public int J5;
    public float J6;
    public final RectF J7;
    public final Path J8;
    public final HashMap K;
    public String K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public final long[] K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public boolean L0;
    public final Drawable L1;
    public float L2;
    public float L3;
    public int L4;
    public final RectF L5;
    public float L6;
    public final HashMap L7;
    public final RectF L8;
    public float M;
    public final g6 M0;
    public final Drawable M1;
    public float M2;
    public final w0 M3;
    public float M4;
    public final Path M5;
    public boolean M6;
    public int M7;
    public final RectF M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public float N4;
    public final float[] N5;
    public long N6;
    public int N7;
    public long N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public long O2;
    public float O3;
    public final Paint O4;
    public float O5;
    public SensorManager O6;
    public float O7;
    public boolean O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public String P2;
    public float P3;
    public final Paint P4;
    public final Matrix P5;
    public final v0 P6;
    public float P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public float Q2;
    public float Q3;
    public final RectF Q4;
    public final Matrix Q5;
    public float Q6;
    public int Q7;
    public Bitmap Q8;
    public float R;
    public final float[] R0;
    public final Drawable R1;
    public long R2;
    public float R3;
    public float R4;
    public final LinearGradient R5;
    public float R6;
    public int R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public Bitmap S2;
    public final Path S3;
    public float S4;
    public final LongSparseArray S5;
    public float S6;
    public long S7;
    public final Paint S8;
    public boolean T;
    public final float[] T0;
    public final Drawable T1;
    public final Paint T2;
    public Bitmap T3;
    public boolean T4;
    public final Path T5;
    public float T6;
    public long T7;
    public final RectF T8;
    public boolean U;
    public final float[] U0;
    public final b1 U1;
    public boolean U2;
    public Bitmap U3;
    public boolean U4;
    public boolean U5;
    public long U6;
    public long U7;
    public int U8;
    public boolean V;
    public final float[] V0;
    public final Paint V1;
    public int V2;
    public float V3;
    public float V4;
    public final RectF V5;
    public long V6;
    public final float V7;
    public String V8;
    public long W;
    public final float[] W0;
    public final String W1;
    public boolean W2;
    public float W3;
    public boolean W4;
    public final RectF W5;
    public boolean W6;
    public int W7;
    public boolean W8;
    public final float[] X0;
    public final w1 X1;
    public long X2;
    public float X3;
    public Bitmap X4;
    public final RectF X5;
    public final Matrix X6;
    public long X7;
    public int X8;
    public final float[] Y0;
    public final ch0 Y1;
    public float Y2;
    public final Paint Y3;
    public int[] Y4;
    public final LinearGradient Y5;
    public final Path Y6;
    public long Y7;
    public long Y8;
    public final float[] Z0;
    public final Paint Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public int Z4;
    public final LinearGradient Z5;
    public final RectF Z6;
    public float Z7;
    public ch0 Z8;
    public boolean f3393a;
    public long f3394a0;
    public final float[] f3395a1;
    public boolean f3396a2;
    public Bitmap f3397a3;
    public final int[] f3398a4;
    public final Paint f3399a5;
    public final Matrix f3400a6;
    public final Path f3401a7;
    public final RectF f3402a8;
    public ch0 f3403a9;
    public final int f3404b;
    public float f3405b0;
    public final byte[] f3406b1;
    public int f3407b2;
    public BitmapShader f3408b3;
    public final float[] f3409b4;
    public final Rect f3410b5;
    public final Paint f3411b6;
    public final Path f3412b7;
    public final TextPaint f3413b8;
    public ch0 f3414b9;
    public final c6.i f3415c;
    public float f3416c0;
    public final boolean[] f3417c1;
    public int c2;
    public final Paint f3418c3;
    public final float[] f3419c4;
    public final RectF f3420c5;
    public float f3421c6;
    public int f3422c7;
    public final TextPaint f3423c8;
    public Object f3424c9;
    public String d;
    public float f3425d0;
    public int f3426d1;
    public final HashMap f3427d2;
    public final Paint f3428d3;
    public final float[] f3429d4;
    public final int[] f3430d5;
    public long f3431d6;
    public final RectF f3432d7;
    public final TextPaint f3433d8;
    public float f3434d9;
    public String f3435e;
    public float f3436e0;
    public boolean f3437e1;
    public Runnable f3438e2;
    public final Matrix f3439e3;
    public final float[] f3440e4;
    public final float[] f3441e5;
    public long f3442e6;
    public final Matrix f3443e7;
    public TextPaint f3444e8;
    public String f3445e9;
    public String f3446f;
    public float f3447f0;
    public final Random f3448f1;
    public boolean f3449f2;
    public final RectF f3450f3;
    public int f3451f4;
    public final float[] f3452f5;
    public boolean f3453f6;
    public final SparseArray f3454f7;
    public final TextPaint f3455f8;
    public long f3456f9;
    public float f3457g0;
    public float f3458g1;
    public boolean f3459g2;
    public float f3460g3;
    public float[] f3461g4;
    public final float[] f3462g5;
    public boolean f3463g6;
    public final Drawable[] g7;
    public StaticLayout f3464g8;
    public float f3465g9;
    public boolean h;
    public float f3466h0;
    public float f3467h1;
    public Bitmap f3468h2;
    public boolean f3469h3;
    public float[] f3470h4;
    public final float[] f3471h5;
    public int f3472h6;
    public final RectF h7;
    public int f3473h8;
    public boolean f3474h9;
    public float f3475i0;
    public int f3476i1;
    public final int[] f3477i2;
    public boolean i3;
    public float[] f3478i4;
    public final float[] f3479i5;
    public int f3480i6;
    public final RectF f3481i7;
    public boolean f3482i8;
    public float f3483i9;
    public float f3484j0;
    public float f3485j1;
    public v8 f3486j2;
    public int f3487j3;
    public int f3488j4;
    public final boolean[] f3489j5;
    public int f3490j6;
    public final RectF f3491j7;
    public final String f3492j8;
    public float f3493j9;
    public float f3494k0;
    public float k1;
    public final s0 f3495k2;
    public final float[] f3496k3;
    public int f3497k4;
    public int f3498k5;
    public float f3499k6;
    public final RectF f3500k7;
    public final String f3501k8;
    public float f3502k9;
    public VelocityTracker f3503l0;
    public float f3504l1;
    public final t0 f3505l2;
    public final float[] f3506l3;
    public PorterDuffColorFilter f3507l4;
    public float f3508l5;
    public float f3509l6;
    public final RectF f3510l7;
    public g5 f3511l8;
    public final OverScroller f3512l9;
    public float m0;
    public float m1;
    public boolean f3513m2;
    public final int[] f3514m3;
    public int f3515m4;
    public float f3516m5;
    public float f3517m6;
    public boolean f3518m7;
    public ch0 f3519m8;
    public final ViewConfiguration f3520m9;
    public y0 f3521n;
    public float f3522n0;
    public String f3523n1;
    public long f3524n2;
    public final int[] f3525n3;
    public float n4;
    public StaticLayout f3526n5;
    public float f3527n6;
    public boolean f3528n7;
    public long f3529n8;
    public VelocityTracker f3530n9;
    public float f3531o0;
    public int f3532o1;
    public long f3533o2;
    public final float[] f3534o3;
    public float f3535o4;
    public boolean f3536o5;
    public final float[] f3537o6;
    public float f3538o7;
    public boolean f3539o8;
    public boolean f3540o9;
    public float f3541p0;
    public String f3542p1;
    public long f3543p2;
    public final float[] f3544p3;
    public float f3545p4;
    public final float[] f3546p5;
    public final Paint f3547p6;
    public float f3548p7;
    public TLRPC.TL_inputStickerSetShortName f3549p8;
    public boolean f3550p9;
    public float f3551q0;
    public String f3552q1;
    public float f3553q2;
    public float f3554q3;
    public float f3555q4;
    public final float[] f3556q5;
    public float f3557q6;
    public long f3558q7;
    public TLRPC.Document f3559q8;
    public final t0 f3560q9;
    public y0 f3561r;
    public int f3562r0;
    public final RectF f3563r1;
    public long f3564r2;
    public final double[] f3565r3;
    public float f3566r4;
    public final float[] r5;
    public boolean f3567r6;
    public boolean f3568r7;
    public long f3569r8;
    public final RippleDrawable[] r9;
    public float f3570s;
    public long f3571s0;
    public boolean f3572s1;
    public final RectF f3573s2;
    public final double[] f3574s3;
    public float f3575s4;
    public final float[] f3576s5;
    public float s6;
    public float f3577s7;
    public LinearGradient[] f3578s8;
    public int f3579s9;
    public final f f3580t0;
    public float f3581t1;
    public boolean f3582t2;
    public final double[] f3583t3;
    public final long[] f3584t4;
    public final float[] f3585t5;
    public boolean f3586t6;
    public float f3587t7;
    public int[] f3588t8;
    public final Paint f3589t9;
    public e f3590u0;
    public float f3591u1;
    public float f3592u2;
    public int f3593u3;
    public final float[] f3594u4;
    public final float[] f3595u5;
    public Object f3596u6;
    public long f3597u7;
    public final c1 f3598u8;
    public final Path f3599u9;
    public e f3600v0;
    public long f3601v1;
    public String f3602v2;
    public int f3603v3;
    public final float[] f3604v4;
    public final float[] f3605v5;
    public float f3606v6;
    public final RectF f3607v7;
    public int f3608v8;
    public final float[] f3609v9;
    public long f3610w;
    public boolean f3611w0;
    public final ArrayList f3612w1;
    public String f3613w2;
    public float f3614w3;
    public final float[] f3615w4;
    public final float[] f3616w5;
    public int f3617w6;
    public long f3618w7;
    public int f3619w8;
    public final float[] f3620w9;
    public float f3621x;
    public boolean f3622x0;
    public long f3623x1;
    public String f3624x2;
    public float f3625x3;
    public final float[] f3626x4;
    public final float[] f3627x5;
    public int f3628x6;
    public float f3629x7;
    public float f3630x8;
    public final long[] f3631x9;
    public float f3632y;
    public boolean f3633y0;
    public boolean f3634y1;
    public String f3635y2;
    public float f3636y3;
    public final long[] f3637y4;
    public final float[] f3638y5;
    public final SparseIntArray f3639y6;
    public float f3640y7;
    public float f3641y8;
    public final long[] y9;
    public boolean f3642z0;
    public final HashMap f3643z1;
    public final TextPaint f3644z2;
    public boolean f3645z3;
    public final boolean[] f3646z4;
    public final float[] f3647z5;
    public int f3648z6;
    public float f3649z7;
    public final RectF[] f3650z8;
    public final float[] f3651z9;
    public static final String[] C9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float D9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int H9 = a.b("Black");
    public static int I9 = a.b("Neon Blue");
    public static final int J9 = org.telegram.messenger.g0.L(70.0f);
    public static final float M9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float N9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final xq S9 = new xq(0.16d, 1.0d, 0.3d, 1.0d);

    public a1(Context context, int i3, String str, String str2, boolean z10, c6.i iVar) {
        super(context);
        e eVar;
        this.f3393a = true;
        this.f3570s = 1.0f;
        this.E = AnimationUtils.currentAnimationTimeMillis();
        this.F = new Matrix();
        this.G = new x0();
        this.J = new ArrayList();
        this.K = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N = -1.0f;
        this.f3580t0 = new f();
        this.f3622x0 = true;
        this.f3633y0 = true;
        this.E0 = 0.0f;
        this.H0 = 1.0f;
        this.I0 = new TextPaint(1);
        this.J0 = "";
        this.K0 = "";
        this.N0 = new float[320];
        this.O0 = new float[320];
        this.P0 = new float[320];
        this.Q0 = new float[320];
        this.R0 = new float[320];
        this.S0 = new float[320];
        this.T0 = new float[320];
        this.U0 = new float[320];
        this.V0 = new float[320];
        this.W0 = new float[320];
        this.X0 = new float[320];
        this.Y0 = new float[320];
        this.Z0 = new float[320];
        this.f3395a1 = new float[320];
        this.f3406b1 = new byte[320];
        this.f3417c1 = new boolean[320];
        this.f3448f1 = new Random();
        this.f3476i1 = 0;
        this.f3563r1 = new RectF();
        this.f3612w1 = new ArrayList();
        this.f3643z1 = new HashMap();
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new TextPaint(1);
        this.F1 = new Path();
        new Path();
        this.G1 = new RectF();
        this.J1 = -1;
        this.V1 = new Paint(1);
        this.W1 = bd.M0(2131746478, null);
        this.Z1 = new Paint(1);
        this.f3407b2 = 1;
        this.f3427d2 = new HashMap();
        this.f3477i2 = new int[3];
        this.f3495k2 = new cs() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    a1 a1Var = a1.this;
                    if (obj == a1Var.f3486j2) {
                        a1Var.y0();
                    }
                }
            }
        };
        this.f3505l2 = new Runnable(this) {
            public final a1 f3856b;

            {
                this.f3856b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        a1 a1Var = this.f3856b;
                        ArrayList arrayList = a1Var.f3612w1;
                        for (int i10 = 0; i10 < Math.min(arrayList.size(), 9); i10++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i10);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i11);
                                i11++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    a1Var.g0(tL_starGiftUnique.f27230id, document);
                                }
                            }
                            a1Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        a1 a1Var2 = this.f3856b;
                        ArrayList arrayList3 = a1Var2.J;
                        if (a1Var2.f3458g1 >= 0.5f && a1Var2.f3476i1 == 1 && !a1Var2.f3550p9) {
                            float f10 = a1Var2.f3483i9;
                            float f11 = a1Var2.f3493j9;
                            float width = (a1Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            RectF rectF = a1Var2.f3607v7;
                            float L2 = (a1Var2.k1 + f11) - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i12 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i12 = L;
                            }
                            if (i12 >= 0) {
                                String[] strArr = a1.C9;
                                if (arrayList3.contains(strArr[i12]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i12])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    a1Var2.c();
                                    a1Var2.i0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f3553q2 = 1.0f;
        this.f3573s2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f3644z2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.B2 = -1;
        this.F2 = -1.0f;
        this.M2 = -1.0f;
        this.O2 = -1L;
        this.P2 = "";
        this.Q2 = -1.0f;
        this.T2 = new Paint(3);
        this.Y2 = 1.0f;
        this.f3418c3 = new Paint(2);
        this.f3428d3 = new Paint(3);
        this.f3439e3 = new Matrix();
        this.f3450f3 = new RectF();
        this.f3496k3 = new float[14];
        this.f3506l3 = new float[14];
        this.f3514m3 = new int[7];
        this.f3525n3 = new int[7];
        this.f3534o3 = new float[15];
        this.f3544p3 = new float[15];
        this.f3554q3 = -1.0f;
        this.f3565r3 = new double[3];
        this.f3574s3 = new double[3];
        this.f3583t3 = new double[3];
        this.f3593u3 = org.telegram.messenger.g0.f22602m;
        this.f3603v3 = org.telegram.messenger.g0.f22603n;
        this.C3 = new Paint(2);
        this.D3 = new RectF();
        this.H3 = 5.0f;
        this.I3 = -0.7071f;
        this.J3 = 0.7071f;
        this.M3 = new w0();
        this.O3 = 1.0f;
        this.Q3 = -1.0f;
        this.S3 = new Path();
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        this.X3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.Y3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Z3 = new int[1024];
        this.f3398a4 = new int[1024];
        this.f3409b4 = new float[1024];
        this.f3419c4 = new float[1024];
        this.f3429d4 = new float[1024];
        this.f3440e4 = new float[1024];
        this.f3497k4 = -1;
        this.f3515m4 = -1;
        this.f3584t4 = new long[2048];
        this.f3594u4 = new float[2048];
        this.f3604v4 = new float[2048];
        this.f3615w4 = new float[2048];
        this.f3626x4 = new float[2048];
        this.f3637y4 = new long[2048];
        this.f3646z4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.A4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B4 = (float) Math.random();
        this.C4 = new Paint(2);
        this.D4 = new Paint(2);
        this.E4 = new RectF();
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new float[96];
        this.K4 = new long[96];
        this.O4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.P4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.Q4 = new RectF();
        this.R4 = 1.0f;
        this.S4 = 1.0f;
        this.U4 = true;
        this.V4 = 1.0f;
        this.f3399a5 = new Paint(2);
        this.f3410b5 = new Rect();
        this.f3420c5 = new RectF();
        this.f3430d5 = new int[4];
        this.f3441e5 = new float[4];
        this.f3452f5 = new float[4];
        this.f3462g5 = new float[240];
        this.f3471h5 = new float[240];
        this.f3479i5 = new float[240];
        this.f3489j5 = new boolean[240];
        this.f3546p5 = new float[240];
        this.f3556q5 = new float[240];
        this.r5 = new float[240];
        this.f3576s5 = new float[240];
        this.f3585t5 = new float[240];
        this.f3595u5 = new float[240];
        this.f3605v5 = new float[240];
        this.f3616w5 = new float[240];
        this.f3627x5 = new float[240];
        this.f3638y5 = new float[240];
        this.f3647z5 = new float[240];
        this.A5 = new float[240];
        this.B5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.D5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.E5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.F5 = new Path();
        this.G5 = new TextPaint(65);
        this.K5 = new RectF();
        this.L5 = new RectF();
        this.M5 = new Path();
        this.N5 = new float[7];
        this.P5 = new Matrix();
        this.Q5 = new Matrix();
        this.R5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.S5 = new LongSparseArray();
        this.T5 = new Path();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new RectF();
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Z5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.f3400a6 = new Matrix();
        this.f3411b6 = new Paint();
        this.f3517m6 = 0.85f;
        this.f3537o6 = new float[320];
        Paint paint6 = new Paint();
        this.f3547p6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.f3557q6 = 1.0f;
        this.f3567r6 = true;
        this.f3606v6 = -1.0f;
        this.f3617w6 = -1;
        this.f3639y6 = new SparseIntArray();
        this.f3648z6 = -1;
        this.C6 = -1;
        this.D6 = new SweepGradient[4];
        this.P6 = new v0(this);
        this.X6 = new Matrix();
        this.Y6 = new Path();
        this.Z6 = new RectF();
        this.f3401a7 = new Path();
        this.f3412b7 = new Path();
        this.f3422c7 = -1;
        this.f3432d7 = new RectF();
        this.f3443e7 = new Matrix();
        this.f3454f7 = new SparseArray();
        this.h7 = new RectF();
        this.f3481i7 = new RectF();
        this.f3491j7 = new RectF();
        this.f3500k7 = new RectF();
        this.f3510l7 = new RectF();
        this.f3538o7 = 1.0f;
        this.f3548p7 = 1.0f;
        this.f3577s7 = 1.0f;
        this.f3587t7 = 1.0f;
        this.f3607v7 = new RectF();
        this.A7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.B7 = linearGradient2;
        Paint paint7 = new Paint();
        this.C7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.D7 = new Matrix();
        this.E7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.F7 = -1.0f;
        this.G7 = -1.0f;
        this.J7 = new RectF();
        this.K7 = new HashMap();
        this.L7 = new HashMap();
        this.M7 = -1;
        this.N7 = H9;
        this.Q7 = -1;
        this.R7 = -1;
        this.V7 = org.telegram.messenger.g0.L(20.17f);
        this.W7 = -1;
        this.Y7 = -1L;
        this.Z7 = 1.0f;
        this.f3402a8 = new RectF();
        this.f3413b8 = new TextPaint(1);
        this.f3423c8 = new TextPaint(1);
        this.f3433d8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.f3455f8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.f3492j8 = bd.M0(2131746500, null);
        this.f3501k8 = bd.M0(2131746510, null);
        int[] iArr = a.f3352b;
        this.f3578s8 = new LinearGradient[iArr.length];
        this.f3588t8 = new int[iArr.length];
        this.f3598u8 = new c1(0);
        this.f3608v8 = -100;
        this.f3619w8 = -100;
        this.f3650z8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.J8 = new Path();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.M8 = new RectF();
        this.R8 = new Paint(3);
        this.S8 = new Paint(1);
        this.T8 = new RectF();
        this.f3434d9 = -1.0f;
        this.f3512l9 = new OverScroller(getContext());
        this.f3520m9 = ViewConfiguration.get(getContext());
        this.f3560q9 = new Runnable(this) {
            public final a1 f3856b;

            {
                this.f3856b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        a1 a1Var = this.f3856b;
                        ArrayList arrayList = a1Var.f3612w1;
                        for (int i10 = 0; i10 < Math.min(arrayList.size(), 9); i10++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i10);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i11);
                                i11++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    a1Var.g0(tL_starGiftUnique.f27230id, document);
                                }
                            }
                            a1Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        a1 a1Var2 = this.f3856b;
                        ArrayList arrayList3 = a1Var2.J;
                        if (a1Var2.f3458g1 >= 0.5f && a1Var2.f3476i1 == 1 && !a1Var2.f3550p9) {
                            float f10 = a1Var2.f3483i9;
                            float f11 = a1Var2.f3493j9;
                            float width = (a1Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            RectF rectF = a1Var2.f3607v7;
                            float L2 = (a1Var2.k1 + f11) - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i12 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i12 = L;
                            }
                            if (i12 >= 0) {
                                String[] strArr = a1.C9;
                                if (arrayList3.contains(strArr[i12]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i12])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    a1Var2.c();
                                    a1Var2.i0();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.r9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.f3579s9 = -1;
        this.f3589t9 = new Paint(1);
        this.f3599u9 = new Path();
        this.f3609v9 = new float[12];
        this.f3620w9 = new float[12];
        this.f3631x9 = new long[12];
        this.y9 = new long[12];
        this.f3651z9 = new float[12];
        this.A9 = new float[12];
        this.B9 = new Rect[12];
        for (int i10 = 0; i10 < 12; i10++) {
            this.B9[i10] = new Rect();
        }
        this.f3404b = i3;
        this.d = str;
        this.f3446f = str2;
        this.h = z10;
        this.f3415c = iVar;
        this.M1 = w(2131232363);
        this.N1 = w(2131232114);
        this.O1 = w(2131232319);
        this.V1.setTypeface(org.telegram.messenger.g0.o());
        Drawable w10 = w(2131232097);
        this.P1 = w10;
        Drawable w11 = w(2131231512);
        this.Q1 = w11;
        Drawable w12 = w(2131231827);
        this.R1 = w12;
        this.X1 = new w1(true);
        this.S1 = w(2131232342);
        this.T1 = w(2131232327);
        this.U1 = new b1();
        this.K1 = w(2131232103);
        this.L1 = w(2131231857);
        this.g7 = new Drawable[]{w10, w11, w12};
        ch0 ch0Var = new ch0(2131624136, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        this.Y1 = ch0Var;
        ch0Var.R(this);
        ch0Var.K(1);
        ch0Var.setCallback(this);
        ch0Var.start();
        Paint paint8 = this.Z1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Z1.setStrokeCap(Paint.Cap.ROUND);
        this.Z1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.D1.setTextSize(org.telegram.messenger.g0.L(11.0f));
        this.E1.setTypeface(org.telegram.messenger.g0.o());
        this.B1.setStyle(style);
        g6 g6Var = new g6(false, true, true);
        this.M0 = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.n(0.35f, 280L, xq.h);
        g6Var.setCallback(this);
        g6Var.f33983b = 3;
        y0 t10 = t(H9);
        this.f3521n = t10;
        this.f3422c7 = W0(t10.f3920c);
        if (str != null) {
            String str3 = this.d;
            if (str3.equals(K9) && (eVar = L9) != null) {
                this.f3590u0 = eVar;
            } else {
                e c2 = f.c(str3, org.telegram.messenger.g0.L(240.0f), dc.b.M, 0.75f, null);
                this.f3590u0 = c2;
                L9 = c2;
                K9 = str3;
            }
            this.f3580t0.a(this.f3590u0);
        }
        u1(false);
    }

    public static void C0(double d, double d10, double d11, double[] dArr) {
        double d12 = (0.2158037573d * d11) + (0.3963377774d * d10) + d;
        double d13 = (d - (0.1055613458d * d10)) - (0.0638541728d * d11);
        double d14 = (d - (d10 * 0.0894841775d)) - (d11 * 1.291485548d);
        double d15 = d12 * d12 * d12;
        double d16 = d13 * d13 * d13;
        double d17 = d14 * d14 * d14;
        dArr[0] = (0.2309699292d * d17) + ((4.0767416621d * d15) - (3.3077115913d * d16));
        dArr[1] = ((2.6097574011d * d16) + ((-1.2684380046d) * d15)) - (0.3413193965d * d17);
        dArr[2] = (d17 * 1.707614701d) + ((d15 * (-0.0041960863d)) - (d16 * 0.7034186147d));
    }

    public static int D0(float f10, float f11, float f12, int i3) {
        float f13;
        float i12 = i1(Color.red(i3));
        float i13 = i1(Color.green(i3));
        float i14 = i1(Color.blue(i3));
        float cbrt = (float) Math.cbrt((0.051445995f * i14) + (0.53633255f * i13) + (0.41222146f * i12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * i14) + (0.6806995f * i13) + (0.2119035f * i12));
        float f14 = i14 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f14 + (i13 * 0.28171885f) + (i12 * 0.08830246f));
        float f15 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f16 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f15, f16);
        if (hypot > 1.0E-5f) {
            f13 = Math.min(f12, f11 * hypot) / hypot;
        } else {
            f13 = 0.0f;
        }
        float f17 = f15 * f13;
        float f18 = f16 * f13;
        float f19 = (0.21580376f * f18) + (0.39633778f * f17) + f10;
        float f20 = (f10 - (0.105561346f * f17)) - (0.06385417f * f18);
        float f21 = (f10 - (f17 * 0.08948418f)) - (f18 * 1.2914855f);
        float f22 = f19 * f19 * f19;
        float f23 = f20 * f20 * f20;
        float f24 = f21 * f21 * f21;
        return Color.rgb(w0((0.23096994f * f24) + ((4.0767417f * f22) - (3.3077116f * f23))), w0(((2.6097574f * f23) + ((-1.268438f) * f22)) - (0.34131938f * f24)), w0((f24 * 1.7076147f) + ((f22 * (-0.0041960864f)) - (f23 * 0.7034186f))));
    }

    public static float S(float f10, float f11) {
        float f12 = f10 - 1.0f;
        return com.google.android.recaptcha.internal.a.v(f11, f12, f12, ((f11 + 1.0f) * f12 * f12 * f12) + 1.0f);
    }

    public static int W0(int i3) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        o1(i3, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i3) {
        double[] dArr = new double[3];
        i0.a.j(i3, dArr);
        return i0.a.o(i0.a.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f10, int i3) {
        return i0.a.o(i3, (int) (Utilities.l(f10) * Color.alpha(i3)));
    }

    public static void b0(double d, double d10, double d11, double[] dArr) {
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        C0(d, d10 * cos, d10 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d12 = 0.0d;
        double d13 = d10;
        for (int i3 = 0; i3 < 14; i3++) {
            double d14 = (d12 + d13) / 2.0d;
            C0(d, d14 * cos, d14 * sin, dArr);
            if (p0(dArr)) {
                d12 = d14;
            } else {
                d13 = d14;
            }
        }
        C0(d, d12 * cos, d12 * sin, dArr);
    }

    public static float c0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double d0(double d) {
        if (d <= 0.0031308d) {
            return d * 12.92d;
        }
        return (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static int e1(int i3) {
        if (a.h != null) {
            return i3;
        }
        if (a.f3356g == null) {
            int length = a.f3351a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i10 = 0;
            for (int i11 = 0; i11 < 80; i11++) {
                int b10 = a.b(a.f3355f[i11]);
                if (b10 >= 0 && !zArr[b10]) {
                    zArr[b10] = true;
                    iArr[i10] = b10;
                    i10++;
                }
            }
            for (int i12 = 0; i12 < length; i12++) {
                if (!zArr[i12]) {
                    iArr[i10] = i12;
                    i10++;
                }
            }
            a.f3356g = iArr;
        }
        return a.f3356g[i3];
    }

    public static float f1(boolean z10, boolean z11, float f10) {
        if (z10) {
            if (f10 > 0.0f) {
                return f1.y(f10, 0.18f, 1.0f, 0.0f);
            }
        } else {
            if (!z11) {
                f10 -= 0.135f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 < 0.315f) {
                return h(f10 / 0.315f);
            }
        }
        return 1.0f;
    }

    public static int g(float f10, int i3) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f)) << 24) | (i3 & 16777215);
    }

    public static float g1(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static float h(float f10) {
        float f11 = f10 - 1.0f;
        return com.google.android.recaptcha.internal.a.v(f11, 1.70158f, f11, (2.70158f * f11 * f11 * f11) + 1.0f);
    }

    public static double h1(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public static boolean i() {
        if (v.f() && lc.e(256)) {
            return true;
        }
        return false;
    }

    public static float i1(int i3) {
        float f10 = i3 / 255.0f;
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float j(long j10, float f10, float f11) {
        if (j10 == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = ((float) (AnimationUtils.currentAnimationTimeMillis() - j10)) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f10 * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f12 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return org.telegram.messenger.g0.T1(f10 + 1.0f, 1.0f - f11, com.google.android.recaptcha.internal.a.B(f12, 2.0f, 3.0f, f12 * f12));
        }
        float f13 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return org.telegram.messenger.g0.T1(1.0f - f11, 1.0f, com.google.android.recaptcha.internal.a.B(f13, 2.0f, 3.0f, f13 * f13));
    }

    public static void k() {
        if (E9 == null) {
            int length = a.f3352b.length;
            E9 = new int[length];
            F9 = new int[length];
            G9 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                E9[i3] = x(a.f3352b[i3], false);
                F9[i3] = x(a.f3353c[i3], true);
                G9[i3] = v(E9[i3], F9[i3]);
            }
        }
    }

    public static float k0(int i3, int i10, int i11) {
        int i12 = i11 * 1442695041;
        int i13 = i12 + (i10 * 668265263) + (i3 * 374761393);
        int i14 = ((i13 >>> 13) ^ i13) * 1274126177;
        return ((i14 ^ (i14 >>> 16)) & 65535) / 65535.0f;
    }

    public static int l1(int i3, int i10) {
        int i11 = i3 | (-16777216);
        int i12 = i10 | (-16777216);
        if (i0.a.g(i11, i12) < 1.15d) {
            double[] dArr = new double[3];
            i0.a.j(i11, dArr);
            for (int i13 = 0; i13 < 40 && i0.a.g(i11, i12) < 1.15d; i13++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i11 = i0.a.b(max, dArr[1], dArr[2]);
            }
        }
        return i0.a.o(i11, 95);
    }

    public static boolean m0(RectF rectF, float f10, float f11) {
        float L = org.telegram.messenger.g0.L(8.0f);
        if (!rectF.isEmpty() && f10 >= rectF.left - L && f10 <= rectF.right + L && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
            return true;
        }
        return false;
    }

    public static void o1(int i3, double[] dArr) {
        double v02 = v0(Color.red(i3) / 255.0d);
        double v03 = v0(Color.green(i3) / 255.0d);
        double v04 = v0(Color.blue(i3) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * v04) + (0.5363325363d * v03) + (0.4122214708d * v02));
        double cbrt2 = Math.cbrt((0.1073969566d * v04) + (0.6806995451d * v03) + (0.2119034982d * v02));
        double d = v04 * 0.6299787005d;
        double cbrt3 = Math.cbrt(d + (v03 * 0.2817188376d) + (v02 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static boolean p0(double[] dArr) {
        double d = dArr[0];
        if (d >= -1.0E-4d && d <= 1.0001d) {
            double d10 = dArr[1];
            if (d10 >= -1.0E-4d && d10 <= 1.0001d) {
                double d11 = dArr[2];
                if (d11 >= -1.0E-4d && d11 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i3) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = 16777215 & i3;
        int i12 = i3 >>> 24;
        for (int i13 = 0; i13 < i10; i13++) {
            iArr[i13] = ((((iArr[i13] >>> 24) * i12) / 255) << 24) | i11;
        }
        if (bitmap2 == null || !bitmap2.isMutable() || bitmap2.getWidth() != width || bitmap2.getHeight() != height) {
            bitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmap2;
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        bitmap3.setHasMipMap(bitmap.hasMipMap());
        return bitmap3;
    }

    public static double r(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static Bitmap r0(x0 x0Var, Bitmap bitmap, boolean z10) {
        if (z10) {
            Bitmap bitmap2 = x0Var.f3902m;
            if (bitmap2 == null || x0Var.f3903n != bitmap || x0Var.f3905p != x0Var.f3899j) {
                x0Var.f3902m = q0(bitmap, bitmap2, x0Var.f3899j);
                x0Var.f3903n = bitmap;
                x0Var.f3905p = x0Var.f3899j;
            }
            return x0Var.f3902m;
        }
        Bitmap bitmap3 = x0Var.f3900k;
        if (bitmap3 == null || x0Var.f3901l != bitmap || x0Var.f3904o != x0Var.f3899j) {
            x0Var.f3900k = q0(bitmap, bitmap3, x0Var.f3899j);
            x0Var.f3901l = bitmap;
            x0Var.f3904o = x0Var.f3899j;
        }
        return x0Var.f3900k;
    }

    public static void s(int[] iArr, byte[] bArr, int i3) {
        int i10 = 16777215 & i3;
        int i11 = i3 >>> 24;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = ((((bArr[i12] & 255) * i11) / 255) << 24) | i10;
        }
    }

    private void setPattern(x0 x0Var) {
        boolean z10;
        if (this.f3459g2) {
            x0 x0Var2 = this.H;
            if (x0Var2 != null && x0Var2 != this.G) {
                P0(x0Var2);
            }
            x0 x0Var3 = this.G;
            if (x0Var3 != x0Var) {
                P0(x0Var3);
            }
            this.H = null;
            this.G = x0Var;
            if (x0Var.f3892a == 2) {
                Z(x0Var);
                if (x0Var.f3895e == null) {
                    x0Var.f3896f = this.f3468h2;
                }
            }
            this.I = AnimationUtils.currentAnimationTimeMillis() - 10000;
            invalidate();
            return;
        }
        if (this.f3570s < 1.0f && this.f3561r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x0Var.h = z10;
        if (x0Var.f3892a == 2) {
            Z(x0Var);
            if (x0Var.f3895e == null) {
                x0Var.f3896f = this.f3468h2;
            }
        }
        x0 x0Var4 = this.H;
        if (x0Var4 != null && x0Var4 != this.G) {
            P0(x0Var4);
        }
        this.H = this.G;
        this.G = x0Var;
        this.I = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    private void setSceneFromCard(y0 y0Var) {
        Y0(y0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f3459g2) {
            return;
        }
        this.f3553q2 = j(this.f3533o2, 0.03f, 0.005f);
        this.f3533o2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static y0 t(int i3) {
        ?? obj = new Object();
        obj.f3918a = 0;
        obj.f3922f = i3;
        if (i3 == I9) {
            obj.f3919b = -12602881;
            obj.f3920c = -15308082;
            obj.d = a.d[i3];
        } else {
            obj.f3919b = x(a.f3352b[i3], false);
            obj.f3920c = x(a.f3353c[i3], true);
            obj.d = a.d[i3];
        }
        if (i3 == I9) {
            obj.f3921e = -16747023;
        } else {
            k();
            obj.f3921e = G9[i3];
        }
        obj.h = Z0(obj.f3919b);
        obj.f3923g = f.k(0.5f, obj.f3919b, obj.f3920c);
        return obj;
    }

    public static float t1(float f10, float f11, float f12) {
        float N = (f10 - f12) / org.telegram.messenger.g0.N(1.7f);
        float N2 = f11 / org.telegram.messenger.g0.N(3.2f);
        float w12 = w1(N * 2.6f, N2 * 1.7f, 91) * 0.32f;
        return org.telegram.messenger.g0.N(3.6f) * ((w12 + (w1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    public static int u(y0 y0Var) {
        int i3;
        double d;
        int i10;
        if (y0Var != null) {
            i3 = i0.a.f(0.5f, y0Var.f3919b, y0Var.f3920c);
        } else {
            i3 = -16777216;
        }
        if (y0Var != null) {
            d = i0.a.h(y0Var.f3919b);
        } else {
            d = 0.3d;
        }
        float[] fArr = d1.f3698b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f10 = (fArr[11] / 100.0f) + 1.0f;
        float f11 = ((0.5f - (f10 * 0.5f)) + max) * 255.0f;
        int k10 = i0.a.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(i3) * f10) + f11))), Math.max(0, Math.min(255, Math.round((Color.green(i3) * f10) + f11))), Math.max(0, Math.min(255, Math.round((f10 * Color.blue(i3)) + f11)))));
        if (y0Var != null) {
            i10 = y0Var.h;
        } else {
            i10 = 1073741824;
        }
        return i0.a.k(i10, k10);
    }

    public static double u0(int i3, int i10) {
        long j10 = (i10 * (-4417276706812531889L)) ^ (i3 * (-7046029254386353131L));
        long j11 = (j10 ^ (j10 >>> 31)) * (-4658895280553007687L);
        long j12 = (j11 ^ (j11 >>> 27)) * (-7723592293110705685L);
        return ((j12 ^ (j12 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static int v(int i3, int i10) {
        double d;
        double d10;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        o1(i10, dArr);
        o1(i3, dArr2);
        double d11 = dArr[0];
        if (d11 < 0.45d) {
            d = d11 - 0.03d;
        } else {
            d = 2.0d;
        }
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d12 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d13 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d13, d12);
            d10 = 2.0d;
            min = Math.min(0.012d, Math.hypot(d12, d13));
        } else {
            d10 = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d14 = 0.9d;
        double d15 = 0.2d;
        int i11 = 0;
        while (i11 < 12) {
            double d16 = (d15 + d14) / d10;
            double d17 = atan2;
            double d18 = min;
            b0(d16, d18, d17, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d15 = d16;
            } else {
                d14 = d16;
            }
            i11++;
            min = d18;
            atan2 = d17;
        }
        double d19 = atan2;
        double d20 = min;
        double d21 = (d15 + d14) / d10;
        if (d21 > d) {
            d21 = Math.max(0.05d, d);
        }
        b0(d21, d20, d19, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f10) {
        int floor = (int) Math.floor(f10);
        float f11 = f10 - floor;
        float B = com.google.android.recaptcha.internal.a.B(f11, 2.0f, 3.0f, f11 * f11);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * B) + c02;
    }

    public static int w0(float f10) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f;
        }
        return Math.round(Math.max(0.0f, Math.min(1.0f, pow)) * 255.0f);
    }

    public static float w1(float f10, float f11, int i3) {
        int floor = (int) Math.floor(f10);
        int floor2 = (int) Math.floor(f11);
        float f12 = f10 - floor;
        float f13 = f11 - floor2;
        float B = com.google.android.recaptcha.internal.a.B(f12, 2.0f, 3.0f, f12 * f12);
        float B2 = com.google.android.recaptcha.internal.a.B(f13, 2.0f, 3.0f, f13 * f13);
        float k02 = k0(floor, floor2, i3);
        int i10 = floor + 1;
        float k03 = k0(i10, floor2, i3);
        int i11 = floor2 + 1;
        float k04 = k0(floor, i11, i3);
        float k05 = k0(i10, i11, i3);
        float y9 = com.google.android.recaptcha.internal.a.y(k03, k02, B, k02);
        return (((((k05 - k04) * B) + k04) - y9) * B2) + y9;
    }

    public static int x(int i3, boolean z10) {
        double[] dArr = new double[3];
        i0.a.j(i3, dArr);
        if (!z10) {
            return i3;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d10 = dArr[2] * 1.03d;
        dArr[2] = d10;
        return i0.a.b(max, d, d10);
    }

    public static PorterDuffColorFilter x0(x0 x0Var) {
        float[] fArr = d1.f3698b;
        int i3 = ((int) (fArr[14] * 10.0f)) ^ x0Var.f3908s;
        if (x0Var.f3910u == null || x0Var.f3909t != i3) {
            x0Var.f3909t = i3;
            x0Var.f3910u = new PorterDuffColorFilter(i0.a.f(fArr[14] / 100.0f, x0Var.f3908s, -1), PorterDuff.Mode.SRC_IN);
        }
        return x0Var.f3910u;
    }

    public static float y1(float f10) {
        return 1.0f - ((float) Math.pow(1.0f - f10, 2.4000000953674316d));
    }

    public final void A(android.graphics.Canvas r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.A(android.graphics.Canvas, int):void");
    }

    public final PorterDuffColorFilter A0(x0 x0Var) {
        float[] fArr = d1.f3698b;
        int i3 = ((int) (fArr[30] * 10.0f)) ^ (x0Var.f3908s * 31);
        if (this.f3507l4 == null || this.f3515m4 != i3) {
            this.f3515m4 = i3;
            this.f3507l4 = new PorterDuffColorFilter(i0.a.f(fArr[30] / 100.0f, x0Var.f3908s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.f3507l4;
    }

    public final void B(android.graphics.Canvas r79, int r80) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.B(android.graphics.Canvas, int):void");
    }

    public final void B0() {
        c6.i iVar;
        o0 o0Var;
        if (!this.f3449f2 && (iVar = this.f3415c) != null && (o0Var = ((j0) iVar.f4235b).f3755e) != null) {
            o0Var.j();
        }
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f10, float f11) {
        float f12;
        int i3;
        int i10;
        RectF rectF2;
        float f13;
        float f14;
        float[][] fArr;
        float f15;
        float f16;
        int i11;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i12;
        int i13;
        int i14;
        Path path2 = path;
        int i15 = 1;
        if (path2 == null) {
            if (this.A6) {
                i14 = 1;
            } else if (this.B6) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            if (u.a(f10, f11, i14, canvas, rectF)) {
                return;
            }
        }
        int i16 = this.C6;
        SweepGradient[] sweepGradientArr = this.D6;
        int i17 = 4;
        float[][] fArr2 = d1.f3697a;
        if (i16 != 1) {
            this.C6 = 1;
            int i18 = 0;
            while (i18 < i17) {
                float[] fArr3 = fArr2[i18];
                int i19 = i17;
                int[] iArr = new int[73];
                int i20 = i15;
                float[] fArr4 = new float[73];
                int i21 = 0;
                for (int i22 = 73; i21 < i22; i22 = 73) {
                    int i23 = i18;
                    double radians = Math.toRadians(i21 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    if (((float) Math.sin(radians)) < 0.0f) {
                        f12 = fArr3[11];
                    } else {
                        f12 = fArr3[12];
                    }
                    float f23 = f12 / 100.0f;
                    iArr[i21] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f23) * pow) + f23), 0);
                    fArr4[i21] = i21 / 72.0f;
                    i21++;
                    i18 = i23;
                }
                int i24 = i18;
                sweepGradientArr[i24] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i18 = i24 + 1;
                i17 = i19;
                i15 = i20;
            }
        }
        int i25 = i15;
        int i26 = i17;
        if (this.A6) {
            i3 = i25;
        } else if (this.B6) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        float[] fArr5 = fArr2[i3];
        float f24 = this.E6;
        float[] fArr6 = d1.f3698b;
        float f25 = f24 * fArr6[0];
        float f26 = (this.F6 * fArr6[i25]) / 100.0f;
        float N = org.telegram.messenger.g0.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.f3432d7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i10 = i3;
                Matrix matrix = this.X6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.Y6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i10 = i3;
            }
            f13 = Math.max(0.0f, f10 - N);
        } else {
            i10 = i3;
            rectF2 = rectF;
            f13 = f10;
        }
        Matrix matrix2 = this.f3443e7;
        matrix2.setRotate(f25);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = org.telegram.messenger.g0.N(fArr5[i26]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i10];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.B1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f11 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.W5;
                rectF3.set(rectF2);
                float f27 = (-N2) / 2.0f;
                rectF3.inset(f27, f27);
                float f28 = (N2 / 2.0f) + f13;
                canvas.drawRoundRect(rectF3, f28, f28, paint);
            } else {
                canvas.save();
                v.b(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f25);
        float f29 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = org.telegram.messenger.g0.N(fArr5[0]);
        float N4 = org.telegram.messenger.g0.N(fArr5[2]);
        if (this.B6) {
            f14 = 0.0f;
        } else {
            f14 = this.f3421c6 * ((fArr6[21] * 1.25f) / 100.0f);
        }
        int i27 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i27 > 0 && this.f3645z3) {
            fArr = fArr2;
            f15 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        } else {
            fArr = fArr2;
            f15 = 0.0f;
        }
        if (i27 > 0 && this.f3645z3) {
            f16 = c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        } else {
            f16 = 0.0f;
        }
        float min = Math.min(1.0f, ((f15 * f14) + 1.0f) * (f26 + 1.0f) * (fArr5[i25] / 100.0f));
        float min2 = Math.min(1.0f, ((f14 * f16) + 1.0f) * (1.0f - f26) * (fArr5[3] / 100.0f));
        if (Build.VERSION.SDK_INT >= 29) {
            i11 = i25;
        } else {
            i11 = 0;
        }
        int i28 = 0;
        for (int i29 = 2; i28 < i29; i29 = 2) {
            if (i28 == 0) {
                f17 = N3;
            } else {
                f17 = -N4;
            }
            if (i28 == 0) {
                f18 = min;
            } else {
                f18 = min2;
            }
            if (f18 <= 0.004f || Math.abs(f17) < 0.1f) {
                f19 = f13;
                f20 = min;
                f21 = min2;
                f22 = f29;
                i12 = i11;
                i13 = i25;
            } else {
                canvas.save();
                Path path4 = this.f3401a7;
                f20 = min;
                Path path5 = this.f3412b7;
                if (path2 == null) {
                    f21 = min2;
                    f22 = f29;
                    float min3 = Math.min(f13, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f19 = f13;
                    RectF rectF4 = this.Z6;
                    rectF4.set(rectF2);
                    i12 = i11;
                    rectF4.offset(f22 * f17, f17 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f19 = f13;
                    f21 = min2;
                    f22 = f29;
                    i12 = i11;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f22 * f17, f17 * cos);
                }
                v.b(canvas, path5);
                Paint paint2 = this.A1;
                if (i12 == 0) {
                    float f30 = fArr[i10][10];
                    int i30 = this.f3422c7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i30) - 255) * f30) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i30) - 255) * f30) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i30) - 255) * f30) + 255.0f)))));
                    paint2.setAlpha((int) (f18 * 255.0f * f11));
                    i13 = i25;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f18)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f11 * 255.0f));
                    i13 = i25;
                    v.i(i13, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i12 != 0) {
                    v.i(0, paint2);
                }
                canvas.restore();
            }
            i28++;
            i25 = i13;
            min = f20;
            min2 = f21;
            f29 = f22;
            f13 = f19;
            i11 = i12;
        }
    }

    public final void D(android.graphics.Canvas r18, bi.x0 r19, int r20, float r21, float r22, float r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.D(android.graphics.Canvas, bi.x0, int, float, float, float, float, float):void");
    }

    public final void E(Canvas canvas, int i3, int i10, x0 x0Var, x0 x0Var2, float f10, boolean z10, boolean z11) {
        float f11;
        float f12;
        boolean z12;
        float f13;
        int i11;
        float f14;
        boolean z13;
        float f15;
        float f16;
        int i12;
        int i13;
        a1 a1Var = this;
        x0 x0Var3 = x0Var;
        x0 x0Var4 = x0Var2;
        a1Var.X(x0Var3);
        a1Var.X(x0Var4);
        float L = org.telegram.messenger.g0.L(86.0f);
        float L2 = org.telegram.messenger.g0.L(70.0f);
        float L3 = org.telegram.messenger.g0.L(90.0f) * 1.3f;
        float f17 = a1Var.L + a1Var.O;
        float f18 = a1Var.M + a1Var.P;
        float f19 = -L3;
        boolean z14 = true;
        int ceil = ((int) Math.ceil(((i10 + L3) - f18) / L2)) + 1;
        org.telegram.messenger.g0.L(24.0f);
        int floor = ((int) Math.floor((f19 - f18) / L2)) - 1;
        while (floor <= ceil) {
            int i14 = floor & 1;
            if (i14 == 0) {
                f11 = 0.0f;
            } else {
                f11 = L / 2.0f;
            }
            boolean z15 = z14;
            int floor2 = ((int) Math.floor(((f19 - f17) - f11) / L)) - 1;
            int i15 = i3;
            float f20 = L3;
            int ceil2 = ((int) Math.ceil((((i15 + L3) - f17) - f11) / L)) + 1;
            while (floor2 <= ceil2) {
                float f21 = L2;
                int i16 = ceil2;
                double u02 = u0(floor, floor2);
                if (c0(53.1d * u02) < 0.2f) {
                    f12 = f17;
                    i13 = floor2;
                    i11 = ceil;
                    i12 = floor;
                    f15 = f11;
                    f14 = L;
                    z13 = z15;
                    f16 = f19;
                } else {
                    a1Var.G0(u02, 3.0f, 10.0f);
                    float f22 = f19;
                    float f23 = (float) (2.0d * u02 * 3.141592653589793d);
                    f12 = f17;
                    float c2 = a1Var.M4 + t4.c.c(floor2, L, f11, f17);
                    float sin = (((float) Math.sin((a1Var.N3 * 0.45f) + f23)) * org.telegram.messenger.g0.L(3.0f)) + (floor * f21) + f18 + a1Var.N4;
                    if (i14 == 0) {
                        z12 = z15;
                    } else {
                        z12 = false;
                    }
                    float L4 = org.telegram.messenger.g0.L(38.0f);
                    if (z12) {
                        f13 = 1.3f;
                    } else {
                        f13 = 0.9f;
                    }
                    float f24 = L4 * f13;
                    i11 = ceil;
                    float f25 = (float) u02;
                    float A = com.google.android.recaptcha.internal.a.A(f25, 0.16f, 0.92f, f24);
                    f14 = L;
                    z13 = z15;
                    f15 = f11;
                    f16 = f22;
                    int i17 = floor2;
                    i12 = floor;
                    i13 = i17;
                    if (J0(c2, sin, A, i15, i10, 0, floor, i17, (Math.max(0.0f, (A / org.telegram.messenger.g0.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z12) {
                            A *= 0.9f;
                        }
                        float f26 = A;
                        float sin2 = (((float) Math.sin((this.N3 * 0.3f) + f23)) * 4.0f) + ((f25 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i18 = (i13 - ((i12 - i14) / 2)) - i12;
                        int length = x0Var4.f3893b.length;
                        int i19 = ((i18 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (x0Var3 == null) {
                            D(canvas, x0Var4, i19, f26, sin2, f23 * 2.0f, f1(z10, z11, f10 - c02), c03);
                        } else {
                            x0 x0Var5 = x0Var4;
                            Drawable[] drawableArr = x0Var3.f3893b;
                            int length2 = drawableArr.length;
                            int i20 = ((i18 % length2) + length2) % length2;
                            if (drawableArr[i20] == x0Var5.f3893b[i19]) {
                                D(canvas, x0Var5, i19, f26, sin2, f23 * 2.0f, 1.0f, c03);
                            } else {
                                float f27 = f23 * 2.0f;
                                float f28 = f10 - c02;
                                D(canvas, x0Var3, i20, f26, sin2, f27, f1(z13, false, f28), c03);
                                D(canvas, x0Var2, i19, f26, sin2, f27, f1(false, false, f28), c03);
                            }
                        }
                    }
                }
                floor2 = i13 + 1;
                a1Var = this;
                i15 = i3;
                x0Var3 = x0Var;
                x0Var4 = x0Var2;
                floor = i12;
                f19 = f16;
                ceil2 = i16;
                f11 = f15;
                f17 = f12;
                ceil = i11;
                L = f14;
                z15 = z13;
                L2 = f21;
            }
            floor++;
            a1Var = this;
            x0Var3 = x0Var;
            x0Var4 = x0Var2;
            z14 = z15;
            L2 = L2;
            L3 = f20;
        }
    }

    public final void E0(x0 x0Var, Bitmap bitmap) {
        x0Var.f3895e = bitmap;
        if (bitmap != null) {
            if (d1.f3698b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(x0Var);
        }
        x0Var.f3897g = AnimationUtils.currentAnimationTimeMillis();
        this.f3468h2 = bitmap;
        invalidate();
    }

    public final void F(android.graphics.Canvas r96, int r97, int r98, bi.x0 r99, boolean r100, boolean r101, float r102) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.F(android.graphics.Canvas, int, int, bi.x0, boolean, boolean, float):void");
    }

    public final void F0(int i3) {
        if (!this.f3393a) {
            return;
        }
        if (i3 == 2 && !h10.i(this.f3404b).q()) {
            d1(0, bd.M0(2131746482, null), bd.M0(2131746481, null));
            i0();
            return;
        }
        if (i3 == 2 && (this.f3476i1 != i3 || this.f3458g1 < 0.5f)) {
            AnimationUtils.currentAnimationTimeMillis();
        }
        this.f3476i1 = i3;
        this.f3485j1 = i3;
        this.k1 = 0.0f;
        this.f3512l9.forceFinished(true);
        if (this.f3458g1 > 0.5f) {
            this.f3431d6 = AnimationUtils.currentAnimationTimeMillis();
        }
        if (this.f3467h1 < 0.5f) {
            this.J2 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.f3467h1 = 1.0f;
        l0();
        if (this.f3476i1 == 2) {
            y0();
        }
        i0();
    }

    public final void G(Canvas canvas, RectF rectF, int i3) {
        float centerY = rectF.centerY();
        float L = org.telegram.messenger.g0.L(12.0f);
        g6 g6Var = this.M0;
        float c2 = g6Var.c() + org.telegram.messenger.g0.L(2.0f) + L;
        float L2 = rectF.left + org.telegram.messenger.g0.L(8.0f);
        O(canvas, L2, centerY, L, i3, true);
        g6Var.u(i3);
        g6Var.setBounds((int) (L2 + L + org.telegram.messenger.g0.L(2.0f)), (int) (centerY - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + c2 + org.telegram.messenger.g0.L(40.0f)), (int) (centerY + org.telegram.messenger.g0.L(8.0f)));
        g6Var.draw(canvas);
    }

    public final void G0(double d, float f10, float f11) {
        double d10;
        float c02 = ((c0(31.7d * d) * (f11 - f10)) + f10) * org.telegram.messenger.g0.L(1.0f);
        float c03 = (c0(37.1d * d) * 11.0f) + 9.0f;
        if (c0(43.3d * d) < 0.5f) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = (d * 6.283d) + ((((d10 * 2.0d) * 3.141592653589793d) * this.N3) / c03);
        this.M4 = ((float) Math.cos(d11)) * c02;
        this.N4 = c02 * ((float) Math.sin(d11));
    }

    public final void H(Canvas canvas, RectF rectF, float f10) {
        int i3;
        y0 y0Var = this.f3521n;
        if (y0Var != null) {
            i3 = i0.a.f(0.5f, y0Var.f3919b, y0Var.f3920c);
        } else {
            i3 = -12947803;
        }
        Paint paint = this.A1;
        paint.setColor(i3 | (-16777216));
        paint.setAlpha((int) (Utilities.l(f10) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void I(android.graphics.Canvas r29, int r30, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r31, float r32, float r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.I(android.graphics.Canvas, int, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, float, float, float, float):void");
    }

    public final void I0(float f10, float f11, int i3) {
        Path path;
        int i10;
        int i11;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f3612w1.get(i3);
        ?? obj = new Object();
        obj.f3918a = 2;
        obj.f3922f = i3;
        final x0 x0Var = new x0();
        x0Var.f3892a = 2;
        x0Var.f3906q = i3;
        long j10 = tL_starGiftUnique.f27230id;
        x0Var.f3907r = (int) (j10 ^ (j10 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i13);
            i13++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                x0Var.A = document2;
                x0Var.f3894c = g5.l(this.f3404b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                x0Var.f3914z = document;
                x0Var.d = g5.l(this.f3404b, 24, document);
            }
        }
        e0(this.f3477i2, i3);
        obj.f3919b = x(this.f3477i2[0], false);
        int x10 = x(this.f3477i2[1], true);
        obj.f3920c = x10;
        obj.d = this.f3477i2[2];
        obj.f3921e = v(obj.f3919b, x10);
        obj.h = Z0(obj.f3919b);
        obj.f3923g = f.k(0.5f, obj.f3919b, obj.f3920c);
        x0Var.f3899j = l1(obj.d, obj.f3919b);
        i0.a.j(l1(obj.d, obj.f3919b) | (-16777216), r9);
        double min = Math.min(97.0d, r9[0] + 20.0d);
        double[] dArr = {min};
        Color.colorToHSV(i0.a.b(min, dArr[1], dArr[2]), r3);
        float[] fArr = {0.0f, Math.min(1.0f, fArr[1] * 1.15f)};
        x0Var.f3908s = Color.HSVToColor(fArr) | (-16777216);
        x0Var.v.setColorFilter(new PorterDuffColorFilter(x0Var.f3908s, PorterDuff.Mode.SRC_IN));
        x0Var.f3909t = -1;
        x0Var.B = tL_starGiftUnique;
        g5 g5Var = x0Var.f3894c;
        if (g5Var != null) {
            g5Var.a(this);
        }
        g5 g5Var2 = x0Var.d;
        if (g5Var2 != null) {
            g5Var2.a(this);
        }
        TLRPC.Document document3 = x0Var.f3914z;
        if (document3 != null) {
            int i14 = 0;
            while (true) {
                if (i14 < document3.thumbs.size()) {
                    if (document3.thumbs.get(i14) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i14)).svgPath;
                        break;
                    }
                    i14++;
                } else {
                    path = null;
                    break;
                }
            }
            if (path != null) {
                while (true) {
                    if (i12 < document3.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i12);
                        if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i10 = documentAttribute.f27008w) > 0 && (i11 = documentAttribute.h) > 0) {
                            break;
                        }
                        i12++;
                    } else {
                        i10 = 512;
                        i11 = 512;
                        break;
                    }
                }
                final Path path2 = new Path(path);
                float f12 = J9;
                final float f13 = f12 / i10;
                final float f14 = f12 / i11;
                final int i15 = x0Var.f3899j;
                Utilities.f21387e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        float f15 = f13;
                        float f16 = f14;
                        int i16 = i15;
                        Path path3 = path2;
                        try {
                            int i17 = a1.J9;
                            bitmap = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f15, f16);
                            Paint paint = new Paint(1);
                            paint.setColor(i16);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                            bitmap = null;
                        }
                        org.telegram.messenger.g0.h3(new k3(a1.this, x0Var, bitmap, 8));
                    }
                });
            }
        }
        this.J.clear();
        Y0(obj, f10, f11);
        if (!this.f3459g2) {
            this.f3553q2 = j(this.f3533o2, 0.03f, 0.005f);
            this.f3533o2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(x0Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f10, float f11) {
        RectF rectF2;
        float f12;
        RectF rectF3;
        boolean z10;
        float f13;
        char c2;
        char c10;
        int i3;
        double d;
        float f14;
        float f15;
        if (f11 <= 0.0f) {
            return;
        }
        if (this.B6) {
            float min = Math.min(0.0f, org.telegram.messenger.g0.N(d1.f3697a[2][8]));
            rectF3 = this.X5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f12 = f10 - min;
        } else {
            rectF2 = rectF;
            f12 = f10;
            rectF3 = rectF2;
        }
        if (!j0(canvas) && this.Z2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.Z2 != null && this.f3408b3 != null) {
            float f16 = this.f3460g3;
            Matrix matrix = this.f3439e3;
            matrix.setScale(f16, f16);
            float f17 = (-f16) / 2.0f;
            matrix.postTranslate(f17, f17);
            this.f3408b3.setLocalMatrix(matrix);
            Paint paint = this.f3428d3;
            paint.setAlpha((int) (Utilities.l(f11) * 255.0f));
            canvas.drawRoundRect(rectF3, f12, f12, paint);
            paint.setAlpha(255);
        }
        Path path = this.F1;
        path.rewind();
        path.addRoundRect(rectF3, f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = d1.f3698b;
        if (z10) {
            f13 = 0.0f;
            c2 = '\t';
            c10 = 3;
        } else if (v.f() && j0(canvas)) {
            int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            f13 = 0.0f;
            if (i10 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f11 * 255.0f));
            }
            if (this.f3586t6 && this.s6 > 0.004f) {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.f3596u6 == null) {
                    this.f3596u6 = android.support.v4.media.session.w.d("qrSheetLift");
                }
                float round = Math.round(this.s6 * 50.0f) / 50.0f;
                c2 = '\t';
                y0 y0Var = this.f3521n;
                if (y0Var != null) {
                    i3 = y0Var.f3919b;
                } else {
                    i3 = 0;
                }
                if (round == this.f3606v6 && this.f3617w6 == 1 && this.f3628x6 == i3) {
                    c10 = 3;
                } else {
                    this.f3606v6 = round;
                    this.f3617w6 = 1;
                    this.f3628x6 = i3;
                    Object obj = this.f3596u6;
                    if (y0Var != null) {
                        d = i0.a.h(y0Var.f3919b);
                    } else {
                        d = 0.3d;
                    }
                    c10 = 3;
                    float A = a1.g.A(fArr[11], 100.0f, round, 1.0f);
                    float max = ((0.5f - (A * 0.5f)) + ((fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d))))) * 255.0f;
                    v.k(obj, Math.max(0.5f, org.telegram.messenger.g0.N(org.telegram.messenger.g0.T1(fArr[2], fArr[12], round)) / 8.0f), new float[]{A, 0.0f, 0.0f, 0.0f, max, 0.0f, A, 0.0f, 0.0f, max, 0.0f, 0.0f, A, 0.0f, max, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a10 = v.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.f3596u6);
                a10.scale(0.125f, 0.125f);
                v.c(a10, this.H1);
                v.d(this.f3596u6);
                v.c(canvas, this.f3596u6);
                canvas.restore();
            } else {
                c2 = '\t';
                c10 = 3;
                Object obj2 = this.I1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                v.c(canvas, obj2);
                canvas.restore();
            }
            if (i10 < 0) {
                canvas.restore();
            }
        } else {
            f13 = 0.0f;
            c2 = '\t';
            c10 = 3;
            H(canvas, rectF3, f11);
        }
        int i11 = this.U8;
        if (i11 == 0) {
            float f18 = fArr[c10];
            if (this.f3586t6) {
                f15 = fArr[c2] * this.s6;
            } else {
                f15 = f13;
            }
            i11 = g((f18 + f15) / 100.0f, 16777215);
        }
        Paint paint2 = this.A1;
        paint2.setColor(i11);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f11));
        canvas.drawRect(rectF3, paint2);
        u.b(canvas, rectF3, f11);
        boolean z11 = this.f3586t6;
        if (!z11 && !this.B6) {
            f14 = (fArr[21] / 100.0f) * this.f3421c6;
        } else {
            f14 = f13;
        }
        if ((f14 > f13 || fArr[39] > f13) && this.f3645z3 && !z11 && !this.B6) {
            int width = getWidth();
            int height = getHeight();
            float c12 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c13 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c14 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c12 + c13 + c14 > 0.01f) {
                float f19 = ((fArr[39] * 1.25f) / 100.0f) * this.f3421c6 * 0.1f;
                float f20 = c13 * f19 * f11;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c12 * f19 * f11, f20, canvas, rectF3);
                L(centerX, rectF3.right, f20, f19 * c14 * f11, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f10, f11);
    }

    public final boolean J0(float r39, float r40, float r41, int r42, int r43, int r44, int r45, int r46, float r47) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.J0(float, float, float, int, int, int, int, int, float):boolean");
    }

    public final void K(Canvas canvas) {
        float f10;
        float L;
        int i3;
        int i10;
        float f11;
        float f12;
        float f13;
        float g12;
        int i11;
        Bitmap bitmap;
        float f14;
        float L2;
        Canvas canvas2 = canvas;
        if (this.f3504l1 <= 0.001f) {
            return;
        }
        float L3 = org.telegram.messenger.g0.L(222.0f);
        float L4 = org.telegram.messenger.g0.L(46.0f);
        float L5 = org.telegram.messenger.g0.L(54.0f);
        org.telegram.messenger.g0.L(8.0f);
        if (this.f3642z0) {
            f10 = L4 + L4;
        } else {
            f10 = L4 + L5 + L4;
        }
        int i12 = (this.f3458g1 > 0.5f ? 1 : (this.f3458g1 == 0.5f ? 0 : -1));
        RectF rectF = this.K5;
        if (i12 > 0) {
            L = (rectF.bottom + org.telegram.messenger.g0.L(6.0f)) - f10;
        } else {
            L = rectF.top - org.telegram.messenger.g0.L(6.0f);
        }
        float f15 = L;
        float width = (getWidth() - L3) / 2.0f;
        RectF rectF2 = this.L8;
        rectF2.set(width, f15, L3 + width, f10 + f15);
        float f16 = this.F8;
        float f17 = this.G8;
        float l10 = Utilities.l(this.f3504l1);
        float T1 = org.telegram.messenger.g0.T1(rectF.left, rectF2.left, f16);
        float T12 = org.telegram.messenger.g0.T1(rectF.top, rectF2.top, f17);
        float T13 = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, f16);
        float T14 = org.telegram.messenger.g0.T1(rectF.bottom, rectF2.bottom, f17);
        RectF rectF3 = this.K8;
        rectF3.set(T1, T12, T13, T14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, org.telegram.messenger.g0.T1(rectF.height() / 2.0f, org.telegram.messenger.g0.L(22.0f), Utilities.l(f17))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.H8 / 9.0f)) * org.telegram.messenger.g0.L(5.0f);
        float f18 = rectF3.left;
        float f19 = rectF3.top;
        float f20 = rectF3.right;
        float f21 = 1.0f;
        float f22 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.J8;
        path.rewind();
        float f23 = f18 + min;
        path.moveTo(f23, f19);
        float f24 = f20 - min;
        path.lineTo(f24, f19);
        float f25 = f19 + min;
        path.quadTo(f20, f19, f20, f25);
        float f26 = f22 - min;
        path.lineTo(f20, f26);
        path.quadTo(f20, f22, f24, f22);
        float f27 = f22 + max;
        path.cubicTo(org.telegram.messenger.g0.T1(f24, centerX, 0.55f), f27, org.telegram.messenger.g0.T1(f23, centerX, 0.55f), f27, f23, f22);
        path.quadTo(f18, f22, f18, f26);
        path.lineTo(f18, f25);
        path.quadTo(f18, f19, f23, f19);
        path.close();
        RectF rectF4 = this.G1;
        rectF4.set(f18, f19, f20, Math.max(0.0f, max) + f22);
        canvas2.save();
        canvas2.clipPath(path);
        float f28 = 255.0f;
        if (v.f() && j0(canvas)) {
            Object obj = this.I1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            v.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Z2 != null) {
            Paint paint = this.f3418c3;
            paint.setAlpha((int) (Utilities.l(1.0f) * 255.0f));
            Bitmap bitmap2 = this.Z2;
            if (bitmap2 != null) {
                y(canvas2, bitmap2);
            }
            paint.setAlpha(255);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.A1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        u.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f29 = l10 / 0.3f;
        float l11 = 1.0f - Utilities.l(f29);
        float f30 = 0.004f;
        float f31 = 0.15f;
        boolean z10 = false;
        int i13 = 1;
        if (l11 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l11 * 255.0f));
            float l12 = 1.0f - (Utilities.l(f29) * 0.15f);
            canvas2.scale(l12, l12, rectF.centerX(), rectF.centerY());
            this.U5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.U5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f32 = rectF3.top - rectF2.top;
        float f33 = 0.6f;
        if (Math.abs(this.H8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f32 = Math.round(f32);
        }
        canvas2.save();
        canvas2.translate(centerX2, f32);
        TextPaint textPaint = this.D1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        boolean z11 = this.f3633y0;
        String M0 = bd.M0(2131746493, null);
        if (z11) {
            i3 = 2131746497;
        } else {
            i3 = 2131746495;
        }
        String[] strArr = {M0, bd.M0(i3, null), bd.M0(2131746492, null)};
        if (this.f3633y0) {
            i10 = 2131746496;
        } else {
            i10 = 2131746494;
        }
        String[] strArr2 = {null, bd.M0(i10, null), null};
        int i14 = 0;
        float f34 = f15;
        while (i14 < 3) {
            RectF[] rectFArr = this.f3650z8;
            if (i14 == i13 && this.f3642z0) {
                rectFArr[i14].setEmpty();
                i11 = i14;
                f12 = f28;
                f13 = f30;
            } else {
                if (strArr2[i14] != null) {
                    f11 = L5;
                } else {
                    f11 = L4;
                }
                f12 = f28;
                f13 = f30;
                float f35 = f34 + f11;
                rectFArr[i14].set(rectF2.left, f34, rectF2.right, f35);
                if (this.m1 > 0.5f) {
                    g12 = g1(f31, f33, l10);
                } else {
                    g12 = g1(f33, f21, l10);
                }
                if (g12 <= f13) {
                    i11 = i14;
                } else {
                    M(canvas2, i14, rectFArr[i14], z10);
                    canvas2.save();
                    float f36 = (f11 / 2.0f) + f34;
                    if (i14 == 2) {
                        i11 = i14;
                        o0(canvas2, this.L1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        canvas2 = canvas;
                    } else {
                        i11 = i14;
                        if (i11 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.S1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        } else {
                            canvas2 = canvas;
                            boolean z12 = this.f3633y0;
                            if (z12) {
                                bitmap = this.P8;
                            } else {
                                bitmap = this.Q8;
                            }
                            if (bitmap != null) {
                                f14 = 26.0f;
                            } else {
                                int round = Math.round(org.telegram.messenger.g0.L(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f14 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f37 = round / 24.0f;
                                canvas3.scale(f37, f37);
                                Paint paint3 = new Paint(1);
                                Paint.Style style = Paint.Style.STROKE;
                                paint3.setStyle(style);
                                paint3.setStrokeWidth(1.66f);
                                Paint.Cap cap = Paint.Cap.ROUND;
                                paint3.setStrokeCap(cap);
                                paint3.setStrokeJoin(Paint.Join.ROUND);
                                paint3.setColor(-16777216);
                                canvas3.drawCircle(11.0f, 11.0f, 8.0f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 11.0f, 6.6f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 7.8f, 11.0f, paint3);
                                if (z12) {
                                    Paint paint4 = new Paint(1);
                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas3.drawCircle(18.2f, 18.2f, 5.7f, paint4);
                                    Paint paint5 = new Paint(1);
                                    paint5.setColor(-16777216);
                                    canvas3.drawCircle(18.2f, 18.2f, 4.4f, paint5);
                                    paint4.setStyle(style);
                                    paint4.setStrokeWidth(1.4f);
                                    paint4.setStrokeCap(cap);
                                    canvas3.drawLine(16.6f, 16.6f, 19.8f, 19.8f, paint4);
                                    canvas3.drawLine(19.8f, 16.6f, 16.6f, 19.8f, paint4);
                                    this.P8 = createBitmap;
                                } else {
                                    this.Q8 = createBitmap;
                                }
                                bitmap = createBitmap;
                            }
                            float L6 = rectF2.left + org.telegram.messenger.g0.L(f14);
                            Paint paint6 = this.R8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (Color.alpha(-1) * g12));
                            canvas2.drawBitmap(bitmap, L6 - (bitmap.getWidth() / 2.0f), f36 - (bitmap.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (g12 * f12));
                    String str = strArr[i11];
                    float L7 = rectF2.left + org.telegram.messenger.g0.L(52.0f);
                    if (strArr2[i11] != null) {
                        L2 = f36 - org.telegram.messenger.g0.L(2.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(5.0f) + f36;
                    }
                    canvas2.drawText(str, L7, L2, textPaint);
                    if (strArr2[i11] != null) {
                        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * g12));
                        canvas2.drawText(strArr2[i11], rectF2.left + org.telegram.messenger.g0.L(52.0f), f36 + org.telegram.messenger.g0.L(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f34 = f35;
            }
            i14 = i11 + 1;
            f28 = f12;
            f30 = f13;
            f31 = 0.15f;
            f33 = 0.6f;
            z10 = false;
            i13 = 1;
            f21 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.X4 == null && !this.W4) {
            this.W4 = true;
            Utilities.f21387e.c(new p0(this, i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16), 0));
        }
    }

    public final void L(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        LinearGradient linearGradient;
        float min = Math.min(f12, f13);
        float max = Math.max(f12, f13);
        int i3 = (min > 0.002f ? 1 : (min == 0.002f ? 0 : -1));
        Paint paint = this.f3411b6;
        if (i3 > 0) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint);
        }
        float f14 = max - min;
        if (f14 > 0.002f) {
            if (f13 >= f12) {
                linearGradient = this.Y5;
            } else {
                linearGradient = this.Z5;
            }
            Matrix matrix = this.f3400a6;
            matrix.setScale(f11 - f10, 1.0f);
            matrix.postTranslate(f10, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f14 * 255.0f));
            canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f10) {
        if (!this.f3645z3 || this.f3575s4 <= 0.001f) {
            return 0.0f;
        }
        float f11 = this.f3566r4;
        float[] fArr = d1.f3698b;
        float max = f11 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(org.telegram.messenger.g0.N(fArr[42]), (org.telegram.messenger.g0.L(3.5f) / 2.0f) / 0.607f) * f10 * max * ((float) Math.exp((-0.5f) * max * max)) * this.f3575s4;
    }

    public final void M(Canvas canvas, int i3, RectF rectF, boolean z10) {
        boolean z11;
        float exp;
        int i10;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f3579s9 == i3) {
            z11 = true;
        } else {
            z11 = false;
        }
        long[] jArr = this.y9;
        if (!z11 && jArr[i3] == 0) {
            return;
        }
        if (z11) {
            exp = X0(i3, currentAnimationTimeMillis);
        } else {
            exp = this.f3651z9[i3] * ((float) Math.exp(((float) (-(currentAnimationTimeMillis - jArr[i3]))) / 180.0f));
        }
        if (!z11 && exp < 0.004f) {
            jArr[i3] = 0;
            return;
        }
        float B = com.google.android.recaptcha.internal.a.B(exp, 2.0f, 3.0f, exp * exp);
        float min = Math.min(1.0f, ((float) (currentAnimationTimeMillis - this.f3631x9[i3])) / 320.0f);
        float f10 = 1.0f - min;
        float A = f1.A(f10, f10, f10, 1.0f);
        if (!z11 || exp < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.f3609v9[i3]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.f3620w9[i3]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        if (z10) {
            i10 = 335544320;
        } else {
            i10 = 738197503;
        }
        int i11 = (((int) ((i10 >>> 24) * B)) << 24) | (16777215 & i10);
        Paint paint = this.f3589t9;
        paint.setColor(i11);
        Path path = this.f3599u9;
        path.rewind();
        if (i3 != 3 && i3 != 4 && i3 != 11) {
            if (i3 < 6 && i3 != 5) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                float min2 = Math.min(org.telegram.messenger.g0.L(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            }
        } else {
            path.addOval(rectF, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawCircle(max, max2, Math.max(org.telegram.messenger.g0.L(6.0f), max3 * A), paint);
        canvas.restore();
    }

    public final void M0(int i3, y0 y0Var, int i10, int i11) {
        int i12 = i3 * 7;
        int i13 = y0Var.f3918a;
        float[] fArr = this.f3496k3;
        if (i13 == 0 && y0Var.f3922f == I9) {
            fArr[i12] = 0.0f;
            fArr[i12 + 1] = 0.0f;
            fArr[i12 + 2] = 0.0f;
            float f10 = M9;
            fArr[i12 + 3] = f10;
            float f11 = N9;
            fArr[i12 + 4] = f11;
            fArr[i12 + 5] = 1.0f / ((i11 * f11) + (i10 * f10));
            fArr[i12 + 6] = 0.5f;
        } else {
            fArr[i12] = 1.0f;
            fArr[i12 + 1] = i10 / 2.0f;
            fArr[i12 + 2] = (l() / 2.0f) + m();
            fArr[i12 + 3] = 0.0f;
            fArr[i12 + 4] = 0.0f;
            fArr[i12 + 5] = 1.0f / (((float) Math.hypot(i10, i11)) * 0.62f);
            fArr[i12 + 6] = 0.55f;
        }
        int i14 = i3 * 3;
        int i15 = y0Var.f3919b;
        int[] iArr = this.f3514m3;
        iArr[i14] = i15;
        iArr[i14 + 1] = y0Var.f3923g;
        iArr[i14 + 2] = y0Var.f3920c;
    }

    public final void N(android.graphics.Canvas r61, int r62, int r63) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.N(android.graphics.Canvas, int, int):void");
    }

    public final int N0() {
        y0 y0Var = this.f3521n;
        if (y0Var == null) {
            return -16777216;
        }
        if (this.f3570s < 1.0f && this.f3561r != null) {
            float l10 = (l() / 2.0f) + m();
            float l11 = Utilities.l(((((((float) Math.hypot(Math.max(this.f3621x, getWidth() - this.f3621x), Math.max(this.f3632y, getHeight() - this.f3632y))) + org.telegram.messenger.g0.L(60.0f)) * y1(this.f3570s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.f3621x, l10 - this.f3632y))) + org.telegram.messenger.g0.L(80.0f)) / org.telegram.messenger.g0.L(160.0f));
            int i3 = this.f3561r.f3921e;
            int i10 = this.f3521n.f3921e;
            float B = com.google.android.recaptcha.internal.a.B(l11, 2.0f, 3.0f, l11 * l11);
            double[] dArr = this.f3565r3;
            i0.a.j(i3, dArr);
            double[] dArr2 = this.f3574s3;
            i0.a.j(i10, dArr2);
            double d = B;
            double[] dArr3 = this.f3583t3;
            if (dArr3.length == 3) {
                double d10 = 1.0d - d;
                double d11 = (dArr2[0] * d) + (dArr[0] * d10);
                dArr3[0] = d11;
                double d12 = (dArr2[1] * d) + (dArr[1] * d10);
                dArr3[1] = d12;
                double d13 = (dArr2[2] * d) + (dArr[2] * d10);
                dArr3[2] = d13;
                return i0.a.b(d11, d12, d13);
            }
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        return y0Var.f3921e;
    }

    public final void O(Canvas canvas, float f10, float f11, float f12, int i3, boolean z10) {
        PorterDuffColorFilter n12 = n1(i3);
        b1 b1Var = this.U1;
        b1Var.setColorFilter(n12);
        b1Var.setAlpha(255);
        float f13 = f12 / 2.0f;
        float f14 = f11 - f13;
        float f15 = f10 + f12;
        float f16 = f11 + f13;
        b1Var.setBounds((int) f10, (int) f14, (int) f15, (int) f16);
        if (!z10) {
            b1Var.draw(canvas);
            return;
        }
        float f17 = f12 * 0.095f;
        float f18 = (0.28f * f12) + f10;
        float f19 = f11 - (0.21f * f12);
        float f20 = (0.74f * f12) + f10;
        float f21 = (0.25f * f12) + f11;
        float L = f10 - org.telegram.messenger.g0.L(2.0f);
        float L2 = f14 - org.telegram.messenger.g0.L(2.0f);
        float L3 = f15 + org.telegram.messenger.g0.L(2.0f);
        float L4 = f16 + org.telegram.messenger.g0.L(2.0f);
        RectF rectF = this.W5;
        rectF.set(L, L2, L3, L4);
        canvas.saveLayer(rectF, null);
        b1Var.draw(canvas);
        Paint paint = this.Z1;
        paint.setStrokeWidth((0.065f * f12 * 2.0f) + f17);
        canvas.drawLine(f18, f19, f20, f21, paint);
        canvas.restore();
        Paint paint2 = this.B1;
        paint2.setColor(i3);
        paint2.setStrokeWidth(f17);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f18, f19, f20, f21, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.Y1.C(false);
        Bitmap bitmap = this.S2;
        if (bitmap != null) {
            bitmap.recycle();
            this.S2 = null;
        }
        ch0 ch0Var = this.f3414b9;
        if (ch0Var != null) {
            ch0Var.C(false);
            this.f3414b9 = null;
        }
        ch0 ch0Var2 = this.f3519m8;
        if (ch0Var2 != null) {
            ch0Var2.C(false);
            this.f3519m8 = null;
        }
        g5 g5Var = this.f3511l8;
        if (g5Var != null) {
            g5Var.n(this);
            this.f3511l8 = null;
            this.f3529n8 = 0L;
        }
        P0(this.G);
        P0(this.H);
        removeCallbacks(this.f3560q9);
        v8 v8Var = this.f3486j2;
        if (v8Var != null) {
            v8Var.f();
        }
        VelocityTracker velocityTracker = this.f3503l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3503l0 = null;
        }
        VelocityTracker velocityTracker2 = this.f3530n9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f3530n9 = null;
        }
        HashMap hashMap = this.K7;
        for (g5 g5Var2 : hashMap.values()) {
            g5Var2.n(this);
        }
        for (Drawable drawable : this.K.values()) {
            if (drawable instanceof g5) {
                ((g5) drawable).n(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.L7;
        for (z0 z0Var : hashMap2.values()) {
            e5 e5Var = z0Var.f3924a;
            if (e5Var != null) {
                e5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.f3552q1 != null && f13 > 0.004f) {
            TextPaint textPaint = this.f3644z2;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setColor(-1);
            textPaint.setAlpha((int) (f13 * 255.0f));
            canvas.drawText(this.f3552q1, ((f10 + f12) - org.telegram.messenger.g0.L(16.0f)) - textPaint.measureText(this.f3552q1), f11 + org.telegram.messenger.g0.L(5.0f), textPaint);
            textPaint.setAlpha(255);
        }
    }

    public final void P0(x0 x0Var) {
        if (x0Var != null) {
            g5 g5Var = x0Var.f3894c;
            if (g5Var != null) {
                g5Var.n(this);
            }
            g5 g5Var2 = x0Var.d;
            if (g5Var2 != null && !this.K7.containsValue(g5Var2)) {
                x0Var.d.n(this);
            }
            x0Var.G = true;
            t tVar = x0Var.F;
            if (tVar != null) {
                tVar.f3853e = true;
                hs.f(tVar.f3850a).n(tVar, hs.Y1);
                x0Var.F = null;
            }
        }
    }

    public final void Q(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        Canvas canvas2;
        Drawable drawable;
        float f13;
        float f14;
        if (this.X8 != 0) {
            if (z10) {
                float L = f11 - org.telegram.messenger.g0.L(10.0f);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.S8;
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                paint.setColor(-1);
                float f15 = 1.0f;
                paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
                float L2 = ((org.telegram.messenger.g0.L(26.0f) + f10) - org.telegram.messenger.g0.L(10.0f)) + org.telegram.messenger.g0.L(10.0f);
                float L3 = L + org.telegram.messenger.g0.L(11.0f);
                float L4 = org.telegram.messenger.g0.L(7.25f);
                if (f12 >= 0.0f) {
                    float l10 = 1.0f - Utilities.l(f12 / 0.42f);
                    float A = f1.A(l10, l10, l10, 1.0f);
                    if (f12 < 0.6f) {
                        float f16 = 1.0f - (f12 / 0.6f);
                        f14 = (1.0f - ((f16 * f16) * f16)) * 364.0f;
                    } else {
                        float l11 = Utilities.l((f12 - 0.6f) / 0.12f);
                        f14 = 364.0f - ((3.0f - (l11 * 2.0f)) * ((4.0f * l11) * l11));
                    }
                    f13 = f14;
                    f15 = A;
                } else {
                    f13 = 0.0f;
                }
                float f17 = L3 - L4;
                RectF rectF = this.T8;
                rectF.set(L2 - L4, f17, L2 + L4, L4 + L3);
                canvas.drawArc(rectF, -82.0f, f15 * 344.0f, false, paint);
                canvas.drawLine(L2, f17, L2, L + org.telegram.messenger.g0.L(2.2f), paint);
                double radians = Math.toRadians(f13 - 90.0f);
                canvas2 = canvas;
                canvas2.drawLine(L2, L3, f1.g(3.8f, (float) Math.cos(radians), L2), f1.g(3.8f, (float) Math.sin(radians), L3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawCircle(L2, L3, org.telegram.messenger.g0.N(1.2f), paint);
            } else {
                canvas2 = canvas;
                if (n()) {
                    ch0 p12 = p1();
                    int L5 = org.telegram.messenger.g0.L(28.0f);
                    float f18 = L5 / 2.0f;
                    int i3 = (int) (f11 - f18);
                    p12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f18), i3, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f18)) + L5, L5 + i3);
                    p12.draw(canvas2);
                } else {
                    int i10 = this.X8;
                    if (i10 == 2131232114) {
                        ch0 q12 = q1();
                        int L6 = org.telegram.messenger.g0.L(28.0f);
                        float f19 = L6 / 2.0f;
                        int i11 = (int) (f11 - f19);
                        q12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19), i11, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19)) + L6, L6 + i11);
                        q12.draw(canvas2);
                    } else {
                        if (i10 == 2131232342) {
                            drawable = this.S1;
                        } else if (i10 == 2131232103) {
                            drawable = this.K1;
                        } else {
                            drawable = this.T1;
                        }
                        o0(canvas2, drawable, f10 + org.telegram.messenger.g0.L(26.0f), f11, org.telegram.messenger.g0.L(20.0f), 1.0f);
                        canvas2 = canvas2;
                    }
                }
            }
        } else {
            canvas2 = canvas;
            ch0 r12 = r1();
            int L7 = org.telegram.messenger.g0.L(27.0f);
            float f20 = L7 / 2.0f;
            int i12 = (int) (f11 - f20);
            r12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20), i12, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20)) + L7, L7 + i12);
            r12.draw(canvas2);
        }
        TextPaint textPaint = this.D1;
        textPaint.setColor(-1);
        float f21 = this.f3581t1;
        if (f21 <= 0.0f) {
            f21 = org.telegram.messenger.g0.L(15.0f);
        }
        textPaint.setTextSize(f21);
        String str = this.V8;
        float L8 = f10 + org.telegram.messenger.g0.L(48.0f);
        float L10 = org.telegram.messenger.g0.L(5.0f) + f11;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, L8, L10 - org.telegram.messenger.g0.L(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), L8, L10 + org.telegram.messenger.g0.L(9.0f), (Paint) textPaint);
        } else if (!s0(str)) {
            canvas2.drawText(str, L8, L10, textPaint);
        } else {
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = this.f3644z2;
            textPaint2.setTextSize(textSize);
            textPaint2.setColor(textPaint.getColor());
            canvas2.drawText(this.f3613w2, L8, L10, textPaint);
            float measureText = textPaint.measureText(this.f3613w2) + L8;
            canvas2.drawText(this.f3624x2, measureText, L10, textPaint2);
            canvas2.drawText(this.f3635y2, textPaint2.measureText(this.f3624x2) + measureText, L10, textPaint);
        }
    }

    public final void Q0() {
        int i3 = this.f3579s9;
        if (i3 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3651z9[i3] = X0(i3, currentAnimationTimeMillis);
            this.y9[i3] = currentAnimationTimeMillis;
            invalidate();
        }
        this.f3579s9 = -1;
    }

    public final void R(android.graphics.Canvas r28, int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.R(android.graphics.Canvas, int, long):void");
    }

    public final void R0() {
        float f10 = this.f3447f0;
        if (f10 == 0.0f && this.f3457g0 == 0.0f) {
            return;
        }
        this.f3484j0 = f10;
        this.f3494k0 = this.f3457g0;
        this.f3394a0 = AnimationUtils.currentAnimationTimeMillis();
        this.V = true;
    }

    public final void S0() {
        int i3 = this.W7;
        if (i3 >= 0 && this.Y7 < this.X7) {
            this.Z7 = k1(i3);
            this.Y7 = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
        }
    }

    public final float T(float f10) {
        float f11;
        if (this.R4 >= 1.0f) {
            return 1.0f;
        }
        if (this.U4) {
            f11 = 0.85f;
        } else {
            f11 = 0.92f;
        }
        return org.telegram.messenger.g0.T1(f11, 1.0f, f10);
    }

    public final android.graphics.Bitmap T0() {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.T0():android.graphics.Bitmap");
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.K;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = i6.g(str);
            if (drawable == null) {
                drawable = i6.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        boolean z10;
        if (this.f3611w0) {
            int L = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(8.0f);
            this.f3592u2 = this.M0.c() + org.telegram.messenger.g0.L(2.0f) + L + org.telegram.messenger.g0.L(11.0f);
            this.f3611w0 = false;
            this.B0 = false;
            if (this.C0 * this.H0 > 0.001f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f3582t2 = z10;
            this.f3564r2 = AnimationUtils.currentAnimationTimeMillis();
            this.D0 = this.C0;
            this.E0 = 0.0f;
            this.F0 = System.currentTimeMillis();
            e eVar = this.f3590u0;
            if (eVar != null) {
                j1(eVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.f3435e = null;
            this.f3600v0 = null;
            c6.i iVar = this.f3415c;
            if (iVar != null) {
                iVar.B(0);
            }
        }
    }

    public final Bitmap V(g5 g5Var) {
        Bitmap n4;
        c3 c3Var = g5Var.f33971k;
        if (c3Var != null) {
            ch0 B = c3Var.B();
            if (B != null) {
                if (!this.U2) {
                    B.V(0L);
                }
                if (B.u()) {
                    if (B.R != null) {
                        return B.R;
                    }
                    if (B.S == null) {
                        return null;
                    }
                    return B.S;
                }
            } else {
                t5 m10 = c3Var.m();
                if (m10 != null) {
                    if (!this.U2) {
                        m10.D(System.currentTimeMillis());
                    }
                    if (m10.s()) {
                        return m10.m();
                    }
                } else if (c3Var.J() && c3Var.L() && (n4 = c3Var.n()) != null && !n4.isRecycled()) {
                    return n4;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.f3467h1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - this.J2)) / 420.0f);
    }

    public final bi.x0 W() {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.W():bi.x0");
    }

    public final void X(x0 x0Var) {
        TLRPC.Document document;
        if (x0Var != null && !x0Var.G && x0Var.f3892a == 2 && x0Var.F == null && (document = x0Var.A) != null) {
            x0Var.F = new t(this.f3404b, document, x0Var.B, org.telegram.messenger.g0.L(48.0f), new o1(4, this, x0Var));
        }
    }

    public final float X0(int i3, long j10) {
        return 1.0f - ((1.0f - this.A9[i3]) * ((float) Math.exp(((float) (-(j10 - this.f3631x9[i3]))) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = d1.f3698b;
        float f10 = fArr[36];
        float f11 = fArr[38];
        float f12 = fArr[24];
        if (this.T3 != null && this.U3 == bitmap && f10 == this.V3 && f11 == this.W3 && f12 == this.X3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.U3 = bitmap;
        this.V3 = f10;
        this.W3 = f11;
        this.X3 = f12;
        Bitmap bitmap2 = this.T3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.T3.getHeight() != bitmap.getHeight()) {
            this.T3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.T3.eraseColor(0);
        Canvas canvas = new Canvas(this.T3);
        double radians = Math.toRadians(f12);
        float f13 = (float) (-Math.cos(radians));
        float f14 = (float) (-Math.sin(radians));
        float N = org.telegram.messenger.g0.N(f10);
        float N2 = org.telegram.messenger.g0.N(f11);
        float f15 = f13 * N2;
        float f16 = N2 * f14;
        canvas.drawBitmap(bitmap, f15, f16, (Paint) null);
        canvas.drawBitmap(bitmap, f15 - (f13 * N), f16 - (f14 * N), this.Y3);
        return true;
    }

    public final void Y0(y0 y0Var, float f10, float f11) {
        if (y0Var != null) {
            this.f3422c7 = W0(y0Var.f3920c);
        }
        if (this.f3459g2) {
            if (this.f3561r != null) {
                this.f3561r = null;
            }
            this.f3521n = y0Var;
            this.f3570s = 1.0f;
            invalidate();
            return;
        }
        this.f3561r = this.f3521n;
        this.f3521n = y0Var;
        this.f3570s = 0.0f;
        this.f3610w = System.currentTimeMillis();
        this.f3621x = f10;
        this.f3632y = f11;
        this.f3562r0++;
        i0();
        invalidate();
    }

    public final void Z(x0 x0Var) {
        g5 g5Var;
        c3 c3Var;
        if (x0Var != null && x0Var.f3895e == null && (g5Var = x0Var.f3894c) != null) {
            t tVar = x0Var.F;
            if ((tVar == null || tVar.h) && (c3Var = g5Var.f33971k) != null && c3Var.J() && c3Var.L()) {
                int L = org.telegram.messenger.g0.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                x0Var.f3894c.setBounds(0, 0, L, L);
                x0Var.f3894c.setColorFilter(null);
                x0Var.f3894c.setAlpha(255);
                c3Var.f21249i1 = 1.0f;
                x0Var.f3894c.draw(canvas);
                E0(x0Var, createBitmap);
            }
        }
    }

    public final String a0() {
        String M0 = bd.M0(2131746487, null);
        if (!M0.equals(this.f3602v2)) {
            this.f3602v2 = M0;
            Matcher matcher = Pattern.compile("\\d+").matcher(M0);
            if (matcher.find()) {
                this.f3613w2 = M0.substring(0, matcher.start());
                this.f3624x2 = matcher.group();
                this.f3635y2 = M0.substring(matcher.end());
            } else {
                this.f3613w2 = M0;
                this.f3635y2 = "";
                this.f3624x2 = "";
            }
        }
        return this.f3602v2;
    }

    public final float a1() {
        return (getHeight() - this.f3603v3) - org.telegram.messenger.g0.L(10.0f);
    }

    public final float b(double d) {
        float f10 = this.B4;
        double sin = Math.sin((f10 * 78.233d) + (((f10 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float L;
        float max = Math.max(org.telegram.messenger.g0.L(160.0f), a1() - ((((l() + (org.telegram.messenger.g0.L(51.0f) + this.f3593u3)) + org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.L(11.0f)) + org.telegram.messenger.g0.L(13.0f)));
        if (this.f3476i1 == 2 && this.f3634y1) {
            ArrayList arrayList = this.f3612w1;
            if (arrayList.size() <= 3) {
                float A = (org.telegram.messenger.camera.q.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f)) / 3.0f;
                if (arrayList.isEmpty()) {
                    L = org.telegram.messenger.g0.L(286.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f) + A;
                }
                max = Math.min(max, L);
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f10 = this.Q2;
        if (f10 >= 0.0f && this.f3458g1 >= 0.01f) {
            if (f10 != max) {
                long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.R2));
                float f11 = this.Q2;
                float y9 = com.google.android.recaptcha.internal.a.y(1.0f, (float) Math.exp(((float) (-min)) / 140.0f), max - f11, f11);
                this.Q2 = y9;
                if (Math.abs(max - y9) < 0.5f) {
                    this.Q2 = max;
                } else {
                    invalidate();
                }
            }
        } else {
            this.Q2 = max;
        }
        this.R2 = currentAnimationTimeMillis;
        return this.Q2;
    }

    public final void c() {
        y0 y0Var;
        Runnable runnable = this.f3438e2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f3449f2 && !this.J.isEmpty() && (y0Var = this.f3521n) != null && (y0Var.f3918a != 0 || this.G.f3892a == 2)) {
            this.U7 = AnimationUtils.currentAnimationTimeMillis();
            this.R7 = -1;
            this.P7 = 0.0f;
            setSceneFromCard(t(this.N7));
        }
        setPattern(W());
        if (!this.f3459g2) {
            this.f3571s0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f10, float f11, int i3, int i10) {
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        float asin;
        if (!this.f3645z3) {
            return 0.0f;
        }
        float f18 = i3;
        float f19 = f10 - (f18 / 2.0f);
        float f20 = this.I3;
        float f21 = i10;
        float f22 = f11 - (f21 / 2.0f);
        float f23 = (this.J3 * f22) + (f19 * f20);
        float f24 = 1.0f;
        float max = Math.max(1.0f, ((Math.abs(this.J3) * f21) + (Math.abs(f20) * f18)) / 2.0f);
        float[] fArr = d1.f3698b;
        float f25 = fArr[19] / 100.0f;
        if (f25 > 0.0f) {
            float f26 = this.J3;
            float max2 = ((f22 * this.I3) + (f19 * (-f26))) / Math.max(1.0f, ((Math.abs(this.I3) * f21) + (Math.abs(f26) * f18)) / 2.0f);
            f23 -= ((f25 * f18) * max2) * max2;
        }
        float f27 = (f23 - this.f3625x3) / this.f3636y3;
        float f28 = fArr[20] / 100.0f;
        if (f28 > 0.0f) {
            f27 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f23 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.f3625x3 / max) * 1.5707964f))) / ((this.f3636y3 / max) * 1.5707964f)) - f27) * f28;
            f12 = a1.g.D(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, asin))), (f28 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f12 = 1.0f;
        }
        this.f3545p4 = f27;
        float f29 = this.F3;
        this.f3555q4 = f29 * f12;
        float f30 = fArr[34] / 100.0f;
        int i12 = (f27 > 4.0f ? 1 : (f27 == 4.0f ? 0 : -1));
        if ((i12 > 0 || f27 < -4.0f) && f30 <= 0.0f) {
            this.n4 = 0.0f;
            return 0.0f;
        }
        float f31 = fArr[32];
        float f32 = f27 / fArr[29];
        x0 x0Var = this.G;
        if (x0Var != null && x0Var.f3892a == 1) {
            f24 = 0.7f;
        }
        float f33 = f12 * f24;
        if (f32 > 4.0f || f32 < -4.0f) {
            f13 = 0.0f;
            f14 = f33;
            f15 = 4.0f;
            i11 = i12;
            f16 = 0.0f;
        } else {
            float abs = Math.abs(f32);
            f13 = 0.0f;
            f14 = f33;
            f15 = 4.0f;
            i11 = i12;
            f16 = f29 * f33 * ((float) Math.exp(Math.pow(abs, f31) * (-0.5d)));
        }
        this.n4 = f16;
        float f34 = fArr[28] / 100.0f;
        if (i11 <= 0 && f27 >= -4.0f) {
            f17 = (float) Math.exp(Math.pow(Math.abs(f27), f31) * (-0.5d));
        } else {
            f17 = f13;
        }
        float f35 = f34 * f17;
        if (f30 > f13) {
            float f36 = f27 - fArr[33];
            if (f36 < f15 && f36 > -4.0f) {
                f35 += f30 * ((float) Math.exp(Math.pow(Math.abs(f36), f31) * (-0.5d)));
            }
        }
        return this.F3 * f14 * f35;
    }

    public final void d(int i3) {
        boolean z10 = true;
        this.f3449f2 = true;
        if (this.G.f3892a == 0) {
            z10 = false;
        }
        this.J.clear();
        this.P7 = 0.0f;
        this.N7 = i3;
        y0 y0Var = this.f3521n;
        if (y0Var == null || y0Var.f3918a != 0 || y0Var.f3922f != i3) {
            setSceneFromCard(t(i3));
        }
        if (z10) {
            setPattern(new x0());
        }
        Runnable runnable = this.f3438e2;
        if (runnable != null) {
            runnable.run();
        }
        this.f3449f2 = false;
    }

    public final void d1(int i3, String str, String str2) {
        int i10;
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new q0((Object) this, i3, (Object) str, (Object) str2, 0), currentTimeMillis);
            return;
        }
        this.f3532o1 = i3;
        this.f3523n1 = str;
        this.f3542p1 = str2;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (str2 != null) {
            i10 = 4000;
        } else {
            i10 = 2800;
        }
        this.f3601v1 = currentTimeMillis2 + i10;
        invalidate();
    }

    public final void e(int i3, ArrayList arrayList, boolean z10) {
        String str;
        int i10 = -1;
        if (z10 && a.h != null) {
            int i11 = 0;
            while (true) {
                int[] iArr = a.h;
                if (i11 >= iArr.length) {
                    break;
                } else if (iArr[i11] == i3) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i10 < 0) {
            i10 = H9;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f3449f2 = true;
            this.N7 = i10;
            y0 y0Var = this.f3521n;
            if (y0Var == null || y0Var.f3918a != 0 || y0Var.f3922f != i10) {
                setSceneFromCard(t(i10));
            }
            this.P7 = 0.0f;
            ArrayList arrayList2 = this.J;
            arrayList2.clear();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                if (arrayList2.size() >= 6) {
                    break;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                    String p10 = a1.g.p(j10, "c:");
                    HashMap hashMap = this.K;
                    if (!hashMap.containsKey(p10)) {
                        g5 m10 = g5.m(this.f3404b, j10, null, 2);
                        m10.a(this);
                        hashMap.put(p10, m10);
                    }
                    if (!arrayList2.contains(p10)) {
                        arrayList2.add(p10);
                    }
                } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = (TLRPC.TL_reactionEmoji) reaction;
                    if (!TextUtils.isEmpty(tL_reactionEmoji.emoticon)) {
                        String str2 = tL_reactionEmoji.emoticon;
                        if (str2 != null && !str2.startsWith("c:")) {
                            str = str2.replace("️", "");
                        } else {
                            str = str2;
                        }
                        this.f3427d2.put(str, str2);
                        if (!arrayList2.contains(str)) {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            c();
            this.f3449f2 = false;
            return;
        }
        d(i10);
    }

    public final void e0(int[] iArr, int i3) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.f3612w1.get(i3)).attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f10, float f11, float f12) {
        float y9 = com.google.android.recaptcha.internal.a.y(f11, f10, 1.0f - ((float) Math.pow(1.0f - f12, this.Y2)), f10);
        if (Math.abs(f11 - y9) < 0.002f) {
            return f11;
        }
        return y9;
    }

    public final int f0() {
        int size = this.f3612w1.size();
        if (!this.f3634y1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final g5 g0(long j10, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.K7;
        g5 g5Var = (g5) hashMap.get(valueOf);
        if (g5Var == null) {
            g5 l10 = g5.l(this.f3404b, 24, document);
            l10.a(this);
            hashMap.put(Long.valueOf(j10), l10);
            return l10;
        }
        return g5Var;
    }

    public String getCurrentLink() {
        String str;
        if (this.f3611w0 && (str = this.f3435e) != null && this.f3600v0 != null) {
            return str;
        }
        if (this.f3590u0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            String str = (String) obj;
            if (str.startsWith("c:")) {
                try {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji.document_id = Long.parseLong(str.substring(2));
                    arrayList.add(tL_reactionCustomEmoji);
                } catch (NumberFormatException unused) {
                }
            } else {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                String str2 = (String) this.f3427d2.get(str);
                if (str2 != null) {
                    str = str2;
                }
                tL_reactionEmoji.emoticon = str;
                arrayList.add(tL_reactionEmoji);
            }
        }
        return arrayList;
    }

    public int getThemeBackdropIndex() {
        y0 y0Var = this.f3521n;
        if (y0Var != null && y0Var.f3918a == 0) {
            return y0Var.f3922f;
        }
        return -1;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i3;
        x0 x0Var = this.G;
        if (x0Var.f3892a == 2 && (i3 = x0Var.f3906q) >= 0) {
            ArrayList arrayList = this.f3612w1;
            if (i3 < arrayList.size()) {
                return (TL_stars.TL_starGiftUnique) arrayList.get(this.G.f3906q);
            }
            return null;
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l10;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l10 = (Long) this.f3643z1.get(Long.valueOf(themeGift.f27230id));
        } else {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        if (this.f3634y1 && this.f3612w1.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            if ((this.T4 || this.f3396a2) && canvas.isHardwareAccelerated() && v.e(this.I1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j1(e eVar) {
        f fVar = this.f3580t0;
        if (fVar.f3731q == 2 && fVar.f3729o < 1.0f) {
            fVar.f3727m = eVar;
            invalidate();
            return;
        }
        postDelayed(new a1.f(19, this, eVar), 40L);
    }

    public final float k1(int i3) {
        if (i3 != this.W7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j10 = this.Y7;
        long j11 = this.X7;
        if (j10 < j11) {
            float l10 = 1.0f - Utilities.l(((float) (currentAnimationTimeMillis - j11)) / 110.0f);
            return 1.0f - ((1.0f - (l10 * l10)) * 0.08f);
        }
        double h12 = h1(((float) (currentAnimationTimeMillis - j10)) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.Y7 > 900) {
            this.W7 = -1;
            return 1.0f;
        }
        float f10 = this.Z7;
        return ((1.0f - f10) * ((float) h12)) + f10;
    }

    public final float l() {
        return org.telegram.messenger.g0.T1(1.07f, 1.0f, this.D2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.V8 == null) {
            this.f3601v1 = 0L;
            return;
        }
        this.f3601v1 = 0L;
        if (this.O8) {
            this.O8 = false;
            this.N8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.W8 = true;
        invalidate();
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.K2, this.D2)) * org.telegram.messenger.g0.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - org.telegram.messenger.g0.L(15.0f));
        float a12 = (((a1() - b1()) - org.telegram.messenger.g0.L(13.0f)) - (org.telegram.messenger.g0.L(35.0f) * Math.max(this.K2, this.D2))) - l();
        return org.telegram.messenger.g0.T1(max, Math.max(org.telegram.messenger.g0.L(51.0f) + this.f3593u3, Math.min(max, a12)), this.f3458g1);
    }

    public final z0 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.f27230id);
        HashMap hashMap = this.L7;
        z0 z0Var = (z0) hashMap.get(valueOf);
        z0 z0Var2 = z0Var;
        if (z0Var == null) {
            ?? obj = new Object();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i3 = 0;
            while (i3 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i3);
                i3++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                e5 e5Var = new e5(org.telegram.messenger.g0.L(28.0f), this);
                obj.f3924a = e5Var;
                e5Var.i(document, false);
                obj.f3924a.a();
                obj.f3925b = document.f27007id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.f27230id), obj);
            z0Var2 = obj;
        }
        return z0Var2;
    }

    public final boolean n() {
        String str;
        if (this.X8 == 2131232342 && (str = this.V8) != null && !s0(str)) {
            return true;
        }
        return false;
    }

    public final boolean n0(float f10, float f11) {
        if (this.f3552q1 != null && this.O8) {
            RectF rectF = this.M8;
            if (!rectF.isEmpty()) {
                float f12 = rectF.right;
                TextPaint textPaint = this.f3644z2;
                textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
                float L = rectF.bottom + org.telegram.messenger.g0.L(6.0f);
                RectF rectF2 = this.f3563r1;
                rectF2.set((f12 - textPaint.measureText(this.f3552q1)) - org.telegram.messenger.g0.L(28.0f), rectF.top - org.telegram.messenger.g0.L(6.0f), rectF.right + org.telegram.messenger.g0.L(6.0f), L);
                return rectF2.contains(f10, f11);
            }
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter n1(int i3) {
        SparseArray sparseArray = this.f3454f7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i3);
        if (porterDuffColorFilter == null) {
            if (sparseArray.size() > 96) {
                sparseArray.clear();
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
            sparseArray.put(i3, porterDuffColorFilter2);
            return porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    public final float o() {
        return l() + m() + org.telegram.messenger.g0.L(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f10, float f11, float f12, float f13) {
        drawable.setColorFilter(n1(-1));
        drawable.setAlpha((int) (f13 * 255.0f));
        float f14 = f12 / 2.0f;
        drawable.setBounds((int) (f10 - f14), (int) (f11 - f14), (int) (f10 + f14), (int) (f11 + f14));
        drawable.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        Sensor sensor;
        super.onAttachedToWindow();
        K0();
        int i3 = this.f3648z6;
        SparseIntArray sparseIntArray = this.f3639y6;
        if (i3 != 1) {
            sparseIntArray.clear();
            this.f3648z6 = 1;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = a.f3352b;
            if (i10 >= iArr.length) {
                break;
            }
            ?? obj = new Object();
            int i11 = iArr[i10] | (-16777216);
            obj.f3919b = i11;
            obj.f3920c = (-16777216) | a.f3353c[i10];
            obj.h = Z0(i11);
            if (sparseIntArray.indexOfKey(obj.f3919b) < 0) {
                sparseIntArray.put(obj.f3919b, u(obj));
            }
            i10++;
        }
        hs.f(this.f3404b).c(this.f3495k2, hs.G3);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.O6 = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        if (sensor != null) {
            this.O6.registerListener(this.P6, sensor, 1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f3404b).n(this.f3495k2, hs.G3);
        removeCallbacks(this.f3505l2);
        SensorManager sensorManager = this.O6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.P6);
        }
        this.M6 = false;
        this.f3579s9 = -1;
        Arrays.fill(this.y9, 0L);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int top;
        super.onLayout(z10, i3, i10, i11, i12);
        int i13 = org.telegram.messenger.g0.f22602m;
        View view = this;
        int i14 = 0;
        while (true) {
            top = view.getTop() + i14;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i14 = top - view.getScrollY();
        }
        this.f3593u3 = Math.max(Math.max(0, i13 - top), (org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(9.0f)) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i15 = 0;
        while (true) {
            int top2 = view2.getTop() + i15;
            if (!(view2.getParent() instanceof View)) {
                this.f3603v3 = p1.d(20.0f, org.telegram.messenger.g0.L(22.0f), Math.max(0, org.telegram.messenger.g0.f22603n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i15 = top2 - view2.getScrollY();
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        if (i3 > 0 && i10 > 0) {
            float L = org.telegram.messenger.g0.L(12.0f);
            int ceil = ((int) Math.ceil(i3 / L)) + 1;
            int ceil2 = ((int) Math.ceil(i10 / L)) + 1;
            Bitmap bitmap = this.A3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.A3.getHeight() != ceil2) {
                this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.B3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i3, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r40) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f10, float f11, float f12) {
        int i3;
        float L;
        float nextFloat;
        float f13;
        float g7;
        int i10 = this.f3426d1;
        if (i10 >= 320) {
            return;
        }
        this.f3426d1 = i10 + 1;
        Random random = this.f3448f1;
        float nextFloat2 = random.nextFloat();
        if (nextFloat2 < 0.65f) {
            i3 = 0;
        } else if (nextFloat2 < 0.9f) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        byte[] bArr = this.f3406b1;
        bArr[i10] = (byte) i3;
        this.f3417c1[i10] = false;
        this.N0[i10] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(4.0f)) + f10;
        this.O0[i10] = f11;
        byte b10 = bArr[i10];
        if (b10 == 0) {
            L = org.telegram.messenger.g0.L(1.4f);
            nextFloat = random.nextFloat();
            f13 = 1.6f;
        } else if (b10 == 1) {
            g7 = f1.g(0.7f, random.nextFloat(), org.telegram.messenger.g0.N(0.7f));
            this.T0[i10] = g7;
            this.P0[i10] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
            this.Q0[i10] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
            this.R0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
            this.S0[i10] = 0.0f;
            this.U0[i10] = random.nextFloat() * 90.0f;
            this.V0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
        } else {
            L = org.telegram.messenger.g0.L(3.0f);
            nextFloat = random.nextFloat();
            f13 = 1.5f;
        }
        g7 = (nextFloat * org.telegram.messenger.g0.L(f13)) + L;
        this.T0[i10] = g7;
        this.P0[i10] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
        this.Q0[i10] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
        this.R0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
        this.S0[i10] = 0.0f;
        this.U0[i10] = random.nextFloat() * 90.0f;
        this.V0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final ch0 p1() {
        if (this.f3403a9 == null) {
            ch0 ch0Var = new ch0(2131623989, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.f3403a9 = ch0Var;
            ch0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.f3403a9.K(0);
            this.f3403a9.R(this);
            this.f3403a9.J(true);
        }
        return this.f3403a9;
    }

    public final void q(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z10, boolean z11) {
        float f18;
        int i3 = this.f3426d1;
        if (i3 >= 320) {
            return;
        }
        this.f3426d1 = i3 + 1;
        this.f3406b1[i3] = z10 ? (byte) 1 : (byte) 0;
        this.f3417c1[i3] = true;
        this.N0[i3] = f10;
        this.O0[i3] = f11;
        this.P0[i3] = f12;
        this.Q0[i3] = f13;
        this.W0[i3] = f10;
        this.X0[i3] = f11;
        this.Y0[i3] = f14;
        Random random = this.f3448f1;
        if (z11) {
            f18 = (random.nextFloat() * 3.0f) + 4.0f;
        } else {
            f18 = 0.0f;
        }
        this.Z0[i3] = f18;
        this.f3395a1[i3] = random.nextFloat() * 6.2832f;
        this.T0[i3] = f15;
        this.R0[i3] = f16;
        this.S0[i3] = 0.0f;
        this.U0[i3] = f17;
        this.V0[i3] = 0.0f;
    }

    public final ch0 q1() {
        if (this.f3414b9 == null) {
            ch0 ch0Var = new ch0(2131624055, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.f3414b9 = ch0Var;
            ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.f3414b9.K(0);
            this.f3414b9.R(this);
            this.f3414b9.J(true);
        }
        return this.f3414b9;
    }

    public final ch0 r1() {
        if (this.Z8 == null) {
            ch0 ch0Var = new ch0(2131624216, org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
            this.Z8 = ch0Var;
            ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final boolean s0(String str) {
        if (str != null && str.equals(this.f3602v2)) {
            return true;
        }
        return false;
    }

    public final float s1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.D1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.f3644z2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.f3635y2) + textPaint2.measureText(this.f3624x2) + textPaint.measureText(this.f3613w2);
    }

    public void setFeeStars(long j10) {
        boolean z10;
        String str;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i3 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L0 = z10;
        String str2 = "";
        if (i3 <= 0) {
            str = "";
        } else {
            str = bd.a0(null, null, 2131746489, bd.E(j10, ','));
        }
        int indexOf = str.indexOf(9733);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
        }
        this.J0 = str2;
        if (indexOf >= 0) {
            str = str.substring(indexOf + 1);
        }
        this.K0 = str;
        if (!this.L0 && this.f3611w0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.f3435e, str)) {
            return;
        }
        this.f3435e = str;
        if (str == null) {
            this.f3600v0 = null;
            return;
        }
        Utilities.f21387e.c(new a1.f(20, str, new r0(this, str, 1)));
    }

    public void setGiftsOwner(long j10) {
        if (this.f3623x1 == j10) {
            return;
        }
        this.f3623x1 = j10;
        v8 v8Var = this.f3486j2;
        if (v8Var != null) {
            v8Var.f();
        }
        v8 v8Var2 = new v8(this.f3404b, j10, false);
        this.f3486j2 = v8Var2;
        v8Var2.f6199g = 776;
        v8Var2.f6197e = true;
        v8Var2.j(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z10) {
        this.f3396a2 = z10;
    }

    public void setInstantTheme(boolean z10) {
        this.f3459g2 = z10;
    }

    public void setLinkExpires(long j10) {
        long j11 = this.H2;
        if (j11 == j10) {
            return;
        }
        if (j11 != 0 && j10 != 0) {
            i0();
        }
        this.H2 = j10;
        this.O2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.f3438e2 = runnable;
    }

    public void setReveal(float f10) {
        float f11;
        boolean z10;
        float f12;
        int i3;
        float sin;
        this.R4 = f10;
        float f13 = 1.0f;
        if (this.U4) {
            double d = f10 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f10 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d10 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d10) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d10)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l10 = Utilities.l((f10 - 0.85f) / 0.15f);
            f11 = com.google.android.recaptcha.internal.a.y(1.0f, sin, com.google.android.recaptcha.internal.a.B(l10, 2.0f, 3.0f, l10 * l10), sin);
        } else {
            float f14 = 1.0f - f10;
            f11 = 1.0f - (f14 * f14);
        }
        this.V4 = f11;
        int i10 = 0;
        if (f10 < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.T4 = true;
        }
        if (z10) {
            f12 = Math.round((1.0f - f11) * org.telegram.messenger.g0.L(64.0f));
        } else {
            f12 = 0.0f;
        }
        setTranslationY(f12);
        if (z10) {
            f13 = Utilities.l(f11 / 0.35f);
        }
        setAlpha(f13);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (z10) {
                i3 = a(f11, 1073741824);
            } else {
                i3 = 0;
            }
            view.setBackgroundColor(i3);
        }
        float f15 = -1.0f;
        if (!z10) {
            this.f3554q3 = -1.0f;
        }
        if (z10 && this.U4) {
            f15 = Utilities.l(f11);
        }
        this.f3580t0.D = f15;
        if (z10) {
            i10 = 2;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.U4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.f3518m7 != z10) {
            this.f3518m7 = z10;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z10) {
        float f10;
        if (this.C2 == z10) {
            return;
        }
        this.C2 = z10;
        if (!this.I2) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.F2 = f10;
            this.D2 = f10;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z10) {
        if (this.f3393a != z10) {
            this.f3393a = z10;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z10) {
        this.f3642z0 = z10;
    }

    public final int t0() {
        int i3;
        int i10 = this.f3648z6;
        SparseIntArray sparseIntArray = this.f3639y6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.f3648z6 = 1;
        }
        y0 y0Var = this.f3521n;
        if (y0Var != null) {
            i3 = y0Var.f3919b;
        } else {
            i3 = 0;
        }
        int indexOfKey = sparseIntArray.indexOfKey(i3);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.f3521n);
        sparseIntArray.put(i3, u10);
        return u10;
    }

    public final void u1(boolean z10) {
        long max;
        String sb2;
        if (this.f3611w0) {
            if (!this.f3622x0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131746498, sb3, " · ");
                sb2 = p1.k(2131746491, null, sb3);
                this.B2 = -1;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.B0) {
                    max = 60000;
                } else {
                    max = Math.max(0L, this.A0 - currentTimeMillis);
                }
                int ceil = (int) Math.ceil(max / 1000.0d);
                if (ceil != this.B2 || this.A2 == null) {
                    this.B2 = ceil;
                    StringBuilder sb4 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131746498, sb4, " · ");
                    sb4.append(bd.a0(null, null, 2131746499, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                    sb2 = sb4.toString();
                } else {
                    return;
                }
            }
            if (!sb2.equals(this.A2)) {
                this.A2 = sb2;
                this.M0.t(sb2, z10, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        ch0 ch0Var;
        if ((drawable instanceof RippleDrawable) || drawable == this.M0 || drawable == this.Y1 || (((ch0Var = this.f3519m8) != null && drawable == ch0Var) || super.verifyDrawable(drawable))) {
            return true;
        }
        return false;
    }

    public final Drawable w(int i3) {
        return getContext().getResources().getDrawable(i3).mutate();
    }

    public final float x1(float f10, float f11, int i3, int i10) {
        float f12 = this.f3621x;
        double max = Math.max(f12, i3 - f12);
        float f13 = this.f3632y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f10 - this.f3621x, f11 - this.f3632y)) / (((float) Math.hypot(max, Math.max(f13, i10 - f13))) + org.telegram.messenger.g0.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f10 = this.f3460g3;
        float f11 = (-f10) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f10;
        float height = (bitmap.getHeight() - 0.5f) * f10;
        RectF rectF = this.f3450f3;
        rectF.set(f11, f11, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f3418c3);
    }

    public final void y0() {
        long j10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i3;
        v8 v8Var = this.f3486j2;
        if (v8Var == null) {
            return;
        }
        x0 x0Var = this.G;
        int i10 = x0Var.f3892a;
        ArrayList arrayList = this.f3612w1;
        if (i10 == 2 && (i3 = x0Var.f3906q) >= 0 && i3 < arrayList.size()) {
            j10 = ((TL_stars.TL_starGiftUnique) arrayList.get(this.G.f3906q)).f27230id;
        } else {
            j10 = 0;
        }
        if (j10 != 0) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(this.G.f3906q);
        } else {
            tL_starGiftUnique = null;
        }
        arrayList.clear();
        HashMap hashMap = this.f3643z1;
        hashMap.clear();
        ArrayList arrayList2 = v8Var.f6203l;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift.refunded) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                if (!tL_starGiftUnique2.burned) {
                    arrayList.add(tL_starGiftUnique2);
                    hashMap.put(Long.valueOf(savedStarGift.gift.f27230id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i13)).f27230id == j10) {
                        break;
                    }
                    i13++;
                } else {
                    i13 = -1;
                    break;
                }
            }
            if (i13 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i11 = i13;
            }
            this.G.f3906q = i11;
            this.M7 = i11;
        }
        boolean z10 = v8Var.f6201j;
        this.f3634y1 = z10;
        if (!z10 && !v8Var.f6200i) {
            v8Var.a();
        }
        if (!arrayList.isEmpty() && !this.f3513m2) {
            this.f3513m2 = true;
            t0 t0Var = this.f3505l2;
            removeCallbacks(t0Var);
            postDelayed(t0Var, 900L);
        }
        invalidate();
    }

    public final void z(android.graphics.Canvas r45, int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a1.z(android.graphics.Canvas, int, int):void");
    }

    public final float z0() {
        float f10;
        int f02;
        int L;
        int L2;
        float f11;
        float A = org.telegram.messenger.camera.q.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f);
        int i3 = this.f3476i1;
        if (i3 == 0) {
            f10 = A / 6.0f;
            f02 = (a.f3352b.length + 5) / 6;
            L = org.telegram.messenger.g0.L(4.0f) - org.telegram.messenger.g0.L(32.0f);
            L2 = org.telegram.messenger.g0.L(4.0f);
        } else {
            if (i3 == 1) {
                f10 = A / 6.0f;
                f11 = 0.0f;
            } else if (h0()) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = A / 3.0f;
                f02 = ((f0() + this.f3612w1.size()) - 1) / f0();
                L = org.telegram.messenger.g0.L(4.0f) - org.telegram.messenger.g0.L(32.0f);
                L2 = org.telegram.messenger.g0.L(4.0f);
            }
            f02 = 0;
            return Math.max(0.0f, (((f02 * f10) + f11) + org.telegram.messenger.g0.L(32.0f)) - b1());
        }
        f11 = L2 + L;
        return Math.max(0.0f, (((f02 * f10) + f11) + org.telegram.messenger.g0.L(32.0f)) - b1());
    }
}
