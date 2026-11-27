package defpackage;
public final class bma extends vk4 {
    public final zla a;
    public final ama b;
    public float c = 1.0f;

    public bma(zla zlaVar, ama amaVar) {
        this.a = zlaVar;
        this.b = amaVar;
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
