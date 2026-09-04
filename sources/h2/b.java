package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;
public final class b {
    public final MediaCodec.CryptoInfo f10836a;
    public final MediaCodec.CryptoInfo.Pattern f10837b = k4.a();

    public b(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10836a = cryptoInfo;
    }

    public static void a(b bVar, int i10, int i11) {
        bVar.f10837b.set(i10, i11);
        bVar.f10836a.setPattern(bVar.f10837b);
    }
}
