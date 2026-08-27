package gh;

import android.view.View;
import android.widget.FrameLayout;
import hh.m7;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class y3 extends qa implements NotificationCenter.NotificationCenterDelegate {
    public final int T;
    public final m7 U;
    public final HashSet V;
    public final bz W;
    public final lh.d X;
    public b70 Y;
    public b51 Z;

    public y3(org.telegram.ui.ActionBar.n2 n2Var, long j10, int i10, q2 q2Var) {
        super(n2Var);
        this.V = new HashSet();
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        K();
        this.T = i10;
        this.U = new m7(this.currentAccount, j10, true);
        this.f31853e.setActionBarMenuOnItemClick(new v3(this, this.f31853e.n().a(1, R.drawable.ic_ab_other), j10));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, h7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.resourcesProvider));
        frameLayout.addView(view, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        lh.d dVar = new lh.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ag.q0(9, this, q2Var));
        frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        bz bzVar = new bz(3, false);
        this.W = bzVar;
        bzVar.O = new w3(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(bzVar);
        this.d.setOnItemClickListener(new ag.p0(this, 4));
        this.d.j(new x3(this));
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.Z.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public final boolean S() {
        zk0 zk0Var = this.d;
        if (zk0Var != null && zk0Var.C) {
            for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
                if (zk0Var.getChildAt(i10) instanceof h00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b51 b51Var;
        if (i10 != NotificationCenter.starUserGiftsLoaded || (b51Var = this.Z) == null) {
            return;
        }
        b51Var.N(true);
        if (S()) {
            this.U.a();
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, false, new ch.c(this, 10), this.resourcesProvider);
        this.Z = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
