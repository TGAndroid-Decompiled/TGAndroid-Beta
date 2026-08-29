package lh;

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
import nh.bb;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.t41;
import org.telegram.ui.fy;
import org.telegram.ui.xw;
public abstract class p extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public final l A;
    public float A0;
    public final l B;
    public ValueAnimator B0;
    public final Paint C;
    public float C0;
    public final Paint D;
    public ValueAnimator D0;
    public final ad E;
    public float E0;
    public nh.t3 F;
    public OvershootInterpolator F0;
    public boolean G;
    public AnimatorSet G0;
    public int H;
    public final ab.m H0;
    public int I;
    public long I0;
    public float J;
    public Drawable J0;
    public int K;
    public final ArrayList L;
    public final ArrayList M;
    public final f2.l N;
    public final f2.j0 O;
    public final org.telegram.ui.Components.o6 P;
    public final i Q;
    public final ImageView R;
    public final ImageView S;
    public final org.telegram.ui.Components.n5 T;
    public final ArrayList U;
    public float V;
    public float W;
    public final vd.a f16042a;
    public final fy f16043a0;
    public final int f16044b;
    public CharSequence f16045b0;
    public final Drawable f16046c;
    public boolean f16047c0;
    public final k d;
    public int f16048d0;
    public int f16049e;
    public SpannableStringBuilder f16050e0;
    public final int f16051f;
    public ValueAnimator f16052f0;
    public n f16053g0;
    public final h h;
    public boolean f16054h0;
    public boolean f16055i0;
    public float f16056j0;
    public int f16057k0;
    public o f16058l0;
    public org.telegram.ui.ActionBar.l m0;
    public bj0 f16059n;
    public i7 f16060n0;
    public float f16061o0;
    public final float f16062p0;
    public final float f16063q0;
    public final h f16064r;
    public final float f16065r0;
    public final s6 f16066s;
    public final c5.e f16067s0;
    public LinearGradient f16068t0;
    public Matrix f16069u0;
    public final ArrayList v;
    public Paint f16070v0;
    public final ArrayList f16071w;
    public boolean f16072w0;
    public final ArrayList f16073x;
    public final float f16074x0;
    public final ArrayList f16075y;
    public ValueAnimator f16076y0;
    public ValueAnimator f16077z0;

    public p(Context context, fy fyVar, int i10, int i11) {
        super(context);
        float f9;
        this.f16042a = new vd.a(1, this, jr.h, 380L, false);
        this.v = new ArrayList();
        this.f16071w = new ArrayList();
        this.f16073x = new ArrayList();
        this.f16075y = new ArrayList();
        xw xwVar = (xw) this;
        l lVar = new l(xwVar, false);
        this.A = lVar;
        l lVar2 = new l(xwVar, true);
        this.B = lVar2;
        Paint paint = new Paint();
        this.C = new Paint(1);
        this.D = new Paint(1);
        ad adVar = new ad(this);
        this.E = adVar;
        this.J = -1.0f;
        this.K = -1;
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.U = new ArrayList();
        this.V = -1.0f;
        this.f16054h0 = true;
        this.f16062p0 = 1.0f;
        this.f16063q0 = 0.95f;
        this.f16065r0 = 0.9f;
        this.f16067s0 = new c5.e(25);
        this.f16074x0 = 0.3f;
        this.A0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.F0 = new OvershootInterpolator(0.95f);
        ab.m mVar = new ab.m(this);
        this.H0 = mVar;
        this.f16044b = i11;
        this.f16051f = i10;
        this.f16043a0 = fyVar;
        this.f16061o0 = AndroidUtilities.dp(68.0f);
        this.f16066s = MessagesController.getInstance(i10).getStoriesController();
        h hVar = new h(xwVar, context, 0);
        this.h = hVar;
        hVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        hVar.setClipToPadding(false);
        hVar.setClipChildren(false);
        adVar.h = new jh.o(xwVar, 21);
        ag.o0 o0Var = new ag.o0(xwVar, 13);
        adVar.f26748l = true;
        adVar.f26746j = o0Var;
        hVar.j(new cg.g2(xwVar, 11));
        f2.l lVar3 = new f2.l();
        this.N = lVar3;
        lVar3.C = false;
        lVar3.n(150L);
        lVar3.f6463m = false;
        hVar.setItemAnimator(lVar3);
        f2.j0 j0Var = new f2.j0(0, false);
        this.O = j0Var;
        hVar.setLayoutManager(j0Var);
        hVar.setOnItemClickListener(new bg.o(xwVar, 11));
        hVar.setOnItemLongClickListener(new l4.s0(xwVar, 1));
        hVar.setAdapter(lVar);
        addView(hVar, i7.f6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), true, true, false);
        this.P = o6Var;
        o6Var.setGravity(3);
        o6Var.setTextColor(getTextLogoColor());
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f9 = 18.0f;
        } else {
            f9 = 20.0f;
        }
        o6Var.setTextSize(AndroidUtilities.dp(f9));
        o6Var.setImportantForAccessibility(1);
        o6Var.setFocusableInTouchMode(true);
        addView(o6Var, i7.f6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.R = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, i7.f6.c(22.0f, 90));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(26.0f), null);
        this.T = n5Var;
        n5Var.f30845a = true;
        n5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.S = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(n5Var);
        addView(imageView2, i7.f6.c(40.0f, 40));
        i iVar = new i(xwVar, context, mVar);
        this.Q = iVar;
        addView(iVar, i7.f6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f16046c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        h hVar2 = new h(xwVar, getContext(), 1);
        this.f16064r = hVar2;
        getContext();
        hVar2.setLayoutManager(new f2.j0(0, false));
        hVar2.i(new j(0));
        ?? lVar4 = new f2.l();
        this.d = lVar4;
        lVar4.C = false;
        lVar4.f6463m = false;
        hVar2.setItemAnimator(lVar4);
        hVar2.setAdapter(lVar2);
        hVar2.setClipChildren(false);
        addView(hVar2, i7.f6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(xw xwVar) {
        return xwVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f16044b == 0) {
            return f(org.telegram.ui.ActionBar.g6.A8);
        }
        return f(org.telegram.ui.ActionBar.g6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.g6.gl);
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        int i10;
        this.J = 1.0f - AndroidUtilities.lerp(1.0f - this.V, 1.0f, 1.0f - this.W);
        d();
        float f9 = this.J;
        if (f9 == 1.0f) {
            i10 = 2;
        } else if (f9 != 0.0f) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.K != i10) {
            this.K = i10;
            if (i10 != 1 && this.G) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.K;
            h hVar = this.f16064r;
            h hVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) hVar2, (f5.d) new l4.x0(1));
                hVar.setVisibility(4);
                hVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.I0) {
                    this.I0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f16051f;
                if (i11 == 1) {
                    ArrayList arrayList = this.M;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f16073x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((m) arrayList2.get(i13)).f15916c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((m) arrayList2.get(i13)).f15916c));
                            if (arrayList.size() == 3) {
                                break;
                            }
                        }
                        i13++;
                    }
                    hVar.setVisibility(4);
                    hVar2.setVisibility(0);
                } else if (i11 == 2) {
                    hVar.setVisibility(0);
                    hVar2.setVisibility(4);
                    this.O.h1(0, 0);
                    bg.f fVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(fVar);
                    fVar.run();
                    i7 i7Var = this.f16060n0;
                    if (i7Var != null) {
                        i7Var.a();
                        this.f16060n0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        f2.j0 j0Var = this.O;
        int N02 = j0Var.N0() + 10;
        ArrayList arrayList = this.f16073x;
        int size = arrayList.size();
        s6 s6Var = this.f16066s;
        boolean z10 = false;
        if (N02 > size || ((N0 = j0Var.N0() + 9) < arrayList.size() && s6Var.D(0, ((m) arrayList.get(N0)).f15916c) == 0)) {
            if (this.f16044b == 1) {
                z10 = true;
            }
            if (z10) {
                if (!s6Var.f16240z) {
                    return;
                }
            } else if (!s6Var.f16231p) {
                return;
            }
            s6Var.Q(z10);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = i7.w.a(Math.min(this.J, this.W), 0.0f, 1.0f);
        float f9 = this.f16042a.f49505e;
        float f10 = 1.0f - f9;
        float f11 = f9 * a2;
        float f12 = f10 * a2;
        int i13 = 8;
        org.telegram.ui.Components.o6 o6Var = this.P;
        if (o6Var != null) {
            o6Var.setAlpha(f11);
            if (f11 > 0.0f) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            o6Var.setVisibility(i12);
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setAlpha(f12);
            if (f12 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setAlpha(f12);
            if (f12 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
        }
        i iVar = this.Q;
        if (iVar != null) {
            iVar.setAlpha(a2);
            if (a2 > 0.0f) {
                i13 = 0;
            }
            iVar.setVisibility(i13);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        if (i10 == NotificationCenter.storiesUpdated && this.f16054h0) {
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
        throw new UnsupportedOperationException("Method not decompiled: lh.p.dispatchDraw(android.graphics.Canvas):void");
    }

    public final o e(long j10) {
        h hVar;
        if (this.K == 2) {
            hVar = this.f16064r;
        } else {
            hVar = this.h;
        }
        for (int i10 = 0; i10 < hVar.getChildCount(); i10++) {
            View childAt = hVar.getChildAt(i10);
            if (childAt instanceof o) {
                o oVar = (o) childAt;
                if (oVar.A == j10) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        fy fyVar = this.f16043a0;
        if (fyVar != null && fyVar.getResourceProvider() != null) {
            return fyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final boolean g() {
        int i10 = this.K;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public float getCollapsedProgress() {
        return this.J;
    }

    public float getOverScrollCoef() {
        return this.f16062p0;
    }

    public nh.t3 getPremiumHint() {
        return this.F;
    }

    public final void h() {
        if (!this.f16066s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f16051f).clientUserId));
        this.f16043a0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, b7.a(this.f16064r), false);
    }

    public final void i(o oVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.D0) == null || !valueAnimator.isRunning()) && oVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = oVar.B;
            s6 s6Var = this.f16066s;
            if (z11 && !s6Var.H()) {
                if (!MessagesController.getInstance(this.f16051f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (s6Var.I(oVar.A) || s6Var.K(oVar.A)) {
                TL_stories.PeerStories y8 = s6Var.y(oVar.A);
                long j10 = oVar.A;
                i7 i7Var = this.f16060n0;
                if (i7Var != null) {
                    i7Var.a();
                    this.f16060n0 = null;
                }
                g5.v vVar = new g5.v(this, oVar, j10, 5);
                if (z10) {
                    vVar.run();
                    return;
                }
                i7 n10 = l7.n(y8, vVar);
                oVar.f15998e = n10;
                this.f16060n0 = n10;
                if (n10 != null) {
                    s6Var.e0(oVar.A, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        o oVar;
        m6 o10;
        fy fyVar = this.f16043a0;
        int i10 = this.f16051f;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            fyVar.showDialog(new cg.v0(o10.b(), this.f16051f, getContext(), this.f16043a0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            h hVar = this.h;
            c6Var = null;
            if (i12 < hVar.getChildCount()) {
                oVar = (o) hVar.getChildAt(i12);
                if (i11 == 0) {
                    if (oVar.B) {
                        break;
                    }
                    i12++;
                } else if (oVar.A == j10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                oVar = null;
                break;
            }
        }
        if (oVar == null) {
            return;
        }
        if (i11 != 0) {
            if (fyVar != null) {
                c6Var = fyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, c6Var2);
            c2Var.q(500L);
            MessagesController.getInstance(i10).getStoriesController().k(j10, new jh.w1(this, c2Var, j10, oVar, 1), true, c6Var2);
            return;
        }
        gb.E(fyVar.getParentActivity(), i10).R(bb.c(oVar));
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16073x;
            if (i10 < arrayList.size()) {
                if (((m) arrayList.get(i10)).f15916c == j10) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            f2.j0 j0Var = this.O;
            if (i10 < j0Var.I0()) {
                j0Var.h1(i10, 0);
                return true;
            } else if (i10 > j0Var.M0()) {
                j0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f9, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (this.V != f9) {
            this.V = f9;
            b();
            if (f9 > this.f16074x0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.f16072w0) {
                this.f16072w0 = z11;
                AnimatorSet animatorSet = this.G0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.G0.cancel();
                    this.G0 = null;
                }
                float f12 = 1.0f;
                if (z10) {
                    float f13 = this.W;
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f10);
                    this.f16076y0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final p f15416b;

                        {
                            this.f15416b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    p pVar = this.f15416b;
                                    pVar.getClass();
                                    pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar.b();
                                    return;
                                case 1:
                                    p pVar2 = this.f15416b;
                                    pVar2.getClass();
                                    pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    p pVar3 = this.f15416b;
                                    pVar3.getClass();
                                    pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    p pVar4 = this.f15416b;
                                    pVar4.getClass();
                                    pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.f16076y0.setInterpolator(jr.h);
                    float f14 = this.V;
                    if (z11) {
                        f11 = f14;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f14, f11);
                    this.B0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final p f15416b;

                        {
                            this.f15416b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    p pVar = this.f15416b;
                                    pVar.getClass();
                                    pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar.b();
                                    return;
                                case 1:
                                    p pVar2 = this.f15416b;
                                    pVar2.getClass();
                                    pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    p pVar3 = this.f15416b;
                                    pVar3.getClass();
                                    pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    p pVar4 = this.f15416b;
                                    pVar4.getClass();
                                    pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.B0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.G0 = animatorSet2;
                    animatorSet2.addListener(new bg.z2(4, this, z11));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f16076y0);
                    arrayList.add(this.B0);
                    if (this.f16072w0) {
                        this.G0.setDuration(1000L);
                        float f15 = this.W;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f15, f12);
                        this.f16077z0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final p f15416b;

                            {
                                this.f15416b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        p pVar = this.f15416b;
                                        pVar.getClass();
                                        pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar.b();
                                        return;
                                    case 1:
                                        p pVar2 = this.f15416b;
                                        pVar2.getClass();
                                        pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        p pVar3 = this.f15416b;
                                        pVar3.getClass();
                                        pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        p pVar4 = this.f15416b;
                                        pVar4.getClass();
                                        pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f16063q0);
                        this.F0 = overshootInterpolator;
                        this.f16077z0.setInterpolator(overshootInterpolator);
                        this.f16077z0.setDuration(750L);
                        arrayList.add(this.f16077z0);
                    } else {
                        float f16 = this.W;
                        if (!z11) {
                            f12 = 0.0f;
                        }
                        this.D0 = ValueAnimator.ofFloat(f16, f12);
                        this.D0.setInterpolator(new OvershootInterpolator(this.f16065r0));
                        this.D0.setDuration(350L);
                        this.D0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final p f15416b;

                            {
                                this.f15416b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        p pVar = this.f15416b;
                                        pVar.getClass();
                                        pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar.b();
                                        return;
                                    case 1:
                                        p pVar2 = this.f15416b;
                                        pVar2.getClass();
                                        pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        p pVar3 = this.f15416b;
                                        pVar3.getClass();
                                        pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        p pVar4 = this.f15416b;
                                        pVar4.getClass();
                                        pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar4.invalidate();
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
                    f12 = 0.0f;
                }
                this.W = f12;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (f5.d) new l4.x0(2));
            }
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f16051f).clientUserId;
        s6 s6Var = this.f16066s;
        if (!s6Var.J(j10)) {
            if (!s6Var.H() || s6Var.f16223g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.F == null) {
            nh.t3 t3Var = new nh.t3(getContext(), 1);
            t3Var.h(f(org.telegram.ui.ActionBar.g6.Fi));
            t3Var.q(true);
            t3Var.G = Layout.Alignment.ALIGN_CENTER;
            t3Var.m(0.0f, 29.0f);
            this.F = t3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new t41(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            nh.t3 t3Var2 = this.F;
            t3Var2.h = nh.t3.a(replaceSingleTag, t3Var2.getTextPaint());
            this.F.t(replaceSingleTag);
            this.F.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.F, i7.f6.e(-1, 150, 51));
            }
        }
        nh.t3 t3Var3 = this.F;
        if (t3Var3 != null) {
            if (t3Var3.R) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.F.v();
        }
    }

    public final void o() {
        k20 k20Var = l7.f15897b;
        if (k20Var != null) {
            k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
        }
        k20 k20Var2 = l7.f15898c;
        if (k20Var2 != null) {
            k20Var2.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
        }
        k20[] k20VarArr = l7.f15896a;
        k20 k20Var3 = k20VarArr[0];
        if (k20Var3 != null) {
            k20Var3.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
        }
        k20 k20Var4 = k20VarArr[1];
        if (k20Var4 != null) {
            k20Var4.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
        }
        if (l7.d != null) {
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.xj, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false);
            l7.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        final int textColor = getTextColor();
        this.P.setTextColor(getTextLogoColor());
        i iVar = this.Q;
        if (iVar != null) {
            iVar.d();
        }
        this.R.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new f5.d() {
            @Override
            public final void accept(Object obj) {
                o oVar = (o) ((View) obj);
                oVar.invalidate();
                oVar.f16005y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.f16064r, (f5.d) new l4.x0(3));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f16051f).addObserver(this, NotificationCenter.storiesUpdated);
        ab.m mVar = this.H0;
        mVar.f324a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.f326c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.T.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f16051f).removeObserver(this, NotificationCenter.storiesUpdated);
        ab.m mVar = this.H0;
        mVar.f324a = false;
        ((AnimatorSet) mVar.f326c).cancel();
        i7 i7Var = this.f16060n0;
        if (i7Var != null) {
            i7Var.a();
            this.f16060n0 = null;
        }
        this.T.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        if (!AndroidUtilities.isTablet() && getResources().getConfiguration().orientation == 2) {
            f9 = 18.0f;
        } else {
            f9 = 20.0f;
        }
        this.P.setTextSize(AndroidUtilities.dp(f9));
        this.I = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K == 2) {
            int size = this.f16075y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            h hVar = this.f16064r;
            int x4 = (int) (hVar.getX() + dp);
            int y8 = (int) (hVar.getY() + hVar.getHeight());
            ad adVar = this.E;
            adVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) hVar.getX(), (int) hVar.getY(), x4, y8);
            adVar.f26745i = false;
            adVar.f26741c = 0;
            adVar.a(rectF);
            if (adVar.b(motionEvent)) {
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
        if ((this.K == 1 || this.f16056j0 != 0.0f) && !z11) {
            this.G = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f16073x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f16071w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f16075y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f16044b;
        int i11 = this.f16051f;
        if (i10 != 1) {
            arrayList4.add(new m(UserConfig.getInstance(i11).getClientUserId()));
        }
        s6 s6Var = this.f16066s;
        if (i10 == 1) {
            arrayList = s6Var.h;
        } else {
            arrayList = s6Var.f16223g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new m(peerDialogId));
            }
        }
        int size = arrayList4.size();
        if (!s6Var.H()) {
            size--;
        }
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int max = Math.max(1, Math.max(s6Var.C(z12), size));
        this.f16045b0 = null;
        boolean G = s6Var.G();
        org.telegram.ui.Components.o6 o6Var = this.P;
        if (G) {
            arrayList2 = arrayList4;
            if (s6Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f16050e0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        o9 o9Var = new o9();
                        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
                        o9Var.f16035a = o6Var;
                        o9Var.f16040n = true;
                        this.f16050e0 = valueOf;
                    }
                    this.f16045b0 = this.f16050e0;
                } else {
                    this.f16045b0 = string2;
                }
            } else {
                if (this.f16061o0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f16045b0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f16061o0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f16045b0 = formatPluralString;
        }
        if (!this.f16047c0) {
            CharSequence charSequence = this.f16045b0;
            if (z10 && !LocaleController.isRTL) {
                z14 = true;
            } else {
                z14 = false;
            }
            o6Var.c(charSequence, z14, true);
        }
        if (TextUtils.isEmpty(this.f16045b0) && !this.f16047c0) {
            z13 = false;
        } else {
            z13 = true;
        }
        this.f16042a.a(z13, z10);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((m) arrayList2.get(i13)).f15916c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((m) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        h hVar = this.h;
        h hVar2 = this.f16064r;
        if (z10) {
            if (this.K == 2) {
                hVar2.setItemAnimator(this.d);
                hVar.setItemAnimator(null);
            } else {
                hVar.setItemAnimator(this.N);
                hVar2.setItemAnimator(null);
            }
        } else {
            hVar.setItemAnimator(null);
            hVar2.setItemAnimator(null);
        }
        this.A.E(arrayList3, arrayList2);
        this.B.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.m0 = lVar;
    }

    public void setClipTop(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.H != i10) {
            this.H = i10;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f9) {
        this.f16061o0 = f9;
    }

    public void setOverscroll(float f9) {
        this.f16056j0 = f9 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f9) {
        l(f9, true);
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        nh.t3 t3Var = this.F;
        if (t3Var != null) {
            t3Var.setTranslationY(f9);
        }
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
