package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class ey2 extends View {
    public final dy2 a;

    public ey2(Context context, vnb vnbVar) {
        super(context);
        setVisibility(8);
        dy2 dy2Var = new dy2(this, true, vnbVar);
        this.a = dy2Var;
        dy2Var.F = true;
    }

    public float getEnterProgress() {
        int i;
        dy2 dy2Var = this.a;
        float f = dy2Var.l;
        if (f != 1.0f && ((i = dy2Var.c) == 0 || i == 1)) {
            if (i == 0) {
                return f;
            }
            return 1.0f - f;
        } else if (dy2Var.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.a.a(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i) {
        this.a.z = i;
    }

    public void setReverse(boolean z) {
        this.a.C = z;
    }
}
