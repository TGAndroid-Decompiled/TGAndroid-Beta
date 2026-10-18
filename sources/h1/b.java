package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import i2.d;
import m.a3;
import m.b3;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f11621a;
    public boolean f11622b;
    public Cursor f11623c;
    public int d;
    public com.google.android.gms.internal.clearcut.c e;
    public a f11624f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f11623c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f11624f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f11623c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f11624f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f11621a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f11621a = false;
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
        if (this.f11621a && (cursor = this.f11623c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f11621a) {
            this.f11623c.moveToPosition(i10);
            if (view == null) {
                b3 b3Var = (b3) this;
                view = b3Var.f16165s.inflate(b3Var.f16164r, viewGroup, false);
            }
            a(view, this.f11623c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f11625a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f11621a && (cursor = this.f11623c) != null) {
            cursor.moveToPosition(i10);
            return this.f11623c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f11621a || (cursor = this.f11623c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f11623c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f11621a) {
            if (this.f11623c.moveToPosition(i10)) {
                if (view == null) {
                    b3 b3Var = (b3) this;
                    view = b3Var.f16165s.inflate(b3Var.f16163n, viewGroup, false);
                    view.setTag(new a3(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(b3Var.E);
                }
                a(view, this.f11623c);
                return view;
            }
            throw new IllegalStateException(d.j(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
