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
    public final g2.h f16997a;
    public final byte[] f16998b;
    public final byte[] f16999c;
    public CipherInputStream d;

    public a(g2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f16997a = hVar;
        this.f16998b = bArr;
        this.f16999c = bArr2;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f16997a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f16997a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f16997a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f16997a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f16998b, "AES"), new IvParameterSpec(this.f16999c));
                g2.k kVar = new g2.k(this.f16997a, mVar);
                this.d = new CipherInputStream(kVar, cipher);
                if (!kVar.d) {
                    kVar.f10183a.open(kVar.f10184b);
                    kVar.d = true;
                    return -1L;
                }
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
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
