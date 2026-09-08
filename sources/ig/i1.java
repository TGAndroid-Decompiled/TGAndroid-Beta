package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.j4;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import w7.x5;
public final class i1 extends n2 {
    public final CharSequence f12123a;
    public final ArrayList f12124b;
    public final int f12125c;
    public final int d;
    public final int f12126e;
    public t0 f12127f;
    public j4 h;
    public d61 f12128n;
    public boolean f12129r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f12123a = charSequence;
        this.f12124b = arrayList;
        this.f12125c = i10;
        this.d = i11;
        this.f12126e = i12;
        this.f12129r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f12124b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f12093a != 0 || ((f1) arrayList.get(0)).f12094b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f12124b;
        if (arrayList.size() >= this.f12126e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) i2.g.h(1, arrayList)).f12094b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f12123a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f20634a7, false));
        d61 d61Var = new d61(this, new ci.u(this, 28), new fi.f(this, 12), null);
        this.f12128n = d61Var;
        d61Var.o1();
        this.actionBar.setAdaptiveBackground(this.f12128n);
        frameLayout.addView(this.f12128n, x5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        j4 j4Var = this.h;
        if (j4Var != null) {
            j4Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f12129r) {
            ArrayList arrayList = this.f12124b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                t0 t0Var = this.f12127f;
                if (t0Var != null) {
                    t0Var.run();
                }
            }
        }
    }
}
