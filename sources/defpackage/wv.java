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
public final class wv extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f;

    public wv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override
    public int getBoundLeft() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.h(this.a, 18.0f, bxVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.C(this.a, 18.0f, bxVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.C(this.a, 18.0f, bxVar.m() + i);
    }

    public int getMinWidth() {
        return wi8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
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
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754860, o.g(this.a, this.b, bxVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        wv wvVar;
        int i3;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        this.e = gm.L(18.0f);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f = gm.L(16.0f);
                i3 = gm.L(8.0f);
            } else {
                this.f = gm.L(8.0f);
                i3 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            ui5 ui5Var2 = this.a;
            int h = wi8.h(ui5Var2, 36.0f, size);
            int i4 = this.f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            ey eyVar = this.b;
            if (eyVar != null && eyVar.H) {
                alignment = oya.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            wvVar = this;
            bx n = o.n(ui5Var2, wvVar, null, richText, h, i4, pageblockkicker2, alignment, 0, this.b);
            wvVar.c = n;
            if (n != null) {
                ui5Var.getClass();
                i3 += wvVar.c.d.getHeight() + gm.L(16.0f);
                bx bxVar = wvVar.c;
                bxVar.s = wvVar.e;
                bxVar.w = wvVar.f;
            }
        } else {
            wvVar = this;
            i3 = 1;
        }
        wvVar.setMeasuredDimension(size, i3);
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
