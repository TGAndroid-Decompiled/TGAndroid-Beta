package defpackage;
public final class av4 implements Runnable {
    public final byte a;
    public final tv4 b;
    public final p8c c;

    public av4(tv4 tv4Var, p8c p8cVar, byte b) {
        this.a = b;
        this.b = tv4Var;
        this.c = p8cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.c;
        tv4 tv4Var = this.b;
        switch (b) {
            case 0:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                tv4Var.dismiss();
                return;
            case 1:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                tv4Var.dismiss();
                return;
            default:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                tv4Var.dismiss();
                return;
        }
    }
}
