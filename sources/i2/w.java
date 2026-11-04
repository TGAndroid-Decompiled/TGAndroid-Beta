package i2;

import b8.xb;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
public class w extends k {
    public final int f14600b;

    public w() {
        super(2008);
        this.f14600b = 1;
    }

    public static w a(IOException iOException, int i3) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else if (message != null && xb.c(message).matches("cleartext.*not permitted.*")) {
            i10 = 2007;
        } else {
            i10 = 2001;
        }
        if (i10 == 2007) {
            return new w("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new w(iOException, i10, i3);
    }

    public w(String str, int i3) {
        super(str, i3 == 2000 ? 2001 : i3);
        this.f14600b = 1;
    }

    public w(java.io.IOException r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: i2.w.<init>(java.io.IOException, int, int):void");
    }

    public w(String str, IOException iOException, int i3) {
        super(str, iOException, i3 == 2000 ? 2001 : i3);
        this.f14600b = 1;
    }
}
