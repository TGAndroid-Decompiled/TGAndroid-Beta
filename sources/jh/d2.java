package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

public final class d2 implements Runnable {

    public final int f13185a;

    public final Runnable f13186b;

    public d2(int i10, Runnable runnable) {
        this.f13185a = i10;
        this.f13186b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f13185a) {
            case 0:
                Runnable runnable = this.f13186b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 1:
                Runnable runnable2 = this.f13186b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                break;
            case 2:
                Runnable runnable3 = this.f13186b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                break;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f13186b);
                break;
        }
    }
}
