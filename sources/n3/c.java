package n3;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f14223a;
    public final MediaCodec.CryptoInfo.Pattern f14224b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14223a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f14224b.set(i10, i11);
        cVar.f14223a.setPattern(cVar.f14224b);
    }
}
