package defpackage;
public final class i7c implements Runnable {
    public final byte a;
    public final o7c b;
    public final byte[] c;

    public i7c(o7c o7cVar, byte[] bArr, byte b) {
        this.a = b;
        this.b = o7cVar;
        this.c = bArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.c;
        o7c o7cVar = this.b;
        switch (b) {
            case 0:
                o7cVar.r0(bArr);
                return;
            default:
                o7cVar.B0();
                o7cVar.W = bArr;
                o7cVar.getMessagesController().v4(0L, "VALIDATE_PASSWORD");
                o7c o7cVar2 = new o7c(9, o7cVar.V);
                o7cVar2.I = o7cVar.I;
                o7cVar2.H = o7cVar.H;
                o7cVar.presentFragment(o7cVar2, true);
                return;
        }
    }
}
