package defpackage;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.WallpapersListActivity;
public final class yv1 implements Runnable {
    public final byte a;
    public final e b;

    public yv1(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                if (eVar != 0) {
                    new xk8(eVar, 11, false).show();
                    return;
                } else if (eVar.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) eVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                eVar.presentFragment(new StickersActivity(0, null));
                return;
            case 2:
                eVar.presentFragment(new uqc());
                return;
            case 3:
                ?? obj = new Object();
                obj.a = true;
                eVar.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 4:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                eVar.presentFragment(themeActivity);
                return;
            case 5:
                if (eVar instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) eVar;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().T0(false);
                    premiumPreviewFragment.a.A0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (eVar != 0) {
                        eVar.presentFragment(premiumPreviewFragment2);
                    } else {
                        e S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (eVar != 0 && (eVar.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        eVar.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) eVar.getParentActivity()).w0.c(false);
                    return;
                }
                return;
            case 6:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 7:
            case 8:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 24:
            case 25:
            case 26:
            case 28:
            default:
                uh9.o(0, eVar);
                return;
            case 9:
                eVar.presentFragment(new WallpapersListActivity(0));
                return;
            case 10:
                eVar.presentFragment(new WallpapersListActivity(1));
                return;
            case 11:
                eVar.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 12:
                eVar.presentFragment(new WallpapersListActivity(0));
                return;
            case 14:
            case 15:
                uh9.o(3, eVar);
                return;
            case 16:
                xk8 xk8Var = new xk8(eVar, 5, false);
                xk8Var.G0();
                eVar.showDialog(xk8Var);
                return;
            case 21:
                uh9.o(1, eVar);
                return;
            case 23:
                eVar.presentFragment(new NotificationsSettingsActivity());
                return;
            case 27:
                eVar.presentFragment(new NotificationsSettingsActivity());
                return;
        }
    }
}
