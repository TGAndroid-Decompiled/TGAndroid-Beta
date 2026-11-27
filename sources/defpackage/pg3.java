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
public abstract class pg3 extends FrameLayout implements fn7, s84 {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final lg3 F;
    public float F0;
    public final lg3 G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final za1 J;
    public float J0;
    public kg5 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final vh4 M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final zb3 S;
    public final x46 T;
    public final in U;
    public final c6 V;
    public final ImageView W;
    public final fm0 a;
    public final ImageView a0;
    public final int b;
    public final ul b0;
    public final Drawable c;
    public final ArrayList c0;
    public final kg3 d;
    public float d0;
    public int e;
    public float e0;
    public final int f;
    public final uj3 f0;
    public CharSequence g0;
    public final jg3 h;
    public boolean h0;
    public int i0;
    public SpannableStringBuilder j0;
    public ValueAnimator k0;
    public ng3 l0;
    public boolean m0;
    public g29 n;
    public boolean n0;
    public float o0;
    public int p0;
    public og3 q0;
    public final jg3 r;
    public a r0;
    public final c6b s;
    public pv0 s0;
    public float t0;
    public final float u0;
    public final float v0;
    public final ArrayList w;
    public final float w0;
    public final ArrayList x;
    public final f03 x0;
    public final ArrayList y;
    public LinearGradient y0;
    public Matrix z0;

