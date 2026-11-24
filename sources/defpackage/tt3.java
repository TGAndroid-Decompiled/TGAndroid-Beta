package defpackage;

import java.nio.ByteBuffer;
public final class tt3 extends e2 {
    public static final ai4 n;
    public static final ai4 r;

    static {
        i94 i94Var = new i94(tt3.class, "ESDescriptorBox.java");
        i94Var.e(i94Var.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        i94Var.e(i94Var.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        n = i94Var.e(i94Var.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        r = i94Var.e(i94Var.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        aq1.r(i94.c(n, this, this, obj));
        if (this != obj) {
            if (obj != null && tt3.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.e;
                ByteBuffer byteBuffer2 = ((tt3) obj).e;
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
        aq1.r(i94.b(r, this, this));
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
