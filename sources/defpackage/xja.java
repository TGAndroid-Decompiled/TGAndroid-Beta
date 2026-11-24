package defpackage;

import android.view.View;
public final class xja implements v66, nf3 {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public xja(View view) {
        this.a = view;
    }

    @Override
    public final void a() {
        View view = this.a;
        if (!yja.g(view)) {
            if (view instanceof zja) {
                ((zja) view).X();
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
        float min = Math.min(gm.R1(0.6f, 1.0f, f), f2);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xja) && ((xja) obj).a == this.a) {
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
        return yja.e(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
