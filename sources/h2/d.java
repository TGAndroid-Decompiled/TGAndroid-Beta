package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f11628a;
    public byte[] f11629b;
    public int f11630c;
    public int[] d;
    public int[] e;
    public int f11631f;
    public int f11632g;
    public int h;
    public final MediaCodec.CryptoInfo f11633i;
    public final c f11634j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f11633i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f11634j = cVar;
    }
}
