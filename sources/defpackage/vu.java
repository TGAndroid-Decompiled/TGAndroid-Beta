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
public final class vu extends View implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f;

    public vu(Activity activity, xi5 xi5Var, ex exVar) {
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
        if (this.f == null) {
            return;
        }
        cw cwVar = this.c;
        xi5 xi5Var = this.a;
        if (cwVar != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(xi5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, xi5Var, this.f, getMeasuredHeight());
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
        accessibilityNodeInfo.setText(o.f(2131754860, o.g(this.a, this.b, cwVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        vu vuVar;
        int i3;
        Layout.Alignment alignment;
        int C;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockFooter pageblockfooter = this.f;
        if (pageblockfooter != null) {
            int i4 = pageblockfooter.level;
            xi5 xi5Var = this.a;
            i3 = 0;
            if (i4 == 0) {
                xi5Var.getClass();
                this.e = hl.L(8.0f);
                xi5Var.getClass();
                this.d = hl.L(18.0f);
            } else {
                this.e = 0;
                xi5Var.getClass();
                this.d = hl.L((this.f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f.text;
            xi5 xi5Var2 = this.a;
            int h = ik8.h(xi5Var2, 36.0f, size) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f;
            ex exVar = this.b;
            if (exVar != null && exVar.H) {
                alignment = o0b.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            vuVar = this;
            cw n = o.n(xi5Var2, vuVar, null, richText, h, 0, pageblockfooter2, alignment, 0, this.b);
            vuVar.c = n;
            if (n != null) {
                int height = n.d.getHeight();
                if (vuVar.f.level > 0) {
                    C = ik8.C(xi5Var, 8.0f, height);
                } else {
                    C = ik8.C(xi5Var, 16.0f, height);
                }
                i3 = C;
                cw cwVar = vuVar.c;
                cwVar.s = vuVar.d;
                cwVar.w = vuVar.e;
            }
        } else {
            vuVar = this;
            i3 = 1;
        }
        vuVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f = pageblockfooter;
        requestLayout();
    }
}
