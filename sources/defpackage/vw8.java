package defpackage;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;
public final class vw8 extends View {
    public static int[] C9;
    public static int[] D9;
    public static int[] E9;
    public static String I9;
    public static gv8 J9;
    public static volatile byte[] M9;
    public static int N9;
    public static int O9;
    public static int P9;
    public long A0;
    public final Paint A1;
    public String A2;
    public Bitmap A3;
    public final float A4;
    public final boolean[] A5;
    public boolean A6;
    public final LinearGradient A7;
    public long A8;
    public final Rect[] A9;
    public boolean B0;
    public final Paint B1;
    public int B2;
    public int[] B3;
    public final Paint B4;
    public int B5;
    public int B6;
    public final Paint B7;
    public float B8;
    public float C0;
    public final Paint C1;
    public boolean C2;
    public final Paint C3;
    public final Paint C4;
    public final LinearGradient C5;
    public final SweepGradient[] C6;
    public final Matrix C7;
    public float C8;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public final RectF D3;
    public final RectF D4;
    public final Paint D5;
    public float D6;
    public final RectF[] D7;
    public float D8;
    public final long E;
    public float E0;
    public final TextPaint E1;
    public float E2;
    public boolean E3;
    public final float[] E4;
    public final Path E5;
    public float E6;
    public float E7;
    public float E8;
    public final Matrix F;
    public long F0;
    public final Path F1;
    public float F2;
    public float F3;
    public final float[] F4;
    public final TextPaint F5;
    public float F6;
    public float F7;
    public float F8;
    public sw8 G;
    public boolean G0;
    public final RectF G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public Drawable G5;
    public float G6;
    public boolean G7;
    public float G8;
    public sw8 H;
    public float H0;
    public Object H1;
    public long H2;
    public float H3;
    public final float[] H4;
    public StaticLayout H5;
    public float H6;
    public int H7;
    public float H8;
    public long I;
    public final TextPaint I0;
    public Object I1;
    public boolean I2;
    public float I3;
    public final float[] I4;
    public int I5;
    public float I6;
    public final RectF I7;
    public final Path I8;
    public final ArrayList J;
    public String J0;
    public int J1;
    public long J2;
    public float J3;
    public final long[] J4;
    public final RectF J5;
    public float J6;
    public final HashMap J7;
    public final RectF J8;
    public final HashMap K;
    public String K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public int K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public boolean L0;
    public final Drawable L1;
    public float L2;
    public float L3;
    public float L4;
    public final Path L5;
    public boolean L6;
    public int L7;
    public final RectF L8;
    public float M;
    public final gn M0;
    public final Drawable M1;
    public float M2;
    public final rw8 M3;
    public float M4;
    public final float[] M5;
    public long M6;
    public int M7;
    public long M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public final Paint N4;
    public float N5;
    public SensorManager N6;
    public float N7;
    public boolean N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public long O2;
    public float O3;
    public final Paint O4;
    public final Matrix O5;
    public final qw8 O6;
    public float O7;
    public Bitmap O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public String P2;
    public float P3;
    public final RectF P4;
    public final Matrix P5;
    public float P6;
    public int P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public float Q2;
    public float Q3;
    public float Q4;
    public final LinearGradient Q5;
    public float Q6;
    public int Q7;
    public final Paint Q8;
    public float R;
    public final float[] R0;
    public final Drawable R1;
    public long R2;
    public final Path R3;
    public float R4;
    public final LongSparseArray R5;
    public float R6;
    public long R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public Bitmap S2;
    public Bitmap S3;
    public boolean S4;
    public final Path S5;
    public float S6;
    public long S7;
    public final RectF S8;
    public boolean T;
    public final float[] T0;
    public final Drawable T1;
    public final Paint T2;
    public Bitmap T3;
    public boolean T4;
    public boolean T5;
    public long T6;
    public long T7;
    public int T8;
    public boolean U;
    public final float[] U0;
    public final xt U1;
    public boolean U2;
    public float U3;
    public float U4;
    public final RectF U5;
    public long U6;
    public final float U7;
    public String U8;
    public boolean V;
    public final float[] V0;
    public final Paint V1;
    public int V2;
    public float V3;
    public boolean V4;
    public final RectF V5;
    public boolean V6;
    public int V7;
    public boolean V8;
    public long W;
    public final float[] W0;
    public final String W1;
    public boolean W2;
    public float W3;
    public Bitmap W4;
    public final RectF W5;
    public final Matrix W6;
    public long W7;
    public int W8;
    public final float[] X0;
    public final ed0 X1;
    public long X2;
    public final Paint X3;
    public int[] X4;
    public final LinearGradient X5;
    public final Path X6;
    public long X7;
    public long X8;
    public final float[] Y0;
    public final oy8 Y1;
    public float Y2;
    public final int[] Y3;
    public int Y4;
    public final LinearGradient Y5;
    public final RectF Y6;
    public float Y7;
    public oy8 Y8;
    public final float[] Z0;
    public final Paint Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public final Paint Z4;
    public final Matrix Z5;
    public final Path Z6;
    public final RectF Z7;
    public oy8 Z8;
    public boolean a;
    public long a0;
    public final float[] a1;
    public boolean a2;
    public Bitmap a3;
    public final float[] a4;
    public final Rect a5;
    public final Paint a6;
    public final Path a7;
    public final TextPaint a8;
    public oy8 a9;
    public final int b;
    public float b0;
    public final byte[] b1;
    public int b2;
    public BitmapShader b3;
    public final float[] b4;
    public final RectF b5;
    public float b6;
    public int b7;
    public final TextPaint b8;
    public Object b9;
    public final z24 c;
    public float c0;
    public final boolean[] c1;
    public int c2;
    public final Paint c3;
    public final float[] c4;
    public final int[] c5;
    public long c6;
    public final RectF c7;
    public final TextPaint c8;
    public float c9;
    public String d;
    public float d0;
    public int d1;
    public final HashMap d2;
    public final Paint d3;
    public final float[] d4;
    public final float[] d5;
    public long d6;
    public final Matrix d7;
    public TextPaint d8;
    public String d9;
    public String e;
    public float e0;
    public boolean e1;
    public Runnable e2;
    public final Matrix e3;
    public int e4;
    public final float[] e5;
    public boolean e6;
    public final SparseArray e7;
    public final TextPaint e8;
    public long e9;
    public String f;
    public float f0;
    public final Random f1;
    public boolean f2;
    public final RectF f3;
    public float[] f4;
    public final float[] f5;
    public boolean f6;
    public final Drawable[] f7;
    public StaticLayout f8;
    public float f9;
    public float g0;
    public float g1;
    public boolean g2;
    public float g3;
    public float[] g4;
    public final float[] g5;
    public int g6;
    public final RectF g7;
    public int g8;
    public boolean g9;
    public boolean h;
    public float h0;
    public float h1;
    public Bitmap h2;
    public boolean h3;
    public float[] h4;
    public final float[] h5;
    public int h6;
    public final RectF h7;
    public boolean h8;
    public float h9;
    public float i0;
    public int i1;
    public final int[] i2;
    public boolean i3;
    public int i4;
    public final boolean[] i5;
    public int i6;
    public final RectF i7;
    public final String i8;
    public float i9;
    public float j0;
    public float j1;
    public xsa j2;
    public byte j3;
    public int j4;
    public int j5;
    public float j6;
    public final RectF j7;
    public final String j8;
    public float j9;
    public float k0;
    public float k1;
    public final su2 k2;
    public final float[] k3;
    public PorterDuffColorFilter k4;
    public float k5;
    public float k6;
    public final RectF k7;
    public vl k8;
    public final OverScroller k9;
    public VelocityTracker l0;
    public float l1;
    public final ow8 l2;
    public final float[] l3;
    public int l4;
    public float l5;
    public float l6;
    public boolean l7;
    public oy8 l8;
    public final ViewConfiguration l9;
    public float m0;
    public float m1;
    public boolean m2;
    public final int[] m3;
    public float m4;
    public StaticLayout m5;
    public float m6;
    public boolean m7;
    public long m8;
    public VelocityTracker m9;
    public tw8 n;
    public float n0;
    public String n1;
    public long n2;
    public final int[] n3;
    public float n4;
    public boolean n5;
    public final float[] n6;
    public float n7;
    public boolean n8;
    public boolean n9;
    public float o0;
    public int o1;
    public long o2;
    public final float[] o3;
    public float o4;
    public final float[] o5;
    public final Paint o6;
    public float o7;
    public TLRPC.TL_inputStickerSetShortName o8;
    public boolean o9;
    public float p0;
    public String p1;
    public long p2;
    public final float[] p3;
    public float p4;
    public final float[] p5;
    public float p6;
    public long p7;
    public TLRPC.Document p8;
    public final ow8 p9;
    public float q0;
    public String q1;
    public float q2;
    public float q3;
    public float q4;
    public final float[] q5;
    public boolean q6;
    public boolean q7;
    public long q8;
    public final RippleDrawable[] q9;
    public tw8 r;
    public int r0;
    public final RectF r1;
    public long r2;
    public final double[] r3;
    public float r4;
    public final float[] r5;
    public float r6;
    public float r7;
    public LinearGradient[] r8;
    public int r9;
    public float s;
    public long s0;
    public boolean s1;
    public final RectF s2;
    public final double[] s3;
    public final long[] s4;
    public final float[] s5;
    public boolean s6;
    public float s7;
    public int[] s8;
    public final Paint s9;
    public final hv8 t0;
    public float t1;
    public boolean t2;
    public final double[] t3;
    public final float[] t4;
    public final float[] t5;
    public Object t6;
    public long t7;
    public final nm4 t8;
    public final Path t9;
    public gv8 u0;
    public float u1;
    public float u2;
    public int u3;
    public final float[] u4;
    public final float[] u5;
    public float u6;
    public final RectF u7;
    public int u8;
    public final float[] u9;
    public gv8 v0;
    public long v1;
    public String v2;
    public int v3;
    public final float[] v4;
    public final float[] v5;
    public int v6;
    public long v7;
    public int v8;
    public final float[] v9;
    public long w;
    public boolean w0;
    public final ArrayList w1;
    public String w2;
    public float w3;
    public final float[] w4;
    public final float[] w5;
    public int w6;
    public float w7;
    public float w8;
    public final long[] w9;
    public float x;
    public boolean x0;
    public long x1;
    public String x2;
    public float x3;
    public final long[] x4;
    public final float[] x5;
    public final SparseIntArray x6;
    public float x7;
    public float x8;
    public final long[] x9;
    public float y;
    public boolean y0;
    public boolean y1;
    public String y2;
    public float y3;
    public final boolean[] y4;
    public final float[] y5;
    public int y6;
    public float y7;
    public final RectF[] y8;
    public final float[] y9;
    public boolean z0;
    public final HashMap z1;
    public final TextPaint z2;
    public boolean z3;
    public final Paint z4;
    public final float[] z5;
    public boolean z6;
    public final RectF z7;
    public long z8;
    public final float[] z9;
    public static final String[] B9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static int F9 = ld0.b("Black");
    public static int G9 = ld0.b("Neon Blue");
    public static final int H9 = gl.L(70.0f);
    public static final float K9 = 0.309017f;
    public static final float L9 = 0.95105654f;
    public static final s33 Q9 = new s33(0.16d, 1.0d, 0.3d, 1.0d);

