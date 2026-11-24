package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
public class ii5 extends d83 {
    public final byte b;

    public ii5(java.io.IOException r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii5.<init>(java.io.IOException, int, int):void");
    }

    public static ii5 a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && vod.c(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new ii5("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new ii5(iOException, i2, i);
    }

    public ii5(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }

    public ii5() {
        super(2008);
        this.b = (byte) 1;
    }

    public ii5(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }
}
