package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class h56 extends BaseAdapter {
    public int a = -1;
    public final i56 b;

    public h56(i56 i56Var) {
        this.b = i56Var;
        a();
    }

    public final void a() {
        yz6 yz6Var = this.b.c;
        c07 c07Var = yz6Var.v;
        if (c07Var != null) {
            yz6Var.i();
            ArrayList arrayList = yz6Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((c07) arrayList.get(i)) == c07Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override
    public final c07 getItem(int i) {
        yz6 yz6Var = this.b.c;
        yz6Var.i();
        ArrayList arrayList = yz6Var.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (c07) arrayList.get(i);
    }

    @Override
    public final int getCount() {
        yz6 yz6Var = this.b.c;
        yz6Var.i();
        int size = yz6Var.j.size();
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
        ((u07) view).a(getItem(i));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
