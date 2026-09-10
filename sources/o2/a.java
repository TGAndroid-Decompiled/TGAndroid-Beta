package o2;

import android.net.Uri;
import g2.c0;
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
    public final g2.h f14142a;
    public final byte[] f14143b;
    public final byte[] f14144c;
    public CipherInputStream d;

    public a(g2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f14142a = hVar;
        this.f14143b = bArr;
        this.f14144c = bArr2;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f14142a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f14142a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f14142a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f14142a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f14143b, "AES"), new IvParameterSpec(this.f14144c));
                g2.k kVar = new g2.k(this.f14142a, mVar);
                this.d = new CipherInputStream(kVar, cipher);
                if (!kVar.d) {
                    kVar.f8499a.open(kVar.f8500b);
                    kVar.d = true;
                    return -1L;
                }
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
