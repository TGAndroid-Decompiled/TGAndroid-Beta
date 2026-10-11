package i2;

import java.util.Locale;
public final class g {
    public int f11693a;
    public int f11694b;
    public int f11695c;
    public int d;
    public int f11696e;
    public int f11697f;
    public int f11698g;
    public int h;
    public int f11699i;
    public int f11700j;
    public long f11701k;
    public int f11702l;

    public final String toString() {
        int i10 = this.f11693a;
        int i11 = this.f11694b;
        int i12 = this.f11695c;
        int i13 = this.d;
        int i14 = this.f11696e;
        int i15 = this.f11697f;
        int i16 = this.f11698g;
        int i17 = this.h;
        int i18 = this.f11699i;
        int i19 = this.f11700j;
        long j3 = this.f11701k;
        int i20 = this.f11702l;
        String str = e2.d0.f8531a;
        Locale locale = Locale.US;
        StringBuilder k10 = hg.c.k("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.c.u(k10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.c.u(k10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.c.u(k10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.c.u(k10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        k10.append(j3);
        k10.append("\n videoFrameProcessingOffsetCount=");
        k10.append(i20);
        k10.append("\n}");
        return k10.toString();
    }
}
