package defpackage;
public final class xua {
    public final float a;
    public final pkb b;
    public final pkb c;

    public xua(float f, String str, CharSequence charSequence) {
        this.b = new pkb(str, 12.0f, null);
        this.c = new pkb(charSequence, 12.0f, hl.o());
        this.a = (a() / 2.0f) + f;
    }

    public final float a() {
        return Math.max(this.b.h(), this.c.h());
    }
}
