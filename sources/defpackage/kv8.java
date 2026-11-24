package defpackage;
public final class kv8 implements abc {
    public final byte a;
    public boolean b = false;
    public boolean c = false;
    public wa4 d;
    public final dq7 e;

    public kv8(dq7 dq7Var, byte b) {
        this.a = b;
        this.e = dq7Var;
    }

    @Override
    public final abc b(String str) {
        byte b = this.a;
        dq7 dq7Var = this.e;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((iv8) dq7Var).i(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((aad) dq7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((qad) dq7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((rkd) dq7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((vmd) dq7Var).c(this.d, str, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final abc c(boolean z) {
        byte b = this.a;
        dq7 dq7Var = this.e;
        switch (b) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    ((iv8) dq7Var).c(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((aad) dq7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.b) {
                    this.b = true;
                    ((qad) dq7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.b) {
                    this.b = true;
                    ((rkd) dq7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.b) {
                    this.b = true;
                    ((vmd) dq7Var).h(this.d, z ? 1 : 0, this.c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
