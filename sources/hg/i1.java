package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.rc;
import ei.c5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.p71;
import w7.w5;
public final class i1 extends m2 {
    public final CharSequence f11265a;
    public final ArrayList f11266b;
    public final int f11267c;
    public final int d;
    public final int f11268e;
    public rc f11269f;
    public gg.w1 h;
    public p71 f11270n;
    public boolean f11271r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f11265a = charSequence;
        this.f11266b = arrayList;
        this.f11267c = i10;
        this.d = i11;
        this.f11268e = i12;
        this.f11271r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f11266b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f11226a != 0 || ((f1) arrayList.get(0)).f11227b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f11266b;
        if (arrayList.size() >= this.f11268e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) c.h(1, arrayList)).f11227b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f11265a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20503a7, false));
        p71 p71Var = new p71(this, new bi.v(this, 28), new c5(this, 4), null);
        this.f11270n = p71Var;
        p71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11270n);
        frameLayout.addView(this.f11270n, w5.d(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        gg.w1 w1Var = this.h;
        if (w1Var != null) {
            w1Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f11271r) {
            ArrayList arrayList = this.f11266b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                rc rcVar = this.f11269f;
                if (rcVar != null) {
                    rcVar.run();
                }
            }
        }
    }
}
