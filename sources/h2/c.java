package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class c {
    public final MediaCodec.CryptoInfo f10967a;
    public final MediaCodec.CryptoInfo.Pattern f10968b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10967a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10968b.set(i10, i11);
        cVar.f10967a.setPattern(cVar.f10968b);
    }
}
