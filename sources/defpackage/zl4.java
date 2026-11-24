package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class zl4 extends ArrayAdapter {
    public final fm4 a;

    public zl4(fm4 fm4Var, Context context) {
        super(context, 0);
        this.a = fm4Var;
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        fm4 fm4Var = this.a;
        em4 em4Var = fm4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i);
        int width = fm4Var.I.getWidth();
        boolean z = false;
        if (view != null) {
            int i2 = em4Var.b;
            if (em4Var.e.Q.j != null) {
                z = true;
            }
            hm4.e(view, menuItem, z);
        } else {
            hm4 hm4Var = em4Var.e.Q;
            Context context = em4Var.d;
            ul4 ul4Var = hm4.p;
            view = hm4Var.b(context, menuItem, true, false, false);
            int i3 = em4Var.c;
            view.setPadding(i3, 0, i3, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
