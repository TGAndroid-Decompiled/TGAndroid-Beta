package ai;

import org.telegram.messenger.AndroidUtilities;
public final class nd implements Runnable {
    public final int f1915a;
    public final le f1916b;

    public nd(le leVar, int i10) {
        this.f1915a = i10;
        this.f1916b = leVar;
    }

    @Override
    public final void run() {
        switch (this.f1915a) {
            case 0:
                le leVar = this.f1916b;
                leVar.S = true;
                leVar.p(null);
                AndroidUtilities.runOnUIThread(new nd(leVar, 1), 240L);
                return;
            case 1:
                this.f1916b.dismiss();
                return;
            default:
                ud udVar = this.f1916b.f1790r;
                udVar.F = false;
                udVar.invalidate();
                return;
        }
    }
}
