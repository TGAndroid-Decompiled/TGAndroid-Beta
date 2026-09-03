package n3;

import android.media.MediaCodec;
import h5.d0;
public final class d {
    public byte[] f15198a;
    public byte[] f15199b;
    public int f15200c;
    public int[] d;
    public int[] f15201e;
    public int f15202f;
    public int f15203g;
    public int h;
    public final MediaCodec.CryptoInfo f15204i;
    public final c f15205j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f15204i = cryptoInfo;
        if (d0.f7237a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f15205j = cVar;
    }
}
