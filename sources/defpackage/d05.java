package defpackage;
public final class d05 implements Runnable {
    public final byte a;
    public final i8c b;
    public final Exception c;

    public d05(i8c i8cVar, Exception exc, byte b) {
        this.a = b;
        this.b = i8cVar;
        this.c = exc;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = "NULL_ERROR";
        Exception exc = this.c;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                if (exc.getMessage() != null) {
                    str = exc.getMessage();
                }
                i8cVar.a(null, str);
                return;
            case 1:
                if (exc.getMessage() != null) {
                    str = exc.getMessage();
                }
                i8cVar.a(null, str);
                return;
            case 2:
                i8cVar.a(null, exc.getMessage());
                return;
            default:
                i8cVar.a(null, exc.getMessage());
                return;
        }
    }
}
