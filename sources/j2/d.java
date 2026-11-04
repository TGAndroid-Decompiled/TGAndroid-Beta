package j2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f16147a;
    public byte[] f16148b;
    public int f16149c;
    public int[] d;
    public int[] f16150e;
    public int f16151f;
    public int f16152g;
    public int h;
    public final MediaCodec.CryptoInfo f16153i;
    public final c f16154j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f16153i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f16154j = cVar;
    }
}
