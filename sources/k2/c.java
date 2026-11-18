package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f18115a;
    public final MediaCodec.CryptoInfo.Pattern f18116b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f18115a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.f18116b.set(i7, i10);
        cVar.f18115a.setPattern(cVar.f18116b);
    }
}
