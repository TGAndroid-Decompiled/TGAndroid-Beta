package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f11625a;
    public final MediaCodec.CryptoInfo.Pattern f11626b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f11625a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f11626b.set(i10, i11);
        cVar.f11625a.setPattern(cVar.f11626b);
    }
}
