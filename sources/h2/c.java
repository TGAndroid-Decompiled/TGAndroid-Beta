package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f12559a;
    public final MediaCodec.CryptoInfo.Pattern f12560b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f12559a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f12560b.set(i10, i11);
        cVar.f12559a.setPattern(cVar.f12560b);
    }
}
