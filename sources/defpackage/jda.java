package defpackage;
public final class jda implements Runnable {
    public final byte a;
    public final lda b;

    public jda(lda ldaVar, byte b) {
        this.a = b;
        this.b = ldaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lda ldaVar = this.b;
        switch (b) {
            case 0:
                ldaVar.post(new jda(ldaVar, (byte) 1));
                return;
            default:
                ldaVar.c0.N0 = true;
                ldaVar.I.clear();
                ldaVar.J.clear();
                ldaVar.K.clear();
                ldaVar.invalidate();
                return;
        }
    }
}
