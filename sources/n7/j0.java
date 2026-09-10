package n7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class j0 extends a implements Serializable {
    public final MessageDigest e;
    public final int f13964f;
    public final boolean h;
    public final String f13965n;

    public j0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.e = messageDigest;
            this.f13964f = messageDigest.getDigestLength();
            this.f13965n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z10 = true;
            } catch (CloneNotSupportedException unused) {
                z10 = false;
            }
            this.h = z10;
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        return this.f13965n;
    }
}
