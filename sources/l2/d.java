package l2;

import java.util.Locale;
public final class d {
    public int f19277a;
    public int f19278b;
    public int f19279c;
    public int d;
    public int f19280e;
    public int f19281f;
    public int f19282g;
    public int h;
    public int f19283i;
    public int f19284j;
    public long f19285k;
    public int f19286l;

    public final String toString() {
        int i7 = this.f19277a;
        int i10 = this.f19278b;
        int i11 = this.f19279c;
        int i12 = this.d;
        int i13 = this.f19280e;
        int i14 = this.f19281f;
        int i15 = this.f19282g;
        int i16 = this.h;
        int i17 = this.f19283i;
        int i18 = this.f19284j;
        long j3 = this.f19285k;
        int i19 = this.f19286l;
        String str = h2.l0.f13786a;
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
