package defpackage;
public final class k00 {
    public boolean a;
    public boolean b;
    public boolean c;

    public k00() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public final l00 a() {
        if (!this.a && (this.b || this.c)) {
            grb.i("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
        return new l00(this);
    }

    public k00(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
