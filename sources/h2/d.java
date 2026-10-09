package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10975a;
    public byte[] f10976b;
    public int f10977c;
    public int[] d;
    public int[] f10978e;
    public int f10979f;
    public int f10980g;
    public int h;
    public final MediaCodec.CryptoInfo f10981i;
    public final c f10982j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10981i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10982j = cVar;
    }
}
