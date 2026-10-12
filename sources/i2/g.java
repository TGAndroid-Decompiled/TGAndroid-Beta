package i2;

import java.util.Locale;
public final class g {
    public int f11692a;
    public int f11693b;
    public int f11694c;
    public int d;
    public int f11695e;
    public int f11696f;
    public int f11697g;
    public int h;
    public int f11698i;
    public int f11699j;
    public long f11700k;
    public int f11701l;

    public final String toString() {
        int i10 = this.f11692a;
        int i11 = this.f11693b;
        int i12 = this.f11694c;
        int i13 = this.d;
        int i14 = this.f11695e;
        int i15 = this.f11696f;
        int i16 = this.f11697g;
        int i17 = this.h;
        int i18 = this.f11698i;
        int i19 = this.f11699j;
        long j3 = this.f11700k;
        int i20 = this.f11701l;
        String str = e2.d0.f8529a;
        Locale locale = Locale.US;
        StringBuilder m10 = hg.c.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.c.w(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.c.w(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.c.w(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.c.w(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j3);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
