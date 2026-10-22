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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bq;
import org.telegram.ui.bw;
import org.telegram.ui.e00;
import org.telegram.ui.e10;
import org.telegram.ui.et;
import org.telegram.ui.hr;
import org.telegram.ui.lx;
import org.telegram.ui.n00;
import org.telegram.ui.qn;
public final class u1 extends jm0 {
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
                ti tiVar = ((ig.i0) this.W2).f28176b;
                int dp = AndroidUtilities.dp(30.0f) + tiVar.f30547e2[0];
                if (!tiVar.f30552g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 13:
                ti tiVar2 = ((xj) this.W2).f28176b;
                int dp2 = AndroidUtilities.dp(30.0f) + tiVar2.f30547e2[0];
                if (!tiVar2.f30552g0) {
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
                if (s00Var.isEnabled() && !((bw) s00Var.J).f35751b.f36123j2) {
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
                if (((s00) this.W2).f30084n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((q00) view).f29440f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 26:
                if (((d91) this.W2).f25410n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((b91) view).f24838c;
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
                if (getAdapter() != null && ((l71) this.W2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        e00 e00Var;
        switch (this.V2) {
            case 1:
                return 0;
            case 21:
                return 0;
            case 27:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.W2);
                org.telegram.ui.ActionBar.d6 d6Var = this.f27582n2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21214p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, d6Var));
            case 28:
                ArrayList arrayList = ((n00) this.W2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    e00Var = (e00) arrayList.get(i10);
                } else {
                    e00Var = null;
                }
                org.telegram.ui.ActionBar.d6 d6Var2 = this.f27582n2;
                if (e00Var != null && e00Var.f36482l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21214p7, d6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, d6Var2));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.V2) {
            case 26:
                super.addView(view, i10, layoutParams);
                if (((d91) this.W2).V) {
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
                if (!n2Var.f6138f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof ci.q0) && (v0Var = ((ci.q0) childAt).K) != null) {
                                i10 = v0Var.f6064a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > n2Var.F) {
                    n2Var.F = i10;
                    ci.a aVar = n2Var.f5629i0.X1;
                    if (aVar != null) {
                        aVar.setCount(n2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                nf nfVar = (nf) this.W2;
                u1 u1Var = nfVar.f11534c;
                if (u1Var.getLayoutManager() != null && u1Var.getAdapter() != null && u1Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = nfVar.f11537r;
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
                lx lxVar = (lx) this.W2;
                s4.b0 b0Var = lxVar.f32183c0;
                s4.k kVar = lxVar.f32181a0;
                po0 po0Var = lxVar.f32182b0;
                if (po0Var != null && kVar != null && b0Var != null && po0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = po0Var.h() - 1;
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
                if (po0Var != null && kVar != null && b0Var != null && po0Var.m0) {
                    canvas.restore();
                }
                if (po0Var != null && po0Var.f11888o0 != null) {
                    canvas.save();
                    canvas.translate(po0Var.f11888o0.getLeft(), po0Var.f11888o0.getTranslationY() + po0Var.f11888o0.getTop());
                    po0Var.f11888o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                if (getAdapter() == ((e10) this.W2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f45923f == 1) {
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
                if (((ci.n2) obj).f6138f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                dl0 dl0Var = (dl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && dl0Var.getPullingLeftProgress() > 0.95f) {
                        dl0.a(dl0Var);
                    } else if (dl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = dl0Var.f25568y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(dl0Var.B0, 0.0f);
                        dl0Var.f25568y0 = ofFloat;
                        ofFloat.addUpdateListener(new b80(dl0Var, 7));
                        dl0Var.f25568y0.setDuration(150L);
                        dl0Var.f25568y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 21:
                LinearLayout linearLayout = ((go0) obj).f26620f;
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
                ah.i1 i1Var = ((dl0) this.W2).f25550l0;
                if (i1Var != null && (view instanceof bl0) && ((bl0) view).e.equals(i1Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                qy0 qy0Var = (qy0) this.W2;
                com.google.firebase.messaging.l lVar = qy0Var.f29761l0;
                if ((view instanceof org.telegram.ui.Cells.e8) && qy0Var.R) {
                    int b10 = qy0Var.f29750c.T(view).b();
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
                    ArrayList arrayList3 = (ArrayList) lVar.f7648f;
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
                if (getAdapter() == ((e10) this.W2).U && T(view).f45923f == 1) {
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
                View view = ((hr) this.W2).fragmentView;
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
                bnVar.f28176b.b2(bnVar, i11);
                an anVar = bnVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (anVar.f24681x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = anVar.d();
                    if (d.length == anVar.f24681x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == anVar.f24681x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    anVar.f24681x = anVar.d();
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
                hg.n1 n1Var = ((qn) this.W2).M3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.f11994r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
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
                hg.n1 n1Var = ((qn) this.W2).M3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.f11994r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
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
                et q6 = et.q();
                ei.v1 v1Var = (ei.v1) this.W2;
                boolean r10 = q6.r(motionEvent, v1Var.f9927b, v1Var.f9929f, this.f27582n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 9:
                if (((bq) this.W2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.W2).f28176b.f30547e2[0] - AndroidUtilities.dp(80.0f)) {
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
                boolean r11 = et.q().r(motionEvent, ((yv0) this.W2).f32739b, null, this.f27582n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 24:
                qy0 qy0Var = (qy0) this.W2;
                if (qy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = et.q().r(motionEvent, qy0Var.f29750c, qy0Var.m0, this.f27582n2);
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
                a2Var.u();
                super.onLayout(z10, i10, i11, i12, i13);
                a2Var.R(2);
                return;
            case 11:
                ((org.telegram.ui.Components.bb) this.W2).u();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.u1().z0();
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                ((rl) this.W2).h0();
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((un0) this.W2).a();
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
                if (((bq) this.W2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.W2).f28176b.f30547e2[0] - AndroidUtilities.dp(80.0f)) {
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
                if (!((org.telegram.ui.m1) this.W2).f39092r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 18:
                if (!((v00) this.W2).f31106n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((yv0) this.W2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 24:
                if (!((qy0) this.W2).f29756g0) {
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
                ((d91) this.W2).invalidate();
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
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, this.f27582n2));
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
