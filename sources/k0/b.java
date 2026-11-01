package k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.v4.media.session.a0;
import android.util.Log;
import b2.u;
import b2.v0;
import b2.x;
import e2.l0;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k2.m0;
import k6.h;
import l2.f;
import l5.j;
import m5.e;
import q5.d;
import r2.k;
import r2.l;
import v0.i;
import v0.m;
import v0.o;
import xa.n;
public final class b implements k {
    public Context f10521a;

    public b(Context context, boolean z10) {
        this.f10521a = context;
    }

    public static i c(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.f();
        }
        if (obj instanceof m) {
            for (o oVar : ((m) obj).f50291a) {
            }
        }
        Context ctx = bVar.f10521a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            v0.k kVar = null;
            if (i10 >= 34) {
                v0.k kVar2 = new v0.k(ctx);
                if (kVar2.isAvailableOnDevice()) {
                    kVar = kVar2;
                }
                if (kVar == null) {
                    return bVar.f();
                }
                return kVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return bVar.f();
            }
        }
        return bVar.f();
    }

    public static FingerprintManager e(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i10 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public void a(a0 a0Var, u uVar, h hVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (uVar != null) {
            synchronized (uVar) {
                try {
                    if (((CancellationSignal) uVar.f2301c) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        uVar.f2301c = cancellationSignal3;
                        if (uVar.f2300b) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) uVar.f2301c;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager e = e(this.f10521a);
        if (e != null) {
            if (a0Var != null) {
                Mac mac = (Mac) a0Var.d;
                Signature signature = (Signature) a0Var.f875b;
                Cipher cipher = (Cipher) a0Var.f876c;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            e.authenticate(cryptoObject, cancellationSignal, 0, new a(hVar, 0), null);
        }
    }

    public j b() {
        Context context = this.f10521a;
        if (context != null) {
            ?? obj = new Object();
            obj.f11668a = n5.a.a(l5.m.f11674a);
            m0 m0Var = new m0(context);
            obj.f11669b = m0Var;
            obj.f11670c = n5.a.a(new e(0, m0Var, new f(m0Var, 3)));
            m0 m0Var2 = obj.f11669b;
            obj.d = new n2.u(m0Var2, 24);
            zc.a a2 = n5.a.a(new e(23, obj.d, n5.a.a(new f(m0Var2, 29))));
            obj.e = a2;
            t7.u uVar = new t7.u(17);
            m0 m0Var3 = obj.f11669b;
            d dVar = new d(m0Var3, a2, uVar, 0);
            zc.a aVar = obj.f11668a;
            zc.a aVar2 = obj.f11670c;
            bh.d dVar2 = new bh.d(aVar, aVar2, dVar, a2, a2);
            ?? obj2 = new Object();
            obj2.f12519a = m0Var3;
            obj2.f12520b = aVar2;
            obj2.f12521c = a2;
            obj2.d = dVar;
            obj2.e = aVar;
            obj2.f12522f = a2;
            obj2.h = a2;
            obj.f11671f = n5.a.a(new a0(dVar2, (Object) obj2, new n(aVar, a2, dVar, a2), 29));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override
    public l d(j2.f fVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f10521a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = v0.h(((x) fVar.f9350c).f2423s);
            e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + l0.I(h));
            androidx.activity.o oVar = new androidx.activity.o(new r2.b(h, 0), new r2.b(h, 1));
            oVar.f953b = true;
            return oVar.d(fVar);
        }
        return new oa.d(18).d(fVar);
    }

    public i f() {
        String string;
        Context context = this.f10521a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List<String> m10 = bd.i.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        i iVar = null;
        for (String str : m10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                i iVar2 = (i) newInstance;
                if (!iVar2.isAvailableOnDevice()) {
                    continue;
                } else if (iVar != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    iVar = iVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }

    public b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f10521a = context;
    }
}
