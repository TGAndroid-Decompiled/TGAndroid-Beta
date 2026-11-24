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
public final class qv extends View implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f;

    public qv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.a = vg5Var;
        this.b = dxVar;
    }

    @Override
    public int getBoundLeft() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        int i = bwVar.s;
        return ug8.h(this.a, 18.0f, bwVar.k() + i);
    }

    @Override
    public int getBoundRight() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        int i = bwVar.s;
        return ug8.C(this.a, 18.0f, bwVar.l() + i);
    }

    @Override
    public int getLastLineBoundRight() {
        bw bwVar = this.c;
        if (bwVar == null) {
            return -1;
        }
        int i = bwVar.s;
        return ug8.C(this.a, 18.0f, bwVar.m() + i);
    }

    public int getMinWidth() {
        return ug8.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
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
        bw bwVar = this.c;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754862, o.g(this.a, this.b, bwVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        qv qvVar;
        int i3;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i);
        vg5 vg5Var = this.a;
        vg5Var.getClass();
        this.d = gl.L(18.0f);
        vg5Var.getClass();
        this.e = gl.L(8.0f);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            vg5 vg5Var2 = this.a;
            int h = ug8.h(vg5Var2, 36.0f, size);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f;
            dx dxVar = this.b;
            if (dxVar != null && dxVar.H) {
                alignment = lwa.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            qvVar = this;
            bw n = o.n(vg5Var2, qvVar, null, richText, h, 0, pageblocksubheader2, alignment, 0, this.b);
            qvVar.c = n;
            if (n != null) {
                int height = n.d.getHeight() + qvVar.e;
                int i4 = qvVar.e;
                i3 = height + i4;
                bw bwVar = qvVar.c;
                bwVar.s = qvVar.d;
                bwVar.w = i4;
            } else {
                i3 = 0;
            }
        } else {
            qvVar = this;
            i3 = 1;
        }
        qvVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!o.i(this.a, this.b, motionEvent, this, this.c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f = pageblocksubheader;
        requestLayout();
    }
}
