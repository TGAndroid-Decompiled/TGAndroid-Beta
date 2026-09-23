package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10070a;
    public byte[] f10071b;
    public int f10072c;
    public int[] d;
    public int[] e;
    public int f10073f;
    public int f10074g;
    public int h;
    public final MediaCodec.CryptoInfo f10075i;
    public final c f10076j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10075i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10076j = cVar;
    }
}
