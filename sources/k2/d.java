package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f18148a;
    public byte[] f18149b;
    public int f18150c;
    public int[] d;
    public int[] f18151e;
    public int f18152f;
    public int f18153g;
    public int h;
    public final MediaCodec.CryptoInfo f18154i;
    public final c f18155j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f18154i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f18155j = cVar;
    }
}
