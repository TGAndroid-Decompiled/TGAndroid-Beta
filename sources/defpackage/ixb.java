package defpackage;
public final class ixb extends djc {
    public boolean a = false;
    public final byte b;
    public final jxb c;

    public ixb(jxb jxbVar, int i) {
        this.c = jxbVar;
        this.b = i;
    }

    @Override
    public final void a() {
        this.a = true;
    }

    @Override
    public final void b() {
        this.c.a.setVisibility(0);
    }

    @Override
    public final void c() {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }
}
