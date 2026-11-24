package defpackage;
public final class gia extends ri4 {
    public final eia a;
    public final fia b;
    public float c = 1.0f;

    public gia(eia eiaVar, fia fiaVar) {
        this.a = eiaVar;
        this.b = fiaVar;
    }

    @Override
    public final float a(Object obj) {
        return this.a.get(obj) * this.c;
    }

    @Override
    public final void b(Object obj, float f) {
        this.b.b(obj, f / this.c);
    }
}
