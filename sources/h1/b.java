package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import l.d;
import m.a3;
import m.b3;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f7183a;
    public boolean f7184b;
    public Cursor f7185c;
    public int d;
    public com.google.android.gms.internal.clearcut.c f7186e;
    public a f7187f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f7185c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.f7186e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f7187f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f7185c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.f7186e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f7187f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f7183a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f7183a = false;
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
        if (this.f7183a && (cursor = this.f7185c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7183a) {
            this.f7185c.moveToPosition(i10);
            if (view == null) {
                b3 b3Var = (b3) this;
                view = b3Var.f13150s.inflate(b3Var.f13149r, viewGroup, false);
            }
            a(view, this.f7185c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f7188a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f7183a && (cursor = this.f7185c) != null) {
            cursor.moveToPosition(i10);
            return this.f7185c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f7183a || (cursor = this.f7185c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f7185c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7183a) {
            if (this.f7185c.moveToPosition(i10)) {
                if (view == null) {
                    b3 b3Var = (b3) this;
                    view = b3Var.f13150s.inflate(b3Var.f13148n, viewGroup, false);
                    view.setTag(new a3(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(b3Var.B);
                }
                a(view, this.f7185c);
                return view;
            }
            throw new IllegalStateException(d.j(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
