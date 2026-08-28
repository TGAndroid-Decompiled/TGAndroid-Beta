package fh;

import android.view.View;
import android.widget.FrameLayout;
import gh.n7;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zy;
public final class d4 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final int T;
    public final n7 U;
    public final HashSet V;
    public final zy W;
    public final kh.d X;
    public x60 Y;
    public z41 Z;

    public d4(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i9, v2 v2Var) {
        super(o2Var);
        this.V = new HashSet();
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        this.T = i9;
        this.U = new n7(this.currentAccount, j10, true);
        this.f32408e.setActionBarMenuOnItemClick(new a4(this, this.f32408e.n().a(1, R.drawable.ic_ab_other), j10));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, this.resourcesProvider));
        int i10 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i10, 0, i10, 0);
        this.containerView.addView(frameLayout, g7.e6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.resourcesProvider));
        frameLayout.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        kh.d dVar = new kh.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new bg.u1(8, this, v2Var));
        frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        zy zyVar = new zy(3, false);
        this.W = zyVar;
        zyVar.O = new b4(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(zyVar);
        this.d.setOnItemClickListener(new eh.j(this, 2));
        this.d.j(new c4(this));
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        this.Z.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public final boolean R() {
        wk0 wk0Var = this.d;
        if (wk0Var != null && wk0Var.C) {
            for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
                if (wk0Var.getChildAt(i9) instanceof e00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 == NotificationCenter.starUserGiftsLoaded && (z41Var = this.Z) != null) {
            z41Var.N(true);
            if (R()) {
                this.U.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, false, new bh.c(this, 10), this.resourcesProvider);
        this.Z = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
