package lh;

import org.telegram.messenger.AndroidUtilities;

public final class y9 implements Runnable {

    public final int f17124a;

    public final sb f17125b;

    public final Runnable f17126c;

    public y9(sb sbVar, Runnable runnable, int i10) {
        this.f17124a = i10;
        this.f17125b = sbVar;
        this.f17126c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17124a) {
            case 0:
                this.f17126c.run();
                this.f17125b.p0();
                break;
            default:
                sb sbVar = this.f17125b;
                sbVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(sbVar.f16752c2);
                sbVar.f16752c2 = null;
                sbVar.O1 = false;
                this.f17126c.run();
                break;
        }
    }
}
