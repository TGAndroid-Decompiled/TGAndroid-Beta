package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ei.bc;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a71;
import w7.z5;
public final class f1 extends n2 {
    public final CharSequence f12898a;
    public final ArrayList f12899b;
    public final int f12900c;
    public final int d;
    public final int e;
    public bc f12901f;
    public hi.t h;
    public a71 f12902n;
    public boolean f12903r;

    public f1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f12898a = charSequence;
        this.f12899b = arrayList;
        this.f12900c = i10;
        this.d = i11;
        this.e = i12;
        this.f12903r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f12899b;
        if (arrayList.size() != 1 || ((c1) arrayList.get(0)).f12859a != 0 || ((c1) arrayList.get(0)).f12860b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f12899b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((c1) i0.a.h(1, arrayList)).f12860b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f12898a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20928a7, false));
        a71 a71Var = new a71(this, new hg.o(this, 9), new e1.c(this, 21), null);
        this.f12902n = a71Var;
        a71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f12902n);
        frameLayout.addView(this.f12902n, z5.d(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        hi.t tVar = this.h;
        if (tVar != null) {
            tVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f12903r) {
            ArrayList arrayList = this.f12899b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                bc bcVar = this.f12901f;
                if (bcVar != null) {
                    bcVar.run();
                }
            }
        }
    }
}
