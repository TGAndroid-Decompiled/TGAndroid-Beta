package i2;

import java.util.Locale;
public final class e {
    public int f10940a;
    public int f10941b;
    public int f10942c;
    public int d;
    public int e;
    public int f10943f;
    public int f10944g;
    public int h;
    public int f10945i;
    public int f10946j;
    public long f10947k;
    public int f10948l;

    public final String toString() {
        int i10 = this.f10940a;
        int i11 = this.f10941b;
        int i12 = this.f10942c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10943f;
        int i16 = this.f10944g;
        int i17 = this.h;
        int i18 = this.f10945i;
        int i19 = this.f10946j;
        long j10 = this.f10947k;
        int i20 = this.f10948l;
        String str = e2.m0.f8372a;
        Locale locale = Locale.US;
        StringBuilder l4 = d.l("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        d.u(l4, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        d.u(l4, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        d.u(l4, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        d.u(l4, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        l4.append(j10);
        l4.append("\n videoFrameProcessingOffsetCount=");
        l4.append(i20);
        l4.append("\n}");
        return l4.toString();
    }
}
