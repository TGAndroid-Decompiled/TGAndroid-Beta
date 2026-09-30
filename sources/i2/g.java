package i2;

import java.util.Locale;
public final class g {
    public int f10699a;
    public int f10700b;
    public int f10701c;
    public int d;
    public int e;
    public int f10702f;
    public int f10703g;
    public int h;
    public int f10704i;
    public int f10705j;
    public long f10706k;
    public int f10707l;

    public final String toString() {
        int i10 = this.f10699a;
        int i11 = this.f10700b;
        int i12 = this.f10701c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10702f;
        int i16 = this.f10703g;
        int i17 = this.h;
        int i18 = this.f10704i;
        int i19 = this.f10705j;
        long j3 = this.f10706k;
        int i20 = this.f10707l;
        String str = e2.d0.f7882a;
        Locale locale = Locale.US;
        StringBuilder k10 = hg.c.k("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.c.t(k10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.c.t(k10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.c.t(k10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.c.t(k10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        k10.append(j3);
        k10.append("\n videoFrameProcessingOffsetCount=");
        k10.append(i20);
        k10.append("\n}");
        return k10.toString();
    }
}
