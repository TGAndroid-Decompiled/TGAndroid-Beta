package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public final class nb implements h73 {
    public final h73 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public nb(h73 h73Var, byte[] bArr, byte[] bArr2) {
        this.a = h73Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        this.a.addTransferListener(v2cVar);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override
    public final long open(n73 n73Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                l73 l73Var = new l73(this.a, n73Var);
                this.d = new CipherInputStream(l73Var, cipher);
                if (!l73Var.d) {
                    l73Var.a.open(l73Var.b);
                    l73Var.d = true;
                    return -1L;
                }
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                grb.m(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            grb.m(e2);
            return 0L;
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
