package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class g extends BaseAdapter {

    public int f15297a = -1;

    public final h f15298b;

    public g(h hVar) {
        this.f15298b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f15298b.f15301c;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f15317j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f15297a = i10;
                    return;
                }
            }
        }
        this.f15297a = -1;
    }

    @Override
    public final n getItem(int i10) {
        h hVar = this.f15298b;
        l lVar = hVar.f15301c;
        lVar.i();
        ArrayList arrayList = lVar.f15317j;
        hVar.getClass();
        int i11 = this.f15297a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        h hVar = this.f15298b;
        l lVar = hVar.f15301c;
        lVar.i();
        int size = lVar.f15317j.size();
        hVar.getClass();
        return this.f15297a < 0 ? size : size - 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f15298b.f15300b.inflate(2131492880, viewGroup, false);
        }
        ((z) view).b(getItem(i10));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
