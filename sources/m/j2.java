package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class j2 extends s1 {
    public final int D;
    public f2 E;
    public l.m F;
    public final int f19146y;

    public j2(Context context, boolean z9) {
        super(context, z9);
        if (1 == i2.a(context.getResources().getConfiguration())) {
            this.f19146y = 21;
            this.D = 22;
            return;
        }
        this.f19146y = 22;
        this.D = 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.h hVar;
        int i7;
        l.m mVar;
        int pointToPosition;
        int i10;
        if (this.E != null) {
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
            l.m mVar2 = this.F;
            if (mVar2 != mVar) {
                l.k kVar = hVar.f17668a;
                if (mVar2 != null) {
                    this.E.c0(kVar, mVar2);
                }
                this.F = mVar;
                if (mVar != null) {
                    this.E.h1(kVar, mVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        l.h hVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i7 == this.f19146y) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i7 == this.D) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                hVar = (l.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
            }
            hVar.f17668a.c(false);
            return true;
        } else {
            return super.onKeyDown(i7, keyEvent);
        }
    }

    public void setHoverListener(f2 f2Var) {
        this.E = f2Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
