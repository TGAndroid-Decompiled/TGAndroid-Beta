package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10969a;
    public byte[] f10970b;
    public int f10971c;
    public int[] d;
    public int[] f10972e;
    public int f10973f;
    public int f10974g;
    public int h;
    public final MediaCodec.CryptoInfo f10975i;
    public final c f10976j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10975i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10976j = cVar;
    }
}
