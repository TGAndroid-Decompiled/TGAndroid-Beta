package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f13976a;
    public int f13977b = -1;
    public boolean f13978c;
    public final boolean d;
    public final LayoutInflater f13979e;
    public final int f13980f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.d = z10;
        this.f13979e = layoutInflater;
        this.f13976a = kVar;
        this.f13980f = i10;
        a();
    }

    public final void a() {
        k kVar = this.f13976a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f13989j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f13977b = i10;
                    return;
                }
            }
        }
        this.f13977b = -1;
    }

    @Override
    public final m getItem(int i10) {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f13976a;
        if (z10) {
            kVar.i();
            l10 = kVar.f13989j;
        } else {
            l10 = kVar.l();
        }
        int i11 = this.f13977b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) l10.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f13976a;
        if (z10) {
            kVar.i();
            l10 = kVar.f13989j;
        } else {
            l10 = kVar.l();
        }
        if (this.f13977b < 0) {
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
        boolean z10 = false;
        if (view == null) {
            view = this.f13979e.inflate(this.f13980f, viewGroup, false);
        }
        int i12 = getItem(i10).f14007b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f14007b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f13976a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f13978c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i10));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
