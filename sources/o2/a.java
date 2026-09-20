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
    public final g2.h f15530a;
    public final byte[] f15531b;
    public final byte[] f15532c;
    public CipherInputStream d;

    public a(g2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f15530a = hVar;
        this.f15531b = bArr;
        this.f15532c = bArr2;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f15530a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f15530a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f15530a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f15530a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f15531b, "AES"), new IvParameterSpec(this.f15532c));
                g2.k kVar = new g2.k(this.f15530a, mVar);
                this.d = new CipherInputStream(kVar, cipher);
                if (!kVar.d) {
                    kVar.f9371a.open(kVar.f9372b);
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
