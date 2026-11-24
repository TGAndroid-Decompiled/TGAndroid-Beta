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
public final class vv extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public int d;
    public int e;
    public TL_iv.PageBlock f;

    public vv(Activity activity, ui5 ui5Var, ey eyVar) {
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
        int i = this.d;
        return wi8.h(this.a, 18.0f, bxVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = this.d;
        return wi8.C(this.a, 18.0f, bxVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        bx bxVar = this.c;
        if (bxVar == null) {
            return -1;
        }
        int i = this.d;
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
        if (this.f != null && this.c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(this.a, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754862, o.g(this.a, this.b, bxVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        vv vvVar;
        int i3;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        ui5 ui5Var = this.a;
        ui5Var.getClass();
        this.d = gm.L(18.0f);
        ui5Var.getClass();
        this.e = gm.L(8.0f);
        TL_iv.PageBlock pageBlock = this.f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            ui5 ui5Var2 = this.a;
            int h = wi8.h(ui5Var2, 36.0f, size);
            TL_iv.PageBlock pageBlock2 = this.f;
            ey eyVar = this.b;
            if (eyVar != null && eyVar.H) {
                alignment = oya.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            vvVar = this;
            bx n = o.n(ui5Var2, vvVar, null, richText, h, 0, pageBlock2, alignment, 0, this.b);
            vvVar.c = n;
            if (n != null) {
                ui5Var.getClass();
                i3 = vvVar.c.d.getHeight() + gm.L(16.0f);
                bx bxVar = vvVar.c;
                bxVar.s = vvVar.d;
                bxVar.w = vvVar.e;
            } else {
                i3 = 0;
            }
        } else {
            vvVar = this;
            i3 = 1;
        }
        vvVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f = pageBlock;
        requestLayout();
    }
}
