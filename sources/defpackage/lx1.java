package defpackage;
public final class lx1 implements qs3 {
    public boolean a = false;
    public final float b;
    public final wla c;

    public lx1(float f, wla wlaVar) {
        this.b = f;
        this.c = wlaVar;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        if (!this.a && f >= this.b) {
            this.a = true;
            try {
                this.c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
