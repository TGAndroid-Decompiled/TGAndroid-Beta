package i2;

import java.util.Locale;
public final class e {
    public int f12339a;
    public int f12340b;
    public int f12341c;
    public int d;
    public int e;
    public int f12342f;
    public int f12343g;
    public int h;
    public int f12344i;
    public int f12345j;
    public long f12346k;
    public int f12347l;

    public final String toString() {
        int i10 = this.f12339a;
        int i11 = this.f12340b;
        int i12 = this.f12341c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f12342f;
        int i16 = this.f12343g;
        int i17 = this.h;
        int i18 = this.f12344i;
        int i19 = this.f12345j;
        long j10 = this.f12346k;
        int i20 = this.f12347l;
        String str = e2.m0.f8253a;
        Locale locale = Locale.US;
        StringBuilder m10 = d.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        d.w(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        d.w(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        d.w(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        d.w(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j10);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
