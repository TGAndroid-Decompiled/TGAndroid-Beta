package defpackage;
public final class jtd extends qtd {
    public final transient int c;
    public final transient int d;
    public final qtd e;

    public jtd(qtd qtdVar, int i, int i2) {
        this.e = qtdVar;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final Object get(int i) {
        k3f.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override
    public final Object[] l() {
        return this.e.l();
    }

    @Override
    public final qtd subList(int i, int i2) {
        k3f.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
