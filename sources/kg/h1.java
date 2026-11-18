package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import di.c7;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
public final class h1 extends h2 {
    public final CharSequence f18331a;
    public final ArrayList f18332b;
    public final int f18333c;
    public final int d;
    public final int f18334e;
    public j0 f18335f;
    public h0 h;
    public e51 f18336n;
    public boolean f18337r;

    public h1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f18331a = charSequence;
        this.f18332b = arrayList;
        this.f18333c = i7;
        this.d = i10;
        this.f18334e = i11;
        this.f18337r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f18332b;
        if (arrayList.size() != 1 || ((e1) arrayList.get(0)).f18301a != 0 || ((e1) arrayList.get(0)).f18302b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f18332b;
        if (arrayList.size() >= this.f18334e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((e1) i5.c.h(1, arrayList)).f18302b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f18331a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        e51 e51Var = new e51(this, new e7(this, 14), new c7(this, 27), null);
        this.f18336n = e51Var;
        e51Var.r1();
        this.f18336n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18336n, ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f18336n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        h0 h0Var = this.h;
        if (h0Var != null) {
            h0Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f18337r) {
            ArrayList arrayList = this.f18332b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                j0 j0Var = this.f18335f;
                if (j0Var != null) {
                    j0Var.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        super.onThemeColorsChanged();
        try {
            if (this.f18336n != null) {
                for (int i10 = 0; i10 < this.f18336n.getChildCount(); i10++) {
                    View childAt = this.f18336n.getChildAt(i10);
                    if ((childAt instanceof s8) && ((s8) childAt).f31781b == -1) {
                        if (this.f18337r) {
                            i7 = n6.f29432f6;
                        } else {
                            i7 = n6.f29413e6;
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
