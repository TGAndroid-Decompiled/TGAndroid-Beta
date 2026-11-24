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
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
public class cm1 extends hg0 implements cr3, jm7, mk5 {
    public static final HashMap y2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public rna E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final l39 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public ysa I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public mmc J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final pc0 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final cd1 O1;
    public int P;
    public ycb P0;
    public boolean P1;
    public StaticLayout Q;
    public k47 Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public lx4 T0;
    public uib T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final cta W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public de Z1;
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
    public final v4b e0;
    public boolean e1;
    public int e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public boolean f2;
    public boolean g0;
    public zl1 g1;
    public rx4 g2;
    public int h;
    public boolean h0;
    public final ylb h1;
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
    public uib m1;
    public final Path m2;
    public final u51 n;
    public boolean n0;
    public StaticLayout n1;
    public final float[] n2;
    public bwb o0;
    public boolean o1;
    public final float[] o2;
    public final RectF p0;
    public boolean p1;
    public final Path p2;
    public final ArrayList q0;
    public int q1;
    public final int[] q2;
    public qa6 r;
    public final Stack r0;
    public final ln r1;
    public int r2;
    public final boolean s;
    public cn s0;
    public in3 s1;
    public SpannableStringBuilder s2;
    public TextPaint t0;
    public am1 t1;
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
    public uib x1;
    public final bm1 x2;
    public URLSpan y;
    public gn5 y0;
    public StaticLayout y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        y2 = hashMap;
        b10.q(1, hashMap, "1⃣", 3, "2⃣");
        b10.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public cm1(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.n = new u51(this);
        int i = z8c.t0;
        this.I = i;
        v4b v4bVar = new v4b(null, false);
        this.e0 = v4bVar;
        this.n0 = true;
        this.p0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Stack();
        this.F0 = new l39(this);
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
        this.r1 = new ln(this, 0L, 320L, d53.h);
        this.z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new cd1(this, (byte) 5);
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
        this.x2 = new bm1(this);
        v4bVar.a = false;
        this.s = z;
        this.h1 = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.q0(gm.u / 2);
        this.M = new pc0((ylb) null);
        this.x = er3.q(i).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(cmb.f0(cmb.p1(0.1f, -16777216), 7, gm.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        cta ctaVar = new cta(10);
        this.W1 = ctaVar;
        ctaVar.N = 100;
        ctaVar.I = false;
        ctaVar.L = true;
        ctaVar.G = false;
        ctaVar.J = true;
        ctaVar.H = true;
        ctaVar.r = (byte) 1;
        ctaVar.w = 0.98f;
        ctaVar.v = 0.98f;
        ctaVar.u = 0.98f;
        ctaVar.g = false;
        ctaVar.o = 0.0f;
        ctaVar.x = (short) 750;
        ctaVar.y = (short) 750;
        ctaVar.c();
    }

    public static SpannableStringBuilder E(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.F2(str, false, gm.L(6.0f), -gm.L(1.3f), 0.8f, 2131231199));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new fg3(gm.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            ul1.j();
            spannableStringBuilder.setSpan(ul1.g(gm.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float Z(StaticLayout staticLayout) {
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
        return gm.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z) {
        cta ctaVar = this.W1;
        boolean z2 = ctaVar.g;
        ArrayList arrayList = ctaVar.n;
        if (z == z2) {
            return;
        }
        ctaVar.g = z;
        if (z) {
            ctaVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            bta btaVar = (bta) arrayList.get(i);
            btaVar.a = (System.currentTimeMillis() - ctaVar.Q) + btaVar.a;
        }
        invalidate();
    }

    public final void B(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, String str, int i2, boolean z2) {
        ?? r4;
        int i3;
        int a;
        CharSequence charSequence4 = charSequence2;
        int L = i2 - gm.L(16.0f);
        k47 k47Var = this.Q0;
        if (k47Var != null && k47Var.D == 30) {
            L -= gm.L(16.0f);
        }
        int i4 = L;
        if (charSequence != null) {
            k47 k47Var2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (k47Var2 != null && k47Var2.D == 30) {
                textPaint.setTextSize(gm.L(14.0f));
            } else {
                textPaint.setTextSize(gm.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new z5c(gm.o()), 0, valueOf.length(), 33);
            r4 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r4 = 0;
            this.k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            uib uibVar = new uib(spannableStringBuilder, 10.0f, null);
            this.m1 = uibVar;
            uibVar.a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(O("paintChatActionText").getTextSize());
        } else {
            k47 k47Var3 = this.Q0;
            if (k47Var3 != null) {
                if (k47Var3.D == 35) {
                    textPaint2.setTextSize(gm.L(14.3f));
                } else if (X() || (i3 = this.Q0.D) == 30 || i3 == 18 || i3 == 31 || i3 == 37 || i3 == 33) {
                    textPaint2.setTextSize(gm.L(13.0f));
                }
            }
            textPaint2.setTextSize(gm.L(15.0f));
        }
        int L2 = i4 - gm.L(12.0f);
        k47 k47Var4 = this.Q0;
        if (k47Var4 != null && k47Var4.D == 22 && k47.B0(k47Var4.k) >= 0 && (a = hg5.a(charSequence4, textPaint2)) < L2 && a > L2 / 5.0f) {
            L2 = a;
        }
        am1 am1Var = this.t1;
        if (charSequence4 == null) {
            if (am1Var != null) {
                gn.release(am1Var.i, am1Var.h);
                this.t1 = null;
            }
            this.p1 = r4;
        } else {
            if (am1Var == null) {
                this.t1 = new am1(this);
            }
            try {
                charSequence4 = gw3.m(charSequence4, textPaint2.getFontMetricsInt(), r4, null, r4);
            } catch (Exception unused) {
            }
            this.t1.a(L2, textPaint2, charSequence4);
            if (z && this.t1.d.getLineCount() > 3) {
                this.p1 = !this.o1;
                this.q1 = this.t1.d.getLineBottom(2);
                this.x1 = new uib(jb6.M0(2131750198, null), textPaint2.getTextSize() / gm.p, gm.o());
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
                am1 am1Var2 = this.t1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r4, lineEnd);
                }
                am1Var2.a(L2, textPaint2, charSequence4);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new z5c(gm.o()), r4, valueOf2.length(), 33);
            boolean z3 = true;
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.y1 = staticLayout;
            if (!z2 || this.p1) {
                z3 = r4;
            }
            this.z1 = z3;
            this.E1 = Z(staticLayout);
        } else {
            this.y1 = null;
            this.z1 = r4;
            this.E1 = 0.0f;
        }
        if (str != null) {
            if (this.R1 == null) {
                this.R1 = new CornerPathEffect(gm.L(5.0f));
            }
            if (this.S1 == null) {
                Path path = new Path();
                this.S1 = path;
                rx4.d(path, 1.35f, r4);
            }
            uib uibVar2 = new uib(str, i, gm.o());
            this.T1 = uibVar2;
            uibVar2.p = gm.L(62.0f);
            return;
        }
        this.S1 = null;
        this.T1 = null;
    }

    public final void C(int r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.C(int, java.lang.CharSequence):void");
    }

    public final void F(Canvas canvas, boolean z) {
        cm1 cm1Var;
        Paint paint;
        Paint paint2;
        ylb ylbVar;
        float f;
        float f2;
        float f3;
        float f4;
        ylb ylbVar2;
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
        am1 am1Var;
        int i4;
        float L;
        mmc mmcVar;
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
        cm1 cm1Var2 = this;
        if (cm1Var2.s) {
            if (!cm1Var2.Q() || z) {
                if (!cm1Var2.Q() && z) {
                    return;
                }
            } else {
                return;
            }
        }
        Paint O = cm1Var2.O("paintChatActionBackground");
        Paint O2 = cm1Var2.O("paintChatActionBackgroundDarken");
        cm1Var2.t0 = (TextPaint) cm1Var2.O("paintChatActionText");
        int i19 = cm1Var2.U0;
        ylb ylbVar3 = cm1Var2.h1;
        if (i19 >= 0) {
            int v0 = cmb.v0(i19, ylbVar3);
            if (cm1Var2.W0 == null) {
                Paint paint6 = new Paint(1);
                cm1Var2.W0 = paint6;
                paint6.setColor(v0);
                TextPaint textPaint = new TextPaint(1);
                cm1Var2.X0 = textPaint;
                textPaint.setTypeface(gm.o());
                cm1Var2.X0.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
                cm1Var2.X0.setColor(cmb.v0(cm1Var2.V0, ylbVar3));
            }
            O = cm1Var2.W0;
            cm1Var2.t0 = cm1Var2.X0;
        }
        boolean z2 = cm1Var2.e1;
        Path path = cm1Var2.a1;
        if (z2) {
            cm1Var2.e1 = false;
            cm1Var2.b1 = cm1Var2.getWidth();
            cm1Var2.c1 = 0;
            StaticLayout staticLayout2 = cm1Var2.N;
            int measuredWidth = cm1Var2.getMeasuredWidth() / 2;
            int L3 = gm.L(4.0f);
            f2 = 6.0f;
            ArrayList arrayList3 = cm1Var2.Y0;
            arrayList3.clear();
            if (staticLayout2 == null) {
                lineCount = 0;
            } else {
                lineCount = staticLayout2.getLineCount();
            }
            f3 = 8.0f;
            int L4 = gm.L(11.0f);
            f = 4.0f;
            int L5 = gm.L(8.0f);
            int i20 = 0;
            f4 = 2.0f;
            int i21 = 0;
            while (i20 < lineCount) {
                ylb ylbVar4 = ylbVar3;
                int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i20));
                if (i20 != 0 && (i18 = i21 - ceil) > 0) {
                    i16 = ceil;
                    if (i18 <= (L4 * 1.5f) + L5) {
                        i17 = i21;
                        i20 = td4.g(i17, i20, 1, arrayList3);
                        i21 = i17;
                        ylbVar3 = ylbVar4;
                    }
                } else {
                    i16 = ceil;
                }
                i17 = i16;
                i20 = td4.g(i17, i20, 1, arrayList3);
                i21 = i17;
                ylbVar3 = ylbVar4;
            }
            ylbVar = ylbVar3;
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
            int L6 = gm.L(3.0f);
            int L7 = gm.L(6.0f);
            int i24 = L4 - L6;
            ArrayList arrayList4 = cm1Var2.Z0;
            arrayList4.clear();
            path.reset();
            float f10 = measuredWidth;
            path.moveTo(f10, L3);
            int i25 = i21;
            int i26 = 0;
            int i27 = 0;
            while (true) {
                rectF2 = cm1Var2.d1;
                if (i27 >= lineCount) {
                    break;
                }
                int intValue2 = ((Integer) arrayList3.get(i27)).intValue();
                int lineBottom = staticLayout2.getLineBottom(i27);
                int i28 = lineCount;
                int i29 = i28 - 1;
                if (i27 < i29) {
                    paint5 = O2;
                    i11 = ((Integer) arrayList3.get(i27 + 1)).intValue();
                } else {
                    paint5 = O2;
                    i11 = 0;
                }
                int i30 = lineBottom - i26;
                if (i27 == 0 || intValue2 > i25) {
                    i30 = gm.L(3.0f) + i30;
                }
                if (i27 == i29 || intValue2 > i11) {
                    i30 = gm.L(3.0f) + i30;
                }
                Paint paint7 = O;
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
                        x();
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
                    x();
                    path.arcTo(rectF2, -90.0f, 90.0f);
                }
                L3 += i30;
                if (i27 != i29 && intValue2 < i11) {
                    L3 -= gm.L(3.0f);
                    i30 -= gm.L(3.0f);
                }
                if (i27 != 0 && intValue2 < i25) {
                    L3 -= gm.L(3.0f);
                    i30 -= gm.L(3.0f);
                }
                arrayList4.add(Integer.valueOf(i30));
                if (i27 != i29 && intValue2 <= i11) {
                    if (intValue2 < i11) {
                        float f13 = f9 + i24;
                        rectF2.set(f13, L3 - i13, (i12 << 1) + f13, L3);
                        x();
                        path.arcTo(rectF2, 180.0f, -90.0f);
                    }
                } else {
                    rectF2.set((f9 - L6) - L4, L3 - (L4 << 1), f9 + i24, L3);
                    x();
                    path.arcTo(rectF2, 0.0f, 90.0f);
                }
                i27++;
                cm1Var2 = this;
                i25 = intValue2;
                i26 = lineBottom;
                lineCount = i28;
                O2 = paint5;
                O = paint7;
                staticLayout2 = staticLayout;
                arrayList3 = arrayList2;
            }
            paint = O;
            paint2 = O2;
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
                        x();
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
                    x();
                    path.arcTo(rectF2, 90.0f, 90.0f);
                }
                L3 -= ((Integer) arrayList4.get(i32)).intValue();
                if (i32 != 0 && intValue3 <= i5) {
                    if (intValue3 < i5) {
                        float f16 = f14 - i24;
                        rectF2.set(f16 - (i7 << 1), L3, f16, i9 + L3);
                        x();
                        path.arcTo(rectF2, 0.0f, -90.0f);
                    }
                } else {
                    rectF2.set(f14 - i24, L3, f14 + L6 + L4, (L4 << 1) + L3);
                    x();
                    path.arcTo(rectF2, 180.0f, 90.0f);
                }
                i32--;
                i31 = i8;
            }
            path.close();
            int measuredWidth2 = getMeasuredWidth() / 2;
            if (W() && !X()) {
                float f17 = measuredWidth2;
                cm1Var = this;
                rectF2.left = (f17 - (cm1Var.O / 2.0f)) - gm.L(17.0f);
                rectF2.top = L3;
                rectF2.right = (cm1Var.O / 2.0f) + f17 + gm.L(17.0f);
                rectF2.bottom = gm.L(28.0f) + L3 + cm1Var.P + cm1Var.R;
                path.reset();
                path.addRoundRect(rectF2, gm.L(15.0f), gm.L(15.0f), Path.Direction.CW);
                path.close();
            } else {
                cm1Var = this;
            }
        } else {
            cm1Var = cm1Var2;
            paint = O;
            paint2 = O2;
            ylbVar = ylbVar3;
            f = 4.0f;
            f2 = 6.0f;
            f3 = 8.0f;
            f4 = 2.0f;
        }
        if (!cm1Var.x0) {
            cm1Var.w0 = ((ViewGroup) cm1Var.getParent()).getMeasuredHeight();
        }
        if (ylbVar != null) {
            ylbVar2 = ylbVar;
            ylbVar2.b(cm1Var.v0, cm1Var.u0 + gm.L(f), cm1Var.getMeasuredWidth(), cm1Var.w0);
        } else {
            ylbVar2 = ylbVar;
            cmb.q(cm1Var.v0, cm1Var.u0 + gm.L(f), cm1Var.getMeasuredWidth(), cm1Var.w0);
        }
        boolean z3 = cm1Var instanceof ds1;
        if (z3 && !cmb.g1(ylbVar2)) {
            f5 = 0.75f;
        } else {
            f5 = 1.0f;
        }
        if (z && (cm1Var.getAlpha() != 1.0f || z3)) {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (cm1Var.getAlpha() * i * f5));
            paint3 = paint2;
            paint3.setAlpha((int) (cm1Var.getAlpha() * i2 * f5));
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
        k47 k47Var = cm1Var.Q0;
        Paint paint8 = cm1Var.i2;
        if (k47Var != null && k47Var.j2) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawPath(path, paint4);
            if (cm1Var.Q() && paint3.getAlpha() > 0) {
                canvas2.drawPath(path, paint3);
            }
            if (cm1Var.h2 > 0.0f) {
                int alpha = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (cm1Var.getAlpha() * alpha));
                }
                canvas2.drawPath(path, paint8);
                paint8.setAlpha(alpha);
            }
        }
        if (cm1Var.S()) {
            int width = cm1Var.getWidth();
            cm1Var.J0.getClass();
            float L8 = (width - gm.L(206.0f)) / f4;
            float walletActionTop = cm1Var.getWalletActionTop();
            cm1Var.J0.getClass();
            float L9 = gm.L(206.0f) + L8;
            if (cm1Var.J0.q0 == null) {
                L2 = gm.L(140.0f);
                f6 = 140.0f;
                f7 = 20.0f;
            } else {
                f6 = 140.0f;
                f7 = 20.0f;
                L2 = gm.L(150.0f) + ((int) Math.ceil(mmcVar.q0.h()));
            }
            RectF rectF3 = cm1Var.O0;
            rectF3.set(L8, walletActionTop, L9, L2 + walletActionTop);
            canvas2.save();
            cm1Var.J0.c(canvas2, L8, walletActionTop);
            canvas2.drawRoundRect(rectF3, gm.L(f7), gm.L(f7), paint4);
            if (cm1Var.Q() && paint3.getAlpha() > 0) {
                canvas2.drawRoundRect(rectF3, gm.L(f7), gm.L(f7), paint3);
            }
            f8 = 0.0f;
            if (cm1Var.h2 > 0.0f) {
                int alpha2 = paint8.getAlpha();
                if (z) {
                    paint8.setAlpha((int) (cm1Var.getAlpha() * alpha2));
                }
                canvas2.drawRoundRect(rectF3, gm.L(f7), gm.L(f7), paint8);
                paint8.setAlpha(alpha2);
            }
            canvas2.restore();
        } else {
            f6 = 140.0f;
            f7 = 20.0f;
            f8 = 0.0f;
        }
        k47 k47Var2 = cm1Var.Q0;
        if (cm1Var.R()) {
            float L10 = cm1Var.I0.T.f + gm.L(f3);
            float width2 = (cm1Var.getWidth() - L10) / f4;
            if (cm1Var.I0.p) {
                L = f8;
            } else {
                L = gm.L(12.0f) + cm1Var.T + cm1Var.P;
            }
            RectF rectF4 = gm.P;
            rectF4.set(width2, L, L10 + width2, cm1Var.I0.P + L + gm.L(f3));
            RectF rectF5 = cm1Var.N1;
            if (rectF5 == null) {
                rectF5 = new RectF();
                cm1Var.N1 = rectF5;
            }
            rectF5.set(rectF4);
            canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint4);
            if (cm1Var.Q()) {
                canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint3);
            }
        } else if (cm1Var.P0 != null) {
            float L11 = gm.L(174.0f);
            ycb ycbVar = cm1Var.P0;
            ycbVar.getClass();
            int L12 = gm.L(f6) + ((int) ycbVar.f.h());
            if (ycbVar.i) {
                i4 = gm.L(40.0f);
            } else {
                i4 = 0;
            }
            float f18 = L12 + i4;
            float width3 = (cm1Var.getWidth() - L11) / f4;
            RectF rectF6 = cm1Var.N1;
            if (rectF6 == null) {
                rectF6 = new RectF();
                cm1Var.N1 = rectF6;
            }
            rectF6.set(width3, gm.L(f), L11 + width3, gm.L(f) + f18);
            canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint4);
            if (cm1Var.Q()) {
                canvas2.drawRoundRect(cm1Var.N1, gm.L(16.0f), gm.L(16.0f), paint3);
            }
        } else if (cm1Var.U(k47Var2)) {
            float width4 = (cm1Var.getWidth() - cm1Var.j1) / f4;
            float f19 = cm1Var.T + cm1Var.P;
            if (cm1Var.X()) {
                float L13 = f19 + gm.L(f);
                rectF = gm.P;
                rectF.set(width4, L13, cm1Var.j1 + width4, cm1Var.f + L13);
            } else {
                float L14 = f19 + gm.L(12.0f);
                rectF = gm.P;
                float f20 = cm1Var.j1;
                rectF.set(width4, L14, width4 + f20, f20 + L14 + cm1Var.L1);
            }
            if (k47Var2 != null && k47Var2.D == 18 && !cm1Var.p1 && (am1Var = cm1Var.t1) != null && cm1Var.q1 > 0) {
                rectF.bottom = kt6.B(1.0f, cm1Var.r1.c, am1Var.d.getHeight() - cm1Var.q1, rectF.bottom);
            }
            RectF rectF7 = cm1Var.N1;
            if (rectF7 == null) {
                rectF7 = new RectF();
                cm1Var.N1 = rectF7;
            }
            rectF7.set(rectF);
            if (k47Var2 != null && (((i3 = k47Var2.D) == 33 || i3 == 35) && cm1Var.Z1 != null)) {
                float[] fArr = cm1Var.n2;
                Arrays.fill(fArr, gm.L(16.0f));
                float L15 = gm.L(f2);
                fArr[7] = L15;
                fArr[6] = L15;
                fArr[5] = L15;
                fArr[4] = L15;
                Path path2 = cm1Var.m2;
                path2.rewind();
                path2.addRoundRect(cm1Var.N1, fArr, Path.Direction.CW);
                canvas2.drawPath(path2, paint4);
                if (cm1Var.Q()) {
                    canvas2.drawPath(path2, paint3);
                }
            } else {
                canvas2.drawRoundRect(cm1Var.N1, gm.L(f7), gm.L(f7), paint4);
                if (cm1Var.Q()) {
                    canvas2.drawRoundRect(cm1Var.N1, gm.L(f7), gm.L(f7), paint3);
                }
            }
        }
        if (i >= 0) {
            paint4.setAlpha(i);
            paint3.setAlpha(i2);
        }
    }

    public final void G(Canvas canvas) {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.g2 != null && (tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            ImageReceiver imageReceiver = this.J;
            float L = (imageReceiver.M0 - gm.L(10.0f)) - gm.L(1.7f);
            int L2 = (int) (((((imageReceiver.L0 + imageReceiver.N0) + gm.L(10.0f)) + gm.L(1.9805f)) + gm.L(48.0f)) - gm.L(40.800003f));
            int i = (int) L;
            this.g2.setBounds(L2 - gm.L(39.0f), i, L2, gm.L(42.6f) + i);
            this.g2.draw(canvas);
        }
    }

    public final void H(Canvas canvas) {
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
        cn cnVar = this.s0;
        if (staticLayout != null) {
            colorFilter = K(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        gn.drawAnimatedEmojis(canvas2, staticLayout, cnVar, 0.0f, this.q0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f5 = 4.0f;
        if (R()) {
            canvas2.save();
            ysa ysaVar = this.I0;
            float width = (getWidth() - ysaVar.T.f) / 2.0f;
            if (ysaVar.p) {
                L = gm.L(4.0f);
            } else {
                L = gm.L(16.0f) + this.T + this.P;
            }
            canvas2.translate(width, L);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        bwb bwbVar = this.o0;
        ylb ylbVar = this.h1;
        if (bwbVar != null) {
            float alpha = getAlpha();
            if (ylbVar != null) {
                ylbVar.b(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            } else {
                cmb.q(this.v0, this.u0 + 0.0f, getMeasuredWidth(), this.w0);
            }
            this.o0.c(canvas, getWidth(), this.k0, 0.0f, 1.0f, alpha, this.n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (ylbVar != null) {
                ylbVar.b(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                cmb.q(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
            }
            float width2 = (getWidth() - this.j1) / 2.0f;
            float L2 = gm.L(4.0f) + gm.L(4.0f) + this.T + this.P + this.f;
            float L3 = (this.j1 - gm.L(4.0f)) / 2.0f;
            int i4 = 0;
            while (i4 < arrayList.size()) {
                wp0 wp0Var = (wp0) arrayList.get(i4);
                float a = wp0Var.a();
                float L4 = ((gm.L(f5) + L3) * i4) + width2;
                float f6 = L4 + L3;
                RectF rectF = this.d1;
                rectF.set(L4, L2, f6, wp0Var.f + L2);
                canvas2.save();
                if (a != 1.0f) {
                    f = f5;
                    canvas2.scale(a, a, rectF.centerX(), rectF.centerY());
                } else {
                    f = f5;
                }
                float[] fArr = this.o2;
                Arrays.fill(fArr, gm.L(Math.min(6.75f, gda.U0)));
                if ((wp0Var.g & 9) == 9) {
                    float L5 = gm.L(gda.U0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((wp0Var.g & 10) == 10) {
                    float L6 = gm.L(gda.U0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.p2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, O("paintChatActionBackground"));
                if (Q()) {
                    canvas2.drawPath(path, cmb.g2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                fg0 fg0Var = wp0Var.s;
                if (fg0Var != null) {
                    int i5 = (int) L2;
                    fg0Var.setBounds((int) L4, i5, (int) f6, wp0Var.f + i5);
                    wp0Var.s.setAlpha(255);
                    wp0Var.s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (wp0Var.t != null) {
                    i = gm.L(26.0f);
                } else {
                    i = 0;
                }
                float j = wp0Var.h.j();
                if (wp0Var.t != null) {
                    i2 = gm.L(f);
                } else {
                    i2 = 0;
                }
                float f7 = i;
                float z = aq1.z(L3 - (j + i2), f7, f4, L4);
                Drawable drawable = wp0Var.t;
                if (drawable != null) {
                    int i6 = (int) z;
                    f2 = f4;
                    drawable.setBounds(i6, (int) (((wp0Var.f - gm.L(24.0f)) / f4) + L2), gm.L(24.0f) + i6, gm.L(24.0f) + ((int) (((wp0Var.f - gm.L(24.0f)) / f2) + L2)));
                    Drawable drawable2 = wp0Var.t;
                    if (wp0Var.m) {
                        i3 = 128;
                    } else {
                        i3 = 255;
                    }
                    drawable2.setAlpha(i3);
                    wp0Var.t.draw(canvas2);
                    z += f7;
                } else {
                    f2 = f4;
                }
                wp0Var.h.p = Math.max(1, (((int) L3) - gm.L(15.0f)) - i);
                uib uibVar = wp0Var.h;
                float L7 = (gm.L(40.0f) / f2) + L2;
                if (wp0Var.m) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                uibVar.f(canvas2, z, L7, f3);
                canvas2.restore();
                canvas2.restore();
                i4++;
                f5 = f;
                f4 = f2;
            }
        }
    }

    public final void I(Canvas canvas, boolean z) {
        if (this.s) {
            if (!Q() || z) {
                if (!Q() && z) {
                    return;
                }
            } else {
                return;
            }
        }
        J(canvas, z, null);
    }

    public final void J(Canvas canvas, boolean z, Integer num) {
        float f;
        Canvas canvas2;
        float f2 = 1.0f;
        if (z) {
            f = getAlpha();
        } else {
            f = 1.0f;
        }
        if (f > 0.0f) {
            ylb ylbVar = this.h1;
            if (ylbVar != null) {
                ylbVar.b(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
            } else {
                cmb.q(this.v0, this.u0 + gm.L(4.0f), getMeasuredWidth(), this.w0);
            }
            k47 k47Var = this.Q0;
            if (k47Var != null && k47Var.N5()) {
                l39 l39Var = this.F0;
                l39Var.getClass();
                l39Var.a = 1.0f;
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                bm1 bm1Var = this.x2;
                if (bm1Var.b) {
                    f2 = bm1Var.c;
                }
                l39Var.d(canvas2, f2, num);
                if (i < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    public final ColorFilter K(int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (i == this.w2 && (porterDuffColorFilter = this.v2) != null) {
            return porterDuffColorFilter;
        }
        this.w2 = i;
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        this.v2 = porterDuffColorFilter2;
        return porterDuffColorFilter2;
    }

    public final int M(k47 k47Var) {
        int i;
        int i2 = this.i1;
        int i3 = k47Var.D;
        if (i3 == 37) {
            i2 = gm.L(52.0f);
        } else if (i3 == 21 || X()) {
            i2 = gm.L(78.0f);
        }
        if (!W() && (i = k47Var.D) != 34 && i != 35) {
            return i2;
        }
        return 0;
    }

    @Override
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        k47 k47Var = this.Q0;
        if (k47Var != null && k47Var.D == 11) {
            int size = k47Var.p0.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    photoSize = (TLRPC.PhotoSize) k47Var.p0.get(i);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.J.Z(this.y0, "g", gn5.f(photoSize, k47Var.n0), "50_50_b", this.M, 0L, null, k47Var, 1);
            er3.q(this.I).v(this);
        }
    }

    public Paint O(String str) {
        Paint paint;
        ylb ylbVar = this.h1;
        if (ylbVar != null) {
            paint = ylbVar.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return cmb.T0(str);
    }

    public final float P(k47 k47Var) {
        oc7 r1;
        String str;
        if (k47Var != null) {
            try {
                if (k47Var.D == 22 && (str = (r1 = oc7.r1(this.I)).J2) != null && TextUtils.equals(k47Var.k.action.wallpaper.uploadingImage, str)) {
                    return r1.K2.r;
                }
                return 1.0f;
            } catch (Exception e) {
                fc4.g(e, true);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean Q() {
        if (this.W0 == null) {
            ylb ylbVar = this.h1;
            if (ylbVar != null) {
                if (ylbVar.g()) {
                    return true;
                }
                return false;
            } else if (cmb.b1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean R() {
        ysa ysaVar = this.I0;
        if (ysaVar != null && ysaVar.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        TLRPC.Message message;
        k47 k47Var = this.Q0;
        if (k47Var != null && (message = k47Var.k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void T() {
        zl1 zl1Var = this.g1;
        if (zl1Var != null && zl1Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean U(k47 k47Var) {
        if (k47Var != null) {
            int i = k47Var.D;
            if (i == 30 || i == 18 || i == 25 || X()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean W() {
        TLRPC.Message message;
        k47 k47Var = this.Q0;
        if (k47Var != null && (message = k47Var.k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        k47 k47Var;
        int i;
        if (!R() && this.P0 == null && (i = (k47Var = this.Q0).D) != 31 && i != 37 && i != 33 && i != 35 && i != 34 && i != 21 && i != 22 && !k47Var.y4()) {
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

    public final boolean Y() {
        k47 k47Var = this.Q0;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return m9c.D(oc7.r1(this.I).W1(Long.valueOf(this.Q0.k.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final boolean a0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.d2) {
            long j = tL_messageActionStarGiftOnchainOffer.offer_id;
            Long l = (Long) yr7.a.get(Long.valueOf(j));
            if (l == null || l.longValue() <= SystemClock.elapsedRealtime() || !yr7.b.contains(Long.valueOf(j))) {
                int i = this.I;
                if (yr7.k(i, j) || yr7.m(i, j)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        zl1 zl1Var = this.g1;
        if (zl1Var != null) {
            zl1Var.y(this, reactionCount, z, f, f2);
        }
    }

    public final CharSequence c0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = yr7.a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = jb6.M0(2131749508, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = jb6.M0(2131749507, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = jb6.M0(2131749512, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? jb6.M0(2131749510, null) : max == 0 ? jb6.M0(2131749509, null) : gm.S2(jb6.a0(null, null, 2131749546, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
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

    public final void d0(CharacterStyle characterStyle) {
        if (this.g1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.g1.n(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.y;
                if (uRLSpan instanceof g6c) {
                    TLObject tLObject = ((g6c) uRLSpan).c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        no4.n(this.g1.w(), -this.g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.y;
                if (uRLSpan2 instanceof g6c) {
                    TLObject tLObject2 = ((g6c) uRLSpan2).c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.g1.x((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.g1.C(this, this.Q0.N1());
            } else if (url.startsWith("http")) {
                l11.u(getContext(), url);
            } else {
                this.g1.I(Long.parseLong(url));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k47 k47Var;
        if (i == nm7.m1) {
            setSpoilersSuppressed(false);
        } else if (i != nm7.m4 && i != nm7.L3) {
            if (i == nm7.l1) {
                setSpoilersSuppressed(true);
            } else if (i != nm7.Y2 && i != nm7.H3 && i != nm7.Z2) {
                if (i == nm7.y0) {
                    if (Objects.equals(objArr[0], z8c.h(this.I).c0) && (k47Var = this.Q0) != null) {
                        i0(k47Var, true);
                    }
                } else if (i == nm7.e4 && S()) {
                    this.s2 = null;
                    this.W = 0;
                    requestLayout();
                    invalidate();
                }
            } else {
                k47 k47Var2 = this.Q0;
                if (k47Var2 != null) {
                    i0(k47Var2, true);
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

    public final void e0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        k47 k47Var = this.Q0;
        TLRPC.MessageAction messageAction = k47Var.k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (k47Var != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Y()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.k.action).slug;
        }
        if (this.g1 != null) {
            gm.c3(new tv0(this, tL_premiumGiftOption, str));
        }
    }

    public final void f0() {
        TLRPC.Message message;
        k47 k47Var = this.Q0;
        if (k47Var != null && (message = k47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            v4b v4bVar = this.e0;
            if (z) {
                Context context = getContext();
                TLRPC.Message message2 = this.Q0.k;
                int i = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                ylb ylbVar = v4bVar.J;
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
                nxa.l1(context, false, 0L, this.I, starsTransaction, ylbVar);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.Q0.k;
                int i2 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                ylb ylbVar2 = v4bVar.J;
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
                nxa.l1(context2, false, 0L, this.I, starsTransaction2, ylbVar2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.Q0.k;
                int i3 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                ylb ylbVar3 = v4bVar.J;
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
                nxa.l1(context3, false, 0L, this.I, starsTransaction3, ylbVar3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    wsa wsaVar = new wsa(getContext(), this.I, k47.B0(this.Q0.k), this.h1, null);
                    wsaVar.l2(this.Q0, null);
                    wsaVar.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    d S = LaunchActivity.S();
                    if (S != null) {
                        ts2.u(null, 2131743567, c41.b0(S), 2131624021, 36);
                        return;
                    }
                    return;
                }
                wsa wsaVar2 = new wsa(getContext(), this.I, k47.B0(this.Q0.k), this.h1, null);
                wsaVar2.l2(this.Q0, null);
                wsaVar2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        wsa wsaVar3 = new wsa(getContext(), this.I, 0L, this.h1, null);
                        wsaVar3.m2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        wsaVar3.show();
                    }
                }
            }
        }
    }

    public final boolean g0(float f, float f2, ho1 ho1Var) {
        if (S() && !this.Q0.O3() && !this.Q0.k.premiumEffectWasPlayed) {
            float y = getY() + getPaddingTop() + getWalletActionTop();
            if (y >= f && y + gm.L(140.0f) <= f2) {
                mmc mmcVar = this.J0;
                p09 p09Var = mmcVar.l;
                if (mmcVar.i0 && mmcVar.j0 == null) {
                    mmcVar.i0 = false;
                    mmcVar.k0 = ho1Var;
                    mmcVar.K.e(true, 0.0f);
                    mmcVar.M = false;
                    mmcVar.N = 0L;
                    mmcVar.b();
                    mmcVar.g();
                    mmcVar.t = 18.0f;
                    mmcVar.u.z();
                    p09Var.O(true, 0.0f);
                    p09Var.start();
                    mmcVar.H = true;
                    float f3 = mmcVar.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mmcVar.j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    mmcVar.j0.setInterpolator(d53.h);
                    mmcVar.j0.addUpdateListener(new go1(mmcVar, f3, (byte) 7));
                    mmcVar.j0.addListener(new q7b(mmcVar, (byte) 27));
                    mmcVar.j0.start();
                    mmcVar.a.invalidate();
                    this.Q0.k.premiumEffectWasPlayed = true;
                    cf7.Y(this.I).U1(k47.B0(this.Q0.k), this.Q0.k);
                    return true;
                }
            }
        }
        return false;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (R()) {
            int width = ((int) (getWidth() - (this.I0.T.f + gm.L(8.0f)))) / 2;
            if (this.I0.p) {
                return width;
            }
            return Math.min(this.b1, width);
        } else if (U(this.Q0)) {
            return wi8.g(getWidth(), this.j1, 2, this.k0 / 2);
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
        if (R()) {
            int L = ((int) ((this.I0.T.f + gm.L(8.0f)) + getWidth())) / 2;
            if (this.I0.p) {
                return L;
            }
            return Math.max(this.c1, L);
        } else if (U(this.Q0)) {
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

    public c47 getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public zl1 getDelegate() {
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
    public k47 getMessageObject() {
        return this.Q0;
    }

    @Override
    public int getObserverTag() {
        return this.x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public l39 getReactionsLayout() {
        return this.F0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public bm1 getTransitionParams() {
        return this.x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(int i, boolean z, boolean z2) {
        String u;
        int i2 = this.R0;
        if (i2 != i && i2 / 3600 != i / 3600) {
            if (z) {
                if (i == 2147483646) {
                    u = jb6.M0(2131748249, "MessageScheduledUntilOnline");
                } else {
                    u = jb6.a0("MessageScheduledOn", null, 2131748285, jb6.u(i, false));
                }
            } else {
                u = jb6.u(i, false);
            }
            this.R0 = i;
            CharSequence charSequence = this.S0;
            if (charSequence == null || !TextUtils.equals(u, charSequence)) {
                this.S0 = u;
                this.s2 = null;
                l0(z2);
            }
        }
    }

    public final void i0(defpackage.k47 r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.i0(k47, boolean):void");
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

    public final void j0(float f, int i) {
        this.x0 = true;
        this.w0 = i;
        this.u0 = f;
        this.v0 = 0.0f;
    }

    public final void k0() {
        if (this.c2 != null && this.d2 && this.Q0 != null) {
            boolean a0 = a0();
            boolean z = this.f2;
            if (a0 != z) {
                this.f2 = !z;
                final k47 k47Var = this.Q0;
                post(new Runnable(this) {
                    public final cm1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        k47 k47Var2 = k47Var;
                        cm1 cm1Var = this.b;
                        switch (b) {
                            case 0:
                                if (cm1Var.Q0 == k47Var2) {
                                    cm1Var.i0(k47Var2, true);
                                    cm1Var.requestLayout();
                                    return;
                                }
                                return;
                            default:
                                if (cm1Var.Q0 == k47Var2) {
                                    cm1Var.i0(k47Var2, true);
                                    cm1Var.requestLayout();
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
            HashMap hashMap = yr7.a;
            int i = tL_messageActionStarGiftOnchainOffer.expires_at;
            int i2 = this.I;
            int max = Math.max(0, i - ConnectionsManager.getInstance(i2).getCurrentTime());
            int i3 = this.e2;
            if (max <= 0) {
                if (i3 != 0) {
                    this.e2 = 0;
                    this.d2 = yr7.i(i2, this.c2);
                    final k47 k47Var2 = this.Q0;
                    post(new Runnable(this) {
                        public final cm1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r3;
                            k47 k47Var22 = k47Var2;
                            cm1 cm1Var = this.b;
                            switch (b) {
                                case 0:
                                    if (cm1Var.Q0 == k47Var22) {
                                        cm1Var.i0(k47Var22, true);
                                        cm1Var.requestLayout();
                                        return;
                                    }
                                    return;
                                default:
                                    if (cm1Var.Q0 == k47Var22) {
                                        cm1Var.i0(k47Var22, true);
                                        cm1Var.requestLayout();
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
                this.t1.a(this.t1.c, this.G1, c0(yr7.d(this.c2), this.c2));
            }
            postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
        }
    }

    public final void l0(boolean z) {
        if (getMeasuredWidth() != 0) {
            C(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (!this.D0) {
            if (z) {
                gm.c3(new vl1(this, (byte) 0));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        v();
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        zl1 zl1Var;
        super.onAttachedToWindow();
        this.j2 = true;
        this.J.I();
        setStarsPaused(false);
        if (this.s && (zl1Var = this.g1) != null && !zl1Var.f()) {
            z = true;
        } else {
            z = false;
        }
        this.s0 = gn.update(0, this, z, this.s0, this.N);
        am1 am1Var = this.t1;
        if (am1Var != null) {
            am1Var.h = gn.update(0, (View) am1Var.i, false, am1Var.h, am1Var.d);
        }
        int i = this.I;
        nm7.f(i).b(this, nm7.Y2);
        nm7.f(i).b(this, nm7.Z2);
        nm7.f(i).b(this, nm7.H3);
        nm7.f(i).b(this, nm7.y0);
        nm7.f(i).b(this, nm7.e4);
        nm7.e().b(this, nm7.m4);
        nm7.e().b(this, nm7.L3);
        k47 k47Var = this.Q0;
        if (k47Var != null && k47Var.D == 21) {
            i0(k47Var, true);
        }
        ysa ysaVar = this.I0;
        if (ysaVar != null) {
            ysaVar.a();
        }
        l39 l39Var = this.F0;
        ArrayList arrayList = l39Var.s;
        l39Var.D = true;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((i39) arrayList.get(i2)).a();
        }
        bwb bwbVar = this.o0;
        if (bwbVar != null) {
            bwbVar.a();
        }
        ycb ycbVar = this.P0;
        if (ycbVar != null) {
            ycbVar.d.M(ycbVar.b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j2 = false;
        int i = this.I;
        er3.q(i).v(this);
        this.J.K();
        setStarsPaused(true);
        this.D0 = false;
        gn.release(this, this.s0);
        am1 am1Var = this.t1;
        if (am1Var != null) {
            gn.release(am1Var.i, am1Var.h);
        }
        nm7.f(i).n(this, nm7.Y2);
        nm7.f(i).n(this, nm7.Z2);
        nm7.f(i).n(this, nm7.H3);
        nm7.f(i).n(this, nm7.y0);
        nm7.f(i).n(this, nm7.e4);
        nm7.e().n(this, nm7.m4);
        nm7.e().n(this, nm7.L3);
        this.e0.g();
        this.x2.a = false;
        ysa ysaVar = this.I0;
        if (ysaVar != null) {
            ysaVar.S = false;
            ysaVar.d.K();
            ysaVar.e.b();
            gw4 gw4Var = ysaVar.y;
            gw4Var.d.K();
            gn.release((View) null, gw4Var.q);
            gw4Var.q = null;
        }
        this.F0.p();
        bwb bwbVar = this.o0;
        if (bwbVar != null) {
            bwbVar.b();
        }
        ycb ycbVar = this.P0;
        if (ycbVar != null) {
            ycbVar.d.M(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        k47 k47Var = this.Q0;
        if (TextUtils.isEmpty(this.S0) && k47Var == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.s2;
        if (spannableStringBuilder == null) {
            if (!TextUtils.isEmpty(this.S0)) {
                charSequence = this.S0;
            } else {
                charSequence = k47Var.v;
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
        lmc lmcVar;
        RectF rectF = this.p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        mmc mmcVar = this.J0;
        if (mmcVar == null) {
            lmcVar = null;
        } else {
            lmcVar = mmcVar.m;
        }
        if (lmcVar != null) {
            lmcVar.layout(0, 0, gm.L(42.0f), gm.L(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.onMeasure(int, int):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean q() {
        zl1 zl1Var = this.g1;
        if (zl1Var != null) {
            return zl1Var.j0(this, this.z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            l0(false);
        }
    }

    public void setDelegate(zl1 zl1Var) {
        this.g1 = zl1Var;
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

    public void setMessageObject(k47 k47Var) {
        i0(k47Var, false);
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
            T();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        this.K0 = z;
        mmc mmcVar = this.J0;
        if (mmcVar != null) {
            mmcVar.n(z);
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rna) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f) {
        setTranslationX((getTranslationX() - this.N0) + f);
        this.N0 = f;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && drawable != this.r && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final boolean w(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm1.w(android.view.MotionEvent):boolean");
    }

    public final void x() {
        RectF rectF = this.d1;
        this.b1 = (int) Math.min(this.b1, rectF.left);
        this.c1 = (int) Math.max(this.c1, rectF.right);
    }

    public final boolean y(float f, int i) {
        l39 l39Var = this.F0;
        if (!l39Var.H) {
            return false;
        }
        float y = getY() + l39Var.c;
        if (y <= f || (y + l39Var.m) - gm.L(16.0f) >= i) {
            return false;
        }
        return true;
    }

    public final void z() {
        String str;
        String M0;
        String G;
        SpannableStringBuilder spannableStringBuilder;
        String a0;
        int L = this.j1 - gm.L(16.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(gm.L(14.0f));
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(gm.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.k.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat L0 = oc7.r1(this.I).L0(Long.valueOf(-pg3.n(tL_messageActionGiftCode.boost_peer)));
        if (L0 == null) {
            str = null;
        } else {
            str = L0.title;
        }
        boolean z = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            M0 = jb6.M0(2131753141, "BoostingUnclaimedPrize");
        } else {
            M0 = jb6.M0(2131753507, "BoostingCongratulations");
        }
        if (i == 12) {
            G = jb6.G(1, "BoldYears", new Object[0]);
        } else {
            G = jb6.G(i, "BoldMonths", new Object[0]);
        }
        if (z) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0(null, null, 2131753131, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                kt6.t(null, null, 2131753140, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0(null, null, 2131753272, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                kt6.t(null, null, 2131753273, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a0 = jb6.M0(2131753275, null);
            } else {
                a0 = jb6.a0("BoostingReceivedGiftFrom", null, 2131753276, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(gm.S2(a0));
            spannableStringBuilder.append((CharSequence) "\n\n");
            kt6.t(null, null, 2131753277, new Object[]{G}, spannableStringBuilder);
        }
        String M02 = jb6.M0(2131753274, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new z5c(gm.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.m1 = null;
        am1 am1Var = this.t1;
        if (am1Var != null) {
            gn.release(am1Var.i, am1Var.h);
        }
        am1 am1Var2 = new am1(this);
        this.t1 = am1Var2;
        am1Var2.a(L, textPaint2, spannableStringBuilder);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M02);
        valueOf2.setSpan(new z5c(gm.o()), 0, valueOf2.length(), 33);
        this.p1 = false;
        this.q1 = 0;
        this.x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.y1 = staticLayout;
        this.z1 = true;
        this.E1 = Z(staticLayout);
    }

    @Override
    public final void A(boolean z) {
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

    public cm1(Context context) {
        this(null, context, false);
    }
}
