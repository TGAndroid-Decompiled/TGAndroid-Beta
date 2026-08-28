package kh;

import org.telegram.messenger.AndroidUtilities;
public final class ba implements Runnable {
    public final int f15009a;
    public final wb f15010b;
    public final Runnable f15011c;

    public ba(wb wbVar, Runnable runnable, int i9) {
        this.f15009a = i9;
        this.f15010b = wbVar;
        this.f15011c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15009a) {
            case 0:
                this.f15011c.run();
                this.f15010b.p0();
                return;
            default:
                wb wbVar = this.f15010b;
                wbVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(wbVar.f16256c2);
                wbVar.f16256c2 = null;
                wbVar.O1 = false;
                this.f15011c.run();
                return;
        }
    }
}
