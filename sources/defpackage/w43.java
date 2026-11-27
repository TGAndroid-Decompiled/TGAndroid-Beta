package defpackage;

import android.database.Cursor;
import android.widget.Filter;
public final class w43 extends Filter {
    public v43 a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w43.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        v43 v43Var = this.a;
        Cursor cursor = v43Var.c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            v43Var.b((Cursor) obj);
        }
    }
}
