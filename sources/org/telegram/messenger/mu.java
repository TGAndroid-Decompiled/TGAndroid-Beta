package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class mu extends fu {
    public final Paint W;

    public mu(kv kvVar, Rect rect, int i7) {
        super(kvVar, rect, i7);
        this.W = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.f22474b;
        return k5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.f22474b;
        return g0.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        kv kvVar = this.f22473a;
        if (kvVar.E()) {
            i7 = org.telegram.ui.ActionBar.m6.ul;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.tl;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, kvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        float f11 = -kvVar.S;
        int i11 = kvVar.C + kvVar.T;
        Rect rect = this.f22474b;
        float f12 = (i11 - rect.left) - rect.right;
        float f13 = 0.0f;
        if (kvVar.f23783s) {
            if (this.R) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.Q) {
                f13 = 1.0f;
            }
            f13 = g0.T1(f10, f13, kvVar.f23784t);
        } else if (this.Q) {
            f13 = 1.0f;
        }
        lu luVar = this.L;
        if (luVar != null) {
            i10 = luVar.f22474b.bottom;
        } else {
            i10 = 0;
        }
        float T1 = g0.T1((-1.0f) - i10, g0.L(6.0f), f13);
        canvas.drawRect(f11, T1, f12, T1 + 1.0f, paint);
    }
}
