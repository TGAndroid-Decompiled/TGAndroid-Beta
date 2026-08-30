package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
public final class j2 extends s1 {
    public f2 B;
    public l.m C;
    public final int f13539x;
    public final int f13540y;

    public j2(Context context, boolean z4) {
        super(context, z4);
        if (1 == i2.a(context.getResources().getConfiguration())) {
            this.f13539x = 21;
            this.f13540y = 22;
            return;
        }
        this.f13539x = 22;
        this.f13540y = 21;
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.h hVar;
        int i10;
        l.m mVar;
        int pointToPosition;
        int i11;
        if (this.B != null) {
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
            l.m mVar2 = this.C;
            if (mVar2 != mVar) {
                l.k kVar = hVar.f11035a;
                if (mVar2 != null) {
                    this.B.e(kVar, mVar2);
                }
                this.C = mVar;
                if (mVar != null) {
                    this.B.q(kVar, mVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.h hVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f13539x) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i10 == this.f13540y) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                hVar = (l.h) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                hVar = (l.h) adapter;
            }
            hVar.f11035a.c(false);
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setHoverListener(f2 f2Var) {
        this.B = f2Var;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
