package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f18114a;
    public byte[] f18115b;
    public int f18116c;
    public int[] d;
    public int[] f18117e;
    public int f18118f;
    public int f18119g;
    public int h;
    public final MediaCodec.CryptoInfo f18120i;
    public final c f18121j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f18120i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f18121j = cVar;
    }
}
