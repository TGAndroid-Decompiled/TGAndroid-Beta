package l7;

import android.util.Base64;
import java.security.SecureRandom;
public abstract class e {
    public static final SecureRandom f18201a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f18201a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
