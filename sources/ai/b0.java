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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tr;
import org.telegram.ui.jx;
import org.telegram.ui.uy;
public abstract class b0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, le.d {
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
    public final gd I;
    public float I0;
    public ci.e4 J;
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
    public final org.telegram.ui.Components.p6 T;
    public final s U;
    public final ImageView V;
    public final ImageView W;
    public final le.b f593a;
    public final org.telegram.ui.Components.o5 f594a0;
    public final int f595b;
    public final ArrayList f596b0;
    public final Drawable f597c;
    public float f598c0;
    public final u d;
    public float f599d0;
    public int f600e;
    public final uy f601e0;
    public final int f602f;
    public CharSequence f603f0;
    public boolean f604g0;
    public final q h;
    public int f605h0;
    public SpannableStringBuilder f606i0;
    public ValueAnimator f607j0;
    public y f608k0;
    public boolean f609l0;
    public boolean m0;
    public oj0 f610n;
    public float f611n0;
    public int f612o0;
    public a0 f613p0;
    public org.telegram.ui.ActionBar.k f614q0;
    public final q f615r;
    public da f616r0;
    public final l9 f617s;
    public float f618s0;
    public final float f619t0;
    public final float f620u0;
    public final ArrayList v;
    public final float f621v0;
    public final ArrayList f622w;
    public final a4.e f623w0;
    public final ArrayList f624x;
    public LinearGradient f625x0;
    public final ArrayList f626y;
    public Matrix f627y0;
    public Paint f628z0;

