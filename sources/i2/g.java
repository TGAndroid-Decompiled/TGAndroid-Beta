package i2;

import java.util.Locale;
public final class g {
    public int f10204a;
    public int f10205b;
    public int f10206c;
    public int d;
    public int e;
    public int f10207f;
    public int f10208g;
    public int h;
    public int f10209i;
    public int f10210j;
    public long f10211k;
    public int f10212l;

    public final String toString() {
        int i10 = this.f10204a;
        int i11 = this.f10205b;
        int i12 = this.f10206c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10207f;
        int i16 = this.f10208g;
        int i17 = this.h;
        int i18 = this.f10209i;
        int i19 = this.f10210j;
        long j3 = this.f10211k;
        int i20 = this.f10212l;
        String str = e2.d0.f7188a;
        Locale locale = Locale.US;
        StringBuilder n10 = hc.b.n("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hc.b.w(n10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hc.b.w(n10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hc.b.w(n10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hc.b.w(n10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        n10.append(j3);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i20);
        n10.append("\n}");
        return n10.toString();
    }
}
