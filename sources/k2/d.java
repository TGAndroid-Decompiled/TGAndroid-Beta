package k2;

import java.util.Locale;
public final class d {
    public int f16463a;
    public int f16464b;
    public int f16465c;
    public int d;
    public int f16466e;
    public int f16467f;
    public int f16468g;
    public int h;
    public int f16469i;
    public int f16470j;
    public long f16471k;
    public int f16472l;

    public final String toString() {
        int i3 = this.f16463a;
        int i10 = this.f16464b;
        int i11 = this.f16465c;
        int i12 = this.d;
        int i13 = this.f16466e;
        int i14 = this.f16467f;
        int i15 = this.f16468g;
        int i16 = this.h;
        int i17 = this.f16469i;
        int i18 = this.f16470j;
        long j10 = this.f16471k;
        int i19 = this.f16472l;
        String str = g2.n0.f11873a;
        Locale locale = Locale.US;
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("DecoderCounters {\n decoderInits=", i3, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j10);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i19);
        m10.append("\n}");
        return m10.toString();
    }
}
