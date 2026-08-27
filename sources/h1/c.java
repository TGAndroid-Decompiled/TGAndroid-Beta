package h1;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import m.c3;

public final class c extends Filter {

    public b f7747a;

    @Override
    public final CharSequence convertResultToString(Object obj) {
        return ((c3) this.f7747a).c((Cursor) obj);
    }

    @Override
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorG;
        c3 c3Var = (c3) this.f7747a;
        SearchView searchView = c3Var.v;
        String string = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = c3Var.g(c3Var.f17286w, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e9) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e9);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f7747a;
        Cursor cursor = bVar.f7744c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((c3) bVar).b((Cursor) obj);
    }
}
