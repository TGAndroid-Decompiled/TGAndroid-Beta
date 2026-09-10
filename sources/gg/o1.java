package gg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.wc;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.r61;
import w7.a6;
public final class o1 extends p2 {
    public final CharSequence f8981a;
    public final ArrayList f8982b;
    public final int f8983c;
    public final int d;
    public final int e;
    public wc f8984f;
    public fg.s1 h;
    public r61 f8985n;
    public boolean f8986r;

    public o1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f8981a = charSequence;
        this.f8982b = arrayList;
        this.f8983c = i10;
        this.d = i11;
        this.e = i12;
        this.f8986r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f8982b;
        if (arrayList.size() != 1 || ((l1) arrayList.get(0)).f8945a != 0 || ((l1) arrayList.get(0)).f8946b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f8982b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((l1) hc.b.i(1, arrayList)).f8946b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f8981a);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        r61 r61Var = new r61(this, new ai.c0(this, 28), new a1.c(this, 24), null);
        this.f8985n = r61Var;
        r61Var.o1();
        this.actionBar.setAdaptiveBackground(this.f8985n);
        frameLayout.addView(this.f8985n, a6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        fg.s1 s1Var = this.h;
        if (s1Var != null) {
            s1Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f8986r) {
            ArrayList arrayList = this.f8982b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                wc wcVar = this.f8984f;
                if (wcVar != null) {
                    wcVar.run();
                }
            }
        }
    }
}
