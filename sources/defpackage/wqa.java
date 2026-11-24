package defpackage;
public final class wqa {
    public final float a;
    public final tgb b;
    public final tgb c;

    public wqa(float f, String str, CharSequence charSequence) {
        this.b = new tgb(str, 12.0f, null);
        this.c = new tgb(charSequence, 12.0f, gl.o());
        this.a = (a() / 2.0f) + f;
    }

    public final float a() {
        return Math.max(this.b.h(), this.c.h());
    }
}
