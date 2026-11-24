package defpackage;

import java.nio.ByteBuffer;
public final class veb extends g2 {
    public static final ai4 f;
    public static final ai4 h;
    public long[] e;

    static {
        i94 i94Var = new i94(veb.class, "SyncSampleBox.java");
        i94Var.e(i94Var.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = i94Var.e(i94Var.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.e = new long[a];
        for (int i = 0; i < a; i++) {
            this.e[i] = jne.g(byteBuffer);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.length);
        for (long j : this.e) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.length << 2) + 8;
    }

    public final String toString() {
        xvc b = i94.b(f, this, this);
        pa9.a().getClass();
        pa9.b(b);
        return hg9.k(new StringBuilder("SyncSampleBox[entryCount="), this.e.length, "]");
    }
}
