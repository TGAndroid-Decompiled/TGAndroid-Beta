package ei;

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
import b8.be;
import b8.mf;
import gi.qa;
import gi.va;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mv;
import org.telegram.ui.uw;
public abstract class r extends FrameLayout implements cs, qe.b {
    public Paint A0;
    public boolean B0;
    public final float C0;
    public ValueAnimator D0;
    public final ArrayList E;
    public ValueAnimator E0;
    public final n F;
    public float F0;
    public final n G;
    public ValueAnimator G0;
    public final Paint H;
    public float H0;
    public final Paint I;
    public ValueAnimator I0;
    public final nc J;
    public float J0;
    public gi.l3 K;
    public OvershootInterpolator K0;
    public boolean L;
    public AnimatorSet L0;
    public int M;
    public final b4.n M0;
    public int N;
    public long N0;
    public float O;
    public Drawable O0;
    public int P;
    public final ArrayList Q;
    public final ArrayList R;
    public final u4.k S;
    public final u4.b0 T;
    public final org.telegram.ui.Components.h6 U;
    public final k V;
    public final ImageView W;
    public final qe.a f10822a;
    public final ImageView f10823a0;
    public final int f10824b;
    public final org.telegram.ui.Components.e5 f10825b0;
    public final Drawable f10826c;
    public final ArrayList f10827c0;
    public final m d;
    public float f10828d0;
    public int f10829e;
    public float f10830e0;
    public final int f10831f;
    public final uw f10832f0;
    public CharSequence f10833g0;
    public final j h;
    public boolean f10834h0;
    public int f10835i0;
    public SpannableStringBuilder f10836j0;
    public ValueAnimator f10837k0;
    public p f10838l0;
    public boolean m0;
    public gh0 f10839n;
    public boolean f10840n0;
    public float f10841o0;
    public int f10842p0;
    public q f10843q0;
    public final j f10844r;
    public org.telegram.ui.ActionBar.k f10845r0;
    public final z6 f10846s;
    public p7 f10847s0;
    public float f10848t0;
    public final float f10849u0;
    public final float f10850v0;
    public final ArrayList f10851w;
    public final float f10852w0;
    public final ArrayList f10853x;
    public final a3.u f10854x0;
    public final ArrayList f10855y;
    public LinearGradient f10856y0;
    public Matrix f10857z0;

