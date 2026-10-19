package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import w7.b7;
public final class o extends com.googlecode.mp4parser.c {
    public static final te.b f10436n;
    public static final te.b f10437r;
    public static final te.b f10438s;
    public static final te.b v;
    public long e;
    public long[] f10439f;
    public int h;

    static {
        te.a aVar = new te.a(o.class, "SampleSizeBox.java");
        f10436n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f10437r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f10438s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        v = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = e5.b.i(byteBuffer);
        int a2 = b7.a(e5.b.i(byteBuffer));
        this.h = a2;
        if (this.e == 0) {
            this.f10439f = new long[a2];
            for (int i10 = 0; i10 < this.h; i10++) {
                this.f10439f[i10] = e5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e == 0) {
            byteBuffer.putInt(this.f10439f.length);
            for (long j10 : this.f10439f) {
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
            i10 = this.f10439f.length * 4;
        } else {
            i10 = 0;
        }
        return i10 + 12;
    }

    public final String toString() {
        int length;
        com.google.firebase.messaging.r b10 = te.a.b(v, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        k3.p(te.a.b(f10436n, this, this));
        sb2.append(this.e);
        sb2.append(";sampleCount=");
        k3.p(te.a.b(f10437r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f10439f.length;
        }
        return a1.g.r(sb2, length, "]");
    }
}
