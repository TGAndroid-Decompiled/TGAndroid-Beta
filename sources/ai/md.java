package ai;

import org.telegram.messenger.AndroidUtilities;
public final class md implements Runnable {
    public final int f1872a;
    public final ke f1873b;

    public md(ke keVar, int i10) {
        this.f1872a = i10;
        this.f1873b = keVar;
    }

    @Override
    public final void run() {
        switch (this.f1872a) {
            case 0:
                ke keVar = this.f1873b;
                keVar.S = true;
                keVar.p(null);
                AndroidUtilities.runOnUIThread(new md(keVar, 1), 240L);
                return;
            case 1:
                this.f1873b.dismiss();
                return;
            default:
                td tdVar = this.f1873b.f1741r;
                tdVar.F = false;
                tdVar.invalidate();
                return;
        }
    }
}
