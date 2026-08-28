package ih;

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
import kh.rb;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z10;
import org.telegram.ui.dy;
import org.telegram.ui.vw;
public abstract class r extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, td.b {
    public final n A;
    public float A0;
    public final n B;
    public ValueAnimator B0;
    public final Paint C;
    public float C0;
    public final Paint D;
    public ValueAnimator D0;
    public final wc E;
    public float E0;
    public kh.x3 F;
    public OvershootInterpolator F0;
    public boolean G;
    public AnimatorSet G0;
    public int H;
    public final com.google.firebase.messaging.l H0;
    public int I;
    public long I0;
    public float J;
    public Drawable J0;
    public int K;
    public final ArrayList L;
    public final ArrayList M;
    public final f2.n N;
    public final f2.m0 O;
    public final org.telegram.ui.Components.j6 P;
    public final k Q;
    public final ImageView R;
    public final ImageView S;
    public final org.telegram.ui.Components.i5 T;
    public final ArrayList U;
    public float V;
    public float W;
    public final td.a f12018a;
    public final dy f12019a0;
    public final int f12020b;
    public CharSequence f12021b0;
    public final Drawable f12022c;
    public boolean f12023c0;
    public final m d;
    public int f12024d0;
    public int f12025e;
    public SpannableStringBuilder f12026e0;
    public final int f12027f;
    public ValueAnimator f12028f0;
    public p f12029g0;
    public final j h;
    public boolean f12030h0;
    public boolean f12031i0;
    public float f12032j0;
    public int f12033k0;
    public q f12034l0;
    public org.telegram.ui.ActionBar.k m0;
    public qi0 f12035n;
    public m7 f12036n0;
    public float f12037o0;
    public final float f12038p0;
    public final float f12039q0;
    public final j f12040r;
    public final float f12041r0;
    public final v6 f12042s;
    public final a5.e f12043s0;
    public LinearGradient f12044t0;
    public Matrix f12045u0;
    public final ArrayList v;
    public Paint f12046v0;
    public final ArrayList f12047w;
    public boolean f12048w0;
    public final ArrayList f12049x;
    public final float f12050x0;
    public final ArrayList f12051y;
    public ValueAnimator f12052y0;
    public ValueAnimator f12053z0;

