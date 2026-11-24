package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
public abstract class ih3 extends FrameLayout implements jm7, g94 {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final eh3 F;
    public float F0;
    public final eh3 G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final zb1 J;
    public float J0;
    public hg5 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final yh4 M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final sc3 S;
    public final u46 T;
    public final io U;
    public final b6 V;
    public final ImageView W;
    public final fn0 a;
    public final ImageView a0;
    public final int b;
    public final tm b0;
    public final Drawable c;
    public final ArrayList c0;
    public final dh3 d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final nk3 f0;
    public CharSequence g0;
    public final ch3 h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public gh3 l0;
    public boolean m0;
    public u09 n;
    public boolean n0;
    public float o0;
    public int p0;
    public hh3 q0;
    public final ch3 r;
    public a r0;
    public final h4b s;
    public ow0 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final x03 x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public ih3(Context context, nk3 nk3Var, int i, int i2) {
        super(context);
        float f;
        this.a = new fn0(1, this, d53.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        aj3 aj3Var = (aj3) this;
        eh3 eh3Var = new eh3(aj3Var, false);
        this.F = eh3Var;
        eh3 eh3Var2 = new eh3(aj3Var, true);
        this.G = eh3Var2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        zb1 zb1Var = new zb1(this);
        this.J = zb1Var;
        this.O = -1.0f;
        this.P = -1;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = -1.0f;
        this.m0 = true;
        this.u0 = 1.0f;
        this.v0 = 0.95f;
        this.w0 = 0.9f;
        this.x0 = new x03((byte) 11);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        yh4 yh4Var = new yh4(this);
        this.M0 = yh4Var;
        this.b = i2;
        this.f = i;
        this.f0 = nk3Var;
        this.t0 = gm.L(68.0f);
        this.s = oc7.r1(i).N1();
        ch3 ch3Var = new ch3(aj3Var, context, (byte) 0);
        this.h = ch3Var;
        ch3Var.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        ch3Var.setClipToPadding(false);
        ch3Var.setClipChildren(false);
        zb1Var.h = new zg3(aj3Var, (byte) 0);
        jd jdVar = new jd(aj3Var, (byte) 27);
        zb1Var.l = true;
        zb1Var.j = jdVar;
        ch3Var.j(new ip2(aj3Var, (byte) 6));
        sc3 sc3Var = new sc3();
        this.S = sc3Var;
        sc3Var.C = false;
        sc3Var.n(150L);
        sc3Var.m = false;
        ch3Var.setItemAnimator(sc3Var);
        u46 u46Var = new u46(0, false);
        this.T = u46Var;
        ch3Var.setLayoutManager(u46Var);
        ch3Var.setOnItemClickListener(new u(aj3Var, (byte) 21));
        ch3Var.setOnItemLongClickListener(new wm2(aj3Var, (byte) 23));
        ch3Var.setAdapter(eh3Var);
        addView(ch3Var, qoe.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        io ioVar = new io(getContext(), true, true, false);
        this.U = ioVar;
        ioVar.setGravity(3);
        ioVar.setTextColor(getTextLogoColor());
        ioVar.setTypeface(gm.o());
        ioVar.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        if (!gm.O1() && getResources().getConfiguration().orientation == 2) {
            f = 18.0f;
        } else {
            f = 20.0f;
        }
        ioVar.setTextSize(gm.L(f));
        ioVar.setImportantForAccessibility(1);
        ioVar.setFocusableInTouchMode(true);
        addView(ioVar, qoe.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(jb6.M0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232793);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, qoe.c(22.0f, 90));
        tm tmVar = new tm(gm.L(26.0f), null);
        this.b0 = tmVar;
        tmVar.a = true;
        tmVar.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(tmVar);
        addView(imageView2, qoe.c(40.0f, 40));
        b6 b6Var = new b6(aj3Var, context, yh4Var);
        this.V = b6Var;
        addView(b6Var, qoe.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(1.0f));
        this.c = getContext().getDrawable(2131232233);
        ch3 ch3Var2 = new ch3(aj3Var, getContext(), (byte) 1);
        this.r = ch3Var2;
        getContext();
        ch3Var2.setLayoutManager(new u46(0, false));
        ch3Var2.i(new as1((byte) 1));
        ?? sc3Var2 = new sc3();
        this.d = sc3Var2;
        sc3Var2.C = false;
        sc3Var2.m = false;
        ch3Var2.setItemAnimator(sc3Var2);
        ch3Var2.setAdapter(eh3Var2);
        ch3Var2.setClipChildren(false);
        addView(ch3Var2, qoe.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public int getTextColor() {
        if (this.b == 0) {
            return f(cmb.z8);
        }
        return f(cmb.O8);
    }

    private int getTextLogoColor() {
        return f(cmb.Wl);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 1) {
            d();
        }
    }

    public final void b() {
        int i;
        this.O = 1.0f - gm.R1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
        d();
        float f = this.O;
        if (f == 1.0f) {
            i = 2;
        } else if (f != 0.0f) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.P != i) {
            this.P = i;
            if (i != 1 && this.L) {
                gm.c3(new xg3(this, (byte) 0));
            }
            int i2 = this.P;
            ch3 ch3Var = this.r;
            ch3 ch3Var2 = this.h;
            if (i2 == 0) {
                gm.d0(ch3Var2, new bn0((byte) 7));
                ch3Var.setVisibility(4);
                ch3Var2.setVisibility(0);
                if (System.currentTimeMillis() >= this.N0) {
                    this.N0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i3 = this.f;
                if (i2 == 1) {
                    ArrayList arrayList = this.R;
                    arrayList.clear();
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.y;
                        if (i4 >= arrayList2.size()) {
                            break;
                        }
                        if (((fh3) arrayList2.get(i4)).c != z8c.h(i3).e() || m()) {
                            arrayList.add(Long.valueOf(((fh3) arrayList2.get(i4)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i4++;
                    }
                    ch3Var.setVisibility(4);
                    ch3Var2.setVisibility(0);
                } else if (i2 == 2) {
                    ch3Var.setVisibility(0);
                    ch3Var2.setVisibility(4);
                    this.T.g1(0, 0);
                    ge7 ge7Var = oc7.r1(i3).N1().K;
                    gm.r(ge7Var);
                    ge7Var.run();
                    ow0 ow0Var = this.s0;
                    if (ow0Var != null) {
                        ow0Var.a();
                        this.s0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int M0;
        u46 u46Var = this.T;
        int M02 = u46Var.M0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        h4b h4bVar = this.s;
        boolean z = false;
        if (M02 > size || ((M0 = u46Var.M0() + 9) < arrayList.size() && h4bVar.D(0, ((fh3) arrayList.get(M0)).c) == 0)) {
            if (this.b == 1) {
                z = true;
            }
            if (z) {
                if (!h4bVar.z) {
                    return;
                }
            } else if (!h4bVar.p) {
                return;
            }
            h4bVar.S(z);
        }
    }

    public final void d() {
        int i;
        int i2;
        int i3;
        float a = pqe.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f = this.a.e;
        float f2 = 1.0f - f;
        float f3 = f * a;
        float f4 = f2 * a;
        int i4 = 8;
        io ioVar = this.U;
        if (ioVar != null) {
            ioVar.setAlpha(f3);
            if (f3 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            ioVar.setVisibility(i3);
        }
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setAlpha(f4);
            if (f4 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        ImageView imageView2 = this.a0;
        if (imageView2 != null) {
            imageView2.setAlpha(f4);
            if (f4 > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
        }
        b6 b6Var = this.V;
        if (b6Var != null) {
            b6Var.setAlpha(a);
            if (a > 0.0f) {
                i4 = 0;
            }
            b6Var.setVisibility(i4);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        if (i == nm7.z5 && this.m0) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            p(z, false);
            gm.c3(new xg3(this, (byte) 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih3.dispatchDraw(android.graphics.Canvas):void");
    }

    public final hh3 e(long j) {
        ch3 ch3Var;
        if (this.P == 2) {
            ch3Var = this.r;
        } else {
            ch3Var = this.h;
        }
        for (int i = 0; i < ch3Var.getChildCount(); i++) {
            View childAt = ch3Var.getChildAt(i);
            if (childAt instanceof hh3) {
                hh3 hh3Var = (hh3) childAt;
                if (hh3Var.F == j) {
                    return hh3Var;
                }
            }
        }
        return null;
    }

    public final int f(int i) {
        nk3 nk3Var = this.f0;
        if (nk3Var != null && nk3Var.getResourceProvider() != null) {
            return nk3Var.getThemedColor(i);
        }
        return cmb.w0(null, i, false);
    }

    public final boolean g() {
        int i = this.P;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.O;
    }

    public float getOverScrollCoef() {
        return this.u0;
    }

    public hg5 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (!this.s.I()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(z8c.h(this.f).n));
        this.f0.getOrCreateStoryViewer().K(getContext(), null, arrayList, 0, null, null, q4b.a(this.r), false);
    }

    public final void i(hh3 hh3Var, boolean z) {
        ValueAnimator valueAnimator;
        if ((!z || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && hh3Var != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z2 = hh3Var.G;
            h4b h4bVar = this.s;
            if (z2 && !h4bVar.I()) {
                if (!oc7.r1(this.f).e5()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (h4bVar.J(hh3Var.F) || h4bVar.L(hh3Var.F)) {
                TL_stories.PeerStories x = h4bVar.x(hh3Var.F);
                long j = hh3Var.F;
                ow0 ow0Var = this.s0;
                if (ow0Var != null) {
                    ow0Var.a();
                    this.s0 = null;
                }
                of2 of2Var = new of2(this, hh3Var, j, (byte) 20);
                if (z) {
                    of2Var.run();
                    return;
                }
                ow0 n = y4b.n(x, of2Var);
                hh3Var.e = n;
                this.s0 = n;
                if (n != null) {
                    h4bVar.g0(hh3Var.F, true);
                }
            }
        }
    }

    public final void j(long j) {
        ylb ylbVar;
        hh3 hh3Var;
        xy n;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        nk3 nk3Var = this.f0;
        int i2 = this.f;
        if (i == 0 && (n = oc7.r1(i2).N1().n()) != null && n.a(i2, 1)) {
            nk3Var.showDialog(new i46(n.b(), this.f, null, getContext(), this.f0));
            return;
        }
        int i3 = 0;
        while (true) {
            ch3 ch3Var = this.h;
            ylbVar = null;
            if (i3 < ch3Var.getChildCount()) {
                hh3Var = (hh3) ch3Var.getChildAt(i3);
                if (i == 0) {
                    if (hh3Var.G) {
                        break;
                    }
                    i3++;
                } else if (hh3Var.F == j) {
                    break;
                } else {
                    i3++;
                }
            } else {
                hh3Var = null;
                break;
            }
        }
        if (hh3Var == null) {
            return;
        }
        if (i != 0) {
            if (nk3Var != null) {
                ylbVar = nk3Var.getResourceProvider();
            }
            ylb ylbVar2 = ylbVar;
            he heVar = new he(3, ylbVar2, getContext());
            heVar.q(500L);
            oc7.r1(i2).N1().j(j, new s2c(this, heVar, j, hh3Var, (byte) 2), true, ylbVar2);
            return;
        }
        v9b.C(nk3Var.getParentActivity(), i2).Q(q9b.c(hh3Var));
    }

    public final boolean k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i < arrayList.size()) {
                if (((fh3) arrayList.get(i)).c == j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            u46 u46Var = this.T;
            if (i < u46Var.H0()) {
                u46Var.g1(i, 0);
                return true;
            } else if (i > u46Var.L0()) {
                u46Var.h1(i, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z, float f) {
        boolean z2;
        float f2;
        float f3;
        if (this.d0 != f) {
            this.d0 = f;
            b();
            if (f > this.C0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 != this.B0) {
                this.B0 = z2;
                AnimatorSet animatorSet = this.L0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.L0.cancel();
                    this.L0 = null;
                }
                float f4 = 1.0f;
                if (z) {
                    float f5 = this.e0;
                    if (z2) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f2);
                    this.D0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ih3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            ih3 ih3Var = this.b;
                            switch (b) {
                                case 0:
                                    ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.b();
                                    return;
                                case 1:
                                    ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.invalidate();
                                    return;
                            }
                        }
                    });
                    this.D0.setInterpolator(d53.h);
                    float f6 = this.d0;
                    if (z2) {
                        f3 = f6;
                    } else {
                        f3 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f6, f3);
                    this.G0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ih3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            ih3 ih3Var = this.b;
                            switch (b) {
                                case 0:
                                    ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.b();
                                    return;
                                case 1:
                                    ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ih3Var.invalidate();
                                    return;
                            }
                        }
                    });
                    this.G0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.L0 = animatorSet2;
                    animatorSet2.addListener(new y7((byte) 28, this, z2));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.D0);
                    arrayList.add(this.G0);
                    if (this.B0) {
                        this.L0.setDuration(1000L);
                        float f7 = this.e0;
                        if (!z2) {
                            f4 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f7, f4);
                        this.E0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ih3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                ih3 ih3Var = this.b;
                                switch (b) {
                                    case 0:
                                        ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ih3Var.b();
                                        return;
                                    case 1:
                                        ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ih3Var.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.v0);
                        this.K0 = overshootInterpolator;
                        this.E0.setInterpolator(overshootInterpolator);
                        this.E0.setDuration(750L);
                        arrayList.add(this.E0);
                    } else {
                        float f8 = this.e0;
                        if (!z2) {
                            f4 = 0.0f;
                        }
                        this.I0 = ValueAnimator.ofFloat(f8, f4);
                        this.I0.setInterpolator(new OvershootInterpolator(this.w0));
                        this.I0.setDuration(350L);
                        this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ih3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                ih3 ih3Var = this.b;
                                switch (b) {
                                    case 0:
                                        ih3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ih3Var.b();
                                        return;
                                    case 1:
                                        ih3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        ih3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        ih3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        ih3Var.invalidate();
                                        return;
                                }
                            }
                        });
                        arrayList.add(this.I0);
                    }
                    this.L0.playTogether(arrayList);
                    this.L0.start();
                    return;
                }
                if (!z2) {
                    f4 = 0.0f;
                }
                this.e0 = f4;
                b();
                gm.d0(this.h, new bn0((byte) 8));
            }
        }
    }

    public final boolean m() {
        long j = z8c.h(this.f).n;
        h4b h4bVar = this.s;
        if (!h4bVar.K(j)) {
            if (!h4bVar.I() || h4bVar.g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        hg5 hg5Var = this.K;
        if (hg5Var == null) {
            hg5 hg5Var2 = new hg5(getContext(), 1);
            hg5Var2.i(f(cmb.vj));
            hg5Var2.p(true);
            hg5Var2.L = Layout.Alignment.ALIGN_CENTER;
            hg5Var2.n(0.0f, 29.0f);
            this.K = hg5Var2;
            SpannableStringBuilder N2 = gm.N2(jb6.N0("StoriesPremiumHint2").replace('\n', ' '), cmb.wj, 0, new xg3(this, (byte) 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) N2.getSpans(0, N2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                N2.setSpan(new z5c(gm.o()), N2.getSpanStart(clickableSpanArr[0]), N2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            hg5 hg5Var3 = this.K;
            hg5Var3.h = hg5.a(N2, hg5Var3.getTextPaint());
            this.K.t(N2);
            this.K.setPadding(gm.L(8.0f), gm.L(24.0f), gm.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, qoe.e(-1, 150, 51));
            }
            hg5Var = this.K;
        }
        if (hg5Var != null) {
            if (hg5Var.W) {
                xx0.APP_ERROR.a();
            }
            this.K.v();
        }
    }

    public final void o() {
        j15 j15Var = y4b.b;
        if (j15Var != null) {
            j15Var.d(cmb.w0(null, cmb.bl, false), cmb.w0(null, cmb.cl, false), 0, 0);
        }
        j15 j15Var2 = y4b.c;
        if (j15Var2 != null) {
            j15Var2.d(cmb.w0(null, cmb.dl, false), cmb.w0(null, cmb.el, false), 0, 0);
        }
        j15[] j15VarArr = y4b.a;
        j15 j15Var3 = j15VarArr[0];
        if (j15Var3 != null) {
            j15Var3.d(cmb.w0(null, cmb.Zk, false), cmb.w0(null, cmb.al, false), 0, 0);
        }
        j15 j15Var4 = j15VarArr[1];
        if (j15Var4 != null) {
            j15Var4.d(cmb.w0(null, cmb.Xk, false), cmb.w0(null, cmb.Yk, false), 0, 0);
        }
        if (y4b.d != null) {
            int w0 = cmb.w0(null, cmb.nk, false);
            int w02 = cmb.w0(null, cmb.p7, false);
            y4b.d.d(on2.f(0.25f, w0, w02), w02, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        b6 b6Var = this.V;
        if (b6Var != null) {
            b6Var.b();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        gm.d0(this.h, new yg3(textColor, (byte) 0));
        gm.d0(this.r, new bn0((byte) 9));
        try {
            tm tmVar = this.b0;
            if (tmVar != null) {
                tmVar.k(Integer.valueOf(f(cmb.pi)));
            }
            ImageView imageView = this.a0;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        nm7.f(this.f).b(this, nm7.z5);
        yh4 yh4Var = this.M0;
        yh4Var.a = true;
        AnimatorSet animatorSet = (AnimatorSet) yh4Var.d;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.f).n(this, nm7.z5);
        yh4 yh4Var = this.M0;
        yh4Var.a = false;
        ((AnimatorSet) yh4Var.d).cancel();
        ow0 ow0Var = this.s0;
        if (ow0Var != null) {
            ow0Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (!gm.O1() && getResources().getConfiguration().orientation == 2) {
            f = 18.0f;
        } else {
            f = 20.0f;
        }
        this.U.setTextSize(gm.L(f));
        this.N = gm.L(70.0f);
        gm.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int size = this.E.size();
            int L = gm.L((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            ch3 ch3Var = this.r;
            int x = (int) (ch3Var.getX() + L);
            int y = (int) (ch3Var.getY() + ch3Var.getHeight());
            zb1 zb1Var = this.J;
            zb1Var.getClass();
            RectF rectF = gm.P;
            rectF.set((int) ch3Var.getX(), (int) ch3Var.getY(), x, y);
            zb1Var.i = false;
            zb1Var.c = 0;
            zb1Var.a(rectF);
            if (zb1Var.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z, boolean z2) {
        ArrayList arrayList;
        boolean z3;
        ArrayList arrayList2;
        String G;
        boolean z4;
        boolean z5;
        boolean z6;
        String M0;
        if ((this.P == 1 || this.o0 != 0.0f) && !z2) {
            this.L = true;
            return;
        }
        ArrayList arrayList3 = this.w;
        arrayList3.clear();
        ArrayList arrayList4 = this.y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.x;
        arrayList5.clear();
        ArrayList arrayList6 = this.E;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i = this.b;
        int i2 = this.f;
        h4b h4bVar = this.s;
        if (i != 1) {
            arrayList4.add(new fh3(z8c.h(i2).e()));
            arrayList = h4bVar.g;
        } else {
            arrayList = h4bVar.h;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long n = pg3.n(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (n != z8c.h(i2).e()) {
                arrayList4.add(new fh3(n));
            }
        }
        int size = arrayList4.size();
        if (!h4bVar.I()) {
            size--;
        }
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int max = Math.max(1, Math.max(h4bVar.C(z3), size));
        this.g0 = null;
        boolean H = h4bVar.H();
        io ioVar = this.U;
        if (H) {
            arrayList2 = arrayList4;
            if (h4bVar.L(z8c.h(i2).e())) {
                String M02 = jb6.M0(2131743487, null);
                if (M02.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilder = this.j0;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(M02);
                        r8c r8cVar = new r8c();
                        spannableStringBuilder.setSpan(r8cVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        r8cVar.a = ioVar;
                        r8cVar.n = true;
                        this.j0 = spannableStringBuilder;
                    }
                    this.g0 = spannableStringBuilder;
                } else {
                    this.g0 = M02;
                }
            } else {
                if (this.t0 < gm.L(50.0f)) {
                    M0 = null;
                } else {
                    M0 = jb6.M0(2131748058, null);
                }
                this.g0 = M0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.t0 < gm.L(50.0f)) {
                G = null;
            } else {
                G = jb6.G(max, "Stories", new Object[0]);
            }
            this.g0 = G;
        }
        if (!this.h0) {
            CharSequence charSequence = this.g0;
            if (z && !jb6.a0) {
                z6 = true;
            } else {
                z6 = false;
            }
            z4 = true;
            ioVar.c(charSequence, z6, true);
        } else {
            z4 = true;
        }
        if (TextUtils.isEmpty(this.g0) && !this.h0) {
            z5 = false;
        } else {
            z5 = z4;
        }
        this.a.a(z5, z);
        arrayList6.clear();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (((fh3) arrayList2.get(i4)).c != z8c.h(i2).n || m()) {
                arrayList6.add((fh3) arrayList2.get(i4));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        ch3 ch3Var = this.h;
        ch3 ch3Var2 = this.r;
        if (z) {
            if (this.P == 2) {
                ch3Var2.setItemAnimator(this.d);
                ch3Var.setItemAnimator(null);
            } else {
                ch3Var.setItemAnimator(this.S);
                ch3Var2.setItemAnimator(null);
            }
        } else {
            ch3Var.setItemAnimator(null);
            ch3Var2.setItemAnimator(null);
        }
        this.F.E(arrayList3, arrayList2);
        this.G.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(a aVar) {
        this.r0 = aVar;
    }

    public void setClipTop(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.M != i) {
            this.M = i;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f) {
        this.t0 = f;
    }

    public void setOverscroll(float f) {
        this.o0 = f / gm.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f) {
        l(true, f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        hg5 hg5Var = this.K;
        if (hg5Var != null) {
            hg5Var.setTranslationY(f);
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
