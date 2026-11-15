package org.telegram.messenger;
public final class j00 implements Runnable {
    public final int f24494a;
    public final c10 f24495b;
    public final String f24496c;
    public final gj d;
    public final long f24497e;
    public final int f24498f;

    public j00(c10 c10Var, String str, gj gjVar, long j3, int i7, int i10) {
        this.f24494a = i10;
        this.f24495b = c10Var;
        this.f24496c = str;
        this.d = gjVar;
        this.f24497e = j3;
        this.f24498f = i7;
    }

    @Override
    public final void run() {
        switch (this.f24494a) {
            case 0:
                c10 c10Var = this.f24495b;
                gj gjVar = this.d;
                long j3 = this.f24497e;
                int i7 = this.f24498f;
                b6.d(this.f24496c, new m00(c10Var, gjVar, j3, i7), new m00(c10Var, gjVar, j3, i7), false);
                return;
            default:
                c10 c10Var2 = this.f24495b;
                c10Var2.getClass();
                String str = this.f24496c;
                if (str == null) {
                    str = "und";
                }
                gj gjVar2 = this.d;
                gjVar2.f23817k.originalLanguage = str;
                c10Var2.getMessagesStorage().X1(this.f24497e, gjVar2.f23817k);
                c10Var2.f22790w.remove(Integer.valueOf(this.f24498f));
                c10Var2.f(gjVar2);
                return;
        }
    }
}
