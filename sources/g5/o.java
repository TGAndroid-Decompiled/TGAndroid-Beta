package g5;

import c3.h0;
import java.nio.ByteBuffer;
import li.e3;
public final class o extends com.googlecode.mp4parser.c {
    public static final e3 f12325n;
    public static final e3 f12326r;
    public static final e3 f12327s;
    public static final e3 v;
    public long e;
    public long[] f12328f;
    public int h;

    static {
        ue.a aVar = new ue.a(o.class, "SampleSizeBox.java");
        f12325n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f12326r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f12327s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = f5.b.i(byteBuffer);
        int a2 = f6.e.a(f5.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f12328f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f12328f[i10] = f5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e == 0) {
            byteBuffer.putInt(this.f12328f.length);
            for (long j10 : this.f12328f) {
                byteBuffer.putInt((int) j10);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i10;
        if (this.e == 0) {
            i10 = this.f12328f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        ti.e b10 = ue.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        h0.s(ue.a.b(f12325n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        h0.s(ue.a.b(f12326r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f12328f.length;
        }
        return a1.g.r(sb2, length, "]");
    }
}
