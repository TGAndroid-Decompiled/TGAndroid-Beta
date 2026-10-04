package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f15165a;
    public int f15166b = -1;
    public boolean f15167c;
    public final boolean d;
    public final LayoutInflater f15168e;
    public final int f15169f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.d = z10;
        this.f15168e = layoutInflater;
        this.f15165a = kVar;
        this.f15169f = i10;
        a();
    }

    public final void a() {
        k kVar = this.f15165a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15178j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f15166b = i10;
                    return;
                }
            }
        }
        this.f15166b = -1;
    }

    @Override
    public final m getItem(int i10) {
        ArrayList l4;
        boolean z10 = this.d;
        k kVar = this.f15165a;
        if (z10) {
            kVar.i();
            l4 = kVar.f15178j;
        } else {
            l4 = kVar.l();
        }
        int i11 = this.f15166b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) l4.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList l4;
        boolean z10 = this.d;
        k kVar = this.f15165a;
        if (z10) {
            kVar.i();
            l4 = kVar.f15178j;
        } else {
            l4 = kVar.l();
        }
        if (this.f15166b < 0) {
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
            view = this.f15168e.inflate(this.f15169f, viewGroup, false);
        }
        int i12 = getItem(i10).f15196b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f15196b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f15165a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f15167c) {
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
