package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.y7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
public final class h1 extends g2 {
    public final CharSequence f18426a;
    public final ArrayList f18427b;
    public final int f18428c;
    public final int d;
    public final int f18429e;
    public i0 f18430f;
    public ji.f h;
    public g51 f18431n;
    public boolean f18432r;

    public h1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f18426a = charSequence;
        this.f18427b = arrayList;
        this.f18428c = i7;
        this.d = i10;
        this.f18429e = i11;
        this.f18432r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f18427b;
        if (arrayList.size() != 1 || ((d1) arrayList.get(0)).f18379a != 0 || ((d1) arrayList.get(0)).f18380b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f18427b;
        if (arrayList.size() >= this.f18429e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((d1) i5.c.h(1, arrayList)).f18380b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(this.f18426a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        g51 g51Var = new g51(this, new y7(this, 14), new f1(this, 0), null);
        this.f18431n = g51Var;
        g51Var.r1();
        this.f18431n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18431n, na.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18431n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ji.f fVar = this.h;
        if (fVar != null) {
            fVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f18432r) {
            ArrayList arrayList = this.f18427b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                i0 i0Var = this.f18430f;
                if (i0Var != null) {
                    i0Var.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        super.onThemeColorsChanged();
        try {
            if (this.f18431n != null) {
                for (int i10 = 0; i10 < this.f18431n.getChildCount(); i10++) {
                    View childAt = this.f18431n.getChildAt(i10);
                    if ((childAt instanceof r8) && ((r8) childAt).f31811b == -1) {
                        if (this.f18432r) {
                            i7 = n6.f29489f6;
                        } else {
                            i7 = n6.f29470e6;
                        }
                        u6.h(i7, childAt, null);
                    }
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
