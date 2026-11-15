package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import di.z6;
import hi.h4;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class e1 extends e2 {
    public final CharSequence f17917a;
    public final ArrayList f17918b;
    public final int f17919c;
    public final int d;
    public final int f17920e;
    public hi.e1 f17921f;
    public h4 h;
    public u41 f17922n;
    public boolean f17923r;

    public e1(CharSequence charSequence, ArrayList arrayList, int i7, int i10, int i11) {
        super(null);
        this.f17917a = charSequence;
        this.f17918b = arrayList;
        this.f17919c = i7;
        this.d = i10;
        this.f17920e = i11;
        this.f17923r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.f17918b;
        if (arrayList.size() != 1 || ((b1) arrayList.get(0)).f17875a != 0 || ((b1) arrayList.get(0)).f17876b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.f17918b;
        if (arrayList.size() >= this.f17920e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((b1) i5.c.h(1, arrayList)).f17876b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(this.f17917a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 10));
        FrameLayout frameLayout = new FrameLayout(context);
        u41 u41Var = new u41(this, new q4(this, 14), new z6(this, 26), null);
        this.f17922n = u41Var;
        u41Var.r1();
        this.f17922n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17922n, ja.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f17922n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        h4 h4Var = this.h;
        if (h4Var != null) {
            h4Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f17923r) {
            ArrayList arrayList = this.f17918b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                hi.e1 e1Var = this.f17921f;
                if (e1Var != null) {
                    e1Var.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        super.onThemeColorsChanged();
        try {
            if (this.f17922n != null) {
                for (int i10 = 0; i10 < this.f17922n.getChildCount(); i10++) {
                    View childAt = this.f17922n.getChildAt(i10);
                    if ((childAt instanceof q8) && ((q8) childAt).f31308b == -1) {
                        if (this.f17923r) {
                            i7 = j6.f28887f6;
                        } else {
                            i7 = j6.f28868e6;
                        }
                        q6.h(i7, childAt, null);
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
