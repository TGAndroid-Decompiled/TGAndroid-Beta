package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import j3.r0;
import m.b3;
import m.c3;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f9310a;
    public boolean f9311b;
    public Cursor f9312c;
    public int d;
    public com.google.android.gms.internal.clearcut.c f9313e;
    public a f9314f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f9312c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.f9313e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f9314f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f9312c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.f9313e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f9314f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f9310a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f9310a = false;
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
        if (this.f9310a && (cursor = this.f9312c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i9, View view, ViewGroup viewGroup) {
        if (this.f9310a) {
            this.f9312c.moveToPosition(i9);
            if (view == null) {
                c3 c3Var = (c3) this;
                view = c3Var.f16910s.inflate(c3Var.f16909r, viewGroup, false);
            }
            a(view, this.f9312c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f9315a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i9) {
        Cursor cursor;
        if (this.f9310a && (cursor = this.f9312c) != null) {
            cursor.moveToPosition(i9);
            return this.f9312c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i9) {
        Cursor cursor;
        if (!this.f9310a || (cursor = this.f9312c) == null || !cursor.moveToPosition(i9)) {
            return 0L;
        }
        return this.f9312c.getLong(this.d);
    }

    @Override
    public View getView(int i9, View view, ViewGroup viewGroup) {
        if (this.f9310a) {
            if (this.f9312c.moveToPosition(i9)) {
                if (view == null) {
                    c3 c3Var = (c3) this;
                    view = c3Var.f16910s.inflate(c3Var.f16908n, viewGroup, false);
                    view.setTag(new b3(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(c3Var.A);
                }
                a(view, this.f9312c);
                return view;
            }
            throw new IllegalStateException(r0.l(i9, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
