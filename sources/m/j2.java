package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

public final class j2 extends s1 {
    public f2 A;
    public l.n B;

    public final int f17356x;

    public final int f17357y;

    public j2(Context context, boolean z10) {
        super(context, z10);
        if (1 == i2.a(context.getResources().getConfiguration())) {
            this.f17356x = 21;
            this.f17357y = 22;
        } else {
            this.f17356x = 22;
            this.f17357y = 21;
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.i iVar;
        int headersCount;
        int iPointToPosition;
        int i10;
        if (this.A != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (l.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (l.i) adapter;
                headersCount = 0;
            }
            l.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= iVar.getCount()) ? null : iVar.getItem(i10);
            l.n nVar = this.B;
            if (nVar != nVarB) {
                l.l lVar = iVar.f15304a;
                if (nVar != null) {
                    this.A.j(lVar, nVar);
                }
                this.B = nVarB;
                if (nVarB != null) {
                    this.A.y(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f17356x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i10 != this.f17357y) {
            return super.onKeyDown(i10, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.i) adapter).f15304a.c(false);
        return true;
    }

    public void setHoverListener(f2 f2Var) {
        this.A = f2Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
