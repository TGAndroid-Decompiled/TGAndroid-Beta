package defpackage;
public final class ky1 implements it3 {
    public boolean a = false;
    public final float b;
    public final dka c;

    public ky1(float f, dka dkaVar) {
        this.b = f;
        this.c = dkaVar;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        if (!this.a && f >= this.b) {
            this.a = true;
            try {
                this.c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
