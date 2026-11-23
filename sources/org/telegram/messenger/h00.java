package org.telegram.messenger;
public final class h00 implements Runnable {
    public final int f24306a;
    public final a10 f24307b;
    public final String f24308c;
    public final gj d;
    public final long f24309e;
    public final int f24310f;

    public h00(a10 a10Var, String str, gj gjVar, long j3, int i7, int i10) {
        this.f24306a = i10;
        this.f24307b = a10Var;
        this.f24308c = str;
        this.d = gjVar;
        this.f24309e = j3;
        this.f24310f = i7;
    }

    @Override
    public final void run() {
        switch (this.f24306a) {
            case 0:
                a10 a10Var = this.f24307b;
                gj gjVar = this.d;
                long j3 = this.f24309e;
                int i7 = this.f24310f;
                c6.d(this.f24308c, new k00(a10Var, gjVar, j3, i7), new k00(a10Var, gjVar, j3, i7), false);
                return;
            default:
                a10 a10Var2 = this.f24307b;
                a10Var2.getClass();
                String str = this.f24308c;
                if (str == null) {
                    str = "und";
                }
                gj gjVar2 = this.d;
                gjVar2.f24177k.originalLanguage = str;
                a10Var2.getMessagesStorage().X1(this.f24309e, gjVar2.f24177k);
                a10Var2.f22813w.remove(Integer.valueOf(this.f24310f));
                a10Var2.f(gjVar2);
                return;
        }
    }
}
