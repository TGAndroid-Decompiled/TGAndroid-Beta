package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
public final class h extends BaseAdapter {
    public final k f17668a;
    public int f17669b = -1;
    public boolean f17670c;
    public final boolean d;
    public final LayoutInflater f17671e;
    public final int f17672f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z9, int i7) {
        this.d = z9;
        this.f17671e = layoutInflater;
        this.f17668a = kVar;
        this.f17672f = i7;
        a();
    }

    public final void a() {
        k kVar = this.f17668a;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f17681j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f17669b = i7;
                    return;
                }
            }
        }
        this.f17669b = -1;
    }

    @Override
    public final m getItem(int i7) {
        ArrayList l10;
        boolean z9 = this.d;
        k kVar = this.f17668a;
        if (z9) {
            kVar.i();
            l10 = kVar.f17681j;
        } else {
            l10 = kVar.l();
        }
        int i10 = this.f17669b;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (m) l10.get(i7);
    }

    @Override
    public final int getCount() {
        ArrayList l10;
        boolean z9 = this.d;
        k kVar = this.f17668a;
        if (z9) {
            kVar.i();
            l10 = kVar.f17681j;
        } else {
            l10 = kVar.l();
        }
        if (this.f17669b < 0) {
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
        boolean z9 = false;
        if (view == null) {
            view = this.f17671e.inflate(this.f17672f, viewGroup, false);
        }
        int i11 = getItem(i7).f17699b;
        int i12 = i7 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f17699b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f17668a.m() && i11 != i10) {
            z9 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z9);
        y yVar = (y) view;
        if (this.f17670c) {
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
