package i5;

import a8.p0;
import ab.c0;
import c8.ob;
import java.nio.ByteBuffer;
public final class p extends com.googlecode.mp4parser.c {
    public static final ze.b f16119n;
    public static final ze.b f16120r;
    public static final ze.b f16121s;
    public static final ze.b f16122w;
    public long f16123e;
    public long[] f16124f;
    public int h;

    static {
        ze.a aVar = new ze.a(p.class, "SampleSizeBox.java");
        f16119n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f16120r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f16121s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        f16122w = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f16123e = h5.b.i(byteBuffer);
        int a10 = ob.a(h5.b.i(byteBuffer));
        this.h = a10;
        if (this.f16123e == 0) {
            this.f16124f = new long[a10];
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f16124f[i7] = h5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f16123e);
        if (this.f16123e == 0) {
            byteBuffer.putInt(this.f16124f.length);
            for (long j3 : this.f16124f) {
                byteBuffer.putInt((int) j3);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i7;
        if (this.f16123e == 0) {
            i7 = this.f16124f.length * 4;
        } else {
            i7 = 0;
        }
        return i7 + 12;
    }

    public final String toString() {
        int length;
        c0 b10 = ze.a.b(f16122w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        c.w(ze.a.b(f16119n, this, this));
        sb2.append(this.f16123e);
        sb2.append(";sampleCount=");
        c.w(ze.a.b(f16120r, this, this));
        if (this.f16123e > 0) {
            length = this.h;
        } else {
            length = this.f16124f.length;
        }
        return p0.r(sb2, length, "]");
    }
}
