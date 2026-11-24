package defpackage;
public final class i3c implements Runnable {
    public final byte a;
    public final p3c b;
    public final byte[] c;

    public i3c(p3c p3cVar, byte[] bArr, byte b) {
        this.a = b;
        this.b = p3cVar;
        this.c = bArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        byte[] bArr = this.c;
        p3c p3cVar = this.b;
        switch (b) {
            case 0:
                p3cVar.r0(bArr);
                return;
            default:
                p3cVar.A0();
                p3cVar.W = bArr;
                p3cVar.getMessagesController().n4(0L, "VALIDATE_PASSWORD");
                p3c p3cVar2 = new p3c(9, p3cVar.V);
                p3cVar2.I = p3cVar.I;
                p3cVar2.H = p3cVar.H;
                p3cVar.presentFragment(p3cVar2, true);
                return;
        }
    }
}
