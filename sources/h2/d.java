package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f11627a;
    public byte[] f11628b;
    public int f11629c;
    public int[] d;
    public int[] e;
    public int f11630f;
    public int f11631g;
    public int h;
    public final MediaCodec.CryptoInfo f11632i;
    public final c f11633j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f11632i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f11633j = cVar;
    }
}
