package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f11625a;
    public byte[] f11626b;
    public int f11627c;
    public int[] d;
    public int[] e;
    public int f11628f;
    public int f11629g;
    public int h;
    public final MediaCodec.CryptoInfo f11630i;
    public final c f11631j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f11630i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f11631j = cVar;
    }
}
