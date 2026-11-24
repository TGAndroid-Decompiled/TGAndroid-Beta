package defpackage;
public final class d25 implements Runnable {
    public final byte a;
    public final jac b;
    public final Exception c;

    public d25(jac jacVar, Exception exc, byte b) {
        this.a = b;
        this.b = jacVar;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = "NULL_ERROR";
        Exception exc = this.c;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                if (exc.getMessage() != null) {
                    str = exc.getMessage();
                }
                jacVar.a(null, str);
                return;
            case 1:
                if (exc.getMessage() != null) {
                    str = exc.getMessage();
                }
                jacVar.a(null, str);
                return;
            case 2:
                jacVar.a(null, exc.getMessage());
                return;
            default:
                jacVar.a(null, exc.getMessage());
                return;
        }
    }
}
