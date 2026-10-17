package ci;

import ai.va;
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
import ei.qb;
import ei.vb;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ey;
import org.telegram.ui.vw;
public abstract class r extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public boolean A0;
    public final float B0;
    public ValueAnimator C0;
    public ValueAnimator D0;
    public final n E;
    public float E0;
    public final n F;
    public ValueAnimator F0;
    public final Paint G;
    public float G0;
    public final Paint H;
    public ValueAnimator H0;
    public final fd I;
    public float I0;
    public ei.x3 J;
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
    public final org.telegram.ui.Components.q6 T;
    public final k U;
    public final ImageView V;
    public final ImageView W;
    public final ne.b f5868a;
    public final org.telegram.ui.Components.p5 f5869a0;
    public final int f5870b;
    public final ArrayList f5871b0;
    public final Drawable f5872c;
    public float f5873c0;
    public final m d;
    public float f5874d0;
    public int e;
    public final ey f5875e0;
    public final int f5876f;
    public CharSequence f5877f0;
    public boolean f5878g0;
    public final j h;
    public int f5879h0;
    public SpannableStringBuilder f5880i0;
    public ValueAnimator f5881j0;
    public p f5882k0;
    public boolean f5883l0;
    public boolean m0;
    public yj0 f5884n;
    public float f5885n0;
    public int f5886o0;
    public q f5887p0;
    public org.telegram.ui.ActionBar.k f5888q0;
    public final j f5889r;
    public z7 f5890r0;
    public final i7 f5891s;
    public float f5892s0;
    public final float f5893t0;
    public final float f5894u0;
    public final ArrayList v;
    public final float f5895v0;
    public final ArrayList f5896w;
    public final a4.d f5897w0;
    public final ArrayList f5898x;
    public LinearGradient f5899x0;
    public final ArrayList f5900y;
    public Matrix f5901y0;
    public Paint f5902z0;

    public r(Context context, ey eyVar, int i10, int i11) {
        super(context);
        float f7;
        this.f5868a = new ne.b(1, this, bs.h, 380L, false);
        this.v = new ArrayList();
        this.f5896w = new ArrayList();
        this.f5898x = new ArrayList();
        this.f5900y = new ArrayList();
        vw vwVar = (vw) this;
        n nVar = new n(vwVar, false);
        this.E = nVar;
        n nVar2 = new n(vwVar, true);
        this.F = nVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        fd fdVar = new fd(this);
        this.I = fdVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f5871b0 = new ArrayList();
        this.f5873c0 = -1.0f;
        this.f5883l0 = true;
        this.f5893t0 = 1.0f;
        this.f5894u0 = 0.95f;
        this.f5895v0 = 0.9f;
        this.f5897w0 = new a4.d(9);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        c2.b bVar = new c2.b(this);
        this.L0 = bVar;
        this.f5870b = i11;
        this.f5876f = i10;
        this.f5875e0 = eyVar;
        this.f5892s0 = AndroidUtilities.dp(68.0f);
        this.f5891s = MessagesController.getInstance(i10).getStoriesController();
        j jVar = new j(vwVar, context, 0);
        this.h = jVar;
        jVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        jVar.setClipToPadding(false);
        jVar.setClipChildren(false);
        fdVar.h = new androidx.fragment.app.d(vwVar, 6);
        ah.j jVar2 = new ah.j(vwVar, 5);
        fdVar.f26219l = true;
        fdVar.f26217j = jVar2;
        jVar.j(new ah.d0(vwVar, 5));
        s4.k kVar = new s4.k();
        this.R = kVar;
        kVar.C = false;
        kVar.n(150L);
        kVar.f45972m = false;
        jVar.setItemAnimator(kVar);
        s4.b0 b0Var = new s4.b0(0, false);
        this.S = b0Var;
        jVar.setLayoutManager(b0Var);
        jVar.setOnItemClickListener(new va(vwVar, 4));
        jVar.setOnItemLongClickListener(new a1.c(vwVar, 13));
        jVar.setAdapter(nVar);
        addView(jVar, w7.z5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
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
        addView(q6Var, w7.z5.d(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.z5.d(22.0f, 90));
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(26.0f), null);
        this.f5869a0 = p5Var;
        p5Var.f29175a = true;
        p5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(p5Var);
        addView(imageView2, w7.z5.d(40.0f, 40));
        k kVar2 = new k(vwVar, context, bVar);
        this.U = kVar2;
        addView(kVar2, w7.z5.d(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f5872c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        j jVar3 = new j(vwVar, getContext(), 1);
        this.f5889r = jVar3;
        getContext();
        jVar3.setLayoutManager(new s4.b0(0, false));
        jVar3.i(new l(0));
        ?? kVar3 = new s4.k();
        this.d = kVar3;
        kVar3.C = false;
        kVar3.f45972m = false;
        jVar3.setItemAnimator(kVar3);
        jVar3.setAdapter(nVar2);
        jVar3.setClipChildren(false);
        addView(jVar3, w7.z5.a(-2.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1, 0));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(vw vwVar) {
        return vwVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f5870b == 0) {
            return f(org.telegram.ui.ActionBar.h6.A8);
        }
        return f(org.telegram.ui.ActionBar.h6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.h6.gl);
    }

    public final void b() {
        int i10;
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.f5873c0, 1.0f, 1.0f - this.f5874d0);
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
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.O;
            j jVar = this.f5889r;
            j jVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) jVar2, (Utilities.Callback<View>) new e(0));
                jVar.setVisibility(4);
                jVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f5876f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f5898x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((o) arrayList2.get(i13)).f5682c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((o) arrayList2.get(i13)).f5682c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    jVar.setVisibility(4);
                    jVar2.setVisibility(0);
                } else if (i11 == 2) {
                    jVar.setVisibility(0);
                    jVar2.setVisibility(4);
                    this.S.h1(0, 0);
                    ah.g gVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    gVar.run();
                    z7 z7Var = this.f5890r0;
                    if (z7Var != null) {
                        z7Var.a();
                        this.f5890r0 = null;
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
        ArrayList arrayList = this.f5898x;
        int size = arrayList.size();
        i7 i7Var = this.f5891s;
        boolean z10 = false;
        if (N02 > size || ((N0 = b0Var.N0() + 9) < arrayList.size() && i7Var.D(0, ((o) arrayList.get(N0)).f5682c) == 0)) {
            if (this.f5870b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!i7Var.f5514z) {
                    return;
                }
            } else if (!i7Var.f5505p) {
                return;
            }
            i7Var.Q(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = w7.r.a(Math.min(this.N, this.f5874d0), 0.0f, 1.0f);
        float f7 = this.f5868a.e;
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
        k kVar = this.U;
        if (kVar != null) {
            kVar.setAlpha(a2);
            if (a2 > 0.0f) {
                i13 = 0;
            }
            kVar.setVisibility(i13);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        if (i10 == NotificationCenter.storiesUpdated && this.f5883l0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p(z10, false);
            AndroidUtilities.runOnUIThread(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r.dispatchDraw(android.graphics.Canvas):void");
    }

    public final q e(long j10) {
        j jVar;
        if (this.O == 2) {
            jVar = this.f5889r;
        } else {
            jVar = this.h;
        }
        for (int i10 = 0; i10 < jVar.getChildCount(); i10++) {
            View childAt = jVar.getChildAt(i10);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (qVar.E == j10) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        ey eyVar = this.f5875e0;
        if (eyVar != null && eyVar.getResourceProvider() != null) {
            return eyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
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
        return this.f5893t0;
    }

    public ei.x3 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f5891s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f5876f).clientUserId));
        this.f5875e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, r7.a(this.f5889r), false);
    }

    public final void i(q qVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && qVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = qVar.F;
            i7 i7Var = this.f5891s;
            if (z11 && !i7Var.H()) {
                if (!MessagesController.getInstance(this.f5876f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (i7Var.I(qVar.E) || i7Var.K(qVar.E)) {
                TL_stories.PeerStories y3 = i7Var.y(qVar.E);
                long j10 = qVar.E;
                z7 z7Var = this.f5890r0;
                if (z7Var != null) {
                    z7Var.a();
                    this.f5890r0 = null;
                }
                a3.i0 i0Var = new a3.i0(this, qVar, j10, 4);
                if (z10) {
                    i0Var.run();
                    return;
                }
                z7 n10 = d8.n(y3, i0Var);
                qVar.e = n10;
                this.f5890r0 = n10;
                if (n10 != null) {
                    i7Var.e0(qVar.E, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        q qVar;
        c7 o10;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        ey eyVar = this.f5875e0;
        int i11 = this.f5876f;
        if (i10 == 0 && (o10 = MessagesController.getInstance(i11).getStoriesController().o()) != null && o10.a(i11, 1)) {
            eyVar.showDialog(new sg.j0(o10.b(), this.f5876f, getContext(), this.f5875e0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            j jVar = this.h;
            d6Var = null;
            if (i12 < jVar.getChildCount()) {
                qVar = (q) jVar.getChildAt(i12);
                if (i10 == 0) {
                    if (qVar.F) {
                        break;
                    }
                    i12++;
                } else if (qVar.E == j10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar == null) {
            return;
        }
        if (i10 != 0) {
            if (eyVar != null) {
                d6Var = eyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, d6Var2);
            b2Var.q(500L);
            MessagesController.getInstance(i11).getStoriesController().k(j10, new ai.v2(this, b2Var, j10, qVar, 1), true, d6Var2);
            return;
        }
        vb.D(eyVar.getParentActivity(), i11).Q(qb.c(qVar));
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5898x;
            if (i10 < arrayList.size()) {
                if (((o) arrayList.get(i10)).f5682c == j10) {
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
        if (this.f5873c0 != f7) {
            this.f5873c0 = f7;
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
                    float f13 = this.f5874d0;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r f5262b;

                        {
                            this.f5262b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r rVar = this.f5262b;
                                    rVar.getClass();
                                    rVar.f5874d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar.b();
                                    return;
                                case 1:
                                    r rVar2 = this.f5262b;
                                    rVar2.getClass();
                                    rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    r rVar3 = this.f5262b;
                                    rVar3.getClass();
                                    rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    r rVar4 = this.f5262b;
                                    rVar4.getClass();
                                    rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(bs.h);
                    float f14 = this.f5873c0;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r f5262b;

                        {
                            this.f5262b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r rVar = this.f5262b;
                                    rVar.getClass();
                                    rVar.f5874d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar.b();
                                    return;
                                case 1:
                                    r rVar2 = this.f5262b;
                                    rVar2.getClass();
                                    rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    r rVar3 = this.f5262b;
                                    rVar3.getClass();
                                    rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    r rVar4 = this.f5262b;
                                    rVar4.getClass();
                                    rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar4.invalidate();
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
                        float f15 = this.f5874d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r f5262b;

                            {
                                this.f5262b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r rVar = this.f5262b;
                                        rVar.getClass();
                                        rVar.f5874d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar.b();
                                        return;
                                    case 1:
                                        r rVar2 = this.f5262b;
                                        rVar2.getClass();
                                        rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        r rVar3 = this.f5262b;
                                        rVar3.getClass();
                                        rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        r rVar4 = this.f5262b;
                                        rVar4.getClass();
                                        rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f5894u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f16 = this.f5874d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f16, f12);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f5895v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r f5262b;

                            {
                                this.f5262b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r rVar = this.f5262b;
                                        rVar.getClass();
                                        rVar.f5874d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar.b();
                                        return;
                                    case 1:
                                        r rVar2 = this.f5262b;
                                        rVar2.getClass();
                                        rVar2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        r rVar3 = this.f5262b;
                                        rVar3.getClass();
                                        rVar3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        r rVar4 = this.f5262b;
                                        rVar4.getClass();
                                        rVar4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar4.invalidate();
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
                this.f5874d0 = f12;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new e(1));
            }
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f5876f).clientUserId;
        i7 i7Var = this.f5891s;
        if (!i7Var.J(j10)) {
            if (!i7Var.H() || i7Var.f5497g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.J == null) {
            ei.x3 x3Var = new ei.x3(getContext(), 1);
            x3Var.h(f(org.telegram.ui.ActionBar.h6.Fi));
            x3Var.p(true);
            x3Var.K = Layout.Alignment.ALIGN_CENTER;
            x3Var.l(0.0f, 29.0f);
            this.J = x3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.h6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new c61(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            ei.x3 x3Var2 = this.J;
            x3Var2.h = ei.x3.a(replaceSingleTag, x3Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.z5.e(-1, 150, 51));
            }
        }
        ei.x3 x3Var3 = this.J;
        if (x3Var3 != null) {
            if (x3Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        x20 x20Var = d8.f5326b;
        if (x20Var != null) {
            x20Var.d(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.lk, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.mk, false), 0, 0);
        }
        x20 x20Var2 = d8.f5327c;
        if (x20Var2 != null) {
            x20Var2.d(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.nk, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ok, false), 0, 0);
        }
        x20[] x20VarArr = d8.f5325a;
        x20 x20Var3 = x20VarArr[0];
        if (x20Var3 != null) {
            x20Var3.d(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.jk, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.kk, false), 0, 0);
        }
        x20 x20Var4 = x20VarArr[1];
        if (x20Var4 != null) {
            x20Var4.d(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hk, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ik, false), 0, 0);
        }
        if (d8.d != null) {
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.xj, false);
            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false);
            d8.d.d(i0.b.f(0.25f, x02, x03), x03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        k kVar = this.U;
        if (kVar != null) {
            kVar.b();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new g(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.f5889r, (Utilities.Callback<View>) new e(2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f5876f).addObserver(this, NotificationCenter.storiesUpdated);
        c2.b bVar = this.L0;
        bVar.f4492a = true;
        AnimatorSet animatorSet = (AnimatorSet) bVar.f4494c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f5869a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f5876f).removeObserver(this, NotificationCenter.storiesUpdated);
        c2.b bVar = this.L0;
        bVar.f4492a = false;
        ((AnimatorSet) bVar.f4494c).cancel();
        z7 z7Var = this.f5890r0;
        if (z7Var != null) {
            z7Var.a();
            this.f5890r0 = null;
        }
        this.f5869a0.b();
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
            int size = this.f5900y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            j jVar = this.f5889r;
            int x10 = (int) (jVar.getX() + dp);
            int y3 = (int) (jVar.getY() + jVar.getHeight());
            fd fdVar = this.I;
            fdVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) jVar.getX(), (int) jVar.getY(), x10, y3);
            fdVar.f26216i = false;
            fdVar.f26213c = 0;
            fdVar.a(rectF);
            if (fdVar.b(motionEvent)) {
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
        boolean z15;
        String string;
        if ((this.O == 1 || this.f5885n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f5898x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f5896w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f5900y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f5870b;
        int i11 = this.f5876f;
        if (i10 != 1) {
            arrayList4.add(new o(UserConfig.getInstance(i11).getClientUserId()));
        }
        i7 i7Var = this.f5891s;
        if (i10 == 1) {
            arrayList = i7Var.h;
        } else {
            arrayList = i7Var.f5497g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new o(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!i7Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(i7Var.C(z12), size));
        this.f5877f0 = null;
        boolean G = i7Var.G();
        org.telegram.ui.Components.q6 q6Var = this.T;
        if (G) {
            arrayList2 = arrayList4;
            if (i7Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f5880i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        ga gaVar = new ga();
                        valueOf.setSpan(gaVar, valueOf.length() - 1, valueOf.length(), 0);
                        gaVar.f5435a = q6Var;
                        gaVar.f5439n = true;
                        this.f5880i0 = valueOf;
                    }
                    this.f5877f0 = this.f5880i0;
                } else {
                    this.f5877f0 = string2;
                }
            } else {
                if (this.f5892s0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f5877f0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f5892s0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f5877f0 = formatPluralString;
        }
        if (!this.f5878g0) {
            CharSequence charSequence = this.f5877f0;
            if (z10 && !LocaleController.isRTL) {
                z15 = true;
            } else {
                z15 = false;
            }
            z13 = true;
            q6Var.c(charSequence, z15, true);
        } else {
            z13 = true;
        }
        if (TextUtils.isEmpty(this.f5877f0) && !this.f5878g0) {
            z14 = false;
        } else {
            z14 = z13;
        }
        this.f5868a.a(z14, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((o) arrayList2.get(i13)).f5682c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((o) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        j jVar = this.h;
        j jVar2 = this.f5889r;
        if (z10) {
            if (this.O == 2) {
                jVar2.setItemAnimator(this.d);
                jVar.setItemAnimator(null);
            } else {
                jVar.setItemAnimator(this.R);
                jVar2.setItemAnimator(null);
            }
        } else {
            jVar.setItemAnimator(null);
            jVar2.setItemAnimator(null);
        }
        this.E.E(arrayList3, arrayList2);
        this.F.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f5888q0 = kVar;
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
        this.f5892s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.f5885n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ei.x3 x3Var = this.J;
        if (x3Var != null) {
            x3Var.setTranslationY(f7);
        }
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
