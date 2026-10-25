package i2;

import java.util.Locale;
public final class e {
    public int f13513a;
    public int f13514b;
    public int f13515c;
    public int d;
    public int e;
    public int f13516f;
    public int f13517g;
    public int h;
    public int f13518i;
    public int f13519j;
    public long f13520k;
    public int f13521l;

    public final String toString() {
        int i10 = this.f13513a;
        int i11 = this.f13514b;
        int i12 = this.f13515c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f13516f;
        int i16 = this.f13517g;
        int i17 = this.h;
        int i18 = this.f13518i;
        int i19 = this.f13519j;
        long j10 = this.f13520k;
        int i20 = this.f13521l;
        String str = e2.n0.f9692a;
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
