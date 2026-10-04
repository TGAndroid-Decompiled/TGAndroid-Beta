package o2;

import java.util.Arrays;
import v7.m7;
public final class e extends v2.e {
    public byte[] f17004s;
    public volatile boolean v;
    public byte[] f17005w;

    @Override
    public final void a() {
        try {
            this.f47784r.open(this.f47779b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f17004s;
                if (bArr.length < i11 + 16384) {
                    this.f17004s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f47784r.read(this.f17004s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f17005w = Arrays.copyOf(this.f17004s, i11);
            }
            m7.a(this.f47784r);
        } catch (Throwable th2) {
            m7.a(this.f47784r);
            throw th2;
        }
    }

    @Override
    public final void q() {
        this.v = true;
    }
}
