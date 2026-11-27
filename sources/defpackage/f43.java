package defpackage;

import android.media.MediaCodec;
public final class f43 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = a3.b();

    public f43(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public final void a(int i, int i2) {
        this.b.set(i, i2);
        this.a.setPattern(this.b);
    }
}
