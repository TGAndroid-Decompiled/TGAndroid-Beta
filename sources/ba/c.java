package ba;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
public final class c {
    public static final String[] f2038c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences f2039a;
    public final String f2040b;

    public c(u8.g r4) {
        throw new UnsupportedOperationException("Method not decompiled: ba.c.<init>(u8.g):void");
    }

    public final String a() {
        String string;
        synchronized (this.f2039a) {
            string = this.f2039a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.f2039a) {
            String str = null;
            String string = this.f2039a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
