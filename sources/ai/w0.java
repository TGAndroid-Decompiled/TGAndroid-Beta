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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.yj;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ey;
import org.telegram.ui.f10;
import org.telegram.ui.g10;
import org.telegram.ui.nq;
import org.telegram.ui.sr;
import org.telegram.ui.st;
import org.telegram.ui.tw;
import org.telegram.ui.w00;
import org.telegram.ui.x10;
import org.telegram.ui.zn;
public final class w0 extends vl0 {
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
                vi viVar = ((hg.i0) this.Y2).f26655b;
                int dp = AndroidUtilities.dp(30.0f) + viVar.f29086b2[0];
                if (!viVar.f29101g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                vi viVar2 = ((yj) this.Y2).f26655b;
                int dp2 = AndroidUtilities.dp(30.0f) + viVar2.f29086b2[0];
                if (!viVar2.f29101g0) {
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
                if (view != ((org.telegram.ui.z6) this.Y2).U) {
                    return true;
                }
                return false;
            case 16:
                k00 k00Var = (k00) this.Y2;
                if (k00Var.isEnabled() && !((tw) k00Var.J).f37889b.f38284j2) {
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
                return ((org.telegram.ui.Components.ab) this.Y2).t(view, f7, f10);
            case 16:
                if (((k00) this.Y2).f25586n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((i00) view).f24811f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((w81) this.Y2).f29997n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((u81) view).f28624c;
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
                if (getAdapter() != null && ((c71) this.Y2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.T0();
        }
    }

    @Override
    public Integer X0(int i10) {
        w00 w00Var;
        switch (this.X2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.Y2);
                org.telegram.ui.ActionBar.f6 f6Var = this.f29207p2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19315p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, f6Var));
            case 27:
                ArrayList arrayList = ((f10) this.Y2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    w00Var = (w00) arrayList.get(i10);
                } else {
                    w00Var = null;
                }
                org.telegram.ui.ActionBar.f6 f6Var2 = this.f29207p2;
                if (w00Var != null && w00Var.f38636l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19315p7, f6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, f6Var2));
            default:
                return super.X0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.X2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((w81) this.Y2).V) {
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
                if (!r3Var.f1335f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof h1) && (m1Var = ((h1) childAt).K) != null) {
                                i10 = m1Var.f1227a;
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
                nf nfVar = (nf) this.Y2;
                w0 w0Var = nfVar.f8740c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = nfVar.f8743r;
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
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.i8) this.Y2).F = false;
                return;
            case 21:
                ey eyVar = (ey) this.Y2;
                s4.c0 c0Var = eyVar.f26197d0;
                s4.j jVar = eyVar.f26195b0;
                eo0 eo0Var = eyVar.f26196c0;
                if (eo0Var != null && jVar != null && c0Var != null && eo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = eo0Var.h() - 1;
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
                if (eo0Var != null && jVar != null && c0Var != null && eo0Var.m0) {
                    canvas.restore();
                }
                if (eo0Var != null && eo0Var.f9778o0 != null) {
                    canvas.save();
                    canvas.translate(eo0Var.f9778o0.getLeft(), eo0Var.f9778o0.getTranslationY() + eo0Var.f9778o0.getTop());
                    eo0Var.f9778o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((x10) this.Y2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (U(getChildAt(i13)).f42977f == 1) {
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
                if (((r3) obj).f1335f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                pk0 pk0Var = (pk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && pk0Var.getPullingLeftProgress() > 0.95f) {
                        pk0.a(pk0Var);
                    } else if (pk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = pk0Var.f27378y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(pk0Var.B0, 0.0f);
                        pk0Var.f27378y0 = ofFloat;
                        ofFloat.addUpdateListener(new p70(pk0Var, 6));
                        pk0Var.f27378y0.setDuration(150L);
                        pk0Var.f27378y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((un0) obj).f28779f;
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
                zg.o0 o0Var = ((pk0) this.Y2).f27360l0;
                if (o0Var != null && (view instanceof nk0) && ((nk0) view).e.equals(o0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                gy0 gy0Var = (gy0) this.Y2;
                com.google.firebase.messaging.n nVar = gy0Var.f24490l0;
                if ((view instanceof org.telegram.ui.Cells.g8) && gy0Var.R) {
                    int b10 = gy0Var.f24479c.U(view).b();
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
                    ArrayList arrayList3 = (ArrayList) nVar.f7333f;
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
                if (getAdapter() == ((x10) this.Y2).U && U(view).f42977f == 1) {
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
                View view = ((sr) this.Y2).fragmentView;
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
    public void l0(int i10, int i11) {
        boolean z10;
        switch (this.X2) {
            case 3:
                return;
            case 14:
                qm qmVar = (qm) this.Y2;
                qmVar.invalidate();
                qmVar.f26655b.X1(qmVar, i11);
                pm pmVar = qmVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (pmVar.f27393x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = pmVar.d();
                    if (d.length == pmVar.f27393x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == pmVar.f27393x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    pmVar.f27393x = pmVar.d();
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
    public void m(Canvas canvas, View view, long j3) {
        switch (this.X2) {
            case 5:
                if (view != ((org.telegram.ui.z6) this.Y2).M) {
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
                gg.o1 o1Var = ((zn) this.Y2).M3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.f9880r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                gg.o1 o1Var = ((zn) this.Y2).M3;
                if (o1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.E);
                    NotificationCenter.getInstance(o1Var.f9880r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                ci.z1 z1Var = (ci.z1) this.Y2;
                boolean r10 = q6.r(motionEvent, z1Var.f5857b, z1Var.f5859f, this.f29207p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((nq) this.Y2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((jj) this.Y2).f26655b.f29086b2[0] - AndroidUtilities.dp(80.0f)) {
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
                boolean r11 = st.q().r(motionEvent, ((nv0) this.Y2).f26741b, null, this.f29207p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                gy0 gy0Var = (gy0) this.Y2;
                if (gy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = st.q().r(motionEvent, gy0Var.f24479c, gy0Var.m0, this.f29207p2);
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
                ((org.telegram.ui.Components.ab) this.Y2).s();
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
                ((in0) this.Y2).a();
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
                if (((nq) this.Y2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((jj) this.Y2).f26655b.f29086b2[0] - AndroidUtilities.dp(80.0f)) {
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
                if (!((org.telegram.ui.j1) this.Y2).f34727r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((n00) this.Y2).f26524n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((nv0) this.Y2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((gy0) this.Y2).f24485g0) {
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
                ((w81) this.Y2).invalidate();
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

    public w0(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    public w0(kz kzVar, Context context, iz izVar) {
        super(context, null);
        this.X2 = 15;
        this.Y2 = kzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, this.f29207p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(izVar);
    }

    private final void x1(int i10, int i11) {
    }
}
