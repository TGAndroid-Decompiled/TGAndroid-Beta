package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f12561a;
    public byte[] f12562b;
    public int f12563c;
    public int[] d;
    public int[] e;
    public int f12564f;
    public int f12565g;
    public int h;
    public final MediaCodec.CryptoInfo f12566i;
    public final c f12567j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f12566i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f12567j = cVar;
    }
}
