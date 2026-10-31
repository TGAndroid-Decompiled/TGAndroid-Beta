package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v7.q8;
public final class e extends com.googlecode.mp4parser.c {
    public static final za.c f6859f;
    public List e;

    static {
        le.a aVar = new le.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f6859f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = q8.a(e5.b.i(byteBuffer));
        this.e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.e.add(new d(q8.a(e5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.e.size());
        for (d dVar : this.e) {
            byteBuffer.putInt(dVar.f6857a);
            byteBuffer.putInt(dVar.f6858b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.e.size() * 8) + 8;
    }
}
