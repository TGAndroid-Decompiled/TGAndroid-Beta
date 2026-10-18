package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f11626a;
    public byte[] f11627b;
    public int f11628c;
    public int[] d;
    public int[] e;
    public int f11629f;
    public int f11630g;
    public int h;
    public final MediaCodec.CryptoInfo f11631i;
    public final c f11632j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f11631i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f11632j = cVar;
    }
}
