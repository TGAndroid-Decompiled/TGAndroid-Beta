package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f15233a;
    public int f15234b = -1;
    public boolean f15235c;
    public final boolean d;
    public final LayoutInflater f15236e;
    public final int f15237f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.d = z10;
        this.f15236e = layoutInflater;
        this.f15233a = kVar;
        this.f15237f = i10;
        a();
    }

    public final void a() {
        k kVar = this.f15233a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15246j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f15234b = i10;
                    return;
                }
            }
        }
        this.f15234b = -1;
    }

    @Override
    public final m getItem(int i10) {
        ArrayList l4;
        boolean z10 = this.d;
        k kVar = this.f15233a;
        if (z10) {
            kVar.i();
            l4 = kVar.f15246j;
        } else {
            l4 = kVar.l();
        }
        int i11 = this.f15234b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) l4.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList l4;
        boolean z10 = this.d;
        k kVar = this.f15233a;
        if (z10) {
            kVar.i();
            l4 = kVar.f15246j;
        } else {
            l4 = kVar.l();
        }
        if (this.f15234b < 0) {
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
            view = this.f15236e.inflate(this.f15237f, viewGroup, false);
        }
        int i12 = getItem(i10).f15264b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f15264b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f15233a.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f15235c) {
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
