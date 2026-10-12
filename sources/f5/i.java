package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import m.y0;
public final class i extends com.googlecode.mp4parser.a {
    public static final y0 d;
    public static final y0 f9685e;
    public String f9686a;
    public long f9687b;
    public LinkedList f9688c;

    static {
        se.a aVar = new se.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f9685e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f9686a = e5.b.d(byteBuffer);
        this.f9687b = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f9688c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f9688c.add(e5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(e5.c.d(this.f9686a));
        byteBuffer.putInt((int) this.f9687b);
        for (String str : this.f9688c) {
            byteBuffer.put(e5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f9688c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        e2.q(se.a.b(d, this, this));
        sb2.append(this.f9686a);
        sb2.append(";minorVersion=");
        e2.q(se.a.b(f9685e, this, this));
        sb2.append(this.f9687b);
        for (String str : this.f9688c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
