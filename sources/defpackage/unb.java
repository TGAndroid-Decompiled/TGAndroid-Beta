package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class unb extends g2 {
    public static final z24 f;
    public static final z24 h;
    public List e;

    static {
        z74 z74Var = new z74(unb.class, "TimeToSampleBox.java");
        z74Var.e(z74Var.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f = z74Var.e(z74Var.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = z74Var.e(z74Var.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = mqd.a(hle.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new tnb(hle.g(byteBuffer), hle.g(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (tnb tnbVar : this.e) {
            byteBuffer.putInt((int) tnbVar.a);
            byteBuffer.putInt((int) tnbVar.b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }

    public final String toString() {
        c5a b = z74.b(h, this, this);
        n89.a().getClass();
        n89.b(b);
        return "TimeToSampleBox[entryCount=" + this.e.size() + "]";
    }
}
