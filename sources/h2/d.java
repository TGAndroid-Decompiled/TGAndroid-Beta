package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10075a;
    public byte[] f10076b;
    public int f10077c;
    public int[] d;
    public int[] e;
    public int f10078f;
    public int f10079g;
    public int h;
    public final MediaCodec.CryptoInfo f10080i;
    public final c f10081j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10080i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10081j = cVar;
    }
}
