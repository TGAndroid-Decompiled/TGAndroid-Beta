package n3;

import h5.d0;
import java.util.Locale;
import kf.k0;
public final class f {
    public int f14217a;
    public int f14218b;
    public int f14219c;
    public int d;
    public int e;
    public int f14220f;
    public int f14221g;
    public int h;
    public int f14222i;
    public int f14223j;
    public long f14224k;
    public int f14225l;

    public final String toString() {
        int i10 = this.f14217a;
        int i11 = this.f14218b;
        int i12 = this.f14219c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f14220f;
        int i16 = this.f14221g;
        int i17 = this.h;
        int i18 = this.f14222i;
        int i19 = this.f14223j;
        long j10 = this.f14224k;
        int i20 = this.f14225l;
        int i21 = d0.f6924a;
        Locale locale = Locale.US;
        StringBuilder m9 = e2.c.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        k0.w(m9, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        k0.w(m9, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        k0.w(m9, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        k0.w(m9, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m9.append(j10);
        m9.append("\n videoFrameProcessingOffsetCount=");
        m9.append(i20);
        m9.append("\n}");
        return m9.toString();
    }
}
