package fi;

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
import c8.na;
import hi.oa;
import hi.ta;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.cx;
import org.telegram.ui.tv;
public abstract class q extends FrameLayout implements gs, te.b {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final m F;
    public float F0;
    public final m G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final tc J;
    public float J0;
    public hi.l3 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final ab.q M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final v4.k S;
    public final v4.b0 T;
    public final org.telegram.ui.Components.o6 U;
    public final j V;
    public final ImageView W;
    public final te.a f12404a;
    public final ImageView f12405a0;
    public final int f12406b;
    public final org.telegram.ui.Components.n5 f12407b0;
    public final Drawable f12408c;
    public final ArrayList f12409c0;
    public final l d;
    public float f12410d0;
    public int f12411e;
    public float f12412e0;
    public final int f12413f;
    public final cx f12414f0;
    public CharSequence f12415g0;
    public final i h;
    public boolean f12416h0;
    public int f12417i0;
    public SpannableStringBuilder f12418j0;
    public ValueAnimator f12419k0;
    public o f12420l0;
    public boolean m0;
    public sh0 f12421n;
    public boolean f12422n0;
    public float f12423o0;
    public int f12424p0;
    public p f12425q0;
    public final i f12426r;
    public org.telegram.ui.ActionBar.k f12427r0;
    public final p6 f12428s;
    public f7 f12429s0;
    public float f12430t0;
    public final float f12431u0;
    public final float f12432v0;
    public final ArrayList f12433w;
    public final float f12434w0;
    public final ArrayList f12435x;
    public final a3.c f12436x0;
    public final ArrayList f12437y;
    public LinearGradient f12438y0;
    public Matrix f12439z0;

