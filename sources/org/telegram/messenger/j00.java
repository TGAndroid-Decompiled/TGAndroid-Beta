package org.telegram.messenger;
public final class j00 implements Runnable {
    public final int f24499a;
    public final c10 f24500b;
    public final String f24501c;
    public final gj d;
    public final long f24502e;
    public final int f24503f;

    public j00(c10 c10Var, String str, gj gjVar, long j3, int i7, int i10) {
        this.f24499a = i10;
        this.f24500b = c10Var;
        this.f24501c = str;
        this.d = gjVar;
        this.f24502e = j3;
        this.f24503f = i7;
    }

    @Override
    public final void run() {
        switch (this.f24499a) {
            case 0:
                c10 c10Var = this.f24500b;
                gj gjVar = this.d;
                long j3 = this.f24502e;
                int i7 = this.f24503f;
                b6.d(this.f24501c, new m00(c10Var, gjVar, j3, i7), new m00(c10Var, gjVar, j3, i7), false);
                return;
            default:
                c10 c10Var2 = this.f24500b;
                c10Var2.getClass();
                String str = this.f24501c;
                if (str == null) {
                    str = "und";
                }
                gj gjVar2 = this.d;
                gjVar2.f23819k.originalLanguage = str;
                c10Var2.getMessagesStorage().X1(this.f24502e, gjVar2.f23819k);
                c10Var2.f22794w.remove(Integer.valueOf(this.f24503f));
                c10Var2.f(gjVar2);
                return;
        }
    }
}
