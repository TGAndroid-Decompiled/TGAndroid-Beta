package m3;

import android.media.MediaCodec;
public final class c {
    public final MediaCodec.CryptoInfo f16807a;
    public final MediaCodec.CryptoInfo.Pattern f16808b = b9.b.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f16807a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f16808b.set(i10, i11);
        cVar.f16807a.setPattern(cVar.f16808b);
    }
}
