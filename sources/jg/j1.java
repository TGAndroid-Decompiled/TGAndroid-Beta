package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.ua;
import hi.u2;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
public final class j1 extends r2 {
    public final CharSequence f15738a;
    public final ArrayList f15739b;
    public final int f15740c;
    public final int d;
    public final int e;
    public ua f15741f;
    public u2 h;
    public s71 f15742n;
    public boolean f15743r;

    public j1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f15738a = charSequence;
        this.f15739b = arrayList;
        this.f15740c = i10;
        this.d = i11;
        this.e = i12;
        this.f15743r = !arrayList.isEmpty();
    }

    public final boolean V() {
        ArrayList arrayList = this.f15739b;
        if (arrayList.size() != 1 || ((g1) arrayList.get(0)).f15712a != 0 || ((g1) arrayList.get(0)).f15713b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean W() {
        ArrayList arrayList = this.f15739b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !V() && ((g1) ic.a.g(1, arrayList)).f15713b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(this.f15738a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        s71 s71Var = new s71(this, new hi.e2(this, 12), new e1(this, 1), null);
        this.f15742n = s71Var;
        s71Var.u1();
        this.f15742n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f15742n, kb1.g(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final nm0 getListViewForSimpleGlass() {
        return this.f15742n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        u2 u2Var = this.h;
        if (u2Var != null) {
            u2Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f15743r) {
            ArrayList arrayList = this.f15739b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                ua uaVar = this.f15741f;
                if (uaVar != null) {
                    uaVar.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        super.onThemeColorsChanged();
        try {
            if (this.f15742n != null) {
                for (int i11 = 0; i11 < this.f15742n.getChildCount(); i11++) {
                    View childAt = this.f15742n.getChildAt(i11);
                    if ((childAt instanceof a9) && ((a9) childAt).f23864b == -1) {
                        if (this.f15743r) {
                            i10 = y6.f23394f6;
                        } else {
                            i10 = y6.f23376e6;
                        }
                        f7.i(i10, childAt, null);
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
