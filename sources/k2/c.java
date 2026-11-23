package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f18109a;
    public final MediaCodec.CryptoInfo.Pattern f18110b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f18109a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.f18110b.set(i7, i10);
        cVar.f18109a.setPattern(cVar.f18110b);
    }
}
