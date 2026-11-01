package org.telegram.messenger;
public final class a10 implements Runnable {
    public final int f14548a;
    public final u10 f14549b;
    public final String f14550c;
    public final kj d;
    public final long e;
    public final int f14551f;

    public a10(u10 u10Var, String str, kj kjVar, long j10, int i10, int i11) {
        this.f14548a = i11;
        this.f14549b = u10Var;
        this.f14550c = str;
        this.d = kjVar;
        this.e = j10;
        this.f14551f = i10;
    }

    @Override
    public final void run() {
        switch (this.f14548a) {
            case 0:
                u10 u10Var = this.f14549b;
                kj kjVar = this.d;
                long j10 = this.e;
                int i10 = this.f14551f;
                ks.d(this.f14550c, new d10(u10Var, kjVar, j10, i10), new d10(u10Var, kjVar, j10, i10), false);
                return;
            default:
                u10 u10Var2 = this.f14549b;
                u10Var2.getClass();
                String str = this.f14550c;
                if (str == null) {
                    str = "und";
                }
                kj kjVar2 = this.d;
                kjVar2.f16690k.originalLanguage = str;
                u10Var2.getMessagesStorage().X1(this.e, kjVar2.f16690k);
                u10Var2.f18356w.remove(Integer.valueOf(this.f14551f));
                u10Var2.f(kjVar2);
                return;
        }
    }
}
