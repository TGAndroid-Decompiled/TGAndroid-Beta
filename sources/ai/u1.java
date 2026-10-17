package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.z81;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq;
import org.telegram.ui.dw;
import org.telegram.ui.g00;
import org.telegram.ui.g10;
import org.telegram.ui.gt;
import org.telegram.ui.jr;
import org.telegram.ui.nx;
import org.telegram.ui.p00;
import org.telegram.ui.sn;
public final class u1 extends im0 {
    public final int V2;
    public final Object W2;

    public u1(Object obj, Context context, int i10) {
        super(context, null);
        this.V2 = i10;
        this.W2 = obj;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        int i11;
        switch (this.V2) {
            case 4:
                ti tiVar = ((ig.i0) this.W2).f28238b;
                int dp = AndroidUtilities.dp(30.0f) + tiVar.f30572e2[0];
                if (!tiVar.f30577g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 13:
                ti tiVar2 = ((xj) this.W2).f28238b;
                int dp2 = AndroidUtilities.dp(30.0f) + tiVar2.f30572e2[0];
                if (!tiVar2.f30577g0) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                if (f7 < dp2 + i11) {
                    return false;
                }
                return true;
            default:
                return super.E0(f7);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.V2) {
            case 6:
                if (view != ((org.telegram.ui.c7) this.W2).Q) {
                    return true;
                }
                return false;
            case 17:
                s00 s00Var = (s00) this.W2;
                if (s00Var.isEnabled() && !((dw) s00Var.J).f36326b.f36658j2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.V2) {
            case 0:
                ((a2) this.W2).getClass();
                return true;
            case 11:
                return ((org.telegram.ui.Components.bb) this.W2).v(view, f7, f10);
            case 17:
                if (((s00) this.W2).f30107n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((q00) view).f29492f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 26:
                if (((b91) this.W2).f24861n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((z81) view).f32863c;
                    float f12 = dp2;
                    if (rectF2.left - f12 < f7 && rectF2.right + f12 > f7) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override
    public boolean S0() {
        switch (this.V2) {
            case 25:
                if (getAdapter() != null && ((j71) this.W2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        g00 g00Var;
        switch (this.V2) {
            case 1:
                return 0;
            case 21:
                return 0;
            case 27:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.W2);
                org.telegram.ui.ActionBar.d6 d6Var = this.f27284n2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21207p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var));
            case 28:
                ArrayList arrayList = ((p00) this.W2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    g00Var = (g00) arrayList.get(i10);
                } else {
                    g00Var = null;
                }
                org.telegram.ui.ActionBar.d6 d6Var2 = this.f27284n2;
                if (g00Var != null && g00Var.f37072l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21207p7, d6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, d6Var2));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.V2) {
            case 26:
                super.addView(view, i10, layoutParams);
                if (((b91) this.W2).V) {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                    return;
                }
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setAlpha(1.0f);
                return;
            default:
                super.addView(view, i10, layoutParams);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ci.v0 v0Var;
        switch (this.V2) {
            case 1:
                ci.n2 n2Var = (ci.n2) this.W2;
                int i10 = -1;
                if (!n2Var.f6140f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof ci.q0) && (v0Var = ((ci.q0) childAt).K) != null) {
                                i10 = v0Var.f6066a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > n2Var.F) {
                    n2Var.F = i10;
                    ci.a aVar = n2Var.f5631i0.X1;
                    if (aVar != null) {
                        aVar.setCount(n2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                nf nfVar = (nf) this.W2;
                u1 u1Var = nfVar.f11535c;
                if (u1Var.getLayoutManager() != null && u1Var.getAdapter() != null && u1Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = nfVar.f11538r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), nfVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.k8) this.W2).F = false;
                return;
            case 22:
                nx nxVar = (nx) this.W2;
                s4.b0 b0Var = nxVar.f31341c0;
                s4.k kVar = nxVar.f31339a0;
                oo0 oo0Var = nxVar.f31340b0;
                if (oo0Var != null && kVar != null && b0Var != null && oo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = oo0Var.h() - 1;
                    int i12 = 0;
                    while (true) {
                        if (i12 < getChildCount()) {
                            View childAt2 = getChildAt(i12);
                            if (RecyclerView.R(childAt2) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt2.getTranslationY() + childAt2.getBottom());
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (oo0Var != null && kVar != null && b0Var != null && oo0Var.m0) {
                    canvas.restore();
                }
                if (oo0Var != null && oo0Var.f11889o0 != null) {
                    canvas.save();
                    canvas.translate(oo0Var.f11889o0.getLeft(), oo0Var.f11889o0.getTranslationY() + oo0Var.f11889o0.getTop());
                    oo0Var.f11889o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                if (getAdapter() == ((g10) this.W2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f45941f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i13).getX(), (getChildAt(i13).getY() - getChildAt(i13).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i13).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.V2;
        Object obj = this.W2;
        switch (i10) {
            case 1:
                if (((ci.n2) obj).f6140f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                cl0 cl0Var = (cl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && cl0Var.getPullingLeftProgress() > 0.95f) {
                        cl0.a(cl0Var);
                    } else if (cl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = cl0Var.f25300y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(cl0Var.B0, 0.0f);
                        cl0Var.f25300y0 = ofFloat;
                        ofFloat.addUpdateListener(new b80(cl0Var, 7));
                        cl0Var.f25300y0.setDuration(150L);
                        cl0Var.f25300y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 21:
                LinearLayout linearLayout = ((fo0) obj).f26323f;
                if (linearLayout != null && linearLayout.getAlpha() > 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        float floatValue;
        float floatValue2;
        switch (this.V2) {
            case 19:
                ah.i1 i1Var = ((cl0) this.W2).f25282l0;
                if (i1Var != null && (view instanceof al0) && ((al0) view).e.equals(i1Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                oy0 oy0Var = (oy0) this.W2;
                com.google.firebase.messaging.l lVar = oy0Var.f29094l0;
                if ((view instanceof org.telegram.ui.Cells.e8) && oy0Var.R) {
                    int b10 = oy0Var.f29083c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) lVar.d;
                    float f7 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) lVar.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) lVar.f7650f;
                    if (!arrayList3.isEmpty()) {
                        f7 = ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.translate(floatValue2, f7);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 29:
                if (getAdapter() == ((g10) this.W2).U && T(view).f45941f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.V2) {
            case 1:
                super.invalidate();
                ((ci.n2) this.W2).invalidate();
                return;
            case 10:
                super.invalidate();
                View view = ((jr) this.W2).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void k0(int i10, int i11) {
        boolean z10;
        switch (this.V2) {
            case 4:
                return;
            case 15:
                bn bnVar = (bn) this.W2;
                bnVar.invalidate();
                bnVar.f28238b.b2(bnVar, i11);
                an anVar = bnVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (anVar.f24673x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = anVar.d();
                    if (d.length == anVar.f24673x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == anVar.f24673x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    anVar.f24673x = anVar.d();
                }
                if (z10) {
                    anVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.V2) {
            case 8:
                super.onAttachedToWindow();
                hg.n1 n1Var = ((sn) this.W2).M3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.f11995r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.V2) {
            case 8:
                super.onDetachedFromWindow();
                hg.n1 n1Var = ((sn) this.W2).M3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.f11995r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        switch (this.V2) {
            case 2:
                gt q6 = gt.q();
                ei.v1 v1Var = (ei.v1) this.W2;
                boolean r10 = q6.r(motionEvent, v1Var.f9928b, v1Var.f9930f, this.f27284n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 9:
                if (((dq) this.W2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.W2).f28238b.f30572e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                if (((bn) this.W2).J != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 16:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                    ((tz) this.W2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                boolean r11 = gt.q().r(motionEvent, ((wv0) this.W2).f32222b, null, this.f27284n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 24:
                oy0 oy0Var = (oy0) this.W2;
                if (oy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = gt.q().r(motionEvent, oy0Var.f29083c, oy0Var.m0, this.f27284n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r12) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.V2) {
            case 0:
                a2 a2Var = (a2) this.W2;
                a2Var.t();
                super.onLayout(z10, i10, i11, i12, i13);
                a2Var.R(2);
                return;
            case 11:
                ((org.telegram.ui.Components.bb) this.W2).t();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                ((rl) this.W2).h0();
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((tn0) this.W2).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.V2) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V2) {
            case 9:
                if (((dq) this.W2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.W2).f28238b.f30572e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 15:
                if (((bn) this.W2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.V2) {
            case 28:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.V2) {
            case 5:
                if (!((org.telegram.ui.m1) this.W2).f38977r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 18:
                if (!((v00) this.W2).f31124n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((wv0) this.W2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 24:
                if (!((oy0) this.W2).f29089g0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.V2) {
            case 17:
                super.setAlpha(f7);
                ((s00) this.W2).invalidate();
                return;
            case 26:
                super.setAlpha(f7);
                ((b91) this.W2).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.V2) {
            case 25:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public u1(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = obj;
    }

    public u1(tz tzVar, Context context, rz rzVar) {
        super(context, null);
        this.V2 = 16;
        this.W2 = tzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, this.f27284n2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(rzVar);
    }

    private final void x1(int i10, int i11) {
    }
}
