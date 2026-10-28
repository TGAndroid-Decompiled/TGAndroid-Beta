package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f12560a;
    public byte[] f12561b;
    public int f12562c;
    public int[] d;
    public int[] e;
    public int f12563f;
    public int f12564g;
    public int h;
    public final MediaCodec.CryptoInfo f12565i;
    public final c f12566j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f12565i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f12566j = cVar;
    }
}
