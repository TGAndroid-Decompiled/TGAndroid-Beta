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
public final class p65 extends cja {
    public boolean m0;
    public final RectF n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public final HashMap s0;
    public final h75 t0;

    public p65(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.t0 = h75Var;
        this.m0 = false;
        this.n0 = new RectF();
        this.s0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p65.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h75 h75Var = this.t0;
        r45 r45Var = h75Var.o1;
        a55 a55Var = h75Var.e4;
        r65 r65Var = h75Var.J1;
        e55 e55Var = h75Var.T3;
        if (h75Var.k4) {
            if (view == r65Var) {
                int childCount = r65Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = r65Var.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == e55Var || view == r45Var) {
                return super.drawChild(canvas, view, j);
            }
        } else if (h75.v5 || e55Var.c != 1.0f || (view != h75Var.H1 && view != h75Var.Z1 && view != h75Var.G1 && view != h75Var.X2 && view != h75Var.u3)) {
            if (h75Var.v4 && view == e55Var) {
                canvas.save();
                canvas.translate(a55Var.getX() + e55Var.getX(), a55Var.getY() + e55Var.getY());
                a55Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != h75Var.s4 && view != h75Var.X3 && view != h75Var.M4 && (!h75Var.d4 || !h75Var.Z3 || (view != r65Var && view != r45Var && view != h75Var.V1 && view != h75Var.k3))) {
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
        int L2 = gl.L(74.0f);
        h75 h75Var = this.t0;
        ImageReceiver imageReceiver = h75Var.S1;
        Drawable drawable = h75Var.Y1;
        e55 e55Var = h75Var.T3;
        float f2 = h75Var.s2 - L2;
        int L3 = gl.L(15.0f) + getMeasuredHeight();
        int i = h75Var.t0;
        int i2 = L3 + i;
        if (i + f2 < a.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - h75Var.t0) / ((L2 - h75Var.t0) - gl.L(14.0f)));
            int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L) * min);
            f2 -= currentActionBarHeight;
            i2 += currentActionBarHeight;
            f = 1.0f - min;
        } else {
            f = 1.0f;
        }
        float paddingTop = f2 + getPaddingTop();
        h75Var.O1();
        if (e55Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i2);
            drawable.draw(canvas);
            if (f != 1.0f) {
                bkb.s0.setColor(h75Var.O3);
                float L4 = h75Var.t0 + paddingTop + gl.L(24.0f);
                RectF rectF = this.n0;
                rectF.set(h75Var.u0, h75Var.t0 + paddingTop, getMeasuredWidth() - h75Var.u0, L4);
                canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
            }
            bkb.s0.setColor(Color.argb((int) (h75Var.H1.getAlpha() * 255.0f), (int) (Color.red(h75Var.O3) * 0.8f), (int) (Color.green(h75Var.O3) * 0.8f), (int) (Color.blue(h75Var.O3) * 0.8f)));
            canvas.drawRect(h75Var.u0, 0.0f, getMeasuredWidth() - h75Var.u0, (int) (h75Var.h0 * 1.0f), bkb.s0);
            a65 a65Var = h75Var.t2;
            if (a65Var != null) {
                bkb.s0.setColor(a65Var.getBackgroundColor());
                canvas.drawRect(h75Var.u0, 0.0f, getMeasuredWidth() - h75Var.u0, (int) (h75Var.h0 * 1.0f), bkb.s0);
            }
        }
        if (e55Var.c != 0.0f) {
            bkb.s0.setColor(bm2.o(bkb.w0(null, bkb.Wg, false), (int) (e55Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), bkb.s0);
        }
        imageReceiver.i0((getMeasuredWidth() / 2.0f) - gl.L(30.0f), (getMeasuredHeight() / 2.0f) - gl.L(30.0f), gl.L(60.0f), gl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h75 h75Var = this.t0;
        i55 i55Var = h75Var.s4;
        if (h75Var.M4 != null && motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = h75Var.X3.getX();
            float y2 = h75Var.X3.getY();
            float x3 = h75Var.X3.getX() + h75Var.X3.getMeasuredWidth();
            float y3 = h75Var.X3.getY() + h75Var.X3.getMeasuredHeight();
            RectF rectF = this.n0;
            rectF.set(x2, y2, x3, y3);
            boolean z = !rectF.contains(x, y);
            rectF.set(i55Var.getX(), i55Var.getY(), i55Var.getX() + i55Var.getMeasuredWidth(), i55Var.getY() + i55Var.getMeasuredWidth() + h75Var.M4.getMeasuredHeight());
            if (rectF.contains(x, y)) {
                z = false;
            }
            if (z) {
                h75Var.T0(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && h75Var.s2 != 0.0f && motionEvent.getY() < h75Var.s2 - gl.L(37.0f) && h75Var.H1.getAlpha() == 0.0f && !h75Var.Y3 && h75Var.t2 == null && !h75Var.T3.b) {
            h75Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        h75 h75Var = this.t0;
        if (h75Var.M4 != null && i == 4) {
            h75Var.T0(true);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        float f;
        h75 h75Var = this.t0;
        View view = h75Var.A4;
        View view2 = h75Var.z4;
        r45 r45Var = h75Var.o1;
        e55 e55Var = h75Var.T3;
        r65 r65Var = h75Var.J1;
        if (h75.v5 && this.q0 != h75Var.y4 && this.r0) {
            f = r65Var.getX();
            z2 = true;
        } else {
            z2 = false;
            f = 0.0f;
        }
        this.q0 = h75Var.y4;
        e55Var.s = true;
        super.onLayout(z, i, i2, i3, i4);
        e55Var.s = false;
        h75Var.F1();
        this.r0 = true;
        if (z2 && r65Var.getLeft() != f) {
            float left = f - r65Var.getLeft();
            r65Var.setTranslationX(left);
            r45Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = r65Var.animate().translationX(0.0f).setDuration(350L);
            s33 s33Var = s33.f;
            duration.setInterpolator(s33Var).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(s33Var).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(s33Var).start();
            r45Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(s33Var).start();
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
        h75 h75Var = this.t0;
        q55 q55Var = h75Var.z1;
        x45 x45Var = h75Var.G1;
        LinearLayout linearLayout = h75Var.u3;
        c65 c65Var = h75Var.H1;
        r95 r95Var = h75Var.g4;
        n75 n75Var = h75Var.h4;
        vb4 vb4Var = h75Var.R1;
        dic dicVar = h75Var.v1;
        jia jiaVar = h75Var.N1;
        View view = h75Var.Z1;
        View view2 = h75Var.A4;
        View view3 = h75Var.z4;
        ArrayList arrayList = h75Var.R3;
        jia jiaVar2 = h75Var.P1;
        o55 o55Var = h75Var.A1;
        ArrayList arrayList2 = h75Var.S3;
        o39 o39Var = h75Var.f4;
        e55 e55Var = h75Var.T3;
        r65 r65Var = h75Var.J1;
        a55 a55Var = h75Var.e4;
        int size = View.MeasureSpec.getSize(i2);
        this.m0 = true;
        if (View.MeasureSpec.getSize(i) > size && !gl.O1()) {
            z = true;
        } else {
            z = false;
        }
        LaunchActivity launchActivity = h75Var.b2;
        if (launchActivity != null && gl.F1(launchActivity)) {
            z = h75.u5;
        }
        View.MeasureSpec.getSize(i);
        e55Var.getClass();
        if (gl.O1() && View.MeasureSpec.getSize(i) > size && !h75Var.i1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (h75.u5 != z) {
            h75.u5 = z;
            if (dicVar.getMeasuredWidth() == 0) {
                int i14 = dicVar.getLayoutParams().width;
            }
            h75Var.W = false;
            if (h75.u5) {
                i12 = 6;
            } else {
                i12 = 2;
            }
            vb4Var.x1(i12);
            r65Var.b0();
            a55Var.b0();
            this.p0 = true;
            TextView textView = h75Var.L1;
            if (textView != null) {
                if (!h75.u5) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                textView.setVisibility(i13);
            }
        }
        if (h75.v5 != z2) {
            h75.v5 = z2;
            if (z2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            o39Var.setVisibility(i11);
            r65Var.b0();
            a55Var.b0();
            z3 = true;
            this.p0 = true;
        } else {
            z3 = true;
        }
        if (this.p0) {
            h75Var.D0(z3);
            h75Var.I1.f();
            n75Var.G(o39Var, false);
            if (h75.v5) {
                r95Var.I(o39Var, false);
            }
            if (h75.v5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            o39Var.setVisibility(i7);
            if (h75.v5 && !e55Var.b) {
                z4 = true;
            } else {
                z4 = false;
            }
            r95Var.H(o39Var, z4, true);
            boolean z7 = h75.v5;
            if (z7 && !e55Var.b) {
                z5 = false;
            } else {
                z5 = true;
            }
            h75Var.F4 = z5;
            if (!z7 && e55Var.b) {
                z6 = true;
            } else {
                z6 = false;
            }
            n75Var.F(a55Var, z6);
            if (z6) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            a55Var.setVisibility(i8);
            if (!h75.v5 && e55Var.b) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            r65Var.setVisibility(i9);
            if (h75.u5) {
                i10 = 6;
            } else {
                i10 = 2;
            }
            vb4Var.x1(i10);
            h75Var.L1(false, false);
            r65Var.b0();
            a55Var.b0();
            gl.V3(r65Var);
            this.p0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            e55Var.setIsTablet(h75.v5);
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                ((h85) arrayList2.get(i15)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (h75Var.i1()) {
            L = gl.L(72.0f);
        } else {
            L = gl.L(245.0f);
        }
        int i16 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e55Var.getLayoutParams();
        if (h75.v5) {
            layoutParams.topMargin = a.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i17 = 0; i17 < 2; i17++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h75Var.c2[i17].getLayoutParams();
            if (h75.v5) {
                layoutParams2.rightMargin = gl.L(328.0f);
            } else {
                layoutParams2.rightMargin = gl.L(8.0f);
            }
        }
        if (o39Var != null) {
            ((FrameLayout.LayoutParams) o39Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        }
        if (o55Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o55Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (h75Var.i1()) {
            f = 40.0f;
        } else {
            f = 90.0f;
        }
        int L3 = gl.L(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r65Var.getLayoutParams();
        if (h75.v5) {
            if (h75Var.y4) {
                i6 = 5;
            } else {
                i6 = 1;
            }
            layoutParams3.gravity = i6;
            layoutParams3.width = gl.L(320.0f);
            int L4 = gl.L(4.0f);
            layoutParams3.leftMargin = L4;
            layoutParams3.rightMargin = L4;
            layoutParams3.bottomMargin = L3;
            layoutParams3.topMargin = a.getCurrentActionBarHeight();
            L2 = gl.L(60.0f);
            f2 = 90.0f;
        } else {
            f2 = 90.0f;
            if (h75.u5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = a.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = gl.L(14.0f);
                layoutParams3.rightMargin = gl.L(90.0f);
                layoutParams3.leftMargin = gl.L(14.0f);
                L2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L2 = gl.L(60.0f);
                layoutParams3.bottomMargin = L3;
                layoutParams3.topMargin = gl.L(14.0f) + a.getCurrentActionBarHeight();
                int L5 = gl.L(14.0f);
                layoutParams3.leftMargin = L5;
                layoutParams3.rightMargin = L5;
            }
        }
        int i18 = 81;
        if (h75.u5 && !h75.v5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
        } else {
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (h75.v5) {
                if (h75Var.y4) {
                    i4 = 85;
                } else {
                    i4 = 81;
                }
                layoutParams4.gravity = i4;
                layoutParams4.width = gl.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L3;
            if (h75.v5) {
                if (h75Var.y4) {
                    i3 = 85;
                } else {
                    i3 = 81;
                }
                layoutParams5.gravity = i3;
                layoutParams5.width = gl.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (h75.u5) {
            a55Var.setPadding(0, gl.L(9.0f), 0, gl.L(9.0f));
        } else {
            a55Var.setPadding(gl.L(9.0f), 0, gl.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) h75Var.o1.getLayoutParams();
        if (h75.v5) {
            layoutParams6.width = gl.L(320.0f);
            layoutParams6.height = gl.L(120.0f);
            if (h75Var.y4) {
                i18 = 85;
            }
            layoutParams6.gravity = i18;
            layoutParams6.rightMargin = 0;
        } else if (h75.u5) {
            layoutParams6.width = gl.L(f2);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = gl.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (h75.u5 && !h75.v5) {
            ((FrameLayout.LayoutParams) c65Var.getLayoutParams()).rightMargin = gl.L(f2);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = gl.L(f2);
            ((FrameLayout.LayoutParams) x45Var.getLayoutParams()).rightMargin = gl.L(f2);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = gl.L(f2);
        } else {
            ((FrameLayout.LayoutParams) c65Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) x45Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) a55Var.getLayoutParams();
        if (h75.u5) {
            if (!((t26) a55Var.getLayoutManager()).o) {
                ((t26) a55Var.getLayoutManager()).i1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = gl.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = gl.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((t26) a55Var.getLayoutManager()).o) {
                ((t26) a55Var.getLayoutManager()).i1(0);
            }
            layoutParams7.height = gl.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = gl.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        q55Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) q55Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (o55Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) o55Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(gl.L(259.0f), (i16 / 5) * 3);
        if (h75.v5) {
            e = 0;
            i5 = 0;
        } else {
            i5 = 0;
            e = ls6.e(8.0f, i16 - max, 0);
        }
        if (r65Var.getPaddingTop() != e || r65Var.getPaddingBottom() != L2) {
            r65Var.setPadding(i5, e, i5, L2);
        }
        if (jiaVar2 != null) {
            int L6 = ((gl.L(60.0f) + (i16 - e)) / 2) + e;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) jiaVar.getLayoutParams();
            layoutParams9.topMargin = L6 - gl.L(30.0f);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) jiaVar2.getLayoutParams();
            layoutParams10.topMargin = gl.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) h75Var.O1.getLayoutParams();
            if (layoutParams9.topMargin >= a.getCurrentActionBarHeight()) {
                if (gl.L(20.0f) + layoutParams10.topMargin <= size - gl.L(231.0f)) {
                    jiaVar.setVisibility(0);
                    jiaVar2.setVisibility(0);
                    layoutParams11.topMargin = L6;
                }
            }
            jiaVar.setVisibility(4);
            jiaVar2.setVisibility(4);
            layoutParams11.topMargin = L6 - gl.L(20.0f);
        }
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            ((h85) arrayList.get(i19)).g(e55Var.b, true);
        }
        this.m0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.o0) {
            this.o0 = measuredHeight;
            h75Var.T0(false);
        }
        h75Var.j4.f = getMeasuredWidth();
        h75Var.O0();
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
