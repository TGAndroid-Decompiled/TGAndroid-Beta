package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
public final class eod implements r9, h89, m8a {
    public final byte a;
    public Object b;

    public eod(byte b) {
        this.a = b;
        switch (b) {
            case 5:
                return;
            default:
                this.b = new HashMap();
                return;
        }
    }

    @Override
    public final void B(f7a f7aVar, boolean z) {
        yjf yjfVar = new yjf(new dd8(4));
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
    }

    @Override
    public final void C(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
        dd8 dd8Var = new dd8(8);
        dd8Var.b = Integer.valueOf(i);
        yjf yjfVar = new yjf(dd8Var);
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        sm2Var.T();
    }

    @Override
    public final void L(f7a f7aVar, int i) {
        me1 me1Var = (me1) f7aVar;
        dd8 dd8Var = new dd8(5);
        dd8Var.b = Integer.valueOf(i);
        yjf yjfVar = new yjf(dd8Var);
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        sm2Var.T();
    }

    @Override
    public final void P(f7a f7aVar, String str) {
        yjf yjfVar = new yjf(new dd8(7));
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
        njf njfVar2 = (njf) sm2Var.e;
        ite.h(njfVar2);
        String str2 = njfVar2.k;
        if (str2 == null) {
            njfVar2.k = str;
        } else if (!TextUtils.equals(str, str2)) {
            njfVar2.b(4);
        }
    }

    @Override
    public final void R(f7a f7aVar, String str) {
        yjf yjfVar = new yjf(new dd8(4));
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
        njf njfVar2 = (njf) sm2Var.e;
        ite.h(njfVar2);
        String str2 = njfVar2.k;
        if (str2 == null) {
            njfVar2.k = str;
        } else if (!TextUtils.equals(str, str2)) {
            njfVar2.b(4);
        }
    }

    public final void a(int i, Object obj, zye zyeVar) {
        nle nleVar = (nle) this.b;
        rfe rfeVar = (rfe) obj;
        nleVar.c(i, 2);
        int c = rfeVar.c();
        if (c == -1) {
            c = zyeVar.zzb(rfeVar);
            rfeVar.b(c);
        }
        nleVar.g(c);
        zyeVar.d(rfeVar, nleVar.a);
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                pr5 pr5Var = new pr5((TaskCompletionSource) obj2, (byte) 0);
                hp hpVar = new hp(new uq2(-1, -1, 0, true), false);
                hpVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i = rid.a;
                obtain.writeStrongBinder(pr5Var);
                rid.b(obtain, (t13) this.b);
                rid.b(obtain, hpVar);
                ((hj5) ((jj5) ((zl5) obj).k())).a(obtain, 6);
                return;
            default:
                fue fueVar = new fue((TaskCompletionSource) obj2, (byte) 2);
                p9d p9dVar = (p9d) ((g7f) obj).k();
                Parcel R = p9dVar.R();
                kid.d(R, fueVar);
                R.writeStringArray((String[]) this.b);
                p9dVar.W(R, 7);
                return;
        }
    }

    public final void b(int i, tke tkeVar) {
        nle nleVar = (nle) this.b;
        nleVar.c(i, 2);
        nleVar.g(tkeVar.i());
        nleVar.k(tkeVar.b, tkeVar.m(), tkeVar.i());
    }

    public final void c(int i, Object obj, zye zyeVar) {
        nle nleVar = (nle) this.b;
        nleVar.c(i, 3);
        zyeVar.d((rfe) obj, nleVar.a);
        nleVar.c(i, 4);
    }

    public final void d(IBinder iBinder) {
        synchronized (((HashMap) this.b)) {
            if (iBinder != null) {
                iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            }
            new y6d();
            for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override
    public final void l(f7a f7aVar, int i) {
        boolean z;
        me1 me1Var = (me1) f7aVar;
        dd8 dd8Var = new dd8(9);
        dd8Var.b = Integer.valueOf(i);
        sm2 sm2Var = (sm2) this.b;
        if (((r8d) sm2Var.c).c == 2) {
            z = true;
        } else {
            z = false;
        }
        dd8Var.c = Boolean.valueOf(z);
        sm2.R(sm2Var, new yjf(dd8Var));
        sm2Var.T();
    }

    @Override
    public final void m(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        q9 q9Var = (q9) obj;
        Intent intent = q9Var.b;
        int i = q9Var.a;
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            yid.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i);
        }
        int i2 = yid.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.P;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            yid.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i2 != 0) {
            yid.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i2);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public final void o(f7a f7aVar) {
        boolean z;
        me1 me1Var = (me1) f7aVar;
        dd8 dd8Var = new dd8(2);
        sm2 sm2Var = (sm2) this.b;
        if (((r8d) sm2Var.c).c == 2) {
            z = true;
        } else {
            z = false;
        }
        dd8Var.c = Boolean.valueOf(z);
        sm2.R(sm2Var, new yjf(dd8Var));
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a(me1Var);
        me1Var.l = (fkd) sm2Var.f;
    }

    @Override
    public final void q(f7a f7aVar, int i) {
        dd8 dd8Var = new dd8(6);
        dd8Var.b = Integer.valueOf(i);
        yjf yjfVar = new yjf(dd8Var);
        sm2 sm2Var = (sm2) this.b;
        sm2.R(sm2Var, yjfVar);
        njf njfVar = (njf) sm2Var.e;
        ite.h(njfVar);
        njfVar.a((me1) f7aVar);
    }

    @Override
    public final void z(f7a f7aVar) {
        me1 me1Var = (me1) f7aVar;
    }

    public eod(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public eod(ua4 ua4Var, String[] strArr) {
        this.a = (byte) 3;
        this.b = strArr;
    }

    public eod(nle nleVar) {
        this.a = (byte) 4;
        Charset charset = iqe.a;
        this.b = nleVar;
        nleVar.a = this;
    }
}
