package l2;

import java.util.Locale;
public final class d {
    public int f17776a;
    public int f17777b;
    public int f17778c;
    public int d;
    public int f17779e;
    public int f17780f;
    public int f17781g;
    public int h;
    public int f17782i;
    public int f17783j;
    public long f17784k;
    public int f17785l;

    public final String toString() {
        int i7 = this.f17776a;
        int i10 = this.f17777b;
        int i11 = this.f17778c;
        int i12 = this.d;
        int i13 = this.f17779e;
        int i14 = this.f17780f;
        int i15 = this.f17781g;
        int i16 = this.h;
        int i17 = this.f17782i;
        int i18 = this.f17783j;
        long j3 = this.f17784k;
        int i19 = this.f17785l;
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
