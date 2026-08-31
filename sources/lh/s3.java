package lh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import mh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.x51;
public final class s3 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final int U;
    public final l7 V;
    public final HashSet W;
    public final pz X;
    public final qh.d Y;
    public q70 Z;
    public x51 f12962a0;

    public s3(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10, eg.h3 h3Var) {
        super(p2Var);
        this.W = new HashSet();
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        this.U = i10;
        this.V = new l7(this.currentAccount, j10, true);
        this.f31015e.setActionBarMenuOnItemClick(new p3(this, this.f31015e.n().a(1, R.drawable.ic_ab_other), j10));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(k6.v0(k6.f21731h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, k7.c6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(k6.v0(k6.f21660d7, this.resourcesProvider));
        frameLayout.addView(view, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        qh.d dVar = new qh.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new dg.n(12, this, h3Var));
        frameLayout.addView(dVar, k7.c6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        pz pzVar = new pz(3, false);
        this.X = pzVar;
        pzVar.O = new q3(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(pzVar);
        this.d.setOnItemClickListener(new ag.h(this, 7));
        this.d.j(new r3(this));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(pr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f12962a0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public final boolean S() {
        tl0 tl0Var = this.d;
        if (tl0Var != null && tl0Var.D) {
            for (int i10 = 0; i10 < tl0Var.getChildCount(); i10++) {
                if (tl0Var.getChildAt(i10) instanceof u00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (x51Var = this.f12962a0) != null) {
            x51Var.N(true);
            if (S()) {
                this.V.a();
            }
        }
    }

    @Override
    public final void dismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        super.dismiss();
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, false, new eg.p1(this, 11), this.resourcesProvider);
        this.f12962a0 = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
