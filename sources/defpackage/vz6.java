package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class vz6 extends BaseAdapter {
    public final yz6 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public vz6(yz6 yz6Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = yz6Var;
        this.f = i;
        a();
    }

    public final void a() {
        yz6 yz6Var = this.a;
        c07 c07Var = yz6Var.v;
        if (c07Var != null) {
            yz6Var.i();
            ArrayList arrayList = yz6Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c07) arrayList.get(i)) == c07Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override
    public final c07 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        yz6 yz6Var = this.a;
        if (z) {
            yz6Var.i();
            l = yz6Var.j;
        } else {
            l = yz6Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (c07) l.get(i);
    }

    @Override
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        yz6 yz6Var = this.a;
        if (z) {
            yz6Var.i();
            l = yz6Var.j;
        } else {
            l = yz6Var.l();
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
        u07 u07Var = (u07) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        u07Var.a(getItem(i));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
