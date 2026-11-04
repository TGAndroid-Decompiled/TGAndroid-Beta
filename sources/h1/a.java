package h1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import b5.i;
import com.google.android.gms.internal.clearcut.c;
import k2.p1;
import m.x2;
import m.y2;
public abstract class a extends BaseAdapter implements Filterable {
    public boolean f14094a;
    public boolean f14095b;
    public Cursor f14096c;
    public int d;
    public c f14097e;
    public i f14098f;
    public b h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f14096c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c cVar = this.f14097e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                i iVar = this.f14098f;
                if (iVar != null) {
                    cursor2.unregisterDataSetObserver(iVar);
                }
            }
            this.f14096c = cursor;
            if (cursor != null) {
                c cVar2 = this.f14097e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                i iVar2 = this.f14098f;
                if (iVar2 != null) {
                    cursor.registerDataSetObserver(iVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f14094a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f14094a = false;
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
        if (this.f14094a && (cursor = this.f14096c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (this.f14094a) {
            this.f14096c.moveToPosition(i3);
            if (view == null) {
                y2 y2Var = (y2) this;
                view = y2Var.f18789s.inflate(y2Var.f18788r, viewGroup, false);
            }
            a(view, this.f14096c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f14099a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i3) {
        Cursor cursor;
        if (this.f14094a && (cursor = this.f14096c) != null) {
            cursor.moveToPosition(i3);
            return this.f14096c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i3) {
        Cursor cursor;
        if (!this.f14094a || (cursor = this.f14096c) == null || !cursor.moveToPosition(i3)) {
            return 0L;
        }
        return this.f14096c.getLong(this.d);
    }

    @Override
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (this.f14094a) {
            if (this.f14096c.moveToPosition(i3)) {
                if (view == null) {
                    y2 y2Var = (y2) this;
                    view = y2Var.f18789s.inflate(y2Var.f18787n, viewGroup, false);
                    view.setTag(new x2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(y2Var.F);
                }
                a(view, this.f14096c);
                return view;
            }
            throw new IllegalStateException(p1.i(i3, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
