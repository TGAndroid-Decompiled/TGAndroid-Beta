package g2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import v7.r6;
public class w extends k {
    public final int f7346b;

    public w() {
        super(2008);
        this.f7346b = 1;
    }

    public static w a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && r6.c(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new w("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new w(iOException, i11, i10);
    }

    public w(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f7346b = 1;
    }

    public w(java.io.IOException r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: g2.w.<init>(java.io.IOException, int, int):void");
    }

    public w(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.f7346b = 1;
    }
}
