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
public final class wv extends View implements zlb, ew {
    public cw a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final xi5 e;
    public final ex f;

    public wv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.e = xi5Var;
        this.f = exVar;
    }

    @Override
    public int getBoundLeft() {
        cw cwVar = this.a;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.h(this.e, 18.0f, cwVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        cw cwVar = this.a;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.C(this.e, 18.0f, cwVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        cw cwVar = this.a;
        if (cwVar == null) {
            return -1;
        }
        int i = cwVar.s;
        return ik8.C(this.e, 18.0f, cwVar.m() + i);
    }

    public int getMinWidth() {
        return ik8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.a;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.a;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.a;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.b != null && this.a != null) {
            canvas.save();
            canvas.translate(this.c, this.d);
            o.s(this.e, canvas, this, 0);
            this.a.d(canvas, this);
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
        cw cwVar = this.a;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754848, o.g(this.e, this.f, cwVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        wv wvVar;
        int i3;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        xi5 xi5Var = this.e;
        xi5Var.getClass();
        this.c = hl.L(18.0f);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                xi5Var.getClass();
                i3 = hl.L(8.0f);
                xi5Var.getClass();
                this.d = hl.L(16.0f);
            } else {
                xi5Var.getClass();
                this.d = hl.L(8.0f);
                i3 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            xi5 xi5Var2 = this.e;
            int h = ik8.h(xi5Var2, 36.0f, size);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            ex exVar = this.f;
            if (exVar != null && exVar.H) {
                alignment = o0b.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            wvVar = this;
            cw n = o.n(xi5Var2, wvVar, null, richText, h, 0, pageblocktitle2, alignment, 0, this.f);
            wvVar.a = n;
            if (n != null) {
                xi5Var.getClass();
                i3 += wvVar.a.d.getHeight() + hl.L(16.0f);
                cw cwVar = wvVar.a;
                cwVar.s = wvVar.c;
                cwVar.w = wvVar.d;
            }
        } else {
            wvVar = this;
            i3 = 1;
        }
        wvVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.e, this.f, motionEvent, this, this.a, this.c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.b = pageblocktitle;
        requestLayout();
    }
}
