package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f12558a;
    public final MediaCodec.CryptoInfo.Pattern f12559b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f12558a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f12559b.set(i10, i11);
        cVar.f12558a.setPattern(cVar.f12559b);
    }
}
