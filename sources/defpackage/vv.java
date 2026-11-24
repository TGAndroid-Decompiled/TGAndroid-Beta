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
public final class vv extends View implements eib, dw {
    public bw a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final vg5 e;
    public final dx f;

    public vv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.e = vg5Var;
        this.f = dxVar;
    }

    @Override
    public int getBoundLeft() {
        bw bwVar = this.a;
        if (bwVar == null) {
            return -1;
        }
        int i = bwVar.s;
        return ug8.h(this.e, 18.0f, bwVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        bw bwVar = this.a;
        if (bwVar == null) {
            return -1;
        }
        int i = bwVar.s;
        return ug8.C(this.e, 18.0f, bwVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        bw bwVar = this.a;
        if (bwVar == null) {
            return -1;
        }
        int i = bwVar.s;
        return ug8.C(this.e, 18.0f, bwVar.m() + i);
    }

    public int getMinWidth() {
        return ug8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.a;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.a;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.a;
        if (bwVar != null) {
            bwVar.f(this);
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
        bw bwVar = this.a;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754852, o.g(this.e, this.f, bwVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        vv vvVar;
        int i3;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        vg5 vg5Var = this.e;
        vg5Var.getClass();
        this.c = gl.L(18.0f);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                vg5Var.getClass();
                i3 = gl.L(8.0f);
                vg5Var.getClass();
                this.d = gl.L(16.0f);
            } else {
                vg5Var.getClass();
                this.d = gl.L(8.0f);
                i3 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            vg5 vg5Var2 = this.e;
            int h = ug8.h(vg5Var2, 36.0f, size);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            dx dxVar = this.f;
            if (dxVar != null && dxVar.H) {
                alignment = lwa.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            vvVar = this;
            bw n = o.n(vg5Var2, vvVar, null, richText, h, 0, pageblocktitle2, alignment, 0, this.f);
            vvVar.a = n;
            if (n != null) {
                vg5Var.getClass();
                i3 += vvVar.a.d.getHeight() + gl.L(16.0f);
                bw bwVar = vvVar.a;
                bwVar.s = vvVar.c;
                bwVar.w = vvVar.d;
            }
        } else {
            vvVar = this;
            i3 = 1;
        }
        vvVar.setMeasuredDimension(size, i3);
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
