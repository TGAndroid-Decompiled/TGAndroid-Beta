package ai;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class a2 implements Runnable {
    public final int f504a;
    public final int f505b;
    public final long f506c;
    public final int d;
    public final Object e;

    public a2(int i10, int i11, int i12, long j3, Object obj) {
        this.f504a = i12;
        this.e = obj;
        this.f505b = i10;
        this.f506c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f504a) {
            case 0:
                d2 d2Var = (d2) this.e;
                HashMap hashMap = d2Var.F;
                int i10 = this.f505b;
                long j3 = this.f506c;
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
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f505b, this.f506c, this.d);
                return;
        }
    }
}
