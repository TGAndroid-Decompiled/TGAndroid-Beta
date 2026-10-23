package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import i2.o1;
import m.a3;
import m.b3;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f11645a;
    public boolean f11646b;
    public Cursor f11647c;
    public int d;
    public com.google.android.gms.internal.clearcut.c e;
    public a f11648f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f11647c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f11648f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f11647c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f11648f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f11645a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f11645a = false;
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
        if (this.f11645a && (cursor = this.f11647c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f11645a) {
            this.f11647c.moveToPosition(i10);
            if (view == null) {
                b3 b3Var = (b3) this;
                view = b3Var.f16227s.inflate(b3Var.f16226r, viewGroup, false);
            }
            a(view, this.f11647c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f11649a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f11645a && (cursor = this.f11647c) != null) {
            cursor.moveToPosition(i10);
            return this.f11647c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f11645a || (cursor = this.f11647c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f11647c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f11645a) {
            if (this.f11647c.moveToPosition(i10)) {
                if (view == null) {
                    b3 b3Var = (b3) this;
                    view = b3Var.f16227s.inflate(b3Var.f16225n, viewGroup, false);
                    view.setTag(new a3(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(b3Var.E);
                }
                a(view, this.f11647c);
                return view;
            }
            throw new IllegalStateException(o1.k(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
