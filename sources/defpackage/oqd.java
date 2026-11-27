package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayDeque;
public final class oqd implements s9, s99, bde, q9d {
    public Object a;

    public oqd(Object obj) {
        this.a = obj;
    }

    public final void a() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long d = d();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + d);
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        jre jreVar = new jre((TaskCompletionSource) obj2, (byte) 0);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i = pld.a;
        obtain.writeStrongBinder(jreVar);
        obtain.writeInt(1);
        ((m54) this.a).writeToParcel(obtain, 0);
        ((f3e) ((q4f) obj).k()).a(obtain, 2);
    }

    @Override
    public final void b(Bitmap bitmap) {
        ((alf) this.a).e(3, bitmap);
    }

    public final void c(long j) {
        long d = d();
        if (d != j) {
            if (d != -1) {
                if (d == -2) {
                    d = -2;
                } else {
                    return;
                }
            }
            StringBuilder o = ik8.o(j, "expected non-string scope or scope ", " but found ");
            o.append(d);
            throw new IOException(o.toString());
        }
    }

    public final long d() {
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public final void e(int i, Object obj, jlf jlfVar) {
        xif xifVar = (xif) this.a;
        xifVar.i(i, 3);
        jlfVar.g((zhf) obj, xifVar.a);
        xifVar.i(i, 4);
    }

    public final void f(int i, Object obj, rfe rfeVar) {
        s0e s0eVar = (s0e) this.a;
        s0eVar.m(i, 3);
        rfeVar.f((hwd) obj, s0eVar.a);
        s0eVar.m(i, 4);
    }

    public final void g(int i, Object obj, jlf jlfVar) {
        zhf zhfVar = (zhf) obj;
        xif xifVar = (xif) this.a;
        xifVar.j((i << 3) | 2);
        xifVar.j(zhfVar.a(jlfVar));
        jlfVar.g(zhfVar, xifVar.a);
    }

    public final void h(int i, Object obj, rfe rfeVar) {
        hwd hwdVar = (hwd) obj;
        s0e s0eVar = (s0e) this.a;
        s0eVar.o((i << 3) | 2);
        s0eVar.o(hwdVar.b(rfeVar));
        rfeVar.f(hwdVar, s0eVar.a);
    }

    @Override
    public final void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
        r9 r9Var = (r9) obj;
        Intent intent = r9Var.b;
        int i = old.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.O;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i, extras);
        }
        int i2 = r9Var.a;
        if (i2 != -1 || i != 0) {
            old.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public final lfe zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            bde bdeVar = ((bde[]) this.a)[i];
            if (bdeVar.zzc(cls)) {
                return bdeVar.zzb(cls);
            }
        }
        qyc.c("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((bde[]) this.a)[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
