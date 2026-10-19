package i2;

import java.util.Locale;
public final class f {
    public int f12344a;
    public int f12345b;
    public int f12346c;
    public int d;
    public int e;
    public int f12347f;
    public int f12348g;
    public int h;
    public int f12349i;
    public int f12350j;
    public long f12351k;
    public int f12352l;

    public final String toString() {
        int i10 = this.f12344a;
        int i11 = this.f12345b;
        int i12 = this.f12346c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f12347f;
        int i16 = this.f12348g;
        int i17 = this.h;
        int i18 = this.f12349i;
        int i19 = this.f12350j;
        long j10 = this.f12351k;
        int i20 = this.f12352l;
        String str = e2.m0.f8254a;
        Locale locale = Locale.US;
        StringBuilder m10 = e.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        e.w(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        e.w(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        e.w(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        e.w(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j10);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
