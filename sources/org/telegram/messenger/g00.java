package org.telegram.messenger;
public final class g00 implements Runnable {
    public final int f24155a;
    public final z00 f24156b;
    public final String f24157c;
    public final fj d;
    public final long f24158e;
    public final int f24159f;

    public g00(z00 z00Var, String str, fj fjVar, long j3, int i7, int i10) {
        this.f24155a = i10;
        this.f24156b = z00Var;
        this.f24157c = str;
        this.d = fjVar;
        this.f24158e = j3;
        this.f24159f = i7;
    }

    @Override
    public final void run() {
        switch (this.f24155a) {
            case 0:
                z00 z00Var = this.f24156b;
                fj fjVar = this.d;
                long j3 = this.f24158e;
                int i7 = this.f24159f;
                c6.d(this.f24157c, new j00(z00Var, fjVar, j3, i7), new j00(z00Var, fjVar, j3, i7), false);
                return;
            default:
                z00 z00Var2 = this.f24156b;
                z00Var2.getClass();
                String str = this.f24157c;
                if (str == null) {
                    str = "und";
                }
                fj fjVar2 = this.d;
                fjVar2.f23993k.originalLanguage = str;
                z00Var2.getMessagesStorage().X1(this.f24158e, fjVar2.f23993k);
                z00Var2.f28273w.remove(Integer.valueOf(this.f24159f));
                z00Var2.f(fjVar2);
                return;
        }
    }
}
