package bi;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class q1 implements Runnable {
    public final int f3617a;
    public final int f3618b;
    public final long f3619c;
    public final int d;
    public final Object f3620e;

    public q1(int i10, int i11, int i12, long j3, Object obj) {
        this.f3617a = i12;
        this.f3620e = obj;
        this.f3618b = i10;
        this.f3619c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f3617a) {
            case 0:
                t1 t1Var = (t1) this.f3620e;
                HashMap hashMap = t1Var.F;
                int i10 = this.f3618b;
                long j3 = this.f3619c;
                if (i10 == 0) {
                    str = a4.a.o(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(t1Var.f3745e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f3620e).lambda$createGroupInstance$76(this.f3618b, this.f3619c, this.d);
                return;
        }
    }
}
