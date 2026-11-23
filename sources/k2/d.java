package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f18111a;
    public byte[] f18112b;
    public int f18113c;
    public int[] d;
    public int[] f18114e;
    public int f18115f;
    public int f18116g;
    public int h;
    public final MediaCodec.CryptoInfo f18117i;
    public final c f18118j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f18117i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f18118j = cVar;
    }
}
