package b7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class m0 extends b implements Serializable {
    public final MessageDigest e;
    public final int f1703f;
    public final boolean h;
    public final String f1704n;

    public m0() {
        boolean z4;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.e = messageDigest;
            this.f1703f = messageDigest.getDigestLength();
            this.f1704n = "Hashing.sha256()";
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
        return this.f1704n;
    }
}
