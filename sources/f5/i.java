package f5;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import java.util.LinkedList;
public final class i extends com.googlecode.mp4parser.a {
    public static final te.b d;
    public static final te.b e;
    public String f10427a;
    public long f10428b;
    public LinkedList f10429c;

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
        this.f10427a = e5.b.d(byteBuffer);
        this.f10428b = e5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f10429c = new LinkedList();
        for (int i10 = 0; i10 < remaining; i10++) {
            this.f10429c.add(e5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(e5.c.d(this.f10427a));
        byteBuffer.putInt((int) this.f10428b);
        for (String str : this.f10429c) {
            byteBuffer.put(e5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f10429c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        k3.o(te.a.b(d, this, this));
        sb2.append(this.f10427a);
        sb2.append(";minorVersion=");
        k3.o(te.a.b(e, this, this));
        sb2.append(this.f10428b);
        for (String str : this.f10429c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
