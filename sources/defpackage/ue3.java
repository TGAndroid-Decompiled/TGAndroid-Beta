package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public class ue3 extends hf0 implements m2b, tjb {
    public boolean A0;
    public boolean A1;
    public StaticLayout A2;
    public boolean A3;
    public boolean A4;
    public boolean B0;
    public boolean B1;
    public boolean B2;
    public boolean B3;
    public ValueAnimator B4;
    public boolean C0;
    public float C1;
    public float C2;
    public boolean C3;
    public long C4;
    public float D0;
    public float D1;
    public boolean D2;
    public int D3;
    public int D4;
    public boolean E;
    public sk0 E0;
    public float E1;
    public boolean E2;
    public int E3;
    public final cj3 E4;
    public boolean F;
    public boolean F0;
    public boolean F1;
    public Paint F2;
    public int F3;
    public StaticLayout F4;
    public boolean G;
    public final int G0;
    public final n41 G1;
    public Paint G2;
    public float G3;
    public int G4;
    public vaa H;
    public pe3 H0;
    public final Paint H1;
    public boolean H2;
    public boolean H3;
    public int H4;
    public byte I;
    public long I0;
    public final RectF I1;
    public int I2;
    public boolean I3;
    public int I4;
    public byte J;
    public String J0;
    public tgb J1;
    public int J2;
    public int J3;
    public final re3 J4;
    public byte K;
    public int K0;
    public boolean K1;
    public int K2;
    public LayerDrawable K3;
    public final wjb K4;
    public byte L;
    public long L0;
    public hj3 L1;
    public int L2;
    public int L3;
    public int L4;
    public final byte M;
    public String M0;
    public boolean M1;
    public int M2;
    public boolean M3;
    public byte M4;
    public final byte N;
    public int N0;
    public int N1;
    public int N2;
    public int N3;
    public int N4;
    public TLRPC.TL_forumTopic O;
    public boolean O0;
    public int O1;
    public StaticLayout O2;
    public int O3;
    public te3 O4;
    public boolean P;
    public boolean P0;
    public String P1;
    public int P2;
    public int P3;
    public GradientDrawable P4;
    public boolean Q;
    public boolean Q0;
    public int Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public boolean R0;
    public oy8 R1;
    public boolean R2;
    public int R3;
    public int R4;
    public boolean S;
    public int S0;
    public int S1;
    public boolean S2;
    public boolean S3;
    public Paint S4;
    public Paint T;
    public int T0;
    public boolean T1;
    public boolean T2;
    public final fm0 T3;
    public mh8 T4;
    public Paint U;
    public boolean U0;
    public Paint U1;
    public int U2;
    public ValueAnimator U3;
    public Drawable U4;
    public float V;
    public int V0;
    public final boolean[] V1;
    public int V2;
    public ValueAnimator V3;
    public int V4;
    public boolean W;
    public int W0;
    public final ImageReceiver[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public int X0;
    public final boolean[] X1;
    public int X2;
    public float X3;
    public Drawable X4;
    public boolean Y0;
    public final boolean[] Y1;
    public int Y2;
    public StaticLayout Y3;
    public ColorFilter[] Y4;
    public int Z0;
    public final ImageReceiver Z1;
    public int Z2;
    public StaticLayout Z3;
    public int[] Z4;
    public boolean a0;
    public boolean a1;
    public p48 a2;
    public int a3;
    public StaticLayout a4;
    public Runnable a5;
    public TextPaint b0;
    public boolean b1;
    public final pb0 b2;
    public int b3;
    public StaticLayout b4;
    public Paint c0;
    public boolean c1;
    public boolean c2;
    public int c3;
    public boolean c4;
    public ra1 d0;
    public float d1;
    public float d2;
    public int d3;
    public boolean d4;
    public qe3 e0;
    public boolean e1;
    public final oe3 e2;
    public int e3;
    public boolean e4;
    public boolean f;
    public boolean f0;
    public boolean f1;
    public vu8 f2;
    public StaticLayout f3;
    public int f4;
    public boolean g0;
    public k27 g1;
    public TLRPC.User g2;
    public StaticLayout g3;
    public int g4;
    public final boolean h;
    public boolean h0;
    public ArrayList h1;
    public TLRPC.Chat h2;
    public int h3;
    public int h4;
    public Drawable[] i0;
    public boolean i1;
    public TLRPC.EncryptedChat i2;
    public StaticLayout i3;
    public int i4;
    public float j0;
    public CharSequence j1;
    public CharSequence j2;
    public final Stack j3;
    public StaticLayout j4;
    public boolean k0;
    public int k1;
    public int k2;
    public final ArrayList k3;
    public boolean k4;
    public boolean l0;
    public int l1;
    public boolean l2;
    public final Stack l3;
    public boolean l4;
    public int m0;
    public int m1;
    public TLRPC.DraftMessage m2;
    public final ArrayList m3;
    public boolean m4;
    public float n;
    public float n0;
    public boolean n1;
    public final lm n2;
    public cm n3;
    public final sb n4;
    public rob o0;
    public boolean o1;
    public boolean o2;
    public cm o3;
    public final tl o4;
    public Paint p0;
    public float p1;
    public final lm p2;
    public cm p3;
    public final tl p4;
    public Paint q0;
    public float q1;
    public long q2;
    public cm q3;
    public byte q4;
    public boolean r;
    public boolean r0;
    public float r1;
    public ya r2;
    public int r3;
    public boolean r4;
    public oy8 s;
    public boolean s0;
    public float s1;
    public final boolean s2;
    public int s3;
    public final RectF s4;
    public boolean t0;
    public int t1;
    public boolean t2;
    public StaticLayout t3;
    public lj3 t4;
    public wtc u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public Path u4;
    public final me3 v0;
    public int v1;
    public boolean v2;
    public int v3;
    public RectF v4;
    public int w;
    public Path w0;
    public int w1;
    public boolean w2;
    public int w3;
    public int w4;
    public boolean x;
    public qla x0;
    public float x1;
    public boolean x2;
    public boolean x3;
    public int x4;
    public boolean y;
    public boolean y0;
    public boolean y1;
    public int y2;
    public float y3;
    public int y4;
    public boolean z0;
    public oy8 z1;
    public int z2;
    public boolean z3;
    public float z4;

    public ue3(cj3 cj3Var, Context context, boolean z, int i, wjb wjbVar) {
        super(context);
        this.h = true;
        this.y = true;
        int i2 = 0;
        this.E = false;
        this.I = (byte) 11;
        this.J = (byte) 72;
        this.K = (byte) 70;
        this.L = (byte) 76;
        this.M = (byte) 3;
        this.N = (byte) 11;
        this.V = 42.0f;
        me3 me3Var = new me3(this);
        this.v0 = me3Var;
        this.A0 = true;
        this.D0 = 0.0f;
        this.e1 = false;
        this.f1 = false;
        this.G1 = new n41(this);
        this.H1 = new Paint(1);
        this.I1 = new RectF();
        this.M1 = false;
        this.V1 = new boolean[3];
        this.W1 = new ImageReceiver[3];
        this.X1 = new boolean[3];
        this.Y1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Z1 = imageReceiver;
        this.b2 = new pb0((wjb) null);
        this.e2 = new oe3((byte) 0);
        s33 s33Var = s33.h;
        this.n2 = new lm(this, 0L, 350L, s33Var);
        this.p2 = new lm(this, 0L, 350L, s33Var);
        this.j3 = new Stack();
        this.k3 = new ArrayList();
        this.l3 = new Stack();
        this.m3 = new ArrayList();
        this.M3 = true;
        this.T3 = new fm0(320L, this, s33Var);
        this.W3 = 1.0f;
        this.X3 = 1.0f;
        this.s4 = new RectF();
        this.y4 = -1;
        this.I4 = -1;
        this.J4 = new re3(this);
        me3Var.I = true;
        this.K4 = wjbVar;
        this.E4 = cj3Var;
        bkb.S(context);
        this.E = false;
        this.F = false;
        imageReceiver.q0(gl.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i2 < imageReceiverArr.length) {
                imageReceiverArr[i2] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.W1[i2];
                imageReceiver2.y = true;
                imageReceiver2.q0(gl.L(2.0f));
                this.W1[i2].A1 = true;
                i2++;
            } else {
                this.s2 = z;
                this.G0 = i;
                sb sbVar = new sb((byte) 10, context, this);
                this.n4 = sbVar;
                addView(sbVar);
                this.o4 = new tl(gl.L(22.0f), sbVar);
                this.p4 = new tl(gl.L(17.0f), this);
                this.Z1.A1 = true;
                return;
            }
        }
    }

    public static SpannableStringBuilder R(int i, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return spannableStringBuilder;
                    }
                    spannableStringBuilder.append(charSequence);
                    return spannableStringBuilder;
                }
                spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
        return spannableStringBuilder;
    }

    private k27 getCaptionMessage() {
        CharSequence charSequence;
        if (this.h1 == null) {
            k27 k27Var = this.g1;
            if (k27Var == null || k27Var.z == null) {
                return null;
            }
            return k27Var;
        }
        int i = 0;
        k27 k27Var2 = null;
        for (int i2 = 0; i2 < this.h1.size(); i2++) {
            k27 k27Var3 = (k27) this.h1.get(i2);
            if (k27Var3 != null && (charSequence = k27Var3.z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i++;
                }
                k27Var2 = k27Var3;
            }
        }
        if (i > 1) {
            return null;
        }
        return k27Var2;
    }

    private int getCollapsedHeight() {
        byte b;
        byte b2;
        boolean z = this.s2;
        if (!z && !gba.l1) {
            b = this.K;
        } else {
            b = this.L;
        }
        int L = gl.L(b) + 1;
        if (this.R) {
            L += gl.L(20.0f);
        }
        if (V() && ((!z && !gba.l1) || Z())) {
            if (Z()) {
                b2 = this.N;
            } else {
                b2 = this.M;
            }
            return gl.L(b2) + L;
        }
        return L;
    }

    private Paint getPaintReorderGradient() {
        int v0 = bkb.v0(bkb.c6, this.K4);
        if (this.R4 != v0 || this.S4 == null) {
            this.R4 = v0;
            if (this.S4 == null) {
                this.S4 = new Paint(1);
            }
            this.S4.setShader(new LinearGradient(0.0f, 0.0f, gl.L(24.0f), 0.0f, new int[]{0, v0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.S4;
    }

    private TextPaint getTimeTextPaint() {
        if (this.H3) {
            if (W()) {
                return bkb.I0;
            }
            return bkb.J0;
        }
        return bkb.H0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.O;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    public final void A() {
        TLRPC.Message message;
        k27 k27Var = this.g1;
        if (k27Var != null && (message = k27Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.Y0) {
                je2 e = je2.e(this.G0);
                long j = this.I0;
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                e.q(j, elb.c(chatTheme), chatTheme, false);
            }
        }
    }

    public final void D() {
        boolean z;
        float f;
        TLRPC.Chat chat = this.h2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z = true;
        } else {
            z = false;
        }
        this.w2 = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.r1 = f;
    }

    public final void G() {
        float f;
        TLRPC.User V1;
        if (this.g2 != null && (V1 = na7.q1(this.G0).V1(Long.valueOf(this.g2.id))) != null) {
            this.g2 = V1;
        }
        if (a0()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.q1 = f;
    }

    public final void H() {
        boolean z;
        float f;
        ya yaVar;
        if (this.m0 > 0 && !this.w2 && !a0() && (((yaVar = this.r2) == null || !yaVar.a.q) && !this.v0.w)) {
            z = true;
        } else {
            z = false;
        }
        this.x2 = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.n0 = f;
    }

    public final int I() {
        float f;
        if (Z() && !this.k0 && !this.f) {
            if (!this.s2 && !gba.l1) {
                f = 91.0f;
            } else {
                f = 86.0f;
            }
            int L = gl.L(f);
            if (this.t2) {
                L++;
            }
            if (V()) {
                return gl.L(this.N) + L;
            }
            return L;
        }
        return getCollapsedHeight();
    }

    public final void J(int i, int i2) {
        this.z4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B4 = ofFloat;
        ofFloat.setDuration(220L);
        this.B4.setInterpolator(s33.f);
        this.x4 = i;
        this.w4 = i2;
        this.B4.addUpdateListener(new ke3(this, (byte) 2));
        this.B4.addListener(new ne3(this, (byte) 2));
        this.A4 = true;
        this.B4.start();
    }

    public final boolean K(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.K(android.graphics.Canvas):boolean");
    }

    public final void L(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i != 0 || z4) {
            float f2 = (f * 0.5f) + 0.5f;
            if (z) {
                hf0.t(this.W2, this.X2, bkb.W0);
                int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i2 != 0) {
                    canvas.save();
                    canvas.scale(f2, f2, bkb.W0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                    bkb.W0.setAlpha((int) (f * 255.0f));
                }
                bkb.W0.draw(canvas);
                if (i2 != 0) {
                    canvas.restore();
                    bkb.W0.setAlpha(255);
                }
                invalidate();
            } else if (z3) {
                if (z2) {
                    hf0.t(this.Y2, this.X2, bkb.V0);
                    if (z4) {
                        canvas.save();
                        canvas.scale(f2, f2, bkb.V0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                        bkb.V0.setAlpha((int) (255.0f * f));
                    } else if (i != 0) {
                        canvas.save();
                        canvas.scale(f2, f2, bkb.V0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                        int i3 = (int) (255.0f * f);
                        bkb.V0.setAlpha(i3);
                        bkb.U0.setAlpha(i3);
                    }
                    bkb.V0.draw(canvas);
                    if (z4) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f) * gl.L(4.0f), 0.0f);
                    }
                    hf0.t(this.U2, this.X2, bkb.U0);
                    bkb.U0.draw(canvas);
                    if (z4) {
                        canvas.restore();
                        bkb.V0.setAlpha(255);
                        return;
                    } else if (i != 0) {
                        canvas.restore();
                        bkb.V0.setAlpha(255);
                        bkb.U0.setAlpha(255);
                        return;
                    } else {
                        return;
                    }
                }
                hf0.t(this.V2, this.X2, bkb.S0);
                int i4 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i4 != 0) {
                    canvas.save();
                    canvas.scale(f2, f2, bkb.S0.getBounds().centerX(), bkb.V0.getBounds().centerY());
                    bkb.S0.setAlpha((int) (f * 255.0f));
                }
                bkb.S0.draw(canvas);
                if (i4 != 0) {
                    canvas.restore();
                    bkb.S0.setAlpha(255);
                }
            }
        }
    }

    public final void M(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        boolean z3;
        float f2;
        float f3;
        Paint paint;
        boolean z4;
        RectF rectF;
        float f4;
        float interpolation;
        int i4;
        int L;
        int i5;
        RectF rectF2;
        int i6;
        int i7;
        int w0;
        if (!Z() && !Y()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((this.H3 && this.M3) || this.W3 != 1.0f) {
            if (this.T0 == 0 && !this.U0) {
                f2 = 1.0f - this.W3;
            } else {
                f2 = this.W3;
            }
            int i8 = 255;
            if (z2) {
                if (this.U == null) {
                    Paint paint2 = new Paint();
                    this.U = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.U.setStrokeWidth(gl.L(2.0f));
                    this.U.setStrokeJoin(Paint.Join.ROUND);
                    this.U.setStrokeCap(Paint.Cap.ROUND);
                }
                f3 = 1.0f;
                this.U.setColor(bm2.f(Color.alpha(w0) / 255.0f, bkb.w0(null, bkb.c6, false), bm2.o(bkb.w0(null, bkb.r9, false), 255)));
            } else {
                f3 = 1.0f;
            }
            if (this.Q && this.O.read_inbox_max_id == 0) {
                paint = this.T;
                if (paint == null) {
                    paint = new Paint();
                    this.T = paint;
                }
                if (z) {
                    i6 = bkb.Uk;
                } else {
                    i6 = bkb.Tk;
                }
                int v0 = bkb.v0(i6, this.K4);
                paint.setColor(v0);
                bkb.L0.setColor(v0);
                if (z) {
                    i7 = 30;
                } else {
                    i7 = 40;
                }
                i8 = i7;
                z4 = true;
            } else {
                if (!z && this.K0 == 0) {
                    paint = bkb.v0;
                } else {
                    paint = bkb.x0;
                }
                z4 = false;
            }
            StaticLayout staticLayout = this.Z3;
            RectF rectF3 = this.s4;
            if (staticLayout != null && this.T0 != 0) {
                paint.setAlpha((int) ((f3 - this.y3) * i8));
                bkb.L0.setAlpha((int) ((f3 - this.y3) * 255.0f));
                float f5 = f2 * 2.0f;
                if (f5 > f3) {
                    f4 = f3;
                } else {
                    f4 = f5;
                }
                float f6 = f3 - f4;
                float f7 = (i3 * f6) + (i2 * f4);
                float f8 = i;
                rectF3.set(f7, f8, (this.Q3 * f6) + (this.P3 * f4) + f7 + gl.L(12.666f), gl.L(20.666f) + i);
                if (f2 <= 0.5f) {
                    interpolation = s33.g.getInterpolation(f5);
                } else {
                    interpolation = s33.i.getInterpolation(f3 - ((f2 - 0.5f) * 2.0f));
                }
                float f9 = (interpolation * 0.1f) + f3;
                canvas.save();
                float f10 = f9 * f;
                canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                if (z3) {
                    if (this.u4 == null || (rectF2 = this.v4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.v4;
                        if (rectF4 == null) {
                            this.v4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        Path path = this.u4;
                        if (path == null) {
                            path = new Path();
                            this.u4 = path;
                        }
                        dpd.a(path, this.v4, gl.L(10.33f));
                    }
                    canvas.drawPath(this.u4, paint);
                    if (z2) {
                        canvas.drawPath(this.u4, this.U);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), paint);
                    if (z2) {
                        canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), this.U);
                    }
                }
                if (this.a4 != null) {
                    canvas.save();
                    canvas.translate(gl.N(6.333f) + f7, gl.N(3.0f) + f8);
                    this.a4.draw(canvas);
                    canvas.restore();
                }
                int alpha = bkb.L0.getAlpha();
                float f11 = alpha;
                bkb.L0.setAlpha((int) (f11 * f4));
                if (this.b4 != null) {
                    canvas.save();
                    float N = gl.N(6.333f) + f7;
                    if (this.S3) {
                        i5 = gl.L(17.0f);
                    } else {
                        i5 = -gl.L(17.0f);
                    }
                    canvas.translate(N, gl.N(3.0f) + (i5 * f6) + f8);
                    this.b4.draw(canvas);
                    canvas.restore();
                } else if (this.Y3 != null) {
                    canvas.save();
                    float N2 = gl.N(6.333f) + f7;
                    if (this.S3) {
                        i4 = gl.L(17.0f);
                    } else {
                        i4 = -gl.L(17.0f);
                    }
                    canvas.translate(N2, gl.N(3.0f) + (i4 * f6) + f8);
                    this.Y3.draw(canvas);
                    canvas.restore();
                }
                if (this.Z3 != null) {
                    bkb.L0.setAlpha((int) (f11 * f6));
                    canvas.save();
                    float N3 = gl.N(6.333f) + f7;
                    if (this.S3) {
                        L = -gl.L(17.0f);
                    } else {
                        L = gl.L(17.0f);
                    }
                    canvas.translate(N3, gl.N(3.0f) + (L * f4) + f8);
                    this.Z3.draw(canvas);
                    canvas.restore();
                }
                bkb.L0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.T0 != 0) {
                    staticLayout = this.Y3;
                }
                paint.setAlpha((int) ((f3 - this.y3) * i8));
                bkb.L0.setAlpha((int) ((f3 - this.y3) * 255.0f));
                float f12 = i;
                rectF3.set(i2, f12, gl.L(12.666f) + this.P3 + i2, gl.L(20.666f) + i);
                int save = canvas.save();
                if (f != f3) {
                    canvas.scale(f, f, rectF3.centerX(), rectF3.centerY());
                }
                if (f2 != f3) {
                    canvas.scale(f2, f2, rectF3.centerX(), rectF3.centerY());
                }
                if (z3) {
                    if (this.u4 == null || (rectF = this.v4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.v4;
                        if (rectF5 == null) {
                            this.v4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        Path path2 = this.u4;
                        if (path2 == null) {
                            path2 = new Path();
                            this.u4 = path2;
                        }
                        dpd.a(path2, this.v4, gl.L(10.33f));
                    }
                    canvas.drawPath(this.u4, paint);
                    if (z2) {
                        canvas.drawPath(this.u4, this.U);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), paint);
                    if (z2) {
                        canvas.drawRoundRect(rectF3, gl.L(11.5f), gl.L(11.5f), this.U);
                    }
                }
                if (staticLayout != null) {
                    canvas.save();
                    canvas.translate(gl.L(6.333f) + i2, gl.N(3.0f) + f12);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.restoreToCount(save);
            }
            if (z4) {
                bkb.L0.setColor(bkb.w0(null, bkb.V8, false));
            }
        }
    }

    public boolean O() {
        return false;
    }

    public final java.lang.CharSequence P() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.P():java.lang.CharSequence");
    }

    public final java.lang.CharSequence Q() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.Q():java.lang.CharSequence");
    }

    public final CharSequence S() {
        te3 te3Var = this.O4;
        if (te3Var == null) {
            te3Var = new te3(this);
            this.O4 = te3Var;
        }
        te3Var.a(this.G0, this.g1, this.h2);
        this.O4.getClass();
        te3 te3Var2 = this.O4;
        this.N4 = te3Var2.c;
        this.g0 = te3Var2.d;
        return te3Var2.g;
    }

    public final ColorFilter T(int i, int i2) {
        ColorFilter[] colorFilterArr = this.Y4;
        if (colorFilterArr == null) {
            this.Z4 = new int[4];
            colorFilterArr = new ColorFilter[4];
            this.Y4 = colorFilterArr;
        }
        if (i2 != this.Z4[i] || colorFilterArr[i] == null) {
            this.Z4[i] = i2;
            colorFilterArr[i] = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        return this.Y4[i];
    }

    public final SpannableStringBuilder U(int i, CharSequence charSequence, String str, boolean z) {
        CharSequence charSequence2;
        CharSequence J2;
        TLRPC.Message message;
        CharSequence charSequence3;
        int size;
        String G;
        int size2;
        String M0;
        boolean z2;
        CharSequence charSequence4;
        String str2;
        SpannableStringBuilder valueOf;
        k27 captionMessage = getCaptionMessage();
        k27 k27Var = this.g1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (k27Var != null) {
            charSequence2 = k27Var.v;
        } else {
            charSequence2 = null;
        }
        this.f0 = true;
        if (!TextUtils.isEmpty(str)) {
            return R(i, str, charSequence);
        }
        k27 k27Var2 = this.g1;
        TLRPC.Message message2 = k27Var2.k;
        int i2 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = k27Var2.w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                charSequence5 = k27Var2.v;
            }
            if (k27.D4(k27Var2)) {
                valueOf = R(i, charSequence5, charSequence);
                if (this.g1.i2[0] instanceof jm4) {
                    int i3 = this.G0;
                    TLRPC.TL_forumTopic f = na7.q1(i3).g4.f(-k27.B0(this.g1.k), k27.b2(i3, this.g1.k, true, false));
                    if (f != null) {
                        ((jm4) this.g1.i2[0]).b(f.icon_color);
                    }
                }
            } else {
                this.f0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z) {
                y(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.z) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.W) {
                str2 = "";
            } else if (k27.K4(captionMessage.k)) {
                str2 = "📹 ";
            } else if (k27.Q4(captionMessage.k)) {
                str2 = "🎤 ";
            } else if (captionMessage.I3()) {
                str2 = "🎧 ";
            } else if (k27.R3(captionMessage.k)) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
            }
            if (captionMessage.r2() && !TextUtils.isEmpty(captionMessage.k.message)) {
                CharSequence charSequence7 = captionMessage.c2;
                int measuredWidth = getMeasuredWidth() - gl.L(this.J + 47);
                if (this.a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.b0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.b0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.b2) {
                    charSequence7 = gl.Q(charSequence7, (String) captionMessage.a2.get(0), measuredWidth, this.b0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.T5();
            hq6.h(captionMessage.k.entities, charSequence8, spannableString, 264);
            TLRPC.Message message3 = captionMessage.k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.b0;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                hq6.a(fontMetricsInt, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(gl.J2(spannableString));
            if (z) {
                append = y(append);
            }
            return R(i, append, charSequence);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            wjb wjbVar = this.K4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z2 = k27.O2(this.g1.k.rich_message.blocks.get(0));
                } else {
                    z2 = false;
                }
                SpannableStringBuilder R = R(i, this.g1.v, charSequence);
                if (z2 && !Z()) {
                    try {
                        cm4 cm4Var = new cm4(bkb.o9, wjbVar);
                        if (this.a0) {
                            i2 = charSequence.length() + 2;
                        }
                        R.setSpan(cm4Var, i2, R.length(), 33);
                        return R;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                return R;
            } else if (message2.media != null && !k27Var2.F3()) {
                this.b0 = bkb.G0[this.F0 ? 1 : 0];
                int i4 = bkb.n9;
                k27 k27Var3 = this.g1;
                TLRPC.MessageMedia messageMedia = k27Var3.k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        hq6.h(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2, -1);
                        hq6.a(bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                        charSequence3 = bf3.a(2131231055, spannableString2, true);
                    } else {
                        charSequence3 = bf3.a(2131231055, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        hq6.h(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3, -1);
                        hq6.a(bkb.E0[this.F0 ? 1 : 0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                        charSequence3 = bf3.a(2131231049, spannableString3, true);
                    } else {
                        charSequence3 = bf3.a(2131231049, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = bf3.a(2131231050, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (k27Var3.D == 14) {
                    charSequence3 = b00.i("🎧 \u2068", k27Var3.w1(true), " - ", this.g1.y1(true), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.T1) {
                        if (size3 > 1) {
                            M0 = k96.G(size3, "Media", new Object[0]);
                        } else {
                            M0 = k96.M0(2131753930, null);
                        }
                    } else if (size3 > 1) {
                        M0 = k96.G(size3, "Photos", new Object[0]);
                    } else {
                        M0 = k96.M0(2131753945, null);
                    }
                    charSequence3 = jva.S0(k96.a0(null, null, 2131753946, M0));
                    i4 = bkb.o9;
                } else if (this.S1 > 1) {
                    boolean z3 = this.T1;
                    ArrayList arrayList2 = this.h1;
                    if (z3) {
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        G = k96.G(size2, "Media", new Object[0]);
                    } else {
                        if (arrayList2 == null) {
                            size = 0;
                        } else {
                            size = arrayList2.size();
                        }
                        G = k96.G(size, "Photos", new Object[0]);
                    }
                    charSequence3 = G;
                    i4 = bkb.o9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i4 = bkb.o9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z) {
                    charSequence3 = y(charSequence3);
                }
                SpannableStringBuilder R2 = R(i, charSequence3, charSequence);
                if (!Z()) {
                    try {
                        cm4 cm4Var2 = new cm4(i4, wjbVar);
                        if (this.a0) {
                            i2 = charSequence.length() + 2;
                        }
                        R2.setSpan(cm4Var2, i2, R2.length(), 33);
                        return R2;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                return R2;
            } else {
                k27 k27Var4 = this.g1;
                String str3 = k27Var4.k.message;
                if (str3 != null) {
                    if (k27Var4.r2()) {
                        CharSequence charSequence9 = this.g1.c2;
                        J2 = str3;
                        if (charSequence9 != null) {
                            J2 = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - gl.L(this.J + 33);
                        if (this.a0) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.b0.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            J2 = gl.Q(J2, (String) this.g1.a2.get(0), measuredWidth2, this.b0);
                        }
                    } else {
                        int length2 = str3.length();
                        CharSequence charSequence10 = str3;
                        if (length2 > 150) {
                            charSequence10 = str3.subSequence(0, 150);
                        }
                        J2 = gl.J2(charSequence10);
                    }
                    ?? spannableString4 = new SpannableString(J2);
                    k27 k27Var5 = this.g1;
                    if (k27Var5 != null) {
                        k27Var5.T5();
                    }
                    k27 k27Var6 = this.g1;
                    Pattern pattern = hq6.U1;
                    hq6.h(k27Var6.k.entities, k27Var6.v, spannableString4, 264);
                    k27 k27Var7 = this.g1;
                    if (k27Var7 != null && (message = k27Var7.k) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList3 = message.entities;
                        TextPaint textPaint2 = this.b0;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        hq6.a(fontMetricsInt, spannableString4, arrayList3);
                    }
                    if (z) {
                        spannableString4 = y(spannableString4);
                    }
                    return R(i, spannableString4, charSequence);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean V() {
        wtc wtcVar = this.u0;
        if (wtcVar != null && !((ArrayList) wtcVar.c).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if (hc2.Y(this.h2)) {
            return !this.f1;
        }
        if (this.Q) {
            return this.b1;
        }
        TLRPC.Chat chat = this.h2;
        if (chat != null && chat.forum && this.O == null) {
            if (!this.e1) {
                return true;
            }
            return false;
        }
        return this.a1;
    }

    public final boolean X() {
        if (this.K0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if (this.K0 != 0) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        TLRPC.Chat chat;
        if (!X() && !this.Q0 && (chat = this.h2) != null) {
            if (!chat.forum) {
                if (hc2.p0(chat)) {
                    if (!hc2.A(this.G0, this.h2, 24)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (!this.Q) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean a0() {
        TLRPC.User user;
        if (!Z() && !this.v0.w && (user = this.g2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i = this.G0;
            if (userStatus == null || userStatus.expires > 0 || !na7.q1(i).a0.containsKey(Long.valueOf(this.g2.id))) {
                TLRPC.UserStatus userStatus2 = this.g2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.X8));
        hashSet.add(Integer.valueOf(bkb.h9));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.n9));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.i9));
        hashSet.add(Integer.valueOf(bkb.o9));
        hashSet.add(Integer.valueOf(bkb.j9));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.c9));
        hashSet.add(Integer.valueOf(bkb.b9));
        hashSet.add(Integer.valueOf(bkb.X5));
        hashSet.add(Integer.valueOf(bkb.r9));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.m9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.k9));
        hashSet.add(Integer.valueOf(bkb.g9));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.Ii));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.T8));
        hashSet.add(Integer.valueOf(bkb.Bk));
        hashSet.add(Integer.valueOf(bkb.Ck));
        hashSet.add(Integer.valueOf(bkb.S8));
        hashSet.add(Integer.valueOf(bkb.Uk));
        hashSet.add(Integer.valueOf(bkb.Tk));
        hashSet.add(Integer.valueOf(bkb.V8));
    }

    public final boolean b0(float f) {
        if (!k96.a0) {
            if (f >= 0.0f && f < gl.L(60.0f)) {
                return true;
            }
            return false;
        } else if (f >= getMeasuredWidth() - gl.L(60.0f) && f < getMeasuredWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public final void c0(boolean z, boolean z2) {
        if ((!getIsPinned() && z) || this.z3 == z) {
            if (!getIsPinned()) {
                this.z3 = false;
                return;
            }
            return;
        }
        this.z3 = z;
        float f = 1.0f;
        if (z2) {
            if (z) {
                f = 0.0f;
            }
            this.y3 = f;
        } else {
            if (!z) {
                f = 0.0f;
            }
            this.y3 = f;
        }
        invalidate();
    }

    public final void d0() {
        float f;
        boolean z = gba.m1;
        this.n1 = z;
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.E1 = f;
        this.b2.o = f;
        this.u1 = 0.0f;
        this.y1 = false;
        if (!getIsPinned() || !this.z3) {
            f2 = 0.0f;
        }
        this.y3 = f2;
        this.x3 = true;
        this.p1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        tl tlVar = this.o4;
        if (tlVar != null && this.x3) {
            tlVar.a();
        }
        tl tlVar2 = this.p4;
        if (tlVar2 != null && this.x3) {
            tlVar2.a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.Q && !this.G && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.v0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(boolean z, boolean z2) {
        if (this.r2 == null) {
            if (!z) {
                return;
            }
            ya yaVar = new ya(this, getContext(), this.K4, (byte) 1);
            this.r2 = yaVar;
            yaVar.b(-1, bkb.c6, bkb.j7);
            this.r2.setDrawUnchecked(false);
            this.r2.setDrawBackgroundAsArc(3);
            addView(this.r2);
        }
        this.r2.a(z, z2);
        H();
    }

    public final void f0(long j, k27 k27Var, int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        if (this.I0 != j) {
            this.y4 = -1;
        }
        this.I0 = j;
        this.C4 = System.currentTimeMillis();
        this.g1 = k27Var;
        this.v2 = z;
        this.O0 = false;
        this.S0 = i;
        if (k27Var != null) {
            int i3 = k27Var.k.edit_date;
        }
        this.T0 = 0;
        this.U0 = false;
        if (k27Var != null) {
            i2 = k27Var.e1();
        } else {
            i2 = 0;
        }
        this.m1 = i2;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        if (k27Var != null && k27Var.E4()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Y0 = z3;
        k27 k27Var2 = this.g1;
        if (k27Var2 != null) {
            this.Z0 = k27Var2.k.send_state;
        }
        k0(0, z2);
    }

    public final void g0(TLRPC.Dialog dialog, int i, int i2) {
        boolean z;
        boolean z2;
        if (this.I0 != dialog.id) {
            ValueAnimator valueAnimator = this.B4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.B4.cancel();
            }
            this.A4 = false;
            this.y4 = -1;
        }
        this.I0 = dialog.id;
        this.C4 = System.currentTimeMillis();
        this.O0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.L0 = dialog.community_id;
        } else {
            this.L0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.K0 = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            vu8 vu8Var = this.f2;
            if (vu8Var != null) {
                vu8Var.H = this;
                vu8Var.h();
            }
        } else {
            this.K0 = 0;
        }
        this.k1 = i;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        Runnable runnable = this.a5;
        if (runnable != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (!z) {
                if (runnable != null) {
                    runnable.run();
                    this.a5 = null;
                }
            } else {
                this.a5 = kk7.f(this.G0).h(this, kk7.j3, new dyc(this, (byte) 1));
            }
        }
        if (this.u0 == null) {
            ?? obj = new Object();
            obj.b = new ArrayList();
            obj.c = new ArrayList();
            obj.d = null;
            obj.a = this;
            this.u0 = obj;
        }
        this.l1 = i2;
        this.m1 = 0;
        if (k0(0, false)) {
            requestLayout();
        }
        G();
        D();
        A();
        H();
    }

    public float getClipProgress() {
        return this.u1;
    }

    public int getCurrentDialogFolderId() {
        return this.K0;
    }

    public long getDialogId() {
        return this.I0;
    }

    public boolean getHasUnread() {
        if (this.T0 == 0 && !this.U0) {
            return false;
        }
        return true;
    }

    public boolean getIsMuted() {
        return this.a1;
    }

    public boolean getIsPinned() {
        if (!this.B3 && !this.C3) {
            return false;
        }
        return true;
    }

    public k27 getMessage() {
        return this.g1;
    }

    public int getMessageId() {
        return this.m1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.q2;
    }

    @Override
    public float getTranslationX() {
        return this.x1;
    }

    public final void h0(TLRPC.TL_forumTopic tL_forumTopic, long j, k27 k27Var, boolean z, boolean z2) {
        boolean z3;
        vu8 vu8Var;
        this.O = tL_forumTopic;
        if (tL_forumTopic != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.Q = z3;
        if (this.I0 != j) {
            this.y4 = -1;
        }
        Drawable drawable = k27Var.i2[0];
        if (drawable instanceof jm4) {
            ((jm4) drawable).b(tL_forumTopic.icon_color);
        }
        this.I0 = j;
        this.C4 = System.currentTimeMillis();
        this.g1 = k27Var;
        this.O0 = false;
        this.h0 = z;
        this.S0 = k27Var.k.date;
        this.U0 = false;
        this.m1 = k27Var.e1();
        this.Y0 = k27Var.E4();
        k27 k27Var2 = this.g1;
        if (k27Var2 != null) {
            this.Z0 = k27Var2.k.send_state;
        }
        if (!z2) {
            this.y4 = -1;
        }
        if (tL_forumTopic != null) {
            this.h1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (vu8Var = this.f2) != null) {
            vu8Var.H = this;
            vu8Var.h();
        }
        k0(0, z2);
    }

    public final void i0(int i, k27 k27Var) {
        boolean z;
        boolean z2;
        int i2;
        String str;
        float f;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = k27Var.p0;
        TLObject tLObject = k27Var.n0;
        if (k27Var.x4()) {
            TL_stories.StoryItem storyItem = k27Var.k.media.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    arrayList = document.thumbs;
                    tLObject = document;
                } else {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null) {
                        arrayList = photo.sizes;
                        tLObject = photo;
                    }
                }
            } else {
                return;
            }
        }
        TLRPC.PhotoSize Q = ba4.Q(arrayList);
        TLRPC.PhotoSize photoSize = null;
        if (Q == null) {
            Q = ba4.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w = ba4.w(arrayList, gl.Y0(false), false, null, true);
        if (Q != w) {
            photoSize = w;
        }
        if (photoSize == null || !up3.q(this.G0).d(k27Var)) {
            photoSize = Q;
        }
        if (Q != null) {
            if (!this.T1 && !k27.K4(k27Var.k) && !k27Var.g4()) {
                z = false;
            } else {
                z = true;
            }
            this.T1 = z;
            int i3 = this.S1;
            if (i3 < 3) {
                this.S1 = i3 + 1;
                if ((k27.K4(k27Var.k) || k27Var.g4()) && !k27Var.t2()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.X1[i] = z2;
                this.Y1[i] = k27Var.t2();
                if (k27Var.D == 1 && photoSize != null) {
                    i2 = photoSize.size;
                } else {
                    i2 = 0;
                }
                if (k27Var.t2()) {
                    str = "5_5_b";
                } else {
                    str = "20_20";
                }
                ImageReceiver[] imageReceiverArr = this.W1;
                imageReceiverArr[i].Z(gl5.f(photoSize, tLObject), str, gl5.f(Q, tLObject), str, null, i2, null, k27Var, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i];
                if (k27Var.g4()) {
                    f = 18.0f;
                } else {
                    f = 2.0f;
                }
                imageReceiver.q0(gl.L(f));
                this.W = false;
            }
        }
    }

    @Override
    public final void invalidate() {
        if (m8b.x1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.z1 && drawable != bkb.t1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    public final void j0() {
        vu8 vu8Var = this.f2;
        if (vu8Var != null) {
            if (this.Q) {
                vu8Var.K = gl.L(24.0f);
                this.f2.L = gl.L(24.0f);
                this.f2.M = 0.0f;
            } else {
                me3 me3Var = this.v0;
                RectF rectF = me3Var.F;
                RectF rectF2 = me3Var.F;
                vu8Var.K = rectF.centerY();
                this.f2.L = rectF2.centerX();
                this.f2.M = rectF2.width() / 2.0f;
                if (!na7.q1(this.G0).M1().h.isEmpty()) {
                    this.f2.M -= gl.N(3.5f);
                }
                vu8 vu8Var2 = this.f2;
                this.Z1.q();
                vu8Var2.getClass();
            }
            vu8 vu8Var3 = this.f2;
            if (!vu8Var3.E && vu8Var3.I != null) {
                AnimatorSet animatorSet = vu8Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    vu8Var3.B.cancel();
                }
                vu8Var3.E = true;
                vu8Var3.F = true;
                vu8Var3.D = 0.0f;
                vu8Var3.I.getTranslationY();
                Typeface typeface = gl.a;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new uu8(vu8Var3, (byte) 5));
                ofFloat.setInterpolator(s33.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new uu8(vu8Var3, (byte) 6));
                s33 s33Var = s33.j;
                ofFloat2.setInterpolator(s33Var);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new uu8(vu8Var3, (byte) 7));
                ofFloat3.setInterpolator(s33Var);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                vu8Var3.B = animatorSet2;
                animatorSet2.addListener(new l48(vu8Var3, (byte) 25));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                vu8Var3.B.playTogether(ofFloat, animatorSet3);
                vu8Var3.B.start();
            }
        }
    }

    public final boolean k0(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.k0(int, boolean):boolean");
    }

    public final void l0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.l0():void");
    }

    public final void m0(boolean z) {
        TL_account.RequirementToContact requirementToContact;
        boolean z2;
        if (this.a5 != null && this.g2 != null) {
            requirementToContact = na7.q1(this.G0).J2(this.g2.id);
        } else {
            requirementToContact = null;
        }
        boolean z3 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.o2 == z3 && this.q2 == cf3.j(requirementToContact)) {
            return;
        }
        this.o2 = z3;
        this.q2 = cf3.j(requirementToContact);
        if (!z) {
            this.n2.f(this.o2, true);
            if (this.q2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.p2.f(z2, true);
        }
        invalidate();
    }

    public final void n0() {
        StaticLayout staticLayout;
        int i;
        if (this.S1 > 0) {
            if (Z()) {
                staticLayout = this.i3;
            } else {
                staticLayout = this.f3;
            }
            if (Z()) {
                i = this.d3;
            } else {
                i = this.c3;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        se3[] se3VarArr = (se3[]) ((Spanned) text).getSpans(0, text.length(), se3.class);
                        boolean[] zArr = this.V1;
                        if (se3VarArr != null && se3VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(se3VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.y0 && !this.z0) {
                                ceil += gl.L(3.0f);
                            }
                            for (int i2 = 0; i2 < this.S1; i2++) {
                                this.W1[i2].L0 = i + ceil + gl.L((this.M4 + 2) * i2);
                                zArr[i2] = true;
                            }
                            return;
                        }
                        for (int i3 = 0; i3 < 3; i3++) {
                            zArr[i3] = false;
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z1.I();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].I();
            i++;
        }
        d0();
        this.n3 = gm.update(0, this, this.n3, this.f3);
        this.o3 = gm.update(0, this, this.o3, this.t3);
        this.p3 = gm.update(0, this, this.p3, this.i3);
        this.q3 = gm.update(0, this, this.q3, this.A2);
        tl tlVar = this.o4;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = this.p4;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f;
        super.onDetachedFromWindow();
        this.y1 = false;
        this.B1 = false;
        this.C1 = 0.0f;
        this.x3 = false;
        if (getIsPinned() && this.z3) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.y3 = f;
        this.Z1.K();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].K();
            i++;
        }
        oy8 oy8Var = this.z1;
        if (oy8Var != null) {
            oy8Var.stop();
            this.z1.O(true, 0.0f);
            this.z1.setCallback(null);
            this.z1 = null;
            this.A1 = false;
        }
        lj3 lj3Var = this.t4;
        if (lj3Var != null) {
            lj3Var.d.remove(Long.valueOf(this.I0));
        }
        tl tlVar = this.o4;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = this.p4;
        if (tlVar2 != null) {
            tlVar2.b();
        }
        gm.release(this, this.n3);
        gm.release(this, this.o3);
        gm.release(this, this.p3);
        gm.release(this, this.q3);
        this.v0.g();
        this.d0 = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        vu8 vu8Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Y() && (vu8Var = this.f2) != null && gba.m1 && vu8Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!Y() && this.E4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296262, k96.M0(2131754940, null)));
            }
        }
        ya yaVar = this.r2;
        if (yaVar != null && yaVar.a.q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.j0 == 0.0f && !this.Q && !this.G && this.v0.a(this, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b;
        int i5;
        int L;
        int i6;
        if (this.I0 != 0 || this.H0 != null) {
            sb sbVar = this.n4;
            if (sbVar != null) {
                sbVar.layout(0, 0, gl.L(22.0f), gl.L(22.0f));
            }
            if (this.r2 != null) {
                byte b2 = this.J;
                boolean z2 = this.s2;
                if (!z2 && !gba.l1) {
                    b = 27;
                } else {
                    b = 29;
                }
                int L2 = gl.L(b2 - b);
                if (this.l0) {
                    i6 = gl.L(8.0f);
                    L = (getMeasuredHeight() - this.r2.getMeasuredHeight()) >> 1;
                } else {
                    if (k96.a0) {
                        L2 = (i3 - i) - L2;
                    }
                    float f = this.V;
                    if (!z2 && !gba.l1) {
                        i5 = 0;
                    } else {
                        i5 = 6;
                    }
                    int i7 = L2;
                    L = gl.L(f + i5);
                    i6 = i7;
                }
                ya yaVar = this.r2;
                yaVar.layout(i6, L, yaVar.getMeasuredWidth() + i6, this.r2.getMeasuredHeight() + L);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.L4 && !this.B0) {
                return;
            }
            this.B0 = false;
            this.L4 = measuredWidth;
            try {
                z();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        sb sbVar = this.n4;
        if (sbVar != null) {
            sbVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(22.0f), 1073741824));
        }
        ya yaVar = this.r2;
        if (yaVar != null) {
            yaVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), 1073741824));
        }
        if (this.Q) {
            int size = View.MeasureSpec.getSize(i);
            boolean z = this.s2;
            if (!z && !gba.l1) {
                b = this.K;
            } else {
                b = this.L;
            }
            if (V() && ((!z && !gba.l1) || Z())) {
                if (Z()) {
                    b2 = this.N;
                } else {
                    b2 = this.M;
                }
            } else {
                b2 = 0;
            }
            setMeasuredDimension(size, gl.L(b + b2) + (this.t2 ? 1 : 0));
            this.R = false;
            if (this.Q && !V()) {
                z();
                if (this.S) {
                    this.R = true;
                    z();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), I());
        this.v1 = 0;
        this.w1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        k27 captionMessage;
        TLRPC.User V1;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        String str = this.M0;
        if (str != null) {
            sb.append(str);
            sb.append(". ");
        } else if (this.K0 == 1) {
            sb.append(k96.M0(2131754133, null));
            sb.append(". ");
        } else {
            if (this.i2 != null) {
                sb.append(k96.M0(2131754776, null));
                sb.append(". ");
            }
            if (this.Q && this.O != null) {
                sb.append(k96.M0(2131754745, null));
                sb.append(". ");
                sb.append(this.O.title);
                sb.append(". ");
            } else {
                TLRPC.User user = this.g2;
                if (user != null) {
                    if (l7c.B(user)) {
                        sb.append(k96.M0(2131746073, null));
                    } else if (l7c.u(this.g2)) {
                        sb.append(k96.M0(2131754249, null));
                    } else {
                        if (this.g2.bot) {
                            sb.append(k96.M0(2131753153, null));
                            sb.append(". ");
                        }
                        TLRPC.User user2 = this.g2;
                        if (user2.self) {
                            sb.append(k96.M0(2131745709, null));
                        } else {
                            sb.append(qu2.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb.append(". ");
                } else {
                    TLRPC.Chat chat = this.h2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb.append(k96.M0(2131754904, null));
                        } else {
                            sb.append(k96.M0(2131754876, null));
                        }
                        sb.append(". ");
                        sb.append(this.h2.title);
                        sb.append(". ");
                    }
                }
            }
        }
        if (this.k4) {
            sb.append(k96.M0(2131754738, null));
            sb.append(". ");
        }
        if (this.a1) {
            sb.append(k96.M0(2131754828, null));
            sb.append(". ");
        }
        if (a0()) {
            sb.append(k96.M0(2131754740, null));
            sb.append(". ");
        }
        int i = this.T0;
        if (i > 0) {
            sb.append(k96.G(i, "NewMessages", new Object[0]));
            sb.append(". ");
        }
        int i2 = this.V0;
        if (i2 > 0) {
            sb.append(k96.G(i2, "AccDescrMentionCount", new Object[0]));
            sb.append(". ");
        }
        if (this.W0 > 0) {
            sb.append(k96.M0(2131754840, null));
            sb.append(". ");
        }
        k27 k27Var = this.g1;
        if (k27Var != null && this.K0 == 0) {
            int i3 = this.S0;
            if (i3 == 0) {
                i3 = k27Var.k.date;
            }
            String s = k96.s(i3, true);
            if (this.g1.N3()) {
                sb.append(k96.a0("AccDescrSentDate", null, 2131754764, s));
            } else {
                sb.append(k96.a0("AccDescrReceivedDate", null, 2131754788, s));
            }
            sb.append(". ");
            if (this.h2 != null && !this.g1.N3() && this.g1.p3() && this.g1.k.action == null && (V1 = na7.q1(this.G0).V1(Long.valueOf(this.g1.k.from_id.user_id))) != null) {
                sb.append(qu2.m(0, V1.first_name, V1.last_name));
                sb.append(". ");
            }
            if (this.i2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.g1.v);
                if (!this.g1.F3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.z)) {
                    if (sb2.length() > 0) {
                        sb2.append(". ");
                    }
                    sb2.append(captionMessage.z);
                }
                StaticLayout staticLayout = this.f3;
                if (staticLayout == null) {
                    length = -1;
                } else {
                    length = staticLayout.getText().length();
                }
                if (length > 0) {
                    int length2 = sb2.length();
                    int indexOf = sb2.indexOf("\n", length);
                    if (indexOf < length2 && indexOf >= 0) {
                        length2 = indexOf;
                    }
                    int indexOf2 = sb2.indexOf("\t", length);
                    if (indexOf2 < length2 && indexOf2 >= 0) {
                        length2 = indexOf2;
                    }
                    int indexOf3 = sb2.indexOf(" ", length);
                    if (indexOf3 < length2 && indexOf3 >= 0) {
                        length2 = indexOf3;
                    }
                    sb.append(sb2.substring(0, length2));
                } else {
                    sb.append((CharSequence) sb2);
                }
            }
            accessibilityEvent.setContentDescription(sb);
            setContentDescription(sb);
            return;
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        cj3 cj3Var;
        if (i == 2131296262 && (cj3Var = this.E4) != null) {
            cj3Var.Y4(this);
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(vu8 vu8Var) {
        this.f2 = vu8Var;
    }

    public void setBottomClip(int i) {
        this.w1 = i;
    }

    public void setClipProgress(float f) {
        this.u1 = f;
        invalidate();
    }

    public void setCurrentDialogId(long j) {
        this.I0 = j;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.J0, str)) {
            this.J0 = str;
            z();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.J0 = str;
    }

    public void setDialog(pe3 pe3Var) {
        this.H0 = pe3Var;
        this.m1 = 0;
        k0(0, true);
        G();
        D();
        A();
        H();
    }

    public void setDialogCellDelegate(qe3 qe3Var) {
        this.e0 = qe3Var;
    }

    public void setDialogSelected(boolean z) {
        if (this.r4 != z) {
            invalidate();
        }
        this.r4 = z;
    }

    public void setIsTransitionSupport(boolean z) {
        this.k0 = z;
    }

    public void setMoving(boolean z) {
        this.r = z;
    }

    public void setOpenBotButton(boolean z) {
        if (this.F1 == z) {
            return;
        }
        if (this.J1 == null) {
            this.J1 = new tgb(k96.M0(2131753008, null), 14.0f, gl.o());
        }
        this.F1 = z;
        this.G1.c(false);
    }

    public void setPinForced(boolean z) {
        this.C3 = z;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            z();
        }
        invalidate();
    }

    public void setPreloader(lj3 lj3Var) {
        this.t4 = lj3Var;
    }

    public void setRightFragmentOpenedProgress(float f) {
        if (this.j0 != f) {
            this.j0 = f;
            invalidate();
        }
    }

    public void setSliding(boolean z) {
        this.y1 = z;
    }

    public void setTitleOverride(String str) {
        this.M0 = str;
    }

    public void setTopClip(int i) {
        this.v1 = i;
    }

    @Override
    public void setTranslationX(float f) {
        if (f == this.x1) {
            return;
        }
        this.x1 = f;
        oy8 oy8Var = this.z1;
        boolean z = true;
        if (oy8Var != null && f == 0.0f) {
            oy8Var.O(true, 0.0f);
            this.A1 = false;
            this.n1 = gba.m1;
            this.C1 = 0.0f;
            this.y1 = false;
        }
        float f2 = this.x1;
        if (f2 != 0.0f) {
            this.y1 = true;
        } else {
            this.D1 = 0.0f;
            this.C1 = 0.0f;
            this.B1 = false;
        }
        if (this.y1 && !this.x) {
            boolean z2 = this.B1;
            if (Math.abs(f2) < getMeasuredWidth() * 0.45f) {
                z = false;
            }
            this.B1 = z;
            if (z2 != z && this.n1 == gba.m1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z) {
        if (this.A0 != z) {
            this.A0 = z;
            if (z) {
                invalidate();
            }
        }
    }

    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.I0 != 0 || this.H0 != null) {
                    k0(0, true);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final CharSequence y(CharSequence charSequence) {
        if (this.S1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new se3(gl.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void z() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue3.z():void");
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (m8b.x1) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    public ue3(Context context, boolean z) {
        this(null, context, z, y6c.t0, null);
    }
}
