package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.o;
public final class av extends ViewGroup implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public y29 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public xw x;
    public CheckBoxBase y;

    public av(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
        setWillNotDraw(false);
    }

    public final int a() {
        bw bwVar;
        xw xwVar = this.x;
        if (xwVar != null) {
            bwVar = xwVar.i;
        } else {
            bwVar = null;
        }
        if (bwVar == null) {
            return 0;
        }
        vg5 vg5Var = this.a;
        dx dxVar = this.b;
        if (dxVar != null && dxVar.H) {
            int h = ug8.h(vg5Var, 18.0f, getMeasuredWidth());
            yw ywVar = this.x.c;
            return (h - ywVar.b) - (gl.L(20.0f) * ywVar.e);
        }
        vg5Var.getClass();
        return de9.y(20.0f, this.x.c.e, (gl.L(18.0f) + this.x.c.b) - ((int) Math.ceil(bwVar.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i;
        int boundLeft;
        this.a.getClass();
        int L = gl.L(18.0f);
        xw xwVar = this.x;
        if (xwVar != null && xwVar.i != null) {
            i = Math.min(Integer.MAX_VALUE, (this.x.i.k() + a()) - L);
        } else {
            i = Integer.MAX_VALUE;
        }
        bw bwVar = this.c;
        if (bwVar != null) {
            i = Math.min(i, (bwVar.k() + bwVar.s) - L);
        }
        y29 y29Var = this.d;
        if (y29Var != null) {
            View view = y29Var.a;
            if ((view instanceof dw) && (boundLeft = ((dw) view).getBoundLeft()) != -1) {
                i = Math.min(i, this.n + boundLeft);
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    @Override
    public int getBoundRight() {
        int i;
        int boundRight;
        this.a.getClass();
        int L = gl.L(18.0f);
        xw xwVar = this.x;
        if (xwVar != null && xwVar.i != null) {
            i = Math.max(Integer.MIN_VALUE, this.x.i.l() + a() + L);
        } else {
            i = Integer.MIN_VALUE;
        }
        bw bwVar = this.c;
        if (bwVar != null) {
            i = Math.max(i, bwVar.l() + bwVar.s + L);
        }
        y29 y29Var = this.d;
        if (y29Var != null) {
            View view = y29Var.a;
            if ((view instanceof dw) && (boundRight = ((dw) view).getBoundRight()) != -1) {
                i = Math.max(i, this.n + boundRight);
            }
        }
        if (i == Integer.MIN_VALUE) {
            return -1;
        }
        return i;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        bw bwVar = this.c;
        if (bwVar != null) {
            return ug8.C(this.a, 18.0f, bwVar.m() + bwVar.s);
        }
        y29 y29Var = this.d;
        if (y29Var != null) {
            View view = y29Var.a;
            if ((view instanceof dw) && (lastLineBoundRight = ((dw) view).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public int getMinWidth() {
        return ug8.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y29 y29Var = this.d;
        if (y29Var != null) {
            y29Var.a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        y29 y29Var = this.d;
        if (y29Var != null) {
            View view = y29Var.a;
            if (view instanceof eib) {
                ((eib) view).k(arrayList);
            }
        }
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            bw bwVar = this.x.i;
            vg5 vg5Var = this.a;
            if (bwVar != null) {
                canvas.save();
                dx dxVar = this.b;
                if (dxVar != null && dxVar.H) {
                    int h = ug8.h(vg5Var, 18.0f, measuredWidth);
                    yw ywVar = this.x.c;
                    canvas.translate((h - ywVar.b) - (gl.L(20.0f) * ywVar.e), this.f + this.h);
                } else {
                    vg5Var.getClass();
                    int L = gl.L(18.0f);
                    xw xwVar = this.x;
                    canvas.translate(de9.y(20.0f, this.x.c.e, (L + xwVar.c.b) - ((int) Math.ceil(xwVar.i.d.getLineWidth(0)))), this.f + this.h);
                }
                this.x.i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - gl.L(26.0f), this.f, gl.L(20.0f), gl.L(20.0f));
                this.y.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(vg5Var, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        bw bwVar = this.c;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bwVar));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        y29 y29Var = this.d;
        if (y29Var != null) {
            View view = y29Var.a;
            int i5 = this.n;
            view.layout(i5, this.r, view.getMeasuredWidth() + i5, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    @Override
    public final void onMeasure(int r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(xw xwVar) {
        xw xwVar2 = this.x;
        dx dxVar = this.b;
        if (xwVar2 != xwVar) {
            this.x = xwVar;
            y29 y29Var = this.d;
            if (y29Var != null) {
                removeView(y29Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && dxVar != null) {
                int I = dx.I(pageBlock);
                this.s = I;
                s49 x = dxVar.x(this, I);
                this.d = (y29) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && dxVar != null) {
            dxVar.H(this.s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
