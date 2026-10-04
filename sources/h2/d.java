package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10970a;
    public byte[] f10971b;
    public int f10972c;
    public int[] d;
    public int[] f10973e;
    public int f10974f;
    public int f10975g;
    public int h;
    public final MediaCodec.CryptoInfo f10976i;
    public final c f10977j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10976i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10977j = cVar;
    }
}
