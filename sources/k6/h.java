package k6;

import a9.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import m.e3;
import og.u0;
public final class h {
    public static h f12360b;
    public Context f12361a;

    public h(Context context, int i10) {
        switch (i10) {
            case 2:
                this.f12361a = context;
                return;
            default:
                this.f12361a = context.getApplicationContext();
                return;
        }
    }

    public static h b(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (f12360b == null) {
                    o.a(context);
                    f12360b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12360b;
    }

    public static int c(b2.s r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.c(b2.s):int");
    }

    public static final l d(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: k6.h.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    public l5.j a() {
        Context context = this.f12361a;
        if (context != null) {
            ?? obj = new Object();
            obj.f12796a = n5.a.a(l5.m.f12802a);
            r rVar = new r(context);
            obj.f12797b = rVar;
            obj.f12798c = n5.a.a(new of.b(rVar, new l2.g(rVar, 3), false, 25));
            r rVar2 = obj.f12797b;
            obj.d = new l2.g(rVar2, 20);
            fd.a a2 = n5.a.a(new u0(15, obj.d, n5.a.a(new o0.b(rVar2))));
            obj.e = a2;
            qb.b bVar = new qb.b(19);
            r rVar3 = obj.f12797b;
            e3 e3Var = new e3(rVar3, a2, bVar, 19);
            fd.a aVar = obj.f12796a;
            fd.a aVar2 = obj.f12798c;
            ?? obj2 = new Object();
            obj2.f3719a = aVar;
            obj2.f3720b = aVar2;
            obj2.f3721c = e3Var;
            obj2.d = a2;
            obj2.e = a2;
            ?? obj3 = new Object();
            obj3.f13137a = rVar3;
            obj3.f13138b = aVar2;
            obj3.f13139c = a2;
            obj3.d = e3Var;
            obj3.e = aVar;
            obj3.f13140f = a2;
            obj3.h = a2;
            ?? obj4 = new Object();
            obj4.f12538a = aVar;
            obj4.f12539b = a2;
            obj4.f12540c = e3Var;
            obj4.d = a2;
            obj.f12799f = n5.a.a(new aa.a(obj2, obj3, obj4, false, 27));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
