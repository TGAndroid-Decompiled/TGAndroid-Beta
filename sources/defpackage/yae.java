package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class yae extends q6f implements Serializable {
    public final MessageDigest b;
    public final int c;
    public final boolean d;
    public final String e;

    public yae() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.b = messageDigest;
            this.c = messageDigest.getDigestLength();
            this.e = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.d = z;
        } catch (NoSuchAlgorithmException e) {
            hz6.e(e);
            throw null;
        }
    }

    public final String toString() {
        return this.e;
    }
}
