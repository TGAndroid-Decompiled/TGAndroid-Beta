package i1;

import android.database.Cursor;
import android.widget.Filter;
import m.z2;
public final class b extends Filter {
    public a f15148a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return ((z2) this.f15148a).c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: i1.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f15148a;
        Cursor cursor = aVar.f15145c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((z2) aVar).b((Cursor) obj);
        }
    }
}
