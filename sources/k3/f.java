package k3;

import d5.f0;
import j3.r0;
import java.util.Locale;
public final class f {
    public int f14597a;
    public int f14598b;
    public int f14599c;
    public int d;
    public int f14600e;
    public int f14601f;
    public int f14602g;
    public int h;
    public int f14603i;
    public int f14604j;
    public long f14605k;
    public int f14606l;

    public final String toString() {
        int i9 = this.f14597a;
        int i10 = this.f14598b;
        int i11 = this.f14599c;
        int i12 = this.d;
        int i13 = this.f14600e;
        int i14 = this.f14601f;
        int i15 = this.f14602g;
        int i16 = this.h;
        int i17 = this.f14603i;
        int i18 = this.f14604j;
        long j10 = this.f14605k;
        int i19 = this.f14606l;
        int i20 = f0.f4349a;
        Locale locale = Locale.US;
        StringBuilder o6 = e2.c.o("DecoderCounters {\n decoderInits=", i9, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        r0.y(o6, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        r0.y(o6, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        r0.y(o6, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        r0.y(o6, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        o6.append(j10);
        o6.append("\n videoFrameProcessingOffsetCount=");
        o6.append(i19);
        o6.append("\n}");
        return o6.toString();
    }
}
