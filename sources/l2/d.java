package l2;

import java.util.Locale;
public final class d {
    public int f19271a;
    public int f19272b;
    public int f19273c;
    public int d;
    public int f19274e;
    public int f19275f;
    public int f19276g;
    public int h;
    public int f19277i;
    public int f19278j;
    public long f19279k;
    public int f19280l;

    public final String toString() {
        int i7 = this.f19271a;
        int i10 = this.f19272b;
        int i11 = this.f19273c;
        int i12 = this.d;
        int i13 = this.f19274e;
        int i14 = this.f19275f;
        int i15 = this.f19276g;
        int i16 = this.h;
        int i17 = this.f19277i;
        int i18 = this.f19278j;
        long j3 = this.f19279k;
        int i19 = this.f19280l;
        String str = h2.l0.f13778a;
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
