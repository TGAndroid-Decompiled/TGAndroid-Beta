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
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.xj;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.f00;
import org.telegram.ui.ft;
import org.telegram.ui.gq;
import org.telegram.ui.h10;
import org.telegram.ui.jx;
import org.telegram.ui.kr;
import org.telegram.ui.o00;
import org.telegram.ui.rx;
import org.telegram.ui.un;
public final class r1 extends mm0 {
    public final int f5315f3;
    public final Object f5316g3;

    public r1(Object obj, Context context, int i10) {
        super(context, null);
        this.f5315f3 = i10;
        this.f5316g3 = obj;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        int i11;
        switch (this.f5315f3) {
            case 4:
                ti tiVar = ((jg.i0) this.f5316g3).f30213b;
                int dp = AndroidUtilities.dp(30.0f) + tiVar.f33016e2[0];
                if (!tiVar.f33021g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 13:
                ti tiVar2 = ((xj) this.f5316g3).f30213b;
                int dp2 = AndroidUtilities.dp(30.0f) + tiVar2.f33016e2[0];
                if (!tiVar2.f33021g0) {
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
        switch (this.f5315f3) {
            case 6:
                if (view != ((org.telegram.ui.c7) this.f5316g3).W) {
                    return true;
                }
                return false;
            case 17:
                s00 s00Var = (s00) this.f5316g3;
                if (s00Var.isEnabled() && !((rx) s00Var.J).f43307b.f38611j2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f7, float f10) {
        switch (this.f5315f3) {
            case 0:
                ((x1) this.f5316g3).getClass();
                return true;
            case 11:
                return ((org.telegram.ui.Components.bb) this.f5316g3).t(view, f7, f10);
            case 17:
                if (((s00) this.f5316g3).f32375n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((q00) view).f31760f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 26:
                if (((t91) this.f5316g3).f32935n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((r91) view).f32180c;
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
        switch (this.f5315f3) {
            case 25:
                if (getAdapter() != null && ((b81) this.f5316g3).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        f00 f00Var;
        switch (this.f5315f3) {
            case 1:
                return 0;
            case 21:
                return 0;
            case 27:
                int X = DataSettingsActivity.X((DataSettingsActivity) this.f5316g3);
                org.telegram.ui.ActionBar.u6 u6Var = this.f30644n2;
                if (i10 == X) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23579p7, u6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23446i6, u6Var));
            case 28:
                ArrayList arrayList = ((o00) this.f5316g3).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    f00Var = (f00) arrayList.get(i10);
                } else {
                    f00Var = null;
                }
                org.telegram.ui.ActionBar.u6 u6Var2 = this.f30644n2;
                if (f00Var != null && f00Var.f39231l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23579p7, u6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23446i6, u6Var2));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.f5315f3) {
            case 26:
                super.addView(view, i10, layoutParams);
                if (((t91) this.f5316g3).V) {
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
        di.v0 v0Var;
        switch (this.f5315f3) {
            case 1:
                di.m2 m2Var = (di.m2) this.f5316g3;
                int i10 = -1;
                if (!m2Var.f9349f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof di.q0) && (v0Var = ((di.q0) childAt).K) != null) {
                                i10 = v0Var.f9238a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > m2Var.F) {
                    m2Var.F = i10;
                    di.a aVar = m2Var.f8775i0.M1;
                    if (aVar != null) {
                        aVar.setCount(m2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                nf nfVar = (nf) this.f5316g3;
                r1 r1Var = nfVar.f12949c;
                if (r1Var.getLayoutManager() != null && r1Var.getAdapter() != null && r1Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    eh.d dVar = nfVar.f12952r;
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
                ((org.telegram.ui.n8) this.f5316g3).F = false;
                return;
            case 22:
                jx jxVar = (jx) this.f5316g3;
                s4.c0 c0Var = jxVar.f27935e0;
                s4.l lVar = jxVar.f27933c0;
                wo0 wo0Var = jxVar.f27934d0;
                if (wo0Var != null && lVar != null && c0Var != null && wo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = wo0Var.h() - 1;
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
                if (wo0Var != null && lVar != null && c0Var != null && wo0Var.m0) {
                    canvas.restore();
                }
                if (wo0Var != null && wo0Var.f14088o0 != null) {
                    canvas.save();
                    canvas.translate(wo0Var.f14088o0.getLeft(), wo0Var.f14088o0.getTranslationY() + wo0Var.f14088o0.getTop());
                    wo0Var.f14088o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                if (getAdapter() == ((h10) this.f5316g3).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f47738f == 1) {
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
        int i10 = this.f5315f3;
        Object obj = this.f5316g3;
        switch (i10) {
            case 1:
                if (((di.m2) obj).f9349f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                fl0 fl0Var = (fl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && fl0Var.getPullingLeftProgress() > 0.95f) {
                        fl0.a(fl0Var);
                    } else if (fl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = fl0Var.f28270y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fl0Var.B0, 0.0f);
                        fl0Var.f28270y0 = ofFloat;
                        ofFloat.addUpdateListener(new e80(fl0Var, 7));
                        fl0Var.f28270y0.setDuration(150L);
                        fl0Var.f28270y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 21:
                LinearLayout linearLayout = ((oo0) obj).f31337f;
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
        switch (this.f5315f3) {
            case 19:
                bh.x0 x0Var = ((fl0) this.f5316g3).f28252l0;
                if (x0Var != null && (view instanceof dl0) && ((dl0) view).e.equals(x0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                cz0 cz0Var = (cz0) this.f5316g3;
                aa.m0 m0Var = cz0Var.f27300l0;
                if ((view instanceof org.telegram.ui.Cells.i8) && cz0Var.R) {
                    int b10 = cz0Var.f27289c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) m0Var.d;
                    float f7 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) m0Var.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) m0Var.f1153f;
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
                if (getAdapter() == ((h10) this.f5316g3).U && T(view).f47738f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f5315f3) {
            case 1:
                super.invalidate();
                ((di.m2) this.f5316g3).invalidate();
                return;
            case 10:
                super.invalidate();
                View view = ((kr) this.f5316g3).fragmentView;
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
        switch (this.f5315f3) {
            case 4:
                return;
            case 15:
                cn cnVar = (cn) this.f5316g3;
                cnVar.invalidate();
                cnVar.f30213b.e2(cnVar, i10);
                bn bnVar = cnVar.v;
                boolean z11 = true;
                int i11 = 0;
                if (bnVar.f26912x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = bnVar.d();
                    if (d.length == bnVar.f26912x.length) {
                        while (true) {
                            if (i11 < d.length) {
                                if (d[i11] == bnVar.f26912x[i11]) {
                                    i11++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    bnVar.f26912x = bnVar.d();
                }
                if (z10) {
                    bnVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f5315f3) {
            case 8:
                super.onAttachedToWindow();
                ig.n1 n1Var = ((un) this.f5316g3).Y3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.f14184r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.f5315f3) {
            case 8:
                super.onDetachedFromWindow();
                ig.n1 n1Var = ((un) this.f5316g3).Y3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.f14184r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.f5315f3) {
            case 2:
                ft o10 = ft.o();
                fi.u1 u1Var = (fi.u1) this.f5316g3;
                boolean p10 = o10.p(motionEvent, u1Var.f11742b, u1Var.f11744f, this.f30644n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
                    return false;
                }
                return true;
            case 9:
                if (((gq) this.f5316g3).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.f5316g3).f30213b.f33016e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                if (((cn) this.f5316g3).J != null) {
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
                    ((sz) this.f5316g3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                boolean p11 = ft.o().p(motionEvent, ((ew0) this.f5316g3).f27995b, null, this.f30644n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p11) {
                    return false;
                }
                return true;
            case 24:
                cz0 cz0Var = (cz0) this.f5316g3;
                if (cz0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean p12 = ft.o().p(motionEvent, cz0Var.f27289c, cz0Var.m0, this.f30644n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !p12) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f5315f3) {
            case 0:
                ((x1) this.f5316g3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
                ((org.telegram.ui.Components.bb) this.f5316g3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.u1().z0();
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                ((sl) this.f5316g3).h0();
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((co0) this.f5316g3).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5315f3) {
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
        switch (this.f5315f3) {
            case 9:
                if (((gq) this.f5316g3).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((ij) this.f5316g3).f30213b.f33016e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 15:
                if (((cn) this.f5316g3).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.f5315f3) {
            case 28:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f5315f3) {
            case 5:
                if (!((org.telegram.ui.j1) this.f5316g3).f40382r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 18:
                if (!((v00) this.f5316g3).f33521r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((ew0) this.f5316g3).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 24:
                if (!((cz0) this.f5316g3).f27295g0) {
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
        switch (this.f5315f3) {
            case 17:
                super.setAlpha(f7);
                ((s00) this.f5316g3).invalidate();
                return;
            case 26:
                super.setAlpha(f7);
                ((t91) this.f5316g3).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5315f3) {
            case 25:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public r1(Object obj, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f5315f3 = i10;
        this.f5316g3 = obj;
    }

    public r1(sz szVar, Context context, qz qzVar) {
        super(context, null);
        this.f5315f3 = 16;
        this.f5316g3 = szVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.f23446i6, this.f30644n2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        ig.a0 a0Var = new ig.a0(8);
        a0Var.k1(0);
        setLayoutManager(a0Var);
        setAdapter(qzVar);
    }

    private final void C1(int i10) {
    }
}
