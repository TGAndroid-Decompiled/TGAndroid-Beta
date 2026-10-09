package ai;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class a2 implements Runnable {
    public final int f633a;
    public final int f634b;
    public final long f635c;
    public final int d;
    public final Object f636e;

    public a2(int i10, int i11, int i12, long j3, Object obj) {
        this.f633a = i12;
        this.f636e = obj;
        this.f634b = i10;
        this.f635c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f633a) {
            case 0:
                d2 d2Var = (d2) this.f636e;
                HashMap hashMap = d2Var.F;
                int i10 = this.f634b;
                long j3 = this.f635c;
                if (i10 == 0) {
                    str = a1.g.p(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(d2Var.f809e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f636e).lambda$createGroupInstance$76(this.f634b, this.f635c, this.d);
                return;
        }
    }
}
