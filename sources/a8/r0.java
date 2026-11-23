package a8;
public final class r0 implements na.g {
    public final int f602a;
    public boolean f603b = false;
    public boolean f604c = false;
    public na.c d;
    public final na.e f605e;

    public r0(na.e eVar, int i7) {
        this.f602a = i7;
        this.f605e = eVar;
    }

    @Override
    public final na.g f(String str) {
        switch (this.f602a) {
            case 0:
                if (!this.f603b) {
                    this.f603b = true;
                    ((q0) this.f605e).g(this.d, str, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f603b) {
                    this.f603b = true;
                    ((c8.y) this.f605e).g(this.d, str, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f603b) {
                    this.f603b = true;
                    ((qa.e) this.f605e).h(this.d, str, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f603b) {
                    this.f603b = true;
                    ((y7.j) this.f605e).g(this.d, str, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f603b) {
                    this.f603b = true;
                    ((z7.f) this.f605e).g(this.d, str, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final na.g g(boolean z10) {
        switch (this.f602a) {
            case 0:
                if (!this.f603b) {
                    this.f603b = true;
                    ((q0) this.f605e).h(this.d, z10 ? 1 : 0, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f603b) {
                    this.f603b = true;
                    ((c8.y) this.f605e).h(this.d, z10 ? 1 : 0, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f603b) {
                    this.f603b = true;
                    ((qa.e) this.f605e).g(this.d, z10 ? 1 : 0, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f603b) {
                    this.f603b = true;
                    ((y7.j) this.f605e).h(this.d, z10 ? 1 : 0, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f603b) {
                    this.f603b = true;
                    ((z7.f) this.f605e).h(this.d, z10 ? 1 : 0, this.f604c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
