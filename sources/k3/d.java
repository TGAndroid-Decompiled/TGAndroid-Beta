package k3;

import android.media.MediaCodec;
import d5.f0;
public final class d {
    public byte[] f14589a;
    public byte[] f14590b;
    public int f14591c;
    public int[] d;
    public int[] f14592e;
    public int f14593f;
    public int f14594g;
    public int h;
    public final MediaCodec.CryptoInfo f14595i;
    public final c f14596j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f14595i = cryptoInfo;
        if (f0.f4349a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f14596j = cVar;
    }
}
