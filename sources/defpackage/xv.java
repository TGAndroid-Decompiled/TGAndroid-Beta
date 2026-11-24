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
public final class xv extends ViewGroup implements fkb, dx {
    public CheckBoxBase E;
    public final ui5 a;
    public final ey b;
    public bx c;
    public b59 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public int w;
    public vx x;
    public boolean y;

    public xv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
        setWillNotDraw(false);
    }

    public final int a() {
        bx bxVar;
        vx vxVar = this.x;
        if (vxVar != null) {
            bxVar = vxVar.i;
        } else {
            bxVar = null;
        }
        if (bxVar == null) {
            return 0;
        }
        ui5 ui5Var = this.a;
        ey eyVar = this.b;
        if (eyVar != null && eyVar.H) {
            int h = wi8.h(ui5Var, 15.0f, getMeasuredWidth());
            wx wxVar = this.x.c;
            return (h - wxVar.c) - (gm.L(12.0f) * wxVar.f);
        }
        ui5Var.getClass();
        return hg9.y(12.0f, this.x.c.f, (gm.L(15.0f) + this.x.c.c) - ((int) Math.ceil(bxVar.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i;
        int boundLeft;
        this.a.getClass();
        int L = gm.L(18.0f);
        if (this.E != null) {
            i = Math.min(Integer.MAX_VALUE, (this.e - gm.L(26.0f)) - L);
        } else {
            i = Integer.MAX_VALUE;
        }
        vx vxVar = this.x;
        if (vxVar != null && vxVar.i != null) {
            i = Math.min(i, (this.x.i.k() + a()) - L);
        }
        bx bxVar = this.c;
        if (bxVar != null) {
            i = Math.min(i, (bxVar.k() + bxVar.s) - L);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            View view = b59Var.a;
            if ((view instanceof dx) && (boundLeft = ((dx) view).getBoundLeft()) != -1) {
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
        int L = gm.L(18.0f);
        vx vxVar = this.x;
        if (vxVar != null && vxVar.i != null) {
            i = Math.max(Integer.MIN_VALUE, this.x.i.l() + a() + L);
        } else {
            i = Integer.MIN_VALUE;
        }
        bx bxVar = this.c;
        if (bxVar != null) {
            i = Math.max(i, bxVar.l() + bxVar.s + L);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            View view = b59Var.a;
            if ((view instanceof dx) && (boundRight = ((dx) view).getBoundRight()) != -1) {
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
        bx bxVar = this.c;
        if (bxVar != null) {
            return wi8.C(this.a, 18.0f, bxVar.m() + bxVar.s);
        }
        b59 b59Var = this.d;
        if (b59Var != null) {
            View view = b59Var.a;
            if ((view instanceof dx) && (lastLineBoundRight = ((dx) view).getLastLineBoundRight()) != -1) {
                return this.n + lastLineBoundRight;
            }
        }
        return -1;
    }

    public int getMinWidth() {
        return wi8.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b59 b59Var = this.d;
        if (b59Var != null) {
            b59Var.a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        b59 b59Var = this.d;
        if (b59Var != null) {
            View view = b59Var.a;
            if (view instanceof fkb) {
                ((fkb) view).k(arrayList);
            }
        }
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vx vxVar;
        int i;
        int i2;
        if (this.x != null) {
            int measuredWidth = getMeasuredWidth();
            bx bxVar = this.x.i;
            ui5 ui5Var = this.a;
            if (bxVar != null) {
                canvas.save();
                ey eyVar = this.b;
                if (eyVar != null && eyVar.H) {
                    int h = wi8.h(ui5Var, 15.0f, measuredWidth);
                    wx wxVar = this.x.c;
                    float L = (h - wxVar.c) - (gm.L(12.0f) * wxVar.f);
                    int i3 = this.f + this.h;
                    if (this.y) {
                        i2 = gm.L(1.0f);
                    } else {
                        i2 = 0;
                    }
                    canvas.translate(L, i3 - i2);
                } else {
                    ui5Var.getClass();
                    float y = hg9.y(12.0f, this.x.c.f, (gm.L(15.0f) + this.x.c.c) - ((int) Math.ceil(vxVar.i.d.getLineWidth(0))));
                    int i4 = this.f + this.h;
                    if (this.y) {
                        i = gm.L(1.0f);
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
                checkBoxBase.e(this.e - gm.L(26.0f), this.f, gm.L(20.0f), gm.L(20.0f));
                this.E.a(canvas);
            }
            if (this.c != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(ui5Var, canvas, this, 0);
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
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.g(this.a, this.b, bxVar));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b59 b59Var = this.d;
        if (b59Var != null) {
            View view = b59Var.a;
            int i5 = this.n;
            view.layout(i5, this.r, view.getMeasuredWidth() + i5, this.d.a.getMeasuredHeight() + this.r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.i(this.a, this.b, motionEvent, this, this.c, this.e, this.f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(vx vxVar) {
        vx vxVar2 = this.x;
        ey eyVar = this.b;
        if (vxVar2 != vxVar) {
            this.x = vxVar;
            b59 b59Var = this.d;
            if (b59Var != null) {
                removeView(b59Var.a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.x.d;
            if (pageBlock != null && eyVar != null) {
                int I = ey.I(pageBlock);
                this.w = I;
                u69 x = eyVar.x(this, I);
                this.d = (b59) x;
                addView(x.a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.x.d;
        if (pageBlock2 != null && eyVar != null) {
            eyVar.H(this.w, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
