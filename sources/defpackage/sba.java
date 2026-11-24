package defpackage;
public final class sba implements Runnable {
    public final byte a;
    public final nfa b;
    public final int c;

    public sba(nfa nfaVar, int i, byte b) {
        this.a = b;
        this.b = nfaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        nfa nfaVar = this.b;
        switch (b) {
            case 0:
                nfaVar.o1(i);
                return;
            case 1:
                nfaVar.U0(i, nfaVar.m1, nfaVar.y1);
                return;
            case 2:
                nfaVar.n1(i, false);
                return;
            case 3:
                nfaVar.o1(i);
                return;
            default:
                nfaVar.V0(i, nfaVar.m1, nfaVar.y1);
                return;
        }
    }
}
