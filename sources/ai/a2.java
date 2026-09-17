package ai;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class a2 implements Runnable {
    public final int f507a;
    public final int f508b;
    public final long f509c;
    public final int d;
    public final Object e;

    public a2(int i10, int i11, int i12, long j3, Object obj) {
        this.f507a = i12;
        this.e = obj;
        this.f508b = i10;
        this.f509c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f507a) {
            case 0:
                d2 d2Var = (d2) this.e;
                HashMap hashMap = d2Var.F;
                int i10 = this.f508b;
                long j3 = this.f509c;
                if (i10 == 0) {
                    str = a4.a.o(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(d2Var.e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f508b, this.f509c, this.d);
                return;
        }
    }
}
