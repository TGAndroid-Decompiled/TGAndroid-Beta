package defpackage;

import android.view.ViewGroup;
public final class rs7 extends n39 {
    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        return qs7.a().size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        gs7 gs7Var = (gs7) s49Var.a;
        qs7 qs7Var = (qs7) qs7.a().get(i);
        gs7Var.getClass();
        gs7Var.setTypeface(qs7Var.b());
        String str = qs7Var.c;
        if (str == null) {
            str = k96.N0(qs7Var.b);
        }
        gs7Var.setText(str);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        gs7 gs7Var = new gs7(viewGroup.getContext());
        gs7Var.setLayoutParams(new e49(-1, -2));
        return new s49(gs7Var);
    }
}
