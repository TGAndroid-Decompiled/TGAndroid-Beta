package i5;

import c8.ob;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class f extends com.googlecode.mp4parser.c {
    public static final ze.b f16062f;
    public List f16063e;

    static {
        ze.a aVar = new ze.a(f.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f16062f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ob.a(h5.b.i(byteBuffer));
        this.f16063e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f16063e.add(new e(ob.a(h5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f16063e.size());
        for (e eVar : this.f16063e) {
            byteBuffer.putInt(eVar.f16060a);
            byteBuffer.putInt(eVar.f16061b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f16063e.size() * 8) + 8;
    }
}
