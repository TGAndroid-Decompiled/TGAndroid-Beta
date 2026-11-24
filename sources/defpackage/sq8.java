package defpackage;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ThemeActivity;
public final class sq8 implements Runnable {
    public final byte a;
    public final d b;

    public sq8(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(new y71());
                return;
            case 1:
                dVar.presentFragment(new y71());
                return;
            case 2:
                dVar.presentFragment(new t93());
                return;
            case 3:
                dVar.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                return;
            case 4:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 5:
                dVar.presentFragment(new DataAutoDownloadActivity(0));
                return;
            case 6:
                dVar.presentFragment(new DataAutoDownloadActivity(1));
                return;
            case 7:
                dVar.presentFragment(new DataAutoDownloadActivity(2));
                return;
            case 8:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 9:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 10:
                kj8 kj8Var = new kj8(dVar, 3, false);
                kj8Var.F0();
                dVar.showDialog(kj8Var);
                return;
            case 11:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 12:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 13:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 14:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 15:
                dVar.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                return;
            case 16:
                dVar.presentFragment(new ProxyListActivity());
                return;
            case 17:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 18:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 19:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 20:
                dVar.presentFragment(new DataSettingsActivity());
                return;
            case 21:
                kj8 kj8Var2 = new kj8(dVar, 4, false);
                kj8Var2.F0();
                dVar.showDialog(kj8Var2);
                return;
            case 22:
                dVar.presentFragment(new goc());
                return;
            case 23:
                goc.L0(dVar.getContext(), dVar.getResourceProvider());
                return;
            case 24:
                ik.q0(7, null, dVar);
                return;
            case 25:
                ik.q0(8, null, dVar);
                return;
            case 26:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                dVar.presentFragment(themeActivity);
                return;
            case 27:
                hg9.n(1, dVar);
                return;
            case 28:
                dVar.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
            default:
                if (c41.a(dVar)) {
                    c41.b0(dVar).I(2131623990, jb6.M0(2131742833, null), jb6.M0(2131742832, null)).j();
                    return;
                }
                return;
        }
    }
}
