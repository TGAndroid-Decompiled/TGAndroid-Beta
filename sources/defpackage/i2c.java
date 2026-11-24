package defpackage;
public final class i2c implements Runnable {
    public final byte a;
    public final b3c b;
    public final String c;
    public final k47 d;
    public final long e;
    public final int f;

    public i2c(b3c b3cVar, String str, k47 k47Var, long j, int i, byte b) {
        this.a = b;
        this.b = b3cVar;
        this.c = str;
        this.d = k47Var;
        this.e = j;
        this.f = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        switch (b) {
            case 0:
                b3c b3cVar = this.b;
                k47 k47Var = this.d;
                long j = this.e;
                int i = this.f;
                eoe.b(str, new l2c(b3cVar, k47Var, j, i), new l2c(b3cVar, k47Var, j, i), false);
                return;
            default:
                if (str == null) {
                    str = "und";
                }
                k47 k47Var2 = this.d;
                k47Var2.k.originalLanguage = str;
                b3c b3cVar2 = this.b;
                b3cVar2.getMessagesStorage().U1(this.e, k47Var2.k);
                b3cVar2.w.remove(Integer.valueOf(this.f));
                b3cVar2.e(k47Var2);
                return;
        }
    }
}
