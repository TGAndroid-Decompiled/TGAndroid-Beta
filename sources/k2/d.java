package k2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f18145a;
    public byte[] f18146b;
    public int f18147c;
    public int[] d;
    public int[] f18148e;
    public int f18149f;
    public int f18150g;
    public int h;
    public final MediaCodec.CryptoInfo f18151i;
    public final c f18152j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f18151i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f18152j = cVar;
    }
}
