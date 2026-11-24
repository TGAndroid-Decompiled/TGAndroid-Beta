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
public abstract class vf3 extends FrameLayout implements gk7, x74 {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final rf3 F;
    public float F0;
    public final rf3 G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final ra1 J;
    public float J0;
    public je5 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final xf4 M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final gb3 S;
    public final t26 T;
    public final hn U;
    public final b6 V;
    public final ImageView W;
    public final fm0 a;
    public final ImageView a0;
    public final int b;
    public final tl b0;
    public final Drawable c;
    public final ArrayList c0;
    public final qf3 d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final cj3 f0;
    public CharSequence g0;
    public final pf3 h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public tf3 l0;
    public boolean m0;
    public ty8 n;
    public boolean n0;
    public float o0;
    public int p0;
    public uf3 q0;
    public final pf3 r;
    public a r0;
    public final g2b s;
    public ev0 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final mz2 x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public vf3(Context context, cj3 cj3Var, int i, int i2) {
        super(context);
        float f;
        this.a = new fm0(1, this, s33.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        oh3 oh3Var = (oh3) this;
        rf3 rf3Var = new rf3(oh3Var, false);
        this.F = rf3Var;
        rf3 rf3Var2 = new rf3(oh3Var, true);
        this.G = rf3Var2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        ra1 ra1Var = new ra1(this);
        this.J = ra1Var;
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
        this.x0 = new mz2((byte) 11);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        xf4 xf4Var = new xf4(this);
        this.M0 = xf4Var;
        this.b = i2;
        this.f = i;
        this.f0 = cj3Var;
        this.t0 = gl.L(68.0f);
        this.s = na7.q1(i).M1();
        pf3 pf3Var = new pf3(oh3Var, context, (byte) 0);
        this.h = pf3Var;
        pf3Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        pf3Var.setClipToPadding(false);
        pf3Var.setClipChildren(false);
        ra1Var.h = new mf3(oh3Var, (byte) 0);
        jc jcVar = new jc(oh3Var, (byte) 27);
        ra1Var.l = true;
        ra1Var.j = jcVar;
        pf3Var.j(new ao2(oh3Var, (byte) 5));
        gb3 gb3Var = new gb3();
        this.S = gb3Var;
        gb3Var.C = false;
        gb3Var.n(150L);
        gb3Var.m = false;
        pf3Var.setItemAnimator(gb3Var);
        t26 t26Var = new t26(0, false);
        this.T = t26Var;
        pf3Var.setLayoutManager(t26Var);
        pf3Var.setOnItemClickListener(new u(oh3Var, (byte) 20));
        pf3Var.setOnItemLongClickListener(new vu2(oh3Var, (byte) 20));
        pf3Var.setAdapter(rf3Var);
        addView(pf3Var, nme.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        hn hnVar = new hn(getContext(), true, true, false);
        this.U = hnVar;
        hnVar.setGravity(3);
        hnVar.setTextColor(getTextLogoColor());
        hnVar.setTypeface(gl.o());
        hnVar.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        if (!gl.O1() && getResources().getConfiguration().orientation == 2) {
            f = 18.0f;
        } else {
            f = 20.0f;
        }
        hnVar.setTextSize(gl.L(f));
        hnVar.setImportantForAccessibility(1);
        hnVar.setFocusableInTouchMode(true);
        addView(hnVar, nme.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(k96.M0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232780);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, nme.c(22.0f, 90));
        tl tlVar = new tl(gl.L(26.0f), null);
        this.b0 = tlVar;
        tlVar.a = true;
        tlVar.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(tlVar);
        addView(imageView2, nme.c(40.0f, 40));
        b6 b6Var = new b6(oh3Var, context, xf4Var);
        this.V = b6Var;
        addView(b6Var, nme.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(1.0f));
        this.c = getContext().getDrawable(2131232232);
        pf3 pf3Var2 = new pf3(oh3Var, getContext(), (byte) 1);
        this.r = pf3Var2;
        getContext();
        pf3Var2.setLayoutManager(new t26(0, false));
        pf3Var2.i(new oq1((byte) 1));
        ?? gb3Var2 = new gb3();
        this.d = gb3Var2;
        gb3Var2.C = false;
        gb3Var2.m = false;
        pf3Var2.setItemAnimator(gb3Var2);
        pf3Var2.setAdapter(rf3Var2);
        pf3Var2.setClipChildren(false);
        addView(pf3Var2, nme.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        q(false, false);
    }

    public int getTextColor() {
        if (this.b == 0) {
            return f(bkb.z8);
        }
        return f(bkb.O8);
    }

    private int getTextLogoColor() {
        return f(bkb.Wl);
    }

    public final void b() {
        int i;
        this.O = 1.0f - gl.R1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
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
                gl.d3(new kf3(this, (byte) 0));
            }
            int i2 = this.P;
            pf3 pf3Var = this.r;
            pf3 pf3Var2 = this.h;
            if (i2 == 0) {
                gl.d0(pf3Var2, new bm0((byte) 7));
                pf3Var.setVisibility(4);
                pf3Var2.setVisibility(0);
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
                        if (((sf3) arrayList2.get(i4)).c != y6c.h(i3).e() || m()) {
                            arrayList.add(Long.valueOf(((sf3) arrayList2.get(i4)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i4++;
                    }
                    pf3Var.setVisibility(4);
                    pf3Var2.setVisibility(0);
                } else if (i2 == 2) {
                    pf3Var.setVisibility(0);
                    pf3Var2.setVisibility(4);
                    this.T.g1(0, 0);
                    on7 on7Var = na7.q1(i3).M1().K;
                    gl.r(on7Var);
                    on7Var.run();
                    ev0 ev0Var = this.s0;
                    if (ev0Var != null) {
                        ev0Var.a();
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
        t26 t26Var = this.T;
        int M02 = t26Var.M0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        g2b g2bVar = this.s;
        boolean z = false;
        if (M02 > size || ((M0 = t26Var.M0() + 9) < arrayList.size() && g2bVar.D(0, ((sf3) arrayList.get(M0)).c) == 0)) {
            if (this.b == 1) {
                z = true;
            }
            if (z) {
                if (!g2bVar.z) {
                    return;
                }
            } else if (!g2bVar.p) {
                return;
            }
            g2bVar.S(z);
        }
    }

    public final void d() {
        int i;
        int i2;
        int i3;
        float a = moe.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f = this.a.e;
        float f2 = 1.0f - f;
        float f3 = f * a;
        float f4 = f2 * a;
        int i4 = 8;
        hn hnVar = this.U;
        if (hnVar != null) {
            hnVar.setAlpha(f3);
            if (f3 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            hnVar.setVisibility(i3);
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
        if (i == kk7.x5 && this.m0) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            q(z, false);
            gl.d3(new kf3(this, (byte) 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf3.dispatchDraw(android.graphics.Canvas):void");
    }

    public final uf3 e(long j) {
        pf3 pf3Var;
        if (this.P == 2) {
            pf3Var = this.r;
        } else {
            pf3Var = this.h;
        }
        for (int i = 0; i < pf3Var.getChildCount(); i++) {
            View childAt = pf3Var.getChildAt(i);
            if (childAt instanceof uf3) {
                uf3 uf3Var = (uf3) childAt;
                if (uf3Var.F == j) {
                    return uf3Var;
                }
            }
        }
        return null;
    }

    public final int f(int i) {
        cj3 cj3Var = this.f0;
        if (cj3Var != null && cj3Var.getResourceProvider() != null) {
            return cj3Var.getThemedColor(i);
        }
        return bkb.w0(null, i, false);
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

    public je5 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (!this.s.I()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(y6c.h(this.f).n));
        this.f0.getOrCreateStoryViewer().K(getContext(), null, arrayList, 0, null, null, p2b.a(this.r), false);
    }

    public final void i(uf3 uf3Var, boolean z) {
        ValueAnimator valueAnimator;
        if ((!z || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && uf3Var != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z2 = uf3Var.G;
            g2b g2bVar = this.s;
            if (z2 && !g2bVar.I()) {
                if (!na7.q1(this.f).b5()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (g2bVar.J(uf3Var.F) || g2bVar.L(uf3Var.F)) {
                TL_stories.PeerStories x = g2bVar.x(uf3Var.F);
                long j = uf3Var.F;
                ev0 ev0Var = this.s0;
                if (ev0Var != null) {
                    ev0Var.a();
                    this.s0 = null;
                }
                de2 de2Var = new de2(this, uf3Var, j, (byte) 20);
                if (z) {
                    de2Var.run();
                    return;
                }
                ev0 n = x2b.n(x, de2Var);
                uf3Var.e = n;
                this.s0 = n;
                if (n != null) {
                    g2bVar.g0(uf3Var.F, true);
                }
            }
        }
    }

    public final void j(long j) {
        wjb wjbVar;
        uf3 uf3Var;
        wx n;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        cj3 cj3Var = this.f0;
        int i2 = this.f;
        if (i == 0 && (n = na7.q1(i2).M1().n()) != null && n.a(i2, 1)) {
            cj3Var.showDialog(new h26(n.b(), this.f, null, getContext(), this.f0));
            return;
        }
        int i3 = 0;
        while (true) {
            pf3 pf3Var = this.h;
            wjbVar = null;
            if (i3 < pf3Var.getChildCount()) {
                uf3Var = (uf3) pf3Var.getChildAt(i3);
                if (i == 0) {
                    if (uf3Var.G) {
                        break;
                    }
                    i3++;
                } else if (uf3Var.F == j) {
                    break;
                } else {
                    i3++;
                }
            } else {
                uf3Var = null;
                break;
            }
        }
        if (uf3Var == null) {
            return;
        }
        if (i != 0) {
            if (cj3Var != null) {
                wjbVar = cj3Var.getResourceProvider();
            }
            wjb wjbVar2 = wjbVar;
            hd hdVar = new hd(3, wjbVar2, getContext());
            hdVar.q(500L);
            na7.q1(i2).M1().j(j, new s0c(this, hdVar, j, uf3Var, (byte) 2), true, wjbVar2);
            return;
        }
        t7b.C(cj3Var.getParentActivity(), i2).Q(o7b.c(uf3Var));
    }

    public final boolean k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i < arrayList.size()) {
                if (((sf3) arrayList.get(i)).c == j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            t26 t26Var = this.T;
            if (i < t26Var.H0()) {
                t26Var.g1(i, 0);
                return true;
            } else if (i > t26Var.L0()) {
                t26Var.h1(i, 0, true);
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
                        public final vf3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            vf3 vf3Var = this.b;
                            switch (b) {
                                case 0:
                                    vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.b();
                                    return;
                                case 1:
                                    vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.invalidate();
                                    return;
                            }
                        }
                    });
                    this.D0.setInterpolator(s33.h);
                    float f6 = this.d0;
                    if (z2) {
                        f3 = f6;
                    } else {
                        f3 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f6, f3);
                    this.G0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final vf3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            vf3 vf3Var = this.b;
                            switch (b) {
                                case 0:
                                    vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.b();
                                    return;
                                case 1:
                                    vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vf3Var.invalidate();
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
                            public final vf3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                vf3 vf3Var = this.b;
                                switch (b) {
                                    case 0:
                                        vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vf3Var.b();
                                        return;
                                    case 1:
                                        vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vf3Var.invalidate();
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
                            public final vf3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                vf3 vf3Var = this.b;
                                switch (b) {
                                    case 0:
                                        vf3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vf3Var.b();
                                        return;
                                    case 1:
                                        vf3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        vf3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        vf3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vf3Var.invalidate();
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
                gl.d0(this.h, new bm0((byte) 8));
            }
        }
    }

    public final boolean m() {
        long j = y6c.h(this.f).n;
        g2b g2bVar = this.s;
        if (!g2bVar.K(j)) {
            if (!g2bVar.I() || g2bVar.g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        je5 je5Var = this.K;
        if (je5Var == null) {
            je5 je5Var2 = new je5(getContext(), 1);
            je5Var2.i(f(bkb.vj));
            je5Var2.p(true);
            je5Var2.L = Layout.Alignment.ALIGN_CENTER;
            je5Var2.n(0.0f, 29.0f);
            this.K = je5Var2;
            SpannableStringBuilder O2 = gl.O2(k96.N0("StoriesPremiumHint2").replace('\n', ' '), bkb.wj, 0, new kf3(this, (byte) 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) O2.getSpans(0, O2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                O2.setSpan(new z3c(gl.o()), O2.getSpanStart(clickableSpanArr[0]), O2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            je5 je5Var3 = this.K;
            je5Var3.h = je5.a(O2, je5Var3.getTextPaint());
            this.K.t(O2);
            this.K.setPadding(gl.L(8.0f), gl.L(24.0f), gl.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, nme.e(-1, 150, 51));
            }
            je5Var = this.K;
        }
        if (je5Var != null) {
            if (je5Var.W) {
                pw0.APP_ERROR.a();
            }
            this.K.v();
        }
    }

    public final void o() {
        kz4 kz4Var = x2b.b;
        if (kz4Var != null) {
            kz4Var.d(bkb.w0(null, bkb.bl, false), bkb.w0(null, bkb.cl, false), 0, 0);
        }
        kz4 kz4Var2 = x2b.c;
        if (kz4Var2 != null) {
            kz4Var2.d(bkb.w0(null, bkb.dl, false), bkb.w0(null, bkb.el, false), 0, 0);
        }
        kz4[] kz4VarArr = x2b.a;
        kz4 kz4Var3 = kz4VarArr[0];
        if (kz4Var3 != null) {
            kz4Var3.d(bkb.w0(null, bkb.Zk, false), bkb.w0(null, bkb.al, false), 0, 0);
        }
        kz4 kz4Var4 = kz4VarArr[1];
        if (kz4Var4 != null) {
            kz4Var4.d(bkb.w0(null, bkb.Xk, false), bkb.w0(null, bkb.Yk, false), 0, 0);
        }
        if (x2b.d != null) {
            int w0 = bkb.w0(null, bkb.nk, false);
            int w02 = bkb.w0(null, bkb.p7, false);
            x2b.d.d(bm2.f(0.25f, w0, w02), w02, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        b6 b6Var = this.V;
        if (b6Var != null) {
            b6Var.b();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        gl.d0(this.h, new lf3(textColor, (byte) 0));
        gl.d0(this.r, new bm0((byte) 9));
        try {
            tl tlVar = this.b0;
            if (tlVar != null) {
                tlVar.k(Integer.valueOf(f(bkb.pi)));
            }
            ImageView imageView = this.a0;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q(false, false);
        kk7.f(this.f).b(this, kk7.x5);
        xf4 xf4Var = this.M0;
        xf4Var.a = true;
        AnimatorSet animatorSet = (AnimatorSet) xf4Var.d;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.f).n(this, kk7.x5);
        xf4 xf4Var = this.M0;
        xf4Var.a = false;
        ((AnimatorSet) xf4Var.d).cancel();
        ev0 ev0Var = this.s0;
        if (ev0Var != null) {
            ev0Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (!gl.O1() && getResources().getConfiguration().orientation == 2) {
            f = 18.0f;
        } else {
            f = 20.0f;
        }
        this.U.setTextSize(gl.L(f));
        this.N = gl.L(70.0f);
        gl.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int size = this.E.size();
            int L = gl.L((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            pf3 pf3Var = this.r;
            int x = (int) (pf3Var.getX() + L);
            int y = (int) (pf3Var.getY() + pf3Var.getHeight());
            ra1 ra1Var = this.J;
            ra1Var.getClass();
            RectF rectF = gl.P;
            rectF.set((int) pf3Var.getX(), (int) pf3Var.getY(), x, y);
            ra1Var.i = false;
            ra1Var.c = 0;
            ra1Var.a(rectF);
            if (ra1Var.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 1) {
            d();
        }
    }

    public final void q(boolean z, boolean z2) {
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
        g2b g2bVar = this.s;
        if (i != 1) {
            arrayList4.add(new sf3(y6c.h(i2).e()));
            arrayList = g2bVar.g;
        } else {
            arrayList = g2bVar.h;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long n = cf3.n(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (n != y6c.h(i2).e()) {
                arrayList4.add(new sf3(n));
            }
        }
        int size = arrayList4.size();
        if (!g2bVar.I()) {
            size--;
        }
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int max = Math.max(1, Math.max(g2bVar.C(z3), size));
        this.g0 = null;
        boolean H = g2bVar.H();
        hn hnVar = this.U;
        if (H) {
            arrayList2 = arrayList4;
            if (g2bVar.L(y6c.h(i2).e())) {
                String M02 = k96.M0(2131743561, null);
                if (M02.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilder = this.j0;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(M02);
                        q6c q6cVar = new q6c();
                        spannableStringBuilder.setSpan(q6cVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        q6cVar.a = hnVar;
                        q6cVar.n = true;
                        this.j0 = spannableStringBuilder;
                    }
                    this.g0 = spannableStringBuilder;
                } else {
                    this.g0 = M02;
                }
            } else {
                if (this.t0 < gl.L(50.0f)) {
                    M0 = null;
                } else {
                    M0 = k96.M0(2131748109, null);
                }
                this.g0 = M0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.t0 < gl.L(50.0f)) {
                G = null;
            } else {
                G = k96.G(max, "Stories", new Object[0]);
            }
            this.g0 = G;
        }
        if (!this.h0) {
            CharSequence charSequence = this.g0;
            if (z && !k96.a0) {
                z6 = true;
            } else {
                z6 = false;
            }
            z4 = true;
            hnVar.c(charSequence, z6, true);
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
            if (((sf3) arrayList2.get(i4)).c != y6c.h(i2).n || m()) {
                arrayList6.add((sf3) arrayList2.get(i4));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        pf3 pf3Var = this.h;
        pf3 pf3Var2 = this.r;
        if (z) {
            if (this.P == 2) {
                pf3Var2.setItemAnimator(this.d);
                pf3Var.setItemAnimator(null);
            } else {
                pf3Var.setItemAnimator(this.S);
                pf3Var2.setItemAnimator(null);
            }
        } else {
            pf3Var.setItemAnimator(null);
            pf3Var2.setItemAnimator(null);
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
        this.o0 = f / gl.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f) {
        l(true, f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        je5 je5Var = this.K;
        if (je5Var != null) {
            je5Var.setTranslationY(f);
        }
    }

    @Override
    public final void D(float f, int i) {
    }
}
