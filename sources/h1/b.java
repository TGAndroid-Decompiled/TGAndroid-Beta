package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import i2.g;
import m.y2;
import m.z2;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f10830a;
    public boolean f10831b;
    public Cursor f10832c;
    public int d;
    public com.google.android.gms.internal.clearcut.c f10833e;
    public a f10834f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f10832c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.f10833e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f10834f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f10832c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.f10833e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f10834f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f10830a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f10830a = false;
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
        if (this.f10830a && (cursor = this.f10832c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f10830a) {
            this.f10832c.moveToPosition(i10);
            if (view == null) {
                z2 z2Var = (z2) this;
                view = z2Var.f15735s.inflate(z2Var.f15734r, viewGroup, false);
            }
            a(view, this.f10832c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f10835a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f10830a && (cursor = this.f10832c) != null) {
            cursor.moveToPosition(i10);
            return this.f10832c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f10830a || (cursor = this.f10832c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f10832c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f10830a) {
            if (this.f10832c.moveToPosition(i10)) {
                if (view == null) {
                    z2 z2Var = (z2) this;
                    view = z2Var.f15735s.inflate(z2Var.f15733n, viewGroup, false);
                    view.setTag(new y2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(z2Var.E);
                }
                a(view, this.f10832c);
                return view;
            }
            throw new IllegalStateException(g.i(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
