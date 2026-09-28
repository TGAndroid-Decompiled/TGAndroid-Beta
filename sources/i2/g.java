package i2;

import java.util.Locale;
public final class g {
    public int f10685a;
    public int f10686b;
    public int f10687c;
    public int d;
    public int e;
    public int f10688f;
    public int f10689g;
    public int h;
    public int f10690i;
    public int f10691j;
    public long f10692k;
    public int f10693l;

    public final String toString() {
        int i10 = this.f10685a;
        int i11 = this.f10686b;
        int i12 = this.f10687c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10688f;
        int i16 = this.f10689g;
        int i17 = this.h;
        int i18 = this.f10690i;
        int i19 = this.f10691j;
        long j3 = this.f10692k;
        int i20 = this.f10693l;
        String str = e2.d0.f7870a;
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
