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
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xn0;
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
public final class u1 extends mm0 {
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
                ti tiVar = ((ig.h0) this.Z2).f28366b;
                int dp = AndroidUtilities.dp(30.0f) + tiVar.f30728e2[0];
                if (!tiVar.f30733g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 13:
                ti tiVar2 = ((xj) this.Z2).f28366b;
                int dp2 = AndroidUtilities.dp(30.0f) + tiVar2.f30728e2[0];
                if (!tiVar2.f30733g0) {
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
                s00 s00Var = (s00) this.Z2;
                if (s00Var.isEnabled() && !((dw) s00Var.J).f36743b.f37087j2) {
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
                return ((org.telegram.ui.Components.bb) this.Z2).u(view, f7, f10);
            case 17:
                if (((s00) this.Z2).f30320n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((q00) view).f29726f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 26:
                if (((k91) this.Z2).f27976n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((i91) view).f27253c;
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
                if (getAdapter() != null && ((s71) this.Z2).H && getAdapter().h() <= 2) {
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
                org.telegram.ui.ActionBar.g6 g6Var = this.f28705n2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21404p7, g6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i6, g6Var));
            case 28:
                ArrayList arrayList = ((org.telegram.ui.q00) this.Z2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    h00Var = (h00) arrayList.get(i10);
                } else {
                    h00Var = null;
                }
                org.telegram.ui.ActionBar.g6 g6Var2 = this.f28705n2;
                if (h00Var != null && h00Var.f37703l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21404p7, g6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i6, g6Var2));
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
                nf nfVar = (nf) this.Z2;
                u1 u1Var = nfVar.f11561c;
                if (u1Var.getLayoutManager() != null && u1Var.getAdapter() != null && u1Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = nfVar.f11564r;
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
                ((org.telegram.ui.k8) this.Z2).F = false;
                return;
            case 22:
                nx nxVar = (nx) this.Z2;
                s4.b0 b0Var = nxVar.f24800c0;
                s4.k kVar = nxVar.f24798a0;
                so0 so0Var = nxVar.f24799b0;
                if (so0Var != null && kVar != null && b0Var != null && so0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = so0Var.h() - 1;
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
                if (so0Var != null && kVar != null && b0Var != null && so0Var.m0) {
                    canvas.restore();
                }
                if (so0Var != null && so0Var.f11915o0 != null) {
                    canvas.save();
                    canvas.translate(so0Var.f11915o0.getLeft(), so0Var.f11915o0.getTranslationY() + so0Var.f11915o0.getTop());
                    so0Var.f11915o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                if (getAdapter() == ((i10) this.Z2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f46346f == 1) {
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
                gl0 gl0Var = (gl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && gl0Var.getPullingLeftProgress() > 0.95f) {
                        gl0.a(gl0Var);
                    } else if (gl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = gl0Var.f26672y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl0Var.B0, 0.0f);
                        gl0Var.f26672y0 = ofFloat;
                        ofFloat.addUpdateListener(new d80(gl0Var, 7));
                        gl0Var.f26672y0.setDuration(150L);
                        gl0Var.f26672y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 21:
                LinearLayout linearLayout = ((jo0) obj).f27725f;
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
                ah.i1 i1Var = ((gl0) this.Z2).f26654l0;
                if (i1Var != null && (view instanceof el0) && ((el0) view).e.equals(i1Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                ty0 ty0Var = (ty0) this.Z2;
                com.google.firebase.messaging.l lVar = ty0Var.f30941l0;
                if ((view instanceof org.telegram.ui.Cells.e8) && ty0Var.R) {
                    int b10 = ty0Var.f30930c.T(view).b();
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
                if (getAdapter() == ((i10) this.Z2).U && T(view).f46346f == 1) {
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
                bn bnVar = (bn) this.Z2;
                bnVar.invalidate();
                bnVar.f28366b.f2(bnVar, i11);
                an anVar = bnVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (anVar.f24784x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = anVar.d();
                    if (d.length == anVar.f24784x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == anVar.f24784x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    anVar.f24784x = anVar.d();
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
                boolean p5 = o10.p(motionEvent, v1Var.f9944b, v1Var.f9946f, this.f28705n2);
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.Z2).f28366b.f30728e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                if (((bn) this.Z2).J != null) {
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
                    ((tz) this.Z2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                boolean p9 = ht.o().p(motionEvent, ((bw0) this.Z2).f25159b, null, this.f28705n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p9) {
                    return false;
                }
                return true;
            case 24:
                ty0 ty0Var = (ty0) this.Z2;
                if (ty0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean p10 = ht.o().p(motionEvent, ty0Var.f30930c, ty0Var.m0, this.f28705n2);
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
                ((org.telegram.ui.Components.bb) this.Z2).t();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.u1().z0();
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                ((rl) this.Z2).i0();
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((xn0) this.Z2).a();
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.Z2).f28366b.f30728e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 15:
                if (((bn) this.Z2).J != null) {
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
                if (!((org.telegram.ui.l1) this.Z2).f39103r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 18:
                if (!((v00) this.Z2).f31270r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((bw0) this.Z2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 24:
                if (!((ty0) this.Z2).f30936g0) {
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
                ((s00) this.Z2).invalidate();
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

    public u1(tz tzVar, Context context, rz rzVar) {
        super(context, null);
        this.Y2 = 16;
        this.Z2 = tzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.f21272i6, this.f28705n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(rzVar);
    }

    private final void C1(int i10, int i11) {
    }
}
