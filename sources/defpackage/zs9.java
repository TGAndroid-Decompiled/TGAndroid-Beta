package defpackage;

import java.nio.ByteBuffer;
public final class zs9 extends h2 {
    public static final xh4 n;
    public static final xh4 r;
    public static final xh4 s;
    public static final xh4 w;
    public long e;
    public long[] f;
    public int h;

    static {
        u84 u84Var = new u84(zs9.class, "SampleSizeBox.java");
        n = u84Var.e(u84Var.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        u84Var.e(u84Var.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        u84Var.e(u84Var.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = u84Var.e(u84Var.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        u84Var.e(u84Var.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = u84Var.e(u84Var.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        w = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = zpe.g(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.h = a;
        if (this.e == 0) {
            this.f = new long[a];
            for (int i = 0; i < this.h; i++) {
                this.f[i] = zpe.g(byteBuffer);
            }
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt((int) this.e);
        if (this.e == 0) {
            byteBuffer.putInt(this.f.length);
            long[] jArr = this.f;
            for (long j : jArr) {
                byteBuffer.putInt((int) j);
            }
            return;
        }
        byteBuffer.putInt(this.h);
    }

    @Override
    public final long getContentSize() {
        int i;
        if (this.e == 0) {
            i = this.f.length << 2;
        } else {
            i = 0;
        }
        return i + 12;
    }

    public final String toString() {
        int length;
        lyc b = u84.b(w, this, this);
        zb9.a().getClass();
        zb9.b(b);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        bp1.r(u84.b(n, this, this));
        sb.append(this.e);
        sb.append(";sampleCount=");
        bp1.r(u84.b(r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f.length;
        }
        return qu6.p(sb, length, "]");
    }
}
