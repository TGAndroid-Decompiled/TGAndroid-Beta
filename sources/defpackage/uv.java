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
public final class uv extends View implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f;

    public uv(Activity activity, ui5 ui5Var, ey eyVar) {
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
        if (this.f == null) {
            return;
        }
        bx bxVar = this.c;
        ui5 ui5Var = this.a;
        if (bxVar != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            o.s(ui5Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, ui5Var, this.f, getMeasuredHeight());
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
        accessibilityNodeInfo.setText(o.f(2131754864, o.g(this.a, this.b, bxVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        uv uvVar;
        int i3;
        Layout.Alignment alignment;
        int C;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockFooter pageblockfooter = this.f;
        if (pageblockfooter != null) {
            int i4 = pageblockfooter.level;
            ui5 ui5Var = this.a;
            i3 = 0;
            if (i4 == 0) {
                ui5Var.getClass();
                this.e = gm.L(8.0f);
                ui5Var.getClass();
                this.d = gm.L(18.0f);
            } else {
                this.e = 0;
                ui5Var.getClass();
                this.d = gm.L((this.f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f.text;
            ui5 ui5Var2 = this.a;
            int h = wi8.h(ui5Var2, 36.0f, size) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f;
            ey eyVar = this.b;
            if (eyVar != null && eyVar.H) {
                alignment = oya.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            uvVar = this;
            bx n = o.n(ui5Var2, uvVar, null, richText, h, 0, pageblockfooter2, alignment, 0, this.b);
            uvVar.c = n;
            if (n != null) {
                int height = n.d.getHeight();
                if (uvVar.f.level > 0) {
                    C = wi8.C(ui5Var, 8.0f, height);
                } else {
                    C = wi8.C(ui5Var, 16.0f, height);
                }
                i3 = C;
                bx bxVar = uvVar.c;
                bxVar.s = uvVar.d;
                bxVar.w = uvVar.e;
            }
        } else {
            uvVar = this;
            i3 = 1;
        }
        uvVar.setMeasuredDimension(size, i3);
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
