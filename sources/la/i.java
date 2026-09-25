package la;

import v7.k;
import x7.e0;
import z7.y;
public final class i implements ia.g {
    public final int f14168a;
    public boolean f14169b = false;
    public boolean f14170c = false;
    public ia.c d;
    public final ia.e e;

    public i(ia.e eVar, int i10) {
        this.f14168a = i10;
        this.e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f14168a) {
            case 0:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((f) this.e).h(this.d, str, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((k) this.e).d(this.d, str, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((w7.f) this.e).d(this.d, str, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((e0) this.e).d(this.d, str, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((y) this.e).d(this.d, str, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f14168a) {
            case 0:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((f) this.e).d(this.d, z10 ? 1 : 0, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((k) this.e).h(this.d, z10 ? 1 : 0, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((w7.f) this.e).h(this.d, z10 ? 1 : 0, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((e0) this.e).h(this.d, z10 ? 1 : 0, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f14169b) {
                    this.f14169b = true;
                    ((y) this.e).h(this.d, z10 ? 1 : 0, this.f14170c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
