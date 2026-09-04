package f5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w7.p6;
public final class e extends com.googlecode.mp4parser.c {
    public static final mg.n f9296f;
    public List f9297e;

    static {
        re.a aVar = new re.a(e.class, "CompositionTimeToSample.java");
        aVar.e(aVar.d("getEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "", "", "java.util.List"));
        f9296f = aVar.e(aVar.d("setEntries", "com.coremedia.iso.boxes.CompositionTimeToSample", "java.util.List", "entries", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        f(byteBuffer);
        int a2 = p6.a(e5.b.i(byteBuffer));
        this.f9297e = new ArrayList(a2);
        for (int i10 = 0; i10 < a2; i10++) {
            this.f9297e.add(new d(p6.a(e5.b.i(byteBuffer)), byteBuffer.getInt()));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        byteBuffer.putInt(this.f9297e.size());
        for (d dVar : this.f9297e) {
            byteBuffer.putInt(dVar.f9294a);
            byteBuffer.putInt(dVar.f9295b);
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9297e.size() * 8) + 8;
    }
}
