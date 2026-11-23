package org.telegram.messenger;
public final class f00 implements Runnable {
    public final int f23915a;
    public final y00 f23916b;
    public final String f23917c;
    public final fj d;
    public final long f23918e;
    public final int f23919f;

    public f00(y00 y00Var, String str, fj fjVar, long j3, int i7, int i10) {
        this.f23915a = i10;
        this.f23916b = y00Var;
        this.f23917c = str;
        this.d = fjVar;
        this.f23918e = j3;
        this.f23919f = i7;
    }

    @Override
    public final void run() {
        switch (this.f23915a) {
            case 0:
                y00 y00Var = this.f23916b;
                fj fjVar = this.d;
                long j3 = this.f23918e;
                int i7 = this.f23919f;
                c6.d(this.f23917c, new i00(y00Var, fjVar, j3, i7), new i00(y00Var, fjVar, j3, i7), false);
                return;
            default:
                y00 y00Var2 = this.f23916b;
                y00Var2.getClass();
                String str = this.f23917c;
                if (str == null) {
                    str = "und";
                }
                fj fjVar2 = this.d;
                fjVar2.f24073k.originalLanguage = str;
                y00Var2.getMessagesStorage().X1(this.f23918e, fjVar2.f24073k);
                y00Var2.f28188w.remove(Integer.valueOf(this.f23919f));
                y00Var2.f(fjVar2);
                return;
        }
    }
}
