package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f17404a = -1;
    public final g f17405b;

    public f(g gVar) {
        this.f17405b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f17405b.f17408c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f17424j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((m) arrayList.get(i3)) == mVar) {
                    this.f17404a = i3;
                    return;
                }
            }
        }
        this.f17404a = -1;
    }

    @Override
    public final m getItem(int i3) {
        g gVar = this.f17405b;
        k kVar = gVar.f17408c;
        kVar.i();
        ArrayList arrayList = kVar.f17424j;
        gVar.getClass();
        int i10 = this.f17404a;
        if (i10 >= 0 && i3 >= i10) {
            i3++;
        }
        return (m) arrayList.get(i3);
    }

    @Override
    public final int getCount() {
        g gVar = this.f17405b;
        k kVar = gVar.f17408c;
        kVar.i();
        int size = kVar.f17424j.size();
        gVar.getClass();
        if (this.f17404a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override
    public final long getItemId(int i3) {
        return i3;
    }

    @Override
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f17405b.f17407b.inflate(2131492880, viewGroup, false);
        }
        ((y) view).b(getItem(i3));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
