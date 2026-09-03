package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f11145a;
    public int f11146b = -1;
    public boolean f11147c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f11148f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z4, int i10) {
        this.d = z4;
        this.e = layoutInflater;
        this.f11145a = kVar;
        this.f11148f = i10;
        a();
    }

    public final void a() {
        k kVar = this.f11145a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f11156j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f11146b = i10;
                    return;
                }
            }
        }
        this.f11146b = -1;
    }

    @Override
    public final m getItem(int i10) {
        ArrayList l10;
        boolean z4 = this.d;
        k kVar = this.f11145a;
        if (z4) {
            kVar.i();
            l10 = kVar.f11156j;
        } else {
            l10 = kVar.l();
        }
        int i11 = this.f11146b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) l10.get(i10);
    }

    @Override
    public final int getCount() {
        ArrayList l10;
        boolean z4 = this.d;
        k kVar = this.f11145a;
        if (z4) {
            kVar.i();
            l10 = kVar.f11156j;
        } else {
            l10 = kVar.l();
        }
        if (this.f11146b < 0) {
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
            view = this.e.inflate(this.f11148f, viewGroup, false);
        }
        int i12 = getItem(i10).f11174b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f11174b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f11145a.m() && i12 != i11) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        y yVar = (y) view;
        if (this.f11147c) {
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
