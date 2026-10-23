package ci;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class e1 implements Runnable {
    public final int f5279a;
    public final int f5280b;
    public final long f5281c;
    public final int d;
    public final Object e;

    public e1(int i10, int i11, int i12, long j10, Object obj) {
        this.f5279a = i12;
        this.e = obj;
        this.f5280b = i10;
        this.f5281c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f5279a) {
            case 0:
                h1 h1Var = (h1) this.e;
                HashMap hashMap = h1Var.F;
                int i10 = this.f5280b;
                long j10 = this.f5281c;
                if (i10 == 0) {
                    str = a1.g.o(j10, "");
                } else {
                    str = i10 + "_" + j10 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(h1Var.e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f5280b, this.f5281c, this.d);
                return;
        }
    }
}
