package nh;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ix;
import org.telegram.ui.qy;
import ph.da;
import ph.y9;
public abstract class q extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public ValueAnimator A0;
    public final m B;
    public float B0;
    public final m C;
    public ValueAnimator C0;
    public final Paint D;
    public float D0;
    public final Paint E;
    public ValueAnimator E0;
    public final xc F;
    public float F0;
    public ph.f3 G;
    public OvershootInterpolator G0;
    public boolean H;
    public AnimatorSet H0;
    public int I;
    public final cb.m I0;
    public int J;
    public long J0;
    public float K;
    public Drawable K0;
    public int L;
    public final ArrayList M;
    public final ArrayList N;
    public final f2.l O;
    public final f2.i0 P;
    public final org.telegram.ui.Components.k6 Q;
    public final j R;
    public final ImageView S;
    public final ImageView T;
    public final org.telegram.ui.Components.j5 U;
    public final ArrayList V;
    public float W;
    public final xd.a f15735a;
    public float f15736a0;
    public final int f15737b;
    public final qy f15738b0;
    public final Drawable f15739c;
    public CharSequence f15740c0;
    public final l d;
    public boolean f15741d0;
    public int e;
    public int f15742e0;
    public final int f15743f;
    public SpannableStringBuilder f15744f0;
    public ValueAnimator f15745g0;
    public final i h;
    public o f15746h0;
    public boolean f15747i0;
    public boolean f15748j0;
    public float f15749k0;
    public int f15750l0;
    public p m0;
    public kj0 f15751n;
    public org.telegram.ui.ActionBar.k f15752n0;
    public j7 f15753o0;
    public float f15754p0;
    public final float f15755q0;
    public final i f15756r;
    public final float f15757r0;
    public final t6 f15758s;
    public final float f15759s0;
    public final e5.e f15760t0;
    public LinearGradient f15761u0;
    public final ArrayList v;
    public Matrix f15762v0;
    public final ArrayList f15763w;
    public Paint f15764w0;
    public final ArrayList f15765x;
    public boolean f15766x0;
    public final ArrayList f15767y;
    public final float f15768y0;
    public ValueAnimator f15769z0;

    public q(Context context, qy qyVar, int i10, int i11) {
        super(context);
        float f10;
        this.f15735a = new xd.a(1, this, mr.h, 380L, false);
        this.v = new ArrayList();
        this.f15763w = new ArrayList();
        this.f15765x = new ArrayList();
        this.f15767y = new ArrayList();
        ix ixVar = (ix) this;
        m mVar = new m(ixVar, false);
        this.B = mVar;
        m mVar2 = new m(ixVar, true);
        this.C = mVar2;
        Paint paint = new Paint();
        this.D = new Paint(1);
        this.E = new Paint(1);
        xc xcVar = new xc(this);
        this.F = xcVar;
        this.K = -1.0f;
        this.L = -1;
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.V = new ArrayList();
        this.W = -1.0f;
        this.f15747i0 = true;
        this.f15755q0 = 1.0f;
        this.f15757r0 = 0.95f;
        this.f15759s0 = 0.9f;
        this.f15760t0 = new e5.e(25);
        this.f15768y0 = 0.3f;
        this.B0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.G0 = new OvershootInterpolator(0.95f);
        cb.m mVar3 = new cb.m(this);
        this.I0 = mVar3;
        this.f15737b = i11;
        this.f15743f = i10;
        this.f15738b0 = qyVar;
        this.f15754p0 = AndroidUtilities.dp(68.0f);
        this.f15758s = MessagesController.getInstance(i10).getStoriesController();
        i iVar = new i(ixVar, context, 0);
        this.h = iVar;
        iVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        iVar.setClipToPadding(false);
        iVar.setClipChildren(false);
        xcVar.h = new lh.b(ixVar, 21);
        cg.n0 n0Var = new cg.n0(ixVar, 13);
        xcVar.f30592l = true;
        xcVar.f30590j = n0Var;
        iVar.j(new eg.f2(ixVar, 11));
        f2.l lVar = new f2.l();
        this.O = lVar;
        lVar.C = false;
        lVar.n(150L);
        lVar.f5807m = false;
        iVar.setItemAnimator(lVar);
        f2.i0 i0Var = new f2.i0(0, false);
        this.P = i0Var;
        iVar.setLayoutManager(i0Var);
        iVar.setOnItemClickListener(new dg.n(ixVar, 11));
        iVar.setOnItemLongClickListener(new lh.m5(ixVar, 5));
        iVar.setAdapter(mVar);
        addView(iVar, k7.b6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getContext(), true, true, false);
        this.Q = k6Var;
        k6Var.setGravity(3);
        k6Var.setTextColor(getTextLogoColor());
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        k6Var.setTextSize(AndroidUtilities.dp(f10));
        k6Var.setImportantForAccessibility(1);
        k6Var.setFocusableInTouchMode(true);
        addView(k6Var, k7.b6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.S = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, k7.b6.c(22.0f, 90));
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(26.0f), null);
        this.U = j5Var;
        j5Var.f25833a = true;
        j5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.T = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(j5Var);
        addView(imageView2, k7.b6.c(40.0f, 40));
        j jVar = new j(ixVar, context, mVar3);
        this.R = jVar;
        addView(jVar, k7.b6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f15739c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        i iVar2 = new i(ixVar, getContext(), 1);
        this.f15756r = iVar2;
        getContext();
        iVar2.setLayoutManager(new f2.i0(0, false));
        iVar2.i(new k(0));
        ?? lVar2 = new f2.l();
        this.d = lVar2;
        lVar2.C = false;
        lVar2.f5807m = false;
        iVar2.setItemAnimator(lVar2);
        iVar2.setAdapter(mVar2);
        iVar2.setClipChildren(false);
        addView(iVar2, k7.b6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(ix ixVar) {
        return ixVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f15737b == 0) {
            return f(org.telegram.ui.ActionBar.j6.A8);
        }
        return f(org.telegram.ui.ActionBar.j6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.j6.gl);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        int i10;
        this.K = 1.0f - AndroidUtilities.lerp(1.0f - this.W, 1.0f, 1.0f - this.f15736a0);
        d();
        float f10 = this.K;
        if (f10 == 1.0f) {
            i10 = 2;
        } else if (f10 != 0.0f) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.L != i10) {
            this.L = i10;
            if (i10 != 1 && this.H) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.L;
            i iVar = this.f15756r;
            i iVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) iVar2, (h5.d) new e(0));
                iVar.setVisibility(4);
                iVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.J0) {
                    this.J0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f15743f;
                if (i11 == 1) {
                    ArrayList arrayList = this.N;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f15765x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((n) arrayList2.get(i13)).f15631c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((n) arrayList2.get(i13)).f15631c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    iVar.setVisibility(4);
                    iVar2.setVisibility(0);
                } else if (i11 == 2) {
                    iVar.setVisibility(0);
                    iVar2.setVisibility(4);
                    this.P.h1(0, 0);
                    ah.b bVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    bVar.run();
                    j7 j7Var = this.f15753o0;
                    if (j7Var != null) {
                        j7Var.a();
                        this.f15753o0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        f2.i0 i0Var = this.P;
        int N02 = i0Var.N0() + 10;
        ArrayList arrayList = this.f15765x;
        int size = arrayList.size();
        t6 t6Var = this.f15758s;
        boolean z4 = false;
        if (N02 > size || ((N0 = i0Var.N0() + 9) < arrayList.size() && t6Var.D(0, ((n) arrayList.get(N0)).f15631c) == 0)) {
            if (this.f15737b == 1) {
                z4 = true;
            }
            if (z4) {
                if (!t6Var.f15918z) {
                    return;
                }
            } else if (!t6Var.f15909p) {
                return;
            }
            t6Var.Q(z4);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = k7.n.a(Math.min(this.K, this.f15736a0), 0.0f, 1.0f);
        float f10 = this.f15735a.e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a2;
        float f13 = f11 * a2;
        int i13 = 8;
        org.telegram.ui.Components.k6 k6Var = this.Q;
        if (k6Var != null) {
            k6Var.setAlpha(f12);
            if (f12 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            k6Var.setVisibility(i12);
        }
        ImageView imageView = this.S;
        if (imageView != null) {
            imageView.setAlpha(f13);
            if (f13 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
        ImageView imageView2 = this.T;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
        }
        j jVar = this.R;
        if (jVar != null) {
            jVar.setAlpha(a2);
            if (a2 > 0.0f) {
                i13 = 0;
            }
            jVar.setVisibility(i13);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        if (i10 == NotificationCenter.storiesUpdated && this.f15747i0) {
            if (getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            p(z4, false);
            AndroidUtilities.runOnUIThread(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: nh.q.dispatchDraw(android.graphics.Canvas):void");
    }

    public final p e(long j10) {
        i iVar;
        if (this.L == 2) {
            iVar = this.f15756r;
        } else {
            iVar = this.h;
        }
        for (int i10 = 0; i10 < iVar.getChildCount(); i10++) {
            View childAt = iVar.getChildAt(i10);
            if (childAt instanceof p) {
                p pVar = (p) childAt;
                if (pVar.B == j10) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        qy qyVar = this.f15738b0;
        if (qyVar != null && qyVar.getResourceProvider() != null) {
            return qyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final boolean g() {
        int i10 = this.L;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.K;
    }

    public float getOverScrollCoef() {
        return this.f15755q0;
    }

    public ph.f3 getPremiumHint() {
        return this.G;
    }

    public final void h() {
        if (!this.f15758s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f15743f).clientUserId));
        this.f15738b0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, c7.a(this.f15756r), false);
    }

    public final void i(p pVar, boolean z4) {
        ValueAnimator valueAnimator;
        if ((!z4 || (valueAnimator = this.E0) == null || !valueAnimator.isRunning()) && pVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z10 = pVar.C;
            t6 t6Var = this.f15758s;
            if (z10 && !t6Var.H()) {
                if (!MessagesController.getInstance(this.f15743f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (t6Var.I(pVar.B) || t6Var.K(pVar.B)) {
                TL_stories.PeerStories y10 = t6Var.y(pVar.B);
                long j10 = pVar.B;
                j7 j7Var = this.f15753o0;
                if (j7Var != null) {
                    j7Var.a();
                    this.f15753o0 = null;
                }
                i5.v vVar = new i5.v(this, pVar, j10, 5);
                if (z4) {
                    vVar.run();
                    return;
                }
                j7 n10 = m7.n(y10, vVar);
                pVar.e = n10;
                this.f15753o0 = n10;
                if (n10 != null) {
                    t6Var.e0(pVar.B, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        p pVar;
        n6 o10;
        qy qyVar = this.f15738b0;
        int i10 = this.f15743f;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            qyVar.showDialog(new eg.v0(o10.b(), this.f15743f, getContext(), this.f15738b0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            i iVar = this.h;
            f6Var = null;
            if (i12 < iVar.getChildCount()) {
                pVar = (p) iVar.getChildAt(i12);
                if (i11 == 0) {
                    if (pVar.C) {
                        break;
                    }
                    i12++;
                } else if (pVar.B == j10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar == null) {
            return;
        }
        if (i11 != 0) {
            if (qyVar != null) {
                f6Var = qyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, f6Var2);
            d2Var.q(500L);
            MessagesController.getInstance(i10).getStoriesController().k(j10, new lh.w1(this, d2Var, j10, pVar, 1), true, f6Var2);
            return;
        }
        da.E(qyVar.getParentActivity(), i10).R(y9.c(pVar));
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15765x;
            if (i10 < arrayList.size()) {
                if (((n) arrayList.get(i10)).f15631c == j10) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            f2.i0 i0Var = this.P;
            if (i10 < i0Var.I0()) {
                i0Var.h1(i10, 0);
                return true;
            } else if (i10 > i0Var.M0()) {
                i0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f10, boolean z4) {
        boolean z10;
        float f11;
        float f12;
        if (this.W != f10) {
            this.W = f10;
            b();
            if (f10 > this.f15768y0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f15766x0) {
                this.f15766x0 = z10;
                AnimatorSet animatorSet = this.H0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.H0.cancel();
                    this.H0 = null;
                }
                float f13 = 1.0f;
                if (z4) {
                    float f14 = this.f15736a0;
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f11);
                    this.f15769z0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f15111b;

                        {
                            this.f15111b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f15111b;
                                    qVar.getClass();
                                    qVar.f15736a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f15111b;
                                    qVar2.getClass();
                                    qVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f15111b;
                                    qVar3.getClass();
                                    qVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f15111b;
                                    qVar4.getClass();
                                    qVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.f15769z0.setInterpolator(mr.h);
                    float f15 = this.W;
                    if (z10) {
                        f12 = f15;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f15, f12);
                    this.C0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q f15111b;

                        {
                            this.f15111b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q qVar = this.f15111b;
                                    qVar.getClass();
                                    qVar.f15736a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar.b();
                                    return;
                                case 1:
                                    q qVar2 = this.f15111b;
                                    qVar2.getClass();
                                    qVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    q qVar3 = this.f15111b;
                                    qVar3.getClass();
                                    qVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    q qVar4 = this.f15111b;
                                    qVar4.getClass();
                                    qVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    qVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.H0 = animatorSet2;
                    animatorSet2.addListener(new dg.w2(4, this, z10));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f15769z0);
                    arrayList.add(this.C0);
                    if (this.f15766x0) {
                        this.H0.setDuration(1000L);
                        float f16 = this.f15736a0;
                        if (!z10) {
                            f13 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f16, f13);
                        this.A0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f15111b;

                            {
                                this.f15111b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f15111b;
                                        qVar.getClass();
                                        qVar.f15736a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f15111b;
                                        qVar2.getClass();
                                        qVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f15111b;
                                        qVar3.getClass();
                                        qVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f15111b;
                                        qVar4.getClass();
                                        qVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f15757r0);
                        this.G0 = overshootInterpolator;
                        this.A0.setInterpolator(overshootInterpolator);
                        this.A0.setDuration(750L);
                        arrayList.add(this.A0);
                    } else {
                        float f17 = this.f15736a0;
                        if (!z10) {
                            f13 = 0.0f;
                        }
                        this.E0 = ValueAnimator.ofFloat(f17, f13);
                        this.E0.setInterpolator(new OvershootInterpolator(this.f15759s0));
                        this.E0.setDuration(350L);
                        this.E0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q f15111b;

                            {
                                this.f15111b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q qVar = this.f15111b;
                                        qVar.getClass();
                                        qVar.f15736a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar.b();
                                        return;
                                    case 1:
                                        q qVar2 = this.f15111b;
                                        qVar2.getClass();
                                        qVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        q qVar3 = this.f15111b;
                                        qVar3.getClass();
                                        qVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        q qVar4 = this.f15111b;
                                        qVar4.getClass();
                                        qVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        qVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        arrayList.add(this.E0);
                    }
                    this.H0.playTogether(arrayList);
                    this.H0.start();
                    return;
                }
                if (!z10) {
                    f13 = 0.0f;
                }
                this.f15736a0 = f13;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (h5.d) new e(1));
            }
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f15743f).clientUserId;
        t6 t6Var = this.f15758s;
        if (!t6Var.J(j10)) {
            if (!t6Var.H() || t6Var.f15901g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.G == null) {
            ph.f3 f3Var = new ph.f3(getContext(), 1);
            f3Var.h(f(org.telegram.ui.ActionBar.j6.Fi));
            f3Var.p(true);
            f3Var.H = Layout.Alignment.ALIGN_CENTER;
            f3Var.l(0.0f, 29.0f);
            this.G = f3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new f51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            ph.f3 f3Var2 = this.G;
            f3Var2.h = ph.f3.a(replaceSingleTag, f3Var2.getTextPaint());
            this.G.s(replaceSingleTag);
            this.G.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.G, k7.b6.e(-1, 150, 51));
            }
        }
        ph.f3 f3Var3 = this.G;
        if (f3Var3 != null) {
            if (f3Var3.S) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.G.u();
        }
    }

    public final void o() {
        q20 q20Var = m7.f15602b;
        if (q20Var != null) {
            q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
        }
        q20 q20Var2 = m7.f15603c;
        if (q20Var2 != null) {
            q20Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
        }
        q20[] q20VarArr = m7.f15601a;
        q20 q20Var3 = q20VarArr[0];
        if (q20Var3 != null) {
            q20Var3.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
        }
        q20 q20Var4 = q20VarArr[1];
        if (q20Var4 != null) {
            q20Var4.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
        }
        if (m7.d != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xj, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false);
            m7.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        final int textColor = getTextColor();
        this.Q.setTextColor(getTextLogoColor());
        j jVar = this.R;
        if (jVar != null) {
            jVar.c();
        }
        this.S.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new h5.d() {
            @Override
            public final void accept(Object obj) {
                p pVar = (p) ((View) obj);
                pVar.invalidate();
                pVar.f15715y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.f15756r, (h5.d) new e(2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f15743f).addObserver(this, NotificationCenter.storiesUpdated);
        cb.m mVar = this.I0;
        mVar.f2255a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.f2257c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.U.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f15743f).removeObserver(this, NotificationCenter.storiesUpdated);
        cb.m mVar = this.I0;
        mVar.f2255a = false;
        ((AnimatorSet) mVar.f2257c).cancel();
        j7 j7Var = this.f15753o0;
        if (j7Var != null) {
            j7Var.a();
            this.f15753o0 = null;
        }
        this.U.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        this.Q.setTextSize(AndroidUtilities.dp(f10));
        this.J = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L == 2) {
            int size = this.f15767y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            i iVar = this.f15756r;
            int x10 = (int) (iVar.getX() + dp);
            int y10 = (int) (iVar.getY() + iVar.getHeight());
            xc xcVar = this.F;
            xcVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) iVar.getX(), (int) iVar.getY(), x10, y10);
            xcVar.f30589i = false;
            xcVar.f30586c = 0;
            xcVar.a(rectF);
            if (xcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z4, boolean z10) {
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2;
        String formatPluralString;
        boolean z12;
        boolean z13;
        String string;
        if ((this.L == 1 || this.f15749k0 != 0.0f) && !z10) {
            this.H = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f15765x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f15763w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f15767y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f15737b;
        int i11 = this.f15743f;
        if (i10 != 1) {
            arrayList4.add(new n(UserConfig.getInstance(i11).getClientUserId()));
        }
        t6 t6Var = this.f15758s;
        if (i10 == 1) {
            arrayList = t6Var.h;
        } else {
            arrayList = t6Var.f15901g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new n(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!t6Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int max = Math.max(1, Math.max(t6Var.C(z11), size));
        this.f15740c0 = null;
        boolean G = t6Var.G();
        org.telegram.ui.Components.k6 k6Var = this.Q;
        if (G) {
            arrayList2 = arrayList4;
            if (t6Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f15744f0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        o9 o9Var = new o9();
                        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
                        o9Var.f15700a = k6Var;
                        o9Var.f15704n = true;
                        this.f15744f0 = valueOf;
                    }
                    this.f15740c0 = this.f15744f0;
                } else {
                    this.f15740c0 = string2;
                }
            } else {
                if (this.f15754p0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f15740c0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f15754p0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f15740c0 = formatPluralString;
        }
        if (!this.f15741d0) {
            CharSequence charSequence = this.f15740c0;
            if (z4 && !LocaleController.isRTL) {
                z13 = true;
            } else {
                z13 = false;
            }
            k6Var.c(charSequence, z13, true);
        }
        if (TextUtils.isEmpty(this.f15740c0) && !this.f15741d0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f15735a.a(z12, z4);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((n) arrayList2.get(i13)).f15631c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((n) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        i iVar = this.h;
        i iVar2 = this.f15756r;
        if (z4) {
            if (this.L == 2) {
                iVar2.setItemAnimator(this.d);
                iVar.setItemAnimator(null);
            } else {
                iVar.setItemAnimator(this.O);
                iVar2.setItemAnimator(null);
            }
        } else {
            iVar.setItemAnimator(null);
            iVar2.setItemAnimator(null);
        }
        this.B.E(arrayList3, arrayList2);
        this.C.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f15752n0 = kVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.I != i10) {
            this.I = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.f15754p0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f15749k0 = f10 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(f10, true);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ph.f3 f3Var = this.G;
        if (f3Var != null) {
            f3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
