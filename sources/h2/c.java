package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;
public final class c {
    public final MediaCodec.CryptoInfo f10973a;
    public final MediaCodec.CryptoInfo.Pattern f10974b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10973a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.f10974b.set(i10, i11);
        cVar.f10973a.setPattern(cVar.f10974b);
    }
}
