package defpackage;

import java.nio.ByteBuffer;
public final class ir9 extends g2 {
    public static final ai4 n;
    public static final ai4 r;
    public static final ai4 s;
    public static final ai4 w;
    public long e;
    public long[] f;
    public int h;

    static {
        i94 i94Var = new i94(ir9.class, "SampleSizeBox.java");
        n = i94Var.e(i94Var.d("getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        i94Var.e(i94Var.d("setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "void"));
        i94Var.e(i94Var.d("getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "long"));
        r = i94Var.e(i94Var.d("getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "long"));
        i94Var.e(i94Var.d("getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "[J"));
        s = i94Var.e(i94Var.d("setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "void"));
        w = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        this.e = jne.g(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.h = a;
        if (this.e == 0) {
            this.f = new long[a];
            for (int i = 0; i < this.h; i++) {
                this.f[i] = jne.g(byteBuffer);
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
        xvc b = i94.b(w, this, this);
        pa9.a().getClass();
        pa9.b(b);
        StringBuilder sb = new StringBuilder("SampleSizeBox[sampleSize=");
        aq1.r(i94.b(n, this, this));
        sb.append(this.e);
        sb.append(";sampleCount=");
        aq1.r(i94.b(r, this, this));
        if (this.e > 0) {
            length = this.h;
        } else {
            length = this.f.length;
        }
        return kt6.q(sb, length, "]");
    }
}
