package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
public final class dm4 extends ArrayAdapter {
    public final jm4 a;

    public dm4(jm4 jm4Var, Context context) {
        super(context, 0);
        this.a = jm4Var;
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        jm4 jm4Var = this.a;
        im4 im4Var = jm4Var.q;
        MenuItem menuItem = (MenuItem) getItem(i);
        int width = jm4Var.I.getWidth();
        boolean z = false;
        if (view != null) {
            int i2 = im4Var.b;
            if (im4Var.e.Q.j != null) {
                z = true;
            }
            lm4.e(view, menuItem, z);
        } else {
            lm4 lm4Var = im4Var.e.Q;
            Context context = im4Var.d;
            yl4 yl4Var = lm4.p;
            view = lm4Var.b(context, menuItem, true, false, false);
            int i3 = im4Var.c;
            view.setPadding(i3, 0, i3, 0);
        }
        view.setMinimumWidth(width);
        return view;
    }
}
