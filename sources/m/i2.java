package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class i2 extends r1 {
    public e2 B;
    public l.n C;
    public final int f13219x;
    public final int f13220y;

    public i2(Context context, boolean z4) {
        super(context, z4);
        if (1 == h2.a(context.getResources().getConfiguration())) {
            this.f13219x = 21;
            this.f13220y = 22;
            return;
        }
        this.f13219x = 22;
        this.f13220y = 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.i iVar;
        int i10;
        l.n nVar;
        int pointToPosition;
        int i11;
        if (this.B != null) {
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
            l.n nVar2 = this.C;
            if (nVar2 != nVar) {
                l.l lVar = iVar.f11389a;
                if (nVar2 != null) {
                    this.B.h(lVar, nVar2);
                }
                this.C = nVar;
                if (nVar != null) {
                    this.B.D(lVar, nVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.i iVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f13219x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i10 == this.f13220y) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                iVar = (l.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                iVar = (l.i) adapter;
            }
            iVar.f11389a.c(false);
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setHoverListener(e2 e2Var) {
        this.B = e2Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
