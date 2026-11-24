package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class p07 extends er3 {
    public final byte E;
    public b07 F;
    public c07 G;
    public final byte y;

    public p07(Context context, boolean z) {
        super(context, z);
        if (1 == o07.a(context.getResources().getConfiguration())) {
            this.y = (byte) 21;
            this.E = (byte) 22;
            return;
        }
        this.y = (byte) 22;
        this.E = (byte) 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        vz6 vz6Var;
        int i;
        c07 c07Var;
        int pointToPosition;
        int i2;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                vz6Var = (vz6) headerViewListAdapter.getWrappedAdapter();
            } else {
                vz6Var = (vz6) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < vz6Var.getCount()) {
                c07Var = vz6Var.getItem(i2);
            } else {
                c07Var = null;
            }
            c07 c07Var2 = this.G;
            if (c07Var2 != c07Var) {
                yz6 yz6Var = vz6Var.a;
                if (c07Var2 != null) {
                    this.F.i(yz6Var, c07Var2);
                }
                this.G = c07Var;
                if (c07Var != null) {
                    this.F.q(yz6Var, c07Var);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        vz6 vz6Var;
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
                    vz6Var = (vz6) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    vz6Var = (vz6) adapter;
                }
                vz6Var.a.c(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(b07 b07Var) {
        this.F = b07Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
