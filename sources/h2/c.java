package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f11650a;
    public final MediaCodec.CryptoInfo.Pattern f11651b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f11650a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f11651b.set(i10, i11);
        cVar.f11650a.setPattern(cVar.f11651b);
    }
}
