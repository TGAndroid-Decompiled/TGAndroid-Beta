package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10069a;
    public byte[] f10070b;
    public int f10071c;
    public int[] d;
    public int[] e;
    public int f10072f;
    public int f10073g;
    public int h;
    public final MediaCodec.CryptoInfo f10074i;
    public final c f10075j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10074i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10075j = cVar;
    }
}
