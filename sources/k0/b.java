package k0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import b2.p;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import pb.c;
public final class b {
    public final Context f14320a;

    public b(Context context) {
        this.f14320a = context;
    }

    public static FingerprintManager b(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static int c(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: k0.b.c(b2.s):int");
    }

    public void a(aa.a aVar, p pVar, c cVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.f3506c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        pVar.f3506c = cancellationSignal3;
                        if (pVar.f3505b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) pVar.f3506c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager b10 = b(this.f14320a);
        if (b10 != null) {
            if (aVar != null) {
                Mac mac = (Mac) aVar.d;
                Signature signature = (Signature) aVar.f384b;
                Cipher cipher = (Cipher) aVar.f385c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            b10.authenticate(cryptoObject, cancellationSignal, 0, new a(cVar), null);
        }
    }
}
