package i5;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import y7.i6;
public final class i extends com.googlecode.mp4parser.a {
    public static final i6 d;
    public static final i6 f15290e;
    public String f15291a;
    public long f15292b;
    public LinkedList f15293c;

    static {
        ze.a aVar = new ze.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f15290e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f15291a = h5.b.d(byteBuffer);
        this.f15292b = h5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f15293c = new LinkedList();
        for (int i7 = 0; i7 < remaining; i7++) {
            this.f15293c.add(h5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(h5.c.d(this.f15291a));
        byteBuffer.putInt((int) this.f15292b);
        for (String str : this.f15293c) {
            byteBuffer.put(h5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f15293c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(d, this, this));
        sb2.append(this.f15291a);
        sb2.append(";minorVersion=");
        com.google.android.recaptcha.internal.a.t(ze.a.b(f15290e, this, this));
        sb2.append(this.f15292b);
        for (String str : this.f15293c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
