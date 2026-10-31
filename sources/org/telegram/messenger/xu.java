package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class xu extends qu {
    public final Paint W;

    public xu(vv vvVar, Rect rect, int i10) {
        super(vvVar, rect, i10);
        this.W = new Paint(1);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return m5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
        return i0.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        vv vvVar = this.f17621a;
        if (vvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.ul;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.tl;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        float f10 = -vvVar.S;
        int i12 = vvVar.C + vvVar.T;
        Rect rect = this.f17622b;
        float f11 = (i12 - rect.left) - rect.right;
        float f12 = 0.0f;
        if (vvVar.f19001s) {
            if (this.R) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.Q) {
                f12 = 1.0f;
            }
            f12 = i0.T1(f7, f12, vvVar.f19002t);
        } else if (this.Q) {
            f12 = 1.0f;
        }
        wu wuVar = this.L;
        if (wuVar != null) {
            i11 = wuVar.f17622b.bottom;
        } else {
            i11 = 0;
        }
        float T1 = i0.T1((-1.0f) - i11, i0.L(6.0f), f12);
        canvas.drawRect(f10, T1, f11, T1 + 1.0f, paint);
    }
}
