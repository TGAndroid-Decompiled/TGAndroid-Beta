package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class i extends BaseAdapter {

    public final l f15304a;

    public int f15305b = -1;

    public boolean f15306c;
    public final boolean d;

    public final LayoutInflater f15307e;

    public final int f15308f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.d = z10;
        this.f15307e = layoutInflater;
        this.f15304a = lVar;
        this.f15308f = i10;
        a();
    }

    public final void a() {
        l lVar = this.f15304a;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f15317j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f15305b = i10;
                    return;
                }
            }
        }
        this.f15305b = -1;
    }

    @Override
    public final n getItem(int i10) {
        ArrayList arrayListL;
        boolean z10 = this.d;
        l lVar = this.f15304a;
        if (z10) {
            lVar.i();
            arrayListL = lVar.f15317j;
        } else {
            arrayListL = lVar.l();
        }
        int i11 = this.f15305b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayListL.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList arrayListL;
        boolean z10 = this.d;
        l lVar = this.f15304a;
        if (z10) {
            lVar.i();
            arrayListL = lVar.f15317j;
        } else {
            arrayListL = lVar.l();
        }
        return this.f15305b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f15307e.inflate(this.f15308f, viewGroup, false);
        }
        int i11 = getItem(i10).f15335b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f15335b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f15304a.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        z zVar = (z) view;
        if (this.f15306c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.b(getItem(i10));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
