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
public abstract class s implements b0, x, AdapterView.OnItemClickListener {
    public Rect f16609a;

    public static int m(ListAdapter listAdapter, Context context, int i9) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i9) {
                return i9;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    public abstract void l(k kVar);

    public abstract void n(View view);

    public abstract void o(boolean z10);

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        h hVar;
        int i10;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            hVar = (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            hVar = (h) listAdapter;
        }
        k kVar = hVar.f16548a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i9);
        if (!(this instanceof e)) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        kVar.q(menuItem, this, i10);
    }

    public abstract void p(int i9);

    public abstract void q(int i9);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z10);

    public abstract void t(int i9);

    @Override
    public final void i(Context context, k kVar) {
    }
}
