package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f15268a;
    public int f15269b = -1;
    public boolean f15270c;
    public final boolean d;
    public final LayoutInflater f15271e;
    public final int f15272f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.d = z10;
        this.f15271e = layoutInflater;
        this.f15268a = kVar;
        this.f15272f = i10;
        a();
    }

    public final void a() {
        k kVar = this.f15268a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15281j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f15269b = i10;
                    return;
                }
            }
        }
        this.f15269b = -1;
    }

    @Override
    public final m getItem(int i10) {
        ArrayList l4;
        boolean z10 = this.d;
        k kVar = this.f15268a;
        if (z10) {
            kVar.i();
            l4 = kVar.f15281j;
        } else {
            l4 = kVar.l();
        }
        int i11 = this.f15269b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) l4.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList l4;
        boolean z10 = this.d;
        k kVar = this.f15268a;
        if (z10) {
            kVar.i();
            l4 = kVar.f15281j;
        } else {
            l4 = kVar.l();
        }
        if (this.f15269b < 0) {
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
            view = this.f15271e.inflate(this.f15272f, viewGroup, false);
        }
        int i12 = getItem(i10).f15299b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f15299b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f15268a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f15270c) {
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
