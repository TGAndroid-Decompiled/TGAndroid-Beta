package f5;

import c3.i0;
import java.nio.ByteBuffer;
import v7.q8;
public final class o extends com.googlecode.mp4parser.c {
    public static final za.c f6886n;
    public static final za.c f6887r;
    public static final za.c f6888s;
    public static final za.c f6889w;
    public long e;
    public long[] f6890f;
    public int h;

    static {
        le.a aVar = new le.a(o.class, "SampleSizeBox.java");
        f6886n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f6887r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f6888s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        f6889w = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.i(byteBuffer);
        int a2 = q8.a(e5.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f6890f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f6890f[i10] = e5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e == 0) {
            byteBuffer.putInt(this.f6890f.length);
            for (long j10 : this.f6890f) {
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
            i10 = this.f6890f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        ji.f b10 = le.a.b(f6889w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        i0.s(le.a.b(f6886n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        i0.s(le.a.b(f6887r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f6890f.length;
        }
        return a1.g.q(sb2, length, "]");
    }
}
