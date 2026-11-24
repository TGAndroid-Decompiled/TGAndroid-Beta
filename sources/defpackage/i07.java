package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
public abstract class i07 implements vga, s07, AdapterView.OnItemClickListener {
    public Rect a;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override
    public final boolean g(c07 c07Var) {
        return false;
    }

    @Override
    public final boolean i(c07 c07Var) {
        return false;
    }

    public abstract void n(View view);

    public abstract void o(boolean z);

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        vz6 vz6Var;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            vz6Var = (vz6) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            vz6Var = (vz6) listAdapter;
        }
        yz6 yz6Var = vz6Var.a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof xc1)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        yz6Var.q(menuItem, this, i2);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);

    public void l(yz6 yz6Var) {
    }

    @Override
    public final void k(Context context, yz6 yz6Var) {
    }
}
