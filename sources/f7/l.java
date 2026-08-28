package f7;
public final class l implements q9.g {
    public final int f5734a;
    public boolean f5735b = false;
    public boolean f5736c = false;
    public q9.c d;
    public final q9.e f5737e;

    public l(q9.e eVar, int i9) {
        this.f5734a = i9;
        this.f5737e = eVar;
    }

    @Override
    public final q9.g e(String str) {
        switch (this.f5734a) {
            case 0:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((k) this.f5737e).f(this.d, str, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((g7.f) this.f5737e).f(this.d, str, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((h7.j0) this.f5737e).f(this.d, str, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((j7.y) this.f5737e).f(this.d, str, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((t9.e) this.f5737e).h(this.d, str, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final q9.g f(boolean z10) {
        switch (this.f5734a) {
            case 0:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((k) this.f5737e).h(this.d, z10 ? 1 : 0, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((g7.f) this.f5737e).h(this.d, z10 ? 1 : 0, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((h7.j0) this.f5737e).h(this.d, z10 ? 1 : 0, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((j7.y) this.f5737e).h(this.d, z10 ? 1 : 0, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f5735b) {
                    this.f5735b = true;
                    ((t9.e) this.f5737e).f(this.d, z10 ? 1 : 0, this.f5736c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
