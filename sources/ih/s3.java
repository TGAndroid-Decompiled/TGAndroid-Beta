package ih;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import jh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.xa;
public final class s3 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public final int T;
    public final k7 U;
    public final HashSet V;
    public final iz W;
    public final nh.d X;
    public j70 Y;
    public k51 Z;

    public s3(org.telegram.ui.ActionBar.o2 o2Var, long j10, int i10, bg.n3 n3Var) {
        super(o2Var);
        this.V = new HashSet();
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        J();
        this.T = i10;
        this.U = new k7(this.currentAccount, j10, true);
        this.f34660e.setActionBarMenuOnItemClick(new p3(this, this.f34660e.n().a(1, R.drawable.ic_ab_other), j10));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(g6.v0(g6.f23133h5, this.resourcesProvider));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        this.containerView.addView(frameLayout, i7.f6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        view.setBackgroundColor(g6.v0(g6.f23063d7, this.resourcesProvider));
        frameLayout.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        nh.d dVar = new nh.d(getContext(), this.resourcesProvider, true);
        this.X = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionAddGiftsButton), false, true);
        dVar.setEnabled(false);
        dVar.setOnClickListener(new ag.n(12, this, n3Var));
        frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        getContext();
        iz izVar = new iz(3, false);
        this.W = izVar;
        izVar.O = new q3(this);
        this.d.setPadding(AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(9.0f) + this.backgroundPaddingLeft, 0);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        this.d.setLayoutManager(izVar);
        this.d.setOnItemClickListener(new bg.o(this, 6));
        this.d.j(new r3(this));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        this.Z.N(true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    public final boolean S() {
        jl0 jl0Var = this.d;
        if (jl0Var != null && jl0Var.C) {
            for (int i10 = 0; i10 < jl0Var.getChildCount(); i10++) {
                if (jl0Var.getChildAt(i10) instanceof p00) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && (k51Var = this.Z) != null) {
            k51Var.N(true);
            if (S()) {
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
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, false, new bg.t1(this, 11), this.resourcesProvider);
        this.Z = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2CollectionAddGiftsTitle);
    }
}
