package i2;

import java.util.Locale;
public final class g {
    public int f10688a;
    public int f10689b;
    public int f10690c;
    public int d;
    public int e;
    public int f10691f;
    public int f10692g;
    public int h;
    public int f10693i;
    public int f10694j;
    public long f10695k;
    public int f10696l;

    public final String toString() {
        int i10 = this.f10688a;
        int i11 = this.f10689b;
        int i12 = this.f10690c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10691f;
        int i16 = this.f10692g;
        int i17 = this.h;
        int i18 = this.f10693i;
        int i19 = this.f10694j;
        long j3 = this.f10695k;
        int i20 = this.f10696l;
        String str = e2.d0.f7872a;
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
