package n3;

import android.media.MediaCodec;
import h5.d0;
public final class d {
    public byte[] f15196a;
    public byte[] f15197b;
    public int f15198c;
    public int[] d;
    public int[] f15199e;
    public int f15200f;
    public int f15201g;
    public int h;
    public final MediaCodec.CryptoInfo f15202i;
    public final c f15203j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f15202i = cryptoInfo;
        if (d0.f7237a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f15203j = cVar;
    }
}
