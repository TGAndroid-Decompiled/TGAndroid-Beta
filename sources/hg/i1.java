package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.uc;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ml0;
import w7.x5;
public final class i1 extends o2 {
    public final CharSequence f10316a;
    public final ArrayList f10317b;
    public final int f10318c;
    public final int d;
    public final int e;
    public uc f10319f;
    public gg.x1 h;
    public f61 f10320n;
    public boolean f10321r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f10316a = charSequence;
        this.f10317b = arrayList;
        this.f10318c = i10;
        this.d = i11;
        this.e = i12;
        this.f10321r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f10317b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f10289a != 0 || ((f1) arrayList.get(0)).f10290b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f10317b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) k0.h(1, arrayList)).f10290b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f10316a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f18807a7, false));
        f61 f61Var = new f61(this, new bi.v(this, 28), new d5(this, 4), null);
        this.f10320n = f61Var;
        f61Var.q1();
        frameLayout.addView(this.f10320n, x5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final ml0 getListViewForSimpleGlass() {
        return this.f10320n;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
        if (!this.f10321r) {
            ArrayList arrayList = this.f10317b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                uc ucVar = this.f10319f;
                if (ucVar != null) {
                    ucVar.run();
                }
            }
        }
    }
}
