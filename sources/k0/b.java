package k0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import b2.t;
import b2.v0;
import b2.w;
import e2.m0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import qb.c;
import r2.k;
import r2.l;
public final class b implements k {
    public final Context f14565a;

    public b(Context context) {
        this.f14565a = context;
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

    @Override
    public l J(com.google.firebase.messaging.l lVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f14565a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = v0.h(((w) lVar.f7649c).f4130s);
            e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
            r2.b bVar = new r2.b(h, 0);
            r2.b bVar2 = new r2.b(h, 1);
            ?? obj = new Object();
            obj.f2670b = bVar;
            obj.f2671c = bVar2;
            obj.f2669a = true;
            obj.f2669a = true;
            return obj.J(lVar);
        }
        return new sb.a(20).J(lVar);
    }

    public void a(e eVar, t tVar, c cVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (tVar != null) {
            synchronized (tVar) {
                try {
                    if (((CancellationSignal) tVar.f4008c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        tVar.f4008c = cancellationSignal3;
                        if (tVar.f4007b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) tVar.f4008c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager b10 = b(this.f14565a);
        if (b10 != null) {
            if (eVar != null) {
                Mac mac = (Mac) eVar.d;
                Signature signature = (Signature) eVar.f2817b;
                Cipher cipher = (Cipher) eVar.f2818c;
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
