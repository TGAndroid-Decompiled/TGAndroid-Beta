package defpackage;

import java.security.SecureRandom;
import java.util.List;
public abstract class as9 {
    public static final int a = 0;

    static {
        try {
            Class<?>[] clsArr = {String.class};
            SecureRandom secureRandom = ig7.a;
            try {
                Class.forName("javax.net.ssl.SNIHostName").getConstructor(clsArr);
            } catch (Exception unused) {
            }
            try {
                Class.forName("javax.net.ssl.SSLParameters").getMethod("setServerNames", List.class);
            } catch (Exception unused2) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
