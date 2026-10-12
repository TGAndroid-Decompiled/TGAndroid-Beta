package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class d {
    public byte[] f10317a;
    public byte[] f10318b;
    public int f10319c;
    public int[] d;
    public int[] e;
    public int f10320f;
    public int f10321g;
    public int h;
    public final MediaCodec.CryptoInfo f10322i;
    public final c f10323j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10322i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f10323j = cVar;
    }
}
