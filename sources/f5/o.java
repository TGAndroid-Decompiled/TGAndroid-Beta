package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import m.g3;
import w7.s6;
public final class o extends com.googlecode.mp4parser.c {
    public static final g3 f7819n;
    public static final g3 f7820r;
    public static final g3 f7821s;
    public static final g3 v;
    public long e;
    public long[] f7822f;
    public int h;

    static {
        re.a aVar = new re.a(o.class, "SampleSizeBox.java");
        f7819n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f7820r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f7821s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.i(byteBuffer);
        int a2 = s6.a(e5.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f7822f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f7822f[i10] = e5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e == 0) {
            byteBuffer.putInt(this.f7822f.length);
            for (long j3 : this.f7822f) {
                byteBuffer.putInt((int) j3);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i10;
        if (this.e == 0) {
            i10 = this.f7822f.length * 4;
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
        e2.q(re.a.b(f7819n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        e2.q(re.a.b(f7820r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f7822f.length;
        }
        return a4.a.r(sb2, length, "]");
    }
}
