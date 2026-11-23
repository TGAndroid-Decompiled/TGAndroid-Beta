package i5;

import c8.pb;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class f extends com.googlecode.mp4parser.c {
    public static final v4.b f16148f;
    public List f16149e;

    static {
        ze.a aVar = new ze.a(f.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f16148f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = pb.a(h5.b.i(byteBuffer));
        this.f16149e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f16149e.add(new e(pb.a(h5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f16149e.size());
        for (e eVar : this.f16149e) {
            byteBuffer.putInt(eVar.f16146a);
            byteBuffer.putInt(eVar.f16147b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f16149e.size() * 8) + 8;
    }
}
