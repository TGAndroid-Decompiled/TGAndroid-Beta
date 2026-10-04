package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.qc;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class i1 extends n2 {
    public final CharSequence f11215a;
    public final ArrayList f11216b;
    public final int f11217c;
    public final int d;
    public final int f11218e;
    public qc f11219f;
    public gg.x1 h;
    public c71 f11220n;
    public boolean f11221r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f11215a = charSequence;
        this.f11216b = arrayList;
        this.f11217c = i10;
        this.d = i11;
        this.f11218e = i12;
        this.f11221r = !arrayList.isEmpty();
    }

    public final boolean S() {
        ArrayList arrayList = this.f11216b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f11182a != 0 || ((f1) arrayList.get(0)).f11183b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean T() {
        ArrayList arrayList = this.f11216b;
        if (arrayList.size() >= this.f11218e) {
            return false;
        }
        if (!arrayList.isEmpty() && !S() && ((f1) c.g(1, arrayList)).f11183b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f11215a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        c71 c71Var = new c71(this, new bi.v(this, 28), new ei.f(this, 5), null);
        this.f11220n = c71Var;
        c71Var.s1();
        this.f11220n.setSectionsDrawBackground(true);
        frameLayout.addView(this.f11220n, z5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.f11220n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        gg.x1 x1Var = this.h;
        if (x1Var != null) {
            x1Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f11221r) {
            ArrayList arrayList = this.f11216b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                qc qcVar = this.f11219f;
                if (qcVar != null) {
                    qcVar.run();
                }
            }
        }
    }
}
