package ci;

import ai.v1;
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
import bi.t4;
import com.google.android.gms.internal.vision.e2;
import di.o8;
import fi.s2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.o5;
public final class z0 extends View {
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
    public w0 G;
    public boolean G0;
    public final RectF G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public final TextPaint G5;
    public float G6;
    public float G7;
    public float G8;
    public w0 H;
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
    public final m6 M0;
    public final Drawable M1;
    public float M2;
    public final v0 M3;
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
    public final u0 P6;
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
    public final a1 U1;
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
    public final y1 X1;
    public long X2;
    public float X3;
    public Bitmap X4;
    public final RectF X5;
    public final Matrix X6;
    public long X7;
    public int X8;
    public final float[] Y0;
    public final mh0 Y1;
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
    public mh0 Z8;
    public boolean f5847a;
    public long f5848a0;
    public final float[] f5849a1;
    public boolean f5850a2;
    public Bitmap f5851a3;
    public final int[] f5852a4;
    public final Paint f5853a5;
    public final Matrix f5854a6;
    public final Path f5855a7;
    public final RectF f5856a8;
    public mh0 f5857a9;
    public final int f5858b;
    public float f5859b0;
    public final byte[] f5860b1;
    public int f5861b2;
    public BitmapShader f5862b3;
    public final float[] f5863b4;
    public final Rect f5864b5;
    public final Paint f5865b6;
    public final Path f5866b7;
    public final TextPaint f5867b8;
    public mh0 f5868b9;
    public final d6.i f5869c;
    public float f5870c0;
    public final boolean[] f5871c1;
    public int f5872c2;
    public final Paint f5873c3;
    public final float[] f5874c4;
    public final RectF f5875c5;
    public float f5876c6;
    public int f5877c7;
    public final TextPaint f5878c8;
    public Object f5879c9;
    public String d;
    public float f5880d0;
    public int f5881d1;
    public final HashMap d2;
    public final Paint f5882d3;
    public final float[] f5883d4;
    public final int[] f5884d5;
    public long f5885d6;
    public final RectF f5886d7;
    public final TextPaint f5887d8;
    public float f5888d9;
    public String f5889e;
    public float f5890e0;
    public boolean f5891e1;
    public Runnable f5892e2;
    public final Matrix f5893e3;
    public final float[] f5894e4;
    public final float[] f5895e5;
    public long f5896e6;
    public final Matrix f5897e7;
    public TextPaint f5898e8;
    public String f5899e9;
    public String f5900f;
    public float f5901f0;
    public final Random f5902f1;
    public boolean f5903f2;
    public final RectF f5904f3;
    public int f5905f4;
    public final float[] f5906f5;
    public boolean f5907f6;
    public final SparseArray f5908f7;
    public final TextPaint f5909f8;
    public long f5910f9;
    public float f5911g0;
    public float f5912g1;
    public boolean f5913g2;
    public float f5914g3;
    public float[] f5915g4;
    public final float[] f5916g5;
    public boolean f5917g6;
    public final Drawable[] f5918g7;
    public StaticLayout f5919g8;
    public float f5920g9;
    public boolean h;
    public float f5921h0;
    public float f5922h1;
    public Bitmap f5923h2;
    public boolean f5924h3;
    public float[] f5925h4;
    public final float[] f5926h5;
    public int f5927h6;
    public final RectF h7;
    public int f5928h8;
    public boolean f5929h9;
    public float f5930i0;
    public int f5931i1;
    public final int[] f5932i2;
    public boolean f5933i3;
    public float[] f5934i4;
    public final float[] f5935i5;
    public int f5936i6;
    public final RectF i7;
    public boolean f5937i8;
    public float f5938i9;
    public float f5939j0;
    public float f5940j1;
    public o8 f5941j2;
    public int j3;
    public int f5942j4;
    public final boolean[] f5943j5;
    public int f5944j6;
    public final RectF f5945j7;
    public final String f5946j8;
    public float f5947j9;
    public float f5948k0;
    public float f5949k1;
    public final r0 f5950k2;
    public final float[] f5951k3;
    public int f5952k4;
    public int f5953k5;
    public float f5954k6;
    public final RectF f5955k7;
    public final String f5956k8;
    public float f5957k9;
    public VelocityTracker f5958l0;
    public float l1;
    public final s0 f5959l2;
    public final float[] f5960l3;
    public PorterDuffColorFilter f5961l4;
    public float f5962l5;
    public float f5963l6;
    public final RectF f5964l7;
    public o5 f5965l8;
    public final OverScroller f5966l9;
    public float m0;
    public float f5967m1;
    public boolean f5968m2;
    public final int[] f5969m3;
    public int f5970m4;
    public float f5971m5;
    public float f5972m6;
    public boolean f5973m7;
    public mh0 f5974m8;
    public final ViewConfiguration f5975m9;
    public x0 f5976n;
    public float f5977n0;
    public String n1;
    public long f5978n2;
    public final int[] f5979n3;
    public float f5980n4;
    public StaticLayout f5981n5;
    public float f5982n6;
    public boolean f5983n7;
    public long f5984n8;
    public VelocityTracker f5985n9;
    public float f5986o0;
    public int f5987o1;
    public long f5988o2;
    public final float[] f5989o3;
    public float o4;
    public boolean f5990o5;
    public final float[] f5991o6;
    public float f5992o7;
    public boolean f5993o8;
    public boolean f5994o9;
    public float f5995p0;
    public String f5996p1;
    public long f5997p2;
    public final float[] f5998p3;
    public float f5999p4;
    public final float[] f6000p5;
    public final Paint f6001p6;
    public float f6002p7;
    public TLRPC.TL_inputStickerSetShortName f6003p8;
    public boolean f6004p9;
    public float f6005q0;
    public String f6006q1;
    public float f6007q2;
    public float f6008q3;
    public float f6009q4;
    public final float[] f6010q5;
    public float f6011q6;
    public long f6012q7;
    public TLRPC.Document f6013q8;
    public final s0 f6014q9;
    public x0 f6015r;
    public int f6016r0;
    public final RectF f6017r1;
    public long f6018r2;
    public final double[] f6019r3;
    public float f6020r4;
    public final float[] f6021r5;
    public boolean f6022r6;
    public boolean f6023r7;
    public long f6024r8;
    public final RippleDrawable[] f6025r9;
    public float f6026s;
    public long f6027s0;
    public boolean f6028s1;
    public final RectF f6029s2;
    public final double[] f6030s3;
    public float f6031s4;
    public final float[] s5;
    public float f6032s6;
    public float f6033s7;
    public LinearGradient[] f6034s8;
    public int s9;
    public final f f6035t0;
    public float f6036t1;
    public boolean f6037t2;
    public final double[] f6038t3;
    public final long[] f6039t4;
    public final float[] f6040t5;
    public boolean t6;
    public float f6041t7;
    public int[] f6042t8;
    public final Paint f6043t9;
    public e f6044u0;
    public float f6045u1;
    public float f6046u2;
    public int f6047u3;
    public final float[] f6048u4;
    public final float[] f6049u5;
    public Object f6050u6;
    public long f6051u7;
    public final b1 f6052u8;
    public final Path f6053u9;
    public e f6054v0;
    public long f6055v1;
    public String f6056v2;
    public int f6057v3;
    public final float[] f6058v4;
    public final float[] f6059v5;
    public float f6060v6;
    public final RectF f6061v7;
    public int f6062v8;
    public final float[] f6063v9;
    public long f6064w;
    public boolean f6065w0;
    public final ArrayList f6066w1;
    public String f6067w2;
    public float f6068w3;
    public final float[] f6069w4;
    public final float[] f6070w5;
    public int f6071w6;
    public long f6072w7;
    public int f6073w8;
    public final float[] f6074w9;
    public float f6075x;
    public boolean f6076x0;
    public long f6077x1;
    public String f6078x2;
    public float f6079x3;
    public final float[] f6080x4;
    public final float[] f6081x5;
    public int f6082x6;
    public float f6083x7;
    public float f6084x8;
    public final long[] f6085x9;
    public float f6086y;
    public boolean f6087y0;
    public boolean f6088y1;
    public String f6089y2;
    public float f6090y3;
    public final long[] f6091y4;
    public final float[] f6092y5;
    public final SparseIntArray f6093y6;
    public float f6094y7;
    public float f6095y8;
    public final long[] f6096y9;
    public boolean f6097z0;
    public final HashMap f6098z1;
    public final TextPaint f6099z2;
    public boolean f6100z3;
    public final boolean[] f6101z4;
    public final float[] f6102z5;
    public int f6103z6;
    public float f6104z7;
    public final RectF[] f6105z8;
    public final float[] f6106z9;
    public static final String[] C9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float D9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int H9 = a.b("Black");
    public static int I9 = a.b("Neon Blue");
    public static final int J9 = org.telegram.messenger.g0.L(70.0f);
    public static final float M9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float N9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final lr S9 = new lr(0.16d, 1.0d, 0.3d, 1.0d);

