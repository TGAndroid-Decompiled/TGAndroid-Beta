package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class p27 extends os3 {
    public final byte E;
    public b27 F;
    public c27 G;
    public final byte y;

    public p27(Context context, boolean z) {
        super(context, z);
        if (1 == o27.a(context.getResources().getConfiguration())) {
            this.y = (byte) 21;
            this.E = (byte) 22;
            return;
        }
        this.y = (byte) 22;
        this.E = (byte) 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        v17 v17Var;
        int i;
        c27 c27Var;
        int pointToPosition;
        int i2;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                v17Var = (v17) headerViewListAdapter.getWrappedAdapter();
            } else {
                v17Var = (v17) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < v17Var.getCount()) {
                c27Var = v17Var.getItem(i2);
            } else {
                c27Var = null;
            }
            c27 c27Var2 = this.G;
            if (c27Var2 != c27Var) {
                y17 y17Var = v17Var.a;
                if (c27Var2 != null) {
                    this.F.B(y17Var, c27Var2);
                }
                this.G = c27Var;
                if (c27Var != null) {
                    this.F.g0(y17Var, c27Var);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        v17 v17Var;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.y) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (i == this.E) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    v17Var = (v17) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    v17Var = (v17) adapter;
                }
                v17Var.a.c(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(b27 b27Var) {
        this.F = b27Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
