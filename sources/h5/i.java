package h5;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.telegram.ui.Components.i9;
public final class i extends com.googlecode.mp4parser.a {
    public static final i9 d;
    public static final i9 f14243e;
    public String f14244a;
    public long f14245b;
    public LinkedList f14246c;

    static {
        we.a aVar = new we.a(i.class, "FileTypeBox.java");
        d = aVar.e(aVar.d("getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "void"));
        aVar.e(aVar.d("setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "long", "minorVersion", "void"));
        f14243e = aVar.e(aVar.d("getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "long"));
        aVar.e(aVar.d("getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "java.util.List"));
        aVar.e(aVar.d("setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "void"));
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        this.f14244a = g5.b.d(byteBuffer);
        this.f14245b = g5.b.i(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.f14246c = new LinkedList();
        for (int i3 = 0; i3 < remaining; i3++) {
            this.f14246c.add(g5.b.d(byteBuffer));
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(g5.c.d(this.f14244a));
        byteBuffer.putInt((int) this.f14245b);
        for (String str : this.f14246c) {
            byteBuffer.put(g5.c.d(str));
        }
    }

    @Override
    public final long getContentSize() {
        return (this.f14246c.size() * 4) + 8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileTypeBox[majorBrand=");
        com.google.android.recaptcha.internal.a.t(we.a.b(d, this, this));
        sb2.append(this.f14244a);
        sb2.append(";minorVersion=");
        com.google.android.recaptcha.internal.a.t(we.a.b(f14243e, this, this));
        sb2.append(this.f14245b);
        for (String str : this.f14246c) {
            sb2.append(";compatibleBrand=");
            sb2.append(str);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
