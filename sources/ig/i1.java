package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.q3;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.i71;
import w7.z5;
public final class i1 extends m2 {
    public final CharSequence f11533a;
    public final ArrayList f11534b;
    public final int f11535c;
    public final int d;
    public final int e;
    public t0 f11536f;
    public q3 h;
    public i71 f11537n;
    public boolean f11538r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f11533a = charSequence;
        this.f11534b = arrayList;
        this.f11535c = i10;
        this.d = i11;
        this.e = i12;
        this.f11538r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f11534b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f11506a != 0 || ((f1) arrayList.get(0)).f11507b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f11534b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) i2.d.h(1, arrayList)).f11507b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f11533a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19543a7, false));
        i71 i71Var = new i71(this, new ci.u(this, 28), new f1.a(this, 12), null);
        this.f11537n = i71Var;
        i71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11537n);
        frameLayout.addView(this.f11537n, z5.d(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        q3 q3Var = this.h;
        if (q3Var != null) {
            q3Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f11538r) {
            ArrayList arrayList = this.f11534b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                t0 t0Var = this.f11536f;
                if (t0Var != null) {
                    t0Var.run();
                }
            }
        }
    }
}
