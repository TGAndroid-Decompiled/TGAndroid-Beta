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
public final class xu extends ViewGroup implements eib, dw {
    public CheckBoxBase E;
    public final vg5 a;
    public final dx b;
    public bw c;
    public y29 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public vw x;
    public boolean y;

    public xu(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
        setWillNotDraw(false);
    }

    public final int a() {
        bw bwVar;
        vw vwVar = this.x;
        if (vwVar != null) {
            bwVar = vwVar.i;
        } else {
            bwVar = null;
        }
        if (bwVar == null) {
            return 0;
        }
        vg5 vg5Var = this.a;
        dx dxVar = this.b;
        if (dxVar != null && dxVar.H) {
            int h = ug8.h(vg5Var, 15.0f, getMeasuredWidth());
            ww wwVar = this.x.c;
            return (h - wwVar.c) - (gl.L(12.0f) * wwVar.f);
        }
        vg5Var.getClass();
        return de9.y(12.0f, this.x.c.f, (gl.L(15.0f) + this.x.c.c) - ((int) Math.ceil(bwVar.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i;
        int boundLeft;
        this.a.getClass();
        int L = gl.L(18.0f);
        if (this.E != null) {
            i = Math.min(Integer.MAX_VALUE, (this.e - gl.L(26.0f)) - L);
        } else {
            i = Integer.MAX_VALUE;
        }
        vw vwVar = this.x;
        if (vwVar != null && vwVar.i != null) {
            i = Math.min(i, (this.x.i.k() + a()) - L);
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
        vw vwVar = this.x;
        if (vwVar != null && vwVar.i != null) {
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
        vw vwVar;
        int i;
        int i2;
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            bw bwVar = this.x.i;
            vg5 vg5Var = this.a;
            if (bwVar != null) {
                canvas.save();
                dx dxVar = this.b;
                if (dxVar != null && dxVar.H) {
                    int h = ug8.h(vg5Var, 15.0f, measuredWidth);
                    ww wwVar = this.x.c;
                    float L = (h - wwVar.c) - (gl.L(12.0f) * wwVar.f);
                    int i3 = this.f + this.h;
                    if (this.y) {
                        i2 = gl.L(1.0f);
                    } else {
                        i2 = 0;
                    }
                    canvas.translate(L, i3 - i2);
                } else {
                    vg5Var.getClass();
                    float y = de9.y(12.0f, this.x.c.f, (gl.L(15.0f) + this.x.c.c) - ((int) Math.ceil(vwVar.i.d.getLineWidth(0))));
                    int i4 = this.f + this.h;
                    if (this.y) {
                        i = gl.L(1.0f);
                    } else {
                        i = 0;
                    }
                    canvas.translate(y, i4 - i);
                }
                this.x.i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.E;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - gl.L(26.0f), this.f, gl.L(20.0f), gl.L(20.0f));
                this.E.a(canvas);
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
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(vw vwVar) {
        vw vwVar2 = this.x;
        dx dxVar = this.b;
        if (vwVar2 != vwVar) {
            this.x = vwVar;
            y29 y29Var = this.d;
            if (y29Var != null) {
                removeView(y29Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && dxVar != null) {
                int I = dx.I(pageBlock);
                this.w = I;
                s49 x = dxVar.x(this, I);
                this.d = (y29) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && dxVar != null) {
            dxVar.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
