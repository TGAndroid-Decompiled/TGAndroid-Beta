package i2;

import java.util.Locale;
public final class g {
    public int f10707a;
    public int f10708b;
    public int f10709c;
    public int d;
    public int e;
    public int f10710f;
    public int f10711g;
    public int h;
    public int f10712i;
    public int f10713j;
    public long f10714k;
    public int f10715l;

    public final String toString() {
        int i10 = this.f10707a;
        int i11 = this.f10708b;
        int i12 = this.f10709c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10710f;
        int i16 = this.f10711g;
        int i17 = this.h;
        int i18 = this.f10712i;
        int i19 = this.f10713j;
        long j3 = this.f10714k;
        int i20 = this.f10715l;
        String str = e2.d0.f7887a;
        Locale locale = Locale.US;
        StringBuilder l4 = hg.k0.l("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.k0.t(l4, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.k0.t(l4, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.k0.t(l4, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.k0.t(l4, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        l4.append(j3);
        l4.append("\n videoFrameProcessingOffsetCount=");
        l4.append(i20);
        l4.append("\n}");
        return l4.toString();
    }
}
