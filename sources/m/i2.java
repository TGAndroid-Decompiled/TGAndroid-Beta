package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class i2 extends r1 {
    public final int E;
    public e2 F;
    public l.m G;
    public final int f20085y;

    public i2(Context context, boolean z10) {
        super(context, z10);
        if (1 == h2.a(context.getResources().getConfiguration())) {
            this.f20085y = 21;
            this.E = 22;
            return;
        }
        this.f20085y = 22;
        this.E = 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.h hVar;
        int i7;
        l.m mVar;
        int pointToPosition;
        int i10;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i7 = headerViewListAdapter.getHeadersCount();
                hVar = (l.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
                i7 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i7) >= 0 && i10 < hVar.getCount()) {
                mVar = hVar.getItem(i10);
            } else {
                mVar = null;
            }
            l.m mVar2 = this.G;
            if (mVar2 != mVar) {
                l.k kVar = hVar.f19171a;
                if (mVar2 != null) {
                    this.F.h(kVar, mVar2);
                }
                this.G = mVar;
                if (mVar != null) {
                    this.F.n(kVar, mVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        l.h hVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f20085y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i7 == this.E) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                hVar = (l.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
            }
            hVar.f19171a.c(false);
            return true;
        } else {
            return super.onKeyDown(i7, keyEvent);
        }
    }

    public void setHoverListener(e2 e2Var) {
        this.F = e2Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
