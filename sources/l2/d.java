package l2;

import java.util.Locale;
public final class d {
    public int f17777a;
    public int f17778b;
    public int f17779c;
    public int d;
    public int f17780e;
    public int f17781f;
    public int f17782g;
    public int h;
    public int f17783i;
    public int f17784j;
    public long f17785k;
    public int f17786l;

    public final String toString() {
        int i7 = this.f17777a;
        int i10 = this.f17778b;
        int i11 = this.f17779c;
        int i12 = this.d;
        int i13 = this.f17780e;
        int i14 = this.f17781f;
        int i15 = this.f17782g;
        int i16 = this.h;
        int i17 = this.f17783i;
        int i18 = this.f17784j;
        long j3 = this.f17785k;
        int i19 = this.f17786l;
        String str = h2.m0.f14114a;
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