    public r(Context context, dy dyVar, int i9, int i10) {
        super(context);
        float f10;
        this.f12018a = new td.a(1, this, gr.h, 380L, false);
        this.v = new ArrayList();
        this.f12047w = new ArrayList();
        this.f12049x = new ArrayList();
        this.f12051y = new ArrayList();
        vw vwVar = (vw) this;
        n nVar = new n(vwVar, false);
        this.A = nVar;
        n nVar2 = new n(vwVar, true);
        this.B = nVar2;
        Paint paint = new Paint();
        this.C = new Paint(1);
        this.D = new Paint(1);
        wc wcVar = new wc(this);
        this.E = wcVar;
        this.J = -1.0f;
        this.K = -1;
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.U = new ArrayList();
        this.V = -1.0f;
        this.f12030h0 = true;
        this.f12038p0 = 1.0f;
        this.f12039q0 = 0.95f;
        this.f12041r0 = 0.9f;
        this.f12043s0 = new a5.e(22);
        this.f12050x0 = 0.3f;
        this.A0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.F0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(this);
        this.H0 = lVar;
        this.f12020b = i10;
        this.f12027f = i9;
        this.f12019a0 = dyVar;
        this.f12037o0 = AndroidUtilities.dp(68.0f);
        this.f12042s = MessagesController.getInstance(i9).getStoriesController();
        j jVar = new j(vwVar, context, 0);
        this.h = jVar;
        jVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        jVar.setClipToPadding(false);
        jVar.setClipChildren(false);
        wcVar.h = new g(vwVar, 0);
        bg.d2 d2Var = new bg.d2(vwVar, 8);
        wcVar.f34196l = true;
        wcVar.f34194j = d2Var;
        jVar.j(new bg.o2(vwVar, 10));
        f2.n nVar3 = new f2.n();
        this.N = nVar3;
        nVar3.C = false;
        nVar3.n(150L);
        nVar3.f5532m = false;
        jVar.setItemAnimator(nVar3);
        f2.m0 m0Var = new f2.m0(0, false);
        this.O = m0Var;
        jVar.setLayoutManager(m0Var);
        jVar.setOnItemClickListener(new eh.j(vwVar, 7));
        jVar.setOnItemLongClickListener(new gh.i3(vwVar, 18));
        jVar.setAdapter(nVar);
        addView(jVar, g7.e6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), true, true, false);
        this.P = j6Var;
        j6Var.setGravity(3);
        j6Var.setTextColor(getTextLogoColor());
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        j6Var.setTextSize(AndroidUtilities.dp(f10));
        j6Var.setImportantForAccessibility(1);
        j6Var.setFocusableInTouchMode(true);
        addView(j6Var, g7.e6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.R = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, g7.e6.c(22.0f, 90));
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(26.0f), null);
        this.T = i5Var;
        i5Var.f29315a = true;
        i5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.S = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(i5Var);
        addView(imageView2, g7.e6.c(40.0f, 40));
        k kVar = new k(vwVar, context, lVar);
        this.Q = kVar;
        addView(kVar, g7.e6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f12022c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        j jVar2 = new j(vwVar, getContext(), 1);
        this.f12040r = jVar2;
        getContext();
        jVar2.setLayoutManager(new f2.m0(0, false));
        jVar2.i(new l(0));
        ?? nVar4 = new f2.n();
        this.d = nVar4;
        nVar4.C = false;
        nVar4.f5532m = false;
        jVar2.setItemAnimator(nVar4);
        jVar2.setAdapter(nVar2);
        jVar2.setClipChildren(false);
        addView(jVar2, g7.e6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(vw vwVar) {
        return vwVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f12020b == 0) {
            return f(org.telegram.ui.ActionBar.f6.A8);
        }
        return f(org.telegram.ui.ActionBar.f6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.f6.gl);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 1) {
            d();
        }
    }

    public final void b() {
        int i9;
        this.J = 1.0f - AndroidUtilities.lerp(1.0f - this.V, 1.0f, 1.0f - this.W);
        d();
        float f10 = this.J;
        if (f10 == 1.0f) {
            i9 = 2;
        } else if (f10 != 0.0f) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (this.K != i9) {
            this.K = i9;
            if (i9 != 1 && this.G) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i10 = this.K;
            j jVar = this.f12040r;
            j jVar2 = this.h;
            if (i10 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) jVar2, (d5.d) new e(0));
                jVar.setVisibility(4);
                jVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.I0) {
                    this.I0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i11 = this.f12027f;
                if (i10 == 1) {
                    ArrayList arrayList = this.M;
                    arrayList.clear();
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f12049x;
                        if (i12 >= arrayList2.size()) {
                            break;
                        }
                        if (((o) arrayList2.get(i12)).f11875c != UserConfig.getInstance(i11).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((o) arrayList2.get(i12)).f11875c));
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
                    this.O.h1(0, 0);
                    bg.c2 c2Var = MessagesController.getInstance(i11).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    c2Var.run();
                    m7 m7Var = this.f12036n0;
                    if (m7Var != null) {
                        m7Var.a();
                        this.f12036n0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        f2.m0 m0Var = this.O;
        int N02 = m0Var.N0() + 10;
        ArrayList arrayList = this.f12049x;
        int size = arrayList.size();
        v6 v6Var = this.f12042s;
        boolean z10 = false;
        if (N02 > size || ((N0 = m0Var.N0() + 9) < arrayList.size() && v6Var.D(0, ((o) arrayList.get(N0)).f11875c) == 0)) {
            if (this.f12020b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!v6Var.f12258z) {
                    return;
                }
            } else if (!v6Var.f12249p) {
                return;
            }
            v6Var.Q(z10);
        }
    }

    public final void d() {
        int i9;
        int i10;
        int i11;
        float a2 = g7.n.a(Math.min(this.J, this.W), 0.0f, 1.0f);
        float f10 = this.f12018a.f47775e;
        float f11 = 1.0f - f10;
        float f12 = f10 * a2;
        float f13 = f11 * a2;
        int i12 = 8;
        org.telegram.ui.Components.j6 j6Var = this.P;
        if (j6Var != null) {
            j6Var.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            j6Var.setVisibility(i11);
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setAlpha(f13);
            if (f13 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            if (f13 > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView2.setVisibility(i9);
        }
        k kVar = this.Q;
        if (kVar != null) {
            kVar.setAlpha(a2);
            if (a2 > 0.0f) {
                i12 = 0;
            }
            kVar.setVisibility(i12);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean z10;
        if (i9 == NotificationCenter.storiesUpdated && this.f12030h0) {
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
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: ih.r.dispatchDraw(android.graphics.Canvas):void");
    }

    public final q e(long j10) {
        j jVar;
        if (this.K == 2) {
            jVar = this.f12040r;
        } else {
            jVar = this.h;
        }
        for (int i9 = 0; i9 < jVar.getChildCount(); i9++) {
            View childAt = jVar.getChildAt(i9);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (qVar.A == j10) {
                    return qVar;
                }
            }
        }
        return null;
    }

    public final int f(int i9) {
        dy dyVar = this.f12019a0;
        if (dyVar != null && dyVar.getResourceProvider() != null) {
            return dyVar.getThemedColor(i9);
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public final boolean g() {
        int i9 = this.K;
        if (i9 == 0 || i9 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.J;
    }

    public float getOverScrollCoef() {
        return this.f12038p0;
    }

    public kh.x3 getPremiumHint() {
        return this.F;
    }

    public final void h() {
        if (!this.f12042s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f12027f).clientUserId));
        this.f12019a0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, e7.a(this.f12040r), false);
    }

    public final void i(q qVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.D0) == null || !valueAnimator.isRunning()) && qVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = qVar.B;
            v6 v6Var = this.f12042s;
            if (z11 && !v6Var.H()) {
                if (!MessagesController.getInstance(this.f12027f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (v6Var.I(qVar.A) || v6Var.K(qVar.A)) {
                TL_stories.PeerStories y10 = v6Var.y(qVar.A);
                long j10 = qVar.A;
                m7 m7Var = this.f12036n0;
                if (m7Var != null) {
                    m7Var.a();
                    this.f12036n0 = null;
                }
                e5.w wVar = new e5.w(this, qVar, j10, 5);
                if (z10) {
                    wVar.run();
                    return;
                }
                m7 n10 = p7.n(y10, wVar);
                qVar.f11982e = n10;
                this.f12036n0 = n10;
                if (n10 != null) {
                    v6Var.e0(qVar.A, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.b6 b6Var;
        q qVar;
        p6 o6;
        dy dyVar = this.f12019a0;
        int i9 = this.f12027f;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (o6 = MessagesController.getInstance(i9).getStoriesController().o()) != null && o6.a(i9, 1)) {
            dyVar.showDialog(new zf.j0(o6.b(), this.f12027f, getContext(), this.f12019a0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            j jVar = this.h;
            b6Var = null;
            if (i11 < jVar.getChildCount()) {
                qVar = (q) jVar.getChildAt(i11);
                if (i10 == 0) {
                    if (qVar.B) {
                        break;
                    }
                    i11++;
                } else if (qVar.A == j10) {
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
        if (i10 != 0) {
            if (dyVar != null) {
                b6Var = dyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, b6Var2);
            c2Var.q(500L);
            MessagesController.getInstance(i9).getStoriesController().k(j10, new gh.y1(this, c2Var, j10, qVar, 1), true, b6Var2);
            return;
        }
        wb.E(dyVar.getParentActivity(), i9).R(rb.c(qVar));
    }

    public final boolean k(long j10) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f12049x;
            if (i9 < arrayList.size()) {
                if (((o) arrayList.get(i9)).f11875c == j10) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0) {
            f2.m0 m0Var = this.O;
            if (i9 < m0Var.I0()) {
                m0Var.h1(i9, 0);
                return true;
            } else if (i9 > m0Var.M0()) {
                m0Var.i1(i9, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        if (this.V != f10) {
            this.V = f10;
            b();
            if (f10 > this.f12050x0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.f12048w0) {
                this.f12048w0 = z11;
                AnimatorSet animatorSet = this.G0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.G0.cancel();
                    this.G0 = null;
                }
                float f13 = 1.0f;
                if (z10) {
                    float f14 = this.W;
                    if (z11) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f11);
                    this.f12052y0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r f11276b;

                        {
                            this.f11276b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r rVar = this.f11276b;
                                    rVar.getClass();
                                    rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar.b();
                                    return;
                                case 1:
                                    r rVar2 = this.f11276b;
                                    rVar2.getClass();
                                    rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    r rVar3 = this.f11276b;
                                    rVar3.getClass();
                                    rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    r rVar4 = this.f11276b;
                                    rVar4.getClass();
                                    rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.f12052y0.setInterpolator(gr.h);
                    float f15 = this.V;
                    if (z11) {
                        f12 = f15;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f15, f12);
                    this.B0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r f11276b;

                        {
                            this.f11276b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r rVar = this.f11276b;
                                    rVar.getClass();
                                    rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar.b();
                                    return;
                                case 1:
                                    r rVar2 = this.f11276b;
                                    rVar2.getClass();
                                    rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    r rVar3 = this.f11276b;
                                    rVar3.getClass();
                                    rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    r rVar4 = this.f11276b;
                                    rVar4.getClass();
                                    rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.B0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.G0 = animatorSet2;
                    animatorSet2.addListener(new hg.b0(1, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f12052y0);
                    arrayList.add(this.B0);
                    if (this.f12048w0) {
                        this.G0.setDuration(1000L);
                        float f16 = this.W;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f16, f13);
                        this.f12053z0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r f11276b;

                            {
                                this.f11276b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r rVar = this.f11276b;
                                        rVar.getClass();
                                        rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar.b();
                                        return;
                                    case 1:
                                        r rVar2 = this.f11276b;
                                        rVar2.getClass();
                                        rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        r rVar3 = this.f11276b;
                                        rVar3.getClass();
                                        rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        r rVar4 = this.f11276b;
                                        rVar4.getClass();
                                        rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f12039q0);
                        this.F0 = overshootInterpolator;
                        this.f12053z0.setInterpolator(overshootInterpolator);
                        this.f12053z0.setDuration(750L);
                        arrayList.add(this.f12053z0);
                    } else {
                        float f17 = this.W;
                        if (!z11) {
                            f13 = 0.0f;
                        }
                        this.D0 = ValueAnimator.ofFloat(f17, f13);
                        this.D0.setInterpolator(new OvershootInterpolator(this.f12041r0));
                        this.D0.setDuration(350L);
                        this.D0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r f11276b;

                            {
                                this.f11276b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r rVar = this.f11276b;
                                        rVar.getClass();
                                        rVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar.b();
                                        return;
                                    case 1:
                                        r rVar2 = this.f11276b;
                                        rVar2.getClass();
                                        rVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        r rVar3 = this.f11276b;
                                        rVar3.getClass();
                                        rVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        r rVar4 = this.f11276b;
                                        rVar4.getClass();
                                        rVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        arrayList.add(this.D0);
                    }
                    this.G0.playTogether(arrayList);
                    this.G0.start();
                    return;
                }
                if (!z11) {
                    f13 = 0.0f;
                }
                this.W = f13;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (d5.d) new e(1));
            }
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f12027f).clientUserId;
        v6 v6Var = this.f12042s;
        if (!v6Var.J(j10)) {
            if (!v6Var.H() || v6Var.f12241g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.F == null) {
            kh.x3 x3Var = new kh.x3(getContext(), 1);
            x3Var.h(f(org.telegram.ui.ActionBar.f6.Fi));
            x3Var.q(true);
            x3Var.G = Layout.Alignment.ALIGN_CENTER;
            x3Var.m(0.0f, 29.0f);
            this.F = x3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.f6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new i41(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            kh.x3 x3Var2 = this.F;
            x3Var2.h = kh.x3.a(replaceSingleTag, x3Var2.getTextPaint());
            this.F.t(replaceSingleTag);
            this.F.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.F, g7.e6.e(-1, 150, 51));
            }
        }
        kh.x3 x3Var3 = this.F;
        if (x3Var3 != null) {
            if (x3Var3.R) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.F.v();
        }
    }

    public final void o() {
        z10 z10Var = p7.f11960b;
        if (z10Var != null) {
            z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.mk, false), 0, 0);
        }
        z10 z10Var2 = p7.f11961c;
        if (z10Var2 != null) {
            z10Var2.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ok, false), 0, 0);
        }
        z10[] z10VarArr = p7.f11959a;
        z10 z10Var3 = z10VarArr[0];
        if (z10Var3 != null) {
            z10Var3.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kk, false), 0, 0);
        }
        z10 z10Var4 = z10VarArr[1];
        if (z10Var4 != null) {
            z10Var4.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ik, false), 0, 0);
        }
        if (p7.d != null) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.xj, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false);
            p7.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        final int textColor = getTextColor();
        this.P.setTextColor(getTextLogoColor());
        k kVar = this.Q;
        if (kVar != null) {
            kVar.d();
        }
        this.R.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new d5.d() {
            @Override
            public final void accept(Object obj) {
                q qVar = (q) ((View) obj);
                qVar.invalidate();
                qVar.f11989y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.f12040r, (d5.d) new e(2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f12027f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.l lVar = this.H0;
        lVar.f4157a = true;
        AnimatorSet animatorSet = (AnimatorSet) lVar.f4159c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.T.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f12027f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.l lVar = this.H0;
        lVar.f4157a = false;
        ((AnimatorSet) lVar.f4159c).cancel();
        m7 m7Var = this.f12036n0;
        if (m7Var != null) {
            m7Var.a();
            this.f12036n0 = null;
        }
        this.T.b();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f10 = 18.0f;
        } else {
            f10 = 20.0f;
        }
        this.P.setTextSize(AndroidUtilities.dp(f10));
        this.I = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K == 2) {
            int size = this.f12051y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            j jVar = this.f12040r;
            int x10 = (int) (jVar.getX() + dp);
            int y10 = (int) (jVar.getY() + jVar.getHeight());
            wc wcVar = this.E;
            wcVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) jVar.getX(), (int) jVar.getY(), x10, y10);
            wcVar.f34193i = false;
            wcVar.f34189c = 0;
            wcVar.a(rectF);
            if (wcVar.b(motionEvent)) {
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
        if ((this.K == 1 || this.f12032j0 != 0.0f) && !z11) {
            this.G = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f12049x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f12047w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f12051y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i9 = this.f12020b;
        int i10 = this.f12027f;
        if (i9 != 1) {
            arrayList4.add(new o(UserConfig.getInstance(i10).getClientUserId()));
        }
        v6 v6Var = this.f12042s;
        if (i9 == 1) {
            arrayList = v6Var.h;
        } else {
            arrayList = v6Var.f12241g;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i11)).peer);
            if (peerDialogId != UserConfig.getInstance(i10).getClientUserId()) {
                arrayList4.add(new o(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!v6Var.H()) {
            size--;
        }
        if (i9 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(v6Var.C(z12), size));
        this.f12021b0 = null;
        boolean G = v6Var.G();
        org.telegram.ui.Components.j6 j6Var = this.P;
        if (G) {
            arrayList2 = arrayList4;
            if (v6Var.K(UserConfig.getInstance(i10).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f12026e0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        s9 s9Var = new s9();
                        valueOf.setSpan(s9Var, valueOf.length() - 1, valueOf.length(), 0);
                        s9Var.f12134a = j6Var;
                        s9Var.f12139n = true;
                        this.f12026e0 = valueOf;
                    }
                    this.f12021b0 = this.f12026e0;
                } else {
                    this.f12021b0 = string2;
                }
            } else {
                if (this.f12037o0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f12021b0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f12037o0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f12021b0 = formatPluralString;
        }
        if (!this.f12023c0) {
            CharSequence charSequence = this.f12021b0;
            if (z10 && !LocaleController.isRTL) {
                z14 = true;
            } else {
                z14 = false;
            }
            j6Var.c(charSequence, z14, true);
        }
        if (TextUtils.isEmpty(this.f12021b0) && !this.f12023c0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f12018a.a(z13, z10);
        arrayList6.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            if (((o) arrayList2.get(i12)).f11875c != UserConfig.getInstance(i10).clientUserId || m()) {
                arrayList6.add((o) arrayList2.get(i12));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        j jVar = this.h;
        j jVar2 = this.f12040r;
        if (z10) {
            if (this.K == 2) {
                jVar2.setItemAnimator(this.d);
                jVar.setItemAnimator(null);
            } else {
                jVar.setItemAnimator(this.N);
                jVar2.setItemAnimator(null);
            }
        } else {
            jVar.setItemAnimator(null);
            jVar2.setItemAnimator(null);
        }
        this.A.E(arrayList3, arrayList2);
        this.B.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.m0 = kVar;
    }

    public void setClipTop(int i9) {
        if (i9 < 0) {
            i9 = 0;
        }
        if (this.H != i9) {
            this.H = i9;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f10) {
        this.f12037o0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f12032j0 = f10 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(f10, true);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        kh.x3 x3Var = this.F;
        if (x3Var != null) {
            x3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
