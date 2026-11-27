package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class dt9 extends h2 {
    public static final xh4 f;
    public static final xh4 h;
    public static final xh4 n;
    public List e;

    static {
        u84 u84Var = new u84(dt9.class, "SampleToChunkBox.java");
        f = u84Var.e(u84Var.d("getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.util.List"));
        h = u84Var.e(u84Var.d("setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "void"));
        n = u84Var.e(u84Var.d("toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "java.lang.String"));
        u84Var.e(u84Var.d("blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = cvd.a(zpe.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new ct9(zpe.g(byteBuffer), zpe.g(byteBuffer), zpe.g(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (ct9 ct9Var : this.e) {
            byteBuffer.putInt((int) ct9Var.a);
            byteBuffer.putInt((int) ct9Var.b);
            byteBuffer.putInt((int) ct9Var.c);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 12) + 8;
    }

    public final String toString() {
        lyc b = u84.b(n, this, this);
        zb9.a().getClass();
        zb9.b(b);
        return "SampleToChunkBox[entryCount=" + this.e.size() + "]";
    }
}
