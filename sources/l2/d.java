package l2;

import java.util.Locale;
public final class d {
    public int f19305a;
    public int f19306b;
    public int f19307c;
    public int d;
    public int f19308e;
    public int f19309f;
    public int f19310g;
    public int h;
    public int f19311i;
    public int f19312j;
    public long f19313k;
    public int f19314l;

    public final String toString() {
        int i7 = this.f19305a;
        int i10 = this.f19306b;
        int i11 = this.f19307c;
        int i12 = this.d;
        int i13 = this.f19308e;
        int i14 = this.f19309f;
        int i15 = this.f19310g;
        int i16 = this.h;
        int i17 = this.f19311i;
        int i18 = this.f19312j;
        long j3 = this.f19313k;
        int i19 = this.f19314l;
        String str = h2.l0.f13815a;
        Locale locale = Locale.US;
        StringBuilder n10 = i5.c.n("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        i5.c.z(n10, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        i5.c.z(n10, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        i5.c.z(n10, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        i5.c.z(n10, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        n10.append(j3);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i19);
        n10.append("\n}");
        return n10.toString();
    }
}
