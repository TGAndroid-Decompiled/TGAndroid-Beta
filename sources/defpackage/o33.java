package defpackage;

import android.media.MediaCodec;
import android.os.Build;
public final class o33 {
    public byte[] a;
    public byte[] b;
    public byte c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final n33 j;

    public o33() {
        n33 n33Var;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            n33Var = new n33(cryptoInfo);
        } else {
            n33Var = null;
        }
        this.j = n33Var;
    }
}
