package defpackage;

import android.content.Context;
public abstract class zi2 extends ggc {
    public yi2 x0;

    public zi2(Context context) {
        super(context);
        b(new xi2((tr8) this, (byte) 0));
    }

    public void setAdapter(yi2 yi2Var) {
        this.x0 = yi2Var;
        super.setAdapter((qt7) yi2Var);
        if (yi2Var != null) {
            x(yi2Var.j(), false);
        }
    }

    @Override
    @Deprecated
    public void setAdapter(qt7 qt7Var) {
        if (qt7Var instanceof yi2) {
            setAdapter((yi2) qt7Var);
        } else {
            i98.g();
        }
    }
}
