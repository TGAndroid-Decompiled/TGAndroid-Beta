package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f16548a;
    public int f16549b = -1;
    public boolean f16550c;
    public final boolean d;
    public final LayoutInflater f16551e;
    public final int f16552f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z10, int i9) {
        this.d = z10;
        this.f16551e = layoutInflater;
        this.f16548a = kVar;
        this.f16552f = i9;
        a();
    }

    public final void a() {
        k kVar = this.f16548a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f16561j;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((m) arrayList.get(i9)) == mVar) {
                    this.f16549b = i9;
                    return;
                }
            }
        }
        this.f16549b = -1;
    }

    @Override
    public final m getItem(int i9) {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f16548a;
        if (z10) {
            kVar.i();
            l10 = kVar.f16561j;
        } else {
            l10 = kVar.l();
        }
        int i10 = this.f16549b;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (m) l10.get(i9);
    }

    @Override
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.d;
        k kVar = this.f16548a;
        if (z10) {
            kVar.i();
            l10 = kVar.f16561j;
        } else {
            l10 = kVar.l();
        }
        if (this.f16549b < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override
    public final long getItemId(int i9) {
        return i9;
    }

    @Override
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        int i10;
        boolean z10 = false;
        if (view == null) {
            view = this.f16551e.inflate(this.f16552f, viewGroup, false);
        }
        int i11 = getItem(i9).f16579b;
        int i12 = i9 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f16579b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f16548a.m() && i11 != i10) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f16550c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i9));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
