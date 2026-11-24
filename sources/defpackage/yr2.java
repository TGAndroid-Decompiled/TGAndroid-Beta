package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class yr2 extends g2 {
    public static final ai4 f;
    public List e;

    static {
        i94 i94Var = new i94(yr2.class, "CompositionTimeToSample.java");
        i94Var.e(i94Var.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f = i94Var.e(i94Var.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a = psd.a(jne.g(byteBuffer));
        this.e = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.e.add(new xr2(psd.a(jne.g(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (xr2 xr2Var : this.e) {
            byteBuffer.putInt(xr2Var.a);
            byteBuffer.putInt(xr2Var.b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() << 3) + 8;
    }
}
