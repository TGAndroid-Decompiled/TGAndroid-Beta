package i2;

import java.util.Locale;
public final class g {
    public int f10705a;
    public int f10706b;
    public int f10707c;
    public int d;
    public int e;
    public int f10708f;
    public int f10709g;
    public int h;
    public int f10710i;
    public int f10711j;
    public long f10712k;
    public int f10713l;

    public final String toString() {
        int i10 = this.f10705a;
        int i11 = this.f10706b;
        int i12 = this.f10707c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10708f;
        int i16 = this.f10709g;
        int i17 = this.h;
        int i18 = this.f10710i;
        int i19 = this.f10711j;
        long j3 = this.f10712k;
        int i20 = this.f10713l;
        String str = e2.d0.f7885a;
        Locale locale = Locale.US;
        StringBuilder m10 = hg.c.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.c.v(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.c.v(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.c.v(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.c.v(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j3);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
