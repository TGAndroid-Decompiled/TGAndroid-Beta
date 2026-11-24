package defpackage;

import android.view.View;
public final class vha implements v46, be3 {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public vha(View view) {
        this.a = view;
    }

    @Override
    public final void a() {
        View view = this.a;
        if (!wha.g(view)) {
            if (view instanceof xha) {
                ((xha) view).X();
            } else {
                view.setVisibility(8);
            }
            c(1.0f, 1.0f);
        }
    }

    @Override
    public final int b(boolean z) {
        return 0;
    }

    public final void c(float f, float f2) {
        float f3 = this.c;
        if (f3 == f && this.d == f2) {
            return;
        }
        int i = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
        View view = this.a;
        if (i == 0) {
            this.e = view.getAlpha();
        }
        this.c = f;
        this.d = f2;
        view.setAlpha(this.e * f);
        float min = Math.min(gl.R1(0.6f, 1.0f, f), f2);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vha) && ((vha) obj).a == this.a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return wha.e(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
