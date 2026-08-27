package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import m.c3;

public abstract class b extends BaseAdapter implements Filterable {

    public boolean f7742a;

    public boolean f7743b;

    public Cursor f7744c;
    public int d;

    public com.google.android.gms.internal.clearcut.c f7745e;

    public a f7746f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f7744c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.f7745e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f7746f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f7744c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.f7745e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f7746f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f7742a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f7742a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override
    public final int getCount() {
        Cursor cursor;
        if (!this.f7742a || (cursor = this.f7744c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7742a) {
            return null;
        }
        this.f7744c.moveToPosition(i10);
        if (view == null) {
            c3 c3Var = (c3) this;
            view = c3Var.f17285s.inflate(c3Var.f17284r, viewGroup, false);
        }
        a(view, this.f7744c);
        return view;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            c cVar = new c();
            cVar.f7747a = this;
            this.h = cVar;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f7742a || (cursor = this.f7744c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f7744c;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f7742a && (cursor = this.f7744c) != null && cursor.moveToPosition(i10)) {
            return this.f7744c.getLong(this.d);
        }
        return 0L;
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f7742a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f7744c.moveToPosition(i10)) {
            throw new IllegalStateException(i0.a.k(i10, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f7744c);
        return view;
    }
}
