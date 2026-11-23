package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import di.v6;
import hi.d7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
public final class g1 extends g2 {
    public final CharSequence f18354a;
    public final ArrayList f18355b;
    public final int f18356c;
    public final int d;
    public final int f18357e;
    public i0 f18358f;
    public ji.i h;
    public h51 f18359n;
    public boolean f18360r;

    public g1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f18354a = charSequence;
        this.f18355b = arrayList;
        this.f18356c = i7;
        this.d = i10;
        this.f18357e = i11;
        this.f18360r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f18355b;
        if (arrayList.size() != 1 || ((d1) arrayList.get(0)).f18317a != 0 || ((d1) arrayList.get(0)).f18318b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f18355b;
        if (arrayList.size() >= this.f18357e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((d1) i5.c.h(1, arrayList)).f18318b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f18354a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        h51 h51Var = new h51(this, new d7(this, 14), new v6(this, 28), null);
        this.f18359n = h51Var;
        h51Var.r1();
        this.f18359n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18359n, ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18359n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ji.i iVar = this.h;
        if (iVar != null) {
            iVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f18360r) {
            ArrayList arrayList = this.f18355b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                i0 i0Var = this.f18358f;
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
            if (this.f18359n != null) {
                for (int i10 = 0; i10 < this.f18359n.getChildCount(); i10++) {
                    View childAt = this.f18359n.getChildAt(i10);
                    if ((childAt instanceof s8) && ((s8) childAt).f31812b == -1) {
                        if (this.f18360r) {
                            i7 = m6.f29419f6;
                        } else {
                            i7 = m6.f29400e6;
                        }
                        t6.h(i7, childAt, null);
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
