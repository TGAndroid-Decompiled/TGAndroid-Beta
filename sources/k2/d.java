package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f18117a;
    public byte[] f18118b;
    public int f18119c;
    public int[] d;
    public int[] f18120e;
    public int f18121f;
    public int f18122g;
    public int h;
    public final MediaCodec.CryptoInfo f18123i;
    public final c f18124j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f18123i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f18124j = cVar;
    }
}
