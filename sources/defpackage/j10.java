package defpackage;
public final class j10 {
    public boolean a;
    public boolean b;
    public boolean c;

    public j10() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public final k10 a() {
        if (!this.a && (this.b || this.c)) {
            dq9.m("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
        return new k10(this);
    }

    public j10(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
