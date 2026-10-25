package a8;
public final class i0 implements ka.g {
    public final int f538a;
    public boolean f539b = false;
    public boolean f540c = false;
    public ka.c d;
    public final ka.e e;

    public i0(ka.e eVar, int i10) {
        this.f538a = i10;
        this.e = eVar;
    }

    @Override
    public final ka.g b(String str) {
        switch (this.f538a) {
            case 0:
                if (!this.f539b) {
                    this.f539b = true;
                    ((g0) this.e).c(this.d, str, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f539b) {
                    this.f539b = true;
                    ((na.e) this.e).h(this.d, str, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f539b) {
                    this.f539b = true;
                    ((w7.j) this.e).c(this.d, str, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f539b) {
                    this.f539b = true;
                    ((x7.f) this.e).c(this.d, str, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f539b) {
                    this.f539b = true;
                    ((y7.d0) this.e).c(this.d, str, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ka.g c(boolean z10) {
        switch (this.f538a) {
            case 0:
                if (!this.f539b) {
                    this.f539b = true;
                    ((g0) this.e).h(this.d, z10 ? 1 : 0, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f539b) {
                    this.f539b = true;
                    ((na.e) this.e).c(this.d, z10 ? 1 : 0, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f539b) {
                    this.f539b = true;
                    ((w7.j) this.e).h(this.d, z10 ? 1 : 0, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f539b) {
                    this.f539b = true;
                    ((x7.f) this.e).h(this.d, z10 ? 1 : 0, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f539b) {
                    this.f539b = true;
                    ((y7.d0) this.e).h(this.d, z10 ? 1 : 0, this.f540c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