    public r(Context context, uw uwVar, int i3, int i10) {
        super(context);
        float f10;
        this.f10822a = new qe.a(1, this, xq.h, 380L, false);
        this.f10851w = new ArrayList();
        this.f10853x = new ArrayList();
        this.f10855y = new ArrayList();
        this.E = new ArrayList();
        mv mvVar = (mv) this;
        n nVar = new n(mvVar, false);
        this.F = nVar;
        n nVar2 = new n(mvVar, true);
        this.G = nVar2;
        Paint paint = new Paint();
        this.H = new Paint(1);
        this.I = new Paint(1);
        nc ncVar = new nc(this);
        this.J = ncVar;
        this.O = -1.0f;
        this.P = -1;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.f10827c0 = new ArrayList();
        this.f10828d0 = -1.0f;
        this.m0 = true;
        this.f10849u0 = 1.0f;
        this.f10850v0 = 0.95f;
        this.f10852w0 = 0.9f;
        this.f10854x0 = new a3.u(9);
        this.C0 = 0.3f;
        this.F0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.K0 = new OvershootInterpolator(0.95f);
        b4.n nVar3 = new b4.n(this);
        this.M0 = nVar3;
        this.f10824b = i10;
        this.f10831f = i3;
        this.f10832f0 = uwVar;
        this.f10848t0 = org.telegram.messenger.g0.L(68.0f);
        this.f10846s = hp.s1(i3).P1();
        j jVar = new j(mvVar, context, 0);
        this.h = jVar;
        jVar.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        jVar.setClipToPadding(false);
        jVar.setClipChildren(false);
        ncVar.h = new ci.d1(mvVar, 20);
        ai.y1 y1Var = new ai.y1(mvVar, 8);
        ncVar.f36442l = true;
        ncVar.f36440j = y1Var;
        jVar.j(new ai.j5(mvVar, 11));
        u4.k kVar = new u4.k();
        this.S = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.f55567m = false;
        jVar.setItemAnimator(kVar);
        u4.b0 b0Var = new u4.b0(0, false);
        this.T = b0Var;
        jVar.setLayoutManager(b0Var);
        jVar.setOnItemClickListener(new ai.j6(mvVar, 6));
        jVar.setOnItemLongClickListener(new a1.c(mvVar, 23));
        jVar.setAdapter(nVar);
        addView(jVar, mf.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), true, true, false);
        this.U = h6Var;
        h6Var.setGravity(3);
        h6Var.setTextColor(getTextLogoColor());
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        h6Var.setTextSize(org.telegram.messenger.g0.L(f10));
        h6Var.setImportantForAccessibility(1);
        h6Var.setFocusableInTouchMode(true);
        addView(h6Var, mf.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setContentDescription(bd.M0(2131689472, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232773);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, mf.c(22.0f, 90));
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(26.0f), null);
        this.f10825b0 = e5Var;
        e5Var.f33282a = true;
        e5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.f10823a0 = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(e5Var);
        addView(imageView2, mf.c(40.0f, 40));
        k kVar2 = new k(mvVar, context, nVar3);
        this.V = kVar2;
        addView(kVar2, mf.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.f10826c = getContext().getDrawable(2131232227);
        j jVar2 = new j(mvVar, getContext(), 1);
        this.f10844r = jVar2;
        getContext();
        jVar2.setLayoutManager(new u4.b0(0, false));
        jVar2.i(new l(0));
        ?? kVar3 = new u4.k();
        this.d = kVar3;
        kVar3.C = false;
        kVar3.f55567m = false;
        jVar2.setItemAnimator(kVar3);
        jVar2.setAdapter(nVar2);
        jVar2.setClipChildren(false);
        addView(jVar2, mf.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(mv mvVar) {
        return mvVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f10824b == 0) {
            return f(org.telegram.ui.ActionBar.k6.A8);
        }
        return f(org.telegram.ui.ActionBar.k6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.k6.Ul);
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 1) {
            d();
        }
    }

