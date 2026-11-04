package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f17411a;
    public int f17412b = -1;
    public boolean f17413c;
    public final boolean d;
    public final LayoutInflater f17414e;
    public final int f17415f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i3) {
        this.d = z10;
        this.f17414e = layoutInflater;
        this.f17411a = kVar;
        this.f17415f = i3;
        a();
    }

    public final void a() {
        k kVar = this.f17411a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f17424j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((m) arrayList.get(i3)) == mVar) {
                    this.f17412b = i3;
                    return;
                }
            }
        }
        this.f17412b = -1;
    }

    @Override
    public final m getItem(int i3) {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f17411a;
        if (z10) {
            kVar.i();
            l10 = kVar.f17424j;
        } else {
            l10 = kVar.l();
        }
        int i10 = this.f17412b;
        if (i10 >= 0 && i3 >= i10) {
            i3++;
        }
        return (m) l10.get(i3);
    }

    @Override
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f17411a;
        if (z10) {
            kVar.i();
            l10 = kVar.f17424j;
        } else {
            l10 = kVar.l();
        }
        if (this.f17412b < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override
    public final long getItemId(int i3) {
        return i3;
    }

    @Override
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        int i10;
        boolean z10 = false;
        if (view == null) {
            view = this.f17414e.inflate(this.f17415f, viewGroup, false);
        }
        int i11 = getItem(i3).f17442b;
        int i12 = i3 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f17442b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f17411a.m() && i11 != i10) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f17413c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i3));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
