package i2;

import java.util.Locale;
public final class e {
    public int f10944a;
    public int f10945b;
    public int f10946c;
    public int d;
    public int e;
    public int f10947f;
    public int f10948g;
    public int h;
    public int f10949i;
    public int f10950j;
    public long f10951k;
    public int f10952l;

    public final String toString() {
        int i10 = this.f10944a;
        int i11 = this.f10945b;
        int i12 = this.f10946c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10947f;
        int i16 = this.f10948g;
        int i17 = this.h;
        int i18 = this.f10949i;
        int i19 = this.f10950j;
        long j10 = this.f10951k;
        int i20 = this.f10952l;
        String str = e2.m0.f8375a;
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
