package n7;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public final class i0 extends a implements Serializable {
    public final MessageDigest f16641e;
    public final int f16642f;
    public final boolean h;
    public final String f16643n;

    public i0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f16641e = messageDigest;
            this.f16642f = messageDigest.getDigestLength();
            this.f16643n = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z10 = true;
            } catch (CloneNotSupportedException unused) {
                z10 = false;
            }
            this.h = z10;
        } catch (NoSuchAlgorithmException e7) {
            throw new AssertionError(e7);
        }
    }

    public final String toString() {
        return this.f16643n;
    }
}
