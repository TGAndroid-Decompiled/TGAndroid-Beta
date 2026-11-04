package b8;
public final class h0 implements ma.g {
    public final int f2644a;
    public boolean f2645b = false;
    public boolean f2646c = false;
    public ma.c d;
    public final ma.e f2647e;

    public h0(ma.e eVar, int i3) {
        this.f2644a = i3;
        this.f2647e = eVar;
    }

    @Override
    public final ma.g d(String str) {
        switch (this.f2644a) {
            case 0:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((g0) this.f2647e).g(this.d, str, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((pa.e) this.f2647e).h(this.d, str, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((x7.j) this.f2647e).g(this.d, str, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((y7.f) this.f2647e).g(this.d, str, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((z7.d0) this.f2647e).g(this.d, str, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ma.g g(boolean z10) {
        switch (this.f2644a) {
            case 0:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((g0) this.f2647e).h(this.d, z10 ? 1 : 0, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((pa.e) this.f2647e).g(this.d, z10 ? 1 : 0, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((x7.j) this.f2647e).h(this.d, z10 ? 1 : 0, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((y7.f) this.f2647e).h(this.d, z10 ? 1 : 0, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f2645b) {
                    this.f2645b = true;
                    ((z7.d0) this.f2647e).h(this.d, z10 ? 1 : 0, this.f2646c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
