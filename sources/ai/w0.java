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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.go0;
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
import org.telegram.ui.b10;
import org.telegram.ui.c10;
import org.telegram.ui.kq;
import org.telegram.ui.nt;
import org.telegram.ui.pr;
import org.telegram.ui.pw;
import org.telegram.ui.s00;
import org.telegram.ui.t10;
import org.telegram.ui.wn;
import org.telegram.ui.zx;
public final class w0 extends yl0 {
    public final int X2;
    public final Object Y2;

    public w0(Object obj, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        int i11;
        switch (this.X2) {
            case 3:
                wi wiVar = ((hg.k0) this.Y2).f27076b;
                int dp = AndroidUtilities.dp(30.0f) + wiVar.f29930b2[0];
                if (!wiVar.f29945g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                wi wiVar2 = ((ak) this.Y2).f27076b;
                int dp2 = AndroidUtilities.dp(30.0f) + wiVar2.f29930b2[0];
                if (!wiVar2.f29945g0) {
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
        switch (this.X2) {
            case 5:
                if (view != ((org.telegram.ui.z6) this.Y2).Q) {
                    return true;
                }
                return false;
            case 16:
                m00 m00Var = (m00) this.Y2;
                if (m00Var.isEnabled() && !((pw) m00Var.J).f36686b.f37061j2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.X2) {
            case 10:
                return ((org.telegram.ui.Components.bb) this.Y2).t(view, f7, f10);
            case 16:
                if (((m00) this.Y2).f26201n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((k00) view).f25544f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((x81) this.Y2).f30338n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((v81) view).f29017c;
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
        switch (this.X2) {
            case 24:
                if (getAdapter() != null && ((d71) this.Y2).H && getAdapter().h() <= 2) {
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
        switch (this.X2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.Y2);
                org.telegram.ui.ActionBar.d6 d6Var = this.f30704p2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19279p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var));
            case 27:
                ArrayList arrayList = ((b10) this.Y2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    s00Var = (s00) arrayList.get(i10);
                } else {
                    s00Var = null;
                }
                org.telegram.ui.ActionBar.d6 d6Var2 = this.f30704p2;
                if (s00Var != null && s00Var.f37561l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19279p7, d6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var2));
            default:
                return super.W0(i10);
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
                if (!r3Var.f1336f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof h1) && (m1Var = ((h1) childAt).K) != null) {
                                i10 = m1Var.f1226a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > r3Var.F) {
                    r3Var.F = i10;
                    c cVar = r3Var.f1460i0.X1;
                    if (cVar != null) {
                        cVar.setCount(r3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                of ofVar = (of) this.Y2;
                w0 w0Var = ofVar.f8722c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = ofVar.h - AndroidUtilities.dp(8.0f);
                    ofVar.e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = ofVar.f8725r;
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
                ((org.telegram.ui.h8) this.Y2).F = false;
                return;
            case 21:
                zx zxVar = (zx) this.Y2;
                s4.c0 c0Var = zxVar.f26820c0;
                s4.j jVar = zxVar.f26818a0;
                go0 go0Var = zxVar.f26819b0;
                if (go0Var != null && jVar != null && c0Var != null && go0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = go0Var.h() - 1;
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
                if (go0Var != null && jVar != null && c0Var != null && go0Var.m0) {
                    canvas.restore();
                }
                if (go0Var != null && go0Var.f9759o0 != null) {
                    canvas.save();
                    canvas.translate(go0Var.f9759o0.getLeft(), go0Var.f9759o0.getTranslationY() + go0Var.f9759o0.getTop());
                    go0Var.f9759o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((t10) this.Y2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f42963f == 1) {
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
                if (((r3) obj).f1336f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                sk0 sk0Var = (sk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && sk0Var.getPullingLeftProgress() > 0.95f) {
                        sk0.a(sk0Var);
                    } else if (sk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = sk0Var.f28307y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(sk0Var.B0, 0.0f);
                        sk0Var.f28307y0 = ofFloat;
                        ofFloat.addUpdateListener(new u70(sk0Var, 6));
                        sk0Var.f28307y0.setDuration(150L);
                        sk0Var.f28307y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((wn0) obj).f30101f;
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
                zg.o0 o0Var = ((sk0) this.Y2).f28289l0;
                if (o0Var != null && (view instanceof qk0) && ((qk0) view).e.equals(o0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                hy0 hy0Var = (hy0) this.Y2;
                com.google.firebase.messaging.n nVar = hy0Var.f24930l0;
                if ((view instanceof org.telegram.ui.Cells.f8) && hy0Var.R) {
                    int b10 = hy0Var.f24919c.T(view).b();
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
                    ArrayList arrayList3 = (ArrayList) nVar.f7315f;
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
                if (getAdapter() == ((t10) this.Y2).U && T(view).f42963f == 1) {
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
                View view = ((pr) this.Y2).fragmentView;
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
        switch (this.X2) {
            case 3:
                return;
            case 14:
                sm smVar = (sm) this.Y2;
                smVar.invalidate();
                smVar.f27076b.X1(smVar, i11);
                rm rmVar = smVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (rmVar.f28000x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = rmVar.d();
                    if (d.length == rmVar.f28000x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == rmVar.f28000x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    rmVar.f28000x = rmVar.d();
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
    public void onAttachedToWindow() {
        switch (this.X2) {
            case 7:
                super.onAttachedToWindow();
                gg.o1 o1Var = ((wn) this.Y2).M3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.f9861r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                gg.o1 o1Var = ((wn) this.Y2).M3;
                if (o1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.E);
                    NotificationCenter.getInstance(o1Var.f9861r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                nt q6 = nt.q();
                ci.z1 z1Var = (ci.z1) this.Y2;
                boolean r10 = q6.r(motionEvent, z1Var.f5902b, z1Var.f5904f, this.f30704p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((kq) this.Y2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((lj) this.Y2).f27076b.f29930b2[0] - AndroidUtilities.dp(80.0f)) {
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
                boolean r11 = nt.q().r(motionEvent, ((pv0) this.Y2).f27431b, null, this.f30704p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                hy0 hy0Var = (hy0) this.Y2;
                if (hy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = nt.q().r(motionEvent, hy0Var.f24919c, hy0Var.m0, this.f30704p2);
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
                if (((kq) this.Y2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((lj) this.Y2).f27076b.f29930b2[0] - AndroidUtilities.dp(80.0f)) {
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
                    AndroidUtilities.runOnUIThread(new c10(this, 2), 250L);
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
                if (!((org.telegram.ui.k1) this.Y2).f34910r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((p00) this.Y2).f27211n) {
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
                if (!((hy0) this.Y2).f24925g0) {
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

    public w0(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    public w0(mz mzVar, Context context, kz kzVar) {
        super(context, null);
        this.X2 = 15;
        this.Y2 = mzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, this.f30704p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(kzVar);
    }

    private final void w1(int i10, int i11) {
    }
}
