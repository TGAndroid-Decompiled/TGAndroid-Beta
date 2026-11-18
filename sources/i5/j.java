package i5;

import java.nio.ByteBuffer;
import java.util.LinkedList;
public final class j extends com.googlecode.mp4parser.a {
    public static final ze.b d;
    public static final ze.b f16066e;
    public String f16067a;
    public long f16068b;
    public LinkedList f16069c;

    static {
        ze.a aVar = new ze.a(j.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f16066e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f16067a = h5.b.d(byteBuffer);
        this.f16068b = h5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f16069c = new LinkedList();
        for (int i7 = 0; i7 < remaining; i7++) {
            this.f16069c.add(h5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(h5.c.d(this.f16067a));
        byteBuffer.putInt((int) this.f16068b);
        for (String str : this.f16069c) {
            byteBuffer.put(h5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f16069c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        c.w(ze.a.b(d, this, this));
        sb2.append(this.f16067a);
        sb2.append(";minorVersion=");
        c.w(ze.a.b(f16066e, this, this));
        sb2.append(this.f16068b);
        for (String str : this.f16069c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
