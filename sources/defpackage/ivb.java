package defpackage;
public final class ivb extends ehc {
    public boolean a = false;
    public final byte b;
    public final jvb c;

    public ivb(jvb jvbVar, int i) {
        this.c = jvbVar;
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
