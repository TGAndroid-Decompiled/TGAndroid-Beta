package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class v17 extends BaseAdapter {
    public final y17 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public v17(y17 y17Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = y17Var;
        this.f = i;
        a();
    }

    public final void a() {
        y17 y17Var = this.a;
        c27 c27Var = y17Var.v;
        if (c27Var != null) {
            y17Var.i();
            ArrayList arrayList = y17Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c27) arrayList.get(i)) == c27Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override
    public final c27 getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        y17 y17Var = this.a;
        if (z) {
            y17Var.i();
            l = y17Var.j;
        } else {
            l = y17Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (c27) l.get(i);
    }

    @Override
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        y17 y17Var = this.a;
        if (z) {
            y17Var.i();
            l = y17Var.j;
        } else {
            l = y17Var.l();
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
        u27 u27Var = (u27) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        u27Var.a(getItem(i));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
