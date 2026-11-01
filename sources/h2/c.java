package h2;

import android.media.MediaCodec;
public final class c {
    public final MediaCodec.CryptoInfo f7576a;
    public final MediaCodec.CryptoInfo.Pattern f7577b = cf.b.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f7576a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f7577b.set(i10, i11);
        cVar.f7576a.setPattern(cVar.f7577b);
    }
}
