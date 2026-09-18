package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class c {
    public final MediaCodec.CryptoInfo f10085a;
    public final MediaCodec.CryptoInfo.Pattern f10086b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10085a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10086b.set(i10, i11);
        cVar.f10085a.setPattern(cVar.f10086b);
    }
}
