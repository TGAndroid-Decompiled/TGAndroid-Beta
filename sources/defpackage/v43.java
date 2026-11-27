package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
public abstract class v43 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public t43 e;
    public u43 f;
    public w43 h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                t43 t43Var = this.e;
                if (t43Var != null) {
                    cursor2.unregisterContentObserver(t43Var);
                }
                u43 u43Var = this.f;
                if (u43Var != null) {
                    cursor2.unregisterDataSetObserver(u43Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                t43 t43Var2 = this.e;
                if (t43Var2 != null) {
                    cursor.registerContentObserver(t43Var2);
                }
                u43 u43Var2 = this.f;
                if (u43Var2 != null) {
                    cursor.registerDataSetObserver(u43Var2);
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
                gfb gfbVar = (gfb) this;
                view = gfbVar.s.inflate(gfbVar.r, viewGroup, false);
            }
            a(view, this.c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        w43 w43Var = this.h;
        if (w43Var == null) {
            ?? filter = new Filter();
            filter.a = this;
            this.h = filter;
            return filter;
        }
        return w43Var;
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
                    gfb gfbVar = (gfb) this;
                    view = gfbVar.s.inflate(gfbVar.n, viewGroup, false);
                    view.setTag(new ffb(view));
                    ((ImageView) view.findViewById(2131296422)).setImageResource(gfbVar.F);
                }
                a(view, this.c);
                return view;
            }
            grb.i(uh9.k(i, "couldn't move cursor to position "));
            return null;
        }
        grb.i("this should only be called when the cursor is valid");
        return null;
    }
}
