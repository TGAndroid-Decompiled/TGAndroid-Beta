package org.telegram.messenger;
public final class h00 implements Runnable {
    public final int f24342a;
    public final a10 f24343b;
    public final String f24344c;
    public final gj d;
    public final long f24345e;
    public final int f24346f;

    public h00(a10 a10Var, String str, gj gjVar, long j3, int i7, int i10) {
        this.f24342a = i10;
        this.f24343b = a10Var;
        this.f24344c = str;
        this.d = gjVar;
        this.f24345e = j3;
        this.f24346f = i7;
    }

    @Override
    public final void run() {
        switch (this.f24342a) {
            case 0:
                a10 a10Var = this.f24343b;
                gj gjVar = this.d;
                long j3 = this.f24345e;
                int i7 = this.f24346f;
                c6.d(this.f24344c, new k00(a10Var, gjVar, j3, i7), new k00(a10Var, gjVar, j3, i7), false);
                return;
            default:
                a10 a10Var2 = this.f24343b;
                a10Var2.getClass();
                String str = this.f24344c;
                if (str == null) {
                    str = "und";
                }
                gj gjVar2 = this.d;
                gjVar2.f24213k.originalLanguage = str;
                a10Var2.getMessagesStorage().X1(this.f24345e, gjVar2.f24213k);
                a10Var2.f22849w.remove(Integer.valueOf(this.f24346f));
                a10Var2.f(gjVar2);
                return;
        }
    }
}
