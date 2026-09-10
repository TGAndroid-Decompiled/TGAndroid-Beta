package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class c {
    public final MediaCodec.CryptoInfo f9199a;
    public final MediaCodec.CryptoInfo.Pattern f9200b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f9199a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f9200b.set(i10, i11);
        cVar.f9199a.setPattern(cVar.f9200b);
    }
}
