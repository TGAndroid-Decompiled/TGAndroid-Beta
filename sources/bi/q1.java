package bi;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class q1 implements Runnable {
    public final int f3590a;
    public final int f3591b;
    public final long f3592c;
    public final int d;
    public final Object f3593e;

    public q1(int i10, int i11, int i12, long j3, Object obj) {
        this.f3590a = i12;
        this.f3593e = obj;
        this.f3591b = i10;
        this.f3592c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f3590a) {
            case 0:
                t1 t1Var = (t1) this.f3593e;
                HashMap hashMap = t1Var.F;
                int i10 = this.f3591b;
                long j3 = this.f3592c;
                if (i10 == 0) {
                    str = a4.a.o(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(t1Var.f3718e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f3593e).lambda$createGroupInstance$76(this.f3591b, this.f3592c, this.d);
                return;
        }
    }
}
