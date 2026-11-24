package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
public abstract class d43 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public b43 e;
    public c43 f;
    public e43 h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                b43 b43Var = this.e;
                if (b43Var != null) {
                    cursor2.unregisterContentObserver(b43Var);
                }
                c43 c43Var = this.f;
                if (c43Var != null) {
                    cursor2.unregisterDataSetObserver(c43Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                b43 b43Var2 = this.e;
                if (b43Var2 != null) {
                    cursor.registerContentObserver(b43Var2);
                }
                c43 c43Var2 = this.f;
                if (c43Var2 != null) {
                    cursor.registerDataSetObserver(c43Var2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
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
        if (this.a && (cursor = this.c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.a) {
            this.c.moveToPosition(i);
            if (view == null) {
                kbb kbbVar = (kbb) this;
                view = kbbVar.s.inflate(kbbVar.r, viewGroup, false);
            }
            a(view, this.c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        e43 e43Var = this.h;
        if (e43Var == null) {
            ?? filter = new Filter();
            filter.a = this;
            this.h = filter;
            return filter;
        }
        return e43Var;
    }

    @Override
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null) {
            cursor.moveToPosition(i);
            return this.c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.c.getLong(this.d);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.a) {
            if (this.c.moveToPosition(i)) {
                if (view == null) {
                    kbb kbbVar = (kbb) this;
                    view = kbbVar.s.inflate(kbbVar.n, viewGroup, false);
                    view.setTag(new jbb(view));
                    ((ImageView) view.findViewById(2131296422)).setImageResource(kbbVar.F);
                }
                a(view, this.c);
                return view;
            }
            sc8.j(de9.k(i, "couldn't move cursor to position "));
            return null;
        }
        sc8.j("this should only be called when the cursor is valid");
        return null;
    }
}
