package defpackage;

import android.database.Cursor;
import android.widget.Filter;
public final class p53 extends Filter {
    public o53 a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p53.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        o53 o53Var = this.a;
        Cursor cursor = o53Var.c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            o53Var.b((Cursor) obj);
        }
    }
}
