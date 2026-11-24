package defpackage;

import android.database.Cursor;
import android.widget.Filter;
public final class e43 extends Filter {
    public d43 a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e43.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        d43 d43Var = this.a;
        Cursor cursor = d43Var.c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            d43Var.b((Cursor) obj);
        }
    }
}
