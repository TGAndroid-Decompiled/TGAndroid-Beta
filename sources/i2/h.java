package i2;

import com.google.android.gms.internal.vision.e2;
import java.util.Locale;
public final class h {
    public int f11572a;
    public int f11573b;
    public int f11574c;
    public int d;
    public int f11575e;
    public int f11576f;
    public int f11577g;
    public int h;
    public int f11578i;
    public int f11579j;
    public long f11580k;
    public int f11581l;

    public final String toString() {
        int i10 = this.f11572a;
        int i11 = this.f11573b;
        int i12 = this.f11574c;
        int i13 = this.d;
        int i14 = this.f11575e;
        int i15 = this.f11576f;
        int i16 = this.f11577g;
        int i17 = this.h;
        int i18 = this.f11578i;
        int i19 = this.f11579j;
        long j3 = this.f11580k;
        int i20 = this.f11581l;
        String str = e2.d0.f8737a;
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
