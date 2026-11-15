package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f17722a;
    public byte[] f17723b;
    public int f17724c;
    public int[] d;
    public int[] f17725e;
    public int f17726f;
    public int f17727g;
    public int h;
    public final MediaCodec.CryptoInfo f17728i;
    public final c f17729j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17728i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f17729j = cVar;
    }
}
