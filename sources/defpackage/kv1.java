package defpackage;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.WallpapersListActivity;
public final class kv1 implements Runnable {
    public final byte a;
    public final d b;

    public kv1(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                if (dVar != 0) {
                    new jh8(dVar, 11, false).show();
                    return;
                } else if (dVar.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) dVar.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                dVar.presentFragment(new StickersActivity(0, null));
                return;
            case 2:
                dVar.presentFragment(new hmc());
                return;
            case 3:
                ?? obj = new Object();
                obj.a = true;
                dVar.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 4:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                dVar.presentFragment(themeActivity);
                return;
            case 5:
                if (dVar instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) dVar;
                    premiumPreviewFragment.q0 = true;
                    premiumPreviewFragment.getMediaDataController().T0(false);
                    premiumPreviewFragment.a.z0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.q0 = true;
                    if (dVar != 0) {
                        dVar.presentFragment(premiumPreviewFragment2);
                    } else {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (dVar != 0 && (dVar.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        dVar.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) dVar.getParentActivity()).w0.c(false);
                    return;
                }
                return;
            case 6:
                dVar.presentFragment(new DataSettingsActivity());
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
                de9.o(0, dVar);
                return;
            case 9:
                dVar.presentFragment(new WallpapersListActivity(0));
                return;
            case 10:
                dVar.presentFragment(new WallpapersListActivity(1));
                return;
            case 11:
                dVar.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 12:
                dVar.presentFragment(new WallpapersListActivity(0));
                return;
            case 14:
            case 15:
                de9.o(3, dVar);
                return;
            case 16:
                jh8 jh8Var = new jh8(dVar, 5, false);
                jh8Var.F0();
                dVar.showDialog(jh8Var);
                return;
            case 21:
                de9.o(1, dVar);
                return;
            case 23:
                dVar.presentFragment(new NotificationsSettingsActivity());
                return;
            case 27:
                dVar.presentFragment(new NotificationsSettingsActivity());
                return;
        }
    }
}
