package n3;

import android.media.MediaCodec;
import h5.d0;
public final class d {
    public byte[] f14225a;
    public byte[] f14226b;
    public int f14227c;
    public int[] d;
    public int[] e;
    public int f14228f;
    public int f14229g;
    public int h;
    public final MediaCodec.CryptoInfo f14230i;
    public final c f14231j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f14230i = cryptoInfo;
        if (d0.f6937a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f14231j = cVar;
    }
}
