package jh;

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
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.sj;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.y71;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a60;
import org.telegram.ui.dq;
import org.telegram.ui.fw;
import org.telegram.ui.g00;
import org.telegram.ui.h10;
import org.telegram.ui.ht;
import org.telegram.ui.jr;
import org.telegram.ui.ox;
import org.telegram.ui.p00;
import org.telegram.ui.q00;
import org.telegram.ui.tn;
public final class e1 extends jl0 {
    public final int T2;
    public final Object U2;

    public e1(Object obj, Context context, int i10) {
        super(context, null);
        this.T2 = i10;
        this.U2 = obj;
    }

    @Override
    public boolean E0(float f9) {
        int i10;
        switch (this.T2) {
            case 11:
                ni niVar = ((sj) this.U2).f28403b;
                int dp = AndroidUtilities.dp(30.0f) + niVar.X1[0];
                if (!niVar.f30994c0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f9 < dp + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f9);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.T2) {
            case 4:
                if (view != ((org.telegram.ui.x6) this.U2).M) {
                    return true;
                }
                return false;
            case 15:
                f00 f00Var = (f00) this.U2;
                if (f00Var.isEnabled() && !((fw) f00Var.F).f38242b.f38285f2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f9, float f10) {
        switch (this.T2) {
            case 0:
                ((j1) this.U2).getClass();
                return true;
            case 9:
                return ((org.telegram.ui.Components.xa) this.U2).t(view, f9, f10);
            case 15:
                if (((f00) this.U2).f28243n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((d00) view).f27615f;
                    float f11 = dp;
                    if (rectF.left - f11 < f9 && rectF.right + f11 > f9) {
                        return false;
                    }
                }
                return true;
            case 24:
                if (((y71) this.U2).f34957n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((w71) view).f34345c;
                    float f12 = dp2;
                    if (rectF2.left - f12 < f9 && rectF2.right + f12 > f9) {
                        return false;
                    }
                }
                return true;
            default:
                return super.H0(view, f9, f10);
        }
    }

    @Override
    public boolean S0() {
        switch (this.T2) {
            case 23:
                if (getAdapter() != null && ((f61) this.U2).D && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        g00 g00Var;
        switch (this.T2) {
            case 1:
                return 0;
            case 19:
                return 0;
            case 25:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.U2);
                org.telegram.ui.ActionBar.c6 c6Var = this.f29709l2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, c6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var));
            case 26:
                ArrayList arrayList = ((p00) this.U2).L;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    g00Var = (g00) arrayList.get(i10);
                } else {
                    g00Var = null;
                }
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f29709l2;
                if (g00Var != null && g00Var.f38408l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, c6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var2));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.T2) {
            case 24:
                super.addView(view, i10, layoutParams);
                if (((y71) this.U2).R) {
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
        lh.s0 s0Var;
        switch (this.T2) {
            case 1:
                lh.f2 f2Var = (lh.f2) this.U2;
                int i10 = -1;
                if (!f2Var.f16278b0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof lh.n0) && (s0Var = ((lh.n0) childAt).G) != null) {
                                i10 = s0Var.f16194a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > f2Var.B) {
                    f2Var.B = i10;
                    lh.a aVar = f2Var.f15589e0.T1;
                    if (aVar != null) {
                        aVar.setCount(f2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 5:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.f8) this.U2).B = false;
                return;
            case 20:
                ox oxVar = (ox) this.U2;
                f2.j0 j0Var = oxVar.V;
                f2.l lVar = oxVar.T;
                mn0 mn0Var = oxVar.U;
                if (mn0Var != null && lVar != null && j0Var != null && mn0Var.f47149i0) {
                    canvas.save();
                    invalidate();
                    int h = mn0Var.h() - 1;
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
                if (mn0Var != null && lVar != null && j0Var != null && mn0Var.f47149i0) {
                    canvas.restore();
                }
                if (mn0Var != null && mn0Var.f47151k0 != null) {
                    canvas.save();
                    canvas.translate(mn0Var.f47151k0.getLeft(), mn0Var.f47151k0.getTranslationY() + mn0Var.f47151k0.getTop());
                    mn0Var.f47151k0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                if (getAdapter() == ((h10) this.U2).Q) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f6436f == 1) {
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
            case 29:
                super.dispatchDraw(canvas);
                a60 a60Var = (a60) this.U2;
                if (a60Var.f36440v0 != null && a60Var.f36441w0 >= 1.0f) {
                    canvas.save();
                    canvas.translate(0.0f, -(a60Var.f36440v0.getMeasuredHeight() - a60.f1(a60Var).getMeasuredHeight()));
                    a60Var.f36440v0.draw(canvas);
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
        int i10 = this.T2;
        Object obj = this.U2;
        switch (i10) {
            case 1:
                if (((lh.f2) obj).f16278b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 17:
                fk0 fk0Var = (fk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && fk0Var.getPullingLeftProgress() > 0.95f) {
                        fk0.a(fk0Var);
                    } else if (fk0Var.f28469x0 != 0.0f) {
                        ValueAnimator valueAnimator = fk0Var.f28464u0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fk0Var.f28469x0, 0.0f);
                        fk0Var.f28464u0 = ofFloat;
                        ofFloat.addUpdateListener(new d70(fk0Var, 6));
                        fk0Var.f28464u0.setDuration(150L);
                        fk0Var.f28464u0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                LinearLayout linearLayout = ((en0) obj).f28120f;
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
            case 17:
                kg.q0 q0Var = ((fk0) this.U2).f28449h0;
                if (q0Var != null && (view instanceof dk0) && ((dk0) view).f27797e.equals(q0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 22:
                nx0 nx0Var = (nx0) this.U2;
                bg.c2 c2Var = nx0Var.f31179h0;
                if ((view instanceof org.telegram.ui.Cells.b8) && nx0Var.N) {
                    int b10 = nx0Var.f31171c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) c2Var.d;
                    float f9 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) c2Var.f2121e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) c2Var.f2122f;
                    if (!arrayList3.isEmpty()) {
                        f9 = ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.translate(floatValue2, f9);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 27:
                if (getAdapter() == ((h10) this.U2).Q && T(view).f6436f == 1) {
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
                ((lh.f2) this.U2).invalidate();
                return;
            case 8:
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
    public void k0(int i10, int i11) {
        boolean z10;
        switch (this.T2) {
            case 13:
                lm lmVar = (lm) this.U2;
                lmVar.invalidate();
                lmVar.f28403b.X1(lmVar, i11);
                km kmVar = lmVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (kmVar.f30105x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = kmVar.d();
                    if (d.length == kmVar.f30105x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == kmVar.f30105x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    kmVar.f30105x = kmVar.d();
                }
                if (z10) {
                    kmVar.invalidate();
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
            case 6:
                super.onAttachedToWindow();
                rf.z0 z0Var = ((tn) this.U2).I3;
                if (z0Var != null) {
                    NotificationCenter.getInstance(z0Var.f47415r).addObserver(z0Var, NotificationCenter.storiesListUpdated);
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
            case 6:
                super.onDetachedFromWindow();
                rf.z0 z0Var = ((tn) this.U2).I3;
                if (z0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(z0Var.A);
                    NotificationCenter.getInstance(z0Var.f47415r).removeObserver(z0Var, NotificationCenter.storiesListUpdated);
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
                ht q6 = ht.q();
                nh.t1 t1Var = (nh.t1) this.U2;
                boolean r6 = q6.r(motionEvent, t1Var.f18579b, t1Var.f18582f, this.f29709l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r6) {
                    return false;
                }
                return true;
            case 7:
                if (((dq) this.U2).D) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 10:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((bj) this.U2).f28403b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (((lm) this.U2).F != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z10);
                    ((fz) this.U2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 21:
                boolean r9 = ht.q().r(motionEvent, ((uu0) this.U2).f33318b, null, this.f29709l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r9) {
                    return false;
                }
                return true;
            case 22:
                nx0 nx0Var = (nx0) this.U2;
                if (nx0Var.N) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r10 = ht.q().r(motionEvent, nx0Var.f31171c, nx0Var.f31180i0, this.f29709l2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T2) {
            case 0:
                j1 j1Var = (j1) this.U2;
                j1Var.s();
                super.onLayout(z10, i10, i11, i12, i13);
                j1Var.Q(2);
                return;
            case 9:
                ((org.telegram.ui.Components.xa) this.U2).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ((bl) this.U2).e0();
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                ((tm0) this.U2).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.T2) {
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
        switch (this.T2) {
            case 7:
                if (((dq) this.U2).D) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((bj) this.U2).f28403b.X1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 13:
                if (((lm) this.U2).F != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 28:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new q00(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.T2) {
            case 26:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.T2) {
            case 3:
                if (!((org.telegram.ui.n1) this.U2).f40681r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 16:
                if (!((j00) this.U2).f29517n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((uu0) this.U2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((nx0) this.U2).f31172c0) {
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
    public void setAlpha(float f9) {
        switch (this.T2) {
            case 15:
                super.setAlpha(f9);
                ((f00) this.U2).invalidate();
                return;
            case 24:
                super.setAlpha(f9);
                ((y71) this.U2).invalidate();
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.T2) {
            case 23:
                super.setTranslationY(f9);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    public e1(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = obj;
    }

    public e1(fz fzVar, Context context, dz dzVar) {
        super(context, null);
        this.T2 = 14;
        this.U2 = fzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, this.f29709l2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(6);
        kVar.j1(0);
        setLayoutManager(kVar);
        setAdapter(dzVar);
    }
}
