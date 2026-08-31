package m8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class i0 extends com.google.android.gms.common.api.internal.e {
    public final int f13528q = 0;
    public final byte[] f13529r;
    public final String f13530s;
    public final Object f13531t;

    public i0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(a8.c.f145a, mVar);
        this.f13529r = bArr;
        this.f13530s = str;
        this.f13531t = new p7.e(this);
    }

    @Override
    public final void a(com.google.android.gms.common.api.q qVar) {
        switch (this.f13528q) {
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
        switch (this.f13528q) {
            case 0:
                return new j0(status, -1);
            default:
                return new p7.d(status, null);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = this.f13528q;
        String str = this.f13530s;
        byte[] bArr = this.f13529r;
        Object obj = this.f13531t;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) ((z0) cVar).u();
                ?? aVar = new a();
                aVar.f13596b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(h0Var.f136c);
                int i11 = t7.a.f48026a;
                obtain.writeStrongBinder(aVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    h0Var.f135b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                p7.a aVar2 = (p7.a) cVar;
                p7.e eVar = (p7.e) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = aVar2.R;
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
                p7.c cVar2 = (p7.c) aVar2.u();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i12 = p7.b.f44210a;
                if (eVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(eVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    cVar2.f44211a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public i0(com.google.android.gms.common.api.internal.t0 t0Var, String str, String str2, byte[] bArr) {
        super(l8.j.f12126a, t0Var);
        this.f13530s = str;
        this.f13531t = str2;
        this.f13529r = bArr;
    }
}
