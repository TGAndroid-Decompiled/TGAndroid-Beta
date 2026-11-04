package org.telegram.messenger;
public final class e00 implements Runnable {
    public final int f22280a;
    public final x00 f22281b;
    public final String f22282c;
    public final zi d;
    public final long f22283e;
    public final int f22284f;

    public e00(x00 x00Var, String str, zi ziVar, long j10, int i3, int i10) {
        this.f22280a = i10;
        this.f22281b = x00Var;
        this.f22282c = str;
        this.d = ziVar;
        this.f22283e = j10;
        this.f22284f = i3;
    }

    @Override
    public final void run() {
        switch (this.f22280a) {
            case 0:
                x00 x00Var = this.f22281b;
                zi ziVar = this.d;
                long j10 = this.f22283e;
                int i3 = this.f22284f;
                b6.d(this.f22282c, new h00(x00Var, ziVar, j10, i3), new h00(x00Var, ziVar, j10, i3), false);
                return;
            default:
                x00 x00Var2 = this.f22281b;
                x00Var2.getClass();
                String str = this.f22282c;
                if (str == null) {
                    str = "und";
                }
                zi ziVar2 = this.d;
                ziVar2.f26868k.originalLanguage = str;
                x00Var2.getMessagesStorage().X1(this.f22283e, ziVar2.f26868k);
                x00Var2.f26330w.remove(Integer.valueOf(this.f22284f));
                x00Var2.f(ziVar2);
                return;
        }
    }
}
