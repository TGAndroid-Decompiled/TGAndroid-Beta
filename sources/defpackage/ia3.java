package defpackage;

import java.util.Locale;
public final class ia3 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = hac.a;
        Locale locale = Locale.US;
        StringBuilder o = ts2.o("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        ts2.v(o, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        ts2.v(o, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        ts2.v(o, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        ts2.v(o, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        o.append(j);
        o.append("\n videoFrameProcessingOffsetCount=");
        o.append(i11);
        o.append("\n}");
        return o.toString();
    }
}
