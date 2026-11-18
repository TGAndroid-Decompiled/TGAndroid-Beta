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
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
public final class h1 extends h2 {
    public final CharSequence f18334a;
    public final ArrayList f18335b;
    public final int f18336c;
    public final int d;
    public final int f18337e;
    public j0 f18338f;
    public h0 h;
    public e51 f18339n;
    public boolean f18340r;

    public h1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f18334a = charSequence;
        this.f18335b = arrayList;
        this.f18336c = i7;
        this.d = i10;
        this.f18337e = i11;
        this.f18340r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f18335b;
        if (arrayList.size() != 1 || ((e1) arrayList.get(0)).f18304a != 0 || ((e1) arrayList.get(0)).f18305b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f18335b;
        if (arrayList.size() >= this.f18337e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((e1) i5.c.h(1, arrayList)).f18305b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f18334a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        e51 e51Var = new e51(this, new e7(this, 14), new c7(this, 27), null);
        this.f18339n = e51Var;
        e51Var.r1();
        this.f18339n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18339n, ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f18339n;
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
        if (!this.f18340r) {
            ArrayList arrayList = this.f18335b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                j0 j0Var = this.f18338f;
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
            if (this.f18339n != null) {
                for (int i10 = 0; i10 < this.f18339n.getChildCount(); i10++) {
                    View childAt = this.f18339n.getChildAt(i10);
                    if ((childAt instanceof r8) && ((r8) childAt).f31728b == -1) {
                        if (this.f18340r) {
                            i7 = n6.f29434f6;
                        } else {
                            i7 = n6.f29415e6;
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
