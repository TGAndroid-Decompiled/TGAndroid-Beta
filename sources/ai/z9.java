package ai;

import android.os.Trace;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p20;
import org.telegram.ui.LaunchActivity;
public final class z9 implements Runnable {
    public final int f1788a;

    public z9(int i10) {
        this.f1788a = i10;
    }

    @Override
    public final void run() {
        boolean z10 = true;
        switch (this.f1788a) {
            case 0:
                Math.abs(Utilities.random.nextInt() % 3);
                p20[] p20VarArr = ia.f1000a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(ia.f1011o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 1:
                try {
                    int i10 = n0.g.f14828a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (androidx.emoji2.text.l.f2329j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        androidx.emoji2.text.l.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i11 = n0.g.f14828a;
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                return;
            case 3:
                org.telegram.ui.ActionBar.h6.f18890j = false;
                org.telegram.ui.ActionBar.h6.l(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.h6.f18909k = false;
                org.telegram.ui.ActionBar.h6.l(true);
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.voip.m2 m2Var = org.telegram.ui.Components.voip.m2.U;
                if (m2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var.f29063b.f29024f.M);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public z9(org.telegram.ui.u2 u2Var) {
        this.f1788a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
