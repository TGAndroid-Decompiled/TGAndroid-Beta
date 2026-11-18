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
import c8.ma;
import hi.oa;
import hi.ta;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.cx;
import org.telegram.ui.tv;
public abstract class q extends FrameLayout implements fs, te.b {
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
    public hi.m3 K;
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
    public final v4.c0 T;
    public final org.telegram.ui.Components.n6 U;
    public final j V;
    public final ImageView W;
    public final te.a f12412a;
    public final ImageView f12413a0;
    public final int f12414b;
    public final org.telegram.ui.Components.m5 f12415b0;
    public final Drawable f12416c;
    public final ArrayList f12417c0;
    public final l d;
    public float f12418d0;
    public int f12419e;
    public float f12420e0;
    public final int f12421f;
    public final cx f12422f0;
    public CharSequence f12423g0;
    public final i h;
    public boolean f12424h0;
    public int f12425i0;
    public SpannableStringBuilder f12426j0;
    public ValueAnimator f12427k0;
    public o f12428l0;
    public boolean m0;
    public qh0 f12429n;
    public boolean f12430n0;
    public float f12431o0;
    public int f12432p0;
    public p f12433q0;
    public final i f12434r;
    public org.telegram.ui.ActionBar.k f12435r0;
    public final p6 f12436s;
    public f7 f12437s0;
    public float f12438t0;
    public final float f12439u0;
    public final float f12440v0;
    public final ArrayList f12441w;
    public final float f12442w0;
    public final ArrayList f12443x;
    public final a3.c f12444x0;
    public final ArrayList f12445y;
    public LinearGradient f12446y0;
    public Matrix f12447z0;

