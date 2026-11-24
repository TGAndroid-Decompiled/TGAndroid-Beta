package defpackage;
public final class ika extends vk4 {
    public final gka a;
    public final hka b;
    public float c = 1.0f;

    public ika(gka gkaVar, hka hkaVar) {
        this.a = gkaVar;
        this.b = hkaVar;
    }

    @Override
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override
    public final void b(Object obj, float f) {
        this.b.d(obj, f / this.c);
    }
}
