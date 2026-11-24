package defpackage;
public final class i4b implements Runnable {
    public final byte a;
    public final m4b b;

    public i4b(m4b m4bVar, byte b) {
        this.a = b;
        this.b = m4bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m4b m4bVar = this.b;
        switch (b) {
            case 0:
                m4bVar.b();
                return;
            case 1:
                gl.c3(new i4b(m4bVar, (byte) 0));
                return;
            case 2:
                m4bVar.dismiss();
                return;
            default:
                ae9 ae9Var = m4bVar.I;
                if (ae9Var != null) {
                    ae9Var.a(null);
                    m4bVar.I = null;
                }
                m4bVar.dismiss();
                return;
        }
    }
}
