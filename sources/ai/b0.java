package ai;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.m61;
import org.telegram.ui.kx;
import org.telegram.ui.ty;
public abstract class b0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, me.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final v E;
    public float E0;
    public final v F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final id I;
    public float I0;
    public ci.d4 J;
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
    public final s4.d0 S;
    public final org.telegram.ui.Components.r6 T;
    public final s U;
    public final ImageView V;
    public final ImageView W;
    public final me.b f660a;
    public final org.telegram.ui.Components.q5 f661a0;
    public final int f662b;
    public final ArrayList f663b0;
    public final Drawable f664c;
    public float f665c0;
    public final u d;
    public float f666d0;
    public int f667e;
    public final ty f668e0;
    public final int f669f;
    public CharSequence f670f0;
    public boolean f671g0;
    public final q h;
    public int f672h0;
    public SpannableStringBuilder f673i0;
    public ValueAnimator f674j0;
    public y f675k0;
    public boolean f676l0;
    public boolean m0;
    public gk0 f677n;
    public float f678n0;
    public int f679o0;
    public a0 f680p0;
    public org.telegram.ui.ActionBar.k f681q0;
    public final q f682r;
    public ea f683r0;
    public final m9 f684s;
    public float f685s0;
    public final float f686t0;
    public final float f687u0;
    public final ArrayList v;
    public final float f688v0;
    public final ArrayList f689w;
    public final a4.d f690w0;
    public final ArrayList f691x;
    public LinearGradient f692x0;
    public final ArrayList f693y;
    public Matrix f694y0;
    public Paint f695z0;

    public b0(Context context, ty tyVar, int i10, int i11) {
        super(context);
        float f7;
        this.f660a = new me.b(1, this, hs.h, 380L, false);
        this.v = new ArrayList();
        this.f689w = new ArrayList();
        this.f691x = new ArrayList();
        this.f693y = new ArrayList();
        kx kxVar = (kx) this;
        v vVar = new v(kxVar, false);
        this.E = vVar;
        v vVar2 = new v(kxVar, true);
        this.F = vVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        id idVar = new id(this);
        this.I = idVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f663b0 = new ArrayList();
        this.f665c0 = -1.0f;
        this.f676l0 = true;
        this.f686t0 = 1.0f;
        this.f687u0 = 0.95f;
        this.f688v0 = 0.9f;
        this.f690w0 = new a4.d(1);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(this);
        this.L0 = mVar;
        this.f662b = i11;
        this.f669f = i10;
        this.f668e0 = tyVar;
        this.f685s0 = AndroidUtilities.dp(68.0f);
        this.f684s = MessagesController.getInstance(i10).getStoriesController();
        q qVar = new q(kxVar, context, 0);
        this.h = qVar;
        qVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        qVar.setClipToPadding(false);
        qVar.setClipChildren(false);
        idVar.h = new a3.d(kxVar, 2);
        f fVar = new f(kxVar, 0);
        idVar.f27357l = true;
        idVar.f27355j = fVar;
        qVar.j(new r(kxVar, 0));
        s4.j jVar = new s4.j();
        this.R = jVar;
        jVar.C = false;
        jVar.n(150L);
        jVar.f47698m = false;
        qVar.setItemAnimator(jVar);
        s4.d0 d0Var = new s4.d0(0, false);
        this.S = d0Var;
        qVar.setLayoutManager(d0Var);
        qVar.setOnItemClickListener(new g(kxVar, 0));
        qVar.setOnItemLongClickListener(new a1.c(kxVar, 2));
        qVar.setAdapter(vVar);
        addView(qVar, w7.x5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(getContext(), true, true, false);
        this.T = r6Var;
        r6Var.setGravity(3);
        r6Var.setTextColor(getTextLogoColor());
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        r6Var.setTextSize(AndroidUtilities.dp(f7));
        r6Var.setImportantForAccessibility(1);
        r6Var.setFocusableInTouchMode(true);
        addView(r6Var, w7.x5.d(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.x5.d(22.0f, 90));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(26.0f), null);
        this.f661a0 = q5Var;
        q5Var.f30042a = true;
        q5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(q5Var);
        addView(imageView2, w7.x5.d(40.0f, 40));
        s sVar = new s(kxVar, context, mVar);
        this.U = sVar;
        addView(sVar, w7.x5.d(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f664c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        q qVar2 = new q(kxVar, getContext(), 1);
        this.f682r = qVar2;
        getContext();
        qVar2.setLayoutManager(new s4.d0(0, false));
        qVar2.i(new t(0));
        ?? jVar2 = new s4.j();
        this.d = jVar2;
        jVar2.C = false;
        jVar2.f47698m = false;
        qVar2.setItemAnimator(jVar2);
        qVar2.setAdapter(vVar2);
        qVar2.setClipChildren(false);
        addView(qVar2, w7.x5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        q(false, false);
    }

    public static int a(kx kxVar) {
        return kxVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f662b == 0) {
            return f(org.telegram.ui.ActionBar.i6.A8);
        }
        return f(org.telegram.ui.ActionBar.i6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.i6.gl);
    }

    public final void b() {
        int i10;
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.f665c0, 1.0f, 1.0f - this.f666d0);
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
                AndroidUtilities.runOnUIThread(new h(this, 0));
            }
            int i11 = this.O;
            q qVar = this.f682r;
            q qVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) qVar2, (Utilities.Callback<View>) new i(0));
                qVar.setVisibility(4);
                qVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f669f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f691x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((w) arrayList2.get(i13)).f1841c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((w) arrayList2.get(i13)).f1841c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    qVar.setVisibility(4);
                    qVar2.setVisibility(0);
                } else if (i11 == 2) {
                    qVar.setVisibility(0);
                    qVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    p8 p8Var = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(p8Var);
                    p8Var.run();
                    ea eaVar = this.f683r0;
                    if (eaVar != null) {
                        eaVar.a();
                        this.f683r0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        s4.d0 d0Var = this.S;
        int N02 = d0Var.N0() + 10;
        ArrayList arrayList = this.f691x;
        int size = arrayList.size();
        m9 m9Var = this.f684s;
        boolean z10 = false;
        if (N02 > size || ((N0 = d0Var.N0() + 9) < arrayList.size() && m9Var.D(0, ((w) arrayList.get(N0)).f1841c) == 0)) {
            if (this.f662b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!m9Var.f1428z) {
                    return;
                }
            } else if (!m9Var.f1419p) {
                return;
            }
            m9Var.Q(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = w7.o.a(Math.min(this.N, this.f666d0), 0.0f, 1.0f);
        float f7 = this.f660a.f16337e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        int i13 = 8;
        org.telegram.ui.Components.r6 r6Var = this.T;
        if (r6Var != null) {
            r6Var.setAlpha(f11);
            if (f11 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            r6Var.setVisibility(i12);
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
        s sVar = this.U;
        if (sVar != null) {
            sVar.setAlpha(a2);
            if (a2 > 0.0f) {
                i13 = 0;
            }
            sVar.setVisibility(i13);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        if (i10 == NotificationCenter.storiesUpdated && this.f676l0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q(z10, false);
            AndroidUtilities.runOnUIThread(new h(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ai.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    public final a0 e(long j3) {
        q qVar;
        if (this.O == 2) {
            qVar = this.f682r;
        } else {
            qVar = this.h;
        }
        for (int i10 = 0; i10 < qVar.getChildCount(); i10++) {
            View childAt = qVar.getChildAt(i10);
            if (childAt instanceof a0) {
                a0 a0Var = (a0) childAt;
                if (a0Var.E == j3) {
                    return a0Var;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        ty tyVar = this.f668e0;
        if (tyVar != null && tyVar.getResourceProvider() != null) {
            return tyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
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
        return this.f686t0;
    }

    public ci.d4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f684s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f669f).clientUserId));
        this.f668e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, v9.a(this.f682r), false);
    }

    public final void i(a0 a0Var, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && a0Var != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = a0Var.F;
            m9 m9Var = this.f684s;
            if (z11 && !m9Var.H()) {
                if (!MessagesController.getInstance(this.f669f).storiesEnabled()) {
                    o();
                } else {
                    j(0L);
                }
            } else if (m9Var.I(a0Var.E) || m9Var.K(a0Var.E)) {
                TL_stories.PeerStories y3 = m9Var.y(a0Var.E);
                long j3 = a0Var.E;
                ea eaVar = this.f683r0;
                if (eaVar != null) {
                    eaVar.a();
                    this.f683r0 = null;
                }
                a3.h0 h0Var = new a3.h0(this, a0Var, j3, 1);
                if (z10) {
                    h0Var.run();
                    return;
                }
                ea n10 = ja.n(y3, h0Var);
                a0Var.f625e = n10;
                this.f683r0 = n10;
                if (n10 != null) {
                    m9Var.e0(a0Var.E, true);
                }
            }
        }
    }

    public final void j(long j3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        a0 a0Var;
        g9 o9;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        ty tyVar = this.f668e0;
        int i11 = this.f669f;
        if (i10 == 0 && (o9 = MessagesController.getInstance(i11).getStoriesController().o()) != null && o9.a(i11, 1)) {
            tyVar.showDialog(new rg.j0(o9.b(), this.f669f, getContext(), this.f668e0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            q qVar = this.h;
            e6Var = null;
            if (i12 < qVar.getChildCount()) {
                a0Var = (a0) qVar.getChildAt(i12);
                if (i10 == 0) {
                    if (a0Var.F) {
                        break;
                    }
                    i12++;
                } else if (a0Var.E == j3) {
                    break;
                } else {
                    i12++;
                }
            } else {
                a0Var = null;
                break;
            }
        }
        if (a0Var == null) {
            return;
        }
        if (i10 != 0) {
            if (tyVar != null) {
                e6Var = tyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, e6Var2);
            b2Var.q(500L);
            MessagesController.getInstance(i11).getStoriesController().k(j3, new l(this, b2Var, j3, a0Var, 0), true, e6Var2);
            return;
        }
        ci.lc.D(tyVar.getParentActivity(), i11).Q(ci.gc.c(a0Var));
    }

    public final boolean k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f691x;
            if (i10 < arrayList.size()) {
                if (((w) arrayList.get(i10)).f1841c == j3) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            s4.d0 d0Var = this.S;
            if (i10 < d0Var.I0()) {
                d0Var.h1(i10, 0);
                return true;
            } else if (i10 > d0Var.M0()) {
                d0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f7, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (this.f665c0 != f7) {
            this.f665c0 = f7;
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
                    float f13 = this.f666d0;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final b0 f869b;

                        {
                            this.f869b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    b0 b0Var = this.f869b;
                                    b0Var.getClass();
                                    b0Var.f666d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    b0Var.b();
                                    return;
                                case 1:
                                    b0 b0Var2 = this.f869b;
                                    b0Var2.getClass();
                                    b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    b0 b0Var3 = this.f869b;
                                    b0Var3.getClass();
                                    b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    b0 b0Var4 = this.f869b;
                                    b0Var4.getClass();
                                    b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    b0Var4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(hs.h);
                    float f14 = this.f665c0;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final b0 f869b;

                        {
                            this.f869b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    b0 b0Var = this.f869b;
                                    b0Var.getClass();
                                    b0Var.f666d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    b0Var.b();
                                    return;
                                case 1:
                                    b0 b0Var2 = this.f869b;
                                    b0Var2.getClass();
                                    b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    b0 b0Var3 = this.f869b;
                                    b0Var3.getClass();
                                    b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    b0 b0Var4 = this.f869b;
                                    b0Var4.getClass();
                                    b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    b0Var4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.F0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K0 = animatorSet2;
                    animatorSet2.addListener(new n(0, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.C0);
                    arrayList.add(this.F0);
                    if (this.A0) {
                        this.K0.setDuration(1000L);
                        float f15 = this.f666d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final b0 f869b;

                            {
                                this.f869b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        b0 b0Var = this.f869b;
                                        b0Var.getClass();
                                        b0Var.f666d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        b0Var.b();
                                        return;
                                    case 1:
                                        b0 b0Var2 = this.f869b;
                                        b0Var2.getClass();
                                        b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        b0 b0Var3 = this.f869b;
                                        b0Var3.getClass();
                                        b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        b0 b0Var4 = this.f869b;
                                        b0Var4.getClass();
                                        b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        b0Var4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f687u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f16 = this.f666d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f16, f12);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f688v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final b0 f869b;

                            {
                                this.f869b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        b0 b0Var = this.f869b;
                                        b0Var.getClass();
                                        b0Var.f666d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        b0Var.b();
                                        return;
                                    case 1:
                                        b0 b0Var2 = this.f869b;
                                        b0Var2.getClass();
                                        b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        b0 b0Var3 = this.f869b;
                                        b0Var3.getClass();
                                        b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        b0 b0Var4 = this.f869b;
                                        b0Var4.getClass();
                                        b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        b0Var4.invalidate();
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
                this.f666d0 = f12;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new i(1));
            }
        }
    }

    public final boolean m() {
        long j3 = UserConfig.getInstance(this.f669f).clientUserId;
        m9 m9Var = this.f684s;
        if (!m9Var.J(j3)) {
            if (!m9Var.H() || m9Var.f1411g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void o() {
        if (this.J == null) {
            ci.d4 d4Var = new ci.d4(getContext(), 1);
            d4Var.h(f(org.telegram.ui.ActionBar.i6.Fi));
            d4Var.p(true);
            d4Var.K = Layout.Alignment.ALIGN_CENTER;
            d4Var.l(0.0f, 29.0f);
            this.J = d4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.i6.Gi, 0, new h(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new m61(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            ci.d4 d4Var2 = this.J;
            d4Var2.h = ci.d4.a(replaceSingleTag, d4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.x5.e(-1, 150, 51));
            }
        }
        ci.d4 d4Var3 = this.J;
        if (d4Var3 != null) {
            if (d4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q(false, false);
        NotificationCenter.getInstance(this.f669f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f7951a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.f7953c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f661a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f669f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f7951a = false;
        ((AnimatorSet) mVar.f7953c).cancel();
        ea eaVar = this.f683r0;
        if (eaVar != null) {
            eaVar.a();
            this.f683r0 = null;
        }
        this.f661a0.b();
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
            int size = this.f693y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            q qVar = this.f682r;
            int x10 = (int) (qVar.getX() + dp);
            int y3 = (int) (qVar.getY() + qVar.getHeight());
            id idVar = this.I;
            idVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) qVar.getX(), (int) qVar.getY(), x10, y3);
            idVar.f27354i = false;
            idVar.f27350c = 0;
            idVar.a(rectF);
            if (idVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        f30 f30Var = ja.f1196b;
        if (f30Var != null) {
            f30Var.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.lk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.mk, false), 0, 0);
        }
        f30 f30Var2 = ja.f1197c;
        if (f30Var2 != null) {
            f30Var2.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.nk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ok, false), 0, 0);
        }
        f30[] f30VarArr = ja.f1195a;
        f30 f30Var3 = f30VarArr[0];
        if (f30Var3 != null) {
            f30Var3.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.jk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kk, false), 0, 0);
        }
        f30 f30Var4 = f30VarArr[1];
        if (f30Var4 != null) {
            f30Var4.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ik, false), 0, 0);
        }
        if (ja.d != null) {
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.xj, false);
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false);
            ja.d.d(i0.a.d(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        s sVar = this.U;
        if (sVar != null) {
            sVar.d();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new m(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.f682r, (Utilities.Callback<View>) new i(2));
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
        if ((this.O == 1 || this.f678n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f691x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f689w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f693y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f662b;
        int i11 = this.f669f;
        if (i10 != 1) {
            arrayList4.add(new w(UserConfig.getInstance(i11).getClientUserId()));
        }
        m9 m9Var = this.f684s;
        if (i10 == 1) {
            arrayList = m9Var.h;
        } else {
            arrayList = m9Var.f1411g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new w(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!m9Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(m9Var.C(z12), size));
        this.f670f0 = null;
        boolean G = m9Var.G();
        org.telegram.ui.Components.r6 r6Var = this.T;
        if (G) {
            arrayList2 = arrayList4;
            if (m9Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f673i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        qc qcVar = new qc();
                        valueOf.setSpan(qcVar, valueOf.length() - 1, valueOf.length(), 0);
                        qcVar.f1632a = r6Var;
                        qcVar.f1637n = true;
                        this.f673i0 = valueOf;
                    }
                    this.f670f0 = this.f673i0;
                } else {
                    this.f670f0 = string2;
                }
            } else {
                if (this.f685s0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f670f0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f685s0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f670f0 = formatPluralString;
        }
        if (!this.f671g0) {
            CharSequence charSequence = this.f670f0;
            if (z10 && !LocaleController.isRTL) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = true;
            r6Var.c(charSequence, z15, true);
        } else {
            z13 = true;
        }
        if (TextUtils.isEmpty(this.f670f0) && !this.f671g0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        this.f660a.a(z14, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((w) arrayList2.get(i13)).f1841c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((w) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        q qVar = this.h;
        q qVar2 = this.f682r;
        if (z10) {
            if (this.O == 2) {
                qVar2.setItemAnimator(this.d);
                qVar.setItemAnimator(null);
            } else {
                qVar.setItemAnimator(this.R);
                qVar2.setItemAnimator(null);
            }
        } else {
            qVar.setItemAnimator(null);
            qVar2.setItemAnimator(null);
        }
        this.E.E(arrayList3, arrayList2);
        this.F.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f681q0 = kVar;
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
        this.f685s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.f678n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ci.d4 d4Var = this.J;
        if (d4Var != null) {
            d4Var.setTranslationY(f7);
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
