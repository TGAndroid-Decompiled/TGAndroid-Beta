package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10088a;
    public byte[] f10089b;
    public int f10090c;
    public int[] d;
    public int[] e;
    public int f10091f;
    public int f10092g;
    public int h;
    public final MediaCodec.CryptoInfo f10093i;
    public final c f10094j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10093i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10094j = cVar;
    }
}
