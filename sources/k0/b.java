package k0;

import a4.l;
import a9.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import b2.u;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ji.w4;
import kd.c;
import kotlin.jvm.internal.i;
import l5.j;
import l5.m;
import m.h3;
import m2.t;
import oa.d;
import v0.g;
import v0.h;
import v0.k;
import w7.n;
public final class b implements h {
    public Context f13764a;

    public b(Context context, byte b10) {
        this.f13764a = context;
    }

    public static FingerprintManager d(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static int f(b2.x r5) {
        throw new UnsupportedOperationException("Method not decompiled: k0.b.f(b2.x):int");
    }

    public void a(e eVar, u uVar, l lVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f2401c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        uVar.f2401c = cancellationSignal3;
                        if (uVar.f2400b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) uVar.f2401c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager d = d(this.f13764a);
        if (d != null) {
            if (eVar != null) {
                Mac mac = (Mac) eVar.d;
                Signature signature = (Signature) eVar.f1200b;
                Cipher cipher = (Cipher) eVar.f1201c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            d.authenticate(cryptoObject, cancellationSignal, 0, new a(lVar), null);
        }
    }

    public j b() {
        Context context = this.f13764a;
        if (context != null) {
            ?? obj = new Object();
            obj.f14583a = n5.a.a(m.f14589a);
            r rVar = new r(context);
            obj.f14584b = rVar;
            obj.f14585c = n5.a.a(new t(2, rVar, new w4(rVar, 6)));
            r rVar2 = obj.f14584b;
            obj.d = new m.l(rVar2);
            hd.a a2 = n5.a.a(new t(23, obj.d, n5.a.a(new m.h(rVar2, 17))));
            obj.e = a2;
            d dVar = new d(20);
            r rVar3 = obj.f14584b;
            h3 h3Var = new h3(rVar3, a2, dVar, 22);
            hd.a aVar = obj.f14583a;
            hd.a aVar2 = obj.f14585c;
            ?? obj2 = new Object();
            obj2.f5429b = aVar;
            obj2.f5430c = aVar2;
            obj2.f5428a = h3Var;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f14983a = rVar3;
            obj3.f14984b = aVar2;
            obj3.f14985c = a2;
            obj3.d = h3Var;
            obj3.e = aVar;
            obj3.f14986f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f42944a = aVar;
            obj4.f42945b = a2;
            obj4.f42946c = h3Var;
            obj4.d = a2;
            obj.f14586f = n5.a.a(new e(obj2, obj3, obj4, 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public Object c(Context context, v0.e eVar, c cVar) {
        be.m mVar = new be.m(1, n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        m.h hVar = new m.h(mVar, 20);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        v0.j a2 = k.a(new k(this.f13764a), eVar);
        if (a2 == null) {
            hVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            hVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, hVar);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.f14658a;
        return r10;
    }

    public PackageInfo e(int i10, String str) {
        return this.f13764a.getPackageManager().getPackageInfo(str, i10);
    }

    public b(Context context, int i10) {
        switch (i10) {
            case 3:
                i.e(context, "context");
                this.f13764a = context;
                return;
            default:
                context.getClass();
                this.f13764a = context;
                return;
        }
    }
}
