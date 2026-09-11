package bi;

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
import di.kc;
import di.pc;
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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.pr;
import org.telegram.ui.lx;
import org.telegram.ui.uy;
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final q E;
    public float E0;
    public final q F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final gd I;
    public float I0;
    public di.f4 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final com.google.firebase.messaging.m L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.j R;
    public final s4.c0 S;
    public final org.telegram.ui.Components.q6 T;
    public final n U;
    public final ImageView V;
    public final ImageView W;
    public final le.b f3846a;
    public final org.telegram.ui.Components.o5 f3847a0;
    public final int f3848b;
    public final ArrayList f3849b0;
    public final Drawable f3850c;
    public float f3851c0;
    public final p d;
    public float f3852d0;
    public int f3853e;
    public final uy f3854e0;
    public final int f3855f;
    public CharSequence f3856f0;
    public boolean f3857g0;
    public final m h;
    public int f3858h0;
    public SpannableStringBuilder f3859i0;
    public ValueAnimator f3860j0;
    public s f3861k0;
    public boolean f3862l0;
    public boolean m0;
    public bj0 f3863n;
    public float f3864n0;
    public int f3865o0;
    public u f3866p0;
    public org.telegram.ui.ActionBar.k f3867q0;
    public final m f3868r;
    public k9 f3869r0;
    public final u8 f3870s;
    public float f3871s0;
    public final float f3872t0;
    public final float f3873u0;
    public final ArrayList v;
    public final float f3874v0;
    public final ArrayList f3875w;
    public final a4.e f3876w0;
    public final ArrayList f3877x;
    public LinearGradient f3878x0;
    public final ArrayList f3879y;
    public Matrix f3880y0;
    public Paint f3881z0;

    public v(Context context, uy uyVar, int i10, int i11) {
        super(context);
        float f7;
        this.f3846a = new le.b(1, this, pr.h, 380L, false);
        this.v = new ArrayList();
        this.f3875w = new ArrayList();
        this.f3877x = new ArrayList();
        this.f3879y = new ArrayList();
        lx lxVar = (lx) this;
        q qVar = new q(lxVar, false);
        this.E = qVar;
        q qVar2 = new q(lxVar, true);
        this.F = qVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        gd gdVar = new gd(this);
        this.I = gdVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f3849b0 = new ArrayList();
        this.f3851c0 = -1.0f;
        this.f3862l0 = true;
        this.f3872t0 = 1.0f;
        this.f3873u0 = 0.95f;
        this.f3874v0 = 0.9f;
        this.f3876w0 = new a4.e(5);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(this);
        this.L0 = mVar;
        this.f3848b = i11;
        this.f3855f = i10;
        this.f3854e0 = uyVar;
        this.f3871s0 = AndroidUtilities.dp(68.0f);
        this.f3870s = MessagesController.getInstance(i10).getStoriesController();
        m mVar2 = new m(lxVar, context, 0);
        this.h = mVar2;
        mVar2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        mVar2.setClipToPadding(false);
        mVar2.setClipChildren(false);
        gdVar.h = new a3.c(lxVar, 12);
        ah.j jVar = new ah.j(lxVar, 1);
        gdVar.f26356l = true;
        gdVar.f26354j = jVar;
        mVar2.j(new ah.e0(lxVar, 1));
        s4.j jVar2 = new s4.j();
        this.R = jVar2;
        jVar2.C = false;
        jVar2.n(150L);
        jVar2.f45777m = false;
        mVar2.setItemAnimator(jVar2);
        s4.c0 c0Var = new s4.c0(0, false);
        this.S = c0Var;
        mVar2.setLayoutManager(c0Var);
        mVar2.setOnItemClickListener(new d(lxVar, 0));
        mVar2.setOnItemLongClickListener(new a1.c(lxVar, 2));
        mVar2.setAdapter(qVar);
        addView(mVar2, w7.x5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getContext(), true, true, false);
        this.T = q6Var;
        q6Var.setGravity(3);
        q6Var.setTextColor(getTextLogoColor());
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        q6Var.setTextSize(AndroidUtilities.dp(f7));
        q6Var.setImportantForAccessibility(1);
        q6Var.setFocusableInTouchMode(true);
        addView(q6Var, w7.x5.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.x5.c(22.0f, 90));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(26.0f), null);
        this.f3847a0 = o5Var;
        o5Var.f28957a = true;
        o5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(o5Var);
        addView(imageView2, w7.x5.c(40.0f, 40));
        n nVar = new n(lxVar, context, mVar);
        this.U = nVar;
        addView(nVar, w7.x5.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f3850c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        m mVar3 = new m(lxVar, getContext(), 1);
        this.f3868r = mVar3;
        getContext();
        mVar3.setLayoutManager(new s4.c0(0, false));
        mVar3.i(new o(0));
        ?? jVar3 = new s4.j();
        this.d = jVar3;
        jVar3.C = false;
        jVar3.f45777m = false;
        mVar3.setItemAnimator(jVar3);
        mVar3.setAdapter(qVar2);
        mVar3.setClipChildren(false);
        addView(mVar3, w7.x5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public int getTextColor() {
        if (this.f3848b == 0) {
            return f(org.telegram.ui.ActionBar.j6.A8);
        }
        return f(org.telegram.ui.ActionBar.j6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.j6.gl);
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        int i10;
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.f3851c0, 1.0f, 1.0f - this.f3852d0);
        d();
        float f7 = this.N;
        if (f7 == 1.0f) {
            i10 = 2;
        } else if (f7 != 0.0f) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.O != i10) {
            this.O = i10;
            if (i10 != 1 && this.K) {
                AndroidUtilities.runOnUIThread(new e(this, 0));
            }
            int i11 = this.O;
            m mVar = this.f3868r;
            m mVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) mVar2, (e2.h) new f(0));
                mVar.setVisibility(4);
                mVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f3855f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f3877x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((r) arrayList2.get(i13)).f3618c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((r) arrayList2.get(i13)).f3618c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    mVar.setVisibility(4);
                    mVar2.setVisibility(0);
                } else if (i11 == 2) {
                    mVar.setVisibility(0);
                    mVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    ah.g gVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    gVar.run();
                    k9 k9Var = this.f3869r0;
                    if (k9Var != null) {
                        k9Var.a();
                        this.f3869r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        s4.c0 c0Var = this.S;
        int N02 = c0Var.N0() + 10;
        ArrayList arrayList = this.f3877x;
        int size = arrayList.size();
        u8 u8Var = this.f3870s;
        boolean z10 = false;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && u8Var.D(0, ((r) arrayList.get(N0)).f3618c) == 0)) {
            if (this.f3848b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!u8Var.f3827z) {
                    return;
                }
            } else if (!u8Var.f3818p) {
                return;
            }
            u8Var.Q(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = w7.p.a(Math.min(this.N, this.f3852d0), 0.0f, 1.0f);
        float f7 = this.f3846a.f15368e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        int i13 = 8;
        org.telegram.ui.Components.q6 q6Var = this.T;
        if (q6Var != null) {
            q6Var.setAlpha(f11);
            if (f11 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            q6Var.setVisibility(i12);
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
        ImageView imageView2 = this.W;
        if (imageView2 != null) {
            imageView2.setAlpha(f12);
            if (f12 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
        }
        n nVar = this.U;
        if (nVar != null) {
            nVar.setAlpha(a2);
            if (a2 > 0.0f) {
                i13 = 0;
            }
            nVar.setVisibility(i13);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        if (i10 == NotificationCenter.storiesUpdated && this.f3862l0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p(z10, false);
            AndroidUtilities.runOnUIThread(new e(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: bi.v.dispatchDraw(android.graphics.Canvas):void");
    }

    public final u e(long j3) {
        m mVar;
        if (this.O == 2) {
            mVar = this.f3868r;
        } else {
            mVar = this.h;
        }
        for (int i10 = 0; i10 < mVar.getChildCount(); i10++) {
            View childAt = mVar.getChildAt(i10);
            if (childAt instanceof u) {
                u uVar = (u) childAt;
                if (uVar.E == j3) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        uy uyVar = this.f3854e0;
        if (uyVar != null && uyVar.getResourceProvider() != null) {
            return uyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final boolean g() {
        int i10 = this.O;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.N;
    }

    public float getOverScrollCoef() {
        return this.f3872t0;
    }

    public di.f4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f3870s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f3855f).clientUserId));
        this.f3854e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, d9.a(this.f3868r), false);
    }

    public final void i(u uVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && uVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = uVar.F;
            u8 u8Var = this.f3870s;
            if (z11 && !u8Var.H()) {
                if (!MessagesController.getInstance(this.f3855f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (u8Var.I(uVar.E) || u8Var.K(uVar.E)) {
                TL_stories.PeerStories y3 = u8Var.y(uVar.E);
                long j3 = uVar.E;
                k9 k9Var = this.f3869r0;
                if (k9Var != null) {
                    k9Var.a();
                    this.f3869r0 = null;
                }
                a3.g0 g0Var = new a3.g0(this, uVar, j3, 1);
                if (z10) {
                    g0Var.run();
                    return;
                }
                k9 n10 = p9.n(y3, g0Var);
                uVar.f3772e = n10;
                this.f3869r0 = n10;
                if (n10 != null) {
                    u8Var.e0(uVar.E, true);
                }
            }
        }
    }

    public final void j(long j3) {
        org.telegram.ui.ActionBar.f6 f6Var;
        u uVar;
        n8 o9;
        uy uyVar = this.f3854e0;
        int i10 = this.f3855f;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            uyVar.showDialog(new sg.k0(o9.b(), this.f3855f, getContext(), this.f3854e0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            m mVar = this.h;
            f6Var = null;
            if (i12 < mVar.getChildCount()) {
                uVar = (u) mVar.getChildAt(i12);
                if (i11 == 0) {
                    if (uVar.F) {
                        break;
                    }
                    i12++;
                } else if (uVar.E == j3) {
                    break;
                } else {
                    i12++;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar == null) {
            return;
        }
        if (i11 != 0) {
            if (uyVar != null) {
                f6Var = uyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, f6Var2);
            b2Var.q(500L);
            MessagesController.getInstance(i10).getStoriesController().k(j3, new i(this, b2Var, j3, uVar, 0), true, f6Var2);
            return;
        }
        pc.E(uyVar.getParentActivity(), i10).R(kc.c(uVar));
    }

    public final boolean k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3877x;
            if (i10 < arrayList.size()) {
                if (((r) arrayList.get(i10)).f3618c == j3) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            s4.c0 c0Var = this.S;
            if (i10 < c0Var.I0()) {
                c0Var.h1(i10, 0);
                return true;
            } else if (i10 > c0Var.M0()) {
                c0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f7, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (this.f3851c0 != f7) {
            this.f3851c0 = f7;
            b();
            if (f7 > this.B0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.A0) {
                this.A0 = z11;
                AnimatorSet animatorSet = this.K0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.K0.cancel();
                    this.K0 = null;
                }
                float f12 = 1.0f;
                if (z10) {
                    float f13 = this.f3852d0;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final v f2809b;

                        {
                            this.f2809b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    v vVar = this.f2809b;
                                    vVar.getClass();
                                    vVar.f3852d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vVar.b();
                                    return;
                                case 1:
                                    v vVar2 = this.f2809b;
                                    vVar2.getClass();
                                    vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    v vVar3 = this.f2809b;
                                    vVar3.getClass();
                                    vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    v vVar4 = this.f2809b;
                                    vVar4.getClass();
                                    vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(pr.h);
                    float f14 = this.f3851c0;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final v f2809b;

                        {
                            this.f2809b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    v vVar = this.f2809b;
                                    vVar.getClass();
                                    vVar.f3852d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vVar.b();
                                    return;
                                case 1:
                                    v vVar2 = this.f2809b;
                                    vVar2.getClass();
                                    vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    v vVar3 = this.f2809b;
                                    vVar3.getClass();
                                    vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    v vVar4 = this.f2809b;
                                    vVar4.getClass();
                                    vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.F0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K0 = animatorSet2;
                    animatorSet2.addListener(new ah.q0(1, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.C0);
                    arrayList.add(this.F0);
                    if (this.A0) {
                        this.K0.setDuration(1000L);
                        float f15 = this.f3852d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v f2809b;

                            {
                                this.f2809b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        v vVar = this.f2809b;
                                        vVar.getClass();
                                        vVar.f3852d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vVar.b();
                                        return;
                                    case 1:
                                        v vVar2 = this.f2809b;
                                        vVar2.getClass();
                                        vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        v vVar3 = this.f2809b;
                                        vVar3.getClass();
                                        vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        v vVar4 = this.f2809b;
                                        vVar4.getClass();
                                        vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f3873u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f16 = this.f3852d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f16, f12);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f3874v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v f2809b;

                            {
                                this.f2809b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        v vVar = this.f2809b;
                                        vVar.getClass();
                                        vVar.f3852d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vVar.b();
                                        return;
                                    case 1:
                                        v vVar2 = this.f2809b;
                                        vVar2.getClass();
                                        vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        v vVar3 = this.f2809b;
                                        vVar3.getClass();
                                        vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        v vVar4 = this.f2809b;
                                        vVar4.getClass();
                                        vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vVar4.invalidate();
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
                if (!z11) {
                    f12 = 0.0f;
                }
                this.f3852d0 = f12;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new f(1));
            }
        }
    }

    public final boolean m() {
        long j3 = UserConfig.getInstance(this.f3855f).clientUserId;
        u8 u8Var = this.f3870s;
        if (!u8Var.J(j3)) {
            if (!u8Var.H() || u8Var.f3810g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.J == null) {
            di.f4 f4Var = new di.f4(getContext(), 1);
            f4Var.h(f(org.telegram.ui.ActionBar.j6.Fi));
            f4Var.p(true);
            f4Var.K = Layout.Alignment.ALIGN_CENTER;
            f4Var.l(0.0f, 29.0f);
            this.J = f4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.j6.Gi, 0, new e(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new e51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            di.f4 f4Var2 = this.J;
            f4Var2.h = di.f4.a(replaceSingleTag, f4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.x5.e(-1, 150, 51));
            }
        }
        di.f4 f4Var3 = this.J;
        if (f4Var3 != null) {
            if (f4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        o20 o20Var = p9.f3511b;
        if (o20Var != null) {
            o20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
        }
        o20 o20Var2 = p9.f3512c;
        if (o20Var2 != null) {
            o20Var2.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
        }
        o20[] o20VarArr = p9.f3510a;
        o20 o20Var3 = o20VarArr[0];
        if (o20Var3 != null) {
            o20Var3.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
        }
        o20 o20Var4 = o20VarArr[1];
        if (o20Var4 != null) {
            o20Var4.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
        }
        if (p9.d != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.xj, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false);
            p9.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        n nVar = this.U;
        if (nVar != null) {
            nVar.b();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (e2.h) new j(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.f3868r, (e2.h) new f(2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f3855f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f6371a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.f6373c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f3847a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f3855f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f6371a = false;
        ((AnimatorSet) mVar.f6373c).cancel();
        k9 k9Var = this.f3869r0;
        if (k9Var != null) {
            k9Var.a();
            this.f3869r0 = null;
        }
        this.f3847a0.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        this.T.setTextSize(AndroidUtilities.dp(f7));
        this.M = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O == 2) {
            int size = this.f3879y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            m mVar = this.f3868r;
            int x10 = (int) (mVar.getX() + dp);
            int y3 = (int) (mVar.getY() + mVar.getHeight());
            gd gdVar = this.I;
            gdVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) mVar.getX(), (int) mVar.getY(), x10, y3);
            gdVar.f26353i = false;
            gdVar.f26349c = 0;
            gdVar.a(rectF);
            if (gdVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        ArrayList arrayList2;
        String formatPluralString;
        boolean z13;
        boolean z14;
        String string;
        if ((this.O == 1 || this.f3864n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f3877x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f3875w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f3879y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f3848b;
        int i11 = this.f3855f;
        if (i10 != 1) {
            arrayList4.add(new r(UserConfig.getInstance(i11).getClientUserId()));
        }
        u8 u8Var = this.f3870s;
        if (i10 == 1) {
            arrayList = u8Var.h;
        } else {
            arrayList = u8Var.f3810g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new r(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!u8Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(u8Var.C(z12), size));
        this.f3856f0 = null;
        boolean G = u8Var.G();
        org.telegram.ui.Components.q6 q6Var = this.T;
        if (G) {
            arrayList2 = arrayList4;
            if (u8Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f3859i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        vb vbVar = new vb();
                        valueOf.setSpan(vbVar, valueOf.length() - 1, valueOf.length(), 0);
                        vbVar.f3919a = q6Var;
                        vbVar.f3924n = true;
                        this.f3859i0 = valueOf;
                    }
                    this.f3856f0 = this.f3859i0;
                } else {
                    this.f3856f0 = string2;
                }
            } else {
                if (this.f3871s0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f3856f0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f3871s0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f3856f0 = formatPluralString;
        }
        if (!this.f3857g0) {
            CharSequence charSequence = this.f3856f0;
            if (z10 && !LocaleController.isRTL) {
                z14 = true;
            } else {
                z14 = false;
            }
            q6Var.c(charSequence, z14, true);
        }
        if (TextUtils.isEmpty(this.f3856f0) && !this.f3857g0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f3846a.a(z13, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((r) arrayList2.get(i13)).f3618c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((r) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        m mVar = this.h;
        m mVar2 = this.f3868r;
        if (z10) {
            if (this.O == 2) {
                mVar2.setItemAnimator(this.d);
                mVar.setItemAnimator(null);
            } else {
                mVar.setItemAnimator(this.R);
                mVar2.setItemAnimator(null);
            }
        } else {
            mVar.setItemAnimator(null);
            mVar2.setItemAnimator(null);
        }
        this.E.E(arrayList3, arrayList2);
        this.F.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f3867q0 = kVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.L != i10) {
            this.L = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f7) {
        this.f3871s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.f3864n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        di.f4 f4Var = this.J;
        if (f4Var != null) {
            f4Var.setTranslationY(f7);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
