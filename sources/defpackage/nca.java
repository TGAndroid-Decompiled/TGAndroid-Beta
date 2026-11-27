package defpackage;
public final class nca implements Runnable {
    public final byte a;
    public final oca b;

    public nca(oca ocaVar, byte b) {
        this.a = b;
        this.b = ocaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oca ocaVar = this.b;
        switch (b) {
            case 0:
                if (ocaVar.x) {
                    ocaVar.d();
                    return;
                }
                return;
            default:
                ocaVar.invalidateSelf();
                return;
        }
    }
}
