package k3;

import d5.g0;
import java.util.Locale;

public final class f {

    public int f14418a;

    public int f14419b;

    public int f14420c;
    public int d;

    public int f14421e;

    public int f14422f;

    public int f14423g;
    public int h;

    public int f14424i;

    public int f14425j;

    public long f14426k;

    public int f14427l;

    public final String toString() {
        int i10 = this.f14418a;
        int i11 = this.f14419b;
        int i12 = this.f14420c;
        int i13 = this.d;
        int i14 = this.f14421e;
        int i15 = this.f14422f;
        int i16 = this.f14423g;
        int i17 = this.h;
        int i18 = this.f14424i;
        int i19 = this.f14425j;
        long j10 = this.f14426k;
        int i20 = this.f14427l;
        int i21 = g0.f4795a;
        Locale locale = Locale.US;
        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        i0.a.x(sbP, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        i0.a.x(sbP, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        i0.a.x(sbP, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        i0.a.x(sbP, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        sbP.append(j10);
        sbP.append("\n videoFrameProcessingOffsetCount=");
        sbP.append(i20);
        sbP.append("\n}");
        return sbP.toString();
    }
}
