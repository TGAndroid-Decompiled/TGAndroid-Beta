package defpackage;
public final class i0c implements Runnable {
    public final byte a;
    public final b1c b;
    public final String c;
    public final k27 d;
    public final long e;
    public final int f;

    public i0c(b1c b1cVar, String str, k27 k27Var, long j, int i, byte b) {
        this.a = b;
        this.b = b1cVar;
        this.c = str;
        this.d = k27Var;
        this.e = j;
        this.f = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        switch (b) {
            case 0:
                b1c b1cVar = this.b;
                k27 k27Var = this.d;
                long j = this.e;
                int i = this.f;
                cme.b(str, new l0c(b1cVar, k27Var, j, i), new l0c(b1cVar, k27Var, j, i), false);
                return;
            default:
                if (str == null) {
                    str = "und";
                }
                k27 k27Var2 = this.d;
                k27Var2.k.originalLanguage = str;
                b1c b1cVar2 = this.b;
                b1cVar2.getMessagesStorage().U1(this.e, k27Var2.k);
                b1cVar2.w.remove(Integer.valueOf(this.f));
                b1cVar2.e(k27Var2);
                return;
        }
    }
}
