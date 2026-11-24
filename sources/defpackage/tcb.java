package defpackage;

import java.nio.ByteBuffer;
public final class tcb extends g2 {
    public static final z24 f;
    public static final z24 h;
    public long[] e;

    static {
        z74 z74Var = new z74(tcb.class, "SyncSampleBox.java");
        z74Var.e(z74Var.d("getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "[J"));
        f = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "java.lang.String"));
        h = z74Var.e(z74Var.d("setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = mqd.a(hle.g(byteBuffer));
        this.e = new long[a];
        for (int i = 0; i < a; i++) {
            this.e[i] = hle.g(byteBuffer);
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
        c5a b = z74.b(f, this, this);
        n89.a().getClass();
        n89.b(b);
        return de9.l(new StringBuilder("SyncSampleBox[entryCount="), this.e.length, "]");
    }
}
