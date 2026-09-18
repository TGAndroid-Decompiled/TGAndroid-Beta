package i2;

import java.util.Locale;
public final class g {
    public int f10706a;
    public int f10707b;
    public int f10708c;
    public int d;
    public int e;
    public int f10709f;
    public int f10710g;
    public int h;
    public int f10711i;
    public int f10712j;
    public long f10713k;
    public int f10714l;

    public final String toString() {
        int i10 = this.f10706a;
        int i11 = this.f10707b;
        int i12 = this.f10708c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10709f;
        int i16 = this.f10710g;
        int i17 = this.h;
        int i18 = this.f10711i;
        int i19 = this.f10712j;
        long j3 = this.f10713k;
        int i20 = this.f10714l;
        String str = e2.d0.f7887a;
        Locale locale = Locale.US;
        StringBuilder k10 = hg.k0.k("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.k0.s(k10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.k0.s(k10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.k0.s(k10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.k0.s(k10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        k10.append(j3);
        k10.append("\n videoFrameProcessingOffsetCount=");
        k10.append(i20);
        k10.append("\n}");
        return k10.toString();
    }
}
