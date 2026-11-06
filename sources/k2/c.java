package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;
public final class c {
    public final MediaCodec.CryptoInfo f17160a;
    public final MediaCodec.CryptoInfo.Pattern f17161b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f17160a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.f17161b.set(i7, i10);
        cVar.f17160a.setPattern(cVar.f17161b);
    }
}
