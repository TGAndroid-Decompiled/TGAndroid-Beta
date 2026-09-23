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
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ay;
import org.telegram.ui.c10;
import org.telegram.ui.d10;
import org.telegram.ui.lq;
import org.telegram.ui.pt;
import org.telegram.ui.qr;
import org.telegram.ui.qw;
import org.telegram.ui.t00;
import org.telegram.ui.u10;
import org.telegram.ui.xn;
public final class w0 extends ml0 {
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
                wi wiVar = ((hg.k0) this.Y2).f26744b;
                int dp = AndroidUtilities.dp(30.0f) + wiVar.f29653b2[0];
                if (!wiVar.f29668g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                wi wiVar2 = ((zj) this.Y2).f26744b;
                int dp2 = AndroidUtilities.dp(30.0f) + wiVar2.f29653b2[0];
                if (!wiVar2.f29668g0) {
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
                l00 l00Var = (l00) this.Y2;
                if (l00Var.isEnabled() && !((qw) l00Var.J).f36622b.f37006j2) {
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
                if (((l00) this.Y2).f25749n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((j00) view).f25095f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((g81) this.Y2).f24224n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((e81) view).f23601c;
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
                if (getAdapter() != null && ((n61) this.Y2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.S0();
        }
    }

    @Override
    public Integer W0(int i10) {
        t00 t00Var;
        switch (this.X2) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.Y2);
                org.telegram.ui.ActionBar.d6 d6Var = this.f26222p2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19008p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var));
            case 27:
                ArrayList arrayList = ((c10) this.Y2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    t00Var = (t00) arrayList.get(i10);
                } else {
                    t00Var = null;
                }
                org.telegram.ui.ActionBar.d6 d6Var2 = this.f26222p2;
                if (t00Var != null && t00Var.f37483l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19008p7, d6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, d6Var2));
            default:
                return super.W0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.X2) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((g81) this.Y2).V) {
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
                nf nfVar = (nf) this.Y2;
                w0 w0Var = nfVar.f8723c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = nfVar.h - AndroidUtilities.dp(8.0f);
                    nfVar.e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = nfVar.f8726r;
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
                ((org.telegram.ui.h8) this.Y2).F = false;
                return;
            case 21:
                ay ayVar = (ay) this.Y2;
                s4.c0 c0Var = ayVar.f30336c0;
                s4.j jVar = ayVar.f30334a0;
                rn0 rn0Var = ayVar.f30335b0;
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
                if (rn0Var != null && rn0Var.f9760o0 != null) {
                    canvas.save();
                    canvas.translate(rn0Var.f9760o0.getLeft(), rn0Var.f9760o0.getTranslationY() + rn0Var.f9760o0.getTop());
                    rn0Var.f9760o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((u10) this.Y2).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f42630f == 1) {
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
                gk0 gk0Var = (gk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && gk0Var.getPullingLeftProgress() > 0.95f) {
                        gk0.a(gk0Var);
                    } else if (gk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = gk0Var.f24361y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(gk0Var.B0, 0.0f);
                        gk0Var.f24361y0 = ofFloat;
                        ofFloat.addUpdateListener(new i70(gk0Var, 6));
                        gk0Var.f24361y0.setDuration(150L);
                        gk0Var.f24361y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((in0) obj).f25007f;
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
                zg.p0 p0Var = ((gk0) this.Y2).f24343l0;
                if (p0Var != null && (view instanceof ek0) && ((ek0) view).e.equals(p0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                ux0 ux0Var = (ux0) this.Y2;
                com.google.firebase.messaging.n nVar = ux0Var.f28580l0;
                if ((view instanceof org.telegram.ui.Cells.g8) && ux0Var.R) {
                    int b10 = ux0Var.f28569c.T(view).b();
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
                    ArrayList arrayList3 = (ArrayList) nVar.f7322f;
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
                if (getAdapter() == ((u10) this.Y2).U && T(view).f42630f == 1) {
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
    public void k0(int i10, int i11) {
        boolean z10;
        switch (this.X2) {
            case 3:
                return;
            case 14:
                rm rmVar = (rm) this.Y2;
                rmVar.invalidate();
                rmVar.f26744b.X1(rmVar, i11);
                qm qmVar = rmVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (qmVar.f27398x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = qmVar.d();
                    if (d.length == qmVar.f27398x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == qmVar.f27398x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    qmVar.f27398x = qmVar.d();
                }
                if (z10) {
                    qmVar.invalidate();
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
                gg.o1 o1Var = ((xn) this.Y2).M3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.f9862r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                    NotificationCenter.getInstance(o1Var.f9862r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
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
                pt q6 = pt.q();
                ci.z1 z1Var = (ci.z1) this.Y2;
                boolean r10 = q6.r(motionEvent, z1Var.f5902b, z1Var.f5904f, this.f26222p2);
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((kj) this.Y2).f26744b.f29653b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((rm) this.Y2).J != null) {
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
                    ((lz) this.Y2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = pt.q().r(motionEvent, ((cv0) this.Y2).f23107b, null, this.f26222p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                ux0 ux0Var = (ux0) this.Y2;
                if (ux0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = pt.q().r(motionEvent, ux0Var.f28569c, ux0Var.m0, this.f26222p2);
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
                ((hl) this.Y2).e0();
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((wm0) this.Y2).a();
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((kj) this.Y2).f26744b.f29653b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((rm) this.Y2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 29:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new d10(this, 2), 250L);
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
                if (!((org.telegram.ui.k1) this.Y2).f34546r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((o00) this.Y2).f26557n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((cv0) this.Y2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((ux0) this.Y2).f28575g0) {
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
                ((l00) this.Y2).invalidate();
                return;
            case 25:
                super.setAlpha(f7);
                ((g81) this.Y2).invalidate();
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

    public w0(lz lzVar, Context context, jz jzVar) {
        super(context, null);
        this.X2 = 15;
        this.Y2 = lzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, this.f26222p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(jzVar);
    }

    private final void w1(int i10, int i11) {
    }
}
