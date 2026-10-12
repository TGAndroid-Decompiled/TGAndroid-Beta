package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10973a;
    public byte[] f10974b;
    public int f10975c;
    public int[] d;
    public int[] f10976e;
    public int f10977f;
    public int f10978g;
    public int h;
    public final MediaCodec.CryptoInfo f10979i;
    public final c f10980j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10979i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10980j = cVar;
    }
}
