package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f16708a = -1;
    public final g f16709b;

    public f(g gVar) {
        this.f16709b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f16709b.f16712c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f16725j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f16708a = i10;
                    return;
                }
            }
        }
        this.f16708a = -1;
    }

    @Override
    public final m getItem(int i10) {
        g gVar = this.f16709b;
        k kVar = gVar.f16712c;
        kVar.i();
        ArrayList arrayList = kVar.f16725j;
        gVar.getClass();
        int i11 = this.f16708a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        g gVar = this.f16709b;
        k kVar = gVar.f16712c;
        kVar.i();
        int size = kVar.f16725j.size();
        gVar.getClass();
        if (this.f16708a < 0) {
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
            view = this.f16709b.f16711b.inflate(2131492880, viewGroup, false);
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
