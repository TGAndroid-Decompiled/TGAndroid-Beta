package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.uc;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e61;
import w7.x5;
public final class j1 extends n2 {
    public final CharSequence f10315a;
    public final ArrayList f10316b;
    public final int f10317c;
    public final int d;
    public final int e;
    public uc f10318f;
    public gg.x1 h;
    public e61 f10319n;
    public boolean f10320r;

    public j1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f10315a = charSequence;
        this.f10316b = arrayList;
        this.f10317c = i10;
        this.d = i11;
        this.e = i12;
        this.f10320r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f10316b;
        if (arrayList.size() != 1 || ((g1) arrayList.get(0)).f10291a != 0 || ((g1) arrayList.get(0)).f10292b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f10316b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((g1) c.h(1, arrayList)).f10292b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f10315a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.f18778a7, false));
        e61 e61Var = new e61(this, new bi.v(this, 28), new d5(this, 4), null);
        this.f10319n = e61Var;
        e61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f10319n);
        frameLayout.addView(this.f10319n, x5.c(-1.0f, -1));
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
        if (!this.f10320r) {
            ArrayList arrayList = this.f10316b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                uc ucVar = this.f10318f;
                if (ucVar != null) {
                    ucVar.run();
                }
            }
        }
    }
}
