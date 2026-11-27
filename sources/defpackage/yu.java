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
public final class yu extends ViewGroup implements zlb, ew {
    public CheckBoxBase E;
    public final xi5 a;
    public final ex b;
    public cw c;
    public n69 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public ww x;
    public boolean y;

    public yu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
        setWillNotDraw(false);
    }

    public final int a() {
        cw cwVar;
        ww wwVar = this.x;
        if (wwVar != null) {
            cwVar = wwVar.i;
        } else {
            cwVar = null;
        }
        if (cwVar == null) {
            return 0;
        }
        xi5 xi5Var = this.a;
        ex exVar = this.b;
        if (exVar != null && exVar.H) {
            int h = ik8.h(xi5Var, 15.0f, getMeasuredWidth());
            xw xwVar = this.x.c;
            return (h - xwVar.c) - (hl.L(12.0f) * xwVar.f);
        }
        xi5Var.getClass();
        return uh9.y(12.0f, this.x.c.f, (hl.L(15.0f) + this.x.c.c) - ((int) Math.ceil(cwVar.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i;
        int boundLeft;
        this.a.getClass();
        int L = hl.L(18.0f);
        if (this.E != null) {
            i = Math.min(Integer.MAX_VALUE, (this.e - hl.L(26.0f)) - L);
        } else {
            i = Integer.MAX_VALUE;
        }
        ww wwVar = this.x;
        if (wwVar != null && wwVar.i != null) {
            i = Math.min(i, (this.x.i.k() + a()) - L);
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            i = Math.min(i, (cwVar.k() + cwVar.s) - L);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            View view = n69Var.a;
            if ((view instanceof ew) && (boundLeft = ((ew) view).getBoundLeft()) != -1) {
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
        int L = hl.L(18.0f);
        ww wwVar = this.x;
        if (wwVar != null && wwVar.i != null) {
            i = Math.max(Integer.MIN_VALUE, this.x.i.l() + a() + L);
        } else {
            i = Integer.MIN_VALUE;
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            i = Math.max(i, cwVar.l() + cwVar.s + L);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            View view = n69Var.a;
            if ((view instanceof ew) && (boundRight = ((ew) view).getBoundRight()) != -1) {
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
        cw cwVar = this.c;
        if (cwVar != null) {
            return ik8.C(this.a, 18.0f, cwVar.m() + cwVar.s);
        }
        n69 n69Var = this.d;
        if (n69Var != null) {
            View view = n69Var.a;
            if ((view instanceof ew) && (lastLineBoundRight = ((ew) view).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public int getMinWidth() {
        return ik8.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        n69 n69Var = this.d;
        if (n69Var != null) {
            n69Var.a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        n69 n69Var = this.d;
        if (n69Var != null) {
            View view = n69Var.a;
            if (view instanceof zlb) {
                ((zlb) view).k(arrayList);
            }
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ww wwVar;
        int i;
        int i2;
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            cw cwVar = this.x.i;
            xi5 xi5Var = this.a;
            if (cwVar != null) {
                canvas.save();
                ex exVar = this.b;
                if (exVar != null && exVar.H) {
                    int h = ik8.h(xi5Var, 15.0f, measuredWidth);
                    xw xwVar = this.x.c;
                    float L = (h - xwVar.c) - (hl.L(12.0f) * xwVar.f);
                    int i3 = this.f + this.h;
                    if (this.y) {
                        i2 = hl.L(1.0f);
                    } else {
                        i2 = 0;
                    }
                    canvas.translate(L, i3 - i2);
                } else {
                    xi5Var.getClass();
                    float y = uh9.y(12.0f, this.x.c.f, (hl.L(15.0f) + this.x.c.c) - ((int) Math.ceil(wwVar.i.d.getLineWidth(0))));
                    int i4 = this.f + this.h;
                    if (this.y) {
                        i = hl.L(1.0f);
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
                checkBoxBase.e(this.e - hl.L(26.0f), this.f, hl.L(20.0f), hl.L(20.0f));
                this.E.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(xi5Var, canvas, this, 0);
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
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, cwVar));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n69 n69Var = this.d;
        if (n69Var != null) {
            View view = n69Var.a;
            int i5 = this.n;
            view.layout(i5, this.r, view.getMeasuredWidth() + i5, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(ww wwVar) {
        ww wwVar2 = this.x;
        ex exVar = this.b;
        if (wwVar2 != wwVar) {
            this.x = wwVar;
            n69 n69Var = this.d;
            if (n69Var != null) {
                removeView(n69Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && exVar != null) {
                int I = ex.I(pageBlock);
                this.w = I;
                f89 x = exVar.x(this, I);
                this.d = (n69) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && exVar != null) {
            exVar.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
