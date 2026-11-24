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
public final class fu extends o39 {
    public final byte f3;
    public final Object g3;

    public fu(t14 t14Var, Context context, r14 r14Var) {
        super(context, null);
        this.f3 = (byte) 16;
        this.g3 = t14Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(gl.L(4.0f));
        zkb.l(this, 20, bkb.h6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        zr zrVar = new zr((byte) 6);
        zrVar.i1(0);
        setLayoutManager(zrVar);
        setAdapter(r14Var);
    }

    @Override
    public final boolean F0(float f) {
        int i;
        int i2;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 8:
                x02 x02Var = ((k22) obj).b;
                int L = gl.L(30.0f) + x02Var.Y3[0];
                if (!x02Var.a2) {
                    i = gl.m;
                } else {
                    i = 0;
                }
                if (f >= L + i) {
                    return true;
                }
                return false;
            case 11:
                x02 x02Var2 = ((p62) obj).b;
                int L2 = gl.L(30.0f) + x02Var2.Y3[0];
                if (!x02Var2.a2) {
                    i2 = gl.m;
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
                if (view == ((r61) obj).X) {
                    return false;
                }
                return true;
            case 18:
                he4 he4Var = (he4) obj;
                if (!he4Var.isEnabled() || ((ti3) he4Var.K).b.l2) {
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
                return ((fy0) obj).E0(view, f, f2);
            case 18:
                if (((he4) obj).n) {
                    int L = gl.L(6.0f);
                    RectF rectF = ((fe4) view).f;
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
        gd4 gd4Var;
        byte b = this.f3;
        Object obj = this.g3;
        wjb wjbVar = this.o2;
        switch (b) {
            case 14:
                if (i == DataSettingsActivity.Y((DataSettingsActivity) obj)) {
                    return Integer.valueOf(bkb.p1(0.1f, bkb.v0(bkb.o7, wjbVar)));
                }
                return Integer.valueOf(bkb.v0(bkb.h6, wjbVar));
            case 17:
                ArrayList arrayList = ((pd4) obj).Q;
                if (i >= 0 && i < arrayList.size()) {
                    gd4Var = (gd4) arrayList.get(i);
                } else {
                    gd4Var = null;
                }
                if (gd4Var != null && gd4Var.l) {
                    return Integer.valueOf(bkb.p1(0.12f, bkb.v0(bkb.o7, wjbVar)));
                }
                return Integer.valueOf(bkb.v0(bkb.h6, wjbVar));
            case 24:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yc ycVar;
        s49 K;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 9:
                if (motionEvent.getActionMasked() == 0) {
                    c42 c42Var = (c42) obj;
                    if (motionEvent.getY() < c42Var.t0 && (ycVar = c42Var.K) != null && ycVar.getVisibility() == 0 && (K = K(0)) != null && motionEvent.getY() >= gl.L(32.0f) + Math.max(0, K.a.getTop())) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                if (((sr4) obj).L) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                if (((l18) obj).g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 25:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((qa6) obj).b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 28:
                t09 t09Var = (t09) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && t09Var.getPullingLeftProgress() > 0.95f) {
                        t09Var.o();
                    } else if (t09Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = t09Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(t09Var.C0, 0.0f);
                        t09Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new u28(t09Var, (byte) 25));
                        t09Var.z0.setDuration(150L);
                        t09Var.z0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void invalidate() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 13:
                super.invalidate();
                View view = ((kf2) obj).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 24:
                super.invalidate();
                ((l18) obj).invalidate();
                return;
            case 27:
                super.invalidate();
                i08 i08Var = ((z08) obj).G;
                if (i08Var != null) {
                    i08Var.run();
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
                    ((f37) this.g3).e.U();
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
                m52 m52Var = (m52) obj;
                m52Var.invalidate();
                m52Var.b.H1(m52Var, i);
                l52 l52Var = m52Var.w;
                boolean z2 = true;
                int i2 = 0;
                if (l52Var.y == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    boolean[] d = l52Var.d();
                    if (d.length == l52Var.y.length) {
                        while (true) {
                            if (i2 < d.length) {
                                if (d[i2] == l52Var.y[i2]) {
                                    i2++;
                                }
                            } else {
                                z2 = z;
                            }
                        }
                    }
                    z = z2;
                } else {
                    l52Var.y = l52Var.d();
                }
                if (z) {
                    l52Var.invalidate();
                    return;
                }
                return;
            case 11:
                return;
            case 26:
                ((f37) obj).e.F();
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
                ra7 ra7Var = ((mu1) this.g3).b4;
                if (ra7Var != null) {
                    kk7.f(ra7Var.r).b(ra7Var, 329);
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
                ra7 ra7Var = ((mu1) this.g3).b4;
                if (ra7Var != null) {
                    gl.r(ra7Var.F);
                    kk7.f(ra7Var.r).n(ra7Var, 329);
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((v12) obj).b.Y3[0] - gl.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 10:
                if (((m52) obj).K != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (((zc2) obj).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                nv3 nv3Var = (nv3) obj;
                boolean g = xv2.e().g(motionEvent, nv3Var.b, nv3Var.f, this.o2);
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
                    ((t14) obj).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                if (((sr4) obj).L) {
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
        k27 k27Var;
        byte b = this.f3;
        int i6 = 0;
        Object obj = this.g3;
        switch (b) {
            case 2:
                ((fy0) obj).D0();
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 5:
                nf1 nf1Var = (nf1) obj;
                if (nf1Var.w != null && nf1Var.y != null && (i5 = nf1Var.N0) >= 0) {
                    if (nf1Var.M0 != 0) {
                        while (true) {
                            kf1 kf1Var = nf1Var.F;
                            if (i6 < kf1Var.d) {
                                if (i6 >= kf1Var.f && i6 < kf1Var.h) {
                                    ArrayList arrayList = kf1Var.n.p0;
                                    k27Var = (k27) arrayList.get((arrayList.size() - (i6 - kf1Var.f)) - 1);
                                } else {
                                    k27Var = null;
                                }
                                if (k27Var != null && k27Var.T == nf1Var.M0) {
                                    i5 = i6;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                    nf1Var.y.h1(i5, nf1Var.O0, true);
                    nf1Var.N0 = -1;
                    nf1Var.M0 = 0L;
                }
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 7:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.r0().t();
                return;
            case 9:
                super.onLayout(z, i, i2, i3, i4);
                c42 c42Var = (c42) obj;
                c42Var.j0();
                c42Var.h0();
                return;
            case 26:
                f37 f37Var = (f37) obj;
                int i7 = f37Var.a;
                if (f37Var.L) {
                    if (i7 != 0) {
                        w0(0);
                    }
                    f37Var.L = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                f37Var.j();
                fu fuVar = f37Var.f;
                if (f37Var.V) {
                    if (fuVar.computeVerticalScrollRange() > fuVar.computeVerticalScrollExtent()) {
                        f37Var.postDelayed(new w27(f37Var, (byte) 0), 0L);
                    }
                    f37Var.V = false;
                }
                if (f37Var.O && i7 == 0) {
                    int i8 = f37Var.M;
                    int i9 = f37Var.N;
                    f37Var.O = false;
                    post(new bt(this, i8, i9, (byte) 12));
                    return;
                }
                return;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                ((hs9) obj).a();
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((v12) obj).b.Y3[0] - gl.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                if (((m52) obj).K != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (((zc2) obj).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 21:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    gl.d3(new s54(this, (byte) 13), 250L);
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
                if (!((mu) obj).r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((cf4) obj).s1) {
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
                ((he4) this.g3).invalidate();
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
                if ((view instanceof ff4) && ((ff4) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    private final void z1(int i) {
    }

    public fu(Object obj, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.f3 = b;
        this.g3 = obj;
    }

    public fu(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }
}
