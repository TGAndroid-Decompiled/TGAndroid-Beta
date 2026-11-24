package defpackage;
public final class xw1 implements yr3 {
    public boolean a = false;
    public final float b;
    public final bia c;

    public xw1(float f, bia biaVar) {
        this.b = f;
        this.c = biaVar;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        if (!this.a && f >= this.b) {
            this.a = true;
            try {
                this.c.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }
}
