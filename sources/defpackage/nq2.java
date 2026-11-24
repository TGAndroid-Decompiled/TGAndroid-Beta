package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class nq2 extends g2 {
    public static final z24 f;
    public List e;

    static {
        z74 z74Var = new z74(nq2.class, "CompositionTimeToSample.java");
        z74Var.e(z74Var.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f = z74Var.e(z74Var.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = mqd.a(hle.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new mq2(mqd.a(hle.g(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (mq2 mq2Var : this.e) {
            byteBuffer.putInt(mq2Var.a);
            byteBuffer.putInt(mq2Var.b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }
}
