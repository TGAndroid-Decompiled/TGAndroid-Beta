package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class c {
    public final MediaCodec.CryptoInfo f10864a;
    public final MediaCodec.CryptoInfo.Pattern f10865b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10864a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10865b.set(i10, i11);
        cVar.f10864a.setPattern(cVar.f10865b);
    }
}
