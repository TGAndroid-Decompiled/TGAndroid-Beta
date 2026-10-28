package i2;

import java.util.Locale;
public final class e {
    public int f13512a;
    public int f13513b;
    public int f13514c;
    public int d;
    public int e;
    public int f13515f;
    public int f13516g;
    public int h;
    public int f13517i;
    public int f13518j;
    public long f13519k;
    public int f13520l;

    public final String toString() {
        int i10 = this.f13512a;
        int i11 = this.f13513b;
        int i12 = this.f13514c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f13515f;
        int i16 = this.f13516g;
        int i17 = this.h;
        int i18 = this.f13517i;
        int i19 = this.f13518j;
        long j10 = this.f13519k;
        int i20 = this.f13520l;
        String str = e2.n0.f9691a;
        Locale locale = Locale.US;
        StringBuilder n10 = c3.h0.n("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        c3.h0.q(n10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        c3.h0.q(n10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        c3.h0.q(n10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        c3.h0.q(n10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        n10.append(j10);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i20);
        n10.append("\n}");
        return n10.toString();
    }
}
