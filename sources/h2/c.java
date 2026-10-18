package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f11626a;
    public final MediaCodec.CryptoInfo.Pattern f11627b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f11626a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f11627b.set(i10, i11);
        cVar.f11626a.setPattern(cVar.f11627b);
    }
}
