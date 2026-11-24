package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class us7 extends d {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public kl7 f;
    public bl7 h;
    public q7c n;
    public boolean r;

    public us7(CharSequence charSequence, ArrayList arrayList, int i, int i2, int i3) {
        super(null);
        this.a = charSequence;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.r = !arrayList.isEmpty();
    }

    public final boolean Z() {
        ArrayList arrayList = this.b;
        if (arrayList.size() != 1 || ((rs7) arrayList.get(0)).a != 0 || ((rs7) arrayList.get(0)).b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean a0() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Z() && ((rs7) b10.f(1, arrayList)).b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 15));
        FrameLayout frameLayout = new FrameLayout(context);
        q7c q7cVar = new q7c(this, new vt4(this, (byte) 24), new cj6(this, (byte) 22), null);
        this.n = q7cVar;
        q7cVar.r1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, qoe.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        bl7 bl7Var = this.h;
        if (bl7Var != null) {
            bl7Var.run();
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
                kl7 kl7Var = this.f;
                if (kl7Var != null) {
                    kl7Var.run();
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
                    if ((childAt instanceof bjb) && ((bjb) childAt).b == -1) {
                        if (this.r) {
                            i = cmb.e6;
                        } else {
                            i = cmb.d6;
                        }
                        anb.h(i, null, childAt);
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
