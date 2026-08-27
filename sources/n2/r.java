package n2;

import android.os.Bundle;
import android.os.DeadObjectException;
import j$.util.Objects;
import java.util.concurrent.Callable;

public final class r implements Callable {

    public final int f18175a;

    public final Object f18176b;

    public final Object f18177c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f18175a = i10;
        this.f18176b = obj;
        this.f18177c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: n2.r.a():java.lang.Object");
    }

    private final java.lang.Object b() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: n2.r.b():java.lang.Object");
    }

    private final Object c() {
        Bundle bundleC;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.f18176b;
        String str = (String) this.f18177c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.f18106a) {
                cVar = bVar.f18112i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, a0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).W0(bVar.f18111g.getPackageName(), str, str2);
        } catch (DeadObjectException e9) {
            g gVar = a0.h;
            String strA = y.a(e9);
            bundleC = com.google.android.gms.internal.play_billing.u.c(5, gVar);
            if (strA != null) {
                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
            }
            return bundleC;
        } catch (Exception e10) {
            g gVar2 = a0.f18096f;
            String strA2 = y.a(e10);
            bundleC = com.google.android.gms.internal.play_billing.u.c(5, gVar2);
            if (strA2 != null) {
                bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
            }
            return bundleC;
        }
    }

    @Override
    public final java.lang.Object call() throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: n2.r.call():java.lang.Object");
    }

    public r(b bVar, m mVar, String str) {
        this.f18175a = 2;
        this.f18177c = mVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.f18176b = bVar;
    }
}
