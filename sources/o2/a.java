package o2;

import android.net.Uri;
import g2.d0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public final class a implements g2.h {
    public final g2.h f13967a;
    public final byte[] f13968b;
    public final byte[] f13969c;
    public CipherInputStream d;

    public a(g2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f13967a = hVar;
        this.f13968b = bArr;
        this.f13969c = bArr2;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f13967a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f13967a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f13967a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f13967a.getUri();
    }

    @Override
    public final long open(g2.n nVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f13968b, "AES"), new IvParameterSpec(this.f13969c));
                g2.l lVar = new g2.l(this.f13967a, nVar);
                this.d = new CipherInputStream(lVar, cipher);
                lVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        this.d.getClass();
        int read = this.d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
