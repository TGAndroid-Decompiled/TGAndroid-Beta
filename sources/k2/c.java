package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f17163a;
    public final MediaCodec.CryptoInfo.Pattern f17164b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f17163a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.f17164b.set(i7, i10);
        cVar.f17163a.setPattern(cVar.f17164b);
    }
}
