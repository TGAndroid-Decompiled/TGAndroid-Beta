package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f17661a = -1;
    public final g f17662b;

    public f(g gVar) {
        this.f17662b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f17662b.f17665c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f17681j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f17661a = i7;
                    return;
                }
            }
        }
        this.f17661a = -1;
    }

    @Override
    public final m getItem(int i7) {
        g gVar = this.f17662b;
        k kVar = gVar.f17665c;
        kVar.i();
        ArrayList arrayList = kVar.f17681j;
        gVar.getClass();
        int i10 = this.f17661a;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (m) arrayList.get(i7);
    }

    @Override
    public final int getCount() {
        g gVar = this.f17662b;
        k kVar = gVar.f17665c;
        kVar.i();
        int size = kVar.f17681j.size();
        gVar.getClass();
        if (this.f17661a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override
    public final long getItemId(int i7) {
        return i7;
    }

    @Override
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f17662b.f17664b.inflate(2131492880, viewGroup, false);
        }
        ((y) view).b(getItem(i7));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