    public q(Context context, cx cxVar, int i7, int i10) {
        super(context);
        float f10;
        this.f12404a = new te.a(1, this, nr.h, 380L, false);
        this.f12433w = new ArrayList();
        this.f12435x = new ArrayList();
        this.f12437y = new ArrayList();
        this.E = new ArrayList();
        tv tvVar = (tv) this;
        m mVar = new m(tvVar, false);
        this.F = mVar;
        m mVar2 = new m(tvVar, true);
        this.G = mVar2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        tc tcVar = new tc(this);
        this.J = tcVar;
        this.O = -1.0f;
        this.P = -1;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.f12409c0 = new ArrayList();
        this.f12410d0 = -1.0f;
        this.m0 = true;
        this.f12431u0 = 1.0f;
        this.f12432v0 = 0.95f;
        this.f12434w0 = 0.9f;
        this.f12436x0 = new a3.c(19);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        ab.q qVar = new ab.q(this);
        this.M0 = qVar;
        this.f12406b = i10;
        this.f12413f = i7;
        this.f12414f0 = cxVar;
        this.f12430t0 = org.telegram.messenger.g0.L(68.0f);
        this.f12428s = np.u1(i7).R1();
        i iVar = new i(tvVar, context, 0);
        this.h = iVar;
        iVar.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        iVar.setClipToPadding(false);
        iVar.setClipChildren(false);
        tcVar.h = new f2.a(tvVar, 1);
        ai.i iVar2 = new ai.i(tvVar, 13);
        tcVar.f39813l = true;
        tcVar.f39811j = iVar2;
        iVar.j(new bi.v1(tvVar, 12));
        v4.k kVar = new v4.k();
        this.S = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.f59139m = false;
        iVar.setItemAnimator(kVar);
        v4.b0 b0Var = new v4.b0(0, false);
        this.T = b0Var;
        iVar.setLayoutManager(b0Var);
        iVar.setOnItemClickListener(new bi.n8(tvVar, 6));
        iVar.setOnItemLongClickListener(new di.v6(tvVar, 5));
        iVar.setAdapter(mVar);
        addView(iVar, na.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), true, true, false);
        this.U = o6Var;
        o6Var.setGravity(3);
        o6Var.setTextColor(getTextLogoColor());
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        o6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        o6Var.setImportantForAccessibility(1);
        o6Var.setFocusableInTouchMode(true);
        addView(o6Var, na.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(hd.N0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232777);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, na.c(22.0f, 90));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(26.0f), null);
        this.f12407b0 = n5Var;
        n5Var.f37729a = true;
        n5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.f12405a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(n5Var);
        addView(imageView2, na.c(40.0f, 40));
        j jVar = new j(tvVar, context, qVar);
        this.V = jVar;
        addView(jVar, na.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f12408c = getContext().getDrawable(2131232229);
        i iVar3 = new i(tvVar, getContext(), 1);
        this.f12426r = iVar3;
        getContext();
        iVar3.setLayoutManager(new v4.b0(0, false));
        iVar3.i(new k(0));
        ?? kVar2 = new v4.k();
        this.d = kVar2;
        kVar2.C = false;
        kVar2.f59139m = false;
        iVar3.setItemAnimator(kVar2);
        iVar3.setAdapter(mVar2);
        iVar3.setClipChildren(false);
        addView(iVar3, na.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public int getTextColor() {
        if (this.f12406b == 0) {
            return f(org.telegram.ui.ActionBar.m6.A8);
        }
        return f(org.telegram.ui.ActionBar.m6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.m6.Xl);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            d();
        }
    }

    public final void b() {
        int i7;
        this.O = 1.0f - org.telegram.messenger.g0.T1(1.0f - this.f12410d0, 1.0f, 1.0f - this.f12412e0);
        d();
        float f10 = this.O;
        if (f10 == 1.0f) {
            i7 = 2;
        } else if (f10 != 0.0f) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (this.P != i7) {
            this.P = i7;
            if (i7 != 1 && this.L) {
                org.telegram.messenger.g0.g3(new d(this, 0));
            }
            int i10 = this.P;
            i iVar = this.f12426r;
            i iVar2 = this.h;
            if (i10 == 0) {
                org.telegram.messenger.g0.d0(iVar2, new e(0));
                iVar.setVisibility(4);
                iVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.N0) {
                    this.N0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f12413f;
                if (i10 == 1) {
                    ArrayList arrayList = this.R;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f12437y;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((n) arrayList2.get(i12)).f12274c != k10.i(i11).e() || m()) {
                            arrayList.add(Long.valueOf(((n) arrayList2.get(i12)).f12274c));
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
                    this.T.h1(0, 0);
                    ai.t0 t0Var = np.u1(i11).R1().K;
                    org.telegram.messenger.g0.r(t0Var);
                    t0Var.run();
                    f7 f7Var = this.f12429s0;
                    if (f7Var != null) {
                        f7Var.a();
                        this.f12429s0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        v4.b0 b0Var = this.T;
        int N02 = b0Var.N0() + 10;
        ArrayList arrayList = this.f12437y;
        int size = arrayList.size();
        p6 p6Var = this.f12428s;
        boolean z10 = false;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && p6Var.E(0, ((n) arrayList.get(N0)).f12274c) == 0)) {
            if (this.f12406b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!p6Var.f12399z) {
                    return;
                }
            } else if (!p6Var.f12390p) {
                return;
            }
            p6Var.T(z10);
        }
    }

    public final void d() {
        int i7;
        int i10;
        int i11;
        float a10 = c8.m9.a(Math.min(this.O, this.f12412e0), 0.0f, 1.0f);
        float f10 = this.f12404a.f57665e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a10;
        float f13 = f11 * a10;
        int i12 = 8;
        org.telegram.ui.Components.o6 o6Var = this.U;
        if (o6Var != null) {
            o6Var.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            o6Var.setVisibility(i11);
        }
        ImageView imageView = this.W;
        if (imageView != null) {
            imageView.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
        ImageView imageView2 = this.f12405a0;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            if (f13 > 0.0f) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView2.setVisibility(i7);
        }
        j jVar = this.V;
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
        boolean z10;
        if (i7 == ls.f25388y5 && this.m0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p(z10, false);
            org.telegram.messenger.g0.g3(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: fi.q.dispatchDraw(android.graphics.Canvas):void");
    }

    public final p e(long j3) {
        i iVar;
        if (this.P == 2) {
            iVar = this.f12426r;
        } else {
            iVar = this.h;
        }
        for (int i7 = 0; i7 < iVar.getChildCount(); i7++) {
            View childAt = iVar.getChildAt(i7);
            if (childAt instanceof p) {
                p pVar = (p) childAt;
                if (pVar.F == j3) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public final int f(int i7) {
        cx cxVar = this.f12414f0;
        if (cxVar != null && cxVar.getResourceProvider() != null) {
            return cxVar.getThemedColor(i7);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final boolean g() {
        int i7 = this.P;
        if (i7 == 0 || i7 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.O;
    }

    public float getOverScrollCoef() {
        return this.f12431u0;
    }

    public hi.l3 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (!this.f12428s.J()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(k10.i(this.f12413f).f24951n));
        this.f12414f0.getOrCreateStoryViewer().M(getContext(), null, arrayList, 0, null, null, y6.a(this.f12426r), false);
    }

    public final void i(p pVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && pVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = pVar.G;
            p6 p6Var = this.f12428s;
            if (z11 && !p6Var.J()) {
                if (!np.u1(this.f12413f).i5()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (p6Var.K(pVar.F) || p6Var.M(pVar.F)) {
                TL_stories.PeerStories y10 = p6Var.y(pVar.F);
                long j3 = pVar.F;
                f7 f7Var = this.f12429s0;
                if (f7Var != null) {
                    f7Var.a();
                    this.f12429s0 = null;
                }
                bi.s2 s2Var = new bi.s2(this, pVar, j3, 5);
                if (z10) {
                    s2Var.run();
                    return;
                }
                f7 n10 = i7.n(y10, s2Var);
                pVar.f12353e = n10;
                this.f12429s0 = n10;
                if (n10 != null) {
                    p6Var.h0(pVar.F, true);
                }
            }
        }
    }

    public final void j(long j3) {
        org.telegram.ui.ActionBar.h6 h6Var;
        p pVar;
        j6 o4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        cx cxVar = this.f12414f0;
        int i10 = this.f12413f;
        if (i7 == 0 && (o4 = np.u1(i10).R1().o()) != null && o4.a(i10, 1)) {
            cxVar.showDialog(new ug.k0(o4.b(), this.f12413f, getContext(), this.f12414f0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            i iVar = this.h;
            h6Var = null;
            if (i11 < iVar.getChildCount()) {
                pVar = (p) iVar.getChildAt(i11);
                if (i7 == 0) {
                    if (pVar.G) {
                        break;
                    }
                    i11++;
                } else if (pVar.F == j3) {
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
            if (cxVar != null) {
                h6Var = cxVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), h6Var2);
            t1Var.r(500L);
            np.u1(i10).R1().k(j3, new bi.k2(this, t1Var, j3, pVar, 2), true, h6Var2);
            return;
        }
        ta.D(cxVar.getParentActivity(), i10).Q(oa.c(pVar));
    }

    public final boolean k(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f12437y;
            if (i7 < arrayList.size()) {
                if (((n) arrayList.get(i7)).f12274c == j3) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 >= 0) {
            v4.b0 b0Var = this.T;
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

    public final void l(boolean z10, float f10) {
        boolean z11;
        float f11;
        float f12;
        if (this.f12410d0 != f10) {
            this.f12410d0 = f10;
            b();
            if (f10 > this.C0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.B0) {
                this.B0 = z11;
                AnimatorSet animatorSet = this.L0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.L0.cancel();
                    this.L0 = null;
                }
                float f13 = 1.0f;
                if (z10) {
                    float f14 = this.f12412e0;
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f11);
                    this.D0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f11782b;

                        {
                            this.f11782b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f11782b;
                                    qVar.getClass();
                                    qVar.f12412e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f11782b;
                                    qVar2.getClass();
                                    qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f11782b;
                                    qVar3.getClass();
                                    qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f11782b;
                                    qVar4.getClass();
                                    qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.D0.setInterpolator(nr.h);
                    float f15 = this.f12410d0;
                    if (z11) {
                        f12 = f15;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f15, f12);
                    this.G0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f11782b;

                        {
                            this.f11782b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f11782b;
                                    qVar.getClass();
                                    qVar.f12412e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f11782b;
                                    qVar2.getClass();
                                    qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f11782b;
                                    qVar3.getClass();
                                    qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f11782b;
                                    qVar4.getClass();
                                    qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.G0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.L0 = animatorSet2;
                    animatorSet2.addListener(new bi.j7(2, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.D0);
                    arrayList.add(this.G0);
                    if (this.B0) {
                        this.L0.setDuration(1000L);
                        float f16 = this.f12412e0;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f16, f13);
                        this.E0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f11782b;

                            {
                                this.f11782b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f11782b;
                                        qVar.getClass();
                                        qVar.f12412e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f11782b;
                                        qVar2.getClass();
                                        qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f11782b;
                                        qVar3.getClass();
                                        qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f11782b;
                                        qVar4.getClass();
                                        qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f12432v0);
                        this.K0 = overshootInterpolator;
                        this.E0.setInterpolator(overshootInterpolator);
                        this.E0.setDuration(750L);
                        arrayList.add(this.E0);
                    } else {
                        float f17 = this.f12412e0;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        this.I0 = ValueAnimator.ofFloat(f17, f13);
                        this.I0.setInterpolator(new OvershootInterpolator(this.f12434w0));
                        this.I0.setDuration(350L);
                        this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f11782b;

                            {
                                this.f11782b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f11782b;
                                        qVar.getClass();
                                        qVar.f12412e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f11782b;
                                        qVar2.getClass();
                                        qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f11782b;
                                        qVar3.getClass();
                                        qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f11782b;
                                        qVar4.getClass();
                                        qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar4.invalidate();
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
                if (!z11) {
                    f13 = 0.0f;
                }
                this.f12412e0 = f13;
                b();
                org.telegram.messenger.g0.d0(this.h, new e(1));
            }
        }
    }

    public final boolean m() {
        long j3 = k10.i(this.f12413f).f24951n;
        p6 p6Var = this.f12428s;
        if (!p6Var.L(j3)) {
            if (!p6Var.J() || p6Var.f12382g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.K == null) {
            hi.l3 l3Var = new hi.l3(getContext(), 1);
            l3Var.j(f(org.telegram.ui.ActionBar.m6.wj));
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_CENTER;
            l3Var.o(0.0f, 29.0f);
            this.K = l3Var;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(hd.O0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.m6.xj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) R2.getSpans(0, R2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                R2.setSpan(new l41(org.telegram.messenger.g0.o()), R2.getSpanStart(clickableSpanArr[0]), R2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            hi.l3 l3Var2 = this.K;
            l3Var2.h = hi.l3.a(R2, l3Var2.getTextPaint());
            this.K.v(R2);
            this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, na.e(-1, 150, 51));
            }
        }
        hi.l3 l3Var3 = this.K;
        if (l3Var3 != null) {
            if (l3Var3.W) {
                org.telegram.messenger.q2.APP_ERROR.a();
            }
            this.K.x();
        }
    }

    public final void o() {
        s10 s10Var = i7.f12108b;
        if (s10Var != null) {
            s10Var.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.cl, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dl, false), 0, 0);
        }
        s10 s10Var2 = i7.f12109c;
        if (s10Var2 != null) {
            s10Var2.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.el, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.fl, false), 0, 0);
        }
        s10[] s10VarArr = i7.f12107a;
        s10 s10Var3 = s10VarArr[0];
        if (s10Var3 != null) {
            s10Var3.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.al, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bl, false), 0, 0);
        }
        s10 s10Var4 = s10VarArr[1];
        if (s10Var4 != null) {
            s10Var4.d(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yk, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zk, false), 0, 0);
        }
        if (i7.d != null) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ok, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29588q7, false);
            i7.d.d(i0.a.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        j jVar = this.V;
        if (jVar != null) {
            jVar.c();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.d0(this.h, new f(textColor, 0));
        org.telegram.messenger.g0.d0(this.f12426r, new e(2));
        try {
            org.telegram.ui.Components.n5 n5Var = this.f12407b0;
            if (n5Var != null) {
                n5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.m6.f29598qi)));
            }
            ImageView imageView = this.f12405a0;
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
        ls.f(this.f12413f).c(this, ls.f25388y5);
        ab.q qVar = this.M0;
        qVar.f987a = true;
        AnimatorSet animatorSet = (AnimatorSet) qVar.f989c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f12407b0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.f12413f).n(this, ls.f25388y5);
        ab.q qVar = this.M0;
        qVar.f987a = false;
        ((AnimatorSet) qVar.f989c).cancel();
        f7 f7Var = this.f12429s0;
        if (f7Var != null) {
            f7Var.a();
            this.f12429s0 = null;
        }
        this.f12407b0.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        this.U.setTextSize(org.telegram.messenger.g0.L(f10));
        this.N = org.telegram.messenger.g0.L(70.0f);
        org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int size = this.E.size();
            int L = org.telegram.messenger.g0.L((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            i iVar = this.f12426r;
            int x10 = (int) (iVar.getX() + L);
            int y10 = (int) (iVar.getY() + iVar.getHeight());
            tc tcVar = this.J;
            tcVar.getClass();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((int) iVar.getX(), (int) iVar.getY(), x10, y10);
            tcVar.f39810i = false;
            tcVar.f39806c = 0;
            tcVar.a(rectF);
            if (tcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        ArrayList arrayList2;
        String G;
        boolean z13;
        boolean z14;
        boolean z15;
        String N0;
        if ((this.P == 1 || this.f12423o0 != 0.0f) && !z11) {
            this.L = true;
            return;
        }
        ArrayList arrayList3 = this.f12433w;
        arrayList3.clear();
        ArrayList arrayList4 = this.f12437y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f12435x;
        arrayList5.clear();
        ArrayList arrayList6 = this.E;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i7 = this.f12406b;
        int i10 = this.f12413f;
        if (i7 != 1) {
            arrayList4.add(new n(k10.i(i10).e()));
        }
        p6 p6Var = this.f12428s;
        if (i7 == 1) {
            arrayList = p6Var.h;
        } else {
            arrayList = p6Var.f12382g;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i11)).peer);
            if (o4 != k10.i(i10).e()) {
                arrayList4.add(new n(o4));
            }
        }
        int size = arrayList4.size();
        if (!p6Var.J()) {
            size--;
        }
        if (i7 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(p6Var.D(z12), size));
        this.f12415g0 = null;
        boolean I = p6Var.I();
        org.telegram.ui.Components.o6 o6Var = this.U;
        if (I) {
            arrayList2 = arrayList4;
            if (p6Var.M(k10.i(i10).e())) {
                String N02 = hd.N0(2131743557, null);
                if (N02.indexOf("…") > 0) {
                    if (this.f12418j0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(N02);
                        l9 l9Var = new l9();
                        valueOf.setSpan(l9Var, valueOf.length() - 1, valueOf.length(), 0);
                        l9Var.f12228a = o6Var;
                        l9Var.f12233n = true;
                        this.f12418j0 = valueOf;
                    }
                    this.f12415g0 = this.f12418j0;
                } else {
                    this.f12415g0 = N02;
                }
            } else {
                if (this.f12430t0 < org.telegram.messenger.g0.L(50.0f)) {
                    N0 = null;
                } else {
                    N0 = hd.N0(2131748108, null);
                }
                this.f12415g0 = N0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f12430t0 < org.telegram.messenger.g0.L(50.0f)) {
                G = null;
            } else {
                G = hd.G(max, "Stories", new Object[0]);
            }
            this.f12415g0 = G;
        }
        if (!this.f12416h0) {
            CharSequence charSequence = this.f12415g0;
            if (z10 && !hd.f24408a0) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = true;
            o6Var.c(charSequence, z15, true);
        } else {
            z13 = true;
        }
        if (TextUtils.isEmpty(this.f12415g0) && !this.f12416h0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        this.f12404a.a(z14, z10);
        arrayList6.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (((n) arrayList2.get(i12)).f12274c != k10.i(i10).f24951n || m()) {
                arrayList6.add((n) arrayList2.get(i12));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        i iVar = this.h;
        i iVar2 = this.f12426r;
        if (z10) {
            if (this.P == 2) {
                iVar2.setItemAnimator(this.d);
                iVar.setItemAnimator(null);
            } else {
                iVar.setItemAnimator(this.S);
                iVar2.setItemAnimator(null);
            }
        } else {
            iVar.setItemAnimator(null);
            iVar2.setItemAnimator(null);
        }
        this.F.E(arrayList3, arrayList2);
        this.G.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f12427r0 = kVar;
    }

    public void setClipTop(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (this.M != i7) {
            this.M = i7;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.f12430t0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f12423o0 = f10 / org.telegram.messenger.g0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(true, f10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        hi.l3 l3Var = this.K;
        if (l3Var != null) {
            l3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
