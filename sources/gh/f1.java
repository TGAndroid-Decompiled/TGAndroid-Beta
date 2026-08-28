package gh;

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
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.q60;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yz;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bq;
import org.telegram.ui.dw;
import org.telegram.ui.e00;
import org.telegram.ui.f10;
import org.telegram.ui.ht;
import org.telegram.ui.jr;
import org.telegram.ui.mx;
import org.telegram.ui.n00;
import org.telegram.ui.o00;
import org.telegram.ui.qn;
public final class f1 extends wk0 {
    public final int T2;
    public final Object U2;

    public f1(Object obj, Context context, int i9) {
        super(context, null);
        this.T2 = i9;
        this.U2 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i9;
        switch (this.T2) {
            case 12:
                ki kiVar = ((pj) this.U2).f27493b;
                int dp = AndroidUtilities.dp(30.0f) + kiVar.X1[0];
                if (!kiVar.f30103c0) {
                    i9 = AndroidUtilities.statusBarHeight;
                } else {
                    i9 = 0;
                }
                if (f10 < dp + i9) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.T2) {
            case 5:
                if (view != ((org.telegram.ui.y6) this.U2).M) {
                    return true;
                }
                return false;
            case 16:
                vz vzVar = (vz) this.U2;
                if (vzVar.isEnabled() && !((dw) vzVar.F).f37619b.f37658f2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.T2) {
            case 0:
                ((l1) this.U2).getClass();
                return true;
            case 10:
                return ((org.telegram.ui.Components.sa) this.U2).t(view, f10, f11);
            case 16:
                if (((vz) this.U2).f34047n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((tz) view).f32848f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((m71) this.U2).f30753n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((k71) view).f30024c;
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
        switch (this.T2) {
            case 24:
                if (getAdapter() != null && ((s51) this.U2).D && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i9) {
        e00 e00Var;
        switch (this.T2) {
            case 1:
                return 0;
            case 20:
                return 0;
            case 26:
                int V = DataSettingsActivity.V((DataSettingsActivity) this.U2);
                org.telegram.ui.ActionBar.b6 b6Var = this.f34260l2;
                if (i9 == V) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, b6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var));
            case 27:
                ArrayList arrayList = ((n00) this.U2).L;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    e00Var = (e00) arrayList.get(i9);
                } else {
                    e00Var = null;
                }
                org.telegram.ui.ActionBar.b6 b6Var2 = this.f34260l2;
                if (e00Var != null && e00Var.f37774l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, b6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var2));
            default:
                return super.W0(i9);
        }
    }

    @Override
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        switch (this.T2) {
            case 25:
                super.addView(view, i9, layoutParams);
                if (((m71) this.U2).R) {
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
                super.addView(view, i9, layoutParams);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ih.u0 u0Var;
        switch (this.T2) {
            case 1:
                ih.h2 h2Var = (ih.h2) this.U2;
                int i9 = -1;
                if (!h2Var.f12275b0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < getChildCount()) {
                            View childAt = getChildAt(i10);
                            if ((childAt instanceof ih.p0) && (u0Var = ((ih.p0) childAt).G) != null) {
                                i9 = u0Var.f12174a;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                if (i9 > h2Var.B) {
                    h2Var.B = i9;
                    ih.a aVar = h2Var.f11496e0.T1;
                    if (aVar != null) {
                        aVar.setCount(h2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                df dfVar = (df) this.U2;
                f1 f1Var = dfVar.f18206c;
                if (f1Var.getLayoutManager() != null && f1Var.getAdapter() != null && f1Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.f18207e = dp - AndroidUtilities.dp(16.0f);
                    kg.d dVar = dfVar.f18210r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), dfVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.g8) this.U2).B = false;
                return;
            case 21:
                mx mxVar = (mx) this.U2;
                f2.m0 m0Var = mxVar.V;
                f2.n nVar = mxVar.T;
                an0 an0Var = mxVar.U;
                if (an0Var != null && nVar != null && m0Var != null && an0Var.f19297i0) {
                    canvas.save();
                    invalidate();
                    int h = an0Var.h() - 1;
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt2 = getChildAt(i11);
                            if (RecyclerView.R(childAt2) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt2.getTranslationY() + childAt2.getBottom());
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (an0Var != null && nVar != null && m0Var != null && an0Var.f19297i0) {
                    canvas.restore();
                }
                if (an0Var != null && an0Var.f19299k0 != null) {
                    canvas.save();
                    canvas.translate(an0Var.f19299k0.getLeft(), an0Var.f19299k0.getTranslationY() + an0Var.f19299k0.getTop());
                    an0Var.f19299k0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((f10) this.U2).Q) {
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        if (T(getChildAt(i12)).f5505f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i12).getX(), (getChildAt(i12).getY() - getChildAt(i12).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i12).draw(canvas);
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
        int i9 = this.T2;
        Object obj = this.U2;
        switch (i9) {
            case 1:
                if (((ih.h2) obj).f12275b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                uj0 uj0Var = (uj0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && uj0Var.getPullingLeftProgress() > 0.95f) {
                        uj0.a(uj0Var);
                    } else if (uj0Var.f33080x0 != 0.0f) {
                        ValueAnimator valueAnimator = uj0Var.f33075u0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(uj0Var.f33080x0, 0.0f);
                        uj0Var.f33075u0 = ofFloat;
                        ofFloat.addUpdateListener(new q60(uj0Var, 6));
                        uj0Var.f33075u0.setDuration(150L);
                        uj0Var.f33075u0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((sm0) obj).f32522f;
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
        switch (this.T2) {
            case 18:
                hg.r0 r0Var = ((uj0) this.U2).f33060h0;
                if (r0Var != null && (view instanceof sj0) && ((sj0) view).f32477e.equals(r0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                cx0 cx0Var = (cx0) this.U2;
                com.google.firebase.messaging.m mVar = cx0Var.f27581h0;
                if ((view instanceof org.telegram.ui.Cells.d8) && cx0Var.N) {
                    int b10 = cx0Var.f27573c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) mVar.d;
                    float f10 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) mVar.f4163e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) mVar.f4164f;
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
            case 28:
                if (getAdapter() == ((f10) this.U2).Q && T(view).f5505f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.T2) {
            case 1:
                super.invalidate();
                ((ih.h2) this.U2).invalidate();
                return;
            case 9:
                super.invalidate();
                View view = ((jr) this.U2).fragmentView;
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
    public void k0(int i9, int i10) {
        boolean z10;
        switch (this.T2) {
            case 14:
                hm hmVar = (hm) this.U2;
                hmVar.invalidate();
                hmVar.f27493b.X1(hmVar, i10);
                gm gmVar = hmVar.v;
                boolean z11 = true;
                int i11 = 0;
                if (gmVar.f28806x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = gmVar.d();
                    if (d.length == gmVar.f28806x.length) {
                        while (true) {
                            if (i11 < d.length) {
                                if (d[i11] == gmVar.f28806x[i11]) {
                                    i11++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    gmVar.f28806x = gmVar.d();
                }
                if (z10) {
                    gmVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.T2) {
            case 7:
                super.onAttachedToWindow();
                of.j1 j1Var = ((qn) this.U2).I3;
                if (j1Var != null) {
                    NotificationCenter.getInstance(j1Var.f19380r).addObserver(j1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.T2) {
            case 7:
                super.onDetachedFromWindow();
                of.j1 j1Var = ((qn) this.U2).I3;
                if (j1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(j1Var.A);
                    NotificationCenter.getInstance(j1Var.f19380r).removeObserver(j1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.T2) {
            case 2:
                ht q10 = ht.q();
                kh.w1 w1Var = (kh.w1) this.U2;
                boolean r10 = q10.r(motionEvent, w1Var.f16228b, w1Var.f16231f, this.f34260l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((bq) this.U2).D) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((yi) this.U2).f27493b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((hm) this.U2).F != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                    ((wy) this.U2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = ht.q().r(motionEvent, ((iu0) this.U2).f29524b, null, this.f34260l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                cx0 cx0Var = (cx0) this.U2;
                if (cx0Var.N) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = ht.q().r(motionEvent, cx0Var.f27573c, cx0Var.f27582i0, this.f34260l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r12) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.T2) {
            case 0:
                l1 l1Var = (l1) this.U2;
                l1Var.s();
                super.onLayout(z10, i9, i10, i11, i12);
                l1Var.P(2);
                return;
            case 10:
                ((org.telegram.ui.Components.sa) this.U2).s();
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 11:
                super.onLayout(z10, i9, i10, i11, i12);
                PhotoViewer.t1().x0();
                return;
            case 13:
                super.onLayout(z10, i9, i10, i11, i12);
                ((xk) this.U2).d0();
                return;
            case 19:
                super.onLayout(z10, i9, i10, i11, i12);
                ((gm0) this.U2).a();
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.T2) {
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i10)));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 8:
                if (((bq) this.U2).D) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((yi) this.U2).f27493b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((hm) this.U2).F != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new o00(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i9, Rect rect) {
        switch (this.T2) {
            case 27:
                return false;
            default:
                return super.requestFocus(i9, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.T2) {
            case 4:
                if (!((org.telegram.ui.m1) this.U2).f40290r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((yz) this.U2).f35115n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((iu0) this.U2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((cx0) this.U2).f27574c0) {
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
        switch (this.T2) {
            case 16:
                super.setAlpha(f10);
                ((vz) this.U2).invalidate();
                return;
            case 25:
                super.setAlpha(f10);
                ((m71) this.U2).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.T2) {
            case 24:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public f1(Object obj, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        this.U2 = obj;
    }

    public f1(wy wyVar, Context context, uy uyVar) {
        super(context, null);
        this.T2 = 15;
        this.U2 = wyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, this.f34260l2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        of.y yVar = new of.y(7);
        yVar.j1(0);
        setLayoutManager(yVar);
        setAdapter(uyVar);
    }
}
