package bi;

import org.telegram.messenger.AndroidUtilities;
public final class ed implements Runnable {
    public final int f4578a;
    public final be f4579b;

    public ed(be beVar, int i10) {
        this.f4578a = i10;
        this.f4579b = beVar;
    }

    @Override
    public final void run() {
        switch (this.f4578a) {
            case 0:
                be beVar = this.f4579b;
                beVar.T = true;
                beVar.o(null);
                AndroidUtilities.runOnUIThread(new ed(beVar, 1), 240L);
                return;
            case 1:
                this.f4579b.dismiss();
                return;
            default:
                ld ldVar = this.f4579b.f4403r;
                ldVar.F = false;
                ldVar.invalidate();
                return;
        }
    }
}
