package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class klc extends cj7 {
    public final ViewGroup W1;
    public final View[] X1;
    public final Context Y1;

    public klc(Context context, ViewGroup viewGroup, wjb wjbVar, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, wjbVar);
        this.W1 = viewGroup2;
        this.X1 = viewArr;
        this.Y1 = context2;
    }

    @Override
    public final void O0(float f) {
        super.O0(f);
        if (this.W1 instanceof wec) {
            this.s0.setBounds(0, (int) f, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override
    public final boolean U0() {
        return !(this.W1 instanceof wec);
    }

    @Override
    public final int Y0() {
        return bkb.v0(bkb.c6, this.J0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.W1 instanceof wec) {
            View[] viewArr = this.X1;
            if (viewArr[0] == null) {
                u0a u0aVar = new u0a(this, this.Y1);
                viewArr[0] = u0aVar;
                this.b.addView(u0aVar, 0, nme.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.n1.setPadding(0, 0, 0, 0);
        }
    }
}
