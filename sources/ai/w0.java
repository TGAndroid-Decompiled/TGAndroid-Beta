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
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dy;
import org.telegram.ui.f10;
import org.telegram.ui.g10;
import org.telegram.ui.ly;
import org.telegram.ui.mq;
import org.telegram.ui.rr;
import org.telegram.ui.rt;
import org.telegram.ui.w00;
import org.telegram.ui.x10;
import org.telegram.ui.yn;
public final class w0 extends zl0 {
    public final int f1786e3;
    public final Object f1787f3;

    public w0(Object obj, Context context, int i10) {
        super(context, null);
        this.f1786e3 = i10;
        this.f1787f3 = obj;
    }

    @Override
    public boolean F0(float f7) {
        int i10;
        int i11;
        switch (this.f1786e3) {
            case 3:
                xi xiVar = ((hg.i0) this.f1787f3).f29642b;
                int dp = AndroidUtilities.dp(30.0f) + xiVar.f32799b2[0];
                if (!xiVar.f32815g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                xi xiVar2 = ((bk) this.f1787f3).f29642b;
                int dp2 = AndroidUtilities.dp(30.0f) + xiVar2.f32799b2[0];
                if (!xiVar2.f32815g0) {
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
        switch (this.f1786e3) {
            case 5:
                if (view != ((org.telegram.ui.a7) this.f1787f3).W) {
                    return true;
                }
                return false;
            case 16:
                n00 n00Var = (n00) this.f1787f3;
                if (n00Var.isEnabled() && !((ly) n00Var.J).f38359b.f41420j2) {
                    return true;
                }
                return false;
            default:
                return super.G0(view);
        }
    }

    @Override
    public boolean I0(View view, float f7, float f10) {
        switch (this.f1786e3) {
            case 10:
                return ((org.telegram.ui.Components.cb) this.f1787f3).t(view, f7, f10);
            case 16:
                if (((n00) this.f1787f3).f28780n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((l00) view).f28225f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((f91) this.f1787f3).f26409n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((d91) view).f25668c;
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
        switch (this.f1786e3) {
            case 24:
                if (getAdapter() != null && ((n71) this.f1787f3).H && getAdapter().h() <= 2) {
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
        switch (this.f1786e3) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int U = DataSettingsActivity.U((DataSettingsActivity) this.f1787f3);
                org.telegram.ui.ActionBar.d6 d6Var = this.f33545p2;
                if (i10 == U) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21039p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, d6Var));
            case 27:
                ArrayList arrayList = ((f10) this.f1787f3).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    w00Var = (w00) arrayList.get(i10);
                } else {
                    w00Var = null;
                }
                org.telegram.ui.ActionBar.d6 d6Var2 = this.f33545p2;
                if (w00Var != null && w00Var.f41879l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21039p7, d6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, d6Var2));
            default:
                return super.X0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.f1786e3) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((f91) this.f1787f3).V) {
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
        switch (this.f1786e3) {
            case 0:
                r3 r3Var = (r3) this.f1787f3;
                int i10 = -1;
                if (!r3Var.f1445f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof h1) && (m1Var = ((h1) childAt).K) != null) {
                                i10 = m1Var.f1325a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > r3Var.F) {
                    r3Var.F = i10;
                    c cVar = r3Var.f1588i0.X1;
                    if (cVar != null) {
                        cVar.setCount(r3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                pf pfVar = (pf) this.f1787f3;
                w0 w0Var = pfVar.f9496c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = pfVar.h - AndroidUtilities.dp(8.0f);
                    pfVar.f9497e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = pfVar.f9500r;
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
            case 6:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.k8) this.f1787f3).F = false;
                return;
            case 21:
                dy dyVar = (dy) this.f1787f3;
                s4.c0 c0Var = dyVar.f30118d0;
                s4.j jVar = dyVar.f30116b0;
                jo0 jo0Var = dyVar.f30117c0;
                if (jo0Var != null && jVar != null && c0Var != null && jo0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = jo0Var.h() - 1;
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
                if (jo0Var != null && jVar != null && c0Var != null && jo0Var.m0) {
                    canvas.restore();
                }
                if (jo0Var != null && jo0Var.f10626o0 != null) {
                    canvas.save();
                    canvas.translate(jo0Var.f10626o0.getLeft(), jo0Var.f10626o0.getTranslationY() + jo0Var.f10626o0.getTop());
                    jo0Var.f10626o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((x10) this.f1787f3).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f46527f == 1) {
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
        int i10 = this.f1786e3;
        Object obj = this.f1787f3;
        switch (i10) {
            case 0:
                if (((r3) obj).f1445f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                sk0 sk0Var = (sk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && sk0Var.getPullingLeftProgress() > 0.95f) {
                        sk0.a(sk0Var);
                    } else if (sk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = sk0Var.f30797y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(sk0Var.B0, 0.0f);
                        sk0Var.f30797y0 = ofFloat;
                        ofFloat.addUpdateListener(new v70(sk0Var, 6));
                        sk0Var.f30797y0.setDuration(150L);
                        sk0Var.f30797y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((ao0) obj).f24614f;
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
        switch (this.f1786e3) {
            case 18:
                zg.o0 o0Var = ((sk0) this.f1787f3).f30779l0;
                if (o0Var != null && (view instanceof qk0) && ((qk0) view).f30060e.equals(o0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                qy0 qy0Var = (qy0) this.f1787f3;
                com.google.firebase.messaging.n nVar = qy0Var.f30200l0;
                if ((view instanceof org.telegram.ui.Cells.f8) && qy0Var.R) {
                    int b10 = qy0Var.f30188c.T(view).b();
                    canvas.save();
                    ArrayList arrayList = (ArrayList) nVar.d;
                    float f7 = 0.0f;
                    if (arrayList.isEmpty()) {
                        floatValue = 0.0f;
                    } else {
                        floatValue = ((Float) arrayList.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    canvas.rotate(floatValue, (view.getMeasuredWidth() / 2.0f) + view.getLeft(), (view.getMeasuredHeight() / 2.0f) + view.getTop());
                    ArrayList arrayList2 = (ArrayList) nVar.f7907e;
                    if (arrayList2.isEmpty()) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = ((Float) arrayList2.get(b10 - ((b10 / 6) * 6))).floatValue();
                    }
                    ArrayList arrayList3 = (ArrayList) nVar.f7908f;
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
                if (getAdapter() == ((x10) this.f1787f3).U && T(view).f46527f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f1786e3) {
            case 0:
                super.invalidate();
                ((r3) this.f1787f3).invalidate();
                return;
            case 9:
                super.invalidate();
                View view = ((rr) this.f1787f3).fragmentView;
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
        switch (this.f1786e3) {
            case 3:
                return;
            case 14:
                tm tmVar = (tm) this.f1787f3;
                tmVar.invalidate();
                tmVar.f29642b.U1(tmVar, i10);
                sm smVar = tmVar.v;
                boolean z11 = true;
                int i11 = 0;
                if (smVar.f30814x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = smVar.d();
                    if (d.length == smVar.f30814x.length) {
                        while (true) {
                            if (i11 < d.length) {
                                if (d[i11] == smVar.f30814x[i11]) {
                                    i11++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    smVar.f30814x = smVar.d();
                }
                if (z10) {
                    smVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1786e3) {
            case 7:
                super.onAttachedToWindow();
                gg.o1 o1Var = ((yn) this.f1787f3).K3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.f10736r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.f1786e3) {
            case 7:
                super.onDetachedFromWindow();
                gg.o1 o1Var = ((yn) this.f1787f3).K3;
                if (o1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.E);
                    NotificationCenter.getInstance(o1Var.f10736r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.f1786e3) {
            case 1:
                rt q6 = rt.q();
                ci.z1 z1Var = (ci.z1) this.f1787f3;
                boolean r10 = q6.r(motionEvent, z1Var.f6360b, z1Var.f6363f, this.f33545p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((mq) this.f1787f3).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((mj) this.f1787f3).f29642b.f32799b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((tm) this.f1787f3).J != null) {
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
                    ((nz) this.f1787f3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = rt.q().r(motionEvent, ((tv0) this.f1787f3).f31174b, null, this.f33545p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                qy0 qy0Var = (qy0) this.f1787f3;
                if (qy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = rt.q().r(motionEvent, qy0Var.f30188c, qy0Var.m0, this.f33545p2);
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
        switch (this.f1786e3) {
            case 10:
                ((org.telegram.ui.Components.cb) this.f1787f3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((jl) this.f1787f3).e0();
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((on0) this.f1787f3).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1786e3) {
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
        switch (this.f1786e3) {
            case 8:
                if (((mq) this.f1787f3).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((mj) this.f1787f3).f29642b.f32799b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((tm) this.f1787f3).J != null) {
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
        switch (this.f1786e3) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f1786e3) {
            case 4:
                if (!((org.telegram.ui.k1) this.f1787f3).f37803r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((q00) this.f1787f3).f29852n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((tv0) this.f1787f3).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((qy0) this.f1787f3).f30195g0) {
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
        switch (this.f1786e3) {
            case 16:
                super.setAlpha(f7);
                ((n00) this.f1787f3).invalidate();
                return;
            case 25:
                super.setAlpha(f7);
                ((f91) this.f1787f3).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f1786e3) {
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
        this.f1786e3 = i10;
        this.f1787f3 = obj;
    }

    public w0(nz nzVar, Context context, lz lzVar) {
        super(context, null);
        this.f1786e3 = 15;
        this.f1787f3 = nzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, this.f33545p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(lzVar);
    }

    private final void y1(int i10) {
    }
}
