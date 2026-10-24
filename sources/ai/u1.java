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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.lf;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.ym;
import org.telegram.ui.Components.zm;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq;
import org.telegram.ui.dw;
import org.telegram.ui.h00;
import org.telegram.ui.ht;
import org.telegram.ui.i10;
import org.telegram.ui.jr;
import org.telegram.ui.nx;
import org.telegram.ui.sn;
public final class u1 extends lm0 {
    public final int Y2;
    public final Object Z2;

    public u1(Object obj, Context context, int i10) {
        super(context, null);
        this.Y2 = i10;
        this.Z2 = obj;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        int i11;
        switch (this.Y2) {
            case 4:
                ri riVar = ((ig.h0) this.Z2).f27704b;
                int dp = AndroidUtilities.dp(30.0f) + riVar.f30144e2[0];
                if (!riVar.f30149g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 13:
                ri riVar2 = ((vj) this.Z2).f27704b;
                int dp2 = AndroidUtilities.dp(30.0f) + riVar2.f30144e2[0];
                if (!riVar2.f30149g0) {
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
        switch (this.Y2) {
            case 6:
                if (view != ((org.telegram.ui.c7) this.Z2).Q) {
                    return true;
                }
                return false;
            case 17:
                q00 q00Var = (q00) this.Z2;
                if (q00Var.isEnabled() && !((dw) q00Var.J).f36730b.f37062j2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.Y2) {
            case 0:
                ((a2) this.Z2).getClass();
                return true;
            case 11:
                return ((org.telegram.ui.Components.za) this.Z2).u(view, f7, f10);
            case 17:
                if (((q00) this.Z2).f29721n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((o00) view).f29098f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 26:
                if (((k91) this.Z2).f27979n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((i91) view).f27376c;
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
    public boolean T0() {
        switch (this.Y2) {
            case 25:
                if (getAdapter() != null && ((r71) this.Z2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.T0();
        }
    }

    @Override
    public Integer X0(int i10) {
        h00 h00Var;
        switch (this.Y2) {
            case 1:
                return 0;
            case 21:
                return 0;
            case 27:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.Z2);
                org.telegram.ui.ActionBar.g6 g6Var = this.f28396n2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21405p7, g6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var));
            case 28:
                ArrayList arrayList = ((org.telegram.ui.q00) this.Z2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    h00Var = (h00) arrayList.get(i10);
                } else {
                    h00Var = null;
                }
                org.telegram.ui.ActionBar.g6 g6Var2 = this.f28396n2;
                if (h00Var != null && h00Var.f37706l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21405p7, g6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var2));
            default:
                return super.X0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.Y2) {
            case 26:
                super.addView(view, i10, layoutParams);
                if (((k91) this.Z2).V) {
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
        switch (this.Y2) {
            case 1:
                ci.m2 m2Var = (ci.m2) this.Z2;
                int i10 = -1;
                if (!m2Var.f6088f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof ci.q0) && (v0Var = ((ci.q0) childAt).K) != null) {
                                i10 = v0Var.f6001a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > m2Var.F) {
                    m2Var.F = i10;
                    ci.a aVar = m2Var.f5535i0.X1;
                    if (aVar != null) {
                        aVar.setCount(m2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                lf lfVar = (lf) this.Z2;
                u1 u1Var = lfVar.f11561c;
                if (u1Var.getLayoutManager() != null && u1Var.getAdapter() != null && u1Var.getAdapter().h() != 0) {
                    float dp = lfVar.h - AndroidUtilities.dp(8.0f);
                    lfVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = lfVar.f11564r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), lfVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.k8) this.Z2).F = false;
                return;
            case 22:
                nx nxVar = (nx) this.Z2;
                s4.b0 b0Var = nxVar.f33304c0;
                s4.k kVar = nxVar.f33302a0;
                ro0 ro0Var = nxVar.f33303b0;
                if (ro0Var != null && kVar != null && b0Var != null && ro0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = ro0Var.h() - 1;
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
                if (ro0Var != null && kVar != null && b0Var != null && ro0Var.m0) {
                    canvas.restore();
                }
                if (ro0Var != null && ro0Var.f11915o0 != null) {
                    canvas.save();
                    canvas.translate(ro0Var.f11915o0.getLeft(), ro0Var.f11915o0.getTranslationY() + ro0Var.f11915o0.getTop());
                    ro0Var.f11915o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                if (getAdapter() == ((i10) this.Z2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f46345f == 1) {
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
        int i10 = this.Y2;
        Object obj = this.Z2;
        switch (i10) {
            case 1:
                if (((ci.m2) obj).f6088f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                fl0 fl0Var = (fl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && fl0Var.getPullingLeftProgress() > 0.95f) {
                        fl0.a(fl0Var);
                    } else if (fl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = fl0Var.f26390y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fl0Var.B0, 0.0f);
                        fl0Var.f26390y0 = ofFloat;
                        ofFloat.addUpdateListener(new b80(fl0Var, 7));
                        fl0Var.f26390y0.setDuration(150L);
                        fl0Var.f26390y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 21:
                LinearLayout linearLayout = ((io0) obj).f27455f;
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
        switch (this.Y2) {
            case 19:
                ah.i1 i1Var = ((fl0) this.Z2).f26372l0;
                if (i1Var != null && (view instanceof dl0) && ((dl0) view).e.equals(i1Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                sy0 sy0Var = (sy0) this.Z2;
                com.google.firebase.messaging.l lVar = sy0Var.f30648l0;
                if ((view instanceof org.telegram.ui.Cells.e8) && sy0Var.R) {
                    int b10 = sy0Var.f30637c.T(view).b();
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
                    ArrayList arrayList3 = (ArrayList) lVar.f7660f;
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
                if (getAdapter() == ((i10) this.Z2).U && T(view).f46345f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.Y2) {
            case 1:
                super.invalidate();
                ((ci.m2) this.Z2).invalidate();
                return;
            case 10:
                super.invalidate();
                View view = ((jr) this.Z2).fragmentView;
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
        switch (this.Y2) {
            case 4:
                return;
            case 15:
                zm zmVar = (zm) this.Z2;
                zmVar.invalidate();
                zmVar.f27704b.f2(zmVar, i11);
                ym ymVar = zmVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (ymVar.f32986x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = ymVar.d();
                    if (d.length == ymVar.f32986x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == ymVar.f32986x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    ymVar.f32986x = ymVar.d();
                }
                if (z10) {
                    ymVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.Y2) {
            case 8:
                super.onAttachedToWindow();
                hg.n1 n1Var = ((sn) this.Z2).Y3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.f12021r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.Y2) {
            case 8:
                super.onDetachedFromWindow();
                hg.n1 n1Var = ((sn) this.Z2).Y3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.f12021r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.Y2) {
            case 2:
                ht o10 = ht.o();
                ei.v1 v1Var = (ei.v1) this.Z2;
                boolean p5 = o10.p(motionEvent, v1Var.f9944b, v1Var.f9946f, this.f28396n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
                    return false;
                }
                return true;
            case 9:
                if (((dq) this.Z2).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((gj) this.Z2).f27704b.f30144e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                if (((zm) this.Z2).J != null) {
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
                    ((rz) this.Z2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                boolean p9 = ht.o().p(motionEvent, ((aw0) this.Z2).f24826b, null, this.f28396n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p9) {
                    return false;
                }
                return true;
            case 24:
                sy0 sy0Var = (sy0) this.Z2;
                if (sy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean p10 = ht.o().p(motionEvent, sy0Var.f30637c, sy0Var.m0, this.f28396n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.Y2) {
            case 0:
                a2 a2Var = (a2) this.Z2;
                a2Var.t();
                super.onLayout(z10, i10, i11, i12, i13);
                a2Var.R(2);
                return;
            case 11:
                ((org.telegram.ui.Components.za) this.Z2).t();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.u1().z0();
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                ((pl) this.Z2).h0();
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((wn0) this.Z2).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.Y2) {
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
        switch (this.Y2) {
            case 9:
                if (((dq) this.Z2).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((gj) this.Z2).f27704b.f30144e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 15:
                if (((zm) this.Z2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.Y2) {
            case 28:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.Y2) {
            case 5:
                if (!((org.telegram.ui.l1) this.Z2).f39088r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 18:
                if (!((t00) this.Z2).f30676r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((aw0) this.Z2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 24:
                if (!((sy0) this.Z2).f30643g0) {
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
        switch (this.Y2) {
            case 17:
                super.setAlpha(f7);
                ((q00) this.Z2).invalidate();
                return;
            case 26:
                super.setAlpha(f7);
                ((k91) this.Z2).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.Y2) {
            case 25:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public u1(Object obj, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = obj;
    }

    public u1(rz rzVar, Context context, pz pzVar) {
        super(context, null);
        this.Y2 = 16;
        this.Z2 = rzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.f21273i6, this.f28396n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(pzVar);
    }

    private final void C1(int i10, int i11) {
    }
}
