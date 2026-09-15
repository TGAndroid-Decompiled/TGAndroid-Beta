package ai;

import android.os.Trace;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.o20;
import org.telegram.ui.LaunchActivity;
public final class z9 implements Runnable {
    public final int f1791a;

    public z9(int i10) {
        this.f1791a = i10;
    }

    @Override
    public final void run() {
        boolean z10 = true;
        switch (this.f1791a) {
            case 0:
                Math.abs(Utilities.random.nextInt() % 3);
                o20[] o20VarArr = ia.f1010a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(ia.f1021o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 1:
                try {
                    int i10 = n0.g.f14853a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (androidx.emoji2.text.l.f2332j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        androidx.emoji2.text.l.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i11 = n0.g.f14853a;
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                return;
            case 3:
                org.telegram.ui.ActionBar.i6.f18938j = false;
                org.telegram.ui.ActionBar.i6.l(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.i6.f18957k = false;
                org.telegram.ui.ActionBar.i6.l(true);
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.voip.m2 m2Var = org.telegram.ui.Components.voip.m2.U;
                if (m2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var.f29092b.f29053f.M);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public z9(org.telegram.ui.t2 t2Var) {
        this.f1791a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
