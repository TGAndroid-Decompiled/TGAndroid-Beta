package defpackage;

import java.io.InputStream;
public final class c54 extends y44 {
    public c54(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
        } else {
            w26.j("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
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

    public c54(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }
}
