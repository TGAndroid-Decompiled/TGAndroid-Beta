package o4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.y0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public final class a implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m f18844a;
    public final byte[] f18845b;
    public final byte[] f18846c;
    public CipherInputStream d;

    public a(com.google.android.exoplayer2.upstream.m mVar, byte[] bArr, byte[] bArr2) {
        this.f18844a = mVar;
        this.f18845b = bArr;
        this.f18846c = bArr2;
    }

    @Override
    public final void addTransferListener(y0 y0Var) {
        y0Var.getClass();
        this.f18844a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f18844a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f18844a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f18844a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f18845b, "AES"), new IvParameterSpec(this.f18846c));
                com.google.android.exoplayer2.upstream.o oVar = new com.google.android.exoplayer2.upstream.o(this.f18844a, qVar);
                this.d = new CipherInputStream(oVar, cipher);
                oVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        this.d.getClass();
        int read = this.d.read(bArr, i9, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