    public final void b() {
        int i3;
        this.O = 1.0f - org.telegram.messenger.g0.T1(1.0f - this.f10828d0, 1.0f, 1.0f - this.f10830e0);
        d();
        float f10 = this.O;
        if (f10 == 1.0f) {
            i3 = 2;
        } else if (f10 != 0.0f) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.P != i3) {
            this.P = i3;
            if (i3 != 1 && this.L) {
                org.telegram.messenger.g0.h3(new d(this, 0));
            }
            int i10 = this.P;
            j jVar = this.f10844r;
            j jVar2 = this.h;
            if (i10 == 0) {
                org.telegram.messenger.g0.d0(jVar2, new e(0));
                jVar.setVisibility(4);
                jVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.N0) {
                    this.N0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f10831f;
                if (i10 == 1) {
                    ArrayList arrayList = this.R;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f10855y;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((o) arrayList2.get(i12)).f10682c != h10.i(i11).e() || m()) {
                            arrayList.add(Long.valueOf(((o) arrayList2.get(i12)).f10682c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i12++;
                    }
                    jVar.setVisibility(4);
                    jVar2.setVisibility(0);
                } else if (i10 == 2) {
                    jVar.setVisibility(0);
                    jVar2.setVisibility(4);
                    this.T.h1(0, 0);
                    cg.l0 l0Var = hp.s1(i11).P1().K;
                    org.telegram.messenger.g0.r(l0Var);
                    l0Var.run();
                    p7 p7Var = this.f10847s0;
                    if (p7Var != null) {
                        p7Var.a();
                        this.f10847s0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        u4.b0 b0Var = this.T;
        int N02 = b0Var.N0() + 10;
        ArrayList arrayList = this.f10855y;
        int size = arrayList.size();
        z6 z6Var = this.f10846s;
        boolean z10 = false;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && z6Var.E(0, ((o) arrayList.get(N0)).f10682c) == 0)) {
            if (this.f10824b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!z6Var.f11296z) {
                    return;
                }
            } else if (!z6Var.f11287p) {
                return;
            }
            z6Var.T(z10);
        }
    }

    public final void d() {
        int i3;
        int i10;
        int i11;
        float a10 = be.a(Math.min(this.O, this.f10830e0), 0.0f, 1.0f);
        float f10 = this.f10822a.f53840e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a10;
        float f13 = f11 * a10;
        int i12 = 8;
        org.telegram.ui.Components.h6 h6Var = this.U;
        if (h6Var != null) {
            h6Var.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            h6Var.setVisibility(i11);
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
        ImageView imageView2 = this.f10823a0;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            if (f13 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView2.setVisibility(i3);
        }
        k kVar = this.V;
        if (kVar != null) {
            kVar.setAlpha(a10);
            if (a10 > 0.0f) {
                i12 = 0;
            }
            kVar.setVisibility(i12);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean z10;
        if (i3 == hs.f23324v5 && this.m0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p(z10, false);
            org.telegram.messenger.g0.h3(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ei.r.dispatchDraw(android.graphics.Canvas):void");
    }

    public final q e(long j10) {
        j jVar;
        if (this.P == 2) {
            jVar = this.f10844r;
        } else {
            jVar = this.h;
        }
        for (int i3 = 0; i3 < jVar.getChildCount(); i3++) {
            View childAt = jVar.getChildAt(i3);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (qVar.F == j10) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public final int f(int i3) {
        uw uwVar = this.f10832f0;
        if (uwVar != null && uwVar.getResourceProvider() != null) {
            return uwVar.getThemedColor(i3);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public final boolean g() {
        int i3 = this.P;
        if (i3 == 0 || i3 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.O;
    }

    public float getOverScrollCoef() {
        return this.f10849u0;
    }

    public gi.l3 getPremiumHint() {
        return this.K;
    }

    public final void h() {
        if (!this.f10846s.J()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(h10.i(this.f10831f).f22848n));
        this.f10832f0.getOrCreateStoryViewer().U(getContext(), null, arrayList, 0, null, null, i7.a(this.f10844r), false);
    }

    public final void i(q qVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.I0) == null || !valueAnimator.isRunning()) && qVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = qVar.G;
            z6 z6Var = this.f10846s;
            if (z11 && !z6Var.J()) {
                if (!hp.s1(this.f10831f).W4()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (z6Var.K(qVar.F) || z6Var.M(qVar.F)) {
                TL_stories.PeerStories y9 = z6Var.y(qVar.F);
                long j10 = qVar.F;
                p7 p7Var = this.f10847s0;
                if (p7Var != null) {
                    p7Var.a();
                    this.f10847s0 = null;
                }
                ai.r1 r1Var = new ai.r1(this, qVar, j10, 5);
                if (z10) {
                    r1Var.run();
                    return;
                }
                p7 n4 = s7.n(y9, r1Var);
                qVar.f10786e = n4;
                this.f10847s0 = n4;
                if (n4 != null) {
                    z6Var.h0(qVar.F, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        q qVar;
        t6 o10;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        uw uwVar = this.f10832f0;
        int i10 = this.f10831f;
        if (i3 == 0 && (o10 = hp.s1(i10).P1().o()) != null && o10.a(i10, 1)) {
            uwVar.showDialog(new vg.i0(o10.b(), this.f10831f, getContext(), this.f10832f0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            j jVar = this.h;
            e6Var = null;
            if (i11 < jVar.getChildCount()) {
                qVar = (q) jVar.getChildAt(i11);
                if (i3 == 0) {
                    if (qVar.G) {
                        break;
                    }
                    i11++;
                } else if (qVar.F == j10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar == null) {
            return;
        }
        if (i3 != 0) {
            if (uwVar != null) {
                e6Var = uwVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getContext(), e6Var2);
            s1Var.r(500L);
            hp.s1(i10).P1().k(j10, new ai.m1(this, s1Var, j10, qVar, 2), true, e6Var2);
            return;
        }
        va.D(uwVar.getParentActivity(), i10).Q(qa.c(qVar));
    }

    public final boolean k(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f10855y;
            if (i3 < arrayList.size()) {
                if (((o) arrayList.get(i3)).f10682c == j10) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            u4.b0 b0Var = this.T;
            if (i3 < b0Var.I0()) {
                b0Var.h1(i3, 0);
                return true;
            } else if (i3 > b0Var.M0()) {
                b0Var.i1(i3, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(boolean z10, float f10) {
        boolean z11;
        float f11;
        float f12;
        if (this.f10828d0 != f10) {
            this.f10828d0 = f10;
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
                    float f14 = this.f10830e0;
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f11);
                    this.D0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r f10140b;

                        {
                            this.f10140b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r rVar = this.f10140b;
                                    rVar.getClass();
                                    rVar.f10830e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar.b();
                                    return;
                                case 1:
                                    r rVar2 = this.f10140b;
                                    rVar2.getClass();
                                    rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    r rVar3 = this.f10140b;
                                    rVar3.getClass();
                                    rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    r rVar4 = this.f10140b;
                                    rVar4.getClass();
                                    rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.D0.setInterpolator(xq.h);
                    float f15 = this.f10828d0;
                    if (z11) {
                        f12 = f15;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f15, f12);
                    this.G0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r f10140b;

                        {
                            this.f10140b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r rVar = this.f10140b;
                                    rVar.getClass();
                                    rVar.f10830e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar.b();
                                    return;
                                case 1:
                                    r rVar2 = this.f10140b;
                                    rVar2.getClass();
                                    rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    r rVar3 = this.f10140b;
                                    rVar3.getClass();
                                    rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    r rVar4 = this.f10140b;
                                    rVar4.getClass();
                                    rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.G0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.L0 = animatorSet2;
                    animatorSet2.addListener(new dh.x(1, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.D0);
                    arrayList.add(this.G0);
                    if (this.B0) {
                        this.L0.setDuration(1000L);
                        float f16 = this.f10830e0;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f16, f13);
                        this.E0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r f10140b;

                            {
                                this.f10140b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r rVar = this.f10140b;
                                        rVar.getClass();
                                        rVar.f10830e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar.b();
                                        return;
                                    case 1:
                                        r rVar2 = this.f10140b;
                                        rVar2.getClass();
                                        rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        r rVar3 = this.f10140b;
                                        rVar3.getClass();
                                        rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        r rVar4 = this.f10140b;
                                        rVar4.getClass();
                                        rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f10850v0);
                        this.K0 = overshootInterpolator;
                        this.E0.setInterpolator(overshootInterpolator);
                        this.E0.setDuration(750L);
                        arrayList.add(this.E0);
                    } else {
                        float f17 = this.f10830e0;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        this.I0 = ValueAnimator.ofFloat(f17, f13);
                        this.I0.setInterpolator(new OvershootInterpolator(this.f10852w0));
                        this.I0.setDuration(350L);
                        this.I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r f10140b;

                            {
                                this.f10140b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r rVar = this.f10140b;
                                        rVar.getClass();
                                        rVar.f10830e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar.b();
                                        return;
                                    case 1:
                                        r rVar2 = this.f10140b;
                                        rVar2.getClass();
                                        rVar2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        r rVar3 = this.f10140b;
                                        rVar3.getClass();
                                        rVar3.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        r rVar4 = this.f10140b;
                                        rVar4.getClass();
                                        rVar4.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar4.invalidate();
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
                this.f10830e0 = f13;
                b();
                org.telegram.messenger.g0.d0(this.h, new e(1));
            }
        }
    }

    public final boolean m() {
        long j10 = h10.i(this.f10831f).f22848n;
        z6 z6Var = this.f10846s;
        if (!z6Var.L(j10)) {
            if (!z6Var.J() || z6Var.f11279g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.K == null) {
            gi.l3 l3Var = new gi.l3(getContext(), 1);
            l3Var.j(f(org.telegram.ui.ActionBar.k6.tj));
            l3Var.r(true);
            l3Var.L = Layout.Alignment.ALIGN_CENTER;
            l3Var.o(0.0f, 29.0f);
            this.K = l3Var;
            SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(bd.N0("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.uj, 0, new d(this, 1), null);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) S2.getSpans(0, S2.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                S2.setSpan(new o31(org.telegram.messenger.g0.o()), S2.getSpanStart(clickableSpanArr[0]), S2.getSpanEnd(clickableSpanArr[0]), 33);
            }
            gi.l3 l3Var2 = this.K;
            l3Var2.h = gi.l3.a(S2, l3Var2.getTextPaint());
            this.K.u(S2);
            this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.K, mf.e(-1, 150, 51));
            }
        }
        gi.l3 l3Var3 = this.K;
        if (l3Var3 != null) {
            if (l3Var3.W) {
                org.telegram.messenger.p2.APP_ERROR.a();
            }
            this.K.w();
        }
    }

    public final void o() {
        b10 b10Var = s7.f11012b;
        if (b10Var != null) {
            b10Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.al, false), 0, 0);
        }
        b10 b10Var2 = s7.f11013c;
        if (b10Var2 != null) {
            b10Var2.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bl, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.cl, false), 0, 0);
        }
        b10[] b10VarArr = s7.f11011a;
        b10 b10Var3 = b10VarArr[0];
        if (b10Var3 != null) {
            b10Var3.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yk, false), 0, 0);
        }
        b10 b10Var4 = b10VarArr[1];
        if (b10Var4 != null) {
            b10Var4.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), 0, 0);
        }
        if (s7.d != null) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.lk, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false);
            s7.d.d(i0.a.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.U.setTextColor(getTextLogoColor());
        k kVar = this.V;
        if (kVar != null) {
            kVar.d();
        }
        this.W.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        org.telegram.messenger.g0.d0(this.h, new g(textColor, 0));
        org.telegram.messenger.g0.d0(this.f10844r, new e(2));
        try {
            org.telegram.ui.Components.e5 e5Var = this.f10825b0;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(f(org.telegram.ui.ActionBar.k6.f28073ni)));
            }
            ImageView imageView = this.f10823a0;
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
        hs.f(this.f10831f).c(this, hs.f23324v5);
        b4.n nVar = this.M0;
        nVar.f2377a = true;
        AnimatorSet animatorSet = (AnimatorSet) nVar.f2379c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f10825b0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f10831f).n(this, hs.f23324v5);
        b4.n nVar = this.M0;
        nVar.f2377a = false;
        ((AnimatorSet) nVar.f2379c).cancel();
        p7 p7Var = this.f10847s0;
        if (p7Var != null) {
            p7Var.a();
            this.f10847s0 = null;
        }
        this.f10825b0.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        this.U.setTextSize(org.telegram.messenger.g0.L(f10));
        this.N = org.telegram.messenger.g0.L(70.0f);
        org.telegram.messenger.g0.P.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.P == 2) {
            int size = this.E.size();
            int L = org.telegram.messenger.g0.L((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            j jVar = this.f10844r;
            int x10 = (int) (jVar.getX() + L);
            int y9 = (int) (jVar.getY() + jVar.getHeight());
            nc ncVar = this.J;
            ncVar.getClass();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((int) jVar.getX(), (int) jVar.getY(), x10, y9);
            ncVar.f36439i = false;
            ncVar.f36435c = 0;
            ncVar.a(rectF);
            if (ncVar.b(motionEvent)) {
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
        if ((this.P == 1 || this.f10841o0 != 0.0f) && !z11) {
            this.L = true;
            return;
        }
        ArrayList arrayList3 = this.f10851w;
        arrayList3.clear();
        ArrayList arrayList4 = this.f10855y;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f10853x;
        arrayList5.clear();
        ArrayList arrayList6 = this.E;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i3 = this.f10824b;
        int i10 = this.f10831f;
        if (i3 != 1) {
            arrayList4.add(new o(h10.i(i10).e()));
        }
        z6 z6Var = this.f10846s;
        if (i3 == 1) {
            arrayList = z6Var.h;
        } else {
            arrayList = z6Var.f11279g;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i11)).peer);
            if (o10 != h10.i(i10).e()) {
                arrayList4.add(new o(o10));
            }
        }
        int size = arrayList4.size();
        if (!z6Var.J()) {
            size--;
        }
        if (i3 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(z6Var.D(z12), size));
        this.f10833g0 = null;
        boolean I = z6Var.I();
        org.telegram.ui.Components.h6 h6Var = this.U;
        if (I) {
            arrayList2 = arrayList4;
            if (z6Var.M(h10.i(i10).e())) {
                String M02 = bd.M0(2131743810, null);
                if (M02.indexOf("…") > 0) {
                    if (this.f10836j0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M02);
                        x9 x9Var = new x9();
                        valueOf.setSpan(x9Var, valueOf.length() - 1, valueOf.length(), 0);
                        x9Var.f11215a = h6Var;
                        x9Var.f11220n = true;
                        this.f10836j0 = valueOf;
                    }
                    this.f10833g0 = this.f10836j0;
                } else {
                    this.f10833g0 = M02;
                }
            } else {
                if (this.f10848t0 < org.telegram.messenger.g0.L(50.0f)) {
                    M0 = null;
                } else {
                    M0 = bd.M0(2131748309, null);
                }
                this.f10833g0 = M0;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f10848t0 < org.telegram.messenger.g0.L(50.0f)) {
                G = null;
            } else {
                G = bd.G(max, "Stories", new Object[0]);
            }
            this.f10833g0 = G;
        }
        if (!this.f10834h0) {
            CharSequence charSequence = this.f10833g0;
            if (z10 && !bd.f21784a0) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = true;
            h6Var.c(charSequence, z15, true);
        } else {
            z13 = true;
        }
        if (TextUtils.isEmpty(this.f10833g0) && !this.f10834h0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        this.f10822a.a(z14, z10);
        arrayList6.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (((o) arrayList2.get(i12)).f10682c != h10.i(i10).f22848n || m()) {
                arrayList6.add((o) arrayList2.get(i12));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        j jVar = this.h;
        j jVar2 = this.f10844r;
        if (z10) {
            if (this.P == 2) {
                jVar2.setItemAnimator(this.d);
                jVar.setItemAnimator(null);
            } else {
                jVar.setItemAnimator(this.S);
                jVar2.setItemAnimator(null);
            }
        } else {
            jVar.setItemAnimator(null);
            jVar2.setItemAnimator(null);
        }
        this.F.E(arrayList3, arrayList2);
        this.G.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f10845r0 = kVar;
    }

    public void setClipTop(int i3) {
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.M != i3) {
            this.M = i3;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.f10848t0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f10841o0 = f10 / org.telegram.messenger.g0.L(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(true, f10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        gi.l3 l3Var = this.K;
        if (l3Var != null) {
            l3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
