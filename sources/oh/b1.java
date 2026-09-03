package oh;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
public final class b1 implements Runnable {
    public final int f16878a;
    public final int f16879b;
    public final long f16880c;
    public final int d;
    public final Object f16881e;

    public b1(int i10, int i11, int i12, long j10, Object obj) {
        this.f16878a = i12;
        this.f16881e = obj;
        this.f16879b = i10;
        this.f16880c = j10;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f16878a) {
            case 0:
                e1 e1Var = (e1) this.f16881e;
                HashMap hashMap = e1Var.C;
                int i10 = this.f16879b;
                long j10 = this.f16880c;
                if (i10 == 0) {
                    str = android.support.v4.media.a.n(j10, "");
                } else {
                    str = i10 + "_" + j10 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(e1Var.f17007e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            default:
                ((VoIPService) this.f16881e).lambda$createGroupInstance$76(this.f16879b, this.f16880c, this.d);
                return;
        }
    }
}
