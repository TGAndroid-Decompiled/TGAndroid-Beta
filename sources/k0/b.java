package k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.biometric.e;
import b2.u;
import b2.w0;
import b2.x;
import com.google.firebase.messaging.m;
import e2.m0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ji.d4;
import ji.h5;
import kotlin.jvm.internal.i;
import l2.f;
import l5.j;
import n4.s;
import n5.c;
import oa.d;
import r2.k;
import r2.l;
import v0.g;
import v0.h;
import w7.n;
public final class b implements k, h {
    public Context f13761a;

    public b(Context context, boolean z10) {
        this.f13761a = context;
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

    @Override
    public l H(m mVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f13761a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = w0.h(((x) mVar.f6193c).f2519s);
            e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + m0.I(h));
            r2.b bVar = new r2.b(h, 0);
            r2.b bVar2 = new r2.b(h, 1);
            ?? obj = new Object();
            obj.f1049b = bVar;
            obj.f1050c = bVar2;
            obj.f1048a = true;
            obj.f1048a = true;
            return obj.H(mVar);
        }
        return new sb.a(20).H(mVar);
    }

    public void a(e eVar, u uVar, k6.h hVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f2397c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        uVar.f2397c = cancellationSignal3;
                        if (uVar.f2396b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) uVar.f2397c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager d = d(this.f13761a);
        if (d != null) {
            if (eVar != null) {
                Mac mac = (Mac) eVar.d;
                Signature signature = (Signature) eVar.f1196b;
                Cipher cipher = (Cipher) eVar.f1197c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            d.authenticate(cryptoObject, cancellationSignal, 0, new a(hVar), null);
        }
    }

    public j b() {
        Context context = this.f13761a;
        if (context != null) {
            ?? obj = new Object();
            obj.f14583a = n5.a.a(l5.m.f14589a);
            c cVar = new c(context);
            obj.f14584b = cVar;
            obj.f14585c = n5.a.a(new s(27, cVar, new h5(cVar, 6)));
            c cVar2 = obj.f14584b;
            obj.d = new f(cVar2, 19);
            hd.a a2 = n5.a.a(new m4.c(23, obj.d, n5.a.a(new d4(cVar2, 24))));
            obj.e = a2;
            d dVar = new d(20);
            c cVar3 = obj.f14584b;
            li.k kVar = new li.k(cVar3, a2, dVar, 22);
            hd.a aVar = obj.f14583a;
            hd.a aVar2 = obj.f14585c;
            ?? obj2 = new Object();
            obj2.f5426b = aVar;
            obj2.f5427c = aVar2;
            obj2.f5425a = kVar;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f15219a = cVar3;
            obj3.f15220b = aVar2;
            obj3.f15221c = a2;
            obj3.d = kVar;
            obj3.e = aVar;
            obj3.f15222f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f43662a = aVar;
            obj4.f43663b = a2;
            obj4.f43664c = kVar;
            obj4.d = a2;
            obj.f14586f = n5.a.a(new e(obj2, obj3, obj4, 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public Object c(Context context, v0.e eVar, kd.c cVar) {
        be.m mVar = new be.m(1, n.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new g(cancellationSignal));
        d4 d4Var = new d4(mVar, 27);
        a3.b bVar = new a3.b(2);
        i.e(context, "context");
        v0.j a2 = q2.b.a(new q2.b(this.f13761a, 1), eVar);
        if (a2 == null) {
            d4Var.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            d4Var.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar, d4Var);
        }
        Object r10 = mVar.r();
        ld.a aVar = ld.a.f14658a;
        return r10;
    }

    public PackageInfo e(int i10, String str) {
        return this.f13761a.getPackageManager().getPackageInfo(str, i10);
    }

    public b(Context context) {
        i.e(context, "context");
        this.f13761a = context;
    }
}
