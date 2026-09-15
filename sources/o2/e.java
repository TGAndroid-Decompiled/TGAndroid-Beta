package o2;

import java.util.Arrays;
import v7.m7;
public final class e extends v2.e {
    public byte[] f15369s;
    public volatile boolean v;
    public byte[] f15370w;

    @Override
    public final void H() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f43847r.open(this.f43843b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f15369s;
                if (bArr.length < i11 + 16384) {
                    this.f15369s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f43847r.read(this.f15369s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f15370w = Arrays.copyOf(this.f15369s, i11);
            }
            m7.a(this.f43847r);
        } catch (Throwable th2) {
            m7.a(this.f43847r);
            throw th2;
        }
    }
}
