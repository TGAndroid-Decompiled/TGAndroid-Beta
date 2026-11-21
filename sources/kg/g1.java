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
    public final CharSequence f18351a;
    public final ArrayList f18352b;
    public final int f18353c;
    public final int d;
    public final int f18354e;
    public i0 f18355f;
    public ji.i h;
    public h51 f18356n;
    public boolean f18357r;

    public g1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f18351a = charSequence;
        this.f18352b = arrayList;
        this.f18353c = i7;
        this.d = i10;
        this.f18354e = i11;
        this.f18357r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f18352b;
        if (arrayList.size() != 1 || ((d1) arrayList.get(0)).f18314a != 0 || ((d1) arrayList.get(0)).f18315b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f18352b;
        if (arrayList.size() >= this.f18354e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((d1) i5.c.h(1, arrayList)).f18315b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f18351a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        h51 h51Var = new h51(this, new d7(this, 14), new v6(this, 28), null);
        this.f18356n = h51Var;
        h51Var.r1();
        this.f18356n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18356n, ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18356n;
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
        if (!this.f18357r) {
            ArrayList arrayList = this.f18352b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                i0 i0Var = this.f18355f;
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
            if (this.f18356n != null) {
                for (int i10 = 0; i10 < this.f18356n.getChildCount(); i10++) {
                    View childAt = this.f18356n.getChildAt(i10);
                    if ((childAt instanceof s8) && ((s8) childAt).f31809b == -1) {
                        if (this.f18357r) {
                            i7 = m6.f29416f6;
                        } else {
                            i7 = m6.f29397e6;
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
