package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f15157a = -1;
    public final g f15158b;

    public f(g gVar) {
        this.f15158b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f15158b.f15161c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f15177j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f15157a = i10;
                    return;
                }
            }
        }
        this.f15157a = -1;
    }

    @Override
    public final m getItem(int i10) {
        g gVar = this.f15158b;
        k kVar = gVar.f15161c;
        kVar.i();
        ArrayList arrayList = kVar.f15177j;
        gVar.getClass();
        int i11 = this.f15157a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        g gVar = this.f15158b;
        k kVar = gVar.f15161c;
        kVar.i();
        int size = kVar.f15177j.size();
        gVar.getClass();
        if (this.f15157a < 0) {
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
            view = this.f15158b.f15160b.inflate(2131492880, viewGroup, false);
        }
        ((y) view).b(getItem(i10));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
