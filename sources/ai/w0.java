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
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.zl0;
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
public final class w0 extends zl0 {
    public final int f1646e3;
    public final Object f1647f3;

    public w0(Object obj, Context context, int i10) {
        super(context, null);
        this.f1646e3 = i10;
        this.f1647f3 = obj;
    }

    @Override
    public boolean F0(float f7) {
        int i10;
        int i11;
        switch (this.f1646e3) {
            case 3:
                xi xiVar = ((hg.k0) this.f1647f3).f27362b;
                int dp = AndroidUtilities.dp(30.0f) + xiVar.f30258b2[0];
                if (!xiVar.f30273g0) {
                    i10 = AndroidUtilities.statusBarHeight;
                } else {
                    i10 = 0;
                }
                if (f7 < dp + i10) {
                    return false;
                }
                return true;
            case 12:
                xi xiVar2 = ((bk) this.f1647f3).f27362b;
                int dp2 = AndroidUtilities.dp(30.0f) + xiVar2.f30258b2[0];
                if (!xiVar2.f30273g0) {
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
        switch (this.f1646e3) {
            case 5:
                if (view != ((org.telegram.ui.z6) this.f1647f3).Q) {
                    return true;
                }
                return false;
            case 16:
                n00 n00Var = (n00) this.f1647f3;
                if (n00Var.isEnabled() && !((pw) n00Var.J).f36786b.f37162j2) {
                    return true;
                }
                return false;
            default:
                return super.G0(view);
        }
    }

    @Override
    public boolean I0(View view, float f7, float f10) {
        switch (this.f1646e3) {
            case 10:
                return ((org.telegram.ui.Components.cb) this.f1647f3).t(view, f7, f10);
            case 16:
                if (((n00) this.f1647f3).f26492n) {
                    int dp = AndroidUtilities.dp(6.0f);
                    RectF rectF = ((l00) view).f25852f;
                    float f11 = dp;
                    if (rectF.left - f11 < f7 && rectF.right + f11 > f7) {
                        return false;
                    }
                }
                return true;
            case 25:
                if (((x81) this.f1647f3).f30195n) {
                    int dp2 = AndroidUtilities.dp(6.0f);
                    RectF rectF2 = ((v81) view).f29085c;
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
        switch (this.f1646e3) {
            case 24:
                if (getAdapter() != null && ((e71) this.f1647f3).H && getAdapter().h() <= 2) {
                    return true;
                }
                return false;
            default:
                return super.T0();
        }
    }

    @Override
    public Integer X0(int i10) {
        s00 s00Var;
        switch (this.f1646e3) {
            case 0:
                return 0;
            case 20:
                return 0;
            case 26:
                int W = DataSettingsActivity.W((DataSettingsActivity) this.f1647f3);
                org.telegram.ui.ActionBar.d6 d6Var = this.f31015p2;
                if (i10 == W) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19296p7, d6Var)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, d6Var));
            case 27:
                ArrayList arrayList = ((b10) this.f1647f3).P;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    s00Var = (s00) arrayList.get(i10);
                } else {
                    s00Var = null;
                }
                org.telegram.ui.ActionBar.d6 d6Var2 = this.f31015p2;
                if (s00Var != null && s00Var.f37657l) {
                    return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19296p7, d6Var2)));
                }
                return Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, d6Var2));
            default:
                return super.X0(i10);
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        switch (this.f1646e3) {
            case 25:
                super.addView(view, i10, layoutParams);
                if (((x81) this.f1647f3).V) {
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
        switch (this.f1646e3) {
            case 0:
                r3 r3Var = (r3) this.f1647f3;
                int i10 = -1;
                if (!r3Var.f1338f0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < getChildCount()) {
                            View childAt = getChildAt(i11);
                            if ((childAt instanceof h1) && (m1Var = ((h1) childAt).K) != null) {
                                i10 = m1Var.f1228a;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (i10 > r3Var.F) {
                    r3Var.F = i10;
                    c cVar = r3Var.f1465i0.X1;
                    if (cVar != null) {
                        cVar.setCount(r3Var.getUnreadMessagesCount());
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                pf pfVar = (pf) this.f1647f3;
                w0 w0Var = pfVar.f8734c;
                if (w0Var.getLayoutManager() != null && w0Var.getAdapter() != null && w0Var.getAdapter().h() != 0) {
                    float dp = pfVar.h - AndroidUtilities.dp(8.0f);
                    pfVar.e = dp - AndroidUtilities.dp(16.0f);
                    ch.d dVar = pfVar.f8737r;
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
                ((org.telegram.ui.h8) this.f1647f3).F = false;
                return;
            case 21:
                zx zxVar = (zx) this.f1647f3;
                s4.c0 c0Var = zxVar.f27137c0;
                s4.j jVar = zxVar.f27135a0;
                ho0 ho0Var = zxVar.f27136b0;
                if (ho0Var != null && jVar != null && c0Var != null && ho0Var.m0) {
                    canvas.save();
                    invalidate();
                    int h = ho0Var.h() - 1;
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
                if (ho0Var != null && jVar != null && c0Var != null && ho0Var.m0) {
                    canvas.restore();
                }
                if (ho0Var != null && ho0Var.f9771o0 != null) {
                    canvas.save();
                    canvas.translate(ho0Var.f9771o0.getLeft(), ho0Var.f9771o0.getTranslationY() + ho0Var.f9771o0.getTop());
                    ho0Var.f9771o0.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 28:
                if (getAdapter() == ((t10) this.f1647f3).U) {
                    for (int i13 = 0; i13 < getChildCount(); i13++) {
                        if (T(getChildAt(i13)).f43071f == 1) {
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
        int i10 = this.f1646e3;
        Object obj = this.f1647f3;
        switch (i10) {
            case 0:
                if (((r3) obj).f1338f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                tk0 tk0Var = (tk0) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && tk0Var.getPullingLeftProgress() > 0.95f) {
                        tk0.a(tk0Var);
                    } else if (tk0Var.B0 != 0.0f) {
                        ValueAnimator valueAnimator = tk0Var.f28595y0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(tk0Var.B0, 0.0f);
                        tk0Var.f28595y0 = ofFloat;
                        ofFloat.addUpdateListener(new v70(tk0Var, 6));
                        tk0Var.f28595y0.setDuration(150L);
                        tk0Var.f28595y0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                LinearLayout linearLayout = ((xn0) obj).f30429f;
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
        switch (this.f1646e3) {
            case 18:
                zg.o0 o0Var = ((tk0) this.f1647f3).f28577l0;
                if (o0Var != null && (view instanceof rk0) && ((rk0) view).e.equals(o0Var)) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                iy0 iy0Var = (iy0) this.f1647f3;
                com.google.firebase.messaging.n nVar = iy0Var.f25225l0;
                if ((view instanceof org.telegram.ui.Cells.f8) && iy0Var.R) {
                    int b10 = iy0Var.f25214c.T(view).b();
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
                    ArrayList arrayList3 = (ArrayList) nVar.f7327f;
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
                if (getAdapter() == ((t10) this.f1647f3).U && T(view).f43071f == 1) {
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f1646e3) {
            case 0:
                super.invalidate();
                ((r3) this.f1647f3).invalidate();
                return;
            case 9:
                super.invalidate();
                View view = ((pr) this.f1647f3).fragmentView;
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
        switch (this.f1646e3) {
            case 3:
                return;
            case 14:
                tm tmVar = (tm) this.f1647f3;
                tmVar.invalidate();
                tmVar.f27362b.X1(tmVar, i11);
                sm smVar = tmVar.v;
                boolean z11 = true;
                int i12 = 0;
                if (smVar.f28295x == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean[] d = smVar.d();
                    if (d.length == smVar.f28295x.length) {
                        while (true) {
                            if (i12 < d.length) {
                                if (d[i12] == smVar.f28295x[i12]) {
                                    i12++;
                                }
                            } else {
                                z11 = z10;
                            }
                        }
                    }
                    z10 = z11;
                } else {
                    smVar.f28295x = smVar.d();
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
        switch (this.f1646e3) {
            case 7:
                super.onAttachedToWindow();
                gg.o1 o1Var = ((wn) this.f1647f3).M3;
                if (o1Var != null) {
                    NotificationCenter.getInstance(o1Var.f9873r).addObserver(o1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.f1646e3) {
            case 7:
                super.onDetachedFromWindow();
                gg.o1 o1Var = ((wn) this.f1647f3).M3;
                if (o1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o1Var.E);
                    NotificationCenter.getInstance(o1Var.f9873r).removeObserver(o1Var, NotificationCenter.storiesListUpdated);
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
        switch (this.f1646e3) {
            case 1:
                nt q6 = nt.q();
                ci.z1 z1Var = (ci.z1) this.f1647f3;
                boolean r10 = q6.r(motionEvent, z1Var.f5914b, z1Var.f5916f, this.f31015p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                    return false;
                }
                return true;
            case 8:
                if (((kq) this.f1647f3).H) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((mj) this.f1647f3).f27362b.f30258b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 14:
                if (((tm) this.f1647f3).J != null) {
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
                    ((nz) this.f1647f3).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                boolean r11 = nt.q().r(motionEvent, ((qv0) this.f1647f3).f27737b, null, this.f31015p2);
                if (!super.onInterceptTouchEvent(motionEvent) && !r11) {
                    return false;
                }
                return true;
            case 23:
                iy0 iy0Var = (iy0) this.f1647f3;
                if (iy0Var.R) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean r12 = nt.q().r(motionEvent, iy0Var.f25214c, iy0Var.m0, this.f31015p2);
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
        switch (this.f1646e3) {
            case 10:
                ((org.telegram.ui.Components.cb) this.f1647f3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer.t1().y0();
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ((jl) this.f1647f3).e0();
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ln0) this.f1647f3).a();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1646e3) {
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
        switch (this.f1646e3) {
            case 8:
                if (((kq) this.f1647f3).H) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((mj) this.f1647f3).f27362b.f30258b2[0] - AndroidUtilities.dp(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 14:
                if (((tm) this.f1647f3).J != null) {
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
        switch (this.f1646e3) {
            case 27:
                return false;
            default:
                return super.requestFocus(i10, rect);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f1646e3) {
            case 4:
                if (!((org.telegram.ui.k1) this.f1647f3).f35000r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 17:
                if (!((q00) this.f1647f3).f27508n) {
                    super.requestLayout();
                    return;
                }
                return;
            case 22:
                if (!((qv0) this.f1647f3).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((iy0) this.f1647f3).f25220g0) {
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
        switch (this.f1646e3) {
            case 16:
                super.setAlpha(f7);
                ((n00) this.f1647f3).invalidate();
                return;
            case 25:
                super.setAlpha(f7);
                ((x81) this.f1647f3).invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f1646e3) {
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
        this.f1646e3 = i10;
        this.f1647f3 = obj;
    }

    public w0(nz nzVar, Context context, lz lzVar) {
        super(context, null);
        this.f1646e3 = 15;
        this.f1647f3 = nzVar;
        setNestedScrollingEnabled(true);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, this.f31015p2));
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.b0 b0Var = new gg.b0(8);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        setAdapter(lzVar);
    }

    private final void y1(int i10, int i11) {
    }
}
