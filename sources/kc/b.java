package kc;

import i5.c;
import java.nio.ByteBuffer;
public final class b extends a {
    public static final ze.b f18207n;
    public static final ze.b f18208r;

    static {
        ze.a aVar = new ze.a(b.class, "ESDescriptorBox.java");
        aVar.e(aVar.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        aVar.e(aVar.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        f18207n = aVar.e(aVar.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        f18208r = aVar.e(aVar.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        c.w(ze.a.c(f18207n, this, this, obj));
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.f18206e;
                ByteBuffer byteBuffer2 = ((b) obj).f18206e;
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
        c.w(ze.a.b(f18208r, this, this));
        ByteBuffer byteBuffer = this.f18206e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
