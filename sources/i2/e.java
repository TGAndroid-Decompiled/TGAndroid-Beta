package i2;

import com.google.android.gms.internal.play_billing.k3;
import java.util.Locale;
public final class e {
    public int f12371a;
    public int f12372b;
    public int f12373c;
    public int d;
    public int e;
    public int f12374f;
    public int f12375g;
    public int h;
    public int f12376i;
    public int f12377j;
    public long f12378k;
    public int f12379l;

    public final String toString() {
        int i10 = this.f12371a;
        int i11 = this.f12372b;
        int i12 = this.f12373c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f12374f;
        int i16 = this.f12375g;
        int i17 = this.h;
        int i18 = this.f12376i;
        int i19 = this.f12377j;
        long j10 = this.f12378k;
        int i20 = this.f12379l;
        String str = e2.m0.f8259a;
        Locale locale = Locale.US;
        StringBuilder k10 = k3.k("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        k3.r(k10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        k3.r(k10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        k3.r(k10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        k3.r(k10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        k10.append(j10);
        k10.append("\n videoFrameProcessingOffsetCount=");
        k10.append(i20);
        k10.append("\n}");
        return k10.toString();
    }
}
