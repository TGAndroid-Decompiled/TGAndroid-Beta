package lh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.zi;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.c10;
import org.telegram.ui.d10;
import org.telegram.ui.lq;
import org.telegram.ui.mp0;
import org.telegram.ui.o60;
import org.telegram.ui.qw;
import org.telegram.ui.rr;
import org.telegram.ui.rt;
import org.telegram.ui.t00;
import org.telegram.ui.u10;
import org.telegram.ui.xo0;
import org.telegram.ui.zn;
import org.telegram.ui.zx;
public final class e1 extends rl0 {
    public final int U2;
    public final Object V2;

    public e1(Object obj, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = obj;
    }

    @Override
    public boolean E0(float f10) {
        int i10;
        switch (this.U2) {
            case 10:
                li liVar = ((qj) this.V2).f24282b;
                int dp = AndroidUtilities.dp(30.0f) + liVar.Y1[0];
                if (!liVar.f26688d0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f10 < dp + i10) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public boolean F0(View view) {
        switch (this.U2) {
            case 3:
                if (view != ((org.telegram.ui.d7) this.V2).N) {
                    return true;
                }
                return false;
            case 14:
                k00 k00Var = (k00) this.V2;
                if (k00Var.isEnabled() && !((qw) k00Var.G).f37510b.f37555g2) {
                    return true;
                }
                return false;
            default:
                return super.F0(view);
        }
    }

    @Override
    public boolean H0(View view, float f10, float f11) {
        switch (this.U2) {
            case 0:
                ((j1) this.V2).getClass();
                return true;
            case 8:
                return ((org.telegram.ui.Components.sa) this.V2).t(view, f10, f11);
            case 14:
                if (((k00) this.V2).f26106n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((i00) view).f25540f;
                    float f12 = dp;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        return false;
                    }
                }
                return true;
            case 23:
                if (((k81) this.V2).f26224n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((i81) view).f25645c;
                    float f13 = dp2;
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
    public boolean R0() {
        switch (this.U2) {
            case 22:
                if (getAdapter() != null && ((q61) this.V2).E && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i10) {
        t00 t00Var;
        switch (this.U2) {
            case 1:
                return 0;
            case 18:
                return 0;
            case 24:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.V2);
                org.telegram.ui.ActionBar.f6 f6Var = this.f28511m2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20097p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var));
            case 25:
                ArrayList arrayList = ((c10) this.V2).M;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    t00Var = (t00) arrayList.get(i10);
                } else {
                    t00Var = null;
                }
                org.telegram.ui.ActionBar.f6 f6Var2 = this.f28511m2;
                if (t00Var != null && t00Var.f38349l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20097p7, f6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var2));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.U2) {
            case 23:
                super.addView(view, i10, layoutParams);
                if (((k81) this.V2).S) {
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
        nh.t0 t0Var;
        ArrayList arrayList;
        View view;
        switch (this.U2) {
            case 1:
                nh.g2 g2Var = (nh.g2) this.V2;
                int i10 = -1;
                if (!g2Var.f15954c0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof nh.o0) && (t0Var = ((nh.o0) childAt).H) != null) {
                                i10 = t0Var.f15876a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > g2Var.C) {
                    g2Var.C = i10;
                    nh.a aVar = g2Var.f15326f0.U1;
                    if (aVar != null) {
                        aVar.setCount(g2Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.l8) this.V2).C = false;
                return;
            case 19:
                zx zxVar = (zx) this.V2;
                f2.i0 i0Var = zxVar.W;
                f2.l lVar = zxVar.U;
                vn0 vn0Var = zxVar.V;
                if (vn0Var != null && lVar != null && i0Var != null && vn0Var.f44964j0) {
                    canvas.save();
                    invalidate();
                    int h = vn0Var.h() - 1;
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
                if (vn0Var != null && lVar != null && i0Var != null && vn0Var.f44964j0) {
                    canvas.restore();
                }
                if (vn0Var != null && vn0Var.f44966l0 != null) {
                    canvas.save();
                    canvas.translate(vn0Var.f44966l0.getLeft(), vn0Var.f44966l0.getTranslationY() + vn0Var.f44966l0.getTop());
                    vn0Var.f44966l0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                if (getAdapter() == ((u10) this.V2).R) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f5777f == 1) {
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
            case 28:
                super.dispatchDraw(canvas);
                o60 o60Var = (o60) this.V2;
                if (o60Var.f36660w0 != null && o60Var.f36661x0 >= 1.0f) {
                    canvas.save();
                    canvas.translate(0.0f, -(o60Var.f36660w0.getMeasuredHeight() - o60.f1(o60Var).getMeasuredHeight()));
                    o60Var.f36660w0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                mp0 mp0Var = (mp0) this.V2;
                Paint paint = mp0Var.f36156w;
                RectF rectF = mp0Var.f36155s;
                RectF rectF2 = mp0Var.f36154r;
                RectF rectF3 = mp0Var.f36153n;
                f2.i0 i0Var2 = mp0Var.f36150b;
                if (!mp0Var.f36152f.isEmpty()) {
                    float d = mp0Var.e.d(mp0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), arrayList.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), arrayList.size() - 1, 0);
                    View m9 = i0Var2.m(clamp);
                    View m10 = i0Var2.m(clamp2);
                    if (m9 != null || m10 != null) {
                        if (m9 != null) {
                            view = m9;
                        } else {
                            view = m10;
                        }
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m10 != null) {
                            m9 = m10;
                        }
                        rectF2.set(m9.getLeft(), m9.getTop(), m9.getRight(), m9.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(mp0Var.f36157x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        return;
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
        int i10 = this.U2;
        Object obj = this.V2;
        switch (i10) {
            case 1:
                if (((nh.g2) obj).f15954c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                pk0 pk0Var = (pk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && pk0Var.getPullingLeftProgress() > 0.95f) {
                        pk0.a(pk0Var);
                    } else if (pk0Var.f27920y0 != 0.0f) {
                        ValueAnimator valueAnimator = pk0Var.f27914v0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(pk0Var.f27920y0, 0.0f);
                        pk0Var.f27914v0 = ofFloat;
                        ofFloat.addUpdateListener(new j70(pk0Var, 6));
                        pk0Var.f27914v0.setDuration(150L);
                        pk0Var.f27914v0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                LinearLayout linearLayout = ((nn0) obj).f27311f;
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
        switch (this.U2) {
            case 16:
                mg.q0 q0Var = ((pk0) this.V2).f27899i0;
                if (q0Var != null && (view instanceof nk0) && ((nk0) view).e.equals(q0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 21:
                xx0 xx0Var = (xx0) this.V2;
                a9.a aVar = xx0Var.f30760i0;
                if ((view instanceof org.telegram.ui.Cells.c8) && xx0Var.O) {
                    int b10 = xx0Var.f30752c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) aVar.d;
                    float f10 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) aVar.e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) aVar.f145f;
                    if (!arrayList3.isEmpty()) {
                        f10 = ((Float) arrayList3.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.translate(floatValue2, f10);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    invalidate();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 26:
                if (getAdapter() == ((u10) this.V2).R && T(view).f5777f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void invalidate() {
        switch (this.U2) {
            case 1:
                super.invalidate();
                ((nh.g2) this.V2).invalidate();
                return;
            case 7:
                super.invalidate();
                View view = ((rr) this.V2).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 29:
                super.invalidate();
                xo0 xo0Var = ((mp0) this.V2).C;
                if (xo0Var != null) {
                    xo0Var.run();
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
        boolean z4;
        switch (this.U2) {
            case 12:
                nm nmVar = (nm) this.V2;
                nmVar.invalidate();
                nmVar.f24282b.X1(nmVar, i11);
                mm mmVar = nmVar.v;
                boolean z10 = true;
                int i12 = 0;
                if (mmVar.f27096x == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    boolean[] d = mmVar.d();
                    if (d.length == mmVar.f27096x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == mmVar.f27096x[i12]) {
                                    i12++;
                                }
                            } else {
                                z10 = z4;
                            }
                        }
                    }
                    z4 = z10;
                } else {
                    mmVar.f27096x = mmVar.d();
                }
                if (z4) {
                    mmVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.U2) {
            case 5:
                super.onAttachedToWindow();
                tf.y0 y0Var = ((zn) this.V2).J3;
                if (y0Var != null) {
                    NotificationCenter.getInstance(y0Var.f44948r).addObserver(y0Var, NotificationCenter.storiesListUpdated);
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
        switch (this.U2) {
            case 5:
                super.onDetachedFromWindow();
                tf.y0 y0Var = ((zn) this.V2).J3;
                if (y0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(y0Var.B);
                    NotificationCenter.getInstance(y0Var.f44948r).removeObserver(y0Var, NotificationCenter.storiesListUpdated);
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
        boolean z4;
        switch (this.U2) {
            case 6:
                if (((lq) this.V2).E) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((zi) this.V2).f24282b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (((nm) this.V2).G != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z4);
                    ((kz) this.V2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                boolean r10 = rt.q().r(motionEvent, ((cv0) this.V2).f24046b, null, this.f28511m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 21:
                xx0 xx0Var = (xx0) this.V2;
                if (xx0Var.O) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r11 = rt.q().r(motionEvent, xx0Var.f30752c, xx0Var.f30761j0, this.f28511m2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.U2) {
            case 0:
                j1 j1Var = (j1) this.V2;
                j1Var.s();
                super.onLayout(z4, i10, i11, i12, i13);
                j1Var.Q(2);
                return;
            case 8:
                ((org.telegram.ui.Components.sa) this.V2).s();
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 11:
                super.onLayout(z4, i10, i11, i12, i13);
                ((al) this.V2).e0();
                return;
            case 17:
                super.onLayout(z4, i10, i11, i12, i13);
                ((cn0) this.V2).a();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.U2) {
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
        switch (this.U2) {
            case 6:
                if (((lq) this.V2).E) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((zi) this.V2).f24282b.Y1[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (((nm) this.V2).G != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 27:
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
        switch (this.U2) {
            case 25:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.U2) {
            case 2:
                if (!((org.telegram.ui.n1) this.V2).f36304r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 15:
                if (!((o00) this.V2).f27420n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((cv0) this.V2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((xx0) this.V2).f30754d0) {
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
    public void setAlpha(float f10) {
        switch (this.U2) {
            case 14:
                super.setAlpha(f10);
                ((k00) this.V2).invalidate();
                return;
            case 23:
                super.setAlpha(f10);
                ((k81) this.V2).invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.U2) {
            case 22:
                super.setTranslationY(f10);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public e1(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.U2 = i10;
        this.V2 = obj;
    }

    public e1(kz kzVar, Context context, iz izVar) {
        super(context, null);
        this.U2 = 13;
        this.V2 = kzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, this.f28511m2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(6);
        kVar.j1(0);
        setLayoutManager(kVar);
        setAdapter(izVar);
    }
}
