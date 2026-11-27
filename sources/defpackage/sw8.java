package defpackage;
public final class sw8 implements zcc {
    public final byte a;
    public boolean b = false;
    public boolean c = false;
    public sa4 d;
    public final ar7 e;

    public sw8(ar7 ar7Var, byte b) {
        this.a = b;
        this.e = ar7Var;
    }

    @Override
    public final zcc b(String str) {
        byte b = this.a;
        ar7 ar7Var = this.e;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((qw8) ar7Var).i(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((rcd) ar7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((hdd) ar7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((gnd) ar7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((kpd) ar7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final zcc c(boolean z) {
        byte b = this.a;
        ar7 ar7Var = this.e;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((qw8) ar7Var).c(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((rcd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((hdd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((gnd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((kpd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
