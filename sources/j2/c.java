package j2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.g4;
public final class c {
    public final MediaCodec.CryptoInfo f16145a;
    public final MediaCodec.CryptoInfo.Pattern f16146b = g4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f16145a = cryptoInfo;
    }

    public static void a(c cVar, int i3, int i10) {
        cVar.f16146b.set(i3, i10);
        cVar.f16145a.setPattern(cVar.f16146b);
    }
}
