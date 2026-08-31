package n3;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.h4;
public final class c {
    public final MediaCodec.CryptoInfo f15194a;
    public final MediaCodec.CryptoInfo.Pattern f15195b = h4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f15194a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f15195b.set(i10, i11);
        cVar.f15194a.setPattern(cVar.f15195b);
    }
}
