package k3;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f14587a;
    public final MediaCodec.CryptoInfo.Pattern f14588b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14587a = cryptoInfo;
    }

    public static void a(c cVar, int i9, int i10) {
        cVar.f14588b.set(i9, i10);
        cVar.f14587a.setPattern(cVar.f14588b);
    }
}
