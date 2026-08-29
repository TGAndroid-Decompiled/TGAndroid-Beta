package jh;

import org.telegram.messenger.AndroidUtilities;
public final class ja implements Runnable {
    public final int f12346a;
    public final db f12347b;

    public ja(db dbVar, int i10) {
        this.f12346a = i10;
        this.f12347b = dbVar;
    }

    @Override
    public final void run() {
        switch (this.f12346a) {
            case 0:
                db dbVar = this.f12347b;
                dbVar.N = true;
                dbVar.o(null);
                AndroidUtilities.runOnUIThread(new ja(dbVar, 1), 240L);
                return;
            case 1:
                this.f12347b.dismiss();
                return;
            default:
                pa paVar = this.f12347b.f11978r;
                paVar.B = false;
                paVar.invalidate();
                return;
        }
    }
}
