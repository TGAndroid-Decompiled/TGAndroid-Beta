package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class h76 extends BaseAdapter {
    public int a = -1;
    public final i76 b;

    public h76(i76 i76Var) {
        this.b = i76Var;
        a();
    }

    public final void a() {
        y17 y17Var = this.b.c;
        c27 c27Var = y17Var.v;
        if (c27Var != null) {
            y17Var.i();
            ArrayList arrayList = y17Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c27) arrayList.get(i)) == c27Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override
    public final c27 getItem(int i) {
        y17 y17Var = this.b.c;
        y17Var.i();
        ArrayList arrayList = y17Var.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (c27) arrayList.get(i);
    }

    @Override
    public final int getCount() {
        y17 y17Var = this.b.c;
        y17Var.i();
        int size = y17Var.j.size();
        if (this.a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override
    public final long getItemId(int i) {
        return i;
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(2131492880, viewGroup, false);
        }
        ((u27) view).a(getItem(i));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
