package l2;

import java.util.Locale;
public final class d {
    public int f18910a;
    public int f18911b;
    public int f18912c;
    public int d;
    public int f18913e;
    public int f18914f;
    public int f18915g;
    public int h;
    public int f18916i;
    public int f18917j;
    public long f18918k;
    public int f18919l;

    public final String toString() {
        int i7 = this.f18910a;
        int i10 = this.f18911b;
        int i11 = this.f18912c;
        int i12 = this.d;
        int i13 = this.f18913e;
        int i14 = this.f18914f;
        int i15 = this.f18915g;
        int i16 = this.h;
        int i17 = this.f18916i;
        int i18 = this.f18917j;
        long j3 = this.f18918k;
        int i19 = this.f18919l;
        String str = h2.l0.f13471a;
        Locale locale = Locale.US;
        StringBuilder n10 = i5.c.n("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        i5.c.y(n10, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        i5.c.y(n10, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        i5.c.y(n10, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        i5.c.y(n10, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        n10.append(j3);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i19);
        n10.append("\n}");
        return n10.toString();
    }
}
