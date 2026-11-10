package di;

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
import bi.ab;
import c8.ha;
import fi.qa;
import fi.va;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.wq;
import org.telegram.ui.sv;
import org.telegram.ui.zw;
public abstract class q extends FrameLayout implements ls, te.b {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public final ArrayList D;
    public ValueAnimator D0;
    public final m E;
    public float E0;
    public final m F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final oc I;
    public float I0;
    public fi.m3 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final ab.q L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final v4.k R;
    public final v4.b0 S;
    public final org.telegram.ui.Components.i6 T;
    public final j U;
    public final ImageView V;
    public final ImageView W;
    public final te.a f9531a;
    public final org.telegram.ui.Components.f5 f9532a0;
    public final int f9533b;
    public final ArrayList f9534b0;
    public final Drawable f9535c;
    public float f9536c0;
    public final l d;
    public float f9537d0;
    public int f9538e;
    public final zw f9539e0;
    public final int f9540f;
    public CharSequence f9541f0;
    public boolean f9542g0;
    public final i h;
    public int f9543h0;
    public SpannableStringBuilder f9544i0;
    public ValueAnimator f9545j0;
    public o f9546k0;
    public boolean f9547l0;
    public boolean m0;
    public dh0 f9548n;
    public float f9549n0;
    public int f9550o0;
    public p f9551p0;
    public org.telegram.ui.ActionBar.l f9552q0;
    public final i f9553r;
    public p7 f9554r0;
    public final z6 f9555s;
    public float f9556s0;
    public final float f9557t0;
    public final float f9558u0;
    public final float f9559v0;
    public final ArrayList f9560w;
    public final a3.c f9561w0;
    public final ArrayList f9562x;
    public LinearGradient f9563x0;
    public final ArrayList f9564y;
    public Matrix f9565y0;
    public Paint f9566z0;

