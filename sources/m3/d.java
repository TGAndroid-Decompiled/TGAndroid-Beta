package m3;

import android.media.MediaCodec;
import f5.d0;
public final class d {
    public byte[] f16809a;
    public byte[] f16810b;
    public int f16811c;
    public int[] d;
    public int[] f16812e;
    public int f16813f;
    public int f16814g;
    public int h;
    public final MediaCodec.CryptoInfo f16815i;
    public final c f16816j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f16815i = cryptoInfo;
        if (d0.f6579a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f16816j = cVar;
    }
}
