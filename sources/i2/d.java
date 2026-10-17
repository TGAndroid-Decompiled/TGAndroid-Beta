package i2;

import java.util.Locale;
public final class d {
    public int f12336a;
    public int f12337b;
    public int f12338c;
    public int d;
    public int e;
    public int f12339f;
    public int f12340g;
    public int h;
    public int f12341i;
    public int f12342j;
    public long f12343k;
    public int f12344l;

    public final String toString() {
        int i10 = this.f12336a;
        int i11 = this.f12337b;
        int i12 = this.f12338c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f12339f;
        int i16 = this.f12340g;
        int i17 = this.h;
        int i18 = this.f12341i;
        int i19 = this.f12342j;
        long j10 = this.f12343k;
        int i20 = this.f12344l;
        String str = e2.m0.f8254a;
        Locale locale = Locale.US;
        StringBuilder m10 = i0.a.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        i0.a.w(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        i0.a.w(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        i0.a.w(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        i0.a.w(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j10);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
