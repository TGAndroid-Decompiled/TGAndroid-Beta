package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import kf.k0;
import m.b3;
import m.c3;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f6873a;
    public boolean f6874b;
    public Cursor f6875c;
    public int d;
    public com.google.android.gms.internal.clearcut.c e;
    public a f6876f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f6875c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f6876f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f6875c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f6876f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f6873a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f6873a = false;
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
        if (this.f6873a && (cursor = this.f6875c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f6873a) {
            this.f6875c.moveToPosition(i10);
            if (view == null) {
                c3 c3Var = (c3) this;
                view = c3Var.f13455s.inflate(c3Var.f13454r, viewGroup, false);
            }
            a(view, this.f6875c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f6877a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f6873a && (cursor = this.f6875c) != null) {
            cursor.moveToPosition(i10);
            return this.f6875c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f6873a || (cursor = this.f6875c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f6875c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f6873a) {
            if (this.f6875c.moveToPosition(i10)) {
                if (view == null) {
                    c3 c3Var = (c3) this;
                    view = c3Var.f13455s.inflate(c3Var.f13453n, viewGroup, false);
                    view.setTag(new b3(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(c3Var.B);
                }
                a(view, this.f6875c);
                return view;
            }
            throw new IllegalStateException(k0.j(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
