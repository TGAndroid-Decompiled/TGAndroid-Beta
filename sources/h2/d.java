package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10083a;
    public byte[] f10084b;
    public int f10085c;
    public int[] d;
    public int[] e;
    public int f10086f;
    public int f10087g;
    public int h;
    public final MediaCodec.CryptoInfo f10088i;
    public final c f10089j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10088i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10089j = cVar;
    }
}
