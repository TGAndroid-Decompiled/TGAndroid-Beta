package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.q4;
import fi.h9;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
public final class e1 extends f2 {
    public final CharSequence f17355a;
    public final ArrayList f17356b;
    public final int f17357c;
    public final int d;
    public final int f17358e;
    public h9 f17359f;
    public ha.b h;
    public p41 f17360n;
    public boolean f17361r;

    public e1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f17355a = charSequence;
        this.f17356b = arrayList;
        this.f17357c = i7;
        this.d = i10;
        this.f17358e = i11;
        this.f17361r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f17356b;
        if (arrayList.size() != 1 || ((b1) arrayList.get(0)).f17313a != 0 || ((b1) arrayList.get(0)).f17314b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f17356b;
        if (arrayList.size() >= this.f17358e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((b1) jg.g.i(1, arrayList)).f17314b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f17355a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        p41 p41Var = new p41(this, new hi.u1(this, 12), new q4(this, 25), null);
        this.f17360n = p41Var;
        p41Var.r1();
        this.f17360n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17360n, ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17360n;
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
        if (!this.f17361r) {
            ArrayList arrayList = this.f17356b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                h9 h9Var = this.f17359f;
                if (h9Var != null) {
                    h9Var.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        super.onThemeColorsChanged();
        try {
            if (this.f17360n != null) {
                for (int i10 = 0; i10 < this.f17360n.getChildCount(); i10++) {
                    View childAt = this.f17360n.getChildAt(i10);
                    if ((childAt instanceof r8) && ((r8) childAt).f30203b == -1) {
                        if (this.f17361r) {
                            i7 = k6.f27886f6;
                        } else {
                            i7 = k6.f27867e6;
                        }
                        r6.i(i7, childAt, null);
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
