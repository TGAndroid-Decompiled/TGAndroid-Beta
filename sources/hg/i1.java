package hg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ci.uc;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.vl0;
import w7.y5;
public final class i1 extends n2 {
    public final CharSequence f10317a;
    public final ArrayList f10318b;
    public final int f10319c;
    public final int d;
    public final int e;
    public uc f10320f;
    public gg.x1 h;
    public s61 f10321n;
    public boolean f10322r;

    public i1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f10317a = charSequence;
        this.f10318b = arrayList;
        this.f10319c = i10;
        this.d = i11;
        this.e = i12;
        this.f10322r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f10318b;
        if (arrayList.size() != 1 || ((f1) arrayList.get(0)).f10290a != 0 || ((f1) arrayList.get(0)).f10291b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f10318b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((f1) k0.g(1, arrayList)).f10291b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f10317a);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19038a7, false));
        s61 s61Var = new s61(this, new bi.v(this, 28), new d5(this, 4), null);
        this.f10321n = s61Var;
        s61Var.q1();
        frameLayout.addView(this.f10321n, y5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final vl0 getListViewForSimpleGlass() {
        return this.f10321n;
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
        if (!this.f10322r) {
            ArrayList arrayList = this.f10318b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                uc ucVar = this.f10320f;
                if (ucVar != null) {
                    ucVar.run();
                }
            }
        }
    }
}
