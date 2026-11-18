package i5;

import ab.c0;
import c8.ob;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public final class x extends com.googlecode.mp4parser.c {
    public static final ze.b f16114f;
    public static final ze.b h;
    public List f16115e;

    static {
        ze.a aVar = new ze.a(x.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.util.List"));
        f16114f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "void"));
        h = aVar.e(aVar.d("toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a10 = ob.a(h5.b.i(byteBuffer));
        this.f16115e = new ArrayList(a10);
        for (int i7 = 0; i7 < a10; i7++) {
            this.f16115e.add(new w(h5.b.i(byteBuffer), h5.b.i(byteBuffer)));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f16115e.size());
        for (w wVar : this.f16115e) {
            byteBuffer.putInt((int) wVar.f16112a);
            byteBuffer.putInt((int) wVar.f16113b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f16115e.size() * 8) + 8;
    }

    public final String toString() {
        c0 b10 = ze.a.b(h, this, this);
        com.googlecode.mp4parser.g.a().getClass();
        com.googlecode.mp4parser.g.b(b10);
        return "TimeToSampleBox[entryCount=" + this.f16115e.size() + "]";
    }
}
