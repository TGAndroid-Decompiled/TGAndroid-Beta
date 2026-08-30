package bd;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.j;
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        j.d(buf, "buf");
        return buf;
    }
}
