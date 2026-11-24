package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.PhotoViewer;
public final class fv extends r59 {
    public final byte f3;
    public final Object g3;

    public fv(e34 e34Var, Context context, c34 c34Var) {
        super(context, null);
        this.f3 = (byte) 16;
        this.g3 = e34Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(gm.L(4.0f));
        anb.l(this, 20, cmb.h6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        zs zsVar = new zs((byte) 6);
        zsVar.i1(0);
        setLayoutManager(zsVar);
        setAdapter(c34Var);
    }

    @Override
    public final boolean F0(float f) {
        int i;
        int i2;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 8:
                i22 i22Var = ((w32) obj).b;
                int L = gm.L(30.0f) + i22Var.Y3[0];
                if (!i22Var.a2) {
                    i = gm.m;
                } else {
                    i = 0;
                }
                if (f >= L + i) {
                    return true;
                }
                return false;
            case 11:
                i22 i22Var2 = ((a82) obj).b;
                int L2 = gm.L(30.0f) + i22Var2.Y3[0];
                if (!i22Var2.a2) {
                    i2 = gm.m;
                } else {
                    i2 = 0;
                }
                if (f >= L2 + i2) {
                    return true;
                }
                return false;
            default:
                return super.F0(f);
        }
    }

    @Override
    public final boolean G0(View view) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 3:
                if (view == ((y71) obj).X) {
                    return false;
                }
                return true;
            case 18:
                ig4 ig4Var = (ig4) obj;
                if (!ig4Var.isEnabled() || ((dk3) ig4Var.K).b.l2) {
                    return false;
                }
                return true;
            default:
                return super.G0(view);
        }
    }

    @Override
    public final boolean I0(View view, float f, float f2) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 2:
                return ((mz0) obj).E0(view, f, f2);
            case 18:
                if (((ig4) obj).n) {
                    int L = gm.L(6.0f);
                    RectF rectF = ((gg4) view).f;
                    float f3 = L;
                    if (rectF.left - f3 < f && rectF.right + f3 > f) {
                        return false;
                    }
                }
                return true;
            default:
                return super.I0(view, f, f2);
        }
    }

    @Override
    public final Integer W0(int i) {
        gf4 gf4Var;
        byte b = this.f3;
        Object obj = this.g3;
        ylb ylbVar = this.o2;
        switch (b) {
            case 14:
                if (i == DataSettingsActivity.Z((DataSettingsActivity) obj)) {
                    return Integer.valueOf(cmb.p1(0.1f, cmb.v0(cmb.o7, ylbVar)));
                }
                return Integer.valueOf(cmb.v0(cmb.h6, ylbVar));
            case 17:
                ArrayList arrayList = ((qf4) obj).Q;
                if (i >= 0 && i < arrayList.size()) {
                    gf4Var = (gf4) arrayList.get(i);
                } else {
                    gf4Var = null;
                }
                if (gf4Var != null && gf4Var.l) {
                    return Integer.valueOf(cmb.p1(0.12f, cmb.v0(cmb.o7, ylbVar)));
                }
                return Integer.valueOf(cmb.v0(cmb.h6, ylbVar));
            case 24:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yd ydVar;
        u69 K;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 9:
                if (motionEvent.getActionMasked() == 0) {
                    n52 n52Var = (n52) obj;
                    if (motionEvent.getY() < n52Var.t0 && (ydVar = n52Var.K) != null && ydVar.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= gm.L(32.0f) + Math.max(0, K.a.getTop())) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                if (((tt4) obj).L) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                if (((n38) obj).g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 25:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((pc6) obj).b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 28:
                v29 v29Var = (v29) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && v29Var.getPullingLeftProgress() > 0.95f) {
                        v29Var.o();
                    } else if (v29Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = v29Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(v29Var.C0, 0.0f);
                        v29Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new fx7(v29Var, (byte) 27));
                        v29Var.z0.setDuration(150L);
                        v29Var.z0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void invalidate() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 13:
                super.invalidate();
                View view = ((wg2) obj).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 24:
                super.invalidate();
                ((n38) obj).invalidate();
                return;
            case 27:
                super.invalidate();
                l28 l28Var = ((c38) obj).G;
                if (l28Var != null) {
                    l28Var.run();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void l0(int i) {
        switch (this.f3) {
            case 26:
                if (i == 0) {
                    ((f57) this.g3).e.U();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void m0(int i) {
        boolean z;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 10:
                x62 x62Var = (x62) obj;
                x62Var.invalidate();
                x62Var.b.H1(x62Var, i);
                w62 w62Var = x62Var.w;
                boolean z2 = true;
                int i2 = 0;
                if (w62Var.y == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    boolean[] d = w62Var.d();
                    if (d.length == w62Var.y.length) {
                        while (true) {
                            if (i2 < d.length) {
                                if (d[i2] == w62Var.y[i2]) {
                                    i2++;
                                }
                            } else {
                                z2 = z;
                            }
                        }
                    }
                    z = z2;
                } else {
                    w62Var.y = w62Var.d();
                }
                if (z) {
                    w62Var.invalidate();
                    return;
                }
                return;
            case 11:
                return;
            case 26:
                ((f57) obj).e.F();
                return;
            default:
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.f3) {
            case 6:
                super.onAttachedToWindow();
                sc7 sc7Var = ((yv1) this.g3).b4;
                if (sc7Var != null) {
                    nm7.f(sc7Var.r).b(sc7Var, 331);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.f3) {
            case 6:
                super.onDetachedFromWindow();
                sc7 sc7Var = ((yv1) this.g3).b4;
                if (sc7Var != null) {
                    gm.r(sc7Var.F);
                    nm7.f(sc7Var.r).n(sc7Var, 331);
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        boolean z = false;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((h32) obj).b.Y3[0] - gm.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 10:
                if (((x62) obj).K != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (((ke2) obj).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                yw3 yw3Var = (yw3) obj;
                boolean g = hx2.e().g(motionEvent, yw3Var.b, yw3Var.f, this.o2);
                if (super.onInterceptTouchEvent(motionEvent) || g) {
                    return true;
                }
                return false;
            case 16:
                if (getParent() != null && getParent().getParent() != null) {
                    ViewParent parent = getParent().getParent();
                    if (canScrollHorizontally(-1) || canScrollHorizontally(1)) {
                        z = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z);
                    ((e34) obj).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                if (((tt4) obj).L) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        k47 k47Var;
        byte b = this.f3;
        int i6 = 0;
        Object obj = this.g3;
        switch (b) {
            case 2:
                ((mz0) obj).D0();
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 5:
                vg1 vg1Var = (vg1) obj;
                if (vg1Var.w != null && vg1Var.y != null && (i5 = vg1Var.N0) >= 0) {
                    if (vg1Var.M0 != 0) {
                        while (true) {
                            sg1 sg1Var = vg1Var.F;
                            if (i6 < sg1Var.d) {
                                if (i6 >= sg1Var.f && i6 < sg1Var.h) {
                                    ArrayList arrayList = sg1Var.n.p0;
                                    k47Var = (k47) arrayList.get((arrayList.size() - (i6 - sg1Var.f)) - 1);
                                } else {
                                    k47Var = null;
                                }
                                if (k47Var != null && k47Var.T == vg1Var.M0) {
                                    i5 = i6;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                    vg1Var.y.h1(i5, vg1Var.O0, true);
                    vg1Var.N0 = -1;
                    vg1Var.M0 = 0L;
                }
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 7:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.r0().r();
                return;
            case 9:
                super.onLayout(z, i, i2, i3, i4);
                n52 n52Var = (n52) obj;
                n52Var.j0();
                n52Var.h0();
                return;
            case 26:
                f57 f57Var = (f57) obj;
                int i7 = f57Var.a;
                if (f57Var.L) {
                    if (i7 != 0) {
                        w0(0);
                    }
                    f57Var.L = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                f57Var.j();
                fv fvVar = f57Var.f;
                if (f57Var.V) {
                    if (fvVar.computeVerticalScrollRange() > fvVar.computeVerticalScrollExtent()) {
                        f57Var.postDelayed(new w47(f57Var, (byte) 0), 0L);
                    }
                    f57Var.V = false;
                }
                if (f57Var.O && i7 == 0) {
                    int i8 = f57Var.M;
                    int i9 = f57Var.N;
                    f57Var.O = false;
                    post(new cu(this, i8, i9, (byte) 12));
                    return;
                }
                return;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                ((ju9) obj).a();
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.f3) {
            case 24:
                int size = View.MeasureSpec.getSize(i);
                View.MeasureSpec.getSize(i2);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i2)));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 7:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((h32) obj).b.Y3[0] - gm.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                if (((x62) obj).K != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (((ke2) obj).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 21:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gm.d3(new a14(this, (byte) 20), 250L);
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean requestFocus(int i, Rect rect) {
        switch (this.f3) {
            case 17:
                return false;
            default:
                return super.requestFocus(i, rect);
        }
    }

    @Override
    public final void requestLayout() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 0:
                if (!((mv) obj).r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((dh4) obj).s1) {
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
    public final void setAlpha(float f) {
        switch (this.f3) {
            case 18:
                super.setAlpha(f);
                ((ig4) this.g3).invalidate();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final boolean u1(View view) {
        switch (this.f3) {
            case 21:
                if ((view instanceof hh4) && ((hh4) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    private final void z1(int i) {
    }

    public fv(Object obj, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        this.g3 = obj;
    }

    public fv(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }
}
