package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
public class jg5 extends r63 {
    public final byte b;

    public jg5(java.io.IOException r2, int r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg5.<init>(java.io.IOException, int, int):void");
    }

    public static jg5 a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && smd.c(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new jg5("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new jg5(iOException, i2, i);
    }

    public jg5(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }

    public jg5() {
        super(2008);
        this.b = (byte) 1;
    }

    public jg5(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }
}
