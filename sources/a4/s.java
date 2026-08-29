package a4;

import j3.t0;
public final class s extends Exception {
    public final String f110a;
    public final boolean f111b;
    public final q f112c;
    public final String d;

    public s(t0 t0Var, y yVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + t0Var, yVar, t0Var.B, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public s(String str, Throwable th2, String str2, boolean z10, q qVar, String str3) {
        super(str, th2);
        this.f110a = str2;
        this.f111b = z10;
        this.f112c = qVar;
        this.d = str3;
    }
}
