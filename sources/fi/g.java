package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.yn;
public final class g implements Runnable {
    public final int f9893a;
    public final p f9894b;
    public final long f9895c;

    public g(p pVar, long j3, int i10) {
        this.f9893a = i10;
        this.f9894b = pVar;
        this.f9895c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9893a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.f9895c, r0.f9947b, new i(this.f9894b, 0));
                return;
            default:
                p pVar = this.f9894b;
                pVar.getClass();
                pVar.presentFragment(yn.Q9(this.f9895c));
                return;
        }
    }
}
