package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class g extends BaseAdapter {
    public int f13882a = -1;
    public final h f13883b;

    public g(h hVar) {
        this.f13883b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f13883b.f13886c;
        n nVar = lVar.v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f13899j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((n) arrayList.get(i10)) == nVar) {
                    this.f13882a = i10;
                    return;
                }
            }
        }
        this.f13882a = -1;
    }

    @Override
    public final n getItem(int i10) {
        h hVar = this.f13883b;
        l lVar = hVar.f13886c;
        lVar.i();
        ArrayList arrayList = lVar.f13899j;
        hVar.getClass();
        int i11 = this.f13882a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (n) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        h hVar = this.f13883b;
        l lVar = hVar.f13886c;
        lVar.i();
        int size = lVar.f13899j.size();
        hVar.getClass();
        if (this.f13882a < 0) {
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
            view = this.f13883b.f13885b.inflate(2131492880, viewGroup, false);
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
