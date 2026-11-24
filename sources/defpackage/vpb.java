package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class vpb extends g2 {
    public static final ai4 f;
    public static final ai4 h;
    public List e;

    static {
        i94 i94Var = new i94(vpb.class, "TimeToSampleBox.java");
        i94Var.e(i94Var.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f = i94Var.e(i94Var.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = i94Var.e(i94Var.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new upb(jne.g(byteBuffer), jne.g(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (upb upbVar : this.e) {
            byteBuffer.putInt((int) upbVar.a);
            byteBuffer.putInt((int) upbVar.b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }

    public final String toString() {
        xvc b = i94.b(h, this, this);
        pa9.a().getClass();
        pa9.b(b);
        return "TimeToSampleBox[entryCount=" + this.e.size() + "]";
    }
}
