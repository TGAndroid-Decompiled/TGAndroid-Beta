package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import fi.q3;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h71;
import w7.a6;
public final class i1 extends m2 {
    public final CharSequence f11529a;
    public final ArrayList f11530b;
    public final int f11531c;
    public final int d;
    public final int e;
    public t0 f11532f;
    public q3 h;
    public h71 f11533n;
    public boolean f11534r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f11529a = charSequence;
        this.f11530b = arrayList;
        this.f11531c = i10;
        this.d = i11;
        this.e = i12;
        this.f11534r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f11530b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f11502a != 0 || ((f1) arrayList.get(0)).f11503b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f11530b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) i2.d.g(1, arrayList)).f11503b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f11529a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        h71 h71Var = new h71(this, new ci.u(this, 28), new f1.a(this, 12), null);
        this.f11533n = h71Var;
        h71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11533n);
        frameLayout.addView(this.f11533n, a6.d(-1.0f, -1));
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
        if (!this.f11534r) {
            ArrayList arrayList = this.f11530b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                t0 t0Var = this.f11532f;
                if (t0Var != null) {
                    t0Var.run();
                }
            }
        }
    }
}
