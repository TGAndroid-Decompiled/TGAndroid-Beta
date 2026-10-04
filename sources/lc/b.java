package lc;

import com.google.android.gms.internal.vision.e2;
import ii.n4;
import java.nio.ByteBuffer;
public final class b extends a {
    public static final n4 f15429n;
    public static final n4 f15430r;

    static {
        re.a aVar = new re.a(b.class, "ESDescriptorBox.java");
        aVar.e(aVar.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        aVar.e(aVar.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        f15429n = aVar.e(aVar.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        f15430r = aVar.e(aVar.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        e2.q(re.a.c(f15429n, this, this, obj));
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.f15428e;
                ByteBuffer byteBuffer2 = ((b) obj).f15428e;
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
        e2.q(re.a.b(f15430r, this, this));
        ByteBuffer byteBuffer = this.f15428e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
