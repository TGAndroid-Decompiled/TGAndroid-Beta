package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.r4;
import fi.v9;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
public final class e1 extends f2 {
    public final CharSequence f17358a;
    public final ArrayList f17359b;
    public final int f17360c;
    public final int d;
    public final int f17361e;
    public v9 f17362f;
    public ha.b h;
    public r41 f17363n;
    public boolean f17364r;

    public e1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f17358a = charSequence;
        this.f17359b = arrayList;
        this.f17360c = i7;
        this.d = i10;
        this.f17361e = i11;
        this.f17364r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f17359b;
        if (arrayList.size() != 1 || ((b1) arrayList.get(0)).f17316a != 0 || ((b1) arrayList.get(0)).f17317b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f17359b;
        if (arrayList.size() >= this.f17361e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((b1) jg.g.i(1, arrayList)).f17317b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f17358a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        r41 r41Var = new r41(this, new hi.u1(this, 12), new r4(this, 25), null);
        this.f17363n = r41Var;
        r41Var.r1();
        this.f17363n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17363n, ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final qj0 getListViewForSimpleGlass() {
        return this.f17363n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ha.b bVar = this.h;
        if (bVar != null) {
            bVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f17364r) {
            ArrayList arrayList = this.f17359b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                v9 v9Var = this.f17362f;
                if (v9Var != null) {
                    v9Var.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        super.onThemeColorsChanged();
        try {
            if (this.f17363n != null) {
                for (int i10 = 0; i10 < this.f17363n.getChildCount(); i10++) {
                    View childAt = this.f17363n.getChildAt(i10);
                    if ((childAt instanceof r8) && ((r8) childAt).f30212b == -1) {
                        if (this.f17364r) {
                            i7 = l6.f27903f6;
                        } else {
                            i7 = l6.f27884e6;
                        }
                        s6.h(i7, childAt, null);
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
