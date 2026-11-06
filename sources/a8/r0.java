package a8;
public final class r0 implements na.g {
    public final int f600a;
    public boolean f601b = false;
    public boolean f602c = false;
    public na.c d;
    public final na.e f603e;

    public r0(na.e eVar, int i7) {
        this.f600a = i7;
        this.f603e = eVar;
    }

    @Override
    public final na.g f(String str) {
        switch (this.f600a) {
            case 0:
                if (!this.f601b) {
                    this.f601b = true;
                    ((q0) this.f603e).g(this.d, str, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f601b) {
                    this.f601b = true;
                    ((c8.y) this.f603e).g(this.d, str, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f601b) {
                    this.f601b = true;
                    ((qa.e) this.f603e).h(this.d, str, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f601b) {
                    this.f601b = true;
                    ((y7.j) this.f603e).g(this.d, str, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f601b) {
                    this.f601b = true;
                    ((z7.f) this.f603e).g(this.d, str, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final na.g g(boolean z9) {
        switch (this.f600a) {
            case 0:
                if (!this.f601b) {
                    this.f601b = true;
                    ((q0) this.f603e).h(this.d, z9 ? 1 : 0, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f601b) {
                    this.f601b = true;
                    ((c8.y) this.f603e).h(this.d, z9 ? 1 : 0, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f601b) {
                    this.f601b = true;
                    ((qa.e) this.f603e).g(this.d, z9 ? 1 : 0, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f601b) {
                    this.f601b = true;
                    ((y7.j) this.f603e).h(this.d, z9 ? 1 : 0, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f601b) {
                    this.f601b = true;
                    ((z7.f) this.f603e).h(this.d, z9 ? 1 : 0, this.f602c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
