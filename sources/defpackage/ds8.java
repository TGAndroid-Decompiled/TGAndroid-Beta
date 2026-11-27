package defpackage;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.ThemeActivity;
public final class ds8 implements Runnable {
    public final byte a;
    public final e b;

    public ds8(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(new z61());
                return;
            case 1:
                eVar.presentFragment(new z61());
                return;
            case 2:
                eVar.presentFragment(new a93());
                return;
            case 3:
                eVar.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                return;
            case 4:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 5:
                eVar.presentFragment(new DataAutoDownloadActivity(0));
                return;
            case 6:
                eVar.presentFragment(new DataAutoDownloadActivity(1));
                return;
            case 7:
                eVar.presentFragment(new DataAutoDownloadActivity(2));
                return;
            case 8:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 9:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 10:
                xk8 xk8Var = new xk8(eVar, 3, false);
                xk8Var.G0();
                eVar.showDialog(xk8Var);
                return;
            case 11:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 12:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 13:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 14:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 15:
                eVar.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                return;
            case 16:
                eVar.presentFragment(new ProxyListActivity());
                return;
            case 17:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 18:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 19:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 20:
                eVar.presentFragment(new DataSettingsActivity());
                return;
            case 21:
                xk8 xk8Var2 = new xk8(eVar, 4, false);
                xk8Var2.G0();
                eVar.showDialog(xk8Var2);
                return;
            case 22:
                eVar.presentFragment(new uqc());
                return;
            case 23:
                uqc.K0(eVar.getContext(), eVar.getResourceProvider());
                return;
            case 24:
                jj.q0(7, null, eVar);
                return;
            case 25:
                jj.q0(8, null, eVar);
                return;
            case 26:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                eVar.presentFragment(themeActivity);
                return;
            case 27:
                uh9.o(1, eVar);
                return;
            case 28:
                eVar.presentFragment(new PremiumPreviewFragment(0, "summarize_limit"));
                return;
            default:
                if (d31.a(eVar)) {
                    d31.b0(eVar).I(2131623990, ob6.M0(2131742801, null), ob6.M0(2131742800, null)).j();
                    return;
                }
                return;
        }
    }
}
