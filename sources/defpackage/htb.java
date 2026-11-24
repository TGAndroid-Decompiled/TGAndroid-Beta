package defpackage;
public final class htb extends efc {
    public boolean a = false;
    public final byte b;
    public final itb c;

    public htb(itb itbVar, int i) {
        this.c = itbVar;
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
