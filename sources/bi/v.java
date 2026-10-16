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
import di.fc;
import di.kc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.j61;
import org.telegram.ui.px;
import org.telegram.ui.yy;
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
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
    public final hd I;
    public float I0;
    public di.d4 J;
    public OvershootInterpolator J0;
    public boolean K;
    public AnimatorSet K0;
    public int L;
    public final c2.b L0;
    public int M;
    public long M0;
    public float N;
    public Drawable N0;
    public int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final s4.k R;
    public final s4.b0 S;
    public final org.telegram.ui.Components.s6 T;
    public final n U;
    public final ImageView V;
    public final ImageView W;
    public final ne.b f3815a;
    public final org.telegram.ui.Components.q5 f3816a0;
    public final int f3817b;
    public final ArrayList f3818b0;
    public final Drawable f3819c;
    public float f3820c0;
    public final p d;
    public float f3821d0;
    public int e;
    public final yy f3822e0;
    public final int f3823f;
    public CharSequence f3824f0;
    public boolean f3825g0;
    public final m h;
    public int f3826h0;
    public SpannableStringBuilder f3827i0;
    public ValueAnimator f3828j0;
    public s f3829k0;
    public boolean f3830l0;
    public boolean m0;
    public ck0 f3831n;
    public float f3832n0;
    public int f3833o0;
    public u f3834p0;
    public org.telegram.ui.ActionBar.k f3835q0;
    public final m f3836r;
    public n9 f3837r0;
    public final x8 f3838s;
    public float f3839s0;
    public final float f3840t0;
    public final float f3841u0;
    public final ArrayList v;
    public final float f3842v0;
    public final ArrayList f3843w;
    public final a4.d f3844w0;
    public final ArrayList f3845x;
    public LinearGradient f3846x0;
    public final ArrayList f3847y;
    public Matrix f3848y0;
    public Paint f3849z0;

    public v(Context context, yy yyVar, int i10, int i11) {
        super(context);
        float f7;
        this.f3815a = new ne.b(1, this, es.h, 380L, false);
        this.v = new ArrayList();
        this.f3843w = new ArrayList();
        this.f3845x = new ArrayList();
        this.f3847y = new ArrayList();
        px pxVar = (px) this;
        q qVar = new q(pxVar, false);
        this.E = qVar;
        q qVar2 = new q(pxVar, true);
        this.F = qVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        hd hdVar = new hd(this);
        this.I = hdVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f3818b0 = new ArrayList();
        this.f3820c0 = -1.0f;
        this.f3830l0 = true;
        this.f3840t0 = 1.0f;
        this.f3841u0 = 0.95f;
        this.f3842v0 = 0.9f;
        this.f3844w0 = new a4.d(4);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        c2.b bVar = new c2.b(this);
        this.L0 = bVar;
        this.f3817b = i11;
        this.f3823f = i10;
        this.f3822e0 = yyVar;
        this.f3839s0 = AndroidUtilities.dp(68.0f);
        this.f3838s = MessagesController.getInstance(i10).getStoriesController();
        m mVar = new m(pxVar, context, 0);
        this.h = mVar;
        mVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        mVar.setClipToPadding(false);
        mVar.setClipChildren(false);
        hdVar.h = new a3.d(pxVar, 13);
        ah.j jVar = new ah.j(pxVar, 1);
        hdVar.f25282l = true;
        hdVar.f25280j = jVar;
        mVar.j(new ah.d0(pxVar, 1));
        s4.k kVar = new s4.k();
        this.R = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.f44872m = false;
        mVar.setItemAnimator(kVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.S = b0Var;
        mVar.setLayoutManager(b0Var);
        mVar.setOnItemClickListener(new d(pxVar, 0));
        mVar.setOnItemLongClickListener(new a1.c(pxVar, 3));
        mVar.setAdapter(qVar);
        addView(mVar, w7.z5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getContext(), true, true, false);
        this.T = s6Var;
        s6Var.setGravity(3);
        s6Var.setTextColor(getTextLogoColor());
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        s6Var.setTextSize(AndroidUtilities.dp(f7));
        s6Var.setImportantForAccessibility(1);
        s6Var.setFocusableInTouchMode(true);
        addView(s6Var, w7.z5.d(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.z5.d(22.0f, 90));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(26.0f), null);
        this.f3816a0 = q5Var;
        q5Var.f28194a = true;
        q5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(q5Var);
        addView(imageView2, w7.z5.d(40.0f, 40));
        n nVar = new n(pxVar, context, bVar);
        this.U = nVar;
        addView(nVar, w7.z5.d(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f3819c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        m mVar2 = new m(pxVar, getContext(), 1);
        this.f3836r = mVar2;
        getContext();
        mVar2.setLayoutManager(new s4.b0(0, false));
        mVar2.i(new o(0));
        ?? kVar2 = new s4.k();
        this.d = kVar2;
        kVar2.C = false;
        kVar2.f44872m = false;
        mVar2.setItemAnimator(kVar2);
        mVar2.setAdapter(qVar2);
        mVar2.setClipChildren(false);
        addView(mVar2, w7.z5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        q(false, false);
    }

    public static int a(px pxVar) {
        return pxVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f3817b == 0) {
            return f(org.telegram.ui.ActionBar.g6.A8);
        }
        return f(org.telegram.ui.ActionBar.g6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.g6.gl);
    }

    public final void b() {
        int i10;
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.f3820c0, 1.0f, 1.0f - this.f3821d0);
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
            m mVar = this.f3836r;
            m mVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) mVar2, (Utilities.Callback<View>) new f(0));
                mVar.setVisibility(4);
                mVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f3823f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f3845x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((r) arrayList2.get(i13)).f3606c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((r) arrayList2.get(i13)).f3606c));
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
                    n9 n9Var = this.f3837r0;
                    if (n9Var != null) {
                        n9Var.a();
                        this.f3837r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        s4.b0 b0Var = this.S;
        int N02 = b0Var.N0() + 10;
        ArrayList arrayList = this.f3845x;
        int size = arrayList.size();
        x8 x8Var = this.f3838s;
        boolean z10 = false;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && x8Var.D(0, ((r) arrayList.get(N0)).f3606c) == 0)) {
            if (this.f3817b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!x8Var.f3987z) {
                    return;
                }
            } else if (!x8Var.f3978p) {
                return;
            }
            x8Var.Q(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = w7.r.a(Math.min(this.N, this.f3821d0), 0.0f, 1.0f);
        float f7 = this.f3815a.e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        int i13 = 8;
        org.telegram.ui.Components.s6 s6Var = this.T;
        if (s6Var != null) {
            s6Var.setAlpha(f11);
            if (f11 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            s6Var.setVisibility(i12);
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
        if (i10 == NotificationCenter.storiesUpdated && this.f3830l0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q(z10, false);
            AndroidUtilities.runOnUIThread(new e(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: bi.v.dispatchDraw(android.graphics.Canvas):void");
    }

    public final u e(long j10) {
        m mVar;
        if (this.O == 2) {
            mVar = this.f3836r;
        } else {
            mVar = this.h;
        }
        for (int i10 = 0; i10 < mVar.getChildCount(); i10++) {
            View childAt = mVar.getChildAt(i10);
            if (childAt instanceof u) {
                u uVar = (u) childAt;
                if (uVar.E == j10) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        yy yyVar = this.f3822e0;
        if (yyVar != null && yyVar.getResourceProvider() != null) {
            return yyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
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
        return this.f3840t0;
    }

    public di.d4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f3838s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f3823f).clientUserId));
        this.f3822e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, g9.a(this.f3836r), false);
    }

    public final void i(u uVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && uVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = uVar.F;
            x8 x8Var = this.f3838s;
            if (z11 && !x8Var.H()) {
                if (!MessagesController.getInstance(this.f3823f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (x8Var.I(uVar.E) || x8Var.K(uVar.E)) {
                TL_stories.PeerStories y3 = x8Var.y(uVar.E);
                long j10 = uVar.E;
                n9 n9Var = this.f3837r0;
                if (n9Var != null) {
                    n9Var.a();
                    this.f3837r0 = null;
                }
                a3.i0 i0Var = new a3.i0(this, uVar, j10, 1);
                if (z10) {
                    i0Var.run();
                    return;
                }
                n9 n10 = s9.n(y3, i0Var);
                uVar.e = n10;
                this.f3837r0 = n10;
                if (n10 != null) {
                    x8Var.e0(uVar.E, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        u uVar;
        q8 o10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        yy yyVar = this.f3822e0;
        int i11 = this.f3823f;
        if (i10 == 0 && (o10 = MessagesController.getInstance(i11).getStoriesController().o()) != null && o10.a(i11, 1)) {
            yyVar.showDialog(new sg.j0(o10.b(), this.f3823f, getContext(), this.f3822e0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            m mVar = this.h;
            c6Var = null;
            if (i12 < mVar.getChildCount()) {
                uVar = (u) mVar.getChildAt(i12);
                if (i10 == 0) {
                    if (uVar.F) {
                        break;
                    }
                    i12++;
                } else if (uVar.E == j10) {
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
        if (i10 != 0) {
            if (yyVar != null) {
                c6Var = yyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, c6Var2);
            a2Var.q(500L);
            MessagesController.getInstance(i11).getStoriesController().k(j10, new i(this, a2Var, j10, uVar, 0), true, c6Var2);
            return;
        }
        kc.D(yyVar.getParentActivity(), i11).Q(fc.c(uVar));
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3845x;
            if (i10 < arrayList.size()) {
                if (((r) arrayList.get(i10)).f3606c == j10) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            s4.b0 b0Var = this.S;
            if (i10 < b0Var.I0()) {
                b0Var.h1(i10, 0);
                return true;
            } else if (i10 > b0Var.M0()) {
                b0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f7, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (this.f3820c0 != f7) {
            this.f3820c0 = f7;
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
                    float f13 = this.f3821d0;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final v f2891b;

                        {
                            this.f2891b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    v vVar = this.f2891b;
                                    vVar.getClass();
                                    vVar.f3821d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vVar.b();
                                    return;
                                case 1:
                                    v vVar2 = this.f2891b;
                                    vVar2.getClass();
                                    vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    v vVar3 = this.f2891b;
                                    vVar3.getClass();
                                    vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    v vVar4 = this.f2891b;
                                    vVar4.getClass();
                                    vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(es.h);
                    float f14 = this.f3820c0;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final v f2891b;

                        {
                            this.f2891b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    v vVar = this.f2891b;
                                    vVar.getClass();
                                    vVar.f3821d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    vVar.b();
                                    return;
                                case 1:
                                    v vVar2 = this.f2891b;
                                    vVar2.getClass();
                                    vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    v vVar3 = this.f2891b;
                                    vVar3.getClass();
                                    vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    v vVar4 = this.f2891b;
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
                    animatorSet2.addListener(new ah.p0(1, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.C0);
                    arrayList.add(this.F0);
                    if (this.A0) {
                        this.K0.setDuration(1000L);
                        float f15 = this.f3821d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v f2891b;

                            {
                                this.f2891b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        v vVar = this.f2891b;
                                        vVar.getClass();
                                        vVar.f3821d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vVar.b();
                                        return;
                                    case 1:
                                        v vVar2 = this.f2891b;
                                        vVar2.getClass();
                                        vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        v vVar3 = this.f2891b;
                                        vVar3.getClass();
                                        vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        v vVar4 = this.f2891b;
                                        vVar4.getClass();
                                        vVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f3841u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f16 = this.f3821d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f16, f12);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f3842v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v f2891b;

                            {
                                this.f2891b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        v vVar = this.f2891b;
                                        vVar.getClass();
                                        vVar.f3821d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        vVar.b();
                                        return;
                                    case 1:
                                        v vVar2 = this.f2891b;
                                        vVar2.getClass();
                                        vVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        v vVar3 = this.f2891b;
                                        vVar3.getClass();
                                        vVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        v vVar4 = this.f2891b;
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
                this.f3821d0 = f12;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new f(1));
            }
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f3823f).clientUserId;
        x8 x8Var = this.f3838s;
        if (!x8Var.J(j10)) {
            if (!x8Var.H() || x8Var.f3970g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.J == null) {
            di.d4 d4Var = new di.d4(getContext(), 1);
            d4Var.h(f(org.telegram.ui.ActionBar.g6.Fi));
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_CENTER;
            d4Var.l(0.0f, 29.0f);
            this.J = d4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new e(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new j61(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            di.d4 d4Var2 = this.J;
            d4Var2.h = di.d4.a(replaceSingleTag, d4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.z5.e(-1, 150, 51));
            }
        }
        di.d4 d4Var3 = this.J;
        if (d4Var3 != null) {
            if (d4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        b30 b30Var = s9.f3645b;
        if (b30Var != null) {
            b30Var.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
        }
        b30 b30Var2 = s9.f3646c;
        if (b30Var2 != null) {
            b30Var2.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
        }
        b30[] b30VarArr = s9.f3644a;
        b30 b30Var3 = b30VarArr[0];
        if (b30Var3 != null) {
            b30Var3.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
        }
        b30 b30Var4 = b30VarArr[1];
        if (b30Var4 != null) {
            b30Var4.d(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
        }
        if (s9.d != null) {
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.xj, false);
            int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false);
            s9.d.d(i0.a.d(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        n nVar = this.U;
        if (nVar != null) {
            nVar.b();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new j(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.f3836r, (Utilities.Callback<View>) new f(2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q(false, false);
        NotificationCenter.getInstance(this.f3823f).addObserver(this, NotificationCenter.storiesUpdated);
        c2.b bVar = this.L0;
        bVar.f4122a = true;
        AnimatorSet animatorSet = (AnimatorSet) bVar.f4124c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f3816a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f3823f).removeObserver(this, NotificationCenter.storiesUpdated);
        c2.b bVar = this.L0;
        bVar.f4122a = false;
        ((AnimatorSet) bVar.f4124c).cancel();
        n9 n9Var = this.f3837r0;
        if (n9Var != null) {
            n9Var.a();
            this.f3837r0 = null;
        }
        this.f3816a0.b();
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
            int size = this.f3847y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            m mVar = this.f3836r;
            int x10 = (int) (mVar.getX() + dp);
            int y3 = (int) (mVar.getY() + mVar.getHeight());
            hd hdVar = this.I;
            hdVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) mVar.getX(), (int) mVar.getY(), x10, y3);
            hdVar.f25279i = false;
            hdVar.f25276c = 0;
            hdVar.a(rectF);
            if (hdVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void q(boolean z10, boolean z11) {
        ArrayList arrayList;
        boolean z12;
        ArrayList arrayList2;
        String formatPluralString;
        boolean z13;
        boolean z14;
        boolean z15;
        String string;
        if ((this.O == 1 || this.f3832n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f3845x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f3843w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f3847y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f3817b;
        int i11 = this.f3823f;
        if (i10 != 1) {
            arrayList4.add(new r(UserConfig.getInstance(i11).getClientUserId()));
        }
        x8 x8Var = this.f3838s;
        if (i10 == 1) {
            arrayList = x8Var.h;
        } else {
            arrayList = x8Var.f3970g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new r(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!x8Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(x8Var.C(z12), size));
        this.f3824f0 = null;
        boolean G = x8Var.G();
        org.telegram.ui.Components.s6 s6Var = this.T;
        if (G) {
            arrayList2 = arrayList4;
            if (x8Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f3827i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        yb ybVar = new yb();
                        valueOf.setSpan(ybVar, valueOf.length() - 1, valueOf.length(), 0);
                        ybVar.f4044a = s6Var;
                        ybVar.f4048n = true;
                        this.f3827i0 = valueOf;
                    }
                    this.f3824f0 = this.f3827i0;
                } else {
                    this.f3824f0 = string2;
                }
            } else {
                if (this.f3839s0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f3824f0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f3839s0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f3824f0 = formatPluralString;
        }
        if (!this.f3825g0) {
            CharSequence charSequence = this.f3824f0;
            if (z10 && !LocaleController.isRTL) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = true;
            s6Var.c(charSequence, z15, true);
        } else {
            z13 = true;
        }
        if (TextUtils.isEmpty(this.f3824f0) && !this.f3825g0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        this.f3815a.a(z14, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((r) arrayList2.get(i13)).f3606c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((r) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        m mVar = this.h;
        m mVar2 = this.f3836r;
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
        this.f3835q0 = kVar;
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
        this.f3839s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.f3832n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        di.d4 d4Var = this.J;
        if (d4Var != null) {
            d4Var.setTranslationY(f7);
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
