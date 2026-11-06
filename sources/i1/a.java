package i1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import c5.h;
import com.google.android.gms.internal.clearcut.c;
import jg.g;
import m.y2;
import m.z2;
public abstract class a extends BaseAdapter implements Filterable {
    public boolean f15138a;
    public boolean f15139b;
    public Cursor f15140c;
    public int d;
    public c f15141e;
    public h f15142f;
    public b h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f15140c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c cVar = this.f15141e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                h hVar = this.f15142f;
                if (hVar != null) {
                    cursor2.unregisterDataSetObserver(hVar);
                }
            }
            this.f15140c = cursor;
            if (cursor != null) {
                c cVar2 = this.f15141e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                h hVar2 = this.f15142f;
                if (hVar2 != null) {
                    cursor.registerDataSetObserver(hVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f15138a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f15138a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override
    public final int getCount() {
        Cursor cursor;
        if (this.f15138a && (cursor = this.f15140c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (this.f15138a) {
            this.f15140c.moveToPosition(i7);
            if (view == null) {
                z2 z2Var = (z2) this;
                view = z2Var.f19318s.inflate(z2Var.f19317r, viewGroup, false);
            }
            a(view, this.f15140c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f15143a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i7) {
        Cursor cursor;
        if (this.f15138a && (cursor = this.f15140c) != null) {
            cursor.moveToPosition(i7);
            return this.f15140c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i7) {
        Cursor cursor;
        if (!this.f15138a || (cursor = this.f15140c) == null || !cursor.moveToPosition(i7)) {
            return 0L;
        }
        return this.f15140c.getLong(this.d);
    }

    @Override
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (this.f15138a) {
            if (this.f15140c.moveToPosition(i7)) {
                if (view == null) {
                    z2 z2Var = (z2) this;
                    view = z2Var.f19318s.inflate(z2Var.f19316n, viewGroup, false);
                    view.setTag(new y2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(z2Var.E);
                }
                a(view, this.f15140c);
                return view;
            }
            throw new IllegalStateException(g.j(i7, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
