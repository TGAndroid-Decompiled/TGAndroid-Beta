package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
public class uk1 extends hf0 implements sp3, gk7, ni5 {
    public static final HashMap y2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public qla E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final i19 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public xqa I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public nkc J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final pb0 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final rh1 O1;
    public int P;
    public xab P0;
    public boolean P1;
    public StaticLayout Q;
    public k27 Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public kv4 T0;
    public tgb T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final bra W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public dd Z1;
    public boolean a0;
    public final Path a1;
    public boolean a2;
    public boolean b0;
    public int b1;
    public int b2;
    public RadialProgressView c0;
    public int c1;
    public TLRPC.TL_messageActionStarGiftOnchainOffer c2;
    public float d0;
    public final RectF d1;
    public boolean d2;
    public final u2b e0;
    public boolean e1;
    public int e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean f2;
    public boolean g0;
    public rk1 g1;
    public qv4 g2;
    public int h;
    public boolean h0;
    public final wjb h1;
    public float h2;
    public boolean i0;
    public int i1;
    public final Paint i2;
    public boolean j0;
    public int j1;
    public boolean j2;
    public int k0;
    public StaticLayout k1;
    public View.OnClickListener k2;
    public boolean l0;
    public Paint l1;
    public int l2;
    public int m0;
    public tgb m1;
    public final Path m2;
    public final n41 n;
    public boolean n0;
    public StaticLayout n1;
    public final float[] n2;
    public aub o0;
    public boolean o1;
    public final float[] o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final int[] q2;
    public r86 r;
    public final Stack r0;
    public final lm r1;
    public int r2;
    public final boolean s;
    public cm s0;
    public xl3 s1;
    public SpannableStringBuilder s2;
    public TextPaint t0;
    public sk1 t1;
    public boolean t2;
    public float u0;
    public int u1;
    public Runnable u2;
    public float v0;
    public int v1;
    public PorterDuffColorFilter v2;
    public View w;
    public int w0;
    public int w1;
    public int w2;
    public final int x;
    public boolean x0;
    public tgb x1;
    public final tk1 x2;
    public URLSpan y;
    public gl5 y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        y2 = hashMap;
        b00.q(1, hashMap, "1⃣", 3, "2⃣");
        b00.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public uk1(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.n = new n41(this);
        int i = y6c.t0;
        this.I = i;
        u2b u2bVar = new u2b(null, false);
        this.e0 = u2bVar;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new i19(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new Path();
        this.d1 = new RectF();
        this.e1 = true;
        this.f1 = false;
        this.o1 = false;
        this.p1 = false;
        this.r1 = new lm(this, 0L, 320L, s33.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new rh1(this, (byte) 2);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.b2 = -1;
        this.e2 = -1;
        this.i2 = new Paint(1);
        this.m2 = new Path();
        this.n2 = new float[8];
        this.o2 = new float[8];
        this.p2 = new Path();
        this.q2 = new int[]{16842910, 16842919};
        this.x2 = new tk1(this);
        u2bVar.a = false;
        this.s = z;
        this.h1 = wjbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.q0(gl.u / 2);
        this.M = new pb0((wjb) null);
        this.x = up3.q(i).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(bkb.f0(bkb.p1(0.1f, -16777216), 7, gl.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        bra braVar = new bra(10);
        this.W1 = braVar;
        braVar.N = 100;
        braVar.I = false;
        braVar.L = true;
        braVar.G = false;
        braVar.J = true;
        braVar.H = true;
        braVar.r = (byte) 1;
        braVar.w = 0.98f;
        braVar.v = 0.98f;
        braVar.u = 0.98f;
        braVar.g = false;
        braVar.o = 0.0f;
        braVar.x = (short) 750;
        braVar.y = (short) 750;
        braVar.c();
    }

    public static SpannableStringBuilder I(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.G2(str, false, gl.L(6.0f), -gl.L(1.3f), 0.8f, 2131231198));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new se3(gl.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            mk1.j();
            spannableStringBuilder.setSpan(mk1.g(gl.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float b0(StaticLayout staticLayout) {
        float f = 0.0f;
        for (int i = 0; i < staticLayout.getLineCount(); i++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i));
            if (ceil > f) {
                f = ceil;
            }
        }
        return f;
    }

    private float getWalletActionTop() {
        return gl.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z) {
        bra braVar = this.W1;
        boolean z2 = braVar.g;
        ArrayList arrayList = braVar.n;
        if (z == z2) {
            return;
        }
        braVar.g = z;
        if (z) {
            braVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ara araVar = (ara) arrayList.get(i);
            araVar.a = (System.currentTimeMillis() - braVar.Q) + araVar.a;
        }
        invalidate();
    }

    public final boolean A(float f, int i) {
        i19 i19Var = this.F0;
        if (!i19Var.H) {
            return false;
        }
        float y = getY() + i19Var.c;
        if (y <= f || (y + i19Var.m) - gl.L(16.0f) >= i) {
            return false;
        }
        return true;
    }

    public final void F() {
        String str;
        String M0;
        String G;
        SpannableStringBuilder spannableStringBuilder;
        String a0;
        int L = this.j1 - gl.L(16.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(gl.L(14.0f));
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(gl.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.k.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat K0 = na7.q1(this.I).K0(Long.valueOf(-cf3.n(tL_messageActionGiftCode.boost_peer)));
        if (K0 == null) {
            str = null;
        } else {
            str = K0.title;
        }
        boolean z = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            M0 = k96.M0(2131753173, "BoostingUnclaimedPrize");
        } else {
            M0 = k96.M0(2131753539, "BoostingCongratulations");
        }
        if (i == 12) {
            G = k96.G(1, "BoldYears", new Object[0]);
        } else {
            G = k96.G(i, "BoldMonths", new Object[0]);
        }
        if (z) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(gl.T2(k96.a0(null, null, 2131753163, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ls6.s(null, null, 2131753172, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(gl.T2(k96.a0(null, null, 2131753304, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                ls6.s(null, null, 2131753305, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a0 = k96.M0(2131753307, null);
            } else {
                a0 = k96.a0("BoostingReceivedGiftFrom", null, 2131753308, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(gl.T2(a0));
            spannableStringBuilder.append((CharSequence) "\n\n");
            ls6.s(null, null, 2131753309, new Object[]{G}, spannableStringBuilder);
        }
        String M02 = k96.M0(2131753306, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new z3c(gl.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        sk1 sk1Var = this.t1;
        if (sk1Var != null) {
            gm.release(sk1Var.i, sk1Var.h);
        }
        sk1 sk1Var2 = new sk1(this);
        this.t1 = sk1Var2;
        sk1Var2.a(L, textPaint2, spannableStringBuilder);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M02);
        valueOf2.setSpan(new z3c(gl.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = b0(staticLayout);
    }

    public final void G(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, String str, int i2, boolean z2) {
        ?? r4;
        int i3;
        int a;
        CharSequence charSequence4 = charSequence2;
        int L = i2 - gl.L(16.0f);
        k27 k27Var = this.Q0;
        if (k27Var != null && k27Var.D == 30) {
            L -= gl.L(16.0f);
        }
        int i4 = L;
        if (charSequence != null) {
            k27 k27Var2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (k27Var2 != null && k27Var2.D == 30) {
                textPaint.setTextSize(gl.L(14.0f));
            } else {
                textPaint.setTextSize(gl.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new z3c(gl.o()), 0, valueOf.length(), 33);
            r4 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            tgb tgbVar = new tgb(spannableStringBuilder, 10.0f, null);
            this.m1 = tgbVar;
            tgbVar.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(R("paintChatActionText").getTextSize());
        } else {
            k27 k27Var3 = this.Q0;
            if (k27Var3 != null) {
                if (k27Var3.D == 35) {
                    textPaint2.setTextSize(gl.L(14.3f));
                } else if (Z() || (i3 = this.Q0.D) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33) {
                    textPaint2.setTextSize(gl.L(13.0f));
                }
            }
            textPaint2.setTextSize(gl.L(15.0f));
        }
        int L2 = i4 - gl.L(12.0f);
        k27 k27Var4 = this.Q0;
        if (k27Var4 != null && k27Var4.D == 22 && k27.B0(k27Var4.k) >= 0 && (a = je5.a(charSequence4, textPaint2)) < L2 && a > L2 / 5.0f) {
            L2 = a;
        }
        sk1 sk1Var = this.t1;
        if (charSequence4 == null) {
            if (sk1Var != null) {
                gm.release(sk1Var.i, sk1Var.h);
                this.t1 = null;
            }
            this.p1 = r4;
        } else {
            if (sk1Var == null) {
                this.t1 = new sk1(this);
            }
            try {
                charSequence4 = vu3.m(charSequence4, textPaint2.getFontMetricsInt(), r4, null, r4);
            } catch (Exception unused) {
            }
            this.t1.a(L2, textPaint2, charSequence4);
            if (z && this.t1.d.getLineCount() > 3) {
                this.p1 = !this.o1;
                this.q1 = this.t1.d.getLineBottom(2);
                this.x1 = new tgb(k96.M0(2131750249, null), textPaint2.getTextSize() / gl.p, gl.o());
                int lineBottom = this.t1.d.getLineBottom(2);
                this.v1 = lineBottom;
                this.w1 = lineBottom - this.t1.d.getLineTop(2);
                this.u1 = (int) this.t1.d.getLineRight(2);
            } else {
                this.p1 = r4;
                this.r1.f(true, true);
                this.q1 = r4;
            }
            if (this.p1) {
                int lineEnd = this.t1.d.getLineEnd(2) - 1;
                sk1 sk1Var2 = this.t1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r4, lineEnd);
                }
                sk1Var2.a(L2, textPaint2, charSequence4);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new z3c(gl.o()), r4, valueOf2.length(), 33);
            boolean z3 = true;
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            if (!z2 || this.p1) {
                z3 = r4;
            }
            this.z1 = z3;
            this.E1 = b0(staticLayout);
        } else {
            this.y1 = null;
            this.z1 = r4;
            this.E1 = 0.0f;
        }
        if (str != null) {
            if (this.R1 == null) {
                this.R1 = new CornerPathEffect(gl.L(5.0f));
            }
            if (this.S1 == null) {
                Path path = new Path();
                this.S1 = path;
                qv4.d(path, 1.35f, r4);
            }
            tgb tgbVar2 = new tgb(str, i, gl.o());
            this.T1 = tgbVar2;
            tgbVar2.p = gl.L(62.0f);
            return;
        }
        this.S1 = null;
        this.T1 = null;
    }

    public final void H(int r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.H(int, java.lang.CharSequence):void");
    }

    public final void J(Canvas canvas, boolean z) {
        uk1 uk1Var;
        Paint paint;
        Paint paint2;
        wjb wjbVar;
        float f;
        float f2;
        float f3;
        float f4;
        wjb wjbVar2;
        float f5;
        Paint paint3;
        Paint paint4;
        int i;
        int i2;
        Canvas canvas2;
        float f6;
        float f7;
        float f8;
        RectF rectF;
        int i3;
        sk1 sk1Var;
        int i4;
        float L;
        nkc nkcVar;
        int L2;
        int lineCount;
        RectF rectF2;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Paint paint5;
        int i11;
        int i12;
        float f9;
        StaticLayout staticLayout;
        ArrayList arrayList2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        uk1 uk1Var2 = this;
        if (uk1Var2.s) {
            if (!uk1Var2.T() || z) {
                if (!uk1Var2.T() && z) {
                    return;
                }
            } else {
                return;
            }
        }
        Paint R = uk1Var2.R("paintChatActionBackground");
        Paint R2 = uk1Var2.R("paintChatActionBackgroundDarken");
        uk1Var2.t0 = (TextPaint) uk1Var2.R("paintChatActionText");
        int i19 = uk1Var2.U0;
        wjb wjbVar3 = uk1Var2.h1;
        if (i19 >= 0) {
            int v0 = bkb.v0(i19, wjbVar3);
            if (uk1Var2.W0 == null) {
                Paint paint6 = new Paint(1);
                uk1Var2.W0 = paint6;
                paint6.setColor(v0);
                TextPaint textPaint = new TextPaint(1);
                uk1Var2.X0 = textPaint;
                textPaint.setTypeface(gl.o());
                uk1Var2.X0.setTextSize(gl.L(Math.max(16, gba.T0) - 2));
                uk1Var2.X0.setColor(bkb.v0(uk1Var2.V0, wjbVar3));
            }
            R = uk1Var2.W0;
            uk1Var2.t0 = uk1Var2.X0;
        }
        boolean z2 = uk1Var2.e1;
        Path path = uk1Var2.a1;
        if (z2) {
            uk1Var2.e1 = false;
            uk1Var2.b1 = uk1Var2.getWidth();
            uk1Var2.c1 = 0;
            StaticLayout staticLayout2 = uk1Var2.N;
            int measuredWidth = uk1Var2.getMeasuredWidth() / 2;
            int L3 = gl.L(4.0f);
            f2 = 6.0f;
            ArrayList arrayList3 = uk1Var2.Y0;
            arrayList3.clear();
            if (staticLayout2 == null) {
                lineCount = 0;
            } else {
                lineCount = staticLayout2.getLineCount();
            }
            f3 = 8.0f;
            int L4 = gl.L(11.0f);
            f = 4.0f;
            int L5 = gl.L(8.0f);
            int i20 = 0;
            f4 = 2.0f;
            int i21 = 0;
            while (i20 < lineCount) {
                wjb wjbVar4 = wjbVar3;
                int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i20));
                if (i20 != 0 && (i18 = i21 - ceil) > 0) {
                    i16 = ceil;
                    if (i18 <= (L4 * 1.5f) + L5) {
                        i17 = i21;
                        i20 = tb4.g(i17, i20, 1, arrayList3);
                        i21 = i17;
                        wjbVar3 = wjbVar4;
                    }
                } else {
                    i16 = ceil;
                }
                i17 = i16;
                i20 = tb4.g(i17, i20, 1, arrayList3);
                i21 = i17;
                wjbVar3 = wjbVar4;
            }
            wjbVar = wjbVar3;
            for (int i22 = lineCount - 2; i22 >= 0; i22--) {
                int intValue = ((Integer) arrayList3.get(i22)).intValue();
                int i23 = i21 - intValue;
                if (i23 > 0) {
                    i15 = intValue;
                    if (i23 <= (L4 * 1.5f) + L5) {
                        arrayList3.set(i22, Integer.valueOf(i21));
                    }
                } else {
                    i15 = intValue;
                }
                i21 = i15;
                arrayList3.set(i22, Integer.valueOf(i21));
            }
            int L6 = gl.L(3.0f);
            int L7 = gl.L(6.0f);
            int i24 = L4 - L6;
            ArrayList arrayList4 = uk1Var2.Z0;
            arrayList4.clear();
            path.reset();
            float f10 = measuredWidth;
            path.moveTo(f10, L3);
            int i25 = i21;
            int i26 = 0;
            int i27 = 0;
            while (true) {
                rectF2 = uk1Var2.d1;
                if (i27 >= lineCount) {
                    break;
                }
                int intValue2 = ((Integer) arrayList3.get(i27)).intValue();
                int lineBottom = staticLayout2.getLineBottom(i27);
                int i28 = lineCount;
                int i29 = i28 - 1;
                if (i27 < i29) {
                    paint5 = R2;
                    i11 = ((Integer) arrayList3.get(i27 + 1)).intValue();
                } else {
                    paint5 = R2;
                    i11 = 0;
                }
                int i30 = lineBottom - i26;
                if (i27 == 0 || intValue2 > i25) {
                    i30 = gl.L(3.0f) + i30;
                }
                if (i27 == i29 || intValue2 > i11) {
                    i30 = gl.L(3.0f) + i30;
                }
                Paint paint7 = R;
                float f11 = (intValue2 / 2.0f) + f10;
                if (i27 != i29 && intValue2 < i11 && i27 != 0 && intValue2 < i25) {
                    i12 = L7;
                } else {
                    i12 = L5;
                }
                if (i27 != 0 && intValue2 <= i25) {
                    f9 = f11;
                    if (intValue2 < i25) {
                        float f12 = f9 + i24;
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                        rectF2.set(f12, L3, (i12 << 1) + f12, i14 + L3);
                        z();
                        path.arcTo(rectF2, -90.0f, -90.0f);
                    } else {
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                    }
                } else {
                    f9 = f11;
                    staticLayout = staticLayout2;
                    arrayList2 = arrayList3;
                    rectF2.set((f9 - L6) - L4, L3, f9 + i24, (L4 << 1) + L3);
                    z();
                    path.arcTo(rectF2, -90.0f, 90.0f);
                }
                L3 += i30;
                if (i27 != i29 && intValue2 < i11) {
                    L3 -= gl.L(3.0f);
                    i30 -= gl.L(3.0f);
                }
                if (i27 != 0 && intValue2 < i25) {
                    L3 -= gl.L(3.0f);
                    i30 -= gl.L(3.0f);
                }
                arrayList4.add(Integer.valueOf(i30));
                if (i27 != i29 && intValue2 <= i11) {
                    if (intValue2 < i11) {
                        float f13 = f9 + i24;
                        rectF2.set(f13, L3 - i13, (i12 << 1) + f13, L3);
                        z();
                        path.arcTo(rectF2, 180.0f, -90.0f);
                    }
                } else {
                    rectF2.set((f9 - L6) - L4, L3 - (L4 << 1), f9 + i24, L3);
                    z();
                    path.arcTo(rectF2, 0.0f, 90.0f);
                }
                i27++;
                uk1Var2 = this;
                i25 = intValue2;
                i26 = lineBottom;
                lineCount = i28;
                R2 = paint5;
                R = paint7;
                staticLayout2 = staticLayout;
                arrayList3 = arrayList2;
            }
            paint = R;
            paint2 = R2;
            StaticLayout staticLayout3 = staticLayout2;
            ArrayList arrayList5 = arrayList3;
            int i31 = lineCount - 1;
            int i32 = i31;
            while (i32 >= 0) {
                if (i32 != 0) {
                    arrayList = arrayList5;
                    i5 = ((Integer) arrayList.get(i32 - 1)).intValue();
                } else {
                    arrayList = arrayList5;
                    i5 = 0;
                }
                int intValue3 = ((Integer) arrayList.get(i32)).intValue();
                if (i32 != i31) {
                    i6 = ((Integer) arrayList.get(i32 + 1)).intValue();
                } else {
                    i6 = 0;
                }
                StaticLayout staticLayout4 = staticLayout3;
                staticLayout4.getLineBottom(i32);
                float f14 = measuredWidth - (intValue3 / 2);
                if (i32 != i31 && intValue3 < i6 && i32 != 0 && intValue3 < i5) {
                    i7 = L7;
                } else {
                    i7 = L5;
                }
                if (i32 != i31 && intValue3 <= i6) {
                    if (intValue3 < i6) {
                        float f15 = f14 - i24;
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i8 = i31;
                        rectF2.set(f15 - (i7 << 1), L3 - i10, f15, L3);
                        z();
                        path.arcTo(rectF2, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i8 = i31;
                    }
                } else {
                    arrayList5 = arrayList;
                    staticLayout3 = staticLayout4;
                    i8 = i31;
                    rectF2.set(f14 - i24, L3 - (L4 << 1), L6 + f14 + L4, L3);
                    z();
                    path.arcTo(rectF2, 90.0f, 90.0f);
                }
                L3 -= ((Integer) arrayList4.get(i32)).intValue();
                if (i32 != 0 && intValue3 <= i5) {
                    if (intValue3 < i5) {
                        float f16 = f14 - i24;
                        rectF2.set(f16 - (i7 << 1), L3, f16, i9 + L3);
                        z();
                        path.arcTo(rectF2, 0.0f, -90.0f);
                    }
                } else {
                    rectF2.set(f14 - i24, L3, f14 + L6 + L4, (L4 << 1) + L3);
                    z();
                    path.arcTo(rectF2, 180.0f, 90.0f);
                }
                i32--;
                i31 = i8;
            }
            path.close();
            int measuredWidth2 = getMeasuredWidth() / 2;
            if (Y() && !Z()) {
                float f17 = measuredWidth2;
                uk1Var = this;
                rectF2.left = (f17 - (uk1Var.O / 2.0f)) - gl.L(17.0f);
                rectF2.top = L3;
                rectF2.right = (uk1Var.O / 2.0f) + f17 + gl.L(17.0f);
                rectF2.bottom = gl.L(28.0f) + L3 + uk1Var.P + uk1Var.R;
                path.reset();
                path.addRoundRect(rectF2, gl.L(15.0f), gl.L(15.0f), Path.Direction.CW);
                path.close();
            } else {
                uk1Var = this;
            }
        } else {
            uk1Var = uk1Var2;
            paint = R;
            paint2 = R2;
            wjbVar = wjbVar3;
            f = 4.0f;
            f2 = 6.0f;
            f3 = 8.0f;
            f4 = 2.0f;
        }
        if (!uk1Var.x0) {
            uk1Var.w0 = ((ViewGroup) uk1Var.getParent()).getMeasuredHeight();
        }
        if (wjbVar != null) {
            wjbVar2 = wjbVar;
            wjbVar2.b(uk1Var.v0, uk1Var.u0 + gl.L(f), uk1Var.getMeasuredWidth(), uk1Var.w0);
        } else {
            wjbVar2 = wjbVar;
            bkb.q(uk1Var.v0, uk1Var.u0 + gl.L(f), uk1Var.getMeasuredWidth(), uk1Var.w0);
        }
        boolean z3 = uk1Var instanceof rq1;
        if (z3 && !bkb.g1(wjbVar2)) {
            f5 = 0.75f;
        } else {
            f5 = 1.0f;
        }
        if (z && (uk1Var.getAlpha() != 1.0f || z3)) {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (uk1Var.getAlpha() * i * f5));
            paint3 = paint2;
            paint3.setAlpha((int) (uk1Var.getAlpha() * i2 * f5));
        } else {
            paint3 = paint2;
            paint4 = paint;
            if (z3) {
                i = paint4.getAlpha();
                i2 = paint3.getAlpha();
                paint4.setAlpha((int) (i * f5));
                paint3.setAlpha((int) (i2 * f5));
            } else {
                i = -1;
                i2 = -1;
            }
        }
        k27 k27Var = uk1Var.Q0;
        Paint paint8 = uk1Var.i2;
        if (k27Var != null && k27Var.j2) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawPath(path, paint4);
            if (uk1Var.T() && paint3.getAlpha() > 0) {
                canvas2.drawPath(path, paint3);
            }
            if (uk1Var.h2 > 0.0f) {
                int alpha = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (uk1Var.getAlpha() * alpha));
                }
                canvas2.drawPath(path, paint8);
                paint8.setAlpha(alpha);
            }
        }
        if (uk1Var.V()) {
            int width = uk1Var.getWidth();
            uk1Var.J0.getClass();
            float L8 = (width - gl.L(206.0f)) / f4;
            float walletActionTop = uk1Var.getWalletActionTop();
            uk1Var.J0.getClass();
            float L9 = gl.L(206.0f) + L8;
            if (uk1Var.J0.q0 == null) {
                L2 = gl.L(140.0f);
                f6 = 140.0f;
                f7 = 20.0f;
            } else {
                f6 = 140.0f;
                f7 = 20.0f;
                L2 = gl.L(150.0f) + ((int) Math.ceil(nkcVar.q0.h()));
            }
            RectF rectF3 = uk1Var.O0;
            rectF3.set(L8, walletActionTop, L9, L2 + walletActionTop);
            canvas2.save();
            uk1Var.J0.c(canvas2, L8, walletActionTop);
            canvas2.drawRoundRect(rectF3, gl.L(f7), gl.L(f7), paint4);
            if (uk1Var.T() && paint3.getAlpha() > 0) {
                canvas2.drawRoundRect(rectF3, gl.L(f7), gl.L(f7), paint3);
            }
            f8 = 0.0f;
            if (uk1Var.h2 > 0.0f) {
                int alpha2 = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (uk1Var.getAlpha() * alpha2));
                }
                canvas2.drawRoundRect(rectF3, gl.L(f7), gl.L(f7), paint8);
                paint8.setAlpha(alpha2);
            }
            canvas2.restore();
        } else {
            f6 = 140.0f;
            f7 = 20.0f;
            f8 = 0.0f;
        }
        k27 k27Var2 = uk1Var.Q0;
        if (uk1Var.U()) {
            float L10 = uk1Var.I0.T.f + gl.L(f3);
            float width2 = (uk1Var.getWidth() - L10) / f4;
            if (uk1Var.I0.p) {
                L = f8;
            } else {
                L = gl.L(12.0f) + uk1Var.T + uk1Var.P;
            }
            RectF rectF4 = gl.P;
            rectF4.set(width2, L, L10 + width2, uk1Var.I0.P + L + gl.L(f3));
            RectF rectF5 = uk1Var.N1;
            if (rectF5 == null) {
                rectF5 = new RectF();
                uk1Var.N1 = rectF5;
            }
            rectF5.set(rectF4);
            canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint4);
            if (uk1Var.T()) {
                canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint3);
            }
        } else if (uk1Var.P0 != null) {
            float L11 = gl.L(174.0f);
            xab xabVar = uk1Var.P0;
            xabVar.getClass();
            int L12 = gl.L(f6) + ((int) xabVar.f.h());
            if (xabVar.i) {
                i4 = gl.L(40.0f);
            } else {
                i4 = 0;
            }
            float f18 = L12 + i4;
            float width3 = (uk1Var.getWidth() - L11) / f4;
            RectF rectF6 = uk1Var.N1;
            if (rectF6 == null) {
                rectF6 = new RectF();
                uk1Var.N1 = rectF6;
            }
            rectF6.set(width3, gl.L(f), L11 + width3, gl.L(f) + f18);
            canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint4);
            if (uk1Var.T()) {
                canvas2.drawRoundRect(uk1Var.N1, gl.L(16.0f), gl.L(16.0f), paint3);
            }
        } else if (uk1Var.X(k27Var2)) {
            float width4 = (uk1Var.getWidth() - uk1Var.j1) / f4;
            float f19 = uk1Var.T + uk1Var.P;
            if (uk1Var.Z()) {
                float L13 = f19 + gl.L(f);
                rectF = gl.P;
                rectF.set(width4, L13, uk1Var.j1 + width4, uk1Var.f + L13);
            } else {
                float L14 = f19 + gl.L(12.0f);
                rectF = gl.P;
                float f20 = uk1Var.j1;
                rectF.set(width4, L14, width4 + f20, f20 + L14 + uk1Var.L1);
            }
            if (k27Var2 != null && k27Var2.D == 18 && !uk1Var.p1 && (sk1Var = uk1Var.t1) != null && uk1Var.q1 > 0) {
                rectF.bottom = ls6.B(1.0f, uk1Var.r1.c, sk1Var.d.getHeight() - uk1Var.q1, rectF.bottom);
            }
            RectF rectF7 = uk1Var.N1;
            if (rectF7 == null) {
                rectF7 = new RectF();
                uk1Var.N1 = rectF7;
            }
            rectF7.set(rectF);
            if (k27Var2 != null && (((i3 = k27Var2.D) == 33 || i3 == 35) && uk1Var.Z1 != null)) {
                float[] fArr = uk1Var.n2;
                Arrays.fill(fArr, gl.L(16.0f));
                float L15 = gl.L(f2);
                fArr[7] = L15;
                fArr[6] = L15;
                fArr[5] = L15;
                fArr[4] = L15;
                Path path2 = uk1Var.m2;
                path2.rewind();
                path2.addRoundRect(uk1Var.N1, fArr, Path.Direction.CW);
                canvas2.drawPath(path2, paint4);
                if (uk1Var.T()) {
                    canvas2.drawPath(path2, paint3);
                }
            } else {
                canvas2.drawRoundRect(uk1Var.N1, gl.L(f7), gl.L(f7), paint4);
                if (uk1Var.T()) {
                    canvas2.drawRoundRect(uk1Var.N1, gl.L(f7), gl.L(f7), paint3);
                }
            }
        }
        if (i >= 0) {
            paint4.setAlpha(i);
            paint3.setAlpha(i2);
        }
    }

    public final void K(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.g2 != null && (tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            ImageReceiver imageReceiver = this.J;
            float L = (imageReceiver.M0 - gl.L(10.0f)) - gl.L(1.7f);
            int L2 = (int) (((((imageReceiver.L0 + imageReceiver.N0) + gl.L(10.0f)) + gl.L(1.9805f)) + gl.L(48.0f)) - gl.L(40.800003f));
            int i = (int) L;
            this.g2.setBounds(L2 - gl.L(39.0f), i, L2, gl.L(42.6f) + i);
            this.g2.draw(canvas);
        }
    }

    public final void L(Canvas canvas) {
        ColorFilter colorFilter;
        float f;
        int i;
        int i2;
        float f2;
        float f3;
        int i3;
        float L;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f4 = 2.0f;
        canvas2.translate(this.k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        cm cmVar = this.s0;
        if (staticLayout != null) {
            colorFilter = P(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        gm.drawAnimatedEmojis(canvas2, staticLayout, cmVar, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f5 = 4.0f;
        if (U()) {
            canvas2.save();
            xqa xqaVar = this.I0;
            float width = (getWidth() - xqaVar.T.f) / 2.0f;
            if (xqaVar.p) {
                L = gl.L(4.0f);
            } else {
                L = gl.L(16.0f) + this.T + this.P;
            }
            canvas2.translate(width, L);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        aub aubVar = this.o0;
        wjb wjbVar = this.h1;
        if (aubVar != null) {
            float alpha = getAlpha();
            if (wjbVar != null) {
                wjbVar.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                bkb.q(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (wjbVar != null) {
                wjbVar.b(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                bkb.q(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
            }
            float width2 = (getWidth() - this.j1) / 2.0f;
            float L2 = gl.L(4.0f) + gl.L(4.0f) + this.T + this.P + this.f;
            float L3 = (this.j1 - gl.L(4.0f)) / 2.0f;
            int i4 = 0;
            while (i4 < arrayList.size()) {
                wo0 wo0Var = (wo0) arrayList.get(i4);
                float a = wo0Var.a();
                float L4 = ((gl.L(f5) + L3) * i4) + width2;
                float f6 = L4 + L3;
                RectF rectF = this.d1;
                rectF.set(L4, L2, f6, wo0Var.f + L2);
                canvas2.save();
                if (a != 1.0f) {
                    f = f5;
                    canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
                } else {
                    f = f5;
                }
                float[] fArr = this.o2;
                Arrays.fill(fArr, gl.L(Math.min(6.75f, gba.V0)));
                if ((wo0Var.g & 9) == 9) {
                    float L5 = gl.L(gba.V0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((wo0Var.g & 10) == 10) {
                    float L6 = gl.L(gba.V0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.p2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, R("paintChatActionBackground"));
                if (T()) {
                    canvas2.drawPath(path, bkb.g2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                ff0 ff0Var = wo0Var.s;
                if (ff0Var != null) {
                    int i5 = (int) L2;
                    ff0Var.setBounds((int) L4, i5, (int) f6, wo0Var.f + i5);
                    wo0Var.s.setAlpha(255);
                    wo0Var.s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (wo0Var.t != null) {
                    i = gl.L(26.0f);
                } else {
                    i = 0;
                }
                float j = wo0Var.h.j();
                if (wo0Var.t != null) {
                    i2 = gl.L(f);
                } else {
                    i2 = 0;
                }
                float f7 = i;
                float z = oo1.z(L3 - (j + i2), f7, f4, L4);
                Drawable drawable = wo0Var.t;
                if (drawable != null) {
                    int i6 = (int) z;
                    f2 = f4;
                    drawable.setBounds(i6, (int) (((wo0Var.f - gl.L(24.0f)) / f4) + L2), gl.L(24.0f) + i6, gl.L(24.0f) + ((int) (((wo0Var.f - gl.L(24.0f)) / f2) + L2)));
                    Drawable drawable2 = wo0Var.t;
                    if (wo0Var.m) {
                        i3 = 128;
                    } else {
                        i3 = 255;
                    }
                    drawable2.setAlpha(i3);
                    wo0Var.t.draw(canvas2);
                    z += f7;
                } else {
                    f2 = f4;
                }
                wo0Var.h.p = Math.max(1, (((int) L3) - gl.L(15.0f)) - i);
                tgb tgbVar = wo0Var.h;
                float L7 = (gl.L(40.0f) / f2) + L2;
                if (wo0Var.m) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                tgbVar.f(canvas2, z, L7, f3);
                canvas2.restore();
                canvas2.restore();
                i4++;
                f5 = f;
                f4 = f2;
            }
        }
    }

    public final void M(Canvas canvas, boolean z) {
        if (this.s) {
            if (!T() || z) {
                if (!T() && z) {
                    return;
                }
            } else {
                return;
            }
        }
        O(canvas, z, null);
    }

    @Override
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        k27 k27Var = this.Q0;
        if (k27Var != null && k27Var.D == 11) {
            int size = k27Var.p0.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    photoSize = (TLRPC.PhotoSize) k27Var.p0.get(i);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.J.Z(this.y0, "g", gl5.f(photoSize, k27Var.n0), "50_50_b", this.M, 0L, null, k27Var, 1);
            up3.q(this.I).v(this);
        }
    }

    public final void O(Canvas canvas, boolean z, Integer num) {
        float f;
        Canvas canvas2;
        float f2 = 1.0f;
        if (z) {
            f = getAlpha();
        } else {
            f = 1.0f;
        }
        if (f > 0.0f) {
            wjb wjbVar = this.h1;
            if (wjbVar != null) {
                wjbVar.b(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                bkb.q(this.v0, this.u0 + gl.L(4.0f), getMeasuredWidth(), this.w0);
            }
            k27 k27Var = this.Q0;
            if (k27Var != null && k27Var.N5()) {
                i19 i19Var = this.F0;
                i19Var.getClass();
                i19Var.a = 1.0f;
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                tk1 tk1Var = this.x2;
                if (tk1Var.b) {
                    f2 = tk1Var.c;
                }
                i19Var.d(canvas2, f2, num);
                if (i < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    public final ColorFilter P(int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (i == this.w2 && (porterDuffColorFilter = this.v2) != null) {
            return porterDuffColorFilter;
        }
        this.w2 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.v2 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public final int Q(k27 k27Var) {
        int i;
        int i2 = this.i1;
        int i3 = k27Var.D;
        if (i3 == 37) {
            i2 = gl.L(52.0f);
        } else if (i3 == 21 || Z()) {
            i2 = gl.L(78.0f);
        }
        if (!Y() && (i = k27Var.D) != 34 && i != 35) {
            return i2;
        }
        return 0;
    }

    public Paint R(String str) {
        Paint paint;
        wjb wjbVar = this.h1;
        if (wjbVar != null) {
            paint = wjbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return bkb.T0(str);
    }

    public final float S(k27 k27Var) {
        na7 q1;
        String str;
        if (k27Var != null) {
            try {
                if (k27Var.D == 22 && (str = (q1 = na7.q1(this.I)).J2) != null && TextUtils.equals(k27Var.k.action.wallpaper.uploadingImage, str)) {
                    return q1.K2.r;
                }
                return 1.0f;
            } catch (Exception e) {
                fa4.g(e, true);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean T() {
        if (this.W0 == null) {
            wjb wjbVar = this.h1;
            if (wjbVar != null) {
                if (wjbVar.g()) {
                    return true;
                }
                return false;
            } else if (bkb.b1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean U() {
        xqa xqaVar = this.I0;
        if (xqaVar != null && xqaVar.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        TLRPC.Message message;
        k27 k27Var = this.Q0;
        if (k27Var != null && (message = k27Var.k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void W() {
        rk1 rk1Var = this.g1;
        if (rk1Var != null && rk1Var.l()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean X(k27 k27Var) {
        if (k27Var != null) {
            int i = k27Var.D;
            if (i == 30 || i == 18 || i == 25 || Z()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Y() {
        TLRPC.Message message;
        k27 k27Var = this.Q0;
        if (k27Var != null && (message = k27Var.k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        k27 k27Var;
        int i;
        if (!U() && this.P0 == null && (i = (k27Var = this.Q0).D) != 31 && i != 37 && i != 33 && i != 35 && i != 34 && i != 21 && i != 22 && !k27Var.y4()) {
            TLRPC.Message message = this.Q0.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    if (!((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low && !((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final boolean a0() {
        k27 k27Var = this.Q0;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return l7c.C(na7.q1(this.I).V1(Long.valueOf(this.Q0.k.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        rk1 rk1Var = this.g1;
        if (rk1Var != null) {
            rk1Var.y(this, reactionCount, z, f, f2);
        }
    }

    public final boolean c0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.d2) {
            long j = tL_messageActionStarGiftOnchainOffer.offer_id;
            Long l = (Long) vp7.a.get(Long.valueOf(j));
            if (l == null || l.longValue() <= SystemClock.elapsedRealtime() || !vp7.b.contains(Long.valueOf(j))) {
                int i = this.I;
                if (vp7.k(i, j) || vp7.m(i, j)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final CharSequence d0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = vp7.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = k96.M0(2131749559, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = k96.M0(2131749558, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = k96.M0(2131749563, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? k96.M0(2131749561, null) : max == 0 ? k96.M0(2131749560, null) : gl.T2(k96.a0(null, null, 2131749597, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
            }
        }
        if (charSequence == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append(charSequence);
        return spannableStringBuilder2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k27 k27Var;
        if (i == kk7.l1) {
            setSpoilersSuppressed(false);
        } else if (i != kk7.k4 && i != kk7.K3) {
            if (i == kk7.k1) {
                setSpoilersSuppressed(true);
            } else if (i != kk7.X2 && i != kk7.G3 && i != kk7.Y2) {
                if (i == kk7.x0) {
                    if (Objects.equals(objArr[0], y6c.h(this.I).c0) && (k27Var = this.Q0) != null) {
                        j0(k27Var, true);
                    }
                } else if (i == kk7.c4 && V()) {
                    this.s2 = null;
                    this.W = 0;
                    requestLayout();
                    invalidate();
                }
            } else {
                k27 k27Var2 = this.Q0;
                if (k27Var2 != null) {
                    j0(k27Var2, true);
                }
            }
        } else {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.U1) {
            float a = this.n.a(0.02f);
            canvas.save();
            canvas.scale(a, a, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e0(CharacterStyle characterStyle) {
        if (this.g1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.g1.o(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.y;
                if (uRLSpan instanceof g4c) {
                    TLObject tLObject = ((g4c) uRLSpan).c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        mm4.n(this.g1.v(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.y;
                if (uRLSpan2 instanceof g4c) {
                    TLObject tLObject2 = ((g4c) uRLSpan2).c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.g1.w((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.g1.A(this, this.Q0.N1());
            } else if (url.startsWith("http")) {
                d01.t(getContext(), url);
            } else {
                this.g1.C(Long.parseLong(url));
            }
        }
    }

    public final void f0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        k27 k27Var = this.Q0;
        TLRPC.MessageAction messageAction = k27Var.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (k27Var != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !a0()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            gl.d3(new fv0((gk7) this, (Object) tL_premiumGiftOption, str, (byte) 23));
        }
    }

    public final void g0() {
        TLRPC.Message message;
        k27 k27Var = this.Q0;
        if (k27Var != null && (message = k27Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            u2b u2bVar = this.e0;
            if (z) {
                Context context = getContext();
                TLRPC.Message message2 = this.Q0.k;
                int i = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                wjb wjbVar = u2bVar.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                jva.k1(context, false, 0L, this.I, starsTransaction, wjbVar);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.Q0.k;
                int i2 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                wjb wjbVar2 = u2bVar.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i2;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                jva.k1(context2, false, 0L, this.I, starsTransaction2, wjbVar2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.Q0.k;
                int i3 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                wjb wjbVar3 = u2bVar.J;
                TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
                starsTransaction3.title = null;
                starsTransaction3.description = null;
                starsTransaction3.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction3.peer = tL_starsTransactionPeer3;
                tL_starsTransactionPeer3.peer = peer5;
                starsTransaction3.date = i3;
                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                starsTransaction3.amount = tL_starsTonAmount;
                tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
                starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                jva.k1(context3, false, 0L, this.I, starsTransaction3, wjbVar3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    vqa vqaVar = new vqa(getContext(), this.I, k27.B0(this.Q0.k), this.h1, null);
                    vqaVar.l2(this.Q0, null);
                    vqaVar.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    d S = LaunchActivity.S();
                    if (S != null) {
                        ir2.v(null, 2131743641, u21.b0(S), 2131624021, 36);
                        return;
                    }
                    return;
                }
                vqa vqaVar2 = new vqa(getContext(), this.I, k27.B0(this.Q0.k), this.h1, null);
                vqaVar2.l2(this.Q0, null);
                vqaVar2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        vqa vqaVar3 = new vqa(getContext(), this.I, 0L, this.h1, null);
                        vqaVar3.m2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        vqaVar3.show();
                    }
                }
            }
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (U()) {
            int width = ((int) (getWidth() - (this.I0.T.f + gl.L(8.0f)))) / 2;
            if (this.I0.p) {
                return width;
            }
            return Math.min(this.b1, width);
        } else if (X(this.Q0)) {
            return ug8.g(getWidth(), this.j1, 2, this.k0 / 2);
        } else {
            int i = this.b1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i = Math.min((int) imageReceiver.L0, i);
            }
            return (this.k0 / 2) + i;
        }
    }

    @Override
    public int getBoundsRight() {
        if (U()) {
            int L = ((int) ((this.I0.T.f + gl.L(8.0f)) + getWidth())) / 2;
            if (this.I0.p) {
                return L;
            }
            return Math.max(this.c1, L);
        } else if (X(this.Q0)) {
            return ((getWidth() + this.j1) / 2) + (this.k0 / 2);
        } else {
            int i = this.c1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i = Math.max((int) imageReceiver.w(), i);
            }
            return (this.k0 / 2) + i;
        }
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public c27 getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public rk1 getDelegate() {
        return this.g1;
    }

    @Override
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override
    public k27 getMessageObject() {
        return this.Q0;
    }

    @Override
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public i19 getReactionsLayout() {
        return this.F0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public tk1 getTransitionParams() {
        return this.x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final boolean h0(float f, float f2, vm1 vm1Var) {
        if (V() && !this.Q0.O3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y = getY() + getPaddingTop() + getWalletActionTop();
            if (y >= f && y + gl.L(140.0f) <= f2) {
                nkc nkcVar = this.J0;
                oy8 oy8Var = nkcVar.l;
                if (nkcVar.i0 && nkcVar.j0 == null) {
                    nkcVar.i0 = false;
                    nkcVar.k0 = vm1Var;
                    nkcVar.K.e(true, 0.0f);
                    nkcVar.M = false;
                    nkcVar.N = 0L;
                    nkcVar.b();
                    nkcVar.g();
                    nkcVar.t = 18.0f;
                    nkcVar.u.z();
                    oy8Var.O(true, 0.0f);
                    oy8Var.start();
                    nkcVar.H = true;
                    float f3 = nkcVar.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nkcVar.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    nkcVar.j0.setInterpolator(s33.h);
                    nkcVar.j0.addUpdateListener(new rm1(nkcVar, f3, (byte) 7));
                    nkcVar.j0.addListener(new iab(nkcVar, (byte) 25));
                    nkcVar.j0.start();
                    nkcVar.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    ad7.Y(this.I).U1(k27.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public final void i0(int i, boolean z, boolean z2) {
        String u;
        int i2 = this.R0;
        if (i2 != i && i2 / 3600 != i / 3600) {
            if (z) {
                if (i == 2147483646) {
                    u = k96.M0(2131748300, "MessageScheduledUntilOnline");
                } else {
                    u = k96.a0("MessageScheduledOn", null, 2131748336, k96.u(i, false));
                }
            } else {
                u = k96.u(i, false);
            }
            this.R0 = i;
            CharSequence charSequence = this.S0;
            if (charSequence == null || !TextUtils.equals(u, charSequence)) {
                this.S0 = u;
                this.s2 = null;
                m0(z2);
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.u2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.t2 && getParent() != null) {
            View view2 = (View) getParent();
            if (view2.getParent() != null) {
                view2.invalidate();
                ((View) view2.getParent()).invalidate();
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final void j0(defpackage.k27 r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.j0(k27, boolean):void");
    }

    public final void k0(float f, int i) {
        this.x0 = true;
        this.w0 = i;
        this.u0 = f;
        this.v0 = 0.0f;
    }

    public final void l0() {
        if (this.c2 != null && this.d2 && this.Q0 != null) {
            boolean c0 = c0();
            boolean z = this.f2;
            if (c0 != z) {
                this.f2 = !z;
                final k27 k27Var = this.Q0;
                post(new Runnable(this) {
                    public final uk1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        k27 k27Var2 = k27Var;
                        uk1 uk1Var = this.b;
                        switch (b) {
                            case 0:
                                if (uk1Var.Q0 == k27Var2) {
                                    uk1Var.j0(k27Var2, true);
                                    uk1Var.requestLayout();
                                    return;
                                }
                                return;
                            default:
                                if (uk1Var.Q0 == k27Var2) {
                                    uk1Var.j0(k27Var2, true);
                                    uk1Var.requestLayout();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.d2 && this.Q0 != null && this.t1 != null) {
            HashMap hashMap = vp7.a;
            int i = tL_messageActionStarGiftOnchainOffer.expires_at;
            int i2 = this.I;
            int max = Math.max(0, i - ConnectionsManager.getInstance(i2).getCurrentTime());
            int i3 = this.e2;
            if (max <= 0) {
                if (i3 != 0) {
                    this.e2 = 0;
                    this.d2 = vp7.i(i2, this.c2);
                    final k27 k27Var2 = this.Q0;
                    post(new Runnable(this) {
                        public final uk1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r3;
                            k27 k27Var22 = k27Var2;
                            uk1 uk1Var = this.b;
                            switch (b) {
                                case 0:
                                    if (uk1Var.Q0 == k27Var22) {
                                        uk1Var.j0(k27Var22, true);
                                        uk1Var.requestLayout();
                                        return;
                                    }
                                    return;
                                default:
                                    if (uk1Var.Q0 == k27Var22) {
                                        uk1Var.j0(k27Var22, true);
                                        uk1Var.requestLayout();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (max != i3) {
                this.e2 = max;
                this.t1.a(this.t1.c, this.G1, d0(vp7.d(this.c2), this.c2));
            }
            postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final void m0(boolean z) {
        if (getMeasuredWidth() != 0) {
            H(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (!this.D0) {
            if (z) {
                gl.d3(new nk1(this, (byte) 0));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        x();
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        rk1 rk1Var;
        super.onAttachedToWindow();
        this.j2 = true;
        this.J.I();
        setStarsPaused(false);
        if (this.s && (rk1Var = this.g1) != null && !rk1Var.l()) {
            z = true;
        } else {
            z = false;
        }
        this.s0 = gm.update(0, this, z, this.s0, this.N);
        sk1 sk1Var = this.t1;
        if (sk1Var != null) {
            sk1Var.h = gm.update(0, (View) sk1Var.i, false, sk1Var.h, sk1Var.d);
        }
        int i = this.I;
        kk7.f(i).b(this, kk7.X2);
        kk7.f(i).b(this, kk7.Y2);
        kk7.f(i).b(this, kk7.G3);
        kk7.f(i).b(this, kk7.x0);
        kk7.f(i).b(this, kk7.c4);
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.K3);
        k27 k27Var = this.Q0;
        if (k27Var != null && k27Var.D == 21) {
            j0(k27Var, true);
        }
        xqa xqaVar = this.I0;
        if (xqaVar != null) {
            xqaVar.a();
        }
        i19 i19Var = this.F0;
        ArrayList arrayList = i19Var.s;
        i19Var.D = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((f19) arrayList.get(i2)).a();
        }
        aub aubVar = this.o0;
        if (aubVar != null) {
            aubVar.a();
        }
        xab xabVar = this.P0;
        if (xabVar != null) {
            xabVar.d.M(xabVar.b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j2 = false;
        int i = this.I;
        up3.q(i).v(this);
        this.J.K();
        setStarsPaused(true);
        this.D0 = false;
        gm.release(this, this.s0);
        sk1 sk1Var = this.t1;
        if (sk1Var != null) {
            gm.release(sk1Var.i, sk1Var.h);
        }
        kk7.f(i).n(this, kk7.X2);
        kk7.f(i).n(this, kk7.Y2);
        kk7.f(i).n(this, kk7.G3);
        kk7.f(i).n(this, kk7.x0);
        kk7.f(i).n(this, kk7.c4);
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.K3);
        this.e0.g();
        this.x2.a = false;
        xqa xqaVar = this.I0;
        if (xqaVar != null) {
            xqaVar.S = false;
            xqaVar.d.K();
            xqaVar.e.b();
            eu4 eu4Var = xqaVar.y;
            eu4Var.d.K();
            gm.release((View) null, eu4Var.q);
            eu4Var.q = null;
        }
        this.F0.p();
        aub aubVar = this.o0;
        if (aubVar != null) {
            aubVar.b();
        }
        xab xabVar = this.P0;
        if (xabVar != null) {
            xabVar.d.M(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        k27 k27Var = this.Q0;
        if (TextUtils.isEmpty(this.S0) && k27Var == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.s2;
        if (spannableStringBuilder == null) {
            if (!TextUtils.isEmpty(this.S0)) {
                charSequence = this.S0;
            } else {
                charSequence = k27Var.v;
            }
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new q1(this, characterStyle, (byte) 3), spanStart, spanEnd, 33);
            }
            this.s2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(spannableStringBuilder.toString());
        } else {
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mkc mkcVar;
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        nkc nkcVar = this.J0;
        if (nkcVar == null) {
            mkcVar = null;
        } else {
            mkcVar = nkcVar.m;
        }
        if (mkcVar != null) {
            mkcVar.layout(0, 0, gl.L(42.0f), gl.L(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.onMeasure(int, int):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean r() {
        rk1 rk1Var = this.g1;
        if (rk1Var != null) {
            return rk1Var.a0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            m0(false);
        }
    }

    public void setDelegate(rk1 rk1Var) {
        this.g1 = rk1Var;
    }

    public void setInvalidateColors(boolean z) {
        if (this.f1 == z) {
            return;
        }
        this.f1 = z;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.u2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.w = view;
    }

    public void setInvalidatesParent(boolean z) {
        this.t2 = z;
    }

    public void setMessageObject(k27 k27Var) {
        j0(k27Var, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.k2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i) {
        this.l2 = i;
    }

    public void setScrimReaction(Integer num) {
        this.F0.z = num;
    }

    public void setShowTopic(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            W();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        this.K0 = z;
        nkc nkcVar = this.J0;
        if (nkcVar != null) {
            nkcVar.n(z);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qla) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f) {
        setTranslationX((getTranslationX() - this.N0) + f);
        this.N0 = f;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && drawable != this.r && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void x() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.x():void");
    }

    public final boolean y(MotionEvent motionEvent) {
        int i;
        int i2;
        iq0 iq0Var;
        d dVar;
        k27 k27Var;
        TLRPC.Message message;
        int i3;
        d dVar2;
        k27 k27Var2;
        TLRPC.Message message2;
        int i4;
        TLRPC.Message message3;
        int f;
        long j;
        TLObject K0;
        String str;
        Context context;
        boolean z;
        String a0;
        int i5;
        SpannableStringBuilder T2;
        boolean z2;
        int i6;
        d dVar3;
        ArrayList arrayList = this.Y1;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            float width = (getWidth() - this.j1) / 2.0f;
            float f2 = 4.0f;
            float L = gl.L(4.0f) + gl.L(4.0f) + this.T + this.P + this.f;
            float L2 = (this.j1 - gl.L(4.0f)) / 2.0f;
            int action = motionEvent.getAction();
            wjb wjbVar = this.h1;
            if (action == 0) {
                this.r2 = -1;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    wo0 wo0Var = (wo0) arrayList.get(i7);
                    float L3 = ((gl.L(f2) + L2) * i7) + width;
                    RectF rectF = gl.P;
                    rectF.set(L3, L, L3 + L2, wo0Var.f + L);
                    float f3 = x;
                    float f4 = y;
                    if (rectF.contains(f3, f4)) {
                        this.r2 = i7;
                        W();
                        if (wo0Var.s == null) {
                            ff0 Y = bkb.Y(bkb.v0(bkb.dd, wjbVar), 6, 6);
                            wo0Var.s = Y;
                            Y.setCallback(this);
                        }
                        wo0Var.s.setHotspot(f3, f4);
                        wo0Var.s.setState(this.q2);
                        wo0Var.b(!wo0Var.m);
                        return true;
                    }
                    i7++;
                    f2 = 4.0f;
                }
                return false;
            } else if (motionEvent.getAction() == 1) {
                if (this.r2 != -1) {
                    playSoundEffect(0);
                    wo0 wo0Var2 = (wo0) arrayList.get(this.r2);
                    ff0 ff0Var = wo0Var2.s;
                    if (ff0Var != null) {
                        ff0Var.setState(StateSet.NOTHING);
                    }
                    wo0Var2.b(false);
                    if (this.g1 != null && !wo0Var2.m && (iq0Var = wo0Var2.j) != null) {
                        if (getMessageObject() != null) {
                            byte b = iq0Var.a;
                            if (b == 5) {
                                rk1 rk1Var = this.g1;
                                if (rk1Var != null) {
                                    dVar3 = rk1Var.v();
                                } else {
                                    dVar3 = null;
                                }
                                if (dVar3 != null && this.Q0 != null) {
                                    ij.s0(dVar3, k96.M0(2131749690, null), gl.T2(k96.a0(null, null, 2131749691, cf3.s(k27.B0(this.Q0.k)))), k96.M0(2131749692, null), true, new aj1(this, dVar3, (byte) 2));
                                }
                            } else if (b == 6) {
                                k27 k27Var3 = this.Q0;
                                if (k27Var3 != null && (message3 = k27Var3.k) != null) {
                                    TLRPC.MessageAction messageAction = message3.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                                        d Q = LaunchActivity.Q();
                                        Context context2 = getContext();
                                        long B0 = k27.B0(this.Q0.k);
                                        int e1 = this.Q0.e1();
                                        int[] iArr = lu4.G1;
                                        nj n = nj.n(tL_messageActionStarGiftPurchaseOffer.price);
                                        oj ojVar = n.a;
                                        int i8 = this.I;
                                        oj ojVar2 = oj.a;
                                        if (ojVar == ojVar2) {
                                            f = na7.q1(i8).k4.m.f();
                                        } else {
                                            f = na7.q1(i8).k4.n.f();
                                        }
                                        nj j2 = nj.j((n.b * f) / 1000, ojVar);
                                        TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(starGift.title);
                                        sb.append(" #");
                                        String m = ls6.m(starGift.num, ',', sb);
                                        if (B0 >= 0) {
                                            j = 0;
                                            K0 = na7.q1(i8).V1(Long.valueOf(B0));
                                        } else {
                                            j = 0;
                                            K0 = na7.q1(i8).K0(Long.valueOf(-B0));
                                        }
                                        String d = n.d();
                                        String d2 = j2.d();
                                        if (ojVar == oj.b) {
                                            str = m;
                                            context = context2;
                                            z = true;
                                        } else {
                                            str = m;
                                            context = context2;
                                            z = false;
                                        }
                                        LinearLayout j3 = de9.j(context, 1);
                                        j3.addView(new wpa(context, starGift, K0), nme.t(-1, -2, 48, 0, -4, 0, 0));
                                        TextView textView = new TextView(context);
                                        zkb.X(textView, bkb.i5, wjbVar);
                                        textView.setTextSize(1, 16.0f);
                                        if (ojVar == ojVar2) {
                                            a0 = k96.a0(null, null, 2131749668, d, cf3.s(B0), str, d2);
                                        } else {
                                            a0 = k96.a0(null, null, 2131749667, d, cf3.s(B0), str, d2);
                                        }
                                        textView.setText(gl.T2(a0));
                                        j3.addView(textView, nme.t(-1, -2, 48, 24, 4, 24, 4));
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        frameLayout.setClipChildren(false);
                                        frameLayout.setClipToPadding(false);
                                        mfb mfbVar = new mfb(context, wjbVar);
                                        frameLayout.addView(mfbVar, nme.e(-1, -1, 119));
                                        vqa.Z0(mfbVar, gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                        vqa.Z0(mfbVar, gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        vqa.Z0(mfbVar, gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                        j3.addView(frameLayout, nme.t(-1, -2, 48, 23, 16, 23, 4));
                                        nj k = nj.k(starGift.value_usd_amount / Math.pow(10.0d, ci0.h().g("USD")), ojVar);
                                        if (k.c() > 0.0d && starGift.value_usd_amount > j) {
                                            if (k.b >= j2.b) {
                                                int round = (int) Math.round((1.0d - (j2.c() / k.c())) * 100.0d);
                                                T2 = gl.T2(k96.a0(null, null, 2131749717, oo1.n(round, "%"), starGift.title));
                                                if (round > 10) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                i5 = 1;
                                            } else {
                                                i5 = 1;
                                                T2 = gl.T2(k96.a0(null, null, 2131749720, oo1.n((int) Math.round(((j2.c() / k.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                z2 = false;
                                            }
                                            TextView textView2 = new TextView(context);
                                            textView2.setTextSize(i5, 13.0f);
                                            textView2.setGravity(17);
                                            textView2.setText(T2);
                                            if (z2) {
                                                i6 = bkb.o7;
                                            } else {
                                                i6 = bkb.x6;
                                            }
                                            zkb.X(textView2, i6, wjbVar);
                                            j3.addView(textView2, nme.t(-1, -2, 49, 40, 12, 40, 9));
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                                        alertDialog$Builder.n(j3);
                                        alertDialog$Builder.j(jva.U0(k96.a0(null, null, 2131749685, d2), z), new bt3(e1, i8, Q));
                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                        alertDialog$Builder.a.show();
                                    }
                                }
                            } else {
                                int i9 = 2131745182;
                                if (b == 7) {
                                    rk1 rk1Var2 = this.g1;
                                    if (rk1Var2 != null) {
                                        dVar2 = rk1Var2.v();
                                    } else {
                                        dVar2 = null;
                                    }
                                    if (dVar2 != null && (k27Var2 = this.Q0) != null && (message2 = k27Var2.k) != null) {
                                        TLRPC.MessageAction messageAction2 = message2.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                                            if (tL_messageActionNoForwardsRequest.prev_value) {
                                                i9 = 2131745193;
                                            }
                                            String M0 = k96.M0(i9, null);
                                            if (tL_messageActionNoForwardsRequest.prev_value) {
                                                i4 = 2131745194;
                                            } else {
                                                i4 = 2131745183;
                                            }
                                            ij.s0(dVar2, M0, k96.M0(i4, null), k96.M0(2131745199, null), false, new Runnable(this) {
                                                public final uk1 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    byte b2 = r3;
                                                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = tL_messageActionNoForwardsRequest;
                                                    uk1 uk1Var = this.b;
                                                    switch (b2) {
                                                        case 0:
                                                            na7.q1(uk1Var.I).i5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                            return;
                                                        default:
                                                            na7.q1(uk1Var.I).i5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                            return;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                } else if (b == 8) {
                                    rk1 rk1Var3 = this.g1;
                                    if (rk1Var3 != null) {
                                        dVar = rk1Var3.v();
                                    } else {
                                        dVar = null;
                                    }
                                    if (dVar != null && (k27Var = this.Q0) != null && (message = k27Var.k) != null) {
                                        TLRPC.MessageAction messageAction3 = message.action;
                                        if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                            final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                            if (tL_messageActionNoForwardsRequest2.new_value) {
                                                i9 = 2131745193;
                                            }
                                            String M02 = k96.M0(i9, null);
                                            if (tL_messageActionNoForwardsRequest2.new_value) {
                                                i3 = 2131745192;
                                            } else {
                                                i3 = 2131745181;
                                            }
                                            ij.s0(dVar, M02, k96.M0(i3, null), k96.M0(2131745199, null), false, new Runnable(this) {
                                                public final uk1 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override
                                                public final void run() {
                                                    byte b2 = r3;
                                                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest22 = tL_messageActionNoForwardsRequest2;
                                                    uk1 uk1Var = this.b;
                                                    switch (b2) {
                                                        case 0:
                                                            na7.q1(uk1Var.I).i5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.prev_value, null);
                                                            return;
                                                        default:
                                                            na7.q1(uk1Var.I).i5(k27.B0(uk1Var.Q0.k), uk1Var.Q0.e1(), tL_messageActionNoForwardsRequest22.new_value, null);
                                                            return;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                        }
                        i2 = -1;
                    } else {
                        i2 = -1;
                    }
                    this.r2 = i2;
                    W();
                    return false;
                }
                return false;
            } else if (motionEvent.getAction() == 3 && (i = this.r2) != -1) {
                wo0 wo0Var3 = (wo0) arrayList.get(i);
                ff0 ff0Var2 = wo0Var3.s;
                if (ff0Var2 != null) {
                    ff0Var2.setState(StateSet.NOTHING);
                }
                wo0Var3.b(false);
                this.r2 = -1;
                W();
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    public final void z() {
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(this.b1, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void b(boolean z, boolean z2) {
    }

    @Override
    public final void i(long j, long j2) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    public uk1(Context context) {
        this(null, context, false);
    }
}
