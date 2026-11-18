package org.telegram.messenger;
public final class g00 implements Runnable {
    public final int f24127a;
    public final z00 f24128b;
    public final String f24129c;
    public final fj d;
    public final long f24130e;
    public final int f24131f;

    public g00(z00 z00Var, String str, fj fjVar, long j3, int i7, int i10) {
        this.f24127a = i10;
        this.f24128b = z00Var;
        this.f24129c = str;
        this.d = fjVar;
        this.f24130e = j3;
        this.f24131f = i7;
    }

    @Override
    public final void run() {
        switch (this.f24127a) {
            case 0:
                z00 z00Var = this.f24128b;
                fj fjVar = this.d;
                long j3 = this.f24130e;
                int i7 = this.f24131f;
                c6.d(this.f24129c, new j00(z00Var, fjVar, j3, i7), new j00(z00Var, fjVar, j3, i7), false);
                return;
            default:
                z00 z00Var2 = this.f24128b;
                z00Var2.getClass();
                String str = this.f24129c;
                if (str == null) {
                    str = "und";
                }
                fj fjVar2 = this.d;
                fjVar2.f23965k.originalLanguage = str;
                z00Var2.getMessagesStorage().X1(this.f24130e, fjVar2.f23965k);
                z00Var2.f28245w.remove(Integer.valueOf(this.f24131f));
                z00Var2.f(fjVar2);
                return;
        }
    }
}
