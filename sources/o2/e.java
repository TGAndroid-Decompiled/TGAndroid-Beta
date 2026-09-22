package o2;

import java.util.Arrays;
import v7.m7;
public final class e extends v2.e {
    public byte[] f15367s;
    public volatile boolean v;
    public byte[] f15368w;

    @Override
    public final void H() {
        this.v = true;
    }

    @Override
    public final void a() {
        try {
            this.f43843r.open(this.f43839b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f15367s;
                if (bArr.length < i11 + 16384) {
                    this.f15367s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f43843r.read(this.f15367s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f15368w = Arrays.copyOf(this.f15367s, i11);
            }
            m7.a(this.f43843r);
        } catch (Throwable th2) {
            m7.a(this.f43843r);
            throw th2;
        }
    }
}
