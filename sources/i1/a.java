package i1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import c5.i;
import com.google.android.gms.internal.clearcut.c;
import m.x2;
import m.y2;
public abstract class a extends BaseAdapter implements Filterable {
    public boolean f15595a;
    public boolean f15596b;
    public Cursor f15597c;
    public int d;
    public c f15598e;
    public i f15599f;
    public b h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f15597c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c cVar = this.f15598e;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                i iVar = this.f15599f;
                if (iVar != null) {
                    cursor2.unregisterDataSetObserver(iVar);
                }
            }
            this.f15597c = cursor;
            if (cursor != null) {
                c cVar2 = this.f15598e;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                i iVar2 = this.f15599f;
                if (iVar2 != null) {
                    cursor.registerDataSetObserver(iVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f15595a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f15595a = false;
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
        if (this.f15595a && (cursor = this.f15597c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (this.f15595a) {
            this.f15597c.moveToPosition(i7);
            if (view == null) {
                y2 y2Var = (y2) this;
                view = y2Var.f19901s.inflate(y2Var.f19900r, viewGroup, false);
            }
            a(view, this.f15597c);
            return view;
        }
        return null;
    }

    @Override
    public final Filter getFilter() {
        if (this.h == null) {
            ?? filter = new Filter();
            filter.f15600a = this;
            this.h = filter;
        }
        return this.h;
    }

    @Override
    public final Object getItem(int i7) {
        Cursor cursor;
        if (this.f15595a && (cursor = this.f15597c) != null) {
            cursor.moveToPosition(i7);
            return this.f15597c;
        }
        return null;
    }

    @Override
    public final long getItemId(int i7) {
        Cursor cursor;
        if (!this.f15595a || (cursor = this.f15597c) == null || !cursor.moveToPosition(i7)) {
            return 0L;
        }
        return this.f15597c.getLong(this.d);
    }

    @Override
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (this.f15595a) {
            if (this.f15597c.moveToPosition(i7)) {
                if (view == null) {
                    y2 y2Var = (y2) this;
                    view = y2Var.f19901s.inflate(y2Var.f19899n, viewGroup, false);
                    view.setTag(new x2(view));
                    ((ImageView) view.findViewById(2131296420)).setImageResource(y2Var.F);
                }
                a(view, this.f15597c);
                return view;
            }
            throw new IllegalStateException(i5.c.i(i7, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
