package h1;

import a5.j;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import com.google.android.gms.internal.clearcut.c;
import m.a3;
import m.z2;
public abstract class a extends BaseAdapter implements Filterable {
    public boolean f12554a;
    public boolean f12555b;
    public Cursor f12556c;
    public int d;
    public c e;
    public j f12557f;
    public b h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f12556c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                j jVar = this.f12557f;
                if (jVar != null) {
                    cursor2.unregisterDataSetObserver(jVar);
                }
            }
            this.f12556c = cursor;
            if (cursor != null) {
                c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                j jVar2 = this.f12557f;
                if (jVar2 != null) {
                    cursor.registerDataSetObserver(jVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f12554a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f12554a = false;
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
        if (this.f12554a && (cursor = this.f12556c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f12554a) {
            this.f12556c.moveToPosition(i10);
            if (view == null) {
                a3 a3Var = (a3) this;
                view = a3Var.f17675s.inflate(a3Var.f17674r, viewGroup, false);
            }
            a(view, this.f12556c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f12558a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f12554a && (cursor = this.f12556c) != null) {
            cursor.moveToPosition(i10);
            return this.f12556c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f12554a || (cursor = this.f12556c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f12556c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f12554a) {
            if (this.f12556c.moveToPosition(i10)) {
                if (view == null) {
                    a3 a3Var = (a3) this;
                    view = a3Var.f17675s.inflate(a3Var.f17673n, viewGroup, false);
                    view.setTag(new z2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(a3Var.E);
                }
                a(view, this.f12556c);
                return view;
            }
            throw new IllegalStateException(ic.a.i(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
