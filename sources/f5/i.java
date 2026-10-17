package f5;

import com.google.android.gms.internal.cast.a6;
import java.nio.ByteBuffer;
import java.util.LinkedList;
public final class i extends com.googlecode.mp4parser.a {
    public static final le.b d;
    public static final le.b e;
    public String f10411a;
    public long f10412b;
    public LinkedList f10413c;

    static {
        te.a aVar = new te.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f10411a = e5.b.d(byteBuffer);
        this.f10412b = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f10413c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f10413c.add(e5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(e5.c.d(this.f10411a));
        byteBuffer.putInt((int) this.f10412b);
        for (String str : this.f10413c) {
            byteBuffer.put(e5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f10413c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        a6.p(te.a.b(d, this, this));
        sb2.append(this.f10411a);
        sb2.append(";minorVersion=");
        a6.p(te.a.b(e, this, this));
        sb2.append(this.f10412b);
        for (String str : this.f10413c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
