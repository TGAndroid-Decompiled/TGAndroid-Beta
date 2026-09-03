package oh;

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
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.xc;
import org.telegram.ui.hx;
import org.telegram.ui.py;
import qh.ba;
import qh.w9;
public abstract class p extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public ValueAnimator A0;
    public final l B;
    public float B0;
    public final l C;
    public ValueAnimator C0;
    public final Paint D;
    public float D0;
    public final Paint E;
    public ValueAnimator E0;
    public final xc F;
    public float F0;
    public qh.e3 G;
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
    public final f2.j0 P;
    public final org.telegram.ui.Components.k6 Q;
    public final i R;
    public final ImageView S;
    public final ImageView T;
    public final org.telegram.ui.Components.j5 U;
    public final ArrayList V;
    public float W;
    public final xd.a f17576a;
    public float f17577a0;
    public final int f17578b;
    public final py f17579b0;
    public final Drawable f17580c;
    public CharSequence f17581c0;
    public final k d;
    public boolean f17582d0;
    public int f17583e;
    public int f17584e0;
    public final int f17585f;
    public SpannableStringBuilder f17586f0;
    public ValueAnimator f17587g0;
    public final h h;
    public n f17588h0;
    public boolean f17589i0;
    public boolean f17590j0;
    public float f17591k0;
    public int f17592l0;
    public o m0;
    public lj0 f17593n;
    public org.telegram.ui.ActionBar.k f17594n0;
    public j7 f17595o0;
    public float f17596p0;
    public final float f17597q0;
    public final h f17598r;
    public final float f17599r0;
    public final t6 f17600s;
    public final float f17601s0;
    public final e5.f f17602t0;
    public LinearGradient f17603u0;
    public final ArrayList v;
    public Matrix f17604v0;
    public final ArrayList f17605w;
    public Paint f17606w0;
    public final ArrayList f17607x;
    public boolean f17608x0;
    public final ArrayList f17609y;
    public final float f17610y0;
    public ValueAnimator f17611z0;

    public p(Context context, py pyVar, int i10, int i11) {
        super(context);
        float f10;
        this.f17576a = new xd.a(1, this, pr.h, 380L, false);
        this.v = new ArrayList();
        this.f17605w = new ArrayList();
        this.f17607x = new ArrayList();
        this.f17609y = new ArrayList();
        hx hxVar = (hx) this;
        l lVar = new l(hxVar, false);
        this.B = lVar;
        l lVar2 = new l(hxVar, true);
        this.C = lVar2;
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
        this.f17589i0 = true;
        this.f17597q0 = 1.0f;
        this.f17599r0 = 0.95f;
        this.f17601s0 = 0.9f;
        this.f17602t0 = new e5.f(26);
        this.f17610y0 = 0.3f;
        this.B0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.G0 = new OvershootInterpolator(0.95f);
        cb.m mVar = new cb.m(this);
        this.I0 = mVar;
        this.f17578b = i11;
        this.f17585f = i10;
        this.f17579b0 = pyVar;
        this.f17596p0 = AndroidUtilities.dp(68.0f);
        this.f17600s = MessagesController.getInstance(i10).getStoriesController();
        h hVar = new h(hxVar, context, 0);
        this.h = hVar;
        hVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        hVar.setClipToPadding(false);
        hVar.setClipChildren(false);
        xcVar.h = new lh.c3(hxVar, 24);
        ag.f fVar = new ag.f(hxVar, 15);
        xcVar.f33026l = true;
        xcVar.f33024j = fVar;
        hVar.j(new fg.e2(hxVar, 11));
        f2.l lVar3 = new f2.l();
        this.O = lVar3;
        lVar3.C = false;
        lVar3.n(150L);
        lVar3.f5910m = false;
        hVar.setItemAnimator(lVar3);
        f2.j0 j0Var = new f2.j0(0, false);
        this.P = j0Var;
        hVar.setLayoutManager(j0Var);
        hVar.setOnItemClickListener(new ag.h(hxVar, 12));
        hVar.setOnItemLongClickListener(new mh.m5(hxVar, 6));
        hVar.setAdapter(lVar);
        addView(hVar, k7.c6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
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
        addView(k6Var, k7.c6.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.S = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, k7.c6.c(22.0f, 90));
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(26.0f), null);
        this.U = j5Var;
        j5Var.f27984a = true;
        j5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.T = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(j5Var);
        addView(imageView2, k7.c6.c(40.0f, 40));
        i iVar = new i(hxVar, context, mVar);
        this.R = iVar;
        addView(iVar, k7.c6.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f17580c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        h hVar2 = new h(hxVar, getContext(), 1);
        this.f17598r = hVar2;
        getContext();
        hVar2.setLayoutManager(new f2.j0(0, false));
        hVar2.i(new j(0));
        ?? lVar4 = new f2.l();
        this.d = lVar4;
        lVar4.C = false;
        lVar4.f5910m = false;
        hVar2.setItemAnimator(lVar4);
        hVar2.setAdapter(lVar2);
        hVar2.setClipChildren(false);
        addView(hVar2, k7.c6.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        p(false, false);
    }

    public static int a(hx hxVar) {
        return hxVar.getTextColor();
    }

    public int getTextColor() {
        if (this.f17578b == 0) {
            return f(org.telegram.ui.ActionBar.k6.A8);
        }
        return f(org.telegram.ui.ActionBar.k6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.k6.gl);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 1) {
            d();
        }
    }

    public final void b() {
        int i10;
        this.K = 1.0f - AndroidUtilities.lerp(1.0f - this.W, 1.0f, 1.0f - this.f17577a0);
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
            h hVar = this.f17598r;
            h hVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) hVar2, (h5.d) new ag.d(3));
                hVar.setVisibility(4);
                hVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.J0) {
                    this.J0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f17585f;
                if (i11 == 1) {
                    ArrayList arrayList = this.N;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f17607x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((m) arrayList2.get(i13)).f17424c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((m) arrayList2.get(i13)).f17424c));
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
                    this.P.h1(0, 0);
                    af.b bVar = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    bVar.run();
                    j7 j7Var = this.f17595o0;
                    if (j7Var != null) {
                        j7Var.a();
                        this.f17595o0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int N0;
        f2.j0 j0Var = this.P;
        int N02 = j0Var.N0() + 10;
        ArrayList arrayList = this.f17607x;
        int size = arrayList.size();
        t6 t6Var = this.f17600s;
        boolean z4 = false;
        if (N02 > size || ((N0 = j0Var.N0() + 9) < arrayList.size() && t6Var.D(0, ((m) arrayList.get(N0)).f17424c) == 0)) {
            if (this.f17578b == 1) {
                z4 = true;
            }
            if (z4) {
                if (!t6Var.f17794z) {
                    return;
                }
            } else if (!t6Var.f17785p) {
                return;
            }
            t6Var.Q(z4);
        }
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        float a2 = k7.o.a(Math.min(this.K, this.f17577a0), 0.0f, 1.0f);
        float f10 = this.f17576a.f50541e;
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
        i iVar = this.R;
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
        boolean z4;
        if (i10 == NotificationCenter.storiesUpdated && this.f17589i0) {
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
        throw new UnsupportedOperationException("Method not decompiled: oh.p.dispatchDraw(android.graphics.Canvas):void");
    }

    public final o e(long j10) {
        h hVar;
        if (this.L == 2) {
            hVar = this.f17598r;
        } else {
            hVar = this.h;
        }
        for (int i10 = 0; i10 < hVar.getChildCount(); i10++) {
            View childAt = hVar.getChildAt(i10);
            if (childAt instanceof o) {
                o oVar = (o) childAt;
                if (oVar.B == j10) {
                    return oVar;
                }
            }
        }
        return null;
    }

    public final int f(int i10) {
        py pyVar = this.f17579b0;
        if (pyVar != null && pyVar.getResourceProvider() != null) {
            return pyVar.getThemedColor(i10);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
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
        return this.f17597q0;
    }

    public qh.e3 getPremiumHint() {
        return this.G;
    }

    public final void h() {
        if (!this.f17600s.H()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(UserConfig.getInstance(this.f17585f).clientUserId));
        this.f17579b0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, c7.a(this.f17598r), false);
    }

    public final void i(o oVar, boolean z4) {
        ValueAnimator valueAnimator;
        if ((!z4 || (valueAnimator = this.E0) == null || !valueAnimator.isRunning()) && oVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z10 = oVar.C;
            t6 t6Var = this.f17600s;
            if (z10 && !t6Var.H()) {
                if (!MessagesController.getInstance(this.f17585f).storiesEnabled()) {
                    n();
                } else {
                    j(0L);
                }
            } else if (t6Var.I(oVar.B) || t6Var.K(oVar.B)) {
                TL_stories.PeerStories y10 = t6Var.y(oVar.B);
                long j10 = oVar.B;
                j7 j7Var = this.f17595o0;
                if (j7Var != null) {
                    j7Var.a();
                    this.f17595o0 = null;
                }
                i5.v vVar = new i5.v(this, oVar, j10, 5);
                if (z4) {
                    vVar.run();
                    return;
                }
                j7 n10 = m7.n(y10, vVar);
                oVar.f17521e = n10;
                this.f17595o0 = n10;
                if (n10 != null) {
                    t6Var.e0(oVar.B, true);
                }
            }
        }
    }

    public final void j(long j10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        o oVar;
        n6 o10;
        py pyVar = this.f17579b0;
        int i10 = this.f17585f;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            pyVar.showDialog(new fg.v0(o10.b(), this.f17585f, getContext(), this.f17579b0, null));
            return;
        }
        int i12 = 0;
        while (true) {
            h hVar = this.h;
            g6Var = null;
            if (i12 < hVar.getChildCount()) {
                oVar = (o) hVar.getChildAt(i12);
                if (i11 == 0) {
                    if (oVar.C) {
                        break;
                    }
                    i12++;
                } else if (oVar.B == j10) {
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
            if (pyVar != null) {
                g6Var = pyVar.getResourceProvider();
            }
            org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, g6Var2);
            d2Var.q(500L);
            MessagesController.getInstance(i10).getStoriesController().k(j10, new mh.v1(this, d2Var, j10, oVar, 1), true, g6Var2);
            return;
        }
        ba.E(pyVar.getParentActivity(), i10).R(w9.c(oVar));
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17607x;
            if (i10 < arrayList.size()) {
                if (((m) arrayList.get(i10)).f17424c == j10) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            f2.j0 j0Var = this.P;
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

    public final void l(float f10, boolean z4) {
        boolean z10;
        float f11;
        float f12;
        if (this.W != f10) {
            this.W = f10;
            b();
            if (f10 > this.f17610y0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f17608x0) {
                this.f17608x0 = z10;
                AnimatorSet animatorSet = this.H0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    this.H0.cancel();
                    this.H0 = null;
                }
                float f13 = 1.0f;
                if (z4) {
                    float f14 = this.f17577a0;
                    if (z10) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f11);
                    this.f17611z0 = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final p f16909b;

                        {
                            this.f16909b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    p pVar = this.f16909b;
                                    pVar.getClass();
                                    pVar.f17577a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar.b();
                                    return;
                                case 1:
                                    p pVar2 = this.f16909b;
                                    pVar2.getClass();
                                    pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    p pVar3 = this.f16909b;
                                    pVar3.getClass();
                                    pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    p pVar4 = this.f16909b;
                                    pVar4.getClass();
                                    pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.f17611z0.setInterpolator(pr.h);
                    float f15 = this.W;
                    if (z10) {
                        f12 = f15;
                    } else {
                        f12 = 0.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f15, f12);
                    this.C0 = ofFloat2;
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final p f16909b;

                        {
                            this.f16909b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    p pVar = this.f16909b;
                                    pVar.getClass();
                                    pVar.f17577a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar.b();
                                    return;
                                case 1:
                                    p pVar2 = this.f16909b;
                                    pVar2.getClass();
                                    pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                case 2:
                                    p pVar3 = this.f16909b;
                                    pVar3.getClass();
                                    pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    return;
                                default:
                                    p pVar4 = this.f16909b;
                                    pVar4.getClass();
                                    pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    pVar4.invalidate();
                                    return;
                            }
                        }
                    });
                    this.C0.setDuration(100L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.H0 = animatorSet2;
                    animatorSet2.addListener(new eg.u2(4, this, z10));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f17611z0);
                    arrayList.add(this.C0);
                    if (this.f17608x0) {
                        this.H0.setDuration(1000L);
                        float f16 = this.f17577a0;
                        if (!z10) {
                            f13 = 0.0f;
                        }
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f16, f13);
                        this.A0 = ofFloat3;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final p f16909b;

                            {
                                this.f16909b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        p pVar = this.f16909b;
                                        pVar.getClass();
                                        pVar.f17577a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar.b();
                                        return;
                                    case 1:
                                        p pVar2 = this.f16909b;
                                        pVar2.getClass();
                                        pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        p pVar3 = this.f16909b;
                                        pVar3.getClass();
                                        pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        p pVar4 = this.f16909b;
                                        pVar4.getClass();
                                        pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar4.invalidate();
                                        return;
                                }
                            }
                        });
                        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f17599r0);
                        this.G0 = overshootInterpolator;
                        this.A0.setInterpolator(overshootInterpolator);
                        this.A0.setDuration(750L);
                        arrayList.add(this.A0);
                    } else {
                        float f17 = this.f17577a0;
                        if (!z10) {
                            f13 = 0.0f;
                        }
                        this.E0 = ValueAnimator.ofFloat(f17, f13);
                        this.E0.setInterpolator(new OvershootInterpolator(this.f17601s0));
                        this.E0.setDuration(350L);
                        this.E0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final p f16909b;

                            {
                                this.f16909b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        p pVar = this.f16909b;
                                        pVar.getClass();
                                        pVar.f17577a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar.b();
                                        return;
                                    case 1:
                                        p pVar2 = this.f16909b;
                                        pVar2.getClass();
                                        pVar2.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    case 2:
                                        p pVar3 = this.f16909b;
                                        pVar3.getClass();
                                        pVar3.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        return;
                                    default:
                                        p pVar4 = this.f16909b;
                                        pVar4.getClass();
                                        pVar4.F0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        pVar4.invalidate();
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
                this.f17577a0 = f13;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (h5.d) new ag.d(4));
            }
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f17585f).clientUserId;
        t6 t6Var = this.f17600s;
        if (!t6Var.J(j10)) {
            if (!t6Var.H() || t6Var.f17777g.size() > 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void n() {
        if (this.G == null) {
            qh.e3 e3Var = new qh.e3(getContext(), 1);
            e3Var.h(f(org.telegram.ui.ActionBar.k6.Fi));
            e3Var.p(true);
            e3Var.H = Layout.Alignment.ALIGN_CENTER;
            e3Var.l(0.0f, 29.0f);
            this.G = e3Var;
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.k6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) replaceSingleTag.getSpans(0, replaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                replaceSingleTag.setSpan(new e51(AndroidUtilities.bold()), replaceSingleTag.getSpanStart(clickableSpanArr[0]), replaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            qh.e3 e3Var2 = this.G;
            e3Var2.h = qh.e3.a(replaceSingleTag, e3Var2.getTextPaint());
            this.G.s(replaceSingleTag);
            this.G.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.G, k7.c6.e(-1, 150, 51));
            }
        }
        qh.e3 e3Var3 = this.G;
        if (e3Var3 != null) {
            if (e3Var3.S) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.G.u();
        }
    }

    public final void o() {
        q20 q20Var = m7.f17445b;
        if (q20Var != null) {
            q20Var.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.lk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.mk, false), 0, 0);
        }
        q20 q20Var2 = m7.f17446c;
        if (q20Var2 != null) {
            q20Var2.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.nk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ok, false), 0, 0);
        }
        q20[] q20VarArr = m7.f17444a;
        q20 q20Var3 = q20VarArr[0];
        if (q20Var3 != null) {
            q20Var3.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.jk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.kk, false), 0, 0);
        }
        q20 q20Var4 = q20VarArr[1];
        if (q20Var4 != null) {
            q20Var4.d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ik, false), 0, 0);
        }
        if (m7.d != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.xj, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false);
            m7.d.d(i0.a.d(0.25f, w02, w03), w03, 0, 0);
        }
        final int textColor = getTextColor();
        this.Q.setTextColor(getTextLogoColor());
        i iVar = this.R;
        if (iVar != null) {
            iVar.c();
        }
        this.S.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new h5.d() {
            @Override
            public final void accept(Object obj) {
                o oVar = (o) ((View) obj);
                oVar.invalidate();
                oVar.f17528y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.f17598r, (h5.d) new ag.d(5));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false, false);
        NotificationCenter.getInstance(this.f17585f).addObserver(this, NotificationCenter.storiesUpdated);
        cb.m mVar = this.I0;
        mVar.f2424a = true;
        AnimatorSet animatorSet = (AnimatorSet) mVar.f2426c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.U.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f17585f).removeObserver(this, NotificationCenter.storiesUpdated);
        cb.m mVar = this.I0;
        mVar.f2424a = false;
        ((AnimatorSet) mVar.f2426c).cancel();
        j7 j7Var = this.f17595o0;
        if (j7Var != null) {
            j7Var.a();
            this.f17595o0 = null;
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
            int size = this.f17609y.size();
            int dp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            h hVar = this.f17598r;
            int x10 = (int) (hVar.getX() + dp);
            int y10 = (int) (hVar.getY() + hVar.getHeight());
            xc xcVar = this.F;
            xcVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((int) hVar.getX(), (int) hVar.getY(), x10, y10);
            xcVar.f33023i = false;
            xcVar.f33019c = 0;
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
        if ((this.L == 1 || this.f17591k0 != 0.0f) && !z10) {
            this.H = true;
            return;
        }
        ArrayList arrayList3 = this.v;
        arrayList3.clear();
        ArrayList arrayList4 = this.f17607x;
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = this.f17605w;
        arrayList5.clear();
        ArrayList arrayList6 = this.f17609y;
        arrayList5.addAll(arrayList6);
        arrayList4.clear();
        int i10 = this.f17578b;
        int i11 = this.f17585f;
        if (i10 != 1) {
            arrayList4.add(new m(UserConfig.getInstance(i11).getClientUserId()));
        }
        t6 t6Var = this.f17600s;
        if (i10 == 1) {
            arrayList = t6Var.h;
        } else {
            arrayList = t6Var.f17777g;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList4.add(new m(peerDialogId));
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
        this.f17581c0 = null;
        boolean G = t6Var.G();
        org.telegram.ui.Components.k6 k6Var = this.Q;
        if (G) {
            arrayList2 = arrayList4;
            if (t6Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    if (this.f17586f0 == null) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string2);
                        o9 o9Var = new o9();
                        valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
                        o9Var.f17569a = k6Var;
                        o9Var.f17574n = true;
                        this.f17586f0 = valueOf;
                    }
                    this.f17581c0 = this.f17586f0;
                } else {
                    this.f17581c0 = string2;
                }
            } else {
                if (this.f17596p0 < AndroidUtilities.dp(50.0f)) {
                    string = null;
                } else {
                    string = LocaleController.getString(R.string.MyStory);
                }
                this.f17581c0 = string;
            }
        } else {
            arrayList2 = arrayList4;
            if (this.f17596p0 < AndroidUtilities.dp(50.0f)) {
                formatPluralString = null;
            } else {
                formatPluralString = LocaleController.formatPluralString("Stories", max, new Object[0]);
            }
            this.f17581c0 = formatPluralString;
        }
        if (!this.f17582d0) {
            CharSequence charSequence = this.f17581c0;
            if (z4 && !LocaleController.isRTL) {
                z13 = true;
            } else {
                z13 = false;
            }
            k6Var.c(charSequence, z13, true);
        }
        if (TextUtils.isEmpty(this.f17581c0) && !this.f17582d0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f17576a.a(z12, z4);
        arrayList6.clear();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            if (((m) arrayList2.get(i13)).f17424c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList6.add((m) arrayList2.get(i13));
                if (arrayList6.size() >= 3) {
                    break;
                }
            }
        }
        h hVar = this.h;
        h hVar2 = this.f17598r;
        if (z4) {
            if (this.L == 2) {
                hVar2.setItemAnimator(this.d);
                hVar.setItemAnimator(null);
            } else {
                hVar.setItemAnimator(this.O);
                hVar2.setItemAnimator(null);
            }
        } else {
            hVar.setItemAnimator(null);
            hVar2.setItemAnimator(null);
        }
        this.B.E(arrayList3, arrayList2);
        this.C.E(arrayList5, arrayList6);
        arrayList3.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f17594n0 = kVar;
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
        this.f17596p0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f17591k0 = f10 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(f10, true);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qh.e3 e3Var = this.G;
        if (e3Var != null) {
            e3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
