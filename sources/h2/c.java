package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class c {
    public final MediaCodec.CryptoInfo f10086a;
    public final MediaCodec.CryptoInfo.Pattern f10087b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10086a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10087b.set(i10, i11);
        cVar.f10086a.setPattern(cVar.f10087b);
    }
}
