package n3;

import h5.d0;
import java.util.Locale;
public final class f {
    public int f15204a;
    public int f15205b;
    public int f15206c;
    public int d;
    public int f15207e;
    public int f15208f;
    public int f15209g;
    public int h;
    public int f15210i;
    public int f15211j;
    public long f15212k;
    public int f15213l;

    public final String toString() {
        int i10 = this.f15204a;
        int i11 = this.f15205b;
        int i12 = this.f15206c;
        int i13 = this.d;
        int i14 = this.f15207e;
        int i15 = this.f15208f;
        int i16 = this.f15209g;
        int i17 = this.h;
        int i18 = this.f15210i;
        int i19 = this.f15211j;
        long j10 = this.f15212k;
        int i20 = this.f15213l;
        int i21 = d0.f7237a;
        Locale locale = Locale.US;
        StringBuilder m9 = e2.c.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        l.d.w(m9, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        l.d.w(m9, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        l.d.w(m9, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        l.d.w(m9, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m9.append(j10);
        m9.append("\n videoFrameProcessingOffsetCount=");
        m9.append(i20);
        m9.append("\n}");
        return m9.toString();
    }
}
