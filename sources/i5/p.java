package i5;

import a8.p0;
import ab.c0;
import c8.lb;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ff;
public final class p extends com.googlecode.mp4parser.c {
    public static final ff f15776n;
    public static final ff f15777r;
    public static final ff f15778s;
    public static final ff f15779w;
    public long f15780e;
    public long[] f15781f;
    public int h;

    static {
        ze.a aVar = new ze.a(p.class, "SampleSizeBox.java");
        f15776n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f15777r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f15778s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        f15779w = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f15780e = h5.b.i(byteBuffer);
        int a10 = lb.a(h5.b.i(byteBuffer));
        this.h = a10;
        if (this.f15780e == 0) {
            this.f15781f = new long[a10];
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f15781f[i7] = h5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f15780e);
        if (this.f15780e == 0) {
            byteBuffer.putInt(this.f15781f.length);
            for (long j3 : this.f15781f) {
                byteBuffer.putInt((int) j3);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i7;
        if (this.f15780e == 0) {
            i7 = this.f15781f.length * 4;
        } else {
            i7 = 0;
        }
        return i7 + 12;
    }

    public final String toString() {
        int length;
        c0 b10 = ze.a.b(f15779w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        c.u(ze.a.b(f15776n, this, this));
        sb2.append(this.f15780e);
        sb2.append(";sampleCount=");
        c.u(ze.a.b(f15777r, this, this));
        if (this.f15780e > 0) {
            length = this.h;
        } else {
            length = this.f15781f.length;
        }
        return p0.r(sb2, length, "]");
    }
}
