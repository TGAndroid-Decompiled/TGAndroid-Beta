package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f19171a;
    public int f19172b = -1;
    public boolean f19173c;
    public final boolean d;
    public final LayoutInflater f19174e;
    public final int f19175f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i7) {
        this.d = z10;
        this.f19174e = layoutInflater;
        this.f19171a = kVar;
        this.f19175f = i7;
        a();
    }

    public final void a() {
        k kVar = this.f19171a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f19184j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f19172b = i7;
                    return;
                }
            }
        }
        this.f19172b = -1;
    }

    @Override
    public final m getItem(int i7) {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f19171a;
        if (z10) {
            kVar.i();
            l10 = kVar.f19184j;
        } else {
            l10 = kVar.l();
        }
        int i10 = this.f19172b;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (m) l10.get(i7);
    }

    @Override
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f19171a;
        if (z10) {
            kVar.i();
            l10 = kVar.f19184j;
        } else {
            l10 = kVar.l();
        }
        if (this.f19172b < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override
    public final long getItemId(int i7) {
        return i7;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        int i10;
        boolean z10 = false;
        if (view == null) {
            view = this.f19174e.inflate(this.f19175f, viewGroup, false);
        }
        int i11 = getItem(i7).f19202b;
        int i12 = i7 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f19202b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f19171a.m() && i11 != i10) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f19173c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i7));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
