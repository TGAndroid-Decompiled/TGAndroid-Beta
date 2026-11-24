package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class eh4 implements Runnable {
    public final byte a;
    public final FiltersSetupActivity b;

    public eh4(FiltersSetupActivity filtersSetupActivity, byte b) {
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
                filtersSetupActivity.a.f1(new yu3(filtersSetupActivity, (byte) 20), 700, true);
                return;
            case 2:
                filtersSetupActivity.showDialog(new kj8((d) filtersSetupActivity, 9, true));
                return;
            default:
                filtersSetupActivity.getMessagesController().g3(true, null);
                return;
        }
    }
}
