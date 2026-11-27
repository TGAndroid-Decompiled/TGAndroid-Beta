package defpackage;

import java.nio.ByteBuffer;
public final class bt3 extends f2 {
    public static final xh4 n;
    public static final xh4 r;

    static {
        u84 u84Var = new u84(bt3.class, "ESDescriptorBox.java");
        u84Var.e(u84Var.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        u84Var.e(u84Var.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        n = u84Var.e(u84Var.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        r = u84Var.e(u84Var.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        bp1.r(u84.c(n, this, this, obj));
        if (this != obj) {
            if (obj != null && bt3.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.e;
                ByteBuffer byteBuffer2 = ((bt3) obj).e;
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
        bp1.r(u84.b(r, this, this));
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
