package defpackage;
public final class f3c implements Runnable {
    public final byte a;
    public final icc b;
    public final String c;

    public f3c(icc iccVar, String str, byte b) {
        this.a = b;
        this.b = iccVar;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        icc iccVar = this.b;
        switch (b) {
            case 0:
                iccVar.a(str, Boolean.FALSE);
                return;
            case 1:
                iccVar.a(null, str);
                return;
            case 2:
                iccVar.a(null, str);
                return;
            default:
                iccVar.a(null, str);
                return;
        }
    }
}
