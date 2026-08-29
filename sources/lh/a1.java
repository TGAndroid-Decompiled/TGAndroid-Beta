package lh;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class a1 implements Runnable {
    public final int f15304a;
    public final int f15305b;
    public final long f15306c;
    public final int d;
    public final Object f15307e;

    public a1(int i10, int i11, int i12, long j10, Object obj) {
        this.f15304a = i12;
        this.f15307e = obj;
        this.f15305b = i10;
        this.f15306c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f15304a) {
            case 0:
                d1 d1Var = (d1) this.f15307e;
                HashMap hashMap = d1Var.B;
                int i10 = this.f15305b;
                long j10 = this.f15306c;
                if (i10 == 0) {
                    str = a4.w.m(j10, "");
                } else {
                    str = i10 + "_" + j10 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(d1Var.f15456e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f15307e).lambda$createGroupInstance$76(this.f15305b, this.f15306c, this.d);
                return;
        }
    }
}