    public q(Context context, cx cxVar, int i7, int i10) {
        super(context);
        float f10;
        this.f12412a = new te.a(1, this, lr.h, 380L, false);
        this.f12441w = new ArrayList();
        this.f12443x = new ArrayList();
        this.f12445y = new ArrayList();
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
        this.f12417c0 = new ArrayList();
        this.f12418d0 = -1.0f;
        this.m0 = true;
        this.f12439u0 = 1.0f;
        this.f12440v0 = 0.95f;
        this.f12442w0 = 0.9f;
        this.f12444x0 = new a3.c(19);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        ab.q qVar = new ab.q(this);
        this.M0 = qVar;
        this.f12414b = i10;
        this.f12421f = i7;
        this.f12422f0 = cxVar;
        this.f12438t0 = org.telegram.messenger.g0.L(68.0f);
        this.f12436s = mp.u1(i7).R1();
        i iVar = new i(tvVar, context, 0);
        this.h = iVar;
        iVar.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        iVar.setClipToPadding(false);
        iVar.setClipChildren(false);
        tcVar.h = new f2.a(tvVar, 2);
        ai.o oVar = new ai.o(tvVar, 13);
        tcVar.f39976l = true;
        tcVar.f39974j = oVar;
        iVar.j(new bi.q1(tvVar, 12));
        v4.k kVar = new v4.k();
        this.S = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.f59151m = false;
        iVar.setItemAnimator(kVar);
        v4.c0 c0Var = new v4.c0(0, false);
        this.T = c0Var;
        iVar.setLayoutManager(c0Var);
        iVar.setOnItemClickListener(new bi.i8(tvVar, 6));
        iVar.setOnItemLongClickListener(new di.c7(tvVar, 4));
        iVar.setAdapter(mVar);
        addView(iVar, ma.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getContext(), true, true, false);
        this.U = n6Var;
        n6Var.setGravity(3);
        n6Var.setTextColor(getTextLogoColor());
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        n6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        n6Var.setImportantForAccessibility(1);
        n6Var.setFocusableInTouchMode(true);
        addView(n6Var, ma.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(gd.M0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232777);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, ma.c(22.0f, 90));
        org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(26.0f), null);
        this.f12415b0 = m5Var;
        m5Var.f37357a = true;
        m5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.f12413a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(m5Var);
        addView(imageView2, ma.c(40.0f, 40));
        j jVar = new j(tvVar, context, qVar);
        this.V = jVar;
        addView(jVar, ma.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f12416c = getContext().getDrawable(2131232229);
        i iVar2 = new i(tvVar, getContext(), 1);
        this.f12434r = iVar2;
        getContext();
        iVar2.setLayoutManager(new v4.c0(0, false));
        iVar2.i(new k(0));
        ?? kVar2 = new v4.k();
        this.d = kVar2;
        kVar2.C = false;
        kVar2.f59151m = false;
        iVar2.setItemAnimator(kVar2);
        iVar2.setAdapter(mVar2);
        iVar2.setClipChildren(false);
        addView(iVar2, ma.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public int getTextColor() {
        if (this.f12414b == 0) {
            return f(org.telegram.ui.ActionBar.n6.A8);
        }
        return f(org.telegram.ui.ActionBar.n6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.n6.Xl);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 1) {
            d();
        }
    }

    public final void b() {
        int i7;
        this.O = 1.0f - org.telegram.messenger.g0.T1(1.0f - this.f12418d0, 1.0f, 1.0f - this.f12420e0);
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
            i iVar = this.f12434r;
            i iVar2 = this.h;
            if (i10 == 0) {
                org.telegram.messenger.g0.d0(iVar2, new e(0));
                iVar.setVisibility(4);
                iVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.N0) {
                    this.N0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f12421f;
                if (i10 == 1) {
                    ArrayList arrayList = this.R;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f12445y;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((n) arrayList2.get(i12)).f12282c != j10.i(i11).e() || m()) {
                            arrayList.add(Long.valueOf(((n) arrayList2.get(i12)).f12282c));
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
                    ai.w0 w0Var = mp.u1(i11).R1().K;
                    org.telegram.messenger.g0.r(w0Var);
                    w0Var.run();
                    f7 f7Var = this.f12437s0;
                    if (f7Var != null) {
                        f7Var.a();
                        this.f12437s0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        v4.c0 c0Var = this.T;
        int N02 = c0Var.N0() + 10;
        ArrayList arrayList = this.f12445y;
        int size = arrayList.size();
        p6 p6Var = this.f12436s;
        boolean z10 = false;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && p6Var.E(0, ((n) arrayList.get(N0)).f12282c) == 0)) {
            if (this.f12414b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!p6Var.f12407z) {
                    return;
                }
            } else if (!p6Var.f12398p) {
                return;
            }
            p6Var.T(z10);
        }
    }

    public final void d() {
        int i7;
        int i10;
        int i11;
        float a10 = c8.l9.a(Math.min(this.O, this.f12420e0), 0.0f, 1.0f);
        float f10 = this.f12412a.f57657e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a10;
        float f13 = f11 * a10;
        int i12 = 8;
        org.telegram.ui.Components.n6 n6Var = this.U;
        if (n6Var != null) {
            n6Var.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            n6Var.setVisibility(i11);
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
        ImageView imageView2 = this.f12413a0;
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
        if (i7 == ks.f25225x5 && this.m0) {
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
            iVar = this.f12434r;
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
        cx cxVar = this.f12422f0;
        if (cxVar != null && cxVar.getResourceProvider() != null) {
            return cxVar.getThemedColor(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
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
        return this.f12439u0;
    }

    public hi.m3 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (!this.f12436s.J()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10.i(this.f12421f).f24792n));
        this.f12422f0.getOrCreateStoryViewer().M(getContext(), null, arrayList, 0, null, null, y6.a(this.f12434r), false);
    }

    public final void i(p pVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && pVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = pVar.G;
            p6 p6Var = this.f12436s;
            if (z11 && !p6Var.J()) {
                if (!mp.u1(this.f12421f).i5()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (p6Var.K(pVar.F) || p6Var.M(pVar.F)) {
                TL_stories.PeerStories y10 = p6Var.y(pVar.F);
                long j3 = pVar.F;
                f7 f7Var = this.f12437s0;
                if (f7Var != null) {
                    f7Var.a();
                    this.f12437s0 = null;
                }
                bi.m2 m2Var = new bi.m2(this, pVar, j3, 5);
                if (z10) {
                    m2Var.run();
                    return;
                }
                f7 n10 = i7.n(y10, m2Var);
                pVar.f12361e = n10;
                this.f12437s0 = n10;
                if (n10 != null) {
                    p6Var.h0(pVar.F, true);
                }
            }
        }
    }

    public final void j(long j3) {
        org.telegram.ui.ActionBar.i6 i6Var;
        p pVar;
        j6 o4;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        cx cxVar = this.f12422f0;
        int i10 = this.f12421f;
        if (i7 == 0 && (o4 = mp.u1(i10).R1().o()) != null && o4.a(i10, 1)) {
            cxVar.showDialog(new ug.l0(o4.b(), this.f12421f, getContext(), this.f12422f0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            i iVar = this.h;
            i6Var = null;
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
                i6Var = cxVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), i6Var2);
            u1Var.r(500L);
            mp.u1(i10).R1().k(j3, new bi.e2(this, u1Var, j3, pVar, 2), true, i6Var2);
            return;
        }
        ta.D(cxVar.getParentActivity(), i10).Q(oa.c(pVar));
    }

    public final boolean k(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f12445y;
            if (i7 < arrayList.size()) {
                if (((n) arrayList.get(i7)).f12282c == j3) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 >= 0) {
            v4.c0 c0Var = this.T;
            if (i7 < c0Var.I0()) {
                c0Var.h1(i7, 0);
                return true;
            } else if (i7 > c0Var.M0()) {
                c0Var.i1(i7, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z10, float f10) {
        boolean z11;
        float f11;
        float f12;
        if (this.f12418d0 != f10) {
            this.f12418d0 = f10;
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
                    float f14 = this.f12420e0;
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f11);
                    this.D0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f11790b;

                        {
                            this.f11790b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f11790b;
                                    qVar.getClass();
                                    qVar.f12420e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f11790b;
                                    qVar2.getClass();
                                    qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f11790b;
                                    qVar3.getClass();
                                    qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f11790b;
                                    qVar4.getClass();
                                    qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.D0.setInterpolator(lr.h);
                    float f15 = this.f12418d0;
                    if (z11) {
                        f12 = f15;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f15, f12);
                    this.G0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f11790b;

                        {
                            this.f11790b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f11790b;
                                    qVar.getClass();
                                    qVar.f12420e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f11790b;
                                    qVar2.getClass();
                                    qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f11790b;
                                    qVar3.getClass();
                                    qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f11790b;
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
                    animatorSet2.addListener(new bi.e7(2, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.D0);
                    arrayList.add(this.G0);
                    if (this.B0) {
                        this.L0.setDuration(1000L);
                        float f16 = this.f12420e0;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f16, f13);
                        this.E0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f11790b;

                            {
                                this.f11790b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f11790b;
                                        qVar.getClass();
                                        qVar.f12420e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f11790b;
                                        qVar2.getClass();
                                        qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f11790b;
                                        qVar3.getClass();
                                        qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f11790b;
                                        qVar4.getClass();
                                        qVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f12440v0);
                        this.K0 = overshootInterpolator;
                        this.E0.setInterpolator(overshootInterpolator);
                        this.E0.setDuration(750L);
                        arrayList.add(this.E0);
                    } else {
                        float f17 = this.f12420e0;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        this.I0 = ValueAnimator.ofFloat(f17, f13);
                        this.I0.setInterpolator(new OvershootInterpolator(this.f12442w0));
                        this.I0.setDuration(350L);
                        this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f11790b;

                            {
                                this.f11790b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f11790b;
                                        qVar.getClass();
                                        qVar.f12420e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f11790b;
                                        qVar2.getClass();
                                        qVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f11790b;
                                        qVar3.getClass();
                                        qVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f11790b;
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
                this.f12420e0 = f13;
                b();
                org.telegram.messenger.g0.d0(this.h, new e(1));
            }
        }
    }

    public final boolean m() {
        long j3 = j10.i(this.f12421f).f24792n;
        p6 p6Var = this.f12436s;
        if (!p6Var.L(j3)) {
            if (!p6Var.J() || p6Var.f12390g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.K == null) {
            hi.m3 m3Var = new hi.m3(getContext(), 1);
            m3Var.j(f(org.telegram.ui.ActionBar.n6.wj));
            m3Var.r(true);
            m3Var.L = Layout.Alignment.ALIGN_CENTER;
            m3Var.o(0.0f, 29.0f);
            this.K = m3Var;
            SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(gd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.n6.xj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) R2.getSpans(0, R2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                R2.setSpan(new i41(org.telegram.messenger.g0.o()), R2.getSpanStart(clickableSpanArr[0]), R2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            hi.m3 m3Var2 = this.K;
            m3Var2.h = hi.m3.a(R2, m3Var2.getTextPaint());
            this.K.v(R2);
            this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, ma.e(-1, 150, 51));
            }
        }
        hi.m3 m3Var3 = this.K;
        if (m3Var3 != null) {
            if (m3Var3.W) {
                org.telegram.messenger.q2.APP_ERROR.a();
            }
            this.K.x();
        }
    }

    public final void o() {
        p10 p10Var = i7.f12116b;
        if (p10Var != null) {
            p10Var.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.cl, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.dl, false), 0, 0);
        }
        p10 p10Var2 = i7.f12117c;
        if (p10Var2 != null) {
            p10Var2.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.el, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.fl, false), 0, 0);
        }
        p10[] p10VarArr = i7.f12115a;
        p10 p10Var3 = p10VarArr[0];
        if (p10Var3 != null) {
            p10Var3.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.al, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.bl, false), 0, 0);
        }
        p10 p10Var4 = p10VarArr[1];
        if (p10Var4 != null) {
            p10Var4.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false), 0, 0);
        }
        if (i7.d != null) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ok, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29637q7, false);
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
        org.telegram.messenger.g0.d0(this.f12434r, new e(2));
        try {
            org.telegram.ui.Components.m5 m5Var = this.f12415b0;
            if (m5Var != null) {
                m5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.n6.f29647qi)));
            }
            ImageView imageView = this.f12413a0;
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
        ks.f(this.f12421f).c(this, ks.f25225x5);
        ab.q qVar = this.M0;
        qVar.f987a = true;
        AnimatorSet animatorSet = (AnimatorSet) qVar.f989c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f12415b0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f12421f).n(this, ks.f25225x5);
        ab.q qVar = this.M0;
        qVar.f987a = false;
        ((AnimatorSet) qVar.f989c).cancel();
        f7 f7Var = this.f12437s0;
        if (f7Var != null) {
            f7Var.a();
            this.f12437s0 = null;
        }
        this.f12415b0.b();
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
            i iVar = this.f12434r;
            int x10 = (int) (iVar.getX() + L);
            int y10 = (int) (iVar.getY() + iVar.getHeight());
            tc tcVar = this.J;
            tcVar.getClass();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((int) iVar.getX(), (int) iVar.getY(), x10, y10);
            tcVar.f39973i = false;
            tcVar.f39969c = 0;
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
        String M0;
        if ((this.P == 1 || this.f12431o0 != 0.0f) && !z11) {
            this.L = true;
            return;
        }
        ArrayList arrayList3 = this.f12441w;
        arrayList3.clear();
        ArrayList arrayList4 = this.f12445y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f12443x;
        arrayList5.clear();
        ArrayList arrayList6 = this.E;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i7 = this.f12414b;
        int i10 = this.f12421f;
        if (i7 != 1) {
            arrayList4.add(new n(j10.i(i10).e()));
        }
        p6 p6Var = this.f12436s;
        if (i7 == 1) {
            arrayList = p6Var.h;
        } else {
            arrayList = p6Var.f12390g;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i11)).peer);
            if (o4 != j10.i(i10).e()) {
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
        this.f12423g0 = null;
        boolean I = p6Var.I();
        org.telegram.ui.Components.n6 n6Var = this.U;
        if (I) {
            arrayList2 = arrayList4;
            if (p6Var.M(j10.i(i10).e())) {
                String M02 = gd.M0(2131743563, null);
                if (M02.indexOf("…") > 0) {
                    if (this.f12426j0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M02);
                        l9 l9Var = new l9();
                        valueOf.setSpan(l9Var, valueOf.length() - 1, valueOf.length(), 0);
                        l9Var.f12236a = n6Var;
                        l9Var.f12241n = true;
                        this.f12426j0 = valueOf;
                    }
                    this.f12423g0 = this.f12426j0;
                } else {
                    this.f12423g0 = M02;
                }
            } else {
                if (this.f12438t0 < org.telegram.messenger.g0.L(50.0f)) {
                    M0 = null;
                } else {
                    M0 = gd.M0(2131748109, null);
                }
                this.f12423g0 = M0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f12438t0 < org.telegram.messenger.g0.L(50.0f)) {
                G = null;
            } else {
                G = gd.G(max, "Stories", new Object[0]);
            }
            this.f12423g0 = G;
        }
        if (!this.f12424h0) {
            CharSequence charSequence = this.f12423g0;
            if (z10 && !gd.f24216a0) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = true;
            n6Var.c(charSequence, z15, true);
        } else {
            z13 = true;
        }
        if (TextUtils.isEmpty(this.f12423g0) && !this.f12424h0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        this.f12412a.a(z14, z10);
        arrayList6.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (((n) arrayList2.get(i12)).f12282c != j10.i(i10).f24792n || m()) {
                arrayList6.add((n) arrayList2.get(i12));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        i iVar = this.h;
        i iVar2 = this.f12434r;
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
        this.f12435r0 = kVar;
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
        this.f12438t0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f12431o0 = f10 / org.telegram.messenger.g0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(true, f10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        hi.m3 m3Var = this.K;
        if (m3Var != null) {
            m3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
