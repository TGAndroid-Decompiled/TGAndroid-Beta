package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class c {
    public final MediaCodec.CryptoInfo f10081a;
    public final MediaCodec.CryptoInfo.Pattern f10082b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10081a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10082b.set(i10, i11);
        cVar.f10081a.setPattern(cVar.f10082b);
    }
}
