package ai;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class a2 implements Runnable {
    public final int f635a;
    public final int f636b;
    public final long f637c;
    public final int d;
    public final Object f638e;

    public a2(int i10, int i11, int i12, long j3, Object obj) {
        this.f635a = i12;
        this.f638e = obj;
        this.f636b = i10;
        this.f637c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f635a) {
            case 0:
                d2 d2Var = (d2) this.f638e;
                HashMap hashMap = d2Var.F;
                int i10 = this.f636b;
                long j3 = this.f637c;
                if (i10 == 0) {
                    str = a1.g.p(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(d2Var.f807e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f638e).lambda$createGroupInstance$76(this.f636b, this.f637c, this.d);
                return;
        }
    }
}
