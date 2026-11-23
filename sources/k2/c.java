package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f18146a;
    public final MediaCodec.CryptoInfo.Pattern f18147b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f18146a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.f18147b.set(i7, i10);
        cVar.f18146a.setPattern(cVar.f18147b);
    }
}
