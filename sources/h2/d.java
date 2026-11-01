package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f7578a;
    public byte[] f7579b;
    public int f7580c;
    public int[] d;
    public int[] e;
    public int f7581f;
    public int f7582g;
    public int h;
    public final MediaCodec.CryptoInfo f7583i;
    public final c f7584j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f7583i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f7584j = cVar;
    }
}
