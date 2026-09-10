package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
public abstract class t implements c0, y, AdapterView.OnItemClickListener {
    public Rect f12681a;

    public static int m(ListAdapter listAdapter, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    public abstract void l(l lVar);

    public abstract void n(View view);

    public abstract void o(boolean z10);

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        i iVar;
        int i11;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            iVar = (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            iVar = (i) listAdapter;
        }
        l lVar = iVar.f12623a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i10);
        if (!(this instanceof f)) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        lVar.q(menuItem, this, i11);
    }

    public abstract void p(int i10);

    public abstract void q(int i10);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z10);

    public abstract void t(int i10);

    @Override
    public final void i(Context context, l lVar) {
    }
}
