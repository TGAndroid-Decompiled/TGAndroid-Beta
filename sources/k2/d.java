package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f17165a;
    public byte[] f17166b;
    public int f17167c;
    public int[] d;
    public int[] f17168e;
    public int f17169f;
    public int f17170g;
    public int h;
    public final MediaCodec.CryptoInfo f17171i;
    public final c f17172j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17171i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f17172j = cVar;
    }
}
