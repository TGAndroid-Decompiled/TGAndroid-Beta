package h2;

import android.media.MediaCodec;
public final class c {
    public final MediaCodec.CryptoInfo f7575a;
    public final MediaCodec.CryptoInfo.Pattern f7576b = cf.b.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f7575a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f7576b.set(i10, i11);
        cVar.f7575a.setPattern(cVar.f7576b);
    }
}
