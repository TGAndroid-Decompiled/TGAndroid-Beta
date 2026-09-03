package nh;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class b1 implements Runnable {
    public final int f15082a;
    public final int f15083b;
    public final long f15084c;
    public final int d;
    public final Object e;

    public b1(int i10, int i11, int i12, long j10, Object obj) {
        this.f15082a = i12;
        this.e = obj;
        this.f15083b = i10;
        this.f15084c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f15082a) {
            case 0:
                e1 e1Var = (e1) this.e;
                HashMap hashMap = e1Var.C;
                int i10 = this.f15083b;
                long j10 = this.f15084c;
                if (i10 == 0) {
                    str = android.support.v4.media.a.n(j10, "");
                } else {
                    str = i10 + "_" + j10 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(e1Var.e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f15083b, this.f15084c, this.d);
                return;
        }
    }
}
