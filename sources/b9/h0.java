package b9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class h0 extends com.google.android.gms.common.api.internal.d {
    public final int f3026q = 0;
    public final byte[] f3027r;
    public final String f3028s;
    public final Object f3029t;

    public h0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(p8.c.f55537a, mVar);
        this.f3027r = bArr;
        this.f3028s = str;
        this.f3029t = new e8.e(this);
    }

    @Override
    public final void a(com.google.android.gms.common.api.r rVar) {
        switch (this.f3026q) {
            case 0:
                a(rVar);
                return;
            default:
                a(rVar);
                return;
        }
    }

    @Override
    public final com.google.android.gms.common.api.r d(Status status) {
        switch (this.f3026q) {
            case 0:
                return new i0(status, -1);
            default:
                return new e8.d(status, null);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i7 = this.f3026q;
        String str = this.f3028s;
        byte[] bArr = this.f3027r;
        Object obj = this.f3029t;
        switch (i7) {
            case 0:
                f0 f0Var = (f0) ((z0) cVar).n();
                ?? aVar = new a();
                aVar.f3099b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(f0Var.f307c);
                int i10 = i8.a.f16196a;
                obtain.writeStrongBinder(aVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    f0Var.f306b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                e8.a aVar2 = (e8.a) cVar;
                e8.e eVar = (e8.e) obj;
                if (TextUtils.isEmpty(str)) {
                    Context context = aVar2.F;
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
                e8.c cVar2 = (e8.c) aVar2.n();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = e8.b.f10902a;
                if (eVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(eVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    cVar2.f10903a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public h0(com.google.android.gms.common.api.internal.p0 p0Var, String str, String str2, byte[] bArr) {
        super(a9.c.f754a, p0Var);
        this.f3028s = str;
        this.f3029t = str2;
        this.f3027r = bArr;
    }
}
