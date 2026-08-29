package h1;

import android.database.Cursor;
import android.widget.Filter;
import m.c3;
public final class c extends Filter {
    public b f7509a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return ((c3) this.f7509a).c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: h1.c.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f7509a;
        Cursor cursor = bVar.f7506c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((c3) bVar).b((Cursor) obj);
        }
    }
}
