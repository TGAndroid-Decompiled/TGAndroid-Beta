package defpackage;

import java.io.InputStream;
public final class n64 extends j64 {
    public n64(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
        } else {
            u36.j("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void b(long j) {
        int i = this.c;
        if (i > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public n64(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }
}
