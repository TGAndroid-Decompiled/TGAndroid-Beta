package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class g extends BaseAdapter {
    public int f13947a = -1;
    public final h f13948b;

    public g(h hVar) {
        this.f13948b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f13948b.f13951c;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f13964j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f13947a = i10;
                    return;
                }
            }
        }
        this.f13947a = -1;
    }

    @Override
    public final n getItem(int i10) {
        h hVar = this.f13948b;
        l lVar = hVar.f13951c;
        lVar.i();
        ArrayList arrayList = lVar.f13964j;
        hVar.getClass();
        int i11 = this.f13947a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        h hVar = this.f13948b;
        l lVar = hVar.f13951c;
        lVar.i();
        int size = lVar.f13964j.size();
        hVar.getClass();
        if (this.f13947a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override
    public final long getItemId(int i10) {
        return i10;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13948b.f13950b.inflate(2131492880, viewGroup, false);
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
