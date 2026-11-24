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
public final class mb implements o63 {
    public final o63 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public mb(o63 o63Var, byte[] bArr, byte[] bArr2) {
        this.a = o63Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        this.a.addTransferListener(vybVar);
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
    public final long open(u63 u63Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                s63 s63Var = new s63(this.a, u63Var);
                this.d = new CipherInputStream(s63Var, cipher);
                if (!s63Var.d) {
                    s63Var.a.open(s63Var.b);
                    s63Var.d = true;
                    return -1L;
                }
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                sdb.b(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            sdb.b(e2);
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
