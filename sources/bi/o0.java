package bi;

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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zj;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b10;
import org.telegram.ui.b20;
import org.telegram.ui.fo;
import org.telegram.ui.iy;
import org.telegram.ui.k10;
import org.telegram.ui.tq;
import org.telegram.ui.xt;
import org.telegram.ui.xw;
import org.telegram.ui.yr;
import org.telegram.ui.zz;
public final class o0 extends mm0 {
    public final int V2;
    public final Object W2;

    public o0(Object obj, Context context, int i10) {
        super(context, null);
        this.V2 = i10;
        this.W2 = obj;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        int i11;
        switch (this.V2) {
            case 3:
                vi viVar = ((ig.i0) this.W2).f27360b;
                int dp = AndroidUtilities.dp(30.0f) + viVar.f29670e2[0];
                if (!viVar.f29675g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                vi viVar2 = ((zj) this.W2).f27360b;
                int dp2 = AndroidUtilities.dp(30.0f) + viVar2.f29670e2[0];
                if (!viVar2.f29675g0) {
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
            case 5:
                if (view != ((org.telegram.ui.d7) this.W2).Q) {
                    return true;
                }
                return false;
            case 16:
                w00 w00Var = (w00) this.W2;
                if (w00Var.isEnabled() && !((xw) w00Var.J).f41671b.f42032j2) {
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
            case 10:
                return ((org.telegram.ui.Components.db) this.W2).v(view, f7, f10);
            case 16:
                if (((w00) this.W2).f30377n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((u00) view).f29219f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((k91) this.W2).f26321n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((i91) view).f25608c;
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
            case 24:
                if (getAdapter() != null && ((r71) this.W2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        b10 b10Var;
        switch (this.V2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.W2);
                org.telegram.ui.ActionBar.c6 c6Var = this.f27148n2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19822p7, c6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var));
            case 27:
                ArrayList arrayList = ((k10) this.W2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    b10Var = (b10) arrayList.get(i10);
                } else {
                    b10Var = null;
                }
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f27148n2;
                if (b10Var != null && b10Var.f34146l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19822p7, c6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var2));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.V2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((k91) this.W2).V) {
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
        e1 e1Var;
        switch (this.V2) {
            case 0:
                h3 h3Var = (h3) this.W2;
                int i10 = -1;
                if (!h3Var.f3063f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof z0) && (e1Var = ((z0) childAt).K) != null) {
                                i10 = e1Var.f2974a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > h3Var.F) {
                    h3Var.F = i10;
                    a aVar = h3Var.f3116i0.X1;
                    if (aVar != null) {
                        aVar.setCount(h3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                pf pfVar = (pf) this.W2;
                o0 o0Var = pfVar.f9655c;
                if (o0Var.getLayoutManager() != null && o0Var.getAdapter() != null && o0Var.getAdapter().h() != 0) {
                    float dp = pfVar.h - AndroidUtilities.dp(8.0f);
                    pfVar.e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = pfVar.f9658r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pfVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.l8) this.W2).F = false;
                return;
            case 21:
                iy iyVar = (iy) this.W2;
                s4.b0 b0Var = iyVar.f31619c0;
                s4.k kVar = iyVar.f31617a0;
                so0 so0Var = iyVar.f31618b0;
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
                if (so0Var != null && so0Var.f10584o0 != null) {
                    canvas.save();
                    canvas.translate(so0Var.f10584o0.getLeft(), so0Var.f10584o0.getTranslationY() + so0Var.f10584o0.getTop());
                    so0Var.f10584o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((b20) this.W2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f44841f == 1) {
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
            case 0:
                if (((h3) obj).f3063f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                gl0 gl0Var = (gl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && gl0Var.getPullingLeftProgress() > 0.95f) {
                        gl0.a(gl0Var);
                    } else if (gl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = gl0Var.f25049y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(gl0Var.B0, 0.0f);
                        gl0Var.f25049y0 = ofFloat;
                        ofFloat.addUpdateListener(new f80(gl0Var, 7));
                        gl0Var.f25049y0.setDuration(150L);
                        gl0Var.f25049y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((ko0) obj).f26452f;
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
            case 18:
                ah.i1 i1Var = ((gl0) this.W2).f25031l0;
                if (i1Var != null && (view instanceof el0) && ((el0) view).e.equals(i1Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                uy0 uy0Var = (uy0) this.W2;
                com.google.firebase.messaging.m mVar = uy0Var.f29502l0;
                if ((view instanceof org.telegram.ui.Cells.f8) && uy0Var.R) {
                    int b10 = uy0Var.f29491c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) mVar.d;
                    float f7 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) mVar.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) mVar.f6197f;
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
            case 28:
                if (getAdapter() == ((b20) this.W2).U && T(view).f44841f == 1) {
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
            case 0:
                super.invalidate();
                ((h3) this.W2).invalidate();
                return;
            case 9:
                super.invalidate();
                View view = ((yr) this.W2).fragmentView;
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
            case 3:
                return;
            case 14:
                en enVar = (en) this.W2;
                enVar.invalidate();
                enVar.f27360b.b2(enVar, i11);
                dn dnVar = enVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (dnVar.f24150x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = dnVar.d();
                    if (d.length == dnVar.f24150x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == dnVar.f24150x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    dnVar.f24150x = dnVar.d();
                }
                if (z10) {
                    dnVar.invalidate();
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
            case 7:
                super.onAttachedToWindow();
                hg.n1 n1Var = ((fo) this.W2).M3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.f10687r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
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
            case 7:
                super.onDetachedFromWindow();
                hg.n1 n1Var = ((fo) this.W2).M3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.f10687r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
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
            case 1:
                xt q6 = xt.q();
                di.y1 y1Var = (di.y1) this.W2;
                boolean r10 = q6.r(motionEvent, y1Var.f8121b, y1Var.f8123f, this.f27148n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((tq) this.W2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((kj) this.W2).f27360b.f29670e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((en) this.W2).J != null) {
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
                    ((wz) this.W2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = xt.q().r(motionEvent, ((bw0) this.W2).f23561b, null, this.f27148n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                uy0 uy0Var = (uy0) this.W2;
                if (uy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = xt.q().r(motionEvent, uy0Var.f29491c, uy0Var.m0, this.f27148n2);
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
            case 10:
                ((org.telegram.ui.Components.db) this.W2).u();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((tl) this.W2).h0();
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((xn0) this.W2).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.V2) {
            case 0:
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
            case 8:
                if (((tq) this.W2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((kj) this.W2).f27360b.f29670e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((en) this.W2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new zz(this, 3), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.V2) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.V2) {
            case 4:
                if (!((org.telegram.ui.m1) this.W2).f37886r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((z00) this.W2).f31412n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((bw0) this.W2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((uy0) this.W2).f29497g0) {
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
            case 16:
                super.setAlpha(f7);
                ((w00) this.W2).invalidate();
                return;
            case 25:
                super.setAlpha(f7);
                ((k91) this.W2).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.V2) {
            case 24:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public o0(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = obj;
    }

    public o0(wz wzVar, Context context, uz uzVar) {
        super(context, null);
        this.V2 = 15;
        this.W2 = wzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, this.f27148n2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.a0 a0Var = new hg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(uzVar);
    }

    private final void x1(int i10, int i11) {
    }
}
