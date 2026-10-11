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
import org.telegram.ui.Components.l71;
import w7.x5;
public final class i1 extends m2 {
    public final CharSequence f11266a;
    public final ArrayList f11267b;
    public final int f11268c;
    public final int d;
    public final int f11269e;
    public rc f11270f;
    public gg.w1 h;
    public l71 f11271n;
    public boolean f11272r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f11266a = charSequence;
        this.f11267b = arrayList;
        this.f11268c = i10;
        this.d = i11;
        this.f11269e = i12;
        this.f11272r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f11267b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f11227a != 0 || ((f1) arrayList.get(0)).f11228b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f11267b;
        if (arrayList.size() >= this.f11269e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) c.g(1, arrayList)).f11228b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f11266a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20766a7, false));
        l71 l71Var = new l71(this, new bi.v(this, 28), new c5(this, 4), null);
        this.f11271n = l71Var;
        l71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11271n);
        frameLayout.addView(this.f11271n, x5.d(-1.0f, -1));
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
        if (!this.f11272r) {
            ArrayList arrayList = this.f11267b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                rc rcVar = this.f11270f;
                if (rcVar != null) {
                    rcVar.run();
                }
            }
        }
    }
}
