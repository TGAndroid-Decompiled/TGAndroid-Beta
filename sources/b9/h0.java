package b9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class h0 extends com.google.android.gms.common.api.internal.d {
    public final int f3007q = 0;
    public final byte[] f3008r;
    public final String f3009s;
    public final Object f3010t;

    public h0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(p8.c.f55492a, mVar);
        this.f3008r = bArr;
        this.f3009s = str;
        this.f3010t = new e8.e(this);
    }

    @Override
    public final void a(com.google.android.gms.common.api.r rVar) {
        switch (this.f3007q) {
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
        switch (this.f3007q) {
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
        int i7 = this.f3007q;
        String str = this.f3009s;
        byte[] bArr = this.f3008r;
        Object obj = this.f3010t;
        switch (i7) {
            case 0:
                f0 f0Var = (f0) ((z0) cVar).n();
                ?? aVar = new a();
                aVar.f3080b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(f0Var.f307c);
                int i10 = i8.a.f16168a;
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
                int i11 = e8.b.f10870a;
                if (eVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(eVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    cVar2.f10871a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public h0(com.google.android.gms.common.api.internal.p0 p0Var, String str, String str2, byte[] bArr) {
        super(a9.c.f754a, p0Var);
        this.f3009s = str;
        this.f3010t = str2;
        this.f3008r = bArr;
    }
}
