package i8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class j0 extends com.google.android.gms.common.api.internal.e {
    public final int f10996q = 0;
    public final byte[] f10997r;
    public final String f10998s;
    public final Object f10999t;

    public j0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(w7.c.f48773a, mVar);
        this.f10997r = bArr;
        this.f10998s = str;
        this.f10999t = new l7.e(this);
    }

    @Override
    public final void a(com.google.android.gms.common.api.q qVar) {
        switch (this.f10996q) {
            case 0:
                a(qVar);
                return;
            default:
                a(qVar);
                return;
        }
    }

    @Override
    public final com.google.android.gms.common.api.q d(Status status) {
        switch (this.f10996q) {
            case 0:
                return new k0(status, -1);
            default:
                return new l7.d(status, null);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i9 = this.f10996q;
        String str = this.f10998s;
        byte[] bArr = this.f10997r;
        Object obj = this.f10999t;
        switch (i9) {
            case 0:
                h0 h0Var = (h0) ((a1) cVar).u();
                ?? aVar = new a();
                aVar.f11062b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(h0Var.f1550c);
                int i10 = p7.a.f45502a;
                obtain.writeStrongBinder(aVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    h0Var.f1549b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                l7.a aVar2 = (l7.a) cVar;
                l7.e eVar = (l7.e) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = aVar2.Q;
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                            String str2 = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    str = "";
                }
                l7.c cVar2 = (l7.c) aVar2.u();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = l7.b.f16690a;
                if (eVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(eVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    cVar2.f16691a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public j0(com.google.android.gms.common.api.internal.t0 t0Var, String str, String str2, byte[] bArr) {
        super(h8.j.f10246a, t0Var);
        this.f10998s = str;
        this.f10999t = str2;
        this.f10997r = bArr;
    }
}
