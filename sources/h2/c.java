package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f10319a;
    public final MediaCodec.CryptoInfo.Pattern f10320b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10319a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10320b.set(i10, i11);
        cVar.f10319a.setPattern(cVar.f10320b);
    }
}
