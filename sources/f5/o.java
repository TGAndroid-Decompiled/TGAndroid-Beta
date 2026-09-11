package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import w7.p6;
public final class o extends com.googlecode.mp4parser.c {
    public static final mg.n f9328n;
    public static final mg.n f9329r;
    public static final mg.n f9330s;
    public static final mg.n v;
    public long f9331e;
    public long[] f9332f;
    public int h;

    static {
        re.a aVar = new re.a(o.class, "SampleSizeBox.java");
        f9328n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f9329r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f9330s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f9331e = e5.b.i(byteBuffer);
        int a2 = p6.a(e5.b.i(byteBuffer));
        this.h = a2;
        if (this.f9331e == 0) {
            this.f9332f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f9332f[i10] = e5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f9331e);
        if (this.f9331e == 0) {
            byteBuffer.putInt(this.f9332f.length);
            for (long j3 : this.f9332f) {
                byteBuffer.putInt((int) j3);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i10;
        if (this.f9331e == 0) {
            i10 = this.f9332f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        com.google.firebase.messaging.s b10 = re.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        e2.q(re.a.b(f9328n, this, this));
        sb2.append(this.f9331e);
        sb2.append(";sampleCount=");
        e2.q(re.a.b(f9329r, this, this));
        if (this.f9331e > 0) {
            length = this.h;
        } else {
            length = this.f9332f.length;
        }
        return a4.a.r(sb2, length, "]");
    }
}
