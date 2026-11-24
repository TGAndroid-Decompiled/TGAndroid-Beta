package defpackage;
public final class kva implements Runnable {
    public final byte a;
    public final bwa b;

    public kva(bwa bwaVar, byte b) {
        this.a = b;
        this.b = bwaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bwa bwaVar = this.b;
        switch (b) {
            case 0:
                bwaVar.N1 = true;
                bwaVar.E0(null);
                gl.e3(new kva(bwaVar, (byte) 1), 240L);
                return;
            case 1:
                bwaVar.dismiss();
                return;
            default:
                qva qvaVar = bwaVar.s1;
                qvaVar.G = false;
                qvaVar.invalidate();
                return;
        }
    }
}
