package hh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.ze;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq;
import org.telegram.ui.gw;
import org.telegram.ui.h00;
import org.telegram.ui.i10;
import org.telegram.ui.kt;
import org.telegram.ui.lr;
import org.telegram.ui.px;
import org.telegram.ui.q00;
import org.telegram.ui.r00;
import org.telegram.ui.rn;

public final class f1 extends zk0 {
    public final int T2;
    public final Object U2;

    public f1(Object obj, Context context, int i10) {
        super(context, null);
        this.T2 = i10;
        this.U2 = obj;
    }

    @Override
    public boolean E0(float f10) {
        switch (this.T2) {
            case 12:
                gi giVar = ((lj) this.U2).f34900b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + giVar.X1[0]) + (!giVar.f28639c0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.T2) {
            case 5:
                return view != ((org.telegram.ui.z6) this.U2).M;
            case 16:
                yz yzVar = (yz) this.U2;
                return yzVar.isEnabled() && !((gw) yzVar.F).f38485b.f38527f2;
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
                return ((org.telegram.ui.Components.qa) this.U2).u(view, f10, f11);
            case 16:
                if (((yz) this.U2).f35085n) {
                    int iDp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((wz) view).f34387f;
                    float f12 = iDp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((o71) this.U2).f31221n) {
                    int iDp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((m71) view).f30611c;
                    float f13 = iDp2;
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
                return getAdapter() != null && ((u51) this.U2).D && getAdapter().h() <= 2;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        switch (this.T2) {
            case 1:
                return 0;
            case 20:
                return 0;
            case 26:
                int i11 = ((DataSettingsActivity) this.U2).resetDownloadRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var));
            case 27:
                ArrayList arrayList = ((q00) this.U2).L;
                h00 h00Var = (i10 < 0 || i10 >= arrayList.size()) ? null : (h00) arrayList.get(i10);
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f35277l2;
                return (h00Var == null || !h00Var.f38650l) ? Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var2)));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.T2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (!((o71) this.U2).R) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setAlpha(1.0f);
                } else {
                    view.setScaleX(0.3f);
                    view.setScaleY(0.3f);
                    view.setAlpha(0.0f);
                }
                break;
            default:
                super.addView(view, i10, layoutParams);
                break;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        jh.s0 s0Var;
        switch (this.T2) {
            case 1:
                jh.g2 g2Var = (jh.g2) this.U2;
                int i10 = -1;
                if (!g2Var.f14011b0) {
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        View childAt = getChildAt(i11);
                        if ((childAt instanceof jh.n0) && (s0Var = ((jh.n0) childAt).G) != null) {
                            i10 = s0Var.f13929a;
                        }
                    }
                }
                if (i10 > g2Var.B) {
                    g2Var.B = i10;
                    jh.a aVar = g2Var.f13350e0.T1;
                    if (aVar != null) {
                        aVar.setCount(g2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                ze zeVar = (ze) this.U2;
                f1 f1Var = zeVar.f19010c;
                if (f1Var.getLayoutManager() == null || f1Var.getAdapter() == null || f1Var.getAdapter().h() == 0) {
                    super.dispatchDraw(canvas);
                } else {
                    float fDp = zeVar.h - AndroidUtilities.dp(8.0f);
                    zeVar.f19011e = fDp - AndroidUtilities.dp(16.0f);
                    lg.d dVar = zeVar.f19014r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), fDp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), fDp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), zeVar.d);
                    super.dispatchDraw(canvas);
                }
                break;
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.h8) this.U2).B = false;
                break;
            case 21:
                px pxVar = (px) this.U2;
                f2.k0 k0Var = pxVar.V;
                f2.l lVar = pxVar.T;
                cn0 cn0Var = pxVar.U;
                if (cn0Var != null && lVar != null && k0Var != null && cn0Var.f45990i0) {
                    canvas.save();
                    invalidate();
                    int iH = cn0Var.h() - 1;
                    for (int i12 = 0; i12 < getChildCount(); i12++) {
                        View childAt2 = getChildAt(i12);
                        if (RecyclerView.R(childAt2) == iH) {
                            canvas.clipRect(0.0f, 0.0f, getWidth(), childAt2.getTranslationY() + childAt2.getBottom());
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (cn0Var != null && lVar != null && k0Var != null && cn0Var.f45990i0) {
                    canvas.restore();
                }
                if (cn0Var != null && cn0Var.f45992k0 != null) {
                    canvas.save();
                    canvas.translate(cn0Var.f45992k0.getLeft(), cn0Var.f45992k0.getTranslationY() + cn0Var.f45992k0.getTop());
                    cn0Var.f45992k0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 28:
                if (getAdapter() == ((i10) this.U2).Q) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f5793f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i13).getX(), (getChildAt(i13).getY() - getChildAt(i13).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i13).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10 = this.T2;
        Object obj = this.U2;
        switch (i10) {
            case 1:
                if (((jh.g2) obj).f14011b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                wj0 wj0Var = (wj0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && wj0Var.getPullingLeftProgress() > 0.95f) {
                        wj0.a(wj0Var);
                    } else if (wj0Var.f34271x0 != 0.0f) {
                        ValueAnimator valueAnimator = wj0Var.f34266u0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(wj0Var.f34271x0, 0.0f);
                        wj0Var.f34266u0 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new v60(wj0Var, 6));
                        wj0Var.f34266u0.setDuration(150L);
                        wj0Var.f34266u0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((um0) obj).f33130f;
                if (linearLayout == null || linearLayout.getAlpha() <= 0.5f) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T2) {
            case 18:
                ig.q0 q0Var = ((wj0) this.U2).f34251h0;
                if (q0Var != null && (view instanceof uj0) && ((uj0) view).f33102e.equals(q0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                ex0 ex0Var = (ex0) this.U2;
                com.google.firebase.messaging.m mVar = ex0Var.f28181h0;
                if (!(view instanceof org.telegram.ui.Cells.a8) || !ex0Var.N) {
                    return super.drawChild(canvas, view, j10);
                }
                int iB = ex0Var.f28173c.T(view).b();
                canvas.save();
                ArrayList arrayList = (ArrayList) mVar.d;
                canvas.rotate(arrayList.isEmpty() ? 0.0f : ((Float) arrayList.get(iB - ((iB / 6) * 6))).floatValue(), (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                ArrayList arrayList2 = (ArrayList) mVar.f4605e;
                float fFloatValue = arrayList2.isEmpty() ? 0.0f : ((Float) arrayList2.get(iB - ((iB / 6) * 6))).floatValue();
                ArrayList arrayList3 = (ArrayList) mVar.f4606f;
                canvas.translate(fFloatValue, arrayList3.isEmpty() ? 0.0f : ((Float) arrayList3.get(iB - ((iB / 6) * 6))).floatValue());
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                invalidate();
                return zDrawChild;
            case 28:
                if (getAdapter() == ((i10) this.U2).Q && T(view).f5793f == 1) {
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
                ((jh.g2) this.U2).invalidate();
                break;
            case 9:
                super.invalidate();
                View view = ((lr) this.U2).fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public void k0(int i10, int i11) {
        switch (this.T2) {
            case 14:
                em emVar = (em) this.U2;
                emVar.invalidate();
                emVar.f34900b.X1(emVar, i11);
                dm dmVar = emVar.v;
                boolean z10 = true;
                int i12 = 0;
                boolean z11 = dmVar.f27807x == null;
                if (z11) {
                    dmVar.f27807x = dmVar.d();
                } else {
                    boolean[] zArrD = dmVar.d();
                    if (zArrD.length == dmVar.f27807x.length) {
                        while (true) {
                            if (i12 >= zArrD.length) {
                                z10 = z11;
                            } else if (zArrD[i12] == dmVar.f27807x[i12]) {
                                i12++;
                            }
                        }
                    }
                    z11 = z10;
                }
                if (z11) {
                    dmVar.invalidate();
                }
                break;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.T2) {
            case 7:
                super.onAttachedToWindow();
                pf.y0 y0Var = ((rn) this.U2).I3;
                if (y0Var != null) {
                    NotificationCenter.getInstance(y0Var.f45974r).addObserver(y0Var, NotificationCenter.storiesListUpdated);
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.T2) {
            case 7:
                super.onDetachedFromWindow();
                pf.y0 y0Var = ((rn) this.U2).I3;
                if (y0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y0Var.A);
                    NotificationCenter.getInstance(y0Var.f45974r).removeObserver(y0Var, NotificationCenter.storiesListUpdated);
                }
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 2:
                kt ktVarQ = kt.q();
                lh.u1 u1Var = (lh.u1) this.U2;
                return super.onInterceptTouchEvent(motionEvent) || ktVarQ.r(motionEvent, u1Var.f16896b, u1Var.f16899f, this.f35277l2);
            case 8:
                if (((dq) this.U2).D) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((ui) this.U2).f34900b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            case 14:
                if (((em) this.U2).F != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                    ((yy) this.U2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                return super.onInterceptTouchEvent(motionEvent) || kt.q().r(motionEvent, ((lu0) this.U2).f30466b, null, this.f35277l2);
            case 23:
                ex0 ex0Var = (ex0) this.U2;
                if (ex0Var.N) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return super.onInterceptTouchEvent(motionEvent) || kt.q().r(motionEvent, ex0Var.f28173c, ex0Var.f28182i0, this.f35277l2);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T2) {
            case 0:
                l1 l1Var = (l1) this.U2;
                l1Var.t();
                super.onLayout(z10, i10, i11, i12, i13);
                l1Var.Q(2);
                break;
            case 10:
                ((org.telegram.ui.Components.qa) this.U2).t();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                break;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((tk) this.U2).e0();
                break;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((jm0) this.U2).a();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                View.MeasureSpec.getSize(i11);
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 8:
                if (((dq) this.U2).D) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= ((ui) this.U2).f34900b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
            case 14:
                if (((em) this.U2).F != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new r00(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.T2) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.T2) {
            case 4:
                if (!((org.telegram.ui.n1) this.U2).f40633r) {
                    super.requestLayout();
                    break;
                }
                break;
            case 17:
                if (!((b00) this.U2).f26869n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 22:
                if (!((lu0) this.U2).h) {
                    super.requestLayout();
                    break;
                }
                break;
            case 23:
                if (!((ex0) this.U2).f28174c0) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.T2) {
            case 16:
                super.setAlpha(f10);
                ((yz) this.U2).invalidate();
                break;
            case 25:
                super.setAlpha(f10);
                ((o71) this.U2).invalidate();
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.T2) {
            case 24:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    public f1(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = obj;
    }

    public f1(yy yyVar, Context context, wy wyVar) {
        super(context, null);
        this.T2 = 15;
        this.U2 = yyVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, this.f35277l2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.j jVar = new org.telegram.ui.j(6);
        jVar.j1(0);
        setLayoutManager(jVar);
        setAdapter(wyVar);
    }
}
