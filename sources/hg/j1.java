package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.rc;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.r61;
import w7.y5;
public final class j1 extends m2 {
    public final CharSequence f10301a;
    public final ArrayList f10302b;
    public final int f10303c;
    public final int d;
    public final int e;
    public rc f10304f;
    public gg.x1 h;
    public r61 f10305n;
    public boolean f10306r;

    public j1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f10301a = charSequence;
        this.f10302b = arrayList;
        this.f10303c = i10;
        this.d = i11;
        this.e = i12;
        this.f10306r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f10302b;
        if (arrayList.size() != 1 || ((g1) arrayList.get(0)).f10277a != 0 || ((g1) arrayList.get(0)).f10278b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f10302b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((g1) c.g(1, arrayList)).f10278b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f10301a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f19003a7, false));
        r61 r61Var = new r61(this, new bi.v(this, 28), new d5(this, 4), null);
        this.f10305n = r61Var;
        r61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f10305n);
        frameLayout.addView(this.f10305n, y5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
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
        if (!this.f10306r) {
            ArrayList arrayList = this.f10302b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                rc rcVar = this.f10304f;
                if (rcVar != null) {
                    rcVar.run();
                }
            }
        }
    }
}
