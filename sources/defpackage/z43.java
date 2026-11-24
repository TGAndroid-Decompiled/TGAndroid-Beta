package defpackage;

import android.media.MediaCodec;
import android.os.Build;
public final class z43 {
    public byte[] a;
    public byte[] b;
    public byte c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final y43 j;

    public z43() {
        y43 y43Var;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (Build.VERSION.SDK_INT >= 24) {
            y43Var = new y43(cryptoInfo);
        } else {
            y43Var = null;
        }
        this.j = y43Var;
    }
}
