package defpackage;

import java.nio.ByteBuffer;
public final class hp9 extends g2 {
    public static final z24 n;
    public static final z24 r;
    public static final z24 s;
    public static final z24 w;
    public long e;
    public long[] f;
    public int h;

    static {
        z74 z74Var = new z74(hp9.class, "SampleSizeBox.java");
        n = z74Var.e(z74Var.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        z74Var.e(z74Var.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        z74Var.e(z74Var.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = z74Var.e(z74Var.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        z74Var.e(z74Var.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = z74Var.e(z74Var.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        w = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = hle.g(byteBuffer);
        int a = mqd.a(hle.g(byteBuffer));
        this.h = a;
        if (this.e == 0) {
            this.f = new long[a];
            for (int i = 0; i < this.h; i++) {
                this.f[i] = hle.g(byteBuffer);
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
        c5a b = z74.b(w, this, this);
        n89.a().getClass();
        n89.b(b);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        oo1.r(z74.b(n, this, this));
        sb.append(this.e);
        sb.append(";sampleCount=");
        oo1.r(z74.b(r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f.length;
        }
        return ls6.p(sb, length, "]");
    }
}
