package f5;

import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import k2.c0;
public final class i extends com.googlecode.mp4parser.a {
    public static final c0 d;
    public static final c0 e;
    public String f8910a;
    public long f8911b;
    public LinkedList f8912c;

    static {
        re.a aVar = new re.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f8910a = e5.b.d(byteBuffer);
        this.f8911b = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f8912c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f8912c.add(e5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(e5.c.d(this.f8910a));
        byteBuffer.putInt((int) this.f8911b);
        for (String str : this.f8912c) {
            byteBuffer.put(e5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f8912c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        e2.q(re.a.b(d, this, this));
        sb2.append(this.f8910a);
        sb2.append(";minorVersion=");
        e2.q(re.a.b(e, this, this));
        sb2.append(this.f8911b);
        for (String str : this.f8912c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
