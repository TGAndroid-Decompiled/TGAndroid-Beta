package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10087a;
    public byte[] f10088b;
    public int f10089c;
    public int[] d;
    public int[] e;
    public int f10090f;
    public int f10091g;
    public int h;
    public final MediaCodec.CryptoInfo f10092i;
    public final c f10093j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10092i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10093j = cVar;
    }
}
