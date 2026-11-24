package defpackage;
public final class j6b implements Runnable {
    public final byte a;
    public final n6b b;

    public j6b(n6b n6bVar, byte b) {
        this.a = b;
        this.b = n6bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        n6b n6bVar = this.b;
        switch (b) {
            case 0:
                n6bVar.b();
                return;
            case 1:
                gm.c3(new j6b(n6bVar, (byte) 0));
                return;
            case 2:
                n6bVar.dismiss();
                return;
            default:
                eg9 eg9Var = n6bVar.I;
                if (eg9Var != null) {
                    eg9Var.a(null);
                    n6bVar.I = null;
                }
                n6bVar.dismiss();
                return;
        }
    }
}
