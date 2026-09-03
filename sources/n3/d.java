package n3;

import android.media.MediaCodec;
import h5.d0;
public final class d {
    public byte[] f14210a;
    public byte[] f14211b;
    public int f14212c;
    public int[] d;
    public int[] e;
    public int f14213f;
    public int f14214g;
    public int h;
    public final MediaCodec.CryptoInfo f14215i;
    public final c f14216j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f14215i = cryptoInfo;
        if (d0.f6924a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f14216j = cVar;
    }
}
