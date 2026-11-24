package defpackage;
public final class fzb implements Runnable {
    public final byte a;
    public final i8c b;
    public final String c;

    public fzb(i8c i8cVar, String str, byte b) {
        this.a = b;
        this.b = i8cVar;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        i8c i8cVar = this.b;
        switch (b) {
            case 0:
                i8cVar.a(str, Boolean.FALSE);
                return;
            case 1:
                i8cVar.a(null, str);
                return;
            case 2:
                i8cVar.a(null, str);
                return;
            default:
                i8cVar.a(null, str);
                return;
        }
    }
}
