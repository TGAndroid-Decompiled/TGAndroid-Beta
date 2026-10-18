package ma;

import v7.j;
import x7.e0;
import z7.y;
public final class h implements ja.g {
    public final int f16824a;
    public boolean f16825b = false;
    public boolean f16826c = false;
    public ja.c d;
    public final ja.e e;

    public h(ja.e eVar, int i10) {
        this.f16824a = i10;
        this.e = eVar;
    }

    @Override
    public final ja.g b(String str) {
        switch (this.f16824a) {
            case 0:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((f) this.e).h(this.d, str, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((j) this.e).c(this.d, str, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((w7.f) this.e).c(this.d, str, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((e0) this.e).c(this.d, str, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((y) this.e).c(this.d, str, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ja.g c(boolean z10) {
        switch (this.f16824a) {
            case 0:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((f) this.e).c(this.d, z10 ? 1 : 0, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((j) this.e).h(this.d, z10 ? 1 : 0, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((w7.f) this.e).h(this.d, z10 ? 1 : 0, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((e0) this.e).h(this.d, z10 ? 1 : 0, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f16825b) {
                    this.f16825b = true;
                    ((y) this.e).h(this.d, z10 ? 1 : 0, this.f16826c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
