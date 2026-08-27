package g7;

public final class l implements r9.g {

    public final int f6538a;

    public boolean f6539b = false;

    public boolean f6540c = false;
    public r9.c d;

    public final r9.e f6541e;

    public l(r9.e eVar, int i10) {
        this.f6538a = i10;
        this.f6541e = eVar;
    }

    @Override
    public final r9.g b(String str) {
        switch (this.f6538a) {
            case 0:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((k) this.f6541e).f(this.d, str, this.f6540c);
                return this;
            case 1:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((h7.f) this.f6541e).f(this.d, str, this.f6540c);
                return this;
            case 2:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((i7.j0) this.f6541e).f(this.d, str, this.f6540c);
                return this;
            case 3:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((k7.y) this.f6541e).f(this.d, str, this.f6540c);
                return this;
            default:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((u9.e) this.f6541e).h(this.d, str, this.f6540c);
                return this;
        }
    }

    @Override
    public final r9.g f(boolean z10) {
        switch (this.f6538a) {
            case 0:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((k) this.f6541e).h(this.d, z10 ? 1 : 0, this.f6540c);
                return this;
            case 1:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((h7.f) this.f6541e).h(this.d, z10 ? 1 : 0, this.f6540c);
                return this;
            case 2:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((i7.j0) this.f6541e).h(this.d, z10 ? 1 : 0, this.f6540c);
                return this;
            case 3:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((k7.y) this.f6541e).h(this.d, z10 ? 1 : 0, this.f6540c);
                return this;
            default:
                if (this.f6539b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f6539b = true;
                ((u9.e) this.f6541e).f(this.d, z10 ? 1 : 0, this.f6540c);
                return this;
        }
    }
}
