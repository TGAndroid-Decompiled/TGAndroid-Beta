package defpackage;

import java.util.Arrays;
public final class mg5 extends ni2 {
    public byte[] s;
    public volatile boolean w;
    public byte[] x;

    @Override
    public final void a() {
        try {
            this.r.open(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.w) {
                byte[] bArr = this.s;
                if (bArr.length < i2 + 16384) {
                    bArr = Arrays.copyOf(bArr, bArr.length + 16384);
                    this.s = bArr;
                }
                i = this.r.read(bArr, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.w) {
                this.x = Arrays.copyOf(this.s, i2);
            }
        } finally {
            wde.a(this.r);
        }
    }

    @Override
    public final void e() {
        this.w = true;
    }
}
