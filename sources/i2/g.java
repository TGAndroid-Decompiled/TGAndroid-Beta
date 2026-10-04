package i2;

import java.util.Locale;
public final class g {
    public int f11643a;
    public int f11644b;
    public int f11645c;
    public int d;
    public int f11646e;
    public int f11647f;
    public int f11648g;
    public int h;
    public int f11649i;
    public int f11650j;
    public long f11651k;
    public int f11652l;

    public final String toString() {
        int i10 = this.f11643a;
        int i11 = this.f11644b;
        int i12 = this.f11645c;
        int i13 = this.d;
        int i14 = this.f11646e;
        int i15 = this.f11647f;
        int i16 = this.f11648g;
        int i17 = this.h;
        int i18 = this.f11649i;
        int i19 = this.f11650j;
        long j3 = this.f11651k;
        int i20 = this.f11652l;
        String str = e2.d0.f8537a;
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
