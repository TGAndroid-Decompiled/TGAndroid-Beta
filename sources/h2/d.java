package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10866a;
    public byte[] f10867b;
    public int f10868c;
    public int[] d;
    public int[] f10869e;
    public int f10870f;
    public int f10871g;
    public int h;
    public final MediaCodec.CryptoInfo f10872i;
    public final c f10873j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10872i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10873j = cVar;
    }
}
