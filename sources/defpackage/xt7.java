package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class xt7 extends e {
    public final CharSequence a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public ge7 f;
    public ql7 h;
    public q9c n;
    public boolean r;

    public xt7(CharSequence charSequence, ArrayList arrayList, int i, int i2, int i3) {
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
        if (arrayList.size() != 1 || ((ut7) arrayList.get(0)).a != 0 || ((ut7) arrayList.get(0)).b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean Z() {
        ArrayList arrayList = this.b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Y() && ((ut7) c00.g(1, arrayList)).b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(this.a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 16));
        FrameLayout frameLayout = new FrameLayout(context);
        q9c q9cVar = new q9c(this, new yt4(this, (byte) 24), new bm6(this, (byte) 24), null);
        this.n = q9cVar;
        q9cVar.s1();
        this.n.setSectionsDrawBackground(true);
        frameLayout.addView(this.n, tre.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ql7 ql7Var = this.h;
        if (ql7Var != null) {
            ql7Var.run();
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
                ge7 ge7Var = this.f;
                if (ge7Var != null) {
                    ge7Var.run();
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
                    if ((childAt instanceof wkb) && ((wkb) childAt).b == -1) {
                        if (this.r) {
                            i = aob.f6;
                        } else {
                            i = aob.e6;
                        }
                        yob.h(i, null, childAt);
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
