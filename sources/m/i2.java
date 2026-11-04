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
    public final int f18609y;

    public i2(Context context, boolean z10) {
        super(context, z10);
        if (1 == h2.a(context.getResources().getConfiguration())) {
            this.f18609y = 21;
            this.E = 22;
            return;
        }
        this.f18609y = 22;
        this.E = 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.h hVar;
        int i3;
        l.m mVar;
        int pointToPosition;
        int i10;
        if (this.F != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                hVar = (l.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
                i3 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i3) >= 0 && i10 < hVar.getCount()) {
                mVar = hVar.getItem(i10);
            } else {
                mVar = null;
            }
            l.m mVar2 = this.G;
            if (mVar2 != mVar) {
                l.k kVar = hVar.f17411a;
                if (mVar2 != null) {
                    this.F.d(kVar, mVar2);
                }
                this.G = mVar;
                if (mVar != null) {
                    this.F.S(kVar, mVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        l.h hVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f18609y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i3 == this.E) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                hVar = (l.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
            }
            hVar.f17411a.c(false);
            return true;
        } else {
            return super.onKeyDown(i3, keyEvent);
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
