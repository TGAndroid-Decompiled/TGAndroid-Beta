package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import w7.b6;
public final class j2 extends org.telegram.ui.ActionBar.k2 {
    public final CharSequence f586a;
    public final ArrayList f587b;
    public final int f588c;
    public final int d;
    public final int e;
    public a3.d f589f;
    public a1.f h;
    public u51 f590n;
    public boolean f591r;

    public j2(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f586a = charSequence;
        this.f587b = arrayList;
        this.f588c = i10;
        this.d = i11;
        this.e = i12;
        this.f591r = !arrayList.isEmpty();
    }

    public final boolean Y() {
        ArrayList arrayList = this.f587b;
        if (arrayList.size() != 1 || ((g2) arrayList.get(0)).f532a != 0 || ((g2) arrayList.get(0)).f533b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean Z() {
        ArrayList arrayList = this.f587b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !Y() && ((g2) i0.a.g(1, arrayList)).f533b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(this.f586a);
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 6));
        FrameLayout frameLayout = new FrameLayout(context);
        u51 u51Var = new u51(this, new a(this, 7), new a1.c(this, 3), null);
        this.f590n = u51Var;
        u51Var.r1();
        this.f590n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f590n, b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f590n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        a1.f fVar = this.h;
        if (fVar != null) {
            fVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f591r) {
            ArrayList arrayList = this.f587b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                a3.d dVar = this.f589f;
                if (dVar != null) {
                    dVar.run();
                }
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        super.onThemeColorsChanged();
        try {
            if (this.f590n != null) {
                for (int i11 = 0; i11 < this.f590n.getChildCount(); i11++) {
                    View childAt = this.f590n.getChildAt(i11);
                    if ((childAt instanceof t8) && ((t8) childAt).f23100b == -1) {
                        if (this.f591r) {
                            i10 = t6.f20966f6;
                        } else {
                            i10 = t6.f20948e6;
                        }
                        a7.i(i10, childAt, null);
                    }
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
