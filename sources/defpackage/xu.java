package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class xu extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f;

    public xu(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.a = xi5Var;
        this.b = exVar;
    }

    @Override
    public int getBoundLeft() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.h(this.a, 18.0f, cwVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.C(this.a, 18.0f, cwVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        cw cwVar = this.c;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.C(this.a, 18.0f, cwVar.m() + i);
    }

    public int getMinWidth() {
        return ik8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
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
        if (this.d != null && this.c != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            o.s(this.a, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754856, o.g(this.a, this.b, cwVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        xu xuVar;
        int i3;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        xi5 xi5Var = this.a;
        xi5Var.getClass();
        this.e = hl.L(18.0f);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f = hl.L(16.0f);
                i3 = hl.L(8.0f);
            } else {
                this.f = hl.L(8.0f);
                i3 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            xi5 xi5Var2 = this.a;
            int h = ik8.h(xi5Var2, 36.0f, size);
            int i4 = this.f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            ex exVar = this.b;
            if (exVar != null && exVar.H) {
                alignment = o0b.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            xuVar = this;
            cw n = o.n(xi5Var2, xuVar, null, richText, h, i4, pageblockkicker2, alignment, 0, this.b);
            xuVar.c = n;
            if (n != null) {
                xi5Var.getClass();
                i3 += xuVar.c.d.getHeight() + hl.L(16.0f);
                cw cwVar = xuVar.c;
                cwVar.s = xuVar.e;
                cwVar.w = xuVar.f;
            }
        } else {
            xuVar = this;
            i3 = 1;
        }
        xuVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.e, this.f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
