package i2;

import java.util.Locale;
public final class d {
    public int f7824a;
    public int f7825b;
    public int f7826c;
    public int d;
    public int e;
    public int f7827f;
    public int f7828g;
    public int h;
    public int f7829i;
    public int f7830j;
    public long f7831k;
    public int f7832l;

    public final String toString() {
        int i10 = this.f7824a;
        int i11 = this.f7825b;
        int i12 = this.f7826c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f7827f;
        int i16 = this.f7828g;
        int i17 = this.h;
        int i18 = this.f7829i;
        int i19 = this.f7830j;
        long j10 = this.f7831k;
        int i20 = this.f7832l;
        String str = e2.l0.f6165a;
        Locale locale = Locale.US;
        StringBuilder m10 = i0.a.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        i0.a.t(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        i0.a.t(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        i0.a.t(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        i0.a.t(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j10);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
