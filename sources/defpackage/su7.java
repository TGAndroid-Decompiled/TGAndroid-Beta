package defpackage;

import android.view.ViewGroup;
public final class su7 extends q59 {
    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        return ru7.a().size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        hu7 hu7Var = (hu7) u69Var.a;
        ru7 ru7Var = (ru7) ru7.a().get(i);
        hu7Var.getClass();
        hu7Var.setTypeface(ru7Var.b());
        String str = ru7Var.c;
        if (str == null) {
            str = jb6.N0(ru7Var.b);
        }
        hu7Var.setText(str);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        hu7 hu7Var = new hu7(viewGroup.getContext());
        hu7Var.setLayoutParams(new g69(-1, -2));
        return new u69(hu7Var);
    }
}
