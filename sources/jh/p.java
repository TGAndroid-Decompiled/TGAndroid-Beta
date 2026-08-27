package jh;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
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
import hh.y9;
import java.util.ArrayList;
import java.util.Collections;
import lh.nb;
import lh.sb;
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
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.gy;
import org.telegram.ui.yw;

public abstract class p extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, ud.b {
    public final l A;
    public float A0;
    public final l B;
    public ValueAnimator B0;
    public final Paint C;
    public float C0;
    public final Paint D;
    public ValueAnimator D0;
    public final tc E;
    public float E0;
    public lh.w3 F;
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
    public final f2.l N;
    public final f2.k0 O;
    public final org.telegram.ui.Components.j6 P;
    public final i Q;
    public final ImageView R;
    public final ImageView S;
    public final org.telegram.ui.Components.i5 T;
    public final ArrayList U;
    public float V;
    public float W;

    public final ud.a f13771a;

    public final gy f13772a0;

    public final int f13773b;

    public CharSequence f13774b0;

    public final Drawable f13775c;

    public boolean f13776c0;
    public final k d;

    public int f13777d0;

    public int f13778e;

    public SpannableStringBuilder f13779e0;

    public final int f13780f;

    public ValueAnimator f13781f0;

    public n f13782g0;
    public final h h;

    public boolean f13783h0;

    public boolean f13784i0;

    public float f13785j0;

    public int f13786k0;

    public o f13787l0;
    public org.telegram.ui.ActionBar.k m0;

    public si0 f13788n;

    public i7 f13789n0;

    public float f13790o0;

    public final float f13791p0;

    public final float f13792q0;

    public final h f13793r;

    public final float f13794r0;

    public final s6 f13795s;

    public final a5.f f13796s0;

    public LinearGradient f13797t0;

    public Matrix f13798u0;
    public final ArrayList v;

    public Paint f13799v0;

    public final ArrayList f13800w;

    public boolean f13801w0;

    public final ArrayList f13802x;

    public final float f13803x0;

    public final ArrayList f13804y;

    public ValueAnimator f13805y0;

    public ValueAnimator f13806z0;

