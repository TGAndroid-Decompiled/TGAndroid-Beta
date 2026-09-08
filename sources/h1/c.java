package h1;

import android.database.Cursor;
import android.widget.Filter;
import m.z2;
public final class c extends Filter {
    public b f10863a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return ((z2) this.f10863a).c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: h1.c.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f10863a;
        Cursor cursor = bVar.f10860c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((z2) bVar).b((Cursor) obj);
        }
    }
}
