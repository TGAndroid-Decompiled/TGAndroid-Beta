package h1;

import android.database.Cursor;
import android.widget.Filter;
import m.a3;
public final class b extends Filter {
    public a f12558a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return ((a3) this.f12558a).c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: h1.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f12558a;
        Cursor cursor = aVar.f12556c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((a3) aVar).b((Cursor) obj);
        }
    }
}
