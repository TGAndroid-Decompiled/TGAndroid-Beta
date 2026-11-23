package l2;

import java.util.Locale;
public final class e {
    public int f19375a;
    public int f19376b;
    public int f19377c;
    public int d;
    public int f19378e;
    public int f19379f;
    public int f19380g;
    public int h;
    public int f19381i;
    public int f19382j;
    public long f19383k;
    public int f19384l;

    public final String toString() {
        int i7 = this.f19375a;
        int i10 = this.f19376b;
        int i11 = this.f19377c;
        int i12 = this.d;
        int i13 = this.f19378e;
        int i14 = this.f19379f;
        int i15 = this.f19380g;
        int i16 = this.h;
        int i17 = this.f19381i;
        int i18 = this.f19382j;
        long j3 = this.f19383k;
        int i19 = this.f19384l;
        String str = h2.l0.f13778a;
        Locale locale = Locale.US;
        StringBuilder n10 = i5.c.n("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        i5.c.z(n10, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        i5.c.z(n10, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        i5.c.z(n10, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        i5.c.z(n10, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        n10.append(j3);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i19);
        n10.append("\n}");
        return n10.toString();
    }
}
