package defpackage;
public final class jz9 implements Runnable {
    public final byte a;
    public final pz b;

    public jz9(pz pzVar, byte b) {
        this.a = b;
        this.b = pzVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pz pzVar = this.b;
        switch (b) {
            case 0:
                gm.E3(((ny9) pzVar.f2).h);
                return;
            default:
                pzVar.requestFocus();
                return;
        }
    }
}
