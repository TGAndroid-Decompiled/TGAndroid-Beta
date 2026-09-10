package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f9201a;
    public byte[] f9202b;
    public int f9203c;
    public int[] d;
    public int[] e;
    public int f9204f;
    public int f9205g;
    public int h;
    public final MediaCodec.CryptoInfo f9206i;
    public final c f9207j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f9206i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f9207j = cVar;
    }
}
