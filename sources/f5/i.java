package f5;

import c3.i0;
import java.nio.ByteBuffer;
import java.util.LinkedList;
public final class i extends com.googlecode.mp4parser.a {
    public static final za.c d;
    public static final za.c e;
    public String f6861a;
    public long f6862b;
    public LinkedList f6863c;

    static {
        le.a aVar = new le.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f6861a = e5.b.d(byteBuffer);
        this.f6862b = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f6863c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f6863c.add(e5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(e5.c.d(this.f6861a));
        byteBuffer.putInt((int) this.f6862b);
        for (String str : this.f6863c) {
            byteBuffer.put(e5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f6863c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        i0.s(le.a.b(d, this, this));
        sb2.append(this.f6861a);
        sb2.append(";minorVersion=");
        i0.s(le.a.b(e, this, this));
        sb2.append(this.f6862b);
        for (String str : this.f6863c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
