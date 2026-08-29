package h7;
public final class l implements s9.g {
    public final int f7685a;
    public boolean f7686b = false;
    public boolean f7687c = false;
    public s9.c d;
    public final s9.e f7688e;

    public l(s9.e eVar, int i10) {
        this.f7685a = i10;
        this.f7688e = eVar;
    }

    @Override
    public final s9.g f(String str) {
        switch (this.f7685a) {
            case 0:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((k) this.f7688e).g(this.d, str, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((i7.f) this.f7688e).g(this.d, str, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((j7.j0) this.f7688e).g(this.d, str, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((l7.y) this.f7688e).g(this.d, str, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((v9.e) this.f7688e).h(this.d, str, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final s9.g g(boolean z10) {
        switch (this.f7685a) {
            case 0:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((k) this.f7688e).h(this.d, z10 ? 1 : 0, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((i7.f) this.f7688e).h(this.d, z10 ? 1 : 0, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((j7.j0) this.f7688e).h(this.d, z10 ? 1 : 0, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((l7.y) this.f7688e).h(this.d, z10 ? 1 : 0, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f7686b) {
                    this.f7686b = true;
                    ((v9.e) this.f7688e).g(this.d, z10 ? 1 : 0, this.f7687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
