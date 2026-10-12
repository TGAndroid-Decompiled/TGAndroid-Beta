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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.y71;
import org.telegram.ui.Components.zl;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
import org.telegram.ui.fy;
import org.telegram.ui.h10;
import org.telegram.ui.qq;
import org.telegram.ui.ut;
import org.telegram.ui.uw;
import org.telegram.ui.wr;
import org.telegram.ui.wz;
import org.telegram.ui.y00;
import org.telegram.ui.y10;
public final class w0 extends wm0 {
    public final int V2;
    public final Object W2;

    public w0(Object obj, Context context, int i10) {
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
                aj ajVar = ((hg.j0) this.W2).f30574b;
                int dp = AndroidUtilities.dp(30.0f) + ajVar.f24340e2[0];
                if (!ajVar.f24345g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                aj ajVar2 = ((ek) this.W2).f30574b;
                int dp2 = AndroidUtilities.dp(30.0f) + ajVar2.f24340e2[0];
                if (!ajVar2.f24345g0) {
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
                if (view != ((org.telegram.ui.b7) this.W2).Q) {
                    return true;
                }
                return false;
            case 16:
                d10 d10Var = (d10) this.W2;
                if (d10Var.isEnabled() && !((uw) d10Var.J).f42601b.f42931j2) {
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
                if (((d10) this.W2).f25180n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((b10) view).f24534f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((t91) this.W2).f30817n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((r91) view).f30110c;
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
                if (getAdapter() != null && ((y71) this.W2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        y00 y00Var;
        switch (this.V2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.W2);
                org.telegram.ui.ActionBar.c6 c6Var = this.f32467n2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20780p7, c6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, c6Var));
            case 27:
                ArrayList arrayList = ((h10) this.W2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    y00Var = (y00) arrayList.get(i10);
                } else {
                    y00Var = null;
                }
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f32467n2;
                if (y00Var != null && y00Var.f44227l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20780p7, c6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, c6Var2));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.V2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((t91) this.W2).V) {
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
        switch (this.V2) {
            case 0:
                s3 s3Var = (s3) this.W2;
                int i10 = -1;
                if (!s3Var.f1513f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof h1) && (m1Var = ((h1) childAt).K) != null) {
                                i10 = m1Var.f1378a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > s3Var.F) {
                    s3Var.F = i10;
                    c cVar = s3Var.f1697i0.X1;
                    if (cVar != null) {
                        cVar.setCount(s3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                sf sfVar = (sf) this.W2;
                w0 w0Var = sfVar.f9492c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = sfVar.h - AndroidUtilities.dp(8.0f);
                    sfVar.f9493e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = sfVar.f9496r;
                    if (dVar != null) {
                        dVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), sfVar.d);
                    super.dispatchDraw(canvas);
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.j8) this.W2).F = false;
                return;
            case 21:
                fy fyVar = (fy) this.W2;
                s4.d0 d0Var = fyVar.f27592c0;
                s4.j jVar = fyVar.f27590a0;
                cp0 cp0Var = fyVar.f27591b0;
                if (cp0Var != null && jVar != null && d0Var != null && cp0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = cp0Var.h() - 1;
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
                if (cp0Var != null && jVar != null && d0Var != null && cp0Var.m0) {
                    canvas.restore();
                }
                if (cp0Var != null && cp0Var.f10630o0 != null) {
                    canvas.save();
                    canvas.translate(cp0Var.f10630o0.getLeft(), cp0Var.f10630o0.getTranslationY() + cp0Var.f10630o0.getTop());
                    cp0Var.f10630o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((y10) this.W2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f47893f == 1) {
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
                if (((s3) obj).f1513f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                nl0 nl0Var = (nl0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && nl0Var.getPullingLeftProgress() > 0.95f) {
                        nl0.a(nl0Var);
                    } else if (nl0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = nl0Var.f28864y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(nl0Var.B0, 0.0f);
                        nl0Var.f28864y0 = ofFloat;
                        ofFloat.addUpdateListener(new m80(nl0Var, 7));
                        nl0Var.f28864y0.setDuration(150L);
                        nl0Var.f28864y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((to0) obj).f30909f;
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
        switch (this.V2) {
            case 18:
                zg.n0 n0Var = ((nl0) this.W2).f28846l0;
                if (n0Var != null && (view instanceof ll0) && ((ll0) view).f28232e.equals(n0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                dz0 dz0Var = (dz0) this.W2;
                com.google.firebase.messaging.n nVar = dz0Var.f25492l0;
                if ((view instanceof org.telegram.ui.Cells.f8) && dz0Var.R) {
                    int b10 = dz0Var.f25480c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) nVar.d;
                    float f7 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) nVar.f7953e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) nVar.f7954f;
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
                if (getAdapter() == ((y10) this.W2).U && T(view).f47893f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.V2) {
            case 0:
                super.invalidate();
                ((s3) this.W2).invalidate();
                return;
            case 9:
                super.invalidate();
                View view = ((wr) this.W2).fragmentView;
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
                jn jnVar = (jn) this.W2;
                jnVar.invalidate();
                jnVar.f30574b.b2(jnVar, i11);
                in inVar = jnVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (inVar.f27241x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = inVar.d();
                    if (d.length == inVar.f27241x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == inVar.f27241x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    inVar.f27241x = inVar.d();
                }
                if (z10) {
                    inVar.invalidate();
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
                gg.n1 n1Var = ((eo) this.W2).M3;
                if (n1Var != null) {
                    NotificationCenter.getInstance(n1Var.f10741r).addObserver(n1Var, NotificationCenter.storiesListUpdated);
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
                gg.n1 n1Var = ((eo) this.W2).M3;
                if (n1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n1Var.E);
                    NotificationCenter.getInstance(n1Var.f10741r).removeObserver(n1Var, NotificationCenter.storiesListUpdated);
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
                ut q6 = ut.q();
                ci.y1 y1Var = (ci.y1) this.W2;
                boolean r10 = q6.r(motionEvent, y1Var.f6339b, y1Var.f6342f, this.f32467n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((qq) this.W2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((pj) this.W2).f30574b.f24340e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((jn) this.W2).J != null) {
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
                    ((d00) this.W2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = ut.q().r(motionEvent, ((lw0) this.W2).f28302b, null, this.f32467n2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                dz0 dz0Var = (dz0) this.W2;
                if (dz0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = ut.q().r(motionEvent, dz0Var.f25480c, dz0Var.m0, this.f32467n2);
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
                ((zl) this.W2).h0();
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ho0) this.W2).a();
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
                if (((qq) this.W2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((pj) this.W2).f30574b.f24340e2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((jn) this.W2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new wz(this, 3), 250L);
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
                if (!((org.telegram.ui.k1) this.W2).f39319r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((g10) this.W2).f26217n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((lw0) this.W2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((dz0) this.W2).f25487g0) {
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
                ((d10) this.W2).invalidate();
                return;
            case 25:
                super.setAlpha(f7);
                ((t91) this.W2).invalidate();
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

    public w0(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = obj;
    }

    public w0(d00 d00Var, Context context, b00 b00Var) {
        super(context, null);
        this.V2 = 15;
        this.W2 = d00Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i6, this.f32467n2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.a0 a0Var = new gg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(b00Var);
    }

    private final void x1(int i10, int i11) {
    }
}
