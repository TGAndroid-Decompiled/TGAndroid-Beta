package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
public final class f extends BaseAdapter {
    public int f11029a = -1;
    public final g f11030b;

    public f(g gVar) {
        this.f11030b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f11030b.f11033c;
        m mVar = kVar.v;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f11046j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((m) arrayList.get(i10)) == mVar) {
                    this.f11029a = i10;
                    return;
                }
            }
        }
        this.f11029a = -1;
    }

    @Override
    public final m getItem(int i10) {
        g gVar = this.f11030b;
        k kVar = gVar.f11033c;
        kVar.i();
        ArrayList arrayList = kVar.f11046j;
        gVar.getClass();
        int i11 = this.f11029a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (m) arrayList.get(i10);
    }

    @Override
    public final int getCount() {
        g gVar = this.f11030b;
        k kVar = gVar.f11033c;
        kVar.i();
        int size = kVar.f11046j.size();
        gVar.getClass();
        if (this.f11029a < 0) {
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
            view = this.f11030b.f11032b.inflate(2131492880, viewGroup, false);
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