    public pg3(Context context, uj3 uj3Var, int i, int i2) {
        super(context);
        float f;
        this.a = new fm0(1, this, k43.h, 380L, false);
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.E = new ArrayList();
        ii3 ii3Var = (ii3) this;
        lg3 lg3Var = new lg3(ii3Var, false);
        this.F = lg3Var;
        lg3 lg3Var2 = new lg3(ii3Var, true);
        this.G = lg3Var2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        za1 za1Var = new za1(this);
        this.J = za1Var;
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
        this.x0 = new f03((byte) 11);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        vh4 vh4Var = new vh4(this);
        this.M0 = vh4Var;
        this.b = i2;
        this.f = i;
        this.f0 = uj3Var;
        this.t0 = hl.L(68.0f);
        this.s = uc7.s1(i).O1();
        jg3 jg3Var = new jg3(ii3Var, context, (byte) 0);
        this.h = jg3Var;
        jg3Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        jg3Var.setClipToPadding(false);
        jg3Var.setClipChildren(false);
        za1Var.h = new gg3(ii3Var, (byte) 0);
        kc kcVar = new kc(ii3Var, (byte) 27);
        za1Var.l = true;
        za1Var.j = kcVar;
        jg3Var.j(new to2(ii3Var, (byte) 5));
        zb3 zb3Var = new zb3();
        this.S = zb3Var;
        zb3Var.C = false;
        zb3Var.n(150L);
        zb3Var.m = false;
        jg3Var.setItemAnimator(zb3Var);
        x46 x46Var = new x46(0, false);
        this.T = x46Var;
        jg3Var.setLayoutManager(x46Var);
        jg3Var.setOnItemClickListener(new u(ii3Var, (byte) 20));
        jg3Var.setOnItemLongClickListener(new ht2(ii3Var, (byte) 22));
        jg3Var.setAdapter(lg3Var);
        addView(jg3Var, tre.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        in inVar = new in(getContext(), true, true, false);
        this.U = inVar;
        inVar.setGravity(3);
        inVar.setTextColor(getTextLogoColor());
        inVar.setTypeface(hl.o());
        inVar.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        if (!hl.O1() && getResources().getConfiguration().orientation == 2) {
            f = 18.0f;
        } else {
            f = 20.0f;
        }
        inVar.setTextSize(hl.L(f));
        inVar.setImportantForAccessibility(1);
        inVar.setFocusableInTouchMode(true);
        addView(inVar, tre.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(ob6.M0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232799);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, tre.c(22.0f, 90));
        ul ulVar = new ul(hl.L(26.0f), null);
        this.b0 = ulVar;
        ulVar.a = true;
        ulVar.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(ulVar);
        addView(imageView2, tre.c(40.0f, 40));
        c6 c6Var = new c6(ii3Var, context, vh4Var);
        this.V = c6Var;
        addView(c6Var, tre.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(1.0f));
        this.c = getContext().getDrawable(2131232232);
        jg3 jg3Var2 = new jg3(ii3Var, getContext(), (byte) 1);
        this.r = jg3Var2;
        getContext();
        jg3Var2.setLayoutManager(new x46(0, false));
        jg3Var2.i(new br1((byte) 1));
        ?? zb3Var2 = new zb3();
        this.d = zb3Var2;
        zb3Var2.C = false;
        zb3Var2.m = false;
        jg3Var2.setItemAnimator(zb3Var2);
        jg3Var2.setAdapter(lg3Var2);
        jg3Var2.setClipChildren(false);
        addView(jg3Var2, tre.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public int getTextColor() {
        if (this.b == 0) {
            return f(aob.A8);
        }
        return f(aob.P8);
    }

    private int getTextLogoColor() {
        return f(aob.Xl);
    }

    public final void b() {
        int i;
        this.O = 1.0f - hl.R1(1.0f - this.d0, 1.0f, 1.0f - this.e0);
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
                hl.c3(new eg3(this, (byte) 0));
            }
            int i2 = this.P;
            jg3 jg3Var = this.r;
            jg3 jg3Var2 = this.h;
            if (i2 == 0) {
                hl.d0(jg3Var2, new bm0((byte) 7));
                jg3Var.setVisibility(4);
                jg3Var2.setVisibility(0);
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
                        if (((mg3) arrayList2.get(i4)).c != yac.h(i3).e() || m()) {
                            arrayList.add(Long.valueOf(((mg3) arrayList2.get(i4)).c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i4++;
                    }
                    jg3Var.setVisibility(4);
                    jg3Var2.setVisibility(0);
                } else if (i2 == 2) {
                    jg3Var.setVisibility(0);
                    jg3Var2.setVisibility(4);
                    this.T.g1(0, 0);
                    oe7 oe7Var = uc7.s1(i3).O1().K;
                    hl.r(oe7Var);
                    oe7Var.run();
                    pv0 pv0Var = this.s0;
                    if (pv0Var != null) {
                        pv0Var.a();
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
        x46 x46Var = this.T;
        int M02 = x46Var.M0() + 10;
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        c6b c6bVar = this.s;
        boolean z = false;
        if (M02 > size || ((M0 = x46Var.M0() + 9) < arrayList.size() && c6bVar.D(0, ((mg3) arrayList.get(M0)).c) == 0)) {
            if (this.b == 1) {
                z = true;
            }
            if (z) {
                if (!c6bVar.z) {
                    return;
                }
            } else if (!c6bVar.p) {
                return;
            }
            c6bVar.S(z);
        }
    }

    public final void d() {
        int i;
        int i2;
        int i3;
        float a = ete.a(Math.min(this.O, this.e0), 0.0f, 1.0f);
        float f = this.a.e;
        float f2 = 1.0f - f;
        float f3 = f * a;
        float f4 = f2 * a;
        int i4 = 8;
        in inVar = this.U;
        if (inVar != null) {
            inVar.setAlpha(f3);
            if (f3 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            inVar.setVisibility(i3);
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
        c6 c6Var = this.V;
        if (c6Var != null) {
            c6Var.setAlpha(a);
            if (a > 0.0f) {
                i4 = 0;
            }
            c6Var.setVisibility(i4);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        if (i == jn7.y5 && this.m0) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            p(z, false);
            hl.c3(new eg3(this, (byte) 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg3.dispatchDraw(android.graphics.Canvas):void");
    }

    public final og3 e(long j) {
        jg3 jg3Var;
        if (this.P == 2) {
            jg3Var = this.r;
        } else {
            jg3Var = this.h;
        }
        for (int i = 0; i < jg3Var.getChildCount(); i++) {
            View childAt = jg3Var.getChildAt(i);
            if (childAt instanceof og3) {
                og3 og3Var = (og3) childAt;
                if (og3Var.F == j) {
                    return og3Var;
                }
            }
        }
        return null;
    }

    public final int f(int i) {
        uj3 uj3Var = this.f0;
        if (uj3Var != null && uj3Var.getResourceProvider() != null) {
            return uj3Var.getThemedColor(i);
        }
        return aob.w0(null, i, false);
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

    public kg5 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (!this.s.I()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(yac.h(this.f).n));
        this.f0.getOrCreateStoryViewer().K(getContext(), null, arrayList, 0, null, null, l6b.a(this.r), false);
    }

    public final void i(og3 og3Var, boolean z) {
        ValueAnimator valueAnimator;
        if ((!z || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && og3Var != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z2 = og3Var.G;
            c6b c6bVar = this.s;
            if (z2 && !c6bVar.I()) {
                if (!uc7.s1(this.f).k5()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (c6bVar.J(og3Var.F) || c6bVar.L(og3Var.F)) {
                TL_stories.PeerStories x = c6bVar.x(og3Var.F);
                long j = og3Var.F;
                pv0 pv0Var = this.s0;
                if (pv0Var != null) {
                    pv0Var.a();
                    this.s0 = null;
                }
                ue2 ue2Var = new ue2(this, og3Var, j, (byte) 20);
                if (z) {
                    ue2Var.run();
                    return;
                }
                pv0 n = t6b.n(x, ue2Var);
                og3Var.e = n;
                this.s0 = n;
                if (n != null) {
                    c6bVar.g0(og3Var.F, true);
                }
            }
        }
    }

    public final void j(long j) {
        vnb vnbVar;
        og3 og3Var;
        xx n;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        uj3 uj3Var = this.f0;
        int i2 = this.f;
        if (i == 0 && (n = uc7.s1(i2).O1().n()) != null && n.a(i2, 1)) {
            uj3Var.showDialog(new l46(n.b(), this.f, null, getContext(), this.f0));
            return;
        }
        int i3 = 0;
        while (true) {
            jg3 jg3Var = this.h;
            vnbVar = null;
            if (i3 < jg3Var.getChildCount()) {
                og3Var = (og3) jg3Var.getChildAt(i3);
                if (i == 0) {
                    if (og3Var.G) {
                        break;
                    }
                    i3++;
                } else if (og3Var.F == j) {
                    break;
                } else {
                    i3++;
                }
            } else {
                og3Var = null;
                break;
            }
        }
        if (og3Var == null) {
            return;
        }
        if (i != 0) {
            if (uj3Var != null) {
                vnbVar = uj3Var.getResourceProvider();
            }
            vnb vnbVar2 = vnbVar;
            id idVar = new id(3, vnbVar2, getContext());
            idVar.q(500L);
            uc7.s1(i2).O1().j(j, new r4c(this, idVar, j, og3Var, (byte) 2), true, vnbVar2);
            return;
        }
        sbb.C(uj3Var.getParentActivity(), i2).Q(nbb.c(og3Var));
    }

    public final boolean k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i < arrayList.size()) {
                if (((mg3) arrayList.get(i)).c == j) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            x46 x46Var = this.T;
            if (i < x46Var.H0()) {
                x46Var.g1(i, 0);
                return true;
            } else if (i > x46Var.L0()) {
                x46Var.h1(i, 0, true);
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
                        public final pg3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            pg3 pg3Var = this.b;
                            switch (b) {
                                case 0:
                                    pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.b();
                                    return;
                                case 1:
                                    pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.invalidate();
                                    return;
                            }
                        }
                    });
                    this.D0.setInterpolator(k43.h);
                    float f6 = this.d0;
                    if (z2) {
                        f3 = f6;
                    } else {
                        f3 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f6, f3);
                    this.G0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final pg3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            pg3 pg3Var = this.b;
                            switch (b) {
                                case 0:
                                    pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.b();
                                    return;
                                case 1:
                                    pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pg3Var.invalidate();
                                    return;
                            }
                        }
                    });
                    this.G0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.L0 = animatorSet2;
                    animatorSet2.addListener(new z7((byte) 28, this, z2));
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
                            public final pg3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                pg3 pg3Var = this.b;
                                switch (b) {
                                    case 0:
                                        pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pg3Var.b();
                                        return;
                                    case 1:
                                        pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pg3Var.invalidate();
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
                            public final pg3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                pg3 pg3Var = this.b;
                                switch (b) {
                                    case 0:
                                        pg3Var.e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pg3Var.b();
                                        return;
                                    case 1:
                                        pg3Var.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        pg3Var.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        pg3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pg3Var.invalidate();
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
                hl.d0(this.h, new bm0((byte) 8));
            }
        }
    }

    public final boolean m() {
        long j = yac.h(this.f).n;
        c6b c6bVar = this.s;
        if (!c6bVar.K(j)) {
            if (!c6bVar.I() || c6bVar.g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        kg5 kg5Var = this.K;
        if (kg5Var == null) {
            kg5 kg5Var2 = new kg5(getContext(), 1);
            kg5Var2.i(f(aob.wj));
            kg5Var2.p(true);
            kg5Var2.L = Layout.Alignment.ALIGN_CENTER;
            kg5Var2.n(0.0f, 29.0f);
            this.K = kg5Var2;
            SpannableStringBuilder N2 = hl.N2(ob6.N0("StoriesPremiumHint2").replace('\n', ' '), aob.xj, 0, new eg3(this, (byte) 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) N2.getSpans(0, N2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                N2.setSpan(new y7c(hl.o()), N2.getSpanStart(clickableSpanArr[0]), N2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            kg5 kg5Var3 = this.K;
            kg5Var3.h = kg5.a(N2, kg5Var3.getTextPaint());
            this.K.t(N2);
            this.K.setPadding(hl.L(8.0f), hl.L(24.0f), hl.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, tre.e(-1, 150, 51));
            }
            kg5Var = this.K;
        }
        if (kg5Var != null) {
            if (kg5Var.W) {
                yw0.APP_ERROR.a();
            }
            this.K.v();
        }
    }

    public final void o() {
        o15 o15Var = t6b.b;
        if (o15Var != null) {
            o15Var.d(aob.w0(null, aob.cl, false), aob.w0(null, aob.dl, false), 0, 0);
        }
        o15 o15Var2 = t6b.c;
        if (o15Var2 != null) {
            o15Var2.d(aob.w0(null, aob.el, false), aob.w0(null, aob.fl, false), 0, 0);
        }
        o15[] o15VarArr = t6b.a;
        o15 o15Var3 = o15VarArr[0];
        if (o15Var3 != null) {
            o15Var3.d(aob.w0(null, aob.al, false), aob.w0(null, aob.bl, false), 0, 0);
        }
        o15 o15Var4 = o15VarArr[1];
        if (o15Var4 != null) {
            o15Var4.d(aob.w0(null, aob.Yk, false), aob.w0(null, aob.Zk, false), 0, 0);
        }
        if (t6b.d != null) {
            int w0 = aob.w0(null, aob.ok, false);
            int w02 = aob.w0(null, aob.q7, false);
            t6b.d.d(vm2.f(0.25f, w0, w02), w02, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        c6 c6Var = this.V;
        if (c6Var != null) {
            c6Var.b();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        hl.d0(this.h, new fg3(textColor, (byte) 0));
        hl.d0(this.r, new bm0((byte) 9));
        try {
            ul ulVar = this.b0;
            if (ulVar != null) {
                ulVar.k(Integer.valueOf(f(aob.qi)));
            }
            ImageView imageView = this.a0;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        jn7.f(this.f).b(this, jn7.y5);
        vh4 vh4Var = this.M0;
        vh4Var.a = true;
        AnimatorSet animatorSet = (AnimatorSet) vh4Var.d;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.b0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.f).n(this, jn7.y5);
        vh4 vh4Var = this.M0;
        vh4Var.a = false;
        ((AnimatorSet) vh4Var.d).cancel();
        pv0 pv0Var = this.s0;
        if (pv0Var != null) {
            pv0Var.a();
            this.s0 = null;
        }
        this.b0.b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (!hl.O1() && getResources().getConfiguration().orientation == 2) {
            f = 18.0f;
        } else {
            f = 20.0f;
        }
        this.U.setTextSize(hl.L(f));
        this.N = hl.L(70.0f);
        hl.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int size = this.E.size();
            int L = hl.L((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            jg3 jg3Var = this.r;
            int x = (int) (jg3Var.getX() + L);
            int y = (int) (jg3Var.getY() + jg3Var.getHeight());
            za1 za1Var = this.J;
            za1Var.getClass();
            RectF rectF = hl.P;
            rectF.set((int) jg3Var.getX(), (int) jg3Var.getY(), x, y);
            za1Var.i = false;
            za1Var.c = 0;
            za1Var.a(rectF);
            if (za1Var.b(motionEvent)) {
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
        c6b c6bVar = this.s;
        if (i != 1) {
            arrayList4.add(new mg3(yac.h(i2).e()));
            arrayList = c6bVar.g;
        } else {
            arrayList = c6bVar.h;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long n = wf3.n(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (n != yac.h(i2).e()) {
                arrayList4.add(new mg3(n));
            }
        }
        int size = arrayList4.size();
        if (!c6bVar.I()) {
            size--;
        }
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int max = Math.max(1, Math.max(c6bVar.C(z3), size));
        this.g0 = null;
        boolean H = c6bVar.H();
        in inVar = this.U;
        if (H) {
            arrayList2 = arrayList4;
            if (c6bVar.L(yac.h(i2).e())) {
                String M02 = ob6.M0(2131743455, null);
                if (M02.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilder = this.j0;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = SpannableStringBuilder.valueOf(M02);
                        qac qacVar = new qac();
                        spannableStringBuilder.setSpan(qacVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        qacVar.a = inVar;
                        qacVar.n = true;
                        this.j0 = spannableStringBuilder;
                    }
                    this.g0 = spannableStringBuilder;
                } else {
                    this.g0 = M02;
                }
            } else {
                if (this.t0 < hl.L(50.0f)) {
                    M0 = null;
                } else {
                    M0 = ob6.M0(2131748055, null);
                }
                this.g0 = M0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.t0 < hl.L(50.0f)) {
                G = null;
            } else {
                G = ob6.G(max, "Stories", new Object[0]);
            }
            this.g0 = G;
        }
        if (!this.h0) {
            CharSequence charSequence = this.g0;
            if (z && !ob6.a0) {
                z6 = true;
            } else {
                z6 = false;
            }
            z4 = true;
            inVar.c(charSequence, z6, true);
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
            if (((mg3) arrayList2.get(i4)).c != yac.h(i2).n || m()) {
                arrayList6.add((mg3) arrayList2.get(i4));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        jg3 jg3Var = this.h;
        jg3 jg3Var2 = this.r;
        if (z) {
            if (this.P == 2) {
                jg3Var2.setItemAnimator(this.d);
                jg3Var.setItemAnimator(null);
            } else {
                jg3Var.setItemAnimator(this.S);
                jg3Var2.setItemAnimator(null);
            }
        } else {
            jg3Var.setItemAnimator(null);
            jg3Var2.setItemAnimator(null);
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
        this.o0 = f / hl.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f) {
        l(true, f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        kg5 kg5Var = this.K;
        if (kg5Var != null) {
            kg5Var.setTranslationY(f);
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 1) {
            d();
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
