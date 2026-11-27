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
public final class r85 extends wma {
    public boolean g0;
    public final RectF h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final HashMap m0;
    public final j95 n0;

    public r85(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity, null);
        this.n0 = j95Var;
        this.g0 = false;
        this.h0 = new RectF();
        this.m0 = new HashMap();
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r85.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j95 j95Var = this.n0;
        t65 t65Var = j95Var.o1;
        c75 c75Var = j95Var.e4;
        t85 t85Var = j95Var.J1;
        g75 g75Var = j95Var.T3;
        if (j95Var.k4) {
            if (view == t85Var) {
                int childCount = t85Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = t85Var.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(childAt.getX(), childAt.getY());
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            if (view == g75Var || view == t65Var) {
                return super.drawChild(canvas, view, j);
            }
        } else if (j95.v5 || g75Var.c != 1.0f || (view != j95Var.H1 && view != j95Var.Z1 && view != j95Var.G1 && view != j95Var.X2 && view != j95Var.u3)) {
            if (j95Var.v4 && view == g75Var) {
                canvas.save();
                canvas.translate(c75Var.getX() + g75Var.getX(), c75Var.getY() + g75Var.getY());
                c75Var.draw(canvas);
                canvas.restore();
                return true;
            } else if (view != j95Var.s4 && view != j95Var.X3 && view != j95Var.M4 && (!j95Var.d4 || !j95Var.Z3 || (view != t85Var && view != t65Var && view != j95Var.V1 && view != j95Var.k3))) {
                return super.drawChild(canvas, view, j);
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n0.S1.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n0.S1.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int L;
        int L2 = hl.L(74.0f);
        j95 j95Var = this.n0;
        ImageReceiver imageReceiver = j95Var.S1;
        Drawable drawable = j95Var.Y1;
        g75 g75Var = j95Var.T3;
        float f2 = j95Var.s2 - L2;
        int L3 = hl.L(15.0f) + getMeasuredHeight();
        int i = j95Var.t0;
        int i2 = L3 + i;
        if (i + f2 < a.getCurrentActionBarHeight()) {
            float min = Math.min(1.0f, ((a.getCurrentActionBarHeight() - f2) - j95Var.t0) / ((L2 - j95Var.t0) - hl.L(14.0f)));
            int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L) * min);
            f2 -= currentActionBarHeight;
            i2 += currentActionBarHeight;
            f = 1.0f - min;
        } else {
            f = 1.0f;
        }
        float paddingTop = f2 + getPaddingTop();
        j95Var.P1();
        if (g75Var.c != 1.0f) {
            drawable.setBounds(0, (int) paddingTop, getMeasuredWidth(), i2);
            drawable.draw(canvas);
            if (f != 1.0f) {
                aob.s0.setColor(j95Var.O3);
                float L4 = j95Var.t0 + paddingTop + hl.L(24.0f);
                RectF rectF = this.h0;
                rectF.set(j95Var.u0, j95Var.t0 + paddingTop, getMeasuredWidth() - j95Var.u0, L4);
                canvas.drawRoundRect(rectF, hl.L(12.0f) * f, hl.L(12.0f) * f, aob.s0);
            }
            aob.s0.setColor(Color.argb((int) (j95Var.H1.getAlpha() * 255.0f), (int) (Color.red(j95Var.O3) * 0.8f), (int) (Color.green(j95Var.O3) * 0.8f), (int) (Color.blue(j95Var.O3) * 0.8f)));
            canvas.drawRect(j95Var.u0, 0.0f, getMeasuredWidth() - j95Var.u0, (int) (j95Var.h0 * 1.0f), aob.s0);
            c85 c85Var = j95Var.t2;
            if (c85Var != null) {
                aob.s0.setColor(c85Var.getBackgroundColor());
                canvas.drawRect(j95Var.u0, 0.0f, getMeasuredWidth() - j95Var.u0, (int) (j95Var.h0 * 1.0f), aob.s0);
            }
        }
        if (g75Var.c != 0.0f) {
            aob.s0.setColor(vm2.o(aob.w0(null, aob.Xg, false), (int) (g75Var.c * 255.0f)));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), aob.s0);
        }
        imageReceiver.i0((getMeasuredWidth() / 2.0f) - hl.L(30.0f), (getMeasuredHeight() / 2.0f) - hl.L(30.0f), hl.L(60.0f), hl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j95 j95Var = this.n0;
        k75 k75Var = j95Var.s4;
        if (j95Var.M4 != null && motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float x2 = j95Var.X3.getX();
            float y2 = j95Var.X3.getY();
            float x3 = j95Var.X3.getX() + j95Var.X3.getMeasuredWidth();
            float y3 = j95Var.X3.getY() + j95Var.X3.getMeasuredHeight();
            RectF rectF = this.h0;
            rectF.set(x2, y2, x3, y3);
            boolean z = !rectF.contains(x, y);
            rectF.set(k75Var.getX(), k75Var.getY(), k75Var.getX() + k75Var.getMeasuredWidth(), k75Var.getY() + k75Var.getMeasuredWidth() + j95Var.M4.getMeasuredHeight());
            if (rectF.contains(x, y)) {
                z = false;
            }
            if (z) {
                j95Var.U0(true);
                return true;
            }
        }
        if (motionEvent.getAction() == 0 && j95Var.s2 != 0.0f && motionEvent.getY() < j95Var.s2 - hl.L(37.0f) && j95Var.H1.getAlpha() == 0.0f && !j95Var.Y3 && j95Var.t2 == null && !j95Var.T3.b) {
            j95Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        j95 j95Var = this.n0;
        if (j95Var.M4 != null && i == 4) {
            j95Var.U0(true);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        float f;
        j95 j95Var = this.n0;
        View view = j95Var.A4;
        View view2 = j95Var.z4;
        t65 t65Var = j95Var.o1;
        g75 g75Var = j95Var.T3;
        t85 t85Var = j95Var.J1;
        if (j95.v5 && this.k0 != j95Var.y4 && this.l0) {
            f = t85Var.getX();
            z2 = true;
        } else {
            z2 = false;
            f = 0.0f;
        }
        this.k0 = j95Var.y4;
        g75Var.s = true;
        super.onLayout(z, i, i2, i3, i4);
        g75Var.s = false;
        j95Var.G1();
        this.l0 = true;
        if (z2 && t85Var.getLeft() != f) {
            float left = f - t85Var.getLeft();
            t85Var.setTranslationX(left);
            t65Var.setTranslationX(left);
            view2.setTranslationX(left);
            view.setTranslationX(left);
            ViewPropertyAnimator duration = t85Var.animate().translationX(0.0f).setDuration(350L);
            k43 k43Var = k43.f;
            duration.setInterpolator(k43Var).start();
            view2.animate().translationX(0.0f).setDuration(350L).setInterpolator(k43Var).start();
            view.animate().translationX(0.0f).setDuration(350L).setInterpolator(k43Var).start();
            t65Var.animate().translationX(0.0f).setDuration(350L).setInterpolator(k43Var).start();
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
        j95 j95Var = this.n0;
        s75 s75Var = j95Var.z1;
        z65 z65Var = j95Var.G1;
        LinearLayout linearLayout = j95Var.u3;
        e85 e85Var = j95Var.H1;
        sb5 sb5Var = j95Var.g4;
        p95 p95Var = j95Var.h4;
        sd4 sd4Var = j95Var.R1;
        kmc kmcVar = j95Var.v1;
        ema emaVar = j95Var.N1;
        View view = j95Var.Z1;
        View view2 = j95Var.A4;
        View view3 = j95Var.z4;
        ArrayList arrayList = j95Var.R3;
        ema emaVar2 = j95Var.P1;
        q75 q75Var = j95Var.A1;
        ArrayList arrayList2 = j95Var.S3;
        d79 d79Var = j95Var.f4;
        g75 g75Var = j95Var.T3;
        t85 t85Var = j95Var.J1;
        c75 c75Var = j95Var.e4;
        int size = View.MeasureSpec.getSize(i2);
        this.g0 = true;
        if (View.MeasureSpec.getSize(i) > size && !hl.O1()) {
            z = true;
        } else {
            z = false;
        }
        LaunchActivity launchActivity = j95Var.b2;
        if (launchActivity != null && hl.F1(launchActivity)) {
            z = j95.u5;
        }
        View.MeasureSpec.getSize(i);
        g75Var.getClass();
        if (hl.O1() && View.MeasureSpec.getSize(i) > size && !j95Var.j1()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j95.u5 != z) {
            j95.u5 = z;
            if (kmcVar.getMeasuredWidth() == 0) {
                int i14 = kmcVar.getLayoutParams().width;
            }
            j95Var.W = false;
            if (j95.u5) {
                i12 = 6;
            } else {
                i12 = 2;
            }
            sd4Var.x1(i12);
            t85Var.c0();
            c75Var.c0();
            this.j0 = true;
            TextView textView = j95Var.L1;
            if (textView != null) {
                if (!j95.u5) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                textView.setVisibility(i13);
            }
        }
        if (j95.v5 != z2) {
            j95.v5 = z2;
            if (z2) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            d79Var.setVisibility(i11);
            t85Var.c0();
            c75Var.c0();
            z3 = true;
            this.j0 = true;
        } else {
            z3 = true;
        }
        if (this.j0) {
            j95Var.E0(z3);
            j95Var.I1.f();
            p95Var.G(d79Var, false);
            if (j95.v5) {
                sb5Var.I(d79Var, false);
            }
            if (j95.v5) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            d79Var.setVisibility(i7);
            if (j95.v5 && !g75Var.b) {
                z4 = true;
            } else {
                z4 = false;
            }
            sb5Var.H(d79Var, z4, true);
            boolean z7 = j95.v5;
            if (z7 && !g75Var.b) {
                z5 = false;
            } else {
                z5 = true;
            }
            j95Var.F4 = z5;
            if (!z7 && g75Var.b) {
                z6 = true;
            } else {
                z6 = false;
            }
            p95Var.F(c75Var, z6);
            if (z6) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            c75Var.setVisibility(i8);
            if (!j95.v5 && g75Var.b) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            t85Var.setVisibility(i9);
            if (j95.u5) {
                i10 = 6;
            } else {
                i10 = 2;
            }
            sd4Var.x1(i10);
            j95Var.M1(false, false);
            t85Var.c0();
            c75Var.c0();
            hl.V3(t85Var);
            this.j0 = false;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            g75Var.setIsTablet(j95.v5);
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                ((ka5) arrayList2.get(i15)).j(true);
            }
        }
        int paddingTop = size - getPaddingTop();
        if (j95Var.j1()) {
            L = hl.L(72.0f);
        } else {
            L = hl.L(245.0f);
        }
        int i16 = paddingTop - L;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g75Var.getLayoutParams();
        if (j95.v5) {
            layoutParams.topMargin = a.getCurrentActionBarHeight();
        } else {
            layoutParams.topMargin = 0;
        }
        for (int i17 = 0; i17 < 2; i17++) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j95Var.c2[i17].getLayoutParams();
            if (j95.v5) {
                layoutParams2.rightMargin = hl.L(328.0f);
            } else {
                layoutParams2.rightMargin = hl.L(8.0f);
            }
        }
        if (d79Var != null) {
            ((FrameLayout.LayoutParams) d79Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        }
        if (q75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) q75Var.getEmojiView().getLayoutParams()).gravity = 80;
        }
        if (j95Var.j1()) {
            f = 40.0f;
        } else {
            f = 90.0f;
        }
        int L3 = hl.L(f);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) t85Var.getLayoutParams();
        if (j95.v5) {
            if (j95Var.y4) {
                i6 = 5;
            } else {
                i6 = 1;
            }
            layoutParams3.gravity = i6;
            layoutParams3.width = hl.L(320.0f);
            int L4 = hl.L(4.0f);
            layoutParams3.leftMargin = L4;
            layoutParams3.rightMargin = L4;
            layoutParams3.bottomMargin = L3;
            layoutParams3.topMargin = a.getCurrentActionBarHeight();
            L2 = hl.L(60.0f);
            f2 = 90.0f;
        } else {
            f2 = 90.0f;
            if (j95.u5) {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                layoutParams3.topMargin = a.getCurrentActionBarHeight();
                layoutParams3.bottomMargin = hl.L(14.0f);
                layoutParams3.rightMargin = hl.L(90.0f);
                layoutParams3.leftMargin = hl.L(14.0f);
                L2 = 0;
            } else {
                layoutParams3.gravity = 51;
                layoutParams3.width = -1;
                L2 = hl.L(60.0f);
                layoutParams3.bottomMargin = L3;
                layoutParams3.topMargin = hl.L(14.0f) + a.getCurrentActionBarHeight();
                int L5 = hl.L(14.0f);
                layoutParams3.leftMargin = L5;
                layoutParams3.rightMargin = L5;
            }
        }
        int i18 = 81;
        if (j95.u5 && !j95.v5) {
            view3.setVisibility(8);
            view2.setVisibility(8);
        } else {
            view3.setVisibility(0);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams4.bottomMargin = L3;
            if (j95.v5) {
                if (j95Var.y4) {
                    i4 = 85;
                } else {
                    i4 = 81;
                }
                layoutParams4.gravity = i4;
                layoutParams4.width = hl.L(328.0f);
            } else {
                layoutParams4.width = -1;
            }
            view2.setVisibility(0);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams5.height = L3;
            if (j95.v5) {
                if (j95Var.y4) {
                    i3 = 85;
                } else {
                    i3 = 81;
                }
                layoutParams5.gravity = i3;
                layoutParams5.width = hl.L(328.0f);
            } else {
                layoutParams5.width = -1;
            }
        }
        if (j95.u5) {
            c75Var.setPadding(0, hl.L(9.0f), 0, hl.L(9.0f));
        } else {
            c75Var.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) j95Var.o1.getLayoutParams();
        if (j95.v5) {
            layoutParams6.width = hl.L(320.0f);
            layoutParams6.height = hl.L(120.0f);
            if (j95Var.y4) {
                i18 = 85;
            }
            layoutParams6.gravity = i18;
            layoutParams6.rightMargin = 0;
        } else if (j95.u5) {
            layoutParams6.width = hl.L(f2);
            layoutParams6.height = -1;
            layoutParams6.gravity = 53;
        } else {
            layoutParams6.width = -1;
            layoutParams6.height = hl.L(120.0f);
            layoutParams6.gravity = 81;
            layoutParams6.rightMargin = 0;
        }
        if (j95.u5 && !j95.v5) {
            ((FrameLayout.LayoutParams) e85Var.getLayoutParams()).rightMargin = hl.L(f2);
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = hl.L(f2);
            ((FrameLayout.LayoutParams) z65Var.getLayoutParams()).rightMargin = hl.L(f2);
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = hl.L(f2);
        } else {
            ((FrameLayout.LayoutParams) e85Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) z65Var.getLayoutParams()).rightMargin = 0;
            ((FrameLayout.LayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) c75Var.getLayoutParams();
        if (j95.u5) {
            if (!((x46) c75Var.getLayoutManager()).o) {
                ((x46) c75Var.getLayoutManager()).i1(1);
            }
            layoutParams7.height = -1;
            layoutParams7.width = hl.L(80.0f);
            layoutParams7.gravity = 53;
            layoutParams7.rightMargin = hl.L(100.0f);
            layoutParams7.bottomMargin = 0;
        } else {
            if (((x46) c75Var.getLayoutManager()).o) {
                ((x46) c75Var.getLayoutManager()).i1(0);
            }
            layoutParams7.height = hl.L(80.0f);
            layoutParams7.width = -1;
            layoutParams7.gravity = 80;
            layoutParams7.rightMargin = 0;
            layoutParams7.bottomMargin = hl.L(100.0f);
        }
        ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        s75Var.invalidate();
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) s75Var.getLayoutParams();
        layoutParams8.height = size;
        layoutParams8.topMargin = -getPaddingTop();
        if (q75Var.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) q75Var.getEmojiView().getLayoutParams()).bottomMargin = -getPaddingBottom();
        }
        int max = Math.max(hl.L(259.0f), (i16 / 5) * 3);
        if (j95.v5) {
            e = 0;
            i5 = 0;
        } else {
            i5 = 0;
            e = qu6.e(8.0f, i16 - max, 0);
        }
        if (t85Var.getPaddingTop() != e || t85Var.getPaddingBottom() != L2) {
            t85Var.setPadding(i5, e, i5, L2);
        }
        if (emaVar2 != null) {
            int L6 = ((hl.L(60.0f) + (i16 - e)) / 2) + e;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) emaVar.getLayoutParams();
            layoutParams9.topMargin = L6 - hl.L(30.0f);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) emaVar2.getLayoutParams();
            layoutParams10.topMargin = hl.L(80.0f) + L6;
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) j95Var.O1.getLayoutParams();
            if (layoutParams9.topMargin >= a.getCurrentActionBarHeight()) {
                if (hl.L(20.0f) + layoutParams10.topMargin <= size - hl.L(231.0f)) {
                    emaVar.setVisibility(0);
                    emaVar2.setVisibility(0);
                    layoutParams11.topMargin = L6;
                }
            }
            emaVar.setVisibility(4);
            emaVar2.setVisibility(4);
            layoutParams11.topMargin = L6 - hl.L(20.0f);
        }
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            ((ka5) arrayList.get(i19)).g(g75Var.b, true);
        }
        this.g0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        if (measuredHeight != this.i0) {
            this.i0 = measuredHeight;
            j95Var.U0(false);
        }
        j95Var.j4.f = getMeasuredWidth();
        j95Var.P0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.n0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.n0.P1();
    }
}
