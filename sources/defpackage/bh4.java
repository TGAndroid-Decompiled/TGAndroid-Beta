package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class bh4 implements Runnable {
    public final byte a;
    public final FiltersSetupActivity b;

    public bh4(FiltersSetupActivity filtersSetupActivity, byte b) {
        this.a = b;
        this.b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        FiltersSetupActivity filtersSetupActivity = this.b;
        switch (b) {
            case 0:
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                filtersSetupActivity.a.g1(new lu3(filtersSetupActivity, (byte) 20), 700, true);
                return;
            case 2:
                filtersSetupActivity.showDialog(new xk8((e) filtersSetupActivity, 9, true));
                return;
            default:
                filtersSetupActivity.getMessagesController().k3(true, null);
                return;
        }
    }
}
