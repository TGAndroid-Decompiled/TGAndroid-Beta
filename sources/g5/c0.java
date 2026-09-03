package g5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import k7.a7;
public class c0 extends n {
    public final int f6365c;

    public c0() {
        super(2008);
        this.f6365c = 1;
    }

    public static c0 a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && a7.b(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new c0("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new c0(iOException, i11, i10);
    }

    public c0(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f6365c = 1;
    }

    public c0(java.io.IOException r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: g5.c0.<init>(java.io.IOException, int, int):void");
    }

    public c0(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.f6365c = 1;
    }
}
