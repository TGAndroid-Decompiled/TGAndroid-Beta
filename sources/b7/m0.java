package b7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class m0 extends b implements Serializable {
    public final MessageDigest f1842e;
    public final int f1843f;
    public final boolean h;
    public final String f1844n;

    public m0() {
        boolean z4;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f1842e = messageDigest;
            this.f1843f = messageDigest.getDigestLength();
            this.f1844n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z4 = true;
            } catch (CloneNotSupportedException unused) {
                z4 = false;
            }
            this.h = z4;
        } catch (NoSuchAlgorithmException e6) {
            throw new AssertionError(e6);
        }
    }

    public final String toString() {
        return this.f1844n;
    }
}
