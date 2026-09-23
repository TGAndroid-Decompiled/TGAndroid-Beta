package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class c {
    public final MediaCodec.CryptoInfo f10068a;
    public final MediaCodec.CryptoInfo.Pattern f10069b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10068a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10069b.set(i10, i11);
        cVar.f10068a.setPattern(cVar.f10069b);
    }
}
