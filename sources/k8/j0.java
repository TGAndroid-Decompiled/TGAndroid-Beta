package k8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class j0 extends com.google.android.gms.common.api.internal.e {
    public final int f13519q = 0;
    public final byte[] f13520r;
    public final String f13521s;
    public final Object f13522t;

    public j0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(y7.c.f50503a, mVar);
        this.f13520r = bArr;
        this.f13521s = str;
        this.f13522t = new n7.e(this);
    }

    @Override
    public final void a(com.google.android.gms.common.api.q qVar) {
        switch (this.f13519q) {
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
        switch (this.f13519q) {
            case 0:
                return new k0(status, -1);
            default:
                return new n7.d(status, null);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i10 = this.f13519q;
        String str = this.f13521s;
        byte[] bArr = this.f13520r;
        Object obj = this.f13522t;
        switch (i10) {
            case 0:
                h0 h0Var = (h0) ((a1) cVar).u();
                ?? aVar = new a();
                aVar.f13585b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(h0Var.f3997c);
                int i11 = r7.a.f47083a;
                obtain.writeStrongBinder(aVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    h0Var.f3996b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                n7.a aVar2 = (n7.a) cVar;
                n7.e eVar = (n7.e) obj;
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
                n7.c cVar2 = (n7.c) aVar2.u();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i12 = n7.b.f17157a;
                if (eVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(eVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    cVar2.f17158a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public j0(com.google.android.gms.common.api.internal.t0 t0Var, String str, String str2, byte[] bArr) {
        super(j8.j.f11282a, t0Var);
        this.f13521s = str;
        this.f13522t = str2;
        this.f13520r = bArr;
    }
}