    public b0(Context context, uy uyVar, int i10, int i11) {
        super(context);
        float f7;
        this.f593a = new le.b(1, this, tr.h, 380L, false);
        this.v = new ArrayList();
        this.f622w = new ArrayList();
        this.f624x = new ArrayList();
        this.f626y = new ArrayList();
        jx jxVar = (jx) this;
        v vVar = new v(jxVar, false);
        this.E = vVar;
        v vVar2 = new v(jxVar, true);
        this.F = vVar2;
        Paint paint = new Paint();
        this.G = new Paint(1);
        this.H = new Paint(1);
        gd gdVar = new gd(this);
        this.I = gdVar;
        this.N = -1.0f;
        this.O = -1;
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.f596b0 = new ArrayList();
        this.f598c0 = -1.0f;
        this.f609l0 = true;
        this.f619t0 = 1.0f;
        this.f620u0 = 0.95f;
        this.f621v0 = 0.9f;
        this.f623w0 = new a4.e(1);
        this.B0 = 0.3f;
        this.E0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.J0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(this);
        this.L0 = mVar;
        this.f595b = i11;
        this.f602f = i10;
        this.f601e0 = uyVar;
        this.f618s0 = AndroidUtilities.dp(68.0f);
        this.f617s = MessagesController.getInstance(i10).getStoriesController();
        q qVar = new q(jxVar, context, 0);
        this.h = qVar;
        qVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        qVar.setClipToPadding(false);
        qVar.setClipChildren(false);
        gdVar.h = new a3.d(jxVar, 2);
        f fVar = new f(jxVar, 0);
        gdVar.f26814l = true;
        gdVar.f26812j = fVar;
        qVar.j(new r(jxVar, 0));
        s4.j jVar = new s4.j();
        this.R = jVar;
        jVar.C = false;
        jVar.n(150L);
        jVar.f46570m = false;
        qVar.setItemAnimator(jVar);
        s4.c0 c0Var = new s4.c0(0, false);
        this.S = c0Var;
        qVar.setLayoutManager(c0Var);
        qVar.setOnItemClickListener(new g(jxVar, 0));
        qVar.setOnItemLongClickListener(new a1.c(jxVar, 2));
        qVar.setAdapter(vVar);
        addView(qVar, w7.z5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getContext(), true, true, false);
        this.T = p6Var;
        p6Var.setGravity(3);
        p6Var.setTextColor(getTextLogoColor());
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f7 = 18.0f;
        } else {
            f7 = 20.0f;
        }
        p6Var.setTextSize(AndroidUtilities.dp(f7));
        p6Var.setImportantForAccessibility(1);
        p6Var.setFocusableInTouchMode(true);
        addView(p6Var, w7.z5.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, w7.z5.c(22.0f, 90));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(26.0f), null);
        this.f594a0 = o5Var;
        o5Var.f29227a = true;
        o5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.W = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(o5Var);
        addView(imageView2, w7.z5.c(40.0f, 40));
        s sVar = new s(jxVar, context, mVar);
        this.U = sVar;
        addView(sVar, w7.z5.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f597c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        q qVar2 = new q(jxVar, getContext(), 1);
        this.f615r = qVar2;
        getContext();
        qVar2.setLayoutManager(new s4.c0(0, false));
        qVar2.i(new t(0));
        ?? jVar2 = new s4.j();
        this.d = jVar2;
        jVar2.C = false;
        jVar2.f46570m = false;
        qVar2.setItemAnimator(jVar2);
        qVar2.setAdapter(vVar2);
        qVar2.setClipChildren(false);
        addView(qVar2, w7.z5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(jx jxVar) {
        return jxVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f595b == 0) {
            return f(org.telegram.ui.ActionBar.i6.A8);
        }
        return f(org.telegram.ui.ActionBar.i6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.i6.gl);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        int i10;
        this.N = 1.0f - AndroidUtilities.lerp(1.0f - this.f598c0, 1.0f, 1.0f - this.f599d0);
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
            q qVar = this.f615r;
            q qVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) qVar2, (Utilities.Callback<View>) new i(0));
                qVar.setVisibility(4);
                qVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.M0) {
                    this.M0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f602f;
                if (i11 == 1) {
                    ArrayList arrayList = this.Q;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f624x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((w) arrayList2.get(i13)).f1785c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((w) arrayList2.get(i13)).f1785c));
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
                    o8 o8Var = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(o8Var);
                    o8Var.run();
                    da daVar = this.f616r0;
                    if (daVar != null) {
                        daVar.a();
                        this.f616r0 = null;
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
        ArrayList arrayList = this.f624x;
        int size = arrayList.size();
        l9 l9Var = this.f617s;
        boolean z10 = false;
        if (N02 > size || ((N0 = c0Var.N0() + 9) < arrayList.size() && l9Var.D(0, ((w) arrayList.get(N0)).f1785c) == 0)) {
            if (this.f595b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!l9Var.f1312z) {
                    return;
                }
            } else if (!l9Var.f1303p) {
                return;
            }
            l9Var.Q(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = w7.q.a(Math.min(this.N, this.f599d0), 0.0f, 1.0f);
        float f7 = this.f593a.f15436e;
        float f10 = 1.0f - f7;
        float f11 = f7 * a2;
        float f12 = f10 * a2;
        int i13 = 8;
        org.telegram.ui.Components.p6 p6Var = this.T;
        if (p6Var != null) {
            p6Var.setAlpha(f11);
            if (f11 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            p6Var.setVisibility(i12);
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
        if (i10 == NotificationCenter.storiesUpdated && this.f609l0) {
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p(z10, false);
            AndroidUtilities.runOnUIThread(new h(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: ai.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    public final a0 e(long j3) {
        q qVar;
        if (this.O == 2) {
            qVar = this.f615r;
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
        uy uyVar = this.f601e0;
        if (uyVar != null && uyVar.getResourceProvider() != null) {
            return uyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
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
        return this.f619t0;
    }

    public ci.e4 getPremiumHint() {
        return this.J;
    }

    public final void h() {
        if (!this.f617s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f602f).clientUserId));
        this.f601e0.getOrCreateStoryViewer().G(getContext(), null, arrayList, 0, null, null, u9.a(this.f615r), false);
    }

    public final void i(a0 a0Var, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.H0) == null || !valueAnimator.isRunning()) && a0Var != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = a0Var.F;
            l9 l9Var = this.f617s;
            if (z11 && !l9Var.H()) {
                if (!MessagesController.getInstance(this.f602f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (l9Var.I(a0Var.E) || l9Var.K(a0Var.E)) {
                TL_stories.PeerStories y3 = l9Var.y(a0Var.E);
                long j3 = a0Var.E;
                da daVar = this.f616r0;
                if (daVar != null) {
                    daVar.a();
                    this.f616r0 = null;
                }
                a3.h0 h0Var = new a3.h0(this, a0Var, j3, 1);
                if (z10) {
                    h0Var.run();
                    return;
                }
                da n10 = ia.n(y3, h0Var);
                a0Var.f542e = n10;
                this.f616r0 = n10;
                if (n10 != null) {
                    l9Var.e0(a0Var.E, true);
                }
            }
        }
    }

    public final void j(long j3) {
        org.telegram.ui.ActionBar.d6 d6Var;
        a0 a0Var;
        f9 o9;
        uy uyVar = this.f601e0;
        int i10 = this.f602f;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 == 0 && (o9 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o9.a(i10, 1)) {
            uyVar.showDialog(new rg.k0(o9.b(), this.f602f, getContext(), this.f601e0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            q qVar = this.h;
            d6Var = null;
            if (i12 < qVar.getChildCount()) {
                a0Var = (a0) qVar.getChildAt(i12);
                if (i11 == 0) {
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
        if (i11 != 0) {
            if (uyVar != null) {
                d6Var = uyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, d6Var2);
            b2Var.q(500L);
            MessagesController.getInstance(i10).getStoriesController().k(j3, new l(this, b2Var, j3, a0Var, 0), true, d6Var2);
            return;
        }
        ci.kc.E(uyVar.getParentActivity(), i10).R(ci.fc.c(a0Var));
    }

    public final boolean k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f624x;
            if (i10 < arrayList.size()) {
                if (((w) arrayList.get(i10)).f1785c == j3) {
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
        if (this.f598c0 != f7) {
            this.f598c0 = f7;
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
                    float f13 = this.f599d0;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.C0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final b0 f822b;

                        {
                            this.f822b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    b0 b0Var = this.f822b;
                                    b0Var.getClass();
                                    b0Var.f599d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    b0Var.b();
                                    return;
                                case 1:
                                    b0 b0Var2 = this.f822b;
                                    b0Var2.getClass();
                                    b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    b0 b0Var3 = this.f822b;
                                    b0Var3.getClass();
                                    b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    b0 b0Var4 = this.f822b;
                                    b0Var4.getClass();
                                    b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    b0Var4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setInterpolator(tr.h);
                    float f14 = this.f598c0;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.F0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final b0 f822b;

                        {
                            this.f822b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    b0 b0Var = this.f822b;
                                    b0Var.getClass();
                                    b0Var.f599d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    b0Var.b();
                                    return;
                                case 1:
                                    b0 b0Var2 = this.f822b;
                                    b0Var2.getClass();
                                    b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    b0 b0Var3 = this.f822b;
                                    b0Var3.getClass();
                                    b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    b0 b0Var4 = this.f822b;
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
                        float f15 = this.f599d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.D0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final b0 f822b;

                            {
                                this.f822b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        b0 b0Var = this.f822b;
                                        b0Var.getClass();
                                        b0Var.f599d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        b0Var.b();
                                        return;
                                    case 1:
                                        b0 b0Var2 = this.f822b;
                                        b0Var2.getClass();
                                        b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        b0 b0Var3 = this.f822b;
                                        b0Var3.getClass();
                                        b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        b0 b0Var4 = this.f822b;
                                        b0Var4.getClass();
                                        b0Var4.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        b0Var4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f620u0);
                        this.J0 = overshootInterpolator;
                        this.D0.setInterpolator(overshootInterpolator);
                        this.D0.setDuration(750L);
                        arrayList.add(this.D0);
                    } else {
                        float f16 = this.f599d0;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.H0 = ValueAnimator.ofFloat(f16, f12);
                        this.H0.setInterpolator(new OvershootInterpolator(this.f621v0));
                        this.H0.setDuration(350L);
                        this.H0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final b0 f822b;

                            {
                                this.f822b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        b0 b0Var = this.f822b;
                                        b0Var.getClass();
                                        b0Var.f599d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        b0Var.b();
                                        return;
                                    case 1:
                                        b0 b0Var2 = this.f822b;
                                        b0Var2.getClass();
                                        b0Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        b0 b0Var3 = this.f822b;
                                        b0Var3.getClass();
                                        b0Var3.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        b0 b0Var4 = this.f822b;
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
                this.f599d0 = f12;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new i(1));
            }
        }
    }

    public final boolean m() {
        long j3 = UserConfig.getInstance(this.f602f).clientUserId;
        l9 l9Var = this.f617s;
        if (!l9Var.J(j3)) {
            if (!l9Var.H() || l9Var.f1295g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.J == null) {
            ci.e4 e4Var = new ci.e4(getContext(), 1);
            e4Var.h(f(org.telegram.ui.ActionBar.i6.Fi));
            e4Var.p(true);
            e4Var.K = Layout.Alignment.ALIGN_CENTER;
            e4Var.l(0.0f, 29.0f);
            this.J = e4Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.i6.Gi, 0, new h(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new d61(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            ci.e4 e4Var2 = this.J;
            e4Var2.h = ci.e4.a(replaceSingleTag, e4Var2.getTextPaint());
            this.J.s(replaceSingleTag);
            this.J.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.J, w7.z5.e(-1, 150, 51));
            }
        }
        ci.e4 e4Var3 = this.J;
        if (e4Var3 != null) {
            if (e4Var3.V) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.J.u();
        }
    }

    public final void o() {
        s20 s20Var = ia.f1086b;
        if (s20Var != null) {
            s20Var.d(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.lk, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.mk, false), 0, 0);
        }
        s20 s20Var2 = ia.f1087c;
        if (s20Var2 != null) {
            s20Var2.d(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.nk, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ok, false), 0, 0);
        }
        s20[] s20VarArr = ia.f1085a;
        s20 s20Var3 = s20VarArr[0];
        if (s20Var3 != null) {
            s20Var3.d(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.jk, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.kk, false), 0, 0);
        }
        s20 s20Var4 = s20VarArr[1];
        if (s20Var4 != null) {
            s20Var4.d(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hk, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ik, false), 0, 0);
        }
        if (ia.d != null) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.xj, false);
            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false);
            ia.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        int textColor = getTextColor();
        this.T.setTextColor(getTextLogoColor());
        s sVar = this.U;
        if (sVar != null) {
            sVar.d();
        }
        this.V.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, (Utilities.Callback<View>) new m(textColor, 0));
        AndroidUtilities.forEachViews((RecyclerView) this.f615r, (Utilities.Callback<View>) new i(2));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f602f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f7902a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.f7904c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.f594a0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f602f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.m mVar = this.L0;
        mVar.f7902a = false;
        ((AnimatorSet) mVar.f7904c).cancel();
        da daVar = this.f616r0;
        if (daVar != null) {
            daVar.a();
            this.f616r0 = null;
        }
        this.f594a0.b();
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
            int size = this.f626y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            q qVar = this.f615r;
            int x10 = (int) (qVar.getX() + dp);
            int y3 = (int) (qVar.getY() + qVar.getHeight());
            gd gdVar = this.I;
            gdVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) qVar.getX(), (int) qVar.getY(), x10, y3);
            gdVar.f26811i = false;
            gdVar.f26807c = 0;
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
        if ((this.O == 1 || this.f611n0 != 0.0f) && !z11) {
            this.K = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f624x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f622w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f626y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f595b;
        int i11 = this.f602f;
        if (i10 != 1) {
            arrayList4.add(new w(UserConfig.getInstance(i11).getClientUserId()));
        }
        l9 l9Var = this.f617s;
        if (i10 == 1) {
            arrayList = l9Var.h;
        } else {
            arrayList = l9Var.f1295g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new w(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!l9Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(l9Var.C(z12), size));
        this.f603f0 = null;
        boolean G = l9Var.G();
        org.telegram.ui.Components.p6 p6Var = this.T;
        if (G) {
            arrayList2 = arrayList4;
            if (l9Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f606i0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        pc pcVar = new pc();
                        valueOf.setSpan(pcVar, valueOf.length() - 1, valueOf.length(), 0);
                        pcVar.f1523a = p6Var;
                        pcVar.f1528n = true;
                        this.f606i0 = valueOf;
                    }
                    this.f603f0 = this.f606i0;
                } else {
                    this.f603f0 = string2;
                }
            } else {
                if (this.f618s0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f603f0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f618s0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f603f0 = formatPluralString;
        }
        if (!this.f604g0) {
            CharSequence charSequence = this.f603f0;
            if (z10 && !LocaleController.isRTL) {
                z14 = true;
            } else {
                z14 = false;
            }
            p6Var.c(charSequence, z14, true);
        }
        if (TextUtils.isEmpty(this.f603f0) && !this.f604g0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f593a.a(z13, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((w) arrayList2.get(i13)).f1785c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((w) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        q qVar = this.h;
        q qVar2 = this.f615r;
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
        this.f614q0 = kVar;
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
        this.f618s0 = f7;
    }

    public void setOverscroll(float f7) {
        this.f611n0 = f7 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f7) {
        l(f7, true);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ci.e4 e4Var = this.J;
        if (e4Var != null) {
            e4Var.setTranslationY(f7);
        }
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
