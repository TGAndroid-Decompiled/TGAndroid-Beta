package h5;

import b8.ee;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;
public final class o extends com.googlecode.mp4parser.c {
    public static final i9 f14271n;
    public static final i9 f14272r;
    public static final i9 f14273s;
    public static final i9 f14274w;
    public long f14275e;
    public long[] f14276f;
    public int h;

    static {
        we.a aVar = new we.a(o.class, "SampleSizeBox.java");
        f14271n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f14272r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f14273s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        f14274w = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f14275e = g5.b.i(byteBuffer);
        int a10 = ee.a(g5.b.i(byteBuffer));
        this.h = a10;
        if (this.f14275e == 0) {
            this.f14276f = new long[a10];
            for (int i3 = 0; i3 < this.h; i3++) {
                this.f14276f[i3] = g5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f14275e);
        if (this.f14275e == 0) {
            byteBuffer.putInt(this.f14276f.length);
            for (long j10 : this.f14276f) {
                byteBuffer.putInt((int) j10);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i3;
        if (this.f14275e == 0) {
            i3 = this.f14276f.length * 4;
        } else {
            i3 = 0;
        }
        return i3 + 12;
    }

    public final String toString() {
        int length;
        ui.f b10 = we.a.b(f14274w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14271n, this, this));
        sb2.append(this.f14275e);
        sb2.append(";sampleCount=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14272r, this, this));
        if (this.f14275e > 0) {
            length = this.h;
        } else {
            length = this.f14276f.length;
        }
        return a1.g.r(sb2, length, "]");
    }
}
