package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import j7.l1;
import m.b3;
import m.c3;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f7504a;
    public boolean f7505b;
    public Cursor f7506c;
    public int d;
    public com.google.android.gms.internal.clearcut.c f7507e;
    public a f7508f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f7506c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.f7507e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f7508f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f7506c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.f7507e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f7508f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f7504a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f7504a = false;
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
        if (this.f7504a && (cursor = this.f7506c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7504a) {
            this.f7506c.moveToPosition(i10);
            if (view == null) {
                c3 c3Var = (c3) this;
                view = c3Var.f16509s.inflate(c3Var.f16508r, viewGroup, false);
            }
            a(view, this.f7506c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f7509a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f7504a && (cursor = this.f7506c) != null) {
            cursor.moveToPosition(i10);
            return this.f7506c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f7504a || (cursor = this.f7506c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f7506c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7504a) {
            if (this.f7506c.moveToPosition(i10)) {
                if (view == null) {
                    c3 c3Var = (c3) this;
                    view = c3Var.f16509s.inflate(c3Var.f16507n, viewGroup, false);
                    view.setTag(new b3(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(c3Var.A);
                }
                a(view, this.f7506c);
                return view;
            }
            throw new IllegalStateException(l1.k(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
