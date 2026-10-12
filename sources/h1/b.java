package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import m.a3;
import m.z2;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f10965a;
    public boolean f10966b;
    public Cursor f10967c;
    public int d;
    public com.google.android.gms.internal.clearcut.c f10968e;
    public a f10969f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f10967c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.f10968e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f10969f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f10967c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.f10968e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f10969f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f10965a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f10965a = false;
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
        if (this.f10965a && (cursor = this.f10967c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f10965a) {
            this.f10967c.moveToPosition(i10);
            if (view == null) {
                a3 a3Var = (a3) this;
                view = a3Var.f15381s.inflate(a3Var.f15380r, viewGroup, false);
            }
            a(view, this.f10967c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f10970a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f10965a && (cursor = this.f10967c) != null) {
            cursor.moveToPosition(i10);
            return this.f10967c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f10965a || (cursor = this.f10967c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f10967c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f10965a) {
            if (this.f10967c.moveToPosition(i10)) {
                if (view == null) {
                    a3 a3Var = (a3) this;
                    view = a3Var.f15381s.inflate(a3Var.f15379n, viewGroup, false);
                    view.setTag(new z2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(a3Var.E);
                }
                a(view, this.f10967c);
                return view;
            }
            throw new IllegalStateException(hg.c.i(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
