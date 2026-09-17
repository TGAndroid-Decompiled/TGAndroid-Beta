package i2;

import com.google.android.gms.internal.vision.e2;
import java.util.Locale;
public final class h {
    public int f11598a;
    public int f11599b;
    public int f11600c;
    public int d;
    public int f11601e;
    public int f11602f;
    public int f11603g;
    public int h;
    public int f11604i;
    public int f11605j;
    public long f11606k;
    public int f11607l;

    public final String toString() {
        int i10 = this.f11598a;
        int i11 = this.f11599b;
        int i12 = this.f11600c;
        int i13 = this.d;
        int i14 = this.f11601e;
        int i15 = this.f11602f;
        int i16 = this.f11603g;
        int i17 = this.h;
        int i18 = this.f11604i;
        int i19 = this.f11605j;
        long j3 = this.f11606k;
        int i20 = this.f11607l;
        String str = e2.d0.f8765a;
        Locale locale = Locale.US;
        StringBuilder k10 = e2.k("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        g.v(k10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        g.v(k10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        g.v(k10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        g.v(k10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        k10.append(j3);
        k10.append("\n videoFrameProcessingOffsetCount=");
        k10.append(i20);
        k10.append("\n}");
        return k10.toString();
    }
}
