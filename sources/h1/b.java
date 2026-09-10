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
    public boolean f9194a;
    public boolean f9195b;
    public Cursor f9196c;
    public int d;
    public com.google.android.gms.internal.clearcut.c e;
    public a f9197f;
    public c h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f9196c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                com.google.android.gms.internal.clearcut.c cVar = this.e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                a aVar = this.f9197f;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.f9196c = cursor;
            if (cursor != null) {
                com.google.android.gms.internal.clearcut.c cVar2 = this.e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                a aVar2 = this.f9197f;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f9194a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f9194a = false;
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
        if (this.f9194a && (cursor = this.f9196c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f9194a) {
            this.f9196c.moveToPosition(i10);
            if (view == null) {
                z2 z2Var = (z2) this;
                view = z2Var.f13212s.inflate(z2Var.f13211r, viewGroup, false);
            }
            a(view, this.f9196c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f9198a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f9194a && (cursor = this.f9196c) != null) {
            cursor.moveToPosition(i10);
            return this.f9196c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f9194a || (cursor = this.f9196c) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f9196c.getLong(this.d);
    }

    @Override
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f9194a) {
            if (this.f9196c.moveToPosition(i10)) {
                if (view == null) {
                    z2 z2Var = (z2) this;
                    view = z2Var.f13212s.inflate(z2Var.f13210n, viewGroup, false);
                    view.setTag(new y2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(z2Var.E);
                }
                a(view, this.f9196c);
                return view;
            }
            throw new IllegalStateException(hc.b.j(i10, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
