package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class sq7 extends d {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public oq7 f;
    public bj7 h;
    public q5c n;
    public boolean r;

    public sq7(CharSequence charSequence, ArrayList arrayList, int i, int i2, int i3) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.r = !arrayList.isEmpty();
    }

    public final boolean Y() {
        ArrayList arrayList = this.b;
        if (arrayList.size() != 1 || ((pq7) arrayList.get(0)).a != 0 || ((pq7) arrayList.get(0)).b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean Z() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Y() && ((pq7) b00.f(1, arrayList)).b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 14));
        FrameLayout frameLayout = new FrameLayout(context);
        q5c q5cVar = new q5c(this, new ur4(this, (byte) 24), new im6(this, (byte) 19), null);
        this.n = q5cVar;
        q5cVar.r1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, nme.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        bj7 bj7Var = this.h;
        if (bj7Var != null) {
            bj7Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.r) {
            ArrayList arrayList = this.b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                oq7 oq7Var = this.f;
                if (oq7Var != null) {
                    oq7Var.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i;
        super.onThemeColorsChanged();
        try {
            if (this.n != null) {
                for (int i2 = 0; i2 < this.n.getChildCount(); i2++) {
                    View childAt = this.n.getChildAt(i2);
                    if ((childAt instanceof ahb) && ((ahb) childAt).b == -1) {
                        if (this.r) {
                            i = bkb.e6;
                        } else {
                            i = bkb.d6;
                        }
                        zkb.h(i, null, childAt);
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