    public q(Context context, zw zwVar, int i7, int i10) {
        super(context);
        float f10;
        this.f9531a = new te.a(1, this, wq.h, 380L, false);
        this.f9560w = new ArrayList();
        this.f9562x = new ArrayList();
        this.f9564y = new ArrayList();
        this.D = new ArrayList();
        sv svVar = (sv) this;
        m mVar = new m(svVar, false);
        this.E = mVar;
        m mVar2 = new m(svVar, true);
        this.F = mVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        oc ocVar = new oc(this);
        this.I = ocVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f9534b0 = new ArrayList();
        this.f9536c0 = -1.0f;
        this.f9547l0 = true;
        this.f9557t0 = 1.0f;
        this.f9558u0 = 0.95f;
        this.f9559v0 = 0.9f;
        this.f9561w0 = new a3.c(19);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        ab.q qVar = new ab.q(this);
        this.L0 = qVar;
        this.f9533b = i10;
        this.f9540f = i7;
        this.f9539e0 = zwVar;
        this.f9556s0 = org.telegram.messenger.g0.L(68.0f);
        this.f9555s = qp.s1(i7).P1();
        i iVar = new i(svVar, context, 0);
        this.h = iVar;
        iVar.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        iVar.setClipToPadding(false);
        iVar.setClipChildren(false);
        ocVar.h = new ab(svVar, 14);
        ai.m0 m0Var = new ai.m0(svVar, 7);
        ocVar.f36576l = true;
        ocVar.f36574j = m0Var;
        iVar.j(new ai.b(svVar, 8));
        v4.k kVar = new v4.k();
        this.R = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.f57079m = false;
        iVar.setItemAnimator(kVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.S = b0Var;
        iVar.setLayoutManager(b0Var);
        iVar.setOnItemClickListener(new ai.k(svVar, 5));
        iVar.setOnItemLongClickListener(new a1.c(svVar, 27));
        iVar.setAdapter(mVar);
        addView(iVar, ha.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(getContext(), true, true, false);
        this.T = i6Var;
        i6Var.setGravity(3);
        i6Var.setTextColor(getTextLogoColor());
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        i6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        i6Var.setImportantForAccessibility(1);
        i6Var.setFocusableInTouchMode(true);
        addView(i6Var, ha.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(id.M0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232775);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, ha.c(22.0f, 90));
        org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(26.0f), null);
        this.f9532a0 = f5Var;
        f5Var.f33460a = true;
        f5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(f5Var);
        addView(imageView2, ha.c(40.0f, 40));
        j jVar = new j(svVar, context, qVar);
        this.U = jVar;
        addView(jVar, ha.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f9535c = getContext().getDrawable(2131232227);
        i iVar2 = new i(svVar, getContext(), 1);
        this.f9553r = iVar2;
        getContext();
        iVar2.setLayoutManager(new v4.b0(0, false));
        iVar2.i(new k(0));
        ?? kVar2 = new v4.k();
        this.d = kVar2;
        kVar2.C = false;
        kVar2.f57079m = false;
        iVar2.setItemAnimator(kVar2);
        iVar2.setAdapter(mVar2);
        iVar2.setClipChildren(false);
        addView(iVar2, ha.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public int getTextColor() {
        if (this.f9533b == 0) {
            return f(org.telegram.ui.ActionBar.m6.A8);
        }
        return f(org.telegram.ui.ActionBar.m6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.m6.Ul);
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            d();
        }
    }

    public final void b() {
        int i7;
        this.N = 1.0f - org.telegram.messenger.g0.T1(1.0f - this.f9536c0, 1.0f, 1.0f - this.f9537d0);
        d();
        float f10 = this.N;
        if (f10 == 1.0f) {
            i7 = 2;
        } else if (f10 != 0.0f) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (this.O != i7) {
            this.O = i7;
            if (i7 != 1 && this.K) {
                org.telegram.messenger.g0.h3(new d(this, 0));
            }
            int i10 = this.O;
            i iVar = this.f9553r;
            i iVar2 = this.h;
            if (i10 == 0) {
                org.telegram.messenger.g0.d0(iVar2, new e(0));
                iVar.setVisibility(4);
                iVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f9540f;
                if (i10 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f9564y;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((n) arrayList2.get(i12)).f9371c != p10.i(i11).e() || m()) {
                            arrayList.add(Long.valueOf(((n) arrayList2.get(i12)).f9371c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i12++;
                    }
                    iVar.setVisibility(4);
                    iVar2.setVisibility(0);
                } else if (i10 == 2) {
                    iVar.setVisibility(0);
                    iVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    bg.m0 m0Var = qp.s1(i11).P1().K;
                    org.telegram.messenger.g0.r(m0Var);
                    m0Var.run();
                    p7 p7Var = this.f9554r0;
                    if (p7Var != null) {
                        p7Var.a();
                        this.f9554r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        v4.b0 b0Var = this.S;
        int N02 = b0Var.N0() + 10;
        ArrayList arrayList = this.f9564y;
        int size = arrayList.size();
        z6 z6Var = this.f9555s;
        boolean z9 = false;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && z6Var.E(0, ((n) arrayList.get(N0)).f9371c) == 0)) {
            if (this.f9533b == 1) {
                z9 = true;
            }
            if (z9) {
                if (!z6Var.f10019z) {
                    return;
                }
            } else if (!z6Var.f10010p) {
                return;
            }
            z6Var.T(z9);
        }
    }

    public final void d() {
        int i7;
        int i10;
        int i11;
        float a10 = c8.j9.a(Math.min(this.N, this.f9537d0), 0.0f, 1.0f);
        float f10 = this.f9531a.f55498e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a10;
        float f13 = f11 * a10;
        int i12 = 8;
        org.telegram.ui.Components.i6 i6Var = this.T;
        if (i6Var != null) {
            i6Var.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            i6Var.setVisibility(i11);
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            if (f13 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView2.setVisibility(i7);
        }
        j jVar = this.U;
        if (jVar != null) {
            jVar.setAlpha(a10);
            if (a10 > 0.0f) {
                i12 = 0;
            }
            jVar.setVisibility(i12);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        if (i7 == qs.f25099v5 && this.f9547l0) {
            if (getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            p(z9, false);
            org.telegram.messenger.g0.h3(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: di.q.dispatchDraw(android.graphics.Canvas):void");
    }

    public final p e(long j3) {
        i iVar;
        if (this.O == 2) {
            iVar = this.f9553r;
        } else {
            iVar = this.h;
        }
        for (int i7 = 0; i7 < iVar.getChildCount(); i7++) {
            View childAt = iVar.getChildAt(i7);
            if (childAt instanceof p) {
                p pVar = (p) childAt;
                if (pVar.E == j3) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public final int f(int i7) {
        zw zwVar = this.f9539e0;
        if (zwVar != null && zwVar.getResourceProvider() != null) {
            return zwVar.getThemedColor(i7);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final boolean g() {
        int i7 = this.O;
        if (i7 == 0 || i7 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.N;
    }

    public float getOverScrollCoef() {
        return this.f9557t0;
    }

    public fi.m3 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f9555s.J()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(p10.i(this.f9540f).f24493n));
        this.f9539e0.getOrCreateStoryViewer().M(getContext(), null, arrayList, 0, null, null, i7.a(this.f9553r), false);
    }

    public final void i(p pVar, boolean z9) {
        ValueAnimator valueAnimator;
        if ((!z9 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && pVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z10 = pVar.F;
            z6 z6Var = this.f9555s;
            if (z10 && !z6Var.J()) {
                if (!qp.s1(this.f9540f).W4()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (z6Var.K(pVar.E) || z6Var.M(pVar.E)) {
                TL_stories.PeerStories y10 = z6Var.y(pVar.E);
                long j3 = pVar.E;
                p7 p7Var = this.f9554r0;
                if (p7Var != null) {
                    p7Var.a();
                    this.f9554r0 = null;
                }
                bi.d3 d3Var = new bi.d3(this, pVar, j3, 4);
                if (z9) {
                    d3Var.run();
                    return;
                }
                p7 n10 = s7.n(y10, d3Var);
                pVar.f9481e = n10;
                this.f9554r0 = n10;
                if (n10 != null) {
                    z6Var.h0(pVar.E, true);
                }
            }
        }
    }

    public final void j(long j3) {
        org.telegram.ui.ActionBar.h6 h6Var;
        p pVar;
        t6 o4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        zw zwVar = this.f9539e0;
        int i10 = this.f9540f;
        if (i7 == 0 && (o4 = qp.s1(i10).P1().o()) != null && o4.a(i10, 1)) {
            zwVar.showDialog(new ug.i0(o4.b(), this.f9540f, getContext(), this.f9539e0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            i iVar = this.h;
            h6Var = null;
            if (i11 < iVar.getChildCount()) {
                pVar = (p) iVar.getChildAt(i11);
                if (i7 == 0) {
                    if (pVar.F) {
                        break;
                    }
                    i11++;
                } else if (pVar.E == j3) {
                    break;
                } else {
                    i11++;
                }
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar == null) {
            return;
        }
        if (i7 != 0) {
            if (zwVar != null) {
                h6Var = zwVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), h6Var2);
            u1Var.r(500L);
            qp.s1(i10).P1().k(j3, new bi.r2(this, u1Var, j3, pVar, 1), true, h6Var2);
            return;
        }
        va.D(zwVar.getParentActivity(), i10).Q(qa.c(pVar));
    }

    public final boolean k(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f9564y;
            if (i7 < arrayList.size()) {
                if (((n) arrayList.get(i7)).f9371c == j3) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 >= 0) {
            v4.b0 b0Var = this.S;
            if (i7 < b0Var.I0()) {
                b0Var.h1(i7, 0);
                return true;
            } else if (i7 > b0Var.M0()) {
                b0Var.i1(i7, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z9, float f10) {
        boolean z10;
        float f11;
        float f12;
        if (this.f9536c0 != f10) {
            this.f9536c0 = f10;
            b();
            if (f10 > this.B0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.A0) {
                this.A0 = z10;
                AnimatorSet animatorSet = this.K0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.K0.cancel();
                    this.K0 = null;
                }
                float f13 = 1.0f;
                if (z9) {
                    float f14 = this.f9537d0;
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f11);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f8864b;

                        {
                            this.f8864b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f8864b;
                                    qVar.getClass();
                                    qVar.f9537d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f8864b;
                                    qVar2.getClass();
                                    qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f8864b;
                                    qVar3.getClass();
                                    qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f8864b;
                                    qVar4.getClass();
                                    qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(wq.h);
                    float f15 = this.f9536c0;
                    if (z10) {
                        f12 = f15;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f15, f12);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f8864b;

                        {
                            this.f8864b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f8864b;
                                    qVar.getClass();
                                    qVar.f9537d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f8864b;
                                    qVar2.getClass();
                                    qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f8864b;
                                    qVar3.getClass();
                                    qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f8864b;
                                    qVar4.getClass();
                                    qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.F0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K0 = animatorSet2;
                    animatorSet2.addListener(new ch.y(1, this, z10));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.C0);
                    arrayList.add(this.F0);
                    if (this.A0) {
                        this.K0.setDuration(1000L);
                        float f16 = this.f9537d0;
                        if (!z10) {
                            f13 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f16, f13);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f8864b;

                            {
                                this.f8864b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f8864b;
                                        qVar.getClass();
                                        qVar.f9537d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f8864b;
                                        qVar2.getClass();
                                        qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f8864b;
                                        qVar3.getClass();
                                        qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f8864b;
                                        qVar4.getClass();
                                        qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f9558u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f17 = this.f9537d0;
                        if (!z10) {
                            f13 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f17, f13);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f9559v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f8864b;

                            {
                                this.f8864b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f8864b;
                                        qVar.getClass();
                                        qVar.f9537d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f8864b;
                                        qVar2.getClass();
                                        qVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f8864b;
                                        qVar3.getClass();
                                        qVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f8864b;
                                        qVar4.getClass();
                                        qVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        arrayList.add(this.H0);
                    }
                    this.K0.playTogether(arrayList);
                    this.K0.start();
                    return;
                }
                if (!z10) {
                    f13 = 0.0f;
                }
                this.f9537d0 = f13;
                b();
                org.telegram.messenger.g0.d0(this.h, new e(1));
            }
        }
    }

    public final boolean m() {
        long j3 = p10.i(this.f9540f).f24493n;
        z6 z6Var = this.f9555s;
        if (!z6Var.L(j3)) {
            if (!z6Var.J() || z6Var.f10002g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.J == null) {
            fi.m3 m3Var = new fi.m3(getContext(), 1);
            m3Var.j(f(org.telegram.ui.ActionBar.m6.tj));
            m3Var.r(true);
            m3Var.K = Layout.Alignment.ALIGN_CENTER;
            m3Var.o(0.0f, 29.0f);
            this.J = m3Var;
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(id.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.m6.uj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) S2.getSpans(0, S2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                S2.setSpan(new u31(org.telegram.messenger.g0.o()), S2.getSpanStart(clickableSpanArr[0]), S2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            fi.m3 m3Var2 = this.J;
            m3Var2.h = fi.m3.a(S2, m3Var2.getTextPaint());
            this.J.u(S2);
            this.J.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, ha.e(-1, 150, 51));
            }
        }
        fi.m3 m3Var3 = this.J;
        if (m3Var3 != null) {
            if (m3Var3.V) {
                org.telegram.messenger.p2.APP_ERROR.a();
            }
            this.J.w();
        }
    }

    public final void o() {
        e10 e10Var = s7.f9741b;
        if (e10Var != null) {
            e10Var.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.al, false), 0, 0);
        }
        e10 e10Var2 = s7.f9742c;
        if (e10Var2 != null) {
            e10Var2.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bl, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.cl, false), 0, 0);
        }
        e10[] e10VarArr = s7.f9740a;
        e10 e10Var3 = e10VarArr[0];
        if (e10Var3 != null) {
            e10Var3.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false), 0, 0);
        }
        e10 e10Var4 = e10VarArr[1];
        if (e10Var4 != null) {
            e10Var4.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wk, false), 0, 0);
        }
        if (s7.d != null) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.lk, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28131q7, false);
            s7.d.d(i0.a.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        j jVar = this.U;
        if (jVar != null) {
            jVar.c();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.d0(this.h, new f(textColor, 0));
        org.telegram.messenger.g0.d0(this.f9553r, new e(2));
        try {
            org.telegram.ui.Components.f5 f5Var = this.f9532a0;
            if (f5Var != null) {
                f5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.m6.f28083ni)));
            }
            ImageView imageView = this.W;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        qs.f(this.f9540f).c(this, qs.f25099v5);
        ab.q qVar = this.L0;
        qVar.f989a = true;
        AnimatorSet animatorSet = (AnimatorSet) qVar.f991c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f9532a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f9540f).n(this, qs.f25099v5);
        ab.q qVar = this.L0;
        qVar.f989a = false;
        ((AnimatorSet) qVar.f991c).cancel();
        p7 p7Var = this.f9554r0;
        if (p7Var != null) {
            p7Var.a();
            this.f9554r0 = null;
        }
        this.f9532a0.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        this.T.setTextSize(org.telegram.messenger.g0.L(f10));
        this.M = org.telegram.messenger.g0.L(70.0f);
        org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int size = this.D.size();
            int L = org.telegram.messenger.g0.L((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            i iVar = this.f9553r;
            int x10 = (int) (iVar.getX() + L);
            int y10 = (int) (iVar.getY() + iVar.getHeight());
            oc ocVar = this.I;
            ocVar.getClass();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((int) iVar.getX(), (int) iVar.getY(), x10, y10);
            ocVar.f36573i = false;
            ocVar.f36569c = 0;
            ocVar.a(rectF);
            if (ocVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z9, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2;
        String G;
        boolean z12;
        boolean z13;
        boolean z14;
        String M0;
        if ((this.O == 1 || this.f9549n0 != 0.0f) && !z10) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.f9560w;
        arrayList3.clear();
        ArrayList arrayList4 = this.f9564y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f9562x;
        arrayList5.clear();
        ArrayList arrayList6 = this.D;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i7 = this.f9533b;
        int i10 = this.f9540f;
        if (i7 != 1) {
            arrayList4.add(new n(p10.i(i10).e()));
        }
        z6 z6Var = this.f9555s;
        if (i7 == 1) {
            arrayList = z6Var.h;
        } else {
            arrayList = z6Var.f10002g;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i11)).peer);
            if (o4 != p10.i(i10).e()) {
                arrayList4.add(new n(o4));
            }
        }
        int size = arrayList4.size();
        if (!z6Var.J()) {
            size--;
        }
        if (i7 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int max = Math.max(1, Math.max(z6Var.D(z11), size));
        this.f9541f0 = null;
        boolean I = z6Var.I();
        org.telegram.ui.Components.i6 i6Var = this.T;
        if (I) {
            arrayList2 = arrayList4;
            if (z6Var.M(p10.i(i10).e())) {
                String M02 = id.M0(2131743800, null);
                if (M02.indexOf("…") > 0) {
                    if (this.f9544i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M02);
                        w9 w9Var = new w9();
                        valueOf.setSpan(w9Var, valueOf.length() - 1, valueOf.length(), 0);
                        w9Var.f9918a = i6Var;
                        w9Var.f9923n = true;
                        this.f9544i0 = valueOf;
                    }
                    this.f9541f0 = this.f9544i0;
                } else {
                    this.f9541f0 = M02;
                }
            } else {
                if (this.f9556s0 < org.telegram.messenger.g0.L(50.0f)) {
                    M0 = null;
                } else {
                    M0 = id.M0(2131748301, null);
                }
                this.f9541f0 = M0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f9556s0 < org.telegram.messenger.g0.L(50.0f)) {
                G = null;
            } else {
                G = id.G(max, "Stories", new Object[0]);
            }
            this.f9541f0 = G;
        }
        if (!this.f9542g0) {
            CharSequence charSequence = this.f9541f0;
            if (z9 && !id.f23161a0) {
                z14 = true;
            } else {
                z14 = false;
            }
            z12 = true;
            i6Var.c(charSequence, z14, true);
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(this.f9541f0) && !this.f9542g0) {
            z13 = false;
        } else {
            z13 = z12;
        }
        this.f9531a.a(z13, z9);
        arrayList6.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (((n) arrayList2.get(i12)).f9371c != p10.i(i10).f24493n || m()) {
                arrayList6.add((n) arrayList2.get(i12));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        i iVar = this.h;
        i iVar2 = this.f9553r;
        if (z9) {
            if (this.O == 2) {
                iVar2.setItemAnimator(this.d);
                iVar.setItemAnimator(null);
            } else {
                iVar.setItemAnimator(this.R);
                iVar2.setItemAnimator(null);
            }
        } else {
            iVar.setItemAnimator(null);
            iVar2.setItemAnimator(null);
        }
        this.E.E(arrayList3, arrayList2);
        this.F.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.f9552q0 = lVar;
    }

    public void setClipTop(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (this.L != i7) {
            this.L = i7;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.f9556s0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f9549n0 = f10 / org.telegram.messenger.g0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(true, f10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        fi.m3 m3Var = this.J;
        if (m3Var != null) {
            m3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
