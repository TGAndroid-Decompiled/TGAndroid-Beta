package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f18213a;
    public byte[] f18214b;
    public int f18215c;
    public int[] d;
    public int[] f18216e;
    public int f18217f;
    public int f18218g;
    public int h;
    public final MediaCodec.CryptoInfo f18219i;
    public final c f18220j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f18219i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f18220j = cVar;
    }
}
