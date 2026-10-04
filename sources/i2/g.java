package i2;

import java.util.Locale;
public final class g {
    public int f11644a;
    public int f11645b;
    public int f11646c;
    public int d;
    public int f11647e;
    public int f11648f;
    public int f11649g;
    public int h;
    public int f11650i;
    public int f11651j;
    public long f11652k;
    public int f11653l;

    public final String toString() {
        int i10 = this.f11644a;
        int i11 = this.f11645b;
        int i12 = this.f11646c;
        int i13 = this.d;
        int i14 = this.f11647e;
        int i15 = this.f11648f;
        int i16 = this.f11649g;
        int i17 = this.h;
        int i18 = this.f11650i;
        int i19 = this.f11651j;
        long j3 = this.f11652k;
        int i20 = this.f11653l;
        String str = e2.d0.f8538a;
        Locale locale = Locale.US;
        StringBuilder k10 = hg.c.k("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.c.t(k10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.c.t(k10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.c.t(k10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.c.t(k10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        k10.append(j3);
        k10.append("\n videoFrameProcessingOffsetCount=");
        k10.append(i20);
        k10.append("\n}");
        return k10.toString();
    }
}
