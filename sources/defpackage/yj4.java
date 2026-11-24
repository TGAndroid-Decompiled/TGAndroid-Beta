package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class yj4 extends ArrayAdapter {
    public final ek4 a;

    public yj4(ek4 ek4Var, Context context) {
        super(context, 0);
        this.a = ek4Var;
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ek4 ek4Var = this.a;
        dk4 dk4Var = ek4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i);
        int width = ek4Var.I.getWidth();
        boolean z = false;
        if (view != null) {
            int i2 = dk4Var.b;
            if (dk4Var.e.Q.j != null) {
                z = true;
            }
            gk4.e(view, menuItem, z);
        } else {
            gk4 gk4Var = dk4Var.e.Q;
            Context context = dk4Var.d;
            tj4 tj4Var = gk4.p;
            view = gk4Var.b(context, menuItem, true, false, false);
            int i3 = dk4Var.c;
            view.setPadding(i3, 0, i3, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
