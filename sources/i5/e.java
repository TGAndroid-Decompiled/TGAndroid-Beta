package i5;

import c8.jb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import y7.i6;
public final class e extends com.googlecode.mp4parser.c {
    public static final i6 f15288f;
    public List f15289e;

    static {
        ze.a aVar = new ze.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f15288f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = jb.a(h5.b.i(byteBuffer));
        this.f15289e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f15289e.add(new d(jb.a(h5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f15289e.size());
        for (d dVar : this.f15289e) {
            byteBuffer.putInt(dVar.f15286a);
            byteBuffer.putInt(dVar.f15287b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15289e.size() * 8) + 8;
    }
}
