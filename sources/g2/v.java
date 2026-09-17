package g2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import v7.r6;
public class v extends j {
    public final int f10392c;

    public v() {
        super(2008);
        this.f10392c = 1;
    }

    public static v a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && r6.b(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new v("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new v(iOException, i11, i10);
    }

    public v(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f10392c = 1;
    }

    public v(java.io.IOException r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: g2.v.<init>(java.io.IOException, int, int):void");
    }

    public v(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.f10392c = 1;
    }
}
