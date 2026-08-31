package mh;

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
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.b10;
import org.telegram.ui.c10;
import org.telegram.ui.kq;
import org.telegram.ui.n60;
import org.telegram.ui.pw;
import org.telegram.ui.qr;
import org.telegram.ui.qt;
import org.telegram.ui.s00;
import org.telegram.ui.t10;
import org.telegram.ui.xn;
import org.telegram.ui.yx;
public final class d1 extends tl0 {
    public final int U2;
    public final Object V2;

    public d1(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i10;
        switch (this.U2) {
            case 10:
                mi miVar = ((sj) this.V2).f26546b;
                int dp = AndroidUtilities.dp(30.0f) + miVar.Y1[0];
                if (!miVar.f29043d0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f10 < dp + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.U2) {
            case 3:
                if (view != ((org.telegram.ui.b7) this.V2).N) {
                    return true;
                }
                return false;
            case 14:
                l00 l00Var = (l00) this.V2;
                if (l00Var.isEnabled() && !((pw) l00Var.G).f40168b.f40214g2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.U2) {
            case 0:
                ((i1) this.V2).getClass();
                return true;
            case 8:
                return ((org.telegram.ui.Components.sa) this.V2).t(view, f10, f11);
            case 14:
                if (((l00) this.V2).f28503n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((j00) view).f27951f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 23:
                if (((l81) this.V2).f28664n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((j81) view).f28076c;
                    float f13 = dp2;
                    if (rectF2.left - f13 < f10 && rectF2.right + f13 > f10) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f10, f11);
        }
    }

    @Override
    public boolean S0() {
        switch (this.U2) {
            case 22:
                if (getAdapter() != null && ((s61) this.V2).E && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        s00 s00Var;
        int i11;
        switch (this.U2) {
            case 1:
                return 0;
            case 18:
                return 0;
            case 24:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.V2);
                org.telegram.ui.ActionBar.g6 g6Var = this.f31383m2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21876p7, g6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var));
            case 25:
                ArrayList arrayList = ((b10) this.V2).M;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    s00Var = (s00) arrayList.get(i10);
                } else {
                    s00Var = null;
                }
                org.telegram.ui.ActionBar.g6 g6Var2 = this.f31383m2;
                if (s00Var != null && s00Var.f41092l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21876p7, g6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var2));
            case 29:
                i11 = ((SessionsActivity) this.V2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.g6 g6Var3 = this.f31383m2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21876p7, g6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var3));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.U2) {
            case 23:
                super.addView(view, i10, layoutParams);
                if (((l81) this.V2).S) {
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
        oh.t0 t0Var;
        switch (this.U2) {
            case 1:
                oh.h2 h2Var = (oh.h2) this.V2;
                int i10 = -1;
                if (!h2Var.f17832c0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof oh.o0) && (t0Var = ((oh.o0) childAt).H) != null) {
                                i10 = t0Var.f17755a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > h2Var.C) {
                    h2Var.C = i10;
                    oh.a aVar = h2Var.f17175f0.U1;
                    if (aVar != null) {
                        aVar.setCount(h2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.j8) this.V2).C = false;
                return;
            case 19:
                yx yxVar = (yx) this.V2;
                f2.j0 j0Var = yxVar.W;
                f2.l lVar = yxVar.U;
                xn0 xn0Var = yxVar.V;
                if (xn0Var != null && lVar != null && j0Var != null && xn0Var.f48763j0) {
                    canvas.save();
                    invalidate();
                    int h = xn0Var.h() - 1;
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
                if (xn0Var != null && lVar != null && j0Var != null && xn0Var.f48763j0) {
                    canvas.restore();
                }
                if (xn0Var != null && xn0Var.f48765l0 != null) {
                    canvas.save();
                    canvas.translate(xn0Var.f48765l0.getLeft(), xn0Var.f48765l0.getTranslationY() + xn0Var.f48765l0.getTop());
                    xn0Var.f48765l0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                if (getAdapter() == ((t10) this.V2).R) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f5879f == 1) {
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
            case 28:
                super.dispatchDraw(canvas);
                n60 n60Var = (n60) this.V2;
                if (n60Var.f39315w0 != null && n60Var.f39316x0 >= 1.0f) {
                    canvas.save();
                    canvas.translate(0.0f, -(n60Var.f39315w0.getMeasuredHeight() - n60.f1(n60Var).getMeasuredHeight()));
                    n60Var.f39315w0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.U2;
        Object obj = this.V2;
        switch (i10) {
            case 1:
                if (((oh.h2) obj).f17832c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                rk0 rk0Var = (rk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && rk0Var.getPullingLeftProgress() > 0.95f) {
                        rk0.a(rk0Var);
                    } else if (rk0Var.f30793y0 != 0.0f) {
                        ValueAnimator valueAnimator = rk0Var.f30787v0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(rk0Var.f30793y0, 0.0f);
                        rk0Var.f30787v0 = ofFloat;
                        ofFloat.addUpdateListener(new k70(rk0Var, 6));
                        rk0Var.f30787v0.setDuration(150L);
                        rk0Var.f30787v0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                LinearLayout linearLayout = ((pn0) obj).f30132f;
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
        switch (this.U2) {
            case 16:
                ng.q0 q0Var = ((rk0) this.V2).f30772i0;
                if (q0Var != null && (view instanceof pk0) && ((pk0) view).f30101e.equals(q0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 21:
                yx0 yx0Var = (yx0) this.V2;
                a9.a aVar = yx0Var.f33626i0;
                if ((view instanceof org.telegram.ui.Cells.d8) && yx0Var.O) {
                    int b10 = yx0Var.f33617c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) aVar.d;
                    float f10 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) aVar.f158e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) aVar.f159f;
                    if (!arrayList3.isEmpty()) {
                        f10 = ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.translate(floatValue2, f10);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 26:
                if (getAdapter() == ((t10) this.V2).R && T(view).f5879f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.U2) {
            case 1:
                super.invalidate();
                ((oh.h2) this.V2).invalidate();
                return;
            case 7:
                super.invalidate();
                View view = ((qr) this.V2).fragmentView;
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
        boolean z4;
        switch (this.U2) {
            case 12:
                qm qmVar = (qm) this.V2;
                qmVar.invalidate();
                qmVar.f26546b.X1(qmVar, i11);
                pm pmVar = qmVar.v;
                boolean z10 = true;
                int i12 = 0;
                if (pmVar.f30123x == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    boolean[] d = pmVar.d();
                    if (d.length == pmVar.f30123x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == pmVar.f30123x[i12]) {
                                    i12++;
                                }
                            } else {
                                z10 = z4;
                            }
                        }
                    }
                    z4 = z10;
                } else {
                    pmVar.f30123x = pmVar.d();
                }
                if (z4) {
                    pmVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.U2) {
            case 5:
                super.onAttachedToWindow();
                uf.y0 y0Var = ((xn) this.V2).J3;
                if (y0Var != null) {
                    NotificationCenter.getInstance(y0Var.f48746r).addObserver(y0Var, NotificationCenter.storiesListUpdated);
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
        switch (this.U2) {
            case 5:
                super.onDetachedFromWindow();
                uf.y0 y0Var = ((xn) this.V2).J3;
                if (y0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y0Var.B);
                    NotificationCenter.getInstance(y0Var.f48746r).removeObserver(y0Var, NotificationCenter.storiesListUpdated);
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
        boolean z4;
        switch (this.U2) {
            case 6:
                if (((kq) this.V2).E) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((bj) this.V2).f26546b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (((qm) this.V2).G != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z4);
                    ((mz) this.V2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                boolean r10 = qt.q().r(motionEvent, ((dv0) this.V2).f26324b, null, this.f31383m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 21:
                yx0 yx0Var = (yx0) this.V2;
                if (yx0Var.O) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r11 = qt.q().r(motionEvent, yx0Var.f33617c, yx0Var.f33627j0, this.f31383m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.U2) {
            case 0:
                i1 i1Var = (i1) this.V2;
                i1Var.s();
                super.onLayout(z4, i10, i11, i12, i13);
                i1Var.Q(2);
                return;
            case 8:
                ((org.telegram.ui.Components.sa) this.V2).s();
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 11:
                super.onLayout(z4, i10, i11, i12, i13);
                ((cl) this.V2).e0();
                return;
            case 17:
                super.onLayout(z4, i10, i11, i12, i13);
                ((en0) this.V2).a();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.U2) {
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
        switch (this.U2) {
            case 6:
                if (((kq) this.V2).E) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((bj) this.V2).f26546b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (((qm) this.V2).G != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 27:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new c10(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.U2) {
            case 25:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.U2) {
            case 2:
                if (!((org.telegram.ui.l1) this.V2).f38553r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 15:
                if (!((o00) this.V2).f29642n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((dv0) this.V2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((yx0) this.V2).f33619d0) {
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
    public void setAlpha(float f10) {
        switch (this.U2) {
            case 14:
                super.setAlpha(f10);
                ((l00) this.V2).invalidate();
                return;
            case 23:
                super.setAlpha(f10);
                ((l81) this.V2).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.U2) {
            case 22:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public d1(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.U2 = i10;
        this.V2 = obj;
    }

    public d1(mz mzVar, Context context, kz kzVar) {
        super(context, null);
        this.U2 = 13;
        this.V2 = mzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, this.f31383m2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(6);
        kVar.j1(0);
        setLayoutManager(kVar);
        setAdapter(kzVar);
    }
}
