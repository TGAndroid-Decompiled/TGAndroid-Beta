package i1;

import android.database.Cursor;
import android.widget.Filter;
import m.y2;
public final class b extends Filter {
    public a f15915a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return ((y2) this.f15915a).c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: i1.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f15915a;
        Cursor cursor = aVar.f15912c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((y2) aVar).b((Cursor) obj);
        }
    }
}
