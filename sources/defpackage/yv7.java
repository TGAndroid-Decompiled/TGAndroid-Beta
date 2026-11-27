package defpackage;

import android.view.ViewGroup;
public final class yv7 extends c79 {
    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        return xv7.a().size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        mv7 mv7Var = (mv7) f89Var.a;
        xv7 xv7Var = (xv7) xv7.a().get(i);
        mv7Var.getClass();
        mv7Var.setTypeface(xv7Var.b());
        String str = xv7Var.c;
        if (str == null) {
            str = ob6.N0(xv7Var.b);
        }
        mv7Var.setText(str);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        mv7 mv7Var = new mv7(viewGroup.getContext());
        mv7Var.setLayoutParams(new r79(-1, -2));
        return new f89(mv7Var);
    }
}
