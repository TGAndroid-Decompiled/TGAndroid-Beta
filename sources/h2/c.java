package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f11624a;
    public final MediaCodec.CryptoInfo.Pattern f11625b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f11624a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f11625b.set(i10, i11);
        cVar.f11624a.setPattern(cVar.f11625b);
    }
}
