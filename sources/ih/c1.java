package ih;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class c1 implements Runnable {
    public final int f11279a;
    public final int f11280b;
    public final long f11281c;
    public final int d;
    public final Object f11282e;

    public c1(int i9, int i10, int i11, long j10, Object obj) {
        this.f11279a = i11;
        this.f11282e = obj;
        this.f11280b = i9;
        this.f11281c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f11279a) {
            case 0:
                f1 f1Var = (f1) this.f11282e;
                HashMap hashMap = f1Var.B;
                int i9 = this.f11280b;
                long j10 = this.f11281c;
                if (i9 == 0) {
                    str = aa.d.m(j10, "");
                } else {
                    str = i9 + "_" + j10 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(f1Var.f11401e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f11282e).lambda$createGroupInstance$76(this.f11280b, this.f11281c, this.d);
                return;
        }
    }
}
