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
public final class vw extends View implements fkb, dx {
    public bx a;
    public TL_iv.pageBlockTitle b;
    public int c;
    public int d;
    public final ui5 e;
    public final ey f;

    public vw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.e = ui5Var;
        this.f = eyVar;
    }

    @Override
    public int getBoundLeft() {
        bx bxVar = this.a;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.h(this.e, 18.0f, bxVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        bx bxVar = this.a;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.C(this.e, 18.0f, bxVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        bx bxVar = this.a;
        if (bxVar == null) {
            return -1;
        }
        int i = bxVar.s;
        return wi8.C(this.e, 18.0f, bxVar.m() + i);
    }

    public int getMinWidth() {
        return wi8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.a;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.a;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.a;
        if (bxVar != null) {
            bxVar.f(this);
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
        bx bxVar = this.a;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754852, o.g(this.e, this.f, bxVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        vw vwVar;
        int i3;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        ui5 ui5Var = this.e;
        ui5Var.getClass();
        this.c = gm.L(18.0f);
        TL_iv.pageBlockTitle pageblocktitle = this.b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                ui5Var.getClass();
                i3 = gm.L(8.0f);
                ui5Var.getClass();
                this.d = gm.L(16.0f);
            } else {
                ui5Var.getClass();
                this.d = gm.L(8.0f);
                i3 = 0;
            }
            TL_iv.RichText richText = this.b.text;
            ui5 ui5Var2 = this.e;
            int h = wi8.h(ui5Var2, 36.0f, size);
            TL_iv.pageBlockTitle pageblocktitle2 = this.b;
            ey eyVar = this.f;
            if (eyVar != null && eyVar.H) {
                alignment = oya.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            vwVar = this;
            bx n = o.n(ui5Var2, vwVar, null, richText, h, 0, pageblocktitle2, alignment, 0, this.f);
            vwVar.a = n;
            if (n != null) {
                ui5Var.getClass();
                i3 += vwVar.a.d.getHeight() + gm.L(16.0f);
                bx bxVar = vwVar.a;
                bxVar.s = vwVar.c;
                bxVar.w = vwVar.d;
            }
        } else {
            vwVar = this;
            i3 = 1;
        }
        vwVar.setMeasuredDimension(size, i3);
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
