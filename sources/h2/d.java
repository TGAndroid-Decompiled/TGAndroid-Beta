package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f7577a;
    public byte[] f7578b;
    public int f7579c;
    public int[] d;
    public int[] e;
    public int f7580f;
    public int f7581g;
    public int h;
    public final MediaCodec.CryptoInfo f7582i;
    public final c f7583j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f7582i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f7583j = cVar;
    }
}
