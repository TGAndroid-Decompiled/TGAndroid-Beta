package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ei.bc;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b71;
import w7.z5;
public final class h1 extends n2 {
    public final CharSequence f12911a;
    public final ArrayList f12912b;
    public final int f12913c;
    public final int d;
    public final int e;
    public bc f12914f;
    public hi.t h;
    public b71 f12915n;
    public boolean f12916r;

    public h1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f12911a = charSequence;
        this.f12912b = arrayList;
        this.f12913c = i10;
        this.d = i11;
        this.e = i12;
        this.f12916r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f12912b;
        if (arrayList.size() != 1 || ((e1) arrayList.get(0)).f12879a != 0 || ((e1) arrayList.get(0)).f12880b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f12912b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((e1) i2.e.h(1, arrayList)).f12880b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f12911a);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20931a7, false));
        b71 b71Var = new b71(this, new hg.o(this, 9), new e1.c(this, 21), null);
        this.f12915n = b71Var;
        b71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f12915n);
        frameLayout.addView(this.f12915n, z5.c(-1.0f, -1));
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
        if (!this.f12916r) {
            ArrayList arrayList = this.f12912b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                bc bcVar = this.f12914f;
                if (bcVar != null) {
                    bcVar.run();
                }
            }
        }
    }
}
