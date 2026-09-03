package j7;
public final class l implements u9.g {
    public final int f9050a;
    public boolean f9051b = false;
    public boolean f9052c = false;
    public u9.c d;
    public final u9.e e;

    public l(u9.e eVar, int i10) {
        this.f9050a = i10;
        this.e = eVar;
    }

    @Override
    public final u9.g f(String str) {
        switch (this.f9050a) {
            case 0:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((k) this.e).g(this.d, str, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((k7.f) this.e).g(this.d, str, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((l7.j0) this.e).g(this.d, str, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((n7.y) this.e).g(this.d, str, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((x9.e) this.e).h(this.d, str, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final u9.g g(boolean z4) {
        switch (this.f9050a) {
            case 0:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((k) this.e).h(this.d, z4 ? 1 : 0, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((k7.f) this.e).h(this.d, z4 ? 1 : 0, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((l7.j0) this.e).h(this.d, z4 ? 1 : 0, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((n7.y) this.e).h(this.d, z4 ? 1 : 0, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f9051b) {
                    this.f9051b = true;
                    ((x9.e) this.e).g(this.d, z4 ? 1 : 0, this.f9052c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
