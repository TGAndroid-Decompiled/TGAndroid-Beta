package j2;

import a8.ga;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
public class w extends j {
    public final int f16488b;

    public w() {
        super(2008);
        this.f16488b = 1;
    }

    public static w a(IOException iOException, int i7) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else if (message != null && ga.c(message).matches("cleartext.*not permitted.*")) {
            i10 = 2007;
        } else {
            i10 = 2001;
        }
        if (i10 == 2007) {
            return new w("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new w(iOException, i10, i7);
    }

    public w(String str, int i7) {
        super(str, i7 == 2000 ? 2001 : i7);
        this.f16488b = 1;
    }

    public w(java.io.IOException r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: j2.w.<init>(java.io.IOException, int, int):void");
    }

    public w(String str, IOException iOException, int i7) {
        super(str, iOException, i7 == 2000 ? 2001 : i7);
        this.f16488b = 1;
    }
}