    public p(Context context, gy gyVar, int i10, int i11) {
        super(context);
        this.f13771a = new ud.a(1, this, er.h, 380L, false);
        this.v = new ArrayList();
        this.f13800w = new ArrayList();
        this.f13802x = new ArrayList();
        this.f13804y = new ArrayList();
        yw ywVar = (yw) this;
        l lVar = new l(ywVar, false);
        this.A = lVar;
        l lVar2 = new l(ywVar, true);
        this.B = lVar2;
        Paint paint = new Paint();
        this.C = new Paint(1);
        this.D = new Paint(1);
        tc tcVar = new tc(this);
        this.E = tcVar;
        this.J = -1.0f;
        this.K = -1;
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.U = new ArrayList();
        this.V = -1.0f;
        this.f13783h0 = true;
        this.f13791p0 = 1.0f;
        this.f13792q0 = 0.95f;
        this.f13794r0 = 0.9f;
        this.f13796s0 = new a5.f(23);
        this.f13803x0 = 0.3f;
        this.A0 = 1.0f;
        new OvershootInterpolator(0.9f);
        this.F0 = new OvershootInterpolator(0.95f);
        com.google.firebase.messaging.l lVar3 = new com.google.firebase.messaging.l(this);
        this.H0 = lVar3;
        this.f13773b = i11;
        this.f13780f = i10;
        this.f13772a0 = gyVar;
        this.f13790o0 = AndroidUtilities.dp(68.0f);
        this.f13795s = MessagesController.getInstance(i10).getStoriesController();
        h hVar = new h(ywVar, context, 0);
        this.h = hVar;
        hVar.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        hVar.setClipToPadding(false);
        hVar.setClipChildren(false);
        tcVar.h = new y9(ywVar, 7);
        ag.l3 l3Var = new ag.l3(ywVar, 9);
        tcVar.f32738l = true;
        tcVar.f32736j = l3Var;
        hVar.j(new ag.z2(ywVar, 11));
        f2.l lVar4 = new f2.l();
        this.N = lVar4;
        lVar4.C = false;
        lVar4.n(150L);
        lVar4.f5819m = false;
        hVar.setItemAnimator(lVar4);
        f2.k0 k0Var = new f2.k0(0, false);
        this.O = k0Var;
        hVar.setLayoutManager(k0Var);
        hVar.setOnItemClickListener(new ag.p0(ywVar, 9));
        hVar.setOnItemLongClickListener(new h3.x(ywVar, 19));
        hVar.setAdapter(lVar);
        addView(hVar, h7.z5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), true, true, false);
        this.P = j6Var;
        j6Var.setGravity(3);
        j6Var.setTextColor(getTextLogoColor());
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        j6Var.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        j6Var.setImportantForAccessibility(1);
        j6Var.setFocusableInTouchMode(true);
        addView(j6Var, h7.z5.c(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.R = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, h7.z5.c(22.0f, 90));
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(26.0f), null);
        this.T = i5Var;
        i5Var.f29225a = true;
        i5Var.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.S = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(i5Var);
        addView(imageView2, h7.z5.c(40.0f, 40));
        i iVar = new i(ywVar, context, lVar3);
        this.Q = iVar;
        addView(iVar, h7.z5.c(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f13775c = getContext().getDrawable(R.drawable.msg_mini_addstory);
        h hVar2 = new h(ywVar, getContext(), 1);
        this.f13793r = hVar2;
        getContext();
        hVar2.setLayoutManager(new f2.k0(0, false));
        hVar2.i(new j(0));
        k kVar = new k();
        this.d = kVar;
        kVar.C = false;
        kVar.f5819m = false;
        hVar2.setItemAnimator(kVar);
        hVar2.setAdapter(lVar2);
        hVar2.setClipChildren(false);
        addView(hVar2, h7.z5.d(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        d();
        q(false, false);
    }

    public int getTextColor() {
        return this.f13773b == 0 ? f(org.telegram.ui.ActionBar.g6.A8) : f(org.telegram.ui.ActionBar.g6.P8);
    }

    private int getTextLogoColor() {
        return f(org.telegram.ui.ActionBar.g6.gl);
    }

    public final void b() {
        int i10;
        this.J = 1.0f - AndroidUtilities.lerp(1.0f - this.V, 1.0f, 1.0f - this.W);
        d();
        float f10 = this.J;
        if (f10 == 1.0f) {
            i10 = 2;
        } else {
            i10 = f10 != 0.0f ? 1 : 0;
        }
        if (this.K != i10) {
            this.K = i10;
            if (i10 != 1 && this.G) {
                AndroidUtilities.runOnUIThread(new d(this, 0));
            }
            int i11 = this.K;
            h hVar = this.f13793r;
            h hVar2 = this.h;
            if (i11 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) hVar2, (d5.d) new j4.w0(1));
                hVar.setVisibility(4);
                hVar2.setVisibility(0);
                if (System.currentTimeMillis() >= this.I0) {
                    this.I0 = System.currentTimeMillis() + 60000;
                }
            } else {
                int i12 = this.f13780f;
                if (i11 == 1) {
                    ArrayList arrayList = this.M;
                    arrayList.clear();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f13802x;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        if (((m) arrayList2.get(i13)).f13646c != UserConfig.getInstance(i12).getClientUserId() || m()) {
                            arrayList.add(Long.valueOf(((m) arrayList2.get(i13)).f13646c));
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
                    cg.w1 w1Var = MessagesController.getInstance(i12).getStoriesController().K;
                    AndroidUtilities.cancelRunOnUIThread(w1Var);
                    w1Var.run();
                    i7 i7Var = this.f13789n0;
                    if (i7Var != null) {
                        i7Var.a();
                        this.f13789n0 = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        int iN0;
        f2.k0 k0Var = this.O;
        int iN1 = k0Var.N0() + 10;
        ArrayList arrayList = this.f13802x;
        int size = arrayList.size();
        s6 s6Var = this.f13795s;
        if (iN1 > size || ((iN0 = k0Var.N0() + 9) < arrayList.size() && s6Var.D(0, ((m) arrayList.get(iN0)).f13646c) == 0)) {
            boolean z10 = this.f13773b == 1;
            if (z10) {
                if (!s6Var.f13977z) {
                    return;
                }
            } else if (!s6Var.f13968p) {
                return;
            }
            s6Var.Q(z10);
        }
    }

    public final void d() {
        float fA = h7.n.a(Math.min(this.J, this.W), 0.0f, 1.0f);
        float f10 = this.f13771a.f48497e;
        float f11 = 1.0f - f10;
        float f12 = f10 * fA;
        float f13 = f11 * fA;
        org.telegram.ui.Components.j6 j6Var = this.P;
        if (j6Var != null) {
            j6Var.setAlpha(f12);
            j6Var.setVisibility(f12 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setAlpha(f13);
            imageView.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setAlpha(f13);
            imageView2.setVisibility(f13 > 0.0f ? 0 : 8);
        }
        i iVar = this.Q;
        if (iVar != null) {
            iVar.setAlpha(fA);
            iVar.setVisibility(fA > 0.0f ? 0 : 8);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated && this.f13783h0) {
            q(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new d(this, 2));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int iR;
        float f10;
        float f11;
        h hVar;
        float f12;
        float f13;
        h hVar2;
        int i10;
        Canvas canvas2;
        boolean z10;
        double d;
        float f14;
        float f15;
        float fLerp;
        float f16;
        float fLerp2;
        float f17;
        float f18;
        float fLerp3;
        float f19;
        float fLerp4;
        float fLerp5;
        int i11;
        int i12;
        float fDp;
        boolean z11;
        boolean z12;
        boolean z13;
        float f20;
        float f21;
        int iR2;
        canvas.save();
        int i13 = this.H;
        if (i13 > 0) {
            canvas.clipRect(0, i13, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f22 = 0.0f;
        float fLerp6 = AndroidUtilities.lerp(0.0f, measuredHeight, this.V);
        h hVar3 = this.h;
        hVar3.setTranslationY(fLerp6);
        h hVar4 = this.f13793r;
        hVar4.setTranslationY(fLerp6);
        hVar4.setTranslationX(this.f13790o0);
        int i14 = 0;
        while (true) {
            arrayList = this.L;
            if (i14 >= arrayList.size()) {
                break;
            }
            ((o) arrayList.get(i14)).f13720a = false;
            i14++;
        }
        arrayList.clear();
        int i15 = this.K;
        int i16 = -1;
        ArrayList arrayList2 = this.M;
        if ((i15 == 1 || i15 == 0) && !arrayList2.isEmpty()) {
            iR = -1;
            f10 = 4.0f;
            for (int i17 = 0; i17 < hVar3.getChildCount(); i17++) {
                o oVar = (o) hVar3.getChildAt(i17);
                iR = oVar.A == ((Long) arrayList2.get(0)).longValue() ? RecyclerView.R(oVar) : iR;
            }
        } else {
            f10 = 4.0f;
            iR = this.K == 2 ? 0 : -1;
        }
        int i18 = this.K;
        if (i18 < 0 || i18 == 2) {
            f11 = fLerp6;
            hVar = hVar3;
            f12 = 2.0f;
            float f23 = 0.0f;
            for (int i19 = 0; i19 < hVar4.getChildCount(); i19++) {
                o oVar2 = (o) hVar4.getChildAt(i19);
                float x8 = oVar2.getX() + hVar4.getX() + oVar2.getMeasuredWidth();
                if (f23 == 0.0f || x8 > f23) {
                    f23 = x8;
                }
            }
            f13 = f23;
        } else {
            if (iR == -1) {
                f2.k0 k0Var = this.O;
                iR = k0Var.I0();
                if (iR == -1) {
                    iR = k0Var.L0();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            hVar3.setAlpha(1.0f - Utilities.clamp(this.J / this.f13803x0, 1.0f, 0.0f));
            this.f13786k0 = -1;
            if (this.f13785j0 != 0.0f) {
                int i20 = 0;
                int i21 = -1;
                f12 = 2.0f;
                while (i20 < hVar3.getChildCount()) {
                    View childAt = hVar3.getChildAt(i20);
                    if (childAt.getX() < f22 || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (iR2 = RecyclerView.R(childAt)) < 0 || (i21 != i16 && iR2 >= i21)) {
                        f21 = fLerp6;
                    } else {
                        f21 = fLerp6;
                        if (((m) this.f13802x.get(iR2)).f13646c != UserConfig.getInstance(this.f13780f).clientUserId) {
                            this.f13787l0 = (o) childAt;
                            i21 = iR2;
                        }
                    }
                    i20++;
                    fLerp6 = f21;
                    i16 = -1;
                    f22 = 0.0f;
                }
                f11 = fLerp6;
                this.f13786k0 = i21;
            } else {
                f11 = fLerp6;
                f12 = 2.0f;
            }
            float f24 = 0.0f;
            int i22 = 0;
            while (i22 < hVar3.getChildCount()) {
                o oVar3 = (o) hVar3.getChildAt(i22);
                oVar3.setClipInParent(false);
                h7 h7Var = oVar3.K;
                int iR3 = RecyclerView.R(oVar3);
                float fPow = this.J;
                if (iR3 < iR || iR3 >= arrayList2.size() + iR) {
                    d = 0.25d;
                } else {
                    int i23 = iR3 - iR;
                    if (i23 == iR + 2) {
                        fPow = this.J;
                        d = 0.25d;
                    } else if (i23 == iR + 1) {
                        fPow = (float) Math.pow(this.J, 0.5d);
                        d = 0.25d;
                    } else {
                        measuredHeight = measuredHeight;
                        d = 0.25d;
                        fPow = (float) Math.pow(this.J, 0.25d);
                    }
                }
                if (iR3 < iR) {
                    fPow = (float) Math.pow(this.J, d);
                }
                oVar3.d(fPow, this.W, this.f13785j0, this.f13786k0 == oVar3.f13721b);
                if (iR3 <= iR || iR3 >= arrayList2.size() + iR) {
                    fPow = fPow;
                    hVar3 = hVar3;
                    f14 = 0.0f;
                    h7Var.f13396g = 0.0f;
                    h7Var.h = 0.0f;
                    h7Var.f13397i = 0.0f;
                    h7Var.f13398j = 0.0f;
                    h7Var.f13399k = false;
                } else {
                    o oVar4 = (o) hVar3.getChildAt(i22 - 1);
                    if (oVar4 != null) {
                        h7 h7Var2 = oVar4.K;
                        float fDp2 = AndroidUtilities.dp(48.0f);
                        float fDp3 = AndroidUtilities.dp(26.33f);
                        float fLerp7 = (AndroidUtilities.lerp(fDp2, fDp3, oVar4.F) + AndroidUtilities.dp(8.0f)) / f12;
                        float fLerp8 = (AndroidUtilities.lerp(fDp2, fDp3, oVar3.F) + AndroidUtilities.dp(8.0f)) / f12;
                        float x10 = oVar4.getX() + h7Var2.F.centerX();
                        float y10 = oVar4.getY() + h7Var2.F.centerY();
                        float x11 = (oVar3.getX() + h7Var.F.centerX()) - x10;
                        float y11 = (oVar3.getY() + h7Var.F.centerY()) - y10;
                        float fSqrt = (float) Math.sqrt((y11 * y11) + (x11 * x11));
                        float f25 = fLerp7 + fLerp8;
                        if (fSqrt < f25) {
                            float degrees = (float) Math.toDegrees(Math.acos(fSqrt / f25) * 2.0d);
                            float degrees2 = (float) Math.toDegrees(Math.atan2(y11, x11));
                            float f26 = degrees / f12;
                            h7Var2.f13396g = degrees2 - f26;
                            h7Var2.h = degrees2 + f26;
                            float degrees3 = (float) Math.toDegrees(Math.atan2(-y11, -x11));
                            float f27 = -Math.abs(degrees3 - f26);
                            float fAbs = Math.abs(degrees3 + f26);
                            h7Var.f13397i = f27;
                            h7Var.f13398j = fAbs;
                            f14 = 0.0f;
                        } else {
                            f14 = 0.0f;
                            h7Var2.f13396g = 0.0f;
                            h7Var2.h = 0.0f;
                            h7Var.f13397i = 0.0f;
                            h7Var.f13398j = 0.0f;
                        }
                        h7Var2.f13399k = false;
                        h7Var.f13399k = false;
                    } else {
                        fPow = fPow;
                        hVar3 = hVar3;
                        f14 = 0.0f;
                    }
                }
                float fClamp = Utilities.clamp((this.f13785j0 - 0.5f) / 0.5f, 1.0f, f14);
                float fDp4 = AndroidUtilities.dp(16.0f) * fClamp;
                float f28 = (float) (((double) ((1.0f - fClamp) * 0.5f)) + 0.5d);
                if (iR3 <= iR) {
                    f15 = 0.0f;
                    fLerp = 0.0f;
                } else if (iR3 == iR + 1) {
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.J) + ((AndroidUtilities.dp(16.0f) * fPow) - AndroidUtilities.dpf2(0.5f));
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.J) + (((AndroidUtilities.dp(16.0f) * fPow) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                }
                float f29 = fLerp + this.f13790o0;
                if (this.f13801w0) {
                    f16 = 0.0f;
                    fLerp2 = AndroidUtilities.lerp(0.0f, f29 - oVar3.getLeft(), this.F0.getInterpolation(this.A0));
                } else {
                    if (this.f13785j0 <= f15) {
                        f20 = 0.0f;
                    } else {
                        int i24 = oVar3.f13721b;
                        int i25 = this.f13786k0;
                        if (i24 < i25) {
                            f20 = -fDp4;
                        } else if (i24 > i25) {
                            f20 = fDp4;
                        } else {
                            f20 = 0.0f;
                        }
                    }
                    fLerp2 = AndroidUtilities.lerp(f29 - oVar3.getLeft(), f20, 1.0f - this.E0);
                    f16 = 0.0f;
                }
                float fA = h7.n.a((this.V - 0.2f) / 0.1f, f16, 1.0f);
                int i26 = iR3 - iR;
                if (i26 == 0) {
                    f17 = 0.65f;
                    fLerp3 = AndroidUtilities.lerp(f16, f11 - measuredHeight, er.h.getInterpolation(this.J));
                } else {
                    f17 = 0.65f;
                    if (i26 == 1) {
                        fLerp3 = AndroidUtilities.lerp(f16, (f11 - measuredHeight) * 0.65f, er.h.getInterpolation(this.J));
                    } else {
                        f18 = 0.0f;
                    }
                    if (oVar3.f13721b == this.f13786k0 || this.f13785j0 <= f16) {
                        f19 = 0.0f;
                    } else {
                        f19 = (-fDp4) / f12;
                    }
                    if (i26 == 0) {
                        fLerp4 = AndroidUtilities.lerp(f19, f11 - measuredHeight, this.C0);
                    } else if (i26 == 1) {
                        fLerp4 = AndroidUtilities.lerp(f19, (f11 - measuredHeight) * f17, this.C0);
                    } else {
                        fLerp4 = 0.0f;
                    }
                    fLerp5 = AndroidUtilities.lerp(fLerp4, f18, fA);
                    if (this.J > 0.0f) {
                        if (iR3 >= iR || iR3 > iR + 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z10 || i26 < 0 || i26 >= arrayList2.size()) {
                            oVar3.setCrossfadeTo(-1L);
                        } else {
                            oVar3.setCrossfadeTo(((Long) arrayList2.get(i26)).longValue());
                        }
                        oVar3.f13720a = z11;
                        if (iR3 == iR) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        oVar3.d = z12;
                        if (iR3 >= (arrayList2.size() + iR) - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        oVar3.f13722c = z13;
                        oVar3.setTranslationX(fLerp2);
                        oVar3.setTranslationY(fLerp5);
                        if (z11) {
                            arrayList.add(oVar3);
                        }
                    } else if (hVar3.getItemAnimator() != null || !hVar3.getItemAnimator().k()) {
                        if (this.f13785j0 > 0.0f) {
                            i11 = oVar3.f13721b;
                            i12 = this.f13786k0;
                            if (i11 < i12 && i11 <= i12) {
                                oVar3.setAlpha(1.0f);
                            } else {
                                oVar3.setAlpha(f28);
                            }
                        } else {
                            oVar3.setAlpha(1.0f);
                        }
                        oVar3.setTranslationX(fLerp2);
                        oVar3.setTranslationY(fLerp5);
                    }
                    if (oVar3.f13720a) {
                        fDp = (AndroidUtilities.dp(70.0f) / f12) + (oVar3.getMeasuredWidth() / f12) + oVar3.getX() + hVar3.getX();
                        if (f24 != 0.0f || fDp > f24) {
                            f24 = fDp;
                        } else {
                            f24 = f24;
                        }
                    } else {
                        f24 = f24;
                    }
                    i22++;
                    measuredHeight = measuredHeight;
                    z10 = z10;
                    hVar3 = hVar3;
                }
                f18 = fLerp3;
                if (oVar3.f13721b == this.f13786k0) {
                    f19 = 0.0f;
                } else {
                    f19 = 0.0f;
                }
                if (i26 == 0) {
                    fLerp4 = AndroidUtilities.lerp(f19, f11 - measuredHeight, this.C0);
                } else if (i26 == 1) {
                    fLerp4 = AndroidUtilities.lerp(f19, (f11 - measuredHeight) * f17, this.C0);
                } else {
                    fLerp4 = 0.0f;
                }
                fLerp5 = AndroidUtilities.lerp(fLerp4, f18, fA);
                if (this.J > 0.0f) {
                    if (iR3 >= iR) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        oVar3.setCrossfadeTo(-1L);
                    } else {
                        oVar3.setCrossfadeTo(-1L);
                    }
                    oVar3.f13720a = z11;
                    if (iR3 == iR) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    oVar3.d = z12;
                    if (iR3 >= (arrayList2.size() + iR) - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    oVar3.f13722c = z13;
                    oVar3.setTranslationX(fLerp2);
                    oVar3.setTranslationY(fLerp5);
                    if (z11) {
                        arrayList.add(oVar3);
                    }
                } else if (hVar3.getItemAnimator() != null) {
                    if (this.f13785j0 > 0.0f) {
                        i11 = oVar3.f13721b;
                        i12 = this.f13786k0;
                        if (i11 < i12) {
                            oVar3.setAlpha(f28);
                        } else {
                            oVar3.setAlpha(1.0f);
                        }
                    } else {
                        oVar3.setAlpha(1.0f);
                    }
                    oVar3.setTranslationX(fLerp2);
                    oVar3.setTranslationY(fLerp5);
                } else {
                    if (this.f13785j0 > 0.0f) {
                        i11 = oVar3.f13721b;
                        i12 = this.f13786k0;
                        if (i11 < i12) {
                            oVar3.setAlpha(f28);
                        } else {
                            oVar3.setAlpha(1.0f);
                        }
                    } else {
                        oVar3.setAlpha(1.0f);
                    }
                    oVar3.setTranslationX(fLerp2);
                    oVar3.setTranslationY(fLerp5);
                }
                if (oVar3.f13720a) {
                    fDp = (AndroidUtilities.dp(70.0f) / f12) + (oVar3.getMeasuredWidth() / f12) + oVar3.getX() + hVar3.getX();
                    if (f24 != 0.0f) {
                    }
                    f24 = fDp;
                } else {
                    f24 = f24;
                }
                i22++;
                measuredHeight = measuredHeight;
                z10 = z10;
                hVar3 = hVar3;
            }
            f13 = f24;
            hVar = hVar3;
        }
        if (this.F != null) {
            float fLerp9 = AndroidUtilities.lerp(29, 74, er.f28123g.getInterpolation(this.J));
            hVar2 = hVar;
            i10 = 0;
            if (hVar.getChildCount() > 0) {
                fLerp9 += hVar2.getChildAt(0).getLeft();
            }
            this.F.m(0.0f, fLerp9);
        } else {
            hVar2 = hVar;
            i10 = 0;
        }
        float fMin = Math.min(this.J, this.W);
        float visibleItemsMeasuredWidthWithAlpha = (this.m0.A.getVisibleItemsMeasuredWidthWithAlpha() * fMin) - AndroidUtilities.dp(6.0f);
        boolean z14 = fMin != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z14) {
            float width = getWidth() - visibleItemsMeasuredWidthWithAlpha;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, width, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (fMin != 0.0f) {
            i iVar = this.Q;
            float totalVisibility = iVar.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            org.telegram.ui.Components.j6 j6Var = this.P;
            float measuredHeight2 = (j6Var.getMeasuredHeight() - j6Var.getTextHeight()) / f12;
            j6Var.setPivotX(0.0f);
            j6Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, iVar.getTotalVisibility()));
            j6Var.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, iVar.getTotalVisibility()));
            j6Var.setTranslationY((((f11 + AndroidUtilities.dp(14.0f)) - measuredHeight2) + AndroidUtilities.dp(f10)) - (iVar.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int iDp = AndroidUtilities.dp(72.0f);
            float f30 = this.J;
            float fLerp10 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f30) / f12;
            float fD = com.google.android.recaptcha.internal.a.d(fLerp10, 2.0f, AndroidUtilities.lerp((iDp / f12) - fLerp10, 0.0f, f30), -iDp) + AndroidUtilities.dp(12.0f) + f13;
            j6Var.setTranslationX(fD);
            org.telegram.ui.Components.i6 drawable = j6Var.getDrawable();
            drawable.H = (this.m0.A.getVisibleItemsMeasuredWidthWithAlpha() * fMin) + (fD - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            float translationX = j6Var.getTranslationX() + AndroidUtilities.dp(1.0f);
            ImageView imageView = this.R;
            imageView.setTranslationX(translationX);
            imageView.setTranslationY(f11 + AndroidUtilities.dp(22.333f) + totalVisibility);
            float translationX2 = (j6Var.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth();
            ImageView imageView2 = this.S;
            imageView2.setTranslationX(translationX2);
            imageView2.setTranslationY(f11 + AndroidUtilities.dp(11.333f) + totalVisibility);
            iVar.setTranslationX(j6Var.getTranslationX());
            iVar.setTranslationY(f11 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i27 = this.K;
        if (i27 >= 0 && i27 != 2) {
            Collections.sort(arrayList, this.f13796s0);
            while (i10 < arrayList.size()) {
                o oVar5 = (o) arrayList.get(i10);
                canvas2.save();
                canvas2.translate(oVar5.getX() + hVar2.getX(), oVar5.getY() + hVar2.getY());
                oVar5.draw(canvas2);
                canvas2.restore();
                i10++;
            }
        }
        if (z14) {
            float fDp5 = AndroidUtilities.dp(16.0f);
            if (this.f13797t0 == null) {
                this.f13797t0 = new LinearGradient(0.0f, 0.0f, fDp5, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f13798u0 = new Matrix();
                Paint paint = new Paint(1);
                this.f13799v0 = paint;
                paint.setShader(this.f13797t0);
                this.f13799v0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.f13798u0.reset();
            this.f13798u0.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - fDp5, 0.0f);
            this.f13797t0.setLocalMatrix(this.f13798u0);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - fDp5, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.f13799v0);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final o e(long j10) {
        h hVar = this.K == 2 ? this.f13793r : this.h;
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
        gy gyVar = this.f13772a0;
        return (gyVar == null || gyVar.getResourceProvider() == null) ? org.telegram.ui.ActionBar.g6.w0(null, i10, false) : gyVar.getThemedColor(i10);
    }

    public final boolean g() {
        int i10 = this.K;
        return i10 == 0 || i10 == 1;
    }

    public float getCollapsedProgress() {
        return this.J;
    }

    public float getOverScrollCoef() {
        return this.f13791p0;
    }

    public lh.w3 getPremiumHint() {
        return this.F;
    }

    public final void h() {
        if (this.f13795s.H()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.f13780f).clientUserId));
            this.f13772a0.getOrCreateStoryViewer().F(getContext(), null, arrayList, 0, null, null, b7.a(this.f13793r), false);
        }
    }

    public final void i(o oVar, boolean z10) {
        ValueAnimator valueAnimator;
        if ((!z10 || (valueAnimator = this.D0) == null || !valueAnimator.isRunning()) && oVar != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z11 = oVar.B;
            s6 s6Var = this.f13795s;
            if (!z11 || s6Var.H()) {
                if (s6Var.I(oVar.A) || s6Var.K(oVar.A)) {
                    TL_stories.PeerStories peerStoriesY = s6Var.y(oVar.A);
                    long j10 = oVar.A;
                    i7 i7Var = this.f13789n0;
                    if (i7Var != null) {
                        i7Var.a();
                        this.f13789n0 = null;
                    }
                    e5.u uVar = new e5.u(this, oVar, j10, 5);
                    if (z10) {
                        uVar.run();
                        return;
                    }
                    i7 i7VarN = l7.n(peerStoriesY, uVar);
                    oVar.f13723e = i7VarN;
                    this.f13789n0 = i7VarN;
                    if (i7VarN != null) {
                        s6Var.e0(oVar.A, true);
                    }
                }
            } else if (MessagesController.getInstance(this.f13780f).storiesEnabled()) {
                j(0L);
            } else {
                n();
            }
        }
    }

    public final void j(long j10) {
        o oVar;
        l6 l6VarO;
        gy gyVar = this.f13772a0;
        int i10 = this.f13780f;
        if (j10 == 0 && (l6VarO = MessagesController.getInstance(i10).getStoriesController().o()) != null && l6VarO.a(i10, 1)) {
            gyVar.showDialog(new ag.i1(l6VarO.b(), this.f13780f, getContext(), this.f13772a0, null));
            return;
        }
        int i11 = 0;
        while (true) {
            h hVar = this.h;
            if (i11 >= hVar.getChildCount()) {
                oVar = null;
                break;
            }
            oVar = (o) hVar.getChildAt(i11);
            if (j10 == 0) {
                if (oVar.B) {
                    break;
                } else {
                    i11++;
                }
            } else if (oVar.A == j10) {
                break;
            } else {
                i11++;
            }
        }
        if (oVar == null) {
            return;
        }
        if (j10 == 0) {
            sb.E(gyVar.getParentActivity(), i10).R(nb.c(oVar));
            return;
        }
        org.telegram.ui.ActionBar.c6 resourceProvider = gyVar != null ? gyVar.getResourceProvider() : null;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, resourceProvider);
        b2Var.q(500L);
        MessagesController.getInstance(i10).getStoriesController().k(j10, new hh.y1(this, b2Var, j10, oVar, 1), true, resourceProvider);
    }

    public final boolean k(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13802x;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((m) arrayList.get(i10)).f13646c == j10) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            f2.k0 k0Var = this.O;
            if (i10 < k0Var.I0()) {
                k0Var.h1(i10, 0);
                return true;
            }
            if (i10 > k0Var.M0()) {
                k0Var.i1(i10, 0, true);
                return true;
            }
        }
        return false;
    }

    public final void l(float f10, boolean z10) {
        if (this.V == f10) {
            return;
        }
        this.V = f10;
        b();
        final int i10 = 0;
        final int i11 = 1;
        boolean z11 = f10 > this.f13803x0;
        if (z11 != this.f13801w0) {
            this.f13801w0 = z11;
            AnimatorSet animatorSet = this.G0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.G0.cancel();
                this.G0 = null;
            }
            final int i12 = 2;
            if (!z10) {
                this.W = z11 ? 1.0f : 0.0f;
                b();
                AndroidUtilities.forEachViews((RecyclerView) this.h, (d5.d) new j4.w0(i12));
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
            this.f13805y0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final p f13133b;

                {
                    this.f13133b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            p pVar = this.f13133b;
                            pVar.getClass();
                            pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar.b();
                            break;
                        case 1:
                            p pVar2 = this.f13133b;
                            pVar2.getClass();
                            pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            p pVar3 = this.f13133b;
                            pVar3.getClass();
                            pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            p pVar4 = this.f13133b;
                            pVar4.getClass();
                            pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar4.invalidate();
                            break;
                    }
                }
            });
            this.f13805y0.setInterpolator(er.h);
            float f11 = this.V;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f11, z11 ? f11 : 0.0f);
            this.B0 = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final p f13133b;

                {
                    this.f13133b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            p pVar = this.f13133b;
                            pVar.getClass();
                            pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar.b();
                            break;
                        case 1:
                            p pVar2 = this.f13133b;
                            pVar2.getClass();
                            pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            p pVar3 = this.f13133b;
                            pVar3.getClass();
                            pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            p pVar4 = this.f13133b;
                            pVar4.getClass();
                            pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pVar4.invalidate();
                            break;
                    }
                }
            });
            this.B0.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G0 = animatorSet2;
            final int i13 = 3;
            animatorSet2.addListener(new ag.x(i13, this, z11));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f13805y0);
            arrayList.add(this.B0);
            if (this.f13801w0) {
                this.G0.setDuration(1000L);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
                this.f13806z0 = valueAnimatorOfFloat3;
                valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                    public final p f13133b;

                    {
                        this.f13133b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                p pVar = this.f13133b;
                                pVar.getClass();
                                pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar.b();
                                break;
                            case 1:
                                p pVar2 = this.f13133b;
                                pVar2.getClass();
                                pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                p pVar3 = this.f13133b;
                                pVar3.getClass();
                                pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                p pVar4 = this.f13133b;
                                pVar4.getClass();
                                pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar4.invalidate();
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.f13792q0);
                this.F0 = overshootInterpolator;
                this.f13806z0.setInterpolator(overshootInterpolator);
                this.f13806z0.setDuration(750L);
                arrayList.add(this.f13806z0);
            } else {
                this.D0 = ValueAnimator.ofFloat(this.W, z11 ? 1.0f : 0.0f);
                this.D0.setInterpolator(new OvershootInterpolator(this.f13794r0));
                this.D0.setDuration(350L);
                this.D0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                    public final p f13133b;

                    {
                        this.f13133b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i13) {
                            case 0:
                                p pVar = this.f13133b;
                                pVar.getClass();
                                pVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar.b();
                                break;
                            case 1:
                                p pVar2 = this.f13133b;
                                pVar2.getClass();
                                pVar2.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                p pVar3 = this.f13133b;
                                pVar3.getClass();
                                pVar3.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                p pVar4 = this.f13133b;
                                pVar4.getClass();
                                pVar4.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                pVar4.invalidate();
                                break;
                        }
                    }
                });
                arrayList.add(this.D0);
            }
            this.G0.playTogether(arrayList);
            this.G0.start();
        }
    }

    public final boolean m() {
        long j10 = UserConfig.getInstance(this.f13780f).clientUserId;
        s6 s6Var = this.f13795s;
        if (s6Var.J(j10)) {
            return true;
        }
        return s6Var.H() && s6Var.f13960g.size() <= 3;
    }

    public final void n() {
        if (this.F == null) {
            lh.w3 w3Var = new lh.w3(getContext(), 1);
            w3Var.h(f(org.telegram.ui.ActionBar.g6.Fi));
            w3Var.q(true);
            w3Var.G = Layout.Alignment.ALIGN_CENTER;
            w3Var.m(0.0f, 29.0f);
            this.F = w3Var;
            SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), org.telegram.ui.ActionBar.g6.Gi, 0, new d(this, 1));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilderReplaceSingleTag.getSpans(0, spannableStringBuilderReplaceSingleTag.length(), ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
                spannableStringBuilderReplaceSingleTag.setSpan(new k41(AndroidUtilities.bold()), spannableStringBuilderReplaceSingleTag.getSpanStart(clickableSpanArr[0]), spannableStringBuilderReplaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
            }
            lh.w3 w3Var2 = this.F;
            w3Var2.h = lh.w3.a(spannableStringBuilderReplaceSingleTag, w3Var2.getTextPaint());
            this.F.t(spannableStringBuilderReplaceSingleTag);
            this.F.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
            if (getParent() instanceof FrameLayout) {
                ((FrameLayout) getParent()).addView(this.F, h7.z5.e(-1, 150, 51));
            }
        }
        lh.w3 w3Var3 = this.F;
        if (w3Var3 != null) {
            if (w3Var3.R) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.F.v();
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 1) {
            d();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q(false, false);
        NotificationCenter.getInstance(this.f13780f).addObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.l lVar = this.H0;
        lVar.f4599a = true;
        AnimatorSet animatorSet = (AnimatorSet) lVar.f4601c;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.T.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f13780f).removeObserver(this, NotificationCenter.storiesUpdated);
        com.google.firebase.messaging.l lVar = this.H0;
        lVar.f4599a = false;
        ((AnimatorSet) lVar.f4601c).cancel();
        i7 i7Var = this.f13789n0;
        if (i7Var != null) {
            i7Var.a();
            this.f13789n0 = null;
        }
        this.T.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.P.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.I = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.K == 2) {
            int size = this.f13804y.size();
            int iDp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            h hVar = this.f13793r;
            int x8 = (int) hVar.getX();
            int y10 = (int) hVar.getY();
            int x10 = (int) (hVar.getX() + iDp);
            int y11 = (int) (hVar.getY() + hVar.getHeight());
            tc tcVar = this.E;
            tcVar.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x8, y10, x10, y11);
            tcVar.f32735i = false;
            tcVar.f32731c = 0;
            tcVar.a(rectF);
            if (tcVar.b(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        c20 c20Var = l7.f13627b;
        if (c20Var != null) {
            c20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
        }
        c20 c20Var2 = l7.f13628c;
        if (c20Var2 != null) {
            c20Var2.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
        }
        c20[] c20VarArr = l7.f13626a;
        c20 c20Var3 = c20VarArr[0];
        if (c20Var3 != null) {
            c20Var3.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
        }
        c20 c20Var4 = c20VarArr[1];
        if (c20Var4 != null) {
            c20Var4.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
        }
        if (l7.d != null) {
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.xj, false);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false);
            l7.d.d(i0.b.d(0.25f, iW0, iW1), iW1, 0, 0);
        }
        final int textColor = getTextColor();
        this.P.setTextColor(getTextLogoColor());
        i iVar = this.Q;
        if (iVar != null) {
            iVar.d();
        }
        this.R.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.h, new d5.d() {
            @Override
            public final void accept(Object obj) {
                o oVar = (o) ((View) obj);
                oVar.invalidate();
                oVar.f13730y.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.f13793r, (d5.d) new j4.w0(3));
    }

    public final void q(boolean z10, boolean z11) {
        ArrayList arrayList;
        if ((this.K == 1 || this.f13785j0 != 0.0f) && !z11) {
            this.G = true;
            return;
        }
        ArrayList arrayList2 = this.v;
        arrayList2.clear();
        ArrayList arrayList3 = this.f13802x;
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = this.f13800w;
        arrayList4.clear();
        ArrayList arrayList5 = this.f13804y;
        arrayList4.addAll(arrayList5);
        arrayList3.clear();
        int i10 = this.f13773b;
        int i11 = this.f13780f;
        if (i10 != 1) {
            arrayList3.add(new m(UserConfig.getInstance(i11).getClientUserId()));
        }
        s6 s6Var = this.f13795s;
        ArrayList arrayList6 = i10 == 1 ? s6Var.h : s6Var.f13960g;
        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList6.get(i12)).peer);
            if (peerDialogId != UserConfig.getInstance(i11).getClientUserId()) {
                arrayList3.add(new m(peerDialogId));
            }
        }
        int size = arrayList3.size();
        if (!s6Var.H()) {
            size--;
        }
        int iMax = Math.max(1, Math.max(s6Var.C(i10 == 1), size));
        this.f13774b0 = null;
        boolean zG = s6Var.G();
        org.telegram.ui.Components.j6 j6Var = this.P;
        if (zG) {
            arrayList = arrayList3;
            if (s6Var.K(UserConfig.getInstance(i11).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.f13779e0 == null) {
                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
                        o9 o9Var = new o9();
                        spannableStringBuilderValueOf.setSpan(o9Var, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
                        o9Var.f13764a = j6Var;
                        o9Var.f13769n = true;
                        this.f13779e0 = spannableStringBuilderValueOf;
                    }
                    this.f13774b0 = this.f13779e0;
                } else {
                    this.f13774b0 = string;
                }
            } else {
                this.f13774b0 = this.f13790o0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
            }
        } else {
            arrayList = arrayList3;
            this.f13774b0 = this.f13790o0 < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", iMax, new Object[0]);
        }
        if (!this.f13776c0) {
            j6Var.c(this.f13774b0, z10 && !LocaleController.isRTL, true);
        }
        this.f13771a.a(!TextUtils.isEmpty(this.f13774b0) || this.f13776c0, z10);
        arrayList5.clear();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((m) arrayList.get(i13)).f13646c != UserConfig.getInstance(i11).clientUserId || m()) {
                arrayList5.add((m) arrayList.get(i13));
                if (arrayList5.size() >= 3) {
                    break;
                }
            }
        }
        h hVar = this.h;
        h hVar2 = this.f13793r;
        if (!z10) {
            hVar.setItemAnimator(null);
            hVar2.setItemAnimator(null);
        } else if (this.K == 2) {
            hVar2.setItemAnimator(this.d);
            hVar.setItemAnimator(null);
        } else {
            hVar.setItemAnimator(this.N);
            hVar2.setItemAnimator(null);
        }
        this.A.E(arrayList2, arrayList);
        this.B.E(arrayList4, arrayList5);
        arrayList2.clear();
        invalidate();
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.m0 = kVar;
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

    public void setMenuItemsOffset(float f10) {
        this.f13790o0 = f10;
    }

    public void setOverscroll(float f10) {
        this.f13785j0 = f10 / AndroidUtilities.dp(90.0f);
        invalidate();
        this.h.invalidate();
    }

    public void setProgressToCollapse(float f10) {
        l(f10, true);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        lh.w3 w3Var = this.F;
        if (w3Var != null) {
            w3Var.setTranslationY(f10);
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
