package org.telegram.messenger.voip;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
public final class a0 implements Runnable {
    public final int f16688a;
    public final int f16689b;
    public final long f16690c;
    public final int d;
    public final Object e;

    public a0(int i10, int i11, int i12, long j3, Object obj) {
        this.f16688a = i12;
        this.e = obj;
        this.f16689b = i10;
        this.f16690c = j3;
        this.d = i11;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f16688a) {
            case 0:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.f16689b, this.f16690c, this.d);
                return;
            default:
                zh.t0 t0Var = (zh.t0) this.e;
                HashMap hashMap = t0Var.F;
                int i10 = this.f16689b;
                long j3 = this.f16690c;
                if (i10 == 0) {
                    str = a4.a.o(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(t0Var.e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
        }
    }
}
