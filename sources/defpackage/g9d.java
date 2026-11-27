package defpackage;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.Charset;
import java.util.List;
public final class g9d implements s99, OnFailureListener, z76, s9, caa {
    public final byte a;
    public Object b;

    public g9d(coe coeVar) {
        this.a = (byte) 6;
        Charset charset = xse.a;
        this.b = coeVar;
        coeVar.a = this;
    }

    @Override
    public final void B(v8a v8aVar) {
        md1 md1Var = (md1) v8aVar;
    }

    @Override
    public final void C(v8a v8aVar, boolean z) {
        nmf nmfVar = new nmf(new pe8(4));
        am2 am2Var = (am2) this.b;
        am2.R(am2Var, nmfVar);
        cmf cmfVar = (cmf) am2Var.e;
        xve.h(cmfVar);
        cmfVar.a((md1) v8aVar);
    }

    @Override
    public final void D(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
        pe8 pe8Var = new pe8(8);
        pe8Var.b = Integer.valueOf(i);
        nmf nmfVar = new nmf(pe8Var);
        am2 am2Var = (am2) this.b;
        am2.R(am2Var, nmfVar);
        am2Var.T();
    }

    @Override
    public final void J(v8a v8aVar, int i) {
        md1 md1Var = (md1) v8aVar;
        pe8 pe8Var = new pe8(5);
        pe8Var.b = Integer.valueOf(i);
        nmf nmfVar = new nmf(pe8Var);
        am2 am2Var = (am2) this.b;
        am2.R(am2Var, nmfVar);
        am2Var.T();
    }

    @Override
    public final void N(v8a v8aVar, String str) {
        nmf nmfVar = new nmf(new pe8(7));
        am2 am2Var = (am2) this.b;
        am2.R(am2Var, nmfVar);
        cmf cmfVar = (cmf) am2Var.e;
        xve.h(cmfVar);
        cmfVar.a((md1) v8aVar);
        cmf cmfVar2 = (cmf) am2Var.e;
        xve.h(cmfVar2);
        String str2 = cmfVar2.k;
        if (str2 == null) {
            cmfVar2.k = str;
        } else if (!TextUtils.equals(str, str2)) {
            cmfVar2.b(4);
        }
    }

    @Override
    public final void P(v8a v8aVar, String str) {
        nmf nmfVar = new nmf(new pe8(4));
        am2 am2Var = (am2) this.b;
        am2.R(am2Var, nmfVar);
        cmf cmfVar = (cmf) am2Var.e;
        xve.h(cmfVar);
        cmfVar.a((md1) v8aVar);
        cmf cmfVar2 = (cmf) am2Var.e;
        xve.h(cmfVar2);
        String str2 = cmfVar2.k;
        if (str2 == null) {
            cmfVar2.k = str;
        } else if (!TextUtils.equals(str, str2)) {
            cmfVar2.b(4);
        }
    }

    @Override
    public final void R(Object obj) {
        Location location;
        pj5 pj5Var = ((r05) obj).a;
        List list = ((LocationResult) this.b).a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        pj5Var.onLocationChanged(location);
    }

    public final void a(int i, Object obj, o1f o1fVar) {
        coe coeVar = (coe) this.b;
        hie hieVar = (hie) obj;
        coeVar.c(i, 2);
        int c = hieVar.c();
        if (c == -1) {
            c = o1fVar.zzb(hieVar);
            hieVar.b(c);
        }
        coeVar.g(c);
        o1fVar.e(hieVar, coeVar.a);
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                l3e l3eVar = new l3e((TaskCompletionSource) obj2, (byte) 0);
                ghf ghfVar = (ghf) ((gcf) obj).k();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(ghfVar.b);
                int i = eld.a;
                obtain.writeStrongBinder(l3eVar);
                obtain.writeInt(1);
                ((vx8) this.b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    ghfVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 4:
                sr5 sr5Var = new sr5((TaskCompletionSource) obj2, (byte) 0);
                io ioVar = new io(new cq2(-1, -1, 0, true), false);
                ioVar.c = false;
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i2 = hld.a;
                obtain3.writeStrongBinder(sr5Var);
                hld.b(obtain3, (a13) this.b);
                hld.b(obtain3, ioVar);
                ((kj5) ((mj5) ((cm5) obj).k())).a(obtain3, 6);
                return;
            default:
                twe tweVar = new twe((TaskCompletionSource) obj2, (byte) 2);
                gcd gcdVar = (gcd) ((v9f) obj).k();
                Parcel R = gcdVar.R();
                ald.d(R, tweVar);
                R.writeStringArray((String[]) this.b);
                gcdVar.W(R, 7);
                return;
        }
    }

    public final void b(int i, jne jneVar) {
        coe coeVar = (coe) this.b;
        coeVar.c(i, 2);
        coeVar.g(jneVar.i());
        coeVar.k(jneVar.b, jneVar.m(), jneVar.i());
    }

    public final void c(int i, Object obj, o1f o1fVar) {
        coe coeVar = (coe) this.b;
        coeVar.c(i, 3);
        o1fVar.e((hie) obj, coeVar.a);
        coeVar.c(i, 4);
    }

    @Override
    public final void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        r9 r9Var = (r9) obj;
        Intent intent = r9Var.b;
        int i = r9Var.a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            old.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = old.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.P;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            old.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            old.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public final void m(v8a v8aVar, int i) {
        boolean z;
        md1 md1Var = (md1) v8aVar;
        pe8 pe8Var = new pe8(9);
        pe8Var.b = Integer.valueOf(i);
        am2 am2Var = (am2) this.b;
        if (((ibd) am2Var.c).c == 2) {
            z = true;
        } else {
            z = false;
        }
        pe8Var.c = Boolean.valueOf(z);
        am2.R(am2Var, new nmf(pe8Var));
        am2Var.T();
    }

    @Override
    public final void n(v8a v8aVar) {
        boolean z;
        md1 md1Var = (md1) v8aVar;
        pe8 pe8Var = new pe8(2);
        am2 am2Var = (am2) this.b;
        if (((ibd) am2Var.c).c == 2) {
            z = true;
        } else {
            z = false;
        }
        pe8Var.c = Boolean.valueOf(z);
        am2.R(am2Var, new nmf(pe8Var));
        cmf cmfVar = (cmf) am2Var.e;
        xve.h(cmfVar);
        cmfVar.a(md1Var);
        md1Var.l = (uae) am2Var.f;
    }

    @Override
    public final void onFailure(Exception exc) {
        pid pidVar = (pid) this.b;
        pidVar.getClass();
        he6 he6Var = pid.i;
        Log.w(he6Var.a, he6Var.d("Fail to store SessionState", new Object[0]), exc);
        pidVar.b(100);
    }

    @Override
    public final void p(v8a v8aVar, int i) {
        pe8 pe8Var = new pe8(6);
        pe8Var.b = Integer.valueOf(i);
        nmf nmfVar = new nmf(pe8Var);
        am2 am2Var = (am2) this.b;
        am2.R(am2Var, nmfVar);
        cmf cmfVar = (cmf) am2Var.e;
        xve.h(cmfVar);
        cmfVar.a((md1) v8aVar);
    }

    public g9d(h05 h05Var, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public g9d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public g9d() {
        this.a = (byte) 7;
    }
}
