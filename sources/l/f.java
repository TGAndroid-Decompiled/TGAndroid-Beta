package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f16541a = -1;
    public final g f16542b;

    public f(g gVar) {
        this.f16542b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f16542b.f16545c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f16561j;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((m) arrayList.get(i9)) == mVar) {
                    this.f16541a = i9;
                    return;
                }
            }
        }
        this.f16541a = -1;
    }

    @Override
    public final m getItem(int i9) {
        g gVar = this.f16542b;
        k kVar = gVar.f16545c;
        kVar.i();
        ArrayList arrayList = kVar.f16561j;
        gVar.getClass();
        int i10 = this.f16541a;
        if (i10 >= 0 && i9 >= i10) {
            i9++;
        }
        return (m) arrayList.get(i9);
    }

    @Override
    public final int getCount() {
        g gVar = this.f16542b;
        k kVar = gVar.f16545c;
        kVar.i();
        int size = kVar.f16561j.size();
        gVar.getClass();
        if (this.f16541a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override
    public final long getItemId(int i9) {
        return i9;
    }

    @Override
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f16542b.f16544b.inflate(2131492880, viewGroup, false);
        }
        ((y) view).b(getItem(i9));
        return view;
    }

    @Override
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
