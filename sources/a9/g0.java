package a9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
public final class g0 extends com.google.android.gms.common.api.internal.d {
    public final int f197q = 0;
    public final byte[] f198r;
    public final String f199s;
    public final Object f200t;

    public g0(com.google.android.gms.common.api.m mVar, byte[] bArr, String str) {
        super(o8.c.f20933a, mVar);
        this.f198r = bArr;
        this.f199s = str;
        this.f200t = new d8.e(this);
    }

    @Override
    public final void a(com.google.android.gms.common.api.q qVar) {
        switch (this.f197q) {
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
        switch (this.f197q) {
            case 0:
                return new h0(status, -1);
            default:
                return new d8.d(status, null);
        }
    }

    @Override
    public final void n(com.google.android.gms.common.api.c cVar) {
        Parcel obtain;
        Parcel obtain2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i3 = this.f197q;
        String str = this.f199s;
        byte[] bArr = this.f198r;
        Object obj = this.f200t;
        switch (i3) {
            case 0:
                f0 f0Var = (f0) ((y0) cVar).m();
                ?? aVar = new a();
                aVar.f269b = this;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(f0Var.f2457c);
                int i10 = h8.a.f14352a;
                obtain.writeStrongBinder(aVar);
                obtain.writeString(str);
                obtain.writeString((String) obj);
                obtain.writeByteArray(bArr);
                obtain2 = Parcel.obtain();
                try {
                    f0Var.f2456b.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
            default:
                d8.a aVar2 = (d8.a) cVar;
                d8.e eVar = (d8.e) obj;
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
                d8.c cVar2 = (d8.c) aVar2.m();
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
                int i11 = d8.b.f8587a;
                if (eVar == null) {
                    obtain.writeStrongBinder(null);
                } else {
                    obtain.writeStrongBinder(eVar);
                }
                obtain.writeByteArray(bArr);
                obtain.writeString(str);
                obtain2 = Parcel.obtain();
                try {
                    cVar2.f8588a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                }
        }
    }

    public g0(com.google.android.gms.common.api.internal.n0 n0Var, String str, String str2, byte[] bArr) {
        super(z8.c.f60149a, n0Var);
        this.f199s = str;
        this.f200t = str2;
        this.f198r = bArr;
    }
}
