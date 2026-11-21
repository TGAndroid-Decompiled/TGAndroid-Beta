package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f18143a;
    public final MediaCodec.CryptoInfo.Pattern f18144b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f18143a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.f18144b.set(i7, i10);
        cVar.f18143a.setPattern(cVar.f18144b);
    }
}
