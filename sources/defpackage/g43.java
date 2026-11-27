package defpackage;

import android.media.MediaCodec;
import android.os.Build;
public final class g43 {
    public byte[] a;
    public byte[] b;
    public byte c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final f43 j;

    public g43() {
        f43 f43Var;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            f43Var = new f43(cryptoInfo);
        } else {
            f43Var = null;
        }
        this.j = f43Var;
    }
}
