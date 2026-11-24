package defpackage;
public final class jt8 implements z8c {
    public final byte a;
    public boolean b = false;
    public boolean c = false;
    public w84 d;
    public final ao7 e;

    public jt8(ao7 ao7Var, byte b) {
        this.a = b;
        this.e = ao7Var;
    }

    @Override
    public final z8c b(String str) {
        byte b = this.a;
        ao7 ao7Var = this.e;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((ht8) ao7Var).i(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((y7d) ao7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((o8d) ao7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((pid) ao7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((tkd) ao7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final z8c c(boolean z) {
        byte b = this.a;
        ao7 ao7Var = this.e;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((ht8) ao7Var).c(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((y7d) ao7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((o8d) ao7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((pid) ao7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((tkd) ao7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
