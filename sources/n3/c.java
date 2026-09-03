package n3;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f14208a;
    public final MediaCodec.CryptoInfo.Pattern f14209b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14208a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f14209b.set(i10, i11);
        cVar.f14208a.setPattern(cVar.f14209b);
    }
}
