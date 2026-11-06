package l2;

import java.util.Locale;
public final class d {
    public int f17773a;
    public int f17774b;
    public int f17775c;
    public int d;
    public int f17776e;
    public int f17777f;
    public int f17778g;
    public int h;
    public int f17779i;
    public int f17780j;
    public long f17781k;
    public int f17782l;

    public final String toString() {
        int i7 = this.f17773a;
        int i10 = this.f17774b;
        int i11 = this.f17775c;
        int i12 = this.d;
        int i13 = this.f17776e;
        int i14 = this.f17777f;
        int i15 = this.f17778g;
        int i16 = this.h;
        int i17 = this.f17779i;
        int i18 = this.f17780j;
        long j3 = this.f17781k;
        int i19 = this.f17782l;
        String str = h2.m0.f14112a;
        Locale locale = Locale.US;
        StringBuilder o4 = jg.g.o("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        jg.g.x(o4, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        jg.g.x(o4, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        jg.g.x(o4, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        jg.g.x(o4, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        o4.append(j3);
        o4.append("\n videoFrameProcessingOffsetCount=");
        o4.append(i19);
        o4.append("\n}");
        return o4.toString();
    }
}
