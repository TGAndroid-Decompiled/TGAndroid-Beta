package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class xpc extends jl7 {
    public final ViewGroup W1;
    public final View[] X1;
    public final Context Y1;

    public xpc(Context context, ViewGroup viewGroup, vnb vnbVar, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, vnbVar);
        this.W1 = viewGroup2;
        this.X1 = viewArr;
        this.Y1 = context2;
    }

    @Override
    public final void P0(float f) {
        super.P0(f);
        if (this.W1 instanceof vic) {
            this.s0.setBounds(0, (int) f, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override
    public final boolean V0() {
        return !(this.W1 instanceof vic);
    }

    @Override
    public final int Z0() {
        return aob.v0(aob.d6, this.J0);
    }

    @Override
    public final void show() {
        super.show();
        if (this.W1 instanceof vic) {
            View[] viewArr = this.X1;
            if (viewArr[0] == null) {
                n4a n4aVar = new n4a(this, this.Y1);
                viewArr[0] = n4aVar;
                this.b.addView(n4aVar, 0, tre.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.n1.setPadding(0, 0, 0, 0);
        }
    }
}
