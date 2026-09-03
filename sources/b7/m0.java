package b7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class m0 extends b implements Serializable {
    public final MessageDigest e;
    public final int f1714f;
    public final boolean h;
    public final String f1715n;

    public m0() {
        boolean z4;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.e = messageDigest;
            this.f1714f = messageDigest.getDigestLength();
            this.f1715n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z4 = true;
            } catch (CloneNotSupportedException unused) {
                z4 = false;
            }
            this.h = z4;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.f1715n;
    }
}
