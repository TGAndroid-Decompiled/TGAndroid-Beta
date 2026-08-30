package lh;

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
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.b10;
import org.telegram.ui.c10;
import org.telegram.ui.jq;
import org.telegram.ui.m60;
import org.telegram.ui.ow;
import org.telegram.ui.pr;
import org.telegram.ui.pt;
import org.telegram.ui.s00;
import org.telegram.ui.t10;
import org.telegram.ui.xn;
import org.telegram.ui.xx;
public final class e1 extends sl0 {
    public final int U2;
    public final Object V2;

    public e1(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i10;
        switch (this.U2) {
            case 10:
                li liVar = ((qj) this.V2).f24278b;
                int dp = AndroidUtilities.dp(30.0f) + liVar.Y1[0];
                if (!liVar.f26692d0) {
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
                j00 j00Var = (j00) this.V2;
                if (j00Var.isEnabled() && !((ow) j00Var.G).f36989b.f37037g2) {
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
                ((j1) this.V2).getClass();
                return true;
            case 8:
                return ((org.telegram.ui.Components.sa) this.V2).t(view, f10, f11);
            case 14:
                if (((j00) this.V2).f25830n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((h00) view).f25292f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 23:
                if (((k81) this.V2).f26222n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((i81) view).f25624c;
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
                if (getAdapter() != null && ((q61) this.V2).E && getAdapter().h() <= 2) {
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
                org.telegram.ui.ActionBar.f6 f6Var = this.f28750m2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var));
            case 25:
                ArrayList arrayList = ((b10) this.V2).M;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    s00Var = (s00) arrayList.get(i10);
                } else {
                    s00Var = null;
                }
                org.telegram.ui.ActionBar.f6 f6Var2 = this.f28750m2;
                if (s00Var != null && s00Var.f38163l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var2));
            case 29:
                i11 = ((SessionsActivity) this.V2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.f6 f6Var3 = this.f28750m2;
                if (i10 == i11) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var3)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var3));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.U2) {
            case 23:
                super.addView(view, i10, layoutParams);
                if (((k81) this.V2).S) {
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
        nh.t0 t0Var;
        switch (this.U2) {
            case 1:
                nh.g2 g2Var = (nh.g2) this.V2;
                int i10 = -1;
                if (!g2Var.f15974c0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof nh.o0) && (t0Var = ((nh.o0) childAt).H) != null) {
                                i10 = t0Var.f15896a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > g2Var.C) {
                    g2Var.C = i10;
                    nh.a aVar = g2Var.f15346f0.U1;
                    if (aVar != null) {
                        aVar.setCount(g2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.j8) this.V2).C = false;
                return;
            case 19:
                xx xxVar = (xx) this.V2;
                f2.i0 i0Var = xxVar.W;
                f2.l lVar = xxVar.U;
                wn0 wn0Var = xxVar.V;
                if (wn0Var != null && lVar != null && i0Var != null && wn0Var.f44902j0) {
                    canvas.save();
                    invalidate();
                    int h = wn0Var.h() - 1;
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
                if (wn0Var != null && lVar != null && i0Var != null && wn0Var.f44902j0) {
                    canvas.restore();
                }
                if (wn0Var != null && wn0Var.f44904l0 != null) {
                    canvas.save();
                    canvas.translate(wn0Var.f44904l0.getLeft(), wn0Var.f44904l0.getTranslationY() + wn0Var.f44904l0.getTop());
                    wn0Var.f44904l0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                if (getAdapter() == ((t10) this.V2).R) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f5788f == 1) {
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
                m60 m60Var = (m60) this.V2;
                if (m60Var.f36199w0 != null && m60Var.f36200x0 >= 1.0f) {
                    canvas.save();
                    canvas.translate(0.0f, -(m60Var.f36199w0.getMeasuredHeight() - m60.f1(m60Var).getMeasuredHeight()));
                    m60Var.f36199w0.draw(canvas);
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
                if (((nh.g2) obj).f15974c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                pk0 pk0Var = (pk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && pk0Var.getPullingLeftProgress() > 0.95f) {
                        pk0.a(pk0Var);
                    } else if (pk0Var.f27925y0 != 0.0f) {
                        ValueAnimator valueAnimator = pk0Var.f27919v0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(pk0Var.f27925y0, 0.0f);
                        pk0Var.f27919v0 = ofFloat;
                        ofFloat.addUpdateListener(new i70(pk0Var, 6));
                        pk0Var.f27919v0.setDuration(150L);
                        pk0Var.f27919v0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                LinearLayout linearLayout = ((on0) obj).f27603f;
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
                mg.q0 q0Var = ((pk0) this.V2).f27904i0;
                if (q0Var != null && (view instanceof nk0) && ((nk0) view).e.equals(q0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 21:
                xx0 xx0Var = (xx0) this.V2;
                a9.a aVar = xx0Var.f30778i0;
                if ((view instanceof org.telegram.ui.Cells.d8) && xx0Var.O) {
                    int b10 = xx0Var.f30770c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) aVar.d;
                    float f10 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) aVar.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) aVar.f146f;
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
                if (getAdapter() == ((t10) this.V2).R && T(view).f5788f == 1) {
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
                ((nh.g2) this.V2).invalidate();
                return;
            case 7:
                super.invalidate();
                View view = ((pr) this.V2).fragmentView;
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
                om omVar = (om) this.V2;
                omVar.invalidate();
                omVar.f24278b.X1(omVar, i11);
                nm nmVar = omVar.v;
                boolean z10 = true;
                int i12 = 0;
                if (nmVar.f27322x == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    boolean[] d = nmVar.d();
                    if (d.length == nmVar.f27322x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == nmVar.f27322x[i12]) {
                                    i12++;
                                }
                            } else {
                                z10 = z4;
                            }
                        }
                    }
                    z4 = z10;
                } else {
                    nmVar.f27322x = nmVar.d();
                }
                if (z4) {
                    nmVar.invalidate();
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
                tf.y0 y0Var = ((xn) this.V2).J3;
                if (y0Var != null) {
                    NotificationCenter.getInstance(y0Var.f44886r).addObserver(y0Var, NotificationCenter.storiesListUpdated);
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
                tf.y0 y0Var = ((xn) this.V2).J3;
                if (y0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y0Var.B);
                    NotificationCenter.getInstance(y0Var.f44886r).removeObserver(y0Var, NotificationCenter.storiesListUpdated);
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
                if (((jq) this.V2).E) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((zi) this.V2).f24278b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (((om) this.V2).G != null) {
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
                    ((kz) this.V2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                boolean r10 = pt.q().r(motionEvent, ((cv0) this.V2).f24062b, null, this.f28750m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 21:
                xx0 xx0Var = (xx0) this.V2;
                if (xx0Var.O) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r11 = pt.q().r(motionEvent, xx0Var.f30770c, xx0Var.f30779j0, this.f28750m2);
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
                j1 j1Var = (j1) this.V2;
                j1Var.s();
                super.onLayout(z4, i10, i11, i12, i13);
                j1Var.Q(2);
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
                ((al) this.V2).e0();
                return;
            case 17:
                super.onLayout(z4, i10, i11, i12, i13);
                ((dn0) this.V2).a();
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
                if (((jq) this.V2).E) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((zi) this.V2).f24278b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (((om) this.V2).G != null) {
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
                if (!((org.telegram.ui.l1) this.V2).f35868r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 15:
                if (!((n00) this.V2).f27151n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((cv0) this.V2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((xx0) this.V2).f30772d0) {
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
                ((j00) this.V2).invalidate();
                return;
            case 23:
                super.setAlpha(f10);
                ((k81) this.V2).invalidate();
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

    public e1(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.U2 = i10;
        this.V2 = obj;
    }

    public e1(kz kzVar, Context context, iz izVar) {
        super(context, null);
        this.U2 = 13;
        this.V2 = kzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, this.f28750m2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(6);
        kVar.j1(0);
        setLayoutManager(kVar);
        setAdapter(izVar);
    }
}
