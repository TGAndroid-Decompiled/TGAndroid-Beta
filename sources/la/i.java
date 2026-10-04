package la;

import v7.j;
import x7.e0;
import z7.y;
public final class i implements ia.g {
    public final int f15401a;
    public boolean f15402b = false;
    public boolean f15403c = false;
    public ia.c d;
    public final ia.e f15404e;

    public i(ia.e eVar, int i10) {
        this.f15401a = i10;
        this.f15404e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f15401a) {
            case 0:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((f) this.f15404e).h(this.d, str, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((j) this.f15404e).d(this.d, str, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((w7.f) this.f15404e).d(this.d, str, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((e0) this.f15404e).d(this.d, str, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((y) this.f15404e).d(this.d, str, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f15401a) {
            case 0:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((f) this.f15404e).d(this.d, z10 ? 1 : 0, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((j) this.f15404e).h(this.d, z10 ? 1 : 0, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((w7.f) this.f15404e).h(this.d, z10 ? 1 : 0, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((e0) this.f15404e).h(this.d, z10 ? 1 : 0, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15402b) {
                    this.f15402b = true;
                    ((y) this.f15404e).h(this.d, z10 ? 1 : 0, this.f15403c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
