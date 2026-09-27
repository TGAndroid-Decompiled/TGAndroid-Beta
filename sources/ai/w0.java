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
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ay;
import org.telegram.ui.e10;
import org.telegram.ui.f10;
import org.telegram.ui.ky;
import org.telegram.ui.lq;
import org.telegram.ui.qr;
import org.telegram.ui.qt;
import org.telegram.ui.v00;
import org.telegram.ui.w10;
import org.telegram.ui.xn;
public final class w0 extends yl0 {
    public final int X2;
    public final Object Y2;

    public w0(Object obj, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override
    public boolean F0(float f7) {
        int i10;
        int i11;
        switch (this.X2) {
            case 3:
                wi wiVar = ((hg.i0) this.Y2).f27104b;
                int dp = AndroidUtilities.dp(30.0f) + wiVar.f29950b2[0];
                if (!wiVar.f29965g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                wi wiVar2 = ((ak) this.Y2).f27104b;
                int dp2 = AndroidUtilities.dp(30.0f) + wiVar2.f29950b2[0];
                if (!wiVar2.f29965g0) {
                    i11 = AndroidUtilities.statusBarHeight;
                } else {
                    i11 = 0;
                }
                if (f7 < dp2 + i11) {
                    return false;
                }
                return true;
            default:
                return super.F0(f7);
        }
    }

    @Override
    public boolean G0(View view) {
        switch (this.X2) {
            case 5:
                if (view != ((org.telegram.ui.b7) this.Y2).U) {
                    return true;
                }
                return false;
            case 16:
                m00 m00Var = (m00) this.Y2;
                if (m00Var.isEnabled() && !((ky) m00Var.J).f35193b.f38004j2) {
                    return true;
                }
                return false;
            default:
                return super.G0(view);
        }
    }

    @Override
    public boolean I0(View view, float f7, float f10) {
        switch (this.X2) {
            case 10:
                return ((org.telegram.ui.Components.bb) this.Y2).t(view, f7, f10);
            case 16:
                if (((m00) this.Y2).f26257n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((k00) view).f25572f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((x81) this.Y2).f30367n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((v81) view).f29076c;
                    float f12 = dp2;
                    if (rectF2.left - f12 < f7 && rectF2.right + f12 > f7) {
                        return false;
                    }
                }
                return true;
            default:
                return super.I0(view, f7, f10);
        }
    }

    @Override
    public boolean T0() {
        switch (this.X2) {
            case 24:
                if (getAdapter() != null && ((e71) this.Y2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.T0();
        }
    }

    @Override
    public Integer X0(int i10) {
        v00 v00Var;
        switch (this.X2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.Y2);
                org.telegram.ui.ActionBar.e6 e6Var = this.f30709p2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19278p7, e6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var));
            case 27:
                ArrayList arrayList = ((e10) this.Y2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    v00Var = (v00) arrayList.get(i10);
                } else {
                    v00Var = null;
                }
                org.telegram.ui.ActionBar.e6 e6Var2 = this.f30709p2;
                if (v00Var != null && v00Var.f38403l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19278p7, e6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, e6Var2));
            default:
                return super.X0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.X2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((x81) this.Y2).V) {
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
        m1 m1Var;
        switch (this.X2) {
            case 0:
                r3 r3Var = (r3) this.Y2;
                int i10 = -1;
                if (!r3Var.f1338f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof h1) && (m1Var = ((h1) childAt).K) != null) {
                                i10 = m1Var.f1228a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > r3Var.F) {
                    r3Var.F = i10;
                    c cVar = r3Var.f1462i0.X1;
                    if (cVar != null) {
                        cVar.setCount(r3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                of ofVar = (of) this.Y2;
                w0 w0Var = ofVar.f8725c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = ofVar.h - AndroidUtilities.dp(8.0f);
                    ofVar.e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = ofVar.f8728r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), ofVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.k8) this.Y2).F = false;
                return;
            case 21:
                ay ayVar = (ay) this.Y2;
                s4.c0 c0Var = ayVar.f26497d0;
                s4.j jVar = ayVar.f26495b0;
                fo0 fo0Var = ayVar.f26496c0;
                if (fo0Var != null && jVar != null && c0Var != null && fo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = fo0Var.h() - 1;
                    int i12 = 0;
                    while (true) {
                        if (i12 < getChildCount()) {
                            View childAt2 = getChildAt(i12);
                            if (RecyclerView.S(childAt2) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt2.getTranslationY() + childAt2.getBottom());
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (fo0Var != null && jVar != null && c0Var != null && fo0Var.m0) {
                    canvas.restore();
                }
                if (fo0Var != null && fo0Var.f9765o0 != null) {
                    canvas.save();
                    canvas.translate(fo0Var.f9765o0.getLeft(), fo0Var.f9765o0.getTranslationY() + fo0Var.f9765o0.getTop());
                    fo0Var.f9765o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((w10) this.Y2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (U(getChildAt(i13)).f43008f == 1) {
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
        int i10 = this.X2;
        Object obj = this.Y2;
        switch (i10) {
            case 0:
                if (((r3) obj).f1338f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                sk0 sk0Var = (sk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && sk0Var.getPullingLeftProgress() > 0.95f) {
                        sk0.a(sk0Var);
                    } else if (sk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = sk0Var.f28325y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(sk0Var.B0, 0.0f);
                        sk0Var.f28325y0 = ofFloat;
                        ofFloat.addUpdateListener(new u70(sk0Var, 6));
                        sk0Var.f28325y0.setDuration(150L);
                        sk0Var.f28325y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((wn0) obj).f30121f;
                if (linearLayout != null && linearLayout.getAlpha() > 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        float floatValue;
        float floatValue2;
        switch (this.X2) {
            case 18:
                zg.p0 p0Var = ((sk0) this.Y2).f28307l0;
                if (p0Var != null && (view instanceof qk0) && ((qk0) view).e.equals(p0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                hy0 hy0Var = (hy0) this.Y2;
                com.google.firebase.messaging.n nVar = hy0Var.f24945l0;
                if ((view instanceof org.telegram.ui.Cells.f8) && hy0Var.R) {
                    int b10 = hy0Var.f24934c.U(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) nVar.d;
                    float f7 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) nVar.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) nVar.f7323f;
                    if (!arrayList3.isEmpty()) {
                        f7 = ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.translate(floatValue2, f7);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    invalidate();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 28:
                if (getAdapter() == ((w10) this.Y2).U && U(view).f43008f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.X2) {
            case 0:
                super.invalidate();
                ((r3) this.Y2).invalidate();
                return;
            case 9:
                super.invalidate();
                View view = ((qr) this.Y2).fragmentView;
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
    public void l0(int i10) {
        boolean z10;
        switch (this.X2) {
            case 3:
                return;
            case 14:
                sm smVar = (sm) this.Y2;
                smVar.invalidate();
                smVar.f27104b.U1(smVar, i10);
                rm rmVar = smVar.v;
                boolean z11 = true;
                int i11 = 0;
                if (rmVar.f28038x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = rmVar.d();
                    if (d.length == rmVar.f28038x.length) {
                        while (true) {
                            if (i11 < d.length) {
                                if (d[i11] == rmVar.f28038x[i11]) {
                                    i11++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    rmVar.f28038x = rmVar.d();
                }
                if (z10) {
                    rmVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(Canvas canvas, View view, long j3) {
        switch (this.X2) {
            case 5:
                if (view != ((org.telegram.ui.b7) this.Y2).M) {
                    drawChild(canvas, view, j3);
                    return;
                }
                return;
            default:
                super.m(canvas, view, j3);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.X2) {
            case 7:
                super.onAttachedToWindow();
                gg.o1 o1Var = ((xn) this.Y2).M3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.f9867r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.X2) {
            case 7:
                super.onDetachedFromWindow();
                gg.o1 o1Var = ((xn) this.Y2).M3;
                if (o1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.E);
                    NotificationCenter.getInstance(o1Var.f9867r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.X2) {
            case 1:
                qt q6 = qt.q();
                ci.z1 z1Var = (ci.z1) this.Y2;
                boolean r10 = q6.r(motionEvent, z1Var.f5903b, z1Var.f5905f, this.f30709p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((lq) this.Y2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((lj) this.Y2).f27104b.f29950b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((sm) this.Y2).J != null) {
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
                    ((mz) this.Y2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = qt.q().r(motionEvent, ((pv0) this.Y2).f27474b, null, this.f30709p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                hy0 hy0Var = (hy0) this.Y2;
                if (hy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = qt.q().r(motionEvent, hy0Var.f24934c, hy0Var.m0, this.f30709p2);
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
        switch (this.X2) {
            case 10:
                ((org.telegram.ui.Components.bb) this.Y2).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((il) this.Y2).e0();
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((kn0) this.Y2).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.X2) {
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
        switch (this.X2) {
            case 8:
                if (((lq) this.Y2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((lj) this.Y2).f27104b.f29950b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((sm) this.Y2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new f10(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.X2) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.X2) {
            case 4:
                if (!((org.telegram.ui.l1) this.Y2).f35222r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((p00) this.Y2).f27235n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((pv0) this.Y2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((hy0) this.Y2).f24940g0) {
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
        switch (this.X2) {
            case 16:
                super.setAlpha(f7);
                ((m00) this.Y2).invalidate();
                return;
            case 25:
                super.setAlpha(f7);
                ((x81) this.Y2).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.X2) {
            case 24:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public w0(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    public w0(mz mzVar, Context context, kz kzVar) {
        super(context, null);
        this.X2 = 15;
        this.Y2 = mzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, this.f30709p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(kzVar);
    }

    private final void x1(int i10) {
    }
}
