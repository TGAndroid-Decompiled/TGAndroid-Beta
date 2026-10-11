package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10974a;
    public byte[] f10975b;
    public int f10976c;
    public int[] d;
    public int[] f10977e;
    public int f10978f;
    public int f10979g;
    public int h;
    public final MediaCodec.CryptoInfo f10980i;
    public final c f10981j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10980i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10981j = cVar;
    }
}
