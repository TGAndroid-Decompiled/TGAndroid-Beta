package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
public abstract class o53 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public m53 e;
    public n53 f;
    public p53 h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                m53 m53Var = this.e;
                if (m53Var != null) {
                    cursor2.unregisterContentObserver(m53Var);
                }
                n53 n53Var = this.f;
                if (n53Var != null) {
                    cursor2.unregisterDataSetObserver(n53Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                m53 m53Var2 = this.e;
                if (m53Var2 != null) {
                    cursor.registerContentObserver(m53Var2);
                }
                n53 n53Var2 = this.f;
                if (n53Var2 != null) {
                    cursor.registerDataSetObserver(n53Var2);
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
                mdb mdbVar = (mdb) this;
                view = mdbVar.s.inflate(mdbVar.r, viewGroup, false);
            }
            a(view, this.c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        p53 p53Var = this.h;
        if (p53Var == null) {
            ?? filter = new Filter();
            filter.a = this;
            this.h = filter;
            return filter;
        }
        return p53Var;
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
                    mdb mdbVar = (mdb) this;
                    view = mdbVar.s.inflate(mdbVar.n, viewGroup, false);
                    view.setTag(new ldb(view));
                    ((ImageView) view.findViewById(2131296422)).setImageResource(mdbVar.F);
                }
                a(view, this.c);
                return view;
            }
            dq9.m(hg9.j(i, "couldn't move cursor to position "));
            return null;
        }
        dq9.m("this should only be called when the cursor is valid");
        return null;
    }
}
