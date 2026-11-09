package k0;

import a8.b8;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.activity.n;
import androidx.biometric.t;
import be.q;
import c8.u0;
import ca.i;
import e2.s0;
import e2.u;
import h2.m0;
import h6.m;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.j;
import org.telegram.messenger.ot;
import u2.k;
import u2.l;
import v0.e;
import v0.g;
import w0.c;
import w0.h;
public final class b implements k {
    public final Context f17152a;

    public b(Context context, boolean z9) {
        this.f17152a = context;
    }

    public static FingerprintManager d(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i7 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    @Override
    public l Y(b8 b8Var) {
        Context context;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 || ((context = this.f17152a) != null && i7 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = s0.h(((u) b8Var.f337c).f10615s);
            h2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
            n nVar = new n(new u2.b(h, 0), new u2.b(h, 1));
            nVar.f1846b = true;
            return nVar.Y(b8Var);
        }
        return new pb.b(25).Y(b8Var);
    }

    public void a(m mVar, i iVar, d6.i iVar2) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (iVar != null) {
            synchronized (iVar) {
                try {
                    if (((CancellationSignal) iVar.f6014c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        iVar.f6014c = cancellationSignal3;
                        if (iVar.f6013b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) iVar.f6014c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager d = d(this.f17152a);
        if (d != null) {
            if (mVar != null) {
                Mac mac = (Mac) mVar.d;
                Signature signature = (Signature) mVar.f14264b;
                Cipher cipher = (Cipher) mVar.f14265c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            d.authenticate(cryptoObject, cancellationSignal, 0, new a(iVar2, 0), null);
        }
    }

    public Object b(Context context, e eVar, ot otVar) {
        zd.m mVar = new zd.m(1, u0.b(otVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new q(cancellationSignal, 1));
        je.b bVar = new je.b(mVar);
        d3.b bVar2 = new d3.b(3);
        j.e(context, "context");
        v0.i b10 = t.b(new t(this.f17152a, 3), eVar);
        if (b10 == null) {
            bVar.a(new c(1, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.a(new c(3, "createCredential is not supported on this device"));
        } else {
            b10.onCreateCredential(context, eVar, cancellationSignal, bVar2, bVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f16646a;
        return r10;
    }

    public void c(Context context, v0.n nVar, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        j.e(executor, "executor");
        v0.i b10 = t.b(new t(context, 3), nVar);
        if (b10 == null) {
            gVar.a(new h(1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            b10.onGetCredential(context, nVar, cancellationSignal, executor, gVar);
        }
    }

    public b(Context context) {
        j.e(context, "context");
        this.f17152a = context;
    }
}
