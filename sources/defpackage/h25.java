package defpackage;
public final class h25 implements Runnable {
    public final byte a;
    public final icc b;
    public final Exception c;

    public h25(icc iccVar, Exception exc, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = "NULL_ERROR";
        Exception exc = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                if (exc.getMessage() != null) {
                    str = exc.getMessage();
                }
                iccVar.a(null, str);
                return;
            case 1:
                if (exc.getMessage() != null) {
                    str = exc.getMessage();
                }
                iccVar.a(null, str);
                return;
            case 2:
                iccVar.a(null, exc.getMessage());
                return;
            default:
                iccVar.a(null, exc.getMessage());
                return;
        }
    }
}
