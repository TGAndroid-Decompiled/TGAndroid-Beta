package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class g extends BaseAdapter {
    public int f11382a = -1;
    public final h f11383b;

    public g(h hVar) {
        this.f11383b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f11383b.f11386c;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f11402j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f11382a = i10;
                    return;
                }
            }
        }
        this.f11382a = -1;
    }

    @Override
    public final n getItem(int i10) {
        h hVar = this.f11383b;
        l lVar = hVar.f11386c;
        lVar.i();
        ArrayList arrayList = lVar.f11402j;
        hVar.getClass();
        int i11 = this.f11382a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        h hVar = this.f11383b;
        l lVar = hVar.f11386c;
        lVar.i();
        int size = lVar.f11402j.size();
        hVar.getClass();
        if (this.f11382a < 0) {
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
            view = this.f11383b.f11385b.inflate(2131492880, viewGroup, false);
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
