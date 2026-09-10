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
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.yi;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
import org.telegram.ui.gy;
import org.telegram.ui.h10;
import org.telegram.ui.i10;
import org.telegram.ui.rq;
import org.telegram.ui.s60;
import org.telegram.ui.tt;
import org.telegram.ui.vw;
import org.telegram.ui.wr;
import org.telegram.ui.y00;
import org.telegram.ui.z10;
public final class y1 extends vl0 {
    public final int X2;
    public final Object Y2;

    public y1(Object obj, Context context, int i10) {
        super(context, null);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override
    public boolean E0(float f7) {
        int i10;
        int i11;
        switch (this.X2) {
            case 2:
                yi yiVar = ((gg.n0) this.Y2).f26422b;
                int dp = AndroidUtilities.dp(30.0f) + yiVar.f29354b2[0];
                if (!yiVar.f29369g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 11:
                yi yiVar2 = ((bk) this.Y2).f26422b;
                int dp2 = AndroidUtilities.dp(30.0f) + yiVar2.f29354b2[0];
                if (!yiVar2.f29369g0) {
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
            case 4:
                if (view != ((org.telegram.ui.y6) this.Y2).Q) {
                    return true;
                }
                return false;
            case 15:
                r00 r00Var = (r00) this.Y2;
                if (r00Var.isEnabled() && !((vw) r00Var.J).f37634b.f38459j2) {
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
            case 9:
                return ((org.telegram.ui.Components.ab) this.Y2).t(view, f7, f10);
            case 15:
                if (((r00) this.Y2).f26528n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((p00) view).f25956f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 24:
                if (((u81) this.Y2).f27630n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((s81) view).f26979c;
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
            case 23:
                if (getAdapter() != null && ((b71) this.Y2).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.R0();
        }
    }

    @Override
    public Integer V0(int i10) {
        y00 y00Var;
        switch (this.X2) {
            case 19:
                return 0;
            case 25:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.Y2);
                org.telegram.ui.ActionBar.f6 f6Var = this.f27987p2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18144p7, f6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var));
            case 26:
                ArrayList arrayList = ((h10) this.Y2).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    y00Var = (y00) arrayList.get(i10);
                } else {
                    y00Var = null;
                }
                org.telegram.ui.ActionBar.f6 f6Var2 = this.f27987p2;
                if (y00Var != null && y00Var.f38863l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18144p7, f6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var2));
            default:
                return super.V0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.X2) {
            case 24:
                super.addView(view, i10, layoutParams);
                if (((u81) this.Y2).V) {
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
        switch (this.X2) {
            case 1:
                pf pfVar = (pf) this.Y2;
                y1 y1Var = pfVar.f6532c;
                if (y1Var.getLayoutManager() != null && y1Var.getAdapter() != null && y1Var.getAdapter().h() != 0) {
                    float dp = pfVar.h - AndroidUtilities.dp(8.0f);
                    pfVar.e = dp - AndroidUtilities.dp(16.0f);
                    bh.d dVar = pfVar.f6535r;
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
            case 5:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.h8) this.Y2).F = false;
                return;
            case 20:
                gy gyVar = (gy) this.Y2;
                s4.c0 c0Var = gyVar.f23714c0;
                s4.j jVar = gyVar.f23712a0;
                ao0 ao0Var = gyVar.f23713b0;
                if (ao0Var != null && jVar != null && c0Var != null && ao0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = ao0Var.h() - 1;
                    int i10 = 0;
                    while (true) {
                        if (i10 < getChildCount()) {
                            View childAt = getChildAt(i10);
                            if (RecyclerView.R(childAt) == h) {
                                canvas.clipRect(0.0f, 0.0f, getWidth(), childAt.getTranslationY() + childAt.getBottom());
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                super.dispatchDraw(canvas);
                if (ao0Var != null && jVar != null && c0Var != null && ao0Var.m0) {
                    canvas.restore();
                }
                if (ao0Var != null && ao0Var.f8044o0 != null) {
                    canvas.save();
                    canvas.translate(ao0Var.f8044o0.getLeft(), ao0Var.f8044o0.getTranslationY() + ao0Var.f8044o0.getTop());
                    ao0Var.f8044o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                if (getAdapter() == ((z10) this.Y2).U) {
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (T(getChildAt(i11)).f41613f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i11).getX(), (getChildAt(i11).getY() - getChildAt(i11).getMeasuredHeight()) + AndroidUtilities.dp(2.0f));
                            getChildAt(i11).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 29:
                super.dispatchDraw(canvas);
                s60 s60Var = (s60) this.Y2;
                if (s60Var.f36561z0 != null && s60Var.A0 >= 1.0f) {
                    canvas.save();
                    canvas.translate(0.0f, -(s60Var.f36561z0.getMeasuredHeight() - s60.f1(s60Var).getMeasuredHeight()));
                    s60Var.f36561z0.draw(canvas);
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
        int i10 = this.X2;
        Object obj = this.Y2;
        switch (i10) {
            case 17:
                pk0 pk0Var = (pk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && pk0Var.getPullingLeftProgress() > 0.95f) {
                        pk0.a(pk0Var);
                    } else if (pk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = pk0Var.f26201y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(pk0Var.B0, 0.0f);
                        pk0Var.f26201y0 = ofFloat;
                        ofFloat.addUpdateListener(new q70(pk0Var, 6));
                        pk0Var.f26201y0.setDuration(150L);
                        pk0Var.f26201y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                LinearLayout linearLayout = ((rn0) obj).f26700f;
                if (linearLayout != null && linearLayout.getAlpha() > 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        float floatValue;
        float floatValue2;
        switch (this.X2) {
            case 17:
                yg.p0 p0Var = ((pk0) this.Y2).f26183l0;
                if (p0Var != null && (view instanceof nk0) && ((nk0) view).e.equals(p0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 22:
                hy0 hy0Var = (hy0) this.Y2;
                com.google.firebase.messaging.n nVar = hy0Var.f23817l0;
                if ((view instanceof org.telegram.ui.Cells.g8) && hy0Var.R) {
                    int b10 = hy0Var.f23806c.T(view).b();
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
                    ArrayList arrayList3 = (ArrayList) nVar.f6106f;
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
            case 27:
                if (getAdapter() == ((z10) this.Y2).U && T(view).f41613f == 1) {
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
            case 8:
                super.invalidate();
                View view = ((wr) this.Y2).fragmentView;
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
            case 2:
                return;
            case 13:
                xm xmVar = (xm) this.Y2;
                xmVar.invalidate();
                xmVar.f26422b.X1(xmVar, i11);
                wm wmVar = xmVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (wmVar.f28799x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = wmVar.d();
                    if (d.length == wmVar.f28799x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == wmVar.f28799x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    wmVar.f28799x = wmVar.d();
                }
                if (z10) {
                    wmVar.invalidate();
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
            case 6:
                super.onAttachedToWindow();
                fg.p1 p1Var = ((eo) this.Y2).M3;
                if (p1Var != null) {
                    NotificationCenter.getInstance(p1Var.f8172r).addObserver(p1Var, NotificationCenter.storiesListUpdated);
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
            case 6:
                super.onDetachedFromWindow();
                fg.p1 p1Var = ((eo) this.Y2).M3;
                if (p1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(p1Var.E);
                    NotificationCenter.getInstance(p1Var.f8172r).removeObserver(p1Var, NotificationCenter.storiesListUpdated);
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
            case 0:
                tt q6 = tt.q();
                k2 k2Var = (k2) this.Y2;
                boolean r10 = q6.r(motionEvent, k2Var.f2980b, k2Var.f2982f, this.f27987p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 7:
                if (((rq) this.Y2).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 10:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((mj) this.Y2).f26422b.f29354b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 13:
                if (((xm) this.Y2).J != null) {
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
                    ((rz) this.Y2).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 21:
                boolean r11 = tt.q().r(motionEvent, ((mv0) this.Y2).f25299b, null, this.f27987p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 22:
                hy0 hy0Var = (hy0) this.Y2;
                if (hy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = tt.q().r(motionEvent, hy0Var.f23806c, hy0Var.m0, this.f27987p2);
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
            case 9:
                ((org.telegram.ui.Components.ab) this.Y2).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ll) this.Y2).e0();
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                ((fn0) this.Y2).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.X2) {
            case 7:
                if (((rq) this.Y2).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((mj) this.Y2).f26422b.f29354b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 13:
                if (((xm) this.Y2).J != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 28:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.runOnUIThread(new i10(this, 2), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean requestFocus(int i10, Rect rect) {
        switch (this.X2) {
            case 26:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.X2) {
            case 3:
                if (!((org.telegram.ui.l1) this.Y2).f34506r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 16:
                if (!((u00) this.Y2).f27537n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((mv0) this.Y2).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((hy0) this.Y2).f23812g0) {
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
            case 15:
                super.setAlpha(f7);
                ((r00) this.Y2).invalidate();
                return;
            case 24:
                super.setAlpha(f7);
                ((u81) this.Y2).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.X2) {
            case 23:
                super.setTranslationY(f7);
                getLocationInWindow(new int[2]);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public y1(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    public y1(rz rzVar, Context context, pz pzVar) {
        super(context, null);
        this.X2 = 14;
        this.Y2 = rzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, this.f27987p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        fg.a0 a0Var = new fg.a0(8);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        setAdapter(pzVar);
    }

    private final void v1(int i10, int i11) {
    }
}
