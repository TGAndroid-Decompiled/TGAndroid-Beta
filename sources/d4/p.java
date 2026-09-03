package d4;

import j3.n0;
public final class p extends Exception {
    public final String f4150a;
    public final boolean f4151b;
    public final n f4152c;
    public final String d;

    public p(n0 n0Var, v vVar, boolean z4, int i10) {
        this("Decoder init failed: [" + i10 + "], " + n0Var, vVar, n0Var.C, z4, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z4, n nVar, String str3) {
        super(str, th2);
        this.f4150a = str2;
        this.f4151b = z4;
        this.f4152c = nVar;
        this.d = str3;
    }
}
