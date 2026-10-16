package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10321a;
    public byte[] f10322b;
    public int f10323c;
    public int[] d;
    public int[] e;
    public int f10324f;
    public int f10325g;
    public int h;
    public final MediaCodec.CryptoInfo f10326i;
    public final c f10327j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10326i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10327j = cVar;
    }
}
