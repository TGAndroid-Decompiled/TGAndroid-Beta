package defpackage;
public final class vib extends ui6 {
    public String g;

    public vib(String str) {
        this.g = str;
    }

    @Override
    public final void a(knd kndVar) {
        kndVar.o(this);
    }

    @Override
    public final String f() {
        return "literal=" + this.g;
    }
}
