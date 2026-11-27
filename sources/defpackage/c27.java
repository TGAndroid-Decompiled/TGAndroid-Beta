package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class c27 extends BaseAdapter {
    public final f27 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public c27(f27 f27Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = f27Var;
        this.f = i;
        a();
    }

    public final void a() {
        f27 f27Var = this.a;
        j27 j27Var = f27Var.v;
        if (j27Var != null) {
            f27Var.i();
            ArrayList arrayList = f27Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((j27) arrayList.get(i)) == j27Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override
    public final j27 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        f27 f27Var = this.a;
        if (z) {
            f27Var.i();
            l = f27Var.j;
        } else {
            l = f27Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (j27) l.get(i);
    }

    @Override
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        f27 f27Var = this.a;
        if (z) {
            f27Var.i();
            l = f27Var.j;
        } else {
            l = f27Var.l();
        }
        if (this.b < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    @Override
    public final long getItemId(int i) {
        return i;
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        b37 b37Var = (b37) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        b37Var.a(getItem(i));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
