package n3;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.h4;
public final class c {
    public final MediaCodec.CryptoInfo f15196a;
    public final MediaCodec.CryptoInfo.Pattern f15197b = h4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f15196a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f15197b.set(i10, i11);
        cVar.f15196a.setPattern(cVar.f15197b);
    }
}
