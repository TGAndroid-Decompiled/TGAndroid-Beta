package i5;

import a8.p0;
import ab.c0;
import c8.pb;
import java.nio.ByteBuffer;
public final class p extends com.googlecode.mp4parser.c {
    public static final v4.b f16180n;
    public static final v4.b f16181r;
    public static final v4.b f16182s;
    public static final v4.b f16183w;
    public long f16184e;
    public long[] f16185f;
    public int h;

    static {
        ze.a aVar = new ze.a(p.class, "SampleSizeBox.java");
        f16180n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f16181r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f16182s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        f16183w = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f16184e = h5.b.i(byteBuffer);
        int a10 = pb.a(h5.b.i(byteBuffer));
        this.h = a10;
        if (this.f16184e == 0) {
            this.f16185f = new long[a10];
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f16185f[i7] = h5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f16184e);
        if (this.f16184e == 0) {
            byteBuffer.putInt(this.f16185f.length);
            for (long j3 : this.f16185f) {
                byteBuffer.putInt((int) j3);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i7;
        if (this.f16184e == 0) {
            i7 = this.f16185f.length * 4;
        } else {
            i7 = 0;
        }
        return i7 + 12;
    }

    public final String toString() {
        int length;
        c0 b10 = ze.a.b(f16183w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        c.w(ze.a.b(f16180n, this, this));
        sb2.append(this.f16184e);
        sb2.append(";sampleCount=");
        c.w(ze.a.b(f16181r, this, this));
        if (this.f16184e > 0) {
            length = this.h;
        } else {
            length = this.f16185f.length;
        }
        return p0.r(sb2, length, "]");
    }
}
