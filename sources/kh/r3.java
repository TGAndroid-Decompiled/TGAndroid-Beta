package kh;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import lh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w51;
public final class r3 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final int U;
    public final l7 V;
    public final HashSet W;
    public final nz X;
    public final ph.d Y;
    public p70 Z;
    public w51 f10894a0;

    public r3(org.telegram.ui.ActionBar.p2 p2Var, long j10, int i10, dg.j3 j3Var) {
        super(p2Var);
        this.W = new HashSet();
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        this.U = i10;
        this.V = new l7(this.currentAccount, j10, true);
        this.e.setActionBarMenuOnItemClick(new o3(this, this.e.n().a(1, R.drawable.ic_ab_other), j10));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(j6.v0(j6.f19952h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, k7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(j6.v0(j6.f19882d7, this.resourcesProvider));
        frameLayout.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ph.d dVar = new ph.d(getContext(), this.resourcesProvider, true);
        this.Y = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new cg.n(12, this, j3Var));
        frameLayout.addView(dVar, k7.b6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        nz nzVar = new nz(3, false);
        this.X = nzVar;
        nzVar.O = new p3(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(nzVar);
        this.d.setOnItemClickListener(new dg.n(this, 6));
        this.d.j(new q3(this));
        f2.l lVar = new f2.l();
        lVar.f5807m = false;
        lVar.C = false;
        lVar.o(mr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.f10894a0.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public final boolean S() {
        rl0 rl0Var = this.d;
        if (rl0Var != null && rl0Var.D) {
            for (int i10 = 0; i10 < rl0Var.getChildCount(); i10++) {
                if (rl0Var.getChildAt(i10) instanceof u00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (w51Var = this.f10894a0) != null) {
            w51Var.N(true);
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
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, false, new dg.r1(this, 11), this.resourcesProvider);
        this.f10894a0 = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
