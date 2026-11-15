package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f17720a;
    public final MediaCodec.CryptoInfo.Pattern f17721b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f17720a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.f17721b.set(i7, i10);
        cVar.f17720a.setPattern(cVar.f17721b);
    }
}
