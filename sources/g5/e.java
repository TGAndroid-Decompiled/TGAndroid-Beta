package g5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import li.e3;
public final class e extends com.googlecode.mp4parser.c {
    public static final e3 f12300f;
    public List e;

    static {
        ue.a aVar = new ue.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f12300f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = f6.e.a(f5.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new d(f6.e.a(f5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (d dVar : this.e) {
            byteBuffer.putInt(dVar.f12298a);
            byteBuffer.putInt(dVar.f12299b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 8) + 8;
    }
}