    public vw8(Context context, int i, String str, String str2, boolean z, z24 z24Var) {
        super(context);
        gv8 c;
        this.a = true;
        this.s = 1.0f;
        this.E = AnimationUtils.currentAnimationTimeMillis();
        this.F = new Matrix();
        this.G = new sw8();
        this.J = new ArrayList();
        this.K = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N = -1.0f;
        this.t0 = new hv8();
        this.x0 = true;
        this.y0 = true;
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
        this.a1 = new float[320];
        this.b1 = new byte[320];
        this.c1 = new boolean[320];
        this.f1 = new Random();
        this.i1 = 0;
        this.r1 = new RectF();
        this.w1 = new ArrayList();
        this.z1 = new HashMap();
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new TextPaint(1);
        this.F1 = new Path();
        this.G1 = new RectF();
        this.J1 = -1;
        this.V1 = new Paint(1);
        this.W1 = k96.M0(2131746277, null);
        this.Z1 = new Paint(1);
        this.b2 = 1;
        this.d2 = new HashMap();
        this.i2 = new int[3];
        this.k2 = new su2(this, (byte) 3);
        this.l2 = new Runnable(this) {
            public final vw8 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                byte b = r2;
                vw8 vw8Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = vw8Var.w1;
                        for (int i2 = 0; i2 < Math.min(arrayList.size(), 9); i2++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i2);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i3);
                                i3++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    vw8Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            vw8Var.l1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        ArrayList arrayList3 = vw8Var.J;
                        if (vw8Var.g1 >= 0.5f && vw8Var.i1 == 1 && !vw8Var.o9) {
                            float f = vw8Var.h9;
                            float f2 = vw8Var.i9;
                            float width = (vw8Var.getWidth() - gl.L(28.0f)) / 6.0f;
                            RectF rectF = vw8Var.u7;
                            float L2 = (vw8Var.k1 + f2) - (rectF.top + gl.L(16.0f));
                            int i4 = -1;
                            if (L2 >= 0.0f && f >= gl.L(14.0f) && f2 >= rectF.top + gl.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f - gl.L(14.0f)) / width))) >= 0 && L < 36) {
                                i4 = L;
                            }
                            if (i4 >= 0) {
                                String[] strArr = vw8.B9;
                                if (arrayList3.contains(strArr[i4]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i4])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    vw8Var.c();
                                    vw8Var.i0();
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
        this.q2 = 1.0f;
        this.s2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.z2 = textPaint;
        textPaint.setTypeface(gl.o());
        this.B2 = -1;
        this.F2 = -1.0f;
        this.M2 = -1.0f;
        this.O2 = -1L;
        this.P2 = "";
        this.Q2 = -1.0f;
        this.T2 = new Paint(3);
        this.Y2 = 1.0f;
        this.c3 = new Paint(2);
        this.d3 = new Paint(3);
        this.e3 = new Matrix();
        this.f3 = new RectF();
        this.k3 = new float[14];
        this.l3 = new float[14];
        this.m3 = new int[7];
        this.n3 = new int[7];
        this.o3 = new float[15];
        this.p3 = new float[15];
        this.q3 = -1.0f;
        this.r3 = new double[3];
        this.s3 = new double[3];
        this.t3 = new double[3];
        this.u3 = gl.m;
        this.v3 = gl.n;
        this.C3 = new Paint(2);
        this.D3 = new RectF();
        this.H3 = 5.0f;
        this.I3 = -0.7071f;
        this.J3 = 0.7071f;
        this.M3 = new rw8();
        this.O3 = 1.0f;
        this.P3 = -1.0f;
        this.R3 = new Path();
        this.U3 = -1.0f;
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.X3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Y3 = new int[1024];
        this.Z3 = new int[1024];
        this.a4 = new float[1024];
        this.b4 = new float[1024];
        this.c4 = new float[1024];
        this.d4 = new float[1024];
        this.j4 = -1;
        this.l4 = -1;
        this.s4 = new long[2048];
        this.t4 = new float[2048];
        this.u4 = new float[2048];
        this.v4 = new float[2048];
        this.w4 = new float[2048];
        this.x4 = new long[2048];
        this.y4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.z4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A4 = (float) Math.random();
        this.B4 = new Paint(2);
        this.C4 = new Paint(2);
        this.D4 = new RectF();
        this.E4 = new float[96];
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new long[96];
        this.N4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.O4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P4 = new RectF();
        this.Q4 = 1.0f;
        this.R4 = 1.0f;
        this.T4 = true;
        this.U4 = 1.0f;
        this.Z4 = new Paint(2);
        this.a5 = new Rect();
        this.b5 = new RectF();
        this.c5 = new int[4];
        this.d5 = new float[4];
        this.e5 = new float[4];
        this.f5 = new float[240];
        this.g5 = new float[240];
        this.h5 = new float[240];
        this.i5 = new boolean[240];
        this.o5 = new float[240];
        this.p5 = new float[240];
        this.q5 = new float[240];
        this.r5 = new float[240];
        this.s5 = new float[240];
        this.t5 = new float[240];
        this.u5 = new float[240];
        this.v5 = new float[240];
        this.w5 = new float[240];
        this.x5 = new float[240];
        this.y5 = new float[240];
        this.z5 = new float[240];
        this.A5 = new boolean[240];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.C5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.D5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.E5 = new Path();
        this.F5 = new TextPaint(65);
        this.J5 = new RectF();
        this.K5 = new RectF();
        this.L5 = new Path();
        this.M5 = new float[7];
        this.O5 = new Matrix();
        this.P5 = new Matrix();
        this.Q5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.R5 = new LongSparseArray();
        this.S5 = new Path();
        this.U5 = new RectF();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.Z5 = new Matrix();
        this.a6 = new Paint();
        this.l6 = 0.85f;
        this.n6 = new float[320];
        Paint paint6 = new Paint();
        this.o6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.p6 = 1.0f;
        this.q6 = true;
        this.u6 = -1.0f;
        this.v6 = -1;
        this.x6 = new SparseIntArray();
        this.y6 = -1;
        this.B6 = -1;
        this.C6 = new SweepGradient[4];
        this.O6 = new qw8(this);
        this.W6 = new Matrix();
        this.X6 = new Path();
        this.Y6 = new RectF();
        this.Z6 = new Path();
        this.a7 = new Path();
        this.b7 = -1;
        this.c7 = new RectF();
        this.d7 = new Matrix();
        this.e7 = new SparseArray();
        this.g7 = new RectF();
        this.h7 = new RectF();
        this.i7 = new RectF();
        this.j7 = new RectF();
        this.k7 = new RectF();
        this.n7 = 1.0f;
        this.o7 = 1.0f;
        this.r7 = 1.0f;
        this.s7 = 1.0f;
        this.u7 = new RectF();
        this.z7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.A7 = linearGradient2;
        Paint paint7 = new Paint();
        this.B7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.C7 = new Matrix();
        this.D7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.E7 = -1.0f;
        this.F7 = -1.0f;
        this.I7 = new RectF();
        this.J7 = new HashMap();
        this.K7 = new HashMap();
        this.L7 = -1;
        this.M7 = F9;
        this.P7 = -1;
        this.Q7 = -1;
        this.U7 = gl.L(20.17f);
        this.V7 = -1;
        this.X7 = -1L;
        this.Y7 = 1.0f;
        this.Z7 = new RectF();
        this.a8 = new TextPaint(1);
        this.b8 = new TextPaint(1);
        this.c8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.e8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.i8 = k96.M0(2131746299, null);
        this.j8 = k96.M0(2131746309, null);
        int[] iArr = ld0.b;
        this.r8 = new LinearGradient[iArr.length];
        this.s8 = new int[iArr.length];
        this.t8 = new nm4();
        this.u8 = -100;
        this.v8 = -100;
        this.y8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.I8 = new Path();
        this.J8 = new RectF();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.Q8 = new Paint(3);
        this.R8 = new Paint(1);
        this.S8 = new RectF();
        this.c9 = -1.0f;
        this.k9 = new OverScroller(getContext());
        this.l9 = ViewConfiguration.get(getContext());
        this.p9 = new Runnable(this) {
            public final vw8 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                byte b = r2;
                vw8 vw8Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList = vw8Var.w1;
                        for (int i2 = 0; i2 < Math.min(arrayList.size(), 9); i2++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i2);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i3);
                                i3++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    vw8Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            vw8Var.l1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        ArrayList arrayList3 = vw8Var.J;
                        if (vw8Var.g1 >= 0.5f && vw8Var.i1 == 1 && !vw8Var.o9) {
                            float f = vw8Var.h9;
                            float f2 = vw8Var.i9;
                            float width = (vw8Var.getWidth() - gl.L(28.0f)) / 6.0f;
                            RectF rectF = vw8Var.u7;
                            float L2 = (vw8Var.k1 + f2) - (rectF.top + gl.L(16.0f));
                            int i4 = -1;
                            if (L2 >= 0.0f && f >= gl.L(14.0f) && f2 >= rectF.top + gl.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f - gl.L(14.0f)) / width))) >= 0 && L < 36) {
                                i4 = L;
                            }
                            if (i4 >= 0) {
                                String[] strArr = vw8.B9;
                                if (arrayList3.contains(strArr[i4]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i4])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    vw8Var.c();
                                    vw8Var.i0();
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
        this.q9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.r9 = -1;
        this.s9 = new Paint(1);
        this.t9 = new Path();
        this.u9 = new float[12];
        this.v9 = new float[12];
        this.w9 = new long[12];
        this.x9 = new long[12];
        this.y9 = new float[12];
        this.z9 = new float[12];
        this.A9 = new Rect[12];
        for (int i2 = 0; i2 < 12; i2++) {
            this.A9[i2] = new Rect();
        }
        this.b = i;
        this.d = str;
        this.f = str2;
        this.h = z;
        this.c = z24Var;
        this.M1 = w(2131232368);
        this.N1 = w(2131232119);
        this.O1 = w(2131232324);
        this.V1.setTypeface(gl.o());
        Drawable w = w(2131232102);
        this.P1 = w;
        Drawable w2 = w(2131231516);
        this.Q1 = w2;
        Drawable w3 = w(2131231831);
        this.R1 = w3;
        this.X1 = new ed0(true);
        this.S1 = w(2131232347);
        this.T1 = w(2131232332);
        this.U1 = new xt();
        this.K1 = w(2131232108);
        this.L1 = w(2131231861);
        this.f7 = new Drawable[]{w, w2, w3};
        oy8 oy8Var = new oy8(2131624136, gl.L(60.0f), gl.L(60.0f), false, null);
        this.Y1 = oy8Var;
        oy8Var.M(this);
        oy8Var.F(1);
        oy8Var.setCallback(this);
        oy8Var.start();
        Paint paint8 = this.Z1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Z1.setStrokeCap(Paint.Cap.ROUND);
        this.Z1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.D1.setTextSize(gl.L(11.0f));
        this.E1.setTypeface(gl.o());
        this.B1.setStyle(style);
        gn gnVar = new gn(false, true, true);
        this.M0 = gnVar;
        gnVar.w(gl.L(11.0f));
        gnVar.n(0.35f, 280L, s33.h);
        gnVar.setCallback(this);
        gnVar.b = 3;
        tw8 t = t(F9);
        this.n = t;
        this.b7 = W0(t.c);
        if (str != null) {
            String str3 = this.d;
            if (str3.equals(I9) && (c = J9) != null) {
                this.u0 = c;
            } else {
                c = hv8.c(str3, gl.L(240.0f), w34.M, 0.75f, null);
                this.u0 = c;
                J9 = c;
                I9 = str3;
            }
            this.t0.a(c);
        }
        t1(false);
    }

    public static void C0(double d, double d2, double d3, double[] dArr) {
        double d4 = (0.2158037573d * d3) + (0.3963377774d * d2) + d;
        double d5 = (d - (0.1055613458d * d2)) - (0.0638541728d * d3);
        double d6 = (d - (d2 * 0.0894841775d)) - (d3 * 1.291485548d);
        double d7 = d4 * d4 * d4;
        double d8 = d5 * d5 * d5;
        double d9 = d6 * d6 * d6;
        dArr[0] = (0.2309699292d * d9) + ((4.0767416621d * d7) - (3.3077115913d * d8));
        dArr[1] = ((2.6097574011d * d8) + ((-1.2684380046d) * d7)) - (0.3413193965d * d9);
        dArr[2] = (d9 * 1.707614701d) + ((d7 * (-0.0041960863d)) - (d8 * 0.7034186147d));
    }

    public static int D0(float f, float f2, float f3, int i) {
        float f4;
        float h1 = h1(Color.red(i));
        float h12 = h1(Color.green(i));
        float h13 = h1(Color.blue(i));
        float cbrt = (float) Math.cbrt((0.051445995f * h13) + (0.53633255f * h12) + (0.41222146f * h1));
        float cbrt2 = (float) Math.cbrt((0.10739696f * h13) + (0.6806995f * h12) + (0.2119035f * h1));
        float f5 = h13 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f5 + (h12 * 0.28171885f) + (h1 * 0.08830246f));
        float f6 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f7 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f6, f7);
        if (hypot > 1.0E-5f) {
            f4 = Math.min(f3, f2 * hypot) / hypot;
        } else {
            f4 = 0.0f;
        }
        float f8 = f6 * f4;
        float f9 = f7 * f4;
        float f10 = (0.21580376f * f9) + (0.39633778f * f8) + f;
        float f11 = (f - (0.105561346f * f8)) - (0.06385417f * f9);
        float f12 = (f - (f8 * 0.08948418f)) - (f9 * 1.2914855f);
        float f13 = f10 * f10 * f10;
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        return Color.rgb(w0((0.23096994f * f15) + ((4.0767417f * f13) - (3.3077116f * f14))), w0(((2.6097574f * f14) + ((-1.268438f) * f13)) - (0.34131938f * f15)), w0((f15 * 1.7076147f) + ((f13 * (-0.0041960864f)) - (f14 * 0.7034186f))));
    }

    public static float S(float f, float f2) {
        float f3 = f - 1.0f;
        return b00.w(f2, f3, f3, ((f2 + 1.0f) * f3 * f3 * f3) + 1.0f);
    }

    public static int W0(int i) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        n1(i, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i) {
        double[] dArr = new double[3];
        bm2.j(i, dArr);
        return bm2.o(bm2.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f, int i) {
        return bm2.o(i, (int) (Utilities.l(f) * Color.alpha(i)));
    }

    public static void b0(double d, double d2, double d3, double[] dArr) {
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        C0(d, d2 * cos, d2 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d4 = 0.0d;
        double d5 = d2;
        for (int i = 0; i < 14; i++) {
            double d6 = (d4 + d5) / 2.0d;
            C0(d, d6 * cos, d6 * sin, dArr);
            if (p0(dArr)) {
                d4 = d6;
            } else {
                d5 = d6;
            }
        }
        C0(d, d4 * cos, d4 * sin, dArr);
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

    public static float e1(boolean z, boolean z2, float f) {
        if (z) {
            if (f > 0.0f) {
                return oo1.x(f, 0.18f, 1.0f, 0.0f);
            }
        } else {
            if (!z2) {
                f -= 0.135f;
            }
            if (f <= 0.0f) {
                return 0.0f;
            }
            if (f < 0.315f) {
                return h(f / 0.315f);
            }
        }
        return 1.0f;
    }

    public static float f1(float f, float f2, float f3) {
        float l = Utilities.l((f3 - f) / (f2 - f));
        return yjb.B(l, 2.0f, 3.0f, l * l);
    }

    public static int g(float f, int i) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f)) * 255.0f)) << 24) | (i & 16777215);
    }

    public static double g1(double d, double d2, double d3) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d4 = 6.283185307179586d / d3;
        double d5 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d5) * d4;
        double d6 = sqrt * d;
        return 1.0d - (((Math.sin(d6) * (d2 / Math.sqrt(d5))) + Math.cos(d6)) * Math.exp(((-d2) * d4) * d));
    }

    public static float h(float f) {
        float f2 = f - 1.0f;
        return b00.w(f2, 1.70158f, f2, (2.70158f * f2 * f2 * f2) + 1.0f);
    }

    public static float h1(int i) {
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static boolean i() {
        if (yz.o() && e66.e(256)) {
            return true;
        }
        return false;
    }

    public static float j(long j, float f, float f2) {
        if (j == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = ((float) (AnimationUtils.currentAnimationTimeMillis() - j)) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f3 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return gl.R1(f + 1.0f, 1.0f - f2, yjb.B(f3, 2.0f, 3.0f, f3 * f3));
        }
        float f4 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return gl.R1(1.0f - f2, 1.0f, yjb.B(f4, 2.0f, 3.0f, f4 * f4));
    }

    public static void k() {
        if (C9 == null) {
            int length = ld0.b.length;
            C9 = new int[length];
            D9 = new int[length];
            E9 = new int[length];
            for (int i = 0; i < length; i++) {
                C9[i] = x(ld0.b[i], false);
                D9[i] = x(ld0.c[i], true);
                E9[i] = v(C9[i], D9[i]);
            }
        }
    }

    public static float k0(int i, int i2, int i3) {
        int i4 = i3 * 1442695041;
        int i5 = i4 + (i2 * 668265263) + (i * 374761393);
        int i6 = (i5 ^ (i5 >>> 13)) * 1274126177;
        return ((i6 ^ (i6 >>> 16)) & 65535) / 65535.0f;
    }

    public static int k1(int i, int i2) {
        int i3 = i | (-16777216);
        int i4 = i2 | (-16777216);
        if (bm2.g(i3, i4) < 1.15d) {
            double[] dArr = new double[3];
            bm2.j(i3, dArr);
            for (int i5 = 0; i5 < 40 && bm2.g(i3, i4) < 1.15d; i5++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i3 = bm2.b(max, dArr[1], dArr[2]);
            }
        }
        return bm2.o(i3, 95);
    }

    public static boolean m0(float f, float f2, RectF rectF) {
        float L = gl.L(8.0f);
        if (!rectF.isEmpty() && f >= rectF.left - L && f <= rectF.right + L && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
            return true;
        }
        return false;
    }

    public static void n1(int i, double[] dArr) {
        double v0 = v0(Color.red(i) / 255.0d);
        double v02 = v0(Color.green(i) / 255.0d);
        double v03 = v0(Color.blue(i) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * v03) + (0.5363325363d * v02) + (0.4122214708d * v0));
        double cbrt2 = Math.cbrt((0.1073969566d * v03) + (0.6806995451d * v02) + (0.2119034982d * v0));
        double d = v03 * 0.6299787005d;
        double cbrt3 = Math.cbrt(d + (v02 * 0.2817188376d) + (v0 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static boolean p0(double[] dArr) {
        double d = dArr[0];
        if (d >= -1.0E-4d && d <= 1.0001d) {
            double d2 = dArr[1];
            if (d2 >= -1.0E-4d && d2 <= 1.0001d) {
                double d3 = dArr[2];
                if (d3 >= -1.0E-4d && d3 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i3 = 16777215 & i;
        int i4 = i >>> 24;
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = ((((iArr[i5] >>> 24) * i4) / 255) << 24) | i3;
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

    public static Bitmap r0(sw8 sw8Var, Bitmap bitmap, boolean z) {
        if (z) {
            Bitmap bitmap2 = sw8Var.m;
            if (bitmap2 != null && sw8Var.n == bitmap && sw8Var.p == sw8Var.j) {
                return bitmap2;
            }
            Bitmap q0 = q0(bitmap, bitmap2, sw8Var.j);
            sw8Var.m = q0;
            sw8Var.n = bitmap;
            sw8Var.p = sw8Var.j;
            return q0;
        }
        Bitmap bitmap3 = sw8Var.k;
        if (bitmap3 != null && sw8Var.l == bitmap && sw8Var.o == sw8Var.j) {
            return bitmap3;
        }
        Bitmap q02 = q0(bitmap, bitmap3, sw8Var.j);
        sw8Var.k = q02;
        sw8Var.l = bitmap;
        sw8Var.o = sw8Var.j;
        return q02;
    }

    public static void s(int[] iArr, byte[] bArr, int i) {
        int i2 = 16777215 & i;
        int i3 = i >>> 24;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr[i4] = ((((bArr[i4] & 255) * i3) / 255) << 24) | i2;
        }
    }

    public static float s1(float f, float f2, float f3) {
        float N = (f - f3) / gl.N(1.7f);
        float N2 = f2 / gl.N(3.2f);
        float v1 = v1(N * 2.6f, N2 * 1.7f, 91) * 0.32f;
        return gl.N(3.6f) * ((v1 + (v1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    private void setPattern(sw8 sw8Var) {
        boolean z;
        if (this.g2) {
            sw8 sw8Var2 = this.H;
            if (sw8Var2 != null && sw8Var2 != this.G) {
                P0(sw8Var2);
            }
            sw8 sw8Var3 = this.G;
            if (sw8Var3 != sw8Var) {
                P0(sw8Var3);
            }
            this.H = null;
            this.G = sw8Var;
            if (sw8Var.a == 2) {
                Z(sw8Var);
                if (sw8Var.e == null) {
                    sw8Var.f = this.h2;
                }
            }
            this.I = AnimationUtils.currentAnimationTimeMillis() - 10000;
            invalidate();
            return;
        }
        if (this.s < 1.0f && this.r != null) {
            z = true;
        } else {
            z = false;
        }
        sw8Var.h = z;
        if (sw8Var.a == 2) {
            Z(sw8Var);
            if (sw8Var.e == null) {
                sw8Var.f = this.h2;
            }
        }
        sw8 sw8Var4 = this.H;
        if (sw8Var4 != null && sw8Var4 != this.G) {
            P0(sw8Var4);
        }
        this.H = this.G;
        this.G = sw8Var;
        this.I = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    private void setSceneFromCard(tw8 tw8Var) {
        Y0(tw8Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.g2) {
            return;
        }
        this.q2 = j(this.o2, 0.03f, 0.005f);
        this.o2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static tw8 t(int i) {
        ?? obj = new Object();
        obj.a = (byte) 0;
        obj.f = i;
        if (i == G9) {
            obj.b = -12602881;
            obj.c = -15308082;
            obj.d = ld0.d[i];
        } else {
            obj.b = x(ld0.b[i], false);
            obj.c = x(ld0.c[i], true);
            obj.d = ld0.d[i];
        }
        if (i == G9) {
            obj.e = -16747023;
        } else {
            k();
            obj.e = E9[i];
        }
        obj.h = Z0(obj.b);
        obj.g = hv8.k(0.5f, obj.b, obj.c);
        return obj;
    }

    public static int u(tw8 tw8Var) {
        int i;
        double d;
        int i2;
        if (tw8Var != null) {
            i = bm2.f(0.5f, tw8Var.b, tw8Var.c);
            d = bm2.h(tw8Var.b);
        } else {
            i = -16777216;
            d = 0.3d;
        }
        float[] fArr = lcd.b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f = (fArr[11] / 100.0f) + 1.0f;
        float f2 = ((0.5f - (f * 0.5f)) + max) * 255.0f;
        int k = bm2.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(i) * f) + f2))), Math.max(0, Math.min(255, Math.round((Color.green(i) * f) + f2))), Math.max(0, Math.min(255, Math.round((f * Color.blue(i)) + f2)))));
        if (tw8Var != null) {
            i2 = tw8Var.h;
        } else {
            i2 = 1073741824;
        }
        return bm2.k(i2, k);
    }

    public static double u0(int i, int i2) {
        long j = (i * (-7046029254386353131L)) ^ (i2 * (-4417276706812531889L));
        long j2 = (j ^ (j >>> 31)) * (-4658895280553007687L);
        long j3 = (j2 ^ (j2 >>> 27)) * (-7723592293110705685L);
        return ((j3 ^ (j3 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static float u1(float f) {
        int floor = (int) Math.floor(f);
        float f2 = f - floor;
        float B = yjb.B(f2, 2.0f, 3.0f, f2 * f2);
        float c0 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c0) * B) + c0;
    }

    public static int v(int i, int i2) {
        double d;
        double d2;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        n1(i2, dArr);
        n1(i, dArr2);
        double d3 = dArr[0];
        if (d3 < 0.45d) {
            d = d3 - 0.03d;
        } else {
            d = 2.0d;
        }
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d4 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d5 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d5, d4);
            d2 = 2.0d;
            min = Math.min(0.012d, Math.hypot(d4, d5));
        } else {
            d2 = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d6 = 0.9d;
        double d7 = 0.2d;
        int i3 = 0;
        while (i3 < 12) {
            double d8 = (d7 + d6) / d2;
            double d9 = atan2;
            double d10 = min;
            b0(d8, d10, d9, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d7 = d8;
            } else {
                d6 = d8;
            }
            i3++;
            min = d10;
            atan2 = d9;
        }
        double d11 = atan2;
        double d12 = min;
        double d13 = (d7 + d6) / d2;
        if (d13 > d) {
            d13 = Math.max(0.05d, d);
        }
        b0(d13, d12, d11, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        if (d <= 0.04045d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f, float f2, int i) {
        int floor = (int) Math.floor(f);
        int floor2 = (int) Math.floor(f2);
        float f3 = f - floor;
        float f4 = f2 - floor2;
        float B = yjb.B(f3, 2.0f, 3.0f, f3 * f3);
        float B2 = yjb.B(f4, 2.0f, 3.0f, f4 * f4);
        float k0 = k0(floor, floor2, i);
        int i2 = floor + 1;
        float k02 = k0(i2, floor2, i);
        int i3 = floor2 + 1;
        float k03 = k0(floor, i3, i);
        float k04 = k0(i2, i3, i);
        float A = tb4.A(k02, k0, B, k0);
        return (((((k04 - k03) * B) + k03) - A) * B2) + A;
    }

    public static int w0(float f) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f;
        }
        return Math.round(Math.max(0.0f, Math.min(1.0f, pow)) * 255.0f);
    }

    public static int x(int i, boolean z) {
        double[] dArr = new double[3];
        bm2.j(i, dArr);
        if (!z) {
            return i;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d2 = dArr[2] * 1.03d;
        dArr[2] = d2;
        return bm2.b(max, d, d2);
    }

    public static PorterDuffColorFilter x0(sw8 sw8Var) {
        float[] fArr = lcd.b;
        int i = ((int) (fArr[14] * 10.0f)) ^ sw8Var.s;
        PorterDuffColorFilter porterDuffColorFilter = sw8Var.u;
        if (porterDuffColorFilter != null && sw8Var.t == i) {
            return porterDuffColorFilter;
        }
        sw8Var.t = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(bm2.f(fArr[14] / 100.0f, sw8Var.s, -1), PorterDuff.Mode.SRC_IN);
        sw8Var.u = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public static float x1(float f) {
        return 1.0f - ((float) Math.pow(1.0f - f, 2.4000000953674316d));
    }

    public final void A(android.graphics.Canvas r49, int r50) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.A(android.graphics.Canvas, int):void");
    }

    public final PorterDuffColorFilter A0(sw8 sw8Var) {
        float[] fArr = lcd.b;
        int i = ((int) (fArr[30] * 10.0f)) ^ (sw8Var.s * 31);
        PorterDuffColorFilter porterDuffColorFilter = this.k4;
        if (porterDuffColorFilter != null && this.l4 == i) {
            return porterDuffColorFilter;
        }
        this.l4 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(bm2.f(fArr[30] / 100.0f, sw8Var.s, -1), PorterDuff.Mode.SRC_IN);
        this.k4 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public final void B(android.graphics.Canvas r80, int r81) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.B(android.graphics.Canvas, int):void");
    }

    public final void B0() {
        z24 z24Var;
        kw8 kw8Var;
        if (!this.f2 && (z24Var = this.c) != null && (kw8Var = ((gw8) z24Var.b).e) != null) {
            kw8Var.j();
        }
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f, float f2) {
        int i;
        int i2;
        RectF rectF2;
        float f3;
        float f4;
        float[][] fArr;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        int i4;
        int i5;
        float f13;
        int i6;
        Path path2 = path;
        int i7 = 1;
        if (path2 == null) {
            if (this.z6) {
                i6 = 1;
            } else if (this.A6) {
                i6 = 2;
            } else {
                i6 = 0;
            }
            if (uv8.a(f, f2, i6, canvas, rectF)) {
                return;
            }
        }
        int i8 = this.B6;
        SweepGradient[] sweepGradientArr = this.C6;
        int i9 = 4;
        float[][] fArr2 = lcd.a;
        if (i8 != 1) {
            this.B6 = 1;
            int i10 = 0;
            while (i10 < i9) {
                float[] fArr3 = fArr2[i10];
                int i11 = i9;
                int[] iArr = new int[73];
                int i12 = i7;
                float[] fArr4 = new float[73];
                int i13 = 0;
                for (int i14 = 73; i13 < i14; i14 = 73) {
                    int i15 = i10;
                    double radians = Math.toRadians(i13 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    if (((float) Math.sin(radians)) < 0.0f) {
                        f13 = fArr3[11];
                    } else {
                        f13 = fArr3[12];
                    }
                    float f14 = f13 / 100.0f;
                    iArr[i13] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f14) * pow) + f14), 0);
                    fArr4[i13] = i13 / 72.0f;
                    i13++;
                    i10 = i15;
                }
                int i16 = i10;
                sweepGradientArr[i16] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i10 = i16 + 1;
                i9 = i11;
                i7 = i12;
            }
        }
        int i17 = i7;
        int i18 = i9;
        if (this.z6) {
            i = i17;
        } else if (this.A6) {
            i = 2;
        } else {
            i = 0;
        }
        float[] fArr5 = fArr2[i];
        float f15 = this.D6;
        float[] fArr6 = lcd.b;
        float f16 = f15 * fArr6[0];
        float f17 = (this.E6 * fArr6[i17]) / 100.0f;
        float N = gl.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.c7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i2 = i;
                Matrix matrix = this.W6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.X6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i2 = i;
            }
            f3 = Math.max(0.0f, f - N);
        } else {
            i2 = i;
            rectF2 = rectF;
            f3 = f;
        }
        Matrix matrix2 = this.d7;
        matrix2.setRotate(f16);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = gl.N(fArr5[i18]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i2];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.B1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f2 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.V5;
                rectF3.set(rectF2);
                float f18 = (-N2) / 2.0f;
                rectF3.inset(f18, f18);
                float f19 = (N2 / 2.0f) + f3;
                canvas.drawRoundRect(rectF3, f19, f19, paint);
            } else {
                canvas.save();
                yz.d(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(255);
        }
        double radians2 = Math.toRadians(f16);
        float f20 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = gl.N(fArr5[0]);
        float N4 = gl.N(fArr5[2]);
        if (this.A6) {
            f4 = 0.0f;
        } else {
            f4 = this.b6 * ((fArr6[21] * 1.25f) / 100.0f);
        }
        int i19 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        if (i19 > 0 && this.z3) {
            fArr = fArr2;
            f5 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        } else {
            fArr = fArr2;
            f5 = 0.0f;
        }
        if (i19 > 0 && this.z3) {
            f6 = c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        } else {
            f6 = 0.0f;
        }
        float min = Math.min(1.0f, ((f5 * f4) + 1.0f) * (f17 + 1.0f) * (fArr5[i17] / 100.0f));
        float min2 = Math.min(1.0f, ((f4 * f6) + 1.0f) * (1.0f - f17) * (fArr5[3] / 100.0f));
        if (Build.VERSION.SDK_INT >= 29) {
            i3 = i17;
        } else {
            i3 = 0;
        }
        int i20 = 0;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            if (i20 == 0) {
                f8 = min;
                f7 = N3;
            } else {
                f7 = -N4;
                f8 = min2;
            }
            if (f8 > 0.004f && Math.abs(f7) >= 0.1f) {
                canvas.save();
                Path path4 = this.Z6;
                f10 = min;
                Path path5 = this.a7;
                if (path2 == null) {
                    f11 = min2;
                    f12 = f20;
                    float min3 = Math.min(f3, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f9 = f3;
                    RectF rectF4 = this.Y6;
                    rectF4.set(rectF2);
                    i4 = i3;
                    rectF4.offset(f12 * f7, f7 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f9 = f3;
                    f11 = min2;
                    f12 = f20;
                    i4 = i3;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f12 * f7, f7 * cos);
                }
                yz.d(canvas, path5);
                Paint paint2 = this.A1;
                if (i4 == 0) {
                    float f21 = fArr[i2][10];
                    int i22 = this.b7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i22) - 255) * f21) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i22) - 255) * f21) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i22) - 255) * f21) + 255.0f)))));
                    paint2.setAlpha((int) (f8 * 255.0f * f2));
                    i5 = i17;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f8)) * 255.0f);
                    paint2.setColor((round << 16) | (-16777216) | (round << 8) | round);
                    paint2.setAlpha((int) (f2 * 255.0f));
                    i5 = i17;
                    yz.u(i5, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i4 != 0) {
                    yz.u(0, paint2);
                }
                canvas.restore();
            } else {
                f9 = f3;
                f10 = min;
                f11 = min2;
                f12 = f20;
                i4 = i3;
                i5 = i17;
            }
            i20++;
            i17 = i5;
            min = f10;
            min2 = f11;
            f20 = f12;
            f3 = f9;
            i3 = i4;
        }
    }

    public final void D(android.graphics.Canvas r18, defpackage.sw8 r19, int r20, float r21, float r22, float r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.D(android.graphics.Canvas, sw8, int, float, float, float, float, float):void");
    }

    public final void E(Canvas canvas, int i, int i2, sw8 sw8Var, sw8 sw8Var2, float f, boolean z, boolean z2) {
        float f2;
        float f3;
        boolean z3;
        float f4;
        int i3;
        float f5;
        boolean z4;
        float f6;
        float f7;
        int i4;
        int i5;
        vw8 vw8Var = this;
        sw8 sw8Var3 = sw8Var;
        sw8 sw8Var4 = sw8Var2;
        vw8Var.X(sw8Var3);
        vw8Var.X(sw8Var4);
        float L = gl.L(86.0f);
        float L2 = gl.L(70.0f);
        float L3 = gl.L(90.0f) * 1.3f;
        float f8 = vw8Var.L + vw8Var.O;
        float f9 = vw8Var.M + vw8Var.P;
        float f10 = -L3;
        boolean z5 = true;
        int ceil = ((int) Math.ceil(((i2 + L3) - f9) / L2)) + 1;
        int floor = ((int) Math.floor((f10 - f9) / L2)) - 1;
        while (floor <= ceil) {
            int i6 = floor & 1;
            if (i6 == 0) {
                f2 = 0.0f;
            } else {
                f2 = L / 2.0f;
            }
            boolean z6 = z5;
            int floor2 = ((int) Math.floor(((f10 - f8) - f2) / L)) - 1;
            int i7 = i;
            float f11 = L3;
            int ceil2 = ((int) Math.ceil((((i7 + L3) - f8) - f2) / L)) + 1;
            while (floor2 <= ceil2) {
                float f12 = L2;
                int i8 = ceil2;
                double u0 = u0(floor, floor2);
                if (c0(53.1d * u0) < 0.2f) {
                    f3 = f8;
                    i5 = floor2;
                    i3 = ceil;
                    i4 = floor;
                    f6 = f2;
                    f5 = L;
                    z4 = z6;
                    f7 = f10;
                } else {
                    vw8Var.G0(u0, 3.0f, 10.0f);
                    float f13 = f10;
                    float f14 = (float) (2.0d * u0 * 3.141592653589793d);
                    f3 = f8;
                    float i9 = vw8Var.L4 + ir2.i(floor2, L, f2, f8);
                    float sin = (((float) Math.sin((vw8Var.N3 * 0.45f) + f14)) * gl.L(3.0f)) + (floor * f12) + f9 + vw8Var.M4;
                    if (i6 == 0) {
                        z3 = z6;
                    } else {
                        z3 = false;
                    }
                    float L4 = gl.L(38.0f);
                    if (z3) {
                        f4 = 1.3f;
                    } else {
                        f4 = 0.9f;
                    }
                    float f15 = L4 * f4;
                    i3 = ceil;
                    float f16 = (float) u0;
                    float z7 = yjb.z(f16, 0.16f, 0.92f, f15);
                    f5 = L;
                    z4 = z6;
                    f6 = f2;
                    f7 = f13;
                    int i10 = floor2;
                    i4 = floor;
                    i5 = i10;
                    if (J0(i9, sin, z7, i7, i2, 0, floor, i10, (Math.max(0.0f, (z7 / gl.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z3) {
                            z7 *= 0.9f;
                        }
                        float f17 = z7;
                        float sin2 = (((float) Math.sin((this.N3 * 0.3f) + f14)) * 4.0f) + ((f16 - 0.5f) * 26.0f);
                        float c0 = c0(59.3d * u0) * 0.3f;
                        int i11 = (i5 - ((i4 - i6) / 2)) - i4;
                        int length = sw8Var4.b.length;
                        int i12 = ((i11 % length) + length) % length;
                        float c02 = c0(71.9d * u0);
                        if (sw8Var3 == null) {
                            D(canvas, sw8Var4, i12, f17, sin2, f14 * 2.0f, e1(z, z2, f - c0), c02);
                        } else {
                            sw8 sw8Var5 = sw8Var4;
                            Drawable[] drawableArr = sw8Var3.b;
                            int length2 = drawableArr.length;
                            int i13 = ((i11 % length2) + length2) % length2;
                            if (drawableArr[i13] == sw8Var5.b[i12]) {
                                D(canvas, sw8Var5, i12, f17, sin2, f14 * 2.0f, 1.0f, c02);
                            } else {
                                float f18 = f14 * 2.0f;
                                float f19 = f - c0;
                                D(canvas, sw8Var3, i13, f17, sin2, f18, e1(z4, false, f19), c02);
                                D(canvas, sw8Var2, i12, f17, sin2, f18, e1(false, false, f19), c02);
                            }
                        }
                    }
                }
                floor2 = i5 + 1;
                vw8Var = this;
                i7 = i;
                sw8Var3 = sw8Var;
                sw8Var4 = sw8Var2;
                floor = i4;
                f10 = f7;
                ceil2 = i8;
                f2 = f6;
                f8 = f3;
                ceil = i3;
                L = f5;
                z6 = z4;
                L2 = f12;
            }
            floor++;
            vw8Var = this;
            sw8Var3 = sw8Var;
            sw8Var4 = sw8Var2;
            z5 = z6;
            L2 = L2;
            L3 = f11;
        }
    }

    public final void E0(sw8 sw8Var, Bitmap bitmap) {
        sw8Var.e = bitmap;
        if (bitmap != null) {
            if (lcd.b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(sw8Var);
        }
        sw8Var.g = AnimationUtils.currentAnimationTimeMillis();
        this.h2 = bitmap;
        invalidate();
    }

    public final void F(android.graphics.Canvas r96, int r97, int r98, defpackage.sw8 r99, boolean r100, boolean r101, float r102) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.F(android.graphics.Canvas, int, int, sw8, boolean, boolean, float):void");
    }

    public final void F0(int i) {
        if (!this.a) {
            return;
        }
        if (i == 2) {
            if (!y6c.h(this.b).p()) {
                d1(0, k96.M0(2131746281, null), k96.M0(2131746280, null));
                i0();
                return;
            } else if (this.i1 != i || this.g1 < 0.5f) {
                AnimationUtils.currentAnimationTimeMillis();
            }
        }
        this.i1 = i;
        this.j1 = i;
        this.k1 = 0.0f;
        this.k9.forceFinished(true);
        if (this.g1 > 0.5f) {
            this.c6 = AnimationUtils.currentAnimationTimeMillis();
        }
        if (this.h1 < 0.5f) {
            this.J2 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.h1 = 1.0f;
        l0();
        if (this.i1 == 2) {
            y0();
        }
        i0();
    }

    public final void G(Canvas canvas, RectF rectF, int i) {
        float centerY = rectF.centerY();
        float L = gl.L(12.0f);
        gn gnVar = this.M0;
        float c = gnVar.c() + gl.L(2.0f) + L;
        float L2 = rectF.left + gl.L(8.0f);
        O(L2, centerY, L, i, canvas, true);
        gnVar.u(i);
        gnVar.setBounds((int) (L2 + L + gl.L(2.0f)), (int) (centerY - gl.L(8.0f)), (int) (L2 + c + gl.L(40.0f)), (int) (centerY + gl.L(8.0f)));
        gnVar.draw(canvas);
    }

    public final void G0(double d, float f, float f2) {
        double d2;
        float c0 = ((c0(31.7d * d) * (f2 - f)) + f) * gl.L(1.0f);
        float c02 = (c0(37.1d * d) * 11.0f) + 9.0f;
        if (c0(43.3d * d) < 0.5f) {
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        double d3 = (d * 6.283d) + ((((d2 * 2.0d) * 3.141592653589793d) * this.N3) / c02);
        this.L4 = ((float) Math.cos(d3)) * c0;
        this.M4 = c0 * ((float) Math.sin(d3));
    }

    public final void H(Canvas canvas, RectF rectF, float f) {
        int i;
        tw8 tw8Var = this.n;
        if (tw8Var != null) {
            i = bm2.f(0.5f, tw8Var.b, tw8Var.c);
        } else {
            i = -12947803;
        }
        Paint paint = this.A1;
        paint.setColor(i | (-16777216));
        paint.setAlpha((int) (Utilities.l(f) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + gl.L(8.0f);
    }

    public final void I(android.graphics.Canvas r30, int r31, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r32, float r33, float r34, float r35, float r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.I(android.graphics.Canvas, int, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, float, float, float, float):void");
    }

    public final void I0(float f, float f2, int i) {
        Path path;
        int i2;
        int i3;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.w1.get(i);
        ?? obj = new Object();
        obj.a = (byte) 2;
        obj.f = i;
        final sw8 sw8Var = new sw8();
        sw8Var.a = (byte) 2;
        sw8Var.q = i;
        long j = tL_starGiftUnique.id;
        sw8Var.r = (int) (j ^ (j >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i5);
            i5++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                sw8Var.A = document2;
                sw8Var.c = vl.l(this.b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                sw8Var.z = document;
                sw8Var.d = vl.l(this.b, 24, document);
            }
        }
        e0(this.i2, i);
        obj.b = x(this.i2[0], false);
        int x = x(this.i2[1], true);
        obj.c = x;
        obj.d = this.i2[2];
        obj.e = v(obj.b, x);
        obj.h = Z0(obj.b);
        obj.g = hv8.k(0.5f, obj.b, obj.c);
        sw8Var.j = k1(obj.d, obj.b);
        bm2.j(k1(obj.d, obj.b) | (-16777216), r9);
        double min = Math.min(97.0d, r9[0] + 20.0d);
        double[] dArr = {min};
        Color.colorToHSV(bm2.b(min, dArr[1], dArr[2]), r3);
        float[] fArr = {0.0f, Math.min(1.0f, fArr[1] * 1.15f)};
        sw8Var.s = Color.HSVToColor(fArr) | (-16777216);
        sw8Var.v.setColorFilter(new PorterDuffColorFilter(sw8Var.s, PorterDuff.Mode.SRC_IN));
        sw8Var.t = -1;
        sw8Var.B = tL_starGiftUnique;
        vl vlVar = sw8Var.c;
        if (vlVar != null) {
            vlVar.b(this);
        }
        vl vlVar2 = sw8Var.d;
        if (vlVar2 != null) {
            vlVar2.b(this);
        }
        TLRPC.Document document3 = sw8Var.z;
        if (document3 != null) {
            int i6 = 0;
            while (true) {
                if (i6 < document3.thumbs.size()) {
                    if (document3.thumbs.get(i6) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i6)).svgPath;
                        break;
                    }
                    i6++;
                } else {
                    path = null;
                    break;
                }
            }
            if (path != null) {
                while (true) {
                    if (i4 < document3.attributes.size()) {
                        TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i4);
                        if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i2 = documentAttribute.w) > 0 && (i3 = documentAttribute.h) > 0) {
                            break;
                        }
                        i4++;
                    } else {
                        i2 = 512;
                        i3 = 512;
                        break;
                    }
                }
                final Path path2 = new Path(path);
                float f3 = H9;
                final float f4 = f3 / i2;
                final float f5 = f3 / i3;
                final int i7 = sw8Var.j;
                Utilities.e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        float f6 = f4;
                        float f7 = f5;
                        int i8 = i7;
                        Path path3 = path2;
                        try {
                            int i9 = vw8.H9;
                            bitmap = Bitmap.createBitmap(i9, i9, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f6, f7);
                            Paint paint = new Paint(1);
                            paint.setColor(i8);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th) {
                            fa4.g(th, true);
                            bitmap = null;
                        }
                        gl.c3(new gm8(vw8.this, sw8Var, bitmap, (byte) 7));
                    }
                });
            }
        }
        this.J.clear();
        Y0(obj, f, f2);
        if (!this.g2) {
            this.q2 = j(this.o2, 0.03f, 0.005f);
            this.o2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(sw8Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f, float f2) {
        RectF rectF2;
        float f3;
        RectF rectF3;
        boolean z;
        float f4;
        char c;
        char c2;
        int i;
        double d;
        float f5;
        float f6;
        if (f2 <= 0.0f) {
            return;
        }
        if (this.A6) {
            float min = Math.min(0.0f, gl.N(lcd.a[2][8]));
            rectF3 = this.W5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f3 = f - min;
        } else {
            rectF2 = rectF;
            f3 = f;
            rectF3 = rectF2;
        }
        if (!j0(canvas) && this.Z2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.Z2 != null && this.b3 != null) {
            float f7 = this.g3;
            Matrix matrix = this.e3;
            matrix.setScale(f7, f7);
            float f8 = (-f7) / 2.0f;
            matrix.postTranslate(f8, f8);
            this.b3.setLocalMatrix(matrix);
            Paint paint = this.d3;
            paint.setAlpha((int) (Utilities.l(f2) * 255.0f));
            canvas.drawRoundRect(rectF3, f3, f3, paint);
            paint.setAlpha(255);
        }
        Path path = this.F1;
        path.rewind();
        path.addRoundRect(rectF3, f3, f3, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = lcd.b;
        if (z) {
            f4 = 0.0f;
            c = '\t';
            c2 = 3;
        } else if (yz.o() && j0(canvas)) {
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            f4 = 0.0f;
            if (i2 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f2 * 255.0f));
            }
            if (this.s6 && this.r6 > 0.004f) {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.t6 == null) {
                    this.t6 = mk1.d("qrSheetLift");
                }
                float round = Math.round(this.r6 * 50.0f) / 50.0f;
                c = '\t';
                tw8 tw8Var = this.n;
                if (tw8Var != null) {
                    i = tw8Var.b;
                } else {
                    i = 0;
                }
                if (round == this.u6 && this.v6 == 1 && this.w6 == i) {
                    c2 = 3;
                } else {
                    this.u6 = round;
                    this.v6 = 1;
                    this.w6 = i;
                    Object obj = this.t6;
                    if (tw8Var != null) {
                        d = bm2.h(tw8Var.b);
                    } else {
                        d = 0.3d;
                    }
                    c2 = 3;
                    float A = b00.A(fArr[11], 100.0f, round, 1.0f);
                    float max = ((0.5f - (A * 0.5f)) + ((fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d))))) * 255.0f;
                    yz.w(obj, Math.max(0.5f, gl.N(gl.R1(fArr[2], fArr[12], round)) / 8.0f), new float[]{A, 0.0f, 0.0f, 0.0f, max, 0.0f, A, 0.0f, 0.0f, max, 0.0f, 0.0f, A, 0.0f, max, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas c3 = yz.c((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.t6);
                c3.scale(0.125f, 0.125f);
                yz.h(c3, this.H1);
                yz.k(this.t6);
                yz.h(canvas, this.t6);
                canvas.restore();
            } else {
                c = '\t';
                c2 = 3;
                Object obj2 = this.I1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                yz.h(canvas, obj2);
                canvas.restore();
            }
            if (i2 < 0) {
                canvas.restore();
            }
        } else {
            f4 = 0.0f;
            c = '\t';
            c2 = 3;
            H(canvas, rectF3, f2);
        }
        int i3 = this.T8;
        if (i3 == 0) {
            float f9 = fArr[c2];
            if (this.s6) {
                f6 = fArr[c] * this.r6;
            } else {
                f6 = f4;
            }
            i3 = g((f9 + f6) / 100.0f, 16777215);
        }
        Paint paint2 = this.A1;
        paint2.setColor(i3);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f2));
        canvas.drawRect(rectF3, paint2);
        uv8.b(canvas, rectF3, f2);
        boolean z2 = this.s6;
        if (!z2 && !this.A6) {
            f5 = (fArr[21] / 100.0f) * this.b6;
        } else {
            f5 = f4;
        }
        if ((f5 > f4 || fArr[39] > f4) && this.z3 && !z2 && !this.A6) {
            int width = getWidth();
            int height = getHeight();
            float c1 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c12 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c13 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c1 + c12 + c13 > 0.01f) {
                float f10 = ((fArr[39] * 1.25f) / 100.0f) * this.b6 * 0.1f;
                float f11 = c12 * f10 * f2;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c1 * f10 * f2, f11, canvas, rectF3);
                L(centerX, rectF3.right, f11, f10 * c13 * f2, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f, f2);
    }

    public final boolean J0(float r39, float r40, float r41, int r42, int r43, int r44, int r45, int r46, float r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.J0(float, float, float, int, int, int, int, int, float):boolean");
    }

    public final void K(Canvas canvas) {
        float f;
        float L;
        int i;
        int i2;
        float f2;
        float f3;
        float f4;
        float f1;
        int i3;
        Bitmap bitmap;
        float f5;
        float L2;
        Canvas canvas2 = canvas;
        if (this.l1 <= 0.001f) {
            return;
        }
        float L3 = gl.L(222.0f);
        float L4 = gl.L(46.0f);
        float L5 = gl.L(54.0f);
        if (this.z0) {
            f = L4 + L4;
        } else {
            f = L4 + L5 + L4;
        }
        int i4 = (this.g1 > 0.5f ? 1 : (this.g1 == 0.5f ? 0 : -1));
        RectF rectF = this.J5;
        if (i4 > 0) {
            L = (rectF.bottom + gl.L(6.0f)) - f;
        } else {
            L = rectF.top - gl.L(6.0f);
        }
        float f6 = L;
        float width = (getWidth() - L3) / 2.0f;
        RectF rectF2 = this.K8;
        rectF2.set(width, f6, L3 + width, f + f6);
        float f7 = this.E8;
        float f8 = this.F8;
        float l = Utilities.l(this.l1);
        float R1 = gl.R1(rectF.left, rectF2.left, f7);
        float R12 = gl.R1(rectF.top, rectF2.top, f8);
        float R13 = gl.R1(rectF.right, rectF2.right, f7);
        float R14 = gl.R1(rectF.bottom, rectF2.bottom, f8);
        RectF rectF3 = this.J8;
        rectF3.set(R1, R12, R13, R14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, gl.R1(rectF.height() / 2.0f, gl.L(22.0f), Utilities.l(f8))));
        float w = ls6.w(this.G8, 9.0f, 1.0f, -0.25f) * gl.L(5.0f);
        float f9 = rectF3.left;
        float f10 = rectF3.top;
        float f11 = rectF3.right;
        float f12 = 1.0f;
        float f13 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.I8;
        path.rewind();
        float f14 = f9 + min;
        path.moveTo(f14, f10);
        float f15 = f11 - min;
        path.lineTo(f15, f10);
        float f16 = f10 + min;
        path.quadTo(f11, f10, f11, f16);
        float f17 = f13 - min;
        path.lineTo(f11, f17);
        path.quadTo(f11, f13, f15, f13);
        float f18 = f13 + w;
        path.cubicTo(gl.R1(f15, centerX, 0.55f), f18, gl.R1(f14, centerX, 0.55f), f18, f14, f13);
        path.quadTo(f9, f13, f9, f17);
        path.lineTo(f9, f16);
        path.quadTo(f9, f10, f14, f10);
        path.close();
        RectF rectF4 = this.G1;
        rectF4.set(f9, f10, f11, Math.max(0.0f, w) + f13);
        canvas2.save();
        canvas2.clipPath(path);
        float f19 = 255.0f;
        if (yz.o() && j0(canvas)) {
            Object obj = this.I1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            yz.h(canvas2, obj);
            canvas2.restore();
        } else if (this.Z2 != null) {
            Paint paint = this.c3;
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
        uv8.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f20 = l / 0.3f;
        float l2 = 1.0f - Utilities.l(f20);
        float f21 = 0.004f;
        float f22 = 0.15f;
        boolean z = false;
        int i5 = 1;
        if (l2 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l2 * 255.0f));
            float l3 = 1.0f - (Utilities.l(f20) * 0.15f);
            canvas2.scale(l3, l3, rectF.centerX(), rectF.centerY());
            this.T5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.T5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f23 = rectF3.top - rectF2.top;
        float f24 = 0.6f;
        if (Math.abs(this.G8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f23 = Math.round(f23);
        }
        canvas2.save();
        canvas2.translate(centerX2, f23);
        TextPaint textPaint = this.D1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        boolean z2 = this.y0;
        String M0 = k96.M0(2131746292, null);
        if (z2) {
            i = 2131746296;
        } else {
            i = 2131746294;
        }
        String[] strArr = {M0, k96.M0(i, null), k96.M0(2131746291, null)};
        if (this.y0) {
            i2 = 2131746295;
        } else {
            i2 = 2131746293;
        }
        String[] strArr2 = {null, k96.M0(i2, null), null};
        int i6 = 0;
        float f25 = f6;
        while (i6 < 3) {
            RectF[] rectFArr = this.y8;
            if (i6 == i5 && this.z0) {
                rectFArr[i6].setEmpty();
                i3 = i6;
                f3 = f19;
                f4 = f21;
            } else {
                if (strArr2[i6] != null) {
                    f2 = L5;
                } else {
                    f2 = L4;
                }
                f3 = f19;
                f4 = f21;
                float f26 = f25 + f2;
                rectFArr[i6].set(rectF2.left, f25, rectF2.right, f26);
                if (this.m1 > 0.5f) {
                    f1 = f1(f22, f24, l);
                } else {
                    f1 = f1(f24, f12, l);
                }
                if (f1 <= f4) {
                    i3 = i6;
                } else {
                    M(canvas2, i6, rectFArr[i6], z);
                    canvas2.save();
                    float f27 = (f2 / 2.0f) + f25;
                    if (i6 == 2) {
                        i3 = i6;
                        o0(canvas2, this.L1, rectF2.left + gl.L(26.0f), f27, gl.L(20.0f), f1);
                        canvas2 = canvas;
                    } else {
                        i3 = i6;
                        if (i3 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.S1, rectF2.left + gl.L(26.0f), f27, gl.L(20.0f), f1);
                        } else {
                            canvas2 = canvas;
                            boolean z3 = this.y0;
                            if (z3) {
                                bitmap = this.O8;
                            } else {
                                bitmap = this.P8;
                            }
                            if (bitmap != null) {
                                f5 = 26.0f;
                            } else {
                                int round = Math.round(gl.L(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f5 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f28 = round / 24.0f;
                                canvas3.scale(f28, f28);
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
                                if (z3) {
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
                                    this.O8 = createBitmap;
                                } else {
                                    this.P8 = createBitmap;
                                }
                                bitmap = createBitmap;
                            }
                            float L6 = rectF2.left + gl.L(f5);
                            Paint paint6 = this.Q8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (f3 * f1));
                            canvas2.drawBitmap(bitmap, L6 - (bitmap.getWidth() / 2.0f), f27 - (bitmap.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(gl.L(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (f1 * f3));
                    String str = strArr[i3];
                    float L7 = rectF2.left + gl.L(52.0f);
                    if (strArr2[i3] != null) {
                        L2 = f27 - gl.L(2.0f);
                    } else {
                        L2 = gl.L(5.0f) + f27;
                    }
                    canvas2.drawText(str, L7, L2, textPaint);
                    if (strArr2[i3] != null) {
                        textPaint.setTextSize(gl.L(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (166.0f * f1));
                        canvas2.drawText(strArr2[i3], rectF2.left + gl.L(52.0f), f27 + gl.L(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f25 = f26;
            }
            i6 = i3 + 1;
            f19 = f3;
            f21 = f4;
            f22 = 0.15f;
            z = false;
            i5 = 1;
            f24 = 0.6f;
            f12 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.W4 == null && !this.V4) {
            this.V4 = true;
            Utilities.e.c(new mw8(this, bm2.o(bm2.f(0.4f, N0(), -16777216), 16), (byte) 0));
        }
    }

    public final void L(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF) {
        LinearGradient linearGradient;
        float min = Math.min(f3, f4);
        float max = Math.max(f3, f4);
        int i = (min > 0.002f ? 1 : (min == 0.002f ? 0 : -1));
        Paint paint = this.a6;
        if (i > 0) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f, rectF.top, f2, rectF.bottom, paint);
        }
        float f5 = max - min;
        if (f5 > 0.002f) {
            if (f4 >= f3) {
                linearGradient = this.X5;
            } else {
                linearGradient = this.Y5;
            }
            Matrix matrix = this.Z5;
            matrix.setScale(f2 - f, 1.0f);
            matrix.postTranslate(f, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f5 * 255.0f));
            canvas.drawRect(f, rectF.top, f2, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f) {
        if (this.z3 && this.r4 > 0.001f) {
            float f2 = this.q4;
            float[] fArr = lcd.b;
            float max = f2 / Math.max(0.3f, fArr[50]);
            if (max <= 4.0f && max >= -4.0f) {
                return Math.min(gl.N(fArr[42]), (gl.L(3.5f) / 2.0f) / 0.607f) * f * max * ((float) Math.exp((-0.5f) * max * max)) * this.r4;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public final void M(Canvas canvas, int i, RectF rectF, boolean z) {
        boolean z2;
        float X0;
        int i2;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.r9 == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        long[] jArr = this.x9;
        if (!z2) {
            long j = jArr[i];
            if (j == 0) {
                return;
            }
            X0 = this.y9[i] * ((float) Math.exp(((float) (-(currentAnimationTimeMillis - j))) / 180.0f));
        } else {
            X0 = X0(i, currentAnimationTimeMillis);
        }
        if (!z2 && X0 < 0.004f) {
            jArr[i] = 0;
            return;
        }
        float B = yjb.B(X0, 2.0f, 3.0f, X0 * X0);
        float min = Math.min(1.0f, ((float) (currentAnimationTimeMillis - this.w9[i])) / 320.0f);
        float f = 1.0f - min;
        float v = oo1.v(f, f, f, 1.0f);
        if (!z2 || X0 < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.u9[i]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.v9[i]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        if (z) {
            i2 = 335544320;
        } else {
            i2 = 738197503;
        }
        int i3 = (16777215 & i2) | (((int) ((i2 >>> 24) * B)) << 24);
        Paint paint = this.s9;
        paint.setColor(i3);
        Path path = this.t9;
        path.rewind();
        if (i != 3 && i != 4 && i != 11) {
            if (i < 6 && i != 5) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                float min2 = Math.min(gl.L(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            }
        } else {
            path.addOval(rectF, Path.Direction.CW);
        }
        canvas.save();
        canvas.clipPath(path);
        canvas.drawCircle(max, max2, Math.max(gl.L(6.0f), max3 * v), paint);
        canvas.restore();
    }

    public final void M0(int i, tw8 tw8Var, int i2, int i3) {
        int i4 = i * 7;
        byte b = tw8Var.a;
        float[] fArr = this.k3;
        if (b == 0 && tw8Var.f == G9) {
            fArr[i4] = 0.0f;
            fArr[i4 + 1] = 0.0f;
            fArr[i4 + 2] = 0.0f;
            float f = K9;
            fArr[i4 + 3] = f;
            float f2 = L9;
            fArr[i4 + 4] = f2;
            fArr[i4 + 5] = 1.0f / ((i3 * f2) + (i2 * f));
            fArr[i4 + 6] = 0.5f;
        } else {
            fArr[i4] = 1.0f;
            fArr[i4 + 1] = i2 / 2.0f;
            fArr[i4 + 2] = (l() / 2.0f) + m();
            fArr[i4 + 3] = 0.0f;
            fArr[i4 + 4] = 0.0f;
            fArr[i4 + 5] = 1.0f / (((float) Math.hypot(i2, i3)) * 0.62f);
            fArr[i4 + 6] = 0.55f;
        }
        int i5 = i * 3;
        int i6 = tw8Var.b;
        int[] iArr = this.m3;
        iArr[i5] = i6;
        iArr[i5 + 1] = tw8Var.g;
        iArr[i5 + 2] = tw8Var.c;
    }

    public final void N(android.graphics.Canvas r60, int r61, int r62) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.N(android.graphics.Canvas, int, int):void");
    }

    public final int N0() {
        tw8 tw8Var = this.n;
        if (tw8Var == null) {
            return -16777216;
        }
        if (this.s < 1.0f && this.r != null) {
            float l = (l() / 2.0f) + m();
            float l2 = Utilities.l(((((((float) Math.hypot(Math.max(this.x, getWidth() - this.x), Math.max(this.y, getHeight() - this.y))) + gl.L(60.0f)) * x1(this.s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.x, l - this.y))) + gl.L(80.0f)) / gl.L(160.0f));
            int i = this.r.e;
            int i2 = this.n.e;
            float B = yjb.B(l2, 2.0f, 3.0f, l2 * l2);
            double[] dArr = this.r3;
            bm2.j(i, dArr);
            double[] dArr2 = this.s3;
            bm2.j(i2, dArr2);
            double d = B;
            double[] dArr3 = this.t3;
            if (dArr3.length == 3) {
                double d2 = 1.0d - d;
                double d3 = (dArr2[0] * d) + (dArr[0] * d2);
                dArr3[0] = d3;
                double d4 = (dArr2[1] * d) + (dArr[1] * d2);
                dArr3[1] = d4;
                double d5 = (dArr2[2] * d) + (dArr[2] * d2);
                dArr3[2] = d5;
                return bm2.b(d3, d4, d5);
            }
            w26.j("outResult must have a length of 3.");
            return 0;
        }
        return tw8Var.e;
    }

    public final void O(float f, float f2, float f3, int i, Canvas canvas, boolean z) {
        PorterDuffColorFilter m1 = m1(i);
        xt xtVar = this.U1;
        xtVar.setColorFilter(m1);
        xtVar.setAlpha(255);
        float f4 = f3 / 2.0f;
        float f5 = f2 - f4;
        float f6 = f + f3;
        float f7 = f2 + f4;
        xtVar.setBounds((int) f, (int) f5, (int) f6, (int) f7);
        if (!z) {
            xtVar.draw(canvas);
            return;
        }
        float f8 = f3 * 0.095f;
        float f9 = (0.28f * f3) + f;
        float f10 = f2 - (0.21f * f3);
        float f11 = (0.74f * f3) + f;
        float f12 = (0.25f * f3) + f2;
        float L = f - gl.L(2.0f);
        float L2 = f5 - gl.L(2.0f);
        float L3 = f6 + gl.L(2.0f);
        float L4 = f7 + gl.L(2.0f);
        RectF rectF = this.V5;
        rectF.set(L, L2, L3, L4);
        canvas.saveLayer(rectF, null);
        xtVar.draw(canvas);
        Paint paint = this.Z1;
        paint.setStrokeWidth((0.065f * f3 * 2.0f) + f8);
        canvas.drawLine(f9, f10, f11, f12, paint);
        canvas.restore();
        Paint paint2 = this.B1;
        paint2.setColor(i);
        paint2.setStrokeWidth(f8);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f9, f10, f11, f12, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.Y1.x(false);
        Bitmap bitmap = this.S2;
        if (bitmap != null) {
            bitmap.recycle();
            this.S2 = null;
        }
        oy8 oy8Var = this.a9;
        if (oy8Var != null) {
            oy8Var.x(false);
            this.a9 = null;
        }
        oy8 oy8Var2 = this.l8;
        if (oy8Var2 != null) {
            oy8Var2.x(false);
            this.l8 = null;
        }
        vl vlVar = this.k8;
        if (vlVar != null) {
            vlVar.o(this);
            this.k8 = null;
            this.m8 = 0L;
        }
        P0(this.G);
        P0(this.H);
        removeCallbacks(this.p9);
        xsa xsaVar = this.j2;
        if (xsaVar != null) {
            xsaVar.f();
        }
        VelocityTracker velocityTracker = this.l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l0 = null;
        }
        VelocityTracker velocityTracker2 = this.m9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.m9 = null;
        }
        HashMap hashMap = this.J7;
        for (vl vlVar2 : hashMap.values()) {
            vlVar2.o(this);
        }
        for (Drawable drawable : this.K.values()) {
            if (drawable instanceof vl) {
                ((vl) drawable).o(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.K7;
        for (uw8 uw8Var : hashMap2.values()) {
            tl tlVar = uw8Var.a;
            if (tlVar != null) {
                tlVar.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(float f, float f2, float f3, float f4, Canvas canvas) {
        if (this.q1 != null && f4 > 0.004f) {
            TextPaint textPaint = this.z2;
            textPaint.setTextSize(gl.L(15.0f));
            textPaint.setColor(-1);
            textPaint.setAlpha((int) (f4 * 255.0f));
            canvas.drawText(this.q1, ((f + f3) - gl.L(16.0f)) - textPaint.measureText(this.q1), f2 + gl.L(5.0f), textPaint);
            textPaint.setAlpha(255);
        }
    }

    public final void P0(sw8 sw8Var) {
        if (sw8Var != null) {
            vl vlVar = sw8Var.c;
            if (vlVar != null) {
                vlVar.o(this);
            }
            vl vlVar2 = sw8Var.d;
            if (vlVar2 != null && !this.J7.containsValue(vlVar2)) {
                sw8Var.d.o(this);
            }
            sw8Var.G = true;
            tv8 tv8Var = sw8Var.F;
            if (tv8Var != null) {
                tv8Var.e = true;
                kk7.f(tv8Var.a).n(tv8Var, kk7.X1);
                sw8Var.F = null;
            }
        }
    }

    public final void Q(float f, float f2, float f3, Canvas canvas, boolean z) {
        Canvas canvas2;
        Canvas canvas3;
        Drawable drawable;
        float f4;
        float f5;
        if (this.W8 != 0) {
            if (z) {
                float L = f2 - gl.L(10.0f);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.R8;
                paint.setStyle(style);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(gl.L(2.0f));
                paint.setColor(-1);
                paint.setAlpha(255);
                float L2 = ((gl.L(26.0f) + f) - gl.L(10.0f)) + gl.L(10.0f);
                float L3 = L + gl.L(11.0f);
                float L4 = gl.L(7.25f);
                float f6 = 1.0f;
                if (f3 >= 0.0f) {
                    float l = 1.0f - Utilities.l(f3 / 0.42f);
                    float v = oo1.v(l, l, l, 1.0f);
                    if (f3 < 0.6f) {
                        float f7 = 1.0f - (f3 / 0.6f);
                        f5 = (1.0f - ((f7 * f7) * f7)) * 364.0f;
                    } else {
                        float l2 = Utilities.l((f3 - 0.6f) / 0.12f);
                        f5 = 364.0f - ((3.0f - (l2 * 2.0f)) * ((4.0f * l2) * l2));
                    }
                    f4 = f5;
                    f6 = v;
                } else {
                    f4 = 0.0f;
                }
                float f8 = L3 - L4;
                RectF rectF = this.S8;
                rectF.set(L2 - L4, f8, L2 + L4, L4 + L3);
                canvas.drawArc(rectF, -82.0f, f6 * 344.0f, false, paint);
                canvas.drawLine(L2, f8, L2, L + gl.L(2.2f), paint);
                double radians = Math.toRadians(f4 - 90.0f);
                canvas3 = canvas;
                canvas3.drawLine(L2, L3, oo1.e(3.8f, (float) Math.cos(radians), L2), oo1.e(3.8f, (float) Math.sin(radians), L3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas3.drawCircle(L2, L3, gl.N(1.2f), paint);
            } else {
                canvas3 = canvas;
                if (n()) {
                    oy8 o1 = o1();
                    int L5 = gl.L(28.0f);
                    float f9 = L5 / 2.0f;
                    int i = (int) (f2 - f9);
                    o1.setBounds((int) ((gl.L(26.0f) + f) - f9), i, ((int) ((gl.L(26.0f) + f) - f9)) + L5, L5 + i);
                    o1.draw(canvas3);
                } else {
                    int i2 = this.W8;
                    if (i2 == 2131232119) {
                        oy8 p1 = p1();
                        int L6 = gl.L(28.0f);
                        float f10 = L6 / 2.0f;
                        int i3 = (int) (f2 - f10);
                        p1.setBounds((int) ((gl.L(26.0f) + f) - f10), i3, ((int) ((gl.L(26.0f) + f) - f10)) + L6, L6 + i3);
                        p1.draw(canvas3);
                    } else {
                        if (i2 == 2131232347) {
                            drawable = this.S1;
                        } else if (i2 == 2131232108) {
                            drawable = this.K1;
                        } else {
                            drawable = this.T1;
                        }
                        o0(canvas3, drawable, f + gl.L(26.0f), f2, gl.L(20.0f), 1.0f);
                        canvas2 = canvas3;
                    }
                }
            }
            canvas2 = canvas3;
        } else {
            canvas2 = canvas;
            oy8 q1 = q1();
            int L7 = gl.L(27.0f);
            float f11 = L7 / 2.0f;
            int i4 = (int) (f2 - f11);
            q1.setBounds((int) ((gl.L(26.0f) + f) - f11), i4, ((int) ((gl.L(26.0f) + f) - f11)) + L7, L7 + i4);
            q1.draw(canvas2);
        }
        TextPaint textPaint = this.D1;
        textPaint.setColor(-1);
        float f12 = this.t1;
        if (f12 <= 0.0f) {
            f12 = gl.L(15.0f);
        }
        textPaint.setTextSize(f12);
        String str = this.U8;
        float L8 = f + gl.L(48.0f);
        float L10 = gl.L(5.0f) + f2;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas.drawText(str, 0, indexOf, L8, L10 - gl.L(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), L8, L10 + gl.L(9.0f), (Paint) textPaint);
            return;
        }
        Canvas canvas4 = canvas2;
        if (!s0(str)) {
            canvas4.drawText(str, L8, L10, textPaint);
            return;
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.z2;
        textPaint2.setTextSize(textSize);
        textPaint2.setColor(textPaint.getColor());
        canvas4.drawText(this.w2, L8, L10, textPaint);
        float measureText = textPaint.measureText(this.w2) + L8;
        canvas4.drawText(this.x2, measureText, L10, textPaint2);
        canvas4.drawText(this.y2, textPaint2.measureText(this.x2) + measureText, L10, textPaint);
    }

    public final void Q0() {
        int i = this.r9;
        if (i >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.y9[i] = X0(i, currentAnimationTimeMillis);
            this.x9[i] = currentAnimationTimeMillis;
            invalidate();
        }
        this.r9 = -1;
    }

    public final void R(android.graphics.Canvas r29, int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.R(android.graphics.Canvas, int, long):void");
    }

    public final void R0() {
        float f = this.f0;
        if (f == 0.0f && this.g0 == 0.0f) {
            return;
        }
        this.j0 = f;
        this.k0 = this.g0;
        this.a0 = AnimationUtils.currentAnimationTimeMillis();
        this.V = true;
    }

    public final void S0() {
        int i = this.V7;
        if (i >= 0 && this.X7 < this.W7) {
            this.Y7 = j1(i);
            this.X7 = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
        }
    }

    public final float T(float f) {
        float f2;
        if (this.Q4 >= 1.0f) {
            return 1.0f;
        }
        if (this.T4) {
            f2 = 0.85f;
        } else {
            f2 = 0.92f;
        }
        return gl.R1(f2, 1.0f, f);
    }

    public final android.graphics.Bitmap T0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.T0():android.graphics.Bitmap");
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.K;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = vu3.g(str);
            if (drawable == null) {
                drawable = vu3.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        boolean z;
        if (this.w0) {
            int L = gl.L(12.0f) + gl.L(8.0f);
            this.u2 = this.M0.c() + gl.L(2.0f) + L + gl.L(11.0f);
            this.w0 = false;
            this.B0 = false;
            if (this.C0 * this.H0 > 0.001f) {
                z = true;
            } else {
                z = false;
            }
            this.t2 = z;
            this.r2 = AnimationUtils.currentAnimationTimeMillis();
            this.D0 = this.C0;
            this.E0 = 0.0f;
            this.F0 = System.currentTimeMillis();
            gv8 gv8Var = this.u0;
            if (gv8Var != null) {
                i1(gv8Var);
            }
            t1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.e = null;
            this.v0 = null;
            z24 z24Var = this.c;
            if (z24Var != null) {
                z24Var.W(0);
            }
        }
    }

    public final Bitmap V(vl vlVar) {
        Bitmap n;
        ml mlVar = vlVar.k;
        if (mlVar != null) {
            oy8 y = mlVar.y();
            if (y != null) {
                if (!this.U2) {
                    y.Q(0L);
                }
                if (y.p()) {
                    if (y.R != null) {
                        return y.R;
                    }
                    if (y.S == null) {
                        return null;
                    }
                    return y.S;
                }
            } else {
                km m = mlVar.m();
                if (m != null) {
                    if (!this.U2) {
                        m.D(System.currentTimeMillis());
                    }
                    if (m.s()) {
                        return m.m();
                    }
                } else if (mlVar.C() && mlVar.E() && (n = mlVar.n()) != null && !n.isRecycled()) {
                    return n;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.h1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - this.J2)) / 420.0f);
    }

    public final defpackage.sw8 W() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.W():sw8");
    }

    public final void X(sw8 sw8Var) {
        TLRPC.Document document;
        if (sw8Var != null && !sw8Var.G && sw8Var.a == 2 && sw8Var.F == null && (document = sw8Var.A) != null) {
            sw8Var.F = new tv8(this.b, document, sw8Var.B, gl.L(48.0f), new x15(this, sw8Var, (byte) 23));
        }
    }

    public final float X0(int i, long j) {
        return 1.0f - ((1.0f - this.z9[i]) * ((float) Math.exp(((float) (-(j - this.w9[i]))) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = lcd.b;
        float f = fArr[36];
        float f2 = fArr[38];
        float f3 = fArr[24];
        if (this.S3 != null && this.T3 == bitmap && f == this.U3 && f2 == this.V3 && f3 == this.W3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.T3 = bitmap;
        this.U3 = f;
        this.V3 = f2;
        this.W3 = f3;
        Bitmap bitmap2 = this.S3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.S3.getHeight() != bitmap.getHeight()) {
            this.S3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.S3.eraseColor(0);
        Canvas canvas = new Canvas(this.S3);
        double radians = Math.toRadians(f3);
        float f4 = (float) (-Math.cos(radians));
        float f5 = (float) (-Math.sin(radians));
        float N = gl.N(f);
        float N2 = gl.N(f2);
        float f6 = f4 * N2;
        float f7 = N2 * f5;
        canvas.drawBitmap(bitmap, f6, f7, (Paint) null);
        canvas.drawBitmap(bitmap, f6 - (f4 * N), f7 - (f5 * N), this.X3);
        return true;
    }

    public final void Y0(tw8 tw8Var, float f, float f2) {
        if (tw8Var != null) {
            this.b7 = W0(tw8Var.c);
        }
        if (this.g2) {
            if (this.r != null) {
                this.r = null;
            }
            this.n = tw8Var;
            this.s = 1.0f;
            invalidate();
            return;
        }
        this.r = this.n;
        this.n = tw8Var;
        this.s = 0.0f;
        this.w = System.currentTimeMillis();
        this.x = f;
        this.y = f2;
        this.r0++;
        i0();
        invalidate();
    }

    public final void Z(sw8 sw8Var) {
        vl vlVar;
        ml mlVar;
        if (sw8Var != null && sw8Var.e == null && (vlVar = sw8Var.c) != null) {
            tv8 tv8Var = sw8Var.F;
            if ((tv8Var == null || tv8Var.h) && (mlVar = vlVar.k) != null && mlVar.C() && mlVar.E()) {
                int L = gl.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                sw8Var.c.setBounds(0, 0, L, L);
                sw8Var.c.setColorFilter(null);
                sw8Var.c.setAlpha(255);
                mlVar.i1 = 1.0f;
                sw8Var.c.draw(canvas);
                E0(sw8Var, createBitmap);
            }
        }
    }

    public final String a0() {
        String M0 = k96.M0(2131746286, null);
        if (!M0.equals(this.v2)) {
            this.v2 = M0;
            Matcher matcher = Pattern.compile("\\d+").matcher(M0);
            if (matcher.find()) {
                this.w2 = M0.substring(0, matcher.start());
                this.x2 = matcher.group();
                this.y2 = M0.substring(matcher.end());
            } else {
                this.w2 = M0;
                this.y2 = "";
                this.x2 = "";
            }
        }
        return this.v2;
    }

    public final float a1() {
        return (getHeight() - this.v3) - gl.L(10.0f);
    }

    public final float b(double d) {
        float f = this.A4;
        double sin = Math.sin((f * 78.233d) + (((f * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float L;
        float max = Math.max(gl.L(160.0f), a1() - ((((l() + (gl.L(51.0f) + this.u3)) + gl.L(24.0f)) + gl.L(11.0f)) + gl.L(13.0f)));
        if (this.i1 == 2 && this.y1) {
            ArrayList arrayList = this.w1;
            if (arrayList.size() <= 3) {
                float width = ((getWidth() - (gl.L(10.0f) << 1)) - gl.L(8.0f)) / 3.0f;
                if (arrayList.isEmpty()) {
                    L = gl.L(286.0f);
                } else {
                    L = gl.L(8.0f) + width;
                }
                max = Math.min(max, L);
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f = this.Q2;
        if (f >= 0.0f && this.g1 >= 0.01f) {
            if (f != max) {
                long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.R2));
                float f2 = this.Q2;
                float A = tb4.A(1.0f, (float) Math.exp(((float) (-min)) / 140.0f), max - f2, f2);
                this.Q2 = A;
                if (Math.abs(max - A) < 0.5f) {
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
        tw8 tw8Var;
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f2 && !this.J.isEmpty() && (tw8Var = this.n) != null && (tw8Var.a != 0 || this.G.a == 2)) {
            this.T7 = AnimationUtils.currentAnimationTimeMillis();
            this.Q7 = -1;
            this.O7 = 0.0f;
            setSceneFromCard(t(this.M7));
        }
        setPattern(W());
        if (!this.g2) {
            this.s0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f, float f2, int i, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float asin;
        if (!this.z3) {
            return 0.0f;
        }
        float f9 = i;
        float f10 = f - (f9 / 2.0f);
        float f11 = this.I3;
        float f12 = i2;
        float f13 = f2 - (f12 / 2.0f);
        float f14 = (this.J3 * f13) + (f10 * f11);
        float f15 = 1.0f;
        float max = Math.max(1.0f, ((Math.abs(this.J3) * f12) + (Math.abs(f11) * f9)) / 2.0f);
        float[] fArr = lcd.b;
        float f16 = fArr[19] / 100.0f;
        if (f16 > 0.0f) {
            float f17 = this.J3;
            float max2 = ((f13 * this.I3) + (f10 * (-f17))) / Math.max(1.0f, ((Math.abs(this.I3) * f12) + (Math.abs(f17) * f9)) / 2.0f);
            f14 -= ((f16 * f9) * max2) * max2;
        }
        float f18 = (f14 - this.x3) / this.y3;
        float f19 = fArr[20] / 100.0f;
        if (f19 > 0.0f) {
            f18 += (((((float) Math.asin(ls6.w(f14, max, 1.0f, -1.0f))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.x3 / max) * 1.5707964f))) / ((this.y3 / max) * 1.5707964f)) - f18) * f19;
            f3 = ls6.B(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, asin))), (f19 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f3 = 1.0f;
        }
        this.o4 = f18;
        float f20 = this.F3;
        this.p4 = f20 * f3;
        float f21 = fArr[34] / 100.0f;
        int i4 = (f18 > 4.0f ? 1 : (f18 == 4.0f ? 0 : -1));
        if ((i4 > 0 || f18 < -4.0f) && f21 <= 0.0f) {
            this.m4 = 0.0f;
            return 0.0f;
        }
        float f22 = fArr[32];
        float f23 = f18 / fArr[29];
        sw8 sw8Var = this.G;
        if (sw8Var != null && sw8Var.a == 1) {
            f15 = 0.7f;
        }
        float f24 = f3 * f15;
        if (f23 <= 4.0f && f23 >= -4.0f) {
            float abs = Math.abs(f23);
            f4 = 0.0f;
            f5 = f24;
            f6 = 4.0f;
            i3 = i4;
            f7 = f20 * f24 * ((float) Math.exp(Math.pow(abs, f22) * (-0.5d)));
        } else {
            f4 = 0.0f;
            f5 = f24;
            f6 = 4.0f;
            i3 = i4;
            f7 = 0.0f;
        }
        this.m4 = f7;
        float f25 = fArr[28] / 100.0f;
        if (i3 <= 0 && f18 >= -4.0f) {
            f8 = (float) Math.exp(Math.pow(Math.abs(f18), f22) * (-0.5d));
        } else {
            f8 = f4;
        }
        float f26 = f25 * f8;
        if (f21 > f4) {
            float f27 = f18 - fArr[33];
            if (f27 < f6 && f27 > -4.0f) {
                f26 += f21 * ((float) Math.exp(Math.pow(Math.abs(f27), f22) * (-0.5d)));
            }
        }
        return this.F3 * f5 * f26;
    }

    public final void d(int i) {
        boolean z = true;
        this.f2 = true;
        if (this.G.a == 0) {
            z = false;
        }
        this.J.clear();
        this.O7 = 0.0f;
        this.M7 = i;
        tw8 tw8Var = this.n;
        if (tw8Var == null || tw8Var.a != 0 || tw8Var.f != i) {
            setSceneFromCard(t(i));
        }
        if (z) {
            setPattern(new sw8());
        }
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        this.f2 = false;
    }

    public final void d1(int i, String str, String str2) {
        int i2;
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new q76(this, i, str, str2, (byte) 20), currentTimeMillis);
            return;
        }
        this.o1 = i;
        this.n1 = str;
        this.p1 = str2;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (str2 != null) {
            i2 = 4000;
        } else {
            i2 = 2800;
        }
        this.v1 = currentTimeMillis2 + i2;
        invalidate();
    }

    public final void e(int i, ArrayList arrayList, boolean z) {
        String str;
        int i2 = -1;
        if (z && ld0.h != null) {
            int i3 = 0;
            while (true) {
                int[] iArr = ld0.h;
                if (i3 >= iArr.length) {
                    break;
                } else if (iArr[i3] == i) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i2 < 0) {
            i2 = F9;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f2 = true;
            this.M7 = i2;
            tw8 tw8Var = this.n;
            if (tw8Var == null || tw8Var.a != 0 || tw8Var.f != i2) {
                setSceneFromCard(t(i2));
            }
            this.O7 = 0.0f;
            ArrayList arrayList2 = this.J;
            arrayList2.clear();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
                if (arrayList2.size() >= 6) {
                    break;
                } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                    long j = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                    String n = ls6.n(j, "c:");
                    HashMap hashMap = this.K;
                    if (!hashMap.containsKey(n)) {
                        vl m = vl.m(this.b, j, null, 2);
                        m.b(this);
                        hashMap.put(n, m);
                    }
                    if (!arrayList2.contains(n)) {
                        arrayList2.add(n);
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
                        this.d2.put(str, str2);
                        if (!arrayList2.contains(str)) {
                            arrayList2.add(str);
                        }
                    }
                }
            }
            c();
            this.f2 = false;
            return;
        }
        d(i2);
    }

    public final void e0(int[] iArr, int i) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.w1.get(i)).attributes;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i2);
            i2++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f, float f2, float f3) {
        float A = tb4.A(f2, f, 1.0f - ((float) Math.pow(1.0f - f3, this.Y2)), f);
        if (Math.abs(f2 - A) < 0.002f) {
            return f2;
        }
        return A;
    }

    public final int f0() {
        int size = this.w1.size();
        if (!this.y1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final vl g0(long j, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.J7;
        vl vlVar = (vl) hashMap.get(valueOf);
        if (vlVar == null) {
            vl l = vl.l(this.b, 24, document);
            l.b(this);
            hashMap.put(Long.valueOf(j), l);
            return l;
        }
        return vlVar;
    }

    public String getCurrentLink() {
        String str;
        if (this.w0 && (str = this.e) != null && this.v0 != null) {
            return str;
        }
        if (this.u0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
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
                String str2 = (String) this.d2.get(str);
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
        tw8 tw8Var = this.n;
        if (tw8Var != null && tw8Var.a == 0) {
            return tw8Var.f;
        }
        return -1;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i;
        sw8 sw8Var = this.G;
        if (sw8Var.a == 2 && (i = sw8Var.q) >= 0) {
            ArrayList arrayList = this.w1;
            if (i < arrayList.size()) {
                return (TL_stars.TL_starGiftUnique) arrayList.get(this.G.q);
            }
            return null;
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l = (Long) this.z1.get(Long.valueOf(themeGift.id));
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        if (this.y1 && this.w1.isEmpty()) {
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

    public final void i1(gv8 gv8Var) {
        hv8 hv8Var = this.t0;
        if (hv8Var.q == 2 && hv8Var.o < 1.0f) {
            hv8Var.m = gv8Var;
            invalidate();
            return;
        }
        postDelayed(new lw8(this, gv8Var, (byte) 0), 40L);
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            if ((this.S4 || this.a2) && canvas.isHardwareAccelerated() && yz.n(this.I1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float j1(int i) {
        if (i != this.V7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = this.X7;
        long j2 = this.W7;
        if (j < j2) {
            float l = 1.0f - Utilities.l(((float) (currentAnimationTimeMillis - j2)) / 110.0f);
            return 1.0f - ((1.0f - (l * l)) * 0.08f);
        }
        double g1 = g1(((float) (currentAnimationTimeMillis - j)) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.X7 > 900) {
            this.V7 = -1;
            return 1.0f;
        }
        float f = this.Y7;
        return ((1.0f - f) * ((float) g1)) + f;
    }

    public final float l() {
        return gl.R1(1.07f, 1.0f, this.D2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.U8 == null) {
            this.v1 = 0L;
            return;
        }
        this.v1 = 0L;
        if (this.N8) {
            this.N8 = false;
            this.M8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.V8 = true;
        invalidate();
    }

    public final uw8 l1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.id);
        HashMap hashMap = this.K7;
        uw8 uw8Var = (uw8) hashMap.get(valueOf);
        uw8 uw8Var2 = uw8Var;
        if (uw8Var == null) {
            ?? obj = new Object();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i = 0;
            while (i < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i);
                i++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                tl tlVar = new tl(gl.L(28.0f), this);
                obj.a = tlVar;
                tlVar.i(document, false);
                obj.a.a();
                obj.b = document.id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.id), obj);
            uw8Var2 = obj;
        }
        return uw8Var2;
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.K2, this.D2)) * gl.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - gl.L(15.0f));
        float a1 = (((a1() - b1()) - gl.L(13.0f)) - (gl.L(35.0f) * Math.max(this.K2, this.D2))) - l();
        return gl.R1(max, Math.max(gl.L(51.0f) + this.u3, Math.min(max, a1)), this.g1);
    }

    public final PorterDuffColorFilter m1(int i) {
        SparseArray sparseArray = this.e7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i);
        if (porterDuffColorFilter == null) {
            if (sparseArray.size() > 96) {
                sparseArray.clear();
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            sparseArray.put(i, porterDuffColorFilter2);
            return porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    public final boolean n() {
        String str;
        if (this.W8 == 2131232347 && (str = this.U8) != null && !s0(str)) {
            return true;
        }
        return false;
    }

    public final boolean n0(float f, float f2) {
        if (this.q1 != null && this.N8) {
            RectF rectF = this.L8;
            if (!rectF.isEmpty()) {
                float f3 = rectF.right;
                TextPaint textPaint = this.z2;
                textPaint.setTextSize(gl.L(15.0f));
                RectF rectF2 = this.r1;
                rectF2.set((f3 - textPaint.measureText(this.q1)) - gl.L(28.0f), rectF.top - gl.L(6.0f), rectF.right + gl.L(6.0f), rectF.bottom + gl.L(6.0f));
                return rectF2.contains(f, f2);
            }
            return false;
        }
        return false;
    }

    public final float o() {
        return l() + m() + gl.L(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        drawable.setColorFilter(m1(-1));
        drawable.setAlpha((int) (f4 * 255.0f));
        float f5 = f3 / 2.0f;
        drawable.setBounds((int) (f - f5), (int) (f2 - f5), (int) (f + f5), (int) (f2 + f5));
        drawable.draw(canvas);
    }

    public final oy8 o1() {
        if (this.Z8 == null) {
            oy8 oy8Var = new oy8(2131623990, gl.L(28.0f), gl.L(28.0f));
            this.Z8 = oy8Var;
            oy8Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.Z8.F(0);
            this.Z8.M(this);
            this.Z8.E(true);
        }
        return this.Z8;
    }

    @Override
    public final void onAttachedToWindow() {
        Sensor sensor;
        super.onAttachedToWindow();
        K0();
        int i = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = ld0.b;
            if (i2 >= iArr.length) {
                break;
            }
            ?? obj = new Object();
            int i3 = iArr[i2] | (-16777216);
            obj.b = i3;
            obj.c = ld0.c[i2] | (-16777216);
            obj.h = Z0(i3);
            if (sparseIntArray.indexOfKey(obj.b) < 0) {
                sparseIntArray.put(obj.b, u(obj));
            }
            i2++;
        }
        kk7.f(this.b).b(this.k2, kk7.H3);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.N6 = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        if (sensor != null) {
            this.N6.registerListener(this.O6, sensor, 1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.b).n(this.k2, kk7.H3);
        removeCallbacks(this.l2);
        SensorManager sensorManager = this.N6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.O6);
        }
        this.L6 = false;
        this.r9 = -1;
        Arrays.fill(this.x9, 0L);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int top;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = gl.m;
        View view = this;
        int i6 = 0;
        while (true) {
            top = view.getTop() + i6;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i6 = top - view.getScrollY();
        }
        this.u3 = Math.max(Math.max(0, i5 - top), (gl.L(20.0f) + gl.L(9.0f)) - (a.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i7 = 0;
        while (true) {
            int top2 = view2.getTop() + i7;
            if (!(view2.getParent() instanceof View)) {
                this.v3 = b00.c(20.0f, gl.L(22.0f), Math.max(0, gl.n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i7 = top2 - view2.getScrollY();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float L = gl.L(12.0f);
            int ceil = ((int) Math.ceil(i / L)) + 1;
            int ceil2 = ((int) Math.ceil(i2 / L)) + 1;
            Bitmap bitmap = this.A3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.A3.getHeight() != ceil2) {
                this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.B3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f, float f2, float f3) {
        int i;
        float L;
        float nextFloat;
        float f4;
        float e;
        int i2 = this.d1;
        if (i2 >= 320) {
            return;
        }
        this.d1 = i2 + 1;
        Random random = this.f1;
        float nextFloat2 = random.nextFloat();
        if (nextFloat2 < 0.65f) {
            i = 0;
        } else if (nextFloat2 < 0.9f) {
            i = 1;
        } else {
            i = 2;
        }
        byte[] bArr = this.b1;
        bArr[i2] = (byte) i;
        this.c1[i2] = false;
        this.N0[i2] = ((random.nextFloat() - 0.5f) * gl.L(4.0f)) + f;
        this.O0[i2] = f2;
        byte b = bArr[i2];
        if (b == 0) {
            L = gl.L(1.4f);
            nextFloat = random.nextFloat();
            f4 = 1.6f;
        } else if (b == 1) {
            e = oo1.e(0.7f, random.nextFloat(), gl.N(0.7f));
            this.T0[i2] = e;
            this.P0[i2] = (random.nextFloat() * gl.L(80.0f)) + (-gl.L(30.0f));
            this.Q0[i2] = (-gl.L(50.0f)) - (random.nextFloat() * gl.L(100.0f));
            this.R0[i2] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f3));
            this.S0[i2] = 0.0f;
            this.U0[i2] = random.nextFloat() * 90.0f;
            this.V0[i2] = (random.nextFloat() - 0.5f) * 1080.0f;
        } else {
            L = gl.L(3.0f);
            nextFloat = random.nextFloat();
            f4 = 1.5f;
        }
        e = (nextFloat * gl.L(f4)) + L;
        this.T0[i2] = e;
        this.P0[i2] = (random.nextFloat() * gl.L(80.0f)) + (-gl.L(30.0f));
        this.Q0[i2] = (-gl.L(50.0f)) - (random.nextFloat() * gl.L(100.0f));
        this.R0[i2] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f3));
        this.S0[i2] = 0.0f;
        this.U0[i2] = random.nextFloat() * 90.0f;
        this.V0[i2] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final oy8 p1() {
        if (this.a9 == null) {
            oy8 oy8Var = new oy8(2131624056, gl.L(28.0f), gl.L(28.0f));
            this.a9 = oy8Var;
            oy8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.a9.F(0);
            this.a9.M(this);
            this.a9.E(true);
        }
        return this.a9;
    }

    public final void q(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        float f9;
        int i = this.d1;
        if (i >= 320) {
            return;
        }
        this.d1 = i + 1;
        this.b1[i] = z ? (byte) 1 : (byte) 0;
        this.c1[i] = true;
        this.N0[i] = f;
        this.O0[i] = f2;
        this.P0[i] = f3;
        this.Q0[i] = f4;
        this.W0[i] = f;
        this.X0[i] = f2;
        this.Y0[i] = f5;
        Random random = this.f1;
        if (z2) {
            f9 = ug8.e(random, 3.0f, 4.0f);
        } else {
            f9 = 0.0f;
        }
        this.Z0[i] = f9;
        this.a1[i] = random.nextFloat() * 6.2832f;
        this.T0[i] = f6;
        this.R0[i] = f7;
        this.S0[i] = 0.0f;
        this.U0[i] = f8;
        this.V0[i] = 0.0f;
    }

    public final oy8 q1() {
        if (this.Y8 == null) {
            oy8 oy8Var = new oy8(2131624211, gl.L(27.0f), gl.L(27.0f));
            this.Y8 = oy8Var;
            oy8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Y8.F(0);
            this.Y8.M(this);
            this.Y8.E(true);
        }
        return this.Y8;
    }

    public final float r1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.D1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.z2;
        textPaint2.setTextSize(textSize);
        float measureText = textPaint.measureText(this.w2);
        return textPaint.measureText(this.y2) + textPaint2.measureText(this.x2) + measureText;
    }

    public final boolean s0(String str) {
        if (str != null && str.equals(this.v2)) {
            return true;
        }
        return false;
    }

    public void setFeeStars(long j) {
        boolean z;
        String str;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.L0 = z;
        String str2 = "";
        if (i <= 0) {
            str = "";
        } else {
            str = k96.a0(null, null, 2131746288, k96.E(j, ','));
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
        if (!this.L0 && this.w0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
        if (str == null) {
            this.v0 = null;
            return;
        }
        Utilities.e.c(new gm3(str, new nw8(this, str, (byte) 1)));
    }

    public void setGiftsOwner(long j) {
        if (this.x1 == j) {
            return;
        }
        this.x1 = j;
        xsa xsaVar = this.j2;
        if (xsaVar != null) {
            xsaVar.f();
        }
        xsa xsaVar2 = new xsa(this.b, j, false);
        this.j2 = xsaVar2;
        xsaVar2.g = 776;
        xsaVar2.e = true;
        xsaVar2.k(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z) {
        this.a2 = z;
    }

    public void setInstantTheme(boolean z) {
        this.g2 = z;
    }

    public void setLinkExpires(long j) {
        long j2 = this.H2;
        if (j2 == j) {
            return;
        }
        if (j2 != 0 && j != 0) {
            i0();
        }
        this.H2 = j;
        this.O2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.e2 = runnable;
    }

    public void setReveal(float f) {
        float f2;
        boolean z;
        float round;
        int i;
        float sin;
        this.Q4 = f;
        float f3 = 1.0f;
        if (this.T4) {
            double d = f * 0.86d;
            if (f >= 1.0f) {
                sin = 1.0f;
            } else {
                double d2 = 4.417382225408931d * d;
                sin = (float) (1.0d - (((Math.sin(d2) * 2.0647416048350564d) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l = Utilities.l((f - 0.85f) / 0.15f);
            f2 = tb4.A(1.0f, sin, yjb.B(l, 2.0f, 3.0f, l * l), sin);
        } else {
            float f4 = 1.0f - f;
            f2 = 1.0f - (f4 * f4);
        }
        this.U4 = f2;
        int i2 = 0;
        if (f < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.S4 = true;
            round = 0.0f;
        } else {
            round = Math.round((1.0f - f2) * gl.L(64.0f));
        }
        setTranslationY(round);
        if (z) {
            f3 = Utilities.l(f2 / 0.35f);
        }
        setAlpha(f3);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (z) {
                i = a(f2, 1073741824);
            } else {
                i = 0;
            }
            view.setBackgroundColor(i);
        }
        float f5 = -1.0f;
        if (!z) {
            this.q3 = -1.0f;
        }
        if (z && this.T4) {
            f5 = Utilities.l(f2);
        }
        this.t0.D = f5;
        if (z) {
            i2 = 2;
        }
        if (getLayerType() != i2) {
            setLayerType(i2, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z) {
        this.T4 = z;
    }

    public void setScanHidden(boolean z) {
        if (this.l7 != z) {
            this.l7 = z;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z) {
        float f;
        if (this.C2 == z) {
            return;
        }
        this.C2 = z;
        if (!this.I2) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.F2 = f;
            this.D2 = f;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z) {
        if (this.a != z) {
            this.a = z;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z) {
        this.z0 = z;
    }

    public final int t0() {
        int i;
        int i2 = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i2 != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        tw8 tw8Var = this.n;
        if (tw8Var != null) {
            i = tw8Var.b;
        } else {
            i = 0;
        }
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u = u(this.n);
        sparseIntArray.put(i, u);
        return u;
    }

    public final void t1(boolean z) {
        long max;
        String str;
        if (this.w0) {
            if (!this.x0) {
                str = k96.M0(2131746297, null) + " · " + k96.M0(2131746290, null);
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
                    str = k96.M0(2131746297, null) + " · " + k96.a0(null, null, 2131746298, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60)));
                } else {
                    return;
                }
            }
            if (!str.equals(this.A2)) {
                this.A2 = str;
                this.M0.t(str, z, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        oy8 oy8Var;
        if ((drawable instanceof RippleDrawable) || drawable == this.M0 || drawable == this.Y1 || (((oy8Var = this.l8) != null && drawable == oy8Var) || super.verifyDrawable(drawable))) {
            return true;
        }
        return false;
    }

    public final Drawable w(int i) {
        return getContext().getResources().getDrawable(i).mutate();
    }

    public final float w1(float f, float f2, int i, int i2) {
        float f3 = this.x;
        double max = Math.max(f3, i - f3);
        float f4 = this.y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f - this.x, f2 - this.y)) / (((float) Math.hypot(max, Math.max(f4, i2 - f4))) + gl.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f = this.g3;
        float f2 = (-f) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f;
        float height = (bitmap.getHeight() - 0.5f) * f;
        RectF rectF = this.f3;
        rectF.set(f2, f2, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.c3);
    }

    public final void y0() {
        long j;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i;
        xsa xsaVar = this.j2;
        if (xsaVar == null) {
            return;
        }
        sw8 sw8Var = this.G;
        byte b = sw8Var.a;
        ArrayList arrayList = this.w1;
        if (b == 2 && (i = sw8Var.q) >= 0 && i < arrayList.size()) {
            j = ((TL_stars.TL_starGiftUnique) arrayList.get(this.G.q)).id;
        } else {
            j = 0;
        }
        if (j != 0) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(this.G.q);
        } else {
            tL_starGiftUnique = null;
        }
        arrayList.clear();
        HashMap hashMap = this.z1;
        hashMap.clear();
        ArrayList arrayList2 = xsaVar.l;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift.refunded) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                if (!tL_starGiftUnique2.burned) {
                    arrayList.add(tL_starGiftUnique2);
                    hashMap.put(Long.valueOf(savedStarGift.gift.id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i4 = 0;
            while (true) {
                if (i4 < arrayList.size()) {
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i4)).id == j) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i2 = i4;
            }
            this.G.q = i2;
            this.L7 = i2;
        }
        boolean z = xsaVar.j;
        this.y1 = z;
        if (!z && !xsaVar.i) {
            xsaVar.a();
        }
        if (!arrayList.isEmpty() && !this.m2) {
            this.m2 = true;
            ow8 ow8Var = this.l2;
            removeCallbacks(ow8Var);
            postDelayed(ow8Var, 900L);
        }
        invalidate();
    }

    public final void z(android.graphics.Canvas r45, int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw8.z(android.graphics.Canvas, int, int):void");
    }

    public final float z0() {
        float f;
        int f0;
        int L;
        int L2;
        float f2;
        float width = (getWidth() - (gl.L(10.0f) << 1)) - gl.L(8.0f);
        int i = this.i1;
        if (i == 0) {
            f = width / 6.0f;
            f0 = (ld0.b.length + 5) / 6;
            L = gl.L(4.0f) - gl.L(32.0f);
            L2 = gl.L(4.0f);
        } else {
            if (i == 1) {
                f = width / 6.0f;
                f2 = 0.0f;
            } else if (h0()) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f = width / 3.0f;
                f0 = ((f0() + this.w1.size()) - 1) / f0();
                L = gl.L(4.0f) - gl.L(32.0f);
                L2 = gl.L(4.0f);
            }
            f0 = 0;
            return Math.max(0.0f, (((f0 * f) + f2) + gl.L(32.0f)) - b1());
        }
        f2 = L2 + L;
        return Math.max(0.0f, (((f0 * f) + f2) + gl.L(32.0f)) - b1());
    }
}
