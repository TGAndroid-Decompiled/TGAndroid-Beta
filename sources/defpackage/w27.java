package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class w27 extends vr3 {
    public final byte E;
    public i27 F;
    public j27 G;
    public final byte y;

    public w27(Context context, boolean z) {
        super(context, z);
        if (1 == v27.a(context.getResources().getConfiguration())) {
            this.y = (byte) 21;
            this.E = (byte) 22;
            return;
        }
        this.y = (byte) 22;
        this.E = (byte) 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        c27 c27Var;
        int i;
        j27 j27Var;
        int pointToPosition;
        int i2;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c27Var = (c27) headerViewListAdapter.getWrappedAdapter();
            } else {
                c27Var = (c27) adapter;
                i = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c27Var.getCount()) {
                j27Var = c27Var.getItem(i2);
            } else {
                j27Var = null;
            }
            j27 j27Var2 = this.G;
            if (j27Var2 != j27Var) {
                f27 f27Var = c27Var.a;
                if (j27Var2 != null) {
                    this.F.C(f27Var, j27Var2);
                }
                this.G = j27Var;
                if (j27Var != null) {
                    this.F.k0(f27Var, j27Var);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        c27 c27Var;
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
                    c27Var = (c27) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    c27Var = (c27) adapter;
                }
                c27Var.a.c(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHoverListener(i27 i27Var) {
        this.F = i27Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
