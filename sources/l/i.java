package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class i extends BaseAdapter {
    public final l f11389a;
    public int f11390b = -1;
    public boolean f11391c;
    public final boolean d;
    public final LayoutInflater f11392e;
    public final int f11393f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z4, int i10) {
        this.d = z4;
        this.f11392e = layoutInflater;
        this.f11389a = lVar;
        this.f11393f = i10;
        a();
    }

    public final void a() {
        l lVar = this.f11389a;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f11402j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f11390b = i10;
                    return;
                }
            }
        }
        this.f11390b = -1;
    }

    @Override
    public final n getItem(int i10) {
        ArrayList l10;
        boolean z4 = this.d;
        l lVar = this.f11389a;
        if (z4) {
            lVar.i();
            l10 = lVar.f11402j;
        } else {
            l10 = lVar.l();
        }
        int i11 = this.f11390b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) l10.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList l10;
        boolean z4 = this.d;
        l lVar = this.f11389a;
        if (z4) {
            lVar.i();
            l10 = lVar.f11402j;
        } else {
            l10 = lVar.l();
        }
        if (this.f11390b < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z4 = false;
        if (view == null) {
            view = this.f11392e.inflate(this.f11393f, viewGroup, false);
        }
        int i12 = getItem(i10).f11420b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f11420b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f11389a.m() && i12 != i11) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        z zVar = (z) view;
        if (this.f11391c) {
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
