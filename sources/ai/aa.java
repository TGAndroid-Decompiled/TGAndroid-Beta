package ai;

import android.os.Trace;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g30;
import org.telegram.ui.LaunchActivity;
public final class aa implements Runnable {
    public final int f653a;

    public aa(int i10) {
        this.f653a = i10;
    }

    @Override
    public final void run() {
        boolean z10 = true;
        switch (this.f653a) {
            case 0:
                Math.abs(Utilities.random.nextInt() % 3);
                g30[] g30VarArr = ja.f1195a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(ja.f1207o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 1:
                try {
                    int i10 = n0.g.f16546a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (androidx.emoji2.text.l.f2604j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        androidx.emoji2.text.l.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i11 = n0.g.f16546a;
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                return;
            case 3:
                org.telegram.ui.ActionBar.h6.f20925j = false;
                org.telegram.ui.ActionBar.h6.l(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.h6.f20943k = false;
                org.telegram.ui.ActionBar.h6.l(true);
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.voip.n2 n2Var = org.telegram.ui.Components.voip.n2.V;
                if (n2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n2Var.f32213b.f32173f.N);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public aa(org.telegram.ui.t2 t2Var) {
        this.f653a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
