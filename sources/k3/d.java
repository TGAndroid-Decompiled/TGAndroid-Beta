package k3;

import android.media.MediaCodec;
import d5.g0;

public final class d {

    public byte[] f14410a;

    public byte[] f14411b;

    public int f14412c;
    public int[] d;

    public int[] f14413e;

    public int f14414f;

    public int f14415g;
    public int h;

    public final MediaCodec.CryptoInfo f14416i;

    public final c f14417j;

    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f14416i = cryptoInfo;
        this.f14417j = g0.f4795a >= 24 ? new c(cryptoInfo) : null;
    }
}
