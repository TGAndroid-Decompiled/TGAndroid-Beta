package org.telegram.messenger;
public final class g00 implements Runnable {
    public final int f24130a;
    public final z00 f24131b;
    public final String f24132c;
    public final fj d;
    public final long f24133e;
    public final int f24134f;

    public g00(z00 z00Var, String str, fj fjVar, long j3, int i7, int i10) {
        this.f24130a = i10;
        this.f24131b = z00Var;
        this.f24132c = str;
        this.d = fjVar;
        this.f24133e = j3;
        this.f24134f = i7;
    }

    @Override
    public final void run() {
        switch (this.f24130a) {
            case 0:
                z00 z00Var = this.f24131b;
                fj fjVar = this.d;
                long j3 = this.f24133e;
                int i7 = this.f24134f;
                c6.d(this.f24132c, new j00(z00Var, fjVar, j3, i7), new j00(z00Var, fjVar, j3, i7), false);
                return;
            default:
                z00 z00Var2 = this.f24131b;
                z00Var2.getClass();
                String str = this.f24132c;
                if (str == null) {
                    str = "und";
                }
                fj fjVar2 = this.d;
                fjVar2.f23968k.originalLanguage = str;
                z00Var2.getMessagesStorage().X1(this.f24133e, fjVar2.f23968k);
                z00Var2.f28247w.remove(Integer.valueOf(this.f24134f));
                z00Var2.f(fjVar2);
                return;
        }
    }
}
