package o4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.y0;
import java.io.IOException;
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

    public final com.google.android.exoplayer2.upstream.m f19191a;

    public final byte[] f19192b;

    public final byte[] f19193c;
    public CipherInputStream d;

    public a(com.google.android.exoplayer2.upstream.m mVar, byte[] bArr, byte[] bArr2) {
        this.f19191a = mVar;
        this.f19192b = bArr;
        this.f19193c = bArr2;
    }

    @Override
    public final void addTransferListener(y0 y0Var) {
        y0Var.getClass();
        this.f19191a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f19191a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f19191a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f19191a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f19192b, "AES"), new IvParameterSpec(this.f19193c));
                com.google.android.exoplayer2.upstream.o oVar = new com.google.android.exoplayer2.upstream.o(this.f19191a, qVar);
                this.d = new CipherInputStream(oVar, cipher);
                oVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e9) {
                throw new RuntimeException(e9);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.d.getClass();
        int i12 = this.d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
