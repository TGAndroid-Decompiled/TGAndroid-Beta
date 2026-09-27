package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.qc;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.yl0;
import w7.y5;
public final class i1 extends o2 {
    public final CharSequence f10304a;
    public final ArrayList f10305b;
    public final int f10306c;
    public final int d;
    public final int e;
    public qc f10307f;
    public gg.x1 h;
    public t61 f10308n;
    public boolean f10309r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f10304a = charSequence;
        this.f10305b = arrayList;
        this.f10306c = i10;
        this.d = i11;
        this.e = i12;
        this.f10309r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f10305b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f10277a != 0 || ((f1) arrayList.get(0)).f10278b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f10305b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) k0.g(1, arrayList)).f10278b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f10304a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.f19001a7, false));
        t61 t61Var = new t61(this, new bi.v(this, 28), new d5(this, 4), null);
        this.f10308n = t61Var;
        t61Var.q1();
        frameLayout.addView(this.f10308n, y5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final yl0 getListViewForSimpleGlass() {
        return this.f10308n;
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
        if (!this.f10309r) {
            ArrayList arrayList = this.f10305b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                qc qcVar = this.f10307f;
                if (qcVar != null) {
                    qcVar.run();
                }
            }
        }
    }
}
