package defpackage;
public final class trc implements qs3 {
    public final byte a;
    public final yrc b;

    public trc(yrc yrcVar, byte b) {
        this.a = b;
        this.b = yrcVar;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        yrc yrcVar = this.b;
        switch (b) {
            case 0:
                yrcVar.c.setScaleX(f);
                yrcVar.c.setScaleY(f);
                return;
            default:
                yrcVar.Q = f2;
                return;
        }
    }
}
