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
public final class gu extends d79 {
    public final byte f3;
    public final Object g3;

    public gu(o24 o24Var, Context context, m24 m24Var) {
        super(context, null);
        this.f3 = (byte) 16;
        this.g3 = o24Var;
        setNestedScrollingEnabled(true);
        setSelectorRadius(hl.L(4.0f));
        yob.l(this, 20, aob.i6, this.o2);
        setTag(9);
        setItemAnimator(null);
        setLayoutAnimation(null);
        as asVar = new as((byte) 6);
        asVar.i1(0);
        setLayoutManager(asVar);
        setAdapter(m24Var);
    }

    @Override
    public final boolean G0(float f) {
        int i;
        int i2;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 8:
                n12 n12Var = ((b32) obj).b;
                int L = hl.L(30.0f) + n12Var.Y3[0];
                if (!n12Var.a2) {
                    i = hl.m;
                } else {
                    i = 0;
                }
                if (f >= L + i) {
                    return true;
                }
                return false;
            case 11:
                n12 n12Var2 = ((f72) obj).b;
                int L2 = hl.L(30.0f) + n12Var2.Y3[0];
                if (!n12Var2.a2) {
                    i2 = hl.m;
                } else {
                    i2 = 0;
                }
                if (f >= L2 + i2) {
                    return true;
                }
                return false;
            default:
                return super.G0(f);
        }
    }

    @Override
    public final boolean H0(View view) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 3:
                if (view == ((z61) obj).X) {
                    return false;
                }
                return true;
            case 18:
                fg4 fg4Var = (fg4) obj;
                if (!fg4Var.isEnabled() || !fg4Var.K.b()) {
                    return false;
                }
                return true;
            default:
                return super.H0(view);
        }
    }

    @Override
    public final boolean J0(View view, float f, float f2) {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 2:
                return ((ny0) obj).F0(view, f, f2);
            case 18:
                if (((fg4) obj).n) {
                    int L = hl.L(6.0f);
                    RectF rectF = ((dg4) view).f;
                    float f3 = L;
                    if (rectF.left - f3 < f && rectF.right + f3 > f) {
                        return false;
                    }
                }
                return true;
            default:
                return super.J0(view, f, f2);
        }
    }

    @Override
    public final Integer X0(int i) {
        ef4 ef4Var;
        byte b = this.f3;
        Object obj = this.g3;
        vnb vnbVar = this.o2;
        switch (b) {
            case 14:
                if (i == DataSettingsActivity.a0((DataSettingsActivity) obj)) {
                    return Integer.valueOf(aob.p1(0.1f, aob.v0(aob.p7, vnbVar)));
                }
                return Integer.valueOf(aob.v0(aob.i6, vnbVar));
            case 17:
                ArrayList arrayList = ((nf4) obj).Q;
                if (i >= 0 && i < arrayList.size()) {
                    ef4Var = (ef4) arrayList.get(i);
                } else {
                    ef4Var = null;
                }
                if (ef4Var != null && ef4Var.l) {
                    return Integer.valueOf(aob.p1(0.12f, aob.v0(aob.p7, vnbVar)));
                }
                return Integer.valueOf(aob.v0(aob.i6, vnbVar));
            case 24:
                return 0;
            default:
                return super.X0(i);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zc zcVar;
        f89 L;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 9:
                if (motionEvent.getActionMasked() == 0) {
                    s42 s42Var = (s42) obj;
                    if (motionEvent.getY() < s42Var.t0 && (zcVar = s42Var.K) != null && zcVar.getVisibility() == 0 && (L = L(0)) != null && motionEvent.getY() >= hl.L(32.0f) + Math.max(0, L.a.getTop())) {
                        return false;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 22:
                if (((wt4) obj).L) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 24:
                if (((c58) obj).g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 25:
                if (motionEvent.getActionMasked() == 0 && motionEvent.getY() < ((uc6) obj).b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 28:
                i49 i49Var = (i49) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && i49Var.getPullingLeftProgress() > 0.95f) {
                        i49Var.o();
                    } else if (i49Var.C0 != 0.0f) {
                        ValueAnimator valueAnimator = i49Var.z0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(i49Var.C0, 0.0f);
                        i49Var.z0 = ofFloat;
                        ofFloat.addUpdateListener(new pv7(i49Var, (byte) 28));
                        i49Var.z0.setDuration(150L);
                        i49Var.z0.start();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void invalidate() {
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 13:
                super.invalidate();
                View view = ((bg2) obj).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 24:
                super.invalidate();
                ((c58) obj).invalidate();
                return;
            case 27:
                super.invalidate();
                o38 o38Var = ((g48) obj).G;
                if (o38Var != null) {
                    o38Var.run();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void m0(int i) {
        switch (this.f3) {
            case 26:
                if (i == 0) {
                    ((m57) this.g3).e.U();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void n0(int i) {
        boolean z;
        byte b = this.f3;
        Object obj = this.g3;
        switch (b) {
            case 10:
                c62 c62Var = (c62) obj;
                c62Var.invalidate();
                c62Var.b.I1(c62Var, i);
                b62 b62Var = c62Var.w;
                boolean z2 = true;
                int i2 = 0;
                if (b62Var.y == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    boolean[] d = b62Var.d();
                    if (d.length == b62Var.y.length) {
                        while (true) {
                            if (i2 < d.length) {
                                if (d[i2] == b62Var.y[i2]) {
                                    i2++;
                                }
                            } else {
                                z2 = z;
                            }
                        }
                    }
                    z = z2;
                } else {
                    b62Var.y = b62Var.d();
                }
                if (z) {
                    b62Var.invalidate();
                    return;
                }
                return;
            case 11:
                return;
            case 26:
                ((m57) obj).e.F();
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
                yc7 yc7Var = ((zu1) this.g3).b4;
                if (yc7Var != null) {
                    jn7.f(yc7Var.r).b(yc7Var, 330);
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
                yc7 yc7Var = ((zu1) this.g3).b4;
                if (yc7Var != null) {
                    hl.r(yc7Var.F);
                    jn7.f(yc7Var.r).n(yc7Var, 330);
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((m22) obj).b.Y3[0] - hl.L(80.0f)) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 10:
                if (((c62) obj).K != null) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 12:
                if (((pd2) obj).I) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 15:
                hw3 hw3Var = (hw3) obj;
                boolean g = rw2.e().g(motionEvent, hw3Var.b, hw3Var.f, this.o2);
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
                    ((o24) obj).h.requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                if (((wt4) obj).L) {
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
        r47 r47Var;
        byte b = this.f3;
        int i6 = 0;
        Object obj = this.g3;
        switch (b) {
            case 2:
                ((ny0) obj).E0();
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 5:
                wf1 wf1Var = (wf1) obj;
                if (wf1Var.w != null && wf1Var.y != null && (i5 = wf1Var.N0) >= 0) {
                    if (wf1Var.M0 != 0) {
                        while (true) {
                            tf1 tf1Var = wf1Var.F;
                            if (i6 < tf1Var.d) {
                                if (i6 >= tf1Var.f && i6 < tf1Var.h) {
                                    ArrayList arrayList = tf1Var.n.p0;
                                    r47Var = (r47) arrayList.get((arrayList.size() - (i6 - tf1Var.f)) - 1);
                                } else {
                                    r47Var = null;
                                }
                                if (r47Var != null && r47Var.T == wf1Var.M0) {
                                    i5 = i6;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                    wf1Var.y.h1(i5, wf1Var.O0, true);
                    wf1Var.N0 = -1;
                    wf1Var.M0 = 0L;
                }
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 7:
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.q0().r();
                return;
            case 9:
                super.onLayout(z, i, i2, i3, i4);
                s42 s42Var = (s42) obj;
                s42Var.i0();
                s42Var.g0();
                return;
            case 26:
                m57 m57Var = (m57) obj;
                int i7 = m57Var.a;
                if (m57Var.L) {
                    if (i7 != 0) {
                        x0(0);
                    }
                    m57Var.L = false;
                }
                super.onLayout(z, i, i2, i3, i4);
                m57Var.j();
                gu guVar = m57Var.f;
                if (m57Var.V) {
                    if (guVar.computeVerticalScrollRange() > guVar.computeVerticalScrollExtent()) {
                        m57Var.postDelayed(new d57(m57Var, (byte) 0), 0L);
                    }
                    m57Var.V = false;
                }
                if (m57Var.O && i7 == 0) {
                    int i8 = m57Var.M;
                    int i9 = m57Var.N;
                    m57Var.O = false;
                    post(new bt(this, i8, i9, (byte) 12));
                    return;
                }
                return;
            case 29:
                super.onLayout(z, i, i2, i3, i4);
                ((aw9) obj).a();
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
                if (motionEvent.getAction() == 0 && motionEvent.getY() < ((m22) obj).b.Y3[0] - hl.L(80.0f)) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                if (((c62) obj).K != null) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 12:
                if (((pd2) obj).I) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            case 21:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    hl.d3(new lw3(this, (byte) 26), 250L);
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
                if (!((nu) obj).r) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((ah4) obj).s1) {
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
                ((fg4) this.g3).invalidate();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final boolean v1(View view) {
        switch (this.f3) {
            case 21:
                if ((view instanceof eh4) && ((eh4) view).getDraggingProgress() > 0.0f) {
                    return false;
                }
                return true;
            default:
                return super.v1(view);
        }
    }

    private final void A1(int i) {
    }

    public gu(Object obj, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        this.g3 = obj;
    }

    public gu(byte b, Context context, Object obj) {
        super(context, null);
        this.f3 = b;
        this.g3 = obj;
    }
}
