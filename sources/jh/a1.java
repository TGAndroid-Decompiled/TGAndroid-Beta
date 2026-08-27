package jh;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;

public final class a1 implements Runnable {

    public final int f13023a;

    public final int f13024b;

    public final long f13025c;
    public final int d;

    public final Object f13026e;

    public a1(int i10, int i11, int i12, long j10, Object obj) {
        this.f13023a = i12;
        this.f13026e = obj;
        this.f13024b = i10;
        this.f13025c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f13023a) {
            case 0:
                d1 d1Var = (d1) this.f13026e;
                HashMap map = d1Var.B;
                int i10 = this.f13024b;
                long j10 = this.f13025c;
                String strL = i10 == 0 ? a9.p.l(j10, "") : i10 + "_" + j10 + "_" + this.d;
                Integer num = (Integer) map.get(strL);
                if (num != null) {
                    AccountInstance.getInstance(d1Var.f13177e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    map.remove(strL);
                }
                break;
            default:
                ((VoIPService) this.f13026e).lambda$createGroupInstance$76(this.f13024b, this.f13025c, this.d);
                break;
        }
    }
}
