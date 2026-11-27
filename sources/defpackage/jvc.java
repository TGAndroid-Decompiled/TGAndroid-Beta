package defpackage;
public final class jvc implements Runnable {
    public final byte a = 0;
    public final lvc b;
    public final kvc c;
    public final avc d;

    public jvc(lvc lvcVar, avc avcVar, kvc kvcVar) {
        this.b = lvcVar;
        this.d = avcVar;
        this.c = kvcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        avc avcVar = this.d;
        kvc kvcVar = this.c;
        lvc lvcVar = this.b;
        switch (b) {
            case 0:
                if (avcVar != null) {
                    lvcVar.a(kvcVar, avcVar);
                    return;
                } else if (kvcVar.e != null) {
                    lvcVar.c(kvcVar);
                    return;
                } else {
                    lvcVar.e(kvcVar);
                    return;
                }
            default:
                lvcVar.a(kvcVar, avcVar);
                return;
        }
    }

    public jvc(lvc lvcVar, kvc kvcVar, avc avcVar) {
        this.b = lvcVar;
        this.c = kvcVar;
        this.d = avcVar;
    }
}
