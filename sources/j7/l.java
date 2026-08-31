package j7;
public final class l implements u9.g {
    public final int f9685a;
    public boolean f9686b = false;
    public boolean f9687c = false;
    public u9.c d;
    public final u9.e f9688e;

    public l(u9.e eVar, int i10) {
        this.f9685a = i10;
        this.f9688e = eVar;
    }

    @Override
    public final u9.g f(String str) {
        switch (this.f9685a) {
            case 0:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((k) this.f9688e).g(this.d, str, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((k7.f) this.f9688e).g(this.d, str, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((l7.j0) this.f9688e).g(this.d, str, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((n7.y) this.f9688e).g(this.d, str, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((x9.e) this.f9688e).h(this.d, str, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final u9.g g(boolean z4) {
        switch (this.f9685a) {
            case 0:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((k) this.f9688e).h(this.d, z4 ? 1 : 0, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((k7.f) this.f9688e).h(this.d, z4 ? 1 : 0, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((l7.j0) this.f9688e).h(this.d, z4 ? 1 : 0, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((n7.y) this.f9688e).h(this.d, z4 ? 1 : 0, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f9686b) {
                    this.f9686b = true;
                    ((x9.e) this.f9688e).g(this.d, z4 ? 1 : 0, this.f9687c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
