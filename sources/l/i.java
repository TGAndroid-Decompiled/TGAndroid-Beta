package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class i extends BaseAdapter {
    public final l f13938a;
    public int f13939b = -1;
    public boolean f13940c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f13941f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.d = z10;
        this.e = layoutInflater;
        this.f13938a = lVar;
        this.f13941f = i10;
        a();
    }

    public final void a() {
        l lVar = this.f13938a;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f13949j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f13939b = i10;
                    return;
                }
            }
        }
        this.f13939b = -1;
    }

    @Override
    public final n getItem(int i10) {
        ArrayList l4;
        boolean z10 = this.d;
        l lVar = this.f13938a;
        if (z10) {
            lVar.i();
            l4 = lVar.f13949j;
        } else {
            l4 = lVar.l();
        }
        int i11 = this.f13939b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) l4.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList l4;
        boolean z10 = this.d;
        l lVar = this.f13938a;
        if (z10) {
            lVar.i();
            l4 = lVar.f13949j;
        } else {
            l4 = lVar.l();
        }
        if (this.f13939b < 0) {
            return l4.size();
        }
        return l4.size() - 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.e.inflate(this.f13941f, viewGroup, false);
        }
        int i12 = getItem(i10).f13967b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f13967b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f13938a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        z zVar = (z) view;
        if (this.f13940c) {
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
