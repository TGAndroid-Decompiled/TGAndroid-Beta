package h2;

import android.media.MediaCodec;
import android.os.Build;
public final class c {
    public byte[] f10838a;
    public byte[] f10839b;
    public int f10840c;
    public int[] d;
    public int[] f10841e;
    public int f10842f;
    public int f10843g;
    public int h;
    public final MediaCodec.CryptoInfo f10844i;
    public final b f10845j;

    public c() {
        b bVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10844i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            bVar = new b(cryptoInfo);
        } else {
            bVar = null;
        }
        this.f10845j = bVar;
    }
}
