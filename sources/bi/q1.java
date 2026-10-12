package bi;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class q1 implements Runnable {
    public final int f3492a;
    public final int f3493b;
    public final long f3494c;
    public final int d;
    public final Object e;

    public q1(int i10, int i11, int i12, long j10, Object obj) {
        this.f3492a = i12;
        this.e = obj;
        this.f3493b = i10;
        this.f3494c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f3492a) {
            case 0:
                t1 t1Var = (t1) this.e;
                HashMap hashMap = t1Var.F;
                int i10 = this.f3493b;
                long j10 = this.f3494c;
                if (i10 == 0) {
                    str = a1.g.o(j10, "");
                } else {
                    str = i10 + "_" + j10 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(t1Var.e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f3493b, this.f3494c, this.d);
                return;
        }
    }
}
