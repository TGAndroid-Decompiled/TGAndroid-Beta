package ai;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class a2 implements Runnable {
    public final int f550a;
    public final int f551b;
    public final long f552c;
    public final int d;
    public final Object f553e;

    public a2(int i10, int i11, int i12, long j3, Object obj) {
        this.f550a = i12;
        this.f553e = obj;
        this.f551b = i10;
        this.f552c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f550a) {
            case 0:
                d2 d2Var = (d2) this.f553e;
                HashMap hashMap = d2Var.F;
                int i10 = this.f551b;
                long j3 = this.f552c;
                if (i10 == 0) {
                    str = a4.a.o(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(d2Var.f756e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f553e).lambda$createGroupInstance$76(this.f551b, this.f552c, this.d);
                return;
        }
    }
}
