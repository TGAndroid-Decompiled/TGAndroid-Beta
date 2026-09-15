package i2;

import java.util.Locale;
public final class g {
    public int f10703a;
    public int f10704b;
    public int f10705c;
    public int d;
    public int e;
    public int f10706f;
    public int f10707g;
    public int h;
    public int f10708i;
    public int f10709j;
    public long f10710k;
    public int f10711l;

    public final String toString() {
        int i10 = this.f10703a;
        int i11 = this.f10704b;
        int i12 = this.f10705c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f10706f;
        int i16 = this.f10707g;
        int i17 = this.h;
        int i18 = this.f10708i;
        int i19 = this.f10709j;
        long j3 = this.f10710k;
        int i20 = this.f10711l;
        String str = e2.d0.f7883a;
        Locale locale = Locale.US;
        StringBuilder m10 = hg.k0.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.k0.v(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.k0.v(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.k0.v(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.k0.v(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j3);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
