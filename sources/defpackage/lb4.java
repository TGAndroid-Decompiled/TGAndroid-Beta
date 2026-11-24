package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
public final class lb4 extends y1 {
    public static final z24 d;
    public static final z24 e;
    public String a;
    public long b;
    public LinkedList c;

    static {
        z74 z74Var = new z74(lb4.class, "FileTypeBox.java");
        d = z74Var.e(z74Var.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        z74Var.e(z74Var.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        z74Var.e(z74Var.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        e = z74Var.e(z74Var.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        z74Var.e(z74Var.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        z74Var.e(z74Var.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.a = hle.b(byteBuffer);
        this.b = hle.g(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.c = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.c.add(hle.b(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(or5.d(this.a));
        byteBuffer.putInt((int) this.b);
        for (String str : this.c) {
            byteBuffer.put(or5.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.c.size() << 2) + 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileTypeBox[majorBrand=");
        oo1.r(z74.b(d, this, this));
        sb.append(this.a);
        sb.append(";minorVersion=");
        oo1.r(z74.b(e, this, this));
        sb.append(this.b);
        for (String str : this.c) {
            sb.append(";compatibleBrand=");
            sb.append(str);
        }
        sb.append("]");
        return sb.toString();
    }
}
