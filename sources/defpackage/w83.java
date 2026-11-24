package defpackage;

import java.util.Locale;
public final class w83 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = g8c.a;
        Locale locale = Locale.US;
        StringBuilder p = ir2.p("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        ir2.w(p, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        ir2.w(p, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        ir2.w(p, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        ir2.w(p, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        p.append(j);
        p.append("\n videoFrameProcessingOffsetCount=");
        p.append(i11);
        p.append("\n}");
        return p.toString();
    }
}
