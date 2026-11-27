package defpackage;

import java.nio.ByteBuffer;
public final class pgb extends h2 {
    public static final xh4 f;
    public static final xh4 h;
    public long[] e;

    static {
        u84 u84Var = new u84(pgb.class, "SyncSampleBox.java");
        u84Var.e(u84Var.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = u84Var.e(u84Var.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.e = new long[a];
        for (int i = 0; i < a; i++) {
            this.e[i] = zpe.g(byteBuffer);
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
        lyc b = u84.b(f, this, this);
        zb9.a().getClass();
        zb9.b(b);
        return uh9.l(new StringBuilder("SyncSampleBox[entryCount="), this.e.length, "]");
    }
}
