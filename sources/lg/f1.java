package lg;

import ai.g5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.q4;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.tj0;
public final class f1 extends d2 {
    public final CharSequence f18298a;
    public final ArrayList f18299b;
    public final int f18300c;
    public final int d;
    public final int f18301e;
    public n f18302f;
    public ii.e h;
    public l41 f18303n;
    public boolean f18304r;

    public f1(CharSequence charSequence, ArrayList arrayList, int i3, int i10, int i11) {
        super(null);
        this.f18298a = charSequence;
        this.f18299b = arrayList;
        this.f18300c = i3;
        this.d = i10;
        this.f18301e = i11;
        this.f18304r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f18299b;
        if (arrayList.size() != 1 || ((c1) arrayList.get(0)).f18261a != 0 || ((c1) arrayList.get(0)).f18262b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f18299b;
        if (arrayList.size() >= this.f18301e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((c1) k2.p1.h(1, arrayList)).f18262b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f18298a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 18));
        FrameLayout frameLayout = new FrameLayout(context);
        l41 l41Var = new l41(this, new q4(this, 22), new l5.b(this, 2), null);
        this.f18303n = l41Var;
        l41Var.r1();
        this.f18303n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18303n, mf.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f18303n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ii.e eVar = this.h;
        if (eVar != null) {
            eVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f18304r) {
            ArrayList arrayList = this.f18299b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                n nVar = this.f18302f;
                if (nVar != null) {
                    nVar.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i3;
        super.onThemeColorsChanged();
        try {
            if (this.f18303n != null) {
                for (int i10 = 0; i10 < this.f18303n.getChildCount(); i10++) {
                    View childAt = this.f18303n.getChildAt(i10);
                    if ((childAt instanceof q8) && ((q8) childAt).f30232b == -1) {
                        if (this.f18304r) {
                            i3 = k6.f27917f6;
                        } else {
                            i3 = k6.f27898e6;
                        }
                        r6.i(i3, childAt, null);
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
