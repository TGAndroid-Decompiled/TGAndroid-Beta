package defpackage;
public final class f8b implements Runnable {
    public final byte a;
    public final k8b b;

    public f8b(k8b k8bVar, byte b) {
        this.a = b;
        this.b = k8bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k8b k8bVar = this.b;
        switch (b) {
            case 0:
                k8bVar.b();
                return;
            case 1:
                hl.c3(new f8b(k8bVar, (byte) 0));
                return;
            case 2:
                k8bVar.dismiss();
                return;
            default:
                sh9 sh9Var = k8bVar.I;
                if (sh9Var != null) {
                    sh9Var.a(null);
                    k8bVar.I = null;
                }
                k8bVar.dismiss();
                return;
        }
    }
}
