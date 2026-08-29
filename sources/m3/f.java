package m3;

import f5.d0;
import j7.l1;
import java.util.Locale;
public final class f {
    public int f16817a;
    public int f16818b;
    public int f16819c;
    public int d;
    public int f16820e;
    public int f16821f;
    public int f16822g;
    public int h;
    public int f16823i;
    public int f16824j;
    public long f16825k;
    public int f16826l;

    public final String toString() {
        int i10 = this.f16817a;
        int i11 = this.f16818b;
        int i12 = this.f16819c;
        int i13 = this.d;
        int i14 = this.f16820e;
        int i15 = this.f16821f;
        int i16 = this.f16822g;
        int i17 = this.h;
        int i18 = this.f16823i;
        int i19 = this.f16824j;
        long j10 = this.f16825k;
        int i20 = this.f16826l;
        int i21 = d0.f6579a;
        Locale locale = Locale.US;
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        l1.w(o10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        l1.w(o10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        l1.w(o10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        l1.w(o10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        o10.append(j10);
        o10.append("\n videoFrameProcessingOffsetCount=");
        o10.append(i20);
        o10.append("\n}");
        return o10.toString();
    }
}
