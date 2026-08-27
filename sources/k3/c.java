package k3;

import android.media.MediaCodec;

public final class c {

    public final MediaCodec.CryptoInfo f14408a;

    public final MediaCodec.CryptoInfo.Pattern f14409b = a9.b.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14408a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f14409b.set(i10, i11);
        cVar.f14408a.setPattern(cVar.f14409b);
    }
}
