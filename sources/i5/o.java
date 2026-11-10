package i5;

import a8.p0;
import c8.jb;
import java.nio.ByteBuffer;
import y7.i6;
public final class o extends com.googlecode.mp4parser.c {
    public static final i6 f15320n;
    public static final i6 f15321r;
    public static final i6 f15322s;
    public static final i6 f15323w;
    public long f15324e;
    public long[] f15325f;
    public int h;

    static {
        ze.a aVar = new ze.a(o.class, "SampleSizeBox.java");
        f15320n = aVar.e(aVar.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        aVar.e(aVar.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        f15321r = aVar.e(aVar.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        aVar.e(aVar.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        f15322s = aVar.e(aVar.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        f15323w = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.f15324e = h5.b.i(byteBuffer);
        int a10 = jb.a(h5.b.i(byteBuffer));
        this.h = a10;
        if (this.f15324e == 0) {
            this.f15325f = new long[a10];
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f15325f[i7] = h5.b.i(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.f15324e);
        if (this.f15324e == 0) {
            byteBuffer.putInt(this.f15325f.length);
            for (long j3 : this.f15325f) {
                byteBuffer.putInt((int) j3);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i7;
        if (this.f15324e == 0) {
            i7 = this.f15325f.length * 4;
        } else {
            i7 = 0;
        }
        return i7 + 12;
    }

    public final String toString() {
        int length;
        ui.e b10 = ze.a.b(f15323w, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        StringBuilder sb2 = new StringBuilder("SampleSizeBox[sampleSize=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15320n, this, this));
        sb2.append(this.f15324e);
        sb2.append(";sampleCount=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15321r, this, this));
        if (this.f15324e > 0) {
            length = this.h;
        } else {
            length = this.f15325f.length;
        }
        return p0.r(sb2, length, "]");
    }
}
