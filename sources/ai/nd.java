package ai;

import org.telegram.messenger.AndroidUtilities;
public final class nd implements Runnable {
    public final int f1920a;
    public final le f1921b;

    public nd(le leVar, int i10) {
        this.f1920a = i10;
        this.f1921b = leVar;
    }

    @Override
    public final void run() {
        switch (this.f1920a) {
            case 0:
                le leVar = this.f1921b;
                leVar.S = true;
                leVar.p(null);
                AndroidUtilities.runOnUIThread(new nd(leVar, 1), 240L);
                return;
            case 1:
                this.f1921b.dismiss();
                return;
            default:
                ud udVar = this.f1921b.f1796r;
                udVar.F = false;
                udVar.invalidate();
                return;
        }
    }
}
