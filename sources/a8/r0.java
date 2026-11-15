package a8;
public final class r0 implements na.g {
    public final int f603a;
    public boolean f604b = false;
    public boolean f605c = false;
    public na.c d;
    public final na.e f606e;

    public r0(na.e eVar, int i7) {
        this.f603a = i7;
        this.f606e = eVar;
    }

    @Override
    public final na.g f(String str) {
        switch (this.f603a) {
            case 0:
                if (!this.f604b) {
                    this.f604b = true;
                    ((q0) this.f606e).g(this.d, str, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f604b) {
                    this.f604b = true;
                    ((c8.y) this.f606e).g(this.d, str, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f604b) {
                    this.f604b = true;
                    ((qa.e) this.f606e).h(this.d, str, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f604b) {
                    this.f604b = true;
                    ((y7.j) this.f606e).g(this.d, str, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f604b) {
                    this.f604b = true;
                    ((z7.f) this.f606e).g(this.d, str, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final na.g g(boolean z10) {
        switch (this.f603a) {
            case 0:
                if (!this.f604b) {
                    this.f604b = true;
                    ((q0) this.f606e).h(this.d, z10 ? 1 : 0, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f604b) {
                    this.f604b = true;
                    ((c8.y) this.f606e).h(this.d, z10 ? 1 : 0, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f604b) {
                    this.f604b = true;
                    ((qa.e) this.f606e).g(this.d, z10 ? 1 : 0, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f604b) {
                    this.f604b = true;
                    ((y7.j) this.f606e).h(this.d, z10 ? 1 : 0, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f604b) {
                    this.f604b = true;
                    ((z7.f) this.f606e).h(this.d, z10 ? 1 : 0, this.f605c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
