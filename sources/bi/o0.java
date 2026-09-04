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
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
import org.telegram.ui.ey;
import org.telegram.ui.f10;
import org.telegram.ui.g10;
import org.telegram.ui.qq;
import org.telegram.ui.st;
import org.telegram.ui.tw;
import org.telegram.ui.vr;
import org.telegram.ui.w00;
import org.telegram.ui.x10;
public final class o0 extends ll0 {
    public final int X2;
    public final Object Y2;

    public o0(Object obj, Context context, int i10) {
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
                vi viVar = ((ig.i0) this.Y2).f28753b;
                int dp = AndroidUtilities.dp(30.0f) + viVar.f31266b2[0];
                if (!viVar.f31282g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                vi viVar2 = ((yj) this.Y2).f28753b;
                int dp2 = AndroidUtilities.dp(30.0f) + viVar2.f31266b2[0];
                if (!viVar2.f31282g0) {
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
                k00 k00Var = (k00) this.Y2;
                if (k00Var.isEnabled() && !((tw) k00Var.J).f40841b.f41287j2) {
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
                if (((k00) this.Y2).f27621n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((i00) view).f26907f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((h81) this.Y2).f26649n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((f81) view).f25957c;
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
    public boolean R0() {
        switch (this.X2) {
            case 24:
                if (getAdapter() != null && ((o61) this.Y2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i10) {
        w00 w00Var;
        switch (this.X2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.Y2);
                org.telegram.ui.ActionBar.f6 f6Var = this.f28224p2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20880p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var));
            case 27:
                ArrayList arrayList = ((f10) this.Y2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    w00Var = (w00) arrayList.get(i10);
                } else {
                    w00Var = null;
                }
                org.telegram.ui.ActionBar.f6 f6Var2 = this.f28224p2;
                if (w00Var != null && w00Var.f41739l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20880p7, f6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var2));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.X2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((h81) this.Y2).V) {
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
        switch (this.X2) {
            case 0:
                e3 e3Var = (e3) this.Y2;
                int i10 = -1;
                if (!e3Var.f3010f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof z0) && (e1Var = ((z0) childAt).K) != null) {
                                i10 = e1Var.f2898a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > e3Var.F) {
                    e3Var.F = i10;
                    a aVar = e3Var.f2907i0.X1;
                    if (aVar != null) {
                        aVar.setCount(e3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                of ofVar = (of) this.Y2;
                o0 o0Var = ofVar.f10100c;
                if (o0Var.getLayoutManager() != null && o0Var.getAdapter() != null && o0Var.getAdapter().h() != 0) {
                    float dp = ofVar.h - AndroidUtilities.dp(8.0f);
                    ofVar.f10101e = dp - AndroidUtilities.dp(16.0f);
                    dh.d dVar = ofVar.f10104r;
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
                ey eyVar = (ey) this.Y2;
                s4.c0 c0Var = eyVar.f32951c0;
                s4.j jVar = eyVar.f32949a0;
                rn0 rn0Var = eyVar.f32950b0;
                if (rn0Var != null && jVar != null && c0Var != null && rn0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = rn0Var.h() - 1;
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
                if (rn0Var != null && jVar != null && c0Var != null && rn0Var.m0) {
                    canvas.restore();
                }
                if (rn0Var != null && rn0Var.f11087o0 != null) {
                    canvas.save();
                    canvas.translate(rn0Var.f11087o0.getLeft(), rn0Var.f11087o0.getTranslationY() + rn0Var.f11087o0.getTop());
                    rn0Var.f11087o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((x10) this.Y2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f45742f == 1) {
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
                if (((e3) obj).f3010f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                fk0 fk0Var = (fk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && fk0Var.getPullingLeftProgress() > 0.95f) {
                        fk0.a(fk0Var);
                    } else if (fk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = fk0Var.f26121y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fk0Var.B0, 0.0f);
                        fk0Var.f26121y0 = ofFloat;
                        ofFloat.addUpdateListener(new h70(fk0Var, 6));
                        fk0Var.f26121y0.setDuration(150L);
                        fk0Var.f26121y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((hn0) obj).f26766f;
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
                ah.j1 j1Var = ((fk0) this.Y2).f26103l0;
                if (j1Var != null && (view instanceof dk0) && ((dk0) view).f25410e.equals(j1Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                ux0 ux0Var = (ux0) this.Y2;
                com.google.firebase.messaging.n nVar = ux0Var.f31006l0;
                if ((view instanceof org.telegram.ui.Cells.f8) && ux0Var.R) {
                    int b10 = ux0Var.f30994c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) nVar.d;
                    float f7 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) nVar.f6377e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) nVar.f6378f;
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
                if (getAdapter() == ((x10) this.Y2).U && T(view).f45742f == 1) {
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
                ((e3) this.Y2).invalidate();
                return;
            case 9:
                super.invalidate();
                View view = ((vr) this.Y2).fragmentView;
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
                qm qmVar = (qm) this.Y2;
                qmVar.invalidate();
                qmVar.f28753b.X1(qmVar, i11);
                pm pmVar = qmVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (pmVar.f29435x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = pmVar.d();
                    if (d.length == pmVar.f29435x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == pmVar.f29435x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    pmVar.f29435x = pmVar.d();
                }
                if (z10) {
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
        switch (this.X2) {
            case 7:
                super.onAttachedToWindow();
                hg.o1 o1Var = ((co) this.Y2).M3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.f11197r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                hg.o1 o1Var = ((co) this.Y2).M3;
                if (o1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.E);
                    NotificationCenter.getInstance(o1Var.f11197r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                st q6 = st.q();
                di.z1 z1Var = (di.z1) this.Y2;
                boolean r10 = q6.r(motionEvent, z1Var.f8506b, z1Var.f8509f, this.f28224p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((qq) this.Y2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((jj) this.Y2).f28753b.f31266b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((qm) this.Y2).J != null) {
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
                    ((kz) this.Y2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = st.q().r(motionEvent, ((bv0) this.Y2).f24799b, null, this.f28224p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                ux0 ux0Var = (ux0) this.Y2;
                if (ux0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = st.q().r(motionEvent, ux0Var.f30994c, ux0Var.m0, this.f28224p2);
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
                ((gl) this.Y2).e0();
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((vm0) this.Y2).a();
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
                if (((qq) this.Y2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((jj) this.Y2).f28753b.f31266b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((qm) this.Y2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new g10(this, 2), 250L);
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
                if (!((org.telegram.ui.k1) this.Y2).f37883r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((n00) this.Y2).f28588n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((bv0) this.Y2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((ux0) this.Y2).f31001g0) {
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
                ((k00) this.Y2).invalidate();
                return;
            case 25:
                super.setAlpha(f7);
                ((h81) this.Y2).invalidate();
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

    public o0(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    public o0(kz kzVar, Context context, iz izVar) {
        super(context, null);
        this.X2 = 15;
        this.Y2 = kzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, this.f28224p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        hg.b0 b0Var = new hg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(izVar);
    }

    private final void v1(int i10, int i11) {
    }
}
