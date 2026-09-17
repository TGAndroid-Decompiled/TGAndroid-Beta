package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class i2 extends r1 {
    public e2 E;
    public l.n F;
    public final int f15547x;
    public final int f15548y;

    public i2(Context context, boolean z10) {
        super(context, z10);
        if (1 == h2.a(context.getResources().getConfiguration())) {
            this.f15547x = 21;
            this.f15548y = 22;
            return;
        }
        this.f15547x = 22;
        this.f15548y = 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.i iVar;
        int i10;
        l.n nVar;
        int pointToPosition;
        int i11;
        if (this.E != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                iVar = (l.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (l.i) adapter;
                i10 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < iVar.getCount()) {
                nVar = iVar.getItem(i11);
            } else {
                nVar = null;
            }
            l.n nVar2 = this.F;
            if (nVar2 != nVar) {
                l.l lVar = iVar.f15104a;
                if (nVar2 != null) {
                    this.E.d(lVar, nVar2);
                }
                this.F = nVar;
                if (nVar != null) {
                    this.E.o(lVar, nVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.i iVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f15547x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i10 == this.f15548y) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                iVar = (l.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                iVar = (l.i) adapter;
            }
            iVar.f15104a.c(false);
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setHoverListener(e2 e2Var) {
        this.E = e2Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
