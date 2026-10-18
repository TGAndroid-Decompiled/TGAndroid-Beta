package ai;

import org.telegram.messenger.AndroidUtilities;
public final class nd implements Runnable {
    public final int f1922a;
    public final le f1923b;

    public nd(le leVar, int i10) {
        this.f1922a = i10;
        this.f1923b = leVar;
    }

    @Override
    public final void run() {
        switch (this.f1922a) {
            case 0:
                le leVar = this.f1923b;
                leVar.S = true;
                leVar.p(null);
                AndroidUtilities.runOnUIThread(new nd(leVar, 1), 240L);
                return;
            case 1:
                this.f1923b.dismiss();
                return;
            default:
                ud udVar = this.f1923b.f1794r;
                udVar.F = false;
                udVar.invalidate();
                return;
        }
    }
}
