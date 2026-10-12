package la;

import v7.j;
import x7.e0;
import z7.y;
public final class h implements ia.g {
    public final int f15211a;
    public boolean f15212b = false;
    public boolean f15213c = false;
    public ia.c d;
    public final ia.e f15214e;

    public h(ia.e eVar, int i10) {
        this.f15211a = i10;
        this.f15214e = eVar;
    }

    @Override
    public final ia.g b(String str) {
        switch (this.f15211a) {
            case 0:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((f) this.f15214e).h(this.d, str, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((j) this.f15214e).d(this.d, str, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((w7.f) this.f15214e).d(this.d, str, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((e0) this.f15214e).d(this.d, str, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((y) this.f15214e).d(this.d, str, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override
    public final ia.g d(boolean z10) {
        switch (this.f15211a) {
            case 0:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((f) this.f15214e).d(this.d, z10 ? 1 : 0, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 1:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((j) this.f15214e).h(this.d, z10 ? 1 : 0, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 2:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((w7.f) this.f15214e).h(this.d, z10 ? 1 : 0, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            case 3:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((e0) this.f15214e).h(this.d, z10 ? 1 : 0, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f15212b) {
                    this.f15212b = true;
                    ((y) this.f15214e).h(this.d, z10 ? 1 : 0, this.f15213c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
