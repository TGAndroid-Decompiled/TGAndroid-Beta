package ai;

import android.os.Trace;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r20;
import org.telegram.ui.LaunchActivity;
public final class z9 implements Runnable {
    public final int f1790a;

    public z9(int i10) {
        this.f1790a = i10;
    }

    @Override
    public final void run() {
        boolean z10 = true;
        switch (this.f1790a) {
            case 0:
                Math.abs(Utilities.random.nextInt() % 3);
                r20[] r20VarArr = ia.f1003a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(ia.f1014o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 1:
                try {
                    int i10 = n0.g.f15116a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (androidx.emoji2.text.l.f2331j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        androidx.emoji2.text.l.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i11 = n0.g.f15116a;
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                return;
            case 3:
                org.telegram.ui.ActionBar.i6.f19159j = false;
                org.telegram.ui.ActionBar.i6.l(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.i6.f19178k = false;
                org.telegram.ui.ActionBar.i6.l(true);
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.voip.n2 n2Var = org.telegram.ui.Components.voip.n2.U;
                if (n2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n2Var.f29448b.f29442f.M);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public z9(org.telegram.ui.v2 v2Var) {
        this.f1790a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
