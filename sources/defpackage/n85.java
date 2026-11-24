package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class n85 extends ela {
    public boolean m0;
    public final RectF n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final HashMap s0;
    public final g95 t0;

    public n85(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.t0 = g95Var;
        this.m0 = false;
        this.n0 = new RectF();
        this.s0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n85.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        g95 g95Var = this.t0;
        p65 p65Var = g95Var.o1;
        y65 y65Var = g95Var.e4;
        p85 p85Var = g95Var.J1;
        c75 c75Var = g95Var.T3;
        if (g95Var.k4) {
            if (view == p85Var) {
                int childCount = p85Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = p85Var.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == c75Var || view == p65Var) {
                return super.drawChild(canvas, view, j);
            }
        } else if (g95.v5 || c75Var.c != 1.0f || (view != g95Var.H1 && view != g95Var.Z1 && view != g95Var.G1 && view != g95Var.X2 && view != g95Var.u3)) {
            if (g95Var.v4 && view == c75Var) {
                canvas.save();
                canvas.translate(y65Var.getX() + c75Var.getX(), y65Var.getY() + c75Var.getY());
                y65Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != g95Var.s4 && view != g95Var.X3 && view != g95Var.M4 && (!g95Var.d4 || !g95Var.Z3 || (view != p85Var && view != p65Var && view != g95Var.V1 && view != g95Var.k3))) {
                return super.drawChild(canvas, view, j);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t0.S1.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t0.S1.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int L;
        int L2 = gm.L(74.0f);
        g95 g95Var = this.t0;
        ImageReceiver imageReceiver = g95Var.S1;
        Drawable drawable = g95Var.Y1;
        c75 c75Var = g95Var.T3;
        float f2 = g95Var.s2 - L2;
        int L3 = gm.L(15.0f) + getMeasuredHeight();
        int i = g95Var.t0;
        int i2 = L3 + i;
        if (i + f2 < a.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - g95Var.t0) / ((L2 - g95Var.t0) - gm.L(14.0f)));
            int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L) * min);
            f2 -= currentActionBarHeight;
            i2 += currentActionBarHeight;
            f = 1.0f - min;
        } else {
            f = 1.0f;
        }
        float paddingTop = f2 + getPaddingTop();
        g95Var.O1();
        if (c75Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i2);
            drawable.draw(canvas);
            if (f != 1.0f) {
                cmb.s0.setColor(g95Var.O3);
                float L4 = g95Var.t0 + paddingTop + gm.L(24.0f);
                RectF rectF = this.n0;
                rectF.set(g95Var.u0, g95Var.t0 + paddingTop, getMeasuredWidth() - g95Var.u0, L4);
                canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
            }
            cmb.s0.setColor(Color.argb((int) (g95Var.H1.getAlpha() * 255.0f), (int) (Color.red(g95Var.O3) * 0.8f), (int) (Color.green(g95Var.O3) * 0.8f), (int) (Color.blue(g95Var.O3) * 0.8f)));
            canvas.drawRect(g95Var.u0, 0.0f, getMeasuredWidth() - g95Var.u0, (int) (g95Var.h0 * 1.0f), cmb.s0);
            y75 y75Var = g95Var.t2;
            if (y75Var != null) {
                cmb.s0.setColor(y75Var.getBackgroundColor());
                canvas.drawRect(g95Var.u0, 0.0f, getMeasuredWidth() - g95Var.u0, (int) (g95Var.h0 * 1.0f), cmb.s0);
            }
        }
        if (c75Var.c != 0.0f) {
            cmb.s0.setColor(on2.p(cmb.w0(null, cmb.Wg, false), (int) (c75Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), cmb.s0);
        }
        imageReceiver.i0((getMeasuredWidth() / 2.0f) - gm.L(30.0f), (getMeasuredHeight() / 2.0f) - gm.L(30.0f), gm.L(60.0f), gm.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g95 g95Var = this.t0;
        g75 g75Var = g95Var.s4;
        if (g95Var.M4 != null && motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = g95Var.X3.getX();
            float y2 = g95Var.X3.getY();
            float x3 = g95Var.X3.getX() + g95Var.X3.getMeasuredWidth();
            float y3 = g95Var.X3.getY() + g95Var.X3.getMeasuredHeight();
            RectF rectF = this.n0;
            rectF.set(x2, y2, x3, y3);
            boolean z = !rectF.contains(x, y);
            rectF.set(g75Var.getX(), g75Var.getY(), g75Var.getX() + g75Var.getMeasuredWidth(), g75Var.getY() + g75Var.getMeasuredWidth() + g95Var.M4.getMeasuredHeight());
            if (rectF.contains(x, y)) {
                z = false;
            }
            if (z) {
                g95Var.T0(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && g95Var.s2 != 0.0f && motionEvent.getY() < g95Var.s2 - gm.L(37.0f) && g95Var.H1.getAlpha() == 0.0f && !g95Var.Y3 && g95Var.t2 == null && !g95Var.T3.b) {
            g95Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        g95 g95Var = this.t0;
        if (g95Var.M4 != null && i == 4) {
            g95Var.T0(true);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        float f;
        g95 g95Var = this.t0;
        View view = g95Var.A4;
        View view2 = g95Var.z4;
        p65 p65Var = g95Var.o1;
        c75 c75Var = g95Var.T3;
        p85 p85Var = g95Var.J1;
        if (g95.v5 && this.q0 != g95Var.y4 && this.r0) {
            f = p85Var.getX();
            z2 = true;
        } else {
            z2 = false;
            f = 0.0f;
        }
        this.q0 = g95Var.y4;
        c75Var.s = true;
        super.onLayout(z, i, i2, i3, i4);
        c75Var.s = false;
        g95Var.F1();
        this.r0 = true;
        if (z2 && p85Var.getLeft() != f) {
            float left = f - p85Var.getLeft();
            p85Var.setTranslationX(left);
            p65Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = p85Var.animate().translationX(0.0f).setDuration(350L);
            d53 d53Var = d53.f;
            duration.setInterpolator(d53Var).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(d53Var).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(d53Var).start();
            p65Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(d53Var).start();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int L;
        float f;
        float f2;
        int L2;
        int i3;
        int i4;
        int i5;
        int e;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        g95 g95Var = this.t0;
        o75 o75Var = g95Var.z1;
        v65 v65Var = g95Var.G1;
        LinearLayout linearLayout = g95Var.u3;
        a85 a85Var = g95Var.H1;
        pb5 pb5Var = g95Var.g4;
        m95 m95Var = g95Var.h4;
        vd4 vd4Var = g95Var.R1;
        dkc dkcVar = g95Var.v1;
        lka lkaVar = g95Var.N1;
        View view = g95Var.Z1;
        View view2 = g95Var.A4;
        View view3 = g95Var.z4;
        ArrayList arrayList = g95Var.R3;
        lka lkaVar2 = g95Var.P1;
        m75 m75Var = g95Var.A1;
        ArrayList arrayList2 = g95Var.S3;
        r59 r59Var = g95Var.f4;
        c75 c75Var = g95Var.T3;
        p85 p85Var = g95Var.J1;
        y65 y65Var = g95Var.e4;
        int size = View.MeasureSpec.getSize(i2);
        this.m0 = true;
        if (View.MeasureSpec.getSize(i) > size && !gm.O1()) {
            z = true;
        } else {
            z = false;
        }
        LaunchActivity launchActivity = g95Var.b2;
        if (launchActivity != null && gm.F1(launchActivity)) {
            z = g95.u5;
        }
        View.MeasureSpec.getSize(i);
        c75Var.getClass();
        if (gm.O1() && View.MeasureSpec.getSize(i) > size && !g95Var.i1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (g95.u5 != z) {
            g95.u5 = z;
            if (dkcVar.getMeasuredWidth() == 0) {
                int i14 = dkcVar.getLayoutParams().width;
            }
            g95Var.W = false;
            if (g95.u5) {
                i12 = 6;
            } else {
                i12 = 2;
            }
            vd4Var.x1(i12);
            p85Var.b0();
            y65Var.b0();
            this.p0 = true;
            TextView textView = g95Var.L1;
            if (textView != null) {
                if (!g95.u5) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                textView.setVisibility(i13);
            }
        }
        if (g95.v5 != z2) {
            g95.v5 = z2;
            if (z2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            r59Var.setVisibility(i11);
            p85Var.b0();
            y65Var.b0();
            z3 = true;
            this.p0 = true;
        } else {
            z3 = true;
        }
        if (this.p0) {
            g95Var.D0(z3);
            g95Var.I1.f();
            m95Var.G(r59Var, false);
            if (g95.v5) {
                pb5Var.I(r59Var, false);
            }
            if (g95.v5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            r59Var.setVisibility(i7);
            if (g95.v5 && !c75Var.b) {
                z4 = true;
            } else {
                z4 = false;
            }
            pb5Var.H(r59Var, z4, true);
            boolean z7 = g95.v5;
            if (z7 && !c75Var.b) {
                z5 = false;
            } else {
                z5 = true;
            }
            g95Var.F4 = z5;
            if (!z7 && c75Var.b) {
                z6 = true;
            } else {
                z6 = false;
            }
            m95Var.F(y65Var, z6);
            if (z6) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            y65Var.setVisibility(i8);
            if (!g95.v5 && c75Var.b) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            p85Var.setVisibility(i9);
            if (g95.u5) {
                i10 = 6;
            } else {
                i10 = 2;
            }
            vd4Var.x1(i10);
            g95Var.L1(false, false);
            p85Var.b0();
            y65Var.b0();
            gm.V3(p85Var);
            this.p0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            c75Var.setIsTablet(g95.v5);
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                ((ha5) arrayList2.get(i15)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (g95Var.i1()) {
            L = gm.L(72.0f);
        } else {
            L = gm.L(245.0f);
        }
        int i16 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c75Var.getLayoutParams();
        if (g95.v5) {
            layoutParams.topMargin = a.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i17 = 0; i17 < 2; i17++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g95Var.c2[i17].getLayoutParams();
            if (g95.v5) {
                layoutParams2.rightMargin = gm.L(328.0f);
            } else {
                layoutParams2.rightMargin = gm.L(8.0f);
            }
        }
        if (r59Var != null) {
            ((FrameLayout.LayoutParams) r59Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        }
        if (m75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m75Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (g95Var.i1()) {
            f = 40.0f;
        } else {
            f = 90.0f;
        }
        int L3 = gm.L(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) p85Var.getLayoutParams();
        if (g95.v5) {
            if (g95Var.y4) {
                i6 = 5;
            } else {
                i6 = 1;
            }
            layoutParams3.gravity = i6;
            layoutParams3.width = gm.L(320.0f);
            int L4 = gm.L(4.0f);
            layoutParams3.leftMargin = L4;
            layoutParams3.rightMargin = L4;
            layoutParams3.bottomMargin = L3;
            layoutParams3.topMargin = a.getCurrentActionBarHeight();
            L2 = gm.L(60.0f);
            f2 = 90.0f;
        } else {
            f2 = 90.0f;
            if (g95.u5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = a.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = gm.L(14.0f);
                layoutParams3.rightMargin = gm.L(90.0f);
                layoutParams3.leftMargin = gm.L(14.0f);
                L2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L2 = gm.L(60.0f);
                layoutParams3.bottomMargin = L3;
                layoutParams3.topMargin = gm.L(14.0f) + a.getCurrentActionBarHeight();
                int L5 = gm.L(14.0f);
                layoutParams3.leftMargin = L5;
                layoutParams3.rightMargin = L5;
            }
        }
        int i18 = 81;
        if (g95.u5 && !g95.v5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
        } else {
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (g95.v5) {
                if (g95Var.y4) {
                    i4 = 85;
                } else {
                    i4 = 81;
                }
                layoutParams4.gravity = i4;
                layoutParams4.width = gm.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L3;
            if (g95.v5) {
                if (g95Var.y4) {
                    i3 = 85;
                } else {
                    i3 = 81;
                }
                layoutParams5.gravity = i3;
                layoutParams5.width = gm.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (g95.u5) {
            y65Var.setPadding(0, gm.L(9.0f), 0, gm.L(9.0f));
        } else {
            y65Var.setPadding(gm.L(9.0f), 0, gm.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) g95Var.o1.getLayoutParams();
        if (g95.v5) {
            layoutParams6.width = gm.L(320.0f);
            layoutParams6.height = gm.L(120.0f);
            if (g95Var.y4) {
                i18 = 85;
            }
            layoutParams6.gravity = i18;
            layoutParams6.rightMargin = 0;
        } else if (g95.u5) {
            layoutParams6.width = gm.L(f2);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = gm.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (g95.u5 && !g95.v5) {
            ((FrameLayout.LayoutParams) a85Var.getLayoutParams()).rightMargin = gm.L(f2);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = gm.L(f2);
            ((FrameLayout.LayoutParams) v65Var.getLayoutParams()).rightMargin = gm.L(f2);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = gm.L(f2);
        } else {
            ((FrameLayout.LayoutParams) a85Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) v65Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) y65Var.getLayoutParams();
        if (g95.u5) {
            if (!((u46) y65Var.getLayoutManager()).o) {
                ((u46) y65Var.getLayoutManager()).i1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = gm.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = gm.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((u46) y65Var.getLayoutManager()).o) {
                ((u46) y65Var.getLayoutManager()).i1(0);
            }
            layoutParams7.height = gm.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = gm.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        o75Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) o75Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (m75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) m75Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(gm.L(259.0f), (i16 / 5) * 3);
        if (g95.v5) {
            e = 0;
            i5 = 0;
        } else {
            i5 = 0;
            e = kt6.e(8.0f, i16 - max, 0);
        }
        if (p85Var.getPaddingTop() != e || p85Var.getPaddingBottom() != L2) {
            p85Var.setPadding(i5, e, i5, L2);
        }
        if (lkaVar2 != null) {
            int L6 = ((gm.L(60.0f) + (i16 - e)) / 2) + e;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) lkaVar.getLayoutParams();
            layoutParams9.topMargin = L6 - gm.L(30.0f);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) lkaVar2.getLayoutParams();
            layoutParams10.topMargin = gm.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) g95Var.O1.getLayoutParams();
            if (layoutParams9.topMargin >= a.getCurrentActionBarHeight()) {
                if (gm.L(20.0f) + layoutParams10.topMargin <= size - gm.L(231.0f)) {
                    lkaVar.setVisibility(0);
                    lkaVar2.setVisibility(0);
                    layoutParams11.topMargin = L6;
                }
            }
            lkaVar.setVisibility(4);
            lkaVar2.setVisibility(4);
            layoutParams11.topMargin = L6 - gm.L(20.0f);
        }
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            ((ha5) arrayList.get(i19)).g(c75Var.b, true);
        }
        this.m0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.o0) {
            this.o0 = measuredHeight;
            g95Var.T0(false);
        }
        g95Var.j4.f = getMeasuredWidth();
        g95Var.O0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.t0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.t0.O1();
    }
}
