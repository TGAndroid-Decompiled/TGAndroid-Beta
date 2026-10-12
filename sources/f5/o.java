package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import m.y0;
import w7.r6;
public final class o extends com.googlecode.mp4parser.c {
    public static final y0 f9713n;
    public static final y0 f9714r;
    public static final y0 f9715s;
    public static final y0 v;
    public long f9716e;
    public long[] f9717f;
    public int h;

    static {
        se.a aVar = new se.a(o.class, "SampleSizeBox.java");
        f9713n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f9714r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f9715s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f9716e = e5.b.i(byteBuffer);
        int a2 = r6.a(e5.b.i(byteBuffer));
        this.h = a2;
        if (this.f9716e == 0) {
            this.f9717f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f9717f[i10] = e5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f9716e);
        if (this.f9716e == 0) {
            byteBuffer.putInt(this.f9717f.length);
            for (long j3 : this.f9717f) {
                byteBuffer.putInt((int) j3);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i10;
        if (this.f9716e == 0) {
            i10 = this.f9717f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        com.google.firebase.messaging.s b10 = se.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        e2.q(se.a.b(f9713n, this, this));
        sb2.append(this.f9716e);
        sb2.append(";sampleCount=");
        e2.q(se.a.b(f9714r, this, this));
        if (this.f9716e > 0) {
            length = this.h;
        } else {
            length = this.f9717f.length;
        }
        return a1.g.s(sb2, length, "]");
    }
}
