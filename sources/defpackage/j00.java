package defpackage;
public final class j00 {
    public boolean a;
    public boolean b;
    public boolean c;

    public j00() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public final k00 a() {
        if (!this.a && (this.b || this.c)) {
            sc8.j("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
        return new k00(this);
    }

    public j00(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
