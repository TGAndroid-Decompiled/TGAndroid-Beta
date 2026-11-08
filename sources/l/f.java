package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f17658a = -1;
    public final g f17659b;

    public f(g gVar) {
        this.f17659b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f17659b.f17662c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f17678j;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((m) arrayList.get(i7)) == mVar) {
                    this.f17658a = i7;
                    return;
                }
            }
        }
        this.f17658a = -1;
    }

    @Override
    public final m getItem(int i7) {
        g gVar = this.f17659b;
        k kVar = gVar.f17662c;
        kVar.i();
        ArrayList arrayList = kVar.f17678j;
        gVar.getClass();
        int i10 = this.f17658a;
        if (i10 >= 0 && i7 >= i10) {
            i7++;
        }
        return (m) arrayList.get(i7);
    }

    @Override
    public final int getCount() {
        g gVar = this.f17659b;
        k kVar = gVar.f17662c;
        kVar.i();
        int size = kVar.f17678j.size();
        gVar.getClass();
        if (this.f17658a < 0) {
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
            view = this.f17659b.f17661b.inflate(2131492880, viewGroup, false);
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
