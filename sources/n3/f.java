package n3;

import h5.d0;
import java.util.Locale;
import kh.a2;
public final class f {
    public int f14232a;
    public int f14233b;
    public int f14234c;
    public int d;
    public int e;
    public int f14235f;
    public int f14236g;
    public int h;
    public int f14237i;
    public int f14238j;
    public long f14239k;
    public int f14240l;

    public final String toString() {
        int i10 = this.f14232a;
        int i11 = this.f14233b;
        int i12 = this.f14234c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f14235f;
        int i16 = this.f14236g;
        int i17 = this.h;
        int i18 = this.f14237i;
        int i19 = this.f14238j;
        long j10 = this.f14239k;
        int i20 = this.f14240l;
        int i21 = d0.f6937a;
        Locale locale = Locale.US;
        StringBuilder m9 = e2.c.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        a2.w(m9, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        a2.w(m9, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        a2.w(m9, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        a2.w(m9, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m9.append(j10);
        m9.append("\n videoFrameProcessingOffsetCount=");
        m9.append(i20);
        m9.append("\n}");
        return m9.toString();
    }
}
