package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f11652a;
    public byte[] f11653b;
    public int f11654c;
    public int[] d;
    public int[] e;
    public int f11655f;
    public int f11656g;
    public int h;
    public final MediaCodec.CryptoInfo f11657i;
    public final c f11658j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f11657i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f11658j = cVar;
    }
}
