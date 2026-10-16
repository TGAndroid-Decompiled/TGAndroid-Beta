package mc;

import com.google.android.gms.internal.play_billing.k3;
import java.nio.ByteBuffer;
import ji.w4;
public final class b extends a {
    public static final w4 f15489n;
    public static final w4 f15490r;

    static {
        te.a aVar = new te.a(b.class, "ESDescriptorBox.java");
        aVar.e(aVar.d("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        aVar.e(aVar.d("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "void"));
        f15489n = aVar.e(aVar.d("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "boolean"));
        f15490r = aVar.e(aVar.d("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "int"));
    }

    public final boolean equals(Object obj) {
        k3.p(te.a.c(f15489n, this, this, obj));
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                ByteBuffer byteBuffer = this.e;
                ByteBuffer byteBuffer2 = ((b) obj).e;
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
        k3.p(te.a.b(f15490r, this, this));
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }
}
