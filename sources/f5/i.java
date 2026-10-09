package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.LinkedList;
public final class i extends com.googlecode.mp4parser.a {
    public static final m2.t d;
    public static final m2.t f9688e;
    public String f9689a;
    public long f9690b;
    public LinkedList f9691c;

    static {
        se.a aVar = new se.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f9688e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f9689a = e5.b.d(byteBuffer);
        this.f9690b = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f9691c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f9691c.add(e5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(e5.c.d(this.f9689a));
        byteBuffer.putInt((int) this.f9690b);
        for (String str : this.f9691c) {
            byteBuffer.put(e5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9691c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        e2.q(se.a.b(d, this, this));
        sb2.append(this.f9689a);
        sb2.append(";minorVersion=");
        e2.q(se.a.b(f9688e, this, this));
        sb2.append(this.f9690b);
        for (String str : this.f9691c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
