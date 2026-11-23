package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import di.v6;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
public final class h1 extends g2 {
    public final CharSequence f18330a;
    public final ArrayList f18331b;
    public final int f18332c;
    public final int d;
    public final int f18333e;
    public s0 f18334f;
    public i0 h;
    public h51 f18335n;
    public boolean f18336r;

    public h1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f18330a = charSequence;
        this.f18331b = arrayList;
        this.f18332c = i7;
        this.d = i10;
        this.f18333e = i11;
        this.f18336r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f18331b;
        if (arrayList.size() != 1 || ((e1) arrayList.get(0)).f18300a != 0 || ((e1) arrayList.get(0)).f18301b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f18331b;
        if (arrayList.size() >= this.f18333e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((e1) i5.c.h(1, arrayList)).f18301b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f18330a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        h51 h51Var = new h51(this, new e7(this, 14), new v6(this, 28), null);
        this.f18335n = h51Var;
        h51Var.r1();
        this.f18335n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18335n, na.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18335n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        i0 i0Var = this.h;
        if (i0Var != null) {
            i0Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f18336r) {
            ArrayList arrayList = this.f18331b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                s0 s0Var = this.f18334f;
                if (s0Var != null) {
                    s0Var.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        super.onThemeColorsChanged();
        try {
            if (this.f18335n != null) {
                for (int i10 = 0; i10 < this.f18335n.getChildCount(); i10++) {
                    View childAt = this.f18335n.getChildAt(i10);
                    if ((childAt instanceof s8) && ((s8) childAt).f31778b == -1) {
                        if (this.f18336r) {
                            i7 = m6.f29385f6;
                        } else {
                            i7 = m6.f29366e6;
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
