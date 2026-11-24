package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class he implements ed, wv7 {
    public final byte a;
    public final LaunchActivity b;

    public he(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override
    public final void b(yv7 yv7Var) {
        String str = LaunchActivity.C1;
        gba.B = false;
        LaunchActivity launchActivity = this.b;
        Intent intent = launchActivity.K0;
        if (intent != null) {
            launchActivity.V(intent, launchActivity.L0, launchActivity.M0, true, null, false, true);
            launchActivity.K0 = null;
        }
        launchActivity.p0.getView().setVisibility(0);
        launchActivity.p0.W(true, true);
        ActionBarLayout actionBarLayout = launchActivity.p0;
        d lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment != null) {
            lastFragment.setTitleOverlayText(actionBarLayout.N0, actionBarLayout.O0, actionBarLayout.P0);
        }
        if (gl.O1()) {
            ActionBarLayout actionBarLayout2 = launchActivity.q0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.W(true, true);
                if (launchActivity.q0.getView().getVisibility() == 4) {
                    launchActivity.q0.getView().setVisibility(0);
                }
            }
            ActionBarLayout actionBarLayout3 = launchActivity.r0;
            if (actionBarLayout3 != null) {
                actionBarLayout3.W(true, true);
                launchActivity.r0.getView().setVisibility(0);
            }
        }
        kk7.e().k(kk7.n0, yv7Var);
        try {
            im7.n(y6c.t0).Y();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                launchActivity.t0(new LanguageSelectActivity());
                return;
            case 1:
                launchActivity.t0(new r61());
                return;
            case 2:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                String str = LaunchActivity.C1;
                na7.q1(launchActivity.P).B3(2);
                return;
        }
    }
}
