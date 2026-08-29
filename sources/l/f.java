package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f13969a = -1;
    public final g f13970b;

    public f(g gVar) {
        this.f13970b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f13970b.f13973c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f13989j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f13969a = i10;
                    return;
                }
            }
        }
        this.f13969a = -1;
    }

    @Override
    public final m getItem(int i10) {
        g gVar = this.f13970b;
        k kVar = gVar.f13973c;
        kVar.i();
        ArrayList arrayList = kVar.f13989j;
        gVar.getClass();
        int i11 = this.f13969a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        g gVar = this.f13970b;
        k kVar = gVar.f13973c;
        kVar.i();
        int size = kVar.f13989j.size();
        gVar.getClass();
        if (this.f13969a < 0) {
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
            view = this.f13970b.f13972b.inflate(2131492880, viewGroup, false);
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
