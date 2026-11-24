package defpackage;

import android.media.MediaCodec;
public final class n33 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = z2.b();

    public n33(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public final void a(int i, int i2) {
        this.b.set(i, i2);
        this.a.setPattern(this.b);
    }
}
