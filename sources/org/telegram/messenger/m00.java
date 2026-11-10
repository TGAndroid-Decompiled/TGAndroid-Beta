package org.telegram.messenger;
public final class m00 implements Runnable {
    public final int f23964a;
    public final f10 f23965b;
    public final String f23966c;
    public final ij d;
    public final long f23967e;
    public final int f23968f;

    public m00(f10 f10Var, String str, ij ijVar, long j3, int i7, int i10) {
        this.f23964a = i10;
        this.f23965b = f10Var;
        this.f23966c = str;
        this.d = ijVar;
        this.f23967e = j3;
        this.f23968f = i7;
    }

    @Override
    public final void run() {
        switch (this.f23964a) {
            case 0:
                f10 f10Var = this.f23965b;
                ij ijVar = this.d;
                long j3 = this.f23967e;
                int i7 = this.f23968f;
                b6.d(this.f23966c, new p00(f10Var, ijVar, j3, i7), new p00(f10Var, ijVar, j3, i7), false);
                return;
            default:
                f10 f10Var2 = this.f23965b;
                f10Var2.getClass();
                String str = this.f23966c;
                if (str == null) {
                    str = "und";
                }
                ij ijVar2 = this.d;
                ijVar2.f23266k.originalLanguage = str;
                f10Var2.getMessagesStorage().X1(this.f23967e, ijVar2.f23266k);
                f10Var2.f22354w.remove(Integer.valueOf(this.f23968f));
                f10Var2.f(ijVar2);
                return;
        }
    }
}
