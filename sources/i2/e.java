package i2;

import java.util.Locale;
public final class e {
    public int f12341a;
    public int f12342b;
    public int f12343c;
    public int d;
    public int e;
    public int f12344f;
    public int f12345g;
    public int h;
    public int f12346i;
    public int f12347j;
    public long f12348k;
    public int f12349l;

    public final String toString() {
        int i10 = this.f12341a;
        int i11 = this.f12342b;
        int i12 = this.f12343c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f12344f;
        int i16 = this.f12345g;
        int i17 = this.h;
        int i18 = this.f12346i;
        int i19 = this.f12347j;
        long j10 = this.f12348k;
        int i20 = this.f12349l;
        String str = e2.m0.f8255a;
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
