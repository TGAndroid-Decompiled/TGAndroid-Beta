package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class uy2 extends View {
    public final ty2 a;

    public uy2(Context context, ylb ylbVar) {
        super(context);
        setVisibility(8);
        ty2 ty2Var = new ty2(this, true, ylbVar);
        this.a = ty2Var;
        ty2Var.F = true;
    }

    public float getEnterProgress() {
        int i;
        ty2 ty2Var = this.a;
        float f = ty2Var.l;
        if (f != 1.0f && ((i = ty2Var.c) == 0 || i == 1)) {
            if (i == 0) {
                return f;
            }
            return 1.0f - f;
        } else if (ty2Var.h != 0) {
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
