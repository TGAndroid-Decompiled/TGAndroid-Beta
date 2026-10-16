package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class k2 extends t1 {
    public g2 E;
    public l.m F;
    public final int f14884x;
    public final int f14885y;

    public k2(Context context, boolean z10) {
        super(context, z10);
        if (1 == j2.a(context.getResources().getConfiguration())) {
            this.f14884x = 21;
            this.f14885y = 22;
            return;
        }
        this.f14884x = 22;
        this.f14885y = 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.h hVar;
        int i10;
        l.m mVar;
        int pointToPosition;
        int i11;
        if (this.E != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                hVar = (l.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
                i10 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < hVar.getCount()) {
                mVar = hVar.getItem(i11);
            } else {
                mVar = null;
            }
            l.m mVar2 = this.F;
            if (mVar2 != mVar) {
                l.k kVar = hVar.f14410a;
                if (mVar2 != null) {
                    this.E.z(kVar, mVar2);
                }
                this.F = mVar;
                if (mVar != null) {
                    this.E.w0(kVar, mVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.h hVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f14884x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i10 == this.f14885y) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                hVar = (l.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
            }
            hVar.f14410a.c(false);
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setHoverListener(g2 g2Var) {
        this.E = g2Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
