package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class kx2 extends View {
    public final jx2 a;

    public kx2(Context context, wjb wjbVar) {
        super(context);
        setVisibility(8);
        jx2 jx2Var = new jx2(this, true, wjbVar);
        this.a = jx2Var;
        jx2Var.F = true;
    }

    public float getEnterProgress() {
        int i;
        jx2 jx2Var = this.a;
        float f = jx2Var.l;
        if (f != 1.0f && ((i = jx2Var.c) == 0 || i == 1)) {
            if (i == 0) {
                return f;
            }
            return 1.0f - f;
        } else if (jx2Var.h != 0) {
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
