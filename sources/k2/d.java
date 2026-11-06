package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f17162a;
    public byte[] f17163b;
    public int f17164c;
    public int[] d;
    public int[] f17165e;
    public int f17166f;
    public int f17167g;
    public int h;
    public final MediaCodec.CryptoInfo f17168i;
    public final c f17169j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17168i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f17169j = cVar;
    }
}
