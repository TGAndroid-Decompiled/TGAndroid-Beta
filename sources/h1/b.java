package h1;

import android.database.Cursor;
import android.widget.Filter;
import m.y2;
public final class b extends Filter {
    public a f14099a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return ((y2) this.f14099a).c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: h1.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f14099a;
        Cursor cursor = aVar.f14096c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((y2) aVar).b((Cursor) obj);
        }
    }
}
