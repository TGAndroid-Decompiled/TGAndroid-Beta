package defpackage;
public final class g1c implements Runnable {
    public final byte a;
    public final jac b;
    public final String c;

    public g1c(jac jacVar, String str, byte b) {
        this.a = b;
        this.b = jacVar;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        jac jacVar = this.b;
        switch (b) {
            case 0:
                jacVar.a(str, Boolean.FALSE);
                return;
            case 1:
                jacVar.a(null, str);
                return;
            case 2:
                jacVar.a(null, str);
                return;
            default:
                jacVar.a(null, str);
                return;
        }
    }
}
