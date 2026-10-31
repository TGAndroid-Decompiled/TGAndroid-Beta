package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import m.y2;
import m.z2;
public abstract class b extends BaseAdapter implements Filterable {
    public boolean f7570a;
    public boolean f7571b;
    public Cursor f7572c;
    public int d;
    public com.google.android.gms.internal.clearcut.c e;
    public a f7573f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f7572c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f7573f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f7572c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f7573f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f7570a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f7570a = false;
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
        if (this.f7570a && (cursor = this.f7572c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7570a) {
            this.f7572c.moveToPosition(i10);
            if (view == null) {
                z2 z2Var = (z2) this;
                view = z2Var.f12611s.inflate(z2Var.f12610r, viewGroup, false);
            }
            a(view, this.f7572c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f7574a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f7570a && (cursor = this.f7572c) != null) {
            cursor.moveToPosition(i10);
            return this.f7572c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f7570a || (cursor = this.f7572c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f7572c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7570a) {
            if (this.f7572c.moveToPosition(i10)) {
                if (view == null) {
                    z2 z2Var = (z2) this;
                    view = z2Var.f12611s.inflate(z2Var.f12609n, viewGroup, false);
                    view.setTag(new y2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(z2Var.E);
                }
                a(view, this.f7572c);
                return view;
            }
            throw new IllegalStateException(i0.a.i(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
