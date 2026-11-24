package defpackage;

import java.nio.ByteBuffer;
public final class js3 extends e2 {
    public static final z24 n;
    public static final z24 r;

    static {
        z74 z74Var = new z74(js3.class, "ESDescriptorBox.java");
        z74Var.e(z74Var.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        z74Var.e(z74Var.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        n = z74Var.e(z74Var.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        r = z74Var.e(z74Var.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        oo1.r(z74.c(n, this, this, obj));
        if (this != obj) {
            if (obj != null && js3.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.e;
                ByteBuffer byteBuffer2 = ((js3) obj).e;
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
        oo1.r(z74.b(r, this, this));
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