    public z0(Context context, int i7, String str, String str2, boolean z10, d6.i iVar) {
        super(context);
        e eVar;
        this.f5847a = true;
        this.f6026s = 1.0f;
        this.E = AnimationUtils.currentAnimationTimeMillis();
        this.F = new Matrix();
        this.G = new w0();
        this.J = new ArrayList();
        this.K = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N = -1.0f;
        this.f6035t0 = new f();
        this.f6076x0 = true;
        this.f6087y0 = true;
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
        this.f5849a1 = new float[320];
        this.f5860b1 = new byte[320];
        this.f5871c1 = new boolean[320];
        this.f5902f1 = new Random();
        this.f5931i1 = 0;
        this.f6017r1 = new RectF();
        this.f6066w1 = new ArrayList();
        this.f6098z1 = new HashMap();
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
        this.W1 = gd.M0(2131746275, null);
        this.Z1 = new Paint(1);
        this.f5861b2 = 1;
        this.d2 = new HashMap();
        this.f5932i2 = new int[3];
        this.f5950k2 = new fs() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    z0 z0Var = z0.this;
                    if (obj == z0Var.f5941j2) {
                        z0Var.y0();
                    }
                }
            }
        };
        this.f5959l2 = new Runnable(this) {
            public final z0 f5769b;

            {
                this.f5769b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        z0 z0Var = this.f5769b;
                        ArrayList arrayList = z0Var.f6066w1;
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
                                    z0Var.g0(tL_starGiftUnique.f28632id, document);
                                }
                            }
                            z0Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        z0 z0Var2 = this.f5769b;
                        ArrayList arrayList3 = z0Var2.J;
                        if (z0Var2.f5912g1 >= 0.5f && z0Var2.f5931i1 == 1 && !z0Var2.f6004p9) {
                            float f10 = z0Var2.f5938i9;
                            float f11 = z0Var2.f5947j9;
                            float width = (z0Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            RectF rectF = z0Var2.f6061v7;
                            float L2 = (z0Var2.f5949k1 + f11) - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i12 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i12 = L;
                            }
                            if (i12 >= 0) {
                                String[] strArr = z0.C9;
                                if (arrayList3.contains(strArr[i12]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i12])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    z0Var2.c();
                                    z0Var2.i0();
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
        this.f6007q2 = 1.0f;
        this.f6029s2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.f6099z2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.B2 = -1;
        this.F2 = -1.0f;
        this.M2 = -1.0f;
        this.O2 = -1L;
        this.P2 = "";
        this.Q2 = -1.0f;
        this.T2 = new Paint(3);
        this.Y2 = 1.0f;
        this.f5873c3 = new Paint(2);
        this.f5882d3 = new Paint(3);
        this.f5893e3 = new Matrix();
        this.f5904f3 = new RectF();
        this.f5951k3 = new float[14];
        this.f5960l3 = new float[14];
        this.f5969m3 = new int[7];
        this.f5979n3 = new int[7];
        this.f5989o3 = new float[15];
        this.f5998p3 = new float[15];
        this.f6008q3 = -1.0f;
        this.f6019r3 = new double[3];
        this.f6030s3 = new double[3];
        this.f6038t3 = new double[3];
        this.f6047u3 = org.telegram.messenger.g0.f24112m;
        this.f6057v3 = org.telegram.messenger.g0.f24113n;
        this.C3 = new Paint(2);
        this.D3 = new RectF();
        this.H3 = 5.0f;
        this.I3 = -0.7071f;
        this.J3 = 0.7071f;
        this.M3 = new v0();
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
        this.f5852a4 = new int[1024];
        this.f5863b4 = new float[1024];
        this.f5874c4 = new float[1024];
        this.f5883d4 = new float[1024];
        this.f5894e4 = new float[1024];
        this.f5952k4 = -1;
        this.f5970m4 = -1;
        this.f6039t4 = new long[2048];
        this.f6048u4 = new float[2048];
        this.f6058v4 = new float[2048];
        this.f6069w4 = new float[2048];
        this.f6080x4 = new float[2048];
        this.f6091y4 = new long[2048];
        this.f6101z4 = new boolean[2048];
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
        this.f5853a5 = new Paint(2);
        this.f5864b5 = new Rect();
        this.f5875c5 = new RectF();
        this.f5884d5 = new int[4];
        this.f5895e5 = new float[4];
        this.f5906f5 = new float[4];
        this.f5916g5 = new float[240];
        this.f5926h5 = new float[240];
        this.f5935i5 = new float[240];
        this.f5943j5 = new boolean[240];
        this.f6000p5 = new float[240];
        this.f6010q5 = new float[240];
        this.f6021r5 = new float[240];
        this.s5 = new float[240];
        this.f6040t5 = new float[240];
        this.f6049u5 = new float[240];
        this.f6059v5 = new float[240];
        this.f6070w5 = new float[240];
        this.f6081x5 = new float[240];
        this.f6092y5 = new float[240];
        this.f6102z5 = new float[240];
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
        this.f5854a6 = new Matrix();
        this.f5865b6 = new Paint();
        this.f5972m6 = 0.85f;
        this.f5991o6 = new float[320];
        Paint paint6 = new Paint();
        this.f6001p6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.f6011q6 = 1.0f;
        this.f6022r6 = true;
        this.f6060v6 = -1.0f;
        this.f6071w6 = -1;
        this.f6093y6 = new SparseIntArray();
        this.f6103z6 = -1;
        this.C6 = -1;
        this.D6 = new SweepGradient[4];
        this.P6 = new u0(this);
        this.X6 = new Matrix();
        this.Y6 = new Path();
        this.Z6 = new RectF();
        this.f5855a7 = new Path();
        this.f5866b7 = new Path();
        this.f5877c7 = -1;
        this.f5886d7 = new RectF();
        this.f5897e7 = new Matrix();
        this.f5908f7 = new SparseArray();
        this.h7 = new RectF();
        this.i7 = new RectF();
        this.f5945j7 = new RectF();
        this.f5955k7 = new RectF();
        this.f5964l7 = new RectF();
        this.f5992o7 = 1.0f;
        this.f6002p7 = 1.0f;
        this.f6033s7 = 1.0f;
        this.f6041t7 = 1.0f;
        this.f6061v7 = new RectF();
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
        this.f5856a8 = new RectF();
        this.f5867b8 = new TextPaint(1);
        this.f5878c8 = new TextPaint(1);
        this.f5887d8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(129);
        this.f5909f8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.f5946j8 = gd.M0(2131746297, null);
        this.f5956k8 = gd.M0(2131746307, null);
        int[] iArr = a.f5536b;
        this.f6034s8 = new LinearGradient[iArr.length];
        this.f6042t8 = new int[iArr.length];
        this.f6052u8 = new b1(0);
        this.f6062v8 = -100;
        this.f6073w8 = -100;
        this.f6105z8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.J8 = new Path();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.M8 = new RectF();
        this.R8 = new Paint(3);
        this.S8 = new Paint(1);
        this.T8 = new RectF();
        this.f5888d9 = -1.0f;
        this.f5966l9 = new OverScroller(getContext());
        this.f5975m9 = ViewConfiguration.get(getContext());
        this.f6014q9 = new Runnable(this) {
            public final z0 f5769b;

            {
                this.f5769b = this;
            }

            @Override
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (r2) {
                    case 0:
                        z0 z0Var = this.f5769b;
                        ArrayList arrayList = z0Var.f6066w1;
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
                                    z0Var.g0(tL_starGiftUnique.f28632id, document);
                                }
                            }
                            z0Var.m1(tL_starGiftUnique);
                        }
                        return;
                    default:
                        z0 z0Var2 = this.f5769b;
                        ArrayList arrayList3 = z0Var2.J;
                        if (z0Var2.f5912g1 >= 0.5f && z0Var2.f5931i1 == 1 && !z0Var2.f6004p9) {
                            float f10 = z0Var2.f5938i9;
                            float f11 = z0Var2.f5947j9;
                            float width = (z0Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            RectF rectF = z0Var2.f6061v7;
                            float L2 = (z0Var2.f5949k1 + f11) - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i12 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i12 = L;
                            }
                            if (i12 >= 0) {
                                String[] strArr = z0.C9;
                                if (arrayList3.contains(strArr[i12]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i12])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    z0Var2.c();
                                    z0Var2.i0();
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
        this.f6025r9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.s9 = -1;
        this.f6043t9 = new Paint(1);
        this.f6053u9 = new Path();
        this.f6063v9 = new float[12];
        this.f6074w9 = new float[12];
        this.f6085x9 = new long[12];
        this.f6096y9 = new long[12];
        this.f6106z9 = new float[12];
        this.A9 = new float[12];
        this.B9 = new Rect[12];
        for (int i10 = 0; i10 < 12; i10++) {
            this.B9[i10] = new Rect();
        }
        this.f5858b = i7;
        this.d = str;
        this.f5900f = str2;
        this.h = z10;
        this.f5869c = iVar;
        this.M1 = w(2131232365);
        this.N1 = w(2131232116);
        this.O1 = w(2131232321);
        this.V1.setTypeface(org.telegram.messenger.g0.o());
        Drawable w10 = w(2131232099);
        this.P1 = w10;
        Drawable w11 = w(2131231513);
        this.Q1 = w11;
        Drawable w12 = w(2131231828);
        this.R1 = w12;
        this.X1 = new y1(true);
        this.S1 = w(2131232344);
        this.T1 = w(2131232329);
        this.U1 = new a1();
        this.K1 = w(2131232105);
        this.L1 = w(2131231858);
        this.f5918g7 = new Drawable[]{w10, w11, w12};
        mh0 mh0Var = new mh0(2131624137, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        this.Y1 = mh0Var;
        mh0Var.R(this);
        mh0Var.K(1);
        mh0Var.setCallback(this);
        mh0Var.start();
        Paint paint8 = this.Z1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Z1.setStrokeCap(Paint.Cap.ROUND);
        this.Z1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.D1.setTextSize(org.telegram.messenger.g0.L(11.0f));
        this.E1.setTypeface(org.telegram.messenger.g0.o());
        this.B1.setStyle(style);
        m6 m6Var = new m6(false, true, true);
        this.M0 = m6Var;
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.n(0.35f, 280L, lr.h);
        m6Var.setCallback(this);
        m6Var.f37377b = 3;
        x0 t6 = t(H9);
        this.f5976n = t6;
        this.f5877c7 = W0(t6.f5835c);
        if (str != null) {
            String str3 = this.d;
            if (str3.equals(K9) && (eVar = L9) != null) {
                this.f6044u0 = eVar;
            } else {
                e c10 = f.c(str3, org.telegram.messenger.g0.L(240.0f), gc.b.M, 0.75f, null);
                this.f6044u0 = c10;
                L9 = c10;
                K9 = str3;
            }
            this.f6035t0.a(this.f6044u0);
        }
        u1(false);
    }

    public static void C0(double d, double d2, double d10, double[] dArr) {
        double d11 = (0.2158037573d * d10) + (0.3963377774d * d2) + d;
        double d12 = (d - (0.1055613458d * d2)) - (0.0638541728d * d10);
        double d13 = (d - (d2 * 0.0894841775d)) - (d10 * 1.291485548d);
        double d14 = d11 * d11 * d11;
        double d15 = d12 * d12 * d12;
        double d16 = d13 * d13 * d13;
        dArr[0] = (0.2309699292d * d16) + ((4.0767416621d * d14) - (3.3077115913d * d15));
        dArr[1] = ((2.6097574011d * d15) + ((-1.2684380046d) * d14)) - (0.3413193965d * d16);
        dArr[2] = (d16 * 1.707614701d) + ((d14 * (-0.0041960863d)) - (d15 * 0.7034186147d));
    }

    public static int D0(float f10, float f11, float f12, int i7) {
        float f13;
        float i12 = i1(Color.red(i7));
        float i13 = i1(Color.green(i7));
        float i14 = i1(Color.blue(i7));
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
        return e2.x(f11, f12, f12, ((f11 + 1.0f) * f12 * f12 * f12) + 1.0f);
    }

    public static int W0(int i7) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        o1(i7, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i7) {
        double[] dArr = new double[3];
        i0.a.j(i7, dArr);
        return i0.a.o(i0.a.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f10, int i7) {
        return i0.a.o(i7, (int) (Utilities.l(f10) * Color.alpha(i7)));
    }

    public static void b0(double d, double d2, double d10, double[] dArr) {
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        C0(d, d2 * cos, d2 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d11 = 0.0d;
        double d12 = d2;
        for (int i7 = 0; i7 < 14; i7++) {
            double d13 = (d11 + d12) / 2.0d;
            C0(d, d13 * cos, d13 * sin, dArr);
            if (p0(dArr)) {
                d11 = d13;
            } else {
                d12 = d13;
            }
        }
        C0(d, d11 * cos, d11 * sin, dArr);
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

    public static int e1(int i7) {
        if (a.h != null) {
            return i7;
        }
        if (a.f5540g == null) {
            int length = a.f5535a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i10 = 0;
            for (int i11 = 0; i11 < 80; i11++) {
                int b10 = a.b(a.f5539f[i11]);
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
            a.f5540g = iArr;
        }
        return a.f5540g[i7];
    }

    public static float f1(boolean z10, boolean z11, float f10) {
        if (z10) {
            if (f10 > 0.0f) {
                return org.telegram.ui.Cells.c0.B(f10, 0.18f, 1.0f, 0.0f);
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

    public static int g(float f10, int i7) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f)) << 24) | (i7 & 16777215);
    }

    public static float g1(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return e2.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static float h(float f10) {
        float f11 = f10 - 1.0f;
        return e2.x(f11, 1.70158f, f11, (2.70158f * f11 * f11 * f11) + 1.0f);
    }

    public static double h1(double d, double d2, double d10) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d11 = 6.283185307179586d / d10;
        double d12 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d12) * d11;
        double d13 = sqrt * d;
        return 1.0d - (((Math.sin(d13) * (d2 / Math.sqrt(d12))) + Math.cos(d13)) * Math.exp(((-d2) * d11) * d));
    }

    public static boolean i() {
        if (w.f() && pc.e(256)) {
            return true;
        }
        return false;
    }

    public static float i1(int i7) {
        float f10 = i7 / 255.0f;
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float j(long j3, float f10, float f11) {
        if (j3 == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = ((float) (AnimationUtils.currentAnimationTimeMillis() - j3)) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f10 * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f12 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return org.telegram.messenger.g0.T1(f10 + 1.0f, 1.0f - f11, e2.C(f12, 2.0f, 3.0f, f12 * f12));
        }
        float f13 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return org.telegram.messenger.g0.T1(1.0f - f11, 1.0f, e2.C(f13, 2.0f, 3.0f, f13 * f13));
    }

    public static void k() {
        if (E9 == null) {
            int length = a.f5536b.length;
            E9 = new int[length];
            F9 = new int[length];
            G9 = new int[length];
            for (int i7 = 0; i7 < length; i7++) {
                E9[i7] = x(a.f5536b[i7], false);
                F9[i7] = x(a.f5537c[i7], true);
                G9[i7] = v(E9[i7], F9[i7]);
            }
        }
    }

    public static float k0(int i7, int i10, int i11) {
        int i12 = i11 * 1442695041;
        int i13 = i12 + (i10 * 668265263) + (i7 * 374761393);
        int i14 = ((i13 >>> 13) ^ i13) * 1274126177;
        return ((i14 ^ (i14 >>> 16)) & 65535) / 65535.0f;
    }

    public static int l1(int i7, int i10) {
        int i11 = i7 | (-16777216);
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

    public static boolean m0(float f10, float f11, RectF rectF) {
        float L = org.telegram.messenger.g0.L(8.0f);
        if (!rectF.isEmpty() && f10 >= rectF.left - L && f10 <= rectF.right + L && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
            return true;
        }
        return false;
    }

    public static void o1(int i7, double[] dArr) {
        double v02 = v0(Color.red(i7) / 255.0d);
        double v03 = v0(Color.green(i7) / 255.0d);
        double v04 = v0(Color.blue(i7) / 255.0d);
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
            double d2 = dArr[1];
            if (d2 >= -1.0E-4d && d2 <= 1.0001d) {
                double d10 = dArr[2];
                if (d10 >= -1.0E-4d && d10 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i7) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = 16777215 & i7;
        int i12 = i7 >>> 24;
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

    public static Bitmap r0(w0 w0Var, Bitmap bitmap, boolean z10) {
        if (z10) {
            Bitmap bitmap2 = w0Var.f5818m;
            if (bitmap2 == null || w0Var.f5819n != bitmap || w0Var.f5821p != w0Var.f5815j) {
                w0Var.f5818m = q0(bitmap, bitmap2, w0Var.f5815j);
                w0Var.f5819n = bitmap;
                w0Var.f5821p = w0Var.f5815j;
            }
            return w0Var.f5818m;
        }
        Bitmap bitmap3 = w0Var.f5816k;
        if (bitmap3 == null || w0Var.f5817l != bitmap || w0Var.f5820o != w0Var.f5815j) {
            w0Var.f5816k = q0(bitmap, bitmap3, w0Var.f5815j);
            w0Var.f5817l = bitmap;
            w0Var.f5820o = w0Var.f5815j;
        }
        return w0Var.f5816k;
    }

    public static void s(int[] iArr, byte[] bArr, int i7) {
        int i10 = 16777215 & i7;
        int i11 = i7 >>> 24;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = ((((bArr[i12] & 255) * i11) / 255) << 24) | i10;
        }
    }

    private void setPattern(w0 w0Var) {
        boolean z10;
        if (this.f5913g2) {
            w0 w0Var2 = this.H;
            if (w0Var2 != null && w0Var2 != this.G) {
                P0(w0Var2);
            }
            w0 w0Var3 = this.G;
            if (w0Var3 != w0Var) {
                P0(w0Var3);
            }
            this.H = null;
            this.G = w0Var;
            if (w0Var.f5808a == 2) {
                Z(w0Var);
                if (w0Var.f5811e == null) {
                    w0Var.f5812f = this.f5923h2;
                }
            }
            this.I = AnimationUtils.currentAnimationTimeMillis() - 10000;
            invalidate();
            return;
        }
        if (this.f6026s < 1.0f && this.f6015r != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0Var.h = z10;
        if (w0Var.f5808a == 2) {
            Z(w0Var);
            if (w0Var.f5811e == null) {
                w0Var.f5812f = this.f5923h2;
            }
        }
        w0 w0Var4 = this.H;
        if (w0Var4 != null && w0Var4 != this.G) {
            P0(w0Var4);
        }
        this.H = this.G;
        this.G = w0Var;
        this.I = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    private void setSceneFromCard(x0 x0Var) {
        Y0(x0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f5913g2) {
            return;
        }
        this.f6007q2 = j(this.f5988o2, 0.03f, 0.005f);
        this.f5988o2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static x0 t(int i7) {
        ?? obj = new Object();
        obj.f5833a = 0;
        obj.f5837f = i7;
        if (i7 == I9) {
            obj.f5834b = -12602881;
            obj.f5835c = -15308082;
            obj.d = a.d[i7];
        } else {
            obj.f5834b = x(a.f5536b[i7], false);
            obj.f5835c = x(a.f5537c[i7], true);
            obj.d = a.d[i7];
        }
        if (i7 == I9) {
            obj.f5836e = -16747023;
        } else {
            k();
            obj.f5836e = G9[i7];
        }
        obj.h = Z0(obj.f5834b);
        obj.f5838g = f.k(0.5f, obj.f5834b, obj.f5835c);
        return obj;
    }

    public static float t1(float f10, float f11, float f12) {
        float N = (f10 - f12) / org.telegram.messenger.g0.N(1.7f);
        float N2 = f11 / org.telegram.messenger.g0.N(3.2f);
        float w12 = w1(N * 2.6f, N2 * 1.7f, 91) * 0.32f;
        return org.telegram.messenger.g0.N(3.6f) * ((w12 + (w1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    public static int u(x0 x0Var) {
        int i7;
        double d;
        int i10;
        if (x0Var != null) {
            i7 = i0.a.f(0.5f, x0Var.f5834b, x0Var.f5835c);
        } else {
            i7 = -16777216;
        }
        if (x0Var != null) {
            d = i0.a.h(x0Var.f5834b);
        } else {
            d = 0.3d;
        }
        float[] fArr = c1.f5612b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d)));
        float f10 = (fArr[11] / 100.0f) + 1.0f;
        float f11 = ((0.5f - (f10 * 0.5f)) + max) * 255.0f;
        int k10 = i0.a.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(255, Math.round((Color.red(i7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((Color.green(i7) * f10) + f11))), Math.max(0, Math.min(255, Math.round((f10 * Color.blue(i7)) + f11)))));
        if (x0Var != null) {
            i10 = x0Var.h;
        } else {
            i10 = 1073741824;
        }
        return i0.a.k(i10, k10);
    }

    public static double u0(int i7, int i10) {
        long j3 = (i10 * (-4417276706812531889L)) ^ (i7 * (-7046029254386353131L));
        long j10 = (j3 ^ (j3 >>> 31)) * (-4658895280553007687L);
        long j11 = (j10 ^ (j10 >>> 27)) * (-7723592293110705685L);
        return ((j11 ^ (j11 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static int v(int i7, int i10) {
        double d;
        double d2;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        o1(i10, dArr);
        o1(i7, dArr2);
        double d10 = dArr[0];
        if (d10 < 0.45d) {
            d = d10 - 0.03d;
        } else {
            d = 2.0d;
        }
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d11 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d12 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d12, d11);
            d2 = 2.0d;
            min = Math.min(0.012d, Math.hypot(d11, d12));
        } else {
            d2 = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d13 = 0.9d;
        double d14 = 0.2d;
        int i11 = 0;
        while (i11 < 12) {
            double d15 = (d14 + d13) / d2;
            double d16 = atan2;
            double d17 = min;
            b0(d15, d17, d16, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d14 = d15;
            } else {
                d13 = d15;
            }
            i11++;
            min = d17;
            atan2 = d16;
        }
        double d18 = atan2;
        double d19 = min;
        double d20 = (d14 + d13) / d2;
        if (d20 > d) {
            d20 = Math.max(0.05d, d);
        }
        b0(d20, d19, d18, dArr3);
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
        float C = e2.C(f11, 2.0f, 3.0f, f11 * f11);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * C) + c02;
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

    public static float w1(float f10, float f11, int i7) {
        int floor = (int) Math.floor(f10);
        int floor2 = (int) Math.floor(f11);
        float f12 = f10 - floor;
        float f13 = f11 - floor2;
        float C = e2.C(f12, 2.0f, 3.0f, f12 * f12);
        float C2 = e2.C(f13, 2.0f, 3.0f, f13 * f13);
        float k02 = k0(floor, floor2, i7);
        int i10 = floor + 1;
        float k03 = k0(i10, floor2, i7);
        int i11 = floor2 + 1;
        float k04 = k0(floor, i11, i7);
        float k05 = k0(i10, i11, i7);
        float z10 = e2.z(k03, k02, C, k02);
        return (((((k05 - k04) * C) + k04) - z10) * C2) + z10;
    }

    public static int x(int i7, boolean z10) {
        double[] dArr = new double[3];
        i0.a.j(i7, dArr);
        if (!z10) {
            return i7;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d2 = dArr[2] * 1.03d;
        dArr[2] = d2;
        return i0.a.b(max, d, d2);
    }

    public static PorterDuffColorFilter x0(w0 w0Var) {
        float[] fArr = c1.f5612b;
        int i7 = ((int) (fArr[14] * 10.0f)) ^ w0Var.f5824s;
        if (w0Var.f5826u == null || w0Var.f5825t != i7) {
            w0Var.f5825t = i7;
            w0Var.f5826u = new PorterDuffColorFilter(i0.a.f(fArr[14] / 100.0f, w0Var.f5824s, -1), PorterDuff.Mode.SRC_IN);
        }
        return w0Var.f5826u;
    }

    public static float y1(float f10) {
        return 1.0f - ((float) Math.pow(1.0f - f10, 2.4000000953674316d));
    }

    public final void A(android.graphics.Canvas r48, int r49) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.A(android.graphics.Canvas, int):void");
    }

    public final PorterDuffColorFilter A0(w0 w0Var) {
        float[] fArr = c1.f5612b;
        int i7 = ((int) (fArr[30] * 10.0f)) ^ (w0Var.f5824s * 31);
        if (this.f5961l4 == null || this.f5970m4 != i7) {
            this.f5970m4 = i7;
            this.f5961l4 = new PorterDuffColorFilter(i0.a.f(fArr[30] / 100.0f, w0Var.f5824s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.f5961l4;
    }

    public final void B(android.graphics.Canvas r80, int r81) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.B(android.graphics.Canvas, int):void");
    }

    public final void B0() {
        d6.i iVar;
        o0 o0Var;
        if (!this.f5903f2 && (iVar = this.f5869c) != null && (o0Var = ((j0) iVar.f7878b).f5677e) != null) {
            o0Var.j();
        }
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f10, float f11) {
        float f12;
        int i7;
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
        float[][] fArr2 = c1.f5611a;
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
            i7 = i25;
        } else if (this.B6) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        float[] fArr5 = fArr2[i7];
        float f24 = this.E6;
        float[] fArr6 = c1.f5612b;
        float f25 = f24 * fArr6[0];
        float f26 = (this.F6 * fArr6[i25]) / 100.0f;
        float N = org.telegram.messenger.g0.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.f5886d7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i10 = i7;
                Matrix matrix = this.X6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.Y6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i10 = i7;
            }
            f13 = Math.max(0.0f, f10 - N);
        } else {
            i10 = i7;
            rectF2 = rectF;
            f13 = f10;
        }
        Matrix matrix2 = this.f5897e7;
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
                w.b(canvas, path2);
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
            f14 = this.f5876c6 * ((fArr6[21] * 1.25f) / 100.0f);
        }
        int i27 = (f14 > 0.0f ? 1 : (f14 == 0.0f ? 0 : -1));
        if (i27 > 0 && this.f6100z3) {
            fArr = fArr2;
            f15 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        } else {
            fArr = fArr2;
            f15 = 0.0f;
        }
        if (i27 > 0 && this.f6100z3) {
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
                Path path4 = this.f5855a7;
                f20 = min;
                Path path5 = this.f5866b7;
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
                w.b(canvas, path5);
                Paint paint2 = this.A1;
                if (i12 == 0) {
                    float f30 = fArr[i10][10];
                    int i30 = this.f5877c7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(255, Math.round(((Color.red(i30) - 255) * f30) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.green(i30) - 255) * f30) + 255.0f))), Math.max(0, Math.min(255, Math.round(((Color.blue(i30) - 255) * f30) + 255.0f)))));
                    paint2.setAlpha((int) (f18 * 255.0f * f11));
                    i13 = i25;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f18)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f11 * 255.0f));
                    i13 = i25;
                    w.i(i13, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i12 != 0) {
                    w.i(0, paint2);
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

    public final void D(android.graphics.Canvas r18, ci.w0 r19, int r20, float r21, float r22, float r23, float r24, float r25) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.D(android.graphics.Canvas, ci.w0, int, float, float, float, float, float):void");
    }

    public final void E(Canvas canvas, int i7, int i10, w0 w0Var, w0 w0Var2, float f10, boolean z10, boolean z11) {
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
        z0 z0Var = this;
        w0 w0Var3 = w0Var;
        w0 w0Var4 = w0Var2;
        z0Var.X(w0Var3);
        z0Var.X(w0Var4);
        float L = org.telegram.messenger.g0.L(86.0f);
        float L2 = org.telegram.messenger.g0.L(70.0f);
        float L3 = org.telegram.messenger.g0.L(90.0f) * 1.3f;
        float f17 = z0Var.L + z0Var.O;
        float f18 = z0Var.M + z0Var.P;
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
            int i15 = i7;
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
                    z0Var.G0(u02, 3.0f, 10.0f);
                    float f22 = f19;
                    float f23 = (float) (2.0d * u02 * 3.141592653589793d);
                    f12 = f17;
                    float e10 = z0Var.M4 + p5.c.e(floor2, L, f11, f17);
                    float sin = (((float) Math.sin((z0Var.N3 * 0.45f) + f23)) * org.telegram.messenger.g0.L(3.0f)) + (floor * f21) + f18 + z0Var.N4;
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
                    float B = e2.B(f25, 0.16f, 0.92f, f24);
                    f14 = L;
                    z13 = z15;
                    f15 = f11;
                    f16 = f22;
                    int i17 = floor2;
                    i12 = floor;
                    i13 = i17;
                    if (J0(e10, sin, B, i15, i10, 0, floor, i17, (Math.max(0.0f, (B / org.telegram.messenger.g0.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z12) {
                            B *= 0.9f;
                        }
                        float f26 = B;
                        float sin2 = (((float) Math.sin((this.N3 * 0.3f) + f23)) * 4.0f) + ((f25 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i18 = (i13 - ((i12 - i14) / 2)) - i12;
                        int length = w0Var4.f5809b.length;
                        int i19 = ((i18 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (w0Var3 == null) {
                            D(canvas, w0Var4, i19, f26, sin2, f23 * 2.0f, f1(z10, z11, f10 - c02), c03);
                        } else {
                            w0 w0Var5 = w0Var4;
                            Drawable[] drawableArr = w0Var3.f5809b;
                            int length2 = drawableArr.length;
                            int i20 = ((i18 % length2) + length2) % length2;
                            if (drawableArr[i20] == w0Var5.f5809b[i19]) {
                                D(canvas, w0Var5, i19, f26, sin2, f23 * 2.0f, 1.0f, c03);
                            } else {
                                float f27 = f23 * 2.0f;
                                float f28 = f10 - c02;
                                D(canvas, w0Var3, i20, f26, sin2, f27, f1(z13, false, f28), c03);
                                D(canvas, w0Var2, i19, f26, sin2, f27, f1(false, false, f28), c03);
                            }
                        }
                    }
                }
                floor2 = i13 + 1;
                z0Var = this;
                i15 = i7;
                w0Var3 = w0Var;
                w0Var4 = w0Var2;
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
            z0Var = this;
            w0Var3 = w0Var;
            w0Var4 = w0Var2;
            z14 = z15;
            L2 = L2;
            L3 = f20;
        }
    }

    public final void E0(w0 w0Var, Bitmap bitmap) {
        w0Var.f5811e = bitmap;
        if (bitmap != null) {
            if (c1.f5612b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(w0Var);
        }
        w0Var.f5813g = AnimationUtils.currentAnimationTimeMillis();
        this.f5923h2 = bitmap;
        invalidate();
    }

    public final void F(android.graphics.Canvas r96, int r97, int r98, ci.w0 r99, boolean r100, boolean r101, float r102) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.F(android.graphics.Canvas, int, int, ci.w0, boolean, boolean, float):void");
    }

    public final void F0(int i7) {
        if (!this.f5847a) {
            return;
        }
        if (i7 == 2 && !j10.i(this.f5858b).q()) {
            d1(0, gd.M0(2131746279, null), gd.M0(2131746278, null));
            i0();
            return;
        }
        if (i7 == 2 && (this.f5931i1 != i7 || this.f5912g1 < 0.5f)) {
            AnimationUtils.currentAnimationTimeMillis();
        }
        this.f5931i1 = i7;
        this.f5940j1 = i7;
        this.f5949k1 = 0.0f;
        this.f5966l9.forceFinished(true);
        if (this.f5912g1 > 0.5f) {
            this.f5885d6 = AnimationUtils.currentAnimationTimeMillis();
        }
        if (this.f5922h1 < 0.5f) {
            this.J2 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.f5922h1 = 1.0f;
        l0();
        if (this.f5931i1 == 2) {
            y0();
        }
        i0();
    }

    public final void G(Canvas canvas, RectF rectF, int i7) {
        float centerY = rectF.centerY();
        float L = org.telegram.messenger.g0.L(12.0f);
        m6 m6Var = this.M0;
        float c10 = m6Var.c() + org.telegram.messenger.g0.L(2.0f) + L;
        float L2 = rectF.left + org.telegram.messenger.g0.L(8.0f);
        O(L2, centerY, L, i7, canvas, true);
        m6Var.u(i7);
        m6Var.setBounds((int) (L2 + L + org.telegram.messenger.g0.L(2.0f)), (int) (centerY - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + c10 + org.telegram.messenger.g0.L(40.0f)), (int) (centerY + org.telegram.messenger.g0.L(8.0f)));
        m6Var.draw(canvas);
    }

    public final void G0(double d, float f10, float f11) {
        double d2;
        float c02 = ((c0(31.7d * d) * (f11 - f10)) + f10) * org.telegram.messenger.g0.L(1.0f);
        float c03 = (c0(37.1d * d) * 11.0f) + 9.0f;
        if (c0(43.3d * d) < 0.5f) {
            d2 = -1.0d;
        } else {
            d2 = 1.0d;
        }
        double d10 = (d * 6.283d) + ((((d2 * 2.0d) * 3.141592653589793d) * this.N3) / c03);
        this.M4 = ((float) Math.cos(d10)) * c02;
        this.N4 = c02 * ((float) Math.sin(d10));
    }

    public final void H(Canvas canvas, RectF rectF, float f10) {
        int i7;
        x0 x0Var = this.f5976n;
        if (x0Var != null) {
            i7 = i0.a.f(0.5f, x0Var.f5834b, x0Var.f5835c);
        } else {
            i7 = -12947803;
        }
        Paint paint = this.A1;
        paint.setColor(i7 | (-16777216));
        paint.setAlpha((int) (Utilities.l(f10) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + org.telegram.messenger.g0.L(8.0f);
    }

    public final void I(android.graphics.Canvas r29, int r30, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r31, float r32, float r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.I(android.graphics.Canvas, int, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, float, float, float, float):void");
    }

    public final void I0(float f10, float f11, int i7) {
        Path path;
        int i10;
        int i11;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f6066w1.get(i7);
        ?? obj = new Object();
        obj.f5833a = 2;
        obj.f5837f = i7;
        final w0 w0Var = new w0();
        w0Var.f5808a = 2;
        w0Var.f5822q = i7;
        long j3 = tL_starGiftUnique.f28632id;
        w0Var.f5823r = (int) (j3 ^ (j3 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i13);
            i13++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                w0Var.A = document2;
                w0Var.f5810c = o5.l(this.f5858b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                w0Var.f5830z = document;
                w0Var.d = o5.l(this.f5858b, 24, document);
            }
        }
        e0(this.f5932i2, i7);
        obj.f5834b = x(this.f5932i2[0], false);
        int x10 = x(this.f5932i2[1], true);
        obj.f5835c = x10;
        obj.d = this.f5932i2[2];
        obj.f5836e = v(obj.f5834b, x10);
        obj.h = Z0(obj.f5834b);
        obj.f5838g = f.k(0.5f, obj.f5834b, obj.f5835c);
        w0Var.f5815j = l1(obj.d, obj.f5834b);
        i0.a.j(l1(obj.d, obj.f5834b) | (-16777216), r9);
        double min = Math.min(97.0d, r9[0] + 20.0d);
        double[] dArr = {min};
        Color.colorToHSV(i0.a.b(min, dArr[1], dArr[2]), r3);
        float[] fArr = {0.0f, Math.min(1.0f, fArr[1] * 1.15f)};
        w0Var.f5824s = Color.HSVToColor(fArr) | (-16777216);
        w0Var.v.setColorFilter(new PorterDuffColorFilter(w0Var.f5824s, PorterDuff.Mode.SRC_IN));
        w0Var.f5825t = -1;
        w0Var.B = tL_starGiftUnique;
        o5 o5Var = w0Var.f5810c;
        if (o5Var != null) {
            o5Var.a(this);
        }
        o5 o5Var2 = w0Var.d;
        if (o5Var2 != null) {
            o5Var2.a(this);
        }
        TLRPC.Document document3 = w0Var.f5830z;
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
                        if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i10 = documentAttribute.f28410w) > 0 && (i11 = documentAttribute.h) > 0) {
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
                final int i15 = w0Var.f5815j;
                Utilities.f22779e.c(new Runnable() {
                    @Override
                    public final void run() {
                        Bitmap bitmap;
                        float f15 = f13;
                        float f16 = f14;
                        int i16 = i15;
                        Path path3 = path2;
                        try {
                            int i17 = z0.J9;
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
                        org.telegram.messenger.g0.g3(new aa.r(z0.this, w0Var, bitmap, 15));
                    }
                });
            }
        }
        this.J.clear();
        Y0(obj, f10, f11);
        if (!this.f5913g2) {
            this.f6007q2 = j(this.f5988o2, 0.03f, 0.005f);
            this.f5988o2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(w0Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f10, float f11) {
        RectF rectF2;
        float f12;
        RectF rectF3;
        boolean z10;
        float f13;
        char c10;
        char c11;
        int i7;
        double d;
        float f14;
        float f15;
        if (f11 <= 0.0f) {
            return;
        }
        if (this.B6) {
            float min = Math.min(0.0f, org.telegram.messenger.g0.N(c1.f5611a[2][8]));
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
        if (z10 && this.Z2 != null && this.f5862b3 != null) {
            float f16 = this.f5914g3;
            Matrix matrix = this.f5893e3;
            matrix.setScale(f16, f16);
            float f17 = (-f16) / 2.0f;
            matrix.postTranslate(f17, f17);
            this.f5862b3.setLocalMatrix(matrix);
            Paint paint = this.f5882d3;
            paint.setAlpha((int) (Utilities.l(f11) * 255.0f));
            canvas.drawRoundRect(rectF3, f12, f12, paint);
            paint.setAlpha(255);
        }
        Path path = this.F1;
        path.rewind();
        path.addRoundRect(rectF3, f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = c1.f5612b;
        if (z10) {
            f13 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (w.f() && j0(canvas)) {
            int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
            f13 = 0.0f;
            if (i10 < 0) {
                canvas.saveLayerAlpha(rectF3, (int) (f11 * 255.0f));
            }
            if (this.t6 && this.f6032s6 > 0.004f) {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.f6050u6 == null) {
                    this.f6050u6 = android.support.v4.media.session.w.d("qrSheetLift");
                }
                float round = Math.round(this.f6032s6 * 50.0f) / 50.0f;
                c10 = '\t';
                x0 x0Var = this.f5976n;
                if (x0Var != null) {
                    i7 = x0Var.f5834b;
                } else {
                    i7 = 0;
                }
                if (round == this.f6060v6 && this.f6071w6 == 1 && this.f6082x6 == i7) {
                    c11 = 3;
                } else {
                    this.f6060v6 = round;
                    this.f6071w6 = 1;
                    this.f6082x6 = i7;
                    Object obj = this.f6050u6;
                    if (x0Var != null) {
                        d = i0.a.h(x0Var.f5834b);
                    } else {
                        d = 0.3d;
                    }
                    c11 = 3;
                    float c12 = e2.c(fArr[11], 100.0f, round, 1.0f);
                    float max = ((0.5f - (c12 * 0.5f)) + ((fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - d) / 0.45d))))) * 255.0f;
                    w.k(obj, Math.max(0.5f, org.telegram.messenger.g0.N(org.telegram.messenger.g0.T1(fArr[2], fArr[12], round)) / 8.0f), new float[]{c12, 0.0f, 0.0f, 0.0f, max, 0.0f, c12, 0.0f, 0.0f, max, 0.0f, 0.0f, c12, 0.0f, max, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a10 = w.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.f6050u6);
                a10.scale(0.125f, 0.125f);
                w.c(a10, this.H1);
                w.d(this.f6050u6);
                w.c(canvas, this.f6050u6);
                canvas.restore();
            } else {
                c10 = '\t';
                c11 = 3;
                Object obj2 = this.I1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                w.c(canvas, obj2);
                canvas.restore();
            }
            if (i10 < 0) {
                canvas.restore();
            }
        } else {
            f13 = 0.0f;
            c10 = '\t';
            c11 = 3;
            H(canvas, rectF3, f11);
        }
        int i11 = this.U8;
        if (i11 == 0) {
            float f18 = fArr[c11];
            if (this.t6) {
                f15 = fArr[c10] * this.f6032s6;
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
        boolean z11 = this.t6;
        if (!z11 && !this.B6) {
            f14 = (fArr[21] / 100.0f) * this.f5876c6;
        } else {
            f14 = f13;
        }
        if ((f14 > f13 || fArr[39] > f13) && this.f6100z3 && !z11 && !this.B6) {
            int width = getWidth();
            int height = getHeight();
            float c13 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c14 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c15 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c13 + c14 + c15 > 0.01f) {
                float f19 = ((fArr[39] * 1.25f) / 100.0f) * this.f5876c6 * 0.1f;
                float f20 = c14 * f19 * f11;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c13 * f19 * f11, f20, canvas, rectF3);
                L(centerX, rectF3.right, f20, f19 * c15 * f11, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f10, f11);
    }

    public final boolean J0(float r39, float r40, float r41, int r42, int r43, int r44, int r45, int r46, float r47) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.J0(float, float, float, int, int, int, int, int, float):boolean");
    }

    public final void K(Canvas canvas) {
        float f10;
        float L;
        int i7;
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
        if (this.l1 <= 0.001f) {
            return;
        }
        float L3 = org.telegram.messenger.g0.L(222.0f);
        float L4 = org.telegram.messenger.g0.L(46.0f);
        float L5 = org.telegram.messenger.g0.L(54.0f);
        org.telegram.messenger.g0.L(8.0f);
        if (this.f6097z0) {
            f10 = L4 + L4;
        } else {
            f10 = L4 + L5 + L4;
        }
        int i12 = (this.f5912g1 > 0.5f ? 1 : (this.f5912g1 == 0.5f ? 0 : -1));
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
        float l10 = Utilities.l(this.l1);
        float T1 = org.telegram.messenger.g0.T1(rectF.left, rectF2.left, f16);
        float T12 = org.telegram.messenger.g0.T1(rectF.top, rectF2.top, f17);
        float T13 = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, f16);
        float T14 = org.telegram.messenger.g0.T1(rectF.bottom, rectF2.bottom, f17);
        RectF rectF3 = this.K8;
        rectF3.set(T1, T12, T13, T14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, org.telegram.messenger.g0.T1(rectF.height() / 2.0f, org.telegram.messenger.g0.L(22.0f), Utilities.l(f17))));
        float C = a8.p0.C(this.H8, 9.0f, 1.0f, -0.25f) * org.telegram.messenger.g0.L(5.0f);
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
        float f27 = f22 + C;
        path.cubicTo(org.telegram.messenger.g0.T1(f24, centerX, 0.55f), f27, org.telegram.messenger.g0.T1(f23, centerX, 0.55f), f27, f23, f22);
        path.quadTo(f18, f22, f18, f26);
        path.lineTo(f18, f25);
        path.quadTo(f18, f19, f23, f19);
        path.close();
        RectF rectF4 = this.G1;
        rectF4.set(f18, f19, f20, Math.max(0.0f, C) + f22);
        canvas2.save();
        canvas2.clipPath(path);
        float f28 = 255.0f;
        if (w.f() && j0(canvas)) {
            Object obj = this.I1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            w.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Z2 != null) {
            Paint paint = this.f5873c3;
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
        boolean z11 = this.f6087y0;
        String M0 = gd.M0(2131746290, null);
        if (z11) {
            i7 = 2131746294;
        } else {
            i7 = 2131746292;
        }
        String[] strArr = {M0, gd.M0(i7, null), gd.M0(2131746289, null)};
        if (this.f6087y0) {
            i10 = 2131746293;
        } else {
            i10 = 2131746291;
        }
        String[] strArr2 = {null, gd.M0(i10, null), null};
        int i14 = 0;
        float f34 = f15;
        while (i14 < 3) {
            RectF[] rectFArr = this.f6105z8;
            if (i14 == i13 && this.f6097z0) {
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
                if (this.f5967m1 > 0.5f) {
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
                            boolean z12 = this.f6087y0;
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
            Utilities.f22779e.c(new p0(this, i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16), 0));
        }
    }

    public final void L(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        LinearGradient linearGradient;
        float min = Math.min(f12, f13);
        float max = Math.max(f12, f13);
        int i7 = (min > 0.002f ? 1 : (min == 0.002f ? 0 : -1));
        Paint paint = this.f5865b6;
        if (i7 > 0) {
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
            Matrix matrix = this.f5854a6;
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
        if (!this.f6100z3 || this.f6031s4 <= 0.001f) {
            return 0.0f;
        }
        float f11 = this.f6020r4;
        float[] fArr = c1.f5612b;
        float max = f11 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(org.telegram.messenger.g0.N(fArr[42]), (org.telegram.messenger.g0.L(3.5f) / 2.0f) / 0.607f) * f10 * max * ((float) Math.exp((-0.5f) * max * max)) * this.f6031s4;
    }

    public final void M(Canvas canvas, int i7, RectF rectF, boolean z10) {
        boolean z11;
        float exp;
        int i10;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.s9 == i7) {
            z11 = true;
        } else {
            z11 = false;
        }
        long[] jArr = this.f6096y9;
        if (!z11 && jArr[i7] == 0) {
            return;
        }
        if (z11) {
            exp = X0(i7, currentAnimationTimeMillis);
        } else {
            exp = this.f6106z9[i7] * ((float) Math.exp(((float) (-(currentAnimationTimeMillis - jArr[i7]))) / 180.0f));
        }
        if (!z11 && exp < 0.004f) {
            jArr[i7] = 0;
            return;
        }
        float C = e2.C(exp, 2.0f, 3.0f, exp * exp);
        float min = Math.min(1.0f, ((float) (currentAnimationTimeMillis - this.f6085x9[i7])) / 320.0f);
        float f10 = 1.0f - min;
        float z12 = org.telegram.ui.Cells.c0.z(f10, f10, f10, 1.0f);
        if (!z11 || exp < 0.996f || min < 1.0f) {
            invalidate();
        }
        float max = Math.max(rectF.left, Math.min(rectF.right, this.f6063v9[i7]));
        float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.f6074w9[i7]));
        float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
        if (z10) {
            i10 = 335544320;
        } else {
            i10 = 738197503;
        }
        int i11 = (((int) ((i10 >>> 24) * C)) << 24) | (16777215 & i10);
        Paint paint = this.f6043t9;
        paint.setColor(i11);
        Path path = this.f6053u9;
        path.rewind();
        if (i7 != 3 && i7 != 4 && i7 != 11) {
            if (i7 < 6 && i7 != 5) {
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
        canvas.drawCircle(max, max2, Math.max(org.telegram.messenger.g0.L(6.0f), max3 * z12), paint);
        canvas.restore();
    }

    public final void M0(int i7, x0 x0Var, int i10, int i11) {
        int i12 = i7 * 7;
        int i13 = x0Var.f5833a;
        float[] fArr = this.f5951k3;
        if (i13 == 0 && x0Var.f5837f == I9) {
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
        int i14 = i7 * 3;
        int i15 = x0Var.f5834b;
        int[] iArr = this.f5969m3;
        iArr[i14] = i15;
        iArr[i14 + 1] = x0Var.f5838g;
        iArr[i14 + 2] = x0Var.f5835c;
    }

    public final void N(android.graphics.Canvas r61, int r62, int r63) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.N(android.graphics.Canvas, int, int):void");
    }

    public final int N0() {
        x0 x0Var = this.f5976n;
        if (x0Var == null) {
            return -16777216;
        }
        if (this.f6026s < 1.0f && this.f6015r != null) {
            float l10 = (l() / 2.0f) + m();
            float l11 = Utilities.l(((((((float) Math.hypot(Math.max(this.f6075x, getWidth() - this.f6075x), Math.max(this.f6086y, getHeight() - this.f6086y))) + org.telegram.messenger.g0.L(60.0f)) * y1(this.f6026s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.f6075x, l10 - this.f6086y))) + org.telegram.messenger.g0.L(80.0f)) / org.telegram.messenger.g0.L(160.0f));
            int i7 = this.f6015r.f5836e;
            int i10 = this.f5976n.f5836e;
            float C = e2.C(l11, 2.0f, 3.0f, l11 * l11);
            double[] dArr = this.f6019r3;
            i0.a.j(i7, dArr);
            double[] dArr2 = this.f6030s3;
            i0.a.j(i10, dArr2);
            double d = C;
            double[] dArr3 = this.f6038t3;
            if (dArr3.length == 3) {
                double d2 = 1.0d - d;
                double d10 = (dArr2[0] * d) + (dArr[0] * d2);
                dArr3[0] = d10;
                double d11 = (dArr2[1] * d) + (dArr[1] * d2);
                dArr3[1] = d11;
                double d12 = (dArr2[2] * d) + (dArr[2] * d2);
                dArr3[2] = d12;
                return i0.a.b(d10, d11, d12);
            }
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        return x0Var.f5836e;
    }

    public final void O(float f10, float f11, float f12, int i7, Canvas canvas, boolean z10) {
        PorterDuffColorFilter n1 = n1(i7);
        a1 a1Var = this.U1;
        a1Var.setColorFilter(n1);
        a1Var.setAlpha(255);
        float f13 = f12 / 2.0f;
        float f14 = f11 - f13;
        float f15 = f10 + f12;
        float f16 = f11 + f13;
        a1Var.setBounds((int) f10, (int) f14, (int) f15, (int) f16);
        if (!z10) {
            a1Var.draw(canvas);
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
        a1Var.draw(canvas);
        Paint paint = this.Z1;
        paint.setStrokeWidth((0.065f * f12 * 2.0f) + f17);
        canvas.drawLine(f18, f19, f20, f21, paint);
        canvas.restore();
        Paint paint2 = this.B1;
        paint2.setColor(i7);
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
        mh0 mh0Var = this.f5868b9;
        if (mh0Var != null) {
            mh0Var.C(false);
            this.f5868b9 = null;
        }
        mh0 mh0Var2 = this.f5974m8;
        if (mh0Var2 != null) {
            mh0Var2.C(false);
            this.f5974m8 = null;
        }
        o5 o5Var = this.f5965l8;
        if (o5Var != null) {
            o5Var.n(this);
            this.f5965l8 = null;
            this.f5984n8 = 0L;
        }
        P0(this.G);
        P0(this.H);
        removeCallbacks(this.f6014q9);
        o8 o8Var = this.f5941j2;
        if (o8Var != null) {
            o8Var.f();
        }
        VelocityTracker velocityTracker = this.f5958l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5958l0 = null;
        }
        VelocityTracker velocityTracker2 = this.f5985n9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f5985n9 = null;
        }
        HashMap hashMap = this.K7;
        for (o5 o5Var2 : hashMap.values()) {
            o5Var2.n(this);
        }
        for (Drawable drawable : this.K.values()) {
            if (drawable instanceof o5) {
                ((o5) drawable).n(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.L7;
        for (y0 y0Var : hashMap2.values()) {
            m5 m5Var = y0Var.f5840a;
            if (m5Var != null) {
                m5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (this.f6006q1 != null && f13 > 0.004f) {
            TextPaint textPaint = this.f6099z2;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setColor(-1);
            textPaint.setAlpha((int) (f13 * 255.0f));
            canvas.drawText(this.f6006q1, ((f10 + f12) - org.telegram.messenger.g0.L(16.0f)) - textPaint.measureText(this.f6006q1), f11 + org.telegram.messenger.g0.L(5.0f), textPaint);
            textPaint.setAlpha(255);
        }
    }

    public final void P0(w0 w0Var) {
        if (w0Var != null) {
            o5 o5Var = w0Var.f5810c;
            if (o5Var != null) {
                o5Var.n(this);
            }
            o5 o5Var2 = w0Var.d;
            if (o5Var2 != null && !this.K7.containsValue(o5Var2)) {
                w0Var.d.n(this);
            }
            w0Var.G = true;
            t tVar = w0Var.F;
            if (tVar != null) {
                tVar.f5773e = true;
                ks.f(tVar.f5770a).n(tVar, ks.Y1);
                w0Var.F = null;
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
                    float z11 = org.telegram.ui.Cells.c0.z(l10, l10, l10, 1.0f);
                    if (f12 < 0.6f) {
                        float f16 = 1.0f - (f12 / 0.6f);
                        f14 = (1.0f - ((f16 * f16) * f16)) * 364.0f;
                    } else {
                        float l11 = Utilities.l((f12 - 0.6f) / 0.12f);
                        f14 = 364.0f - ((3.0f - (l11 * 2.0f)) * ((4.0f * l11) * l11));
                    }
                    f13 = f14;
                    f15 = z11;
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
                canvas2.drawLine(L2, L3, org.telegram.ui.Cells.c0.e(3.8f, (float) Math.cos(radians), L2), org.telegram.ui.Cells.c0.e(3.8f, (float) Math.sin(radians), L3), paint);
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawCircle(L2, L3, org.telegram.messenger.g0.N(1.2f), paint);
            } else {
                canvas2 = canvas;
                if (n()) {
                    mh0 p12 = p1();
                    int L5 = org.telegram.messenger.g0.L(28.0f);
                    float f18 = L5 / 2.0f;
                    int i7 = (int) (f11 - f18);
                    p12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f18), i7, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f18)) + L5, L5 + i7);
                    p12.draw(canvas2);
                } else {
                    int i10 = this.X8;
                    if (i10 == 2131232116) {
                        mh0 q12 = q1();
                        int L6 = org.telegram.messenger.g0.L(28.0f);
                        float f19 = L6 / 2.0f;
                        int i11 = (int) (f11 - f19);
                        q12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19), i11, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19)) + L6, L6 + i11);
                        q12.draw(canvas2);
                    } else {
                        if (i10 == 2131232344) {
                            drawable = this.S1;
                        } else if (i10 == 2131232105) {
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
            mh0 r12 = r1();
            int L7 = org.telegram.messenger.g0.L(27.0f);
            float f20 = L7 / 2.0f;
            int i12 = (int) (f11 - f20);
            r12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20), i12, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20)) + L7, L7 + i12);
            r12.draw(canvas2);
        }
        TextPaint textPaint = this.D1;
        textPaint.setColor(-1);
        float f21 = this.f6036t1;
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
            TextPaint textPaint2 = this.f6099z2;
            textPaint2.setTextSize(textSize);
            textPaint2.setColor(textPaint.getColor());
            canvas2.drawText(this.f6067w2, L8, L10, textPaint);
            float measureText = textPaint.measureText(this.f6067w2) + L8;
            canvas2.drawText(this.f6078x2, measureText, L10, textPaint2);
            canvas2.drawText(this.f6089y2, textPaint2.measureText(this.f6078x2) + measureText, L10, textPaint);
        }
    }

    public final void Q0() {
        int i7 = this.s9;
        if (i7 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f6106z9[i7] = X0(i7, currentAnimationTimeMillis);
            this.f6096y9[i7] = currentAnimationTimeMillis;
            invalidate();
        }
        this.s9 = -1;
    }

    public final void R(android.graphics.Canvas r29, int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.R(android.graphics.Canvas, int, long):void");
    }

    public final void R0() {
        float f10 = this.f5901f0;
        if (f10 == 0.0f && this.f5911g0 == 0.0f) {
            return;
        }
        this.f5939j0 = f10;
        this.f5948k0 = this.f5911g0;
        this.f5848a0 = AnimationUtils.currentAnimationTimeMillis();
        this.V = true;
    }

    public final void S0() {
        int i7 = this.W7;
        if (i7 >= 0 && this.Y7 < this.X7) {
            this.Z7 = k1(i7);
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
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.T0():android.graphics.Bitmap");
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.K;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = j6.g(str);
            if (drawable == null) {
                drawable = j6.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        boolean z10;
        if (this.f6065w0) {
            int L = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(8.0f);
            this.f6046u2 = this.M0.c() + org.telegram.messenger.g0.L(2.0f) + L + org.telegram.messenger.g0.L(11.0f);
            this.f6065w0 = false;
            this.B0 = false;
            if (this.C0 * this.H0 > 0.001f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6037t2 = z10;
            this.f6018r2 = AnimationUtils.currentAnimationTimeMillis();
            this.D0 = this.C0;
            this.E0 = 0.0f;
            this.F0 = System.currentTimeMillis();
            e eVar = this.f6044u0;
            if (eVar != null) {
                j1(eVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.f5889e = null;
            this.f6054v0 = null;
            d6.i iVar = this.f5869c;
            if (iVar != null) {
                iVar.w(0);
            }
        }
    }

    public final Bitmap V(o5 o5Var) {
        Bitmap n10;
        s2 s2Var = o5Var.f37976k;
        if (s2Var != null) {
            mh0 B = s2Var.B();
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
                b6 m10 = s2Var.m();
                if (m10 != null) {
                    if (!this.U2) {
                        m10.D(System.currentTimeMillis());
                    }
                    if (m10.s()) {
                        return m10.m();
                    }
                } else if (s2Var.J() && s2Var.L() && (n10 = s2Var.n()) != null && !n10.isRecycled()) {
                    return n10;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.f5922h1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l(((float) (AnimationUtils.currentAnimationTimeMillis() - this.J2)) / 420.0f);
    }

    public final ci.w0 W() {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.W():ci.w0");
    }

    public final void X(w0 w0Var) {
        TLRPC.Document document;
        if (w0Var != null && !w0Var.G && w0Var.f5808a == 2 && w0Var.F == null && (document = w0Var.A) != null) {
            w0Var.F = new t(this.f5858b, document, w0Var.B, org.telegram.messenger.g0.L(48.0f), new v1(6, this, w0Var));
        }
    }

    public final float X0(int i7, long j3) {
        return 1.0f - ((1.0f - this.A9[i7]) * ((float) Math.exp(((float) (-(j3 - this.f6085x9[i7]))) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = c1.f5612b;
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

    public final void Y0(x0 x0Var, float f10, float f11) {
        if (x0Var != null) {
            this.f5877c7 = W0(x0Var.f5835c);
        }
        if (this.f5913g2) {
            if (this.f6015r != null) {
                this.f6015r = null;
            }
            this.f5976n = x0Var;
            this.f6026s = 1.0f;
            invalidate();
            return;
        }
        this.f6015r = this.f5976n;
        this.f5976n = x0Var;
        this.f6026s = 0.0f;
        this.f6064w = System.currentTimeMillis();
        this.f6075x = f10;
        this.f6086y = f11;
        this.f6016r0++;
        i0();
        invalidate();
    }

    public final void Z(w0 w0Var) {
        o5 o5Var;
        s2 s2Var;
        if (w0Var != null && w0Var.f5811e == null && (o5Var = w0Var.f5810c) != null) {
            t tVar = w0Var.F;
            if ((tVar == null || tVar.h) && (s2Var = o5Var.f37976k) != null && s2Var.J() && s2Var.L()) {
                int L = org.telegram.messenger.g0.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                w0Var.f5810c.setBounds(0, 0, L, L);
                w0Var.f5810c.setColorFilter(null);
                w0Var.f5810c.setAlpha(255);
                s2Var.f22641i1 = 1.0f;
                w0Var.f5810c.draw(canvas);
                E0(w0Var, createBitmap);
            }
        }
    }

    public final String a0() {
        String M0 = gd.M0(2131746284, null);
        if (!M0.equals(this.f6056v2)) {
            this.f6056v2 = M0;
            Matcher matcher = Pattern.compile("\\d+").matcher(M0);
            if (matcher.find()) {
                this.f6067w2 = M0.substring(0, matcher.start());
                this.f6078x2 = matcher.group();
                this.f6089y2 = M0.substring(matcher.end());
            } else {
                this.f6067w2 = M0;
                this.f6089y2 = "";
                this.f6078x2 = "";
            }
        }
        return this.f6056v2;
    }

    public final float a1() {
        return (getHeight() - this.f6057v3) - org.telegram.messenger.g0.L(10.0f);
    }

    public final float b(double d) {
        float f10 = this.B4;
        double sin = Math.sin((f10 * 78.233d) + (((f10 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float L;
        float max = Math.max(org.telegram.messenger.g0.L(160.0f), a1() - ((((l() + (org.telegram.messenger.g0.L(51.0f) + this.f6047u3)) + org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.L(11.0f)) + org.telegram.messenger.g0.L(13.0f)));
        if (this.f5931i1 == 2 && this.f6088y1) {
            ArrayList arrayList = this.f6066w1;
            if (arrayList.size() <= 3) {
                float B = (n10.B(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f)) / 3.0f;
                if (arrayList.isEmpty()) {
                    L = org.telegram.messenger.g0.L(286.0f);
                } else {
                    L = org.telegram.messenger.g0.L(8.0f) + B;
                }
                max = Math.min(max, L);
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f10 = this.Q2;
        if (f10 >= 0.0f && this.f5912g1 >= 0.01f) {
            if (f10 != max) {
                long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.R2));
                float f11 = this.Q2;
                float z10 = e2.z(1.0f, (float) Math.exp(((float) (-min)) / 140.0f), max - f11, f11);
                this.Q2 = z10;
                if (Math.abs(max - z10) < 0.5f) {
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
        x0 x0Var;
        Runnable runnable = this.f5892e2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f5903f2 && !this.J.isEmpty() && (x0Var = this.f5976n) != null && (x0Var.f5833a != 0 || this.G.f5808a == 2)) {
            this.U7 = AnimationUtils.currentAnimationTimeMillis();
            this.R7 = -1;
            this.P7 = 0.0f;
            setSceneFromCard(t(this.N7));
        }
        setPattern(W());
        if (!this.f5913g2) {
            this.f6027s0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f10, float f11, int i7, int i10) {
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        float asin;
        if (!this.f6100z3) {
            return 0.0f;
        }
        float f18 = i7;
        float f19 = f10 - (f18 / 2.0f);
        float f20 = this.I3;
        float f21 = i10;
        float f22 = f11 - (f21 / 2.0f);
        float f23 = (this.J3 * f22) + (f19 * f20);
        float f24 = 1.0f;
        float max = Math.max(1.0f, ((Math.abs(this.J3) * f21) + (Math.abs(f20) * f18)) / 2.0f);
        float[] fArr = c1.f5612b;
        float f25 = fArr[19] / 100.0f;
        if (f25 > 0.0f) {
            float f26 = this.J3;
            float max2 = ((f22 * this.I3) + (f19 * (-f26))) / Math.max(1.0f, ((Math.abs(this.I3) * f21) + (Math.abs(f26) * f18)) / 2.0f);
            f23 -= ((f25 * f18) * max2) * max2;
        }
        float f27 = (f23 - this.f6079x3) / this.f6090y3;
        float f28 = fArr[20] / 100.0f;
        if (f28 > 0.0f) {
            f27 += (((((float) Math.asin(a8.p0.C(f23, max, 1.0f, -1.0f))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.f6079x3 / max) * 1.5707964f))) / ((this.f6090y3 / max) * 1.5707964f)) - f27) * f28;
            f12 = e2.t(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, asin))), (f28 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f12 = 1.0f;
        }
        this.f5999p4 = f27;
        float f29 = this.F3;
        this.f6009q4 = f29 * f12;
        float f30 = fArr[34] / 100.0f;
        int i12 = (f27 > 4.0f ? 1 : (f27 == 4.0f ? 0 : -1));
        if ((i12 > 0 || f27 < -4.0f) && f30 <= 0.0f) {
            this.f5980n4 = 0.0f;
            return 0.0f;
        }
        float f31 = fArr[32];
        float f32 = f27 / fArr[29];
        w0 w0Var = this.G;
        if (w0Var != null && w0Var.f5808a == 1) {
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
        this.f5980n4 = f16;
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

    public final void d(int i7) {
        boolean z10 = true;
        this.f5903f2 = true;
        if (this.G.f5808a == 0) {
            z10 = false;
        }
        this.J.clear();
        this.P7 = 0.0f;
        this.N7 = i7;
        x0 x0Var = this.f5976n;
        if (x0Var == null || x0Var.f5833a != 0 || x0Var.f5837f != i7) {
            setSceneFromCard(t(i7));
        }
        if (z10) {
            setPattern(new w0());
        }
        Runnable runnable = this.f5892e2;
        if (runnable != null) {
            runnable.run();
        }
        this.f5903f2 = false;
    }

    public final void d1(int i7, String str, String str2) {
        int i10;
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new t4((Object) this, i7, str, (Serializable) str2, 1), currentTimeMillis);
            return;
        }
        this.f5987o1 = i7;
        this.n1 = str;
        this.f5996p1 = str2;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (str2 != null) {
            i10 = 4000;
        } else {
            i10 = 2800;
        }
        this.f6055v1 = currentTimeMillis2 + i10;
        invalidate();
    }

    public final void e(int i7, ArrayList arrayList, boolean z10) {
        String str;
        int i10 = -1;
        if (z10 && a.h != null) {
            int i11 = 0;
            while (true) {
                int[] iArr = a.h;
                if (i11 >= iArr.length) {
                    break;
                } else if (iArr[i11] == i7) {
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
            this.f5903f2 = true;
            this.N7 = i10;
            x0 x0Var = this.f5976n;
            if (x0Var == null || x0Var.f5833a != 0 || x0Var.f5837f != i10) {
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
                    long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                    String o4 = a8.p0.o(j3, "c:");
                    HashMap hashMap = this.K;
                    if (!hashMap.containsKey(o4)) {
                        o5 m10 = o5.m(this.f5858b, j3, null, 2);
                        m10.a(this);
                        hashMap.put(o4, m10);
                    }
                    if (!arrayList2.contains(o4)) {
                        arrayList2.add(o4);
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
            this.f5903f2 = false;
            return;
        }
        d(i10);
    }

    public final void e0(int[] iArr, int i7) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.f6066w1.get(i7)).attributes;
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
        float z10 = e2.z(f11, f10, 1.0f - ((float) Math.pow(1.0f - f12, this.Y2)), f10);
        if (Math.abs(f11 - z10) < 0.002f) {
            return f11;
        }
        return z10;
    }

    public final int f0() {
        int size = this.f6066w1.size();
        if (!this.f6088y1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final o5 g0(long j3, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.K7;
        o5 o5Var = (o5) hashMap.get(valueOf);
        if (o5Var == null) {
            o5 l10 = o5.l(this.f5858b, 24, document);
            l10.a(this);
            hashMap.put(Long.valueOf(j3), l10);
            return l10;
        }
        return o5Var;
    }

    public String getCurrentLink() {
        String str;
        if (this.f6065w0 && (str = this.f5889e) != null && this.f6054v0 != null) {
            return str;
        }
        if (this.f6044u0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
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
        x0 x0Var = this.f5976n;
        if (x0Var != null && x0Var.f5833a == 0) {
            return x0Var.f5837f;
        }
        return -1;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i7;
        w0 w0Var = this.G;
        if (w0Var.f5808a == 2 && (i7 = w0Var.f5822q) >= 0) {
            ArrayList arrayList = this.f6066w1;
            if (i7 < arrayList.size()) {
                return (TL_stars.TL_starGiftUnique) arrayList.get(this.G.f5822q);
            }
            return null;
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l10;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l10 = (Long) this.f6098z1.get(Long.valueOf(themeGift.f28632id));
        } else {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        if (this.f6088y1 && this.f6066w1.isEmpty()) {
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
            if ((this.T4 || this.f5850a2) && canvas.isHardwareAccelerated() && w.e(this.I1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j1(e eVar) {
        f fVar = this.f6035t0;
        if (fVar.f5653q == 2 && fVar.f5651o < 1.0f) {
            fVar.f5649m = eVar;
            invalidate();
            return;
        }
        postDelayed(new c1.c(16, this, eVar), 40L);
    }

    public final float k1(int i7) {
        if (i7 != this.W7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j3 = this.Y7;
        long j10 = this.X7;
        if (j3 < j10) {
            float l10 = 1.0f - Utilities.l(((float) (currentAnimationTimeMillis - j10)) / 110.0f);
            return 1.0f - ((1.0f - (l10 * l10)) * 0.08f);
        }
        double h12 = h1(((float) (currentAnimationTimeMillis - j3)) / 1000.0f, 0.6d, 0.28d);
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
            this.f6055v1 = 0L;
            return;
        }
        this.f6055v1 = 0L;
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
        return org.telegram.messenger.g0.T1(max, Math.max(org.telegram.messenger.g0.L(51.0f) + this.f6047u3, Math.min(max, a12)), this.f5912g1);
    }

    public final y0 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.f28632id);
        HashMap hashMap = this.L7;
        y0 y0Var = (y0) hashMap.get(valueOf);
        y0 y0Var2 = y0Var;
        if (y0Var == null) {
            ?? obj = new Object();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i7 = 0;
            while (i7 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
                i7++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                m5 m5Var = new m5(org.telegram.messenger.g0.L(28.0f), this);
                obj.f5840a = m5Var;
                m5Var.i(document, false);
                obj.f5840a.a();
                obj.f5841b = document.f28409id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.f28632id), obj);
            y0Var2 = obj;
        }
        return y0Var2;
    }

    public final boolean n() {
        String str;
        if (this.X8 == 2131232344 && (str = this.V8) != null && !s0(str)) {
            return true;
        }
        return false;
    }

    public final boolean n0(float f10, float f11) {
        if (this.f6006q1 != null && this.O8) {
            RectF rectF = this.M8;
            if (!rectF.isEmpty()) {
                float f12 = rectF.right;
                TextPaint textPaint = this.f6099z2;
                textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
                float L = rectF.bottom + org.telegram.messenger.g0.L(6.0f);
                RectF rectF2 = this.f6017r1;
                rectF2.set((f12 - textPaint.measureText(this.f6006q1)) - org.telegram.messenger.g0.L(28.0f), rectF.top - org.telegram.messenger.g0.L(6.0f), rectF.right + org.telegram.messenger.g0.L(6.0f), L);
                return rectF2.contains(f10, f11);
            }
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter n1(int i7) {
        SparseArray sparseArray = this.f5908f7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i7);
        if (porterDuffColorFilter == null) {
            if (sparseArray.size() > 96) {
                sparseArray.clear();
            }
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            sparseArray.put(i7, porterDuffColorFilter2);
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
        int i7 = this.f6103z6;
        SparseIntArray sparseIntArray = this.f6093y6;
        if (i7 != 1) {
            sparseIntArray.clear();
            this.f6103z6 = 1;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = a.f5536b;
            if (i10 >= iArr.length) {
                break;
            }
            ?? obj = new Object();
            int i11 = iArr[i10] | (-16777216);
            obj.f5834b = i11;
            obj.f5835c = (-16777216) | a.f5537c[i10];
            obj.h = Z0(i11);
            if (sparseIntArray.indexOfKey(obj.f5834b) < 0) {
                sparseIntArray.put(obj.f5834b, u(obj));
            }
            i10++;
        }
        ks.f(this.f5858b).c(this.f5950k2, ks.I3);
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
        ks.f(this.f5858b).n(this.f5950k2, ks.I3);
        removeCallbacks(this.f5959l2);
        SensorManager sensorManager = this.O6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.P6);
        }
        this.M6 = false;
        this.s9 = -1;
        Arrays.fill(this.f6096y9, 0L);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int top;
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = org.telegram.messenger.g0.f24112m;
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
        this.f6047u3 = Math.max(Math.max(0, i13 - top), (org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(9.0f)) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i15 = 0;
        while (true) {
            int top2 = view2.getTop() + i15;
            if (!(view2.getParent() instanceof View)) {
                this.f6057v3 = i5.c.d(20.0f, org.telegram.messenger.g0.L(22.0f), Math.max(0, org.telegram.messenger.g0.f24113n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i15 = top2 - view2.getScrollY();
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 > 0 && i10 > 0) {
            float L = org.telegram.messenger.g0.L(12.0f);
            int ceil = ((int) Math.ceil(i7 / L)) + 1;
            int ceil2 = ((int) Math.ceil(i10 / L)) + 1;
            Bitmap bitmap = this.A3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.A3.getHeight() != ceil2) {
                this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.B3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i7, i10, i11, i12);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r40) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f10, float f11, float f12) {
        int i7;
        float L;
        float nextFloat;
        float f13;
        float e10;
        int i10 = this.f5881d1;
        if (i10 >= 320) {
            return;
        }
        this.f5881d1 = i10 + 1;
        Random random = this.f5902f1;
        float nextFloat2 = random.nextFloat();
        if (nextFloat2 < 0.65f) {
            i7 = 0;
        } else if (nextFloat2 < 0.9f) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        byte[] bArr = this.f5860b1;
        bArr[i10] = (byte) i7;
        this.f5871c1[i10] = false;
        this.N0[i10] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(4.0f)) + f10;
        this.O0[i10] = f11;
        byte b10 = bArr[i10];
        if (b10 == 0) {
            L = org.telegram.messenger.g0.L(1.4f);
            nextFloat = random.nextFloat();
            f13 = 1.6f;
        } else if (b10 == 1) {
            e10 = org.telegram.ui.Cells.c0.e(0.7f, random.nextFloat(), org.telegram.messenger.g0.N(0.7f));
            this.T0[i10] = e10;
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
        e10 = (nextFloat * org.telegram.messenger.g0.L(f13)) + L;
        this.T0[i10] = e10;
        this.P0[i10] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
        this.Q0[i10] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
        this.R0[i10] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
        this.S0[i10] = 0.0f;
        this.U0[i10] = random.nextFloat() * 90.0f;
        this.V0[i10] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final mh0 p1() {
        if (this.f5857a9 == null) {
            mh0 mh0Var = new mh0(2131623990, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.f5857a9 = mh0Var;
            mh0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.f5857a9.K(0);
            this.f5857a9.R(this);
            this.f5857a9.J(true);
        }
        return this.f5857a9;
    }

    public final void q(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z10, boolean z11) {
        float f18;
        int i7 = this.f5881d1;
        if (i7 >= 320) {
            return;
        }
        this.f5881d1 = i7 + 1;
        this.f5860b1[i7] = z10 ? (byte) 1 : (byte) 0;
        this.f5871c1[i7] = true;
        this.N0[i7] = f10;
        this.O0[i7] = f11;
        this.P0[i7] = f12;
        this.Q0[i7] = f13;
        this.W0[i7] = f10;
        this.X0[i7] = f11;
        this.Y0[i7] = f14;
        Random random = this.f5902f1;
        if (z11) {
            f18 = org.telegram.ui.Cells.c0.h(random, 3.0f, 4.0f);
        } else {
            f18 = 0.0f;
        }
        this.Z0[i7] = f18;
        this.f5849a1[i7] = random.nextFloat() * 6.2832f;
        this.T0[i7] = f15;
        this.R0[i7] = f16;
        this.S0[i7] = 0.0f;
        this.U0[i7] = f17;
        this.V0[i7] = 0.0f;
    }

    public final mh0 q1() {
        if (this.f5868b9 == null) {
            mh0 mh0Var = new mh0(2131624056, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.f5868b9 = mh0Var;
            mh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.f5868b9.K(0);
            this.f5868b9.R(this);
            this.f5868b9.J(true);
        }
        return this.f5868b9;
    }

    public final mh0 r1() {
        if (this.Z8 == null) {
            mh0 mh0Var = new mh0(2131624217, org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
            this.Z8 = mh0Var;
            mh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final boolean s0(String str) {
        if (str != null && str.equals(this.f6056v2)) {
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
        TextPaint textPaint2 = this.f6099z2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.f6089y2) + textPaint2.measureText(this.f6078x2) + textPaint.measureText(this.f6067w2);
    }

    public void setFeeStars(long j3) {
        boolean z10;
        String str;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L0 = z10;
        String str2 = "";
        if (i7 <= 0) {
            str = "";
        } else {
            str = gd.a0(null, null, 2131746286, gd.E(j3, ','));
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
        if (!this.L0 && this.f6065w0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.f5889e, str)) {
            return;
        }
        this.f5889e = str;
        if (str == null) {
            this.f6054v0 = null;
            return;
        }
        Utilities.f22779e.c(new ai.h0(str, new q0(this, str, 1)));
    }

    public void setGiftsOwner(long j3) {
        if (this.f6077x1 == j3) {
            return;
        }
        this.f6077x1 = j3;
        o8 o8Var = this.f5941j2;
        if (o8Var != null) {
            o8Var.f();
        }
        o8 o8Var2 = new o8(this.f5858b, j3, false);
        this.f5941j2 = o8Var2;
        o8Var2.f9463g = 776;
        o8Var2.f9461e = true;
        o8Var2.k(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z10) {
        this.f5850a2 = z10;
    }

    public void setInstantTheme(boolean z10) {
        this.f5913g2 = z10;
    }

    public void setLinkExpires(long j3) {
        long j10 = this.H2;
        if (j10 == j3) {
            return;
        }
        if (j10 != 0 && j3 != 0) {
            i0();
        }
        this.H2 = j3;
        this.O2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.f5892e2 = runnable;
    }

    public void setReveal(float f10) {
        float f11;
        boolean z10;
        float f12;
        int i7;
        float sin;
        this.R4 = f10;
        float f13 = 1.0f;
        if (this.U4) {
            double d = f10 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f10 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d2 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d2) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l10 = Utilities.l((f10 - 0.85f) / 0.15f);
            f11 = e2.z(1.0f, sin, e2.C(l10, 2.0f, 3.0f, l10 * l10), sin);
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
                i7 = a(f11, 1073741824);
            } else {
                i7 = 0;
            }
            view.setBackgroundColor(i7);
        }
        float f15 = -1.0f;
        if (!z10) {
            this.f6008q3 = -1.0f;
        }
        if (z10 && this.U4) {
            f15 = Utilities.l(f11);
        }
        this.f6035t0.D = f15;
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
        if (this.f5973m7 != z10) {
            this.f5973m7 = z10;
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
        if (this.f5847a != z10) {
            this.f5847a = z10;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z10) {
        this.f6097z0 = z10;
    }

    public final int t0() {
        int i7;
        int i10 = this.f6103z6;
        SparseIntArray sparseIntArray = this.f6093y6;
        if (i10 != 1) {
            sparseIntArray.clear();
            this.f6103z6 = 1;
        }
        x0 x0Var = this.f5976n;
        if (x0Var != null) {
            i7 = x0Var.f5834b;
        } else {
            i7 = 0;
        }
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.f5976n);
        sparseIntArray.put(i7, u10);
        return u10;
    }

    public final void u1(boolean z10) {
        long max;
        String sb2;
        if (this.f6065w0) {
            if (!this.f6076x0) {
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131746295, sb3, " · ");
                sb2 = i5.c.k(2131746288, null, sb3);
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
                    org.telegram.ui.Cells.c0.u(null, 2131746295, sb4, " · ");
                    sb4.append(gd.a0(null, null, 2131746296, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
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
        mh0 mh0Var;
        if ((drawable instanceof RippleDrawable) || drawable == this.M0 || drawable == this.Y1 || (((mh0Var = this.f5974m8) != null && drawable == mh0Var) || super.verifyDrawable(drawable))) {
            return true;
        }
        return false;
    }

    public final Drawable w(int i7) {
        return getContext().getResources().getDrawable(i7).mutate();
    }

    public final float x1(float f10, float f11, int i7, int i10) {
        float f12 = this.f6075x;
        double max = Math.max(f12, i7 - f12);
        float f13 = this.f6086y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f10 - this.f6075x, f11 - this.f6086y)) / (((float) Math.hypot(max, Math.max(f13, i10 - f13))) + org.telegram.messenger.g0.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f10 = this.f5914g3;
        float f11 = (-f10) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f10;
        float height = (bitmap.getHeight() - 0.5f) * f10;
        RectF rectF = this.f5904f3;
        rectF.set(f11, f11, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f5873c3);
    }

    public final void y0() {
        long j3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i7;
        o8 o8Var = this.f5941j2;
        if (o8Var == null) {
            return;
        }
        w0 w0Var = this.G;
        int i10 = w0Var.f5808a;
        ArrayList arrayList = this.f6066w1;
        if (i10 == 2 && (i7 = w0Var.f5822q) >= 0 && i7 < arrayList.size()) {
            j3 = ((TL_stars.TL_starGiftUnique) arrayList.get(this.G.f5822q)).f28632id;
        } else {
            j3 = 0;
        }
        if (j3 != 0) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(this.G.f5822q);
        } else {
            tL_starGiftUnique = null;
        }
        arrayList.clear();
        HashMap hashMap = this.f6098z1;
        hashMap.clear();
        ArrayList arrayList2 = o8Var.f9467l;
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
                    hashMap.put(Long.valueOf(savedStarGift.gift.f28632id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    if (((TL_stars.TL_starGiftUnique) arrayList.get(i13)).f28632id == j3) {
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
            this.G.f5822q = i11;
            this.M7 = i11;
        }
        boolean z10 = o8Var.f9465j;
        this.f6088y1 = z10;
        if (!z10 && !o8Var.f9464i) {
            o8Var.a();
        }
        if (!arrayList.isEmpty() && !this.f5968m2) {
            this.f5968m2 = true;
            s0 s0Var = this.f5959l2;
            removeCallbacks(s0Var);
            postDelayed(s0Var, 900L);
        }
        invalidate();
    }

    public final void z(android.graphics.Canvas r45, int r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z0.z(android.graphics.Canvas, int, int):void");
    }

    public final float z0() {
        float f10;
        int f02;
        int L;
        int L2;
        float f11;
        float B = n10.B(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f);
        int i7 = this.f5931i1;
        if (i7 == 0) {
            f10 = B / 6.0f;
            f02 = (a.f5536b.length + 5) / 6;
            L = org.telegram.messenger.g0.L(4.0f) - org.telegram.messenger.g0.L(32.0f);
            L2 = org.telegram.messenger.g0.L(4.0f);
        } else {
            if (i7 == 1) {
                f10 = B / 6.0f;
                f11 = 0.0f;
            } else if (h0()) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = B / 3.0f;
                f02 = ((f0() + this.f6066w1.size()) - 1) / f0();
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
