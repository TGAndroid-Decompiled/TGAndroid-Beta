package i2;

import java.util.Locale;
public final class g {
    public int f11694a;
    public int f11695b;
    public int f11696c;
    public int d;
    public int f11697e;
    public int f11698f;
    public int f11699g;
    public int h;
    public int f11700i;
    public int f11701j;
    public long f11702k;
    public int f11703l;

    public final String toString() {
        int i10 = this.f11694a;
        int i11 = this.f11695b;
        int i12 = this.f11696c;
        int i13 = this.d;
        int i14 = this.f11697e;
        int i15 = this.f11698f;
        int i16 = this.f11699g;
        int i17 = this.h;
        int i18 = this.f11700i;
        int i19 = this.f11701j;
        long j3 = this.f11702k;
        int i20 = this.f11703l;
        String str = e2.d0.f8532a;
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
