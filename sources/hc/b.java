package hc;

import java.nio.ByteBuffer;
import org.telegram.ui.Components.i9;
public final class b extends a {
    public static final i9 f14389n;
    public static final i9 f14390r;

    static {
        we.a aVar = new we.a(b.class, "ESDescriptorBox.java");
        aVar.e(aVar.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        aVar.e(aVar.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        f14389n = aVar.e(aVar.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        f14390r = aVar.e(aVar.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        com.google.android.recaptcha.internal.a.t(we.a.c(f14389n, this, this, obj));
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.f14388e;
                ByteBuffer byteBuffer2 = ((b) obj).f14388e;
                if (byteBuffer != null) {
                    if (byteBuffer.equals(byteBuffer2)) {
                        return true;
                    }
                    return false;
                } else if (byteBuffer2 == null) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        com.google.android.recaptcha.internal.a.t(we.a.b(f14390r, this, this));
        ByteBuffer byteBuffer = this.f14388e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
